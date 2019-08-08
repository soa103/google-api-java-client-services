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

package com.google.api.services.videointelligence.v1beta2.model;

/**
 * Config for EXPLICIT_CONTENT_DETECTION.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Video Intelligence API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudVideointelligenceV1beta2ExplicitContentDetectionConfig extends com.google.api.client.json.GenericJson {

  /**
   * Model to use for explicit content detection. Supported values: "builtin/stable" (the default if
   * unset) and "builtin/latest".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String model;

  /**
   * Model to use for explicit content detection. Supported values: "builtin/stable" (the default if
   * unset) and "builtin/latest".
   * @return value or {@code null} for none
   */
  public java.lang.String getModel() {
    return model;
  }

  /**
   * Model to use for explicit content detection. Supported values: "builtin/stable" (the default if
   * unset) and "builtin/latest".
   * @param model model or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1beta2ExplicitContentDetectionConfig setModel(java.lang.String model) {
    this.model = model;
    return this;
  }

  @Override
  public GoogleCloudVideointelligenceV1beta2ExplicitContentDetectionConfig set(String fieldName, Object value) {
    return (GoogleCloudVideointelligenceV1beta2ExplicitContentDetectionConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVideointelligenceV1beta2ExplicitContentDetectionConfig clone() {
    return (GoogleCloudVideointelligenceV1beta2ExplicitContentDetectionConfig) super.clone();
  }

}
