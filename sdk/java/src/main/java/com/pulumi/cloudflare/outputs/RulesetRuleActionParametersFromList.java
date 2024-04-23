// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RulesetRuleActionParametersFromList {
    /**
     * @return Expression to use for the list lookup.
     * 
     */
    private @Nullable String key;
    /**
     * @return Name of the list.
     * 
     */
    private @Nullable String name;

    private RulesetRuleActionParametersFromList() {}
    /**
     * @return Expression to use for the list lookup.
     * 
     */
    public Optional<String> key() {
        return Optional.ofNullable(this.key);
    }
    /**
     * @return Name of the list.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RulesetRuleActionParametersFromList defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String key;
        private @Nullable String name;
        public Builder() {}
        public Builder(RulesetRuleActionParametersFromList defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder key(@Nullable String key) {

            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        public RulesetRuleActionParametersFromList build() {
            final var _resultValue = new RulesetRuleActionParametersFromList();
            _resultValue.key = key;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
