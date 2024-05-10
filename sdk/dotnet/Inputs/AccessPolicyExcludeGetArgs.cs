// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class AccessPolicyExcludeGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("anyValidServiceToken")]
        public Input<bool>? AnyValidServiceToken { get; set; }

        [Input("authContexts")]
        private InputList<Inputs.AccessPolicyExcludeAuthContextGetArgs>? _authContexts;
        public InputList<Inputs.AccessPolicyExcludeAuthContextGetArgs> AuthContexts
        {
            get => _authContexts ?? (_authContexts = new InputList<Inputs.AccessPolicyExcludeAuthContextGetArgs>());
            set => _authContexts = value;
        }

        [Input("authMethod")]
        public Input<string>? AuthMethod { get; set; }

        [Input("azures")]
        private InputList<Inputs.AccessPolicyExcludeAzureGetArgs>? _azures;
        public InputList<Inputs.AccessPolicyExcludeAzureGetArgs> Azures
        {
            get => _azures ?? (_azures = new InputList<Inputs.AccessPolicyExcludeAzureGetArgs>());
            set => _azures = value;
        }

        [Input("certificate")]
        public Input<bool>? Certificate { get; set; }

        [Input("commonName")]
        public Input<string>? CommonName { get; set; }

        [Input("commonNames")]
        private InputList<string>? _commonNames;

        /// <summary>
        /// Overflow field if you need to have multiple common*name rules in a single policy.  Use in place of the singular common*name field.
        /// </summary>
        public InputList<string> CommonNames
        {
            get => _commonNames ?? (_commonNames = new InputList<string>());
            set => _commonNames = value;
        }

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

        [Input("emailLists")]
        private InputList<string>? _emailLists;
        public InputList<string> EmailLists
        {
            get => _emailLists ?? (_emailLists = new InputList<string>());
            set => _emailLists = value;
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

        [Input("externalEvaluation")]
        public Input<Inputs.AccessPolicyExcludeExternalEvaluationGetArgs>? ExternalEvaluation { get; set; }

        [Input("geos")]
        private InputList<string>? _geos;
        public InputList<string> Geos
        {
            get => _geos ?? (_geos = new InputList<string>());
            set => _geos = value;
        }

        [Input("githubs")]
        private InputList<Inputs.AccessPolicyExcludeGithubGetArgs>? _githubs;
        public InputList<Inputs.AccessPolicyExcludeGithubGetArgs> Githubs
        {
            get => _githubs ?? (_githubs = new InputList<Inputs.AccessPolicyExcludeGithubGetArgs>());
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
        private InputList<Inputs.AccessPolicyExcludeGsuiteGetArgs>? _gsuites;
        public InputList<Inputs.AccessPolicyExcludeGsuiteGetArgs> Gsuites
        {
            get => _gsuites ?? (_gsuites = new InputList<Inputs.AccessPolicyExcludeGsuiteGetArgs>());
            set => _gsuites = value;
        }

        [Input("ipLists")]
        private InputList<string>? _ipLists;

        /// <summary>
        /// The ID of an existing IP list to reference.
        /// </summary>
        public InputList<string> IpLists
        {
            get => _ipLists ?? (_ipLists = new InputList<string>());
            set => _ipLists = value;
        }

        [Input("ips")]
        private InputList<string>? _ips;

        /// <summary>
        /// An IPv4 or IPv6 CIDR block.
        /// </summary>
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
        private InputList<Inputs.AccessPolicyExcludeOktaGetArgs>? _oktas;
        public InputList<Inputs.AccessPolicyExcludeOktaGetArgs> Oktas
        {
            get => _oktas ?? (_oktas = new InputList<Inputs.AccessPolicyExcludeOktaGetArgs>());
            set => _oktas = value;
        }

        [Input("samls")]
        private InputList<Inputs.AccessPolicyExcludeSamlGetArgs>? _samls;
        public InputList<Inputs.AccessPolicyExcludeSamlGetArgs> Samls
        {
            get => _samls ?? (_samls = new InputList<Inputs.AccessPolicyExcludeSamlGetArgs>());
            set => _samls = value;
        }

        [Input("serviceTokens")]
        private InputList<string>? _serviceTokens;
        public InputList<string> ServiceTokens
        {
            get => _serviceTokens ?? (_serviceTokens = new InputList<string>());
            set => _serviceTokens = value;
        }

        public AccessPolicyExcludeGetArgs()
        {
        }
        public static new AccessPolicyExcludeGetArgs Empty => new AccessPolicyExcludeGetArgs();
    }
}
