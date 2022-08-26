// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ApiTokenConditionRequestIp {
    private @Nullable List<String> ins;
    private @Nullable List<String> notIns;

    private ApiTokenConditionRequestIp() {}
    public List<String> ins() {
        return this.ins == null ? List.of() : this.ins;
    }
    public List<String> notIns() {
        return this.notIns == null ? List.of() : this.notIns;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiTokenConditionRequestIp defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> ins;
        private @Nullable List<String> notIns;
        public Builder() {}
        public Builder(ApiTokenConditionRequestIp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ins = defaults.ins;
    	      this.notIns = defaults.notIns;
        }

        @CustomType.Setter
        public Builder ins(@Nullable List<String> ins) {
            this.ins = ins;
            return this;
        }
        public Builder ins(String... ins) {
            return ins(List.of(ins));
        }
        @CustomType.Setter
        public Builder notIns(@Nullable List<String> notIns) {
            this.notIns = notIns;
            return this;
        }
        public Builder notIns(String... notIns) {
            return notIns(List.of(notIns));
        }
        public ApiTokenConditionRequestIp build() {
            final var o = new ApiTokenConditionRequestIp();
            o.ins = ins;
            o.notIns = notIns;
            return o;
        }
    }
}
