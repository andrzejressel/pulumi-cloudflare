// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RateLimitCorrelate {
    /**
     * @return If set to &#39;nat&#39;, NAT support will be enabled for rate limiting.
     * 
     */
    private @Nullable String by;

    private RateLimitCorrelate() {}
    /**
     * @return If set to &#39;nat&#39;, NAT support will be enabled for rate limiting.
     * 
     */
    public Optional<String> by() {
        return Optional.ofNullable(this.by);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RateLimitCorrelate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String by;
        public Builder() {}
        public Builder(RateLimitCorrelate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.by = defaults.by;
        }

        @CustomType.Setter
        public Builder by(@Nullable String by) {
            this.by = by;
            return this;
        }
        public RateLimitCorrelate build() {
            final var o = new RateLimitCorrelate();
            o.by = by;
            return o;
        }
    }
}
