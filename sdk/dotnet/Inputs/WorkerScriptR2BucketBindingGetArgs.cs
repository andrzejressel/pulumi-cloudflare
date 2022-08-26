// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class WorkerScriptR2BucketBindingGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the Bucket to bind to.
        /// </summary>
        [Input("bucketName", required: true)]
        public Input<string> BucketName { get; set; } = null!;

        /// <summary>
        /// The global variable for the binding in your Worker code.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public WorkerScriptR2BucketBindingGetArgs()
        {
        }
        public static new WorkerScriptR2BucketBindingGetArgs Empty => new WorkerScriptR2BucketBindingGetArgs();
    }
}
