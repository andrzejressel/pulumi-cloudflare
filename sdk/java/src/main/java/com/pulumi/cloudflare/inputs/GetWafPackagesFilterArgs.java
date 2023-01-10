// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetWafPackagesFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetWafPackagesFilterArgs Empty = new GetWafPackagesFilterArgs();

    /**
     * Action mode of the WAF Rule Packages to lookup. Valid values: simulate, block and challenge.
     * 
     */
    @Import(name="actionMode")
    private @Nullable Output<String> actionMode;

    /**
     * @return Action mode of the WAF Rule Packages to lookup. Valid values: simulate, block and challenge.
     * 
     */
    public Optional<Output<String>> actionMode() {
        return Optional.ofNullable(this.actionMode);
    }

    /**
     * Detection mode of the WAF Rule Packages to lookup.
     * 
     */
    @Import(name="detectionMode")
    private @Nullable Output<String> detectionMode;

    /**
     * @return Detection mode of the WAF Rule Packages to lookup.
     * 
     */
    public Optional<Output<String>> detectionMode() {
        return Optional.ofNullable(this.detectionMode);
    }

    /**
     * A regular expression matching the name of the WAF Rule Packages to lookup.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A regular expression matching the name of the WAF Rule Packages to lookup.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Sensitivity of the WAF Rule Packages to lookup. Valid values: high, medium, low and off.
     * 
     */
    @Import(name="sensitivity")
    private @Nullable Output<String> sensitivity;

    /**
     * @return Sensitivity of the WAF Rule Packages to lookup. Valid values: high, medium, low and off.
     * 
     */
    public Optional<Output<String>> sensitivity() {
        return Optional.ofNullable(this.sensitivity);
    }

    private GetWafPackagesFilterArgs() {}

    private GetWafPackagesFilterArgs(GetWafPackagesFilterArgs $) {
        this.actionMode = $.actionMode;
        this.detectionMode = $.detectionMode;
        this.name = $.name;
        this.sensitivity = $.sensitivity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWafPackagesFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWafPackagesFilterArgs $;

        public Builder() {
            $ = new GetWafPackagesFilterArgs();
        }

        public Builder(GetWafPackagesFilterArgs defaults) {
            $ = new GetWafPackagesFilterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param actionMode Action mode of the WAF Rule Packages to lookup. Valid values: simulate, block and challenge.
         * 
         * @return builder
         * 
         */
        public Builder actionMode(@Nullable Output<String> actionMode) {
            $.actionMode = actionMode;
            return this;
        }

        /**
         * @param actionMode Action mode of the WAF Rule Packages to lookup. Valid values: simulate, block and challenge.
         * 
         * @return builder
         * 
         */
        public Builder actionMode(String actionMode) {
            return actionMode(Output.of(actionMode));
        }

        /**
         * @param detectionMode Detection mode of the WAF Rule Packages to lookup.
         * 
         * @return builder
         * 
         */
        public Builder detectionMode(@Nullable Output<String> detectionMode) {
            $.detectionMode = detectionMode;
            return this;
        }

        /**
         * @param detectionMode Detection mode of the WAF Rule Packages to lookup.
         * 
         * @return builder
         * 
         */
        public Builder detectionMode(String detectionMode) {
            return detectionMode(Output.of(detectionMode));
        }

        /**
         * @param name A regular expression matching the name of the WAF Rule Packages to lookup.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A regular expression matching the name of the WAF Rule Packages to lookup.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param sensitivity Sensitivity of the WAF Rule Packages to lookup. Valid values: high, medium, low and off.
         * 
         * @return builder
         * 
         */
        public Builder sensitivity(@Nullable Output<String> sensitivity) {
            $.sensitivity = sensitivity;
            return this;
        }

        /**
         * @param sensitivity Sensitivity of the WAF Rule Packages to lookup. Valid values: high, medium, low and off.
         * 
         * @return builder
         * 
         */
        public Builder sensitivity(String sensitivity) {
            return sensitivity(Output.of(sensitivity));
        }

        public GetWafPackagesFilterArgs build() {
            return $;
        }
    }

}