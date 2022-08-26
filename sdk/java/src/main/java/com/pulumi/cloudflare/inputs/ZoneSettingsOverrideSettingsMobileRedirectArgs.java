// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class ZoneSettingsOverrideSettingsMobileRedirectArgs extends com.pulumi.resources.ResourceArgs {

    public static final ZoneSettingsOverrideSettingsMobileRedirectArgs Empty = new ZoneSettingsOverrideSettingsMobileRedirectArgs();

    /**
     * String value
     * 
     */
    @Import(name="mobileSubdomain", required=true)
    private Output<String> mobileSubdomain;

    /**
     * @return String value
     * 
     */
    public Output<String> mobileSubdomain() {
        return this.mobileSubdomain;
    }

    /**
     * &#34;on&#34;/&#34;off&#34;
     * 
     */
    @Import(name="status", required=true)
    private Output<String> status;

    /**
     * @return &#34;on&#34;/&#34;off&#34;
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     * true/false
     * 
     */
    @Import(name="stripUri", required=true)
    private Output<Boolean> stripUri;

    /**
     * @return true/false
     * 
     */
    public Output<Boolean> stripUri() {
        return this.stripUri;
    }

    private ZoneSettingsOverrideSettingsMobileRedirectArgs() {}

    private ZoneSettingsOverrideSettingsMobileRedirectArgs(ZoneSettingsOverrideSettingsMobileRedirectArgs $) {
        this.mobileSubdomain = $.mobileSubdomain;
        this.status = $.status;
        this.stripUri = $.stripUri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZoneSettingsOverrideSettingsMobileRedirectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZoneSettingsOverrideSettingsMobileRedirectArgs $;

        public Builder() {
            $ = new ZoneSettingsOverrideSettingsMobileRedirectArgs();
        }

        public Builder(ZoneSettingsOverrideSettingsMobileRedirectArgs defaults) {
            $ = new ZoneSettingsOverrideSettingsMobileRedirectArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param mobileSubdomain String value
         * 
         * @return builder
         * 
         */
        public Builder mobileSubdomain(Output<String> mobileSubdomain) {
            $.mobileSubdomain = mobileSubdomain;
            return this;
        }

        /**
         * @param mobileSubdomain String value
         * 
         * @return builder
         * 
         */
        public Builder mobileSubdomain(String mobileSubdomain) {
            return mobileSubdomain(Output.of(mobileSubdomain));
        }

        /**
         * @param status &#34;on&#34;/&#34;off&#34;
         * 
         * @return builder
         * 
         */
        public Builder status(Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status &#34;on&#34;/&#34;off&#34;
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param stripUri true/false
         * 
         * @return builder
         * 
         */
        public Builder stripUri(Output<Boolean> stripUri) {
            $.stripUri = stripUri;
            return this;
        }

        /**
         * @param stripUri true/false
         * 
         * @return builder
         * 
         */
        public Builder stripUri(Boolean stripUri) {
            return stripUri(Output.of(stripUri));
        }

        public ZoneSettingsOverrideSettingsMobileRedirectArgs build() {
            $.mobileSubdomain = Objects.requireNonNull($.mobileSubdomain, "expected parameter 'mobileSubdomain' to be non-null");
            $.status = Objects.requireNonNull($.status, "expected parameter 'status' to be non-null");
            $.stripUri = Objects.requireNonNull($.stripUri, "expected parameter 'stripUri' to be non-null");
            return $;
        }
    }

}
