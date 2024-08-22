// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    [CloudflareResourceType("cloudflare:index/zeroTrustRiskScoreIntegration:ZeroTrustRiskScoreIntegration")]
    public partial class ZeroTrustRiskScoreIntegration : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        /// <summary>
        /// Whether this integration is enabled. If disabled, no risk changes will be exported to the third-party.
        /// </summary>
        [Output("active")]
        public Output<bool> Active { get; private set; } = null!;

        /// <summary>
        /// The type of integration, e.g. 'Okta'. Full list of allowed values can be found here:
        /// https://developers.cloudflare.com/api/operations/dlp-zt-risk-score-integration-create#request-body
        /// </summary>
        [Output("integrationType")]
        public Output<string> IntegrationType { get; private set; } = null!;

        /// <summary>
        /// A reference id that can be supplied by the client. Currently this should be set to the Access-Okta IDP ID (a UUIDv4). If
        /// omitted, a random UUIDv4 is used.
        /// https://developers.cloudflare.com/api/operations/access-identity-providers-get-an-access-identity-provider
        /// </summary>
        [Output("referenceId")]
        public Output<string> ReferenceId { get; private set; } = null!;

        /// <summary>
        /// The base url of the tenant, e.g. 'https://tenant.okta.com'. Must be your Okta Tenant URL and not your custom domain.
        /// </summary>
        [Output("tenantUrl")]
        public Output<string> TenantUrl { get; private set; } = null!;

        /// <summary>
        /// The URL for the Shared Signals Framework configuration, e.g. '/.well-known/sse-configuration/{integration_uuid}/'.
        /// https://openid.net/specs/openid-sse-framework-1_0.html#rfc.section.6.2.1
        /// </summary>
        [Output("wellKnownUrl")]
        public Output<string> WellKnownUrl { get; private set; } = null!;


        /// <summary>
        /// Create a ZeroTrustRiskScoreIntegration resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ZeroTrustRiskScoreIntegration(string name, ZeroTrustRiskScoreIntegrationArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/zeroTrustRiskScoreIntegration:ZeroTrustRiskScoreIntegration", name, args ?? new ZeroTrustRiskScoreIntegrationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ZeroTrustRiskScoreIntegration(string name, Input<string> id, ZeroTrustRiskScoreIntegrationState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/zeroTrustRiskScoreIntegration:ZeroTrustRiskScoreIntegration", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ZeroTrustRiskScoreIntegration resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ZeroTrustRiskScoreIntegration Get(string name, Input<string> id, ZeroTrustRiskScoreIntegrationState? state = null, CustomResourceOptions? options = null)
        {
            return new ZeroTrustRiskScoreIntegration(name, id, state, options);
        }
    }

    public sealed class ZeroTrustRiskScoreIntegrationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        /// <summary>
        /// Whether this integration is enabled. If disabled, no risk changes will be exported to the third-party.
        /// </summary>
        [Input("active")]
        public Input<bool>? Active { get; set; }

        /// <summary>
        /// The type of integration, e.g. 'Okta'. Full list of allowed values can be found here:
        /// https://developers.cloudflare.com/api/operations/dlp-zt-risk-score-integration-create#request-body
        /// </summary>
        [Input("integrationType", required: true)]
        public Input<string> IntegrationType { get; set; } = null!;

        /// <summary>
        /// A reference id that can be supplied by the client. Currently this should be set to the Access-Okta IDP ID (a UUIDv4). If
        /// omitted, a random UUIDv4 is used.
        /// https://developers.cloudflare.com/api/operations/access-identity-providers-get-an-access-identity-provider
        /// </summary>
        [Input("referenceId")]
        public Input<string>? ReferenceId { get; set; }

        /// <summary>
        /// The base url of the tenant, e.g. 'https://tenant.okta.com'. Must be your Okta Tenant URL and not your custom domain.
        /// </summary>
        [Input("tenantUrl", required: true)]
        public Input<string> TenantUrl { get; set; } = null!;

        public ZeroTrustRiskScoreIntegrationArgs()
        {
        }
        public static new ZeroTrustRiskScoreIntegrationArgs Empty => new ZeroTrustRiskScoreIntegrationArgs();
    }

    public sealed class ZeroTrustRiskScoreIntegrationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// Whether this integration is enabled. If disabled, no risk changes will be exported to the third-party.
        /// </summary>
        [Input("active")]
        public Input<bool>? Active { get; set; }

        /// <summary>
        /// The type of integration, e.g. 'Okta'. Full list of allowed values can be found here:
        /// https://developers.cloudflare.com/api/operations/dlp-zt-risk-score-integration-create#request-body
        /// </summary>
        [Input("integrationType")]
        public Input<string>? IntegrationType { get; set; }

        /// <summary>
        /// A reference id that can be supplied by the client. Currently this should be set to the Access-Okta IDP ID (a UUIDv4). If
        /// omitted, a random UUIDv4 is used.
        /// https://developers.cloudflare.com/api/operations/access-identity-providers-get-an-access-identity-provider
        /// </summary>
        [Input("referenceId")]
        public Input<string>? ReferenceId { get; set; }

        /// <summary>
        /// The base url of the tenant, e.g. 'https://tenant.okta.com'. Must be your Okta Tenant URL and not your custom domain.
        /// </summary>
        [Input("tenantUrl")]
        public Input<string>? TenantUrl { get; set; }

        /// <summary>
        /// The URL for the Shared Signals Framework configuration, e.g. '/.well-known/sse-configuration/{integration_uuid}/'.
        /// https://openid.net/specs/openid-sse-framework-1_0.html#rfc.section.6.2.1
        /// </summary>
        [Input("wellKnownUrl")]
        public Input<string>? WellKnownUrl { get; set; }

        public ZeroTrustRiskScoreIntegrationState()
        {
        }
        public static new ZeroTrustRiskScoreIntegrationState Empty => new ZeroTrustRiskScoreIntegrationState();
    }
}
