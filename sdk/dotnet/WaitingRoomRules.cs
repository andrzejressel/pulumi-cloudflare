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
    /// Provides a Cloudflare Waiting Room Rules resource.
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
    ///     var example = new Cloudflare.WaitingRoomRules("example", new()
    ///     {
    ///         Rules = new[]
    ///         {
    ///             new Cloudflare.Inputs.WaitingRoomRulesRuleArgs
    ///             {
    ///                 Action = "bypass_waiting_room",
    ///                 Description = "bypass ip list",
    ///                 Expression = "src.ip in {192.0.2.0 192.0.2.1}",
    ///                 Status = "enabled",
    ///             },
    ///             new Cloudflare.Inputs.WaitingRoomRulesRuleArgs
    ///             {
    ///                 Action = "bypass_waiting_room",
    ///                 Description = "bypass query string",
    ///                 Expression = "http.request.uri.query contains \"bypass=true\"",
    ///                 Status = "enabled",
    ///             },
    ///         },
    ///         WaitingRoomId = "d41d8cd98f00b204e9800998ecf8427e",
    ///         ZoneId = "0da42c8d2132a9ddaf714f9e7c920711",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    ///  $ pulumi import cloudflare:index/waitingRoomRules:WaitingRoomRules default &lt;zone_id&gt;/&lt;waiting_room_id&gt;
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/waitingRoomRules:WaitingRoomRules")]
    public partial class WaitingRoomRules : global::Pulumi.CustomResource
    {
        /// <summary>
        /// List of rules to apply to the ruleset.
        /// </summary>
        [Output("rules")]
        public Output<ImmutableArray<Outputs.WaitingRoomRulesRule>> Rules { get; private set; } = null!;

        /// <summary>
        /// The Waiting Room ID the rules should apply to. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("waitingRoomId")]
        public Output<string> WaitingRoomId { get; private set; } = null!;

        /// <summary>
        /// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("zoneId")]
        public Output<string> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a WaitingRoomRules resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public WaitingRoomRules(string name, WaitingRoomRulesArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/waitingRoomRules:WaitingRoomRules", name, args ?? new WaitingRoomRulesArgs(), MakeResourceOptions(options, ""))
        {
        }

        private WaitingRoomRules(string name, Input<string> id, WaitingRoomRulesState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/waitingRoomRules:WaitingRoomRules", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing WaitingRoomRules resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static WaitingRoomRules Get(string name, Input<string> id, WaitingRoomRulesState? state = null, CustomResourceOptions? options = null)
        {
            return new WaitingRoomRules(name, id, state, options);
        }
    }

    public sealed class WaitingRoomRulesArgs : global::Pulumi.ResourceArgs
    {
        [Input("rules")]
        private InputList<Inputs.WaitingRoomRulesRuleArgs>? _rules;

        /// <summary>
        /// List of rules to apply to the ruleset.
        /// </summary>
        public InputList<Inputs.WaitingRoomRulesRuleArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.WaitingRoomRulesRuleArgs>());
            set => _rules = value;
        }

        /// <summary>
        /// The Waiting Room ID the rules should apply to. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("waitingRoomId", required: true)]
        public Input<string> WaitingRoomId { get; set; } = null!;

        /// <summary>
        /// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public WaitingRoomRulesArgs()
        {
        }
        public static new WaitingRoomRulesArgs Empty => new WaitingRoomRulesArgs();
    }

    public sealed class WaitingRoomRulesState : global::Pulumi.ResourceArgs
    {
        [Input("rules")]
        private InputList<Inputs.WaitingRoomRulesRuleGetArgs>? _rules;

        /// <summary>
        /// List of rules to apply to the ruleset.
        /// </summary>
        public InputList<Inputs.WaitingRoomRulesRuleGetArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.WaitingRoomRulesRuleGetArgs>());
            set => _rules = value;
        }

        /// <summary>
        /// The Waiting Room ID the rules should apply to. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("waitingRoomId")]
        public Input<string>? WaitingRoomId { get; set; }

        /// <summary>
        /// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public WaitingRoomRulesState()
        {
        }
        public static new WaitingRoomRulesState Empty => new WaitingRoomRulesState();
    }
}