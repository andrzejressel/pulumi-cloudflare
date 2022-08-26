// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.TeamsAccountLoggingSettingsByRuleTypeArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class TeamsAccountLoggingArgs extends com.pulumi.resources.ResourceArgs {

    public static final TeamsAccountLoggingArgs Empty = new TeamsAccountLoggingArgs();

    /**
     * Redact personally identifiable information from activity logging (PII fields are: source IP,
     * user email, user ID, device ID, URL, referrer, user agent).
     * 
     */
    @Import(name="redactPii", required=true)
    private Output<Boolean> redactPii;

    /**
     * @return Redact personally identifiable information from activity logging (PII fields are: source IP,
     * user email, user ID, device ID, URL, referrer, user agent).
     * 
     */
    public Output<Boolean> redactPii() {
        return this.redactPii;
    }

    /**
     * Represents whether all requests are logged or only the blocked requests are
     * logged in DNS, HTTP and L4 filters.
     * 
     */
    @Import(name="settingsByRuleType", required=true)
    private Output<TeamsAccountLoggingSettingsByRuleTypeArgs> settingsByRuleType;

    /**
     * @return Represents whether all requests are logged or only the blocked requests are
     * logged in DNS, HTTP and L4 filters.
     * 
     */
    public Output<TeamsAccountLoggingSettingsByRuleTypeArgs> settingsByRuleType() {
        return this.settingsByRuleType;
    }

    private TeamsAccountLoggingArgs() {}

    private TeamsAccountLoggingArgs(TeamsAccountLoggingArgs $) {
        this.redactPii = $.redactPii;
        this.settingsByRuleType = $.settingsByRuleType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TeamsAccountLoggingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TeamsAccountLoggingArgs $;

        public Builder() {
            $ = new TeamsAccountLoggingArgs();
        }

        public Builder(TeamsAccountLoggingArgs defaults) {
            $ = new TeamsAccountLoggingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param redactPii Redact personally identifiable information from activity logging (PII fields are: source IP,
         * user email, user ID, device ID, URL, referrer, user agent).
         * 
         * @return builder
         * 
         */
        public Builder redactPii(Output<Boolean> redactPii) {
            $.redactPii = redactPii;
            return this;
        }

        /**
         * @param redactPii Redact personally identifiable information from activity logging (PII fields are: source IP,
         * user email, user ID, device ID, URL, referrer, user agent).
         * 
         * @return builder
         * 
         */
        public Builder redactPii(Boolean redactPii) {
            return redactPii(Output.of(redactPii));
        }

        /**
         * @param settingsByRuleType Represents whether all requests are logged or only the blocked requests are
         * logged in DNS, HTTP and L4 filters.
         * 
         * @return builder
         * 
         */
        public Builder settingsByRuleType(Output<TeamsAccountLoggingSettingsByRuleTypeArgs> settingsByRuleType) {
            $.settingsByRuleType = settingsByRuleType;
            return this;
        }

        /**
         * @param settingsByRuleType Represents whether all requests are logged or only the blocked requests are
         * logged in DNS, HTTP and L4 filters.
         * 
         * @return builder
         * 
         */
        public Builder settingsByRuleType(TeamsAccountLoggingSettingsByRuleTypeArgs settingsByRuleType) {
            return settingsByRuleType(Output.of(settingsByRuleType));
        }

        public TeamsAccountLoggingArgs build() {
            $.redactPii = Objects.requireNonNull($.redactPii, "expected parameter 'redactPii' to be non-null");
            $.settingsByRuleType = Objects.requireNonNull($.settingsByRuleType, "expected parameter 'settingsByRuleType' to be non-null");
            return $;
        }
    }

}
