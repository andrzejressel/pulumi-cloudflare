// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class ZeroTrustDlpProfileEntryGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether the entry is active. Defaults to `false`.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Unique entry identifier.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// Name of the entry to deploy.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("pattern")]
        public Input<Inputs.ZeroTrustDlpProfileEntryPatternGetArgs>? Pattern { get; set; }

        public ZeroTrustDlpProfileEntryGetArgs()
        {
        }
        public static new ZeroTrustDlpProfileEntryGetArgs Empty => new ZeroTrustDlpProfileEntryGetArgs();
    }
}
