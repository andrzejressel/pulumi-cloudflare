// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetIpRangesResult {
    private List<String> chinaIpv4CidrBlocks;
    private List<String> chinaIpv6CidrBlocks;
    private List<String> cidrBlocks;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ipv4CidrBlocks;
    private List<String> ipv6CidrBlocks;

    private GetIpRangesResult() {}
    public List<String> chinaIpv4CidrBlocks() {
        return this.chinaIpv4CidrBlocks;
    }
    public List<String> chinaIpv6CidrBlocks() {
        return this.chinaIpv6CidrBlocks;
    }
    public List<String> cidrBlocks() {
        return this.cidrBlocks;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<String> ipv4CidrBlocks() {
        return this.ipv4CidrBlocks;
    }
    public List<String> ipv6CidrBlocks() {
        return this.ipv6CidrBlocks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIpRangesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> chinaIpv4CidrBlocks;
        private List<String> chinaIpv6CidrBlocks;
        private List<String> cidrBlocks;
        private String id;
        private List<String> ipv4CidrBlocks;
        private List<String> ipv6CidrBlocks;
        public Builder() {}
        public Builder(GetIpRangesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.chinaIpv4CidrBlocks = defaults.chinaIpv4CidrBlocks;
    	      this.chinaIpv6CidrBlocks = defaults.chinaIpv6CidrBlocks;
    	      this.cidrBlocks = defaults.cidrBlocks;
    	      this.id = defaults.id;
    	      this.ipv4CidrBlocks = defaults.ipv4CidrBlocks;
    	      this.ipv6CidrBlocks = defaults.ipv6CidrBlocks;
        }

        @CustomType.Setter
        public Builder chinaIpv4CidrBlocks(List<String> chinaIpv4CidrBlocks) {
            this.chinaIpv4CidrBlocks = Objects.requireNonNull(chinaIpv4CidrBlocks);
            return this;
        }
        public Builder chinaIpv4CidrBlocks(String... chinaIpv4CidrBlocks) {
            return chinaIpv4CidrBlocks(List.of(chinaIpv4CidrBlocks));
        }
        @CustomType.Setter
        public Builder chinaIpv6CidrBlocks(List<String> chinaIpv6CidrBlocks) {
            this.chinaIpv6CidrBlocks = Objects.requireNonNull(chinaIpv6CidrBlocks);
            return this;
        }
        public Builder chinaIpv6CidrBlocks(String... chinaIpv6CidrBlocks) {
            return chinaIpv6CidrBlocks(List.of(chinaIpv6CidrBlocks));
        }
        @CustomType.Setter
        public Builder cidrBlocks(List<String> cidrBlocks) {
            this.cidrBlocks = Objects.requireNonNull(cidrBlocks);
            return this;
        }
        public Builder cidrBlocks(String... cidrBlocks) {
            return cidrBlocks(List.of(cidrBlocks));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder ipv4CidrBlocks(List<String> ipv4CidrBlocks) {
            this.ipv4CidrBlocks = Objects.requireNonNull(ipv4CidrBlocks);
            return this;
        }
        public Builder ipv4CidrBlocks(String... ipv4CidrBlocks) {
            return ipv4CidrBlocks(List.of(ipv4CidrBlocks));
        }
        @CustomType.Setter
        public Builder ipv6CidrBlocks(List<String> ipv6CidrBlocks) {
            this.ipv6CidrBlocks = Objects.requireNonNull(ipv6CidrBlocks);
            return this;
        }
        public Builder ipv6CidrBlocks(String... ipv6CidrBlocks) {
            return ipv6CidrBlocks(List.of(ipv6CidrBlocks));
        }
        public GetIpRangesResult build() {
            final var o = new GetIpRangesResult();
            o.chinaIpv4CidrBlocks = chinaIpv4CidrBlocks;
            o.chinaIpv6CidrBlocks = chinaIpv6CidrBlocks;
            o.cidrBlocks = cidrBlocks;
            o.id = id;
            o.ipv4CidrBlocks = ipv4CidrBlocks;
            o.ipv6CidrBlocks = ipv6CidrBlocks;
            return o;
        }
    }
}
