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
    /// Provides a Cloudflare Fallback Domain resource. Fallback domains are
    /// used to ignore DNS requests to a given list of domains. These DNS
    /// requests will be passed back to other DNS servers configured on
    /// existing network interfaces on the device.
    /// </summary>
    [CloudflareResourceType("cloudflare:index/zeroTrustLocalFallbackDomain:ZeroTrustLocalFallbackDomain")]
    public partial class ZeroTrustLocalFallbackDomain : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        [Output("domains")]
        public Output<ImmutableArray<Outputs.ZeroTrustLocalFallbackDomainDomain>> Domains { get; private set; } = null!;

        /// <summary>
        /// The settings policy for which to configure this fallback domain policy.
        /// </summary>
        [Output("policyId")]
        public Output<string?> PolicyId { get; private set; } = null!;


        /// <summary>
        /// Create a ZeroTrustLocalFallbackDomain resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ZeroTrustLocalFallbackDomain(string name, ZeroTrustLocalFallbackDomainArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/zeroTrustLocalFallbackDomain:ZeroTrustLocalFallbackDomain", name, args ?? new ZeroTrustLocalFallbackDomainArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ZeroTrustLocalFallbackDomain(string name, Input<string> id, ZeroTrustLocalFallbackDomainState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/zeroTrustLocalFallbackDomain:ZeroTrustLocalFallbackDomain", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ZeroTrustLocalFallbackDomain resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ZeroTrustLocalFallbackDomain Get(string name, Input<string> id, ZeroTrustLocalFallbackDomainState? state = null, CustomResourceOptions? options = null)
        {
            return new ZeroTrustLocalFallbackDomain(name, id, state, options);
        }
    }

    public sealed class ZeroTrustLocalFallbackDomainArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        [Input("domains", required: true)]
        private InputList<Inputs.ZeroTrustLocalFallbackDomainDomainArgs>? _domains;
        public InputList<Inputs.ZeroTrustLocalFallbackDomainDomainArgs> Domains
        {
            get => _domains ?? (_domains = new InputList<Inputs.ZeroTrustLocalFallbackDomainDomainArgs>());
            set => _domains = value;
        }

        /// <summary>
        /// The settings policy for which to configure this fallback domain policy.
        /// </summary>
        [Input("policyId")]
        public Input<string>? PolicyId { get; set; }

        public ZeroTrustLocalFallbackDomainArgs()
        {
        }
        public static new ZeroTrustLocalFallbackDomainArgs Empty => new ZeroTrustLocalFallbackDomainArgs();
    }

    public sealed class ZeroTrustLocalFallbackDomainState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        [Input("domains")]
        private InputList<Inputs.ZeroTrustLocalFallbackDomainDomainGetArgs>? _domains;
        public InputList<Inputs.ZeroTrustLocalFallbackDomainDomainGetArgs> Domains
        {
            get => _domains ?? (_domains = new InputList<Inputs.ZeroTrustLocalFallbackDomainDomainGetArgs>());
            set => _domains = value;
        }

        /// <summary>
        /// The settings policy for which to configure this fallback domain policy.
        /// </summary>
        [Input("policyId")]
        public Input<string>? PolicyId { get; set; }

        public ZeroTrustLocalFallbackDomainState()
        {
        }
        public static new ZeroTrustLocalFallbackDomainState Empty => new ZeroTrustLocalFallbackDomainState();
    }
}
