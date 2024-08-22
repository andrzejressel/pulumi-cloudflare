// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.Objects;


public final class ZeroTrustGatewaySettingsProxyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ZeroTrustGatewaySettingsProxyArgs Empty = new ZeroTrustGatewaySettingsProxyArgs();

    /**
     * Whether root ca is enabled account wide for ZT clients.
     * 
     */
    @Import(name="rootCa", required=true)
    private Output<Boolean> rootCa;

    /**
     * @return Whether root ca is enabled account wide for ZT clients.
     * 
     */
    public Output<Boolean> rootCa() {
        return this.rootCa;
    }

    /**
     * Whether gateway proxy is enabled on gateway devices for TCP traffic.
     * 
     */
    @Import(name="tcp", required=true)
    private Output<Boolean> tcp;

    /**
     * @return Whether gateway proxy is enabled on gateway devices for TCP traffic.
     * 
     */
    public Output<Boolean> tcp() {
        return this.tcp;
    }

    /**
     * Whether gateway proxy is enabled on gateway devices for UDP traffic.
     * 
     */
    @Import(name="udp", required=true)
    private Output<Boolean> udp;

    /**
     * @return Whether gateway proxy is enabled on gateway devices for UDP traffic.
     * 
     */
    public Output<Boolean> udp() {
        return this.udp;
    }

    /**
     * Whether virtual IP (CGNAT) is enabled account wide and will override existing local interface IP for ZT clients.
     * 
     */
    @Import(name="virtualIp", required=true)
    private Output<Boolean> virtualIp;

    /**
     * @return Whether virtual IP (CGNAT) is enabled account wide and will override existing local interface IP for ZT clients.
     * 
     */
    public Output<Boolean> virtualIp() {
        return this.virtualIp;
    }

    private ZeroTrustGatewaySettingsProxyArgs() {}

    private ZeroTrustGatewaySettingsProxyArgs(ZeroTrustGatewaySettingsProxyArgs $) {
        this.rootCa = $.rootCa;
        this.tcp = $.tcp;
        this.udp = $.udp;
        this.virtualIp = $.virtualIp;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZeroTrustGatewaySettingsProxyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZeroTrustGatewaySettingsProxyArgs $;

        public Builder() {
            $ = new ZeroTrustGatewaySettingsProxyArgs();
        }

        public Builder(ZeroTrustGatewaySettingsProxyArgs defaults) {
            $ = new ZeroTrustGatewaySettingsProxyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param rootCa Whether root ca is enabled account wide for ZT clients.
         * 
         * @return builder
         * 
         */
        public Builder rootCa(Output<Boolean> rootCa) {
            $.rootCa = rootCa;
            return this;
        }

        /**
         * @param rootCa Whether root ca is enabled account wide for ZT clients.
         * 
         * @return builder
         * 
         */
        public Builder rootCa(Boolean rootCa) {
            return rootCa(Output.of(rootCa));
        }

        /**
         * @param tcp Whether gateway proxy is enabled on gateway devices for TCP traffic.
         * 
         * @return builder
         * 
         */
        public Builder tcp(Output<Boolean> tcp) {
            $.tcp = tcp;
            return this;
        }

        /**
         * @param tcp Whether gateway proxy is enabled on gateway devices for TCP traffic.
         * 
         * @return builder
         * 
         */
        public Builder tcp(Boolean tcp) {
            return tcp(Output.of(tcp));
        }

        /**
         * @param udp Whether gateway proxy is enabled on gateway devices for UDP traffic.
         * 
         * @return builder
         * 
         */
        public Builder udp(Output<Boolean> udp) {
            $.udp = udp;
            return this;
        }

        /**
         * @param udp Whether gateway proxy is enabled on gateway devices for UDP traffic.
         * 
         * @return builder
         * 
         */
        public Builder udp(Boolean udp) {
            return udp(Output.of(udp));
        }

        /**
         * @param virtualIp Whether virtual IP (CGNAT) is enabled account wide and will override existing local interface IP for ZT clients.
         * 
         * @return builder
         * 
         */
        public Builder virtualIp(Output<Boolean> virtualIp) {
            $.virtualIp = virtualIp;
            return this;
        }

        /**
         * @param virtualIp Whether virtual IP (CGNAT) is enabled account wide and will override existing local interface IP for ZT clients.
         * 
         * @return builder
         * 
         */
        public Builder virtualIp(Boolean virtualIp) {
            return virtualIp(Output.of(virtualIp));
        }

        public ZeroTrustGatewaySettingsProxyArgs build() {
            if ($.rootCa == null) {
                throw new MissingRequiredPropertyException("ZeroTrustGatewaySettingsProxyArgs", "rootCa");
            }
            if ($.tcp == null) {
                throw new MissingRequiredPropertyException("ZeroTrustGatewaySettingsProxyArgs", "tcp");
            }
            if ($.udp == null) {
                throw new MissingRequiredPropertyException("ZeroTrustGatewaySettingsProxyArgs", "udp");
            }
            if ($.virtualIp == null) {
                throw new MissingRequiredPropertyException("ZeroTrustGatewaySettingsProxyArgs", "virtualIp");
            }
            return $;
        }
    }

}
