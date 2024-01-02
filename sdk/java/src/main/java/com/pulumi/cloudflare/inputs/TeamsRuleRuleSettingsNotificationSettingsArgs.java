// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TeamsRuleRuleSettingsNotificationSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final TeamsRuleRuleSettingsNotificationSettingsArgs Empty = new TeamsRuleRuleSettingsNotificationSettingsArgs();

    /**
     * Enable notification settings.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Enable notification settings.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Notification content.
     * 
     */
    @Import(name="message")
    private @Nullable Output<String> message;

    /**
     * @return Notification content.
     * 
     */
    public Optional<Output<String>> message() {
        return Optional.ofNullable(this.message);
    }

    /**
     * Support URL to show in the notification.
     * 
     */
    @Import(name="supportUrl")
    private @Nullable Output<Boolean> supportUrl;

    /**
     * @return Support URL to show in the notification.
     * 
     */
    public Optional<Output<Boolean>> supportUrl() {
        return Optional.ofNullable(this.supportUrl);
    }

    private TeamsRuleRuleSettingsNotificationSettingsArgs() {}

    private TeamsRuleRuleSettingsNotificationSettingsArgs(TeamsRuleRuleSettingsNotificationSettingsArgs $) {
        this.enabled = $.enabled;
        this.message = $.message;
        this.supportUrl = $.supportUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TeamsRuleRuleSettingsNotificationSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TeamsRuleRuleSettingsNotificationSettingsArgs $;

        public Builder() {
            $ = new TeamsRuleRuleSettingsNotificationSettingsArgs();
        }

        public Builder(TeamsRuleRuleSettingsNotificationSettingsArgs defaults) {
            $ = new TeamsRuleRuleSettingsNotificationSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Enable notification settings.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Enable notification settings.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param message Notification content.
         * 
         * @return builder
         * 
         */
        public Builder message(@Nullable Output<String> message) {
            $.message = message;
            return this;
        }

        /**
         * @param message Notification content.
         * 
         * @return builder
         * 
         */
        public Builder message(String message) {
            return message(Output.of(message));
        }

        /**
         * @param supportUrl Support URL to show in the notification.
         * 
         * @return builder
         * 
         */
        public Builder supportUrl(@Nullable Output<Boolean> supportUrl) {
            $.supportUrl = supportUrl;
            return this;
        }

        /**
         * @param supportUrl Support URL to show in the notification.
         * 
         * @return builder
         * 
         */
        public Builder supportUrl(Boolean supportUrl) {
            return supportUrl(Output.of(supportUrl));
        }

        public TeamsRuleRuleSettingsNotificationSettingsArgs build() {
            return $;
        }
    }

}