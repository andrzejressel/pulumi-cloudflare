// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ZoneSettingsOverrideSettingsMinify {
    /**
     * @return &#34;on&#34;/&#34;off&#34;
     * 
     */
    private String css;
    /**
     * @return &#34;on&#34;/&#34;off&#34;
     * 
     */
    private String html;
    /**
     * @return &#34;on&#34;/&#34;off&#34;
     * 
     */
    private String js;

    private ZoneSettingsOverrideSettingsMinify() {}
    /**
     * @return &#34;on&#34;/&#34;off&#34;
     * 
     */
    public String css() {
        return this.css;
    }
    /**
     * @return &#34;on&#34;/&#34;off&#34;
     * 
     */
    public String html() {
        return this.html;
    }
    /**
     * @return &#34;on&#34;/&#34;off&#34;
     * 
     */
    public String js() {
        return this.js;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ZoneSettingsOverrideSettingsMinify defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String css;
        private String html;
        private String js;
        public Builder() {}
        public Builder(ZoneSettingsOverrideSettingsMinify defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.css = defaults.css;
    	      this.html = defaults.html;
    	      this.js = defaults.js;
        }

        @CustomType.Setter
        public Builder css(String css) {
            this.css = Objects.requireNonNull(css);
            return this;
        }
        @CustomType.Setter
        public Builder html(String html) {
            this.html = Objects.requireNonNull(html);
            return this;
        }
        @CustomType.Setter
        public Builder js(String js) {
            this.js = Objects.requireNonNull(js);
            return this;
        }
        public ZoneSettingsOverrideSettingsMinify build() {
            final var o = new ZoneSettingsOverrideSettingsMinify();
            o.css = css;
            o.html = html;
            o.js = js;
            return o;
        }
    }
}
