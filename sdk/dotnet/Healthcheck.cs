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
    /// Standalone Health Checks provide a way to monitor origin servers without needing a Cloudflare Load Balancer. 
    /// 
    /// ## Example Usage
    /// 
    /// ### TCP Monitor
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Cloudflare = Pulumi.Cloudflare;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var tcpHealthCheck = new Cloudflare.Healthcheck("tcpHealthCheck", new Cloudflare.HealthcheckArgs
    ///         {
    ///             ZoneId = @var.Cloudflare_zone_id,
    ///             Name = "tcp-health-check",
    ///             Description = "example tcp health check",
    ///             Address = "example.com",
    ///             Suspended = false,
    ///             CheckRegions = 
    ///             {
    ///                 "WEU",
    ///                 "EEU",
    ///             },
    ///             NotificationSuspended = false,
    ///             NotificationEmailAddresses = 
    ///             {
    ///                 "hostmaster@example.com",
    ///             },
    ///             Type = "TCP",
    ///             Port = "22",
    ///             Method = "connection_established",
    ///             Timeout = 10,
    ///             Retries = 2,
    ///             Interval = 60,
    ///             ConsecutiveFails = 3,
    ///             ConsecutiveSuccesses = 2,
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// </summary>
    public partial class Healthcheck : Pulumi.CustomResource
    {
        /// <summary>
        /// The hostname or IP address of the origin server to run health checks on.
        /// </summary>
        [Output("address")]
        public Output<string> Address { get; private set; } = null!;

        /// <summary>
        /// Do not validate the certificate when the health check uses HTTPS. Valid values: `true` or `false` (Default: `false`).
        /// </summary>
        [Output("allowInsecure")]
        public Output<bool?> AllowInsecure { get; private set; } = null!;

        /// <summary>
        /// A list of regions from which to run health checks. If not set Cloudflare will pick a default region. Valid values: `WNAM`, `ENAM`, `WEU`, `EEU`, `NSAM`, `SSAM`, `OC`, `ME`, `NAF`, `SAF`, `IN`, `SEAS`, `NEAS`, `ALL_REGIONS`.
        /// </summary>
        [Output("checkRegions")]
        public Output<ImmutableArray<string>> CheckRegions { get; private set; } = null!;

        /// <summary>
        /// The number of consecutive fails required from a health check before changing the health to unhealthy. (Default: `1`)
        /// </summary>
        [Output("consecutiveFails")]
        public Output<int?> ConsecutiveFails { get; private set; } = null!;

        /// <summary>
        /// The number of consecutive successes required from a health check before changing the health to healthy. (Default: `1`)
        /// </summary>
        [Output("consecutiveSuccesses")]
        public Output<int?> ConsecutiveSuccesses { get; private set; } = null!;

        [Output("createdOn")]
        public Output<string> CreatedOn { get; private set; } = null!;

        /// <summary>
        /// A human-readable description of the health check.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// A case-insensitive sub-string to look for in the response body. If this string is not found, the origin will be marked as unhealthy.
        /// </summary>
        [Output("expectedBody")]
        public Output<string?> ExpectedBody { get; private set; } = null!;

        /// <summary>
        /// The expected HTTP response codes (e.g. "200") or code ranges (e.g. "2xx" for all codes starting with 2) of the health check. (Default: `["200"]`)
        /// </summary>
        [Output("expectedCodes")]
        public Output<ImmutableArray<string>> ExpectedCodes { get; private set; } = null!;

        /// <summary>
        /// Follow redirects if the origin returns a 3xx status code. Valid values: `true` or `false` (Default: `false`).
        /// </summary>
        [Output("followRedirects")]
        public Output<bool?> FollowRedirects { get; private set; } = null!;

        /// <summary>
        /// The header name.
        /// </summary>
        [Output("headers")]
        public Output<ImmutableArray<Outputs.HealthcheckHeader>> Headers { get; private set; } = null!;

        /// <summary>
        /// The interval between each health check. Shorter intervals may give quicker notifications if the origin status changes, but will increase load on the origin as we check from multiple locations. (Default: `60`)
        /// </summary>
        [Output("interval")]
        public Output<int?> Interval { get; private set; } = null!;

        /// <summary>
        /// The TCP connection method to use for the health check. Valid values: `connection_established` (Default: `connection_established`).
        /// </summary>
        [Output("method")]
        public Output<string> Method { get; private set; } = null!;

        [Output("modifiedOn")]
        public Output<string> ModifiedOn { get; private set; } = null!;

        /// <summary>
        /// A short name to identify the health check. Only alphanumeric characters, hyphens and underscores are allowed.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// A list of email addresses we want to send the notifications to.
        /// </summary>
        [Output("notificationEmailAddresses")]
        public Output<ImmutableArray<string>> NotificationEmailAddresses { get; private set; } = null!;

        /// <summary>
        /// Whether the notifications are suspended or not. Useful for maintenance periods. Valid values: `true` or `false` (Default: `false`).
        /// </summary>
        [Output("notificationSuspended")]
        public Output<bool?> NotificationSuspended { get; private set; } = null!;

        /// <summary>
        /// The endpoint path to health check against. (Default: `/`)
        /// </summary>
        [Output("path")]
        public Output<string?> Path { get; private set; } = null!;

        /// <summary>
        /// Port number to connect to for the health check.  Valid values are in the rage `0-65535` (Default: `80`).
        /// </summary>
        [Output("port")]
        public Output<int?> Port { get; private set; } = null!;

        /// <summary>
        /// The number of retries to attempt in case of a timeout before marking the origin as unhealthy. Retries are attempted immediately. (Default: `2`)
        /// </summary>
        [Output("retries")]
        public Output<int?> Retries { get; private set; } = null!;

        /// <summary>
        /// If suspended, no health checks are sent to the origin. Valid values: `true` or `false` (Default: `false`).
        /// </summary>
        [Output("suspended")]
        public Output<bool?> Suspended { get; private set; } = null!;

        /// <summary>
        /// The timeout (in seconds) before marking the health check as failed. (Default: `5`)
        /// </summary>
        [Output("timeout")]
        public Output<int?> Timeout { get; private set; } = null!;

        /// <summary>
        /// The protocol to use for the health check. Valid values: `HTTP`, `HTTPS`, `TCP`.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// The DNS zone ID to which apply settings.
        /// </summary>
        [Output("zoneId")]
        public Output<string> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a Healthcheck resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Healthcheck(string name, HealthcheckArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/healthcheck:Healthcheck", name, args ?? new HealthcheckArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Healthcheck(string name, Input<string> id, HealthcheckState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/healthcheck:Healthcheck", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Healthcheck resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Healthcheck Get(string name, Input<string> id, HealthcheckState? state = null, CustomResourceOptions? options = null)
        {
            return new Healthcheck(name, id, state, options);
        }
    }

    public sealed class HealthcheckArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The hostname or IP address of the origin server to run health checks on.
        /// </summary>
        [Input("address", required: true)]
        public Input<string> Address { get; set; } = null!;

        /// <summary>
        /// Do not validate the certificate when the health check uses HTTPS. Valid values: `true` or `false` (Default: `false`).
        /// </summary>
        [Input("allowInsecure")]
        public Input<bool>? AllowInsecure { get; set; }

        [Input("checkRegions")]
        private InputList<string>? _checkRegions;

        /// <summary>
        /// A list of regions from which to run health checks. If not set Cloudflare will pick a default region. Valid values: `WNAM`, `ENAM`, `WEU`, `EEU`, `NSAM`, `SSAM`, `OC`, `ME`, `NAF`, `SAF`, `IN`, `SEAS`, `NEAS`, `ALL_REGIONS`.
        /// </summary>
        public InputList<string> CheckRegions
        {
            get => _checkRegions ?? (_checkRegions = new InputList<string>());
            set => _checkRegions = value;
        }

        /// <summary>
        /// The number of consecutive fails required from a health check before changing the health to unhealthy. (Default: `1`)
        /// </summary>
        [Input("consecutiveFails")]
        public Input<int>? ConsecutiveFails { get; set; }

        /// <summary>
        /// The number of consecutive successes required from a health check before changing the health to healthy. (Default: `1`)
        /// </summary>
        [Input("consecutiveSuccesses")]
        public Input<int>? ConsecutiveSuccesses { get; set; }

        /// <summary>
        /// A human-readable description of the health check.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// A case-insensitive sub-string to look for in the response body. If this string is not found, the origin will be marked as unhealthy.
        /// </summary>
        [Input("expectedBody")]
        public Input<string>? ExpectedBody { get; set; }

        [Input("expectedCodes")]
        private InputList<string>? _expectedCodes;

        /// <summary>
        /// The expected HTTP response codes (e.g. "200") or code ranges (e.g. "2xx" for all codes starting with 2) of the health check. (Default: `["200"]`)
        /// </summary>
        public InputList<string> ExpectedCodes
        {
            get => _expectedCodes ?? (_expectedCodes = new InputList<string>());
            set => _expectedCodes = value;
        }

        /// <summary>
        /// Follow redirects if the origin returns a 3xx status code. Valid values: `true` or `false` (Default: `false`).
        /// </summary>
        [Input("followRedirects")]
        public Input<bool>? FollowRedirects { get; set; }

        [Input("headers")]
        private InputList<Inputs.HealthcheckHeaderArgs>? _headers;

        /// <summary>
        /// The header name.
        /// </summary>
        public InputList<Inputs.HealthcheckHeaderArgs> Headers
        {
            get => _headers ?? (_headers = new InputList<Inputs.HealthcheckHeaderArgs>());
            set => _headers = value;
        }

        /// <summary>
        /// The interval between each health check. Shorter intervals may give quicker notifications if the origin status changes, but will increase load on the origin as we check from multiple locations. (Default: `60`)
        /// </summary>
        [Input("interval")]
        public Input<int>? Interval { get; set; }

        /// <summary>
        /// The TCP connection method to use for the health check. Valid values: `connection_established` (Default: `connection_established`).
        /// </summary>
        [Input("method")]
        public Input<string>? Method { get; set; }

        /// <summary>
        /// A short name to identify the health check. Only alphanumeric characters, hyphens and underscores are allowed.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("notificationEmailAddresses")]
        private InputList<string>? _notificationEmailAddresses;

        /// <summary>
        /// A list of email addresses we want to send the notifications to.
        /// </summary>
        public InputList<string> NotificationEmailAddresses
        {
            get => _notificationEmailAddresses ?? (_notificationEmailAddresses = new InputList<string>());
            set => _notificationEmailAddresses = value;
        }

        /// <summary>
        /// Whether the notifications are suspended or not. Useful for maintenance periods. Valid values: `true` or `false` (Default: `false`).
        /// </summary>
        [Input("notificationSuspended")]
        public Input<bool>? NotificationSuspended { get; set; }

        /// <summary>
        /// The endpoint path to health check against. (Default: `/`)
        /// </summary>
        [Input("path")]
        public Input<string>? Path { get; set; }

        /// <summary>
        /// Port number to connect to for the health check.  Valid values are in the rage `0-65535` (Default: `80`).
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        /// <summary>
        /// The number of retries to attempt in case of a timeout before marking the origin as unhealthy. Retries are attempted immediately. (Default: `2`)
        /// </summary>
        [Input("retries")]
        public Input<int>? Retries { get; set; }

        /// <summary>
        /// If suspended, no health checks are sent to the origin. Valid values: `true` or `false` (Default: `false`).
        /// </summary>
        [Input("suspended")]
        public Input<bool>? Suspended { get; set; }

        /// <summary>
        /// The timeout (in seconds) before marking the health check as failed. (Default: `5`)
        /// </summary>
        [Input("timeout")]
        public Input<int>? Timeout { get; set; }

        /// <summary>
        /// The protocol to use for the health check. Valid values: `HTTP`, `HTTPS`, `TCP`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        /// <summary>
        /// The DNS zone ID to which apply settings.
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public HealthcheckArgs()
        {
        }
    }

    public sealed class HealthcheckState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The hostname or IP address of the origin server to run health checks on.
        /// </summary>
        [Input("address")]
        public Input<string>? Address { get; set; }

        /// <summary>
        /// Do not validate the certificate when the health check uses HTTPS. Valid values: `true` or `false` (Default: `false`).
        /// </summary>
        [Input("allowInsecure")]
        public Input<bool>? AllowInsecure { get; set; }

        [Input("checkRegions")]
        private InputList<string>? _checkRegions;

        /// <summary>
        /// A list of regions from which to run health checks. If not set Cloudflare will pick a default region. Valid values: `WNAM`, `ENAM`, `WEU`, `EEU`, `NSAM`, `SSAM`, `OC`, `ME`, `NAF`, `SAF`, `IN`, `SEAS`, `NEAS`, `ALL_REGIONS`.
        /// </summary>
        public InputList<string> CheckRegions
        {
            get => _checkRegions ?? (_checkRegions = new InputList<string>());
            set => _checkRegions = value;
        }

        /// <summary>
        /// The number of consecutive fails required from a health check before changing the health to unhealthy. (Default: `1`)
        /// </summary>
        [Input("consecutiveFails")]
        public Input<int>? ConsecutiveFails { get; set; }

        /// <summary>
        /// The number of consecutive successes required from a health check before changing the health to healthy. (Default: `1`)
        /// </summary>
        [Input("consecutiveSuccesses")]
        public Input<int>? ConsecutiveSuccesses { get; set; }

        [Input("createdOn")]
        public Input<string>? CreatedOn { get; set; }

        /// <summary>
        /// A human-readable description of the health check.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// A case-insensitive sub-string to look for in the response body. If this string is not found, the origin will be marked as unhealthy.
        /// </summary>
        [Input("expectedBody")]
        public Input<string>? ExpectedBody { get; set; }

        [Input("expectedCodes")]
        private InputList<string>? _expectedCodes;

        /// <summary>
        /// The expected HTTP response codes (e.g. "200") or code ranges (e.g. "2xx" for all codes starting with 2) of the health check. (Default: `["200"]`)
        /// </summary>
        public InputList<string> ExpectedCodes
        {
            get => _expectedCodes ?? (_expectedCodes = new InputList<string>());
            set => _expectedCodes = value;
        }

        /// <summary>
        /// Follow redirects if the origin returns a 3xx status code. Valid values: `true` or `false` (Default: `false`).
        /// </summary>
        [Input("followRedirects")]
        public Input<bool>? FollowRedirects { get; set; }

        [Input("headers")]
        private InputList<Inputs.HealthcheckHeaderGetArgs>? _headers;

        /// <summary>
        /// The header name.
        /// </summary>
        public InputList<Inputs.HealthcheckHeaderGetArgs> Headers
        {
            get => _headers ?? (_headers = new InputList<Inputs.HealthcheckHeaderGetArgs>());
            set => _headers = value;
        }

        /// <summary>
        /// The interval between each health check. Shorter intervals may give quicker notifications if the origin status changes, but will increase load on the origin as we check from multiple locations. (Default: `60`)
        /// </summary>
        [Input("interval")]
        public Input<int>? Interval { get; set; }

        /// <summary>
        /// The TCP connection method to use for the health check. Valid values: `connection_established` (Default: `connection_established`).
        /// </summary>
        [Input("method")]
        public Input<string>? Method { get; set; }

        [Input("modifiedOn")]
        public Input<string>? ModifiedOn { get; set; }

        /// <summary>
        /// A short name to identify the health check. Only alphanumeric characters, hyphens and underscores are allowed.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("notificationEmailAddresses")]
        private InputList<string>? _notificationEmailAddresses;

        /// <summary>
        /// A list of email addresses we want to send the notifications to.
        /// </summary>
        public InputList<string> NotificationEmailAddresses
        {
            get => _notificationEmailAddresses ?? (_notificationEmailAddresses = new InputList<string>());
            set => _notificationEmailAddresses = value;
        }

        /// <summary>
        /// Whether the notifications are suspended or not. Useful for maintenance periods. Valid values: `true` or `false` (Default: `false`).
        /// </summary>
        [Input("notificationSuspended")]
        public Input<bool>? NotificationSuspended { get; set; }

        /// <summary>
        /// The endpoint path to health check against. (Default: `/`)
        /// </summary>
        [Input("path")]
        public Input<string>? Path { get; set; }

        /// <summary>
        /// Port number to connect to for the health check.  Valid values are in the rage `0-65535` (Default: `80`).
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        /// <summary>
        /// The number of retries to attempt in case of a timeout before marking the origin as unhealthy. Retries are attempted immediately. (Default: `2`)
        /// </summary>
        [Input("retries")]
        public Input<int>? Retries { get; set; }

        /// <summary>
        /// If suspended, no health checks are sent to the origin. Valid values: `true` or `false` (Default: `false`).
        /// </summary>
        [Input("suspended")]
        public Input<bool>? Suspended { get; set; }

        /// <summary>
        /// The timeout (in seconds) before marking the health check as failed. (Default: `5`)
        /// </summary>
        [Input("timeout")]
        public Input<int>? Timeout { get; set; }

        /// <summary>
        /// The protocol to use for the health check. Valid values: `HTTP`, `HTTPS`, `TCP`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// The DNS zone ID to which apply settings.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public HealthcheckState()
        {
        }
    }
}
