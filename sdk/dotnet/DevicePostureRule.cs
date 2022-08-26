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
    /// Provides a Cloudflare Device Posture Rule resource. Device posture rules configure security policies for device posture checks.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Cloudflare = Pulumi.Cloudflare;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var corporateDevicesPostureRule = new Cloudflare.DevicePostureRule("corporateDevicesPostureRule", new()
    ///     {
    ///         AccountId = "1d5fdc9e88c8a8c4518b068cd94331fe",
    ///         Name = "Corporate devices posture rule",
    ///         Type = "serial_number",
    ///         Description = "Device posture rule for corporate devices.",
    ///         Schedule = "24h",
    ///         Expiration = "24h",
    ///         Matches = new[]
    ///         {
    ///             new Cloudflare.Inputs.DevicePostureRuleMatchArgs
    ///             {
    ///                 Platform = "mac",
    ///             },
    ///         },
    ///         Inputs = new[]
    ///         {
    ///             new Cloudflare.Inputs.DevicePostureRuleInputArgs
    ///             {
    ///                 Id = cloudflare_teams_list.Corporate_devices.Id,
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Device posture rules can be imported using a composite ID formed of account ID and device posture rule ID.
    /// 
    /// ```sh
    ///  $ pulumi import cloudflare:index/devicePostureRule:DevicePostureRule corporate_devices cb029e245cfdd66dc8d2e570d5dd3322/d41d8cd98f00b204e9800998ecf8427e
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/devicePostureRule:DevicePostureRule")]
    public partial class DevicePostureRule : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The account to which the device posture rule should be added.
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        /// <summary>
        /// The description of the device posture rule.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Expire posture results after the specified amount of time.
        /// Must be in the format `"1h"` or `"30m"`. Valid units are `h` and `m`.
        /// </summary>
        [Output("expiration")]
        public Output<string?> Expiration { get; private set; } = null!;

        /// <summary>
        /// The value to be checked against. See below for reference
        /// structure.
        /// </summary>
        [Output("inputs")]
        public Output<ImmutableArray<Outputs.DevicePostureRuleInput>> Inputs { get; private set; } = null!;

        /// <summary>
        /// The conditions that the client must match to run the rule. See below for reference structure.
        /// </summary>
        [Output("matches")]
        public Output<ImmutableArray<Outputs.DevicePostureRuleMatch>> Matches { get; private set; } = null!;

        /// <summary>
        /// Name of the device posture rule.
        /// </summary>
        [Output("name")]
        public Output<string?> Name { get; private set; } = null!;

        /// <summary>
        /// Tells the client when to run the device posture check.
        /// Must be in the format `"1h"` or `"30m"`. Valid units are `h` and `m`.
        /// </summary>
        [Output("schedule")]
        public Output<string?> Schedule { get; private set; } = null!;

        /// <summary>
        /// The device posture rule type. Valid values are `file`, `application`, and `serial_number`.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;


        /// <summary>
        /// Create a DevicePostureRule resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DevicePostureRule(string name, DevicePostureRuleArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/devicePostureRule:DevicePostureRule", name, args ?? new DevicePostureRuleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DevicePostureRule(string name, Input<string> id, DevicePostureRuleState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/devicePostureRule:DevicePostureRule", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing DevicePostureRule resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DevicePostureRule Get(string name, Input<string> id, DevicePostureRuleState? state = null, CustomResourceOptions? options = null)
        {
            return new DevicePostureRule(name, id, state, options);
        }
    }

    public sealed class DevicePostureRuleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account to which the device posture rule should be added.
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        /// <summary>
        /// The description of the device posture rule.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Expire posture results after the specified amount of time.
        /// Must be in the format `"1h"` or `"30m"`. Valid units are `h` and `m`.
        /// </summary>
        [Input("expiration")]
        public Input<string>? Expiration { get; set; }

        [Input("inputs")]
        private InputList<Inputs.DevicePostureRuleInputArgs>? _inputs;

        /// <summary>
        /// The value to be checked against. See below for reference
        /// structure.
        /// </summary>
        public InputList<Inputs.DevicePostureRuleInputArgs> Inputs
        {
            get => _inputs ?? (_inputs = new InputList<Inputs.DevicePostureRuleInputArgs>());
            set => _inputs = value;
        }

        [Input("matches")]
        private InputList<Inputs.DevicePostureRuleMatchArgs>? _matches;

        /// <summary>
        /// The conditions that the client must match to run the rule. See below for reference structure.
        /// </summary>
        public InputList<Inputs.DevicePostureRuleMatchArgs> Matches
        {
            get => _matches ?? (_matches = new InputList<Inputs.DevicePostureRuleMatchArgs>());
            set => _matches = value;
        }

        /// <summary>
        /// Name of the device posture rule.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Tells the client when to run the device posture check.
        /// Must be in the format `"1h"` or `"30m"`. Valid units are `h` and `m`.
        /// </summary>
        [Input("schedule")]
        public Input<string>? Schedule { get; set; }

        /// <summary>
        /// The device posture rule type. Valid values are `file`, `application`, and `serial_number`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public DevicePostureRuleArgs()
        {
        }
        public static new DevicePostureRuleArgs Empty => new DevicePostureRuleArgs();
    }

    public sealed class DevicePostureRuleState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account to which the device posture rule should be added.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// The description of the device posture rule.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Expire posture results after the specified amount of time.
        /// Must be in the format `"1h"` or `"30m"`. Valid units are `h` and `m`.
        /// </summary>
        [Input("expiration")]
        public Input<string>? Expiration { get; set; }

        [Input("inputs")]
        private InputList<Inputs.DevicePostureRuleInputGetArgs>? _inputs;

        /// <summary>
        /// The value to be checked against. See below for reference
        /// structure.
        /// </summary>
        public InputList<Inputs.DevicePostureRuleInputGetArgs> Inputs
        {
            get => _inputs ?? (_inputs = new InputList<Inputs.DevicePostureRuleInputGetArgs>());
            set => _inputs = value;
        }

        [Input("matches")]
        private InputList<Inputs.DevicePostureRuleMatchGetArgs>? _matches;

        /// <summary>
        /// The conditions that the client must match to run the rule. See below for reference structure.
        /// </summary>
        public InputList<Inputs.DevicePostureRuleMatchGetArgs> Matches
        {
            get => _matches ?? (_matches = new InputList<Inputs.DevicePostureRuleMatchGetArgs>());
            set => _matches = value;
        }

        /// <summary>
        /// Name of the device posture rule.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Tells the client when to run the device posture check.
        /// Must be in the format `"1h"` or `"30m"`. Valid units are `h` and `m`.
        /// </summary>
        [Input("schedule")]
        public Input<string>? Schedule { get; set; }

        /// <summary>
        /// The device posture rule type. Valid values are `file`, `application`, and `serial_number`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public DevicePostureRuleState()
        {
        }
        public static new DevicePostureRuleState Empty => new DevicePostureRuleState();
    }
}
