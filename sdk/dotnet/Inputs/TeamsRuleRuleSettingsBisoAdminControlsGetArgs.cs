// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class TeamsRuleRuleSettingsBisoAdminControlsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Disable copy-paste.
        /// </summary>
        [Input("disableCopyPaste")]
        public Input<bool>? DisableCopyPaste { get; set; }

        /// <summary>
        /// Disable download.
        /// </summary>
        [Input("disableDownload")]
        public Input<bool>? DisableDownload { get; set; }

        /// <summary>
        /// Disable keyboard usage.
        /// </summary>
        [Input("disableKeyboard")]
        public Input<bool>? DisableKeyboard { get; set; }

        /// <summary>
        /// Disable printing.
        /// </summary>
        [Input("disablePrinting")]
        public Input<bool>? DisablePrinting { get; set; }

        /// <summary>
        /// Disable upload.
        /// </summary>
        [Input("disableUpload")]
        public Input<bool>? DisableUpload { get; set; }

        public TeamsRuleRuleSettingsBisoAdminControlsGetArgs()
        {
        }
        public static new TeamsRuleRuleSettingsBisoAdminControlsGetArgs Empty => new TeamsRuleRuleSettingsBisoAdminControlsGetArgs();
    }
}
