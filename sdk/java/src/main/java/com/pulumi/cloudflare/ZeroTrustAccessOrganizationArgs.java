// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.inputs.ZeroTrustAccessOrganizationCustomPageArgs;
import com.pulumi.cloudflare.inputs.ZeroTrustAccessOrganizationLoginDesignArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ZeroTrustAccessOrganizationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ZeroTrustAccessOrganizationArgs Empty = new ZeroTrustAccessOrganizationArgs();

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
     * When set to true, users can authenticate via WARP for any application in your organization. Application settings will take precedence over this value.
     * 
     */
    @Import(name="allowAuthenticateViaWarp")
    private @Nullable Output<Boolean> allowAuthenticateViaWarp;

    /**
     * @return When set to true, users can authenticate via WARP for any application in your organization. Application settings will take precedence over this value.
     * 
     */
    public Optional<Output<Boolean>> allowAuthenticateViaWarp() {
        return Optional.ofNullable(this.allowAuthenticateViaWarp);
    }

    /**
     * The unique subdomain assigned to your Zero Trust organization.
     * 
     */
    @Import(name="authDomain", required=true)
    private Output<String> authDomain;

    /**
     * @return The unique subdomain assigned to your Zero Trust organization.
     * 
     */
    public Output<String> authDomain() {
        return this.authDomain;
    }

    /**
     * When set to true, users skip the identity provider selection step during login.
     * 
     */
    @Import(name="autoRedirectToIdentity")
    private @Nullable Output<Boolean> autoRedirectToIdentity;

    /**
     * @return When set to true, users skip the identity provider selection step during login.
     * 
     */
    public Optional<Output<Boolean>> autoRedirectToIdentity() {
        return Optional.ofNullable(this.autoRedirectToIdentity);
    }

    /**
     * Custom pages for your Zero Trust organization.
     * 
     */
    @Import(name="customPages")
    private @Nullable Output<List<ZeroTrustAccessOrganizationCustomPageArgs>> customPages;

    /**
     * @return Custom pages for your Zero Trust organization.
     * 
     */
    public Optional<Output<List<ZeroTrustAccessOrganizationCustomPageArgs>>> customPages() {
        return Optional.ofNullable(this.customPages);
    }

    /**
     * When set to true, this will disable all editing of Access resources via the Zero Trust Dashboard.
     * 
     */
    @Import(name="isUiReadOnly")
    private @Nullable Output<Boolean> isUiReadOnly;

    /**
     * @return When set to true, this will disable all editing of Access resources via the Zero Trust Dashboard.
     * 
     */
    public Optional<Output<Boolean>> isUiReadOnly() {
        return Optional.ofNullable(this.isUiReadOnly);
    }

    @Import(name="loginDesigns")
    private @Nullable Output<List<ZeroTrustAccessOrganizationLoginDesignArgs>> loginDesigns;

    public Optional<Output<List<ZeroTrustAccessOrganizationLoginDesignArgs>>> loginDesigns() {
        return Optional.ofNullable(this.loginDesigns);
    }

    /**
     * The name of your Zero Trust organization.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of your Zero Trust organization.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * How often a user will be forced to re-authorise. Must be in the format `48h` or `2h45m`.
     * 
     */
    @Import(name="sessionDuration")
    private @Nullable Output<String> sessionDuration;

    /**
     * @return How often a user will be forced to re-authorise. Must be in the format `48h` or `2h45m`.
     * 
     */
    public Optional<Output<String>> sessionDuration() {
        return Optional.ofNullable(this.sessionDuration);
    }

    /**
     * A description of the reason why the UI read only field is being toggled.
     * 
     */
    @Import(name="uiReadOnlyToggleReason")
    private @Nullable Output<String> uiReadOnlyToggleReason;

    /**
     * @return A description of the reason why the UI read only field is being toggled.
     * 
     */
    public Optional<Output<String>> uiReadOnlyToggleReason() {
        return Optional.ofNullable(this.uiReadOnlyToggleReason);
    }

    /**
     * The amount of time a user seat is inactive before it expires. When the user seat exceeds the set time of inactivity, the user is removed as an active seat and no longer counts against your Teams seat count. Must be in the format `300ms` or `2h45m`.
     * 
     */
    @Import(name="userSeatExpirationInactiveTime")
    private @Nullable Output<String> userSeatExpirationInactiveTime;

    /**
     * @return The amount of time a user seat is inactive before it expires. When the user seat exceeds the set time of inactivity, the user is removed as an active seat and no longer counts against your Teams seat count. Must be in the format `300ms` or `2h45m`.
     * 
     */
    public Optional<Output<String>> userSeatExpirationInactiveTime() {
        return Optional.ofNullable(this.userSeatExpirationInactiveTime);
    }

    /**
     * The amount of time that tokens issued for applications will be valid. Must be in the format 30m or 2h45m. Valid time units are: m, h.
     * 
     */
    @Import(name="warpAuthSessionDuration")
    private @Nullable Output<String> warpAuthSessionDuration;

    /**
     * @return The amount of time that tokens issued for applications will be valid. Must be in the format 30m or 2h45m. Valid time units are: m, h.
     * 
     */
    public Optional<Output<String>> warpAuthSessionDuration() {
        return Optional.ofNullable(this.warpAuthSessionDuration);
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

    private ZeroTrustAccessOrganizationArgs() {}

    private ZeroTrustAccessOrganizationArgs(ZeroTrustAccessOrganizationArgs $) {
        this.accountId = $.accountId;
        this.allowAuthenticateViaWarp = $.allowAuthenticateViaWarp;
        this.authDomain = $.authDomain;
        this.autoRedirectToIdentity = $.autoRedirectToIdentity;
        this.customPages = $.customPages;
        this.isUiReadOnly = $.isUiReadOnly;
        this.loginDesigns = $.loginDesigns;
        this.name = $.name;
        this.sessionDuration = $.sessionDuration;
        this.uiReadOnlyToggleReason = $.uiReadOnlyToggleReason;
        this.userSeatExpirationInactiveTime = $.userSeatExpirationInactiveTime;
        this.warpAuthSessionDuration = $.warpAuthSessionDuration;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZeroTrustAccessOrganizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZeroTrustAccessOrganizationArgs $;

        public Builder() {
            $ = new ZeroTrustAccessOrganizationArgs();
        }

        public Builder(ZeroTrustAccessOrganizationArgs defaults) {
            $ = new ZeroTrustAccessOrganizationArgs(Objects.requireNonNull(defaults));
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
         * @param allowAuthenticateViaWarp When set to true, users can authenticate via WARP for any application in your organization. Application settings will take precedence over this value.
         * 
         * @return builder
         * 
         */
        public Builder allowAuthenticateViaWarp(@Nullable Output<Boolean> allowAuthenticateViaWarp) {
            $.allowAuthenticateViaWarp = allowAuthenticateViaWarp;
            return this;
        }

        /**
         * @param allowAuthenticateViaWarp When set to true, users can authenticate via WARP for any application in your organization. Application settings will take precedence over this value.
         * 
         * @return builder
         * 
         */
        public Builder allowAuthenticateViaWarp(Boolean allowAuthenticateViaWarp) {
            return allowAuthenticateViaWarp(Output.of(allowAuthenticateViaWarp));
        }

        /**
         * @param authDomain The unique subdomain assigned to your Zero Trust organization.
         * 
         * @return builder
         * 
         */
        public Builder authDomain(Output<String> authDomain) {
            $.authDomain = authDomain;
            return this;
        }

        /**
         * @param authDomain The unique subdomain assigned to your Zero Trust organization.
         * 
         * @return builder
         * 
         */
        public Builder authDomain(String authDomain) {
            return authDomain(Output.of(authDomain));
        }

        /**
         * @param autoRedirectToIdentity When set to true, users skip the identity provider selection step during login.
         * 
         * @return builder
         * 
         */
        public Builder autoRedirectToIdentity(@Nullable Output<Boolean> autoRedirectToIdentity) {
            $.autoRedirectToIdentity = autoRedirectToIdentity;
            return this;
        }

        /**
         * @param autoRedirectToIdentity When set to true, users skip the identity provider selection step during login.
         * 
         * @return builder
         * 
         */
        public Builder autoRedirectToIdentity(Boolean autoRedirectToIdentity) {
            return autoRedirectToIdentity(Output.of(autoRedirectToIdentity));
        }

        /**
         * @param customPages Custom pages for your Zero Trust organization.
         * 
         * @return builder
         * 
         */
        public Builder customPages(@Nullable Output<List<ZeroTrustAccessOrganizationCustomPageArgs>> customPages) {
            $.customPages = customPages;
            return this;
        }

        /**
         * @param customPages Custom pages for your Zero Trust organization.
         * 
         * @return builder
         * 
         */
        public Builder customPages(List<ZeroTrustAccessOrganizationCustomPageArgs> customPages) {
            return customPages(Output.of(customPages));
        }

        /**
         * @param customPages Custom pages for your Zero Trust organization.
         * 
         * @return builder
         * 
         */
        public Builder customPages(ZeroTrustAccessOrganizationCustomPageArgs... customPages) {
            return customPages(List.of(customPages));
        }

        /**
         * @param isUiReadOnly When set to true, this will disable all editing of Access resources via the Zero Trust Dashboard.
         * 
         * @return builder
         * 
         */
        public Builder isUiReadOnly(@Nullable Output<Boolean> isUiReadOnly) {
            $.isUiReadOnly = isUiReadOnly;
            return this;
        }

        /**
         * @param isUiReadOnly When set to true, this will disable all editing of Access resources via the Zero Trust Dashboard.
         * 
         * @return builder
         * 
         */
        public Builder isUiReadOnly(Boolean isUiReadOnly) {
            return isUiReadOnly(Output.of(isUiReadOnly));
        }

        public Builder loginDesigns(@Nullable Output<List<ZeroTrustAccessOrganizationLoginDesignArgs>> loginDesigns) {
            $.loginDesigns = loginDesigns;
            return this;
        }

        public Builder loginDesigns(List<ZeroTrustAccessOrganizationLoginDesignArgs> loginDesigns) {
            return loginDesigns(Output.of(loginDesigns));
        }

        public Builder loginDesigns(ZeroTrustAccessOrganizationLoginDesignArgs... loginDesigns) {
            return loginDesigns(List.of(loginDesigns));
        }

        /**
         * @param name The name of your Zero Trust organization.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of your Zero Trust organization.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param sessionDuration How often a user will be forced to re-authorise. Must be in the format `48h` or `2h45m`.
         * 
         * @return builder
         * 
         */
        public Builder sessionDuration(@Nullable Output<String> sessionDuration) {
            $.sessionDuration = sessionDuration;
            return this;
        }

        /**
         * @param sessionDuration How often a user will be forced to re-authorise. Must be in the format `48h` or `2h45m`.
         * 
         * @return builder
         * 
         */
        public Builder sessionDuration(String sessionDuration) {
            return sessionDuration(Output.of(sessionDuration));
        }

        /**
         * @param uiReadOnlyToggleReason A description of the reason why the UI read only field is being toggled.
         * 
         * @return builder
         * 
         */
        public Builder uiReadOnlyToggleReason(@Nullable Output<String> uiReadOnlyToggleReason) {
            $.uiReadOnlyToggleReason = uiReadOnlyToggleReason;
            return this;
        }

        /**
         * @param uiReadOnlyToggleReason A description of the reason why the UI read only field is being toggled.
         * 
         * @return builder
         * 
         */
        public Builder uiReadOnlyToggleReason(String uiReadOnlyToggleReason) {
            return uiReadOnlyToggleReason(Output.of(uiReadOnlyToggleReason));
        }

        /**
         * @param userSeatExpirationInactiveTime The amount of time a user seat is inactive before it expires. When the user seat exceeds the set time of inactivity, the user is removed as an active seat and no longer counts against your Teams seat count. Must be in the format `300ms` or `2h45m`.
         * 
         * @return builder
         * 
         */
        public Builder userSeatExpirationInactiveTime(@Nullable Output<String> userSeatExpirationInactiveTime) {
            $.userSeatExpirationInactiveTime = userSeatExpirationInactiveTime;
            return this;
        }

        /**
         * @param userSeatExpirationInactiveTime The amount of time a user seat is inactive before it expires. When the user seat exceeds the set time of inactivity, the user is removed as an active seat and no longer counts against your Teams seat count. Must be in the format `300ms` or `2h45m`.
         * 
         * @return builder
         * 
         */
        public Builder userSeatExpirationInactiveTime(String userSeatExpirationInactiveTime) {
            return userSeatExpirationInactiveTime(Output.of(userSeatExpirationInactiveTime));
        }

        /**
         * @param warpAuthSessionDuration The amount of time that tokens issued for applications will be valid. Must be in the format 30m or 2h45m. Valid time units are: m, h.
         * 
         * @return builder
         * 
         */
        public Builder warpAuthSessionDuration(@Nullable Output<String> warpAuthSessionDuration) {
            $.warpAuthSessionDuration = warpAuthSessionDuration;
            return this;
        }

        /**
         * @param warpAuthSessionDuration The amount of time that tokens issued for applications will be valid. Must be in the format 30m or 2h45m. Valid time units are: m, h.
         * 
         * @return builder
         * 
         */
        public Builder warpAuthSessionDuration(String warpAuthSessionDuration) {
            return warpAuthSessionDuration(Output.of(warpAuthSessionDuration));
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

        public ZeroTrustAccessOrganizationArgs build() {
            if ($.authDomain == null) {
                throw new MissingRequiredPropertyException("ZeroTrustAccessOrganizationArgs", "authDomain");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("ZeroTrustAccessOrganizationArgs", "name");
            }
            return $;
        }
    }

}
