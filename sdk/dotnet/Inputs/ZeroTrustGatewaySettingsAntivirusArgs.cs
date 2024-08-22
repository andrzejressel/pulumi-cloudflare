// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class ZeroTrustGatewaySettingsAntivirusArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Scan on file download.
        /// </summary>
        [Input("enabledDownloadPhase", required: true)]
        public Input<bool> EnabledDownloadPhase { get; set; } = null!;

        /// <summary>
        /// Scan on file upload.
        /// </summary>
        [Input("enabledUploadPhase", required: true)]
        public Input<bool> EnabledUploadPhase { get; set; } = null!;

        /// <summary>
        /// Block requests for files that cannot be scanned.
        /// </summary>
        [Input("failClosed", required: true)]
        public Input<bool> FailClosed { get; set; } = null!;

        /// <summary>
        /// Set notifications for antivirus.
        /// </summary>
        [Input("notificationSettings")]
        public Input<Inputs.ZeroTrustGatewaySettingsAntivirusNotificationSettingsArgs>? NotificationSettings { get; set; }

        public ZeroTrustGatewaySettingsAntivirusArgs()
        {
        }
        public static new ZeroTrustGatewaySettingsAntivirusArgs Empty => new ZeroTrustGatewaySettingsAntivirusArgs();
    }
}
