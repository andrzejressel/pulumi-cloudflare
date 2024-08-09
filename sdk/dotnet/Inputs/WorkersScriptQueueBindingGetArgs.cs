// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class WorkersScriptQueueBindingGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the global variable for the binding in your Worker code.
        /// </summary>
        [Input("binding", required: true)]
        public Input<string> Binding { get; set; } = null!;

        /// <summary>
        /// Name of the queue you want to use.
        /// </summary>
        [Input("queue", required: true)]
        public Input<string> Queue { get; set; } = null!;

        public WorkersScriptQueueBindingGetArgs()
        {
        }
        public static new WorkersScriptQueueBindingGetArgs Empty => new WorkersScriptQueueBindingGetArgs();
    }
}
