// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.inputs.ZeroTrustDeviceManagedNetworksConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class ZeroTrustDeviceManagedNetworksArgs extends com.pulumi.resources.ResourceArgs {

    public static final ZeroTrustDeviceManagedNetworksArgs Empty = new ZeroTrustDeviceManagedNetworksArgs();

    /**
     * The account identifier to target for the resource.
     * 
     */
    @Import(name="accountId", required=true)
    private Output<String> accountId;

    /**
     * @return The account identifier to target for the resource.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }

    /**
     * The configuration containing information for the WARP client to detect the managed network.
     * 
     */
    @Import(name="config", required=true)
    private Output<ZeroTrustDeviceManagedNetworksConfigArgs> config;

    /**
     * @return The configuration containing information for the WARP client to detect the managed network.
     * 
     */
    public Output<ZeroTrustDeviceManagedNetworksConfigArgs> config() {
        return this.config;
    }

    /**
     * The name of the Device Managed Network. Must be unique.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the Device Managed Network. Must be unique.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The type of Device Managed Network. Available values: `tls`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The type of Device Managed Network. Available values: `tls`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private ZeroTrustDeviceManagedNetworksArgs() {}

    private ZeroTrustDeviceManagedNetworksArgs(ZeroTrustDeviceManagedNetworksArgs $) {
        this.accountId = $.accountId;
        this.config = $.config;
        this.name = $.name;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZeroTrustDeviceManagedNetworksArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZeroTrustDeviceManagedNetworksArgs $;

        public Builder() {
            $ = new ZeroTrustDeviceManagedNetworksArgs();
        }

        public Builder(ZeroTrustDeviceManagedNetworksArgs defaults) {
            $ = new ZeroTrustDeviceManagedNetworksArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder accountId(Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The account identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param config The configuration containing information for the WARP client to detect the managed network.
         * 
         * @return builder
         * 
         */
        public Builder config(Output<ZeroTrustDeviceManagedNetworksConfigArgs> config) {
            $.config = config;
            return this;
        }

        /**
         * @param config The configuration containing information for the WARP client to detect the managed network.
         * 
         * @return builder
         * 
         */
        public Builder config(ZeroTrustDeviceManagedNetworksConfigArgs config) {
            return config(Output.of(config));
        }

        /**
         * @param name The name of the Device Managed Network. Must be unique.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Device Managed Network. Must be unique.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param type The type of Device Managed Network. Available values: `tls`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of Device Managed Network. Available values: `tls`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ZeroTrustDeviceManagedNetworksArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("ZeroTrustDeviceManagedNetworksArgs", "accountId");
            }
            if ($.config == null) {
                throw new MissingRequiredPropertyException("ZeroTrustDeviceManagedNetworksArgs", "config");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("ZeroTrustDeviceManagedNetworksArgs", "name");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("ZeroTrustDeviceManagedNetworksArgs", "type");
            }
            return $;
        }
    }

}
