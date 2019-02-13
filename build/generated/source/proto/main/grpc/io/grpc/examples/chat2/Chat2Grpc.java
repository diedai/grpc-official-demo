package io.grpc.examples.chat2;

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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.17.1)",
    comments = "Source: char2.proto")
public final class Chat2Grpc {

  private Chat2Grpc() {}

  public static final String SERVICE_NAME = "chat2.Chat2";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.chat2.Char2.mName,
      io.grpc.examples.chat2.Char2.mString> getCreateNicknameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createNickname",
      requestType = io.grpc.examples.chat2.Char2.mName.class,
      responseType = io.grpc.examples.chat2.Char2.mString.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.examples.chat2.Char2.mName,
      io.grpc.examples.chat2.Char2.mString> getCreateNicknameMethod() {
    io.grpc.MethodDescriptor<io.grpc.examples.chat2.Char2.mName, io.grpc.examples.chat2.Char2.mString> getCreateNicknameMethod;
    if ((getCreateNicknameMethod = Chat2Grpc.getCreateNicknameMethod) == null) {
      synchronized (Chat2Grpc.class) {
        if ((getCreateNicknameMethod = Chat2Grpc.getCreateNicknameMethod) == null) {
          Chat2Grpc.getCreateNicknameMethod = getCreateNicknameMethod = 
              io.grpc.MethodDescriptor.<io.grpc.examples.chat2.Char2.mName, io.grpc.examples.chat2.Char2.mString>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "chat2.Chat2", "createNickname"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.chat2.Char2.mName.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.chat2.Char2.mString.getDefaultInstance()))
                  .setSchemaDescriptor(new Chat2MethodDescriptorSupplier("createNickname"))
                  .build();
          }
        }
     }
     return getCreateNicknameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.chat2.Char2.mNameChannel,
      io.grpc.examples.chat2.Char2.mBoolean> getJoinChannelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "joinChannel",
      requestType = io.grpc.examples.chat2.Char2.mNameChannel.class,
      responseType = io.grpc.examples.chat2.Char2.mBoolean.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.examples.chat2.Char2.mNameChannel,
      io.grpc.examples.chat2.Char2.mBoolean> getJoinChannelMethod() {
    io.grpc.MethodDescriptor<io.grpc.examples.chat2.Char2.mNameChannel, io.grpc.examples.chat2.Char2.mBoolean> getJoinChannelMethod;
    if ((getJoinChannelMethod = Chat2Grpc.getJoinChannelMethod) == null) {
      synchronized (Chat2Grpc.class) {
        if ((getJoinChannelMethod = Chat2Grpc.getJoinChannelMethod) == null) {
          Chat2Grpc.getJoinChannelMethod = getJoinChannelMethod = 
              io.grpc.MethodDescriptor.<io.grpc.examples.chat2.Char2.mNameChannel, io.grpc.examples.chat2.Char2.mBoolean>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "chat2.Chat2", "joinChannel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.chat2.Char2.mNameChannel.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.chat2.Char2.mBoolean.getDefaultInstance()))
                  .setSchemaDescriptor(new Chat2MethodDescriptorSupplier("joinChannel"))
                  .build();
          }
        }
     }
     return getJoinChannelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.chat2.Char2.mNameChannel,
      io.grpc.examples.chat2.Char2.mBoolean> getLeaveChannelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "leaveChannel",
      requestType = io.grpc.examples.chat2.Char2.mNameChannel.class,
      responseType = io.grpc.examples.chat2.Char2.mBoolean.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.examples.chat2.Char2.mNameChannel,
      io.grpc.examples.chat2.Char2.mBoolean> getLeaveChannelMethod() {
    io.grpc.MethodDescriptor<io.grpc.examples.chat2.Char2.mNameChannel, io.grpc.examples.chat2.Char2.mBoolean> getLeaveChannelMethod;
    if ((getLeaveChannelMethod = Chat2Grpc.getLeaveChannelMethod) == null) {
      synchronized (Chat2Grpc.class) {
        if ((getLeaveChannelMethod = Chat2Grpc.getLeaveChannelMethod) == null) {
          Chat2Grpc.getLeaveChannelMethod = getLeaveChannelMethod = 
              io.grpc.MethodDescriptor.<io.grpc.examples.chat2.Char2.mNameChannel, io.grpc.examples.chat2.Char2.mBoolean>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "chat2.Chat2", "leaveChannel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.chat2.Char2.mNameChannel.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.chat2.Char2.mBoolean.getDefaultInstance()))
                  .setSchemaDescriptor(new Chat2MethodDescriptorSupplier("leaveChannel"))
                  .build();
          }
        }
     }
     return getLeaveChannelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.chat2.Char2.mNameChannelMsg,
      io.grpc.examples.chat2.Char2.mBoolean> getSendMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendMessage",
      requestType = io.grpc.examples.chat2.Char2.mNameChannelMsg.class,
      responseType = io.grpc.examples.chat2.Char2.mBoolean.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.examples.chat2.Char2.mNameChannelMsg,
      io.grpc.examples.chat2.Char2.mBoolean> getSendMessageMethod() {
    io.grpc.MethodDescriptor<io.grpc.examples.chat2.Char2.mNameChannelMsg, io.grpc.examples.chat2.Char2.mBoolean> getSendMessageMethod;
    if ((getSendMessageMethod = Chat2Grpc.getSendMessageMethod) == null) {
      synchronized (Chat2Grpc.class) {
        if ((getSendMessageMethod = Chat2Grpc.getSendMessageMethod) == null) {
          Chat2Grpc.getSendMessageMethod = getSendMessageMethod = 
              io.grpc.MethodDescriptor.<io.grpc.examples.chat2.Char2.mNameChannelMsg, io.grpc.examples.chat2.Char2.mBoolean>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "chat2.Chat2", "sendMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.chat2.Char2.mNameChannelMsg.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.chat2.Char2.mBoolean.getDefaultInstance()))
                  .setSchemaDescriptor(new Chat2MethodDescriptorSupplier("sendMessage"))
                  .build();
          }
        }
     }
     return getSendMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.chat2.Char2.mName,
      io.grpc.examples.chat2.Char2.mString> getGetMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getMessage",
      requestType = io.grpc.examples.chat2.Char2.mName.class,
      responseType = io.grpc.examples.chat2.Char2.mString.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.examples.chat2.Char2.mName,
      io.grpc.examples.chat2.Char2.mString> getGetMessageMethod() {
    io.grpc.MethodDescriptor<io.grpc.examples.chat2.Char2.mName, io.grpc.examples.chat2.Char2.mString> getGetMessageMethod;
    if ((getGetMessageMethod = Chat2Grpc.getGetMessageMethod) == null) {
      synchronized (Chat2Grpc.class) {
        if ((getGetMessageMethod = Chat2Grpc.getGetMessageMethod) == null) {
          Chat2Grpc.getGetMessageMethod = getGetMessageMethod = 
              io.grpc.MethodDescriptor.<io.grpc.examples.chat2.Char2.mName, io.grpc.examples.chat2.Char2.mString>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "chat2.Chat2", "getMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.chat2.Char2.mName.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.chat2.Char2.mString.getDefaultInstance()))
                  .setSchemaDescriptor(new Chat2MethodDescriptorSupplier("getMessage"))
                  .build();
          }
        }
     }
     return getGetMessageMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static Chat2Stub newStub(io.grpc.Channel channel) {
    return new Chat2Stub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static Chat2BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new Chat2BlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static Chat2FutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new Chat2FutureStub(channel);
  }

  /**
   */
  public static abstract class Chat2ImplBase implements io.grpc.BindableService {

    /**
     */
    public void createNickname(io.grpc.examples.chat2.Char2.mName request,
        io.grpc.stub.StreamObserver<io.grpc.examples.chat2.Char2.mString> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateNicknameMethod(), responseObserver);
    }

    /**
     */
    public void joinChannel(io.grpc.examples.chat2.Char2.mNameChannel request,
        io.grpc.stub.StreamObserver<io.grpc.examples.chat2.Char2.mBoolean> responseObserver) {
      asyncUnimplementedUnaryCall(getJoinChannelMethod(), responseObserver);
    }

    /**
     */
    public void leaveChannel(io.grpc.examples.chat2.Char2.mNameChannel request,
        io.grpc.stub.StreamObserver<io.grpc.examples.chat2.Char2.mBoolean> responseObserver) {
      asyncUnimplementedUnaryCall(getLeaveChannelMethod(), responseObserver);
    }

    /**
     */
    public void sendMessage(io.grpc.examples.chat2.Char2.mNameChannelMsg request,
        io.grpc.stub.StreamObserver<io.grpc.examples.chat2.Char2.mBoolean> responseObserver) {
      asyncUnimplementedUnaryCall(getSendMessageMethod(), responseObserver);
    }

    /**
     */
    public void getMessage(io.grpc.examples.chat2.Char2.mName request,
        io.grpc.stub.StreamObserver<io.grpc.examples.chat2.Char2.mString> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMessageMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateNicknameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.examples.chat2.Char2.mName,
                io.grpc.examples.chat2.Char2.mString>(
                  this, METHODID_CREATE_NICKNAME)))
          .addMethod(
            getJoinChannelMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.examples.chat2.Char2.mNameChannel,
                io.grpc.examples.chat2.Char2.mBoolean>(
                  this, METHODID_JOIN_CHANNEL)))
          .addMethod(
            getLeaveChannelMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.examples.chat2.Char2.mNameChannel,
                io.grpc.examples.chat2.Char2.mBoolean>(
                  this, METHODID_LEAVE_CHANNEL)))
          .addMethod(
            getSendMessageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.examples.chat2.Char2.mNameChannelMsg,
                io.grpc.examples.chat2.Char2.mBoolean>(
                  this, METHODID_SEND_MESSAGE)))
          .addMethod(
            getGetMessageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.examples.chat2.Char2.mName,
                io.grpc.examples.chat2.Char2.mString>(
                  this, METHODID_GET_MESSAGE)))
          .build();
    }
  }

  /**
   */
  public static final class Chat2Stub extends io.grpc.stub.AbstractStub<Chat2Stub> {
    private Chat2Stub(io.grpc.Channel channel) {
      super(channel);
    }

    private Chat2Stub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Chat2Stub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Chat2Stub(channel, callOptions);
    }

    /**
     */
    public void createNickname(io.grpc.examples.chat2.Char2.mName request,
        io.grpc.stub.StreamObserver<io.grpc.examples.chat2.Char2.mString> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateNicknameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void joinChannel(io.grpc.examples.chat2.Char2.mNameChannel request,
        io.grpc.stub.StreamObserver<io.grpc.examples.chat2.Char2.mBoolean> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getJoinChannelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void leaveChannel(io.grpc.examples.chat2.Char2.mNameChannel request,
        io.grpc.stub.StreamObserver<io.grpc.examples.chat2.Char2.mBoolean> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLeaveChannelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendMessage(io.grpc.examples.chat2.Char2.mNameChannelMsg request,
        io.grpc.stub.StreamObserver<io.grpc.examples.chat2.Char2.mBoolean> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMessage(io.grpc.examples.chat2.Char2.mName request,
        io.grpc.stub.StreamObserver<io.grpc.examples.chat2.Char2.mString> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMessageMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class Chat2BlockingStub extends io.grpc.stub.AbstractStub<Chat2BlockingStub> {
    private Chat2BlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private Chat2BlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Chat2BlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Chat2BlockingStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.examples.chat2.Char2.mString createNickname(io.grpc.examples.chat2.Char2.mName request) {
      return blockingUnaryCall(
          getChannel(), getCreateNicknameMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.examples.chat2.Char2.mBoolean joinChannel(io.grpc.examples.chat2.Char2.mNameChannel request) {
      return blockingUnaryCall(
          getChannel(), getJoinChannelMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.examples.chat2.Char2.mBoolean leaveChannel(io.grpc.examples.chat2.Char2.mNameChannel request) {
      return blockingUnaryCall(
          getChannel(), getLeaveChannelMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.examples.chat2.Char2.mBoolean sendMessage(io.grpc.examples.chat2.Char2.mNameChannelMsg request) {
      return blockingUnaryCall(
          getChannel(), getSendMessageMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.examples.chat2.Char2.mString getMessage(io.grpc.examples.chat2.Char2.mName request) {
      return blockingUnaryCall(
          getChannel(), getGetMessageMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class Chat2FutureStub extends io.grpc.stub.AbstractStub<Chat2FutureStub> {
    private Chat2FutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private Chat2FutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Chat2FutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Chat2FutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.chat2.Char2.mString> createNickname(
        io.grpc.examples.chat2.Char2.mName request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateNicknameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.chat2.Char2.mBoolean> joinChannel(
        io.grpc.examples.chat2.Char2.mNameChannel request) {
      return futureUnaryCall(
          getChannel().newCall(getJoinChannelMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.chat2.Char2.mBoolean> leaveChannel(
        io.grpc.examples.chat2.Char2.mNameChannel request) {
      return futureUnaryCall(
          getChannel().newCall(getLeaveChannelMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.chat2.Char2.mBoolean> sendMessage(
        io.grpc.examples.chat2.Char2.mNameChannelMsg request) {
      return futureUnaryCall(
          getChannel().newCall(getSendMessageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.chat2.Char2.mString> getMessage(
        io.grpc.examples.chat2.Char2.mName request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMessageMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_NICKNAME = 0;
  private static final int METHODID_JOIN_CHANNEL = 1;
  private static final int METHODID_LEAVE_CHANNEL = 2;
  private static final int METHODID_SEND_MESSAGE = 3;
  private static final int METHODID_GET_MESSAGE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final Chat2ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(Chat2ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_NICKNAME:
          serviceImpl.createNickname((io.grpc.examples.chat2.Char2.mName) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.chat2.Char2.mString>) responseObserver);
          break;
        case METHODID_JOIN_CHANNEL:
          serviceImpl.joinChannel((io.grpc.examples.chat2.Char2.mNameChannel) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.chat2.Char2.mBoolean>) responseObserver);
          break;
        case METHODID_LEAVE_CHANNEL:
          serviceImpl.leaveChannel((io.grpc.examples.chat2.Char2.mNameChannel) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.chat2.Char2.mBoolean>) responseObserver);
          break;
        case METHODID_SEND_MESSAGE:
          serviceImpl.sendMessage((io.grpc.examples.chat2.Char2.mNameChannelMsg) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.chat2.Char2.mBoolean>) responseObserver);
          break;
        case METHODID_GET_MESSAGE:
          serviceImpl.getMessage((io.grpc.examples.chat2.Char2.mName) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.chat2.Char2.mString>) responseObserver);
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

  private static abstract class Chat2BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    Chat2BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.grpc.examples.chat2.Char2.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Chat2");
    }
  }

  private static final class Chat2FileDescriptorSupplier
      extends Chat2BaseDescriptorSupplier {
    Chat2FileDescriptorSupplier() {}
  }

  private static final class Chat2MethodDescriptorSupplier
      extends Chat2BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    Chat2MethodDescriptorSupplier(String methodName) {
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
      synchronized (Chat2Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new Chat2FileDescriptorSupplier())
              .addMethod(getCreateNicknameMethod())
              .addMethod(getJoinChannelMethod())
              .addMethod(getLeaveChannelMethod())
              .addMethod(getSendMessageMethod())
              .addMethod(getGetMessageMethod())
              .build();
        }
      }
    }
    return result;
  }
}
