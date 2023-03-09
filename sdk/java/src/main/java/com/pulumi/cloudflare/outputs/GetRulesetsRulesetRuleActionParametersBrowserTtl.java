// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRulesetsRulesetRuleActionParametersBrowserTtl {
    private @Nullable Integer default_;
    private String mode;

    private GetRulesetsRulesetRuleActionParametersBrowserTtl() {}
    public Optional<Integer> default_() {
        return Optional.ofNullable(this.default_);
    }
    public String mode() {
        return this.mode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRulesetsRulesetRuleActionParametersBrowserTtl defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer default_;
        private String mode;
        public Builder() {}
        public Builder(GetRulesetsRulesetRuleActionParametersBrowserTtl defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.default_ = defaults.default_;
    	      this.mode = defaults.mode;
        }

        @CustomType.Setter("default")
        public Builder default_(@Nullable Integer default_) {
            this.default_ = default_;
            return this;
        }
        @CustomType.Setter
        public Builder mode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }
        public GetRulesetsRulesetRuleActionParametersBrowserTtl build() {
            final var o = new GetRulesetsRulesetRuleActionParametersBrowserTtl();
            o.default_ = default_;
            o.mode = mode;
            return o;
        }
    }
}
