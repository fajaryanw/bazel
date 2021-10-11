// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: build/bazel/remote/execution/v2/remote_execution.proto

package build.bazel.remote.execution.v2;

/**
 * <pre>
 * A request message for
 * [ContentAddressableStorage.BatchReadBlobs][build.bazel.remote.execution.v2.ContentAddressableStorage.BatchReadBlobs].
 * </pre>
 *
 * Protobuf type {@code build.bazel.remote.execution.v2.BatchReadBlobsRequest}
 */
public  final class BatchReadBlobsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:build.bazel.remote.execution.v2.BatchReadBlobsRequest)
    BatchReadBlobsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BatchReadBlobsRequest.newBuilder() to construct.
  private BatchReadBlobsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BatchReadBlobsRequest() {
    instanceName_ = "";
    digests_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BatchReadBlobsRequest(
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
            java.lang.String s = input.readStringRequireUtf8();

            instanceName_ = s;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              digests_ = new java.util.ArrayList<build.bazel.remote.execution.v2.Digest>();
              mutable_bitField0_ |= 0x00000002;
            }
            digests_.add(
                input.readMessage(build.bazel.remote.execution.v2.Digest.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
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
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        digests_ = java.util.Collections.unmodifiableList(digests_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return build.bazel.remote.execution.v2.RemoteExecutionProto.internal_static_build_bazel_remote_execution_v2_BatchReadBlobsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return build.bazel.remote.execution.v2.RemoteExecutionProto.internal_static_build_bazel_remote_execution_v2_BatchReadBlobsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            build.bazel.remote.execution.v2.BatchReadBlobsRequest.class, build.bazel.remote.execution.v2.BatchReadBlobsRequest.Builder.class);
  }

  private int bitField0_;
  public static final int INSTANCE_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object instanceName_;
  /**
   * <pre>
   * The instance of the execution system to operate against. A server may
   * support multiple instances of the execution system (with their own workers,
   * storage, caches, etc.). The server MAY require use of this field to select
   * between them in an implementation-defined fashion, otherwise it can be
   * omitted.
   * </pre>
   *
   * <code>string instance_name = 1;</code>
   */
  public java.lang.String getInstanceName() {
    java.lang.Object ref = instanceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      instanceName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The instance of the execution system to operate against. A server may
   * support multiple instances of the execution system (with their own workers,
   * storage, caches, etc.). The server MAY require use of this field to select
   * between them in an implementation-defined fashion, otherwise it can be
   * omitted.
   * </pre>
   *
   * <code>string instance_name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getInstanceNameBytes() {
    java.lang.Object ref = instanceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      instanceName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DIGESTS_FIELD_NUMBER = 2;
  private java.util.List<build.bazel.remote.execution.v2.Digest> digests_;
  /**
   * <pre>
   * The individual blob digests.
   * </pre>
   *
   * <code>repeated .build.bazel.remote.execution.v2.Digest digests = 2;</code>
   */
  public java.util.List<build.bazel.remote.execution.v2.Digest> getDigestsList() {
    return digests_;
  }
  /**
   * <pre>
   * The individual blob digests.
   * </pre>
   *
   * <code>repeated .build.bazel.remote.execution.v2.Digest digests = 2;</code>
   */
  public java.util.List<? extends build.bazel.remote.execution.v2.DigestOrBuilder> 
      getDigestsOrBuilderList() {
    return digests_;
  }
  /**
   * <pre>
   * The individual blob digests.
   * </pre>
   *
   * <code>repeated .build.bazel.remote.execution.v2.Digest digests = 2;</code>
   */
  public int getDigestsCount() {
    return digests_.size();
  }
  /**
   * <pre>
   * The individual blob digests.
   * </pre>
   *
   * <code>repeated .build.bazel.remote.execution.v2.Digest digests = 2;</code>
   */
  public build.bazel.remote.execution.v2.Digest getDigests(int index) {
    return digests_.get(index);
  }
  /**
   * <pre>
   * The individual blob digests.
   * </pre>
   *
   * <code>repeated .build.bazel.remote.execution.v2.Digest digests = 2;</code>
   */
  public build.bazel.remote.execution.v2.DigestOrBuilder getDigestsOrBuilder(
      int index) {
    return digests_.get(index);
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
    if (!getInstanceNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, instanceName_);
    }
    for (int i = 0; i < digests_.size(); i++) {
      output.writeMessage(2, digests_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getInstanceNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, instanceName_);
    }
    for (int i = 0; i < digests_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, digests_.get(i));
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
    if (!(obj instanceof build.bazel.remote.execution.v2.BatchReadBlobsRequest)) {
      return super.equals(obj);
    }
    build.bazel.remote.execution.v2.BatchReadBlobsRequest other = (build.bazel.remote.execution.v2.BatchReadBlobsRequest) obj;

    boolean result = true;
    result = result && getInstanceName()
        .equals(other.getInstanceName());
    result = result && getDigestsList()
        .equals(other.getDigestsList());
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
    hash = (37 * hash) + INSTANCE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getInstanceName().hashCode();
    if (getDigestsCount() > 0) {
      hash = (37 * hash) + DIGESTS_FIELD_NUMBER;
      hash = (53 * hash) + getDigestsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static build.bazel.remote.execution.v2.BatchReadBlobsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.bazel.remote.execution.v2.BatchReadBlobsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.bazel.remote.execution.v2.BatchReadBlobsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.bazel.remote.execution.v2.BatchReadBlobsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.bazel.remote.execution.v2.BatchReadBlobsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.bazel.remote.execution.v2.BatchReadBlobsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.bazel.remote.execution.v2.BatchReadBlobsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static build.bazel.remote.execution.v2.BatchReadBlobsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static build.bazel.remote.execution.v2.BatchReadBlobsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static build.bazel.remote.execution.v2.BatchReadBlobsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static build.bazel.remote.execution.v2.BatchReadBlobsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static build.bazel.remote.execution.v2.BatchReadBlobsRequest parseFrom(
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
  public static Builder newBuilder(build.bazel.remote.execution.v2.BatchReadBlobsRequest prototype) {
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
   * <pre>
   * A request message for
   * [ContentAddressableStorage.BatchReadBlobs][build.bazel.remote.execution.v2.ContentAddressableStorage.BatchReadBlobs].
   * </pre>
   *
   * Protobuf type {@code build.bazel.remote.execution.v2.BatchReadBlobsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:build.bazel.remote.execution.v2.BatchReadBlobsRequest)
      build.bazel.remote.execution.v2.BatchReadBlobsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return build.bazel.remote.execution.v2.RemoteExecutionProto.internal_static_build_bazel_remote_execution_v2_BatchReadBlobsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return build.bazel.remote.execution.v2.RemoteExecutionProto.internal_static_build_bazel_remote_execution_v2_BatchReadBlobsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              build.bazel.remote.execution.v2.BatchReadBlobsRequest.class, build.bazel.remote.execution.v2.BatchReadBlobsRequest.Builder.class);
    }

    // Construct using build.bazel.remote.execution.v2.BatchReadBlobsRequest.newBuilder()
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
        getDigestsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      instanceName_ = "";

      if (digestsBuilder_ == null) {
        digests_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        digestsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return build.bazel.remote.execution.v2.RemoteExecutionProto.internal_static_build_bazel_remote_execution_v2_BatchReadBlobsRequest_descriptor;
    }

    @java.lang.Override
    public build.bazel.remote.execution.v2.BatchReadBlobsRequest getDefaultInstanceForType() {
      return build.bazel.remote.execution.v2.BatchReadBlobsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public build.bazel.remote.execution.v2.BatchReadBlobsRequest build() {
      build.bazel.remote.execution.v2.BatchReadBlobsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public build.bazel.remote.execution.v2.BatchReadBlobsRequest buildPartial() {
      build.bazel.remote.execution.v2.BatchReadBlobsRequest result = new build.bazel.remote.execution.v2.BatchReadBlobsRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.instanceName_ = instanceName_;
      if (digestsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          digests_ = java.util.Collections.unmodifiableList(digests_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.digests_ = digests_;
      } else {
        result.digests_ = digestsBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof build.bazel.remote.execution.v2.BatchReadBlobsRequest) {
        return mergeFrom((build.bazel.remote.execution.v2.BatchReadBlobsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(build.bazel.remote.execution.v2.BatchReadBlobsRequest other) {
      if (other == build.bazel.remote.execution.v2.BatchReadBlobsRequest.getDefaultInstance()) return this;
      if (!other.getInstanceName().isEmpty()) {
        instanceName_ = other.instanceName_;
        onChanged();
      }
      if (digestsBuilder_ == null) {
        if (!other.digests_.isEmpty()) {
          if (digests_.isEmpty()) {
            digests_ = other.digests_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureDigestsIsMutable();
            digests_.addAll(other.digests_);
          }
          onChanged();
        }
      } else {
        if (!other.digests_.isEmpty()) {
          if (digestsBuilder_.isEmpty()) {
            digestsBuilder_.dispose();
            digestsBuilder_ = null;
            digests_ = other.digests_;
            bitField0_ = (bitField0_ & ~0x00000002);
            digestsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDigestsFieldBuilder() : null;
          } else {
            digestsBuilder_.addAllMessages(other.digests_);
          }
        }
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
      build.bazel.remote.execution.v2.BatchReadBlobsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (build.bazel.remote.execution.v2.BatchReadBlobsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object instanceName_ = "";
    /**
     * <pre>
     * The instance of the execution system to operate against. A server may
     * support multiple instances of the execution system (with their own workers,
     * storage, caches, etc.). The server MAY require use of this field to select
     * between them in an implementation-defined fashion, otherwise it can be
     * omitted.
     * </pre>
     *
     * <code>string instance_name = 1;</code>
     */
    public java.lang.String getInstanceName() {
      java.lang.Object ref = instanceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        instanceName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The instance of the execution system to operate against. A server may
     * support multiple instances of the execution system (with their own workers,
     * storage, caches, etc.). The server MAY require use of this field to select
     * between them in an implementation-defined fashion, otherwise it can be
     * omitted.
     * </pre>
     *
     * <code>string instance_name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getInstanceNameBytes() {
      java.lang.Object ref = instanceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        instanceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The instance of the execution system to operate against. A server may
     * support multiple instances of the execution system (with their own workers,
     * storage, caches, etc.). The server MAY require use of this field to select
     * between them in an implementation-defined fashion, otherwise it can be
     * omitted.
     * </pre>
     *
     * <code>string instance_name = 1;</code>
     */
    public Builder setInstanceName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      instanceName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The instance of the execution system to operate against. A server may
     * support multiple instances of the execution system (with their own workers,
     * storage, caches, etc.). The server MAY require use of this field to select
     * between them in an implementation-defined fashion, otherwise it can be
     * omitted.
     * </pre>
     *
     * <code>string instance_name = 1;</code>
     */
    public Builder clearInstanceName() {
      
      instanceName_ = getDefaultInstance().getInstanceName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The instance of the execution system to operate against. A server may
     * support multiple instances of the execution system (with their own workers,
     * storage, caches, etc.). The server MAY require use of this field to select
     * between them in an implementation-defined fashion, otherwise it can be
     * omitted.
     * </pre>
     *
     * <code>string instance_name = 1;</code>
     */
    public Builder setInstanceNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      instanceName_ = value;
      onChanged();
      return this;
    }

    private java.util.List<build.bazel.remote.execution.v2.Digest> digests_ =
      java.util.Collections.emptyList();
    private void ensureDigestsIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        digests_ = new java.util.ArrayList<build.bazel.remote.execution.v2.Digest>(digests_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        build.bazel.remote.execution.v2.Digest, build.bazel.remote.execution.v2.Digest.Builder, build.bazel.remote.execution.v2.DigestOrBuilder> digestsBuilder_;

    /**
     * <pre>
     * The individual blob digests.
     * </pre>
     *
     * <code>repeated .build.bazel.remote.execution.v2.Digest digests = 2;</code>
     */
    public java.util.List<build.bazel.remote.execution.v2.Digest> getDigestsList() {
      if (digestsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(digests_);
      } else {
        return digestsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The individual blob digests.
     * </pre>
     *
     * <code>repeated .build.bazel.remote.execution.v2.Digest digests = 2;</code>
     */
    public int getDigestsCount() {
      if (digestsBuilder_ == null) {
        return digests_.size();
      } else {
        return digestsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The individual blob digests.
     * </pre>
     *
     * <code>repeated .build.bazel.remote.execution.v2.Digest digests = 2;</code>
     */
    public build.bazel.remote.execution.v2.Digest getDigests(int index) {
      if (digestsBuilder_ == null) {
        return digests_.get(index);
      } else {
        return digestsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The individual blob digests.
     * </pre>
     *
     * <code>repeated .build.bazel.remote.execution.v2.Digest digests = 2;</code>
     */
    public Builder setDigests(
        int index, build.bazel.remote.execution.v2.Digest value) {
      if (digestsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDigestsIsMutable();
        digests_.set(index, value);
        onChanged();
      } else {
        digestsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The individual blob digests.
     * </pre>
     *
     * <code>repeated .build.bazel.remote.execution.v2.Digest digests = 2;</code>
     */
    public Builder setDigests(
        int index, build.bazel.remote.execution.v2.Digest.Builder builderForValue) {
      if (digestsBuilder_ == null) {
        ensureDigestsIsMutable();
        digests_.set(index, builderForValue.build());
        onChanged();
      } else {
        digestsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The individual blob digests.
     * </pre>
     *
     * <code>repeated .build.bazel.remote.execution.v2.Digest digests = 2;</code>
     */
    public Builder addDigests(build.bazel.remote.execution.v2.Digest value) {
      if (digestsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDigestsIsMutable();
        digests_.add(value);
        onChanged();
      } else {
        digestsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The individual blob digests.
     * </pre>
     *
     * <code>repeated .build.bazel.remote.execution.v2.Digest digests = 2;</code>
     */
    public Builder addDigests(
        int index, build.bazel.remote.execution.v2.Digest value) {
      if (digestsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDigestsIsMutable();
        digests_.add(index, value);
        onChanged();
      } else {
        digestsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The individual blob digests.
     * </pre>
     *
     * <code>repeated .build.bazel.remote.execution.v2.Digest digests = 2;</code>
     */
    public Builder addDigests(
        build.bazel.remote.execution.v2.Digest.Builder builderForValue) {
      if (digestsBuilder_ == null) {
        ensureDigestsIsMutable();
        digests_.add(builderForValue.build());
        onChanged();
      } else {
        digestsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The individual blob digests.
     * </pre>
     *
     * <code>repeated .build.bazel.remote.execution.v2.Digest digests = 2;</code>
     */
    public Builder addDigests(
        int index, build.bazel.remote.execution.v2.Digest.Builder builderForValue) {
      if (digestsBuilder_ == null) {
        ensureDigestsIsMutable();
        digests_.add(index, builderForValue.build());
        onChanged();
      } else {
        digestsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The individual blob digests.
     * </pre>
     *
     * <code>repeated .build.bazel.remote.execution.v2.Digest digests = 2;</code>
     */
    public Builder addAllDigests(
        java.lang.Iterable<? extends build.bazel.remote.execution.v2.Digest> values) {
      if (digestsBuilder_ == null) {
        ensureDigestsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, digests_);
        onChanged();
      } else {
        digestsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The individual blob digests.
     * </pre>
     *
     * <code>repeated .build.bazel.remote.execution.v2.Digest digests = 2;</code>
     */
    public Builder clearDigests() {
      if (digestsBuilder_ == null) {
        digests_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        digestsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The individual blob digests.
     * </pre>
     *
     * <code>repeated .build.bazel.remote.execution.v2.Digest digests = 2;</code>
     */
    public Builder removeDigests(int index) {
      if (digestsBuilder_ == null) {
        ensureDigestsIsMutable();
        digests_.remove(index);
        onChanged();
      } else {
        digestsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The individual blob digests.
     * </pre>
     *
     * <code>repeated .build.bazel.remote.execution.v2.Digest digests = 2;</code>
     */
    public build.bazel.remote.execution.v2.Digest.Builder getDigestsBuilder(
        int index) {
      return getDigestsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The individual blob digests.
     * </pre>
     *
     * <code>repeated .build.bazel.remote.execution.v2.Digest digests = 2;</code>
     */
    public build.bazel.remote.execution.v2.DigestOrBuilder getDigestsOrBuilder(
        int index) {
      if (digestsBuilder_ == null) {
        return digests_.get(index);  } else {
        return digestsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The individual blob digests.
     * </pre>
     *
     * <code>repeated .build.bazel.remote.execution.v2.Digest digests = 2;</code>
     */
    public java.util.List<? extends build.bazel.remote.execution.v2.DigestOrBuilder> 
         getDigestsOrBuilderList() {
      if (digestsBuilder_ != null) {
        return digestsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(digests_);
      }
    }
    /**
     * <pre>
     * The individual blob digests.
     * </pre>
     *
     * <code>repeated .build.bazel.remote.execution.v2.Digest digests = 2;</code>
     */
    public build.bazel.remote.execution.v2.Digest.Builder addDigestsBuilder() {
      return getDigestsFieldBuilder().addBuilder(
          build.bazel.remote.execution.v2.Digest.getDefaultInstance());
    }
    /**
     * <pre>
     * The individual blob digests.
     * </pre>
     *
     * <code>repeated .build.bazel.remote.execution.v2.Digest digests = 2;</code>
     */
    public build.bazel.remote.execution.v2.Digest.Builder addDigestsBuilder(
        int index) {
      return getDigestsFieldBuilder().addBuilder(
          index, build.bazel.remote.execution.v2.Digest.getDefaultInstance());
    }
    /**
     * <pre>
     * The individual blob digests.
     * </pre>
     *
     * <code>repeated .build.bazel.remote.execution.v2.Digest digests = 2;</code>
     */
    public java.util.List<build.bazel.remote.execution.v2.Digest.Builder> 
         getDigestsBuilderList() {
      return getDigestsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        build.bazel.remote.execution.v2.Digest, build.bazel.remote.execution.v2.Digest.Builder, build.bazel.remote.execution.v2.DigestOrBuilder> 
        getDigestsFieldBuilder() {
      if (digestsBuilder_ == null) {
        digestsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            build.bazel.remote.execution.v2.Digest, build.bazel.remote.execution.v2.Digest.Builder, build.bazel.remote.execution.v2.DigestOrBuilder>(
                digests_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        digests_ = null;
      }
      return digestsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:build.bazel.remote.execution.v2.BatchReadBlobsRequest)
  }

  // @@protoc_insertion_point(class_scope:build.bazel.remote.execution.v2.BatchReadBlobsRequest)
  private static final build.bazel.remote.execution.v2.BatchReadBlobsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new build.bazel.remote.execution.v2.BatchReadBlobsRequest();
  }

  public static build.bazel.remote.execution.v2.BatchReadBlobsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BatchReadBlobsRequest>
      PARSER = new com.google.protobuf.AbstractParser<BatchReadBlobsRequest>() {
    @java.lang.Override
    public BatchReadBlobsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BatchReadBlobsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BatchReadBlobsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BatchReadBlobsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public build.bazel.remote.execution.v2.BatchReadBlobsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

