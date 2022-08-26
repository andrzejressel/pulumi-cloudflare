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
    public sealed class ApiTokenPolicy
    {
        /// <summary>
        /// Effect of the policy. Available values: `allow`, `deny`. Defaults to `allow`.
        /// </summary>
        public readonly string? Effect;
        /// <summary>
        /// List of permissions groups IDs. See [documentation](https://developers.cloudflare.com/api/tokens/create/permissions) for more information.
        /// </summary>
        public readonly ImmutableArray<string> PermissionGroups;
        /// <summary>
        /// Describes what operations against which resources are allowed or denied.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Resources;

        [OutputConstructor]
        private ApiTokenPolicy(
            string? effect,

            ImmutableArray<string> permissionGroups,

            ImmutableDictionary<string, string> resources)
        {
            Effect = effect;
            PermissionGroups = permissionGroups;
            Resources = resources;
        }
    }
}
