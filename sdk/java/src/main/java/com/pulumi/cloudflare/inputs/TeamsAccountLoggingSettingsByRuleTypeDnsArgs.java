// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class TeamsAccountLoggingSettingsByRuleTypeDnsArgs extends com.pulumi.resources.ResourceArgs {

    public static final TeamsAccountLoggingSettingsByRuleTypeDnsArgs Empty = new TeamsAccountLoggingSettingsByRuleTypeDnsArgs();

    @Import(name="logAll", required=true)
    private Output<Boolean> logAll;

    public Output<Boolean> logAll() {
        return this.logAll;
    }

    @Import(name="logBlocks", required=true)
    private Output<Boolean> logBlocks;

    public Output<Boolean> logBlocks() {
        return this.logBlocks;
    }

    private TeamsAccountLoggingSettingsByRuleTypeDnsArgs() {}

    private TeamsAccountLoggingSettingsByRuleTypeDnsArgs(TeamsAccountLoggingSettingsByRuleTypeDnsArgs $) {
        this.logAll = $.logAll;
        this.logBlocks = $.logBlocks;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TeamsAccountLoggingSettingsByRuleTypeDnsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TeamsAccountLoggingSettingsByRuleTypeDnsArgs $;

        public Builder() {
            $ = new TeamsAccountLoggingSettingsByRuleTypeDnsArgs();
        }

        public Builder(TeamsAccountLoggingSettingsByRuleTypeDnsArgs defaults) {
            $ = new TeamsAccountLoggingSettingsByRuleTypeDnsArgs(Objects.requireNonNull(defaults));
        }

        public Builder logAll(Output<Boolean> logAll) {
            $.logAll = logAll;
            return this;
        }

        public Builder logAll(Boolean logAll) {
            return logAll(Output.of(logAll));
        }

        public Builder logBlocks(Output<Boolean> logBlocks) {
            $.logBlocks = logBlocks;
            return this;
        }

        public Builder logBlocks(Boolean logBlocks) {
            return logBlocks(Output.of(logBlocks));
        }

        public TeamsAccountLoggingSettingsByRuleTypeDnsArgs build() {
            $.logAll = Objects.requireNonNull($.logAll, "expected parameter 'logAll' to be non-null");
            $.logBlocks = Objects.requireNonNull($.logBlocks, "expected parameter 'logBlocks' to be non-null");
            return $;
        }
    }

}
