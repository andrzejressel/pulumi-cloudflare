// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class ZeroTrustTunnelCloudflaredConfigConfigIngressRuleGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Hostname to match the incoming request with. If the hostname matches, the request will be sent to the service.
        /// </summary>
        [Input("hostname")]
        public Input<string>? Hostname { get; set; }

        [Input("originRequest")]
        public Input<Inputs.ZeroTrustTunnelCloudflaredConfigConfigIngressRuleOriginRequestGetArgs>? OriginRequest { get; set; }

        /// <summary>
        /// Path of the incoming request. If the path matches, the request will be sent to the local service.
        /// </summary>
        [Input("path")]
        public Input<string>? Path { get; set; }

        /// <summary>
        /// Name of the service to which the request will be sent.
        /// </summary>
        [Input("service", required: true)]
        public Input<string> Service { get; set; } = null!;

        public ZeroTrustTunnelCloudflaredConfigConfigIngressRuleGetArgs()
        {
        }
        public static new ZeroTrustTunnelCloudflaredConfigConfigIngressRuleGetArgs Empty => new ZeroTrustTunnelCloudflaredConfigConfigIngressRuleGetArgs();
    }
}
