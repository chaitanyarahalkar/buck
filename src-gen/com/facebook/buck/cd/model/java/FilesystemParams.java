// @generated
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cd/resources/proto/javacd.proto

package com.facebook.buck.cd.model.java;

/**
 * Protobuf type {@code javacd.api.v1.FilesystemParams}
 */
@javax.annotation.Generated(value="protoc", comments="annotations:FilesystemParams.java.pb.meta")
public  final class FilesystemParams extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:javacd.api.v1.FilesystemParams)
    FilesystemParamsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FilesystemParams.newBuilder() to construct.
  private FilesystemParams(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FilesystemParams() {
    globIgnorePaths_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FilesystemParams(
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
          case 10: {
            com.facebook.buck.cd.model.common.AbsPath.Builder subBuilder = null;
            if (rootPath_ != null) {
              subBuilder = rootPath_.toBuilder();
            }
            rootPath_ = input.readMessage(com.facebook.buck.cd.model.common.AbsPath.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(rootPath_);
              rootPath_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.facebook.buck.cd.model.common.RelPath.Builder subBuilder = null;
            if (configuredBuckOut_ != null) {
              subBuilder = configuredBuckOut_.toBuilder();
            }
            configuredBuckOut_ = input.readMessage(com.facebook.buck.cd.model.common.RelPath.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(configuredBuckOut_);
              configuredBuckOut_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000004) != 0)) {
              globIgnorePaths_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000004;
            }
            globIgnorePaths_.add(s);
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
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
      if (((mutable_bitField0_ & 0x00000004) != 0)) {
        globIgnorePaths_ = globIgnorePaths_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.facebook.buck.cd.model.java.JavaCDProto.internal_static_javacd_api_v1_FilesystemParams_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.facebook.buck.cd.model.java.JavaCDProto.internal_static_javacd_api_v1_FilesystemParams_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.facebook.buck.cd.model.java.FilesystemParams.class, com.facebook.buck.cd.model.java.FilesystemParams.Builder.class);
  }

  private int bitField0_;
  public static final int ROOTPATH_FIELD_NUMBER = 1;
  private com.facebook.buck.cd.model.common.AbsPath rootPath_;
  /**
   * <code>.AbsPath rootPath = 1;</code>
   */
  public boolean hasRootPath() {
    return rootPath_ != null;
  }
  /**
   * <code>.AbsPath rootPath = 1;</code>
   */
  public com.facebook.buck.cd.model.common.AbsPath getRootPath() {
    return rootPath_ == null ? com.facebook.buck.cd.model.common.AbsPath.getDefaultInstance() : rootPath_;
  }
  /**
   * <code>.AbsPath rootPath = 1;</code>
   */
  public com.facebook.buck.cd.model.common.AbsPathOrBuilder getRootPathOrBuilder() {
    return getRootPath();
  }

  public static final int CONFIGUREDBUCKOUT_FIELD_NUMBER = 2;
  private com.facebook.buck.cd.model.common.RelPath configuredBuckOut_;
  /**
   * <code>.RelPath configuredBuckOut = 2;</code>
   */
  public boolean hasConfiguredBuckOut() {
    return configuredBuckOut_ != null;
  }
  /**
   * <code>.RelPath configuredBuckOut = 2;</code>
   */
  public com.facebook.buck.cd.model.common.RelPath getConfiguredBuckOut() {
    return configuredBuckOut_ == null ? com.facebook.buck.cd.model.common.RelPath.getDefaultInstance() : configuredBuckOut_;
  }
  /**
   * <code>.RelPath configuredBuckOut = 2;</code>
   */
  public com.facebook.buck.cd.model.common.RelPathOrBuilder getConfiguredBuckOutOrBuilder() {
    return getConfiguredBuckOut();
  }

  public static final int GLOBIGNOREPATHS_FIELD_NUMBER = 3;
  private com.google.protobuf.LazyStringList globIgnorePaths_;
  /**
   * <code>repeated string globIgnorePaths = 3;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getGlobIgnorePathsList() {
    return globIgnorePaths_;
  }
  /**
   * <code>repeated string globIgnorePaths = 3;</code>
   */
  public int getGlobIgnorePathsCount() {
    return globIgnorePaths_.size();
  }
  /**
   * <code>repeated string globIgnorePaths = 3;</code>
   */
  public java.lang.String getGlobIgnorePaths(int index) {
    return globIgnorePaths_.get(index);
  }
  /**
   * <code>repeated string globIgnorePaths = 3;</code>
   */
  public com.google.protobuf.ByteString
      getGlobIgnorePathsBytes(int index) {
    return globIgnorePaths_.getByteString(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (rootPath_ != null) {
      output.writeMessage(1, getRootPath());
    }
    if (configuredBuckOut_ != null) {
      output.writeMessage(2, getConfiguredBuckOut());
    }
    for (int i = 0; i < globIgnorePaths_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, globIgnorePaths_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (rootPath_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getRootPath());
    }
    if (configuredBuckOut_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getConfiguredBuckOut());
    }
    {
      int dataSize = 0;
      for (int i = 0; i < globIgnorePaths_.size(); i++) {
        dataSize += computeStringSizeNoTag(globIgnorePaths_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getGlobIgnorePathsList().size();
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
    if (!(obj instanceof com.facebook.buck.cd.model.java.FilesystemParams)) {
      return super.equals(obj);
    }
    com.facebook.buck.cd.model.java.FilesystemParams other = (com.facebook.buck.cd.model.java.FilesystemParams) obj;

    if (hasRootPath() != other.hasRootPath()) return false;
    if (hasRootPath()) {
      if (!getRootPath()
          .equals(other.getRootPath())) return false;
    }
    if (hasConfiguredBuckOut() != other.hasConfiguredBuckOut()) return false;
    if (hasConfiguredBuckOut()) {
      if (!getConfiguredBuckOut()
          .equals(other.getConfiguredBuckOut())) return false;
    }
    if (!getGlobIgnorePathsList()
        .equals(other.getGlobIgnorePathsList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasRootPath()) {
      hash = (37 * hash) + ROOTPATH_FIELD_NUMBER;
      hash = (53 * hash) + getRootPath().hashCode();
    }
    if (hasConfiguredBuckOut()) {
      hash = (37 * hash) + CONFIGUREDBUCKOUT_FIELD_NUMBER;
      hash = (53 * hash) + getConfiguredBuckOut().hashCode();
    }
    if (getGlobIgnorePathsCount() > 0) {
      hash = (37 * hash) + GLOBIGNOREPATHS_FIELD_NUMBER;
      hash = (53 * hash) + getGlobIgnorePathsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.facebook.buck.cd.model.java.FilesystemParams parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.facebook.buck.cd.model.java.FilesystemParams parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.facebook.buck.cd.model.java.FilesystemParams parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.facebook.buck.cd.model.java.FilesystemParams parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.facebook.buck.cd.model.java.FilesystemParams parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.facebook.buck.cd.model.java.FilesystemParams parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.facebook.buck.cd.model.java.FilesystemParams parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.facebook.buck.cd.model.java.FilesystemParams parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.facebook.buck.cd.model.java.FilesystemParams parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.facebook.buck.cd.model.java.FilesystemParams parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.facebook.buck.cd.model.java.FilesystemParams parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.facebook.buck.cd.model.java.FilesystemParams parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.facebook.buck.cd.model.java.FilesystemParams prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code javacd.api.v1.FilesystemParams}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:javacd.api.v1.FilesystemParams)
      com.facebook.buck.cd.model.java.FilesystemParamsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.facebook.buck.cd.model.java.JavaCDProto.internal_static_javacd_api_v1_FilesystemParams_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.facebook.buck.cd.model.java.JavaCDProto.internal_static_javacd_api_v1_FilesystemParams_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.facebook.buck.cd.model.java.FilesystemParams.class, com.facebook.buck.cd.model.java.FilesystemParams.Builder.class);
    }

    // Construct using com.facebook.buck.cd.model.java.FilesystemParams.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (rootPathBuilder_ == null) {
        rootPath_ = null;
      } else {
        rootPath_ = null;
        rootPathBuilder_ = null;
      }
      if (configuredBuckOutBuilder_ == null) {
        configuredBuckOut_ = null;
      } else {
        configuredBuckOut_ = null;
        configuredBuckOutBuilder_ = null;
      }
      globIgnorePaths_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.facebook.buck.cd.model.java.JavaCDProto.internal_static_javacd_api_v1_FilesystemParams_descriptor;
    }

    @java.lang.Override
    public com.facebook.buck.cd.model.java.FilesystemParams getDefaultInstanceForType() {
      return com.facebook.buck.cd.model.java.FilesystemParams.getDefaultInstance();
    }

    @java.lang.Override
    public com.facebook.buck.cd.model.java.FilesystemParams build() {
      com.facebook.buck.cd.model.java.FilesystemParams result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.facebook.buck.cd.model.java.FilesystemParams buildPartial() {
      com.facebook.buck.cd.model.java.FilesystemParams result = new com.facebook.buck.cd.model.java.FilesystemParams(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (rootPathBuilder_ == null) {
        result.rootPath_ = rootPath_;
      } else {
        result.rootPath_ = rootPathBuilder_.build();
      }
      if (configuredBuckOutBuilder_ == null) {
        result.configuredBuckOut_ = configuredBuckOut_;
      } else {
        result.configuredBuckOut_ = configuredBuckOutBuilder_.build();
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        globIgnorePaths_ = globIgnorePaths_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000004);
      }
      result.globIgnorePaths_ = globIgnorePaths_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.facebook.buck.cd.model.java.FilesystemParams) {
        return mergeFrom((com.facebook.buck.cd.model.java.FilesystemParams)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.facebook.buck.cd.model.java.FilesystemParams other) {
      if (other == com.facebook.buck.cd.model.java.FilesystemParams.getDefaultInstance()) return this;
      if (other.hasRootPath()) {
        mergeRootPath(other.getRootPath());
      }
      if (other.hasConfiguredBuckOut()) {
        mergeConfiguredBuckOut(other.getConfiguredBuckOut());
      }
      if (!other.globIgnorePaths_.isEmpty()) {
        if (globIgnorePaths_.isEmpty()) {
          globIgnorePaths_ = other.globIgnorePaths_;
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          ensureGlobIgnorePathsIsMutable();
          globIgnorePaths_.addAll(other.globIgnorePaths_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.facebook.buck.cd.model.java.FilesystemParams parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.facebook.buck.cd.model.java.FilesystemParams) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.facebook.buck.cd.model.common.AbsPath rootPath_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.facebook.buck.cd.model.common.AbsPath, com.facebook.buck.cd.model.common.AbsPath.Builder, com.facebook.buck.cd.model.common.AbsPathOrBuilder> rootPathBuilder_;
    /**
     * <code>.AbsPath rootPath = 1;</code>
     */
    public boolean hasRootPath() {
      return rootPathBuilder_ != null || rootPath_ != null;
    }
    /**
     * <code>.AbsPath rootPath = 1;</code>
     */
    public com.facebook.buck.cd.model.common.AbsPath getRootPath() {
      if (rootPathBuilder_ == null) {
        return rootPath_ == null ? com.facebook.buck.cd.model.common.AbsPath.getDefaultInstance() : rootPath_;
      } else {
        return rootPathBuilder_.getMessage();
      }
    }
    /**
     * <code>.AbsPath rootPath = 1;</code>
     */
    public Builder setRootPath(com.facebook.buck.cd.model.common.AbsPath value) {
      if (rootPathBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        rootPath_ = value;
        onChanged();
      } else {
        rootPathBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.AbsPath rootPath = 1;</code>
     */
    public Builder setRootPath(
        com.facebook.buck.cd.model.common.AbsPath.Builder builderForValue) {
      if (rootPathBuilder_ == null) {
        rootPath_ = builderForValue.build();
        onChanged();
      } else {
        rootPathBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.AbsPath rootPath = 1;</code>
     */
    public Builder mergeRootPath(com.facebook.buck.cd.model.common.AbsPath value) {
      if (rootPathBuilder_ == null) {
        if (rootPath_ != null) {
          rootPath_ =
            com.facebook.buck.cd.model.common.AbsPath.newBuilder(rootPath_).mergeFrom(value).buildPartial();
        } else {
          rootPath_ = value;
        }
        onChanged();
      } else {
        rootPathBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.AbsPath rootPath = 1;</code>
     */
    public Builder clearRootPath() {
      if (rootPathBuilder_ == null) {
        rootPath_ = null;
        onChanged();
      } else {
        rootPath_ = null;
        rootPathBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.AbsPath rootPath = 1;</code>
     */
    public com.facebook.buck.cd.model.common.AbsPath.Builder getRootPathBuilder() {
      
      onChanged();
      return getRootPathFieldBuilder().getBuilder();
    }
    /**
     * <code>.AbsPath rootPath = 1;</code>
     */
    public com.facebook.buck.cd.model.common.AbsPathOrBuilder getRootPathOrBuilder() {
      if (rootPathBuilder_ != null) {
        return rootPathBuilder_.getMessageOrBuilder();
      } else {
        return rootPath_ == null ?
            com.facebook.buck.cd.model.common.AbsPath.getDefaultInstance() : rootPath_;
      }
    }
    /**
     * <code>.AbsPath rootPath = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.facebook.buck.cd.model.common.AbsPath, com.facebook.buck.cd.model.common.AbsPath.Builder, com.facebook.buck.cd.model.common.AbsPathOrBuilder> 
        getRootPathFieldBuilder() {
      if (rootPathBuilder_ == null) {
        rootPathBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.facebook.buck.cd.model.common.AbsPath, com.facebook.buck.cd.model.common.AbsPath.Builder, com.facebook.buck.cd.model.common.AbsPathOrBuilder>(
                getRootPath(),
                getParentForChildren(),
                isClean());
        rootPath_ = null;
      }
      return rootPathBuilder_;
    }

    private com.facebook.buck.cd.model.common.RelPath configuredBuckOut_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.facebook.buck.cd.model.common.RelPath, com.facebook.buck.cd.model.common.RelPath.Builder, com.facebook.buck.cd.model.common.RelPathOrBuilder> configuredBuckOutBuilder_;
    /**
     * <code>.RelPath configuredBuckOut = 2;</code>
     */
    public boolean hasConfiguredBuckOut() {
      return configuredBuckOutBuilder_ != null || configuredBuckOut_ != null;
    }
    /**
     * <code>.RelPath configuredBuckOut = 2;</code>
     */
    public com.facebook.buck.cd.model.common.RelPath getConfiguredBuckOut() {
      if (configuredBuckOutBuilder_ == null) {
        return configuredBuckOut_ == null ? com.facebook.buck.cd.model.common.RelPath.getDefaultInstance() : configuredBuckOut_;
      } else {
        return configuredBuckOutBuilder_.getMessage();
      }
    }
    /**
     * <code>.RelPath configuredBuckOut = 2;</code>
     */
    public Builder setConfiguredBuckOut(com.facebook.buck.cd.model.common.RelPath value) {
      if (configuredBuckOutBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        configuredBuckOut_ = value;
        onChanged();
      } else {
        configuredBuckOutBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.RelPath configuredBuckOut = 2;</code>
     */
    public Builder setConfiguredBuckOut(
        com.facebook.buck.cd.model.common.RelPath.Builder builderForValue) {
      if (configuredBuckOutBuilder_ == null) {
        configuredBuckOut_ = builderForValue.build();
        onChanged();
      } else {
        configuredBuckOutBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.RelPath configuredBuckOut = 2;</code>
     */
    public Builder mergeConfiguredBuckOut(com.facebook.buck.cd.model.common.RelPath value) {
      if (configuredBuckOutBuilder_ == null) {
        if (configuredBuckOut_ != null) {
          configuredBuckOut_ =
            com.facebook.buck.cd.model.common.RelPath.newBuilder(configuredBuckOut_).mergeFrom(value).buildPartial();
        } else {
          configuredBuckOut_ = value;
        }
        onChanged();
      } else {
        configuredBuckOutBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.RelPath configuredBuckOut = 2;</code>
     */
    public Builder clearConfiguredBuckOut() {
      if (configuredBuckOutBuilder_ == null) {
        configuredBuckOut_ = null;
        onChanged();
      } else {
        configuredBuckOut_ = null;
        configuredBuckOutBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.RelPath configuredBuckOut = 2;</code>
     */
    public com.facebook.buck.cd.model.common.RelPath.Builder getConfiguredBuckOutBuilder() {
      
      onChanged();
      return getConfiguredBuckOutFieldBuilder().getBuilder();
    }
    /**
     * <code>.RelPath configuredBuckOut = 2;</code>
     */
    public com.facebook.buck.cd.model.common.RelPathOrBuilder getConfiguredBuckOutOrBuilder() {
      if (configuredBuckOutBuilder_ != null) {
        return configuredBuckOutBuilder_.getMessageOrBuilder();
      } else {
        return configuredBuckOut_ == null ?
            com.facebook.buck.cd.model.common.RelPath.getDefaultInstance() : configuredBuckOut_;
      }
    }
    /**
     * <code>.RelPath configuredBuckOut = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.facebook.buck.cd.model.common.RelPath, com.facebook.buck.cd.model.common.RelPath.Builder, com.facebook.buck.cd.model.common.RelPathOrBuilder> 
        getConfiguredBuckOutFieldBuilder() {
      if (configuredBuckOutBuilder_ == null) {
        configuredBuckOutBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.facebook.buck.cd.model.common.RelPath, com.facebook.buck.cd.model.common.RelPath.Builder, com.facebook.buck.cd.model.common.RelPathOrBuilder>(
                getConfiguredBuckOut(),
                getParentForChildren(),
                isClean());
        configuredBuckOut_ = null;
      }
      return configuredBuckOutBuilder_;
    }

    private com.google.protobuf.LazyStringList globIgnorePaths_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureGlobIgnorePathsIsMutable() {
      if (!((bitField0_ & 0x00000004) != 0)) {
        globIgnorePaths_ = new com.google.protobuf.LazyStringArrayList(globIgnorePaths_);
        bitField0_ |= 0x00000004;
       }
    }
    /**
     * <code>repeated string globIgnorePaths = 3;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getGlobIgnorePathsList() {
      return globIgnorePaths_.getUnmodifiableView();
    }
    /**
     * <code>repeated string globIgnorePaths = 3;</code>
     */
    public int getGlobIgnorePathsCount() {
      return globIgnorePaths_.size();
    }
    /**
     * <code>repeated string globIgnorePaths = 3;</code>
     */
    public java.lang.String getGlobIgnorePaths(int index) {
      return globIgnorePaths_.get(index);
    }
    /**
     * <code>repeated string globIgnorePaths = 3;</code>
     */
    public com.google.protobuf.ByteString
        getGlobIgnorePathsBytes(int index) {
      return globIgnorePaths_.getByteString(index);
    }
    /**
     * <code>repeated string globIgnorePaths = 3;</code>
     */
    public Builder setGlobIgnorePaths(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureGlobIgnorePathsIsMutable();
      globIgnorePaths_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string globIgnorePaths = 3;</code>
     */
    public Builder addGlobIgnorePaths(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureGlobIgnorePathsIsMutable();
      globIgnorePaths_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string globIgnorePaths = 3;</code>
     */
    public Builder addAllGlobIgnorePaths(
        java.lang.Iterable<java.lang.String> values) {
      ensureGlobIgnorePathsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, globIgnorePaths_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string globIgnorePaths = 3;</code>
     */
    public Builder clearGlobIgnorePaths() {
      globIgnorePaths_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string globIgnorePaths = 3;</code>
     */
    public Builder addGlobIgnorePathsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureGlobIgnorePathsIsMutable();
      globIgnorePaths_.add(value);
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:javacd.api.v1.FilesystemParams)
  }

  // @@protoc_insertion_point(class_scope:javacd.api.v1.FilesystemParams)
  private static final com.facebook.buck.cd.model.java.FilesystemParams DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.facebook.buck.cd.model.java.FilesystemParams();
  }

  public static com.facebook.buck.cd.model.java.FilesystemParams getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FilesystemParams>
      PARSER = new com.google.protobuf.AbstractParser<FilesystemParams>() {
    @java.lang.Override
    public FilesystemParams parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FilesystemParams(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FilesystemParams> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FilesystemParams> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.facebook.buck.cd.model.java.FilesystemParams getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

