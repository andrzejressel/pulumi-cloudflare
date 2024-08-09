// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HyperdriveConfigCaching {
    /**
     * @return Disable caching for this Hyperdrive configuration.
     * 
     */
    private @Nullable Boolean disabled;
    /**
     * @return Configure the `max_age` value of this Hyperdrive configuration.
     * 
     */
    private @Nullable Integer maxAge;
    /**
     * @return Disable caching for this Hyperdrive configuration.
     * 
     */
    private @Nullable Integer staleWhileRevalidate;

    private HyperdriveConfigCaching() {}
    /**
     * @return Disable caching for this Hyperdrive configuration.
     * 
     */
    public Optional<Boolean> disabled() {
        return Optional.ofNullable(this.disabled);
    }
    /**
     * @return Configure the `max_age` value of this Hyperdrive configuration.
     * 
     */
    public Optional<Integer> maxAge() {
        return Optional.ofNullable(this.maxAge);
    }
    /**
     * @return Disable caching for this Hyperdrive configuration.
     * 
     */
    public Optional<Integer> staleWhileRevalidate() {
        return Optional.ofNullable(this.staleWhileRevalidate);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HyperdriveConfigCaching defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean disabled;
        private @Nullable Integer maxAge;
        private @Nullable Integer staleWhileRevalidate;
        public Builder() {}
        public Builder(HyperdriveConfigCaching defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disabled = defaults.disabled;
    	      this.maxAge = defaults.maxAge;
    	      this.staleWhileRevalidate = defaults.staleWhileRevalidate;
        }

        @CustomType.Setter
        public Builder disabled(@Nullable Boolean disabled) {

            this.disabled = disabled;
            return this;
        }
        @CustomType.Setter
        public Builder maxAge(@Nullable Integer maxAge) {

            this.maxAge = maxAge;
            return this;
        }
        @CustomType.Setter
        public Builder staleWhileRevalidate(@Nullable Integer staleWhileRevalidate) {

            this.staleWhileRevalidate = staleWhileRevalidate;
            return this;
        }
        public HyperdriveConfigCaching build() {
            final var _resultValue = new HyperdriveConfigCaching();
            _resultValue.disabled = disabled;
            _resultValue.maxAge = maxAge;
            _resultValue.staleWhileRevalidate = staleWhileRevalidate;
            return _resultValue;
        }
    }
}
