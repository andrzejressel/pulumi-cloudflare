// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class AccessIdentityProviderConfigGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("apiToken")]
        public Input<string>? ApiToken { get; set; }

        [Input("appsDomain")]
        public Input<string>? AppsDomain { get; set; }

        [Input("attributes")]
        private InputList<string>? _attributes;
        public InputList<string> Attributes
        {
            get => _attributes ?? (_attributes = new InputList<string>());
            set => _attributes = value;
        }

        [Input("authUrl")]
        public Input<string>? AuthUrl { get; set; }

        [Input("centrifyAccount")]
        public Input<string>? CentrifyAccount { get; set; }

        [Input("centrifyAppId")]
        public Input<string>? CentrifyAppId { get; set; }

        [Input("certsUrl")]
        public Input<string>? CertsUrl { get; set; }

        [Input("clientId")]
        public Input<string>? ClientId { get; set; }

        [Input("clientSecret")]
        public Input<string>? ClientSecret { get; set; }

        [Input("directoryId")]
        public Input<string>? DirectoryId { get; set; }

        [Input("emailAttributeName")]
        public Input<string>? EmailAttributeName { get; set; }

        [Input("idpPublicCert")]
        public Input<string>? IdpPublicCert { get; set; }

        [Input("issuerUrl")]
        public Input<string>? IssuerUrl { get; set; }

        [Input("oktaAccount")]
        public Input<string>? OktaAccount { get; set; }

        [Input("oneloginAccount")]
        public Input<string>? OneloginAccount { get; set; }

        [Input("pkceEnabled")]
        public Input<bool>? PkceEnabled { get; set; }

        [Input("redirectUrl")]
        public Input<string>? RedirectUrl { get; set; }

        [Input("signRequest")]
        public Input<bool>? SignRequest { get; set; }

        [Input("ssoTargetUrl")]
        public Input<string>? SsoTargetUrl { get; set; }

        [Input("supportGroups")]
        public Input<bool>? SupportGroups { get; set; }

        [Input("tokenUrl")]
        public Input<string>? TokenUrl { get; set; }

        public AccessIdentityProviderConfigGetArgs()
        {
        }
        public static new AccessIdentityProviderConfigGetArgs Empty => new AccessIdentityProviderConfigGetArgs();
    }
}
