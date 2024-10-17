// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInfrastructureAccessTargetsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInfrastructureAccessTargetsArgs Empty = new GetInfrastructureAccessTargetsArgs();

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
     * A date and time after a target was created to filter on.
     * 
     */
    @Import(name="createdAfter")
    private @Nullable Output<String> createdAfter;

    /**
     * @return A date and time after a target was created to filter on.
     * 
     */
    public Optional<Output<String>> createdAfter() {
        return Optional.ofNullable(this.createdAfter);
    }

    /**
     * The hostname of the target.
     * 
     */
    @Import(name="hostname")
    private @Nullable Output<String> hostname;

    /**
     * @return The hostname of the target.
     * 
     */
    public Optional<Output<String>> hostname() {
        return Optional.ofNullable(this.hostname);
    }

    /**
     * Partial match to the hostname of a target
     * 
     */
    @Import(name="hostnameContains")
    private @Nullable Output<String> hostnameContains;

    /**
     * @return Partial match to the hostname of a target
     * 
     */
    public Optional<Output<String>> hostnameContains() {
        return Optional.ofNullable(this.hostnameContains);
    }

    /**
     * The target&#39;s IPv4 address.
     * 
     */
    @Import(name="ipv4")
    private @Nullable Output<String> ipv4;

    /**
     * @return The target&#39;s IPv4 address.
     * 
     */
    public Optional<Output<String>> ipv4() {
        return Optional.ofNullable(this.ipv4);
    }

    /**
     * The target&#39;s IPv6 address.
     * 
     */
    @Import(name="ipv6")
    private @Nullable Output<String> ipv6;

    /**
     * @return The target&#39;s IPv6 address.
     * 
     */
    public Optional<Output<String>> ipv6() {
        return Optional.ofNullable(this.ipv6);
    }

    /**
     * A date and time after a target was modified to filter on.
     * 
     */
    @Import(name="modifiedAfter")
    private @Nullable Output<String> modifiedAfter;

    /**
     * @return A date and time after a target was modified to filter on.
     * 
     */
    public Optional<Output<String>> modifiedAfter() {
        return Optional.ofNullable(this.modifiedAfter);
    }

    /**
     * The private virtual network identifier for the target.
     * 
     */
    @Import(name="virtualNetworkId")
    private @Nullable Output<String> virtualNetworkId;

    /**
     * @return The private virtual network identifier for the target.
     * 
     */
    public Optional<Output<String>> virtualNetworkId() {
        return Optional.ofNullable(this.virtualNetworkId);
    }

    private GetInfrastructureAccessTargetsArgs() {}

    private GetInfrastructureAccessTargetsArgs(GetInfrastructureAccessTargetsArgs $) {
        this.accountId = $.accountId;
        this.createdAfter = $.createdAfter;
        this.hostname = $.hostname;
        this.hostnameContains = $.hostnameContains;
        this.ipv4 = $.ipv4;
        this.ipv6 = $.ipv6;
        this.modifiedAfter = $.modifiedAfter;
        this.virtualNetworkId = $.virtualNetworkId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInfrastructureAccessTargetsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInfrastructureAccessTargetsArgs $;

        public Builder() {
            $ = new GetInfrastructureAccessTargetsArgs();
        }

        public Builder(GetInfrastructureAccessTargetsArgs defaults) {
            $ = new GetInfrastructureAccessTargetsArgs(Objects.requireNonNull(defaults));
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
         * @param createdAfter A date and time after a target was created to filter on.
         * 
         * @return builder
         * 
         */
        public Builder createdAfter(@Nullable Output<String> createdAfter) {
            $.createdAfter = createdAfter;
            return this;
        }

        /**
         * @param createdAfter A date and time after a target was created to filter on.
         * 
         * @return builder
         * 
         */
        public Builder createdAfter(String createdAfter) {
            return createdAfter(Output.of(createdAfter));
        }

        /**
         * @param hostname The hostname of the target.
         * 
         * @return builder
         * 
         */
        public Builder hostname(@Nullable Output<String> hostname) {
            $.hostname = hostname;
            return this;
        }

        /**
         * @param hostname The hostname of the target.
         * 
         * @return builder
         * 
         */
        public Builder hostname(String hostname) {
            return hostname(Output.of(hostname));
        }

        /**
         * @param hostnameContains Partial match to the hostname of a target
         * 
         * @return builder
         * 
         */
        public Builder hostnameContains(@Nullable Output<String> hostnameContains) {
            $.hostnameContains = hostnameContains;
            return this;
        }

        /**
         * @param hostnameContains Partial match to the hostname of a target
         * 
         * @return builder
         * 
         */
        public Builder hostnameContains(String hostnameContains) {
            return hostnameContains(Output.of(hostnameContains));
        }

        /**
         * @param ipv4 The target&#39;s IPv4 address.
         * 
         * @return builder
         * 
         */
        public Builder ipv4(@Nullable Output<String> ipv4) {
            $.ipv4 = ipv4;
            return this;
        }

        /**
         * @param ipv4 The target&#39;s IPv4 address.
         * 
         * @return builder
         * 
         */
        public Builder ipv4(String ipv4) {
            return ipv4(Output.of(ipv4));
        }

        /**
         * @param ipv6 The target&#39;s IPv6 address.
         * 
         * @return builder
         * 
         */
        public Builder ipv6(@Nullable Output<String> ipv6) {
            $.ipv6 = ipv6;
            return this;
        }

        /**
         * @param ipv6 The target&#39;s IPv6 address.
         * 
         * @return builder
         * 
         */
        public Builder ipv6(String ipv6) {
            return ipv6(Output.of(ipv6));
        }

        /**
         * @param modifiedAfter A date and time after a target was modified to filter on.
         * 
         * @return builder
         * 
         */
        public Builder modifiedAfter(@Nullable Output<String> modifiedAfter) {
            $.modifiedAfter = modifiedAfter;
            return this;
        }

        /**
         * @param modifiedAfter A date and time after a target was modified to filter on.
         * 
         * @return builder
         * 
         */
        public Builder modifiedAfter(String modifiedAfter) {
            return modifiedAfter(Output.of(modifiedAfter));
        }

        /**
         * @param virtualNetworkId The private virtual network identifier for the target.
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkId(@Nullable Output<String> virtualNetworkId) {
            $.virtualNetworkId = virtualNetworkId;
            return this;
        }

        /**
         * @param virtualNetworkId The private virtual network identifier for the target.
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkId(String virtualNetworkId) {
            return virtualNetworkId(Output.of(virtualNetworkId));
        }

        public GetInfrastructureAccessTargetsArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("GetInfrastructureAccessTargetsArgs", "accountId");
            }
            return $;
        }
    }

}
