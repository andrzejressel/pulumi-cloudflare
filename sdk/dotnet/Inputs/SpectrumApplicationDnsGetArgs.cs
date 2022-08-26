// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class SpectrumApplicationDnsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Fully qualified domain name of the origin e.g. origin-ssh.example.com.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The type of DNS record associated with the application. Valid values: `CNAME`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public SpectrumApplicationDnsGetArgs()
        {
        }
        public static new SpectrumApplicationDnsGetArgs Empty => new SpectrumApplicationDnsGetArgs();
    }
}
