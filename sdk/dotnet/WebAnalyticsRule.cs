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
    /// Provides a Cloudflare Web Analytics Rule resource.
    /// 
    /// ## Example Usage
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Cloudflare = Pulumi.Cloudflare;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Cloudflare.WebAnalyticsSite("example", new()
    ///     {
    ///         AccountId = "f037e56e89293a057740de681ac9abbe",
    ///         ZoneTag = "0da42c8d2132a9ddaf714f9e7c920711",
    ///         AutoInstall = true,
    ///     });
    /// 
    ///     var exampleWebAnalyticsRule = new Cloudflare.WebAnalyticsRule("example", new()
    ///     {
    ///         AccountId = "f037e56e89293a057740de681ac9abbe",
    ///         RulesetId = example.RulesetId,
    ///         Host = "*",
    ///         Paths = new[]
    ///         {
    ///             "/excluded",
    ///         },
    ///         Inclusive = false,
    ///         IsPaused = false,
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn =
    ///         {
    ///             example, 
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import cloudflare:index/webAnalyticsRule:WebAnalyticsRule example &lt;account_id&gt;/&lt;ruleset_id&gt;/&lt;rule_id&gt;
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/webAnalyticsRule:WebAnalyticsRule")]
    public partial class WebAnalyticsRule : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        /// <summary>
        /// The host to apply the rule to.
        /// </summary>
        [Output("host")]
        public Output<string> Host { get; private set; } = null!;

        /// <summary>
        /// Whether the rule includes or excludes the matched traffic from being measured in Web Analytics.
        /// </summary>
        [Output("inclusive")]
        public Output<bool> Inclusive { get; private set; } = null!;

        /// <summary>
        /// Whether the rule is paused or not.
        /// </summary>
        [Output("isPaused")]
        public Output<bool> IsPaused { get; private set; } = null!;

        /// <summary>
        /// A list of paths to apply the rule to.
        /// </summary>
        [Output("paths")]
        public Output<ImmutableArray<string>> Paths { get; private set; } = null!;

        /// <summary>
        /// The Web Analytics ruleset id. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("rulesetId")]
        public Output<string> RulesetId { get; private set; } = null!;


        /// <summary>
        /// Create a WebAnalyticsRule resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public WebAnalyticsRule(string name, WebAnalyticsRuleArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/webAnalyticsRule:WebAnalyticsRule", name, args ?? new WebAnalyticsRuleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private WebAnalyticsRule(string name, Input<string> id, WebAnalyticsRuleState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/webAnalyticsRule:WebAnalyticsRule", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing WebAnalyticsRule resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static WebAnalyticsRule Get(string name, Input<string> id, WebAnalyticsRuleState? state = null, CustomResourceOptions? options = null)
        {
            return new WebAnalyticsRule(name, id, state, options);
        }
    }

    public sealed class WebAnalyticsRuleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        /// <summary>
        /// The host to apply the rule to.
        /// </summary>
        [Input("host", required: true)]
        public Input<string> Host { get; set; } = null!;

        /// <summary>
        /// Whether the rule includes or excludes the matched traffic from being measured in Web Analytics.
        /// </summary>
        [Input("inclusive", required: true)]
        public Input<bool> Inclusive { get; set; } = null!;

        /// <summary>
        /// Whether the rule is paused or not.
        /// </summary>
        [Input("isPaused", required: true)]
        public Input<bool> IsPaused { get; set; } = null!;

        [Input("paths", required: true)]
        private InputList<string>? _paths;

        /// <summary>
        /// A list of paths to apply the rule to.
        /// </summary>
        public InputList<string> Paths
        {
            get => _paths ?? (_paths = new InputList<string>());
            set => _paths = value;
        }

        /// <summary>
        /// The Web Analytics ruleset id. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("rulesetId", required: true)]
        public Input<string> RulesetId { get; set; } = null!;

        public WebAnalyticsRuleArgs()
        {
        }
        public static new WebAnalyticsRuleArgs Empty => new WebAnalyticsRuleArgs();
    }

    public sealed class WebAnalyticsRuleState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// The host to apply the rule to.
        /// </summary>
        [Input("host")]
        public Input<string>? Host { get; set; }

        /// <summary>
        /// Whether the rule includes or excludes the matched traffic from being measured in Web Analytics.
        /// </summary>
        [Input("inclusive")]
        public Input<bool>? Inclusive { get; set; }

        /// <summary>
        /// Whether the rule is paused or not.
        /// </summary>
        [Input("isPaused")]
        public Input<bool>? IsPaused { get; set; }

        [Input("paths")]
        private InputList<string>? _paths;

        /// <summary>
        /// A list of paths to apply the rule to.
        /// </summary>
        public InputList<string> Paths
        {
            get => _paths ?? (_paths = new InputList<string>());
            set => _paths = value;
        }

        /// <summary>
        /// The Web Analytics ruleset id. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("rulesetId")]
        public Input<string>? RulesetId { get; set; }

        public WebAnalyticsRuleState()
        {
        }
        public static new WebAnalyticsRuleState Empty => new WebAnalyticsRuleState();
    }
}
