// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class ZeroTrustGatewaySettingsPayloadLogArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Public key used to encrypt matched payloads.
        /// </summary>
        [Input("publicKey", required: true)]
        public Input<string> PublicKey { get; set; } = null!;

        public ZeroTrustGatewaySettingsPayloadLogArgs()
        {
        }
        public static new ZeroTrustGatewaySettingsPayloadLogArgs Empty => new ZeroTrustGatewaySettingsPayloadLogArgs();
    }
}
