// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SpectrumApplicationDns {
    /**
     * @return Fully qualified domain name of the origin e.g. origin-ssh.example.com.
     * 
     */
    private String name;
    /**
     * @return The type of DNS record associated with the application. Valid values: `CNAME`.
     * 
     */
    private String type;

    private SpectrumApplicationDns() {}
    /**
     * @return Fully qualified domain name of the origin e.g. origin-ssh.example.com.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The type of DNS record associated with the application. Valid values: `CNAME`.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpectrumApplicationDns defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String type;
        public Builder() {}
        public Builder(SpectrumApplicationDns defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public SpectrumApplicationDns build() {
            final var o = new SpectrumApplicationDns();
            o.name = name;
            o.type = type;
            return o;
        }
    }
}
