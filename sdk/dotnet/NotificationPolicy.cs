// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    /// <summary>
    /// Provides a resource, that manages a notification policy for
    /// Cloudflare's products. The delivery mechanisms supported are email,
    /// webhooks, and PagerDuty.
    /// 
    /// ## Import
    /// 
    /// ```sh
    ///  $ pulumi import cloudflare:index/notificationPolicy:NotificationPolicy example &lt;account_id&gt;/&lt;policy_id&gt;
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/notificationPolicy:NotificationPolicy")]
    public partial class NotificationPolicy : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        /// <summary>
        /// The event type that will trigger the dispatch of a notification. See the developer documentation for descriptions of [available alert types](https://developers.cloudflare.com/fundamentals/notifications/notification-available/) Available values: `billing_usage_alert`, `health_check_status_notification`, `g6_pool_toggle_alert`, `real_origin_monitoring`, `universal_ssl_event_type`, `bgp_hijack_notification`, `http_alert_origin_error`, `workers_alert`, `weekly_account_overview`, `expiring_service_token_alert`, `secondary_dns_all_primaries_failing`, `secondary_dns_zone_validation_warning`, `secondary_dns_primaries_failing`, `secondary_dns_zone_successfully_updated`, `dos_attack_l7`, `dos_attack_l4`, `advanced_ddos_attack_l7_alert`, `advanced_ddos_attack_l4_alert`, `fbm_volumetric_attack`, `fbm_auto_advertisement`, `load_balancing_pool_enablement_alert`, `load_balancing_health_alert`, `g6_health_alert`, `http_alert_edge_error`, `clickhouse_alert_fw_anomaly`, `clickhouse_alert_fw_ent_anomaly`, `failing_logpush_job_disabled_alert`, `scriptmonitor_alert_new_hosts`, `scriptmonitor_alert_new_scripts`, `scriptmonitor_alert_new_malicious_scripts`, `scriptmonitor_alert_new_malicious_url`, `scriptmonitor_alert_new_code_change_detections`, `scriptmonitor_alert_new_max_length_script_url`, `scriptmonitor_alert_new_malicious_hosts`, `sentinel_alert`, `hostname_aop_custom_certificate_expiration_type`, `stream_live_notifications`, `block_notification_new_block`, `block_notification_review_rejected`, `block_notification_review_accepted`, `web_analytics_metrics_update`, `workers_uptime`.
        /// </summary>
        [Output("alertType")]
        public Output<string> AlertType { get; private set; } = null!;

        /// <summary>
        /// When the notification policy was created.
        /// </summary>
        [Output("created")]
        public Output<string> Created { get; private set; } = null!;

        /// <summary>
        /// Description of the notification policy.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The email id to which the notification should be dispatched. One of email, webhooks, or PagerDuty mechanisms is required.
        /// </summary>
        [Output("emailIntegrations")]
        public Output<ImmutableArray<Outputs.NotificationPolicyEmailIntegration>> EmailIntegrations { get; private set; } = null!;

        /// <summary>
        /// The status of the notification policy.
        /// </summary>
        [Output("enabled")]
        public Output<bool> Enabled { get; private set; } = null!;

        /// <summary>
        /// An optional nested block of filters that applies to the selected `alert_type`. A key-value map that specifies the type of filter and the values to match against (refer to the alert type block for available fields).
        /// </summary>
        [Output("filters")]
        public Output<Outputs.NotificationPolicyFilters?> Filters { get; private set; } = null!;

        /// <summary>
        /// When the notification policy was last modified.
        /// </summary>
        [Output("modified")]
        public Output<string> Modified { get; private set; } = null!;

        /// <summary>
        /// The name of the notification policy.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The unique id of a configured pagerduty endpoint to which the notification should be dispatched. One of email, webhooks, or PagerDuty mechanisms is required.
        /// </summary>
        [Output("pagerdutyIntegrations")]
        public Output<ImmutableArray<Outputs.NotificationPolicyPagerdutyIntegration>> PagerdutyIntegrations { get; private set; } = null!;

        /// <summary>
        /// The unique id of a configured webhooks endpoint to which the notification should be dispatched. One of email, webhooks, or PagerDuty mechanisms is required.
        /// </summary>
        [Output("webhooksIntegrations")]
        public Output<ImmutableArray<Outputs.NotificationPolicyWebhooksIntegration>> WebhooksIntegrations { get; private set; } = null!;


        /// <summary>
        /// Create a NotificationPolicy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public NotificationPolicy(string name, NotificationPolicyArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/notificationPolicy:NotificationPolicy", name, args ?? new NotificationPolicyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private NotificationPolicy(string name, Input<string> id, NotificationPolicyState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/notificationPolicy:NotificationPolicy", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing NotificationPolicy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static NotificationPolicy Get(string name, Input<string> id, NotificationPolicyState? state = null, CustomResourceOptions? options = null)
        {
            return new NotificationPolicy(name, id, state, options);
        }
    }

    public sealed class NotificationPolicyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        /// <summary>
        /// The event type that will trigger the dispatch of a notification. See the developer documentation for descriptions of [available alert types](https://developers.cloudflare.com/fundamentals/notifications/notification-available/) Available values: `billing_usage_alert`, `health_check_status_notification`, `g6_pool_toggle_alert`, `real_origin_monitoring`, `universal_ssl_event_type`, `bgp_hijack_notification`, `http_alert_origin_error`, `workers_alert`, `weekly_account_overview`, `expiring_service_token_alert`, `secondary_dns_all_primaries_failing`, `secondary_dns_zone_validation_warning`, `secondary_dns_primaries_failing`, `secondary_dns_zone_successfully_updated`, `dos_attack_l7`, `dos_attack_l4`, `advanced_ddos_attack_l7_alert`, `advanced_ddos_attack_l4_alert`, `fbm_volumetric_attack`, `fbm_auto_advertisement`, `load_balancing_pool_enablement_alert`, `load_balancing_health_alert`, `g6_health_alert`, `http_alert_edge_error`, `clickhouse_alert_fw_anomaly`, `clickhouse_alert_fw_ent_anomaly`, `failing_logpush_job_disabled_alert`, `scriptmonitor_alert_new_hosts`, `scriptmonitor_alert_new_scripts`, `scriptmonitor_alert_new_malicious_scripts`, `scriptmonitor_alert_new_malicious_url`, `scriptmonitor_alert_new_code_change_detections`, `scriptmonitor_alert_new_max_length_script_url`, `scriptmonitor_alert_new_malicious_hosts`, `sentinel_alert`, `hostname_aop_custom_certificate_expiration_type`, `stream_live_notifications`, `block_notification_new_block`, `block_notification_review_rejected`, `block_notification_review_accepted`, `web_analytics_metrics_update`, `workers_uptime`.
        /// </summary>
        [Input("alertType", required: true)]
        public Input<string> AlertType { get; set; } = null!;

        /// <summary>
        /// Description of the notification policy.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("emailIntegrations")]
        private InputList<Inputs.NotificationPolicyEmailIntegrationArgs>? _emailIntegrations;

        /// <summary>
        /// The email id to which the notification should be dispatched. One of email, webhooks, or PagerDuty mechanisms is required.
        /// </summary>
        public InputList<Inputs.NotificationPolicyEmailIntegrationArgs> EmailIntegrations
        {
            get => _emailIntegrations ?? (_emailIntegrations = new InputList<Inputs.NotificationPolicyEmailIntegrationArgs>());
            set => _emailIntegrations = value;
        }

        /// <summary>
        /// The status of the notification policy.
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        /// <summary>
        /// An optional nested block of filters that applies to the selected `alert_type`. A key-value map that specifies the type of filter and the values to match against (refer to the alert type block for available fields).
        /// </summary>
        [Input("filters")]
        public Input<Inputs.NotificationPolicyFiltersArgs>? Filters { get; set; }

        /// <summary>
        /// The name of the notification policy.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("pagerdutyIntegrations")]
        private InputList<Inputs.NotificationPolicyPagerdutyIntegrationArgs>? _pagerdutyIntegrations;

        /// <summary>
        /// The unique id of a configured pagerduty endpoint to which the notification should be dispatched. One of email, webhooks, or PagerDuty mechanisms is required.
        /// </summary>
        public InputList<Inputs.NotificationPolicyPagerdutyIntegrationArgs> PagerdutyIntegrations
        {
            get => _pagerdutyIntegrations ?? (_pagerdutyIntegrations = new InputList<Inputs.NotificationPolicyPagerdutyIntegrationArgs>());
            set => _pagerdutyIntegrations = value;
        }

        [Input("webhooksIntegrations")]
        private InputList<Inputs.NotificationPolicyWebhooksIntegrationArgs>? _webhooksIntegrations;

        /// <summary>
        /// The unique id of a configured webhooks endpoint to which the notification should be dispatched. One of email, webhooks, or PagerDuty mechanisms is required.
        /// </summary>
        public InputList<Inputs.NotificationPolicyWebhooksIntegrationArgs> WebhooksIntegrations
        {
            get => _webhooksIntegrations ?? (_webhooksIntegrations = new InputList<Inputs.NotificationPolicyWebhooksIntegrationArgs>());
            set => _webhooksIntegrations = value;
        }

        public NotificationPolicyArgs()
        {
        }
        public static new NotificationPolicyArgs Empty => new NotificationPolicyArgs();
    }

    public sealed class NotificationPolicyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// The event type that will trigger the dispatch of a notification. See the developer documentation for descriptions of [available alert types](https://developers.cloudflare.com/fundamentals/notifications/notification-available/) Available values: `billing_usage_alert`, `health_check_status_notification`, `g6_pool_toggle_alert`, `real_origin_monitoring`, `universal_ssl_event_type`, `bgp_hijack_notification`, `http_alert_origin_error`, `workers_alert`, `weekly_account_overview`, `expiring_service_token_alert`, `secondary_dns_all_primaries_failing`, `secondary_dns_zone_validation_warning`, `secondary_dns_primaries_failing`, `secondary_dns_zone_successfully_updated`, `dos_attack_l7`, `dos_attack_l4`, `advanced_ddos_attack_l7_alert`, `advanced_ddos_attack_l4_alert`, `fbm_volumetric_attack`, `fbm_auto_advertisement`, `load_balancing_pool_enablement_alert`, `load_balancing_health_alert`, `g6_health_alert`, `http_alert_edge_error`, `clickhouse_alert_fw_anomaly`, `clickhouse_alert_fw_ent_anomaly`, `failing_logpush_job_disabled_alert`, `scriptmonitor_alert_new_hosts`, `scriptmonitor_alert_new_scripts`, `scriptmonitor_alert_new_malicious_scripts`, `scriptmonitor_alert_new_malicious_url`, `scriptmonitor_alert_new_code_change_detections`, `scriptmonitor_alert_new_max_length_script_url`, `scriptmonitor_alert_new_malicious_hosts`, `sentinel_alert`, `hostname_aop_custom_certificate_expiration_type`, `stream_live_notifications`, `block_notification_new_block`, `block_notification_review_rejected`, `block_notification_review_accepted`, `web_analytics_metrics_update`, `workers_uptime`.
        /// </summary>
        [Input("alertType")]
        public Input<string>? AlertType { get; set; }

        /// <summary>
        /// When the notification policy was created.
        /// </summary>
        [Input("created")]
        public Input<string>? Created { get; set; }

        /// <summary>
        /// Description of the notification policy.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("emailIntegrations")]
        private InputList<Inputs.NotificationPolicyEmailIntegrationGetArgs>? _emailIntegrations;

        /// <summary>
        /// The email id to which the notification should be dispatched. One of email, webhooks, or PagerDuty mechanisms is required.
        /// </summary>
        public InputList<Inputs.NotificationPolicyEmailIntegrationGetArgs> EmailIntegrations
        {
            get => _emailIntegrations ?? (_emailIntegrations = new InputList<Inputs.NotificationPolicyEmailIntegrationGetArgs>());
            set => _emailIntegrations = value;
        }

        /// <summary>
        /// The status of the notification policy.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// An optional nested block of filters that applies to the selected `alert_type`. A key-value map that specifies the type of filter and the values to match against (refer to the alert type block for available fields).
        /// </summary>
        [Input("filters")]
        public Input<Inputs.NotificationPolicyFiltersGetArgs>? Filters { get; set; }

        /// <summary>
        /// When the notification policy was last modified.
        /// </summary>
        [Input("modified")]
        public Input<string>? Modified { get; set; }

        /// <summary>
        /// The name of the notification policy.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("pagerdutyIntegrations")]
        private InputList<Inputs.NotificationPolicyPagerdutyIntegrationGetArgs>? _pagerdutyIntegrations;

        /// <summary>
        /// The unique id of a configured pagerduty endpoint to which the notification should be dispatched. One of email, webhooks, or PagerDuty mechanisms is required.
        /// </summary>
        public InputList<Inputs.NotificationPolicyPagerdutyIntegrationGetArgs> PagerdutyIntegrations
        {
            get => _pagerdutyIntegrations ?? (_pagerdutyIntegrations = new InputList<Inputs.NotificationPolicyPagerdutyIntegrationGetArgs>());
            set => _pagerdutyIntegrations = value;
        }

        [Input("webhooksIntegrations")]
        private InputList<Inputs.NotificationPolicyWebhooksIntegrationGetArgs>? _webhooksIntegrations;

        /// <summary>
        /// The unique id of a configured webhooks endpoint to which the notification should be dispatched. One of email, webhooks, or PagerDuty mechanisms is required.
        /// </summary>
        public InputList<Inputs.NotificationPolicyWebhooksIntegrationGetArgs> WebhooksIntegrations
        {
            get => _webhooksIntegrations ?? (_webhooksIntegrations = new InputList<Inputs.NotificationPolicyWebhooksIntegrationGetArgs>());
            set => _webhooksIntegrations = value;
        }

        public NotificationPolicyState()
        {
        }
        public static new NotificationPolicyState Empty => new NotificationPolicyState();
    }
}
