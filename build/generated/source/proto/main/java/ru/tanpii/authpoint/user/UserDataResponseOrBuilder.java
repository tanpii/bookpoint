// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: UserDataService.proto
// Protobuf Java Version: 4.28.2

package ru.tanpii.authpoint.user;

public interface UserDataResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ru.tanpii.authpoint.user.UserDataResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string uuid = 1;</code>
   * @return The uuid.
   */
  java.lang.String getUuid();
  /**
   * <code>string uuid = 1;</code>
   * @return The bytes for uuid.
   */
  com.google.protobuf.ByteString
      getUuidBytes();

  /**
   * <code>string email = 2;</code>
   * @return The email.
   */
  java.lang.String getEmail();
  /**
   * <code>string email = 2;</code>
   * @return The bytes for email.
   */
  com.google.protobuf.ByteString
      getEmailBytes();

  /**
   * <code>string firstName = 3;</code>
   * @return The firstName.
   */
  java.lang.String getFirstName();
  /**
   * <code>string firstName = 3;</code>
   * @return The bytes for firstName.
   */
  com.google.protobuf.ByteString
      getFirstNameBytes();

  /**
   * <code>string lastName = 4;</code>
   * @return The lastName.
   */
  java.lang.String getLastName();
  /**
   * <code>string lastName = 4;</code>
   * @return The bytes for lastName.
   */
  com.google.protobuf.ByteString
      getLastNameBytes();

  /**
   * <code>.google.protobuf.Timestamp birthdate = 5;</code>
   * @return Whether the birthdate field is set.
   */
  boolean hasBirthdate();
  /**
   * <code>.google.protobuf.Timestamp birthdate = 5;</code>
   * @return The birthdate.
   */
  com.google.protobuf.Timestamp getBirthdate();
  /**
   * <code>.google.protobuf.Timestamp birthdate = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getBirthdateOrBuilder();

  /**
   * <code>string photoUrl = 6;</code>
   * @return The photoUrl.
   */
  java.lang.String getPhotoUrl();
  /**
   * <code>string photoUrl = 6;</code>
   * @return The bytes for photoUrl.
   */
  com.google.protobuf.ByteString
      getPhotoUrlBytes();
}
