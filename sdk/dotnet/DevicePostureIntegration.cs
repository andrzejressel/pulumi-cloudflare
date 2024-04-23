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
    /// Provides a Cloudflare Device Posture Integration resource. Device
    /// posture integrations configure third-party data providers for device
    /// posture rules.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Cloudflare = Pulumi.Cloudflare;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Cloudflare.DevicePostureIntegration("example", new()
    ///     {
    ///         AccountId = "f037e56e89293a057740de681ac9abbe",
    ///         Name = "Device posture integration",
    ///         Type = "workspace_one",
    ///         Interval = "24h",
    ///         Configs = new[]
    ///         {
    ///             new Cloudflare.Inputs.DevicePostureIntegrationConfigArgs
    ///             {
    ///                 ApiUrl = "https://example.com/api",
    ///                 AuthUrl = "https://example.com/connect/token",
    ///                 ClientId = "client-id",
    ///                 ClientSecret = "client-secret",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import cloudflare:index/devicePostureIntegration:DevicePostureIntegration example &lt;account_id&gt;/&lt;device_posture_integration_id&gt;
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/devicePostureIntegration:DevicePostureIntegration")]
    public partial class DevicePostureIntegration : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        /// <summary>
        /// The device posture integration's connection authorization parameters.
        /// </summary>
        [Output("configs")]
        public Output<ImmutableArray<Outputs.DevicePostureIntegrationConfig>> Configs { get; private set; } = null!;

        [Output("identifier")]
        public Output<string?> Identifier { get; private set; } = null!;

        /// <summary>
        /// Indicates the frequency with which to poll the third-party API. Must be in the format `1h` or `30m`.
        /// </summary>
        [Output("interval")]
        public Output<string?> Interval { get; private set; } = null!;

        /// <summary>
        /// Name of the device posture integration.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The device posture integration type. Available values: `workspace_one`, `uptycs`, `crowdstrike_s2s`, `intune`, `kolide`, `sentinelone_s2s`, `tanium_s2s`.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;


        /// <summary>
        /// Create a DevicePostureIntegration resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DevicePostureIntegration(string name, DevicePostureIntegrationArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/devicePostureIntegration:DevicePostureIntegration", name, args ?? new DevicePostureIntegrationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DevicePostureIntegration(string name, Input<string> id, DevicePostureIntegrationState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/devicePostureIntegration:DevicePostureIntegration", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing DevicePostureIntegration resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DevicePostureIntegration Get(string name, Input<string> id, DevicePostureIntegrationState? state = null, CustomResourceOptions? options = null)
        {
            return new DevicePostureIntegration(name, id, state, options);
        }
    }

    public sealed class DevicePostureIntegrationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        [Input("configs")]
        private InputList<Inputs.DevicePostureIntegrationConfigArgs>? _configs;

        /// <summary>
        /// The device posture integration's connection authorization parameters.
        /// </summary>
        public InputList<Inputs.DevicePostureIntegrationConfigArgs> Configs
        {
            get => _configs ?? (_configs = new InputList<Inputs.DevicePostureIntegrationConfigArgs>());
            set => _configs = value;
        }

        [Input("identifier")]
        public Input<string>? Identifier { get; set; }

        /// <summary>
        /// Indicates the frequency with which to poll the third-party API. Must be in the format `1h` or `30m`.
        /// </summary>
        [Input("interval")]
        public Input<string>? Interval { get; set; }

        /// <summary>
        /// Name of the device posture integration.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The device posture integration type. Available values: `workspace_one`, `uptycs`, `crowdstrike_s2s`, `intune`, `kolide`, `sentinelone_s2s`, `tanium_s2s`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public DevicePostureIntegrationArgs()
        {
        }
        public static new DevicePostureIntegrationArgs Empty => new DevicePostureIntegrationArgs();
    }

    public sealed class DevicePostureIntegrationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        [Input("configs")]
        private InputList<Inputs.DevicePostureIntegrationConfigGetArgs>? _configs;

        /// <summary>
        /// The device posture integration's connection authorization parameters.
        /// </summary>
        public InputList<Inputs.DevicePostureIntegrationConfigGetArgs> Configs
        {
            get => _configs ?? (_configs = new InputList<Inputs.DevicePostureIntegrationConfigGetArgs>());
            set => _configs = value;
        }

        [Input("identifier")]
        public Input<string>? Identifier { get; set; }

        /// <summary>
        /// Indicates the frequency with which to poll the third-party API. Must be in the format `1h` or `30m`.
        /// </summary>
        [Input("interval")]
        public Input<string>? Interval { get; set; }

        /// <summary>
        /// Name of the device posture integration.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The device posture integration type. Available values: `workspace_one`, `uptycs`, `crowdstrike_s2s`, `intune`, `kolide`, `sentinelone_s2s`, `tanium_s2s`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public DevicePostureIntegrationState()
        {
        }
        public static new DevicePostureIntegrationState Empty => new DevicePostureIntegrationState();
    }
}
