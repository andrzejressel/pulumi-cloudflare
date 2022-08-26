// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Outputs
{

    [OutputType]
    public sealed class PageRuleActions
    {
        /// <summary>
        /// Boolean of whether this action is enabled. Default: false.
        /// </summary>
        public readonly bool? AlwaysUseHttps;
        /// <summary>
        /// Whether this action is `"on"` or `"off"`.
        /// </summary>
        public readonly string? AutomaticHttpsRewrites;
        /// <summary>
        /// The Time To Live for the browser cache. `0` means 'Respect Existing Headers'
        /// </summary>
        public readonly string? BrowserCacheTtl;
        /// <summary>
        /// Whether this action is `"on"` or `"off"`.
        /// </summary>
        public readonly string? BrowserCheck;
        /// <summary>
        /// String value of cookie name to conditionally bypass cache the page.
        /// </summary>
        public readonly string? BypassCacheOnCookie;
        /// <summary>
        /// Whether this action is `"on"` or `"off"`.
        /// </summary>
        public readonly string? CacheByDeviceType;
        /// <summary>
        /// Whether this action is `"on"` or `"off"`.
        /// </summary>
        public readonly string? CacheDeceptionArmor;
        /// <summary>
        /// Controls how Cloudflare creates Cache Keys used to identify files in cache. See below for full description.
        /// </summary>
        public readonly Outputs.PageRuleActionsCacheKeyFields? CacheKeyFields;
        /// <summary>
        /// Whether to set the cache level to `"bypass"`, `"basic"`, `"simplified"`, `"aggressive"`, or `"cache_everything"`.
        /// </summary>
        public readonly string? CacheLevel;
        /// <summary>
        /// String value of cookie name to conditionally cache the page.
        /// </summary>
        public readonly string? CacheOnCookie;
        /// <summary>
        /// Set cache TTL based on the response status from the origin web server. Can be specified multiple times. See below for full description.
        /// </summary>
        public readonly ImmutableArray<Outputs.PageRuleActionsCacheTtlByStatus> CacheTtlByStatuses;
        /// <summary>
        /// Boolean of whether this action is enabled. Default: false.
        /// </summary>
        public readonly bool? DisableApps;
        /// <summary>
        /// Boolean of whether this action is enabled. Default: false.
        /// </summary>
        public readonly bool? DisablePerformance;
        /// <summary>
        /// Boolean of whether this action is enabled. Default: false.
        /// </summary>
        public readonly bool? DisableRailgun;
        /// <summary>
        /// Boolean of whether this action is enabled. Default: false.
        /// </summary>
        public readonly bool? DisableSecurity;
        /// <summary>
        /// Boolean of whether this action is enabled. Default: false.
        /// </summary>
        public readonly bool? DisableZaraz;
        /// <summary>
        /// The Time To Live for the edge cache.
        /// </summary>
        public readonly int? EdgeCacheTtl;
        /// <summary>
        /// Whether this action is `"on"` or `"off"`.
        /// </summary>
        public readonly string? EmailObfuscation;
        /// <summary>
        /// Whether origin Cache-Control action is `"on"` or `"off"`.
        /// </summary>
        public readonly string? ExplicitCacheControl;
        /// <summary>
        /// The URL to forward to, and with what status. See below.
        /// </summary>
        public readonly Outputs.PageRuleActionsForwardingUrl? ForwardingUrl;
        /// <summary>
        /// Value of the Host header to send.
        /// </summary>
        public readonly string? HostHeaderOverride;
        /// <summary>
        /// Whether this action is `"on"` or `"off"`.
        /// </summary>
        public readonly string? IpGeolocation;
        /// <summary>
        /// The configuration for HTML, CSS and JS minification. See below for full list of options.
        /// </summary>
        public readonly ImmutableArray<Outputs.PageRuleActionsMinify> Minifies;
        /// <summary>
        /// Whether this action is `"on"` or `"off"`.
        /// </summary>
        public readonly string? Mirage;
        /// <summary>
        /// Whether this action is `"on"` or `"off"`.
        /// </summary>
        public readonly string? OpportunisticEncryption;
        /// <summary>
        /// Whether this action is `"on"` or `"off"`.
        /// </summary>
        public readonly string? OriginErrorPagePassThru;
        /// <summary>
        /// Whether this action is `"off"`, `"lossless"` or `"lossy"`.
        /// </summary>
        public readonly string? Polish;
        /// <summary>
        /// Overridden origin server name.
        /// </summary>
        public readonly string? ResolveOverride;
        /// <summary>
        /// Whether this action is `"on"` or `"off"`.
        /// </summary>
        public readonly string? RespectStrongEtag;
        /// <summary>
        /// Whether this action is `"on"` or `"off"`.
        /// </summary>
        public readonly string? ResponseBuffering;
        /// <summary>
        /// Whether to set the rocket loader to `"on"`, `"off"`.
        /// </summary>
        public readonly string? RocketLoader;
        /// <summary>
        /// Whether to set the security level to `"off"`, `"essentially_off"`, `"low"`, `"medium"`, `"high"`, or `"under_attack"`.
        /// </summary>
        public readonly string? SecurityLevel;
        /// <summary>
        /// Whether this action is `"on"` or `"off"`.
        /// </summary>
        public readonly string? ServerSideExclude;
        /// <summary>
        /// Whether this action is `"on"` or `"off"`.
        /// </summary>
        public readonly string? SortQueryStringForCache;
        /// <summary>
        /// Whether to set the SSL mode to `"off"`, `"flexible"`, `"full"`, `"strict"`, or `"origin_pull"`.
        /// </summary>
        public readonly string? Ssl;
        /// <summary>
        /// Whether this action is `"on"` or `"off"`.
        /// </summary>
        public readonly string? TrueClientIpHeader;
        /// <summary>
        /// Whether this action is `"on"` or `"off"`.
        /// </summary>
        public readonly string? Waf;

        [OutputConstructor]
        private PageRuleActions(
            bool? alwaysUseHttps,

            string? automaticHttpsRewrites,

            string? browserCacheTtl,

            string? browserCheck,

            string? bypassCacheOnCookie,

            string? cacheByDeviceType,

            string? cacheDeceptionArmor,

            Outputs.PageRuleActionsCacheKeyFields? cacheKeyFields,

            string? cacheLevel,

            string? cacheOnCookie,

            ImmutableArray<Outputs.PageRuleActionsCacheTtlByStatus> cacheTtlByStatuses,

            bool? disableApps,

            bool? disablePerformance,

            bool? disableRailgun,

            bool? disableSecurity,

            bool? disableZaraz,

            int? edgeCacheTtl,

            string? emailObfuscation,

            string? explicitCacheControl,

            Outputs.PageRuleActionsForwardingUrl? forwardingUrl,

            string? hostHeaderOverride,

            string? ipGeolocation,

            ImmutableArray<Outputs.PageRuleActionsMinify> minifies,

            string? mirage,

            string? opportunisticEncryption,

            string? originErrorPagePassThru,

            string? polish,

            string? resolveOverride,

            string? respectStrongEtag,

            string? responseBuffering,

            string? rocketLoader,

            string? securityLevel,

            string? serverSideExclude,

            string? sortQueryStringForCache,

            string? ssl,

            string? trueClientIpHeader,

            string? waf)
        {
            AlwaysUseHttps = alwaysUseHttps;
            AutomaticHttpsRewrites = automaticHttpsRewrites;
            BrowserCacheTtl = browserCacheTtl;
            BrowserCheck = browserCheck;
            BypassCacheOnCookie = bypassCacheOnCookie;
            CacheByDeviceType = cacheByDeviceType;
            CacheDeceptionArmor = cacheDeceptionArmor;
            CacheKeyFields = cacheKeyFields;
            CacheLevel = cacheLevel;
            CacheOnCookie = cacheOnCookie;
            CacheTtlByStatuses = cacheTtlByStatuses;
            DisableApps = disableApps;
            DisablePerformance = disablePerformance;
            DisableRailgun = disableRailgun;
            DisableSecurity = disableSecurity;
            DisableZaraz = disableZaraz;
            EdgeCacheTtl = edgeCacheTtl;
            EmailObfuscation = emailObfuscation;
            ExplicitCacheControl = explicitCacheControl;
            ForwardingUrl = forwardingUrl;
            HostHeaderOverride = hostHeaderOverride;
            IpGeolocation = ipGeolocation;
            Minifies = minifies;
            Mirage = mirage;
            OpportunisticEncryption = opportunisticEncryption;
            OriginErrorPagePassThru = originErrorPagePassThru;
            Polish = polish;
            ResolveOverride = resolveOverride;
            RespectStrongEtag = respectStrongEtag;
            ResponseBuffering = responseBuffering;
            RocketLoader = rocketLoader;
            SecurityLevel = securityLevel;
            ServerSideExclude = serverSideExclude;
            SortQueryStringForCache = sortQueryStringForCache;
            Ssl = ssl;
            TrueClientIpHeader = trueClientIpHeader;
            Waf = waf;
        }
    }
}
