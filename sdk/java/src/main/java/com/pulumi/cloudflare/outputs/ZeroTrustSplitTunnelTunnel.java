// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ZeroTrustSplitTunnelTunnel {
    /**
     * @return The address for the tunnel.
     * 
     */
    private @Nullable String address;
    /**
     * @return A description for the tunnel.
     * 
     */
    private @Nullable String description;
    /**
     * @return The domain name for the tunnel.
     * 
     */
    private @Nullable String host;

    private ZeroTrustSplitTunnelTunnel() {}
    /**
     * @return The address for the tunnel.
     * 
     */
    public Optional<String> address() {
        return Optional.ofNullable(this.address);
    }
    /**
     * @return A description for the tunnel.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return The domain name for the tunnel.
     * 
     */
    public Optional<String> host() {
        return Optional.ofNullable(this.host);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ZeroTrustSplitTunnelTunnel defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String address;
        private @Nullable String description;
        private @Nullable String host;
        public Builder() {}
        public Builder(ZeroTrustSplitTunnelTunnel defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.description = defaults.description;
    	      this.host = defaults.host;
        }

        @CustomType.Setter
        public Builder address(@Nullable String address) {

            this.address = address;
            return this;
        }
        @CustomType.Setter
        public Builder description(@Nullable String description) {

            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder host(@Nullable String host) {

            this.host = host;
            return this;
        }
        public ZeroTrustSplitTunnelTunnel build() {
            final var _resultValue = new ZeroTrustSplitTunnelTunnel();
            _resultValue.address = address;
            _resultValue.description = description;
            _resultValue.host = host;
            return _resultValue;
        }
    }
}
