// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.GetWafPackagesFilterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetWafPackagesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWafPackagesArgs Empty = new GetWafPackagesArgs();

    @Import(name="filter")
    private @Nullable Output<GetWafPackagesFilterArgs> filter;

    public Optional<Output<GetWafPackagesFilterArgs>> filter() {
        return Optional.ofNullable(this.filter);
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

    private GetWafPackagesArgs() {}

    private GetWafPackagesArgs(GetWafPackagesArgs $) {
        this.filter = $.filter;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWafPackagesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWafPackagesArgs $;

        public Builder() {
            $ = new GetWafPackagesArgs();
        }

        public Builder(GetWafPackagesArgs defaults) {
            $ = new GetWafPackagesArgs(Objects.requireNonNull(defaults));
        }

        public Builder filter(@Nullable Output<GetWafPackagesFilterArgs> filter) {
            $.filter = filter;
            return this;
        }

        public Builder filter(GetWafPackagesFilterArgs filter) {
            return filter(Output.of(filter));
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

        public GetWafPackagesArgs build() {
            $.zoneId = Objects.requireNonNull($.zoneId, "expected parameter 'zoneId' to be non-null");
            return $;
        }
    }

}
