// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/catalog_master.proto

package alluxio.grpc;

public interface PartitionInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.PartitionInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * string value is converted to appropriate partition key type
   * </pre>
   *
   * <code>repeated string values = 1;</code>
   */
  java.util.List<java.lang.String>
      getValuesList();
  /**
   * <pre>
   * string value is converted to appropriate partition key type
   * </pre>
   *
   * <code>repeated string values = 1;</code>
   */
  int getValuesCount();
  /**
   * <pre>
   * string value is converted to appropriate partition key type
   * </pre>
   *
   * <code>repeated string values = 1;</code>
   */
  java.lang.String getValues(int index);
  /**
   * <pre>
   * string value is converted to appropriate partition key type
   * </pre>
   *
   * <code>repeated string values = 1;</code>
   */
  com.google.protobuf.ByteString
      getValuesBytes(int index);

  /**
   * <code>optional string dbName = 2;</code>
   */
  boolean hasDbName();
  /**
   * <code>optional string dbName = 2;</code>
   */
  java.lang.String getDbName();
  /**
   * <code>optional string dbName = 2;</code>
   */
  com.google.protobuf.ByteString
      getDbNameBytes();

  /**
   * <code>optional string tableName = 3;</code>
   */
  boolean hasTableName();
  /**
   * <code>optional string tableName = 3;</code>
   */
  java.lang.String getTableName();
  /**
   * <code>optional string tableName = 3;</code>
   */
  com.google.protobuf.ByteString
      getTableNameBytes();

  /**
   * <code>optional int32 createTime = 4;</code>
   */
  boolean hasCreateTime();
  /**
   * <code>optional int32 createTime = 4;</code>
   */
  int getCreateTime();

  /**
   * <code>optional int32 lastAccessTime = 5;</code>
   */
  boolean hasLastAccessTime();
  /**
   * <code>optional int32 lastAccessTime = 5;</code>
   */
  int getLastAccessTime();

  /**
   * <pre>
   * storage descriptor
   * </pre>
   *
   * <code>optional string sd = 6;</code>
   */
  boolean hasSd();
  /**
   * <pre>
   * storage descriptor
   * </pre>
   *
   * <code>optional string sd = 6;</code>
   */
  java.lang.String getSd();
  /**
   * <pre>
   * storage descriptor
   * </pre>
   *
   * <code>optional string sd = 6;</code>
   */
  com.google.protobuf.ByteString
      getSdBytes();

  /**
   * <code>map&lt;string, string&gt; parameters = 7;</code>
   */
  int getParametersCount();
  /**
   * <code>map&lt;string, string&gt; parameters = 7;</code>
   */
  boolean containsParameters(
      java.lang.String key);
  /**
   * Use {@link #getParametersMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getParameters();
  /**
   * <code>map&lt;string, string&gt; parameters = 7;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getParametersMap();
  /**
   * <code>map&lt;string, string&gt; parameters = 7;</code>
   */

  java.lang.String getParametersOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; parameters = 7;</code>
   */

  java.lang.String getParametersOrThrow(
      java.lang.String key);

  /**
   * <code>optional string catName = 9;</code>
   */
  boolean hasCatName();
  /**
   * <code>optional string catName = 9;</code>
   */
  java.lang.String getCatName();
  /**
   * <code>optional string catName = 9;</code>
   */
  com.google.protobuf.ByteString
      getCatNameBytes();

  /**
   * <code>optional int64 writeId = 10;</code>
   */
  boolean hasWriteId();
  /**
   * <code>optional int64 writeId = 10;</code>
   */
  long getWriteId();

  /**
   * <code>optional bool isStatsCompliant = 11;</code>
   */
  boolean hasIsStatsCompliant();
  /**
   * <code>optional bool isStatsCompliant = 11;</code>
   */
  boolean getIsStatsCompliant();

  /**
   * <pre>
   * column statistics for partition
   * </pre>
   *
   * <code>optional .alluxio.grpc.ColumnStatisticsInfo col_stats = 12;</code>
   */
  boolean hasColStats();
  /**
   * <pre>
   * column statistics for partition
   * </pre>
   *
   * <code>optional .alluxio.grpc.ColumnStatisticsInfo col_stats = 12;</code>
   */
  alluxio.grpc.ColumnStatisticsInfo getColStats();
  /**
   * <pre>
   * column statistics for partition
   * </pre>
   *
   * <code>optional .alluxio.grpc.ColumnStatisticsInfo col_stats = 12;</code>
   */
  alluxio.grpc.ColumnStatisticsInfoOrBuilder getColStatsOrBuilder();
}
