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
    public sealed class ZeroTrustTunnelCloudflaredConfigConfigIngressRuleOriginRequestIpRule
    {
        /// <summary>
        /// Whether to allow the IP prefix.
        /// </summary>
        public readonly bool? Allow;
        /// <summary>
        /// Ports to use within the IP rule.
        /// </summary>
        public readonly ImmutableArray<int> Ports;
        /// <summary>
        /// IP rule prefix.
        /// </summary>
        public readonly string? Prefix;

        [OutputConstructor]
        private ZeroTrustTunnelCloudflaredConfigConfigIngressRuleOriginRequestIpRule(
            bool? allow,

            ImmutableArray<int> ports,

            string? prefix)
        {
            Allow = allow;
            Ports = ports;
            Prefix = prefix;
        }
    }
}
