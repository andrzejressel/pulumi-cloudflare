// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RulesetRuleExposedCredentialCheck {
    private @Nullable String passwordExpression;
    private @Nullable String usernameExpression;

    private RulesetRuleExposedCredentialCheck() {}
    public Optional<String> passwordExpression() {
        return Optional.ofNullable(this.passwordExpression);
    }
    public Optional<String> usernameExpression() {
        return Optional.ofNullable(this.usernameExpression);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RulesetRuleExposedCredentialCheck defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String passwordExpression;
        private @Nullable String usernameExpression;
        public Builder() {}
        public Builder(RulesetRuleExposedCredentialCheck defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.passwordExpression = defaults.passwordExpression;
    	      this.usernameExpression = defaults.usernameExpression;
        }

        @CustomType.Setter
        public Builder passwordExpression(@Nullable String passwordExpression) {
            this.passwordExpression = passwordExpression;
            return this;
        }
        @CustomType.Setter
        public Builder usernameExpression(@Nullable String usernameExpression) {
            this.usernameExpression = usernameExpression;
            return this;
        }
        public RulesetRuleExposedCredentialCheck build() {
            final var o = new RulesetRuleExposedCredentialCheck();
            o.passwordExpression = passwordExpression;
            o.usernameExpression = usernameExpression;
            return o;
        }
    }
}
