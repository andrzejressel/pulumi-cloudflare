// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LoadBalancerRuleOverrideRandomSteering {
    /**
     * @return The default weight for pools in the load balancer that are not specified in the `pool_weights` map.
     * 
     */
    private @Nullable Double defaultWeight;
    /**
     * @return A mapping of pool IDs to custom weights. The weight is relative to other pools in the load balancer.
     * 
     */
    private @Nullable Map<String,Double> poolWeights;

    private LoadBalancerRuleOverrideRandomSteering() {}
    /**
     * @return The default weight for pools in the load balancer that are not specified in the `pool_weights` map.
     * 
     */
    public Optional<Double> defaultWeight() {
        return Optional.ofNullable(this.defaultWeight);
    }
    /**
     * @return A mapping of pool IDs to custom weights. The weight is relative to other pools in the load balancer.
     * 
     */
    public Map<String,Double> poolWeights() {
        return this.poolWeights == null ? Map.of() : this.poolWeights;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerRuleOverrideRandomSteering defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Double defaultWeight;
        private @Nullable Map<String,Double> poolWeights;
        public Builder() {}
        public Builder(LoadBalancerRuleOverrideRandomSteering defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultWeight = defaults.defaultWeight;
    	      this.poolWeights = defaults.poolWeights;
        }

        @CustomType.Setter
        public Builder defaultWeight(@Nullable Double defaultWeight) {
            this.defaultWeight = defaultWeight;
            return this;
        }
        @CustomType.Setter
        public Builder poolWeights(@Nullable Map<String,Double> poolWeights) {
            this.poolWeights = poolWeights;
            return this;
        }
        public LoadBalancerRuleOverrideRandomSteering build() {
            final var _resultValue = new LoadBalancerRuleOverrideRandomSteering();
            _resultValue.defaultWeight = defaultWeight;
            _resultValue.poolWeights = poolWeights;
            return _resultValue;
        }
    }
}
