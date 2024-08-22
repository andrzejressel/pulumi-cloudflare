// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class ZeroTrustTunnelCloudflaredConfigConfigIngressRuleOriginRequestAccessArgs : global::Pulumi.ResourceArgs
    {
        [Input("audTags")]
        private InputList<string>? _audTags;

        /// <summary>
        /// Audience tags of the access rule.
        /// </summary>
        public InputList<string> AudTags
        {
            get => _audTags ?? (_audTags = new InputList<string>());
            set => _audTags = value;
        }

        /// <summary>
        /// Whether the access rule is required.
        /// </summary>
        [Input("required")]
        public Input<bool>? Required { get; set; }

        /// <summary>
        /// Name of the team to which the access rule applies.
        /// </summary>
        [Input("teamName")]
        public Input<string>? TeamName { get; set; }

        public ZeroTrustTunnelCloudflaredConfigConfigIngressRuleOriginRequestAccessArgs()
        {
        }
        public static new ZeroTrustTunnelCloudflaredConfigConfigIngressRuleOriginRequestAccessArgs Empty => new ZeroTrustTunnelCloudflaredConfigConfigIngressRuleOriginRequestAccessArgs();
    }
}
