// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zero.envelop.proto

package io.vertx.tp.ipc.eon;

/**
 * Protobuf type {@code io.vertx.tp.ipc.eon.IpcResponse}
 */
public  final class IpcResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:io.vertx.tp.ipc.eon.IpcResponse)
    IpcResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use IpcResponse.newBuilder() to construct.
  private IpcResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private IpcResponse() {
    clientId_ = "";
    oauthScope_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private IpcResponse(
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
            io.vertx.tp.ipc.eon.IpcEnvelop.Builder subBuilder = null;
            if (envelop_ != null) {
              subBuilder = envelop_.toBuilder();
            }
            envelop_ = input.readMessage(io.vertx.tp.ipc.eon.IpcEnvelop.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(envelop_);
              envelop_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            clientId_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            oauthScope_ = s;
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.vertx.tp.ipc.eon.UpEnvelop.internal_static_io_vertx_tp_ipc_eon_IpcResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.vertx.tp.ipc.eon.UpEnvelop.internal_static_io_vertx_tp_ipc_eon_IpcResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.vertx.tp.ipc.eon.IpcResponse.class, io.vertx.tp.ipc.eon.IpcResponse.Builder.class);
  }

  public static final int ENVELOP_FIELD_NUMBER = 1;
  private io.vertx.tp.ipc.eon.IpcEnvelop envelop_;
  /**
   * <pre>
   * Response content
   * </pre>
   *
   * <code>.io.vertx.tp.ipc.eon.IpcEnvelop envelop = 1;</code>
   */
  public boolean hasEnvelop() {
    return envelop_ != null;
  }
  /**
   * <pre>
   * Response content
   * </pre>
   *
   * <code>.io.vertx.tp.ipc.eon.IpcEnvelop envelop = 1;</code>
   */
  public io.vertx.tp.ipc.eon.IpcEnvelop getEnvelop() {
    return envelop_ == null ? io.vertx.tp.ipc.eon.IpcEnvelop.getDefaultInstance() : envelop_;
  }
  /**
   * <pre>
   * Response content
   * </pre>
   *
   * <code>.io.vertx.tp.ipc.eon.IpcEnvelop envelop = 1;</code>
   */
  public io.vertx.tp.ipc.eon.IpcEnvelopOrBuilder getEnvelopOrBuilder() {
    return getEnvelop();
  }

  public static final int CLIENT_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object clientId_;
  /**
   * <pre>
   * Passed client id
   * </pre>
   *
   * <code>string client_id = 2;</code>
   */
  public java.lang.String getClientId() {
    java.lang.Object ref = clientId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      clientId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Passed client id
   * </pre>
   *
   * <code>string client_id = 2;</code>
   */
  public com.google.protobuf.ByteString
      getClientIdBytes() {
    java.lang.Object ref = clientId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      clientId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OAUTH_SCOPE_FIELD_NUMBER = 3;
  private volatile java.lang.Object oauthScope_;
  /**
   * <pre>
   * Passed scope
   * </pre>
   *
   * <code>string oauth_scope = 3;</code>
   */
  public java.lang.String getOauthScope() {
    java.lang.Object ref = oauthScope_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      oauthScope_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Passed scope
   * </pre>
   *
   * <code>string oauth_scope = 3;</code>
   */
  public com.google.protobuf.ByteString
      getOauthScopeBytes() {
    java.lang.Object ref = oauthScope_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      oauthScope_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (envelop_ != null) {
      output.writeMessage(1, getEnvelop());
    }
    if (!getClientIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, clientId_);
    }
    if (!getOauthScopeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, oauthScope_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (envelop_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getEnvelop());
    }
    if (!getClientIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, clientId_);
    }
    if (!getOauthScopeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, oauthScope_);
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
    if (!(obj instanceof io.vertx.tp.ipc.eon.IpcResponse)) {
      return super.equals(obj);
    }
    io.vertx.tp.ipc.eon.IpcResponse other = (io.vertx.tp.ipc.eon.IpcResponse) obj;

    if (hasEnvelop() != other.hasEnvelop()) return false;
    if (hasEnvelop()) {
      if (!getEnvelop()
          .equals(other.getEnvelop())) return false;
    }
    if (!getClientId()
        .equals(other.getClientId())) return false;
    if (!getOauthScope()
        .equals(other.getOauthScope())) return false;
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
    if (hasEnvelop()) {
      hash = (37 * hash) + ENVELOP_FIELD_NUMBER;
      hash = (53 * hash) + getEnvelop().hashCode();
    }
    hash = (37 * hash) + CLIENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getClientId().hashCode();
    hash = (37 * hash) + OAUTH_SCOPE_FIELD_NUMBER;
    hash = (53 * hash) + getOauthScope().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.vertx.tp.ipc.eon.IpcResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.vertx.tp.ipc.eon.IpcResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.vertx.tp.ipc.eon.IpcResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.vertx.tp.ipc.eon.IpcResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.vertx.tp.ipc.eon.IpcResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.vertx.tp.ipc.eon.IpcResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.vertx.tp.ipc.eon.IpcResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.vertx.tp.ipc.eon.IpcResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.vertx.tp.ipc.eon.IpcResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.vertx.tp.ipc.eon.IpcResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.vertx.tp.ipc.eon.IpcResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.vertx.tp.ipc.eon.IpcResponse parseFrom(
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
  public static Builder newBuilder(io.vertx.tp.ipc.eon.IpcResponse prototype) {
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
   * Protobuf type {@code io.vertx.tp.ipc.eon.IpcResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:io.vertx.tp.ipc.eon.IpcResponse)
      io.vertx.tp.ipc.eon.IpcResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.vertx.tp.ipc.eon.UpEnvelop.internal_static_io_vertx_tp_ipc_eon_IpcResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.vertx.tp.ipc.eon.UpEnvelop.internal_static_io_vertx_tp_ipc_eon_IpcResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.vertx.tp.ipc.eon.IpcResponse.class, io.vertx.tp.ipc.eon.IpcResponse.Builder.class);
    }

    // Construct using io.vertx.tp.ipc.eon.IpcResponse.newBuilder()
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
      if (envelopBuilder_ == null) {
        envelop_ = null;
      } else {
        envelop_ = null;
        envelopBuilder_ = null;
      }
      clientId_ = "";

      oauthScope_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.vertx.tp.ipc.eon.UpEnvelop.internal_static_io_vertx_tp_ipc_eon_IpcResponse_descriptor;
    }

    @java.lang.Override
    public io.vertx.tp.ipc.eon.IpcResponse getDefaultInstanceForType() {
      return io.vertx.tp.ipc.eon.IpcResponse.getDefaultInstance();
    }

    @java.lang.Override
    public io.vertx.tp.ipc.eon.IpcResponse build() {
      io.vertx.tp.ipc.eon.IpcResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.vertx.tp.ipc.eon.IpcResponse buildPartial() {
      io.vertx.tp.ipc.eon.IpcResponse result = new io.vertx.tp.ipc.eon.IpcResponse(this);
      if (envelopBuilder_ == null) {
        result.envelop_ = envelop_;
      } else {
        result.envelop_ = envelopBuilder_.build();
      }
      result.clientId_ = clientId_;
      result.oauthScope_ = oauthScope_;
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
      if (other instanceof io.vertx.tp.ipc.eon.IpcResponse) {
        return mergeFrom((io.vertx.tp.ipc.eon.IpcResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.vertx.tp.ipc.eon.IpcResponse other) {
      if (other == io.vertx.tp.ipc.eon.IpcResponse.getDefaultInstance()) return this;
      if (other.hasEnvelop()) {
        mergeEnvelop(other.getEnvelop());
      }
      if (!other.getClientId().isEmpty()) {
        clientId_ = other.clientId_;
        onChanged();
      }
      if (!other.getOauthScope().isEmpty()) {
        oauthScope_ = other.oauthScope_;
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
      io.vertx.tp.ipc.eon.IpcResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.vertx.tp.ipc.eon.IpcResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.vertx.tp.ipc.eon.IpcEnvelop envelop_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.vertx.tp.ipc.eon.IpcEnvelop, io.vertx.tp.ipc.eon.IpcEnvelop.Builder, io.vertx.tp.ipc.eon.IpcEnvelopOrBuilder> envelopBuilder_;
    /**
     * <pre>
     * Response content
     * </pre>
     *
     * <code>.io.vertx.tp.ipc.eon.IpcEnvelop envelop = 1;</code>
     */
    public boolean hasEnvelop() {
      return envelopBuilder_ != null || envelop_ != null;
    }
    /**
     * <pre>
     * Response content
     * </pre>
     *
     * <code>.io.vertx.tp.ipc.eon.IpcEnvelop envelop = 1;</code>
     */
    public io.vertx.tp.ipc.eon.IpcEnvelop getEnvelop() {
      if (envelopBuilder_ == null) {
        return envelop_ == null ? io.vertx.tp.ipc.eon.IpcEnvelop.getDefaultInstance() : envelop_;
      } else {
        return envelopBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Response content
     * </pre>
     *
     * <code>.io.vertx.tp.ipc.eon.IpcEnvelop envelop = 1;</code>
     */
    public Builder setEnvelop(io.vertx.tp.ipc.eon.IpcEnvelop value) {
      if (envelopBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        envelop_ = value;
        onChanged();
      } else {
        envelopBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Response content
     * </pre>
     *
     * <code>.io.vertx.tp.ipc.eon.IpcEnvelop envelop = 1;</code>
     */
    public Builder setEnvelop(
        io.vertx.tp.ipc.eon.IpcEnvelop.Builder builderForValue) {
      if (envelopBuilder_ == null) {
        envelop_ = builderForValue.build();
        onChanged();
      } else {
        envelopBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Response content
     * </pre>
     *
     * <code>.io.vertx.tp.ipc.eon.IpcEnvelop envelop = 1;</code>
     */
    public Builder mergeEnvelop(io.vertx.tp.ipc.eon.IpcEnvelop value) {
      if (envelopBuilder_ == null) {
        if (envelop_ != null) {
          envelop_ =
            io.vertx.tp.ipc.eon.IpcEnvelop.newBuilder(envelop_).mergeFrom(value).buildPartial();
        } else {
          envelop_ = value;
        }
        onChanged();
      } else {
        envelopBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Response content
     * </pre>
     *
     * <code>.io.vertx.tp.ipc.eon.IpcEnvelop envelop = 1;</code>
     */
    public Builder clearEnvelop() {
      if (envelopBuilder_ == null) {
        envelop_ = null;
        onChanged();
      } else {
        envelop_ = null;
        envelopBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Response content
     * </pre>
     *
     * <code>.io.vertx.tp.ipc.eon.IpcEnvelop envelop = 1;</code>
     */
    public io.vertx.tp.ipc.eon.IpcEnvelop.Builder getEnvelopBuilder() {
      
      onChanged();
      return getEnvelopFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Response content
     * </pre>
     *
     * <code>.io.vertx.tp.ipc.eon.IpcEnvelop envelop = 1;</code>
     */
    public io.vertx.tp.ipc.eon.IpcEnvelopOrBuilder getEnvelopOrBuilder() {
      if (envelopBuilder_ != null) {
        return envelopBuilder_.getMessageOrBuilder();
      } else {
        return envelop_ == null ?
            io.vertx.tp.ipc.eon.IpcEnvelop.getDefaultInstance() : envelop_;
      }
    }
    /**
     * <pre>
     * Response content
     * </pre>
     *
     * <code>.io.vertx.tp.ipc.eon.IpcEnvelop envelop = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.vertx.tp.ipc.eon.IpcEnvelop, io.vertx.tp.ipc.eon.IpcEnvelop.Builder, io.vertx.tp.ipc.eon.IpcEnvelopOrBuilder> 
        getEnvelopFieldBuilder() {
      if (envelopBuilder_ == null) {
        envelopBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.vertx.tp.ipc.eon.IpcEnvelop, io.vertx.tp.ipc.eon.IpcEnvelop.Builder, io.vertx.tp.ipc.eon.IpcEnvelopOrBuilder>(
                getEnvelop(),
                getParentForChildren(),
                isClean());
        envelop_ = null;
      }
      return envelopBuilder_;
    }

    private java.lang.Object clientId_ = "";
    /**
     * <pre>
     * Passed client id
     * </pre>
     *
     * <code>string client_id = 2;</code>
     */
    public java.lang.String getClientId() {
      java.lang.Object ref = clientId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        clientId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Passed client id
     * </pre>
     *
     * <code>string client_id = 2;</code>
     */
    public com.google.protobuf.ByteString
        getClientIdBytes() {
      java.lang.Object ref = clientId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clientId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Passed client id
     * </pre>
     *
     * <code>string client_id = 2;</code>
     */
    public Builder setClientId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      clientId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Passed client id
     * </pre>
     *
     * <code>string client_id = 2;</code>
     */
    public Builder clearClientId() {
      
      clientId_ = getDefaultInstance().getClientId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Passed client id
     * </pre>
     *
     * <code>string client_id = 2;</code>
     */
    public Builder setClientIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      clientId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object oauthScope_ = "";
    /**
     * <pre>
     * Passed scope
     * </pre>
     *
     * <code>string oauth_scope = 3;</code>
     */
    public java.lang.String getOauthScope() {
      java.lang.Object ref = oauthScope_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        oauthScope_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Passed scope
     * </pre>
     *
     * <code>string oauth_scope = 3;</code>
     */
    public com.google.protobuf.ByteString
        getOauthScopeBytes() {
      java.lang.Object ref = oauthScope_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        oauthScope_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Passed scope
     * </pre>
     *
     * <code>string oauth_scope = 3;</code>
     */
    public Builder setOauthScope(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      oauthScope_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Passed scope
     * </pre>
     *
     * <code>string oauth_scope = 3;</code>
     */
    public Builder clearOauthScope() {
      
      oauthScope_ = getDefaultInstance().getOauthScope();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Passed scope
     * </pre>
     *
     * <code>string oauth_scope = 3;</code>
     */
    public Builder setOauthScopeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      oauthScope_ = value;
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


    // @@protoc_insertion_point(builder_scope:io.vertx.tp.ipc.eon.IpcResponse)
  }

  // @@protoc_insertion_point(class_scope:io.vertx.tp.ipc.eon.IpcResponse)
  private static final io.vertx.tp.ipc.eon.IpcResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.vertx.tp.ipc.eon.IpcResponse();
  }

  public static io.vertx.tp.ipc.eon.IpcResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IpcResponse>
      PARSER = new com.google.protobuf.AbstractParser<IpcResponse>() {
    @java.lang.Override
    public IpcResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new IpcResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<IpcResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IpcResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.vertx.tp.ipc.eon.IpcResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

