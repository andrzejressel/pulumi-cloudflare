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
    public sealed class AccessPolicyExcludeAzure
    {
        public readonly string? IdentityProviderId;
        /// <summary>
        /// The ID of this resource.
        /// </summary>
        public readonly ImmutableArray<string> Ids;

        [OutputConstructor]
        private AccessPolicyExcludeAzure(
            string? identityProviderId,

            ImmutableArray<string> ids)
        {
            IdentityProviderId = identityProviderId;
            Ids = ids;
        }
    }
}
