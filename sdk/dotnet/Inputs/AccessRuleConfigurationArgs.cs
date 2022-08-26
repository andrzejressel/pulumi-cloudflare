// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class AccessRuleConfigurationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The request property to target. Available values: `ip`, `ip6`, `ip_range`, `asn`, `country`.
        /// </summary>
        [Input("target", required: true)]
        public Input<string> Target { get; set; } = null!;

        /// <summary>
        /// The value to target. Depends on target's type.
        /// </summary>
        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public AccessRuleConfigurationArgs()
        {
        }
        public static new AccessRuleConfigurationArgs Empty => new AccessRuleConfigurationArgs();
    }
}
