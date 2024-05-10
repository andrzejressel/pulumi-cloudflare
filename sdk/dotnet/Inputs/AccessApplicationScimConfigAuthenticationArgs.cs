// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class AccessApplicationScimConfigAuthenticationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// URL used to generate the auth code used during token generation.
        /// </summary>
        [Input("authorizationUrl")]
        public Input<string>? AuthorizationUrl { get; set; }

        /// <summary>
        /// Client ID used to authenticate when generating a token for authenticating with the remote SCIM service.
        /// </summary>
        [Input("clientId")]
        public Input<string>? ClientId { get; set; }

        /// <summary>
        /// Secret used to authenticate when generating a token for authenticating with the remove SCIM service.
        /// </summary>
        [Input("clientSecret")]
        public Input<string>? ClientSecret { get; set; }

        /// <summary>
        /// The password used to authenticate with the remote SCIM service.
        /// </summary>
        [Input("password")]
        public Input<string>? Password { get; set; }

        /// <summary>
        /// The authentication scheme to use. For OAuth 2 authentication, this value should be `oauth2`
        /// </summary>
        [Input("scheme", required: true)]
        public Input<string> Scheme { get; set; } = null!;

        [Input("scopes")]
        private InputList<string>? _scopes;

        /// <summary>
        /// The authorization scopes to request when generating the token used to authenticate with the remove SCIM service.
        /// </summary>
        public InputList<string> Scopes
        {
            get => _scopes ?? (_scopes = new InputList<string>());
            set => _scopes = value;
        }

        /// <summary>
        /// The token used to authenticate with the remote SCIM service.
        /// </summary>
        [Input("token")]
        public Input<string>? Token { get; set; }

        /// <summary>
        /// URL used to generate the token used to authenticate with the remote SCIM service.
        /// </summary>
        [Input("tokenUrl")]
        public Input<string>? TokenUrl { get; set; }

        /// <summary>
        /// The username used to authenticate with the remote SCIM service.
        /// </summary>
        [Input("user")]
        public Input<string>? User { get; set; }

        public AccessApplicationScimConfigAuthenticationArgs()
        {
        }
        public static new AccessApplicationScimConfigAuthenticationArgs Empty => new AccessApplicationScimConfigAuthenticationArgs();
    }
}
