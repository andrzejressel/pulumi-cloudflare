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
    /// Configure zone-wide settings for Cloudflare waiting rooms.
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
    ///     var example = new Cloudflare.WaitingRoomSettings("example", new()
    ///     {
    ///         ZoneId = "0da42c8d2132a9ddaf714f9e7c920711",
    ///         SearchEngineCrawlerBypass = true,
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import cloudflare:index/waitingRoomSettings:WaitingRoomSettings example &lt;zone_id&gt;
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/waitingRoomSettings:WaitingRoomSettings")]
    public partial class WaitingRoomSettings : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Whether to allow verified search engine crawlers to bypass all waiting rooms on this zone. Defaults to `false`.
        /// </summary>
        [Output("searchEngineCrawlerBypass")]
        public Output<bool?> SearchEngineCrawlerBypass { get; private set; } = null!;

        /// <summary>
        /// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("zoneId")]
        public Output<string> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a WaitingRoomSettings resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public WaitingRoomSettings(string name, WaitingRoomSettingsArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/waitingRoomSettings:WaitingRoomSettings", name, args ?? new WaitingRoomSettingsArgs(), MakeResourceOptions(options, ""))
        {
        }

        private WaitingRoomSettings(string name, Input<string> id, WaitingRoomSettingsState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/waitingRoomSettings:WaitingRoomSettings", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing WaitingRoomSettings resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static WaitingRoomSettings Get(string name, Input<string> id, WaitingRoomSettingsState? state = null, CustomResourceOptions? options = null)
        {
            return new WaitingRoomSettings(name, id, state, options);
        }
    }

    public sealed class WaitingRoomSettingsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether to allow verified search engine crawlers to bypass all waiting rooms on this zone. Defaults to `false`.
        /// </summary>
        [Input("searchEngineCrawlerBypass")]
        public Input<bool>? SearchEngineCrawlerBypass { get; set; }

        /// <summary>
        /// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public WaitingRoomSettingsArgs()
        {
        }
        public static new WaitingRoomSettingsArgs Empty => new WaitingRoomSettingsArgs();
    }

    public sealed class WaitingRoomSettingsState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether to allow verified search engine crawlers to bypass all waiting rooms on this zone. Defaults to `false`.
        /// </summary>
        [Input("searchEngineCrawlerBypass")]
        public Input<bool>? SearchEngineCrawlerBypass { get; set; }

        /// <summary>
        /// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public WaitingRoomSettingsState()
        {
        }
        public static new WaitingRoomSettingsState Empty => new WaitingRoomSettingsState();
    }
}
