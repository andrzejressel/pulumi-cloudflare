// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class ZeroTrustGatewaySettingsPayloadLogArgs extends com.pulumi.resources.ResourceArgs {

    public static final ZeroTrustGatewaySettingsPayloadLogArgs Empty = new ZeroTrustGatewaySettingsPayloadLogArgs();

    /**
     * Public key used to encrypt matched payloads.
     * 
     */
    @Import(name="publicKey", required=true)
    private Output<String> publicKey;

    /**
     * @return Public key used to encrypt matched payloads.
     * 
     */
    public Output<String> publicKey() {
        return this.publicKey;
    }

    private ZeroTrustGatewaySettingsPayloadLogArgs() {}

    private ZeroTrustGatewaySettingsPayloadLogArgs(ZeroTrustGatewaySettingsPayloadLogArgs $) {
        this.publicKey = $.publicKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZeroTrustGatewaySettingsPayloadLogArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZeroTrustGatewaySettingsPayloadLogArgs $;

        public Builder() {
            $ = new ZeroTrustGatewaySettingsPayloadLogArgs();
        }

        public Builder(ZeroTrustGatewaySettingsPayloadLogArgs defaults) {
            $ = new ZeroTrustGatewaySettingsPayloadLogArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param publicKey Public key used to encrypt matched payloads.
         * 
         * @return builder
         * 
         */
        public Builder publicKey(Output<String> publicKey) {
            $.publicKey = publicKey;
            return this;
        }

        /**
         * @param publicKey Public key used to encrypt matched payloads.
         * 
         * @return builder
         * 
         */
        public Builder publicKey(String publicKey) {
            return publicKey(Output.of(publicKey));
        }

        public ZeroTrustGatewaySettingsPayloadLogArgs build() {
            if ($.publicKey == null) {
                throw new MissingRequiredPropertyException("ZeroTrustGatewaySettingsPayloadLogArgs", "publicKey");
            }
            return $;
        }
    }

}