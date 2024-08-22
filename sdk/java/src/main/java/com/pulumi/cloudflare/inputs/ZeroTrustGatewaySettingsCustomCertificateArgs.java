// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ZeroTrustGatewaySettingsCustomCertificateArgs extends com.pulumi.resources.ResourceArgs {

    public static final ZeroTrustGatewaySettingsCustomCertificateArgs Empty = new ZeroTrustGatewaySettingsCustomCertificateArgs();

    /**
     * Whether TLS encryption should use a custom certificate.
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return Whether TLS encryption should use a custom certificate.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * ID of custom certificate.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return ID of custom certificate.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    @Import(name="updatedAt")
    private @Nullable Output<String> updatedAt;

    public Optional<Output<String>> updatedAt() {
        return Optional.ofNullable(this.updatedAt);
    }

    private ZeroTrustGatewaySettingsCustomCertificateArgs() {}

    private ZeroTrustGatewaySettingsCustomCertificateArgs(ZeroTrustGatewaySettingsCustomCertificateArgs $) {
        this.enabled = $.enabled;
        this.id = $.id;
        this.updatedAt = $.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZeroTrustGatewaySettingsCustomCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZeroTrustGatewaySettingsCustomCertificateArgs $;

        public Builder() {
            $ = new ZeroTrustGatewaySettingsCustomCertificateArgs();
        }

        public Builder(ZeroTrustGatewaySettingsCustomCertificateArgs defaults) {
            $ = new ZeroTrustGatewaySettingsCustomCertificateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Whether TLS encryption should use a custom certificate.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether TLS encryption should use a custom certificate.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param id ID of custom certificate.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id ID of custom certificate.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public Builder updatedAt(@Nullable Output<String> updatedAt) {
            $.updatedAt = updatedAt;
            return this;
        }

        public Builder updatedAt(String updatedAt) {
            return updatedAt(Output.of(updatedAt));
        }

        public ZeroTrustGatewaySettingsCustomCertificateArgs build() {
            if ($.enabled == null) {
                throw new MissingRequiredPropertyException("ZeroTrustGatewaySettingsCustomCertificateArgs", "enabled");
            }
            return $;
        }
    }

}
