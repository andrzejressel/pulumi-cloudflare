// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RulesetRuleActionParametersSni {
    /**
     * @return Status code edge TTL value.
     * 
     */
    private @Nullable String value;

    private RulesetRuleActionParametersSni() {}
    /**
     * @return Status code edge TTL value.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RulesetRuleActionParametersSni defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String value;
        public Builder() {}
        public Builder(RulesetRuleActionParametersSni defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }
        public RulesetRuleActionParametersSni build() {
            final var _resultValue = new RulesetRuleActionParametersSni();
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
