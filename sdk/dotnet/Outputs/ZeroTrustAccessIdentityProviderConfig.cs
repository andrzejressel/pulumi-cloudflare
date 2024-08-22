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
    public sealed class ZeroTrustAccessIdentityProviderConfig
    {
        public readonly string? ApiToken;
        public readonly string? AppsDomain;
        public readonly ImmutableArray<string> Attributes;
        public readonly string? AuthUrl;
        public readonly string? AuthorizationServerId;
        public readonly string? CentrifyAccount;
        public readonly string? CentrifyAppId;
        public readonly string? CertsUrl;
        public readonly ImmutableArray<string> Claims;
        public readonly string? ClientId;
        public readonly string? ClientSecret;
        public readonly bool? ConditionalAccessEnabled;
        public readonly string? DirectoryId;
        public readonly string? EmailAttributeName;
        public readonly string? EmailClaimName;
        public readonly string? IdpPublicCert;
        public readonly string? IssuerUrl;
        public readonly string? OktaAccount;
        public readonly string? OneloginAccount;
        public readonly string? PingEnvId;
        public readonly bool? PkceEnabled;
        public readonly string? RedirectUrl;
        public readonly ImmutableArray<string> Scopes;
        public readonly bool? SignRequest;
        public readonly string? SsoTargetUrl;
        public readonly bool? SupportGroups;
        public readonly string? TokenUrl;

        [OutputConstructor]
        private ZeroTrustAccessIdentityProviderConfig(
            string? apiToken,

            string? appsDomain,

            ImmutableArray<string> attributes,

            string? authUrl,

            string? authorizationServerId,

            string? centrifyAccount,

            string? centrifyAppId,

            string? certsUrl,

            ImmutableArray<string> claims,

            string? clientId,

            string? clientSecret,

            bool? conditionalAccessEnabled,

            string? directoryId,

            string? emailAttributeName,

            string? emailClaimName,

            string? idpPublicCert,

            string? issuerUrl,

            string? oktaAccount,

            string? oneloginAccount,

            string? pingEnvId,

            bool? pkceEnabled,

            string? redirectUrl,

            ImmutableArray<string> scopes,

            bool? signRequest,

            string? ssoTargetUrl,

            bool? supportGroups,

            string? tokenUrl)
        {
            ApiToken = apiToken;
            AppsDomain = appsDomain;
            Attributes = attributes;
            AuthUrl = authUrl;
            AuthorizationServerId = authorizationServerId;
            CentrifyAccount = centrifyAccount;
            CentrifyAppId = centrifyAppId;
            CertsUrl = certsUrl;
            Claims = claims;
            ClientId = clientId;
            ClientSecret = clientSecret;
            ConditionalAccessEnabled = conditionalAccessEnabled;
            DirectoryId = directoryId;
            EmailAttributeName = emailAttributeName;
            EmailClaimName = emailClaimName;
            IdpPublicCert = idpPublicCert;
            IssuerUrl = issuerUrl;
            OktaAccount = oktaAccount;
            OneloginAccount = oneloginAccount;
            PingEnvId = pingEnvId;
            PkceEnabled = pkceEnabled;
            RedirectUrl = redirectUrl;
            Scopes = scopes;
            SignRequest = signRequest;
            SsoTargetUrl = ssoTargetUrl;
            SupportGroups = supportGroups;
            TokenUrl = tokenUrl;
        }
    }
}
