// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AccessApplicationSaasAppRefreshTokenOption {
    /**
     * @return How long a refresh token will be valid for after creation. Valid units are `m`, `h` and `d`. Must be longer than 1m.
     * 
     */
    private @Nullable String lifetime;

    private AccessApplicationSaasAppRefreshTokenOption() {}
    /**
     * @return How long a refresh token will be valid for after creation. Valid units are `m`, `h` and `d`. Must be longer than 1m.
     * 
     */
    public Optional<String> lifetime() {
        return Optional.ofNullable(this.lifetime);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessApplicationSaasAppRefreshTokenOption defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String lifetime;
        public Builder() {}
        public Builder(AccessApplicationSaasAppRefreshTokenOption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lifetime = defaults.lifetime;
        }

        @CustomType.Setter
        public Builder lifetime(@Nullable String lifetime) {

            this.lifetime = lifetime;
            return this;
        }
        public AccessApplicationSaasAppRefreshTokenOption build() {
            final var _resultValue = new AccessApplicationSaasAppRefreshTokenOption();
            _resultValue.lifetime = lifetime;
            return _resultValue;
        }
    }
}
