// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class ZeroTrustAccessPolicyRequireAuthContextGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ACID of the Authentication Context.
        /// </summary>
        [Input("acId", required: true)]
        public Input<string> AcId { get; set; } = null!;

        /// <summary>
        /// The ID of the Authentication Context.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        /// <summary>
        /// The ID of the Azure Identity provider.
        /// </summary>
        [Input("identityProviderId", required: true)]
        public Input<string> IdentityProviderId { get; set; } = null!;

        public ZeroTrustAccessPolicyRequireAuthContextGetArgs()
        {
        }
        public static new ZeroTrustAccessPolicyRequireAuthContextGetArgs Empty => new ZeroTrustAccessPolicyRequireAuthContextGetArgs();
    }
}
