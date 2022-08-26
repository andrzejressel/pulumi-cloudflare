// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CustomHostnameFallbackOriginState extends com.pulumi.resources.ResourceArgs {

    public static final CustomHostnameFallbackOriginState Empty = new CustomHostnameFallbackOriginState();

    /**
     * Hostname you intend to fallback requests to. Origin must be a proxied A/AAAA/CNAME DNS record within Clouldflare.
     * 
     */
    @Import(name="origin")
    private @Nullable Output<String> origin;

    /**
     * @return Hostname you intend to fallback requests to. Origin must be a proxied A/AAAA/CNAME DNS record within Clouldflare.
     * 
     */
    public Optional<Output<String>> origin() {
        return Optional.ofNullable(this.origin);
    }

    /**
     * Status of the fallback origin&#39;s activation.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Status of the fallback origin&#39;s activation.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The DNS zone ID where the custom hostname should be assigned.
     * 
     */
    @Import(name="zoneId")
    private @Nullable Output<String> zoneId;

    /**
     * @return The DNS zone ID where the custom hostname should be assigned.
     * 
     */
    public Optional<Output<String>> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    private CustomHostnameFallbackOriginState() {}

    private CustomHostnameFallbackOriginState(CustomHostnameFallbackOriginState $) {
        this.origin = $.origin;
        this.status = $.status;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomHostnameFallbackOriginState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomHostnameFallbackOriginState $;

        public Builder() {
            $ = new CustomHostnameFallbackOriginState();
        }

        public Builder(CustomHostnameFallbackOriginState defaults) {
            $ = new CustomHostnameFallbackOriginState(Objects.requireNonNull(defaults));
        }

        /**
         * @param origin Hostname you intend to fallback requests to. Origin must be a proxied A/AAAA/CNAME DNS record within Clouldflare.
         * 
         * @return builder
         * 
         */
        public Builder origin(@Nullable Output<String> origin) {
            $.origin = origin;
            return this;
        }

        /**
         * @param origin Hostname you intend to fallback requests to. Origin must be a proxied A/AAAA/CNAME DNS record within Clouldflare.
         * 
         * @return builder
         * 
         */
        public Builder origin(String origin) {
            return origin(Output.of(origin));
        }

        /**
         * @param status Status of the fallback origin&#39;s activation.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Status of the fallback origin&#39;s activation.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param zoneId The DNS zone ID where the custom hostname should be assigned.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(@Nullable Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The DNS zone ID where the custom hostname should be assigned.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public CustomHostnameFallbackOriginState build() {
            return $;
        }
    }

}
