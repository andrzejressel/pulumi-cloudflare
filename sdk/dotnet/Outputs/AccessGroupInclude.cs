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
    public sealed class AccessGroupInclude
    {
        public readonly bool? AnyValidServiceToken;
        public readonly ImmutableArray<Outputs.AccessGroupIncludeAuthContext> AuthContexts;
        public readonly string? AuthMethod;
        public readonly ImmutableArray<Outputs.AccessGroupIncludeAzure> Azures;
        public readonly bool? Certificate;
        public readonly string? CommonName;
        /// <summary>
        /// Overflow field if you need to have multiple common*name rules in a single policy.  Use in place of the singular common*name field.
        /// </summary>
        public readonly ImmutableArray<string> CommonNames;
        public readonly ImmutableArray<string> DevicePostures;
        public readonly ImmutableArray<string> EmailDomains;
        public readonly ImmutableArray<string> Emails;
        public readonly bool? Everyone;
        public readonly Outputs.AccessGroupIncludeExternalEvaluation? ExternalEvaluation;
        public readonly ImmutableArray<string> Geos;
        public readonly ImmutableArray<Outputs.AccessGroupIncludeGithub> Githubs;
        public readonly ImmutableArray<string> Groups;
        public readonly ImmutableArray<Outputs.AccessGroupIncludeGsuite> Gsuites;
        /// <summary>
        /// The ID of an existing IP list to reference.
        /// </summary>
        public readonly ImmutableArray<string> IpLists;
        /// <summary>
        /// An IPv4 or IPv6 CIDR block.
        /// </summary>
        public readonly ImmutableArray<string> Ips;
        public readonly ImmutableArray<string> LoginMethods;
        public readonly ImmutableArray<Outputs.AccessGroupIncludeOkta> Oktas;
        public readonly ImmutableArray<Outputs.AccessGroupIncludeSaml> Samls;
        public readonly ImmutableArray<string> ServiceTokens;

        [OutputConstructor]
        private AccessGroupInclude(
            bool? anyValidServiceToken,

            ImmutableArray<Outputs.AccessGroupIncludeAuthContext> authContexts,

            string? authMethod,

            ImmutableArray<Outputs.AccessGroupIncludeAzure> azures,

            bool? certificate,

            string? commonName,

            ImmutableArray<string> commonNames,

            ImmutableArray<string> devicePostures,

            ImmutableArray<string> emailDomains,

            ImmutableArray<string> emails,

            bool? everyone,

            Outputs.AccessGroupIncludeExternalEvaluation? externalEvaluation,

            ImmutableArray<string> geos,

            ImmutableArray<Outputs.AccessGroupIncludeGithub> githubs,

            ImmutableArray<string> groups,

            ImmutableArray<Outputs.AccessGroupIncludeGsuite> gsuites,

            ImmutableArray<string> ipLists,

            ImmutableArray<string> ips,

            ImmutableArray<string> loginMethods,

            ImmutableArray<Outputs.AccessGroupIncludeOkta> oktas,

            ImmutableArray<Outputs.AccessGroupIncludeSaml> samls,

            ImmutableArray<string> serviceTokens)
        {
            AnyValidServiceToken = anyValidServiceToken;
            AuthContexts = authContexts;
            AuthMethod = authMethod;
            Azures = azures;
            Certificate = certificate;
            CommonName = commonName;
            CommonNames = commonNames;
            DevicePostures = devicePostures;
            EmailDomains = emailDomains;
            Emails = emails;
            Everyone = everyone;
            ExternalEvaluation = externalEvaluation;
            Geos = geos;
            Githubs = githubs;
            Groups = groups;
            Gsuites = gsuites;
            IpLists = ipLists;
            Ips = ips;
            LoginMethods = loginMethods;
            Oktas = oktas;
            Samls = samls;
            ServiceTokens = serviceTokens;
        }
    }
}
