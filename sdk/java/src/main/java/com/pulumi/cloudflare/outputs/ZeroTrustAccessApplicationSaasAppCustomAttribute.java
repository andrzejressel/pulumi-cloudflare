// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.ZeroTrustAccessApplicationSaasAppCustomAttributeSource;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ZeroTrustAccessApplicationSaasAppCustomAttribute {
    /**
     * @return A friendly name for the attribute as provided to the SaaS app.
     * 
     */
    private @Nullable String friendlyName;
    /**
     * @return The name of the attribute as provided to the SaaS app.
     * 
     */
    private @Nullable String name;
    /**
     * @return A globally unique name for an identity or service provider.
     * 
     */
    private @Nullable String nameFormat;
    /**
     * @return True if the attribute must be always present.
     * 
     */
    private @Nullable Boolean required;
    private ZeroTrustAccessApplicationSaasAppCustomAttributeSource source;

    private ZeroTrustAccessApplicationSaasAppCustomAttribute() {}
    /**
     * @return A friendly name for the attribute as provided to the SaaS app.
     * 
     */
    public Optional<String> friendlyName() {
        return Optional.ofNullable(this.friendlyName);
    }
    /**
     * @return The name of the attribute as provided to the SaaS app.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return A globally unique name for an identity or service provider.
     * 
     */
    public Optional<String> nameFormat() {
        return Optional.ofNullable(this.nameFormat);
    }
    /**
     * @return True if the attribute must be always present.
     * 
     */
    public Optional<Boolean> required() {
        return Optional.ofNullable(this.required);
    }
    public ZeroTrustAccessApplicationSaasAppCustomAttributeSource source() {
        return this.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ZeroTrustAccessApplicationSaasAppCustomAttribute defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String friendlyName;
        private @Nullable String name;
        private @Nullable String nameFormat;
        private @Nullable Boolean required;
        private ZeroTrustAccessApplicationSaasAppCustomAttributeSource source;
        public Builder() {}
        public Builder(ZeroTrustAccessApplicationSaasAppCustomAttribute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.friendlyName = defaults.friendlyName;
    	      this.name = defaults.name;
    	      this.nameFormat = defaults.nameFormat;
    	      this.required = defaults.required;
    	      this.source = defaults.source;
        }

        @CustomType.Setter
        public Builder friendlyName(@Nullable String friendlyName) {

            this.friendlyName = friendlyName;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder nameFormat(@Nullable String nameFormat) {

            this.nameFormat = nameFormat;
            return this;
        }
        @CustomType.Setter
        public Builder required(@Nullable Boolean required) {

            this.required = required;
            return this;
        }
        @CustomType.Setter
        public Builder source(ZeroTrustAccessApplicationSaasAppCustomAttributeSource source) {
            if (source == null) {
              throw new MissingRequiredPropertyException("ZeroTrustAccessApplicationSaasAppCustomAttribute", "source");
            }
            this.source = source;
            return this;
        }
        public ZeroTrustAccessApplicationSaasAppCustomAttribute build() {
            final var _resultValue = new ZeroTrustAccessApplicationSaasAppCustomAttribute();
            _resultValue.friendlyName = friendlyName;
            _resultValue.name = name;
            _resultValue.nameFormat = nameFormat;
            _resultValue.required = required;
            _resultValue.source = source;
            return _resultValue;
        }
    }
}