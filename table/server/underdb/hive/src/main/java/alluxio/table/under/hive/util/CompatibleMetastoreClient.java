package alluxio.table.under.hive.util;

import org.apache.hadoop.hive.metastore.IMetaStoreClient;
import org.apache.thrift.TApplicationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class CompatibleMetastoreClient implements InvocationHandler {
  private static final Logger LOG = LoggerFactory.getLogger(CompatibleMetastoreClient.class);

  private final IMetaStoreClient mDelegate;
  private final HMSShim mCompat;

  CompatibleMetastoreClient(IMetaStoreClient delegate, HMSShim compatibility) {
    mDelegate = delegate;
    mCompat = compatibility;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    try {
      return method.invoke(mDelegate, args);
    } catch (InvocationTargetException delegateException) {
      try {
        LOG.info("Couldn't invoke method {}", method.toGenericString());
        if (mCompat != null
            && delegateException.getCause().getClass()
            .isAssignableFrom(TApplicationException.class)) {
          LOG.info("Attempting to invoke with {}", mCompat.getClass().getName());
          return invokeCompatibility(method, args);
        }
      } catch (InvocationTargetException compatibilityException) {
        if (compatibilityException.getCause().getClass()
            .isAssignableFrom(TApplicationException.class)) {
          LOG.warn("Invocation of compatibility for metastore client method {} failed.",
                  method.getName(), compatibilityException);
        } else {
          // compatibility worked but threw non TApplicationException, re-throwing cause.
          throw compatibilityException.getCause();
        }
      } catch (Throwable t) {
        LOG.warn(
                "Unable to invoke compatibility for metastore client method {}.",
                method.getName(), t);
      }
      throw delegateException.getCause();
    }
  }

  private Object invokeCompatibility(Method method, Object[] args) throws Throwable {
    Class<?>[] argTypes = getTypes(args);
    Method compatibilityMethod = mCompat.getClass().getMethod(method.getName(), argTypes);
    return compatibilityMethod.invoke(mCompat, args);
  }

  private static Class<?>[] getTypes(Object[] args) {
    Class<?>[] argTypes = new Class<?>[args.length];
    for (int i = 0; i < args.length; ++i) {
      argTypes[i] = args[i].getClass();
    }
    return argTypes;
  }
}

