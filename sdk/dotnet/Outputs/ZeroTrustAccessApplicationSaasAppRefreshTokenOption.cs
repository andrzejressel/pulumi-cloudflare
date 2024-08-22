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
    public sealed class ZeroTrustAccessApplicationSaasAppRefreshTokenOption
    {
        /// <summary>
        /// How long a refresh token will be valid for after creation. Valid units are `m`, `h` and `d`. Must be longer than 1m.
        /// </summary>
        public readonly string? Lifetime;

        [OutputConstructor]
        private ZeroTrustAccessApplicationSaasAppRefreshTokenOption(string? lifetime)
        {
            Lifetime = lifetime;
        }
    }
}
