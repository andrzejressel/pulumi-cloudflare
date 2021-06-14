// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class AccessGroupIncludeGetArgs : Pulumi.ResourceArgs
    {
        [Input("anyValidServiceToken")]
        public Input<bool>? AnyValidServiceToken { get; set; }

        [Input("authMethod")]
        public Input<string>? AuthMethod { get; set; }

        [Input("azures")]
        private InputList<Inputs.AccessGroupIncludeAzureGetArgs>? _azures;
        public InputList<Inputs.AccessGroupIncludeAzureGetArgs> Azures
        {
            get => _azures ?? (_azures = new InputList<Inputs.AccessGroupIncludeAzureGetArgs>());
            set => _azures = value;
        }

        [Input("certificate")]
        public Input<bool>? Certificate { get; set; }

        [Input("commonName")]
        public Input<string>? CommonName { get; set; }

        [Input("devicePostures")]
        private InputList<string>? _devicePostures;
        public InputList<string> DevicePostures
        {
            get => _devicePostures ?? (_devicePostures = new InputList<string>());
            set => _devicePostures = value;
        }

        [Input("emailDomains")]
        private InputList<string>? _emailDomains;
        public InputList<string> EmailDomains
        {
            get => _emailDomains ?? (_emailDomains = new InputList<string>());
            set => _emailDomains = value;
        }

        [Input("emails")]
        private InputList<string>? _emails;
        public InputList<string> Emails
        {
            get => _emails ?? (_emails = new InputList<string>());
            set => _emails = value;
        }

        [Input("everyone")]
        public Input<bool>? Everyone { get; set; }

        [Input("geos")]
        private InputList<string>? _geos;
        public InputList<string> Geos
        {
            get => _geos ?? (_geos = new InputList<string>());
            set => _geos = value;
        }

        [Input("githubs")]
        private InputList<Inputs.AccessGroupIncludeGithubGetArgs>? _githubs;
        public InputList<Inputs.AccessGroupIncludeGithubGetArgs> Githubs
        {
            get => _githubs ?? (_githubs = new InputList<Inputs.AccessGroupIncludeGithubGetArgs>());
            set => _githubs = value;
        }

        [Input("groups")]
        private InputList<string>? _groups;
        public InputList<string> Groups
        {
            get => _groups ?? (_groups = new InputList<string>());
            set => _groups = value;
        }

        [Input("gsuites")]
        private InputList<Inputs.AccessGroupIncludeGsuiteGetArgs>? _gsuites;
        public InputList<Inputs.AccessGroupIncludeGsuiteGetArgs> Gsuites
        {
            get => _gsuites ?? (_gsuites = new InputList<Inputs.AccessGroupIncludeGsuiteGetArgs>());
            set => _gsuites = value;
        }

        [Input("ips")]
        private InputList<string>? _ips;
        public InputList<string> Ips
        {
            get => _ips ?? (_ips = new InputList<string>());
            set => _ips = value;
        }

        [Input("loginMethods")]
        private InputList<string>? _loginMethods;
        public InputList<string> LoginMethods
        {
            get => _loginMethods ?? (_loginMethods = new InputList<string>());
            set => _loginMethods = value;
        }

        [Input("oktas")]
        private InputList<Inputs.AccessGroupIncludeOktaGetArgs>? _oktas;
        public InputList<Inputs.AccessGroupIncludeOktaGetArgs> Oktas
        {
            get => _oktas ?? (_oktas = new InputList<Inputs.AccessGroupIncludeOktaGetArgs>());
            set => _oktas = value;
        }

        [Input("samls")]
        private InputList<Inputs.AccessGroupIncludeSamlGetArgs>? _samls;
        public InputList<Inputs.AccessGroupIncludeSamlGetArgs> Samls
        {
            get => _samls ?? (_samls = new InputList<Inputs.AccessGroupIncludeSamlGetArgs>());
            set => _samls = value;
        }

        [Input("serviceTokens")]
        private InputList<string>? _serviceTokens;
        public InputList<string> ServiceTokens
        {
            get => _serviceTokens ?? (_serviceTokens = new InputList<string>());
            set => _serviceTokens = value;
        }

        public AccessGroupIncludeGetArgs()
        {
        }
    }
}
