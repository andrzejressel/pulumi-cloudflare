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
    /// Provides a resource to configure Bot Management.
    /// 
    /// Specifically, this resource can be used to manage:
    /// 
    /// - **Bot Fight Mode**
    /// - **Super Bot Fight Mode**
    /// - **Bot Management for Enterprise**
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
    ///     var example = new Cloudflare.BotManagement("example", new()
    ///     {
    ///         ZoneId = "0da42c8d2132a9ddaf714f9e7c920711",
    ///         EnableJs = true,
    ///         SbfmDefinitelyAutomated = "block",
    ///         SbfmLikelyAutomated = "managed_challenge",
    ///         SbfmVerifiedBots = "allow",
    ///         SbfmStaticResourceProtection = false,
    ///         OptimizeWordpress = true,
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import cloudflare:index/botManagement:BotManagement example &lt;zone_id&gt;
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/botManagement:BotManagement")]
    public partial class BotManagement : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Automatically update to the newest bot detection models created by Cloudflare as they are released. [Learn more.](https://developers.cloudflare.com/bots/reference/machine-learning-models#model-versions-and-release-notes).
        /// </summary>
        [Output("autoUpdateModel")]
        public Output<bool?> AutoUpdateModel { get; private set; } = null!;

        /// <summary>
        /// Use lightweight, invisible JavaScript detections to improve Bot Management. [Learn more about JavaScript Detections](https://developers.cloudflare.com/bots/reference/javascript-detections/).
        /// </summary>
        [Output("enableJs")]
        public Output<bool?> EnableJs { get; private set; } = null!;

        /// <summary>
        /// Whether to enable Bot Fight Mode.
        /// </summary>
        [Output("fightMode")]
        public Output<bool?> FightMode { get; private set; } = null!;

        /// <summary>
        /// Whether to optimize Super Bot Fight Mode protections for Wordpress.
        /// </summary>
        [Output("optimizeWordpress")]
        public Output<bool?> OptimizeWordpress { get; private set; } = null!;

        /// <summary>
        /// Super Bot Fight Mode (SBFM) action to take on definitely automated requests.
        /// </summary>
        [Output("sbfmDefinitelyAutomated")]
        public Output<string?> SbfmDefinitelyAutomated { get; private set; } = null!;

        /// <summary>
        /// Super Bot Fight Mode (SBFM) action to take on likely automated requests.
        /// </summary>
        [Output("sbfmLikelyAutomated")]
        public Output<string?> SbfmLikelyAutomated { get; private set; } = null!;

        /// <summary>
        /// Super Bot Fight Mode (SBFM) to enable static resource protection. Enable if static resources on your application need bot protection. Note: Static resource protection can also result in legitimate traffic being blocked.
        /// </summary>
        [Output("sbfmStaticResourceProtection")]
        public Output<bool?> SbfmStaticResourceProtection { get; private set; } = null!;

        /// <summary>
        /// Super Bot Fight Mode (SBFM) action to take on verified bots requests.
        /// </summary>
        [Output("sbfmVerifiedBots")]
        public Output<string?> SbfmVerifiedBots { get; private set; } = null!;

        /// <summary>
        /// Whether to disable tracking the highest bot score for a session in the Bot Management cookie.
        /// </summary>
        [Output("suppressSessionScore")]
        public Output<bool?> SuppressSessionScore { get; private set; } = null!;

        /// <summary>
        /// A read-only field that indicates whether the zone currently is running the latest ML model.
        /// </summary>
        [Output("usingLatestModel")]
        public Output<bool> UsingLatestModel { get; private set; } = null!;

        /// <summary>
        /// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("zoneId")]
        public Output<string> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a BotManagement resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public BotManagement(string name, BotManagementArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/botManagement:BotManagement", name, args ?? new BotManagementArgs(), MakeResourceOptions(options, ""))
        {
        }

        private BotManagement(string name, Input<string> id, BotManagementState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/botManagement:BotManagement", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing BotManagement resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static BotManagement Get(string name, Input<string> id, BotManagementState? state = null, CustomResourceOptions? options = null)
        {
            return new BotManagement(name, id, state, options);
        }
    }

    public sealed class BotManagementArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Automatically update to the newest bot detection models created by Cloudflare as they are released. [Learn more.](https://developers.cloudflare.com/bots/reference/machine-learning-models#model-versions-and-release-notes).
        /// </summary>
        [Input("autoUpdateModel")]
        public Input<bool>? AutoUpdateModel { get; set; }

        /// <summary>
        /// Use lightweight, invisible JavaScript detections to improve Bot Management. [Learn more about JavaScript Detections](https://developers.cloudflare.com/bots/reference/javascript-detections/).
        /// </summary>
        [Input("enableJs")]
        public Input<bool>? EnableJs { get; set; }

        /// <summary>
        /// Whether to enable Bot Fight Mode.
        /// </summary>
        [Input("fightMode")]
        public Input<bool>? FightMode { get; set; }

        /// <summary>
        /// Whether to optimize Super Bot Fight Mode protections for Wordpress.
        /// </summary>
        [Input("optimizeWordpress")]
        public Input<bool>? OptimizeWordpress { get; set; }

        /// <summary>
        /// Super Bot Fight Mode (SBFM) action to take on definitely automated requests.
        /// </summary>
        [Input("sbfmDefinitelyAutomated")]
        public Input<string>? SbfmDefinitelyAutomated { get; set; }

        /// <summary>
        /// Super Bot Fight Mode (SBFM) action to take on likely automated requests.
        /// </summary>
        [Input("sbfmLikelyAutomated")]
        public Input<string>? SbfmLikelyAutomated { get; set; }

        /// <summary>
        /// Super Bot Fight Mode (SBFM) to enable static resource protection. Enable if static resources on your application need bot protection. Note: Static resource protection can also result in legitimate traffic being blocked.
        /// </summary>
        [Input("sbfmStaticResourceProtection")]
        public Input<bool>? SbfmStaticResourceProtection { get; set; }

        /// <summary>
        /// Super Bot Fight Mode (SBFM) action to take on verified bots requests.
        /// </summary>
        [Input("sbfmVerifiedBots")]
        public Input<string>? SbfmVerifiedBots { get; set; }

        /// <summary>
        /// Whether to disable tracking the highest bot score for a session in the Bot Management cookie.
        /// </summary>
        [Input("suppressSessionScore")]
        public Input<bool>? SuppressSessionScore { get; set; }

        /// <summary>
        /// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public BotManagementArgs()
        {
        }
        public static new BotManagementArgs Empty => new BotManagementArgs();
    }

    public sealed class BotManagementState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Automatically update to the newest bot detection models created by Cloudflare as they are released. [Learn more.](https://developers.cloudflare.com/bots/reference/machine-learning-models#model-versions-and-release-notes).
        /// </summary>
        [Input("autoUpdateModel")]
        public Input<bool>? AutoUpdateModel { get; set; }

        /// <summary>
        /// Use lightweight, invisible JavaScript detections to improve Bot Management. [Learn more about JavaScript Detections](https://developers.cloudflare.com/bots/reference/javascript-detections/).
        /// </summary>
        [Input("enableJs")]
        public Input<bool>? EnableJs { get; set; }

        /// <summary>
        /// Whether to enable Bot Fight Mode.
        /// </summary>
        [Input("fightMode")]
        public Input<bool>? FightMode { get; set; }

        /// <summary>
        /// Whether to optimize Super Bot Fight Mode protections for Wordpress.
        /// </summary>
        [Input("optimizeWordpress")]
        public Input<bool>? OptimizeWordpress { get; set; }

        /// <summary>
        /// Super Bot Fight Mode (SBFM) action to take on definitely automated requests.
        /// </summary>
        [Input("sbfmDefinitelyAutomated")]
        public Input<string>? SbfmDefinitelyAutomated { get; set; }

        /// <summary>
        /// Super Bot Fight Mode (SBFM) action to take on likely automated requests.
        /// </summary>
        [Input("sbfmLikelyAutomated")]
        public Input<string>? SbfmLikelyAutomated { get; set; }

        /// <summary>
        /// Super Bot Fight Mode (SBFM) to enable static resource protection. Enable if static resources on your application need bot protection. Note: Static resource protection can also result in legitimate traffic being blocked.
        /// </summary>
        [Input("sbfmStaticResourceProtection")]
        public Input<bool>? SbfmStaticResourceProtection { get; set; }

        /// <summary>
        /// Super Bot Fight Mode (SBFM) action to take on verified bots requests.
        /// </summary>
        [Input("sbfmVerifiedBots")]
        public Input<string>? SbfmVerifiedBots { get; set; }

        /// <summary>
        /// Whether to disable tracking the highest bot score for a session in the Bot Management cookie.
        /// </summary>
        [Input("suppressSessionScore")]
        public Input<bool>? SuppressSessionScore { get; set; }

        /// <summary>
        /// A read-only field that indicates whether the zone currently is running the latest ML model.
        /// </summary>
        [Input("usingLatestModel")]
        public Input<bool>? UsingLatestModel { get; set; }

        /// <summary>
        /// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public BotManagementState()
        {
        }
        public static new BotManagementState Empty => new BotManagementState();
    }
}
