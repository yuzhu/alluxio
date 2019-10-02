// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/catalog/catalog_master.proto

package alluxio.grpc.catalog;

/**
 * Protobuf type {@code alluxio.grpc.catalog.GetPartitionColumnStatisticsPRequest}
 */
public  final class GetPartitionColumnStatisticsPRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:alluxio.grpc.catalog.GetPartitionColumnStatisticsPRequest)
    GetPartitionColumnStatisticsPRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetPartitionColumnStatisticsPRequest.newBuilder() to construct.
  private GetPartitionColumnStatisticsPRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetPartitionColumnStatisticsPRequest() {
    dbName_ = "";
    tableName_ = "";
    colNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    partNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetPartitionColumnStatisticsPRequest(
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
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000002;
            tableName_ = bs;
            break;
          }
          case 26: {
            com.google.protobuf.ByteString bs = input.readBytes();
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              colNames_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000004;
            }
            colNames_.add(bs);
            break;
          }
          case 34: {
            com.google.protobuf.ByteString bs = input.readBytes();
            if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
              partNames_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000008;
            }
            partNames_.add(bs);
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
      if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
        colNames_ = colNames_.getUnmodifiableView();
      }
      if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
        partNames_ = partNames_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return alluxio.grpc.catalog.CatalogMasterProto.internal_static_alluxio_grpc_catalog_GetPartitionColumnStatisticsPRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return alluxio.grpc.catalog.CatalogMasterProto.internal_static_alluxio_grpc_catalog_GetPartitionColumnStatisticsPRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            alluxio.grpc.catalog.GetPartitionColumnStatisticsPRequest.class, alluxio.grpc.catalog.GetPartitionColumnStatisticsPRequest.Builder.class);
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

  public static final int TABLE_NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object tableName_;
  /**
   * <code>optional string table_name = 2;</code>
   */
  public boolean hasTableName() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional string table_name = 2;</code>
   */
  public java.lang.String getTableName() {
    java.lang.Object ref = tableName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        tableName_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string table_name = 2;</code>
   */
  public com.google.protobuf.ByteString
      getTableNameBytes() {
    java.lang.Object ref = tableName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      tableName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COL_NAMES_FIELD_NUMBER = 3;
  private com.google.protobuf.LazyStringList colNames_;
  /**
   * <code>repeated string col_names = 3;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getColNamesList() {
    return colNames_;
  }
  /**
   * <code>repeated string col_names = 3;</code>
   */
  public int getColNamesCount() {
    return colNames_.size();
  }
  /**
   * <code>repeated string col_names = 3;</code>
   */
  public java.lang.String getColNames(int index) {
    return colNames_.get(index);
  }
  /**
   * <code>repeated string col_names = 3;</code>
   */
  public com.google.protobuf.ByteString
      getColNamesBytes(int index) {
    return colNames_.getByteString(index);
  }

  public static final int PART_NAMES_FIELD_NUMBER = 4;
  private com.google.protobuf.LazyStringList partNames_;
  /**
   * <code>repeated string part_names = 4;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getPartNamesList() {
    return partNames_;
  }
  /**
   * <code>repeated string part_names = 4;</code>
   */
  public int getPartNamesCount() {
    return partNames_.size();
  }
  /**
   * <code>repeated string part_names = 4;</code>
   */
  public java.lang.String getPartNames(int index) {
    return partNames_.get(index);
  }
  /**
   * <code>repeated string part_names = 4;</code>
   */
  public com.google.protobuf.ByteString
      getPartNamesBytes(int index) {
    return partNames_.getByteString(index);
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
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, tableName_);
    }
    for (int i = 0; i < colNames_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, colNames_.getRaw(i));
    }
    for (int i = 0; i < partNames_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, partNames_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, dbName_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, tableName_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < colNames_.size(); i++) {
        dataSize += computeStringSizeNoTag(colNames_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getColNamesList().size();
    }
    {
      int dataSize = 0;
      for (int i = 0; i < partNames_.size(); i++) {
        dataSize += computeStringSizeNoTag(partNames_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getPartNamesList().size();
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
    if (!(obj instanceof alluxio.grpc.catalog.GetPartitionColumnStatisticsPRequest)) {
      return super.equals(obj);
    }
    alluxio.grpc.catalog.GetPartitionColumnStatisticsPRequest other = (alluxio.grpc.catalog.GetPartitionColumnStatisticsPRequest) obj;

    boolean result = true;
    result = result && (hasDbName() == other.hasDbName());
    if (hasDbName()) {
      result = result && getDbName()
          .equals(other.getDbName());
    }
    result = result && (hasTableName() == other.hasTableName());
    if (hasTableName()) {
      result = result && getTableName()
          .equals(other.getTableName());
    }
    result = result && getColNamesList()
        .equals(other.getColNamesList());
    result = result && getPartNamesList()
        .equals(other.getPartNamesList());
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
    if (hasTableName()) {
      hash = (37 * hash) + TABLE_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getTableName().hashCode();
    }
    if (getColNamesCount() > 0) {
      hash = (37 * hash) + COL_NAMES_FIELD_NUMBER;
      hash = (53 * hash) + getColNamesList().hashCode();
    }
    if (getPartNamesCount() > 0) {
      hash = (37 * hash) + PART_NAMES_FIELD_NUMBER;
      hash = (53 * hash) + getPartNamesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static alluxio.grpc.catalog.GetPartitionColumnStatisticsPRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.catalog.GetPartitionColumnStatisticsPRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.catalog.GetPartitionColumnStatisticsPRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.catalog.GetPartitionColumnStatisticsPRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.catalog.GetPartitionColumnStatisticsPRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.catalog.GetPartitionColumnStatisticsPRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.catalog.GetPartitionColumnStatisticsPRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static alluxio.grpc.catalog.GetPartitionColumnStatisticsPRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static alluxio.grpc.catalog.GetPartitionColumnStatisticsPRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static alluxio.grpc.catalog.GetPartitionColumnStatisticsPRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static alluxio.grpc.catalog.GetPartitionColumnStatisticsPRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static alluxio.grpc.catalog.GetPartitionColumnStatisticsPRequest parseFrom(
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
  public static Builder newBuilder(alluxio.grpc.catalog.GetPartitionColumnStatisticsPRequest prototype) {
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
   * Protobuf type {@code alluxio.grpc.catalog.GetPartitionColumnStatisticsPRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:alluxio.grpc.catalog.GetPartitionColumnStatisticsPRequest)
      alluxio.grpc.catalog.GetPartitionColumnStatisticsPRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return alluxio.grpc.catalog.CatalogMasterProto.internal_static_alluxio_grpc_catalog_GetPartitionColumnStatisticsPRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return alluxio.grpc.catalog.CatalogMasterProto.internal_static_alluxio_grpc_catalog_GetPartitionColumnStatisticsPRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              alluxio.grpc.catalog.GetPartitionColumnStatisticsPRequest.class, alluxio.grpc.catalog.GetPartitionColumnStatisticsPRequest.Builder.class);
    }

    // Construct using alluxio.grpc.catalog.GetPartitionColumnStatisticsPRequest.newBuilder()
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
      tableName_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      colNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000004);
      partNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return alluxio.grpc.catalog.CatalogMasterProto.internal_static_alluxio_grpc_catalog_GetPartitionColumnStatisticsPRequest_descriptor;
    }

    public alluxio.grpc.catalog.GetPartitionColumnStatisticsPRequest getDefaultInstanceForType() {
      return alluxio.grpc.catalog.GetPartitionColumnStatisticsPRequest.getDefaultInstance();
    }

    public alluxio.grpc.catalog.GetPartitionColumnStatisticsPRequest build() {
      alluxio.grpc.catalog.GetPartitionColumnStatisticsPRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public alluxio.grpc.catalog.GetPartitionColumnStatisticsPRequest buildPartial() {
      alluxio.grpc.catalog.GetPartitionColumnStatisticsPRequest result = new alluxio.grpc.catalog.GetPartitionColumnStatisticsPRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.dbName_ = dbName_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.tableName_ = tableName_;
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        colNames_ = colNames_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000004);
      }
      result.colNames_ = colNames_;
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        partNames_ = partNames_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000008);
      }
      result.partNames_ = partNames_;
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
      if (other instanceof alluxio.grpc.catalog.GetPartitionColumnStatisticsPRequest) {
        return mergeFrom((alluxio.grpc.catalog.GetPartitionColumnStatisticsPRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(alluxio.grpc.catalog.GetPartitionColumnStatisticsPRequest other) {
      if (other == alluxio.grpc.catalog.GetPartitionColumnStatisticsPRequest.getDefaultInstance()) return this;
      if (other.hasDbName()) {
        bitField0_ |= 0x00000001;
        dbName_ = other.dbName_;
        onChanged();
      }
      if (other.hasTableName()) {
        bitField0_ |= 0x00000002;
        tableName_ = other.tableName_;
        onChanged();
      }
      if (!other.colNames_.isEmpty()) {
        if (colNames_.isEmpty()) {
          colNames_ = other.colNames_;
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          ensureColNamesIsMutable();
          colNames_.addAll(other.colNames_);
        }
        onChanged();
      }
      if (!other.partNames_.isEmpty()) {
        if (partNames_.isEmpty()) {
          partNames_ = other.partNames_;
          bitField0_ = (bitField0_ & ~0x00000008);
        } else {
          ensurePartNamesIsMutable();
          partNames_.addAll(other.partNames_);
        }
        onChanged();
      }
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
      alluxio.grpc.catalog.GetPartitionColumnStatisticsPRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (alluxio.grpc.catalog.GetPartitionColumnStatisticsPRequest) e.getUnfinishedMessage();
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

    private java.lang.Object tableName_ = "";
    /**
     * <code>optional string table_name = 2;</code>
     */
    public boolean hasTableName() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string table_name = 2;</code>
     */
    public java.lang.String getTableName() {
      java.lang.Object ref = tableName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          tableName_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string table_name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getTableNameBytes() {
      java.lang.Object ref = tableName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        tableName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string table_name = 2;</code>
     */
    public Builder setTableName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      tableName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string table_name = 2;</code>
     */
    public Builder clearTableName() {
      bitField0_ = (bitField0_ & ~0x00000002);
      tableName_ = getDefaultInstance().getTableName();
      onChanged();
      return this;
    }
    /**
     * <code>optional string table_name = 2;</code>
     */
    public Builder setTableNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      tableName_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList colNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureColNamesIsMutable() {
      if (!((bitField0_ & 0x00000004) == 0x00000004)) {
        colNames_ = new com.google.protobuf.LazyStringArrayList(colNames_);
        bitField0_ |= 0x00000004;
       }
    }
    /**
     * <code>repeated string col_names = 3;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getColNamesList() {
      return colNames_.getUnmodifiableView();
    }
    /**
     * <code>repeated string col_names = 3;</code>
     */
    public int getColNamesCount() {
      return colNames_.size();
    }
    /**
     * <code>repeated string col_names = 3;</code>
     */
    public java.lang.String getColNames(int index) {
      return colNames_.get(index);
    }
    /**
     * <code>repeated string col_names = 3;</code>
     */
    public com.google.protobuf.ByteString
        getColNamesBytes(int index) {
      return colNames_.getByteString(index);
    }
    /**
     * <code>repeated string col_names = 3;</code>
     */
    public Builder setColNames(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureColNamesIsMutable();
      colNames_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string col_names = 3;</code>
     */
    public Builder addColNames(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureColNamesIsMutable();
      colNames_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string col_names = 3;</code>
     */
    public Builder addAllColNames(
        java.lang.Iterable<java.lang.String> values) {
      ensureColNamesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, colNames_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string col_names = 3;</code>
     */
    public Builder clearColNames() {
      colNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string col_names = 3;</code>
     */
    public Builder addColNamesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureColNamesIsMutable();
      colNames_.add(value);
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList partNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensurePartNamesIsMutable() {
      if (!((bitField0_ & 0x00000008) == 0x00000008)) {
        partNames_ = new com.google.protobuf.LazyStringArrayList(partNames_);
        bitField0_ |= 0x00000008;
       }
    }
    /**
     * <code>repeated string part_names = 4;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getPartNamesList() {
      return partNames_.getUnmodifiableView();
    }
    /**
     * <code>repeated string part_names = 4;</code>
     */
    public int getPartNamesCount() {
      return partNames_.size();
    }
    /**
     * <code>repeated string part_names = 4;</code>
     */
    public java.lang.String getPartNames(int index) {
      return partNames_.get(index);
    }
    /**
     * <code>repeated string part_names = 4;</code>
     */
    public com.google.protobuf.ByteString
        getPartNamesBytes(int index) {
      return partNames_.getByteString(index);
    }
    /**
     * <code>repeated string part_names = 4;</code>
     */
    public Builder setPartNames(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensurePartNamesIsMutable();
      partNames_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string part_names = 4;</code>
     */
    public Builder addPartNames(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensurePartNamesIsMutable();
      partNames_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string part_names = 4;</code>
     */
    public Builder addAllPartNames(
        java.lang.Iterable<java.lang.String> values) {
      ensurePartNamesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, partNames_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string part_names = 4;</code>
     */
    public Builder clearPartNames() {
      partNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string part_names = 4;</code>
     */
    public Builder addPartNamesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensurePartNamesIsMutable();
      partNames_.add(value);
      onChanged();
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


    // @@protoc_insertion_point(builder_scope:alluxio.grpc.catalog.GetPartitionColumnStatisticsPRequest)
  }

  // @@protoc_insertion_point(class_scope:alluxio.grpc.catalog.GetPartitionColumnStatisticsPRequest)
  private static final alluxio.grpc.catalog.GetPartitionColumnStatisticsPRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new alluxio.grpc.catalog.GetPartitionColumnStatisticsPRequest();
  }

  public static alluxio.grpc.catalog.GetPartitionColumnStatisticsPRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<GetPartitionColumnStatisticsPRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetPartitionColumnStatisticsPRequest>() {
    public GetPartitionColumnStatisticsPRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetPartitionColumnStatisticsPRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetPartitionColumnStatisticsPRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetPartitionColumnStatisticsPRequest> getParserForType() {
    return PARSER;
  }

  public alluxio.grpc.catalog.GetPartitionColumnStatisticsPRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

