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
    public sealed class ListItem
    {
        /// <summary>
        /// An optional comment for the item.
        /// </summary>
        public readonly string? Comment;
        public readonly Outputs.ListItemValue? Value;

        [OutputConstructor]
        private ListItem(
            string? comment,

            Outputs.ListItemValue? value)
        {
            Comment = comment;
            Value = value;
        }
    }
}
