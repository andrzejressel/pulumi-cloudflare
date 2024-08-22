// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class ZeroTrustGatewaySettingsBlockPageGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Hex code of block page background color.
        /// </summary>
        [Input("backgroundColor")]
        public Input<string>? BackgroundColor { get; set; }

        /// <summary>
        /// Indicator of enablement.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Block page footer text.
        /// </summary>
        [Input("footerText")]
        public Input<string>? FooterText { get; set; }

        /// <summary>
        /// Block page header text.
        /// </summary>
        [Input("headerText")]
        public Input<string>? HeaderText { get; set; }

        /// <summary>
        /// URL of block page logo.
        /// </summary>
        [Input("logoPath")]
        public Input<string>? LogoPath { get; set; }

        /// <summary>
        /// Admin email for users to contact.
        /// </summary>
        [Input("mailtoAddress")]
        public Input<string>? MailtoAddress { get; set; }

        /// <summary>
        /// Subject line for emails created from block page.
        /// </summary>
        [Input("mailtoSubject")]
        public Input<string>? MailtoSubject { get; set; }

        /// <summary>
        /// Name of block page configuration.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public ZeroTrustGatewaySettingsBlockPageGetArgs()
        {
        }
        public static new ZeroTrustGatewaySettingsBlockPageGetArgs Empty => new ZeroTrustGatewaySettingsBlockPageGetArgs();
    }
}
