// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.ZeroTrustDexTestDataArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ZeroTrustDexTestState extends com.pulumi.resources.ResourceArgs {

    public static final ZeroTrustDexTestState Empty = new ZeroTrustDexTestState();

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
     * Timestamp of when the Dex Test was created.
     * 
     */
    @Import(name="created")
    private @Nullable Output<String> created;

    /**
     * @return Timestamp of when the Dex Test was created.
     * 
     */
    public Optional<Output<String>> created() {
        return Optional.ofNullable(this.created);
    }

    /**
     * The configuration object which contains the details for the WARP client to conduct the test.
     * 
     */
    @Import(name="data")
    private @Nullable Output<ZeroTrustDexTestDataArgs> data;

    /**
     * @return The configuration object which contains the details for the WARP client to conduct the test.
     * 
     */
    public Optional<Output<ZeroTrustDexTestDataArgs>> data() {
        return Optional.ofNullable(this.data);
    }

    /**
     * Additional details about the test.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Additional details about the test.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Determines whether or not the test is active.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Determines whether or not the test is active.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * How often the test will run.
     * 
     */
    @Import(name="interval")
    private @Nullable Output<String> interval;

    /**
     * @return How often the test will run.
     * 
     */
    public Optional<Output<String>> interval() {
        return Optional.ofNullable(this.interval);
    }

    /**
     * The name of the Device Dex Test. Must be unique.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Device Dex Test. Must be unique.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Timestamp of when the Dex Test was last updated.
     * 
     */
    @Import(name="updated")
    private @Nullable Output<String> updated;

    /**
     * @return Timestamp of when the Dex Test was last updated.
     * 
     */
    public Optional<Output<String>> updated() {
        return Optional.ofNullable(this.updated);
    }

    private ZeroTrustDexTestState() {}

    private ZeroTrustDexTestState(ZeroTrustDexTestState $) {
        this.accountId = $.accountId;
        this.created = $.created;
        this.data = $.data;
        this.description = $.description;
        this.enabled = $.enabled;
        this.interval = $.interval;
        this.name = $.name;
        this.updated = $.updated;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZeroTrustDexTestState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZeroTrustDexTestState $;

        public Builder() {
            $ = new ZeroTrustDexTestState();
        }

        public Builder(ZeroTrustDexTestState defaults) {
            $ = new ZeroTrustDexTestState(Objects.requireNonNull(defaults));
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
         * @param created Timestamp of when the Dex Test was created.
         * 
         * @return builder
         * 
         */
        public Builder created(@Nullable Output<String> created) {
            $.created = created;
            return this;
        }

        /**
         * @param created Timestamp of when the Dex Test was created.
         * 
         * @return builder
         * 
         */
        public Builder created(String created) {
            return created(Output.of(created));
        }

        /**
         * @param data The configuration object which contains the details for the WARP client to conduct the test.
         * 
         * @return builder
         * 
         */
        public Builder data(@Nullable Output<ZeroTrustDexTestDataArgs> data) {
            $.data = data;
            return this;
        }

        /**
         * @param data The configuration object which contains the details for the WARP client to conduct the test.
         * 
         * @return builder
         * 
         */
        public Builder data(ZeroTrustDexTestDataArgs data) {
            return data(Output.of(data));
        }

        /**
         * @param description Additional details about the test.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Additional details about the test.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param enabled Determines whether or not the test is active.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Determines whether or not the test is active.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param interval How often the test will run.
         * 
         * @return builder
         * 
         */
        public Builder interval(@Nullable Output<String> interval) {
            $.interval = interval;
            return this;
        }

        /**
         * @param interval How often the test will run.
         * 
         * @return builder
         * 
         */
        public Builder interval(String interval) {
            return interval(Output.of(interval));
        }

        /**
         * @param name The name of the Device Dex Test. Must be unique.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Device Dex Test. Must be unique.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param updated Timestamp of when the Dex Test was last updated.
         * 
         * @return builder
         * 
         */
        public Builder updated(@Nullable Output<String> updated) {
            $.updated = updated;
            return this;
        }

        /**
         * @param updated Timestamp of when the Dex Test was last updated.
         * 
         * @return builder
         * 
         */
        public Builder updated(String updated) {
            return updated(Output.of(updated));
        }

        public ZeroTrustDexTestState build() {
            return $;
        }
    }

}