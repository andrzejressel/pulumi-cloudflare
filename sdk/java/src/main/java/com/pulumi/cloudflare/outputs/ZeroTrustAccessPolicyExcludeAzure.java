// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ZeroTrustAccessPolicyExcludeAzure {
    /**
     * @return The ID of the Azure Identity provider.
     * 
     */
    private @Nullable String identityProviderId;
    /**
     * @return The ID of the Azure group or user.
     * 
     */
    private @Nullable List<String> ids;

    private ZeroTrustAccessPolicyExcludeAzure() {}
    /**
     * @return The ID of the Azure Identity provider.
     * 
     */
    public Optional<String> identityProviderId() {
        return Optional.ofNullable(this.identityProviderId);
    }
    /**
     * @return The ID of the Azure group or user.
     * 
     */
    public List<String> ids() {
        return this.ids == null ? List.of() : this.ids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ZeroTrustAccessPolicyExcludeAzure defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String identityProviderId;
        private @Nullable List<String> ids;
        public Builder() {}
        public Builder(ZeroTrustAccessPolicyExcludeAzure defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identityProviderId = defaults.identityProviderId;
    	      this.ids = defaults.ids;
        }

        @CustomType.Setter
        public Builder identityProviderId(@Nullable String identityProviderId) {

            this.identityProviderId = identityProviderId;
            return this;
        }
        @CustomType.Setter
        public Builder ids(@Nullable List<String> ids) {

            this.ids = ids;
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        public ZeroTrustAccessPolicyExcludeAzure build() {
            final var _resultValue = new ZeroTrustAccessPolicyExcludeAzure();
            _resultValue.identityProviderId = identityProviderId;
            _resultValue.ids = ids;
            return _resultValue;
        }
    }
}
