// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.inputs.ZeroTrustAccessIdentityProviderConfigArgs;
import com.pulumi.cloudflare.inputs.ZeroTrustAccessIdentityProviderScimConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ZeroTrustAccessIdentityProviderArgs extends com.pulumi.resources.ResourceArgs {

    public static final ZeroTrustAccessIdentityProviderArgs Empty = new ZeroTrustAccessIdentityProviderArgs();

    /**
     * The account identifier to target for the resource. Conflicts with `zone_id`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return The account identifier to target for the resource. Conflicts with `zone_id`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * Provider configuration from the [developer documentation](https://developers.cloudflare.com/access/configuring-identity-providers/).
     * 
     */
    @Import(name="configs")
    private @Nullable Output<List<ZeroTrustAccessIdentityProviderConfigArgs>> configs;

    /**
     * @return Provider configuration from the [developer documentation](https://developers.cloudflare.com/access/configuring-identity-providers/).
     * 
     */
    public Optional<Output<List<ZeroTrustAccessIdentityProviderConfigArgs>>> configs() {
        return Optional.ofNullable(this.configs);
    }

    /**
     * Friendly name of the Access Identity Provider configuration.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Friendly name of the Access Identity Provider configuration.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Configuration for SCIM settings for a given IDP.
     * 
     */
    @Import(name="scimConfigs")
    private @Nullable Output<List<ZeroTrustAccessIdentityProviderScimConfigArgs>> scimConfigs;

    /**
     * @return Configuration for SCIM settings for a given IDP.
     * 
     */
    public Optional<Output<List<ZeroTrustAccessIdentityProviderScimConfigArgs>>> scimConfigs() {
        return Optional.ofNullable(this.scimConfigs);
    }

    /**
     * The provider type to use. Available values: `azureAD`, `centrify`, `facebook`, `github`, `google`, `google-apps`, `linkedin`, `oidc`, `okta`, `onelogin`, `onetimepin`, `pingone`, `saml`, `yandex`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The provider type to use. Available values: `azureAD`, `centrify`, `facebook`, `github`, `google`, `google-apps`, `linkedin`, `oidc`, `okta`, `onelogin`, `onetimepin`, `pingone`, `saml`, `yandex`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * The zone identifier to target for the resource. Conflicts with `account_id`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Import(name="zoneId")
    private @Nullable Output<String> zoneId;

    /**
     * @return The zone identifier to target for the resource. Conflicts with `account_id`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Optional<Output<String>> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    private ZeroTrustAccessIdentityProviderArgs() {}

    private ZeroTrustAccessIdentityProviderArgs(ZeroTrustAccessIdentityProviderArgs $) {
        this.accountId = $.accountId;
        this.configs = $.configs;
        this.name = $.name;
        this.scimConfigs = $.scimConfigs;
        this.type = $.type;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZeroTrustAccessIdentityProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZeroTrustAccessIdentityProviderArgs $;

        public Builder() {
            $ = new ZeroTrustAccessIdentityProviderArgs();
        }

        public Builder(ZeroTrustAccessIdentityProviderArgs defaults) {
            $ = new ZeroTrustAccessIdentityProviderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account identifier to target for the resource. Conflicts with `zone_id`. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The account identifier to target for the resource. Conflicts with `zone_id`. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param configs Provider configuration from the [developer documentation](https://developers.cloudflare.com/access/configuring-identity-providers/).
         * 
         * @return builder
         * 
         */
        public Builder configs(@Nullable Output<List<ZeroTrustAccessIdentityProviderConfigArgs>> configs) {
            $.configs = configs;
            return this;
        }

        /**
         * @param configs Provider configuration from the [developer documentation](https://developers.cloudflare.com/access/configuring-identity-providers/).
         * 
         * @return builder
         * 
         */
        public Builder configs(List<ZeroTrustAccessIdentityProviderConfigArgs> configs) {
            return configs(Output.of(configs));
        }

        /**
         * @param configs Provider configuration from the [developer documentation](https://developers.cloudflare.com/access/configuring-identity-providers/).
         * 
         * @return builder
         * 
         */
        public Builder configs(ZeroTrustAccessIdentityProviderConfigArgs... configs) {
            return configs(List.of(configs));
        }

        /**
         * @param name Friendly name of the Access Identity Provider configuration.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Friendly name of the Access Identity Provider configuration.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param scimConfigs Configuration for SCIM settings for a given IDP.
         * 
         * @return builder
         * 
         */
        public Builder scimConfigs(@Nullable Output<List<ZeroTrustAccessIdentityProviderScimConfigArgs>> scimConfigs) {
            $.scimConfigs = scimConfigs;
            return this;
        }

        /**
         * @param scimConfigs Configuration for SCIM settings for a given IDP.
         * 
         * @return builder
         * 
         */
        public Builder scimConfigs(List<ZeroTrustAccessIdentityProviderScimConfigArgs> scimConfigs) {
            return scimConfigs(Output.of(scimConfigs));
        }

        /**
         * @param scimConfigs Configuration for SCIM settings for a given IDP.
         * 
         * @return builder
         * 
         */
        public Builder scimConfigs(ZeroTrustAccessIdentityProviderScimConfigArgs... scimConfigs) {
            return scimConfigs(List.of(scimConfigs));
        }

        /**
         * @param type The provider type to use. Available values: `azureAD`, `centrify`, `facebook`, `github`, `google`, `google-apps`, `linkedin`, `oidc`, `okta`, `onelogin`, `onetimepin`, `pingone`, `saml`, `yandex`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The provider type to use. Available values: `azureAD`, `centrify`, `facebook`, `github`, `google`, `google-apps`, `linkedin`, `oidc`, `okta`, `onelogin`, `onetimepin`, `pingone`, `saml`, `yandex`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param zoneId The zone identifier to target for the resource. Conflicts with `account_id`. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder zoneId(@Nullable Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The zone identifier to target for the resource. Conflicts with `account_id`. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public ZeroTrustAccessIdentityProviderArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("ZeroTrustAccessIdentityProviderArgs", "name");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("ZeroTrustAccessIdentityProviderArgs", "type");
            }
            return $;
        }
    }

}