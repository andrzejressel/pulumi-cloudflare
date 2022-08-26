// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.RulesetRuleActionParametersOverridesCategoryArgs;
import com.pulumi.cloudflare.inputs.RulesetRuleActionParametersOverridesRuleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RulesetRuleActionParametersOverridesArgs extends com.pulumi.resources.ResourceArgs {

    public static final RulesetRuleActionParametersOverridesArgs Empty = new RulesetRuleActionParametersOverridesArgs();

    @Import(name="action")
    private @Nullable Output<String> action;

    public Optional<Output<String>> action() {
        return Optional.ofNullable(this.action);
    }

    @Import(name="categories")
    private @Nullable Output<List<RulesetRuleActionParametersOverridesCategoryArgs>> categories;

    public Optional<Output<List<RulesetRuleActionParametersOverridesCategoryArgs>>> categories() {
        return Optional.ofNullable(this.categories);
    }

    /**
     * @deprecated
     * Use `status` instead. Continuing to use `enabled` will result in an inconsistent state for your Ruleset configuration.
     * 
     */
    @Deprecated /* Use `status` instead. Continuing to use `enabled` will result in an inconsistent state for your Ruleset configuration. */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @deprecated
     * Use `status` instead. Continuing to use `enabled` will result in an inconsistent state for your Ruleset configuration.
     * 
     */
    @Deprecated /* Use `status` instead. Continuing to use `enabled` will result in an inconsistent state for your Ruleset configuration. */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * List of rules to apply to the ruleset.
     * 
     */
    @Import(name="rules")
    private @Nullable Output<List<RulesetRuleActionParametersOverridesRuleArgs>> rules;

    /**
     * @return List of rules to apply to the ruleset.
     * 
     */
    public Optional<Output<List<RulesetRuleActionParametersOverridesRuleArgs>>> rules() {
        return Optional.ofNullable(this.rules);
    }

    @Import(name="status")
    private @Nullable Output<String> status;

    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private RulesetRuleActionParametersOverridesArgs() {}

    private RulesetRuleActionParametersOverridesArgs(RulesetRuleActionParametersOverridesArgs $) {
        this.action = $.action;
        this.categories = $.categories;
        this.enabled = $.enabled;
        this.rules = $.rules;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RulesetRuleActionParametersOverridesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RulesetRuleActionParametersOverridesArgs $;

        public Builder() {
            $ = new RulesetRuleActionParametersOverridesArgs();
        }

        public Builder(RulesetRuleActionParametersOverridesArgs defaults) {
            $ = new RulesetRuleActionParametersOverridesArgs(Objects.requireNonNull(defaults));
        }

        public Builder action(@Nullable Output<String> action) {
            $.action = action;
            return this;
        }

        public Builder action(String action) {
            return action(Output.of(action));
        }

        public Builder categories(@Nullable Output<List<RulesetRuleActionParametersOverridesCategoryArgs>> categories) {
            $.categories = categories;
            return this;
        }

        public Builder categories(List<RulesetRuleActionParametersOverridesCategoryArgs> categories) {
            return categories(Output.of(categories));
        }

        public Builder categories(RulesetRuleActionParametersOverridesCategoryArgs... categories) {
            return categories(List.of(categories));
        }

        /**
         * @return builder
         * 
         * @deprecated
         * Use `status` instead. Continuing to use `enabled` will result in an inconsistent state for your Ruleset configuration.
         * 
         */
        @Deprecated /* Use `status` instead. Continuing to use `enabled` will result in an inconsistent state for your Ruleset configuration. */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @return builder
         * 
         * @deprecated
         * Use `status` instead. Continuing to use `enabled` will result in an inconsistent state for your Ruleset configuration.
         * 
         */
        @Deprecated /* Use `status` instead. Continuing to use `enabled` will result in an inconsistent state for your Ruleset configuration. */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param rules List of rules to apply to the ruleset.
         * 
         * @return builder
         * 
         */
        public Builder rules(@Nullable Output<List<RulesetRuleActionParametersOverridesRuleArgs>> rules) {
            $.rules = rules;
            return this;
        }

        /**
         * @param rules List of rules to apply to the ruleset.
         * 
         * @return builder
         * 
         */
        public Builder rules(List<RulesetRuleActionParametersOverridesRuleArgs> rules) {
            return rules(Output.of(rules));
        }

        /**
         * @param rules List of rules to apply to the ruleset.
         * 
         * @return builder
         * 
         */
        public Builder rules(RulesetRuleActionParametersOverridesRuleArgs... rules) {
            return rules(List.of(rules));
        }

        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        public Builder status(String status) {
            return status(Output.of(status));
        }

        public RulesetRuleActionParametersOverridesArgs build() {
            return $;
        }
    }

}
