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
    public sealed class AccessPolicyIncludeOkta
    {
        public readonly string? IdentityProviderId;
        /// <summary>
        /// Friendly name of the Access Policy.
        /// </summary>
        public readonly ImmutableArray<string> Names;

        [OutputConstructor]
        private AccessPolicyIncludeOkta(
            string? identityProviderId,

            ImmutableArray<string> names)
        {
            IdentityProviderId = identityProviderId;
            Names = names;
        }
    }
}
