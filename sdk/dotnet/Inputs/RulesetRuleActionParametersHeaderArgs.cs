// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class RulesetRuleActionParametersHeaderArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Use a value dynamically determined by the Firewall Rules expression language based on Wireshark display filters. Refer to the [Firewall Rules language](https://developers.cloudflare.com/firewall/cf-firewall-language) documentation for all available fields, operators, and functions.
        /// </summary>
        [Input("expression")]
        public Input<string>? Expression { get; set; }

        /// <summary>
        /// Name of the HTTP request header to target.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Action to perform on the HTTP request header. Available values: `remove`, `set`, `add`.
        /// </summary>
        [Input("operation")]
        public Input<string>? Operation { get; set; }

        /// <summary>
        /// Static value to provide as the HTTP request header value.
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        public RulesetRuleActionParametersHeaderArgs()
        {
        }
        public static new RulesetRuleActionParametersHeaderArgs Empty => new RulesetRuleActionParametersHeaderArgs();
    }
}
