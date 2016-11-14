// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: log_memory.proto

package org.tensorflow.framework;

public interface MemoryLogTensorOutputOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.MemoryLogTensorOutput)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Process-unique step id.
   * </pre>
   *
   * <code>optional int64 step_id = 1;</code>
   */
  long getStepId();

  /**
   * <pre>
   * Name of the kernel producing an output as set in GraphDef, e.g.,
   * "affine2/weights/Assign".
   * </pre>
   *
   * <code>optional string kernel_name = 2;</code>
   */
  String getKernelName();
  /**
   * <pre>
   * Name of the kernel producing an output as set in GraphDef, e.g.,
   * "affine2/weights/Assign".
   * </pre>
   *
   * <code>optional string kernel_name = 2;</code>
   */
  com.google.protobuf.ByteString
      getKernelNameBytes();

  /**
   * <pre>
   * Index of the output being set.
   * </pre>
   *
   * <code>optional int32 index = 3;</code>
   */
  int getIndex();

  /**
   * <pre>
   * Output tensor details.
   * </pre>
   *
   * <code>optional .tensorflow.TensorDescription tensor = 4;</code>
   */
  boolean hasTensor();
  /**
   * <pre>
   * Output tensor details.
   * </pre>
   *
   * <code>optional .tensorflow.TensorDescription tensor = 4;</code>
   */
  org.tensorflow.framework.TensorDescription getTensor();
  /**
   * <pre>
   * Output tensor details.
   * </pre>
   *
   * <code>optional .tensorflow.TensorDescription tensor = 4;</code>
   */
  org.tensorflow.framework.TensorDescriptionOrBuilder getTensorOrBuilder();
}