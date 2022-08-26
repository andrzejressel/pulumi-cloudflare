// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Outputs
{

    [OutputType]
    public sealed class LoadBalancerRegionPool
    {
        /// <summary>
        /// A list of pool IDs in failover priority to use for traffic reaching the given PoP.
        /// </summary>
        public readonly ImmutableArray<string> PoolIds;
        /// <summary>
        /// A region code which must be in the list defined [here](https://developers.cloudflare.com/load-balancing/reference/region-mapping-api/#list-of-load-balancer-regions). Multiple entries should not be specified with the same region.
        /// </summary>
        public readonly string Region;

        [OutputConstructor]
        private LoadBalancerRegionPool(
            ImmutableArray<string> poolIds,

            string region)
        {
            PoolIds = poolIds;
            Region = region;
        }
    }
}
