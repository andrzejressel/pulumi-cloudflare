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
    /// ## Import
    /// 
    /// # Import an account-scoped job.
    /// 
    /// ```sh
    ///  $ pulumi import cloudflare:index/logpushJob:LogpushJob example account/&lt;account_id&gt;/&lt;job_id&gt;
    /// ```
    /// 
    /// # Import a zone-scoped job.
    /// 
    /// ```sh
    ///  $ pulumi import cloudflare:index/logpushJob:LogpushJob example zone/&lt;zone_id&gt;/&lt;job_id&gt;
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/logpushJob:LogpushJob")]
    public partial class LogpushJob : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Output("accountId")]
        public Output<string?> AccountId { get; private set; } = null!;

        /// <summary>
        /// Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included. See [Logpush destination documentation](https://developers.cloudflare.com/logs/reference/logpush-api-configuration#destination). Available values: `firewall_events`, `http_requests`, `spectrum_events`, `nel_reports`, `audit_logs`, `gateway_dns`, `gateway_http`, `gateway_network`, `dns_logs`, `network_analytics_logs`.
        /// </summary>
        [Output("dataset")]
        public Output<string> Dataset { get; private set; } = null!;

        /// <summary>
        /// Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included. See [Logpush destination documentation](https://developers.cloudflare.com/logs/reference/logpush-api-configuration#destination).
        /// </summary>
        [Output("destinationConf")]
        public Output<string> DestinationConf { get; private set; } = null!;

        /// <summary>
        /// Whether to enable the job.
        /// </summary>
        [Output("enabled")]
        public Output<bool?> Enabled { get; private set; } = null!;

        /// <summary>
        /// Use filters to select the events to include and/or remove from your logs. For more information, refer to [Filters](https://developers.cloudflare.com/logs/reference/logpush-api-configuration/filters/).
        /// </summary>
        [Output("filter")]
        public Output<string?> Filter { get; private set; } = null!;

        /// <summary>
        /// A higher frequency will result in logs being pushed on faster with smaller files. `low` frequency will push logs less often with larger files. Available values: `high`, `low`. Defaults to `high`.
        /// </summary>
        [Output("frequency")]
        public Output<string?> Frequency { get; private set; } = null!;

        /// <summary>
        /// The kind of logpush job to create. Available values: `edge`, `instant-logs`, `""`.
        /// </summary>
        [Output("kind")]
        public Output<string?> Kind { get; private set; } = null!;

        /// <summary>
        /// Configuration string for the Logshare API. It specifies things like requested fields and timestamp formats. See [Logpull options documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#options).
        /// </summary>
        [Output("logpullOptions")]
        public Output<string?> LogpullOptions { get; private set; } = null!;

        /// <summary>
        /// The name of the logpush job to create.
        /// </summary>
        [Output("name")]
        public Output<string?> Name { get; private set; } = null!;

        /// <summary>
        /// Ownership challenge token to prove destination ownership, required when destination is Amazon S3, Google Cloud Storage, Microsoft Azure or Sumo Logic. See [Developer documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#usage).
        /// </summary>
        [Output("ownershipChallenge")]
        public Output<string?> OwnershipChallenge { get; private set; } = null!;

        /// <summary>
        /// The zone identifier to target for the resource.
        /// </summary>
        [Output("zoneId")]
        public Output<string?> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a LogpushJob resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public LogpushJob(string name, LogpushJobArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/logpushJob:LogpushJob", name, args ?? new LogpushJobArgs(), MakeResourceOptions(options, ""))
        {
        }

        private LogpushJob(string name, Input<string> id, LogpushJobState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/logpushJob:LogpushJob", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing LogpushJob resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static LogpushJob Get(string name, Input<string> id, LogpushJobState? state = null, CustomResourceOptions? options = null)
        {
            return new LogpushJob(name, id, state, options);
        }
    }

    public sealed class LogpushJobArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included. See [Logpush destination documentation](https://developers.cloudflare.com/logs/reference/logpush-api-configuration#destination). Available values: `firewall_events`, `http_requests`, `spectrum_events`, `nel_reports`, `audit_logs`, `gateway_dns`, `gateway_http`, `gateway_network`, `dns_logs`, `network_analytics_logs`.
        /// </summary>
        [Input("dataset", required: true)]
        public Input<string> Dataset { get; set; } = null!;

        /// <summary>
        /// Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included. See [Logpush destination documentation](https://developers.cloudflare.com/logs/reference/logpush-api-configuration#destination).
        /// </summary>
        [Input("destinationConf", required: true)]
        public Input<string> DestinationConf { get; set; } = null!;

        /// <summary>
        /// Whether to enable the job.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Use filters to select the events to include and/or remove from your logs. For more information, refer to [Filters](https://developers.cloudflare.com/logs/reference/logpush-api-configuration/filters/).
        /// </summary>
        [Input("filter")]
        public Input<string>? Filter { get; set; }

        /// <summary>
        /// A higher frequency will result in logs being pushed on faster with smaller files. `low` frequency will push logs less often with larger files. Available values: `high`, `low`. Defaults to `high`.
        /// </summary>
        [Input("frequency")]
        public Input<string>? Frequency { get; set; }

        /// <summary>
        /// The kind of logpush job to create. Available values: `edge`, `instant-logs`, `""`.
        /// </summary>
        [Input("kind")]
        public Input<string>? Kind { get; set; }

        /// <summary>
        /// Configuration string for the Logshare API. It specifies things like requested fields and timestamp formats. See [Logpull options documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#options).
        /// </summary>
        [Input("logpullOptions")]
        public Input<string>? LogpullOptions { get; set; }

        /// <summary>
        /// The name of the logpush job to create.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Ownership challenge token to prove destination ownership, required when destination is Amazon S3, Google Cloud Storage, Microsoft Azure or Sumo Logic. See [Developer documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#usage).
        /// </summary>
        [Input("ownershipChallenge")]
        public Input<string>? OwnershipChallenge { get; set; }

        /// <summary>
        /// The zone identifier to target for the resource.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public LogpushJobArgs()
        {
        }
        public static new LogpushJobArgs Empty => new LogpushJobArgs();
    }

    public sealed class LogpushJobState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included. See [Logpush destination documentation](https://developers.cloudflare.com/logs/reference/logpush-api-configuration#destination). Available values: `firewall_events`, `http_requests`, `spectrum_events`, `nel_reports`, `audit_logs`, `gateway_dns`, `gateway_http`, `gateway_network`, `dns_logs`, `network_analytics_logs`.
        /// </summary>
        [Input("dataset")]
        public Input<string>? Dataset { get; set; }

        /// <summary>
        /// Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included. See [Logpush destination documentation](https://developers.cloudflare.com/logs/reference/logpush-api-configuration#destination).
        /// </summary>
        [Input("destinationConf")]
        public Input<string>? DestinationConf { get; set; }

        /// <summary>
        /// Whether to enable the job.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Use filters to select the events to include and/or remove from your logs. For more information, refer to [Filters](https://developers.cloudflare.com/logs/reference/logpush-api-configuration/filters/).
        /// </summary>
        [Input("filter")]
        public Input<string>? Filter { get; set; }

        /// <summary>
        /// A higher frequency will result in logs being pushed on faster with smaller files. `low` frequency will push logs less often with larger files. Available values: `high`, `low`. Defaults to `high`.
        /// </summary>
        [Input("frequency")]
        public Input<string>? Frequency { get; set; }

        /// <summary>
        /// The kind of logpush job to create. Available values: `edge`, `instant-logs`, `""`.
        /// </summary>
        [Input("kind")]
        public Input<string>? Kind { get; set; }

        /// <summary>
        /// Configuration string for the Logshare API. It specifies things like requested fields and timestamp formats. See [Logpull options documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#options).
        /// </summary>
        [Input("logpullOptions")]
        public Input<string>? LogpullOptions { get; set; }

        /// <summary>
        /// The name of the logpush job to create.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Ownership challenge token to prove destination ownership, required when destination is Amazon S3, Google Cloud Storage, Microsoft Azure or Sumo Logic. See [Developer documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#usage).
        /// </summary>
        [Input("ownershipChallenge")]
        public Input<string>? OwnershipChallenge { get; set; }

        /// <summary>
        /// The zone identifier to target for the resource.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public LogpushJobState()
        {
        }
        public static new LogpushJobState Empty => new LogpushJobState();
    }
}
