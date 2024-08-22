// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class ZeroTrustGatewaySettingsProxy {
    /**
     * @return Whether root ca is enabled account wide for ZT clients.
     * 
     */
    private Boolean rootCa;
    /**
     * @return Whether gateway proxy is enabled on gateway devices for TCP traffic.
     * 
     */
    private Boolean tcp;
    /**
     * @return Whether gateway proxy is enabled on gateway devices for UDP traffic.
     * 
     */
    private Boolean udp;
    /**
     * @return Whether virtual IP (CGNAT) is enabled account wide and will override existing local interface IP for ZT clients.
     * 
     */
    private Boolean virtualIp;

    private ZeroTrustGatewaySettingsProxy() {}
    /**
     * @return Whether root ca is enabled account wide for ZT clients.
     * 
     */
    public Boolean rootCa() {
        return this.rootCa;
    }
    /**
     * @return Whether gateway proxy is enabled on gateway devices for TCP traffic.
     * 
     */
    public Boolean tcp() {
        return this.tcp;
    }
    /**
     * @return Whether gateway proxy is enabled on gateway devices for UDP traffic.
     * 
     */
    public Boolean udp() {
        return this.udp;
    }
    /**
     * @return Whether virtual IP (CGNAT) is enabled account wide and will override existing local interface IP for ZT clients.
     * 
     */
    public Boolean virtualIp() {
        return this.virtualIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ZeroTrustGatewaySettingsProxy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean rootCa;
        private Boolean tcp;
        private Boolean udp;
        private Boolean virtualIp;
        public Builder() {}
        public Builder(ZeroTrustGatewaySettingsProxy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rootCa = defaults.rootCa;
    	      this.tcp = defaults.tcp;
    	      this.udp = defaults.udp;
    	      this.virtualIp = defaults.virtualIp;
        }

        @CustomType.Setter
        public Builder rootCa(Boolean rootCa) {
            if (rootCa == null) {
              throw new MissingRequiredPropertyException("ZeroTrustGatewaySettingsProxy", "rootCa");
            }
            this.rootCa = rootCa;
            return this;
        }
        @CustomType.Setter
        public Builder tcp(Boolean tcp) {
            if (tcp == null) {
              throw new MissingRequiredPropertyException("ZeroTrustGatewaySettingsProxy", "tcp");
            }
            this.tcp = tcp;
            return this;
        }
        @CustomType.Setter
        public Builder udp(Boolean udp) {
            if (udp == null) {
              throw new MissingRequiredPropertyException("ZeroTrustGatewaySettingsProxy", "udp");
            }
            this.udp = udp;
            return this;
        }
        @CustomType.Setter
        public Builder virtualIp(Boolean virtualIp) {
            if (virtualIp == null) {
              throw new MissingRequiredPropertyException("ZeroTrustGatewaySettingsProxy", "virtualIp");
            }
            this.virtualIp = virtualIp;
            return this;
        }
        public ZeroTrustGatewaySettingsProxy build() {
            final var _resultValue = new ZeroTrustGatewaySettingsProxy();
            _resultValue.rootCa = rootCa;
            _resultValue.tcp = tcp;
            _resultValue.udp = udp;
            _resultValue.virtualIp = virtualIp;
            return _resultValue;
        }
    }
}
