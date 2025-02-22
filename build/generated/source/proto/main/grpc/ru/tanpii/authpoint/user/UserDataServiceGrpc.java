package ru.tanpii.authpoint.user;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.68.0)",
    comments = "Source: UserDataService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UserDataServiceGrpc {

  private UserDataServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ru.tanpii.authpoint.user.UserDataService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ru.tanpii.authpoint.user.GetUserDataJwtRequest,
      ru.tanpii.authpoint.user.UserDataResponse> getGetUserDataByJwtMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getUserDataByJwt",
      requestType = ru.tanpii.authpoint.user.GetUserDataJwtRequest.class,
      responseType = ru.tanpii.authpoint.user.UserDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ru.tanpii.authpoint.user.GetUserDataJwtRequest,
      ru.tanpii.authpoint.user.UserDataResponse> getGetUserDataByJwtMethod() {
    io.grpc.MethodDescriptor<ru.tanpii.authpoint.user.GetUserDataJwtRequest, ru.tanpii.authpoint.user.UserDataResponse> getGetUserDataByJwtMethod;
    if ((getGetUserDataByJwtMethod = UserDataServiceGrpc.getGetUserDataByJwtMethod) == null) {
      synchronized (UserDataServiceGrpc.class) {
        if ((getGetUserDataByJwtMethod = UserDataServiceGrpc.getGetUserDataByJwtMethod) == null) {
          UserDataServiceGrpc.getGetUserDataByJwtMethod = getGetUserDataByJwtMethod =
              io.grpc.MethodDescriptor.<ru.tanpii.authpoint.user.GetUserDataJwtRequest, ru.tanpii.authpoint.user.UserDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getUserDataByJwt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.tanpii.authpoint.user.GetUserDataJwtRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.tanpii.authpoint.user.UserDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserDataServiceMethodDescriptorSupplier("getUserDataByJwt"))
              .build();
        }
      }
    }
    return getGetUserDataByJwtMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ru.tanpii.authpoint.user.GetUserDataIdRequest,
      ru.tanpii.authpoint.user.UserDataResponse> getGetUserDataByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getUserDataById",
      requestType = ru.tanpii.authpoint.user.GetUserDataIdRequest.class,
      responseType = ru.tanpii.authpoint.user.UserDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ru.tanpii.authpoint.user.GetUserDataIdRequest,
      ru.tanpii.authpoint.user.UserDataResponse> getGetUserDataByIdMethod() {
    io.grpc.MethodDescriptor<ru.tanpii.authpoint.user.GetUserDataIdRequest, ru.tanpii.authpoint.user.UserDataResponse> getGetUserDataByIdMethod;
    if ((getGetUserDataByIdMethod = UserDataServiceGrpc.getGetUserDataByIdMethod) == null) {
      synchronized (UserDataServiceGrpc.class) {
        if ((getGetUserDataByIdMethod = UserDataServiceGrpc.getGetUserDataByIdMethod) == null) {
          UserDataServiceGrpc.getGetUserDataByIdMethod = getGetUserDataByIdMethod =
              io.grpc.MethodDescriptor.<ru.tanpii.authpoint.user.GetUserDataIdRequest, ru.tanpii.authpoint.user.UserDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getUserDataById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.tanpii.authpoint.user.GetUserDataIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.tanpii.authpoint.user.UserDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserDataServiceMethodDescriptorSupplier("getUserDataById"))
              .build();
        }
      }
    }
    return getGetUserDataByIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserDataServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserDataServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserDataServiceStub>() {
        @java.lang.Override
        public UserDataServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserDataServiceStub(channel, callOptions);
        }
      };
    return UserDataServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserDataServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserDataServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserDataServiceBlockingStub>() {
        @java.lang.Override
        public UserDataServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserDataServiceBlockingStub(channel, callOptions);
        }
      };
    return UserDataServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserDataServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserDataServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserDataServiceFutureStub>() {
        @java.lang.Override
        public UserDataServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserDataServiceFutureStub(channel, callOptions);
        }
      };
    return UserDataServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getUserDataByJwt(ru.tanpii.authpoint.user.GetUserDataJwtRequest request,
        io.grpc.stub.StreamObserver<ru.tanpii.authpoint.user.UserDataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserDataByJwtMethod(), responseObserver);
    }

    /**
     */
    default void getUserDataById(ru.tanpii.authpoint.user.GetUserDataIdRequest request,
        io.grpc.stub.StreamObserver<ru.tanpii.authpoint.user.UserDataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserDataByIdMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service UserDataService.
   */
  public static abstract class UserDataServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return UserDataServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service UserDataService.
   */
  public static final class UserDataServiceStub
      extends io.grpc.stub.AbstractAsyncStub<UserDataServiceStub> {
    private UserDataServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserDataServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserDataServiceStub(channel, callOptions);
    }

    /**
     */
    public void getUserDataByJwt(ru.tanpii.authpoint.user.GetUserDataJwtRequest request,
        io.grpc.stub.StreamObserver<ru.tanpii.authpoint.user.UserDataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserDataByJwtMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUserDataById(ru.tanpii.authpoint.user.GetUserDataIdRequest request,
        io.grpc.stub.StreamObserver<ru.tanpii.authpoint.user.UserDataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserDataByIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service UserDataService.
   */
  public static final class UserDataServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<UserDataServiceBlockingStub> {
    private UserDataServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserDataServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserDataServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ru.tanpii.authpoint.user.UserDataResponse getUserDataByJwt(ru.tanpii.authpoint.user.GetUserDataJwtRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserDataByJwtMethod(), getCallOptions(), request);
    }

    /**
     */
    public ru.tanpii.authpoint.user.UserDataResponse getUserDataById(ru.tanpii.authpoint.user.GetUserDataIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserDataByIdMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service UserDataService.
   */
  public static final class UserDataServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<UserDataServiceFutureStub> {
    private UserDataServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserDataServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserDataServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.tanpii.authpoint.user.UserDataResponse> getUserDataByJwt(
        ru.tanpii.authpoint.user.GetUserDataJwtRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserDataByJwtMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.tanpii.authpoint.user.UserDataResponse> getUserDataById(
        ru.tanpii.authpoint.user.GetUserDataIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserDataByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_USER_DATA_BY_JWT = 0;
  private static final int METHODID_GET_USER_DATA_BY_ID = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_USER_DATA_BY_JWT:
          serviceImpl.getUserDataByJwt((ru.tanpii.authpoint.user.GetUserDataJwtRequest) request,
              (io.grpc.stub.StreamObserver<ru.tanpii.authpoint.user.UserDataResponse>) responseObserver);
          break;
        case METHODID_GET_USER_DATA_BY_ID:
          serviceImpl.getUserDataById((ru.tanpii.authpoint.user.GetUserDataIdRequest) request,
              (io.grpc.stub.StreamObserver<ru.tanpii.authpoint.user.UserDataResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetUserDataByJwtMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ru.tanpii.authpoint.user.GetUserDataJwtRequest,
              ru.tanpii.authpoint.user.UserDataResponse>(
                service, METHODID_GET_USER_DATA_BY_JWT)))
        .addMethod(
          getGetUserDataByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ru.tanpii.authpoint.user.GetUserDataIdRequest,
              ru.tanpii.authpoint.user.UserDataResponse>(
                service, METHODID_GET_USER_DATA_BY_ID)))
        .build();
  }

  private static abstract class UserDataServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserDataServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ru.tanpii.authpoint.user.UserDataServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserDataService");
    }
  }

  private static final class UserDataServiceFileDescriptorSupplier
      extends UserDataServiceBaseDescriptorSupplier {
    UserDataServiceFileDescriptorSupplier() {}
  }

  private static final class UserDataServiceMethodDescriptorSupplier
      extends UserDataServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    UserDataServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (UserDataServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserDataServiceFileDescriptorSupplier())
              .addMethod(getGetUserDataByJwtMethod())
              .addMethod(getGetUserDataByIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
