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
 * Model definition for AccountsLinkRequest.
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
public final class AccountsLinkRequest extends com.google.api.client.json.GenericJson {

  /**
   * Action to perform for this link. The "request" action is only available to select merchants.
   *
   * Acceptable values are:   - "approve"  - "remove"  - "request"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String action;

  /**
   * Type of the link between the two accounts.
   *
   * Acceptable values are:   - "channelPartner"  - "eCommercePlatform"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String linkType;

  /**
   * The ID of the linked account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String linkedAccountId;

  /**
   * Action to perform for this link. The "request" action is only available to select merchants.
   *
   * Acceptable values are:   - "approve"  - "remove"  - "request"
   * @return value or {@code null} for none
   */
  public java.lang.String getAction() {
    return action;
  }

  /**
   * Action to perform for this link. The "request" action is only available to select merchants.
   *
   * Acceptable values are:   - "approve"  - "remove"  - "request"
   * @param action action or {@code null} for none
   */
  public AccountsLinkRequest setAction(java.lang.String action) {
    this.action = action;
    return this;
  }

  /**
   * Type of the link between the two accounts.
   *
   * Acceptable values are:   - "channelPartner"  - "eCommercePlatform"
   * @return value or {@code null} for none
   */
  public java.lang.String getLinkType() {
    return linkType;
  }

  /**
   * Type of the link between the two accounts.
   *
   * Acceptable values are:   - "channelPartner"  - "eCommercePlatform"
   * @param linkType linkType or {@code null} for none
   */
  public AccountsLinkRequest setLinkType(java.lang.String linkType) {
    this.linkType = linkType;
    return this;
  }

  /**
   * The ID of the linked account.
   * @return value or {@code null} for none
   */
  public java.lang.String getLinkedAccountId() {
    return linkedAccountId;
  }

  /**
   * The ID of the linked account.
   * @param linkedAccountId linkedAccountId or {@code null} for none
   */
  public AccountsLinkRequest setLinkedAccountId(java.lang.String linkedAccountId) {
    this.linkedAccountId = linkedAccountId;
    return this;
  }

  @Override
  public AccountsLinkRequest set(String fieldName, Object value) {
    return (AccountsLinkRequest) super.set(fieldName, value);
  }

  @Override
  public AccountsLinkRequest clone() {
    return (AccountsLinkRequest) super.clone();
  }

}
