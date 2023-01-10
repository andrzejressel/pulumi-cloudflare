// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetWafGroupsFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetWafGroupsFilterArgs Empty = new GetWafGroupsFilterArgs();

    /**
     * Mode of the WAF Rule Groups to lookup. Valid values: on and off.
     * 
     */
    @Import(name="mode")
    private @Nullable Output<String> mode;

    /**
     * @return Mode of the WAF Rule Groups to lookup. Valid values: on and off.
     * 
     */
    public Optional<Output<String>> mode() {
        return Optional.ofNullable(this.mode);
    }

    /**
     * A regular expression matching the name of the WAF Rule Groups to lookup.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A regular expression matching the name of the WAF Rule Groups to lookup.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private GetWafGroupsFilterArgs() {}

    private GetWafGroupsFilterArgs(GetWafGroupsFilterArgs $) {
        this.mode = $.mode;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWafGroupsFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWafGroupsFilterArgs $;

        public Builder() {
            $ = new GetWafGroupsFilterArgs();
        }

        public Builder(GetWafGroupsFilterArgs defaults) {
            $ = new GetWafGroupsFilterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param mode Mode of the WAF Rule Groups to lookup. Valid values: on and off.
         * 
         * @return builder
         * 
         */
        public Builder mode(@Nullable Output<String> mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param mode Mode of the WAF Rule Groups to lookup. Valid values: on and off.
         * 
         * @return builder
         * 
         */
        public Builder mode(String mode) {
            return mode(Output.of(mode));
        }

        /**
         * @param name A regular expression matching the name of the WAF Rule Groups to lookup.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A regular expression matching the name of the WAF Rule Groups to lookup.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetWafGroupsFilterArgs build() {
            return $;
        }
    }

}