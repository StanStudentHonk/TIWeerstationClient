// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/weatherRequest.proto

package proto.weather;

public interface ProtoWeatherStationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ProtoWeatherStation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 stationId = 1;</code>
   * @return The stationId.
   */
  int getStationId();

  /**
   * <code>string name = 2;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string location = 3;</code>
   * @return The location.
   */
  java.lang.String getLocation();
  /**
   * <code>string location = 3;</code>
   * @return The bytes for location.
   */
  com.google.protobuf.ByteString
      getLocationBytes();

  /**
   * <code>string description = 4;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 4;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();
}
