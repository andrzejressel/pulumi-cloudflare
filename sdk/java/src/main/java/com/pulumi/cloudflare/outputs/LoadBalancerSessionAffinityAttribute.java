// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LoadBalancerSessionAffinityAttribute {
    private @Nullable Integer drainDuration;
    private @Nullable List<String> headers;
    private @Nullable Boolean requireAllHeaders;
    private @Nullable String samesite;
    private @Nullable String secure;
    private @Nullable String zeroDowntimeFailover;

    private LoadBalancerSessionAffinityAttribute() {}
    public Optional<Integer> drainDuration() {
        return Optional.ofNullable(this.drainDuration);
    }
    public List<String> headers() {
        return this.headers == null ? List.of() : this.headers;
    }
    public Optional<Boolean> requireAllHeaders() {
        return Optional.ofNullable(this.requireAllHeaders);
    }
    public Optional<String> samesite() {
        return Optional.ofNullable(this.samesite);
    }
    public Optional<String> secure() {
        return Optional.ofNullable(this.secure);
    }
    public Optional<String> zeroDowntimeFailover() {
        return Optional.ofNullable(this.zeroDowntimeFailover);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerSessionAffinityAttribute defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer drainDuration;
        private @Nullable List<String> headers;
        private @Nullable Boolean requireAllHeaders;
        private @Nullable String samesite;
        private @Nullable String secure;
        private @Nullable String zeroDowntimeFailover;
        public Builder() {}
        public Builder(LoadBalancerSessionAffinityAttribute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.drainDuration = defaults.drainDuration;
    	      this.headers = defaults.headers;
    	      this.requireAllHeaders = defaults.requireAllHeaders;
    	      this.samesite = defaults.samesite;
    	      this.secure = defaults.secure;
    	      this.zeroDowntimeFailover = defaults.zeroDowntimeFailover;
        }

        @CustomType.Setter
        public Builder drainDuration(@Nullable Integer drainDuration) {
            this.drainDuration = drainDuration;
            return this;
        }
        @CustomType.Setter
        public Builder headers(@Nullable List<String> headers) {
            this.headers = headers;
            return this;
        }
        public Builder headers(String... headers) {
            return headers(List.of(headers));
        }
        @CustomType.Setter
        public Builder requireAllHeaders(@Nullable Boolean requireAllHeaders) {
            this.requireAllHeaders = requireAllHeaders;
            return this;
        }
        @CustomType.Setter
        public Builder samesite(@Nullable String samesite) {
            this.samesite = samesite;
            return this;
        }
        @CustomType.Setter
        public Builder secure(@Nullable String secure) {
            this.secure = secure;
            return this;
        }
        @CustomType.Setter
        public Builder zeroDowntimeFailover(@Nullable String zeroDowntimeFailover) {
            this.zeroDowntimeFailover = zeroDowntimeFailover;
            return this;
        }
        public LoadBalancerSessionAffinityAttribute build() {
            final var o = new LoadBalancerSessionAffinityAttribute();
            o.drainDuration = drainDuration;
            o.headers = headers;
            o.requireAllHeaders = requireAllHeaders;
            o.samesite = samesite;
            o.secure = secure;
            o.zeroDowntimeFailover = zeroDowntimeFailover;
            return o;
        }
    }
}
