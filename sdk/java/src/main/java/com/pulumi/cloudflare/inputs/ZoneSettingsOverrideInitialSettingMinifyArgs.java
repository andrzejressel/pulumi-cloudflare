// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ZoneSettingsOverrideInitialSettingMinifyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ZoneSettingsOverrideInitialSettingMinifyArgs Empty = new ZoneSettingsOverrideInitialSettingMinifyArgs();

    /**
     * &#34;on&#34;/&#34;off&#34;
     * 
     */
    @Import(name="css", required=true)
    private Output<String> css;

    /**
     * @return &#34;on&#34;/&#34;off&#34;
     * 
     */
    public Output<String> css() {
        return this.css;
    }

    /**
     * &#34;on&#34;/&#34;off&#34;
     * 
     */
    @Import(name="html", required=true)
    private Output<String> html;

    /**
     * @return &#34;on&#34;/&#34;off&#34;
     * 
     */
    public Output<String> html() {
        return this.html;
    }

    /**
     * &#34;on&#34;/&#34;off&#34;
     * 
     */
    @Import(name="js", required=true)
    private Output<String> js;

    /**
     * @return &#34;on&#34;/&#34;off&#34;
     * 
     */
    public Output<String> js() {
        return this.js;
    }

    private ZoneSettingsOverrideInitialSettingMinifyArgs() {}

    private ZoneSettingsOverrideInitialSettingMinifyArgs(ZoneSettingsOverrideInitialSettingMinifyArgs $) {
        this.css = $.css;
        this.html = $.html;
        this.js = $.js;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZoneSettingsOverrideInitialSettingMinifyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZoneSettingsOverrideInitialSettingMinifyArgs $;

        public Builder() {
            $ = new ZoneSettingsOverrideInitialSettingMinifyArgs();
        }

        public Builder(ZoneSettingsOverrideInitialSettingMinifyArgs defaults) {
            $ = new ZoneSettingsOverrideInitialSettingMinifyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param css &#34;on&#34;/&#34;off&#34;
         * 
         * @return builder
         * 
         */
        public Builder css(Output<String> css) {
            $.css = css;
            return this;
        }

        /**
         * @param css &#34;on&#34;/&#34;off&#34;
         * 
         * @return builder
         * 
         */
        public Builder css(String css) {
            return css(Output.of(css));
        }

        /**
         * @param html &#34;on&#34;/&#34;off&#34;
         * 
         * @return builder
         * 
         */
        public Builder html(Output<String> html) {
            $.html = html;
            return this;
        }

        /**
         * @param html &#34;on&#34;/&#34;off&#34;
         * 
         * @return builder
         * 
         */
        public Builder html(String html) {
            return html(Output.of(html));
        }

        /**
         * @param js &#34;on&#34;/&#34;off&#34;
         * 
         * @return builder
         * 
         */
        public Builder js(Output<String> js) {
            $.js = js;
            return this;
        }

        /**
         * @param js &#34;on&#34;/&#34;off&#34;
         * 
         * @return builder
         * 
         */
        public Builder js(String js) {
            return js(Output.of(js));
        }

        public ZoneSettingsOverrideInitialSettingMinifyArgs build() {
            $.css = Objects.requireNonNull($.css, "expected parameter 'css' to be non-null");
            $.html = Objects.requireNonNull($.html, "expected parameter 'html' to be non-null");
            $.js = Objects.requireNonNull($.js, "expected parameter 'js' to be non-null");
            return $;
        }
    }

}
