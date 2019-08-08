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

package com.google.api.services.videointelligence.v1p1beta1.model;

/**
 * Annotation progress for a single video.
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
public final class GoogleCloudVideointelligenceV1VideoAnnotationProgress extends com.google.api.client.json.GenericJson {

  /**
   * Specifies which feature is being tracked if the request contains more than one features.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String feature;

  /**
   * Video file location in [Google Cloud Storage](https://cloud.google.com/storage/).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String inputUri;

  /**
   * Approximate percentage processed thus far. Guaranteed to be 100 when fully processed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer progressPercent;

  /**
   * Specifies which segment is being tracked if the request contains more than one segments.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudVideointelligenceV1VideoSegment segment;

  /**
   * Time when the request was received.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String startTime;

  /**
   * Time of the most recent update.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Specifies which feature is being tracked if the request contains more than one features.
   * @return value or {@code null} for none
   */
  public java.lang.String getFeature() {
    return feature;
  }

  /**
   * Specifies which feature is being tracked if the request contains more than one features.
   * @param feature feature or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1VideoAnnotationProgress setFeature(java.lang.String feature) {
    this.feature = feature;
    return this;
  }

  /**
   * Video file location in [Google Cloud Storage](https://cloud.google.com/storage/).
   * @return value or {@code null} for none
   */
  public java.lang.String getInputUri() {
    return inputUri;
  }

  /**
   * Video file location in [Google Cloud Storage](https://cloud.google.com/storage/).
   * @param inputUri inputUri or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1VideoAnnotationProgress setInputUri(java.lang.String inputUri) {
    this.inputUri = inputUri;
    return this;
  }

  /**
   * Approximate percentage processed thus far. Guaranteed to be 100 when fully processed.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getProgressPercent() {
    return progressPercent;
  }

  /**
   * Approximate percentage processed thus far. Guaranteed to be 100 when fully processed.
   * @param progressPercent progressPercent or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1VideoAnnotationProgress setProgressPercent(java.lang.Integer progressPercent) {
    this.progressPercent = progressPercent;
    return this;
  }

  /**
   * Specifies which segment is being tracked if the request contains more than one segments.
   * @return value or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1VideoSegment getSegment() {
    return segment;
  }

  /**
   * Specifies which segment is being tracked if the request contains more than one segments.
   * @param segment segment or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1VideoAnnotationProgress setSegment(GoogleCloudVideointelligenceV1VideoSegment segment) {
    this.segment = segment;
    return this;
  }

  /**
   * Time when the request was received.
   * @return value or {@code null} for none
   */
  public String getStartTime() {
    return startTime;
  }

  /**
   * Time when the request was received.
   * @param startTime startTime or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1VideoAnnotationProgress setStartTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Time of the most recent update.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Time of the most recent update.
   * @param updateTime updateTime or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1VideoAnnotationProgress setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public GoogleCloudVideointelligenceV1VideoAnnotationProgress set(String fieldName, Object value) {
    return (GoogleCloudVideointelligenceV1VideoAnnotationProgress) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVideointelligenceV1VideoAnnotationProgress clone() {
    return (GoogleCloudVideointelligenceV1VideoAnnotationProgress) super.clone();
  }

}
