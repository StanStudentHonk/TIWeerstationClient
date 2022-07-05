// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/weatherRequest.proto

package proto.weather;

public final class WeatherRequest {
  private WeatherRequest() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ProtoWeatherDataPoint_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ProtoWeatherDataPoint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ProtoWeatherStation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ProtoWeatherStation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ProtoWeatherData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ProtoWeatherData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ProtoWeatherDataResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ProtoWeatherDataResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ProtoSavedReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ProtoSavedReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ProtoWeatherDataRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ProtoWeatherDataRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ProtoTimeBlock_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ProtoTimeBlock_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032proto/weatherRequest.proto\032\037google/pro" +
      "tobuf/timestamp.proto\"\221\003\n\025ProtoWeatherDa" +
      "taPoint\022\024\n\014avgWindSpeed\030\001 \001(\005\022\021\n\tbaromet" +
      "er\030\002 \001(\005\022\021\n\tbattLevel\030\003 \001(\005\022\021\n\tinsideHum" +
      "\030\004 \001(\005\022\022\n\ninsideTemp\030\005 \001(\005\022\022\n\noutsideHum" +
      "\030\006 \001(\005\022\023\n\013outsideTemp\030\007 \001(\005\022\020\n\010rainRate\030" +
      "\010 \001(\005\022\020\n\010solarRad\030\t \001(\005\022%\n\007station\030\n \001(\013" +
      "2\024.ProtoWeatherStation\022\017\n\007sunrise\030\013 \001(\005\022" +
      "\016\n\006sunset\030\014 \001(\005\022-\n\ttimestamp\030\r \001(\0132\032.goo" +
      "gle.protobuf.Timestamp\022\n\n\002ts\030\016 \001(\005\022\017\n\007UV" +
      "Level\030\017 \001(\005\022\021\n\twindSpeed\030\020 \001(\005\022\017\n\007windDi" +
      "r\030\021 \001(\005\022\020\n\010xmitBatt\030\022 \001(\005\"]\n\023ProtoWeathe" +
      "rStation\022\021\n\tstationId\030\001 \001(\005\022\014\n\004name\030\002 \001(" +
      "\t\022\020\n\010location\030\003 \001(\t\022\023\n\013description\030\004 \001(\t" +
      "\"E\n\020ProtoWeatherData\0221\n\021WeatherDataPoint" +
      "s\030\001 \003(\0132\026.ProtoWeatherDataPoint\"a\n\030Proto" +
      "WeatherDataResponse\0221\n\021WeatherDataPoints" +
      "\030\001 \003(\0132\026.ProtoWeatherDataPoint\022\022\n\nstatus" +
      "Code\030\002 \001(\005\"6\n\017ProtoSavedReply\022\017\n\007message" +
      "\030\001 \001(\t\022\022\n\nstatusCode\030\002 \001(\005\"?\n\027ProtoWeath" +
      "erDataRequest\022\020\n\010timeunit\030\001 \001(\t\022\022\n\ntimeA" +
      "mount\030\002 \001(\005\"l\n\016ProtoTimeBlock\022-\n\ttimeSta" +
      "rt\030\001 \001(\0132\032.google.protobuf.Timestamp\022+\n\007" +
      "timeEnd\030\002 \001(\0132\032.google.protobuf.Timestam" +
      "p2\343\002\n\013WeatherData\0226\n\017SaveWeatherData\022\021.P" +
      "rotoWeatherData\032\020.ProtoSavedReply\022E\n\016Get" +
      "WeatherData\022\030.ProtoWeatherDataRequest\032\031." +
      "ProtoWeatherDataResponse\022D\n\020GetLastDataP" +
      "oint\022\030.ProtoWeatherDataRequest\032\026.ProtoWe" +
      "atherDataPoint\022C\n\025GetWeatherDataBetween\022" +
      "\017.ProtoTimeBlock\032\031.ProtoWeatherDataRespo" +
      "nse\022J\n\027GetWeatherDataByStation\022\024.ProtoWe" +
      "atherStation\032\031.ProtoWeatherDataResponseB" +
      "\021\n\rproto.weatherP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_ProtoWeatherDataPoint_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ProtoWeatherDataPoint_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ProtoWeatherDataPoint_descriptor,
        new java.lang.String[] { "AvgWindSpeed", "Barometer", "BattLevel", "InsideHum", "InsideTemp", "OutsideHum", "OutsideTemp", "RainRate", "SolarRad", "Station", "Sunrise", "Sunset", "Timestamp", "Ts", "UVLevel", "WindSpeed", "WindDir", "XmitBatt", });
    internal_static_ProtoWeatherStation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_ProtoWeatherStation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ProtoWeatherStation_descriptor,
        new java.lang.String[] { "StationId", "Name", "Location", "Description", });
    internal_static_ProtoWeatherData_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_ProtoWeatherData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ProtoWeatherData_descriptor,
        new java.lang.String[] { "WeatherDataPoints", });
    internal_static_ProtoWeatherDataResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_ProtoWeatherDataResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ProtoWeatherDataResponse_descriptor,
        new java.lang.String[] { "WeatherDataPoints", "StatusCode", });
    internal_static_ProtoSavedReply_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_ProtoSavedReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ProtoSavedReply_descriptor,
        new java.lang.String[] { "Message", "StatusCode", });
    internal_static_ProtoWeatherDataRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_ProtoWeatherDataRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ProtoWeatherDataRequest_descriptor,
        new java.lang.String[] { "Timeunit", "TimeAmount", });
    internal_static_ProtoTimeBlock_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_ProtoTimeBlock_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ProtoTimeBlock_descriptor,
        new java.lang.String[] { "TimeStart", "TimeEnd", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
