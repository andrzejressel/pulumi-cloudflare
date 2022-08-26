// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class LoadBalancerRegionPoolArgs : global::Pulumi.ResourceArgs
    {
        [Input("poolIds", required: true)]
        private InputList<string>? _poolIds;

        /// <summary>
        /// A list of pool IDs in failover priority to use for traffic reaching the given PoP.
        /// </summary>
        public InputList<string> PoolIds
        {
            get => _poolIds ?? (_poolIds = new InputList<string>());
            set => _poolIds = value;
        }

        /// <summary>
        /// A region code which must be in the list defined [here](https://developers.cloudflare.com/load-balancing/reference/region-mapping-api/#list-of-load-balancer-regions). Multiple entries should not be specified with the same region.
        /// </summary>
        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        public LoadBalancerRegionPoolArgs()
        {
        }
        public static new LoadBalancerRegionPoolArgs Empty => new LoadBalancerRegionPoolArgs();
    }
}
