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
    /// Provides a Cloudflare custom hostname fallback origin resource.
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
    ///     var example = new Cloudflare.CustomHostnameFallbackOrigin("example", new()
    ///     {
    ///         ZoneId = "0da42c8d2132a9ddaf714f9e7c920711",
    ///         Origin = "fallback.example.com",
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import cloudflare:index/customHostnameFallbackOrigin:CustomHostnameFallbackOrigin example &lt;zone_id&gt;/&lt;fallback_hostname&gt;
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/customHostnameFallbackOrigin:CustomHostnameFallbackOrigin")]
    public partial class CustomHostnameFallbackOrigin : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Hostname you intend to fallback requests to. Origin must be a proxied A/AAAA/CNAME DNS record within Clouldflare.
        /// </summary>
        [Output("origin")]
        public Output<string> Origin { get; private set; } = null!;

        /// <summary>
        /// Status of the fallback origin's activation.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("zoneId")]
        public Output<string> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a CustomHostnameFallbackOrigin resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CustomHostnameFallbackOrigin(string name, CustomHostnameFallbackOriginArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/customHostnameFallbackOrigin:CustomHostnameFallbackOrigin", name, args ?? new CustomHostnameFallbackOriginArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CustomHostnameFallbackOrigin(string name, Input<string> id, CustomHostnameFallbackOriginState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/customHostnameFallbackOrigin:CustomHostnameFallbackOrigin", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing CustomHostnameFallbackOrigin resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CustomHostnameFallbackOrigin Get(string name, Input<string> id, CustomHostnameFallbackOriginState? state = null, CustomResourceOptions? options = null)
        {
            return new CustomHostnameFallbackOrigin(name, id, state, options);
        }
    }

    public sealed class CustomHostnameFallbackOriginArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Hostname you intend to fallback requests to. Origin must be a proxied A/AAAA/CNAME DNS record within Clouldflare.
        /// </summary>
        [Input("origin", required: true)]
        public Input<string> Origin { get; set; } = null!;

        /// <summary>
        /// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public CustomHostnameFallbackOriginArgs()
        {
        }
        public static new CustomHostnameFallbackOriginArgs Empty => new CustomHostnameFallbackOriginArgs();
    }

    public sealed class CustomHostnameFallbackOriginState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Hostname you intend to fallback requests to. Origin must be a proxied A/AAAA/CNAME DNS record within Clouldflare.
        /// </summary>
        [Input("origin")]
        public Input<string>? Origin { get; set; }

        /// <summary>
        /// Status of the fallback origin's activation.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public CustomHostnameFallbackOriginState()
        {
        }
        public static new CustomHostnameFallbackOriginState Empty => new CustomHostnameFallbackOriginState();
    }
}
