// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class ZoneSettingsOverrideInitialSettingGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("alwaysOnline")]
        public Input<string>? AlwaysOnline { get; set; }

        [Input("alwaysUseHttps")]
        public Input<string>? AlwaysUseHttps { get; set; }

        [Input("automaticHttpsRewrites")]
        public Input<string>? AutomaticHttpsRewrites { get; set; }

        [Input("binaryAst")]
        public Input<string>? BinaryAst { get; set; }

        [Input("brotli")]
        public Input<string>? Brotli { get; set; }

        [Input("browserCacheTtl")]
        public Input<int>? BrowserCacheTtl { get; set; }

        [Input("browserCheck")]
        public Input<string>? BrowserCheck { get; set; }

        [Input("cacheLevel")]
        public Input<string>? CacheLevel { get; set; }

        [Input("challengeTtl")]
        public Input<int>? ChallengeTtl { get; set; }

        [Input("ciphers")]
        private InputList<string>? _ciphers;
        public InputList<string> Ciphers
        {
            get => _ciphers ?? (_ciphers = new InputList<string>());
            set => _ciphers = value;
        }

        [Input("cnameFlattening")]
        public Input<string>? CnameFlattening { get; set; }

        [Input("developmentMode")]
        public Input<string>? DevelopmentMode { get; set; }

        [Input("earlyHints")]
        public Input<string>? EarlyHints { get; set; }

        [Input("emailObfuscation")]
        public Input<string>? EmailObfuscation { get; set; }

        [Input("filterLogsToCloudflare")]
        public Input<string>? FilterLogsToCloudflare { get; set; }

        [Input("fonts")]
        public Input<string>? Fonts { get; set; }

        [Input("h2Prioritization")]
        public Input<string>? H2Prioritization { get; set; }

        [Input("hotlinkProtection")]
        public Input<string>? HotlinkProtection { get; set; }

        [Input("http2")]
        public Input<string>? Http2 { get; set; }

        [Input("http3")]
        public Input<string>? Http3 { get; set; }

        [Input("imageResizing")]
        public Input<string>? ImageResizing { get; set; }

        [Input("ipGeolocation")]
        public Input<string>? IpGeolocation { get; set; }

        [Input("ipv6")]
        public Input<string>? Ipv6 { get; set; }

        [Input("logToCloudflare")]
        public Input<string>? LogToCloudflare { get; set; }

        [Input("maxUpload")]
        public Input<int>? MaxUpload { get; set; }

        [Input("minTlsVersion")]
        public Input<string>? MinTlsVersion { get; set; }

        [Input("minify")]
        public Input<Inputs.ZoneSettingsOverrideInitialSettingMinifyGetArgs>? Minify { get; set; }

        [Input("mirage")]
        public Input<string>? Mirage { get; set; }

        [Input("mobileRedirect")]
        public Input<Inputs.ZoneSettingsOverrideInitialSettingMobileRedirectGetArgs>? MobileRedirect { get; set; }

        [Input("nel")]
        public Input<Inputs.ZoneSettingsOverrideInitialSettingNelGetArgs>? Nel { get; set; }

        [Input("opportunisticEncryption")]
        public Input<string>? OpportunisticEncryption { get; set; }

        [Input("opportunisticOnion")]
        public Input<string>? OpportunisticOnion { get; set; }

        [Input("orangeToOrange")]
        public Input<string>? OrangeToOrange { get; set; }

        [Input("originErrorPagePassThru")]
        public Input<string>? OriginErrorPagePassThru { get; set; }

        [Input("originMaxHttpVersion")]
        public Input<string>? OriginMaxHttpVersion { get; set; }

        [Input("polish")]
        public Input<string>? Polish { get; set; }

        [Input("prefetchPreload")]
        public Input<string>? PrefetchPreload { get; set; }

        [Input("privacyPass")]
        public Input<string>? PrivacyPass { get; set; }

        [Input("proxyReadTimeout")]
        public Input<string>? ProxyReadTimeout { get; set; }

        [Input("pseudoIpv4")]
        public Input<string>? PseudoIpv4 { get; set; }

        [Input("replaceInsecureJs")]
        public Input<string>? ReplaceInsecureJs { get; set; }

        [Input("responseBuffering")]
        public Input<string>? ResponseBuffering { get; set; }

        [Input("rocketLoader")]
        public Input<string>? RocketLoader { get; set; }

        [Input("securityHeader")]
        public Input<Inputs.ZoneSettingsOverrideInitialSettingSecurityHeaderGetArgs>? SecurityHeader { get; set; }

        [Input("securityLevel")]
        public Input<string>? SecurityLevel { get; set; }

        [Input("serverSideExclude")]
        public Input<string>? ServerSideExclude { get; set; }

        [Input("sortQueryStringForCache")]
        public Input<string>? SortQueryStringForCache { get; set; }

        [Input("speedBrain")]
        public Input<string>? SpeedBrain { get; set; }

        [Input("ssl")]
        public Input<string>? Ssl { get; set; }

        [Input("tls12Only")]
        public Input<string>? Tls12Only { get; set; }

        [Input("tls13")]
        public Input<string>? Tls13 { get; set; }

        [Input("tlsClientAuth")]
        public Input<string>? TlsClientAuth { get; set; }

        [Input("trueClientIpHeader")]
        public Input<string>? TrueClientIpHeader { get; set; }

        [Input("universalSsl")]
        public Input<string>? UniversalSsl { get; set; }

        [Input("visitorIp")]
        public Input<string>? VisitorIp { get; set; }

        [Input("waf")]
        public Input<string>? Waf { get; set; }

        [Input("webp")]
        public Input<string>? Webp { get; set; }

        [Input("websockets")]
        public Input<string>? Websockets { get; set; }

        [Input("zeroRtt")]
        public Input<string>? ZeroRtt { get; set; }

        public ZoneSettingsOverrideInitialSettingGetArgs()
        {
        }
        public static new ZoneSettingsOverrideInitialSettingGetArgs Empty => new ZoneSettingsOverrideInitialSettingGetArgs();
    }
}
