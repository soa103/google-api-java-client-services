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

package com.google.api.services.dialogflow.v2.model;

/**
 * The response message for a webhook call.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2WebhookResponse extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Makes the platform immediately invoke another `DetectIntent` call internally with the
   * specified event as input. When this field is set, Dialogflow ignores the `fulfillment_text`,
   * `fulfillment_messages`, and `payload` fields.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowV2EventInput followupEventInput;

  /**
   * Optional. The collection of rich messages to present to the user. This value is passed directly
   * to `QueryResult.fulfillment_messages`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDialogflowV2IntentMessage> fulfillmentMessages;

  static {
    // hack to force ProGuard to consider GoogleCloudDialogflowV2IntentMessage used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudDialogflowV2IntentMessage.class);
  }

  /**
   * Optional. The text to be shown on the screen. This value is passed directly to
   * `QueryResult.fulfillment_text`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fulfillmentText;

  /**
   * Optional. The collection of output contexts. This value is passed directly to
   * `QueryResult.output_contexts`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDialogflowV2Context> outputContexts;

  static {
    // hack to force ProGuard to consider GoogleCloudDialogflowV2Context used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudDialogflowV2Context.class);
  }

  /**
   * Optional. This value is passed directly to `QueryResult.webhook_payload`. See the related
   * `fulfillment_messages[i].payload field`, which may be used as an alternative to this field.
   *
   * This field can be used for Actions on Google responses. It should have a structure similar to
   * the JSON message shown here. For more information, see [Actions on Google Webhook
   * Format](https://developers.google.com/actions/dialogflow/webhook) {   "google": {
   * "expectUserResponse": true,     "richResponse": {       "items": [         {
   * "simpleResponse": {             "textToSpeech": "this is a simple response"           }
   * }       ]     }   } }
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> payload;

  /**
   * Optional. This value is passed directly to `QueryResult.webhook_source`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String source;

  /**
   * Optional. Makes the platform immediately invoke another `DetectIntent` call internally with the
   * specified event as input. When this field is set, Dialogflow ignores the `fulfillment_text`,
   * `fulfillment_messages`, and `payload` fields.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowV2EventInput getFollowupEventInput() {
    return followupEventInput;
  }

  /**
   * Optional. Makes the platform immediately invoke another `DetectIntent` call internally with the
   * specified event as input. When this field is set, Dialogflow ignores the `fulfillment_text`,
   * `fulfillment_messages`, and `payload` fields.
   * @param followupEventInput followupEventInput or {@code null} for none
   */
  public GoogleCloudDialogflowV2WebhookResponse setFollowupEventInput(GoogleCloudDialogflowV2EventInput followupEventInput) {
    this.followupEventInput = followupEventInput;
    return this;
  }

  /**
   * Optional. The collection of rich messages to present to the user. This value is passed directly
   * to `QueryResult.fulfillment_messages`.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDialogflowV2IntentMessage> getFulfillmentMessages() {
    return fulfillmentMessages;
  }

  /**
   * Optional. The collection of rich messages to present to the user. This value is passed directly
   * to `QueryResult.fulfillment_messages`.
   * @param fulfillmentMessages fulfillmentMessages or {@code null} for none
   */
  public GoogleCloudDialogflowV2WebhookResponse setFulfillmentMessages(java.util.List<GoogleCloudDialogflowV2IntentMessage> fulfillmentMessages) {
    this.fulfillmentMessages = fulfillmentMessages;
    return this;
  }

  /**
   * Optional. The text to be shown on the screen. This value is passed directly to
   * `QueryResult.fulfillment_text`.
   * @return value or {@code null} for none
   */
  public java.lang.String getFulfillmentText() {
    return fulfillmentText;
  }

  /**
   * Optional. The text to be shown on the screen. This value is passed directly to
   * `QueryResult.fulfillment_text`.
   * @param fulfillmentText fulfillmentText or {@code null} for none
   */
  public GoogleCloudDialogflowV2WebhookResponse setFulfillmentText(java.lang.String fulfillmentText) {
    this.fulfillmentText = fulfillmentText;
    return this;
  }

  /**
   * Optional. The collection of output contexts. This value is passed directly to
   * `QueryResult.output_contexts`.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDialogflowV2Context> getOutputContexts() {
    return outputContexts;
  }

  /**
   * Optional. The collection of output contexts. This value is passed directly to
   * `QueryResult.output_contexts`.
   * @param outputContexts outputContexts or {@code null} for none
   */
  public GoogleCloudDialogflowV2WebhookResponse setOutputContexts(java.util.List<GoogleCloudDialogflowV2Context> outputContexts) {
    this.outputContexts = outputContexts;
    return this;
  }

  /**
   * Optional. This value is passed directly to `QueryResult.webhook_payload`. See the related
   * `fulfillment_messages[i].payload field`, which may be used as an alternative to this field.
   *
   * This field can be used for Actions on Google responses. It should have a structure similar to
   * the JSON message shown here. For more information, see [Actions on Google Webhook
   * Format](https://developers.google.com/actions/dialogflow/webhook) {   "google": {
   * "expectUserResponse": true,     "richResponse": {       "items": [         {
   * "simpleResponse": {             "textToSpeech": "this is a simple response"           }
   * }       ]     }   } }
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getPayload() {
    return payload;
  }

  /**
   * Optional. This value is passed directly to `QueryResult.webhook_payload`. See the related
   * `fulfillment_messages[i].payload field`, which may be used as an alternative to this field.
   *
   * This field can be used for Actions on Google responses. It should have a structure similar to
   * the JSON message shown here. For more information, see [Actions on Google Webhook
   * Format](https://developers.google.com/actions/dialogflow/webhook) {   "google": {
   * "expectUserResponse": true,     "richResponse": {       "items": [         {
   * "simpleResponse": {             "textToSpeech": "this is a simple response"           }
   * }       ]     }   } }
   * @param payload payload or {@code null} for none
   */
  public GoogleCloudDialogflowV2WebhookResponse setPayload(java.util.Map<String, java.lang.Object> payload) {
    this.payload = payload;
    return this;
  }

  /**
   * Optional. This value is passed directly to `QueryResult.webhook_source`.
   * @return value or {@code null} for none
   */
  public java.lang.String getSource() {
    return source;
  }

  /**
   * Optional. This value is passed directly to `QueryResult.webhook_source`.
   * @param source source or {@code null} for none
   */
  public GoogleCloudDialogflowV2WebhookResponse setSource(java.lang.String source) {
    this.source = source;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2WebhookResponse set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2WebhookResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2WebhookResponse clone() {
    return (GoogleCloudDialogflowV2WebhookResponse) super.clone();
  }

}
