// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.DevicePostureRuleInputArgs;
import com.pulumi.cloudflare.inputs.DevicePostureRuleMatchArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DevicePostureRuleState extends com.pulumi.resources.ResourceArgs {

    public static final DevicePostureRuleState Empty = new DevicePostureRuleState();

    /**
     * The account to which the device posture rule should be added.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return The account to which the device posture rule should be added.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * The description of the device posture rule.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the device posture rule.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Expire posture results after the specified amount of time.
     * Must be in the format `&#34;1h&#34;` or `&#34;30m&#34;`. Valid units are `h` and `m`.
     * 
     */
    @Import(name="expiration")
    private @Nullable Output<String> expiration;

    /**
     * @return Expire posture results after the specified amount of time.
     * Must be in the format `&#34;1h&#34;` or `&#34;30m&#34;`. Valid units are `h` and `m`.
     * 
     */
    public Optional<Output<String>> expiration() {
        return Optional.ofNullable(this.expiration);
    }

    /**
     * The value to be checked against. See below for reference
     * structure.
     * 
     */
    @Import(name="inputs")
    private @Nullable Output<List<DevicePostureRuleInputArgs>> inputs;

    /**
     * @return The value to be checked against. See below for reference
     * structure.
     * 
     */
    public Optional<Output<List<DevicePostureRuleInputArgs>>> inputs() {
        return Optional.ofNullable(this.inputs);
    }

    /**
     * The conditions that the client must match to run the rule. See below for reference structure.
     * 
     */
    @Import(name="matches")
    private @Nullable Output<List<DevicePostureRuleMatchArgs>> matches;

    /**
     * @return The conditions that the client must match to run the rule. See below for reference structure.
     * 
     */
    public Optional<Output<List<DevicePostureRuleMatchArgs>>> matches() {
        return Optional.ofNullable(this.matches);
    }

    /**
     * Name of the device posture rule.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the device posture rule.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Tells the client when to run the device posture check.
     * Must be in the format `&#34;1h&#34;` or `&#34;30m&#34;`. Valid units are `h` and `m`.
     * 
     */
    @Import(name="schedule")
    private @Nullable Output<String> schedule;

    /**
     * @return Tells the client when to run the device posture check.
     * Must be in the format `&#34;1h&#34;` or `&#34;30m&#34;`. Valid units are `h` and `m`.
     * 
     */
    public Optional<Output<String>> schedule() {
        return Optional.ofNullable(this.schedule);
    }

    /**
     * The device posture rule type. Valid values are `file`, `application`, and `serial_number`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The device posture rule type. Valid values are `file`, `application`, and `serial_number`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private DevicePostureRuleState() {}

    private DevicePostureRuleState(DevicePostureRuleState $) {
        this.accountId = $.accountId;
        this.description = $.description;
        this.expiration = $.expiration;
        this.inputs = $.inputs;
        this.matches = $.matches;
        this.name = $.name;
        this.schedule = $.schedule;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DevicePostureRuleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DevicePostureRuleState $;

        public Builder() {
            $ = new DevicePostureRuleState();
        }

        public Builder(DevicePostureRuleState defaults) {
            $ = new DevicePostureRuleState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account to which the device posture rule should be added.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The account to which the device posture rule should be added.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param description The description of the device posture rule.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the device posture rule.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param expiration Expire posture results after the specified amount of time.
         * Must be in the format `&#34;1h&#34;` or `&#34;30m&#34;`. Valid units are `h` and `m`.
         * 
         * @return builder
         * 
         */
        public Builder expiration(@Nullable Output<String> expiration) {
            $.expiration = expiration;
            return this;
        }

        /**
         * @param expiration Expire posture results after the specified amount of time.
         * Must be in the format `&#34;1h&#34;` or `&#34;30m&#34;`. Valid units are `h` and `m`.
         * 
         * @return builder
         * 
         */
        public Builder expiration(String expiration) {
            return expiration(Output.of(expiration));
        }

        /**
         * @param inputs The value to be checked against. See below for reference
         * structure.
         * 
         * @return builder
         * 
         */
        public Builder inputs(@Nullable Output<List<DevicePostureRuleInputArgs>> inputs) {
            $.inputs = inputs;
            return this;
        }

        /**
         * @param inputs The value to be checked against. See below for reference
         * structure.
         * 
         * @return builder
         * 
         */
        public Builder inputs(List<DevicePostureRuleInputArgs> inputs) {
            return inputs(Output.of(inputs));
        }

        /**
         * @param inputs The value to be checked against. See below for reference
         * structure.
         * 
         * @return builder
         * 
         */
        public Builder inputs(DevicePostureRuleInputArgs... inputs) {
            return inputs(List.of(inputs));
        }

        /**
         * @param matches The conditions that the client must match to run the rule. See below for reference structure.
         * 
         * @return builder
         * 
         */
        public Builder matches(@Nullable Output<List<DevicePostureRuleMatchArgs>> matches) {
            $.matches = matches;
            return this;
        }

        /**
         * @param matches The conditions that the client must match to run the rule. See below for reference structure.
         * 
         * @return builder
         * 
         */
        public Builder matches(List<DevicePostureRuleMatchArgs> matches) {
            return matches(Output.of(matches));
        }

        /**
         * @param matches The conditions that the client must match to run the rule. See below for reference structure.
         * 
         * @return builder
         * 
         */
        public Builder matches(DevicePostureRuleMatchArgs... matches) {
            return matches(List.of(matches));
        }

        /**
         * @param name Name of the device posture rule.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the device posture rule.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param schedule Tells the client when to run the device posture check.
         * Must be in the format `&#34;1h&#34;` or `&#34;30m&#34;`. Valid units are `h` and `m`.
         * 
         * @return builder
         * 
         */
        public Builder schedule(@Nullable Output<String> schedule) {
            $.schedule = schedule;
            return this;
        }

        /**
         * @param schedule Tells the client when to run the device posture check.
         * Must be in the format `&#34;1h&#34;` or `&#34;30m&#34;`. Valid units are `h` and `m`.
         * 
         * @return builder
         * 
         */
        public Builder schedule(String schedule) {
            return schedule(Output.of(schedule));
        }

        /**
         * @param type The device posture rule type. Valid values are `file`, `application`, and `serial_number`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The device posture rule type. Valid values are `file`, `application`, and `serial_number`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public DevicePostureRuleState build() {
            return $;
        }
    }

}
