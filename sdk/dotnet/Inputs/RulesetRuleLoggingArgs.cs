// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class RulesetRuleLoggingArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Defines if the current rule-level override enables or disables the rule.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        public RulesetRuleLoggingArgs()
        {
        }
    }
}
