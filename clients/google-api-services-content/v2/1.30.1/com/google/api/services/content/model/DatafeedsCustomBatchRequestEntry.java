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

package com.google.api.services.content.model;

/**
 * A batch entry encoding a single non-batch datafeeds request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DatafeedsCustomBatchRequestEntry extends com.google.api.client.json.GenericJson {

  /**
   * An entry ID, unique within the batch request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long batchId;

  /**
   * The data feed to insert.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Datafeed datafeed;

  /**
   * The ID of the data feed to get, delete or fetch.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger datafeedId;

  /**
   * The ID of the managing account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger merchantId;

  /**
   * The method of the batch entry.
   *
   * Acceptable values are:   - "delete"  - "fetchNow"  - "get"  - "insert"  - "update"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String method;

  /**
   * An entry ID, unique within the batch request.
   * @return value or {@code null} for none
   */
  public java.lang.Long getBatchId() {
    return batchId;
  }

  /**
   * An entry ID, unique within the batch request.
   * @param batchId batchId or {@code null} for none
   */
  public DatafeedsCustomBatchRequestEntry setBatchId(java.lang.Long batchId) {
    this.batchId = batchId;
    return this;
  }

  /**
   * The data feed to insert.
   * @return value or {@code null} for none
   */
  public Datafeed getDatafeed() {
    return datafeed;
  }

  /**
   * The data feed to insert.
   * @param datafeed datafeed or {@code null} for none
   */
  public DatafeedsCustomBatchRequestEntry setDatafeed(Datafeed datafeed) {
    this.datafeed = datafeed;
    return this;
  }

  /**
   * The ID of the data feed to get, delete or fetch.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getDatafeedId() {
    return datafeedId;
  }

  /**
   * The ID of the data feed to get, delete or fetch.
   * @param datafeedId datafeedId or {@code null} for none
   */
  public DatafeedsCustomBatchRequestEntry setDatafeedId(java.math.BigInteger datafeedId) {
    this.datafeedId = datafeedId;
    return this;
  }

  /**
   * The ID of the managing account.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getMerchantId() {
    return merchantId;
  }

  /**
   * The ID of the managing account.
   * @param merchantId merchantId or {@code null} for none
   */
  public DatafeedsCustomBatchRequestEntry setMerchantId(java.math.BigInteger merchantId) {
    this.merchantId = merchantId;
    return this;
  }

  /**
   * The method of the batch entry.
   *
   * Acceptable values are:   - "delete"  - "fetchNow"  - "get"  - "insert"  - "update"
   * @return value or {@code null} for none
   */
  public java.lang.String getMethod() {
    return method;
  }

  /**
   * The method of the batch entry.
   *
   * Acceptable values are:   - "delete"  - "fetchNow"  - "get"  - "insert"  - "update"
   * @param method method or {@code null} for none
   */
  public DatafeedsCustomBatchRequestEntry setMethod(java.lang.String method) {
    this.method = method;
    return this;
  }

  @Override
  public DatafeedsCustomBatchRequestEntry set(String fieldName, Object value) {
    return (DatafeedsCustomBatchRequestEntry) super.set(fieldName, value);
  }

  @Override
  public DatafeedsCustomBatchRequestEntry clone() {
    return (DatafeedsCustomBatchRequestEntry) super.clone();
  }

}
