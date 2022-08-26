// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AccessRuleConfiguration {
    /**
     * @return The request property to target. Available values: `ip`, `ip6`, `ip_range`, `asn`, `country`.
     * 
     */
    private String target;
    /**
     * @return The value to target. Depends on target&#39;s type.
     * 
     */
    private String value;

    private AccessRuleConfiguration() {}
    /**
     * @return The request property to target. Available values: `ip`, `ip6`, `ip_range`, `asn`, `country`.
     * 
     */
    public String target() {
        return this.target;
    }
    /**
     * @return The value to target. Depends on target&#39;s type.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessRuleConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String target;
        private String value;
        public Builder() {}
        public Builder(AccessRuleConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.target = defaults.target;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder target(String target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public AccessRuleConfiguration build() {
            final var o = new AccessRuleConfiguration();
            o.target = target;
            o.value = value;
            return o;
        }
    }
}
