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
    public sealed class ZeroTrustAccessApplicationScimConfig
    {
        /// <summary>
        /// Attributes for configuring HTTP Basic, OAuth Bearer token, or OAuth 2 authentication schemes for SCIM provisioning to an application.
        /// </summary>
        public readonly Outputs.ZeroTrustAccessApplicationScimConfigAuthentication? Authentication;
        /// <summary>
        /// If false, propagates DELETE requests to the target application for SCIM resources. If true, sets 'active' to false on the SCIM resource. Note: Some targets do not support DELETE operations.
        /// </summary>
        public readonly bool? DeactivateOnDelete;
        /// <summary>
        /// Whether SCIM provisioning is turned on for this application.
        /// </summary>
        public readonly bool? Enabled;
        /// <summary>
        /// The UID of the IdP to use as the source for SCIM resources to provision to this application.
        /// </summary>
        public readonly string IdpUid;
        /// <summary>
        /// A list of mappings to apply to SCIM resources before provisioning them in this application. These can transform or filter the resources to be provisioned.
        /// </summary>
        public readonly ImmutableArray<Outputs.ZeroTrustAccessApplicationScimConfigMapping> Mappings;
        /// <summary>
        /// The base URI for the application's SCIM-compatible API.
        /// </summary>
        public readonly string RemoteUri;

        [OutputConstructor]
        private ZeroTrustAccessApplicationScimConfig(
            Outputs.ZeroTrustAccessApplicationScimConfigAuthentication? authentication,

            bool? deactivateOnDelete,

            bool? enabled,

            string idpUid,

            ImmutableArray<Outputs.ZeroTrustAccessApplicationScimConfigMapping> mappings,

            string remoteUri)
        {
            Authentication = authentication;
            DeactivateOnDelete = deactivateOnDelete;
            Enabled = enabled;
            IdpUid = idpUid;
            Mappings = mappings;
            RemoteUri = remoteUri;
        }
    }
}
