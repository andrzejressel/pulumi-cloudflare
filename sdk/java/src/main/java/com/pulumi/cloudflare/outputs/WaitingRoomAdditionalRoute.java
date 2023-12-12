// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WaitingRoomAdditionalRoute {
    /**
     * @return The additional host name for which the waiting room to be applied on (no wildcards).
     * 
     */
    private String host;
    /**
     * @return The path within the additional host to enable the waiting room on. Defaults to `/`.
     * 
     */
    private @Nullable String path;

    private WaitingRoomAdditionalRoute() {}
    /**
     * @return The additional host name for which the waiting room to be applied on (no wildcards).
     * 
     */
    public String host() {
        return this.host;
    }
    /**
     * @return The path within the additional host to enable the waiting room on. Defaults to `/`.
     * 
     */
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WaitingRoomAdditionalRoute defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String host;
        private @Nullable String path;
        public Builder() {}
        public Builder(WaitingRoomAdditionalRoute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.host = defaults.host;
    	      this.path = defaults.path;
        }

        @CustomType.Setter
        public Builder host(String host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }
        @CustomType.Setter
        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }
        public WaitingRoomAdditionalRoute build() {
            final var _resultValue = new WaitingRoomAdditionalRoute();
            _resultValue.host = host;
            _resultValue.path = path;
            return _resultValue;
        }
    }
}
