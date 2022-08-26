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
public final class CustomHostnameSslValidationRecord {
    private @Nullable String cnameName;
    private @Nullable String cnameTarget;
    private @Nullable List<String> emails;
    private @Nullable String httpBody;
    private @Nullable String httpUrl;
    private @Nullable String txtName;
    private @Nullable String txtValue;

    private CustomHostnameSslValidationRecord() {}
    public Optional<String> cnameName() {
        return Optional.ofNullable(this.cnameName);
    }
    public Optional<String> cnameTarget() {
        return Optional.ofNullable(this.cnameTarget);
    }
    public List<String> emails() {
        return this.emails == null ? List.of() : this.emails;
    }
    public Optional<String> httpBody() {
        return Optional.ofNullable(this.httpBody);
    }
    public Optional<String> httpUrl() {
        return Optional.ofNullable(this.httpUrl);
    }
    public Optional<String> txtName() {
        return Optional.ofNullable(this.txtName);
    }
    public Optional<String> txtValue() {
        return Optional.ofNullable(this.txtValue);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomHostnameSslValidationRecord defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String cnameName;
        private @Nullable String cnameTarget;
        private @Nullable List<String> emails;
        private @Nullable String httpBody;
        private @Nullable String httpUrl;
        private @Nullable String txtName;
        private @Nullable String txtValue;
        public Builder() {}
        public Builder(CustomHostnameSslValidationRecord defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cnameName = defaults.cnameName;
    	      this.cnameTarget = defaults.cnameTarget;
    	      this.emails = defaults.emails;
    	      this.httpBody = defaults.httpBody;
    	      this.httpUrl = defaults.httpUrl;
    	      this.txtName = defaults.txtName;
    	      this.txtValue = defaults.txtValue;
        }

        @CustomType.Setter
        public Builder cnameName(@Nullable String cnameName) {
            this.cnameName = cnameName;
            return this;
        }
        @CustomType.Setter
        public Builder cnameTarget(@Nullable String cnameTarget) {
            this.cnameTarget = cnameTarget;
            return this;
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
        public Builder httpBody(@Nullable String httpBody) {
            this.httpBody = httpBody;
            return this;
        }
        @CustomType.Setter
        public Builder httpUrl(@Nullable String httpUrl) {
            this.httpUrl = httpUrl;
            return this;
        }
        @CustomType.Setter
        public Builder txtName(@Nullable String txtName) {
            this.txtName = txtName;
            return this;
        }
        @CustomType.Setter
        public Builder txtValue(@Nullable String txtValue) {
            this.txtValue = txtValue;
            return this;
        }
        public CustomHostnameSslValidationRecord build() {
            final var o = new CustomHostnameSslValidationRecord();
            o.cnameName = cnameName;
            o.cnameTarget = cnameTarget;
            o.emails = emails;
            o.httpBody = httpBody;
            o.httpUrl = httpUrl;
            o.txtName = txtName;
            o.txtValue = txtValue;
            return o;
        }
    }
}
