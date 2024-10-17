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
    /// Provides a Cloudflare Teams rule resource. Teams rules comprise secure web gateway policies.
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
    ///     var example = new Cloudflare.TeamsRule("example", new()
    ///     {
    ///         AccountId = "f037e56e89293a057740de681ac9abbe",
    ///         Name = "office",
    ///         Description = "desc",
    ///         Precedence = 1,
    ///         Action = "block",
    ///         Filters = new[]
    ///         {
    ///             "http",
    ///         },
    ///         Traffic = "http.request.uri == \"https://www.example.com/malicious\"",
    ///         RuleSettings = new Cloudflare.Inputs.TeamsRuleRuleSettingsArgs
    ///         {
    ///             BlockPageEnabled = true,
    ///             BlockPageReason = "access not permitted",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import cloudflare:index/teamsRule:TeamsRule example &lt;account_id&gt;/&lt;teams_rule_id&gt;
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/teamsRule:TeamsRule")]
    public partial class TeamsRule : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        /// <summary>
        /// The action executed by matched teams rule. Available values: `allow`, `block`, `safesearch`, `ytrestricted`, `on`, `off`, `scan`, `noscan`, `isolate`, `noisolate`, `override`, `l4_override`, `egress`, `audit_ssh`, `resolve`.
        /// </summary>
        [Output("action")]
        public Output<string> Action { get; private set; } = null!;

        /// <summary>
        /// The description of the teams rule.
        /// </summary>
        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        /// <summary>
        /// The wirefilter expression to be used for device_posture check matching.
        /// </summary>
        [Output("devicePosture")]
        public Output<string> DevicePosture { get; private set; } = null!;

        /// <summary>
        /// Indicator of rule enablement.
        /// </summary>
        [Output("enabled")]
        public Output<bool?> Enabled { get; private set; } = null!;

        /// <summary>
        /// The protocol or layer to evaluate the traffic and identity expressions.
        /// </summary>
        [Output("filters")]
        public Output<ImmutableArray<string>> Filters { get; private set; } = null!;

        /// <summary>
        /// The wirefilter expression to be used for identity matching.
        /// </summary>
        [Output("identity")]
        public Output<string> Identity { get; private set; } = null!;

        /// <summary>
        /// The name of the teams rule.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The evaluation precedence of the teams rule.
        /// </summary>
        [Output("precedence")]
        public Output<int> Precedence { get; private set; } = null!;

        /// <summary>
        /// Additional rule settings.
        /// </summary>
        [Output("ruleSettings")]
        public Output<Outputs.TeamsRuleRuleSettings> RuleSettings { get; private set; } = null!;

        /// <summary>
        /// The wirefilter expression to be used for traffic matching.
        /// </summary>
        [Output("traffic")]
        public Output<string> Traffic { get; private set; } = null!;

        [Output("version")]
        public Output<int> Version { get; private set; } = null!;


        /// <summary>
        /// Create a TeamsRule resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public TeamsRule(string name, TeamsRuleArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/teamsRule:TeamsRule", name, args ?? new TeamsRuleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private TeamsRule(string name, Input<string> id, TeamsRuleState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/teamsRule:TeamsRule", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing TeamsRule resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static TeamsRule Get(string name, Input<string> id, TeamsRuleState? state = null, CustomResourceOptions? options = null)
        {
            return new TeamsRule(name, id, state, options);
        }
    }

    public sealed class TeamsRuleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        /// <summary>
        /// The action executed by matched teams rule. Available values: `allow`, `block`, `safesearch`, `ytrestricted`, `on`, `off`, `scan`, `noscan`, `isolate`, `noisolate`, `override`, `l4_override`, `egress`, `audit_ssh`, `resolve`.
        /// </summary>
        [Input("action", required: true)]
        public Input<string> Action { get; set; } = null!;

        /// <summary>
        /// The description of the teams rule.
        /// </summary>
        [Input("description", required: true)]
        public Input<string> Description { get; set; } = null!;

        /// <summary>
        /// The wirefilter expression to be used for device_posture check matching.
        /// </summary>
        [Input("devicePosture")]
        public Input<string>? DevicePosture { get; set; }

        /// <summary>
        /// Indicator of rule enablement.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("filters")]
        private InputList<string>? _filters;

        /// <summary>
        /// The protocol or layer to evaluate the traffic and identity expressions.
        /// </summary>
        public InputList<string> Filters
        {
            get => _filters ?? (_filters = new InputList<string>());
            set => _filters = value;
        }

        /// <summary>
        /// The wirefilter expression to be used for identity matching.
        /// </summary>
        [Input("identity")]
        public Input<string>? Identity { get; set; }

        /// <summary>
        /// The name of the teams rule.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The evaluation precedence of the teams rule.
        /// </summary>
        [Input("precedence", required: true)]
        public Input<int> Precedence { get; set; } = null!;

        /// <summary>
        /// Additional rule settings.
        /// </summary>
        [Input("ruleSettings")]
        public Input<Inputs.TeamsRuleRuleSettingsArgs>? RuleSettings { get; set; }

        /// <summary>
        /// The wirefilter expression to be used for traffic matching.
        /// </summary>
        [Input("traffic")]
        public Input<string>? Traffic { get; set; }

        public TeamsRuleArgs()
        {
        }
        public static new TeamsRuleArgs Empty => new TeamsRuleArgs();
    }

    public sealed class TeamsRuleState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// The action executed by matched teams rule. Available values: `allow`, `block`, `safesearch`, `ytrestricted`, `on`, `off`, `scan`, `noscan`, `isolate`, `noisolate`, `override`, `l4_override`, `egress`, `audit_ssh`, `resolve`.
        /// </summary>
        [Input("action")]
        public Input<string>? Action { get; set; }

        /// <summary>
        /// The description of the teams rule.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The wirefilter expression to be used for device_posture check matching.
        /// </summary>
        [Input("devicePosture")]
        public Input<string>? DevicePosture { get; set; }

        /// <summary>
        /// Indicator of rule enablement.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("filters")]
        private InputList<string>? _filters;

        /// <summary>
        /// The protocol or layer to evaluate the traffic and identity expressions.
        /// </summary>
        public InputList<string> Filters
        {
            get => _filters ?? (_filters = new InputList<string>());
            set => _filters = value;
        }

        /// <summary>
        /// The wirefilter expression to be used for identity matching.
        /// </summary>
        [Input("identity")]
        public Input<string>? Identity { get; set; }

        /// <summary>
        /// The name of the teams rule.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The evaluation precedence of the teams rule.
        /// </summary>
        [Input("precedence")]
        public Input<int>? Precedence { get; set; }

        /// <summary>
        /// Additional rule settings.
        /// </summary>
        [Input("ruleSettings")]
        public Input<Inputs.TeamsRuleRuleSettingsGetArgs>? RuleSettings { get; set; }

        /// <summary>
        /// The wirefilter expression to be used for traffic matching.
        /// </summary>
        [Input("traffic")]
        public Input<string>? Traffic { get; set; }

        [Input("version")]
        public Input<int>? Version { get; set; }

        public TeamsRuleState()
        {
        }
        public static new TeamsRuleState Empty => new TeamsRuleState();
    }
}
