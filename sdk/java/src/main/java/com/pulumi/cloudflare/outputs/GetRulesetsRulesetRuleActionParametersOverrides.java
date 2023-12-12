// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.GetRulesetsRulesetRuleActionParametersOverridesCategory;
import com.pulumi.cloudflare.outputs.GetRulesetsRulesetRuleActionParametersOverridesRule;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRulesetsRulesetRuleActionParametersOverrides {
    private @Nullable String action;
    private @Nullable List<GetRulesetsRulesetRuleActionParametersOverridesCategory> categories;
    /**
     * @deprecated
     * Use `status` instead. Continuing to use `enabled` will result in an inconsistent state for your Ruleset configuration.
     * 
     */
    @Deprecated /* Use `status` instead. Continuing to use `enabled` will result in an inconsistent state for your Ruleset configuration. */
    private @Nullable Boolean enabled;
    private @Nullable List<GetRulesetsRulesetRuleActionParametersOverridesRule> rules;
    private @Nullable String sensitivityLevel;
    private @Nullable String status;

    private GetRulesetsRulesetRuleActionParametersOverrides() {}
    public Optional<String> action() {
        return Optional.ofNullable(this.action);
    }
    public List<GetRulesetsRulesetRuleActionParametersOverridesCategory> categories() {
        return this.categories == null ? List.of() : this.categories;
    }
    /**
     * @deprecated
     * Use `status` instead. Continuing to use `enabled` will result in an inconsistent state for your Ruleset configuration.
     * 
     */
    @Deprecated /* Use `status` instead. Continuing to use `enabled` will result in an inconsistent state for your Ruleset configuration. */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    public List<GetRulesetsRulesetRuleActionParametersOverridesRule> rules() {
        return this.rules == null ? List.of() : this.rules;
    }
    public Optional<String> sensitivityLevel() {
        return Optional.ofNullable(this.sensitivityLevel);
    }
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRulesetsRulesetRuleActionParametersOverrides defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String action;
        private @Nullable List<GetRulesetsRulesetRuleActionParametersOverridesCategory> categories;
        private @Nullable Boolean enabled;
        private @Nullable List<GetRulesetsRulesetRuleActionParametersOverridesRule> rules;
        private @Nullable String sensitivityLevel;
        private @Nullable String status;
        public Builder() {}
        public Builder(GetRulesetsRulesetRuleActionParametersOverrides defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.categories = defaults.categories;
    	      this.enabled = defaults.enabled;
    	      this.rules = defaults.rules;
    	      this.sensitivityLevel = defaults.sensitivityLevel;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder action(@Nullable String action) {
            this.action = action;
            return this;
        }
        @CustomType.Setter
        public Builder categories(@Nullable List<GetRulesetsRulesetRuleActionParametersOverridesCategory> categories) {
            this.categories = categories;
            return this;
        }
        public Builder categories(GetRulesetsRulesetRuleActionParametersOverridesCategory... categories) {
            return categories(List.of(categories));
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder rules(@Nullable List<GetRulesetsRulesetRuleActionParametersOverridesRule> rules) {
            this.rules = rules;
            return this;
        }
        public Builder rules(GetRulesetsRulesetRuleActionParametersOverridesRule... rules) {
            return rules(List.of(rules));
        }
        @CustomType.Setter
        public Builder sensitivityLevel(@Nullable String sensitivityLevel) {
            this.sensitivityLevel = sensitivityLevel;
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        public GetRulesetsRulesetRuleActionParametersOverrides build() {
            final var _resultValue = new GetRulesetsRulesetRuleActionParametersOverrides();
            _resultValue.action = action;
            _resultValue.categories = categories;
            _resultValue.enabled = enabled;
            _resultValue.rules = rules;
            _resultValue.sensitivityLevel = sensitivityLevel;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}
