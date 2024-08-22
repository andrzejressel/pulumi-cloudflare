// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class ZeroTrustAccessApplicationLandingPageDesignArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The button color of the landing page.
        /// </summary>
        [Input("buttonColor")]
        public Input<string>? ButtonColor { get; set; }

        /// <summary>
        /// The button text color of the landing page.
        /// </summary>
        [Input("buttonTextColor")]
        public Input<string>? ButtonTextColor { get; set; }

        /// <summary>
        /// The URL of the image to be displayed in the landing page.
        /// </summary>
        [Input("imageUrl")]
        public Input<string>? ImageUrl { get; set; }

        /// <summary>
        /// The message of the landing page.
        /// </summary>
        [Input("message")]
        public Input<string>? Message { get; set; }

        /// <summary>
        /// The title of the landing page.
        /// </summary>
        [Input("title")]
        public Input<string>? Title { get; set; }

        public ZeroTrustAccessApplicationLandingPageDesignArgs()
        {
        }
        public static new ZeroTrustAccessApplicationLandingPageDesignArgs Empty => new ZeroTrustAccessApplicationLandingPageDesignArgs();
    }
}
