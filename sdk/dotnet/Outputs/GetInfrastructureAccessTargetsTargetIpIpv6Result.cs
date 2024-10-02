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
    public sealed class GetInfrastructureAccessTargetsTargetIpIpv6Result
    {
        /// <summary>
        /// The IP address of the target.
        /// </summary>
        public readonly string IpAddr;
        /// <summary>
        /// The private virtual network identifier for the target.
        /// </summary>
        public readonly string VirtualNetworkId;

        [OutputConstructor]
        private GetInfrastructureAccessTargetsTargetIpIpv6Result(
            string ipAddr,

            string virtualNetworkId)
        {
            IpAddr = ipAddr;
            VirtualNetworkId = virtualNetworkId;
        }
    }
}
