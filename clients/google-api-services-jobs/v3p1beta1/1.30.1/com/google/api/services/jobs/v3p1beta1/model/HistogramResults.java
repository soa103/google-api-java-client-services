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

package com.google.api.services.jobs.v3p1beta1.model;

/**
 * Output only. Histogram results that match HistogramFacets specified in SearchJobsRequest.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Talent Solution API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class HistogramResults extends com.google.api.client.json.GenericJson {

  /**
   * Specifies compensation field-based histogram results that match
   * HistogramFacets.compensation_histogram_requests.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<CompensationHistogramResult> compensationHistogramResults;

  static {
    // hack to force ProGuard to consider CompensationHistogramResult used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(CompensationHistogramResult.class);
  }

  /**
   * Specifies histogram results for custom attributes that match
   * HistogramFacets.custom_attribute_histogram_facets.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<CustomAttributeHistogramResult> customAttributeHistogramResults;

  static {
    // hack to force ProGuard to consider CustomAttributeHistogramResult used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(CustomAttributeHistogramResult.class);
  }

  /**
   * Specifies histogram results that matches HistogramFacets.simple_histogram_facets.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<HistogramResult> simpleHistogramResults;

  static {
    // hack to force ProGuard to consider HistogramResult used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(HistogramResult.class);
  }

  /**
   * Specifies compensation field-based histogram results that match
   * HistogramFacets.compensation_histogram_requests.
   * @return value or {@code null} for none
   */
  public java.util.List<CompensationHistogramResult> getCompensationHistogramResults() {
    return compensationHistogramResults;
  }

  /**
   * Specifies compensation field-based histogram results that match
   * HistogramFacets.compensation_histogram_requests.
   * @param compensationHistogramResults compensationHistogramResults or {@code null} for none
   */
  public HistogramResults setCompensationHistogramResults(java.util.List<CompensationHistogramResult> compensationHistogramResults) {
    this.compensationHistogramResults = compensationHistogramResults;
    return this;
  }

  /**
   * Specifies histogram results for custom attributes that match
   * HistogramFacets.custom_attribute_histogram_facets.
   * @return value or {@code null} for none
   */
  public java.util.List<CustomAttributeHistogramResult> getCustomAttributeHistogramResults() {
    return customAttributeHistogramResults;
  }

  /**
   * Specifies histogram results for custom attributes that match
   * HistogramFacets.custom_attribute_histogram_facets.
   * @param customAttributeHistogramResults customAttributeHistogramResults or {@code null} for none
   */
  public HistogramResults setCustomAttributeHistogramResults(java.util.List<CustomAttributeHistogramResult> customAttributeHistogramResults) {
    this.customAttributeHistogramResults = customAttributeHistogramResults;
    return this;
  }

  /**
   * Specifies histogram results that matches HistogramFacets.simple_histogram_facets.
   * @return value or {@code null} for none
   */
  public java.util.List<HistogramResult> getSimpleHistogramResults() {
    return simpleHistogramResults;
  }

  /**
   * Specifies histogram results that matches HistogramFacets.simple_histogram_facets.
   * @param simpleHistogramResults simpleHistogramResults or {@code null} for none
   */
  public HistogramResults setSimpleHistogramResults(java.util.List<HistogramResult> simpleHistogramResults) {
    this.simpleHistogramResults = simpleHistogramResults;
    return this;
  }

  @Override
  public HistogramResults set(String fieldName, Object value) {
    return (HistogramResults) super.set(fieldName, value);
  }

  @Override
  public HistogramResults clone() {
    return (HistogramResults) super.clone();
  }

}
