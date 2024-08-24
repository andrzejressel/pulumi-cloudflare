// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.ZeroTrustGatewaySettingsLoggingSettingsByRuleTypeDnsArgs;
import com.pulumi.cloudflare.inputs.ZeroTrustGatewaySettingsLoggingSettingsByRuleTypeHttpArgs;
import com.pulumi.cloudflare.inputs.ZeroTrustGatewaySettingsLoggingSettingsByRuleTypeL4Args;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.util.Objects;


public final class ZeroTrustGatewaySettingsLoggingSettingsByRuleTypeArgs extends com.pulumi.resources.ResourceArgs {

    public static final ZeroTrustGatewaySettingsLoggingSettingsByRuleTypeArgs Empty = new ZeroTrustGatewaySettingsLoggingSettingsByRuleTypeArgs();

    /**
     * Logging configuration for DNS requests.
     * 
     */
    @Import(name="dns", required=true)
    private Output<ZeroTrustGatewaySettingsLoggingSettingsByRuleTypeDnsArgs> dns;

    /**
     * @return Logging configuration for DNS requests.
     * 
     */
    public Output<ZeroTrustGatewaySettingsLoggingSettingsByRuleTypeDnsArgs> dns() {
        return this.dns;
    }

    /**
     * Logging configuration for HTTP requests.
     * 
     */
    @Import(name="http", required=true)
    private Output<ZeroTrustGatewaySettingsLoggingSettingsByRuleTypeHttpArgs> http;

    /**
     * @return Logging configuration for HTTP requests.
     * 
     */
    public Output<ZeroTrustGatewaySettingsLoggingSettingsByRuleTypeHttpArgs> http() {
        return this.http;
    }

    /**
     * Logging configuration for layer 4 requests.
     * 
     */
    @Import(name="l4", required=true)
    private Output<ZeroTrustGatewaySettingsLoggingSettingsByRuleTypeL4Args> l4;

    /**
     * @return Logging configuration for layer 4 requests.
     * 
     */
    public Output<ZeroTrustGatewaySettingsLoggingSettingsByRuleTypeL4Args> l4() {
        return this.l4;
    }

    private ZeroTrustGatewaySettingsLoggingSettingsByRuleTypeArgs() {}

    private ZeroTrustGatewaySettingsLoggingSettingsByRuleTypeArgs(ZeroTrustGatewaySettingsLoggingSettingsByRuleTypeArgs $) {
        this.dns = $.dns;
        this.http = $.http;
        this.l4 = $.l4;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZeroTrustGatewaySettingsLoggingSettingsByRuleTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZeroTrustGatewaySettingsLoggingSettingsByRuleTypeArgs $;

        public Builder() {
            $ = new ZeroTrustGatewaySettingsLoggingSettingsByRuleTypeArgs();
        }

        public Builder(ZeroTrustGatewaySettingsLoggingSettingsByRuleTypeArgs defaults) {
            $ = new ZeroTrustGatewaySettingsLoggingSettingsByRuleTypeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dns Logging configuration for DNS requests.
         * 
         * @return builder
         * 
         */
        public Builder dns(Output<ZeroTrustGatewaySettingsLoggingSettingsByRuleTypeDnsArgs> dns) {
            $.dns = dns;
            return this;
        }

        /**
         * @param dns Logging configuration for DNS requests.
         * 
         * @return builder
         * 
         */
        public Builder dns(ZeroTrustGatewaySettingsLoggingSettingsByRuleTypeDnsArgs dns) {
            return dns(Output.of(dns));
        }

        /**
         * @param http Logging configuration for HTTP requests.
         * 
         * @return builder
         * 
         */
        public Builder http(Output<ZeroTrustGatewaySettingsLoggingSettingsByRuleTypeHttpArgs> http) {
            $.http = http;
            return this;
        }

        /**
         * @param http Logging configuration for HTTP requests.
         * 
         * @return builder
         * 
         */
        public Builder http(ZeroTrustGatewaySettingsLoggingSettingsByRuleTypeHttpArgs http) {
            return http(Output.of(http));
        }

        /**
         * @param l4 Logging configuration for layer 4 requests.
         * 
         * @return builder
         * 
         */
        public Builder l4(Output<ZeroTrustGatewaySettingsLoggingSettingsByRuleTypeL4Args> l4) {
            $.l4 = l4;
            return this;
        }

        /**
         * @param l4 Logging configuration for layer 4 requests.
         * 
         * @return builder
         * 
         */
        public Builder l4(ZeroTrustGatewaySettingsLoggingSettingsByRuleTypeL4Args l4) {
            return l4(Output.of(l4));
        }

        public ZeroTrustGatewaySettingsLoggingSettingsByRuleTypeArgs build() {
            if ($.dns == null) {
                throw new MissingRequiredPropertyException("ZeroTrustGatewaySettingsLoggingSettingsByRuleTypeArgs", "dns");
            }
            if ($.http == null) {
                throw new MissingRequiredPropertyException("ZeroTrustGatewaySettingsLoggingSettingsByRuleTypeArgs", "http");
            }
            if ($.l4 == null) {
                throw new MissingRequiredPropertyException("ZeroTrustGatewaySettingsLoggingSettingsByRuleTypeArgs", "l4");
            }
            return $;
        }
    }

}