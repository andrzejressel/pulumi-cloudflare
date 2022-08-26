// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ZoneState extends com.pulumi.resources.ResourceArgs {

    public static final ZoneState Empty = new ZoneState();

    /**
     * Account ID to manage the zone resource in.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return Account ID to manage the zone resource in.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * Wwhether to scan for DNS records on creation. Ignored after zone is created.
     * 
     */
    @Import(name="jumpStart")
    private @Nullable Output<Boolean> jumpStart;

    /**
     * @return Wwhether to scan for DNS records on creation. Ignored after zone is created.
     * 
     */
    public Optional<Output<Boolean>> jumpStart() {
        return Optional.ofNullable(this.jumpStart);
    }

    @Import(name="meta")
    private @Nullable Output<Map<String,Boolean>> meta;

    public Optional<Output<Map<String,Boolean>>> meta() {
        return Optional.ofNullable(this.meta);
    }

    /**
     * Cloudflare-assigned name servers. This is only populated for zones that use Cloudflare DNS.
     * 
     */
    @Import(name="nameServers")
    private @Nullable Output<List<String>> nameServers;

    /**
     * @return Cloudflare-assigned name servers. This is only populated for zones that use Cloudflare DNS.
     * 
     */
    public Optional<Output<List<String>>> nameServers() {
        return Optional.ofNullable(this.nameServers);
    }

    /**
     * Whether this zone is paused (traffic bypasses Cloudflare). Defaults to `false`.
     * 
     */
    @Import(name="paused")
    private @Nullable Output<Boolean> paused;

    /**
     * @return Whether this zone is paused (traffic bypasses Cloudflare). Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> paused() {
        return Optional.ofNullable(this.paused);
    }

    /**
     * The name of the commercial plan to apply to the zone. Available values: `free`, `pro`, `business`, `enterprise`, `partners_free`, `partners_pro`, `partners_business`, `partners_enterprise`.
     * 
     */
    @Import(name="plan")
    private @Nullable Output<String> plan;

    /**
     * @return The name of the commercial plan to apply to the zone. Available values: `free`, `pro`, `business`, `enterprise`, `partners_free`, `partners_pro`, `partners_business`, `partners_enterprise`.
     * 
     */
    public Optional<Output<String>> plan() {
        return Optional.ofNullable(this.plan);
    }

    /**
     * Status of the zone. Available values: `active`, `pending`, `initializing`, `moved`, `deleted`, `deactivated`.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Status of the zone. Available values: `active`, `pending`, `initializing`, `moved`, `deleted`, `deactivated`.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * A full zone implies that DNS is hosted with Cloudflare. A partial zone is typically a partner-hosted zone or a CNAME setup. Available values: `full`, `partial`. Defaults to `full`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return A full zone implies that DNS is hosted with Cloudflare. A partial zone is typically a partner-hosted zone or a CNAME setup. Available values: `full`, `partial`. Defaults to `full`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * List of Vanity Nameservers (if set).
     * 
     */
    @Import(name="vanityNameServers")
    private @Nullable Output<List<String>> vanityNameServers;

    /**
     * @return List of Vanity Nameservers (if set).
     * 
     */
    public Optional<Output<List<String>>> vanityNameServers() {
        return Optional.ofNullable(this.vanityNameServers);
    }

    /**
     * Contains the TXT record value to validate domain ownership. This is only populated for zones of type `partial`.
     * 
     */
    @Import(name="verificationKey")
    private @Nullable Output<String> verificationKey;

    /**
     * @return Contains the TXT record value to validate domain ownership. This is only populated for zones of type `partial`.
     * 
     */
    public Optional<Output<String>> verificationKey() {
        return Optional.ofNullable(this.verificationKey);
    }

    /**
     * The DNS zone name which will be added.
     * 
     */
    @Import(name="zone")
    private @Nullable Output<String> zone;

    /**
     * @return The DNS zone name which will be added.
     * 
     */
    public Optional<Output<String>> zone() {
        return Optional.ofNullable(this.zone);
    }

    private ZoneState() {}

    private ZoneState(ZoneState $) {
        this.accountId = $.accountId;
        this.jumpStart = $.jumpStart;
        this.meta = $.meta;
        this.nameServers = $.nameServers;
        this.paused = $.paused;
        this.plan = $.plan;
        this.status = $.status;
        this.type = $.type;
        this.vanityNameServers = $.vanityNameServers;
        this.verificationKey = $.verificationKey;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZoneState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZoneState $;

        public Builder() {
            $ = new ZoneState();
        }

        public Builder(ZoneState defaults) {
            $ = new ZoneState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Account ID to manage the zone resource in.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId Account ID to manage the zone resource in.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param jumpStart Wwhether to scan for DNS records on creation. Ignored after zone is created.
         * 
         * @return builder
         * 
         */
        public Builder jumpStart(@Nullable Output<Boolean> jumpStart) {
            $.jumpStart = jumpStart;
            return this;
        }

        /**
         * @param jumpStart Wwhether to scan for DNS records on creation. Ignored after zone is created.
         * 
         * @return builder
         * 
         */
        public Builder jumpStart(Boolean jumpStart) {
            return jumpStart(Output.of(jumpStart));
        }

        public Builder meta(@Nullable Output<Map<String,Boolean>> meta) {
            $.meta = meta;
            return this;
        }

        public Builder meta(Map<String,Boolean> meta) {
            return meta(Output.of(meta));
        }

        /**
         * @param nameServers Cloudflare-assigned name servers. This is only populated for zones that use Cloudflare DNS.
         * 
         * @return builder
         * 
         */
        public Builder nameServers(@Nullable Output<List<String>> nameServers) {
            $.nameServers = nameServers;
            return this;
        }

        /**
         * @param nameServers Cloudflare-assigned name servers. This is only populated for zones that use Cloudflare DNS.
         * 
         * @return builder
         * 
         */
        public Builder nameServers(List<String> nameServers) {
            return nameServers(Output.of(nameServers));
        }

        /**
         * @param nameServers Cloudflare-assigned name servers. This is only populated for zones that use Cloudflare DNS.
         * 
         * @return builder
         * 
         */
        public Builder nameServers(String... nameServers) {
            return nameServers(List.of(nameServers));
        }

        /**
         * @param paused Whether this zone is paused (traffic bypasses Cloudflare). Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder paused(@Nullable Output<Boolean> paused) {
            $.paused = paused;
            return this;
        }

        /**
         * @param paused Whether this zone is paused (traffic bypasses Cloudflare). Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder paused(Boolean paused) {
            return paused(Output.of(paused));
        }

        /**
         * @param plan The name of the commercial plan to apply to the zone. Available values: `free`, `pro`, `business`, `enterprise`, `partners_free`, `partners_pro`, `partners_business`, `partners_enterprise`.
         * 
         * @return builder
         * 
         */
        public Builder plan(@Nullable Output<String> plan) {
            $.plan = plan;
            return this;
        }

        /**
         * @param plan The name of the commercial plan to apply to the zone. Available values: `free`, `pro`, `business`, `enterprise`, `partners_free`, `partners_pro`, `partners_business`, `partners_enterprise`.
         * 
         * @return builder
         * 
         */
        public Builder plan(String plan) {
            return plan(Output.of(plan));
        }

        /**
         * @param status Status of the zone. Available values: `active`, `pending`, `initializing`, `moved`, `deleted`, `deactivated`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Status of the zone. Available values: `active`, `pending`, `initializing`, `moved`, `deleted`, `deactivated`.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param type A full zone implies that DNS is hosted with Cloudflare. A partial zone is typically a partner-hosted zone or a CNAME setup. Available values: `full`, `partial`. Defaults to `full`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type A full zone implies that DNS is hosted with Cloudflare. A partial zone is typically a partner-hosted zone or a CNAME setup. Available values: `full`, `partial`. Defaults to `full`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param vanityNameServers List of Vanity Nameservers (if set).
         * 
         * @return builder
         * 
         */
        public Builder vanityNameServers(@Nullable Output<List<String>> vanityNameServers) {
            $.vanityNameServers = vanityNameServers;
            return this;
        }

        /**
         * @param vanityNameServers List of Vanity Nameservers (if set).
         * 
         * @return builder
         * 
         */
        public Builder vanityNameServers(List<String> vanityNameServers) {
            return vanityNameServers(Output.of(vanityNameServers));
        }

        /**
         * @param vanityNameServers List of Vanity Nameservers (if set).
         * 
         * @return builder
         * 
         */
        public Builder vanityNameServers(String... vanityNameServers) {
            return vanityNameServers(List.of(vanityNameServers));
        }

        /**
         * @param verificationKey Contains the TXT record value to validate domain ownership. This is only populated for zones of type `partial`.
         * 
         * @return builder
         * 
         */
        public Builder verificationKey(@Nullable Output<String> verificationKey) {
            $.verificationKey = verificationKey;
            return this;
        }

        /**
         * @param verificationKey Contains the TXT record value to validate domain ownership. This is only populated for zones of type `partial`.
         * 
         * @return builder
         * 
         */
        public Builder verificationKey(String verificationKey) {
            return verificationKey(Output.of(verificationKey));
        }

        /**
         * @param zone The DNS zone name which will be added.
         * 
         * @return builder
         * 
         */
        public Builder zone(@Nullable Output<String> zone) {
            $.zone = zone;
            return this;
        }

        /**
         * @param zone The DNS zone name which will be added.
         * 
         * @return builder
         * 
         */
        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public ZoneState build() {
            return $;
        }
    }

}
