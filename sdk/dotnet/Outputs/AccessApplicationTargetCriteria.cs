// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Outputs
{

    [OutputType]
    public sealed class AccessApplicationTargetCriteria
    {
        /// <summary>
        /// The port that the targets use for the chosen communication protocol. A port cannot be assigned to multiple protocols.
        /// </summary>
        public readonly int Port;
        /// <summary>
        /// The communication protocol your application secures.
        /// </summary>
        public readonly string Protocol;
        /// <summary>
        /// Contains a map of target attribute keys to target attribute values.
        /// </summary>
        public readonly ImmutableArray<Outputs.AccessApplicationTargetCriteriaTargetAttribute> TargetAttributes;

        [OutputConstructor]
        private AccessApplicationTargetCriteria(
            int port,

            string protocol,

            ImmutableArray<Outputs.AccessApplicationTargetCriteriaTargetAttribute> targetAttributes)
        {
            Port = port;
            Protocol = protocol;
            TargetAttributes = targetAttributes;
        }
    }
}
