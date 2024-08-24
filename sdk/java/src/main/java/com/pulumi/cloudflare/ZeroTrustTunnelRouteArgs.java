// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ZeroTrustTunnelRouteArgs extends com.pulumi.resources.ResourceArgs {

    public static final ZeroTrustTunnelRouteArgs Empty = new ZeroTrustTunnelRouteArgs();

    /**
     * The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Import(name="accountId", required=true)
    private Output<String> accountId;

    /**
     * @return The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }

    /**
     * Description of the tunnel route.
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return Description of the tunnel route.
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * The IPv4 or IPv6 network that should use this tunnel route, in CIDR notation.
     * 
     */
    @Import(name="network", required=true)
    private Output<String> network;

    /**
     * @return The IPv4 or IPv6 network that should use this tunnel route, in CIDR notation.
     * 
     */
    public Output<String> network() {
        return this.network;
    }

    /**
     * The ID of the tunnel that will service the tunnel route.
     * 
     */
    @Import(name="tunnelId", required=true)
    private Output<String> tunnelId;

    /**
     * @return The ID of the tunnel that will service the tunnel route.
     * 
     */
    public Output<String> tunnelId() {
        return this.tunnelId;
    }

    /**
     * The ID of the virtual network for which this route is being added; uses the default virtual network of the account if none is provided. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Import(name="virtualNetworkId")
    private @Nullable Output<String> virtualNetworkId;

    /**
     * @return The ID of the virtual network for which this route is being added; uses the default virtual network of the account if none is provided. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Optional<Output<String>> virtualNetworkId() {
        return Optional.ofNullable(this.virtualNetworkId);
    }

    private ZeroTrustTunnelRouteArgs() {}

    private ZeroTrustTunnelRouteArgs(ZeroTrustTunnelRouteArgs $) {
        this.accountId = $.accountId;
        this.comment = $.comment;
        this.network = $.network;
        this.tunnelId = $.tunnelId;
        this.virtualNetworkId = $.virtualNetworkId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZeroTrustTunnelRouteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZeroTrustTunnelRouteArgs $;

        public Builder() {
            $ = new ZeroTrustTunnelRouteArgs();
        }

        public Builder(ZeroTrustTunnelRouteArgs defaults) {
            $ = new ZeroTrustTunnelRouteArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder accountId(Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param comment Description of the tunnel route.
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment Description of the tunnel route.
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param network The IPv4 or IPv6 network that should use this tunnel route, in CIDR notation.
         * 
         * @return builder
         * 
         */
        public Builder network(Output<String> network) {
            $.network = network;
            return this;
        }

        /**
         * @param network The IPv4 or IPv6 network that should use this tunnel route, in CIDR notation.
         * 
         * @return builder
         * 
         */
        public Builder network(String network) {
            return network(Output.of(network));
        }

        /**
         * @param tunnelId The ID of the tunnel that will service the tunnel route.
         * 
         * @return builder
         * 
         */
        public Builder tunnelId(Output<String> tunnelId) {
            $.tunnelId = tunnelId;
            return this;
        }

        /**
         * @param tunnelId The ID of the tunnel that will service the tunnel route.
         * 
         * @return builder
         * 
         */
        public Builder tunnelId(String tunnelId) {
            return tunnelId(Output.of(tunnelId));
        }

        /**
         * @param virtualNetworkId The ID of the virtual network for which this route is being added; uses the default virtual network of the account if none is provided. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkId(@Nullable Output<String> virtualNetworkId) {
            $.virtualNetworkId = virtualNetworkId;
            return this;
        }

        /**
         * @param virtualNetworkId The ID of the virtual network for which this route is being added; uses the default virtual network of the account if none is provided. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkId(String virtualNetworkId) {
            return virtualNetworkId(Output.of(virtualNetworkId));
        }

        public ZeroTrustTunnelRouteArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("ZeroTrustTunnelRouteArgs", "accountId");
            }
            if ($.network == null) {
                throw new MissingRequiredPropertyException("ZeroTrustTunnelRouteArgs", "network");
            }
            if ($.tunnelId == null) {
                throw new MissingRequiredPropertyException("ZeroTrustTunnelRouteArgs", "tunnelId");
            }
            return $;
        }
    }

}