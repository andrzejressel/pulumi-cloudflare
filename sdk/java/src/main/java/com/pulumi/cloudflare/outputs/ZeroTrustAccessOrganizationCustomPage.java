// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ZeroTrustAccessOrganizationCustomPage {
    /**
     * @return The id of the forbidden page.
     * 
     */
    private @Nullable String forbidden;
    /**
     * @return The id of the identity denied page.
     * 
     */
    private @Nullable String identityDenied;

    private ZeroTrustAccessOrganizationCustomPage() {}
    /**
     * @return The id of the forbidden page.
     * 
     */
    public Optional<String> forbidden() {
        return Optional.ofNullable(this.forbidden);
    }
    /**
     * @return The id of the identity denied page.
     * 
     */
    public Optional<String> identityDenied() {
        return Optional.ofNullable(this.identityDenied);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ZeroTrustAccessOrganizationCustomPage defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String forbidden;
        private @Nullable String identityDenied;
        public Builder() {}
        public Builder(ZeroTrustAccessOrganizationCustomPage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.forbidden = defaults.forbidden;
    	      this.identityDenied = defaults.identityDenied;
        }

        @CustomType.Setter
        public Builder forbidden(@Nullable String forbidden) {

            this.forbidden = forbidden;
            return this;
        }
        @CustomType.Setter
        public Builder identityDenied(@Nullable String identityDenied) {

            this.identityDenied = identityDenied;
            return this;
        }
        public ZeroTrustAccessOrganizationCustomPage build() {
            final var _resultValue = new ZeroTrustAccessOrganizationCustomPage();
            _resultValue.forbidden = forbidden;
            _resultValue.identityDenied = identityDenied;
            return _resultValue;
        }
    }
}
