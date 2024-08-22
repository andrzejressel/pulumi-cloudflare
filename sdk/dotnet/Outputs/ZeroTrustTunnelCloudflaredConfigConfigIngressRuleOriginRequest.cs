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
    public sealed class ZeroTrustTunnelCloudflaredConfigConfigIngressRuleOriginRequest
    {
        /// <summary>
        /// Access rules for the ingress service.
        /// </summary>
        public readonly Outputs.ZeroTrustTunnelCloudflaredConfigConfigIngressRuleOriginRequestAccess? Access;
        /// <summary>
        /// Runs as jump host.
        /// </summary>
        public readonly bool? BastionMode;
        /// <summary>
        /// Path to the certificate authority (CA) for the certificate of your origin. This option should be used only if your certificate is not signed by Cloudflare. Defaults to `""`.
        /// </summary>
        public readonly string? CaPool;
        /// <summary>
        /// Timeout for establishing a new TCP connection to your origin server. This excludes the time taken to establish TLS, which is controlled by `tlsTimeout`. Defaults to `30s`.
        /// </summary>
        public readonly string? ConnectTimeout;
        /// <summary>
        /// Disables chunked transfer encoding. Useful if you are running a Web Server Gateway Interface (WSGI) server. Defaults to `false`.
        /// </summary>
        public readonly bool? DisableChunkedEncoding;
        /// <summary>
        /// Enables HTTP/2 support for the origin connection. Defaults to `false`.
        /// </summary>
        public readonly bool? Http2Origin;
        /// <summary>
        /// Sets the HTTP Host header on requests sent to the local service. Defaults to `""`.
        /// </summary>
        public readonly string? HttpHostHeader;
        /// <summary>
        /// IP rules for the proxy service.
        /// </summary>
        public readonly ImmutableArray<Outputs.ZeroTrustTunnelCloudflaredConfigConfigIngressRuleOriginRequestIpRule> IpRules;
        /// <summary>
        /// Maximum number of idle keepalive connections between Tunnel and your origin. This does not restrict the total number of concurrent connections. Defaults to `100`.
        /// </summary>
        public readonly int? KeepAliveConnections;
        /// <summary>
        /// Timeout after which an idle keepalive connection can be discarded. Defaults to `1m30s`.
        /// </summary>
        public readonly string? KeepAliveTimeout;
        /// <summary>
        /// Disable the “happy eyeballs” algorithm for IPv4/IPv6 fallback if your local network has misconfigured one of the protocols. Defaults to `false`.
        /// </summary>
        public readonly bool? NoHappyEyeballs;
        /// <summary>
        /// Disables TLS verification of the certificate presented by your origin. Will allow any certificate from the origin to be accepted. Defaults to `false`.
        /// </summary>
        public readonly bool? NoTlsVerify;
        /// <summary>
        /// Hostname that cloudflared should expect from your origin server certificate. Defaults to `""`.
        /// </summary>
        public readonly string? OriginServerName;
        /// <summary>
        /// cloudflared starts a proxy server to translate HTTP traffic into TCP when proxying, for example, SSH or RDP. This configures the listen address for that proxy. Defaults to `127.0.0.1`.
        /// </summary>
        public readonly string? ProxyAddress;
        /// <summary>
        /// cloudflared starts a proxy server to translate HTTP traffic into TCP when proxying, for example, SSH or RDP. This configures the listen port for that proxy. If set to zero, an unused port will randomly be chosen. Defaults to `0`.
        /// </summary>
        public readonly int? ProxyPort;
        /// <summary>
        /// cloudflared starts a proxy server to translate HTTP traffic into TCP when proxying, for example, SSH or RDP. This configures what type of proxy will be started. Available values: `""`, `socks`. Defaults to `""`.
        /// </summary>
        public readonly string? ProxyType;
        /// <summary>
        /// The timeout after which a TCP keepalive packet is sent on a connection between Tunnel and the origin server. Defaults to `30s`.
        /// </summary>
        public readonly string? TcpKeepAlive;
        /// <summary>
        /// Timeout for completing a TLS handshake to your origin server, if you have chosen to connect Tunnel to an HTTPS server. Defaults to `10s`.
        /// </summary>
        public readonly string? TlsTimeout;

        [OutputConstructor]
        private ZeroTrustTunnelCloudflaredConfigConfigIngressRuleOriginRequest(
            Outputs.ZeroTrustTunnelCloudflaredConfigConfigIngressRuleOriginRequestAccess? access,

            bool? bastionMode,

            string? caPool,

            string? connectTimeout,

            bool? disableChunkedEncoding,

            bool? http2Origin,

            string? httpHostHeader,

            ImmutableArray<Outputs.ZeroTrustTunnelCloudflaredConfigConfigIngressRuleOriginRequestIpRule> ipRules,

            int? keepAliveConnections,

            string? keepAliveTimeout,

            bool? noHappyEyeballs,

            bool? noTlsVerify,

            string? originServerName,

            string? proxyAddress,

            int? proxyPort,

            string? proxyType,

            string? tcpKeepAlive,

            string? tlsTimeout)
        {
            Access = access;
            BastionMode = bastionMode;
            CaPool = caPool;
            ConnectTimeout = connectTimeout;
            DisableChunkedEncoding = disableChunkedEncoding;
            Http2Origin = http2Origin;
            HttpHostHeader = httpHostHeader;
            IpRules = ipRules;
            KeepAliveConnections = keepAliveConnections;
            KeepAliveTimeout = keepAliveTimeout;
            NoHappyEyeballs = noHappyEyeballs;
            NoTlsVerify = noTlsVerify;
            OriginServerName = originServerName;
            ProxyAddress = proxyAddress;
            ProxyPort = proxyPort;
            ProxyType = proxyType;
            TcpKeepAlive = tcpKeepAlive;
            TlsTimeout = tlsTimeout;
        }
    }
}
