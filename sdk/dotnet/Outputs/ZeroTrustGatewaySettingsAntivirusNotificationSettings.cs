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
    public sealed class ZeroTrustGatewaySettingsAntivirusNotificationSettings
    {
        /// <summary>
        /// Enable notification settings.
        /// </summary>
        public readonly bool? Enabled;
        /// <summary>
        /// Notification content.
        /// </summary>
        public readonly string? Message;
        /// <summary>
        /// Support URL to show in the notification.
        /// </summary>
        public readonly string? SupportUrl;

        [OutputConstructor]
        private ZeroTrustGatewaySettingsAntivirusNotificationSettings(
            bool? enabled,

            string? message,

            string? supportUrl)
        {
            Enabled = enabled;
            Message = message;
            SupportUrl = supportUrl;
        }
    }
}
