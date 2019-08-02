/*
 * The Alluxio Open Foundation licenses this work under the Apache License, version 2.0
 * (the "License"). You may not use this work except in compliance with the License, which is
 * available at www.apache.org/licenses/LICENSE-2.0
 *
 * This software is distributed on an "AS IS" basis, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied, as more fully set forth in the License.
 *
 * See the NOTICE file distributed with this work for information regarding copyright ownership.
 */

package alluxio.master.catalog;

import alluxio.clock.SystemClock;
import alluxio.experimental.Constants;
import alluxio.grpc.GrpcService;
import alluxio.grpc.ServiceType;
import alluxio.master.CoreMaster;
import alluxio.master.CoreMasterContext;
import alluxio.master.journal.checkpoint.CheckpointName;
import alluxio.proto.journal.Journal;
import alluxio.util.executor.ExecutorServiceFactories;

import org.apache.hadoop.hive.metastore.api.Database;
import org.apache.hadoop.hive.metastore.api.FieldSchema;
import org.apache.hadoop.hive.metastore.api.Table;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * This catalog master manages catalogs metadata information.
 */
public class DefaultCatalogMaster extends CoreMaster implements CatalogMaster {
  public DefaultCatalogMaster(CoreMasterContext context) {
    super (context, new SystemClock(),
        ExecutorServiceFactories.cachedThreadPool(Constants.CATALOG_MASTER_NAME));
  }

  @Override
  public List<String> getAllDatabases() {
    return null;
  }

  @Override
  public Database getDatabase(String dbName) {
    return null;
  }

  @Override
  public List<String> getAllTables(String databaseName) {
    return null;
  }

  @Override
  public void createDatabase(Database database) {
  }

  @Override
  public void createTable(Table table) {
  }

  @Override
  public List<FieldSchema> getFields(String databaseName, String tableName) {
    return null;
  }

  @Override
  public String getName() {
    return Constants.CATALOG_MASTER_NAME;
  }

  @Override
  public Map<ServiceType, GrpcService> getServices() {
    Map<ServiceType, GrpcService> services = new HashMap<>();
    services.put(ServiceType.CATALOG_MASTER_CLIENT_SERVICE,
        new GrpcService(new CatalogMasterClientServiceHandler(this)));
    return services;
  }

  @Override
  public void start(Boolean isLeader) throws IOException {
    super.start(isLeader);
  }

  @Override
  public void stop() throws IOException {
    super.stop();
  }

  @Override
  public void close() throws IOException {
    super.close();
  }

  @Override
  public boolean processJournalEntry(Journal.JournalEntry entry) {
    return false;
  }

  @Override
  public void resetState() {
  }

  @Override
  public Iterator<Journal.JournalEntry> getJournalEntryIterator() {
    return null;
  }

  @Override
  public CheckpointName getCheckpointName() {
    return null;
  }
}
