// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetWafPackagesFilter {
    /**
     * @return Action mode of the WAF Rule Packages to lookup. Valid values: simulate, block and challenge.
     * 
     */
    private @Nullable String actionMode;
    /**
     * @return Detection mode of the WAF Rule Packages to lookup.
     * 
     */
    private @Nullable String detectionMode;
    /**
     * @return A regular expression matching the name of the WAF Rule Packages to lookup.
     * 
     */
    private @Nullable String name;
    /**
     * @return Sensitivity of the WAF Rule Packages to lookup. Valid values: high, medium, low and off.
     * 
     */
    private @Nullable String sensitivity;

    private GetWafPackagesFilter() {}
    /**
     * @return Action mode of the WAF Rule Packages to lookup. Valid values: simulate, block and challenge.
     * 
     */
    public Optional<String> actionMode() {
        return Optional.ofNullable(this.actionMode);
    }
    /**
     * @return Detection mode of the WAF Rule Packages to lookup.
     * 
     */
    public Optional<String> detectionMode() {
        return Optional.ofNullable(this.detectionMode);
    }
    /**
     * @return A regular expression matching the name of the WAF Rule Packages to lookup.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Sensitivity of the WAF Rule Packages to lookup. Valid values: high, medium, low and off.
     * 
     */
    public Optional<String> sensitivity() {
        return Optional.ofNullable(this.sensitivity);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWafPackagesFilter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String actionMode;
        private @Nullable String detectionMode;
        private @Nullable String name;
        private @Nullable String sensitivity;
        public Builder() {}
        public Builder(GetWafPackagesFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionMode = defaults.actionMode;
    	      this.detectionMode = defaults.detectionMode;
    	      this.name = defaults.name;
    	      this.sensitivity = defaults.sensitivity;
        }

        @CustomType.Setter
        public Builder actionMode(@Nullable String actionMode) {
            this.actionMode = actionMode;
            return this;
        }
        @CustomType.Setter
        public Builder detectionMode(@Nullable String detectionMode) {
            this.detectionMode = detectionMode;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder sensitivity(@Nullable String sensitivity) {
            this.sensitivity = sensitivity;
            return this;
        }
        public GetWafPackagesFilter build() {
            final var o = new GetWafPackagesFilter();
            o.actionMode = actionMode;
            o.detectionMode = detectionMode;
            o.name = name;
            o.sensitivity = sensitivity;
            return o;
        }
    }
}