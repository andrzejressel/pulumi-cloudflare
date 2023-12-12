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
public final class AccessPolicyRequireGsuite {
    private @Nullable List<String> emails;
    /**
     * @return The ID of the Azure Identity provider.
     * 
     */
    private @Nullable String identityProviderId;

    private AccessPolicyRequireGsuite() {}
    public List<String> emails() {
        return this.emails == null ? List.of() : this.emails;
    }
    /**
     * @return The ID of the Azure Identity provider.
     * 
     */
    public Optional<String> identityProviderId() {
        return Optional.ofNullable(this.identityProviderId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessPolicyRequireGsuite defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> emails;
        private @Nullable String identityProviderId;
        public Builder() {}
        public Builder(AccessPolicyRequireGsuite defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.emails = defaults.emails;
    	      this.identityProviderId = defaults.identityProviderId;
        }

        @CustomType.Setter
        public Builder emails(@Nullable List<String> emails) {
            this.emails = emails;
            return this;
        }
        public Builder emails(String... emails) {
            return emails(List.of(emails));
        }
        @CustomType.Setter
        public Builder identityProviderId(@Nullable String identityProviderId) {
            this.identityProviderId = identityProviderId;
            return this;
        }
        public AccessPolicyRequireGsuite build() {
            final var _resultValue = new AccessPolicyRequireGsuite();
            _resultValue.emails = emails;
            _resultValue.identityProviderId = identityProviderId;
            return _resultValue;
        }
    }
}
