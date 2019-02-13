package io.grpc.examples.chat3;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.17.1)",
    comments = "Source: chat3.proto")
public final class Chat3Grpc {

  private Chat3Grpc() {}

  public static final String SERVICE_NAME = "chat3.Chat3";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.chat3.HelloRequest,
      io.grpc.examples.chat3.HelloReply> getRegisterClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterClient",
      requestType = io.grpc.examples.chat3.HelloRequest.class,
      responseType = io.grpc.examples.chat3.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.examples.chat3.HelloRequest,
      io.grpc.examples.chat3.HelloReply> getRegisterClientMethod() {
    io.grpc.MethodDescriptor<io.grpc.examples.chat3.HelloRequest, io.grpc.examples.chat3.HelloReply> getRegisterClientMethod;
    if ((getRegisterClientMethod = Chat3Grpc.getRegisterClientMethod) == null) {
      synchronized (Chat3Grpc.class) {
        if ((getRegisterClientMethod = Chat3Grpc.getRegisterClientMethod) == null) {
          Chat3Grpc.getRegisterClientMethod = getRegisterClientMethod = 
              io.grpc.MethodDescriptor.<io.grpc.examples.chat3.HelloRequest, io.grpc.examples.chat3.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "chat3.Chat3", "RegisterClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.chat3.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.chat3.HelloReply.getDefaultInstance()))
                  .setSchemaDescriptor(new Chat3MethodDescriptorSupplier("RegisterClient"))
                  .build();
          }
        }
     }
     return getRegisterClientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.chat3.HelloRequest,
      io.grpc.examples.chat3.HelloReply> getSendMsgMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendMsg",
      requestType = io.grpc.examples.chat3.HelloRequest.class,
      responseType = io.grpc.examples.chat3.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<io.grpc.examples.chat3.HelloRequest,
      io.grpc.examples.chat3.HelloReply> getSendMsgMethod() {
    io.grpc.MethodDescriptor<io.grpc.examples.chat3.HelloRequest, io.grpc.examples.chat3.HelloReply> getSendMsgMethod;
    if ((getSendMsgMethod = Chat3Grpc.getSendMsgMethod) == null) {
      synchronized (Chat3Grpc.class) {
        if ((getSendMsgMethod = Chat3Grpc.getSendMsgMethod) == null) {
          Chat3Grpc.getSendMsgMethod = getSendMsgMethod = 
              io.grpc.MethodDescriptor.<io.grpc.examples.chat3.HelloRequest, io.grpc.examples.chat3.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "chat3.Chat3", "SendMsg"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.chat3.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.chat3.HelloReply.getDefaultInstance()))
                  .setSchemaDescriptor(new Chat3MethodDescriptorSupplier("SendMsg"))
                  .build();
          }
        }
     }
     return getSendMsgMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static Chat3Stub newStub(io.grpc.Channel channel) {
    return new Chat3Stub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static Chat3BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new Chat3BlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static Chat3FutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new Chat3FutureStub(channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class Chat3ImplBase implements io.grpc.BindableService {

    /**
     */
    public void registerClient(io.grpc.examples.chat3.HelloRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.chat3.HelloReply> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisterClientMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<io.grpc.examples.chat3.HelloRequest> sendMsg(
        io.grpc.stub.StreamObserver<io.grpc.examples.chat3.HelloReply> responseObserver) {
      return asyncUnimplementedStreamingCall(getSendMsgMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterClientMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.examples.chat3.HelloRequest,
                io.grpc.examples.chat3.HelloReply>(
                  this, METHODID_REGISTER_CLIENT)))
          .addMethod(
            getSendMsgMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                io.grpc.examples.chat3.HelloRequest,
                io.grpc.examples.chat3.HelloReply>(
                  this, METHODID_SEND_MSG)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class Chat3Stub extends io.grpc.stub.AbstractStub<Chat3Stub> {
    private Chat3Stub(io.grpc.Channel channel) {
      super(channel);
    }

    private Chat3Stub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Chat3Stub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Chat3Stub(channel, callOptions);
    }

    /**
     */
    public void registerClient(io.grpc.examples.chat3.HelloRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.chat3.HelloReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisterClientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<io.grpc.examples.chat3.HelloRequest> sendMsg(
        io.grpc.stub.StreamObserver<io.grpc.examples.chat3.HelloReply> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getSendMsgMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class Chat3BlockingStub extends io.grpc.stub.AbstractStub<Chat3BlockingStub> {
    private Chat3BlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private Chat3BlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Chat3BlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Chat3BlockingStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.examples.chat3.HelloReply registerClient(io.grpc.examples.chat3.HelloRequest request) {
      return blockingUnaryCall(
          getChannel(), getRegisterClientMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class Chat3FutureStub extends io.grpc.stub.AbstractStub<Chat3FutureStub> {
    private Chat3FutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private Chat3FutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Chat3FutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Chat3FutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.chat3.HelloReply> registerClient(
        io.grpc.examples.chat3.HelloRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisterClientMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_CLIENT = 0;
  private static final int METHODID_SEND_MSG = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final Chat3ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(Chat3ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER_CLIENT:
          serviceImpl.registerClient((io.grpc.examples.chat3.HelloRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.chat3.HelloReply>) responseObserver);
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
        case METHODID_SEND_MSG:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sendMsg(
              (io.grpc.stub.StreamObserver<io.grpc.examples.chat3.HelloReply>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class Chat3BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    Chat3BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.grpc.examples.chat3.Chat3Proto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Chat3");
    }
  }

  private static final class Chat3FileDescriptorSupplier
      extends Chat3BaseDescriptorSupplier {
    Chat3FileDescriptorSupplier() {}
  }

  private static final class Chat3MethodDescriptorSupplier
      extends Chat3BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    Chat3MethodDescriptorSupplier(String methodName) {
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
      synchronized (Chat3Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new Chat3FileDescriptorSupplier())
              .addMethod(getRegisterClientMethod())
              .addMethod(getSendMsgMethod())
              .build();
        }
      }
    }
    return result;
  }
}
