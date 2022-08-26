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
    public sealed class GetDevicesDeviceResult
    {
        public readonly string? Created;
        public readonly string? DeviceType;
        /// <summary>
        /// The ID of this resource.
        /// </summary>
        public readonly string? Id;
        public readonly string? Ip;
        public readonly string? Key;
        public readonly string? LastSeen;
        public readonly string? Model;
        public readonly string? Name;
        public readonly string? OsVersion;
        public readonly string? Updated;
        public readonly string? UserEmail;
        public readonly string? UserId;
        public readonly string? UserName;
        public readonly string? Version;

        [OutputConstructor]
        private GetDevicesDeviceResult(
            string? created,

            string? deviceType,

            string? id,

            string? ip,

            string? key,

            string? lastSeen,

            string? model,

            string? name,

            string? osVersion,

            string? updated,

            string? userEmail,

            string? userId,

            string? userName,

            string? version)
        {
            Created = created;
            DeviceType = deviceType;
            Id = id;
            Ip = ip;
            Key = key;
            LastSeen = lastSeen;
            Model = model;
            Name = name;
            OsVersion = osVersion;
            Updated = updated;
            UserEmail = userEmail;
            UserId = userId;
            UserName = userName;
            Version = version;
        }
    }
}
