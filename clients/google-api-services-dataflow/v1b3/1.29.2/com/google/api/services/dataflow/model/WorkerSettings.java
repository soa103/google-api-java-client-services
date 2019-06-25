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

package com.google.api.services.dataflow.model;

/**
 * Provides data to pass through to the worker harness.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dataflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class WorkerSettings extends com.google.api.client.json.GenericJson {

  /**
   * The base URL for accessing Google Cloud APIs.
   *
   * When workers access Google Cloud APIs, they logically do so via relative URLs.  If this field
   * is specified, it supplies the base URL to use for resolving these relative URLs.  The normative
   * algorithm used is defined by RFC 1808, "Relative Uniform Resource Locators".
   *
   * If not specified, the default value is "http://www.googleapis.com/"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String baseUrl;

  /**
   * Whether to send work progress updates to the service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean reportingEnabled;

  /**
   * The Cloud Dataflow service path relative to the root URL, for example,
   * "dataflow/v1b3/projects".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String servicePath;

  /**
   * The Shuffle service path relative to the root URL, for example, "shuffle/v1beta1".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String shuffleServicePath;

  /**
   * The prefix of the resources the system should use for temporary storage.
   *
   * The supported resource type is:
   *
   * Google Cloud Storage:
   *
   *   storage.googleapis.com/{bucket}/{object}   bucket.storage.googleapis.com/{object}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tempStoragePrefix;

  /**
   * The ID of the worker running this pipeline.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String workerId;

  /**
   * The base URL for accessing Google Cloud APIs.
   *
   * When workers access Google Cloud APIs, they logically do so via relative URLs.  If this field
   * is specified, it supplies the base URL to use for resolving these relative URLs.  The normative
   * algorithm used is defined by RFC 1808, "Relative Uniform Resource Locators".
   *
   * If not specified, the default value is "http://www.googleapis.com/"
   * @return value or {@code null} for none
   */
  public java.lang.String getBaseUrl() {
    return baseUrl;
  }

  /**
   * The base URL for accessing Google Cloud APIs.
   *
   * When workers access Google Cloud APIs, they logically do so via relative URLs.  If this field
   * is specified, it supplies the base URL to use for resolving these relative URLs.  The normative
   * algorithm used is defined by RFC 1808, "Relative Uniform Resource Locators".
   *
   * If not specified, the default value is "http://www.googleapis.com/"
   * @param baseUrl baseUrl or {@code null} for none
   */
  public WorkerSettings setBaseUrl(java.lang.String baseUrl) {
    this.baseUrl = baseUrl;
    return this;
  }

  /**
   * Whether to send work progress updates to the service.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getReportingEnabled() {
    return reportingEnabled;
  }

  /**
   * Whether to send work progress updates to the service.
   * @param reportingEnabled reportingEnabled or {@code null} for none
   */
  public WorkerSettings setReportingEnabled(java.lang.Boolean reportingEnabled) {
    this.reportingEnabled = reportingEnabled;
    return this;
  }

  /**
   * The Cloud Dataflow service path relative to the root URL, for example,
   * "dataflow/v1b3/projects".
   * @return value or {@code null} for none
   */
  public java.lang.String getServicePath() {
    return servicePath;
  }

  /**
   * The Cloud Dataflow service path relative to the root URL, for example,
   * "dataflow/v1b3/projects".
   * @param servicePath servicePath or {@code null} for none
   */
  public WorkerSettings setServicePath(java.lang.String servicePath) {
    this.servicePath = servicePath;
    return this;
  }

  /**
   * The Shuffle service path relative to the root URL, for example, "shuffle/v1beta1".
   * @return value or {@code null} for none
   */
  public java.lang.String getShuffleServicePath() {
    return shuffleServicePath;
  }

  /**
   * The Shuffle service path relative to the root URL, for example, "shuffle/v1beta1".
   * @param shuffleServicePath shuffleServicePath or {@code null} for none
   */
  public WorkerSettings setShuffleServicePath(java.lang.String shuffleServicePath) {
    this.shuffleServicePath = shuffleServicePath;
    return this;
  }

  /**
   * The prefix of the resources the system should use for temporary storage.
   *
   * The supported resource type is:
   *
   * Google Cloud Storage:
   *
   *   storage.googleapis.com/{bucket}/{object}   bucket.storage.googleapis.com/{object}
   * @return value or {@code null} for none
   */
  public java.lang.String getTempStoragePrefix() {
    return tempStoragePrefix;
  }

  /**
   * The prefix of the resources the system should use for temporary storage.
   *
   * The supported resource type is:
   *
   * Google Cloud Storage:
   *
   *   storage.googleapis.com/{bucket}/{object}   bucket.storage.googleapis.com/{object}
   * @param tempStoragePrefix tempStoragePrefix or {@code null} for none
   */
  public WorkerSettings setTempStoragePrefix(java.lang.String tempStoragePrefix) {
    this.tempStoragePrefix = tempStoragePrefix;
    return this;
  }

  /**
   * The ID of the worker running this pipeline.
   * @return value or {@code null} for none
   */
  public java.lang.String getWorkerId() {
    return workerId;
  }

  /**
   * The ID of the worker running this pipeline.
   * @param workerId workerId or {@code null} for none
   */
  public WorkerSettings setWorkerId(java.lang.String workerId) {
    this.workerId = workerId;
    return this;
  }

  @Override
  public WorkerSettings set(String fieldName, Object value) {
    return (WorkerSettings) super.set(fieldName, value);
  }

  @Override
  public WorkerSettings clone() {
    return (WorkerSettings) super.clone();
  }

}
