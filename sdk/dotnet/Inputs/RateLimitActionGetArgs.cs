// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class RateLimitActionGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The type of action to perform. Allowable values are 'simulate', 'ban', 'challenge', 'js_challenge' and 'managed_challenge'.
        /// </summary>
        [Input("mode", required: true)]
        public Input<string> Mode { get; set; } = null!;

        /// <summary>
        /// Custom content-type and body to return, this overrides the custom error for the zone. This field is not required. Omission will result in default HTML error page. Definition below.
        /// </summary>
        [Input("response")]
        public Input<Inputs.RateLimitActionResponseGetArgs>? Response { get; set; }

        /// <summary>
        /// The time in seconds as an integer to perform the mitigation action. This field is required if the `mode` is either `simulate` or `ban`. Must be the same or greater than the period (min: 1, max: 86400).
        /// </summary>
        [Input("timeout")]
        public Input<int>? Timeout { get; set; }

        public RateLimitActionGetArgs()
        {
        }
        public static new RateLimitActionGetArgs Empty => new RateLimitActionGetArgs();
    }
}
