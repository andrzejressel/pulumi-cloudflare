// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ZeroTrustDlpProfileEntryPattern {
    /**
     * @return The regex that defines the pattern.
     * 
     */
    private String regex;
    /**
     * @return The validation algorithm to apply with this pattern.
     * 
     */
    private @Nullable String validation;

    private ZeroTrustDlpProfileEntryPattern() {}
    /**
     * @return The regex that defines the pattern.
     * 
     */
    public String regex() {
        return this.regex;
    }
    /**
     * @return The validation algorithm to apply with this pattern.
     * 
     */
    public Optional<String> validation() {
        return Optional.ofNullable(this.validation);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ZeroTrustDlpProfileEntryPattern defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String regex;
        private @Nullable String validation;
        public Builder() {}
        public Builder(ZeroTrustDlpProfileEntryPattern defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.regex = defaults.regex;
    	      this.validation = defaults.validation;
        }

        @CustomType.Setter
        public Builder regex(String regex) {
            if (regex == null) {
              throw new MissingRequiredPropertyException("ZeroTrustDlpProfileEntryPattern", "regex");
            }
            this.regex = regex;
            return this;
        }
        @CustomType.Setter
        public Builder validation(@Nullable String validation) {

            this.validation = validation;
            return this;
        }
        public ZeroTrustDlpProfileEntryPattern build() {
            final var _resultValue = new ZeroTrustDlpProfileEntryPattern();
            _resultValue.regex = regex;
            _resultValue.validation = validation;
            return _resultValue;
        }
    }
}
