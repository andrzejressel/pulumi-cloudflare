// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRulesetsRulesetRuleActionParametersServeStale {
    private @Nullable Boolean disableStaleWhileUpdating;

    private GetRulesetsRulesetRuleActionParametersServeStale() {}
    public Optional<Boolean> disableStaleWhileUpdating() {
        return Optional.ofNullable(this.disableStaleWhileUpdating);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRulesetsRulesetRuleActionParametersServeStale defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean disableStaleWhileUpdating;
        public Builder() {}
        public Builder(GetRulesetsRulesetRuleActionParametersServeStale defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableStaleWhileUpdating = defaults.disableStaleWhileUpdating;
        }

        @CustomType.Setter
        public Builder disableStaleWhileUpdating(@Nullable Boolean disableStaleWhileUpdating) {
            this.disableStaleWhileUpdating = disableStaleWhileUpdating;
            return this;
        }
        public GetRulesetsRulesetRuleActionParametersServeStale build() {
            final var _resultValue = new GetRulesetsRulesetRuleActionParametersServeStale();
            _resultValue.disableStaleWhileUpdating = disableStaleWhileUpdating;
            return _resultValue;
        }
    }
}
