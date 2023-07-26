// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class LoadBalancerRegionPoolArgs : global::Pulumi.ResourceArgs
    {
        [Input("poolIds", required: true)]
        private InputList<string>? _poolIds;
        public InputList<string> PoolIds
        {
            get => _poolIds ?? (_poolIds = new InputList<string>());
            set => _poolIds = value;
        }

        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        public LoadBalancerRegionPoolArgs()
        {
        }
        public static new LoadBalancerRegionPoolArgs Empty => new LoadBalancerRegionPoolArgs();
    }
}
