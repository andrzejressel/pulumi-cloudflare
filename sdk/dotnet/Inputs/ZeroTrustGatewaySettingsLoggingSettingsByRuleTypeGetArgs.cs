// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class ZeroTrustGatewaySettingsLoggingSettingsByRuleTypeGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Logging configuration for DNS requests.
        /// </summary>
        [Input("dns", required: true)]
        public Input<Inputs.ZeroTrustGatewaySettingsLoggingSettingsByRuleTypeDnsGetArgs> Dns { get; set; } = null!;

        /// <summary>
        /// Logging configuration for HTTP requests.
        /// </summary>
        [Input("http", required: true)]
        public Input<Inputs.ZeroTrustGatewaySettingsLoggingSettingsByRuleTypeHttpGetArgs> Http { get; set; } = null!;

        /// <summary>
        /// Logging configuration for layer 4 requests.
        /// </summary>
        [Input("l4", required: true)]
        public Input<Inputs.ZeroTrustGatewaySettingsLoggingSettingsByRuleTypeL4GetArgs> L4 { get; set; } = null!;

        public ZeroTrustGatewaySettingsLoggingSettingsByRuleTypeGetArgs()
        {
        }
        public static new ZeroTrustGatewaySettingsLoggingSettingsByRuleTypeGetArgs Empty => new ZeroTrustGatewaySettingsLoggingSettingsByRuleTypeGetArgs();
    }
}
