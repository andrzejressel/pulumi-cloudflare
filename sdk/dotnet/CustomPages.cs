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
    /// Provides a resource which manages Cloudflare custom error pages.
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
    ///     var basicChallenge = new Cloudflare.CustomPages("basicChallenge", new()
    ///     {
    ///         State = "customized",
    ///         Type = "basic_challenge",
    ///         Url = "https://example.com/challenge.html",
    ///         ZoneId = "d41d8cd98f00b204e9800998ecf8427e",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Custom pages can be imported using a composite ID formed of- `customPageLevel` - Either `account` or `zone`. - `identifier` - The ID of the account or zone you intend to manage. - `pageType` - The value from the `type` argument. Example for a zone
    /// 
    /// ```sh
    ///  $ pulumi import cloudflare:index/customPages:CustomPages basic_challenge zone/d41d8cd98f00b204e9800998ecf8427e/basic_challenge
    /// ```
    /// 
    ///  Example for an account
    /// 
    /// ```sh
    ///  $ pulumi import cloudflare:index/customPages:CustomPages basic_challenge account/e268443e43d93dab7ebef303bbe9642f/basic_challenge
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/customPages:CustomPages")]
    public partial class CustomPages : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The account ID where the custom pages should be
        /// updated. Either `account_id` or `zone_id` must be provided. If
        /// `account_id` is present, it will override the zone setting.
        /// </summary>
        [Output("accountId")]
        public Output<string?> AccountId { get; private set; } = null!;

        [Output("state")]
        public Output<string?> State { get; private set; } = null!;

        /// <summary>
        /// The type of custom page you wish to update. Must
        /// be one of `basic_challenge`, `waf_challenge`, `waf_block`,
        /// `ratelimit_block`, `country_challenge`, `ip_block`, `under_attack`,
        /// `500_errors`, `1000_errors`, `always_online`, `managed_challenge`.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// URL of where the custom page source is located.
        /// </summary>
        [Output("url")]
        public Output<string> Url { get; private set; } = null!;

        /// <summary>
        /// The zone ID where the custom pages should be
        /// updated. Either `zone_id` or `account_id` must be provided.
        /// </summary>
        [Output("zoneId")]
        public Output<string?> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a CustomPages resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CustomPages(string name, CustomPagesArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/customPages:CustomPages", name, args ?? new CustomPagesArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CustomPages(string name, Input<string> id, CustomPagesState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/customPages:CustomPages", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing CustomPages resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CustomPages Get(string name, Input<string> id, CustomPagesState? state = null, CustomResourceOptions? options = null)
        {
            return new CustomPages(name, id, state, options);
        }
    }

    public sealed class CustomPagesArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account ID where the custom pages should be
        /// updated. Either `account_id` or `zone_id` must be provided. If
        /// `account_id` is present, it will override the zone setting.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        [Input("state")]
        public Input<string>? State { get; set; }

        /// <summary>
        /// The type of custom page you wish to update. Must
        /// be one of `basic_challenge`, `waf_challenge`, `waf_block`,
        /// `ratelimit_block`, `country_challenge`, `ip_block`, `under_attack`,
        /// `500_errors`, `1000_errors`, `always_online`, `managed_challenge`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        /// <summary>
        /// URL of where the custom page source is located.
        /// </summary>
        [Input("url", required: true)]
        public Input<string> Url { get; set; } = null!;

        /// <summary>
        /// The zone ID where the custom pages should be
        /// updated. Either `zone_id` or `account_id` must be provided.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public CustomPagesArgs()
        {
        }
        public static new CustomPagesArgs Empty => new CustomPagesArgs();
    }

    public sealed class CustomPagesState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account ID where the custom pages should be
        /// updated. Either `account_id` or `zone_id` must be provided. If
        /// `account_id` is present, it will override the zone setting.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        [Input("state")]
        public Input<string>? State { get; set; }

        /// <summary>
        /// The type of custom page you wish to update. Must
        /// be one of `basic_challenge`, `waf_challenge`, `waf_block`,
        /// `ratelimit_block`, `country_challenge`, `ip_block`, `under_attack`,
        /// `500_errors`, `1000_errors`, `always_online`, `managed_challenge`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// URL of where the custom page source is located.
        /// </summary>
        [Input("url")]
        public Input<string>? Url { get; set; }

        /// <summary>
        /// The zone ID where the custom pages should be
        /// updated. Either `zone_id` or `account_id` must be provided.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public CustomPagesState()
        {
        }
        public static new CustomPagesState Empty => new CustomPagesState();
    }
}
