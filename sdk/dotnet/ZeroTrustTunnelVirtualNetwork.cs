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
    /// Provides a resource, that manages Cloudflare tunnel virtual networks
    /// for Zero Trust. Tunnel virtual networks are used for segregation of
    /// Tunnel IP Routes via Virtualized Networks to handle overlapping
    /// private IPs in your origins.
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
    ///     var example = new Cloudflare.ZeroTrustTunnelVirtualNetwork("example", new()
    ///     {
    ///         AccountId = "f037e56e89293a057740de681ac9abbe",
    ///         Name = "vnet-for-documentation",
    ///         Comment = "New tunnel virtual network for documentation",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import cloudflare:index/zeroTrustTunnelVirtualNetwork:ZeroTrustTunnelVirtualNetwork example &lt;account_id&gt;/&lt;vnet_id&gt;
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/zeroTrustTunnelVirtualNetwork:ZeroTrustTunnelVirtualNetwork")]
    public partial class ZeroTrustTunnelVirtualNetwork : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        /// <summary>
        /// Description of the tunnel virtual network.
        /// </summary>
        [Output("comment")]
        public Output<string?> Comment { get; private set; } = null!;

        /// <summary>
        /// Whether this virtual network is the default one for the account. This means IP Routes belong to this virtual network and Teams Clients in the account route through this virtual network, unless specified otherwise for each case.
        /// </summary>
        [Output("isDefaultNetwork")]
        public Output<bool?> IsDefaultNetwork { get; private set; } = null!;

        /// <summary>
        /// A user-friendly name chosen when the virtual network is created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;


        /// <summary>
        /// Create a ZeroTrustTunnelVirtualNetwork resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ZeroTrustTunnelVirtualNetwork(string name, ZeroTrustTunnelVirtualNetworkArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/zeroTrustTunnelVirtualNetwork:ZeroTrustTunnelVirtualNetwork", name, args ?? new ZeroTrustTunnelVirtualNetworkArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ZeroTrustTunnelVirtualNetwork(string name, Input<string> id, ZeroTrustTunnelVirtualNetworkState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/zeroTrustTunnelVirtualNetwork:ZeroTrustTunnelVirtualNetwork", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ZeroTrustTunnelVirtualNetwork resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ZeroTrustTunnelVirtualNetwork Get(string name, Input<string> id, ZeroTrustTunnelVirtualNetworkState? state = null, CustomResourceOptions? options = null)
        {
            return new ZeroTrustTunnelVirtualNetwork(name, id, state, options);
        }
    }

    public sealed class ZeroTrustTunnelVirtualNetworkArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        /// <summary>
        /// Description of the tunnel virtual network.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// Whether this virtual network is the default one for the account. This means IP Routes belong to this virtual network and Teams Clients in the account route through this virtual network, unless specified otherwise for each case.
        /// </summary>
        [Input("isDefaultNetwork")]
        public Input<bool>? IsDefaultNetwork { get; set; }

        /// <summary>
        /// A user-friendly name chosen when the virtual network is created.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public ZeroTrustTunnelVirtualNetworkArgs()
        {
        }
        public static new ZeroTrustTunnelVirtualNetworkArgs Empty => new ZeroTrustTunnelVirtualNetworkArgs();
    }

    public sealed class ZeroTrustTunnelVirtualNetworkState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// Description of the tunnel virtual network.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// Whether this virtual network is the default one for the account. This means IP Routes belong to this virtual network and Teams Clients in the account route through this virtual network, unless specified otherwise for each case.
        /// </summary>
        [Input("isDefaultNetwork")]
        public Input<bool>? IsDefaultNetwork { get; set; }

        /// <summary>
        /// A user-friendly name chosen when the virtual network is created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public ZeroTrustTunnelVirtualNetworkState()
        {
        }
        public static new ZeroTrustTunnelVirtualNetworkState Empty => new ZeroTrustTunnelVirtualNetworkState();
    }
}
