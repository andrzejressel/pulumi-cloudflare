// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.ZoneSettingsOverrideSettingsMinify;
import com.pulumi.cloudflare.outputs.ZoneSettingsOverrideSettingsMobileRedirect;
import com.pulumi.cloudflare.outputs.ZoneSettingsOverrideSettingsSecurityHeader;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ZoneSettingsOverrideSettings {
    private @Nullable String alwaysOnline;
    private @Nullable String alwaysUseHttps;
    private @Nullable String automaticHttpsRewrites;
    private @Nullable String binaryAst;
    private @Nullable String brotli;
    private @Nullable Integer browserCacheTtl;
    private @Nullable String browserCheck;
    /**
     * @return Allowed values: &#34;aggressive&#34; (default) - delivers a different resource each time the query string changes, &#34;basic&#34; - delivers resources from cache when there is no query string, &#34;simplified&#34; - delivers the same resource to everyone independent of the query string.
     * 
     */
    private @Nullable String cacheLevel;
    private @Nullable Integer challengeTtl;
    /**
     * @return An allowlist of ciphers for TLS termination. These ciphers must be in the BoringSSL format.
     * 
     */
    private @Nullable List<String> ciphers;
    /**
     * @return Allowed values: &#34;flatten_at_root&#34; (default), &#34;flatten_all&#34;, &#34;flatten_none&#34;.
     * 
     */
    private @Nullable String cnameFlattening;
    private @Nullable String developmentMode;
    private @Nullable String earlyHints;
    private @Nullable String emailObfuscation;
    private @Nullable String filterLogsToCloudflare;
    /**
     * @return Allowed values: &#34;on&#34;, &#34;off&#34; (default), &#34;custom&#34;.
     * 
     */
    private @Nullable String h2Prioritization;
    private @Nullable String hotlinkProtection;
    private @Nullable String http2;
    private @Nullable String http3;
    /**
     * @return Allowed values: &#34;on&#34;, &#34;off&#34; (default), &#34;open&#34;.
     * 
     */
    private @Nullable String imageResizing;
    private @Nullable String ipGeolocation;
    private @Nullable String ipv6;
    private @Nullable String logToCloudflare;
    private @Nullable Integer maxUpload;
    /**
     * @return Allowed values: &#34;1.0&#34; (default), &#34;1.1&#34;, &#34;1.2&#34;, &#34;1.3&#34;.
     * 
     */
    private @Nullable String minTlsVersion;
    private @Nullable ZoneSettingsOverrideSettingsMinify minify;
    private @Nullable String mirage;
    private @Nullable ZoneSettingsOverrideSettingsMobileRedirect mobileRedirect;
    private @Nullable String opportunisticEncryption;
    private @Nullable String opportunisticOnion;
    private @Nullable String orangeToOrange;
    private @Nullable String originErrorPagePassThru;
    /**
     * @return Allowed values: &#34;1&#34; (default on Enterprise), &#34;2&#34; (default)
     * 
     */
    private @Nullable String originMaxHttpVersion;
    /**
     * @return Allowed values: &#34;off&#34; (default), &#34;lossless&#34;, &#34;lossy&#34;.
     * 
     */
    private @Nullable String polish;
    private @Nullable String prefetchPreload;
    private @Nullable String privacyPass;
    private @Nullable String proxyReadTimeout;
    /**
     * @return Allowed values: &#34;off&#34; (default), &#34;add_header&#34;, &#34;overwrite_header&#34;.
     * 
     */
    private @Nullable String pseudoIpv4;
    private @Nullable String responseBuffering;
    private @Nullable String rocketLoader;
    private @Nullable ZoneSettingsOverrideSettingsSecurityHeader securityHeader;
    /**
     * @return Allowed values: &#34;off&#34; (Enterprise only), &#34;essentially_off&#34;, &#34;low&#34;, &#34;medium&#34; (default), &#34;high&#34;, &#34;under_attack&#34;.
     * 
     */
    private @Nullable String securityLevel;
    private @Nullable String serverSideExclude;
    private @Nullable String sortQueryStringForCache;
    /**
     * @return Allowed values: &#34;off&#34; (default), &#34;flexible&#34;, &#34;full&#34;, &#34;strict&#34;, &#34;origin_pull&#34;.
     * 
     */
    private @Nullable String ssl;
    /**
     * @deprecated
     * tls_1_2_only has been deprecated in favour of using `min_tls_version = &#34;1.2&#34;` instead.
     * 
     */
    @Deprecated /* tls_1_2_only has been deprecated in favour of using `min_tls_version = ""1.2""` instead. */
    private @Nullable String tls12Only;
    /**
     * @return Allowed values: &#34;off&#34; (default), &#34;on&#34;, &#34;zrt&#34;.
     * 
     */
    private @Nullable String tls13;
    private @Nullable String tlsClientAuth;
    private @Nullable String trueClientIpHeader;
    private @Nullable String universalSsl;
    private @Nullable String visitorIp;
    private @Nullable String waf;
    /**
     * @return . Note that the value specified will be ignored unless `polish` is turned on (i.e. is &#34;lossless&#34; or &#34;lossy&#34;)
     * 
     */
    private @Nullable String webp;
    private @Nullable String websockets;
    private @Nullable String zeroRtt;

    private ZoneSettingsOverrideSettings() {}
    public Optional<String> alwaysOnline() {
        return Optional.ofNullable(this.alwaysOnline);
    }
    public Optional<String> alwaysUseHttps() {
        return Optional.ofNullable(this.alwaysUseHttps);
    }
    public Optional<String> automaticHttpsRewrites() {
        return Optional.ofNullable(this.automaticHttpsRewrites);
    }
    public Optional<String> binaryAst() {
        return Optional.ofNullable(this.binaryAst);
    }
    public Optional<String> brotli() {
        return Optional.ofNullable(this.brotli);
    }
    public Optional<Integer> browserCacheTtl() {
        return Optional.ofNullable(this.browserCacheTtl);
    }
    public Optional<String> browserCheck() {
        return Optional.ofNullable(this.browserCheck);
    }
    /**
     * @return Allowed values: &#34;aggressive&#34; (default) - delivers a different resource each time the query string changes, &#34;basic&#34; - delivers resources from cache when there is no query string, &#34;simplified&#34; - delivers the same resource to everyone independent of the query string.
     * 
     */
    public Optional<String> cacheLevel() {
        return Optional.ofNullable(this.cacheLevel);
    }
    public Optional<Integer> challengeTtl() {
        return Optional.ofNullable(this.challengeTtl);
    }
    /**
     * @return An allowlist of ciphers for TLS termination. These ciphers must be in the BoringSSL format.
     * 
     */
    public List<String> ciphers() {
        return this.ciphers == null ? List.of() : this.ciphers;
    }
    /**
     * @return Allowed values: &#34;flatten_at_root&#34; (default), &#34;flatten_all&#34;, &#34;flatten_none&#34;.
     * 
     */
    public Optional<String> cnameFlattening() {
        return Optional.ofNullable(this.cnameFlattening);
    }
    public Optional<String> developmentMode() {
        return Optional.ofNullable(this.developmentMode);
    }
    public Optional<String> earlyHints() {
        return Optional.ofNullable(this.earlyHints);
    }
    public Optional<String> emailObfuscation() {
        return Optional.ofNullable(this.emailObfuscation);
    }
    public Optional<String> filterLogsToCloudflare() {
        return Optional.ofNullable(this.filterLogsToCloudflare);
    }
    /**
     * @return Allowed values: &#34;on&#34;, &#34;off&#34; (default), &#34;custom&#34;.
     * 
     */
    public Optional<String> h2Prioritization() {
        return Optional.ofNullable(this.h2Prioritization);
    }
    public Optional<String> hotlinkProtection() {
        return Optional.ofNullable(this.hotlinkProtection);
    }
    public Optional<String> http2() {
        return Optional.ofNullable(this.http2);
    }
    public Optional<String> http3() {
        return Optional.ofNullable(this.http3);
    }
    /**
     * @return Allowed values: &#34;on&#34;, &#34;off&#34; (default), &#34;open&#34;.
     * 
     */
    public Optional<String> imageResizing() {
        return Optional.ofNullable(this.imageResizing);
    }
    public Optional<String> ipGeolocation() {
        return Optional.ofNullable(this.ipGeolocation);
    }
    public Optional<String> ipv6() {
        return Optional.ofNullable(this.ipv6);
    }
    public Optional<String> logToCloudflare() {
        return Optional.ofNullable(this.logToCloudflare);
    }
    public Optional<Integer> maxUpload() {
        return Optional.ofNullable(this.maxUpload);
    }
    /**
     * @return Allowed values: &#34;1.0&#34; (default), &#34;1.1&#34;, &#34;1.2&#34;, &#34;1.3&#34;.
     * 
     */
    public Optional<String> minTlsVersion() {
        return Optional.ofNullable(this.minTlsVersion);
    }
    public Optional<ZoneSettingsOverrideSettingsMinify> minify() {
        return Optional.ofNullable(this.minify);
    }
    public Optional<String> mirage() {
        return Optional.ofNullable(this.mirage);
    }
    public Optional<ZoneSettingsOverrideSettingsMobileRedirect> mobileRedirect() {
        return Optional.ofNullable(this.mobileRedirect);
    }
    public Optional<String> opportunisticEncryption() {
        return Optional.ofNullable(this.opportunisticEncryption);
    }
    public Optional<String> opportunisticOnion() {
        return Optional.ofNullable(this.opportunisticOnion);
    }
    public Optional<String> orangeToOrange() {
        return Optional.ofNullable(this.orangeToOrange);
    }
    public Optional<String> originErrorPagePassThru() {
        return Optional.ofNullable(this.originErrorPagePassThru);
    }
    /**
     * @return Allowed values: &#34;1&#34; (default on Enterprise), &#34;2&#34; (default)
     * 
     */
    public Optional<String> originMaxHttpVersion() {
        return Optional.ofNullable(this.originMaxHttpVersion);
    }
    /**
     * @return Allowed values: &#34;off&#34; (default), &#34;lossless&#34;, &#34;lossy&#34;.
     * 
     */
    public Optional<String> polish() {
        return Optional.ofNullable(this.polish);
    }
    public Optional<String> prefetchPreload() {
        return Optional.ofNullable(this.prefetchPreload);
    }
    public Optional<String> privacyPass() {
        return Optional.ofNullable(this.privacyPass);
    }
    public Optional<String> proxyReadTimeout() {
        return Optional.ofNullable(this.proxyReadTimeout);
    }
    /**
     * @return Allowed values: &#34;off&#34; (default), &#34;add_header&#34;, &#34;overwrite_header&#34;.
     * 
     */
    public Optional<String> pseudoIpv4() {
        return Optional.ofNullable(this.pseudoIpv4);
    }
    public Optional<String> responseBuffering() {
        return Optional.ofNullable(this.responseBuffering);
    }
    public Optional<String> rocketLoader() {
        return Optional.ofNullable(this.rocketLoader);
    }
    public Optional<ZoneSettingsOverrideSettingsSecurityHeader> securityHeader() {
        return Optional.ofNullable(this.securityHeader);
    }
    /**
     * @return Allowed values: &#34;off&#34; (Enterprise only), &#34;essentially_off&#34;, &#34;low&#34;, &#34;medium&#34; (default), &#34;high&#34;, &#34;under_attack&#34;.
     * 
     */
    public Optional<String> securityLevel() {
        return Optional.ofNullable(this.securityLevel);
    }
    public Optional<String> serverSideExclude() {
        return Optional.ofNullable(this.serverSideExclude);
    }
    public Optional<String> sortQueryStringForCache() {
        return Optional.ofNullable(this.sortQueryStringForCache);
    }
    /**
     * @return Allowed values: &#34;off&#34; (default), &#34;flexible&#34;, &#34;full&#34;, &#34;strict&#34;, &#34;origin_pull&#34;.
     * 
     */
    public Optional<String> ssl() {
        return Optional.ofNullable(this.ssl);
    }
    /**
     * @deprecated
     * tls_1_2_only has been deprecated in favour of using `min_tls_version = &#34;1.2&#34;` instead.
     * 
     */
    @Deprecated /* tls_1_2_only has been deprecated in favour of using `min_tls_version = ""1.2""` instead. */
    public Optional<String> tls12Only() {
        return Optional.ofNullable(this.tls12Only);
    }
    /**
     * @return Allowed values: &#34;off&#34; (default), &#34;on&#34;, &#34;zrt&#34;.
     * 
     */
    public Optional<String> tls13() {
        return Optional.ofNullable(this.tls13);
    }
    public Optional<String> tlsClientAuth() {
        return Optional.ofNullable(this.tlsClientAuth);
    }
    public Optional<String> trueClientIpHeader() {
        return Optional.ofNullable(this.trueClientIpHeader);
    }
    public Optional<String> universalSsl() {
        return Optional.ofNullable(this.universalSsl);
    }
    public Optional<String> visitorIp() {
        return Optional.ofNullable(this.visitorIp);
    }
    public Optional<String> waf() {
        return Optional.ofNullable(this.waf);
    }
    /**
     * @return . Note that the value specified will be ignored unless `polish` is turned on (i.e. is &#34;lossless&#34; or &#34;lossy&#34;)
     * 
     */
    public Optional<String> webp() {
        return Optional.ofNullable(this.webp);
    }
    public Optional<String> websockets() {
        return Optional.ofNullable(this.websockets);
    }
    public Optional<String> zeroRtt() {
        return Optional.ofNullable(this.zeroRtt);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ZoneSettingsOverrideSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String alwaysOnline;
        private @Nullable String alwaysUseHttps;
        private @Nullable String automaticHttpsRewrites;
        private @Nullable String binaryAst;
        private @Nullable String brotli;
        private @Nullable Integer browserCacheTtl;
        private @Nullable String browserCheck;
        private @Nullable String cacheLevel;
        private @Nullable Integer challengeTtl;
        private @Nullable List<String> ciphers;
        private @Nullable String cnameFlattening;
        private @Nullable String developmentMode;
        private @Nullable String earlyHints;
        private @Nullable String emailObfuscation;
        private @Nullable String filterLogsToCloudflare;
        private @Nullable String h2Prioritization;
        private @Nullable String hotlinkProtection;
        private @Nullable String http2;
        private @Nullable String http3;
        private @Nullable String imageResizing;
        private @Nullable String ipGeolocation;
        private @Nullable String ipv6;
        private @Nullable String logToCloudflare;
        private @Nullable Integer maxUpload;
        private @Nullable String minTlsVersion;
        private @Nullable ZoneSettingsOverrideSettingsMinify minify;
        private @Nullable String mirage;
        private @Nullable ZoneSettingsOverrideSettingsMobileRedirect mobileRedirect;
        private @Nullable String opportunisticEncryption;
        private @Nullable String opportunisticOnion;
        private @Nullable String orangeToOrange;
        private @Nullable String originErrorPagePassThru;
        private @Nullable String originMaxHttpVersion;
        private @Nullable String polish;
        private @Nullable String prefetchPreload;
        private @Nullable String privacyPass;
        private @Nullable String proxyReadTimeout;
        private @Nullable String pseudoIpv4;
        private @Nullable String responseBuffering;
        private @Nullable String rocketLoader;
        private @Nullable ZoneSettingsOverrideSettingsSecurityHeader securityHeader;
        private @Nullable String securityLevel;
        private @Nullable String serverSideExclude;
        private @Nullable String sortQueryStringForCache;
        private @Nullable String ssl;
        private @Nullable String tls12Only;
        private @Nullable String tls13;
        private @Nullable String tlsClientAuth;
        private @Nullable String trueClientIpHeader;
        private @Nullable String universalSsl;
        private @Nullable String visitorIp;
        private @Nullable String waf;
        private @Nullable String webp;
        private @Nullable String websockets;
        private @Nullable String zeroRtt;
        public Builder() {}
        public Builder(ZoneSettingsOverrideSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alwaysOnline = defaults.alwaysOnline;
    	      this.alwaysUseHttps = defaults.alwaysUseHttps;
    	      this.automaticHttpsRewrites = defaults.automaticHttpsRewrites;
    	      this.binaryAst = defaults.binaryAst;
    	      this.brotli = defaults.brotli;
    	      this.browserCacheTtl = defaults.browserCacheTtl;
    	      this.browserCheck = defaults.browserCheck;
    	      this.cacheLevel = defaults.cacheLevel;
    	      this.challengeTtl = defaults.challengeTtl;
    	      this.ciphers = defaults.ciphers;
    	      this.cnameFlattening = defaults.cnameFlattening;
    	      this.developmentMode = defaults.developmentMode;
    	      this.earlyHints = defaults.earlyHints;
    	      this.emailObfuscation = defaults.emailObfuscation;
    	      this.filterLogsToCloudflare = defaults.filterLogsToCloudflare;
    	      this.h2Prioritization = defaults.h2Prioritization;
    	      this.hotlinkProtection = defaults.hotlinkProtection;
    	      this.http2 = defaults.http2;
    	      this.http3 = defaults.http3;
    	      this.imageResizing = defaults.imageResizing;
    	      this.ipGeolocation = defaults.ipGeolocation;
    	      this.ipv6 = defaults.ipv6;
    	      this.logToCloudflare = defaults.logToCloudflare;
    	      this.maxUpload = defaults.maxUpload;
    	      this.minTlsVersion = defaults.minTlsVersion;
    	      this.minify = defaults.minify;
    	      this.mirage = defaults.mirage;
    	      this.mobileRedirect = defaults.mobileRedirect;
    	      this.opportunisticEncryption = defaults.opportunisticEncryption;
    	      this.opportunisticOnion = defaults.opportunisticOnion;
    	      this.orangeToOrange = defaults.orangeToOrange;
    	      this.originErrorPagePassThru = defaults.originErrorPagePassThru;
    	      this.originMaxHttpVersion = defaults.originMaxHttpVersion;
    	      this.polish = defaults.polish;
    	      this.prefetchPreload = defaults.prefetchPreload;
    	      this.privacyPass = defaults.privacyPass;
    	      this.proxyReadTimeout = defaults.proxyReadTimeout;
    	      this.pseudoIpv4 = defaults.pseudoIpv4;
    	      this.responseBuffering = defaults.responseBuffering;
    	      this.rocketLoader = defaults.rocketLoader;
    	      this.securityHeader = defaults.securityHeader;
    	      this.securityLevel = defaults.securityLevel;
    	      this.serverSideExclude = defaults.serverSideExclude;
    	      this.sortQueryStringForCache = defaults.sortQueryStringForCache;
    	      this.ssl = defaults.ssl;
    	      this.tls12Only = defaults.tls12Only;
    	      this.tls13 = defaults.tls13;
    	      this.tlsClientAuth = defaults.tlsClientAuth;
    	      this.trueClientIpHeader = defaults.trueClientIpHeader;
    	      this.universalSsl = defaults.universalSsl;
    	      this.visitorIp = defaults.visitorIp;
    	      this.waf = defaults.waf;
    	      this.webp = defaults.webp;
    	      this.websockets = defaults.websockets;
    	      this.zeroRtt = defaults.zeroRtt;
        }

        @CustomType.Setter
        public Builder alwaysOnline(@Nullable String alwaysOnline) {
            this.alwaysOnline = alwaysOnline;
            return this;
        }
        @CustomType.Setter
        public Builder alwaysUseHttps(@Nullable String alwaysUseHttps) {
            this.alwaysUseHttps = alwaysUseHttps;
            return this;
        }
        @CustomType.Setter
        public Builder automaticHttpsRewrites(@Nullable String automaticHttpsRewrites) {
            this.automaticHttpsRewrites = automaticHttpsRewrites;
            return this;
        }
        @CustomType.Setter
        public Builder binaryAst(@Nullable String binaryAst) {
            this.binaryAst = binaryAst;
            return this;
        }
        @CustomType.Setter
        public Builder brotli(@Nullable String brotli) {
            this.brotli = brotli;
            return this;
        }
        @CustomType.Setter
        public Builder browserCacheTtl(@Nullable Integer browserCacheTtl) {
            this.browserCacheTtl = browserCacheTtl;
            return this;
        }
        @CustomType.Setter
        public Builder browserCheck(@Nullable String browserCheck) {
            this.browserCheck = browserCheck;
            return this;
        }
        @CustomType.Setter
        public Builder cacheLevel(@Nullable String cacheLevel) {
            this.cacheLevel = cacheLevel;
            return this;
        }
        @CustomType.Setter
        public Builder challengeTtl(@Nullable Integer challengeTtl) {
            this.challengeTtl = challengeTtl;
            return this;
        }
        @CustomType.Setter
        public Builder ciphers(@Nullable List<String> ciphers) {
            this.ciphers = ciphers;
            return this;
        }
        public Builder ciphers(String... ciphers) {
            return ciphers(List.of(ciphers));
        }
        @CustomType.Setter
        public Builder cnameFlattening(@Nullable String cnameFlattening) {
            this.cnameFlattening = cnameFlattening;
            return this;
        }
        @CustomType.Setter
        public Builder developmentMode(@Nullable String developmentMode) {
            this.developmentMode = developmentMode;
            return this;
        }
        @CustomType.Setter
        public Builder earlyHints(@Nullable String earlyHints) {
            this.earlyHints = earlyHints;
            return this;
        }
        @CustomType.Setter
        public Builder emailObfuscation(@Nullable String emailObfuscation) {
            this.emailObfuscation = emailObfuscation;
            return this;
        }
        @CustomType.Setter
        public Builder filterLogsToCloudflare(@Nullable String filterLogsToCloudflare) {
            this.filterLogsToCloudflare = filterLogsToCloudflare;
            return this;
        }
        @CustomType.Setter
        public Builder h2Prioritization(@Nullable String h2Prioritization) {
            this.h2Prioritization = h2Prioritization;
            return this;
        }
        @CustomType.Setter
        public Builder hotlinkProtection(@Nullable String hotlinkProtection) {
            this.hotlinkProtection = hotlinkProtection;
            return this;
        }
        @CustomType.Setter
        public Builder http2(@Nullable String http2) {
            this.http2 = http2;
            return this;
        }
        @CustomType.Setter
        public Builder http3(@Nullable String http3) {
            this.http3 = http3;
            return this;
        }
        @CustomType.Setter
        public Builder imageResizing(@Nullable String imageResizing) {
            this.imageResizing = imageResizing;
            return this;
        }
        @CustomType.Setter
        public Builder ipGeolocation(@Nullable String ipGeolocation) {
            this.ipGeolocation = ipGeolocation;
            return this;
        }
        @CustomType.Setter
        public Builder ipv6(@Nullable String ipv6) {
            this.ipv6 = ipv6;
            return this;
        }
        @CustomType.Setter
        public Builder logToCloudflare(@Nullable String logToCloudflare) {
            this.logToCloudflare = logToCloudflare;
            return this;
        }
        @CustomType.Setter
        public Builder maxUpload(@Nullable Integer maxUpload) {
            this.maxUpload = maxUpload;
            return this;
        }
        @CustomType.Setter
        public Builder minTlsVersion(@Nullable String minTlsVersion) {
            this.minTlsVersion = minTlsVersion;
            return this;
        }
        @CustomType.Setter
        public Builder minify(@Nullable ZoneSettingsOverrideSettingsMinify minify) {
            this.minify = minify;
            return this;
        }
        @CustomType.Setter
        public Builder mirage(@Nullable String mirage) {
            this.mirage = mirage;
            return this;
        }
        @CustomType.Setter
        public Builder mobileRedirect(@Nullable ZoneSettingsOverrideSettingsMobileRedirect mobileRedirect) {
            this.mobileRedirect = mobileRedirect;
            return this;
        }
        @CustomType.Setter
        public Builder opportunisticEncryption(@Nullable String opportunisticEncryption) {
            this.opportunisticEncryption = opportunisticEncryption;
            return this;
        }
        @CustomType.Setter
        public Builder opportunisticOnion(@Nullable String opportunisticOnion) {
            this.opportunisticOnion = opportunisticOnion;
            return this;
        }
        @CustomType.Setter
        public Builder orangeToOrange(@Nullable String orangeToOrange) {
            this.orangeToOrange = orangeToOrange;
            return this;
        }
        @CustomType.Setter
        public Builder originErrorPagePassThru(@Nullable String originErrorPagePassThru) {
            this.originErrorPagePassThru = originErrorPagePassThru;
            return this;
        }
        @CustomType.Setter
        public Builder originMaxHttpVersion(@Nullable String originMaxHttpVersion) {
            this.originMaxHttpVersion = originMaxHttpVersion;
            return this;
        }
        @CustomType.Setter
        public Builder polish(@Nullable String polish) {
            this.polish = polish;
            return this;
        }
        @CustomType.Setter
        public Builder prefetchPreload(@Nullable String prefetchPreload) {
            this.prefetchPreload = prefetchPreload;
            return this;
        }
        @CustomType.Setter
        public Builder privacyPass(@Nullable String privacyPass) {
            this.privacyPass = privacyPass;
            return this;
        }
        @CustomType.Setter
        public Builder proxyReadTimeout(@Nullable String proxyReadTimeout) {
            this.proxyReadTimeout = proxyReadTimeout;
            return this;
        }
        @CustomType.Setter
        public Builder pseudoIpv4(@Nullable String pseudoIpv4) {
            this.pseudoIpv4 = pseudoIpv4;
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
        public Builder securityHeader(@Nullable ZoneSettingsOverrideSettingsSecurityHeader securityHeader) {
            this.securityHeader = securityHeader;
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
        public Builder tls12Only(@Nullable String tls12Only) {
            this.tls12Only = tls12Only;
            return this;
        }
        @CustomType.Setter
        public Builder tls13(@Nullable String tls13) {
            this.tls13 = tls13;
            return this;
        }
        @CustomType.Setter
        public Builder tlsClientAuth(@Nullable String tlsClientAuth) {
            this.tlsClientAuth = tlsClientAuth;
            return this;
        }
        @CustomType.Setter
        public Builder trueClientIpHeader(@Nullable String trueClientIpHeader) {
            this.trueClientIpHeader = trueClientIpHeader;
            return this;
        }
        @CustomType.Setter
        public Builder universalSsl(@Nullable String universalSsl) {
            this.universalSsl = universalSsl;
            return this;
        }
        @CustomType.Setter
        public Builder visitorIp(@Nullable String visitorIp) {
            this.visitorIp = visitorIp;
            return this;
        }
        @CustomType.Setter
        public Builder waf(@Nullable String waf) {
            this.waf = waf;
            return this;
        }
        @CustomType.Setter
        public Builder webp(@Nullable String webp) {
            this.webp = webp;
            return this;
        }
        @CustomType.Setter
        public Builder websockets(@Nullable String websockets) {
            this.websockets = websockets;
            return this;
        }
        @CustomType.Setter
        public Builder zeroRtt(@Nullable String zeroRtt) {
            this.zeroRtt = zeroRtt;
            return this;
        }
        public ZoneSettingsOverrideSettings build() {
            final var o = new ZoneSettingsOverrideSettings();
            o.alwaysOnline = alwaysOnline;
            o.alwaysUseHttps = alwaysUseHttps;
            o.automaticHttpsRewrites = automaticHttpsRewrites;
            o.binaryAst = binaryAst;
            o.brotli = brotli;
            o.browserCacheTtl = browserCacheTtl;
            o.browserCheck = browserCheck;
            o.cacheLevel = cacheLevel;
            o.challengeTtl = challengeTtl;
            o.ciphers = ciphers;
            o.cnameFlattening = cnameFlattening;
            o.developmentMode = developmentMode;
            o.earlyHints = earlyHints;
            o.emailObfuscation = emailObfuscation;
            o.filterLogsToCloudflare = filterLogsToCloudflare;
            o.h2Prioritization = h2Prioritization;
            o.hotlinkProtection = hotlinkProtection;
            o.http2 = http2;
            o.http3 = http3;
            o.imageResizing = imageResizing;
            o.ipGeolocation = ipGeolocation;
            o.ipv6 = ipv6;
            o.logToCloudflare = logToCloudflare;
            o.maxUpload = maxUpload;
            o.minTlsVersion = minTlsVersion;
            o.minify = minify;
            o.mirage = mirage;
            o.mobileRedirect = mobileRedirect;
            o.opportunisticEncryption = opportunisticEncryption;
            o.opportunisticOnion = opportunisticOnion;
            o.orangeToOrange = orangeToOrange;
            o.originErrorPagePassThru = originErrorPagePassThru;
            o.originMaxHttpVersion = originMaxHttpVersion;
            o.polish = polish;
            o.prefetchPreload = prefetchPreload;
            o.privacyPass = privacyPass;
            o.proxyReadTimeout = proxyReadTimeout;
            o.pseudoIpv4 = pseudoIpv4;
            o.responseBuffering = responseBuffering;
            o.rocketLoader = rocketLoader;
            o.securityHeader = securityHeader;
            o.securityLevel = securityLevel;
            o.serverSideExclude = serverSideExclude;
            o.sortQueryStringForCache = sortQueryStringForCache;
            o.ssl = ssl;
            o.tls12Only = tls12Only;
            o.tls13 = tls13;
            o.tlsClientAuth = tlsClientAuth;
            o.trueClientIpHeader = trueClientIpHeader;
            o.universalSsl = universalSsl;
            o.visitorIp = visitorIp;
            o.waf = waf;
            o.webp = webp;
            o.websockets = websockets;
            o.zeroRtt = zeroRtt;
            return o;
        }
    }
}
