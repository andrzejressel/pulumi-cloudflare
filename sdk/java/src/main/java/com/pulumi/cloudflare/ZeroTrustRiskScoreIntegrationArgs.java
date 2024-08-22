// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ZeroTrustRiskScoreIntegrationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ZeroTrustRiskScoreIntegrationArgs Empty = new ZeroTrustRiskScoreIntegrationArgs();

    /**
     * The account identifier to target for the resource.
     * 
     */
    @Import(name="accountId", required=true)
    private Output<String> accountId;

    /**
     * @return The account identifier to target for the resource.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }

    /**
     * Whether this integration is enabled. If disabled, no risk changes will be exported to the third-party.
     * 
     */
    @Import(name="active")
    private @Nullable Output<Boolean> active;

    /**
     * @return Whether this integration is enabled. If disabled, no risk changes will be exported to the third-party.
     * 
     */
    public Optional<Output<Boolean>> active() {
        return Optional.ofNullable(this.active);
    }

    /**
     * The type of integration, e.g. &#39;Okta&#39;. Full list of allowed values can be found here:
     * https://developers.cloudflare.com/api/operations/dlp-zt-risk-score-integration-create#request-body
     * 
     */
    @Import(name="integrationType", required=true)
    private Output<String> integrationType;

    /**
     * @return The type of integration, e.g. &#39;Okta&#39;. Full list of allowed values can be found here:
     * https://developers.cloudflare.com/api/operations/dlp-zt-risk-score-integration-create#request-body
     * 
     */
    public Output<String> integrationType() {
        return this.integrationType;
    }

    /**
     * A reference id that can be supplied by the client. Currently this should be set to the Access-Okta IDP ID (a UUIDv4). If
     * omitted, a random UUIDv4 is used.
     * https://developers.cloudflare.com/api/operations/access-identity-providers-get-an-access-identity-provider
     * 
     */
    @Import(name="referenceId")
    private @Nullable Output<String> referenceId;

    /**
     * @return A reference id that can be supplied by the client. Currently this should be set to the Access-Okta IDP ID (a UUIDv4). If
     * omitted, a random UUIDv4 is used.
     * https://developers.cloudflare.com/api/operations/access-identity-providers-get-an-access-identity-provider
     * 
     */
    public Optional<Output<String>> referenceId() {
        return Optional.ofNullable(this.referenceId);
    }

    /**
     * The base url of the tenant, e.g. &#39;https://tenant.okta.com&#39;. Must be your Okta Tenant URL and not your custom domain.
     * 
     */
    @Import(name="tenantUrl", required=true)
    private Output<String> tenantUrl;

    /**
     * @return The base url of the tenant, e.g. &#39;https://tenant.okta.com&#39;. Must be your Okta Tenant URL and not your custom domain.
     * 
     */
    public Output<String> tenantUrl() {
        return this.tenantUrl;
    }

    private ZeroTrustRiskScoreIntegrationArgs() {}

    private ZeroTrustRiskScoreIntegrationArgs(ZeroTrustRiskScoreIntegrationArgs $) {
        this.accountId = $.accountId;
        this.active = $.active;
        this.integrationType = $.integrationType;
        this.referenceId = $.referenceId;
        this.tenantUrl = $.tenantUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZeroTrustRiskScoreIntegrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZeroTrustRiskScoreIntegrationArgs $;

        public Builder() {
            $ = new ZeroTrustRiskScoreIntegrationArgs();
        }

        public Builder(ZeroTrustRiskScoreIntegrationArgs defaults) {
            $ = new ZeroTrustRiskScoreIntegrationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder accountId(Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The account identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param active Whether this integration is enabled. If disabled, no risk changes will be exported to the third-party.
         * 
         * @return builder
         * 
         */
        public Builder active(@Nullable Output<Boolean> active) {
            $.active = active;
            return this;
        }

        /**
         * @param active Whether this integration is enabled. If disabled, no risk changes will be exported to the third-party.
         * 
         * @return builder
         * 
         */
        public Builder active(Boolean active) {
            return active(Output.of(active));
        }

        /**
         * @param integrationType The type of integration, e.g. &#39;Okta&#39;. Full list of allowed values can be found here:
         * https://developers.cloudflare.com/api/operations/dlp-zt-risk-score-integration-create#request-body
         * 
         * @return builder
         * 
         */
        public Builder integrationType(Output<String> integrationType) {
            $.integrationType = integrationType;
            return this;
        }

        /**
         * @param integrationType The type of integration, e.g. &#39;Okta&#39;. Full list of allowed values can be found here:
         * https://developers.cloudflare.com/api/operations/dlp-zt-risk-score-integration-create#request-body
         * 
         * @return builder
         * 
         */
        public Builder integrationType(String integrationType) {
            return integrationType(Output.of(integrationType));
        }

        /**
         * @param referenceId A reference id that can be supplied by the client. Currently this should be set to the Access-Okta IDP ID (a UUIDv4). If
         * omitted, a random UUIDv4 is used.
         * https://developers.cloudflare.com/api/operations/access-identity-providers-get-an-access-identity-provider
         * 
         * @return builder
         * 
         */
        public Builder referenceId(@Nullable Output<String> referenceId) {
            $.referenceId = referenceId;
            return this;
        }

        /**
         * @param referenceId A reference id that can be supplied by the client. Currently this should be set to the Access-Okta IDP ID (a UUIDv4). If
         * omitted, a random UUIDv4 is used.
         * https://developers.cloudflare.com/api/operations/access-identity-providers-get-an-access-identity-provider
         * 
         * @return builder
         * 
         */
        public Builder referenceId(String referenceId) {
            return referenceId(Output.of(referenceId));
        }

        /**
         * @param tenantUrl The base url of the tenant, e.g. &#39;https://tenant.okta.com&#39;. Must be your Okta Tenant URL and not your custom domain.
         * 
         * @return builder
         * 
         */
        public Builder tenantUrl(Output<String> tenantUrl) {
            $.tenantUrl = tenantUrl;
            return this;
        }

        /**
         * @param tenantUrl The base url of the tenant, e.g. &#39;https://tenant.okta.com&#39;. Must be your Okta Tenant URL and not your custom domain.
         * 
         * @return builder
         * 
         */
        public Builder tenantUrl(String tenantUrl) {
            return tenantUrl(Output.of(tenantUrl));
        }

        public ZeroTrustRiskScoreIntegrationArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("ZeroTrustRiskScoreIntegrationArgs", "accountId");
            }
            if ($.integrationType == null) {
                throw new MissingRequiredPropertyException("ZeroTrustRiskScoreIntegrationArgs", "integrationType");
            }
            if ($.tenantUrl == null) {
                throw new MissingRequiredPropertyException("ZeroTrustRiskScoreIntegrationArgs", "tenantUrl");
            }
            return $;
        }
    }

}
