// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AccessGroupExcludeExternalEvaluation {
    private @Nullable String evaluateUrl;
    private @Nullable String keysUrl;

    private AccessGroupExcludeExternalEvaluation() {}
    public Optional<String> evaluateUrl() {
        return Optional.ofNullable(this.evaluateUrl);
    }
    public Optional<String> keysUrl() {
        return Optional.ofNullable(this.keysUrl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessGroupExcludeExternalEvaluation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String evaluateUrl;
        private @Nullable String keysUrl;
        public Builder() {}
        public Builder(AccessGroupExcludeExternalEvaluation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.evaluateUrl = defaults.evaluateUrl;
    	      this.keysUrl = defaults.keysUrl;
        }

        @CustomType.Setter
        public Builder evaluateUrl(@Nullable String evaluateUrl) {
            this.evaluateUrl = evaluateUrl;
            return this;
        }
        @CustomType.Setter
        public Builder keysUrl(@Nullable String keysUrl) {
            this.keysUrl = keysUrl;
            return this;
        }
        public AccessGroupExcludeExternalEvaluation build() {
            final var o = new AccessGroupExcludeExternalEvaluation();
            o.evaluateUrl = evaluateUrl;
            o.keysUrl = keysUrl;
            return o;
        }
    }
}
