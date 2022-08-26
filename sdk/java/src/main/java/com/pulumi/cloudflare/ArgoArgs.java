// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ArgoArgs extends com.pulumi.resources.ResourceArgs {

    public static final ArgoArgs Empty = new ArgoArgs();

    /**
     * Whether smart routing is enabled. Available values: `on`, `off`.
     * 
     */
    @Import(name="smartRouting")
    private @Nullable Output<String> smartRouting;

    /**
     * @return Whether smart routing is enabled. Available values: `on`, `off`.
     * 
     */
    public Optional<Output<String>> smartRouting() {
        return Optional.ofNullable(this.smartRouting);
    }

    /**
     * Whether tiered caching is enabled. Available values: `on`, `off`.
     * 
     */
    @Import(name="tieredCaching")
    private @Nullable Output<String> tieredCaching;

    /**
     * @return Whether tiered caching is enabled. Available values: `on`, `off`.
     * 
     */
    public Optional<Output<String>> tieredCaching() {
        return Optional.ofNullable(this.tieredCaching);
    }

    /**
     * The zone identifier to target for the resource.
     * 
     */
    @Import(name="zoneId", required=true)
    private Output<String> zoneId;

    /**
     * @return The zone identifier to target for the resource.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    private ArgoArgs() {}

    private ArgoArgs(ArgoArgs $) {
        this.smartRouting = $.smartRouting;
        this.tieredCaching = $.tieredCaching;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ArgoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ArgoArgs $;

        public Builder() {
            $ = new ArgoArgs();
        }

        public Builder(ArgoArgs defaults) {
            $ = new ArgoArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param smartRouting Whether smart routing is enabled. Available values: `on`, `off`.
         * 
         * @return builder
         * 
         */
        public Builder smartRouting(@Nullable Output<String> smartRouting) {
            $.smartRouting = smartRouting;
            return this;
        }

        /**
         * @param smartRouting Whether smart routing is enabled. Available values: `on`, `off`.
         * 
         * @return builder
         * 
         */
        public Builder smartRouting(String smartRouting) {
            return smartRouting(Output.of(smartRouting));
        }

        /**
         * @param tieredCaching Whether tiered caching is enabled. Available values: `on`, `off`.
         * 
         * @return builder
         * 
         */
        public Builder tieredCaching(@Nullable Output<String> tieredCaching) {
            $.tieredCaching = tieredCaching;
            return this;
        }

        /**
         * @param tieredCaching Whether tiered caching is enabled. Available values: `on`, `off`.
         * 
         * @return builder
         * 
         */
        public Builder tieredCaching(String tieredCaching) {
            return tieredCaching(Output.of(tieredCaching));
        }

        /**
         * @param zoneId The zone identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The zone identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public ArgoArgs build() {
            $.zoneId = Objects.requireNonNull($.zoneId, "expected parameter 'zoneId' to be non-null");
            return $;
        }
    }

}
