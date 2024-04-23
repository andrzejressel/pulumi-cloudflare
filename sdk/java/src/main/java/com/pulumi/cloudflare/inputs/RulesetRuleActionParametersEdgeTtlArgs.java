// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.RulesetRuleActionParametersEdgeTtlStatusCodeTtlArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RulesetRuleActionParametersEdgeTtlArgs extends com.pulumi.resources.ResourceArgs {

    public static final RulesetRuleActionParametersEdgeTtlArgs Empty = new RulesetRuleActionParametersEdgeTtlArgs();

    /**
     * Default edge TTL.
     * 
     */
    @Import(name="default")
    private @Nullable Output<Integer> default_;

    /**
     * @return Default edge TTL.
     * 
     */
    public Optional<Output<Integer>> default_() {
        return Optional.ofNullable(this.default_);
    }

    /**
     * Mode of the edge TTL. Available values: `override_origin`, `respect_origin`, `bypass_by_default`
     * 
     */
    @Import(name="mode", required=true)
    private Output<String> mode;

    /**
     * @return Mode of the edge TTL. Available values: `override_origin`, `respect_origin`, `bypass_by_default`
     * 
     */
    public Output<String> mode() {
        return this.mode;
    }

    /**
     * Edge TTL for the status codes.
     * 
     */
    @Import(name="statusCodeTtls")
    private @Nullable Output<List<RulesetRuleActionParametersEdgeTtlStatusCodeTtlArgs>> statusCodeTtls;

    /**
     * @return Edge TTL for the status codes.
     * 
     */
    public Optional<Output<List<RulesetRuleActionParametersEdgeTtlStatusCodeTtlArgs>>> statusCodeTtls() {
        return Optional.ofNullable(this.statusCodeTtls);
    }

    private RulesetRuleActionParametersEdgeTtlArgs() {}

    private RulesetRuleActionParametersEdgeTtlArgs(RulesetRuleActionParametersEdgeTtlArgs $) {
        this.default_ = $.default_;
        this.mode = $.mode;
        this.statusCodeTtls = $.statusCodeTtls;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RulesetRuleActionParametersEdgeTtlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RulesetRuleActionParametersEdgeTtlArgs $;

        public Builder() {
            $ = new RulesetRuleActionParametersEdgeTtlArgs();
        }

        public Builder(RulesetRuleActionParametersEdgeTtlArgs defaults) {
            $ = new RulesetRuleActionParametersEdgeTtlArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param default_ Default edge TTL.
         * 
         * @return builder
         * 
         */
        public Builder default_(@Nullable Output<Integer> default_) {
            $.default_ = default_;
            return this;
        }

        /**
         * @param default_ Default edge TTL.
         * 
         * @return builder
         * 
         */
        public Builder default_(Integer default_) {
            return default_(Output.of(default_));
        }

        /**
         * @param mode Mode of the edge TTL. Available values: `override_origin`, `respect_origin`, `bypass_by_default`
         * 
         * @return builder
         * 
         */
        public Builder mode(Output<String> mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param mode Mode of the edge TTL. Available values: `override_origin`, `respect_origin`, `bypass_by_default`
         * 
         * @return builder
         * 
         */
        public Builder mode(String mode) {
            return mode(Output.of(mode));
        }

        /**
         * @param statusCodeTtls Edge TTL for the status codes.
         * 
         * @return builder
         * 
         */
        public Builder statusCodeTtls(@Nullable Output<List<RulesetRuleActionParametersEdgeTtlStatusCodeTtlArgs>> statusCodeTtls) {
            $.statusCodeTtls = statusCodeTtls;
            return this;
        }

        /**
         * @param statusCodeTtls Edge TTL for the status codes.
         * 
         * @return builder
         * 
         */
        public Builder statusCodeTtls(List<RulesetRuleActionParametersEdgeTtlStatusCodeTtlArgs> statusCodeTtls) {
            return statusCodeTtls(Output.of(statusCodeTtls));
        }

        /**
         * @param statusCodeTtls Edge TTL for the status codes.
         * 
         * @return builder
         * 
         */
        public Builder statusCodeTtls(RulesetRuleActionParametersEdgeTtlStatusCodeTtlArgs... statusCodeTtls) {
            return statusCodeTtls(List.of(statusCodeTtls));
        }

        public RulesetRuleActionParametersEdgeTtlArgs build() {
            if ($.mode == null) {
                throw new MissingRequiredPropertyException("RulesetRuleActionParametersEdgeTtlArgs", "mode");
            }
            return $;
        }
    }

}
