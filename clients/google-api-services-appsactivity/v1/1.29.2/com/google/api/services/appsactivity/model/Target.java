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

package com.google.api.services.appsactivity.model;

/**
 * Information about the object modified by the event.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Drive Activity API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Target extends com.google.api.client.json.GenericJson {

  /**
   * The ID of the target. For example, in Google Drive, this is the file or folder ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * The MIME type of the target.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mimeType;

  /**
   * The name of the target. For example, in Google Drive, this is the title of the file.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The ID of the target. For example, in Google Drive, this is the file or folder ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * The ID of the target. For example, in Google Drive, this is the file or folder ID.
   * @param id id or {@code null} for none
   */
  public Target setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * The MIME type of the target.
   * @return value or {@code null} for none
   */
  public java.lang.String getMimeType() {
    return mimeType;
  }

  /**
   * The MIME type of the target.
   * @param mimeType mimeType or {@code null} for none
   */
  public Target setMimeType(java.lang.String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

  /**
   * The name of the target. For example, in Google Drive, this is the title of the file.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the target. For example, in Google Drive, this is the title of the file.
   * @param name name or {@code null} for none
   */
  public Target setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public Target set(String fieldName, Object value) {
    return (Target) super.set(fieldName, value);
  }

  @Override
  public Target clone() {
    return (Target) super.clone();
  }

}
