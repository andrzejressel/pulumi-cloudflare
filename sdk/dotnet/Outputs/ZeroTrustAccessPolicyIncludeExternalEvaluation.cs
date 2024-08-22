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
    public sealed class ZeroTrustAccessPolicyIncludeExternalEvaluation
    {
        public readonly string? EvaluateUrl;
        public readonly string? KeysUrl;

        [OutputConstructor]
        private ZeroTrustAccessPolicyIncludeExternalEvaluation(
            string? evaluateUrl,

            string? keysUrl)
        {
            EvaluateUrl = evaluateUrl;
            KeysUrl = keysUrl;
        }
    }
}
