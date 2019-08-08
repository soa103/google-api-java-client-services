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

package com.google.api.services.bigtableadmin.v2.model;

/**
 * Rule for determining which cells to delete during garbage collection.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Bigtable Admin API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GcRule extends com.google.api.client.json.GenericJson {

  /**
   * Delete cells that would be deleted by every nested rule.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Intersection intersection;

  /**
   * Delete cells in a column older than the given age. Values must be at least one millisecond, and
   * will be truncated to microsecond granularity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String maxAge;

  /**
   * Delete all cells in a column except the most recent N.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer maxNumVersions;

  /**
   * Delete cells that would be deleted by any nested rule.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Union union;

  /**
   * Delete cells that would be deleted by every nested rule.
   * @return value or {@code null} for none
   */
  public Intersection getIntersection() {
    return intersection;
  }

  /**
   * Delete cells that would be deleted by every nested rule.
   * @param intersection intersection or {@code null} for none
   */
  public GcRule setIntersection(Intersection intersection) {
    this.intersection = intersection;
    return this;
  }

  /**
   * Delete cells in a column older than the given age. Values must be at least one millisecond, and
   * will be truncated to microsecond granularity.
   * @return value or {@code null} for none
   */
  public String getMaxAge() {
    return maxAge;
  }

  /**
   * Delete cells in a column older than the given age. Values must be at least one millisecond, and
   * will be truncated to microsecond granularity.
   * @param maxAge maxAge or {@code null} for none
   */
  public GcRule setMaxAge(String maxAge) {
    this.maxAge = maxAge;
    return this;
  }

  /**
   * Delete all cells in a column except the most recent N.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMaxNumVersions() {
    return maxNumVersions;
  }

  /**
   * Delete all cells in a column except the most recent N.
   * @param maxNumVersions maxNumVersions or {@code null} for none
   */
  public GcRule setMaxNumVersions(java.lang.Integer maxNumVersions) {
    this.maxNumVersions = maxNumVersions;
    return this;
  }

  /**
   * Delete cells that would be deleted by any nested rule.
   * @return value or {@code null} for none
   */
  public Union getUnion() {
    return union;
  }

  /**
   * Delete cells that would be deleted by any nested rule.
   * @param union union or {@code null} for none
   */
  public GcRule setUnion(Union union) {
    this.union = union;
    return this;
  }

  @Override
  public GcRule set(String fieldName, Object value) {
    return (GcRule) super.set(fieldName, value);
  }

  @Override
  public GcRule clone() {
    return (GcRule) super.clone();
  }

}
