// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class TeamsRuleRuleSettingsArgs : Pulumi.ResourceArgs
    {
        [Input("bisoAdminControls")]
        public Input<Inputs.TeamsRuleRuleSettingsBisoAdminControlsArgs>? BisoAdminControls { get; set; }

        /// <summary>
        /// Indicator of block page enablement.
        /// </summary>
        [Input("blockPageEnabled")]
        public Input<bool>? BlockPageEnabled { get; set; }

        /// <summary>
        /// The displayed reason for a user being blocked.
        /// </summary>
        [Input("blockPageReason")]
        public Input<string>? BlockPageReason { get; set; }

        /// <summary>
        /// Settings to forward layer 4 traffic.
        /// </summary>
        [Input("l4override")]
        public Input<Inputs.TeamsRuleRuleSettingsL4overrideArgs>? L4override { get; set; }

        /// <summary>
        /// The host to override matching DNS queries with.
        /// </summary>
        [Input("overrideHost")]
        public Input<string>? OverrideHost { get; set; }

        [Input("overrideIps")]
        private InputList<string>? _overrideIps;

        /// <summary>
        /// The IPs to override matching DNS queries with.
        /// </summary>
        public InputList<string> OverrideIps
        {
            get => _overrideIps ?? (_overrideIps = new InputList<string>());
            set => _overrideIps = value;
        }

        public TeamsRuleRuleSettingsArgs()
        {
        }
    }
}
