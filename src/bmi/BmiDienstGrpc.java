package bmi;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 **
 * Dienstdefinition für die BMI-Berechnung
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.70.0)",
    comments = "Source: bmi_berechnung.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BmiDienstGrpc {

  private BmiDienstGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bmi.BmiDienst";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<bmi.BmiBerechnung.BmiEingabe,
      bmi.BmiBerechnung.BmiErgebnis> getBerechneBmiMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BerechneBmi",
      requestType = bmi.BmiBerechnung.BmiEingabe.class,
      responseType = bmi.BmiBerechnung.BmiErgebnis.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bmi.BmiBerechnung.BmiEingabe,
      bmi.BmiBerechnung.BmiErgebnis> getBerechneBmiMethod() {
    io.grpc.MethodDescriptor<bmi.BmiBerechnung.BmiEingabe, bmi.BmiBerechnung.BmiErgebnis> getBerechneBmiMethod;
    if ((getBerechneBmiMethod = BmiDienstGrpc.getBerechneBmiMethod) == null) {
      synchronized (BmiDienstGrpc.class) {
        if ((getBerechneBmiMethod = BmiDienstGrpc.getBerechneBmiMethod) == null) {
          BmiDienstGrpc.getBerechneBmiMethod = getBerechneBmiMethod =
              io.grpc.MethodDescriptor.<bmi.BmiBerechnung.BmiEingabe, bmi.BmiBerechnung.BmiErgebnis>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BerechneBmi"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bmi.BmiBerechnung.BmiEingabe.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bmi.BmiBerechnung.BmiErgebnis.getDefaultInstance()))
              .setSchemaDescriptor(new BmiDienstMethodDescriptorSupplier("BerechneBmi"))
              .build();
        }
      }
    }
    return getBerechneBmiMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BmiDienstStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BmiDienstStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BmiDienstStub>() {
        @java.lang.Override
        public BmiDienstStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BmiDienstStub(channel, callOptions);
        }
      };
    return BmiDienstStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static BmiDienstBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BmiDienstBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BmiDienstBlockingV2Stub>() {
        @java.lang.Override
        public BmiDienstBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BmiDienstBlockingV2Stub(channel, callOptions);
        }
      };
    return BmiDienstBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BmiDienstBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BmiDienstBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BmiDienstBlockingStub>() {
        @java.lang.Override
        public BmiDienstBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BmiDienstBlockingStub(channel, callOptions);
        }
      };
    return BmiDienstBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BmiDienstFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BmiDienstFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BmiDienstFutureStub>() {
        @java.lang.Override
        public BmiDienstFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BmiDienstFutureStub(channel, callOptions);
        }
      };
    return BmiDienstFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   **
   * Dienstdefinition für die BMI-Berechnung
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void berechneBmi(bmi.BmiBerechnung.BmiEingabe request,
        io.grpc.stub.StreamObserver<bmi.BmiBerechnung.BmiErgebnis> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBerechneBmiMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service BmiDienst.
   * <pre>
   **
   * Dienstdefinition für die BMI-Berechnung
   * </pre>
   */
  public static abstract class BmiDienstImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return BmiDienstGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service BmiDienst.
   * <pre>
   **
   * Dienstdefinition für die BMI-Berechnung
   * </pre>
   */
  public static final class BmiDienstStub
      extends io.grpc.stub.AbstractAsyncStub<BmiDienstStub> {
    private BmiDienstStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BmiDienstStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BmiDienstStub(channel, callOptions);
    }

    /**
     */
    public void berechneBmi(bmi.BmiBerechnung.BmiEingabe request,
        io.grpc.stub.StreamObserver<bmi.BmiBerechnung.BmiErgebnis> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBerechneBmiMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service BmiDienst.
   * <pre>
   **
   * Dienstdefinition für die BMI-Berechnung
   * </pre>
   */
  public static final class BmiDienstBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<BmiDienstBlockingV2Stub> {
    private BmiDienstBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BmiDienstBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BmiDienstBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public bmi.BmiBerechnung.BmiErgebnis berechneBmi(bmi.BmiBerechnung.BmiEingabe request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBerechneBmiMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service BmiDienst.
   * <pre>
   **
   * Dienstdefinition für die BMI-Berechnung
   * </pre>
   */
  public static final class BmiDienstBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<BmiDienstBlockingStub> {
    private BmiDienstBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BmiDienstBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BmiDienstBlockingStub(channel, callOptions);
    }

    /**
     */
    public bmi.BmiBerechnung.BmiErgebnis berechneBmi(bmi.BmiBerechnung.BmiEingabe request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBerechneBmiMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service BmiDienst.
   * <pre>
   **
   * Dienstdefinition für die BMI-Berechnung
   * </pre>
   */
  public static final class BmiDienstFutureStub
      extends io.grpc.stub.AbstractFutureStub<BmiDienstFutureStub> {
    private BmiDienstFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BmiDienstFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BmiDienstFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bmi.BmiBerechnung.BmiErgebnis> berechneBmi(
        bmi.BmiBerechnung.BmiEingabe request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBerechneBmiMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_BERECHNE_BMI = 0;

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
        case METHODID_BERECHNE_BMI:
          serviceImpl.berechneBmi((bmi.BmiBerechnung.BmiEingabe) request,
              (io.grpc.stub.StreamObserver<bmi.BmiBerechnung.BmiErgebnis>) responseObserver);
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
          getBerechneBmiMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bmi.BmiBerechnung.BmiEingabe,
              bmi.BmiBerechnung.BmiErgebnis>(
                service, METHODID_BERECHNE_BMI)))
        .build();
  }

  private static abstract class BmiDienstBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BmiDienstBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bmi.BmiBerechnung.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BmiDienst");
    }
  }

  private static final class BmiDienstFileDescriptorSupplier
      extends BmiDienstBaseDescriptorSupplier {
    BmiDienstFileDescriptorSupplier() {}
  }

  private static final class BmiDienstMethodDescriptorSupplier
      extends BmiDienstBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    BmiDienstMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (BmiDienstGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BmiDienstFileDescriptorSupplier())
              .addMethod(getBerechneBmiMethod())
              .build();
        }
      }
    }
    return result;
  }
}
