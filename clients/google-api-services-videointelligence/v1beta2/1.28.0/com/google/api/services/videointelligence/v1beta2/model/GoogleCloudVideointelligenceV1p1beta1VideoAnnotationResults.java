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
 * Annotation results for a single video.
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
public final class GoogleCloudVideointelligenceV1p1beta1VideoAnnotationResults extends com.google.api.client.json.GenericJson {

  /**
   * If set, indicates an error. Note that for a single `AnnotateVideoRequest` some videos may
   * succeed and some may fail.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleRpcStatus error;

  /**
   * Explicit content annotation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudVideointelligenceV1p1beta1ExplicitContentAnnotation explicitAnnotation;

  /**
   * Label annotations on frame level. There is exactly one element for each unique label.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudVideointelligenceV1p1beta1LabelAnnotation> frameLabelAnnotations;

  static {
    // hack to force ProGuard to consider GoogleCloudVideointelligenceV1p1beta1LabelAnnotation used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudVideointelligenceV1p1beta1LabelAnnotation.class);
  }

  /**
   * Video file location in [Google Cloud Storage](https://cloud.google.com/storage/).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String inputUri;

  /**
   * Annotations for list of objects detected and tracked in video.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudVideointelligenceV1p1beta1ObjectTrackingAnnotation> objectAnnotations;

  static {
    // hack to force ProGuard to consider GoogleCloudVideointelligenceV1p1beta1ObjectTrackingAnnotation used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudVideointelligenceV1p1beta1ObjectTrackingAnnotation.class);
  }

  /**
   * Video segment on which the annotation is run.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudVideointelligenceV1p1beta1VideoSegment segment;

  /**
   * Topical label annotations on video level or user specified segment level. There is exactly one
   * element for each unique label.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudVideointelligenceV1p1beta1LabelAnnotation> segmentLabelAnnotations;

  static {
    // hack to force ProGuard to consider GoogleCloudVideointelligenceV1p1beta1LabelAnnotation used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudVideointelligenceV1p1beta1LabelAnnotation.class);
  }

  /**
   * Shot annotations. Each shot is represented as a video segment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudVideointelligenceV1p1beta1VideoSegment> shotAnnotations;

  /**
   * Topical label annotations on shot level. There is exactly one element for each unique label.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudVideointelligenceV1p1beta1LabelAnnotation> shotLabelAnnotations;

  static {
    // hack to force ProGuard to consider GoogleCloudVideointelligenceV1p1beta1LabelAnnotation used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudVideointelligenceV1p1beta1LabelAnnotation.class);
  }

  /**
   * Speech transcription.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudVideointelligenceV1p1beta1SpeechTranscription> speechTranscriptions;

  static {
    // hack to force ProGuard to consider GoogleCloudVideointelligenceV1p1beta1SpeechTranscription used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudVideointelligenceV1p1beta1SpeechTranscription.class);
  }

  /**
   * OCR text detection and tracking. Annotations for list of detected text snippets. Each will have
   * list of frame information associated with it.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudVideointelligenceV1p1beta1TextAnnotation> textAnnotations;

  static {
    // hack to force ProGuard to consider GoogleCloudVideointelligenceV1p1beta1TextAnnotation used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudVideointelligenceV1p1beta1TextAnnotation.class);
  }

  /**
   * If set, indicates an error. Note that for a single `AnnotateVideoRequest` some videos may
   * succeed and some may fail.
   * @return value or {@code null} for none
   */
  public GoogleRpcStatus getError() {
    return error;
  }

  /**
   * If set, indicates an error. Note that for a single `AnnotateVideoRequest` some videos may
   * succeed and some may fail.
   * @param error error or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p1beta1VideoAnnotationResults setError(GoogleRpcStatus error) {
    this.error = error;
    return this;
  }

  /**
   * Explicit content annotation.
   * @return value or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p1beta1ExplicitContentAnnotation getExplicitAnnotation() {
    return explicitAnnotation;
  }

  /**
   * Explicit content annotation.
   * @param explicitAnnotation explicitAnnotation or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p1beta1VideoAnnotationResults setExplicitAnnotation(GoogleCloudVideointelligenceV1p1beta1ExplicitContentAnnotation explicitAnnotation) {
    this.explicitAnnotation = explicitAnnotation;
    return this;
  }

  /**
   * Label annotations on frame level. There is exactly one element for each unique label.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudVideointelligenceV1p1beta1LabelAnnotation> getFrameLabelAnnotations() {
    return frameLabelAnnotations;
  }

  /**
   * Label annotations on frame level. There is exactly one element for each unique label.
   * @param frameLabelAnnotations frameLabelAnnotations or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p1beta1VideoAnnotationResults setFrameLabelAnnotations(java.util.List<GoogleCloudVideointelligenceV1p1beta1LabelAnnotation> frameLabelAnnotations) {
    this.frameLabelAnnotations = frameLabelAnnotations;
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
  public GoogleCloudVideointelligenceV1p1beta1VideoAnnotationResults setInputUri(java.lang.String inputUri) {
    this.inputUri = inputUri;
    return this;
  }

  /**
   * Annotations for list of objects detected and tracked in video.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudVideointelligenceV1p1beta1ObjectTrackingAnnotation> getObjectAnnotations() {
    return objectAnnotations;
  }

  /**
   * Annotations for list of objects detected and tracked in video.
   * @param objectAnnotations objectAnnotations or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p1beta1VideoAnnotationResults setObjectAnnotations(java.util.List<GoogleCloudVideointelligenceV1p1beta1ObjectTrackingAnnotation> objectAnnotations) {
    this.objectAnnotations = objectAnnotations;
    return this;
  }

  /**
   * Video segment on which the annotation is run.
   * @return value or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p1beta1VideoSegment getSegment() {
    return segment;
  }

  /**
   * Video segment on which the annotation is run.
   * @param segment segment or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p1beta1VideoAnnotationResults setSegment(GoogleCloudVideointelligenceV1p1beta1VideoSegment segment) {
    this.segment = segment;
    return this;
  }

  /**
   * Topical label annotations on video level or user specified segment level. There is exactly one
   * element for each unique label.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudVideointelligenceV1p1beta1LabelAnnotation> getSegmentLabelAnnotations() {
    return segmentLabelAnnotations;
  }

  /**
   * Topical label annotations on video level or user specified segment level. There is exactly one
   * element for each unique label.
   * @param segmentLabelAnnotations segmentLabelAnnotations or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p1beta1VideoAnnotationResults setSegmentLabelAnnotations(java.util.List<GoogleCloudVideointelligenceV1p1beta1LabelAnnotation> segmentLabelAnnotations) {
    this.segmentLabelAnnotations = segmentLabelAnnotations;
    return this;
  }

  /**
   * Shot annotations. Each shot is represented as a video segment.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudVideointelligenceV1p1beta1VideoSegment> getShotAnnotations() {
    return shotAnnotations;
  }

  /**
   * Shot annotations. Each shot is represented as a video segment.
   * @param shotAnnotations shotAnnotations or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p1beta1VideoAnnotationResults setShotAnnotations(java.util.List<GoogleCloudVideointelligenceV1p1beta1VideoSegment> shotAnnotations) {
    this.shotAnnotations = shotAnnotations;
    return this;
  }

  /**
   * Topical label annotations on shot level. There is exactly one element for each unique label.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudVideointelligenceV1p1beta1LabelAnnotation> getShotLabelAnnotations() {
    return shotLabelAnnotations;
  }

  /**
   * Topical label annotations on shot level. There is exactly one element for each unique label.
   * @param shotLabelAnnotations shotLabelAnnotations or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p1beta1VideoAnnotationResults setShotLabelAnnotations(java.util.List<GoogleCloudVideointelligenceV1p1beta1LabelAnnotation> shotLabelAnnotations) {
    this.shotLabelAnnotations = shotLabelAnnotations;
    return this;
  }

  /**
   * Speech transcription.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudVideointelligenceV1p1beta1SpeechTranscription> getSpeechTranscriptions() {
    return speechTranscriptions;
  }

  /**
   * Speech transcription.
   * @param speechTranscriptions speechTranscriptions or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p1beta1VideoAnnotationResults setSpeechTranscriptions(java.util.List<GoogleCloudVideointelligenceV1p1beta1SpeechTranscription> speechTranscriptions) {
    this.speechTranscriptions = speechTranscriptions;
    return this;
  }

  /**
   * OCR text detection and tracking. Annotations for list of detected text snippets. Each will have
   * list of frame information associated with it.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudVideointelligenceV1p1beta1TextAnnotation> getTextAnnotations() {
    return textAnnotations;
  }

  /**
   * OCR text detection and tracking. Annotations for list of detected text snippets. Each will have
   * list of frame information associated with it.
   * @param textAnnotations textAnnotations or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p1beta1VideoAnnotationResults setTextAnnotations(java.util.List<GoogleCloudVideointelligenceV1p1beta1TextAnnotation> textAnnotations) {
    this.textAnnotations = textAnnotations;
    return this;
  }

  @Override
  public GoogleCloudVideointelligenceV1p1beta1VideoAnnotationResults set(String fieldName, Object value) {
    return (GoogleCloudVideointelligenceV1p1beta1VideoAnnotationResults) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVideointelligenceV1p1beta1VideoAnnotationResults clone() {
    return (GoogleCloudVideointelligenceV1p1beta1VideoAnnotationResults) super.clone();
  }

}
