// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class LogpullRetentionArgs extends com.pulumi.resources.ResourceArgs {

    public static final LogpullRetentionArgs Empty = new LogpullRetentionArgs();

    /**
     * Whether you wish to retain logs or not.
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return Whether you wish to retain logs or not.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * The zone ID to apply the log retention to.
     * 
     */
    @Import(name="zoneId", required=true)
    private Output<String> zoneId;

    /**
     * @return The zone ID to apply the log retention to.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    private LogpullRetentionArgs() {}

    private LogpullRetentionArgs(LogpullRetentionArgs $) {
        this.enabled = $.enabled;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogpullRetentionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogpullRetentionArgs $;

        public Builder() {
            $ = new LogpullRetentionArgs();
        }

        public Builder(LogpullRetentionArgs defaults) {
            $ = new LogpullRetentionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Whether you wish to retain logs or not.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether you wish to retain logs or not.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param zoneId The zone ID to apply the log retention to.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The zone ID to apply the log retention to.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public LogpullRetentionArgs build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            $.zoneId = Objects.requireNonNull($.zoneId, "expected parameter 'zoneId' to be non-null");
            return $;
        }
    }

}
