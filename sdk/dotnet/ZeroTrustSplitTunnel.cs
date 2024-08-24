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
    /// Provides a Cloudflare Split Tunnel resource. Split tunnels are used to either
    /// include or exclude lists of routes from the WARP client's tunnel.
    /// </summary>
    [CloudflareResourceType("cloudflare:index/zeroTrustSplitTunnel:ZeroTrustSplitTunnel")]
    public partial class ZeroTrustSplitTunnel : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        /// <summary>
        /// The mode of the split tunnel policy. Available values: `include`, `exclude`.
        /// </summary>
        [Output("mode")]
        public Output<string> Mode { get; private set; } = null!;

        /// <summary>
        /// The settings policy for which to configure this split tunnel policy.
        /// </summary>
        [Output("policyId")]
        public Output<string?> PolicyId { get; private set; } = null!;

        /// <summary>
        /// The value of the tunnel attributes.
        /// </summary>
        [Output("tunnels")]
        public Output<ImmutableArray<Outputs.ZeroTrustSplitTunnelTunnel>> Tunnels { get; private set; } = null!;


        /// <summary>
        /// Create a ZeroTrustSplitTunnel resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ZeroTrustSplitTunnel(string name, ZeroTrustSplitTunnelArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/zeroTrustSplitTunnel:ZeroTrustSplitTunnel", name, args ?? new ZeroTrustSplitTunnelArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ZeroTrustSplitTunnel(string name, Input<string> id, ZeroTrustSplitTunnelState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/zeroTrustSplitTunnel:ZeroTrustSplitTunnel", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ZeroTrustSplitTunnel resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ZeroTrustSplitTunnel Get(string name, Input<string> id, ZeroTrustSplitTunnelState? state = null, CustomResourceOptions? options = null)
        {
            return new ZeroTrustSplitTunnel(name, id, state, options);
        }
    }

    public sealed class ZeroTrustSplitTunnelArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        /// <summary>
        /// The mode of the split tunnel policy. Available values: `include`, `exclude`.
        /// </summary>
        [Input("mode", required: true)]
        public Input<string> Mode { get; set; } = null!;

        /// <summary>
        /// The settings policy for which to configure this split tunnel policy.
        /// </summary>
        [Input("policyId")]
        public Input<string>? PolicyId { get; set; }

        [Input("tunnels", required: true)]
        private InputList<Inputs.ZeroTrustSplitTunnelTunnelArgs>? _tunnels;

        /// <summary>
        /// The value of the tunnel attributes.
        /// </summary>
        public InputList<Inputs.ZeroTrustSplitTunnelTunnelArgs> Tunnels
        {
            get => _tunnels ?? (_tunnels = new InputList<Inputs.ZeroTrustSplitTunnelTunnelArgs>());
            set => _tunnels = value;
        }

        public ZeroTrustSplitTunnelArgs()
        {
        }
        public static new ZeroTrustSplitTunnelArgs Empty => new ZeroTrustSplitTunnelArgs();
    }

    public sealed class ZeroTrustSplitTunnelState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// The mode of the split tunnel policy. Available values: `include`, `exclude`.
        /// </summary>
        [Input("mode")]
        public Input<string>? Mode { get; set; }

        /// <summary>
        /// The settings policy for which to configure this split tunnel policy.
        /// </summary>
        [Input("policyId")]
        public Input<string>? PolicyId { get; set; }

        [Input("tunnels")]
        private InputList<Inputs.ZeroTrustSplitTunnelTunnelGetArgs>? _tunnels;

        /// <summary>
        /// The value of the tunnel attributes.
        /// </summary>
        public InputList<Inputs.ZeroTrustSplitTunnelTunnelGetArgs> Tunnels
        {
            get => _tunnels ?? (_tunnels = new InputList<Inputs.ZeroTrustSplitTunnelTunnelGetArgs>());
            set => _tunnels = value;
        }

        public ZeroTrustSplitTunnelState()
        {
        }
        public static new ZeroTrustSplitTunnelState Empty => new ZeroTrustSplitTunnelState();
    }
}