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
 * Model definition for OrderLineItemShippingDetailsMethod.
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
public final class OrderLineItemShippingDetailsMethod extends com.google.api.client.json.GenericJson {

  /**
   * The carrier for the shipping. Optional. See shipments[].carrier for a list of acceptable
   * values.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String carrier;

  /**
   * Required. Maximum transit time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long maxDaysInTransit;

  /**
   * Required. The name of the shipping method.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String methodName;

  /**
   * Required. Minimum transit time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long minDaysInTransit;

  /**
   * The carrier for the shipping. Optional. See shipments[].carrier for a list of acceptable
   * values.
   * @return value or {@code null} for none
   */
  public java.lang.String getCarrier() {
    return carrier;
  }

  /**
   * The carrier for the shipping. Optional. See shipments[].carrier for a list of acceptable
   * values.
   * @param carrier carrier or {@code null} for none
   */
  public OrderLineItemShippingDetailsMethod setCarrier(java.lang.String carrier) {
    this.carrier = carrier;
    return this;
  }

  /**
   * Required. Maximum transit time.
   * @return value or {@code null} for none
   */
  public java.lang.Long getMaxDaysInTransit() {
    return maxDaysInTransit;
  }

  /**
   * Required. Maximum transit time.
   * @param maxDaysInTransit maxDaysInTransit or {@code null} for none
   */
  public OrderLineItemShippingDetailsMethod setMaxDaysInTransit(java.lang.Long maxDaysInTransit) {
    this.maxDaysInTransit = maxDaysInTransit;
    return this;
  }

  /**
   * Required. The name of the shipping method.
   * @return value or {@code null} for none
   */
  public java.lang.String getMethodName() {
    return methodName;
  }

  /**
   * Required. The name of the shipping method.
   * @param methodName methodName or {@code null} for none
   */
  public OrderLineItemShippingDetailsMethod setMethodName(java.lang.String methodName) {
    this.methodName = methodName;
    return this;
  }

  /**
   * Required. Minimum transit time.
   * @return value or {@code null} for none
   */
  public java.lang.Long getMinDaysInTransit() {
    return minDaysInTransit;
  }

  /**
   * Required. Minimum transit time.
   * @param minDaysInTransit minDaysInTransit or {@code null} for none
   */
  public OrderLineItemShippingDetailsMethod setMinDaysInTransit(java.lang.Long minDaysInTransit) {
    this.minDaysInTransit = minDaysInTransit;
    return this;
  }

  @Override
  public OrderLineItemShippingDetailsMethod set(String fieldName, Object value) {
    return (OrderLineItemShippingDetailsMethod) super.set(fieldName, value);
  }

  @Override
  public OrderLineItemShippingDetailsMethod clone() {
    return (OrderLineItemShippingDetailsMethod) super.clone();
  }

}
