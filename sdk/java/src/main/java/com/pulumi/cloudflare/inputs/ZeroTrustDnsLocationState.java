// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.ZeroTrustDnsLocationNetworkArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ZeroTrustDnsLocationState extends com.pulumi.resources.ResourceArgs {

    public static final ZeroTrustDnsLocationState Empty = new ZeroTrustDnsLocationState();

    /**
     * The account identifier to target for the resource.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return The account identifier to target for the resource.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * Indicator that anonymized logs are enabled.
     * 
     */
    @Import(name="anonymizedLogsEnabled")
    private @Nullable Output<Boolean> anonymizedLogsEnabled;

    /**
     * @return Indicator that anonymized logs are enabled.
     * 
     */
    public Optional<Output<Boolean>> anonymizedLogsEnabled() {
        return Optional.ofNullable(this.anonymizedLogsEnabled);
    }

    /**
     * Indicator that this is the default location.
     * 
     */
    @Import(name="clientDefault")
    private @Nullable Output<Boolean> clientDefault;

    /**
     * @return Indicator that this is the default location.
     * 
     */
    public Optional<Output<Boolean>> clientDefault() {
        return Optional.ofNullable(this.clientDefault);
    }

    /**
     * The FQDN that DoH clients should be pointed at.
     * 
     */
    @Import(name="dohSubdomain")
    private @Nullable Output<String> dohSubdomain;

    /**
     * @return The FQDN that DoH clients should be pointed at.
     * 
     */
    public Optional<Output<String>> dohSubdomain() {
        return Optional.ofNullable(this.dohSubdomain);
    }

    /**
     * Indicator that this location needs to resolve EDNS queries.
     * 
     */
    @Import(name="ecsSupport")
    private @Nullable Output<Boolean> ecsSupport;

    /**
     * @return Indicator that this location needs to resolve EDNS queries.
     * 
     */
    public Optional<Output<Boolean>> ecsSupport() {
        return Optional.ofNullable(this.ecsSupport);
    }

    /**
     * Client IP address.
     * 
     */
    @Import(name="ip")
    private @Nullable Output<String> ip;

    /**
     * @return Client IP address.
     * 
     */
    public Optional<Output<String>> ip() {
        return Optional.ofNullable(this.ip);
    }

    /**
     * IP to direct all IPv4 DNS queries to.
     * 
     */
    @Import(name="ipv4Destination")
    private @Nullable Output<String> ipv4Destination;

    /**
     * @return IP to direct all IPv4 DNS queries to.
     * 
     */
    public Optional<Output<String>> ipv4Destination() {
        return Optional.ofNullable(this.ipv4Destination);
    }

    /**
     * Name of the teams location.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the teams location.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The networks CIDRs that comprise the location.
     * 
     */
    @Import(name="networks")
    private @Nullable Output<List<ZeroTrustDnsLocationNetworkArgs>> networks;

    /**
     * @return The networks CIDRs that comprise the location.
     * 
     */
    public Optional<Output<List<ZeroTrustDnsLocationNetworkArgs>>> networks() {
        return Optional.ofNullable(this.networks);
    }

    @Import(name="policyIds")
    private @Nullable Output<List<String>> policyIds;

    public Optional<Output<List<String>>> policyIds() {
        return Optional.ofNullable(this.policyIds);
    }

    private ZeroTrustDnsLocationState() {}

    private ZeroTrustDnsLocationState(ZeroTrustDnsLocationState $) {
        this.accountId = $.accountId;
        this.anonymizedLogsEnabled = $.anonymizedLogsEnabled;
        this.clientDefault = $.clientDefault;
        this.dohSubdomain = $.dohSubdomain;
        this.ecsSupport = $.ecsSupport;
        this.ip = $.ip;
        this.ipv4Destination = $.ipv4Destination;
        this.name = $.name;
        this.networks = $.networks;
        this.policyIds = $.policyIds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZeroTrustDnsLocationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZeroTrustDnsLocationState $;

        public Builder() {
            $ = new ZeroTrustDnsLocationState();
        }

        public Builder(ZeroTrustDnsLocationState defaults) {
            $ = new ZeroTrustDnsLocationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
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
         * @param anonymizedLogsEnabled Indicator that anonymized logs are enabled.
         * 
         * @return builder
         * 
         */
        public Builder anonymizedLogsEnabled(@Nullable Output<Boolean> anonymizedLogsEnabled) {
            $.anonymizedLogsEnabled = anonymizedLogsEnabled;
            return this;
        }

        /**
         * @param anonymizedLogsEnabled Indicator that anonymized logs are enabled.
         * 
         * @return builder
         * 
         */
        public Builder anonymizedLogsEnabled(Boolean anonymizedLogsEnabled) {
            return anonymizedLogsEnabled(Output.of(anonymizedLogsEnabled));
        }

        /**
         * @param clientDefault Indicator that this is the default location.
         * 
         * @return builder
         * 
         */
        public Builder clientDefault(@Nullable Output<Boolean> clientDefault) {
            $.clientDefault = clientDefault;
            return this;
        }

        /**
         * @param clientDefault Indicator that this is the default location.
         * 
         * @return builder
         * 
         */
        public Builder clientDefault(Boolean clientDefault) {
            return clientDefault(Output.of(clientDefault));
        }

        /**
         * @param dohSubdomain The FQDN that DoH clients should be pointed at.
         * 
         * @return builder
         * 
         */
        public Builder dohSubdomain(@Nullable Output<String> dohSubdomain) {
            $.dohSubdomain = dohSubdomain;
            return this;
        }

        /**
         * @param dohSubdomain The FQDN that DoH clients should be pointed at.
         * 
         * @return builder
         * 
         */
        public Builder dohSubdomain(String dohSubdomain) {
            return dohSubdomain(Output.of(dohSubdomain));
        }

        /**
         * @param ecsSupport Indicator that this location needs to resolve EDNS queries.
         * 
         * @return builder
         * 
         */
        public Builder ecsSupport(@Nullable Output<Boolean> ecsSupport) {
            $.ecsSupport = ecsSupport;
            return this;
        }

        /**
         * @param ecsSupport Indicator that this location needs to resolve EDNS queries.
         * 
         * @return builder
         * 
         */
        public Builder ecsSupport(Boolean ecsSupport) {
            return ecsSupport(Output.of(ecsSupport));
        }

        /**
         * @param ip Client IP address.
         * 
         * @return builder
         * 
         */
        public Builder ip(@Nullable Output<String> ip) {
            $.ip = ip;
            return this;
        }

        /**
         * @param ip Client IP address.
         * 
         * @return builder
         * 
         */
        public Builder ip(String ip) {
            return ip(Output.of(ip));
        }

        /**
         * @param ipv4Destination IP to direct all IPv4 DNS queries to.
         * 
         * @return builder
         * 
         */
        public Builder ipv4Destination(@Nullable Output<String> ipv4Destination) {
            $.ipv4Destination = ipv4Destination;
            return this;
        }

        /**
         * @param ipv4Destination IP to direct all IPv4 DNS queries to.
         * 
         * @return builder
         * 
         */
        public Builder ipv4Destination(String ipv4Destination) {
            return ipv4Destination(Output.of(ipv4Destination));
        }

        /**
         * @param name Name of the teams location.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the teams location.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param networks The networks CIDRs that comprise the location.
         * 
         * @return builder
         * 
         */
        public Builder networks(@Nullable Output<List<ZeroTrustDnsLocationNetworkArgs>> networks) {
            $.networks = networks;
            return this;
        }

        /**
         * @param networks The networks CIDRs that comprise the location.
         * 
         * @return builder
         * 
         */
        public Builder networks(List<ZeroTrustDnsLocationNetworkArgs> networks) {
            return networks(Output.of(networks));
        }

        /**
         * @param networks The networks CIDRs that comprise the location.
         * 
         * @return builder
         * 
         */
        public Builder networks(ZeroTrustDnsLocationNetworkArgs... networks) {
            return networks(List.of(networks));
        }

        public Builder policyIds(@Nullable Output<List<String>> policyIds) {
            $.policyIds = policyIds;
            return this;
        }

        public Builder policyIds(List<String> policyIds) {
            return policyIds(Output.of(policyIds));
        }

        public Builder policyIds(String... policyIds) {
            return policyIds(List.of(policyIds));
        }

        public ZeroTrustDnsLocationState build() {
            return $;
        }
    }

}