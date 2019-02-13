package io.grpc.examples.chat;

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
    comments = "Source: chat.proto")
public final class ChatGrpc {

  private ChatGrpc() {}

  public static final String SERVICE_NAME = "chat.Chat";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.chat.HelloRequest,
      io.grpc.examples.chat.HelloReply> getRegisterClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterClient",
      requestType = io.grpc.examples.chat.HelloRequest.class,
      responseType = io.grpc.examples.chat.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.examples.chat.HelloRequest,
      io.grpc.examples.chat.HelloReply> getRegisterClientMethod() {
    io.grpc.MethodDescriptor<io.grpc.examples.chat.HelloRequest, io.grpc.examples.chat.HelloReply> getRegisterClientMethod;
    if ((getRegisterClientMethod = ChatGrpc.getRegisterClientMethod) == null) {
      synchronized (ChatGrpc.class) {
        if ((getRegisterClientMethod = ChatGrpc.getRegisterClientMethod) == null) {
          ChatGrpc.getRegisterClientMethod = getRegisterClientMethod = 
              io.grpc.MethodDescriptor.<io.grpc.examples.chat.HelloRequest, io.grpc.examples.chat.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "chat.Chat", "RegisterClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.chat.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.chat.HelloReply.getDefaultInstance()))
                  .setSchemaDescriptor(new ChatMethodDescriptorSupplier("RegisterClient"))
                  .build();
          }
        }
     }
     return getRegisterClientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.chat.HelloRequest,
      io.grpc.examples.chat.HelloReply> getSendMsgMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendMsg",
      requestType = io.grpc.examples.chat.HelloRequest.class,
      responseType = io.grpc.examples.chat.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<io.grpc.examples.chat.HelloRequest,
      io.grpc.examples.chat.HelloReply> getSendMsgMethod() {
    io.grpc.MethodDescriptor<io.grpc.examples.chat.HelloRequest, io.grpc.examples.chat.HelloReply> getSendMsgMethod;
    if ((getSendMsgMethod = ChatGrpc.getSendMsgMethod) == null) {
      synchronized (ChatGrpc.class) {
        if ((getSendMsgMethod = ChatGrpc.getSendMsgMethod) == null) {
          ChatGrpc.getSendMsgMethod = getSendMsgMethod = 
              io.grpc.MethodDescriptor.<io.grpc.examples.chat.HelloRequest, io.grpc.examples.chat.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "chat.Chat", "SendMsg"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.chat.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.chat.HelloReply.getDefaultInstance()))
                  .setSchemaDescriptor(new ChatMethodDescriptorSupplier("SendMsg"))
                  .build();
          }
        }
     }
     return getSendMsgMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ChatStub newStub(io.grpc.Channel channel) {
    return new ChatStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ChatBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ChatBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ChatFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ChatFutureStub(channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class ChatImplBase implements io.grpc.BindableService {

    /**
     */
    public void registerClient(io.grpc.examples.chat.HelloRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.chat.HelloReply> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisterClientMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<io.grpc.examples.chat.HelloRequest> sendMsg(
        io.grpc.stub.StreamObserver<io.grpc.examples.chat.HelloReply> responseObserver) {
      return asyncUnimplementedStreamingCall(getSendMsgMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterClientMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.examples.chat.HelloRequest,
                io.grpc.examples.chat.HelloReply>(
                  this, METHODID_REGISTER_CLIENT)))
          .addMethod(
            getSendMsgMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                io.grpc.examples.chat.HelloRequest,
                io.grpc.examples.chat.HelloReply>(
                  this, METHODID_SEND_MSG)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class ChatStub extends io.grpc.stub.AbstractStub<ChatStub> {
    private ChatStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChatStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChatStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChatStub(channel, callOptions);
    }

    /**
     */
    public void registerClient(io.grpc.examples.chat.HelloRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.chat.HelloReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisterClientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<io.grpc.examples.chat.HelloRequest> sendMsg(
        io.grpc.stub.StreamObserver<io.grpc.examples.chat.HelloReply> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getSendMsgMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class ChatBlockingStub extends io.grpc.stub.AbstractStub<ChatBlockingStub> {
    private ChatBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChatBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChatBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChatBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.examples.chat.HelloReply registerClient(io.grpc.examples.chat.HelloRequest request) {
      return blockingUnaryCall(
          getChannel(), getRegisterClientMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class ChatFutureStub extends io.grpc.stub.AbstractStub<ChatFutureStub> {
    private ChatFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChatFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChatFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChatFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.chat.HelloReply> registerClient(
        io.grpc.examples.chat.HelloRequest request) {
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
    private final ChatImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ChatImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER_CLIENT:
          serviceImpl.registerClient((io.grpc.examples.chat.HelloRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.chat.HelloReply>) responseObserver);
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
              (io.grpc.stub.StreamObserver<io.grpc.examples.chat.HelloReply>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ChatBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ChatBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.grpc.examples.chat.ChatProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Chat");
    }
  }

  private static final class ChatFileDescriptorSupplier
      extends ChatBaseDescriptorSupplier {
    ChatFileDescriptorSupplier() {}
  }

  private static final class ChatMethodDescriptorSupplier
      extends ChatBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ChatMethodDescriptorSupplier(String methodName) {
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
      synchronized (ChatGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ChatFileDescriptorSupplier())
              .addMethod(getRegisterClientMethod())
              .addMethod(getSendMsgMethod())
              .build();
        }
      }
    }
    return result;
  }
}
