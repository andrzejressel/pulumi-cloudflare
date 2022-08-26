// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccessBookmarkArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessBookmarkArgs Empty = new AccessBookmarkArgs();

    /**
     * The account identifier to target for the resource. Conflicts with `zone_id`.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return The account identifier to target for the resource. Conflicts with `zone_id`.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * Option to show/hide the bookmark in the app launcher. Defaults to `true`.
     * 
     */
    @Import(name="appLauncherVisible")
    private @Nullable Output<Boolean> appLauncherVisible;

    /**
     * @return Option to show/hide the bookmark in the app launcher. Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> appLauncherVisible() {
        return Optional.ofNullable(this.appLauncherVisible);
    }

    /**
     * The domain of the bookmark application. Can include subdomains, paths, or both.
     * 
     */
    @Import(name="domain", required=true)
    private Output<String> domain;

    /**
     * @return The domain of the bookmark application. Can include subdomains, paths, or both.
     * 
     */
    public Output<String> domain() {
        return this.domain;
    }

    /**
     * The image URL for the logo shown in the app launcher dashboard.
     * 
     */
    @Import(name="logoUrl")
    private @Nullable Output<String> logoUrl;

    /**
     * @return The image URL for the logo shown in the app launcher dashboard.
     * 
     */
    public Optional<Output<String>> logoUrl() {
        return Optional.ofNullable(this.logoUrl);
    }

    /**
     * Name of the bookmark application.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the bookmark application.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The zone identifier to target for the resource. Conflicts with `account_id`.
     * 
     */
    @Import(name="zoneId")
    private @Nullable Output<String> zoneId;

    /**
     * @return The zone identifier to target for the resource. Conflicts with `account_id`.
     * 
     */
    public Optional<Output<String>> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    private AccessBookmarkArgs() {}

    private AccessBookmarkArgs(AccessBookmarkArgs $) {
        this.accountId = $.accountId;
        this.appLauncherVisible = $.appLauncherVisible;
        this.domain = $.domain;
        this.logoUrl = $.logoUrl;
        this.name = $.name;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessBookmarkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessBookmarkArgs $;

        public Builder() {
            $ = new AccessBookmarkArgs();
        }

        public Builder(AccessBookmarkArgs defaults) {
            $ = new AccessBookmarkArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account identifier to target for the resource. Conflicts with `zone_id`.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The account identifier to target for the resource. Conflicts with `zone_id`.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param appLauncherVisible Option to show/hide the bookmark in the app launcher. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder appLauncherVisible(@Nullable Output<Boolean> appLauncherVisible) {
            $.appLauncherVisible = appLauncherVisible;
            return this;
        }

        /**
         * @param appLauncherVisible Option to show/hide the bookmark in the app launcher. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder appLauncherVisible(Boolean appLauncherVisible) {
            return appLauncherVisible(Output.of(appLauncherVisible));
        }

        /**
         * @param domain The domain of the bookmark application. Can include subdomains, paths, or both.
         * 
         * @return builder
         * 
         */
        public Builder domain(Output<String> domain) {
            $.domain = domain;
            return this;
        }

        /**
         * @param domain The domain of the bookmark application. Can include subdomains, paths, or both.
         * 
         * @return builder
         * 
         */
        public Builder domain(String domain) {
            return domain(Output.of(domain));
        }

        /**
         * @param logoUrl The image URL for the logo shown in the app launcher dashboard.
         * 
         * @return builder
         * 
         */
        public Builder logoUrl(@Nullable Output<String> logoUrl) {
            $.logoUrl = logoUrl;
            return this;
        }

        /**
         * @param logoUrl The image URL for the logo shown in the app launcher dashboard.
         * 
         * @return builder
         * 
         */
        public Builder logoUrl(String logoUrl) {
            return logoUrl(Output.of(logoUrl));
        }

        /**
         * @param name Name of the bookmark application.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the bookmark application.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param zoneId The zone identifier to target for the resource. Conflicts with `account_id`.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(@Nullable Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The zone identifier to target for the resource. Conflicts with `account_id`.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public AccessBookmarkArgs build() {
            $.domain = Objects.requireNonNull($.domain, "expected parameter 'domain' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
