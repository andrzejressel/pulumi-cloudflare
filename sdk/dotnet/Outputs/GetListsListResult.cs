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
    public sealed class GetListsListResult
    {
        public readonly string? Description;
        /// <summary>
        /// The ID of this resource.
        /// </summary>
        public readonly string? Id;
        public readonly string? Kind;
        public readonly string? Name;
        public readonly int? Numitems;

        [OutputConstructor]
        private GetListsListResult(
            string? description,

            string? id,

            string? kind,

            string? name,

            int? numitems)
        {
            Description = description;
            Id = id;
            Kind = kind;
            Name = name;
            Numitems = numitems;
        }
    }
}