// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LoadBalancerLocationStrategy {
    /**
     * @return Determines the authoritative location when ECS is not preferred, does not exist in the request, or its GeoIP lookup is unsuccessful. Value `pop` will use the Cloudflare PoP location. Value `resolver_ip` will use the DNS resolver GeoIP location. If the GeoIP lookup is unsuccessful, it will use the Cloudflare PoP location. Available values: `pop`, `resolver_ip`. Defaults to `pop`.
     * 
     */
    private @Nullable String mode;
    /**
     * @return Whether the EDNS Client Subnet (ECS) GeoIP should be preferred as the authoritative location. Value `always` will always prefer ECS, `never` will never prefer ECS, `proximity` will prefer ECS only when `steering_policy=&#34;proximity&#34;`, and `geo` will prefer ECS only when `steering_policy=&#34;geo&#34;`. Available values: `always`, `never`, `proximity`, `geo`. Defaults to `proximity`.
     * 
     */
    private @Nullable String preferEcs;

    private LoadBalancerLocationStrategy() {}
    /**
     * @return Determines the authoritative location when ECS is not preferred, does not exist in the request, or its GeoIP lookup is unsuccessful. Value `pop` will use the Cloudflare PoP location. Value `resolver_ip` will use the DNS resolver GeoIP location. If the GeoIP lookup is unsuccessful, it will use the Cloudflare PoP location. Available values: `pop`, `resolver_ip`. Defaults to `pop`.
     * 
     */
    public Optional<String> mode() {
        return Optional.ofNullable(this.mode);
    }
    /**
     * @return Whether the EDNS Client Subnet (ECS) GeoIP should be preferred as the authoritative location. Value `always` will always prefer ECS, `never` will never prefer ECS, `proximity` will prefer ECS only when `steering_policy=&#34;proximity&#34;`, and `geo` will prefer ECS only when `steering_policy=&#34;geo&#34;`. Available values: `always`, `never`, `proximity`, `geo`. Defaults to `proximity`.
     * 
     */
    public Optional<String> preferEcs() {
        return Optional.ofNullable(this.preferEcs);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerLocationStrategy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String mode;
        private @Nullable String preferEcs;
        public Builder() {}
        public Builder(LoadBalancerLocationStrategy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
    	      this.preferEcs = defaults.preferEcs;
        }

        @CustomType.Setter
        public Builder mode(@Nullable String mode) {
            this.mode = mode;
            return this;
        }
        @CustomType.Setter
        public Builder preferEcs(@Nullable String preferEcs) {
            this.preferEcs = preferEcs;
            return this;
        }
        public LoadBalancerLocationStrategy build() {
            final var _resultValue = new LoadBalancerLocationStrategy();
            _resultValue.mode = mode;
            _resultValue.preferEcs = preferEcs;
            return _resultValue;
        }
    }
}
