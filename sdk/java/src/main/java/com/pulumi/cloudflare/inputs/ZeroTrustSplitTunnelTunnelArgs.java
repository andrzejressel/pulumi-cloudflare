// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ZeroTrustSplitTunnelTunnelArgs extends com.pulumi.resources.ResourceArgs {

    public static final ZeroTrustSplitTunnelTunnelArgs Empty = new ZeroTrustSplitTunnelTunnelArgs();

    /**
     * The address for the tunnel.
     * 
     */
    @Import(name="address")
    private @Nullable Output<String> address;

    /**
     * @return The address for the tunnel.
     * 
     */
    public Optional<Output<String>> address() {
        return Optional.ofNullable(this.address);
    }

    /**
     * A description for the tunnel.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description for the tunnel.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The domain name for the tunnel.
     * 
     */
    @Import(name="host")
    private @Nullable Output<String> host;

    /**
     * @return The domain name for the tunnel.
     * 
     */
    public Optional<Output<String>> host() {
        return Optional.ofNullable(this.host);
    }

    private ZeroTrustSplitTunnelTunnelArgs() {}

    private ZeroTrustSplitTunnelTunnelArgs(ZeroTrustSplitTunnelTunnelArgs $) {
        this.address = $.address;
        this.description = $.description;
        this.host = $.host;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZeroTrustSplitTunnelTunnelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZeroTrustSplitTunnelTunnelArgs $;

        public Builder() {
            $ = new ZeroTrustSplitTunnelTunnelArgs();
        }

        public Builder(ZeroTrustSplitTunnelTunnelArgs defaults) {
            $ = new ZeroTrustSplitTunnelTunnelArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param address The address for the tunnel.
         * 
         * @return builder
         * 
         */
        public Builder address(@Nullable Output<String> address) {
            $.address = address;
            return this;
        }

        /**
         * @param address The address for the tunnel.
         * 
         * @return builder
         * 
         */
        public Builder address(String address) {
            return address(Output.of(address));
        }

        /**
         * @param description A description for the tunnel.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description for the tunnel.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param host The domain name for the tunnel.
         * 
         * @return builder
         * 
         */
        public Builder host(@Nullable Output<String> host) {
            $.host = host;
            return this;
        }

        /**
         * @param host The domain name for the tunnel.
         * 
         * @return builder
         * 
         */
        public Builder host(String host) {
            return host(Output.of(host));
        }

        public ZeroTrustSplitTunnelTunnelArgs build() {
            return $;
        }
    }

}
