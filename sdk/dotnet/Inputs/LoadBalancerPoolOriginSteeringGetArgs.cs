// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class LoadBalancerPoolOriginSteeringGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Either "random" (default) or "hash".
        /// </summary>
        [Input("policy")]
        public Input<string>? Policy { get; set; }

        public LoadBalancerPoolOriginSteeringGetArgs()
        {
        }
        public static new LoadBalancerPoolOriginSteeringGetArgs Empty => new LoadBalancerPoolOriginSteeringGetArgs();
    }
}
