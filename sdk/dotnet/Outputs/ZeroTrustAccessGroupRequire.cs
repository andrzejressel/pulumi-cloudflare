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
    public sealed class ZeroTrustAccessGroupRequire
    {
        public readonly bool? AnyValidServiceToken;
        public readonly ImmutableArray<Outputs.ZeroTrustAccessGroupRequireAuthContext> AuthContexts;
        public readonly string? AuthMethod;
        public readonly ImmutableArray<Outputs.ZeroTrustAccessGroupRequireAzure> Azures;
        public readonly bool? Certificate;
        public readonly string? CommonName;
        /// <summary>
        /// Overflow field if you need to have multiple common*name rules in a single policy.  Use in place of the singular common*name field.
        /// </summary>
        public readonly ImmutableArray<string> CommonNames;
        public readonly ImmutableArray<string> DevicePostures;
        public readonly ImmutableArray<string> EmailDomains;
        public readonly ImmutableArray<string> EmailLists;
        public readonly ImmutableArray<string> Emails;
        public readonly bool? Everyone;
        public readonly ImmutableArray<Outputs.ZeroTrustAccessGroupRequireExternalEvaluation> ExternalEvaluations;
        public readonly ImmutableArray<string> Geos;
        public readonly ImmutableArray<Outputs.ZeroTrustAccessGroupRequireGithub> Githubs;
        public readonly ImmutableArray<string> Groups;
        public readonly ImmutableArray<Outputs.ZeroTrustAccessGroupRequireGsuite> Gsuites;
        /// <summary>
        /// The ID of an existing IP list to reference.
        /// </summary>
        public readonly ImmutableArray<string> IpLists;
        /// <summary>
        /// An IPv4 or IPv6 CIDR block.
        /// </summary>
        public readonly ImmutableArray<string> Ips;
        public readonly ImmutableArray<string> LoginMethods;
        public readonly ImmutableArray<Outputs.ZeroTrustAccessGroupRequireOkta> Oktas;
        public readonly ImmutableArray<Outputs.ZeroTrustAccessGroupRequireSaml> Samls;
        public readonly ImmutableArray<string> ServiceTokens;

        [OutputConstructor]
        private ZeroTrustAccessGroupRequire(
            bool? anyValidServiceToken,

            ImmutableArray<Outputs.ZeroTrustAccessGroupRequireAuthContext> authContexts,

            string? authMethod,

            ImmutableArray<Outputs.ZeroTrustAccessGroupRequireAzure> azures,

            bool? certificate,

            string? commonName,

            ImmutableArray<string> commonNames,

            ImmutableArray<string> devicePostures,

            ImmutableArray<string> emailDomains,

            ImmutableArray<string> emailLists,

            ImmutableArray<string> emails,

            bool? everyone,

            ImmutableArray<Outputs.ZeroTrustAccessGroupRequireExternalEvaluation> externalEvaluations,

            ImmutableArray<string> geos,

            ImmutableArray<Outputs.ZeroTrustAccessGroupRequireGithub> githubs,

            ImmutableArray<string> groups,

            ImmutableArray<Outputs.ZeroTrustAccessGroupRequireGsuite> gsuites,

            ImmutableArray<string> ipLists,

            ImmutableArray<string> ips,

            ImmutableArray<string> loginMethods,

            ImmutableArray<Outputs.ZeroTrustAccessGroupRequireOkta> oktas,

            ImmutableArray<Outputs.ZeroTrustAccessGroupRequireSaml> samls,

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
            EmailLists = emailLists;
            Emails = emails;
            Everyone = everyone;
            ExternalEvaluations = externalEvaluations;
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
