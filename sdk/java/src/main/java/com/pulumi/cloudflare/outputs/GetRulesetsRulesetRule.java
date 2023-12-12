// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.GetRulesetsRulesetRuleActionParameters;
import com.pulumi.cloudflare.outputs.GetRulesetsRulesetRuleExposedCredentialCheck;
import com.pulumi.cloudflare.outputs.GetRulesetsRulesetRuleLogging;
import com.pulumi.cloudflare.outputs.GetRulesetsRulesetRuleRatelimit;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRulesetsRulesetRule {
    private @Nullable String action;
    private @Nullable GetRulesetsRulesetRuleActionParameters actionParameters;
    private @Nullable String description;
    private @Nullable Boolean enabled;
    private @Nullable GetRulesetsRulesetRuleExposedCredentialCheck exposedCredentialCheck;
    private String expression;
    /**
     * @return The ID of the Ruleset to target.
     * 
     */
    private String id;
    private @Nullable String lastUpdated;
    private @Nullable GetRulesetsRulesetRuleLogging logging;
    private @Nullable GetRulesetsRulesetRuleRatelimit ratelimit;
    private String ref;
    /**
     * @return Version of the ruleset to filter on.
     * 
     */
    private String version;

    private GetRulesetsRulesetRule() {}
    public Optional<String> action() {
        return Optional.ofNullable(this.action);
    }
    public Optional<GetRulesetsRulesetRuleActionParameters> actionParameters() {
        return Optional.ofNullable(this.actionParameters);
    }
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    public Optional<GetRulesetsRulesetRuleExposedCredentialCheck> exposedCredentialCheck() {
        return Optional.ofNullable(this.exposedCredentialCheck);
    }
    public String expression() {
        return this.expression;
    }
    /**
     * @return The ID of the Ruleset to target.
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<String> lastUpdated() {
        return Optional.ofNullable(this.lastUpdated);
    }
    public Optional<GetRulesetsRulesetRuleLogging> logging() {
        return Optional.ofNullable(this.logging);
    }
    public Optional<GetRulesetsRulesetRuleRatelimit> ratelimit() {
        return Optional.ofNullable(this.ratelimit);
    }
    public String ref() {
        return this.ref;
    }
    /**
     * @return Version of the ruleset to filter on.
     * 
     */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRulesetsRulesetRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String action;
        private @Nullable GetRulesetsRulesetRuleActionParameters actionParameters;
        private @Nullable String description;
        private @Nullable Boolean enabled;
        private @Nullable GetRulesetsRulesetRuleExposedCredentialCheck exposedCredentialCheck;
        private String expression;
        private String id;
        private @Nullable String lastUpdated;
        private @Nullable GetRulesetsRulesetRuleLogging logging;
        private @Nullable GetRulesetsRulesetRuleRatelimit ratelimit;
        private String ref;
        private String version;
        public Builder() {}
        public Builder(GetRulesetsRulesetRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.actionParameters = defaults.actionParameters;
    	      this.description = defaults.description;
    	      this.enabled = defaults.enabled;
    	      this.exposedCredentialCheck = defaults.exposedCredentialCheck;
    	      this.expression = defaults.expression;
    	      this.id = defaults.id;
    	      this.lastUpdated = defaults.lastUpdated;
    	      this.logging = defaults.logging;
    	      this.ratelimit = defaults.ratelimit;
    	      this.ref = defaults.ref;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder action(@Nullable String action) {
            this.action = action;
            return this;
        }
        @CustomType.Setter
        public Builder actionParameters(@Nullable GetRulesetsRulesetRuleActionParameters actionParameters) {
            this.actionParameters = actionParameters;
            return this;
        }
        @CustomType.Setter
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder exposedCredentialCheck(@Nullable GetRulesetsRulesetRuleExposedCredentialCheck exposedCredentialCheck) {
            this.exposedCredentialCheck = exposedCredentialCheck;
            return this;
        }
        @CustomType.Setter
        public Builder expression(String expression) {
            this.expression = Objects.requireNonNull(expression);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder lastUpdated(@Nullable String lastUpdated) {
            this.lastUpdated = lastUpdated;
            return this;
        }
        @CustomType.Setter
        public Builder logging(@Nullable GetRulesetsRulesetRuleLogging logging) {
            this.logging = logging;
            return this;
        }
        @CustomType.Setter
        public Builder ratelimit(@Nullable GetRulesetsRulesetRuleRatelimit ratelimit) {
            this.ratelimit = ratelimit;
            return this;
        }
        @CustomType.Setter
        public Builder ref(String ref) {
            this.ref = Objects.requireNonNull(ref);
            return this;
        }
        @CustomType.Setter
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public GetRulesetsRulesetRule build() {
            final var _resultValue = new GetRulesetsRulesetRule();
            _resultValue.action = action;
            _resultValue.actionParameters = actionParameters;
            _resultValue.description = description;
            _resultValue.enabled = enabled;
            _resultValue.exposedCredentialCheck = exposedCredentialCheck;
            _resultValue.expression = expression;
            _resultValue.id = id;
            _resultValue.lastUpdated = lastUpdated;
            _resultValue.logging = logging;
            _resultValue.ratelimit = ratelimit;
            _resultValue.ref = ref;
            _resultValue.version = version;
            return _resultValue;
        }
    }
}
