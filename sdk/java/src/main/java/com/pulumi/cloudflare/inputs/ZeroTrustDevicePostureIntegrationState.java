// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.ZeroTrustDevicePostureIntegrationConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ZeroTrustDevicePostureIntegrationState extends com.pulumi.resources.ResourceArgs {

    public static final ZeroTrustDevicePostureIntegrationState Empty = new ZeroTrustDevicePostureIntegrationState();

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
     * The device posture integration&#39;s connection authorization parameters.
     * 
     */
    @Import(name="configs")
    private @Nullable Output<List<ZeroTrustDevicePostureIntegrationConfigArgs>> configs;

    /**
     * @return The device posture integration&#39;s connection authorization parameters.
     * 
     */
    public Optional<Output<List<ZeroTrustDevicePostureIntegrationConfigArgs>>> configs() {
        return Optional.ofNullable(this.configs);
    }

    @Import(name="identifier")
    private @Nullable Output<String> identifier;

    public Optional<Output<String>> identifier() {
        return Optional.ofNullable(this.identifier);
    }

    /**
     * Indicates the frequency with which to poll the third-party API. Must be in the format `1h` or `30m`.
     * 
     */
    @Import(name="interval")
    private @Nullable Output<String> interval;

    /**
     * @return Indicates the frequency with which to poll the third-party API. Must be in the format `1h` or `30m`.
     * 
     */
    public Optional<Output<String>> interval() {
        return Optional.ofNullable(this.interval);
    }

    /**
     * Name of the device posture integration.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the device posture integration.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The device posture integration type. Available values: `workspace_one`, `uptycs`, `crowdstrike_s2s`, `intune`, `kolide`, `sentinelone_s2s`, `tanium_s2s`, `custom_s2s`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The device posture integration type. Available values: `workspace_one`, `uptycs`, `crowdstrike_s2s`, `intune`, `kolide`, `sentinelone_s2s`, `tanium_s2s`, `custom_s2s`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private ZeroTrustDevicePostureIntegrationState() {}

    private ZeroTrustDevicePostureIntegrationState(ZeroTrustDevicePostureIntegrationState $) {
        this.accountId = $.accountId;
        this.configs = $.configs;
        this.identifier = $.identifier;
        this.interval = $.interval;
        this.name = $.name;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZeroTrustDevicePostureIntegrationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZeroTrustDevicePostureIntegrationState $;

        public Builder() {
            $ = new ZeroTrustDevicePostureIntegrationState();
        }

        public Builder(ZeroTrustDevicePostureIntegrationState defaults) {
            $ = new ZeroTrustDevicePostureIntegrationState(Objects.requireNonNull(defaults));
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
         * @param configs The device posture integration&#39;s connection authorization parameters.
         * 
         * @return builder
         * 
         */
        public Builder configs(@Nullable Output<List<ZeroTrustDevicePostureIntegrationConfigArgs>> configs) {
            $.configs = configs;
            return this;
        }

        /**
         * @param configs The device posture integration&#39;s connection authorization parameters.
         * 
         * @return builder
         * 
         */
        public Builder configs(List<ZeroTrustDevicePostureIntegrationConfigArgs> configs) {
            return configs(Output.of(configs));
        }

        /**
         * @param configs The device posture integration&#39;s connection authorization parameters.
         * 
         * @return builder
         * 
         */
        public Builder configs(ZeroTrustDevicePostureIntegrationConfigArgs... configs) {
            return configs(List.of(configs));
        }

        public Builder identifier(@Nullable Output<String> identifier) {
            $.identifier = identifier;
            return this;
        }

        public Builder identifier(String identifier) {
            return identifier(Output.of(identifier));
        }

        /**
         * @param interval Indicates the frequency with which to poll the third-party API. Must be in the format `1h` or `30m`.
         * 
         * @return builder
         * 
         */
        public Builder interval(@Nullable Output<String> interval) {
            $.interval = interval;
            return this;
        }

        /**
         * @param interval Indicates the frequency with which to poll the third-party API. Must be in the format `1h` or `30m`.
         * 
         * @return builder
         * 
         */
        public Builder interval(String interval) {
            return interval(Output.of(interval));
        }

        /**
         * @param name Name of the device posture integration.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the device posture integration.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param type The device posture integration type. Available values: `workspace_one`, `uptycs`, `crowdstrike_s2s`, `intune`, `kolide`, `sentinelone_s2s`, `tanium_s2s`, `custom_s2s`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The device posture integration type. Available values: `workspace_one`, `uptycs`, `crowdstrike_s2s`, `intune`, `kolide`, `sentinelone_s2s`, `tanium_s2s`, `custom_s2s`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ZeroTrustDevicePostureIntegrationState build() {
            return $;
        }
    }

}
