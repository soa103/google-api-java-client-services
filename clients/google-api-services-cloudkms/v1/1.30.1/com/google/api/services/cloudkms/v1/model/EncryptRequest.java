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

package com.google.api.services.cloudkms.v1.model;

/**
 * Request message for KeyManagementService.Encrypt.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Key Management Service (KMS) API. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class EncryptRequest extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Optional data that, if specified, must also be provided during decryption through
   * DecryptRequest.additional_authenticated_data. The maximum size depends on the key version's
   * protection_level. For SOFTWARE keys, the AAD must be no larger than 64KiB. For HSM keys, the
   * combined length of the plaintext and additional_authenticated_data fields must be no larger
   * than 8KiB.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String additionalAuthenticatedData;

  /**
   * Optional. An optional CRC32C checksum of the EncryptRequest.additional_authenticated_data. If
   * specified, KeyManagementService will verify the integrity of the received
   * EncryptRequest.additional_authenticated_data using this checksum. KeyManagementService will
   * report an error if the checksum verification fails. If you receive a checksum error, your
   * client should verify that CRC32C(EncryptRequest.additional_authenticated_data) is equal to
   * EncryptRequest.additional_authenticated_data_crc32c, and if so, perform a limited number of
   * retries. A persistent mismatch may indicate an issue in your computation of the CRC32C
   * checksum. Note: This field is defined as int64 for reasons of compatibility across different
   * languages. However, it is a non-negative integer, which will never exceed 2^32-1, and can be
   * safely downconverted to uint32 in languages that support this type. NOTE: This field is in
   * Beta.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long additionalAuthenticatedDataCrc32c;

  /**
   * Required. The data to encrypt. Must be no larger than 64KiB. The maximum size depends on the
   * key version's protection_level. For SOFTWARE keys, the plaintext must be no larger than 64KiB.
   * For HSM keys, the combined length of the plaintext and additional_authenticated_data fields
   * must be no larger than 8KiB.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String plaintext;

  /**
   * Optional. An optional CRC32C checksum of the EncryptRequest.plaintext. If specified,
   * KeyManagementService will verify the integrity of the received EncryptRequest.plaintext using
   * this checksum. KeyManagementService will report an error if the checksum verification fails. If
   * you receive a checksum error, your client should verify that CRC32C(EncryptRequest.plaintext)
   * is equal to EncryptRequest.plaintext_crc32c, and if so, perform a limited number of retries. A
   * persistent mismatch may indicate an issue in your computation of the CRC32C checksum. Note:
   * This field is defined as int64 for reasons of compatibility across different languages.
   * However, it is a non-negative integer, which will never exceed 2^32-1, and can be safely
   * downconverted to uint32 in languages that support this type. NOTE: This field is in Beta.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long plaintextCrc32c;

  /**
   * Optional. Optional data that, if specified, must also be provided during decryption through
   * DecryptRequest.additional_authenticated_data. The maximum size depends on the key version's
   * protection_level. For SOFTWARE keys, the AAD must be no larger than 64KiB. For HSM keys, the
   * combined length of the plaintext and additional_authenticated_data fields must be no larger
   * than 8KiB.
   * @see #decodeAdditionalAuthenticatedData()
   * @return value or {@code null} for none
   */
  public java.lang.String getAdditionalAuthenticatedData() {
    return additionalAuthenticatedData;
  }

  /**
   * Optional. Optional data that, if specified, must also be provided during decryption through
   * DecryptRequest.additional_authenticated_data. The maximum size depends on the key version's
   * protection_level. For SOFTWARE keys, the AAD must be no larger than 64KiB. For HSM keys, the
   * combined length of the plaintext and additional_authenticated_data fields must be no larger
   * than 8KiB.
   * @see #getAdditionalAuthenticatedData()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeAdditionalAuthenticatedData() {
    return com.google.api.client.util.Base64.decodeBase64(additionalAuthenticatedData);
  }

  /**
   * Optional. Optional data that, if specified, must also be provided during decryption through
   * DecryptRequest.additional_authenticated_data. The maximum size depends on the key version's
   * protection_level. For SOFTWARE keys, the AAD must be no larger than 64KiB. For HSM keys, the
   * combined length of the plaintext and additional_authenticated_data fields must be no larger
   * than 8KiB.
   * @see #encodeAdditionalAuthenticatedData()
   * @param additionalAuthenticatedData additionalAuthenticatedData or {@code null} for none
   */
  public EncryptRequest setAdditionalAuthenticatedData(java.lang.String additionalAuthenticatedData) {
    this.additionalAuthenticatedData = additionalAuthenticatedData;
    return this;
  }

  /**
   * Optional. Optional data that, if specified, must also be provided during decryption through
   * DecryptRequest.additional_authenticated_data. The maximum size depends on the key version's
   * protection_level. For SOFTWARE keys, the AAD must be no larger than 64KiB. For HSM keys, the
   * combined length of the plaintext and additional_authenticated_data fields must be no larger
   * than 8KiB.
   * @see #setAdditionalAuthenticatedData()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public EncryptRequest encodeAdditionalAuthenticatedData(byte[] additionalAuthenticatedData) {
    this.additionalAuthenticatedData = com.google.api.client.util.Base64.encodeBase64URLSafeString(additionalAuthenticatedData);
    return this;
  }

  /**
   * Optional. An optional CRC32C checksum of the EncryptRequest.additional_authenticated_data. If
   * specified, KeyManagementService will verify the integrity of the received
   * EncryptRequest.additional_authenticated_data using this checksum. KeyManagementService will
   * report an error if the checksum verification fails. If you receive a checksum error, your
   * client should verify that CRC32C(EncryptRequest.additional_authenticated_data) is equal to
   * EncryptRequest.additional_authenticated_data_crc32c, and if so, perform a limited number of
   * retries. A persistent mismatch may indicate an issue in your computation of the CRC32C
   * checksum. Note: This field is defined as int64 for reasons of compatibility across different
   * languages. However, it is a non-negative integer, which will never exceed 2^32-1, and can be
   * safely downconverted to uint32 in languages that support this type. NOTE: This field is in
   * Beta.
   * @return value or {@code null} for none
   */
  public java.lang.Long getAdditionalAuthenticatedDataCrc32c() {
    return additionalAuthenticatedDataCrc32c;
  }

  /**
   * Optional. An optional CRC32C checksum of the EncryptRequest.additional_authenticated_data. If
   * specified, KeyManagementService will verify the integrity of the received
   * EncryptRequest.additional_authenticated_data using this checksum. KeyManagementService will
   * report an error if the checksum verification fails. If you receive a checksum error, your
   * client should verify that CRC32C(EncryptRequest.additional_authenticated_data) is equal to
   * EncryptRequest.additional_authenticated_data_crc32c, and if so, perform a limited number of
   * retries. A persistent mismatch may indicate an issue in your computation of the CRC32C
   * checksum. Note: This field is defined as int64 for reasons of compatibility across different
   * languages. However, it is a non-negative integer, which will never exceed 2^32-1, and can be
   * safely downconverted to uint32 in languages that support this type. NOTE: This field is in
   * Beta.
   * @param additionalAuthenticatedDataCrc32c additionalAuthenticatedDataCrc32c or {@code null} for none
   */
  public EncryptRequest setAdditionalAuthenticatedDataCrc32c(java.lang.Long additionalAuthenticatedDataCrc32c) {
    this.additionalAuthenticatedDataCrc32c = additionalAuthenticatedDataCrc32c;
    return this;
  }

  /**
   * Required. The data to encrypt. Must be no larger than 64KiB. The maximum size depends on the
   * key version's protection_level. For SOFTWARE keys, the plaintext must be no larger than 64KiB.
   * For HSM keys, the combined length of the plaintext and additional_authenticated_data fields
   * must be no larger than 8KiB.
   * @see #decodePlaintext()
   * @return value or {@code null} for none
   */
  public java.lang.String getPlaintext() {
    return plaintext;
  }

  /**
   * Required. The data to encrypt. Must be no larger than 64KiB. The maximum size depends on the
   * key version's protection_level. For SOFTWARE keys, the plaintext must be no larger than 64KiB.
   * For HSM keys, the combined length of the plaintext and additional_authenticated_data fields
   * must be no larger than 8KiB.
   * @see #getPlaintext()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodePlaintext() {
    return com.google.api.client.util.Base64.decodeBase64(plaintext);
  }

  /**
   * Required. The data to encrypt. Must be no larger than 64KiB. The maximum size depends on the
   * key version's protection_level. For SOFTWARE keys, the plaintext must be no larger than 64KiB.
   * For HSM keys, the combined length of the plaintext and additional_authenticated_data fields
   * must be no larger than 8KiB.
   * @see #encodePlaintext()
   * @param plaintext plaintext or {@code null} for none
   */
  public EncryptRequest setPlaintext(java.lang.String plaintext) {
    this.plaintext = plaintext;
    return this;
  }

  /**
   * Required. The data to encrypt. Must be no larger than 64KiB. The maximum size depends on the
   * key version's protection_level. For SOFTWARE keys, the plaintext must be no larger than 64KiB.
   * For HSM keys, the combined length of the plaintext and additional_authenticated_data fields
   * must be no larger than 8KiB.
   * @see #setPlaintext()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public EncryptRequest encodePlaintext(byte[] plaintext) {
    this.plaintext = com.google.api.client.util.Base64.encodeBase64URLSafeString(plaintext);
    return this;
  }

  /**
   * Optional. An optional CRC32C checksum of the EncryptRequest.plaintext. If specified,
   * KeyManagementService will verify the integrity of the received EncryptRequest.plaintext using
   * this checksum. KeyManagementService will report an error if the checksum verification fails. If
   * you receive a checksum error, your client should verify that CRC32C(EncryptRequest.plaintext)
   * is equal to EncryptRequest.plaintext_crc32c, and if so, perform a limited number of retries. A
   * persistent mismatch may indicate an issue in your computation of the CRC32C checksum. Note:
   * This field is defined as int64 for reasons of compatibility across different languages.
   * However, it is a non-negative integer, which will never exceed 2^32-1, and can be safely
   * downconverted to uint32 in languages that support this type. NOTE: This field is in Beta.
   * @return value or {@code null} for none
   */
  public java.lang.Long getPlaintextCrc32c() {
    return plaintextCrc32c;
  }

  /**
   * Optional. An optional CRC32C checksum of the EncryptRequest.plaintext. If specified,
   * KeyManagementService will verify the integrity of the received EncryptRequest.plaintext using
   * this checksum. KeyManagementService will report an error if the checksum verification fails. If
   * you receive a checksum error, your client should verify that CRC32C(EncryptRequest.plaintext)
   * is equal to EncryptRequest.plaintext_crc32c, and if so, perform a limited number of retries. A
   * persistent mismatch may indicate an issue in your computation of the CRC32C checksum. Note:
   * This field is defined as int64 for reasons of compatibility across different languages.
   * However, it is a non-negative integer, which will never exceed 2^32-1, and can be safely
   * downconverted to uint32 in languages that support this type. NOTE: This field is in Beta.
   * @param plaintextCrc32c plaintextCrc32c or {@code null} for none
   */
  public EncryptRequest setPlaintextCrc32c(java.lang.Long plaintextCrc32c) {
    this.plaintextCrc32c = plaintextCrc32c;
    return this;
  }

  @Override
  public EncryptRequest set(String fieldName, Object value) {
    return (EncryptRequest) super.set(fieldName, value);
  }

  @Override
  public EncryptRequest clone() {
    return (EncryptRequest) super.clone();
  }

}
