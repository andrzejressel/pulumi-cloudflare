// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class ApiTokenConditionArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Request IP related conditions. See the definition below.
        /// </summary>
        [Input("requestIp")]
        public Input<Inputs.ApiTokenConditionRequestIpArgs>? RequestIp { get; set; }

        public ApiTokenConditionArgs()
        {
        }
    }
}
