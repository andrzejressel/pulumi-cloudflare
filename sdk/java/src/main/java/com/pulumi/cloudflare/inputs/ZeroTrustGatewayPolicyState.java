// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.ZeroTrustGatewayPolicyRuleSettingsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ZeroTrustGatewayPolicyState extends com.pulumi.resources.ResourceArgs {

    public static final ZeroTrustGatewayPolicyState Empty = new ZeroTrustGatewayPolicyState();

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
     * The action executed by matched teams rule. Available values: `allow`, `block`, `safesearch`, `ytrestricted`, `on`, `off`, `scan`, `noscan`, `isolate`, `noisolate`, `override`, `l4_override`, `egress`, `audit_ssh`, `resolve`.
     * 
     */
    @Import(name="action")
    private @Nullable Output<String> action;

    /**
     * @return The action executed by matched teams rule. Available values: `allow`, `block`, `safesearch`, `ytrestricted`, `on`, `off`, `scan`, `noscan`, `isolate`, `noisolate`, `override`, `l4_override`, `egress`, `audit_ssh`, `resolve`.
     * 
     */
    public Optional<Output<String>> action() {
        return Optional.ofNullable(this.action);
    }

    /**
     * The description of the teams rule.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the teams rule.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The wirefilter expression to be used for device_posture check matching.
     * 
     */
    @Import(name="devicePosture")
    private @Nullable Output<String> devicePosture;

    /**
     * @return The wirefilter expression to be used for device_posture check matching.
     * 
     */
    public Optional<Output<String>> devicePosture() {
        return Optional.ofNullable(this.devicePosture);
    }

    /**
     * Indicator of rule enablement.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Indicator of rule enablement.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * The protocol or layer to evaluate the traffic and identity expressions.
     * 
     */
    @Import(name="filters")
    private @Nullable Output<List<String>> filters;

    /**
     * @return The protocol or layer to evaluate the traffic and identity expressions.
     * 
     */
    public Optional<Output<List<String>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The wirefilter expression to be used for identity matching.
     * 
     */
    @Import(name="identity")
    private @Nullable Output<String> identity;

    /**
     * @return The wirefilter expression to be used for identity matching.
     * 
     */
    public Optional<Output<String>> identity() {
        return Optional.ofNullable(this.identity);
    }

    /**
     * The name of the teams rule.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the teams rule.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The evaluation precedence of the teams rule.
     * 
     */
    @Import(name="precedence")
    private @Nullable Output<Integer> precedence;

    /**
     * @return The evaluation precedence of the teams rule.
     * 
     */
    public Optional<Output<Integer>> precedence() {
        return Optional.ofNullable(this.precedence);
    }

    /**
     * Additional rule settings.
     * 
     */
    @Import(name="ruleSettings")
    private @Nullable Output<ZeroTrustGatewayPolicyRuleSettingsArgs> ruleSettings;

    /**
     * @return Additional rule settings.
     * 
     */
    public Optional<Output<ZeroTrustGatewayPolicyRuleSettingsArgs>> ruleSettings() {
        return Optional.ofNullable(this.ruleSettings);
    }

    /**
     * The wirefilter expression to be used for traffic matching.
     * 
     */
    @Import(name="traffic")
    private @Nullable Output<String> traffic;

    /**
     * @return The wirefilter expression to be used for traffic matching.
     * 
     */
    public Optional<Output<String>> traffic() {
        return Optional.ofNullable(this.traffic);
    }

    @Import(name="version")
    private @Nullable Output<Integer> version;

    public Optional<Output<Integer>> version() {
        return Optional.ofNullable(this.version);
    }

    private ZeroTrustGatewayPolicyState() {}

    private ZeroTrustGatewayPolicyState(ZeroTrustGatewayPolicyState $) {
        this.accountId = $.accountId;
        this.action = $.action;
        this.description = $.description;
        this.devicePosture = $.devicePosture;
        this.enabled = $.enabled;
        this.filters = $.filters;
        this.identity = $.identity;
        this.name = $.name;
        this.precedence = $.precedence;
        this.ruleSettings = $.ruleSettings;
        this.traffic = $.traffic;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZeroTrustGatewayPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZeroTrustGatewayPolicyState $;

        public Builder() {
            $ = new ZeroTrustGatewayPolicyState();
        }

        public Builder(ZeroTrustGatewayPolicyState defaults) {
            $ = new ZeroTrustGatewayPolicyState(Objects.requireNonNull(defaults));
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
         * @param action The action executed by matched teams rule. Available values: `allow`, `block`, `safesearch`, `ytrestricted`, `on`, `off`, `scan`, `noscan`, `isolate`, `noisolate`, `override`, `l4_override`, `egress`, `audit_ssh`, `resolve`.
         * 
         * @return builder
         * 
         */
        public Builder action(@Nullable Output<String> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action The action executed by matched teams rule. Available values: `allow`, `block`, `safesearch`, `ytrestricted`, `on`, `off`, `scan`, `noscan`, `isolate`, `noisolate`, `override`, `l4_override`, `egress`, `audit_ssh`, `resolve`.
         * 
         * @return builder
         * 
         */
        public Builder action(String action) {
            return action(Output.of(action));
        }

        /**
         * @param description The description of the teams rule.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the teams rule.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param devicePosture The wirefilter expression to be used for device_posture check matching.
         * 
         * @return builder
         * 
         */
        public Builder devicePosture(@Nullable Output<String> devicePosture) {
            $.devicePosture = devicePosture;
            return this;
        }

        /**
         * @param devicePosture The wirefilter expression to be used for device_posture check matching.
         * 
         * @return builder
         * 
         */
        public Builder devicePosture(String devicePosture) {
            return devicePosture(Output.of(devicePosture));
        }

        /**
         * @param enabled Indicator of rule enablement.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Indicator of rule enablement.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param filters The protocol or layer to evaluate the traffic and identity expressions.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable Output<List<String>> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters The protocol or layer to evaluate the traffic and identity expressions.
         * 
         * @return builder
         * 
         */
        public Builder filters(List<String> filters) {
            return filters(Output.of(filters));
        }

        /**
         * @param filters The protocol or layer to evaluate the traffic and identity expressions.
         * 
         * @return builder
         * 
         */
        public Builder filters(String... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param identity The wirefilter expression to be used for identity matching.
         * 
         * @return builder
         * 
         */
        public Builder identity(@Nullable Output<String> identity) {
            $.identity = identity;
            return this;
        }

        /**
         * @param identity The wirefilter expression to be used for identity matching.
         * 
         * @return builder
         * 
         */
        public Builder identity(String identity) {
            return identity(Output.of(identity));
        }

        /**
         * @param name The name of the teams rule.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the teams rule.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param precedence The evaluation precedence of the teams rule.
         * 
         * @return builder
         * 
         */
        public Builder precedence(@Nullable Output<Integer> precedence) {
            $.precedence = precedence;
            return this;
        }

        /**
         * @param precedence The evaluation precedence of the teams rule.
         * 
         * @return builder
         * 
         */
        public Builder precedence(Integer precedence) {
            return precedence(Output.of(precedence));
        }

        /**
         * @param ruleSettings Additional rule settings.
         * 
         * @return builder
         * 
         */
        public Builder ruleSettings(@Nullable Output<ZeroTrustGatewayPolicyRuleSettingsArgs> ruleSettings) {
            $.ruleSettings = ruleSettings;
            return this;
        }

        /**
         * @param ruleSettings Additional rule settings.
         * 
         * @return builder
         * 
         */
        public Builder ruleSettings(ZeroTrustGatewayPolicyRuleSettingsArgs ruleSettings) {
            return ruleSettings(Output.of(ruleSettings));
        }

        /**
         * @param traffic The wirefilter expression to be used for traffic matching.
         * 
         * @return builder
         * 
         */
        public Builder traffic(@Nullable Output<String> traffic) {
            $.traffic = traffic;
            return this;
        }

        /**
         * @param traffic The wirefilter expression to be used for traffic matching.
         * 
         * @return builder
         * 
         */
        public Builder traffic(String traffic) {
            return traffic(Output.of(traffic));
        }

        public Builder version(@Nullable Output<Integer> version) {
            $.version = version;
            return this;
        }

        public Builder version(Integer version) {
            return version(Output.of(version));
        }

        public ZeroTrustGatewayPolicyState build() {
            return $;
        }
    }

}
