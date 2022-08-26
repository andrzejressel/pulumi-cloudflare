// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.NotificationPolicyEmailIntegrationArgs;
import com.pulumi.cloudflare.inputs.NotificationPolicyFiltersArgs;
import com.pulumi.cloudflare.inputs.NotificationPolicyPagerdutyIntegrationArgs;
import com.pulumi.cloudflare.inputs.NotificationPolicyWebhooksIntegrationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NotificationPolicyState extends com.pulumi.resources.ResourceArgs {

    public static final NotificationPolicyState Empty = new NotificationPolicyState();

    /**
     * The account identifier to target for the resource.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return The account identifier to target for the resource.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * The event type that will trigger the dispatch of a notification. See the developer documentation for descriptions of [available alert types](https://developers.cloudflare.com/fundamentals/notifications/notification-available/) Available values: `billing_usage_alert`, `health_check_status_notification`, `g6_pool_toggle_alert`, `real_origin_monitoring`, `universal_ssl_event_type`, `bgp_hijack_notification`, `http_alert_origin_error`, `workers_alert`, `weekly_account_overview`, `expiring_service_token_alert`, `secondary_dns_all_primaries_failing`, `secondary_dns_zone_validation_warning`, `secondary_dns_primaries_failing`, `secondary_dns_zone_successfully_updated`, `dos_attack_l7`, `dos_attack_l4`, `advanced_ddos_attack_l7_alert`, `advanced_ddos_attack_l4_alert`, `fbm_volumetric_attack`, `fbm_auto_advertisement`, `load_balancing_pool_enablement_alert`, `load_balancing_health_alert`, `g6_health_alert`, `http_alert_edge_error`, `clickhouse_alert_fw_anomaly`, `clickhouse_alert_fw_ent_anomaly`, `failing_logpush_job_disabled_alert`, `scriptmonitor_alert_new_hosts`, `scriptmonitor_alert_new_scripts`, `scriptmonitor_alert_new_malicious_scripts`, `scriptmonitor_alert_new_malicious_url`, `scriptmonitor_alert_new_code_change_detections`, `scriptmonitor_alert_new_max_length_script_url`, `scriptmonitor_alert_new_malicious_hosts`, `sentinel_alert`, `hostname_aop_custom_certificate_expiration_type`, `stream_live_notifications`, `block_notification_new_block`, `block_notification_review_rejected`, `block_notification_review_accepted`, `web_analytics_metrics_update`, `workers_uptime`.
     * 
     */
    @Import(name="alertType")
    private @Nullable Output<String> alertType;

    /**
     * @return The event type that will trigger the dispatch of a notification. See the developer documentation for descriptions of [available alert types](https://developers.cloudflare.com/fundamentals/notifications/notification-available/) Available values: `billing_usage_alert`, `health_check_status_notification`, `g6_pool_toggle_alert`, `real_origin_monitoring`, `universal_ssl_event_type`, `bgp_hijack_notification`, `http_alert_origin_error`, `workers_alert`, `weekly_account_overview`, `expiring_service_token_alert`, `secondary_dns_all_primaries_failing`, `secondary_dns_zone_validation_warning`, `secondary_dns_primaries_failing`, `secondary_dns_zone_successfully_updated`, `dos_attack_l7`, `dos_attack_l4`, `advanced_ddos_attack_l7_alert`, `advanced_ddos_attack_l4_alert`, `fbm_volumetric_attack`, `fbm_auto_advertisement`, `load_balancing_pool_enablement_alert`, `load_balancing_health_alert`, `g6_health_alert`, `http_alert_edge_error`, `clickhouse_alert_fw_anomaly`, `clickhouse_alert_fw_ent_anomaly`, `failing_logpush_job_disabled_alert`, `scriptmonitor_alert_new_hosts`, `scriptmonitor_alert_new_scripts`, `scriptmonitor_alert_new_malicious_scripts`, `scriptmonitor_alert_new_malicious_url`, `scriptmonitor_alert_new_code_change_detections`, `scriptmonitor_alert_new_max_length_script_url`, `scriptmonitor_alert_new_malicious_hosts`, `sentinel_alert`, `hostname_aop_custom_certificate_expiration_type`, `stream_live_notifications`, `block_notification_new_block`, `block_notification_review_rejected`, `block_notification_review_accepted`, `web_analytics_metrics_update`, `workers_uptime`.
     * 
     */
    public Optional<Output<String>> alertType() {
        return Optional.ofNullable(this.alertType);
    }

    /**
     * When the notification policy was created.
     * 
     */
    @Import(name="created")
    private @Nullable Output<String> created;

    /**
     * @return When the notification policy was created.
     * 
     */
    public Optional<Output<String>> created() {
        return Optional.ofNullable(this.created);
    }

    /**
     * Description of the notification policy.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the notification policy.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The email id to which the notification should be dispatched. One of email, webhooks, or PagerDuty mechanisms is required.
     * 
     */
    @Import(name="emailIntegrations")
    private @Nullable Output<List<NotificationPolicyEmailIntegrationArgs>> emailIntegrations;

    /**
     * @return The email id to which the notification should be dispatched. One of email, webhooks, or PagerDuty mechanisms is required.
     * 
     */
    public Optional<Output<List<NotificationPolicyEmailIntegrationArgs>>> emailIntegrations() {
        return Optional.ofNullable(this.emailIntegrations);
    }

    /**
     * The status of the notification policy.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return The status of the notification policy.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * An optional nested block of filters that applies to the selected `alert_type`. A key-value map that specifies the type of filter and the values to match against (refer to the alert type block for available fields).
     * 
     */
    @Import(name="filters")
    private @Nullable Output<NotificationPolicyFiltersArgs> filters;

    /**
     * @return An optional nested block of filters that applies to the selected `alert_type`. A key-value map that specifies the type of filter and the values to match against (refer to the alert type block for available fields).
     * 
     */
    public Optional<Output<NotificationPolicyFiltersArgs>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * When the notification policy was last modified.
     * 
     */
    @Import(name="modified")
    private @Nullable Output<String> modified;

    /**
     * @return When the notification policy was last modified.
     * 
     */
    public Optional<Output<String>> modified() {
        return Optional.ofNullable(this.modified);
    }

    /**
     * The name of the notification policy.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the notification policy.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The unique id of a configured pagerduty endpoint to which the notification should be dispatched. One of email, webhooks, or PagerDuty mechanisms is required.
     * 
     */
    @Import(name="pagerdutyIntegrations")
    private @Nullable Output<List<NotificationPolicyPagerdutyIntegrationArgs>> pagerdutyIntegrations;

    /**
     * @return The unique id of a configured pagerduty endpoint to which the notification should be dispatched. One of email, webhooks, or PagerDuty mechanisms is required.
     * 
     */
    public Optional<Output<List<NotificationPolicyPagerdutyIntegrationArgs>>> pagerdutyIntegrations() {
        return Optional.ofNullable(this.pagerdutyIntegrations);
    }

    /**
     * The unique id of a configured webhooks endpoint to which the notification should be dispatched. One of email, webhooks, or PagerDuty mechanisms is required.
     * 
     */
    @Import(name="webhooksIntegrations")
    private @Nullable Output<List<NotificationPolicyWebhooksIntegrationArgs>> webhooksIntegrations;

    /**
     * @return The unique id of a configured webhooks endpoint to which the notification should be dispatched. One of email, webhooks, or PagerDuty mechanisms is required.
     * 
     */
    public Optional<Output<List<NotificationPolicyWebhooksIntegrationArgs>>> webhooksIntegrations() {
        return Optional.ofNullable(this.webhooksIntegrations);
    }

    private NotificationPolicyState() {}

    private NotificationPolicyState(NotificationPolicyState $) {
        this.accountId = $.accountId;
        this.alertType = $.alertType;
        this.created = $.created;
        this.description = $.description;
        this.emailIntegrations = $.emailIntegrations;
        this.enabled = $.enabled;
        this.filters = $.filters;
        this.modified = $.modified;
        this.name = $.name;
        this.pagerdutyIntegrations = $.pagerdutyIntegrations;
        this.webhooksIntegrations = $.webhooksIntegrations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NotificationPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NotificationPolicyState $;

        public Builder() {
            $ = new NotificationPolicyState();
        }

        public Builder(NotificationPolicyState defaults) {
            $ = new NotificationPolicyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The account identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param alertType The event type that will trigger the dispatch of a notification. See the developer documentation for descriptions of [available alert types](https://developers.cloudflare.com/fundamentals/notifications/notification-available/) Available values: `billing_usage_alert`, `health_check_status_notification`, `g6_pool_toggle_alert`, `real_origin_monitoring`, `universal_ssl_event_type`, `bgp_hijack_notification`, `http_alert_origin_error`, `workers_alert`, `weekly_account_overview`, `expiring_service_token_alert`, `secondary_dns_all_primaries_failing`, `secondary_dns_zone_validation_warning`, `secondary_dns_primaries_failing`, `secondary_dns_zone_successfully_updated`, `dos_attack_l7`, `dos_attack_l4`, `advanced_ddos_attack_l7_alert`, `advanced_ddos_attack_l4_alert`, `fbm_volumetric_attack`, `fbm_auto_advertisement`, `load_balancing_pool_enablement_alert`, `load_balancing_health_alert`, `g6_health_alert`, `http_alert_edge_error`, `clickhouse_alert_fw_anomaly`, `clickhouse_alert_fw_ent_anomaly`, `failing_logpush_job_disabled_alert`, `scriptmonitor_alert_new_hosts`, `scriptmonitor_alert_new_scripts`, `scriptmonitor_alert_new_malicious_scripts`, `scriptmonitor_alert_new_malicious_url`, `scriptmonitor_alert_new_code_change_detections`, `scriptmonitor_alert_new_max_length_script_url`, `scriptmonitor_alert_new_malicious_hosts`, `sentinel_alert`, `hostname_aop_custom_certificate_expiration_type`, `stream_live_notifications`, `block_notification_new_block`, `block_notification_review_rejected`, `block_notification_review_accepted`, `web_analytics_metrics_update`, `workers_uptime`.
         * 
         * @return builder
         * 
         */
        public Builder alertType(@Nullable Output<String> alertType) {
            $.alertType = alertType;
            return this;
        }

        /**
         * @param alertType The event type that will trigger the dispatch of a notification. See the developer documentation for descriptions of [available alert types](https://developers.cloudflare.com/fundamentals/notifications/notification-available/) Available values: `billing_usage_alert`, `health_check_status_notification`, `g6_pool_toggle_alert`, `real_origin_monitoring`, `universal_ssl_event_type`, `bgp_hijack_notification`, `http_alert_origin_error`, `workers_alert`, `weekly_account_overview`, `expiring_service_token_alert`, `secondary_dns_all_primaries_failing`, `secondary_dns_zone_validation_warning`, `secondary_dns_primaries_failing`, `secondary_dns_zone_successfully_updated`, `dos_attack_l7`, `dos_attack_l4`, `advanced_ddos_attack_l7_alert`, `advanced_ddos_attack_l4_alert`, `fbm_volumetric_attack`, `fbm_auto_advertisement`, `load_balancing_pool_enablement_alert`, `load_balancing_health_alert`, `g6_health_alert`, `http_alert_edge_error`, `clickhouse_alert_fw_anomaly`, `clickhouse_alert_fw_ent_anomaly`, `failing_logpush_job_disabled_alert`, `scriptmonitor_alert_new_hosts`, `scriptmonitor_alert_new_scripts`, `scriptmonitor_alert_new_malicious_scripts`, `scriptmonitor_alert_new_malicious_url`, `scriptmonitor_alert_new_code_change_detections`, `scriptmonitor_alert_new_max_length_script_url`, `scriptmonitor_alert_new_malicious_hosts`, `sentinel_alert`, `hostname_aop_custom_certificate_expiration_type`, `stream_live_notifications`, `block_notification_new_block`, `block_notification_review_rejected`, `block_notification_review_accepted`, `web_analytics_metrics_update`, `workers_uptime`.
         * 
         * @return builder
         * 
         */
        public Builder alertType(String alertType) {
            return alertType(Output.of(alertType));
        }

        /**
         * @param created When the notification policy was created.
         * 
         * @return builder
         * 
         */
        public Builder created(@Nullable Output<String> created) {
            $.created = created;
            return this;
        }

        /**
         * @param created When the notification policy was created.
         * 
         * @return builder
         * 
         */
        public Builder created(String created) {
            return created(Output.of(created));
        }

        /**
         * @param description Description of the notification policy.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the notification policy.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param emailIntegrations The email id to which the notification should be dispatched. One of email, webhooks, or PagerDuty mechanisms is required.
         * 
         * @return builder
         * 
         */
        public Builder emailIntegrations(@Nullable Output<List<NotificationPolicyEmailIntegrationArgs>> emailIntegrations) {
            $.emailIntegrations = emailIntegrations;
            return this;
        }

        /**
         * @param emailIntegrations The email id to which the notification should be dispatched. One of email, webhooks, or PagerDuty mechanisms is required.
         * 
         * @return builder
         * 
         */
        public Builder emailIntegrations(List<NotificationPolicyEmailIntegrationArgs> emailIntegrations) {
            return emailIntegrations(Output.of(emailIntegrations));
        }

        /**
         * @param emailIntegrations The email id to which the notification should be dispatched. One of email, webhooks, or PagerDuty mechanisms is required.
         * 
         * @return builder
         * 
         */
        public Builder emailIntegrations(NotificationPolicyEmailIntegrationArgs... emailIntegrations) {
            return emailIntegrations(List.of(emailIntegrations));
        }

        /**
         * @param enabled The status of the notification policy.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled The status of the notification policy.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param filters An optional nested block of filters that applies to the selected `alert_type`. A key-value map that specifies the type of filter and the values to match against (refer to the alert type block for available fields).
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable Output<NotificationPolicyFiltersArgs> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters An optional nested block of filters that applies to the selected `alert_type`. A key-value map that specifies the type of filter and the values to match against (refer to the alert type block for available fields).
         * 
         * @return builder
         * 
         */
        public Builder filters(NotificationPolicyFiltersArgs filters) {
            return filters(Output.of(filters));
        }

        /**
         * @param modified When the notification policy was last modified.
         * 
         * @return builder
         * 
         */
        public Builder modified(@Nullable Output<String> modified) {
            $.modified = modified;
            return this;
        }

        /**
         * @param modified When the notification policy was last modified.
         * 
         * @return builder
         * 
         */
        public Builder modified(String modified) {
            return modified(Output.of(modified));
        }

        /**
         * @param name The name of the notification policy.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the notification policy.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param pagerdutyIntegrations The unique id of a configured pagerduty endpoint to which the notification should be dispatched. One of email, webhooks, or PagerDuty mechanisms is required.
         * 
         * @return builder
         * 
         */
        public Builder pagerdutyIntegrations(@Nullable Output<List<NotificationPolicyPagerdutyIntegrationArgs>> pagerdutyIntegrations) {
            $.pagerdutyIntegrations = pagerdutyIntegrations;
            return this;
        }

        /**
         * @param pagerdutyIntegrations The unique id of a configured pagerduty endpoint to which the notification should be dispatched. One of email, webhooks, or PagerDuty mechanisms is required.
         * 
         * @return builder
         * 
         */
        public Builder pagerdutyIntegrations(List<NotificationPolicyPagerdutyIntegrationArgs> pagerdutyIntegrations) {
            return pagerdutyIntegrations(Output.of(pagerdutyIntegrations));
        }

        /**
         * @param pagerdutyIntegrations The unique id of a configured pagerduty endpoint to which the notification should be dispatched. One of email, webhooks, or PagerDuty mechanisms is required.
         * 
         * @return builder
         * 
         */
        public Builder pagerdutyIntegrations(NotificationPolicyPagerdutyIntegrationArgs... pagerdutyIntegrations) {
            return pagerdutyIntegrations(List.of(pagerdutyIntegrations));
        }

        /**
         * @param webhooksIntegrations The unique id of a configured webhooks endpoint to which the notification should be dispatched. One of email, webhooks, or PagerDuty mechanisms is required.
         * 
         * @return builder
         * 
         */
        public Builder webhooksIntegrations(@Nullable Output<List<NotificationPolicyWebhooksIntegrationArgs>> webhooksIntegrations) {
            $.webhooksIntegrations = webhooksIntegrations;
            return this;
        }

        /**
         * @param webhooksIntegrations The unique id of a configured webhooks endpoint to which the notification should be dispatched. One of email, webhooks, or PagerDuty mechanisms is required.
         * 
         * @return builder
         * 
         */
        public Builder webhooksIntegrations(List<NotificationPolicyWebhooksIntegrationArgs> webhooksIntegrations) {
            return webhooksIntegrations(Output.of(webhooksIntegrations));
        }

        /**
         * @param webhooksIntegrations The unique id of a configured webhooks endpoint to which the notification should be dispatched. One of email, webhooks, or PagerDuty mechanisms is required.
         * 
         * @return builder
         * 
         */
        public Builder webhooksIntegrations(NotificationPolicyWebhooksIntegrationArgs... webhooksIntegrations) {
            return webhooksIntegrations(List.of(webhooksIntegrations));
        }

        public NotificationPolicyState build() {
            return $;
        }
    }

}
