// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/weatherRequest.proto

package proto.weather;

/**
 * Protobuf type {@code ProtoWeatherData}
 */
public final class ProtoWeatherData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ProtoWeatherData)
    ProtoWeatherDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ProtoWeatherData.newBuilder() to construct.
  private ProtoWeatherData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProtoWeatherData() {
    weatherDataPoints_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ProtoWeatherData();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ProtoWeatherData(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              weatherDataPoints_ = new java.util.ArrayList<proto.weather.ProtoWeatherDataPoint>();
              mutable_bitField0_ |= 0x00000001;
            }
            weatherDataPoints_.add(
                input.readMessage(proto.weather.ProtoWeatherDataPoint.parser(), extensionRegistry));
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
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        weatherDataPoints_ = java.util.Collections.unmodifiableList(weatherDataPoints_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return proto.weather.WeatherRequest.internal_static_ProtoWeatherData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return proto.weather.WeatherRequest.internal_static_ProtoWeatherData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            proto.weather.ProtoWeatherData.class, proto.weather.ProtoWeatherData.Builder.class);
  }

  public static final int WEATHERDATAPOINTS_FIELD_NUMBER = 1;
  private java.util.List<proto.weather.ProtoWeatherDataPoint> weatherDataPoints_;
  /**
   * <code>repeated .ProtoWeatherDataPoint WeatherDataPoints = 1;</code>
   */
  @java.lang.Override
  public java.util.List<proto.weather.ProtoWeatherDataPoint> getWeatherDataPointsList() {
    return weatherDataPoints_;
  }
  /**
   * <code>repeated .ProtoWeatherDataPoint WeatherDataPoints = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends proto.weather.ProtoWeatherDataPointOrBuilder> 
      getWeatherDataPointsOrBuilderList() {
    return weatherDataPoints_;
  }
  /**
   * <code>repeated .ProtoWeatherDataPoint WeatherDataPoints = 1;</code>
   */
  @java.lang.Override
  public int getWeatherDataPointsCount() {
    return weatherDataPoints_.size();
  }
  /**
   * <code>repeated .ProtoWeatherDataPoint WeatherDataPoints = 1;</code>
   */
  @java.lang.Override
  public proto.weather.ProtoWeatherDataPoint getWeatherDataPoints(int index) {
    return weatherDataPoints_.get(index);
  }
  /**
   * <code>repeated .ProtoWeatherDataPoint WeatherDataPoints = 1;</code>
   */
  @java.lang.Override
  public proto.weather.ProtoWeatherDataPointOrBuilder getWeatherDataPointsOrBuilder(
      int index) {
    return weatherDataPoints_.get(index);
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
    for (int i = 0; i < weatherDataPoints_.size(); i++) {
      output.writeMessage(1, weatherDataPoints_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < weatherDataPoints_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, weatherDataPoints_.get(i));
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
    if (!(obj instanceof proto.weather.ProtoWeatherData)) {
      return super.equals(obj);
    }
    proto.weather.ProtoWeatherData other = (proto.weather.ProtoWeatherData) obj;

    if (!getWeatherDataPointsList()
        .equals(other.getWeatherDataPointsList())) return false;
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
    if (getWeatherDataPointsCount() > 0) {
      hash = (37 * hash) + WEATHERDATAPOINTS_FIELD_NUMBER;
      hash = (53 * hash) + getWeatherDataPointsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static proto.weather.ProtoWeatherData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.weather.ProtoWeatherData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.weather.ProtoWeatherData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.weather.ProtoWeatherData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.weather.ProtoWeatherData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.weather.ProtoWeatherData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.weather.ProtoWeatherData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.weather.ProtoWeatherData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.weather.ProtoWeatherData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static proto.weather.ProtoWeatherData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.weather.ProtoWeatherData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.weather.ProtoWeatherData parseFrom(
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
  public static Builder newBuilder(proto.weather.ProtoWeatherData prototype) {
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
   * Protobuf type {@code ProtoWeatherData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ProtoWeatherData)
      proto.weather.ProtoWeatherDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto.weather.WeatherRequest.internal_static_ProtoWeatherData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto.weather.WeatherRequest.internal_static_ProtoWeatherData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto.weather.ProtoWeatherData.class, proto.weather.ProtoWeatherData.Builder.class);
    }

    // Construct using proto.weather.ProtoWeatherData.newBuilder()
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
        getWeatherDataPointsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (weatherDataPointsBuilder_ == null) {
        weatherDataPoints_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        weatherDataPointsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return proto.weather.WeatherRequest.internal_static_ProtoWeatherData_descriptor;
    }

    @java.lang.Override
    public proto.weather.ProtoWeatherData getDefaultInstanceForType() {
      return proto.weather.ProtoWeatherData.getDefaultInstance();
    }

    @java.lang.Override
    public proto.weather.ProtoWeatherData build() {
      proto.weather.ProtoWeatherData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public proto.weather.ProtoWeatherData buildPartial() {
      proto.weather.ProtoWeatherData result = new proto.weather.ProtoWeatherData(this);
      int from_bitField0_ = bitField0_;
      if (weatherDataPointsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          weatherDataPoints_ = java.util.Collections.unmodifiableList(weatherDataPoints_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.weatherDataPoints_ = weatherDataPoints_;
      } else {
        result.weatherDataPoints_ = weatherDataPointsBuilder_.build();
      }
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
      if (other instanceof proto.weather.ProtoWeatherData) {
        return mergeFrom((proto.weather.ProtoWeatherData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(proto.weather.ProtoWeatherData other) {
      if (other == proto.weather.ProtoWeatherData.getDefaultInstance()) return this;
      if (weatherDataPointsBuilder_ == null) {
        if (!other.weatherDataPoints_.isEmpty()) {
          if (weatherDataPoints_.isEmpty()) {
            weatherDataPoints_ = other.weatherDataPoints_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureWeatherDataPointsIsMutable();
            weatherDataPoints_.addAll(other.weatherDataPoints_);
          }
          onChanged();
        }
      } else {
        if (!other.weatherDataPoints_.isEmpty()) {
          if (weatherDataPointsBuilder_.isEmpty()) {
            weatherDataPointsBuilder_.dispose();
            weatherDataPointsBuilder_ = null;
            weatherDataPoints_ = other.weatherDataPoints_;
            bitField0_ = (bitField0_ & ~0x00000001);
            weatherDataPointsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getWeatherDataPointsFieldBuilder() : null;
          } else {
            weatherDataPointsBuilder_.addAllMessages(other.weatherDataPoints_);
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
      proto.weather.ProtoWeatherData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (proto.weather.ProtoWeatherData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<proto.weather.ProtoWeatherDataPoint> weatherDataPoints_ =
      java.util.Collections.emptyList();
    private void ensureWeatherDataPointsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        weatherDataPoints_ = new java.util.ArrayList<proto.weather.ProtoWeatherDataPoint>(weatherDataPoints_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.weather.ProtoWeatherDataPoint, proto.weather.ProtoWeatherDataPoint.Builder, proto.weather.ProtoWeatherDataPointOrBuilder> weatherDataPointsBuilder_;

    /**
     * <code>repeated .ProtoWeatherDataPoint WeatherDataPoints = 1;</code>
     */
    public java.util.List<proto.weather.ProtoWeatherDataPoint> getWeatherDataPointsList() {
      if (weatherDataPointsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(weatherDataPoints_);
      } else {
        return weatherDataPointsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .ProtoWeatherDataPoint WeatherDataPoints = 1;</code>
     */
    public int getWeatherDataPointsCount() {
      if (weatherDataPointsBuilder_ == null) {
        return weatherDataPoints_.size();
      } else {
        return weatherDataPointsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .ProtoWeatherDataPoint WeatherDataPoints = 1;</code>
     */
    public proto.weather.ProtoWeatherDataPoint getWeatherDataPoints(int index) {
      if (weatherDataPointsBuilder_ == null) {
        return weatherDataPoints_.get(index);
      } else {
        return weatherDataPointsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .ProtoWeatherDataPoint WeatherDataPoints = 1;</code>
     */
    public Builder setWeatherDataPoints(
        int index, proto.weather.ProtoWeatherDataPoint value) {
      if (weatherDataPointsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWeatherDataPointsIsMutable();
        weatherDataPoints_.set(index, value);
        onChanged();
      } else {
        weatherDataPointsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .ProtoWeatherDataPoint WeatherDataPoints = 1;</code>
     */
    public Builder setWeatherDataPoints(
        int index, proto.weather.ProtoWeatherDataPoint.Builder builderForValue) {
      if (weatherDataPointsBuilder_ == null) {
        ensureWeatherDataPointsIsMutable();
        weatherDataPoints_.set(index, builderForValue.build());
        onChanged();
      } else {
        weatherDataPointsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ProtoWeatherDataPoint WeatherDataPoints = 1;</code>
     */
    public Builder addWeatherDataPoints(proto.weather.ProtoWeatherDataPoint value) {
      if (weatherDataPointsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWeatherDataPointsIsMutable();
        weatherDataPoints_.add(value);
        onChanged();
      } else {
        weatherDataPointsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .ProtoWeatherDataPoint WeatherDataPoints = 1;</code>
     */
    public Builder addWeatherDataPoints(
        int index, proto.weather.ProtoWeatherDataPoint value) {
      if (weatherDataPointsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWeatherDataPointsIsMutable();
        weatherDataPoints_.add(index, value);
        onChanged();
      } else {
        weatherDataPointsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .ProtoWeatherDataPoint WeatherDataPoints = 1;</code>
     */
    public Builder addWeatherDataPoints(
        proto.weather.ProtoWeatherDataPoint.Builder builderForValue) {
      if (weatherDataPointsBuilder_ == null) {
        ensureWeatherDataPointsIsMutable();
        weatherDataPoints_.add(builderForValue.build());
        onChanged();
      } else {
        weatherDataPointsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ProtoWeatherDataPoint WeatherDataPoints = 1;</code>
     */
    public Builder addWeatherDataPoints(
        int index, proto.weather.ProtoWeatherDataPoint.Builder builderForValue) {
      if (weatherDataPointsBuilder_ == null) {
        ensureWeatherDataPointsIsMutable();
        weatherDataPoints_.add(index, builderForValue.build());
        onChanged();
      } else {
        weatherDataPointsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ProtoWeatherDataPoint WeatherDataPoints = 1;</code>
     */
    public Builder addAllWeatherDataPoints(
        java.lang.Iterable<? extends proto.weather.ProtoWeatherDataPoint> values) {
      if (weatherDataPointsBuilder_ == null) {
        ensureWeatherDataPointsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, weatherDataPoints_);
        onChanged();
      } else {
        weatherDataPointsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .ProtoWeatherDataPoint WeatherDataPoints = 1;</code>
     */
    public Builder clearWeatherDataPoints() {
      if (weatherDataPointsBuilder_ == null) {
        weatherDataPoints_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        weatherDataPointsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .ProtoWeatherDataPoint WeatherDataPoints = 1;</code>
     */
    public Builder removeWeatherDataPoints(int index) {
      if (weatherDataPointsBuilder_ == null) {
        ensureWeatherDataPointsIsMutable();
        weatherDataPoints_.remove(index);
        onChanged();
      } else {
        weatherDataPointsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .ProtoWeatherDataPoint WeatherDataPoints = 1;</code>
     */
    public proto.weather.ProtoWeatherDataPoint.Builder getWeatherDataPointsBuilder(
        int index) {
      return getWeatherDataPointsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .ProtoWeatherDataPoint WeatherDataPoints = 1;</code>
     */
    public proto.weather.ProtoWeatherDataPointOrBuilder getWeatherDataPointsOrBuilder(
        int index) {
      if (weatherDataPointsBuilder_ == null) {
        return weatherDataPoints_.get(index);  } else {
        return weatherDataPointsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .ProtoWeatherDataPoint WeatherDataPoints = 1;</code>
     */
    public java.util.List<? extends proto.weather.ProtoWeatherDataPointOrBuilder> 
         getWeatherDataPointsOrBuilderList() {
      if (weatherDataPointsBuilder_ != null) {
        return weatherDataPointsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(weatherDataPoints_);
      }
    }
    /**
     * <code>repeated .ProtoWeatherDataPoint WeatherDataPoints = 1;</code>
     */
    public proto.weather.ProtoWeatherDataPoint.Builder addWeatherDataPointsBuilder() {
      return getWeatherDataPointsFieldBuilder().addBuilder(
          proto.weather.ProtoWeatherDataPoint.getDefaultInstance());
    }
    /**
     * <code>repeated .ProtoWeatherDataPoint WeatherDataPoints = 1;</code>
     */
    public proto.weather.ProtoWeatherDataPoint.Builder addWeatherDataPointsBuilder(
        int index) {
      return getWeatherDataPointsFieldBuilder().addBuilder(
          index, proto.weather.ProtoWeatherDataPoint.getDefaultInstance());
    }
    /**
     * <code>repeated .ProtoWeatherDataPoint WeatherDataPoints = 1;</code>
     */
    public java.util.List<proto.weather.ProtoWeatherDataPoint.Builder> 
         getWeatherDataPointsBuilderList() {
      return getWeatherDataPointsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.weather.ProtoWeatherDataPoint, proto.weather.ProtoWeatherDataPoint.Builder, proto.weather.ProtoWeatherDataPointOrBuilder> 
        getWeatherDataPointsFieldBuilder() {
      if (weatherDataPointsBuilder_ == null) {
        weatherDataPointsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            proto.weather.ProtoWeatherDataPoint, proto.weather.ProtoWeatherDataPoint.Builder, proto.weather.ProtoWeatherDataPointOrBuilder>(
                weatherDataPoints_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        weatherDataPoints_ = null;
      }
      return weatherDataPointsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:ProtoWeatherData)
  }

  // @@protoc_insertion_point(class_scope:ProtoWeatherData)
  private static final proto.weather.ProtoWeatherData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new proto.weather.ProtoWeatherData();
  }

  public static proto.weather.ProtoWeatherData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProtoWeatherData>
      PARSER = new com.google.protobuf.AbstractParser<ProtoWeatherData>() {
    @java.lang.Override
    public ProtoWeatherData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ProtoWeatherData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ProtoWeatherData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProtoWeatherData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public proto.weather.ProtoWeatherData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

