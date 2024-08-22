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
    public sealed class ZeroTrustAccessPolicyApprovalGroup
    {
        /// <summary>
        /// Number of approvals needed.
        /// </summary>
        public readonly int ApprovalsNeeded;
        /// <summary>
        /// List of emails to request approval from.
        /// </summary>
        public readonly ImmutableArray<string> EmailAddresses;
        public readonly string? EmailListUuid;

        [OutputConstructor]
        private ZeroTrustAccessPolicyApprovalGroup(
            int approvalsNeeded,

            ImmutableArray<string> emailAddresses,

            string? emailListUuid)
        {
            ApprovalsNeeded = approvalsNeeded;
            EmailAddresses = emailAddresses;
            EmailListUuid = emailListUuid;
        }
    }
}
