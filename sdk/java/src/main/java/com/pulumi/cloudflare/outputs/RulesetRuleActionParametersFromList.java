// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RulesetRuleActionParametersFromList {
    private String key;
    /**
     * @return Name of the ruleset.
     * 
     */
    private String name;

    private RulesetRuleActionParametersFromList() {}
    public String key() {
        return this.key;
    }
    /**
     * @return Name of the ruleset.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RulesetRuleActionParametersFromList defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String key;
        private String name;
        public Builder() {}
        public Builder(RulesetRuleActionParametersFromList defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public RulesetRuleActionParametersFromList build() {
            final var o = new RulesetRuleActionParametersFromList();
            o.key = key;
            o.name = name;
            return o;
        }
    }
}
