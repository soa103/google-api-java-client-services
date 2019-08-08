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

package com.google.api.services.videointelligence.v1.model;

/**
 * Video segment level annotation results for label detection.
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
public final class GoogleCloudVideointelligenceV1p3beta1LabelSegment extends com.google.api.client.json.GenericJson {

  /**
   * Confidence that the label is accurate. Range: [0, 1].
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float confidence;

  /**
   * Video segment where a label was detected.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudVideointelligenceV1p3beta1VideoSegment segment;

  /**
   * Confidence that the label is accurate. Range: [0, 1].
   * @return value or {@code null} for none
   */
  public java.lang.Float getConfidence() {
    return confidence;
  }

  /**
   * Confidence that the label is accurate. Range: [0, 1].
   * @param confidence confidence or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p3beta1LabelSegment setConfidence(java.lang.Float confidence) {
    this.confidence = confidence;
    return this;
  }

  /**
   * Video segment where a label was detected.
   * @return value or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p3beta1VideoSegment getSegment() {
    return segment;
  }

  /**
   * Video segment where a label was detected.
   * @param segment segment or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p3beta1LabelSegment setSegment(GoogleCloudVideointelligenceV1p3beta1VideoSegment segment) {
    this.segment = segment;
    return this;
  }

  @Override
  public GoogleCloudVideointelligenceV1p3beta1LabelSegment set(String fieldName, Object value) {
    return (GoogleCloudVideointelligenceV1p3beta1LabelSegment) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVideointelligenceV1p3beta1LabelSegment clone() {
    return (GoogleCloudVideointelligenceV1p3beta1LabelSegment) super.clone();
  }

}
