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
    public sealed class LoadBalancerSessionAffinityAttribute
    {
        public readonly int? DrainDuration;
        public readonly ImmutableArray<string> Headers;
        public readonly bool? RequireAllHeaders;
        public readonly string? Samesite;
        public readonly string? Secure;
        public readonly string? ZeroDowntimeFailover;

        [OutputConstructor]
        private LoadBalancerSessionAffinityAttribute(
            int? drainDuration,

            ImmutableArray<string> headers,

            bool? requireAllHeaders,

            string? samesite,

            string? secure,

            string? zeroDowntimeFailover)
        {
            DrainDuration = drainDuration;
            Headers = headers;
            RequireAllHeaders = requireAllHeaders;
            Samesite = samesite;
            Secure = secure;
            ZeroDowntimeFailover = zeroDowntimeFailover;
        }
    }
}
