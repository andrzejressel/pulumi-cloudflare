// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CustomPagesState extends com.pulumi.resources.ResourceArgs {

    public static final CustomPagesState Empty = new CustomPagesState();

    /**
     * The account ID where the custom pages should be
     * updated. Either `account_id` or `zone_id` must be provided. If
     * `account_id` is present, it will override the zone setting.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return The account ID where the custom pages should be
     * updated. Either `account_id` or `zone_id` must be provided. If
     * `account_id` is present, it will override the zone setting.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    @Import(name="state")
    private @Nullable Output<String> state;

    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * The type of custom page you wish to update. Must
     * be one of `basic_challenge`, `waf_challenge`, `waf_block`,
     * `ratelimit_block`, `country_challenge`, `ip_block`, `under_attack`,
     * `500_errors`, `1000_errors`, `always_online`, `managed_challenge`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of custom page you wish to update. Must
     * be one of `basic_challenge`, `waf_challenge`, `waf_block`,
     * `ratelimit_block`, `country_challenge`, `ip_block`, `under_attack`,
     * `500_errors`, `1000_errors`, `always_online`, `managed_challenge`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * URL of where the custom page source is located.
     * 
     */
    @Import(name="url")
    private @Nullable Output<String> url;

    /**
     * @return URL of where the custom page source is located.
     * 
     */
    public Optional<Output<String>> url() {
        return Optional.ofNullable(this.url);
    }

    /**
     * The zone ID where the custom pages should be
     * updated. Either `zone_id` or `account_id` must be provided.
     * 
     */
    @Import(name="zoneId")
    private @Nullable Output<String> zoneId;

    /**
     * @return The zone ID where the custom pages should be
     * updated. Either `zone_id` or `account_id` must be provided.
     * 
     */
    public Optional<Output<String>> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    private CustomPagesState() {}

    private CustomPagesState(CustomPagesState $) {
        this.accountId = $.accountId;
        this.state = $.state;
        this.type = $.type;
        this.url = $.url;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomPagesState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomPagesState $;

        public Builder() {
            $ = new CustomPagesState();
        }

        public Builder(CustomPagesState defaults) {
            $ = new CustomPagesState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account ID where the custom pages should be
         * updated. Either `account_id` or `zone_id` must be provided. If
         * `account_id` is present, it will override the zone setting.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The account ID where the custom pages should be
         * updated. Either `account_id` or `zone_id` must be provided. If
         * `account_id` is present, it will override the zone setting.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param type The type of custom page you wish to update. Must
         * be one of `basic_challenge`, `waf_challenge`, `waf_block`,
         * `ratelimit_block`, `country_challenge`, `ip_block`, `under_attack`,
         * `500_errors`, `1000_errors`, `always_online`, `managed_challenge`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of custom page you wish to update. Must
         * be one of `basic_challenge`, `waf_challenge`, `waf_block`,
         * `ratelimit_block`, `country_challenge`, `ip_block`, `under_attack`,
         * `500_errors`, `1000_errors`, `always_online`, `managed_challenge`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param url URL of where the custom page source is located.
         * 
         * @return builder
         * 
         */
        public Builder url(@Nullable Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url URL of where the custom page source is located.
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        /**
         * @param zoneId The zone ID where the custom pages should be
         * updated. Either `zone_id` or `account_id` must be provided.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(@Nullable Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The zone ID where the custom pages should be
         * updated. Either `zone_id` or `account_id` must be provided.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public CustomPagesState build() {
            return $;
        }
    }

}
