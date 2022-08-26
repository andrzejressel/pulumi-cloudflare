// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final FilterArgs Empty = new FilterArgs();

    /**
     * A note that you can use to describe the purpose of the filter.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A note that you can use to describe the purpose of the filter.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The filter expression to be used.
     * 
     */
    @Import(name="expression", required=true)
    private Output<String> expression;

    /**
     * @return The filter expression to be used.
     * 
     */
    public Output<String> expression() {
        return this.expression;
    }

    /**
     * Whether this filter is currently paused.
     * 
     */
    @Import(name="paused")
    private @Nullable Output<Boolean> paused;

    /**
     * @return Whether this filter is currently paused.
     * 
     */
    public Optional<Output<Boolean>> paused() {
        return Optional.ofNullable(this.paused);
    }

    /**
     * Short reference tag to quickly select related rules.
     * 
     */
    @Import(name="ref")
    private @Nullable Output<String> ref;

    /**
     * @return Short reference tag to quickly select related rules.
     * 
     */
    public Optional<Output<String>> ref() {
        return Optional.ofNullable(this.ref);
    }

    /**
     * The zone identifier to target for the resource.
     * 
     */
    @Import(name="zoneId", required=true)
    private Output<String> zoneId;

    /**
     * @return The zone identifier to target for the resource.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    private FilterArgs() {}

    private FilterArgs(FilterArgs $) {
        this.description = $.description;
        this.expression = $.expression;
        this.paused = $.paused;
        this.ref = $.ref;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FilterArgs $;

        public Builder() {
            $ = new FilterArgs();
        }

        public Builder(FilterArgs defaults) {
            $ = new FilterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description A note that you can use to describe the purpose of the filter.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A note that you can use to describe the purpose of the filter.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param expression The filter expression to be used.
         * 
         * @return builder
         * 
         */
        public Builder expression(Output<String> expression) {
            $.expression = expression;
            return this;
        }

        /**
         * @param expression The filter expression to be used.
         * 
         * @return builder
         * 
         */
        public Builder expression(String expression) {
            return expression(Output.of(expression));
        }

        /**
         * @param paused Whether this filter is currently paused.
         * 
         * @return builder
         * 
         */
        public Builder paused(@Nullable Output<Boolean> paused) {
            $.paused = paused;
            return this;
        }

        /**
         * @param paused Whether this filter is currently paused.
         * 
         * @return builder
         * 
         */
        public Builder paused(Boolean paused) {
            return paused(Output.of(paused));
        }

        /**
         * @param ref Short reference tag to quickly select related rules.
         * 
         * @return builder
         * 
         */
        public Builder ref(@Nullable Output<String> ref) {
            $.ref = ref;
            return this;
        }

        /**
         * @param ref Short reference tag to quickly select related rules.
         * 
         * @return builder
         * 
         */
        public Builder ref(String ref) {
            return ref(Output.of(ref));
        }

        /**
         * @param zoneId The zone identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The zone identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public FilterArgs build() {
            $.expression = Objects.requireNonNull($.expression, "expected parameter 'expression' to be non-null");
            $.zoneId = Objects.requireNonNull($.zoneId, "expected parameter 'zoneId' to be non-null");
            return $;
        }
    }

}
