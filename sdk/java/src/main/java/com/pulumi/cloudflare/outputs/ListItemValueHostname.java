// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ListItemValueHostname {
    /**
     * @return The FQDN to match on. Wildcard sub-domain matching is allowed. Eg. *.abc.com.
     * 
     */
    private String urlHostname;

    private ListItemValueHostname() {}
    /**
     * @return The FQDN to match on. Wildcard sub-domain matching is allowed. Eg. *.abc.com.
     * 
     */
    public String urlHostname() {
        return this.urlHostname;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListItemValueHostname defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String urlHostname;
        public Builder() {}
        public Builder(ListItemValueHostname defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.urlHostname = defaults.urlHostname;
        }

        @CustomType.Setter
        public Builder urlHostname(String urlHostname) {
            this.urlHostname = Objects.requireNonNull(urlHostname);
            return this;
        }
        public ListItemValueHostname build() {
            final var _resultValue = new ListItemValueHostname();
            _resultValue.urlHostname = urlHostname;
            return _resultValue;
        }
    }
}
