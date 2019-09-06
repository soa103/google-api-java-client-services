/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.compute.model;

/**
 * A public advertised prefix represents an aggregated IP prefix or netblock which customers bring
 * to cloud. The IP prefix is a single unit of route advertisement and is announced globally to the
 * internet.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PublicAdvertisedPrefix extends com.google.api.client.json.GenericJson {

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creationTimestamp;

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The IPv4 address to be used for reverse DNS verification.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dnsVerificationIp;

  /**
   * Fingerprint of this resource. A hash of the contents stored in this object. This field is used
   * in optimistic locking. This field will be ignored when inserting a new PublicAdvertisedPrefix.
   * An up-to-date fingerprint must be provided in order to update the PublicAdvertisedPrefix,
   * otherwise the request will fail with error 412 conditionNotMet.
   *
   * To see the latest fingerprint, make a get() request to retrieve a PublicAdvertisedPrefix.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fingerprint;

  /**
   * [Output Only] The unique identifier for the resource type. The server generates this
   * identifier.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger id;

  /**
   * The IPv4 address range, in CIDR format, represented by this public advertised prefix.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ipCidrRange;

  /**
   * [Output Only] Type of the resource. Always compute#publicAdvertisedPrefix for public advertised
   * prefixes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * [Output Only] The list of public delegated prefixes that exist for this public advertised
   * prefix.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<PublicAdvertisedPrefixPublicDelegatedPrefix> publicDelegatedPrefixs;

  /**
   * [Output Only] Server-defined URL for the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * [Output Only] Server-defined URL with id for the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLinkWithId;

  /**
   * [Output Only] The shared secret to be used for reverse DNS verification.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sharedSecret;

  /**
   * The status of the public advertised prefix.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreationTimestamp() {
    return creationTimestamp;
  }

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @param creationTimestamp creationTimestamp or {@code null} for none
   */
  public PublicAdvertisedPrefix setCreationTimestamp(java.lang.String creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * @param description description or {@code null} for none
   */
  public PublicAdvertisedPrefix setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * The IPv4 address to be used for reverse DNS verification.
   * @return value or {@code null} for none
   */
  public java.lang.String getDnsVerificationIp() {
    return dnsVerificationIp;
  }

  /**
   * The IPv4 address to be used for reverse DNS verification.
   * @param dnsVerificationIp dnsVerificationIp or {@code null} for none
   */
  public PublicAdvertisedPrefix setDnsVerificationIp(java.lang.String dnsVerificationIp) {
    this.dnsVerificationIp = dnsVerificationIp;
    return this;
  }

  /**
   * Fingerprint of this resource. A hash of the contents stored in this object. This field is used
   * in optimistic locking. This field will be ignored when inserting a new PublicAdvertisedPrefix.
   * An up-to-date fingerprint must be provided in order to update the PublicAdvertisedPrefix,
   * otherwise the request will fail with error 412 conditionNotMet.
   *
   * To see the latest fingerprint, make a get() request to retrieve a PublicAdvertisedPrefix.
   * @see #decodeFingerprint()
   * @return value or {@code null} for none
   */
  public java.lang.String getFingerprint() {
    return fingerprint;
  }

  /**
   * Fingerprint of this resource. A hash of the contents stored in this object. This field is used
   * in optimistic locking. This field will be ignored when inserting a new PublicAdvertisedPrefix.
   * An up-to-date fingerprint must be provided in order to update the PublicAdvertisedPrefix,
   * otherwise the request will fail with error 412 conditionNotMet.
   *
   * To see the latest fingerprint, make a get() request to retrieve a PublicAdvertisedPrefix.
   * @see #getFingerprint()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeFingerprint() {
    return com.google.api.client.util.Base64.decodeBase64(fingerprint);
  }

  /**
   * Fingerprint of this resource. A hash of the contents stored in this object. This field is used
   * in optimistic locking. This field will be ignored when inserting a new PublicAdvertisedPrefix.
   * An up-to-date fingerprint must be provided in order to update the PublicAdvertisedPrefix,
   * otherwise the request will fail with error 412 conditionNotMet.
   *
   * To see the latest fingerprint, make a get() request to retrieve a PublicAdvertisedPrefix.
   * @see #encodeFingerprint()
   * @param fingerprint fingerprint or {@code null} for none
   */
  public PublicAdvertisedPrefix setFingerprint(java.lang.String fingerprint) {
    this.fingerprint = fingerprint;
    return this;
  }

  /**
   * Fingerprint of this resource. A hash of the contents stored in this object. This field is used
   * in optimistic locking. This field will be ignored when inserting a new PublicAdvertisedPrefix.
   * An up-to-date fingerprint must be provided in order to update the PublicAdvertisedPrefix,
   * otherwise the request will fail with error 412 conditionNotMet.
   *
   * To see the latest fingerprint, make a get() request to retrieve a PublicAdvertisedPrefix.
   * @see #setFingerprint()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public PublicAdvertisedPrefix encodeFingerprint(byte[] fingerprint) {
    this.fingerprint = com.google.api.client.util.Base64.encodeBase64URLSafeString(fingerprint);
    return this;
  }

  /**
   * [Output Only] The unique identifier for the resource type. The server generates this
   * identifier.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getId() {
    return id;
  }

  /**
   * [Output Only] The unique identifier for the resource type. The server generates this
   * identifier.
   * @param id id or {@code null} for none
   */
  public PublicAdvertisedPrefix setId(java.math.BigInteger id) {
    this.id = id;
    return this;
  }

  /**
   * The IPv4 address range, in CIDR format, represented by this public advertised prefix.
   * @return value or {@code null} for none
   */
  public java.lang.String getIpCidrRange() {
    return ipCidrRange;
  }

  /**
   * The IPv4 address range, in CIDR format, represented by this public advertised prefix.
   * @param ipCidrRange ipCidrRange or {@code null} for none
   */
  public PublicAdvertisedPrefix setIpCidrRange(java.lang.String ipCidrRange) {
    this.ipCidrRange = ipCidrRange;
    return this;
  }

  /**
   * [Output Only] Type of the resource. Always compute#publicAdvertisedPrefix for public advertised
   * prefixes.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * [Output Only] Type of the resource. Always compute#publicAdvertisedPrefix for public advertised
   * prefixes.
   * @param kind kind or {@code null} for none
   */
  public PublicAdvertisedPrefix setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * @param name name or {@code null} for none
   */
  public PublicAdvertisedPrefix setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * [Output Only] The list of public delegated prefixes that exist for this public advertised
   * prefix.
   * @return value or {@code null} for none
   */
  public java.util.List<PublicAdvertisedPrefixPublicDelegatedPrefix> getPublicDelegatedPrefixs() {
    return publicDelegatedPrefixs;
  }

  /**
   * [Output Only] The list of public delegated prefixes that exist for this public advertised
   * prefix.
   * @param publicDelegatedPrefixs publicDelegatedPrefixs or {@code null} for none
   */
  public PublicAdvertisedPrefix setPublicDelegatedPrefixs(java.util.List<PublicAdvertisedPrefixPublicDelegatedPrefix> publicDelegatedPrefixs) {
    this.publicDelegatedPrefixs = publicDelegatedPrefixs;
    return this;
  }

  /**
   * [Output Only] Server-defined URL for the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * [Output Only] Server-defined URL for the resource.
   * @param selfLink selfLink or {@code null} for none
   */
  public PublicAdvertisedPrefix setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * [Output Only] Server-defined URL with id for the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLinkWithId() {
    return selfLinkWithId;
  }

  /**
   * [Output Only] Server-defined URL with id for the resource.
   * @param selfLinkWithId selfLinkWithId or {@code null} for none
   */
  public PublicAdvertisedPrefix setSelfLinkWithId(java.lang.String selfLinkWithId) {
    this.selfLinkWithId = selfLinkWithId;
    return this;
  }

  /**
   * [Output Only] The shared secret to be used for reverse DNS verification.
   * @return value or {@code null} for none
   */
  public java.lang.String getSharedSecret() {
    return sharedSecret;
  }

  /**
   * [Output Only] The shared secret to be used for reverse DNS verification.
   * @param sharedSecret sharedSecret or {@code null} for none
   */
  public PublicAdvertisedPrefix setSharedSecret(java.lang.String sharedSecret) {
    this.sharedSecret = sharedSecret;
    return this;
  }

  /**
   * The status of the public advertised prefix.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * The status of the public advertised prefix.
   * @param status status or {@code null} for none
   */
  public PublicAdvertisedPrefix setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  @Override
  public PublicAdvertisedPrefix set(String fieldName, Object value) {
    return (PublicAdvertisedPrefix) super.set(fieldName, value);
  }

  @Override
  public PublicAdvertisedPrefix clone() {
    return (PublicAdvertisedPrefix) super.clone();
  }

}