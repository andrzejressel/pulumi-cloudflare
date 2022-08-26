// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.PageRuleActionsCacheKeyFields;
import com.pulumi.cloudflare.outputs.PageRuleActionsCacheTtlByStatus;
import com.pulumi.cloudflare.outputs.PageRuleActionsForwardingUrl;
import com.pulumi.cloudflare.outputs.PageRuleActionsMinify;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PageRuleActions {
    /**
     * @return Boolean of whether this action is enabled. Default: false.
     * 
     */
    private @Nullable Boolean alwaysUseHttps;
    /**
     * @return Whether this action is `&#34;on&#34;` or `&#34;off&#34;`.
     * 
     */
    private @Nullable String automaticHttpsRewrites;
    /**
     * @return The Time To Live for the browser cache. `0` means &#39;Respect Existing Headers&#39;
     * 
     */
    private @Nullable String browserCacheTtl;
    /**
     * @return Whether this action is `&#34;on&#34;` or `&#34;off&#34;`.
     * 
     */
    private @Nullable String browserCheck;
    /**
     * @return String value of cookie name to conditionally bypass cache the page.
     * 
     */
    private @Nullable String bypassCacheOnCookie;
    /**
     * @return Whether this action is `&#34;on&#34;` or `&#34;off&#34;`.
     * 
     */
    private @Nullable String cacheByDeviceType;
    /**
     * @return Whether this action is `&#34;on&#34;` or `&#34;off&#34;`.
     * 
     */
    private @Nullable String cacheDeceptionArmor;
    /**
     * @return Controls how Cloudflare creates Cache Keys used to identify files in cache. See below for full description.
     * 
     */
    private @Nullable PageRuleActionsCacheKeyFields cacheKeyFields;
    /**
     * @return Whether to set the cache level to `&#34;bypass&#34;`, `&#34;basic&#34;`, `&#34;simplified&#34;`, `&#34;aggressive&#34;`, or `&#34;cache_everything&#34;`.
     * 
     */
    private @Nullable String cacheLevel;
    /**
     * @return String value of cookie name to conditionally cache the page.
     * 
     */
    private @Nullable String cacheOnCookie;
    /**
     * @return Set cache TTL based on the response status from the origin web server. Can be specified multiple times. See below for full description.
     * 
     */
    private @Nullable List<PageRuleActionsCacheTtlByStatus> cacheTtlByStatuses;
    /**
     * @return Boolean of whether this action is enabled. Default: false.
     * 
     */
    private @Nullable Boolean disableApps;
    /**
     * @return Boolean of whether this action is enabled. Default: false.
     * 
     */
    private @Nullable Boolean disablePerformance;
    /**
     * @return Boolean of whether this action is enabled. Default: false.
     * 
     */
    private @Nullable Boolean disableRailgun;
    /**
     * @return Boolean of whether this action is enabled. Default: false.
     * 
     */
    private @Nullable Boolean disableSecurity;
    /**
     * @return Boolean of whether this action is enabled. Default: false.
     * 
     */
    private @Nullable Boolean disableZaraz;
    /**
     * @return The Time To Live for the edge cache.
     * 
     */
    private @Nullable Integer edgeCacheTtl;
    /**
     * @return Whether this action is `&#34;on&#34;` or `&#34;off&#34;`.
     * 
     */
    private @Nullable String emailObfuscation;
    /**
     * @return Whether origin Cache-Control action is `&#34;on&#34;` or `&#34;off&#34;`.
     * 
     */
    private @Nullable String explicitCacheControl;
    /**
     * @return The URL to forward to, and with what status. See below.
     * 
     */
    private @Nullable PageRuleActionsForwardingUrl forwardingUrl;
    /**
     * @return Value of the Host header to send.
     * 
     */
    private @Nullable String hostHeaderOverride;
    /**
     * @return Whether this action is `&#34;on&#34;` or `&#34;off&#34;`.
     * 
     */
    private @Nullable String ipGeolocation;
    /**
     * @return The configuration for HTML, CSS and JS minification. See below for full list of options.
     * 
     */
    private @Nullable List<PageRuleActionsMinify> minifies;
    /**
     * @return Whether this action is `&#34;on&#34;` or `&#34;off&#34;`.
     * 
     */
    private @Nullable String mirage;
    /**
     * @return Whether this action is `&#34;on&#34;` or `&#34;off&#34;`.
     * 
     */
    private @Nullable String opportunisticEncryption;
    /**
     * @return Whether this action is `&#34;on&#34;` or `&#34;off&#34;`.
     * 
     */
    private @Nullable String originErrorPagePassThru;
    /**
     * @return Whether this action is `&#34;off&#34;`, `&#34;lossless&#34;` or `&#34;lossy&#34;`.
     * 
     */
    private @Nullable String polish;
    /**
     * @return Overridden origin server name.
     * 
     */
    private @Nullable String resolveOverride;
    /**
     * @return Whether this action is `&#34;on&#34;` or `&#34;off&#34;`.
     * 
     */
    private @Nullable String respectStrongEtag;
    /**
     * @return Whether this action is `&#34;on&#34;` or `&#34;off&#34;`.
     * 
     */
    private @Nullable String responseBuffering;
    /**
     * @return Whether to set the rocket loader to `&#34;on&#34;`, `&#34;off&#34;`.
     * 
     */
    private @Nullable String rocketLoader;
    /**
     * @return Whether to set the security level to `&#34;off&#34;`, `&#34;essentially_off&#34;`, `&#34;low&#34;`, `&#34;medium&#34;`, `&#34;high&#34;`, or `&#34;under_attack&#34;`.
     * 
     */
    private @Nullable String securityLevel;
    /**
     * @return Whether this action is `&#34;on&#34;` or `&#34;off&#34;`.
     * 
     */
    private @Nullable String serverSideExclude;
    /**
     * @return Whether this action is `&#34;on&#34;` or `&#34;off&#34;`.
     * 
     */
    private @Nullable String sortQueryStringForCache;
    /**
     * @return Whether to set the SSL mode to `&#34;off&#34;`, `&#34;flexible&#34;`, `&#34;full&#34;`, `&#34;strict&#34;`, or `&#34;origin_pull&#34;`.
     * 
     */
    private @Nullable String ssl;
    /**
     * @return Whether this action is `&#34;on&#34;` or `&#34;off&#34;`.
     * 
     */
    private @Nullable String trueClientIpHeader;
    /**
     * @return Whether this action is `&#34;on&#34;` or `&#34;off&#34;`.
     * 
     */
    private @Nullable String waf;

    private PageRuleActions() {}
    /**
     * @return Boolean of whether this action is enabled. Default: false.
     * 
     */
    public Optional<Boolean> alwaysUseHttps() {
        return Optional.ofNullable(this.alwaysUseHttps);
    }
    /**
     * @return Whether this action is `&#34;on&#34;` or `&#34;off&#34;`.
     * 
     */
    public Optional<String> automaticHttpsRewrites() {
        return Optional.ofNullable(this.automaticHttpsRewrites);
    }
    /**
     * @return The Time To Live for the browser cache. `0` means &#39;Respect Existing Headers&#39;
     * 
     */
    public Optional<String> browserCacheTtl() {
        return Optional.ofNullable(this.browserCacheTtl);
    }
    /**
     * @return Whether this action is `&#34;on&#34;` or `&#34;off&#34;`.
     * 
     */
    public Optional<String> browserCheck() {
        return Optional.ofNullable(this.browserCheck);
    }
    /**
     * @return String value of cookie name to conditionally bypass cache the page.
     * 
     */
    public Optional<String> bypassCacheOnCookie() {
        return Optional.ofNullable(this.bypassCacheOnCookie);
    }
    /**
     * @return Whether this action is `&#34;on&#34;` or `&#34;off&#34;`.
     * 
     */
    public Optional<String> cacheByDeviceType() {
        return Optional.ofNullable(this.cacheByDeviceType);
    }
    /**
     * @return Whether this action is `&#34;on&#34;` or `&#34;off&#34;`.
     * 
     */
    public Optional<String> cacheDeceptionArmor() {
        return Optional.ofNullable(this.cacheDeceptionArmor);
    }
    /**
     * @return Controls how Cloudflare creates Cache Keys used to identify files in cache. See below for full description.
     * 
     */
    public Optional<PageRuleActionsCacheKeyFields> cacheKeyFields() {
        return Optional.ofNullable(this.cacheKeyFields);
    }
    /**
     * @return Whether to set the cache level to `&#34;bypass&#34;`, `&#34;basic&#34;`, `&#34;simplified&#34;`, `&#34;aggressive&#34;`, or `&#34;cache_everything&#34;`.
     * 
     */
    public Optional<String> cacheLevel() {
        return Optional.ofNullable(this.cacheLevel);
    }
    /**
     * @return String value of cookie name to conditionally cache the page.
     * 
     */
    public Optional<String> cacheOnCookie() {
        return Optional.ofNullable(this.cacheOnCookie);
    }
    /**
     * @return Set cache TTL based on the response status from the origin web server. Can be specified multiple times. See below for full description.
     * 
     */
    public List<PageRuleActionsCacheTtlByStatus> cacheTtlByStatuses() {
        return this.cacheTtlByStatuses == null ? List.of() : this.cacheTtlByStatuses;
    }
    /**
     * @return Boolean of whether this action is enabled. Default: false.
     * 
     */
    public Optional<Boolean> disableApps() {
        return Optional.ofNullable(this.disableApps);
    }
    /**
     * @return Boolean of whether this action is enabled. Default: false.
     * 
     */
    public Optional<Boolean> disablePerformance() {
        return Optional.ofNullable(this.disablePerformance);
    }
    /**
     * @return Boolean of whether this action is enabled. Default: false.
     * 
     */
    public Optional<Boolean> disableRailgun() {
        return Optional.ofNullable(this.disableRailgun);
    }
    /**
     * @return Boolean of whether this action is enabled. Default: false.
     * 
     */
    public Optional<Boolean> disableSecurity() {
        return Optional.ofNullable(this.disableSecurity);
    }
    /**
     * @return Boolean of whether this action is enabled. Default: false.
     * 
     */
    public Optional<Boolean> disableZaraz() {
        return Optional.ofNullable(this.disableZaraz);
    }
    /**
     * @return The Time To Live for the edge cache.
     * 
     */
    public Optional<Integer> edgeCacheTtl() {
        return Optional.ofNullable(this.edgeCacheTtl);
    }
    /**
     * @return Whether this action is `&#34;on&#34;` or `&#34;off&#34;`.
     * 
     */
    public Optional<String> emailObfuscation() {
        return Optional.ofNullable(this.emailObfuscation);
    }
    /**
     * @return Whether origin Cache-Control action is `&#34;on&#34;` or `&#34;off&#34;`.
     * 
     */
    public Optional<String> explicitCacheControl() {
        return Optional.ofNullable(this.explicitCacheControl);
    }
    /**
     * @return The URL to forward to, and with what status. See below.
     * 
     */
    public Optional<PageRuleActionsForwardingUrl> forwardingUrl() {
        return Optional.ofNullable(this.forwardingUrl);
    }
    /**
     * @return Value of the Host header to send.
     * 
     */
    public Optional<String> hostHeaderOverride() {
        return Optional.ofNullable(this.hostHeaderOverride);
    }
    /**
     * @return Whether this action is `&#34;on&#34;` or `&#34;off&#34;`.
     * 
     */
    public Optional<String> ipGeolocation() {
        return Optional.ofNullable(this.ipGeolocation);
    }
    /**
     * @return The configuration for HTML, CSS and JS minification. See below for full list of options.
     * 
     */
    public List<PageRuleActionsMinify> minifies() {
        return this.minifies == null ? List.of() : this.minifies;
    }
    /**
     * @return Whether this action is `&#34;on&#34;` or `&#34;off&#34;`.
     * 
     */
    public Optional<String> mirage() {
        return Optional.ofNullable(this.mirage);
    }
    /**
     * @return Whether this action is `&#34;on&#34;` or `&#34;off&#34;`.
     * 
     */
    public Optional<String> opportunisticEncryption() {
        return Optional.ofNullable(this.opportunisticEncryption);
    }
    /**
     * @return Whether this action is `&#34;on&#34;` or `&#34;off&#34;`.
     * 
     */
    public Optional<String> originErrorPagePassThru() {
        return Optional.ofNullable(this.originErrorPagePassThru);
    }
    /**
     * @return Whether this action is `&#34;off&#34;`, `&#34;lossless&#34;` or `&#34;lossy&#34;`.
     * 
     */
    public Optional<String> polish() {
        return Optional.ofNullable(this.polish);
    }
    /**
     * @return Overridden origin server name.
     * 
     */
    public Optional<String> resolveOverride() {
        return Optional.ofNullable(this.resolveOverride);
    }
    /**
     * @return Whether this action is `&#34;on&#34;` or `&#34;off&#34;`.
     * 
     */
    public Optional<String> respectStrongEtag() {
        return Optional.ofNullable(this.respectStrongEtag);
    }
    /**
     * @return Whether this action is `&#34;on&#34;` or `&#34;off&#34;`.
     * 
     */
    public Optional<String> responseBuffering() {
        return Optional.ofNullable(this.responseBuffering);
    }
    /**
     * @return Whether to set the rocket loader to `&#34;on&#34;`, `&#34;off&#34;`.
     * 
     */
    public Optional<String> rocketLoader() {
        return Optional.ofNullable(this.rocketLoader);
    }
    /**
     * @return Whether to set the security level to `&#34;off&#34;`, `&#34;essentially_off&#34;`, `&#34;low&#34;`, `&#34;medium&#34;`, `&#34;high&#34;`, or `&#34;under_attack&#34;`.
     * 
     */
    public Optional<String> securityLevel() {
        return Optional.ofNullable(this.securityLevel);
    }
    /**
     * @return Whether this action is `&#34;on&#34;` or `&#34;off&#34;`.
     * 
     */
    public Optional<String> serverSideExclude() {
        return Optional.ofNullable(this.serverSideExclude);
    }
    /**
     * @return Whether this action is `&#34;on&#34;` or `&#34;off&#34;`.
     * 
     */
    public Optional<String> sortQueryStringForCache() {
        return Optional.ofNullable(this.sortQueryStringForCache);
    }
    /**
     * @return Whether to set the SSL mode to `&#34;off&#34;`, `&#34;flexible&#34;`, `&#34;full&#34;`, `&#34;strict&#34;`, or `&#34;origin_pull&#34;`.
     * 
     */
    public Optional<String> ssl() {
        return Optional.ofNullable(this.ssl);
    }
    /**
     * @return Whether this action is `&#34;on&#34;` or `&#34;off&#34;`.
     * 
     */
    public Optional<String> trueClientIpHeader() {
        return Optional.ofNullable(this.trueClientIpHeader);
    }
    /**
     * @return Whether this action is `&#34;on&#34;` or `&#34;off&#34;`.
     * 
     */
    public Optional<String> waf() {
        return Optional.ofNullable(this.waf);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PageRuleActions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean alwaysUseHttps;
        private @Nullable String automaticHttpsRewrites;
        private @Nullable String browserCacheTtl;
        private @Nullable String browserCheck;
        private @Nullable String bypassCacheOnCookie;
        private @Nullable String cacheByDeviceType;
        private @Nullable String cacheDeceptionArmor;
        private @Nullable PageRuleActionsCacheKeyFields cacheKeyFields;
        private @Nullable String cacheLevel;
        private @Nullable String cacheOnCookie;
        private @Nullable List<PageRuleActionsCacheTtlByStatus> cacheTtlByStatuses;
        private @Nullable Boolean disableApps;
        private @Nullable Boolean disablePerformance;
        private @Nullable Boolean disableRailgun;
        private @Nullable Boolean disableSecurity;
        private @Nullable Boolean disableZaraz;
        private @Nullable Integer edgeCacheTtl;
        private @Nullable String emailObfuscation;
        private @Nullable String explicitCacheControl;
        private @Nullable PageRuleActionsForwardingUrl forwardingUrl;
        private @Nullable String hostHeaderOverride;
        private @Nullable String ipGeolocation;
        private @Nullable List<PageRuleActionsMinify> minifies;
        private @Nullable String mirage;
        private @Nullable String opportunisticEncryption;
        private @Nullable String originErrorPagePassThru;
        private @Nullable String polish;
        private @Nullable String resolveOverride;
        private @Nullable String respectStrongEtag;
        private @Nullable String responseBuffering;
        private @Nullable String rocketLoader;
        private @Nullable String securityLevel;
        private @Nullable String serverSideExclude;
        private @Nullable String sortQueryStringForCache;
        private @Nullable String ssl;
        private @Nullable String trueClientIpHeader;
        private @Nullable String waf;
        public Builder() {}
        public Builder(PageRuleActions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alwaysUseHttps = defaults.alwaysUseHttps;
    	      this.automaticHttpsRewrites = defaults.automaticHttpsRewrites;
    	      this.browserCacheTtl = defaults.browserCacheTtl;
    	      this.browserCheck = defaults.browserCheck;
    	      this.bypassCacheOnCookie = defaults.bypassCacheOnCookie;
    	      this.cacheByDeviceType = defaults.cacheByDeviceType;
    	      this.cacheDeceptionArmor = defaults.cacheDeceptionArmor;
    	      this.cacheKeyFields = defaults.cacheKeyFields;
    	      this.cacheLevel = defaults.cacheLevel;
    	      this.cacheOnCookie = defaults.cacheOnCookie;
    	      this.cacheTtlByStatuses = defaults.cacheTtlByStatuses;
    	      this.disableApps = defaults.disableApps;
    	      this.disablePerformance = defaults.disablePerformance;
    	      this.disableRailgun = defaults.disableRailgun;
    	      this.disableSecurity = defaults.disableSecurity;
    	      this.disableZaraz = defaults.disableZaraz;
    	      this.edgeCacheTtl = defaults.edgeCacheTtl;
    	      this.emailObfuscation = defaults.emailObfuscation;
    	      this.explicitCacheControl = defaults.explicitCacheControl;
    	      this.forwardingUrl = defaults.forwardingUrl;
    	      this.hostHeaderOverride = defaults.hostHeaderOverride;
    	      this.ipGeolocation = defaults.ipGeolocation;
    	      this.minifies = defaults.minifies;
    	      this.mirage = defaults.mirage;
    	      this.opportunisticEncryption = defaults.opportunisticEncryption;
    	      this.originErrorPagePassThru = defaults.originErrorPagePassThru;
    	      this.polish = defaults.polish;
    	      this.resolveOverride = defaults.resolveOverride;
    	      this.respectStrongEtag = defaults.respectStrongEtag;
    	      this.responseBuffering = defaults.responseBuffering;
    	      this.rocketLoader = defaults.rocketLoader;
    	      this.securityLevel = defaults.securityLevel;
    	      this.serverSideExclude = defaults.serverSideExclude;
    	      this.sortQueryStringForCache = defaults.sortQueryStringForCache;
    	      this.ssl = defaults.ssl;
    	      this.trueClientIpHeader = defaults.trueClientIpHeader;
    	      this.waf = defaults.waf;
        }

        @CustomType.Setter
        public Builder alwaysUseHttps(@Nullable Boolean alwaysUseHttps) {
            this.alwaysUseHttps = alwaysUseHttps;
            return this;
        }
        @CustomType.Setter
        public Builder automaticHttpsRewrites(@Nullable String automaticHttpsRewrites) {
            this.automaticHttpsRewrites = automaticHttpsRewrites;
            return this;
        }
        @CustomType.Setter
        public Builder browserCacheTtl(@Nullable String browserCacheTtl) {
            this.browserCacheTtl = browserCacheTtl;
            return this;
        }
        @CustomType.Setter
        public Builder browserCheck(@Nullable String browserCheck) {
            this.browserCheck = browserCheck;
            return this;
        }
        @CustomType.Setter
        public Builder bypassCacheOnCookie(@Nullable String bypassCacheOnCookie) {
            this.bypassCacheOnCookie = bypassCacheOnCookie;
            return this;
        }
        @CustomType.Setter
        public Builder cacheByDeviceType(@Nullable String cacheByDeviceType) {
            this.cacheByDeviceType = cacheByDeviceType;
            return this;
        }
        @CustomType.Setter
        public Builder cacheDeceptionArmor(@Nullable String cacheDeceptionArmor) {
            this.cacheDeceptionArmor = cacheDeceptionArmor;
            return this;
        }
        @CustomType.Setter
        public Builder cacheKeyFields(@Nullable PageRuleActionsCacheKeyFields cacheKeyFields) {
            this.cacheKeyFields = cacheKeyFields;
            return this;
        }
        @CustomType.Setter
        public Builder cacheLevel(@Nullable String cacheLevel) {
            this.cacheLevel = cacheLevel;
            return this;
        }
        @CustomType.Setter
        public Builder cacheOnCookie(@Nullable String cacheOnCookie) {
            this.cacheOnCookie = cacheOnCookie;
            return this;
        }
        @CustomType.Setter
        public Builder cacheTtlByStatuses(@Nullable List<PageRuleActionsCacheTtlByStatus> cacheTtlByStatuses) {
            this.cacheTtlByStatuses = cacheTtlByStatuses;
            return this;
        }
        public Builder cacheTtlByStatuses(PageRuleActionsCacheTtlByStatus... cacheTtlByStatuses) {
            return cacheTtlByStatuses(List.of(cacheTtlByStatuses));
        }
        @CustomType.Setter
        public Builder disableApps(@Nullable Boolean disableApps) {
            this.disableApps = disableApps;
            return this;
        }
        @CustomType.Setter
        public Builder disablePerformance(@Nullable Boolean disablePerformance) {
            this.disablePerformance = disablePerformance;
            return this;
        }
        @CustomType.Setter
        public Builder disableRailgun(@Nullable Boolean disableRailgun) {
            this.disableRailgun = disableRailgun;
            return this;
        }
        @CustomType.Setter
        public Builder disableSecurity(@Nullable Boolean disableSecurity) {
            this.disableSecurity = disableSecurity;
            return this;
        }
        @CustomType.Setter
        public Builder disableZaraz(@Nullable Boolean disableZaraz) {
            this.disableZaraz = disableZaraz;
            return this;
        }
        @CustomType.Setter
        public Builder edgeCacheTtl(@Nullable Integer edgeCacheTtl) {
            this.edgeCacheTtl = edgeCacheTtl;
            return this;
        }
        @CustomType.Setter
        public Builder emailObfuscation(@Nullable String emailObfuscation) {
            this.emailObfuscation = emailObfuscation;
            return this;
        }
        @CustomType.Setter
        public Builder explicitCacheControl(@Nullable String explicitCacheControl) {
            this.explicitCacheControl = explicitCacheControl;
            return this;
        }
        @CustomType.Setter
        public Builder forwardingUrl(@Nullable PageRuleActionsForwardingUrl forwardingUrl) {
            this.forwardingUrl = forwardingUrl;
            return this;
        }
        @CustomType.Setter
        public Builder hostHeaderOverride(@Nullable String hostHeaderOverride) {
            this.hostHeaderOverride = hostHeaderOverride;
            return this;
        }
        @CustomType.Setter
        public Builder ipGeolocation(@Nullable String ipGeolocation) {
            this.ipGeolocation = ipGeolocation;
            return this;
        }
        @CustomType.Setter
        public Builder minifies(@Nullable List<PageRuleActionsMinify> minifies) {
            this.minifies = minifies;
            return this;
        }
        public Builder minifies(PageRuleActionsMinify... minifies) {
            return minifies(List.of(minifies));
        }
        @CustomType.Setter
        public Builder mirage(@Nullable String mirage) {
            this.mirage = mirage;
            return this;
        }
        @CustomType.Setter
        public Builder opportunisticEncryption(@Nullable String opportunisticEncryption) {
            this.opportunisticEncryption = opportunisticEncryption;
            return this;
        }
        @CustomType.Setter
        public Builder originErrorPagePassThru(@Nullable String originErrorPagePassThru) {
            this.originErrorPagePassThru = originErrorPagePassThru;
            return this;
        }
        @CustomType.Setter
        public Builder polish(@Nullable String polish) {
            this.polish = polish;
            return this;
        }
        @CustomType.Setter
        public Builder resolveOverride(@Nullable String resolveOverride) {
            this.resolveOverride = resolveOverride;
            return this;
        }
        @CustomType.Setter
        public Builder respectStrongEtag(@Nullable String respectStrongEtag) {
            this.respectStrongEtag = respectStrongEtag;
            return this;
        }
        @CustomType.Setter
        public Builder responseBuffering(@Nullable String responseBuffering) {
            this.responseBuffering = responseBuffering;
            return this;
        }
        @CustomType.Setter
        public Builder rocketLoader(@Nullable String rocketLoader) {
            this.rocketLoader = rocketLoader;
            return this;
        }
        @CustomType.Setter
        public Builder securityLevel(@Nullable String securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }
        @CustomType.Setter
        public Builder serverSideExclude(@Nullable String serverSideExclude) {
            this.serverSideExclude = serverSideExclude;
            return this;
        }
        @CustomType.Setter
        public Builder sortQueryStringForCache(@Nullable String sortQueryStringForCache) {
            this.sortQueryStringForCache = sortQueryStringForCache;
            return this;
        }
        @CustomType.Setter
        public Builder ssl(@Nullable String ssl) {
            this.ssl = ssl;
            return this;
        }
        @CustomType.Setter
        public Builder trueClientIpHeader(@Nullable String trueClientIpHeader) {
            this.trueClientIpHeader = trueClientIpHeader;
            return this;
        }
        @CustomType.Setter
        public Builder waf(@Nullable String waf) {
            this.waf = waf;
            return this;
        }
        public PageRuleActions build() {
            final var o = new PageRuleActions();
            o.alwaysUseHttps = alwaysUseHttps;
            o.automaticHttpsRewrites = automaticHttpsRewrites;
            o.browserCacheTtl = browserCacheTtl;
            o.browserCheck = browserCheck;
            o.bypassCacheOnCookie = bypassCacheOnCookie;
            o.cacheByDeviceType = cacheByDeviceType;
            o.cacheDeceptionArmor = cacheDeceptionArmor;
            o.cacheKeyFields = cacheKeyFields;
            o.cacheLevel = cacheLevel;
            o.cacheOnCookie = cacheOnCookie;
            o.cacheTtlByStatuses = cacheTtlByStatuses;
            o.disableApps = disableApps;
            o.disablePerformance = disablePerformance;
            o.disableRailgun = disableRailgun;
            o.disableSecurity = disableSecurity;
            o.disableZaraz = disableZaraz;
            o.edgeCacheTtl = edgeCacheTtl;
            o.emailObfuscation = emailObfuscation;
            o.explicitCacheControl = explicitCacheControl;
            o.forwardingUrl = forwardingUrl;
            o.hostHeaderOverride = hostHeaderOverride;
            o.ipGeolocation = ipGeolocation;
            o.minifies = minifies;
            o.mirage = mirage;
            o.opportunisticEncryption = opportunisticEncryption;
            o.originErrorPagePassThru = originErrorPagePassThru;
            o.polish = polish;
            o.resolveOverride = resolveOverride;
            o.respectStrongEtag = respectStrongEtag;
            o.responseBuffering = responseBuffering;
            o.rocketLoader = rocketLoader;
            o.securityLevel = securityLevel;
            o.serverSideExclude = serverSideExclude;
            o.sortQueryStringForCache = sortQueryStringForCache;
            o.ssl = ssl;
            o.trueClientIpHeader = trueClientIpHeader;
            o.waf = waf;
            return o;
        }
    }
}
