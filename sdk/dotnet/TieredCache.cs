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
    /// Provides a resource, that manages Cloudflare Tiered Cache settings.
    /// This allows you to adjust topologies for your zone.
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
    ///     var example = new Cloudflare.TieredCache("example", new()
    ///     {
    ///         ZoneId = "0da42c8d2132a9ddaf714f9e7c920711",
    ///         CacheType = "smart",
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/tieredCache:TieredCache")]
    public partial class TieredCache : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The typed of tiered cache to utilize on the zone. Available values: `generic`, `smart`, `off`.
        /// </summary>
        [Output("cacheType")]
        public Output<string> CacheType { get; private set; } = null!;

        /// <summary>
        /// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("zoneId")]
        public Output<string> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a TieredCache resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public TieredCache(string name, TieredCacheArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/tieredCache:TieredCache", name, args ?? new TieredCacheArgs(), MakeResourceOptions(options, ""))
        {
        }

        private TieredCache(string name, Input<string> id, TieredCacheState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/tieredCache:TieredCache", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing TieredCache resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static TieredCache Get(string name, Input<string> id, TieredCacheState? state = null, CustomResourceOptions? options = null)
        {
            return new TieredCache(name, id, state, options);
        }
    }

    public sealed class TieredCacheArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The typed of tiered cache to utilize on the zone. Available values: `generic`, `smart`, `off`.
        /// </summary>
        [Input("cacheType", required: true)]
        public Input<string> CacheType { get; set; } = null!;

        /// <summary>
        /// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public TieredCacheArgs()
        {
        }
        public static new TieredCacheArgs Empty => new TieredCacheArgs();
    }

    public sealed class TieredCacheState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The typed of tiered cache to utilize on the zone. Available values: `generic`, `smart`, `off`.
        /// </summary>
        [Input("cacheType")]
        public Input<string>? CacheType { get; set; }

        /// <summary>
        /// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public TieredCacheState()
        {
        }
        public static new TieredCacheState Empty => new TieredCacheState();
    }
}
