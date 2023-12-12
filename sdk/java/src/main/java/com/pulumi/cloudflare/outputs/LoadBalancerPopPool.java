// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class LoadBalancerPopPool {
    /**
     * @return A list of pool IDs in failover priority to use for traffic reaching the given PoP.
     * 
     */
    private List<String> poolIds;
    /**
     * @return A 3-letter code for the Point-of-Presence. Allowed values can be found in the list of datacenters on the [status page](https://www.cloudflarestatus.com/). Multiple entries should not be specified with the same PoP.
     * 
     */
    private String pop;

    private LoadBalancerPopPool() {}
    /**
     * @return A list of pool IDs in failover priority to use for traffic reaching the given PoP.
     * 
     */
    public List<String> poolIds() {
        return this.poolIds;
    }
    /**
     * @return A 3-letter code for the Point-of-Presence. Allowed values can be found in the list of datacenters on the [status page](https://www.cloudflarestatus.com/). Multiple entries should not be specified with the same PoP.
     * 
     */
    public String pop() {
        return this.pop;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerPopPool defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> poolIds;
        private String pop;
        public Builder() {}
        public Builder(LoadBalancerPopPool defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.poolIds = defaults.poolIds;
    	      this.pop = defaults.pop;
        }

        @CustomType.Setter
        public Builder poolIds(List<String> poolIds) {
            this.poolIds = Objects.requireNonNull(poolIds);
            return this;
        }
        public Builder poolIds(String... poolIds) {
            return poolIds(List.of(poolIds));
        }
        @CustomType.Setter
        public Builder pop(String pop) {
            this.pop = Objects.requireNonNull(pop);
            return this;
        }
        public LoadBalancerPopPool build() {
            final var _resultValue = new LoadBalancerPopPool();
            _resultValue.poolIds = poolIds;
            _resultValue.pop = pop;
            return _resultValue;
        }
    }
}
