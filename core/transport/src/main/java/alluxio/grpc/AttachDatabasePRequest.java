// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/catalog_master.proto

package alluxio.grpc;

/**
 * Protobuf type {@code alluxio.grpc.AttachDatabasePRequest}
 */
public  final class AttachDatabasePRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:alluxio.grpc.AttachDatabasePRequest)
    AttachDatabasePRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AttachDatabasePRequest.newBuilder() to construct.
  private AttachDatabasePRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AttachDatabasePRequest() {
    dbName_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AttachDatabasePRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000001;
            dbName_ = bs;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              options_ = com.google.protobuf.MapField.newMapField(
                  OptionsDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000002;
            }
            com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
            options__ = input.readMessage(
                OptionsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            options_.getMutableMap().put(
                options__.getKey(), options__.getValue());
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return alluxio.grpc.CatalogMasterProto.internal_static_alluxio_grpc_AttachDatabasePRequest_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 2:
        return internalGetOptions();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return alluxio.grpc.CatalogMasterProto.internal_static_alluxio_grpc_AttachDatabasePRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            alluxio.grpc.AttachDatabasePRequest.class, alluxio.grpc.AttachDatabasePRequest.Builder.class);
  }

  private int bitField0_;
  public static final int DB_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object dbName_;
  /**
   * <code>optional string db_name = 1;</code>
   */
  public boolean hasDbName() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional string db_name = 1;</code>
   */
  public java.lang.String getDbName() {
    java.lang.Object ref = dbName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        dbName_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string db_name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getDbNameBytes() {
    java.lang.Object ref = dbName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dbName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OPTIONS_FIELD_NUMBER = 2;
  private static final class OptionsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.String>newDefaultInstance(
                alluxio.grpc.CatalogMasterProto.internal_static_alluxio_grpc_AttachDatabasePRequest_OptionsEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.String> options_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
  internalGetOptions() {
    if (options_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          OptionsDefaultEntryHolder.defaultEntry);
    }
    return options_;
  }

  public int getOptionsCount() {
    return internalGetOptions().getMap().size();
  }
  /**
   * <code>map&lt;string, string&gt; options = 2;</code>
   */

  public boolean containsOptions(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetOptions().getMap().containsKey(key);
  }
  /**
   * Use {@link #getOptionsMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getOptions() {
    return getOptionsMap();
  }
  /**
   * <code>map&lt;string, string&gt; options = 2;</code>
   */

  public java.util.Map<java.lang.String, java.lang.String> getOptionsMap() {
    return internalGetOptions().getMap();
  }
  /**
   * <code>map&lt;string, string&gt; options = 2;</code>
   */

  public java.lang.String getOptionsOrDefault(
      java.lang.String key,
      java.lang.String defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetOptions().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, string&gt; options = 2;</code>
   */

  public java.lang.String getOptionsOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetOptions().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, dbName_);
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetOptions(),
        OptionsDefaultEntryHolder.defaultEntry,
        2);
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, dbName_);
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetOptions().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
      options__ = OptionsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, options__);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof alluxio.grpc.AttachDatabasePRequest)) {
      return super.equals(obj);
    }
    alluxio.grpc.AttachDatabasePRequest other = (alluxio.grpc.AttachDatabasePRequest) obj;

    boolean result = true;
    result = result && (hasDbName() == other.hasDbName());
    if (hasDbName()) {
      result = result && getDbName()
          .equals(other.getDbName());
    }
    result = result && internalGetOptions().equals(
        other.internalGetOptions());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasDbName()) {
      hash = (37 * hash) + DB_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getDbName().hashCode();
    }
    if (!internalGetOptions().getMap().isEmpty()) {
      hash = (37 * hash) + OPTIONS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetOptions().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static alluxio.grpc.AttachDatabasePRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.AttachDatabasePRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.AttachDatabasePRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.AttachDatabasePRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.AttachDatabasePRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.AttachDatabasePRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.AttachDatabasePRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static alluxio.grpc.AttachDatabasePRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static alluxio.grpc.AttachDatabasePRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static alluxio.grpc.AttachDatabasePRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static alluxio.grpc.AttachDatabasePRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static alluxio.grpc.AttachDatabasePRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(alluxio.grpc.AttachDatabasePRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code alluxio.grpc.AttachDatabasePRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:alluxio.grpc.AttachDatabasePRequest)
      alluxio.grpc.AttachDatabasePRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return alluxio.grpc.CatalogMasterProto.internal_static_alluxio_grpc_AttachDatabasePRequest_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetOptions();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetMutableOptions();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return alluxio.grpc.CatalogMasterProto.internal_static_alluxio_grpc_AttachDatabasePRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              alluxio.grpc.AttachDatabasePRequest.class, alluxio.grpc.AttachDatabasePRequest.Builder.class);
    }

    // Construct using alluxio.grpc.AttachDatabasePRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      dbName_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      internalGetMutableOptions().clear();
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return alluxio.grpc.CatalogMasterProto.internal_static_alluxio_grpc_AttachDatabasePRequest_descriptor;
    }

    public alluxio.grpc.AttachDatabasePRequest getDefaultInstanceForType() {
      return alluxio.grpc.AttachDatabasePRequest.getDefaultInstance();
    }

    public alluxio.grpc.AttachDatabasePRequest build() {
      alluxio.grpc.AttachDatabasePRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public alluxio.grpc.AttachDatabasePRequest buildPartial() {
      alluxio.grpc.AttachDatabasePRequest result = new alluxio.grpc.AttachDatabasePRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.dbName_ = dbName_;
      result.options_ = internalGetOptions();
      result.options_.makeImmutable();
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof alluxio.grpc.AttachDatabasePRequest) {
        return mergeFrom((alluxio.grpc.AttachDatabasePRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(alluxio.grpc.AttachDatabasePRequest other) {
      if (other == alluxio.grpc.AttachDatabasePRequest.getDefaultInstance()) return this;
      if (other.hasDbName()) {
        bitField0_ |= 0x00000001;
        dbName_ = other.dbName_;
        onChanged();
      }
      internalGetMutableOptions().mergeFrom(
          other.internalGetOptions());
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      alluxio.grpc.AttachDatabasePRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (alluxio.grpc.AttachDatabasePRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object dbName_ = "";
    /**
     * <code>optional string db_name = 1;</code>
     */
    public boolean hasDbName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string db_name = 1;</code>
     */
    public java.lang.String getDbName() {
      java.lang.Object ref = dbName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          dbName_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string db_name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getDbNameBytes() {
      java.lang.Object ref = dbName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dbName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string db_name = 1;</code>
     */
    public Builder setDbName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      dbName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string db_name = 1;</code>
     */
    public Builder clearDbName() {
      bitField0_ = (bitField0_ & ~0x00000001);
      dbName_ = getDefaultInstance().getDbName();
      onChanged();
      return this;
    }
    /**
     * <code>optional string db_name = 1;</code>
     */
    public Builder setDbNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      dbName_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.String> options_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetOptions() {
      if (options_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            OptionsDefaultEntryHolder.defaultEntry);
      }
      return options_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetMutableOptions() {
      onChanged();;
      if (options_ == null) {
        options_ = com.google.protobuf.MapField.newMapField(
            OptionsDefaultEntryHolder.defaultEntry);
      }
      if (!options_.isMutable()) {
        options_ = options_.copy();
      }
      return options_;
    }

    public int getOptionsCount() {
      return internalGetOptions().getMap().size();
    }
    /**
     * <code>map&lt;string, string&gt; options = 2;</code>
     */

    public boolean containsOptions(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetOptions().getMap().containsKey(key);
    }
    /**
     * Use {@link #getOptionsMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getOptions() {
      return getOptionsMap();
    }
    /**
     * <code>map&lt;string, string&gt; options = 2;</code>
     */

    public java.util.Map<java.lang.String, java.lang.String> getOptionsMap() {
      return internalGetOptions().getMap();
    }
    /**
     * <code>map&lt;string, string&gt; options = 2;</code>
     */

    public java.lang.String getOptionsOrDefault(
        java.lang.String key,
        java.lang.String defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetOptions().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, string&gt; options = 2;</code>
     */

    public java.lang.String getOptionsOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetOptions().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearOptions() {
      internalGetMutableOptions().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; options = 2;</code>
     */

    public Builder removeOptions(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableOptions().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String>
    getMutableOptions() {
      return internalGetMutableOptions().getMutableMap();
    }
    /**
     * <code>map&lt;string, string&gt; options = 2;</code>
     */
    public Builder putOptions(
        java.lang.String key,
        java.lang.String value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableOptions().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; options = 2;</code>
     */

    public Builder putAllOptions(
        java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableOptions().getMutableMap()
          .putAll(values);
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:alluxio.grpc.AttachDatabasePRequest)
  }

  // @@protoc_insertion_point(class_scope:alluxio.grpc.AttachDatabasePRequest)
  private static final alluxio.grpc.AttachDatabasePRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new alluxio.grpc.AttachDatabasePRequest();
  }

  public static alluxio.grpc.AttachDatabasePRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<AttachDatabasePRequest>
      PARSER = new com.google.protobuf.AbstractParser<AttachDatabasePRequest>() {
    public AttachDatabasePRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AttachDatabasePRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AttachDatabasePRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AttachDatabasePRequest> getParserForType() {
    return PARSER;
  }

  public alluxio.grpc.AttachDatabasePRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

