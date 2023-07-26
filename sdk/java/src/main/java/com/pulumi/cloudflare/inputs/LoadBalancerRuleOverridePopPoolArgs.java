// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class LoadBalancerRuleOverridePopPoolArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoadBalancerRuleOverridePopPoolArgs Empty = new LoadBalancerRuleOverridePopPoolArgs();

    @Import(name="poolIds", required=true)
    private Output<List<String>> poolIds;

    public Output<List<String>> poolIds() {
        return this.poolIds;
    }

    @Import(name="pop", required=true)
    private Output<String> pop;

    public Output<String> pop() {
        return this.pop;
    }

    private LoadBalancerRuleOverridePopPoolArgs() {}

    private LoadBalancerRuleOverridePopPoolArgs(LoadBalancerRuleOverridePopPoolArgs $) {
        this.poolIds = $.poolIds;
        this.pop = $.pop;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadBalancerRuleOverridePopPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadBalancerRuleOverridePopPoolArgs $;

        public Builder() {
            $ = new LoadBalancerRuleOverridePopPoolArgs();
        }

        public Builder(LoadBalancerRuleOverridePopPoolArgs defaults) {
            $ = new LoadBalancerRuleOverridePopPoolArgs(Objects.requireNonNull(defaults));
        }

        public Builder poolIds(Output<List<String>> poolIds) {
            $.poolIds = poolIds;
            return this;
        }

        public Builder poolIds(List<String> poolIds) {
            return poolIds(Output.of(poolIds));
        }

        public Builder poolIds(String... poolIds) {
            return poolIds(List.of(poolIds));
        }

        public Builder pop(Output<String> pop) {
            $.pop = pop;
            return this;
        }

        public Builder pop(String pop) {
            return pop(Output.of(pop));
        }

        public LoadBalancerRuleOverridePopPoolArgs build() {
            $.poolIds = Objects.requireNonNull($.poolIds, "expected parameter 'poolIds' to be non-null");
            $.pop = Objects.requireNonNull($.pop, "expected parameter 'pop' to be non-null");
            return $;
        }
    }

}
