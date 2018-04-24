// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kythe/proto/explore.proto

package com.google.devtools.kythe.proto;

public interface NodeDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:kythe.proto.NodeData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * the "node/[sub]kind" node facts
   * </pre>
   *
   * <code>string kind = 1;</code>
   */
  java.lang.String getKind();
  /**
   * <pre>
   * the "node/[sub]kind" node facts
   * </pre>
   *
   * <code>string kind = 1;</code>
   */
  com.google.protobuf.ByteString
      getKindBytes();

  /**
   * <code>string subkind = 2;</code>
   */
  java.lang.String getSubkind();
  /**
   * <code>string subkind = 2;</code>
   */
  com.google.protobuf.ByteString
      getSubkindBytes();

  /**
   * <pre>
   * the relevant locations in which this node is found
   * TODO: do we want span-specific locations?
   * </pre>
   *
   * <code>repeated .kythe.proto.Location locations = 3;</code>
   */
  java.util.List<com.google.devtools.kythe.proto.Location> 
      getLocationsList();
  /**
   * <pre>
   * the relevant locations in which this node is found
   * TODO: do we want span-specific locations?
   * </pre>
   *
   * <code>repeated .kythe.proto.Location locations = 3;</code>
   */
  com.google.devtools.kythe.proto.Location getLocations(int index);
  /**
   * <pre>
   * the relevant locations in which this node is found
   * TODO: do we want span-specific locations?
   * </pre>
   *
   * <code>repeated .kythe.proto.Location locations = 3;</code>
   */
  int getLocationsCount();
  /**
   * <pre>
   * the relevant locations in which this node is found
   * TODO: do we want span-specific locations?
   * </pre>
   *
   * <code>repeated .kythe.proto.Location locations = 3;</code>
   */
  java.util.List<? extends com.google.devtools.kythe.proto.LocationOrBuilder> 
      getLocationsOrBuilderList();
  /**
   * <pre>
   * the relevant locations in which this node is found
   * TODO: do we want span-specific locations?
   * </pre>
   *
   * <code>repeated .kythe.proto.Location locations = 3;</code>
   */
  com.google.devtools.kythe.proto.LocationOrBuilder getLocationsOrBuilder(
      int index);

  /**
   * <pre>
   * anchor ticket
   * </pre>
   *
   * <code>string definition_anchor = 4;</code>
   */
  java.lang.String getDefinitionAnchor();
  /**
   * <pre>
   * anchor ticket
   * </pre>
   *
   * <code>string definition_anchor = 4;</code>
   */
  com.google.protobuf.ByteString
      getDefinitionAnchorBytes();

  /**
   * <code>.kythe.proto.common.MarkedSource code = 5;</code>
   */
  boolean hasCode();
  /**
   * <code>.kythe.proto.common.MarkedSource code = 5;</code>
   */
  com.google.devtools.kythe.proto.MarkedSource getCode();
  /**
   * <code>.kythe.proto.common.MarkedSource code = 5;</code>
   */
  com.google.devtools.kythe.proto.MarkedSourceOrBuilder getCodeOrBuilder();
}