// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ZeroTrustAccessApplicationSaasAppCustomClaimSource {
    /**
     * @return The name of the attribute as provided by the IDP.
     * 
     */
    private String name;
    /**
     * @return A mapping from IdP ID to claim name.
     * 
     */
    private @Nullable Map<String,String> nameByIdp;

    private ZeroTrustAccessApplicationSaasAppCustomClaimSource() {}
    /**
     * @return The name of the attribute as provided by the IDP.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return A mapping from IdP ID to claim name.
     * 
     */
    public Map<String,String> nameByIdp() {
        return this.nameByIdp == null ? Map.of() : this.nameByIdp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ZeroTrustAccessApplicationSaasAppCustomClaimSource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private @Nullable Map<String,String> nameByIdp;
        public Builder() {}
        public Builder(ZeroTrustAccessApplicationSaasAppCustomClaimSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.nameByIdp = defaults.nameByIdp;
        }

        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("ZeroTrustAccessApplicationSaasAppCustomClaimSource", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder nameByIdp(@Nullable Map<String,String> nameByIdp) {

            this.nameByIdp = nameByIdp;
            return this;
        }
        public ZeroTrustAccessApplicationSaasAppCustomClaimSource build() {
            final var _resultValue = new ZeroTrustAccessApplicationSaasAppCustomClaimSource();
            _resultValue.name = name;
            _resultValue.nameByIdp = nameByIdp;
            return _resultValue;
        }
    }
}