package proto.weather;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.47.0)",
    comments = "Source: weatherRequest.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class WeatherDataGrpc {

  private WeatherDataGrpc() {}

  public static final String SERVICE_NAME = "weatherRequest.WeatherData";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.weather.ProtoWeatherData,
      proto.weather.ProtoSavedReply> getSaveWeatherDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SaveWeatherData",
      requestType = proto.weather.ProtoWeatherData.class,
      responseType = proto.weather.ProtoSavedReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.weather.ProtoWeatherData,
      proto.weather.ProtoSavedReply> getSaveWeatherDataMethod() {
    io.grpc.MethodDescriptor<proto.weather.ProtoWeatherData, proto.weather.ProtoSavedReply> getSaveWeatherDataMethod;
    if ((getSaveWeatherDataMethod = WeatherDataGrpc.getSaveWeatherDataMethod) == null) {
      synchronized (WeatherDataGrpc.class) {
        if ((getSaveWeatherDataMethod = WeatherDataGrpc.getSaveWeatherDataMethod) == null) {
          WeatherDataGrpc.getSaveWeatherDataMethod = getSaveWeatherDataMethod =
              io.grpc.MethodDescriptor.<proto.weather.ProtoWeatherData, proto.weather.ProtoSavedReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SaveWeatherData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.weather.ProtoWeatherData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.weather.ProtoSavedReply.getDefaultInstance()))
              .setSchemaDescriptor(new WeatherDataMethodDescriptorSupplier("SaveWeatherData"))
              .build();
        }
      }
    }
    return getSaveWeatherDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.weather.ProtoWeatherDataRequest,
      proto.weather.ProtoWeatherData> getGetWeatherDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetWeatherData",
      requestType = proto.weather.ProtoWeatherDataRequest.class,
      responseType = proto.weather.ProtoWeatherData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.weather.ProtoWeatherDataRequest,
      proto.weather.ProtoWeatherData> getGetWeatherDataMethod() {
    io.grpc.MethodDescriptor<proto.weather.ProtoWeatherDataRequest, proto.weather.ProtoWeatherData> getGetWeatherDataMethod;
    if ((getGetWeatherDataMethod = WeatherDataGrpc.getGetWeatherDataMethod) == null) {
      synchronized (WeatherDataGrpc.class) {
        if ((getGetWeatherDataMethod = WeatherDataGrpc.getGetWeatherDataMethod) == null) {
          WeatherDataGrpc.getGetWeatherDataMethod = getGetWeatherDataMethod =
              io.grpc.MethodDescriptor.<proto.weather.ProtoWeatherDataRequest, proto.weather.ProtoWeatherData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetWeatherData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.weather.ProtoWeatherDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.weather.ProtoWeatherData.getDefaultInstance()))
              .setSchemaDescriptor(new WeatherDataMethodDescriptorSupplier("GetWeatherData"))
              .build();
        }
      }
    }
    return getGetWeatherDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.weather.ProtoWeatherDataRequest,
      proto.weather.ProtoWeatherData> getGetLastDataPointMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLastDataPoint",
      requestType = proto.weather.ProtoWeatherDataRequest.class,
      responseType = proto.weather.ProtoWeatherData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.weather.ProtoWeatherDataRequest,
      proto.weather.ProtoWeatherData> getGetLastDataPointMethod() {
    io.grpc.MethodDescriptor<proto.weather.ProtoWeatherDataRequest, proto.weather.ProtoWeatherData> getGetLastDataPointMethod;
    if ((getGetLastDataPointMethod = WeatherDataGrpc.getGetLastDataPointMethod) == null) {
      synchronized (WeatherDataGrpc.class) {
        if ((getGetLastDataPointMethod = WeatherDataGrpc.getGetLastDataPointMethod) == null) {
          WeatherDataGrpc.getGetLastDataPointMethod = getGetLastDataPointMethod =
              io.grpc.MethodDescriptor.<proto.weather.ProtoWeatherDataRequest, proto.weather.ProtoWeatherData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLastDataPoint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.weather.ProtoWeatherDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.weather.ProtoWeatherData.getDefaultInstance()))
              .setSchemaDescriptor(new WeatherDataMethodDescriptorSupplier("GetLastDataPoint"))
              .build();
        }
      }
    }
    return getGetLastDataPointMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.weather.ProtoTimeBlock,
      proto.weather.ProtoWeatherData> getGetWeatherDataBetweenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetWeatherDataBetween",
      requestType = proto.weather.ProtoTimeBlock.class,
      responseType = proto.weather.ProtoWeatherData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.weather.ProtoTimeBlock,
      proto.weather.ProtoWeatherData> getGetWeatherDataBetweenMethod() {
    io.grpc.MethodDescriptor<proto.weather.ProtoTimeBlock, proto.weather.ProtoWeatherData> getGetWeatherDataBetweenMethod;
    if ((getGetWeatherDataBetweenMethod = WeatherDataGrpc.getGetWeatherDataBetweenMethod) == null) {
      synchronized (WeatherDataGrpc.class) {
        if ((getGetWeatherDataBetweenMethod = WeatherDataGrpc.getGetWeatherDataBetweenMethod) == null) {
          WeatherDataGrpc.getGetWeatherDataBetweenMethod = getGetWeatherDataBetweenMethod =
              io.grpc.MethodDescriptor.<proto.weather.ProtoTimeBlock, proto.weather.ProtoWeatherData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetWeatherDataBetween"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.weather.ProtoTimeBlock.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.weather.ProtoWeatherData.getDefaultInstance()))
              .setSchemaDescriptor(new WeatherDataMethodDescriptorSupplier("GetWeatherDataBetween"))
              .build();
        }
      }
    }
    return getGetWeatherDataBetweenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.weather.ProtoWeatherStation,
      proto.weather.ProtoWeatherData> getGetWeatherDataByStationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetWeatherDataByStation",
      requestType = proto.weather.ProtoWeatherStation.class,
      responseType = proto.weather.ProtoWeatherData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.weather.ProtoWeatherStation,
      proto.weather.ProtoWeatherData> getGetWeatherDataByStationMethod() {
    io.grpc.MethodDescriptor<proto.weather.ProtoWeatherStation, proto.weather.ProtoWeatherData> getGetWeatherDataByStationMethod;
    if ((getGetWeatherDataByStationMethod = WeatherDataGrpc.getGetWeatherDataByStationMethod) == null) {
      synchronized (WeatherDataGrpc.class) {
        if ((getGetWeatherDataByStationMethod = WeatherDataGrpc.getGetWeatherDataByStationMethod) == null) {
          WeatherDataGrpc.getGetWeatherDataByStationMethod = getGetWeatherDataByStationMethod =
              io.grpc.MethodDescriptor.<proto.weather.ProtoWeatherStation, proto.weather.ProtoWeatherData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetWeatherDataByStation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.weather.ProtoWeatherStation.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.weather.ProtoWeatherData.getDefaultInstance()))
              .setSchemaDescriptor(new WeatherDataMethodDescriptorSupplier("GetWeatherDataByStation"))
              .build();
        }
      }
    }
    return getGetWeatherDataByStationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WeatherDataStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WeatherDataStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WeatherDataStub>() {
        @java.lang.Override
        public WeatherDataStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WeatherDataStub(channel, callOptions);
        }
      };
    return WeatherDataStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WeatherDataBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WeatherDataBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WeatherDataBlockingStub>() {
        @java.lang.Override
        public WeatherDataBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WeatherDataBlockingStub(channel, callOptions);
        }
      };
    return WeatherDataBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WeatherDataFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WeatherDataFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WeatherDataFutureStub>() {
        @java.lang.Override
        public WeatherDataFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WeatherDataFutureStub(channel, callOptions);
        }
      };
    return WeatherDataFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class WeatherDataImplBase implements io.grpc.BindableService {

    /**
     */
    public void saveWeatherData(proto.weather.ProtoWeatherData request,
        io.grpc.stub.StreamObserver<proto.weather.ProtoSavedReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaveWeatherDataMethod(), responseObserver);
    }

    /**
     */
    public void getWeatherData(proto.weather.ProtoWeatherDataRequest request,
        io.grpc.stub.StreamObserver<proto.weather.ProtoWeatherData> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetWeatherDataMethod(), responseObserver);
    }

    /**
     */
    public void getLastDataPoint(proto.weather.ProtoWeatherDataRequest request,
        io.grpc.stub.StreamObserver<proto.weather.ProtoWeatherData> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLastDataPointMethod(), responseObserver);
    }

    /**
     */
    public void getWeatherDataBetween(proto.weather.ProtoTimeBlock request,
        io.grpc.stub.StreamObserver<proto.weather.ProtoWeatherData> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetWeatherDataBetweenMethod(), responseObserver);
    }

    /**
     */
    public void getWeatherDataByStation(proto.weather.ProtoWeatherStation request,
        io.grpc.stub.StreamObserver<proto.weather.ProtoWeatherData> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetWeatherDataByStationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSaveWeatherDataMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                proto.weather.ProtoWeatherData,
                proto.weather.ProtoSavedReply>(
                  this, METHODID_SAVE_WEATHER_DATA)))
          .addMethod(
            getGetWeatherDataMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                proto.weather.ProtoWeatherDataRequest,
                proto.weather.ProtoWeatherData>(
                  this, METHODID_GET_WEATHER_DATA)))
          .addMethod(
            getGetLastDataPointMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                proto.weather.ProtoWeatherDataRequest,
                proto.weather.ProtoWeatherData>(
                  this, METHODID_GET_LAST_DATA_POINT)))
          .addMethod(
            getGetWeatherDataBetweenMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                proto.weather.ProtoTimeBlock,
                proto.weather.ProtoWeatherData>(
                  this, METHODID_GET_WEATHER_DATA_BETWEEN)))
          .addMethod(
            getGetWeatherDataByStationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                proto.weather.ProtoWeatherStation,
                proto.weather.ProtoWeatherData>(
                  this, METHODID_GET_WEATHER_DATA_BY_STATION)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class WeatherDataStub extends io.grpc.stub.AbstractAsyncStub<WeatherDataStub> {
    private WeatherDataStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WeatherDataStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WeatherDataStub(channel, callOptions);
    }

    /**
     */
    public void saveWeatherData(proto.weather.ProtoWeatherData request,
        io.grpc.stub.StreamObserver<proto.weather.ProtoSavedReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSaveWeatherDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getWeatherData(proto.weather.ProtoWeatherDataRequest request,
        io.grpc.stub.StreamObserver<proto.weather.ProtoWeatherData> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetWeatherDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getLastDataPoint(proto.weather.ProtoWeatherDataRequest request,
        io.grpc.stub.StreamObserver<proto.weather.ProtoWeatherData> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLastDataPointMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getWeatherDataBetween(proto.weather.ProtoTimeBlock request,
        io.grpc.stub.StreamObserver<proto.weather.ProtoWeatherData> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetWeatherDataBetweenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getWeatherDataByStation(proto.weather.ProtoWeatherStation request,
        io.grpc.stub.StreamObserver<proto.weather.ProtoWeatherData> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetWeatherDataByStationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class WeatherDataBlockingStub extends io.grpc.stub.AbstractBlockingStub<WeatherDataBlockingStub> {
    private WeatherDataBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WeatherDataBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WeatherDataBlockingStub(channel, callOptions);
    }

    /**
     */
    public proto.weather.ProtoSavedReply saveWeatherData(proto.weather.ProtoWeatherData request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaveWeatherDataMethod(), getCallOptions(), request);
    }

    /**
     */
    public proto.weather.ProtoWeatherData getWeatherData(proto.weather.ProtoWeatherDataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetWeatherDataMethod(), getCallOptions(), request);
    }

    /**
     */
    public proto.weather.ProtoWeatherData getLastDataPoint(proto.weather.ProtoWeatherDataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLastDataPointMethod(), getCallOptions(), request);
    }

    /**
     */
    public proto.weather.ProtoWeatherData getWeatherDataBetween(proto.weather.ProtoTimeBlock request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetWeatherDataBetweenMethod(), getCallOptions(), request);
    }

    /**
     */
    public proto.weather.ProtoWeatherData getWeatherDataByStation(proto.weather.ProtoWeatherStation request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetWeatherDataByStationMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class WeatherDataFutureStub extends io.grpc.stub.AbstractFutureStub<WeatherDataFutureStub> {
    private WeatherDataFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WeatherDataFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WeatherDataFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.weather.ProtoSavedReply> saveWeatherData(
        proto.weather.ProtoWeatherData request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSaveWeatherDataMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.weather.ProtoWeatherData> getWeatherData(
        proto.weather.ProtoWeatherDataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetWeatherDataMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.weather.ProtoWeatherData> getLastDataPoint(
        proto.weather.ProtoWeatherDataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLastDataPointMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.weather.ProtoWeatherData> getWeatherDataBetween(
        proto.weather.ProtoTimeBlock request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetWeatherDataBetweenMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.weather.ProtoWeatherData> getWeatherDataByStation(
        proto.weather.ProtoWeatherStation request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetWeatherDataByStationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAVE_WEATHER_DATA = 0;
  private static final int METHODID_GET_WEATHER_DATA = 1;
  private static final int METHODID_GET_LAST_DATA_POINT = 2;
  private static final int METHODID_GET_WEATHER_DATA_BETWEEN = 3;
  private static final int METHODID_GET_WEATHER_DATA_BY_STATION = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WeatherDataImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WeatherDataImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAVE_WEATHER_DATA:
          serviceImpl.saveWeatherData((proto.weather.ProtoWeatherData) request,
              (io.grpc.stub.StreamObserver<proto.weather.ProtoSavedReply>) responseObserver);
          break;
        case METHODID_GET_WEATHER_DATA:
          serviceImpl.getWeatherData((proto.weather.ProtoWeatherDataRequest) request,
              (io.grpc.stub.StreamObserver<proto.weather.ProtoWeatherData>) responseObserver);
          break;
        case METHODID_GET_LAST_DATA_POINT:
          serviceImpl.getLastDataPoint((proto.weather.ProtoWeatherDataRequest) request,
              (io.grpc.stub.StreamObserver<proto.weather.ProtoWeatherData>) responseObserver);
          break;
        case METHODID_GET_WEATHER_DATA_BETWEEN:
          serviceImpl.getWeatherDataBetween((proto.weather.ProtoTimeBlock) request,
              (io.grpc.stub.StreamObserver<proto.weather.ProtoWeatherData>) responseObserver);
          break;
        case METHODID_GET_WEATHER_DATA_BY_STATION:
          serviceImpl.getWeatherDataByStation((proto.weather.ProtoWeatherStation) request,
              (io.grpc.stub.StreamObserver<proto.weather.ProtoWeatherData>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class WeatherDataBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WeatherDataBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return proto.weather.WeatherRequest.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WeatherData");
    }
  }

  private static final class WeatherDataFileDescriptorSupplier
      extends WeatherDataBaseDescriptorSupplier {
    WeatherDataFileDescriptorSupplier() {}
  }

  private static final class WeatherDataMethodDescriptorSupplier
      extends WeatherDataBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WeatherDataMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (WeatherDataGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WeatherDataFileDescriptorSupplier())
              .addMethod(getSaveWeatherDataMethod())
              .addMethod(getGetWeatherDataMethod())
              .addMethod(getGetLastDataPointMethod())
              .addMethod(getGetWeatherDataBetweenMethod())
              .addMethod(getGetWeatherDataByStationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
