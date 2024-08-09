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
    public sealed class TeamsRuleRuleSettingsBisoAdminControls
    {
        /// <summary>
        /// Disable clipboard redirection.
        /// </summary>
        public readonly bool? DisableClipboardRedirection;
        /// <summary>
        /// Disable copy-paste.
        /// </summary>
        public readonly bool? DisableCopyPaste;
        /// <summary>
        /// Disable download.
        /// </summary>
        public readonly bool? DisableDownload;
        /// <summary>
        /// Disable keyboard usage.
        /// </summary>
        public readonly bool? DisableKeyboard;
        /// <summary>
        /// Disable printing.
        /// </summary>
        public readonly bool? DisablePrinting;
        /// <summary>
        /// Disable upload.
        /// </summary>
        public readonly bool? DisableUpload;

        [OutputConstructor]
        private TeamsRuleRuleSettingsBisoAdminControls(
            bool? disableClipboardRedirection,

            bool? disableCopyPaste,

            bool? disableDownload,

            bool? disableKeyboard,

            bool? disablePrinting,

            bool? disableUpload)
        {
            DisableClipboardRedirection = disableClipboardRedirection;
            DisableCopyPaste = disableCopyPaste;
            DisableDownload = disableDownload;
            DisableKeyboard = disableKeyboard;
            DisablePrinting = disablePrinting;
            DisableUpload = disableUpload;
        }
    }
}
