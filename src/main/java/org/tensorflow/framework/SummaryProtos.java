// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: summary.proto

package org.tensorflow.framework;

public final class SummaryProtos {
  private SummaryProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_SummaryDescription_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_SummaryDescription_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_HistogramProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_HistogramProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_Summary_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_Summary_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_Summary_Image_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_Summary_Image_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_Summary_Audio_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_Summary_Audio_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_Summary_Value_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_Summary_Value_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\rsummary.proto\022\ntensorflow\032\014tensor.prot" +
      "o\"\'\n\022SummaryDescription\022\021\n\ttype_hint\030\001 \001" +
      "(\t\"\207\001\n\016HistogramProto\022\013\n\003min\030\001 \001(\001\022\013\n\003ma" +
      "x\030\002 \001(\001\022\013\n\003num\030\003 \001(\001\022\013\n\003sum\030\004 \001(\001\022\023\n\013sum" +
      "_squares\030\005 \001(\001\022\030\n\014bucket_limit\030\006 \003(\001B\002\020\001" +
      "\022\022\n\006bucket\030\007 \003(\001B\002\020\001\"\257\004\n\007Summary\022(\n\005valu" +
      "e\030\001 \003(\0132\031.tensorflow.Summary.Value\032X\n\005Im" +
      "age\022\016\n\006height\030\001 \001(\005\022\r\n\005width\030\002 \001(\005\022\022\n\nco" +
      "lorspace\030\003 \001(\005\022\034\n\024encoded_image_string\030\004" +
      " \001(\014\032}\n\005Audio\022\023\n\013sample_rate\030\001 \001(\002\022\024\n\014nu",
      "m_channels\030\002 \001(\003\022\025\n\rlength_frames\030\003 \001(\003\022" +
      "\034\n\024encoded_audio_string\030\004 \001(\014\022\024\n\014content" +
      "_type\030\005 \001(\t\032\240\002\n\005Value\022\021\n\tnode_name\030\007 \001(\t" +
      "\022\013\n\003tag\030\001 \001(\t\022\026\n\014simple_value\030\002 \001(\002H\000\022&\n" +
      "\034obsolete_old_style_histogram\030\003 \001(\014H\000\022*\n" +
      "\005image\030\004 \001(\0132\031.tensorflow.Summary.ImageH" +
      "\000\022+\n\005histo\030\005 \001(\0132\032.tensorflow.HistogramP" +
      "rotoH\000\022*\n\005audio\030\006 \001(\0132\031.tensorflow.Summa" +
      "ry.AudioH\000\022)\n\006tensor\030\010 \001(\0132\027.tensorflow." +
      "TensorProtoH\000B\007\n\005valueB.\n\030org.tensorflow",
      ".frameworkB\rSummaryProtosP\001\370\001\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.tensorflow.framework.TensorProtos.getDescriptor(),
        }, assigner);
    internal_static_tensorflow_SummaryDescription_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tensorflow_SummaryDescription_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_SummaryDescription_descriptor,
        new String[] { "TypeHint", });
    internal_static_tensorflow_HistogramProto_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_tensorflow_HistogramProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_HistogramProto_descriptor,
        new String[] { "Min", "Max", "Num", "Sum", "SumSquares", "BucketLimit", "Bucket", });
    internal_static_tensorflow_Summary_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_tensorflow_Summary_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_Summary_descriptor,
        new String[] { "Value", });
    internal_static_tensorflow_Summary_Image_descriptor =
      internal_static_tensorflow_Summary_descriptor.getNestedTypes().get(0);
    internal_static_tensorflow_Summary_Image_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_Summary_Image_descriptor,
        new String[] { "Height", "Width", "Colorspace", "EncodedImageString", });
    internal_static_tensorflow_Summary_Audio_descriptor =
      internal_static_tensorflow_Summary_descriptor.getNestedTypes().get(1);
    internal_static_tensorflow_Summary_Audio_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_Summary_Audio_descriptor,
        new String[] { "SampleRate", "NumChannels", "LengthFrames", "EncodedAudioString", "ContentType", });
    internal_static_tensorflow_Summary_Value_descriptor =
      internal_static_tensorflow_Summary_descriptor.getNestedTypes().get(2);
    internal_static_tensorflow_Summary_Value_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_Summary_Value_descriptor,
        new String[] { "NodeName", "Tag", "SimpleValue", "ObsoleteOldStyleHistogram", "Image", "Histo", "Audio", "Tensor", "Value", });
    org.tensorflow.framework.TensorProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
