// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class WorkerScriptSecretTextBindingArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The global variable for the binding in your Worker code.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The secret text you want to store.
        /// </summary>
        [Input("text", required: true)]
        public Input<string> Text { get; set; } = null!;

        public WorkerScriptSecretTextBindingArgs()
        {
        }
        public static new WorkerScriptSecretTextBindingArgs Empty => new WorkerScriptSecretTextBindingArgs();
    }
}
