// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class LoadBalancerRuleArgs : global::Pulumi.ResourceArgs
    {
        [Input("condition")]
        public Input<string>? Condition { get; set; }

        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        [Input("fixedResponse")]
        public Input<Inputs.LoadBalancerRuleFixedResponseArgs>? FixedResponse { get; set; }

        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("overrides")]
        private InputList<Inputs.LoadBalancerRuleOverrideArgs>? _overrides;
        public InputList<Inputs.LoadBalancerRuleOverrideArgs> Overrides
        {
            get => _overrides ?? (_overrides = new InputList<Inputs.LoadBalancerRuleOverrideArgs>());
            set => _overrides = value;
        }

        [Input("priority")]
        public Input<int>? Priority { get; set; }

        [Input("terminates")]
        public Input<bool>? Terminates { get; set; }

        public LoadBalancerRuleArgs()
        {
        }
        public static new LoadBalancerRuleArgs Empty => new LoadBalancerRuleArgs();
    }
}
