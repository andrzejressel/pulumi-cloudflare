// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class WorkersScriptKvNamespaceBindingGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The global variable for the binding in your Worker code.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// ID of the KV namespace you want to use.
        /// </summary>
        [Input("namespaceId", required: true)]
        public Input<string> NamespaceId { get; set; } = null!;

        public WorkersScriptKvNamespaceBindingGetArgs()
        {
        }
        public static new WorkersScriptKvNamespaceBindingGetArgs Empty => new WorkersScriptKvNamespaceBindingGetArgs();
    }
}
