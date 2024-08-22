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
    /// Provides a resource to customize the pages your end users will see
    /// when trying to reach applications behind Cloudflare Access.
    /// </summary>
    [CloudflareResourceType("cloudflare:index/zeroTrustAccessTag:ZeroTrustAccessTag")]
    public partial class ZeroTrustAccessTag : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The account identifier to target for the resource. Conflicts with `zone_id`. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("accountId")]
        public Output<string?> AccountId { get; private set; } = null!;

        /// <summary>
        /// Number of apps associated with the tag.
        /// </summary>
        [Output("appCount")]
        public Output<int> AppCount { get; private set; } = null!;

        /// <summary>
        /// Friendly name of the Access Tag.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The zone identifier to target for the resource. Conflicts with `account_id`. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("zoneId")]
        public Output<string?> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a ZeroTrustAccessTag resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ZeroTrustAccessTag(string name, ZeroTrustAccessTagArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/zeroTrustAccessTag:ZeroTrustAccessTag", name, args ?? new ZeroTrustAccessTagArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ZeroTrustAccessTag(string name, Input<string> id, ZeroTrustAccessTagState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/zeroTrustAccessTag:ZeroTrustAccessTag", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ZeroTrustAccessTag resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ZeroTrustAccessTag Get(string name, Input<string> id, ZeroTrustAccessTagState? state = null, CustomResourceOptions? options = null)
        {
            return new ZeroTrustAccessTag(name, id, state, options);
        }
    }

    public sealed class ZeroTrustAccessTagArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource. Conflicts with `zone_id`. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// Number of apps associated with the tag.
        /// </summary>
        [Input("appCount")]
        public Input<int>? AppCount { get; set; }

        /// <summary>
        /// Friendly name of the Access Tag.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The zone identifier to target for the resource. Conflicts with `account_id`. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public ZeroTrustAccessTagArgs()
        {
        }
        public static new ZeroTrustAccessTagArgs Empty => new ZeroTrustAccessTagArgs();
    }

    public sealed class ZeroTrustAccessTagState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource. Conflicts with `zone_id`. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// Number of apps associated with the tag.
        /// </summary>
        [Input("appCount")]
        public Input<int>? AppCount { get; set; }

        /// <summary>
        /// Friendly name of the Access Tag.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The zone identifier to target for the resource. Conflicts with `account_id`. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public ZeroTrustAccessTagState()
        {
        }
        public static new ZeroTrustAccessTagState Empty => new ZeroTrustAccessTagState();
    }
}
