// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CustomHostnameSslValidationError {
    private @Nullable String message;

    private CustomHostnameSslValidationError() {}
    public Optional<String> message() {
        return Optional.ofNullable(this.message);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomHostnameSslValidationError defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String message;
        public Builder() {}
        public Builder(CustomHostnameSslValidationError defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.message = defaults.message;
        }

        @CustomType.Setter
        public Builder message(@Nullable String message) {
            this.message = message;
            return this;
        }
        public CustomHostnameSslValidationError build() {
            final var _resultValue = new CustomHostnameSslValidationError();
            _resultValue.message = message;
            return _resultValue;
        }
    }
}
