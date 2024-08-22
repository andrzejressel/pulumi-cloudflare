// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ZeroTrustGatewayPolicyRuleSettingsL4override {
    /**
     * @return Override IP to forward traffic to.
     * 
     */
    private String ip;
    /**
     * @return Override Port to forward traffic to.
     * 
     */
    private Integer port;

    private ZeroTrustGatewayPolicyRuleSettingsL4override() {}
    /**
     * @return Override IP to forward traffic to.
     * 
     */
    public String ip() {
        return this.ip;
    }
    /**
     * @return Override Port to forward traffic to.
     * 
     */
    public Integer port() {
        return this.port;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ZeroTrustGatewayPolicyRuleSettingsL4override defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String ip;
        private Integer port;
        public Builder() {}
        public Builder(ZeroTrustGatewayPolicyRuleSettingsL4override defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ip = defaults.ip;
    	      this.port = defaults.port;
        }

        @CustomType.Setter
        public Builder ip(String ip) {
            if (ip == null) {
              throw new MissingRequiredPropertyException("ZeroTrustGatewayPolicyRuleSettingsL4override", "ip");
            }
            this.ip = ip;
            return this;
        }
        @CustomType.Setter
        public Builder port(Integer port) {
            if (port == null) {
              throw new MissingRequiredPropertyException("ZeroTrustGatewayPolicyRuleSettingsL4override", "port");
            }
            this.port = port;
            return this;
        }
        public ZeroTrustGatewayPolicyRuleSettingsL4override build() {
            final var _resultValue = new ZeroTrustGatewayPolicyRuleSettingsL4override();
            _resultValue.ip = ip;
            _resultValue.port = port;
            return _resultValue;
        }
    }
}
