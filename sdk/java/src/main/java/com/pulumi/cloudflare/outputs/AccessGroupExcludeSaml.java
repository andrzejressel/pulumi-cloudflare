// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AccessGroupExcludeSaml {
    private @Nullable String attributeName;
    private @Nullable String attributeValue;
    private @Nullable String identityProviderId;

    private AccessGroupExcludeSaml() {}
    public Optional<String> attributeName() {
        return Optional.ofNullable(this.attributeName);
    }
    public Optional<String> attributeValue() {
        return Optional.ofNullable(this.attributeValue);
    }
    public Optional<String> identityProviderId() {
        return Optional.ofNullable(this.identityProviderId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessGroupExcludeSaml defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String attributeName;
        private @Nullable String attributeValue;
        private @Nullable String identityProviderId;
        public Builder() {}
        public Builder(AccessGroupExcludeSaml defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributeName = defaults.attributeName;
    	      this.attributeValue = defaults.attributeValue;
    	      this.identityProviderId = defaults.identityProviderId;
        }

        @CustomType.Setter
        public Builder attributeName(@Nullable String attributeName) {
            this.attributeName = attributeName;
            return this;
        }
        @CustomType.Setter
        public Builder attributeValue(@Nullable String attributeValue) {
            this.attributeValue = attributeValue;
            return this;
        }
        @CustomType.Setter
        public Builder identityProviderId(@Nullable String identityProviderId) {
            this.identityProviderId = identityProviderId;
            return this;
        }
        public AccessGroupExcludeSaml build() {
            final var o = new AccessGroupExcludeSaml();
            o.attributeName = attributeName;
            o.attributeValue = attributeValue;
            o.identityProviderId = identityProviderId;
            return o;
        }
    }
}
