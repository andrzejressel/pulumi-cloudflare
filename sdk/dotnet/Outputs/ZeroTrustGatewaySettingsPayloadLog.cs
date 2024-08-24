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
    public sealed class ZeroTrustGatewaySettingsPayloadLog
    {
        /// <summary>
        /// Public key used to encrypt matched payloads.
        /// </summary>
        public readonly string PublicKey;

        [OutputConstructor]
        private ZeroTrustGatewaySettingsPayloadLog(string publicKey)
        {
            PublicKey = publicKey;
        }
    }
}