// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class ZeroTrustGatewaySettingsLoggingSettingsByRuleTypeL4Args : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether to log all activity.
        /// </summary>
        [Input("logAll", required: true)]
        public Input<bool> LogAll { get; set; } = null!;

        [Input("logBlocks", required: true)]
        public Input<bool> LogBlocks { get; set; } = null!;

        public ZeroTrustGatewaySettingsLoggingSettingsByRuleTypeL4Args()
        {
        }
        public static new ZeroTrustGatewaySettingsLoggingSettingsByRuleTypeL4Args Empty => new ZeroTrustGatewaySettingsLoggingSettingsByRuleTypeL4Args();
    }
}
