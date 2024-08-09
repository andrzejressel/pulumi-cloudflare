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
    public sealed class GetGatewayAppTypesAppTypeResult
    {
        /// <summary>
        /// The identifier for the application type of this app.
        /// </summary>
        public readonly int ApplicationTypeId;
        /// <summary>
        /// A short summary of the app type.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The identifier for this app type. There is only one app type per ID.
        /// </summary>
        public readonly int Id;
        /// <summary>
        /// The name of the app type.
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private GetGatewayAppTypesAppTypeResult(
            int applicationTypeId,

            string description,

            int id,

            string name)
        {
            ApplicationTypeId = applicationTypeId;
            Description = description;
            Id = id;
            Name = name;
        }
    }
}
