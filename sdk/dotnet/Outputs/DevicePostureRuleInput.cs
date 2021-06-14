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
    public sealed class DevicePostureRuleInput
    {
        /// <summary>
        /// Checks if the file should exist.
        /// </summary>
        public readonly bool? Exists;
        /// <summary>
        /// The Teams List id.
        /// </summary>
        public readonly string? Id;
        /// <summary>
        /// The path to the application.
        /// </summary>
        public readonly string? Path;
        /// <summary>
        /// Checks if the application should be running.
        /// </summary>
        public readonly bool? Running;
        /// <summary>
        /// The sha256 hash of the file.
        /// </summary>
        public readonly string? Sha256;
        /// <summary>
        /// The thumbprint of the application certificate.
        /// </summary>
        public readonly string? Thumbprint;

        [OutputConstructor]
        private DevicePostureRuleInput(
            bool? exists,

            string? id,

            string? path,

            bool? running,

            string? sha256,

            string? thumbprint)
        {
            Exists = exists;
            Id = id;
            Path = path;
            Running = running;
            Sha256 = sha256;
            Thumbprint = thumbprint;
        }
    }
}
