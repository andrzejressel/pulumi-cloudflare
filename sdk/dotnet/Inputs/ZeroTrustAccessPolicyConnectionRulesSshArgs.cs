// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class ZeroTrustAccessPolicyConnectionRulesSshArgs : global::Pulumi.ResourceArgs
    {
        [Input("usernames", required: true)]
        private InputList<string>? _usernames;

        /// <summary>
        /// Contains the Unix usernames that may be used when connecting over SSH.
        /// </summary>
        public InputList<string> Usernames
        {
            get => _usernames ?? (_usernames = new InputList<string>());
            set => _usernames = value;
        }

        public ZeroTrustAccessPolicyConnectionRulesSshArgs()
        {
        }
        public static new ZeroTrustAccessPolicyConnectionRulesSshArgs Empty => new ZeroTrustAccessPolicyConnectionRulesSshArgs();
    }
}
