// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class ZeroTrustDlpProfileEntryPatternGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The regex that defines the pattern.
        /// </summary>
        [Input("regex", required: true)]
        public Input<string> Regex { get; set; } = null!;

        /// <summary>
        /// The validation algorithm to apply with this pattern.
        /// </summary>
        [Input("validation")]
        public Input<string>? Validation { get; set; }

        public ZeroTrustDlpProfileEntryPatternGetArgs()
        {
        }
        public static new ZeroTrustDlpProfileEntryPatternGetArgs Empty => new ZeroTrustDlpProfileEntryPatternGetArgs();
    }
}
