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
    public sealed class WorkersScriptSecretTextBinding
    {
        /// <summary>
        /// The global variable for the binding in your Worker code.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The secret text you want to store.
        /// </summary>
        public readonly string Text;

        [OutputConstructor]
        private WorkersScriptSecretTextBinding(
            string name,

            string text)
        {
            Name = name;
            Text = text;
        }
    }
}
