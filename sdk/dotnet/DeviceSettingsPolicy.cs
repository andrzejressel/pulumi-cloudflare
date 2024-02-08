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
    /// Provides a Cloudflare Device Settings Policy resource. Device policies configure settings applied to WARP devices.
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
    ///     var developerWarpPolicy = new Cloudflare.DeviceSettingsPolicy("developerWarpPolicy", new()
    ///     {
    ///         AccountId = "f037e56e89293a057740de681ac9abbe",
    ///         AllowModeSwitch = true,
    ///         AllowUpdates = true,
    ///         AllowedToLeave = true,
    ///         AutoConnect = 0,
    ///         CaptivePortal = 5,
    ///         Default = false,
    ///         Description = "Developers WARP settings policy description",
    ///         DisableAutoFallback = true,
    ///         Enabled = true,
    ///         ExcludeOfficeIps = false,
    ///         Match = "any(identity.groups.name[*] in {\"Developers\"})",
    ///         Name = "Developers WARP settings policy",
    ///         Precedence = 10,
    ///         ServiceModeV2Mode = "warp",
    ///         ServiceModeV2Port = 3000,
    ///         SupportUrl = "https://cloudflare.com",
    ///         SwitchLocked = true,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// For default device settings policies you must use "default" as the policy ID.
    /// 
    /// ```sh
    ///  $ pulumi import cloudflare:index/deviceSettingsPolicy:DeviceSettingsPolicy example &lt;account_id&gt;/&lt;device_policy_id&gt;
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/deviceSettingsPolicy:DeviceSettingsPolicy")]
    public partial class DeviceSettingsPolicy : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        /// <summary>
        /// Whether to allow mode switch for this policy.
        /// </summary>
        [Output("allowModeSwitch")]
        public Output<bool?> AllowModeSwitch { get; private set; } = null!;

        /// <summary>
        /// Whether to allow updates under this policy.
        /// </summary>
        [Output("allowUpdates")]
        public Output<bool?> AllowUpdates { get; private set; } = null!;

        /// <summary>
        /// Whether to allow devices to leave the organization. Defaults to `true`.
        /// </summary>
        [Output("allowedToLeave")]
        public Output<bool?> AllowedToLeave { get; private set; } = null!;

        /// <summary>
        /// The amount of time in seconds to reconnect after having been disabled.
        /// </summary>
        [Output("autoConnect")]
        public Output<int?> AutoConnect { get; private set; } = null!;

        /// <summary>
        /// The captive portal value for this policy. Defaults to `180`.
        /// </summary>
        [Output("captivePortal")]
        public Output<int?> CaptivePortal { get; private set; } = null!;

        /// <summary>
        /// Whether the policy refers to the default account policy.
        /// </summary>
        [Output("default")]
        public Output<bool?> Default { get; private set; } = null!;

        /// <summary>
        /// Description of Policy.
        /// </summary>
        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        /// <summary>
        /// Whether to disable auto fallback for this policy.
        /// </summary>
        [Output("disableAutoFallback")]
        public Output<bool?> DisableAutoFallback { get; private set; } = null!;

        /// <summary>
        /// Whether the policy is enabled (cannot be set for default policies). Defaults to `true`.
        /// </summary>
        [Output("enabled")]
        public Output<bool?> Enabled { get; private set; } = null!;

        /// <summary>
        /// Whether to add Microsoft IPs to split tunnel exclusions.
        /// </summary>
        [Output("excludeOfficeIps")]
        public Output<bool?> ExcludeOfficeIps { get; private set; } = null!;

        /// <summary>
        /// Wirefilter expression to match a device against when evaluating whether this policy should take effect for that device.
        /// </summary>
        [Output("match")]
        public Output<string?> Match { get; private set; } = null!;

        /// <summary>
        /// Name of the policy.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The precedence of the policy. Lower values indicate higher precedence.
        /// </summary>
        [Output("precedence")]
        public Output<int?> Precedence { get; private set; } = null!;

        /// <summary>
        /// The service mode. Available values: `1dot1`, `warp`, `proxy`, `posture_only`, `warp_tunnel_only`. Defaults to `warp`.
        /// </summary>
        [Output("serviceModeV2Mode")]
        public Output<string?> ServiceModeV2Mode { get; private set; } = null!;

        /// <summary>
        /// The port to use for the proxy service mode. Required when using `service_mode_v2_mode`.
        /// </summary>
        [Output("serviceModeV2Port")]
        public Output<int?> ServiceModeV2Port { get; private set; } = null!;

        /// <summary>
        /// The support URL that will be opened when sending feedback.
        /// </summary>
        [Output("supportUrl")]
        public Output<string?> SupportUrl { get; private set; } = null!;

        /// <summary>
        /// Enablement of the ZT client switch lock.
        /// </summary>
        [Output("switchLocked")]
        public Output<bool?> SwitchLocked { get; private set; } = null!;


        /// <summary>
        /// Create a DeviceSettingsPolicy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DeviceSettingsPolicy(string name, DeviceSettingsPolicyArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/deviceSettingsPolicy:DeviceSettingsPolicy", name, args ?? new DeviceSettingsPolicyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DeviceSettingsPolicy(string name, Input<string> id, DeviceSettingsPolicyState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/deviceSettingsPolicy:DeviceSettingsPolicy", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing DeviceSettingsPolicy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DeviceSettingsPolicy Get(string name, Input<string> id, DeviceSettingsPolicyState? state = null, CustomResourceOptions? options = null)
        {
            return new DeviceSettingsPolicy(name, id, state, options);
        }
    }

    public sealed class DeviceSettingsPolicyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        /// <summary>
        /// Whether to allow mode switch for this policy.
        /// </summary>
        [Input("allowModeSwitch")]
        public Input<bool>? AllowModeSwitch { get; set; }

        /// <summary>
        /// Whether to allow updates under this policy.
        /// </summary>
        [Input("allowUpdates")]
        public Input<bool>? AllowUpdates { get; set; }

        /// <summary>
        /// Whether to allow devices to leave the organization. Defaults to `true`.
        /// </summary>
        [Input("allowedToLeave")]
        public Input<bool>? AllowedToLeave { get; set; }

        /// <summary>
        /// The amount of time in seconds to reconnect after having been disabled.
        /// </summary>
        [Input("autoConnect")]
        public Input<int>? AutoConnect { get; set; }

        /// <summary>
        /// The captive portal value for this policy. Defaults to `180`.
        /// </summary>
        [Input("captivePortal")]
        public Input<int>? CaptivePortal { get; set; }

        /// <summary>
        /// Whether the policy refers to the default account policy.
        /// </summary>
        [Input("default")]
        public Input<bool>? Default { get; set; }

        /// <summary>
        /// Description of Policy.
        /// </summary>
        [Input("description", required: true)]
        public Input<string> Description { get; set; } = null!;

        /// <summary>
        /// Whether to disable auto fallback for this policy.
        /// </summary>
        [Input("disableAutoFallback")]
        public Input<bool>? DisableAutoFallback { get; set; }

        /// <summary>
        /// Whether the policy is enabled (cannot be set for default policies). Defaults to `true`.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Whether to add Microsoft IPs to split tunnel exclusions.
        /// </summary>
        [Input("excludeOfficeIps")]
        public Input<bool>? ExcludeOfficeIps { get; set; }

        /// <summary>
        /// Wirefilter expression to match a device against when evaluating whether this policy should take effect for that device.
        /// </summary>
        [Input("match")]
        public Input<string>? Match { get; set; }

        /// <summary>
        /// Name of the policy.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The precedence of the policy. Lower values indicate higher precedence.
        /// </summary>
        [Input("precedence")]
        public Input<int>? Precedence { get; set; }

        /// <summary>
        /// The service mode. Available values: `1dot1`, `warp`, `proxy`, `posture_only`, `warp_tunnel_only`. Defaults to `warp`.
        /// </summary>
        [Input("serviceModeV2Mode")]
        public Input<string>? ServiceModeV2Mode { get; set; }

        /// <summary>
        /// The port to use for the proxy service mode. Required when using `service_mode_v2_mode`.
        /// </summary>
        [Input("serviceModeV2Port")]
        public Input<int>? ServiceModeV2Port { get; set; }

        /// <summary>
        /// The support URL that will be opened when sending feedback.
        /// </summary>
        [Input("supportUrl")]
        public Input<string>? SupportUrl { get; set; }

        /// <summary>
        /// Enablement of the ZT client switch lock.
        /// </summary>
        [Input("switchLocked")]
        public Input<bool>? SwitchLocked { get; set; }

        public DeviceSettingsPolicyArgs()
        {
        }
        public static new DeviceSettingsPolicyArgs Empty => new DeviceSettingsPolicyArgs();
    }

    public sealed class DeviceSettingsPolicyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// Whether to allow mode switch for this policy.
        /// </summary>
        [Input("allowModeSwitch")]
        public Input<bool>? AllowModeSwitch { get; set; }

        /// <summary>
        /// Whether to allow updates under this policy.
        /// </summary>
        [Input("allowUpdates")]
        public Input<bool>? AllowUpdates { get; set; }

        /// <summary>
        /// Whether to allow devices to leave the organization. Defaults to `true`.
        /// </summary>
        [Input("allowedToLeave")]
        public Input<bool>? AllowedToLeave { get; set; }

        /// <summary>
        /// The amount of time in seconds to reconnect after having been disabled.
        /// </summary>
        [Input("autoConnect")]
        public Input<int>? AutoConnect { get; set; }

        /// <summary>
        /// The captive portal value for this policy. Defaults to `180`.
        /// </summary>
        [Input("captivePortal")]
        public Input<int>? CaptivePortal { get; set; }

        /// <summary>
        /// Whether the policy refers to the default account policy.
        /// </summary>
        [Input("default")]
        public Input<bool>? Default { get; set; }

        /// <summary>
        /// Description of Policy.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Whether to disable auto fallback for this policy.
        /// </summary>
        [Input("disableAutoFallback")]
        public Input<bool>? DisableAutoFallback { get; set; }

        /// <summary>
        /// Whether the policy is enabled (cannot be set for default policies). Defaults to `true`.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Whether to add Microsoft IPs to split tunnel exclusions.
        /// </summary>
        [Input("excludeOfficeIps")]
        public Input<bool>? ExcludeOfficeIps { get; set; }

        /// <summary>
        /// Wirefilter expression to match a device against when evaluating whether this policy should take effect for that device.
        /// </summary>
        [Input("match")]
        public Input<string>? Match { get; set; }

        /// <summary>
        /// Name of the policy.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The precedence of the policy. Lower values indicate higher precedence.
        /// </summary>
        [Input("precedence")]
        public Input<int>? Precedence { get; set; }

        /// <summary>
        /// The service mode. Available values: `1dot1`, `warp`, `proxy`, `posture_only`, `warp_tunnel_only`. Defaults to `warp`.
        /// </summary>
        [Input("serviceModeV2Mode")]
        public Input<string>? ServiceModeV2Mode { get; set; }

        /// <summary>
        /// The port to use for the proxy service mode. Required when using `service_mode_v2_mode`.
        /// </summary>
        [Input("serviceModeV2Port")]
        public Input<int>? ServiceModeV2Port { get; set; }

        /// <summary>
        /// The support URL that will be opened when sending feedback.
        /// </summary>
        [Input("supportUrl")]
        public Input<string>? SupportUrl { get; set; }

        /// <summary>
        /// Enablement of the ZT client switch lock.
        /// </summary>
        [Input("switchLocked")]
        public Input<bool>? SwitchLocked { get; set; }

        public DeviceSettingsPolicyState()
        {
        }
        public static new DeviceSettingsPolicyState Empty => new DeviceSettingsPolicyState();
    }
}
