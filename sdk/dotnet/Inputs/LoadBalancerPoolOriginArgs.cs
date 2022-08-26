// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class LoadBalancerPoolOriginArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The IP address (IPv4 or IPv6) of the origin, or the publicly addressable hostname. Hostnames entered here should resolve directly to the origin, and not be a hostname proxied by Cloudflare.
        /// </summary>
        [Input("address", required: true)]
        public Input<string> Address { get; set; } = null!;

        /// <summary>
        /// Whether to enable (the default) this origin within the Pool. Disabled origins will not receive traffic and are excluded from health checks. The origin will only be disabled for the current pool.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("headers")]
        private InputList<Inputs.LoadBalancerPoolOriginHeaderArgs>? _headers;

        /// <summary>
        /// The header name.
        /// </summary>
        public InputList<Inputs.LoadBalancerPoolOriginHeaderArgs> Headers
        {
            get => _headers ?? (_headers = new InputList<Inputs.LoadBalancerPoolOriginHeaderArgs>());
            set => _headers = value;
        }

        /// <summary>
        /// A human-identifiable name for the origin.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The weight (0.01 - 1.00) of this origin, relative to other origins in the pool. Equal values mean equal weighting. A weight of 0 means traffic will not be sent to this origin, but health is still checked. Default: 1.
        /// </summary>
        [Input("weight")]
        public Input<double>? Weight { get; set; }

        public LoadBalancerPoolOriginArgs()
        {
        }
        public static new LoadBalancerPoolOriginArgs Empty => new LoadBalancerPoolOriginArgs();
    }
}
