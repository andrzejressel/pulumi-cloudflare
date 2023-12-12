// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AccessIdentityProviderScimConfig {
    private @Nullable Boolean enabled;
    private @Nullable Boolean groupMemberDeprovision;
    private @Nullable Boolean seatDeprovision;
    private @Nullable String secret;
    private @Nullable Boolean userDeprovision;

    private AccessIdentityProviderScimConfig() {}
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    public Optional<Boolean> groupMemberDeprovision() {
        return Optional.ofNullable(this.groupMemberDeprovision);
    }
    public Optional<Boolean> seatDeprovision() {
        return Optional.ofNullable(this.seatDeprovision);
    }
    public Optional<String> secret() {
        return Optional.ofNullable(this.secret);
    }
    public Optional<Boolean> userDeprovision() {
        return Optional.ofNullable(this.userDeprovision);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessIdentityProviderScimConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable Boolean groupMemberDeprovision;
        private @Nullable Boolean seatDeprovision;
        private @Nullable String secret;
        private @Nullable Boolean userDeprovision;
        public Builder() {}
        public Builder(AccessIdentityProviderScimConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.groupMemberDeprovision = defaults.groupMemberDeprovision;
    	      this.seatDeprovision = defaults.seatDeprovision;
    	      this.secret = defaults.secret;
    	      this.userDeprovision = defaults.userDeprovision;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder groupMemberDeprovision(@Nullable Boolean groupMemberDeprovision) {
            this.groupMemberDeprovision = groupMemberDeprovision;
            return this;
        }
        @CustomType.Setter
        public Builder seatDeprovision(@Nullable Boolean seatDeprovision) {
            this.seatDeprovision = seatDeprovision;
            return this;
        }
        @CustomType.Setter
        public Builder secret(@Nullable String secret) {
            this.secret = secret;
            return this;
        }
        @CustomType.Setter
        public Builder userDeprovision(@Nullable Boolean userDeprovision) {
            this.userDeprovision = userDeprovision;
            return this;
        }
        public AccessIdentityProviderScimConfig build() {
            final var _resultValue = new AccessIdentityProviderScimConfig();
            _resultValue.enabled = enabled;
            _resultValue.groupMemberDeprovision = groupMemberDeprovision;
            _resultValue.seatDeprovision = seatDeprovision;
            _resultValue.secret = secret;
            _resultValue.userDeprovision = userDeprovision;
            return _resultValue;
        }
    }
}
