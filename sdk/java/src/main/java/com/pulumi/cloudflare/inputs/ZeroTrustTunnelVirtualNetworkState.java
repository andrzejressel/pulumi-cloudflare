// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ZeroTrustTunnelVirtualNetworkState extends com.pulumi.resources.ResourceArgs {

    public static final ZeroTrustTunnelVirtualNetworkState Empty = new ZeroTrustTunnelVirtualNetworkState();

    /**
     * The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * Description of the tunnel virtual network.
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return Description of the tunnel virtual network.
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * Whether this virtual network is the default one for the account. This means IP Routes belong to this virtual network and Teams Clients in the account route through this virtual network, unless specified otherwise for each case.
     * 
     */
    @Import(name="isDefaultNetwork")
    private @Nullable Output<Boolean> isDefaultNetwork;

    /**
     * @return Whether this virtual network is the default one for the account. This means IP Routes belong to this virtual network and Teams Clients in the account route through this virtual network, unless specified otherwise for each case.
     * 
     */
    public Optional<Output<Boolean>> isDefaultNetwork() {
        return Optional.ofNullable(this.isDefaultNetwork);
    }

    /**
     * A user-friendly name chosen when the virtual network is created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A user-friendly name chosen when the virtual network is created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private ZeroTrustTunnelVirtualNetworkState() {}

    private ZeroTrustTunnelVirtualNetworkState(ZeroTrustTunnelVirtualNetworkState $) {
        this.accountId = $.accountId;
        this.comment = $.comment;
        this.isDefaultNetwork = $.isDefaultNetwork;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZeroTrustTunnelVirtualNetworkState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZeroTrustTunnelVirtualNetworkState $;

        public Builder() {
            $ = new ZeroTrustTunnelVirtualNetworkState();
        }

        public Builder(ZeroTrustTunnelVirtualNetworkState defaults) {
            $ = new ZeroTrustTunnelVirtualNetworkState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
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
         * @param comment Description of the tunnel virtual network.
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment Description of the tunnel virtual network.
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param isDefaultNetwork Whether this virtual network is the default one for the account. This means IP Routes belong to this virtual network and Teams Clients in the account route through this virtual network, unless specified otherwise for each case.
         * 
         * @return builder
         * 
         */
        public Builder isDefaultNetwork(@Nullable Output<Boolean> isDefaultNetwork) {
            $.isDefaultNetwork = isDefaultNetwork;
            return this;
        }

        /**
         * @param isDefaultNetwork Whether this virtual network is the default one for the account. This means IP Routes belong to this virtual network and Teams Clients in the account route through this virtual network, unless specified otherwise for each case.
         * 
         * @return builder
         * 
         */
        public Builder isDefaultNetwork(Boolean isDefaultNetwork) {
            return isDefaultNetwork(Output.of(isDefaultNetwork));
        }

        /**
         * @param name A user-friendly name chosen when the virtual network is created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A user-friendly name chosen when the virtual network is created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public ZeroTrustTunnelVirtualNetworkState build() {
            return $;
        }
    }

}
