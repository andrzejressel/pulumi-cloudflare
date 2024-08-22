// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.ZeroTrustTunnelCloudflaredConfigConfigIngressRuleOriginRequestAccessArgs;
import com.pulumi.cloudflare.inputs.ZeroTrustTunnelCloudflaredConfigConfigIngressRuleOriginRequestIpRuleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ZeroTrustTunnelCloudflaredConfigConfigIngressRuleOriginRequestArgs extends com.pulumi.resources.ResourceArgs {

    public static final ZeroTrustTunnelCloudflaredConfigConfigIngressRuleOriginRequestArgs Empty = new ZeroTrustTunnelCloudflaredConfigConfigIngressRuleOriginRequestArgs();

    /**
     * Access rules for the ingress service.
     * 
     */
    @Import(name="access")
    private @Nullable Output<ZeroTrustTunnelCloudflaredConfigConfigIngressRuleOriginRequestAccessArgs> access;

    /**
     * @return Access rules for the ingress service.
     * 
     */
    public Optional<Output<ZeroTrustTunnelCloudflaredConfigConfigIngressRuleOriginRequestAccessArgs>> access() {
        return Optional.ofNullable(this.access);
    }

    /**
     * Runs as jump host.
     * 
     */
    @Import(name="bastionMode")
    private @Nullable Output<Boolean> bastionMode;

    /**
     * @return Runs as jump host.
     * 
     */
    public Optional<Output<Boolean>> bastionMode() {
        return Optional.ofNullable(this.bastionMode);
    }

    /**
     * Path to the certificate authority (CA) for the certificate of your origin. This option should be used only if your certificate is not signed by Cloudflare. Defaults to `&#34;&#34;`.
     * 
     */
    @Import(name="caPool")
    private @Nullable Output<String> caPool;

    /**
     * @return Path to the certificate authority (CA) for the certificate of your origin. This option should be used only if your certificate is not signed by Cloudflare. Defaults to `&#34;&#34;`.
     * 
     */
    public Optional<Output<String>> caPool() {
        return Optional.ofNullable(this.caPool);
    }

    /**
     * Timeout for establishing a new TCP connection to your origin server. This excludes the time taken to establish TLS, which is controlled by `tlsTimeout`. Defaults to `30s`.
     * 
     */
    @Import(name="connectTimeout")
    private @Nullable Output<String> connectTimeout;

    /**
     * @return Timeout for establishing a new TCP connection to your origin server. This excludes the time taken to establish TLS, which is controlled by `tlsTimeout`. Defaults to `30s`.
     * 
     */
    public Optional<Output<String>> connectTimeout() {
        return Optional.ofNullable(this.connectTimeout);
    }

    /**
     * Disables chunked transfer encoding. Useful if you are running a Web Server Gateway Interface (WSGI) server. Defaults to `false`.
     * 
     */
    @Import(name="disableChunkedEncoding")
    private @Nullable Output<Boolean> disableChunkedEncoding;

    /**
     * @return Disables chunked transfer encoding. Useful if you are running a Web Server Gateway Interface (WSGI) server. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> disableChunkedEncoding() {
        return Optional.ofNullable(this.disableChunkedEncoding);
    }

    /**
     * Enables HTTP/2 support for the origin connection. Defaults to `false`.
     * 
     */
    @Import(name="http2Origin")
    private @Nullable Output<Boolean> http2Origin;

    /**
     * @return Enables HTTP/2 support for the origin connection. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> http2Origin() {
        return Optional.ofNullable(this.http2Origin);
    }

    /**
     * Sets the HTTP Host header on requests sent to the local service. Defaults to `&#34;&#34;`.
     * 
     */
    @Import(name="httpHostHeader")
    private @Nullable Output<String> httpHostHeader;

    /**
     * @return Sets the HTTP Host header on requests sent to the local service. Defaults to `&#34;&#34;`.
     * 
     */
    public Optional<Output<String>> httpHostHeader() {
        return Optional.ofNullable(this.httpHostHeader);
    }

    /**
     * IP rules for the proxy service.
     * 
     */
    @Import(name="ipRules")
    private @Nullable Output<List<ZeroTrustTunnelCloudflaredConfigConfigIngressRuleOriginRequestIpRuleArgs>> ipRules;

    /**
     * @return IP rules for the proxy service.
     * 
     */
    public Optional<Output<List<ZeroTrustTunnelCloudflaredConfigConfigIngressRuleOriginRequestIpRuleArgs>>> ipRules() {
        return Optional.ofNullable(this.ipRules);
    }

    /**
     * Maximum number of idle keepalive connections between Tunnel and your origin. This does not restrict the total number of concurrent connections. Defaults to `100`.
     * 
     */
    @Import(name="keepAliveConnections")
    private @Nullable Output<Integer> keepAliveConnections;

    /**
     * @return Maximum number of idle keepalive connections between Tunnel and your origin. This does not restrict the total number of concurrent connections. Defaults to `100`.
     * 
     */
    public Optional<Output<Integer>> keepAliveConnections() {
        return Optional.ofNullable(this.keepAliveConnections);
    }

    /**
     * Timeout after which an idle keepalive connection can be discarded. Defaults to `1m30s`.
     * 
     */
    @Import(name="keepAliveTimeout")
    private @Nullable Output<String> keepAliveTimeout;

    /**
     * @return Timeout after which an idle keepalive connection can be discarded. Defaults to `1m30s`.
     * 
     */
    public Optional<Output<String>> keepAliveTimeout() {
        return Optional.ofNullable(this.keepAliveTimeout);
    }

    /**
     * Disable the “happy eyeballs” algorithm for IPv4/IPv6 fallback if your local network has misconfigured one of the protocols. Defaults to `false`.
     * 
     */
    @Import(name="noHappyEyeballs")
    private @Nullable Output<Boolean> noHappyEyeballs;

    /**
     * @return Disable the “happy eyeballs” algorithm for IPv4/IPv6 fallback if your local network has misconfigured one of the protocols. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> noHappyEyeballs() {
        return Optional.ofNullable(this.noHappyEyeballs);
    }

    /**
     * Disables TLS verification of the certificate presented by your origin. Will allow any certificate from the origin to be accepted. Defaults to `false`.
     * 
     */
    @Import(name="noTlsVerify")
    private @Nullable Output<Boolean> noTlsVerify;

    /**
     * @return Disables TLS verification of the certificate presented by your origin. Will allow any certificate from the origin to be accepted. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> noTlsVerify() {
        return Optional.ofNullable(this.noTlsVerify);
    }

    /**
     * Hostname that cloudflared should expect from your origin server certificate. Defaults to `&#34;&#34;`.
     * 
     */
    @Import(name="originServerName")
    private @Nullable Output<String> originServerName;

    /**
     * @return Hostname that cloudflared should expect from your origin server certificate. Defaults to `&#34;&#34;`.
     * 
     */
    public Optional<Output<String>> originServerName() {
        return Optional.ofNullable(this.originServerName);
    }

    /**
     * cloudflared starts a proxy server to translate HTTP traffic into TCP when proxying, for example, SSH or RDP. This configures the listen address for that proxy. Defaults to `127.0.0.1`.
     * 
     */
    @Import(name="proxyAddress")
    private @Nullable Output<String> proxyAddress;

    /**
     * @return cloudflared starts a proxy server to translate HTTP traffic into TCP when proxying, for example, SSH or RDP. This configures the listen address for that proxy. Defaults to `127.0.0.1`.
     * 
     */
    public Optional<Output<String>> proxyAddress() {
        return Optional.ofNullable(this.proxyAddress);
    }

    /**
     * cloudflared starts a proxy server to translate HTTP traffic into TCP when proxying, for example, SSH or RDP. This configures the listen port for that proxy. If set to zero, an unused port will randomly be chosen. Defaults to `0`.
     * 
     */
    @Import(name="proxyPort")
    private @Nullable Output<Integer> proxyPort;

    /**
     * @return cloudflared starts a proxy server to translate HTTP traffic into TCP when proxying, for example, SSH or RDP. This configures the listen port for that proxy. If set to zero, an unused port will randomly be chosen. Defaults to `0`.
     * 
     */
    public Optional<Output<Integer>> proxyPort() {
        return Optional.ofNullable(this.proxyPort);
    }

    /**
     * cloudflared starts a proxy server to translate HTTP traffic into TCP when proxying, for example, SSH or RDP. This configures what type of proxy will be started. Available values: `&#34;&#34;`, `socks`. Defaults to `&#34;&#34;`.
     * 
     */
    @Import(name="proxyType")
    private @Nullable Output<String> proxyType;

    /**
     * @return cloudflared starts a proxy server to translate HTTP traffic into TCP when proxying, for example, SSH or RDP. This configures what type of proxy will be started. Available values: `&#34;&#34;`, `socks`. Defaults to `&#34;&#34;`.
     * 
     */
    public Optional<Output<String>> proxyType() {
        return Optional.ofNullable(this.proxyType);
    }

    /**
     * The timeout after which a TCP keepalive packet is sent on a connection between Tunnel and the origin server. Defaults to `30s`.
     * 
     */
    @Import(name="tcpKeepAlive")
    private @Nullable Output<String> tcpKeepAlive;

    /**
     * @return The timeout after which a TCP keepalive packet is sent on a connection between Tunnel and the origin server. Defaults to `30s`.
     * 
     */
    public Optional<Output<String>> tcpKeepAlive() {
        return Optional.ofNullable(this.tcpKeepAlive);
    }

    /**
     * Timeout for completing a TLS handshake to your origin server, if you have chosen to connect Tunnel to an HTTPS server. Defaults to `10s`.
     * 
     */
    @Import(name="tlsTimeout")
    private @Nullable Output<String> tlsTimeout;

    /**
     * @return Timeout for completing a TLS handshake to your origin server, if you have chosen to connect Tunnel to an HTTPS server. Defaults to `10s`.
     * 
     */
    public Optional<Output<String>> tlsTimeout() {
        return Optional.ofNullable(this.tlsTimeout);
    }

    private ZeroTrustTunnelCloudflaredConfigConfigIngressRuleOriginRequestArgs() {}

    private ZeroTrustTunnelCloudflaredConfigConfigIngressRuleOriginRequestArgs(ZeroTrustTunnelCloudflaredConfigConfigIngressRuleOriginRequestArgs $) {
        this.access = $.access;
        this.bastionMode = $.bastionMode;
        this.caPool = $.caPool;
        this.connectTimeout = $.connectTimeout;
        this.disableChunkedEncoding = $.disableChunkedEncoding;
        this.http2Origin = $.http2Origin;
        this.httpHostHeader = $.httpHostHeader;
        this.ipRules = $.ipRules;
        this.keepAliveConnections = $.keepAliveConnections;
        this.keepAliveTimeout = $.keepAliveTimeout;
        this.noHappyEyeballs = $.noHappyEyeballs;
        this.noTlsVerify = $.noTlsVerify;
        this.originServerName = $.originServerName;
        this.proxyAddress = $.proxyAddress;
        this.proxyPort = $.proxyPort;
        this.proxyType = $.proxyType;
        this.tcpKeepAlive = $.tcpKeepAlive;
        this.tlsTimeout = $.tlsTimeout;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZeroTrustTunnelCloudflaredConfigConfigIngressRuleOriginRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZeroTrustTunnelCloudflaredConfigConfigIngressRuleOriginRequestArgs $;

        public Builder() {
            $ = new ZeroTrustTunnelCloudflaredConfigConfigIngressRuleOriginRequestArgs();
        }

        public Builder(ZeroTrustTunnelCloudflaredConfigConfigIngressRuleOriginRequestArgs defaults) {
            $ = new ZeroTrustTunnelCloudflaredConfigConfigIngressRuleOriginRequestArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param access Access rules for the ingress service.
         * 
         * @return builder
         * 
         */
        public Builder access(@Nullable Output<ZeroTrustTunnelCloudflaredConfigConfigIngressRuleOriginRequestAccessArgs> access) {
            $.access = access;
            return this;
        }

        /**
         * @param access Access rules for the ingress service.
         * 
         * @return builder
         * 
         */
        public Builder access(ZeroTrustTunnelCloudflaredConfigConfigIngressRuleOriginRequestAccessArgs access) {
            return access(Output.of(access));
        }

        /**
         * @param bastionMode Runs as jump host.
         * 
         * @return builder
         * 
         */
        public Builder bastionMode(@Nullable Output<Boolean> bastionMode) {
            $.bastionMode = bastionMode;
            return this;
        }

        /**
         * @param bastionMode Runs as jump host.
         * 
         * @return builder
         * 
         */
        public Builder bastionMode(Boolean bastionMode) {
            return bastionMode(Output.of(bastionMode));
        }

        /**
         * @param caPool Path to the certificate authority (CA) for the certificate of your origin. This option should be used only if your certificate is not signed by Cloudflare. Defaults to `&#34;&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder caPool(@Nullable Output<String> caPool) {
            $.caPool = caPool;
            return this;
        }

        /**
         * @param caPool Path to the certificate authority (CA) for the certificate of your origin. This option should be used only if your certificate is not signed by Cloudflare. Defaults to `&#34;&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder caPool(String caPool) {
            return caPool(Output.of(caPool));
        }

        /**
         * @param connectTimeout Timeout for establishing a new TCP connection to your origin server. This excludes the time taken to establish TLS, which is controlled by `tlsTimeout`. Defaults to `30s`.
         * 
         * @return builder
         * 
         */
        public Builder connectTimeout(@Nullable Output<String> connectTimeout) {
            $.connectTimeout = connectTimeout;
            return this;
        }

        /**
         * @param connectTimeout Timeout for establishing a new TCP connection to your origin server. This excludes the time taken to establish TLS, which is controlled by `tlsTimeout`. Defaults to `30s`.
         * 
         * @return builder
         * 
         */
        public Builder connectTimeout(String connectTimeout) {
            return connectTimeout(Output.of(connectTimeout));
        }

        /**
         * @param disableChunkedEncoding Disables chunked transfer encoding. Useful if you are running a Web Server Gateway Interface (WSGI) server. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder disableChunkedEncoding(@Nullable Output<Boolean> disableChunkedEncoding) {
            $.disableChunkedEncoding = disableChunkedEncoding;
            return this;
        }

        /**
         * @param disableChunkedEncoding Disables chunked transfer encoding. Useful if you are running a Web Server Gateway Interface (WSGI) server. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder disableChunkedEncoding(Boolean disableChunkedEncoding) {
            return disableChunkedEncoding(Output.of(disableChunkedEncoding));
        }

        /**
         * @param http2Origin Enables HTTP/2 support for the origin connection. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder http2Origin(@Nullable Output<Boolean> http2Origin) {
            $.http2Origin = http2Origin;
            return this;
        }

        /**
         * @param http2Origin Enables HTTP/2 support for the origin connection. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder http2Origin(Boolean http2Origin) {
            return http2Origin(Output.of(http2Origin));
        }

        /**
         * @param httpHostHeader Sets the HTTP Host header on requests sent to the local service. Defaults to `&#34;&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder httpHostHeader(@Nullable Output<String> httpHostHeader) {
            $.httpHostHeader = httpHostHeader;
            return this;
        }

        /**
         * @param httpHostHeader Sets the HTTP Host header on requests sent to the local service. Defaults to `&#34;&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder httpHostHeader(String httpHostHeader) {
            return httpHostHeader(Output.of(httpHostHeader));
        }

        /**
         * @param ipRules IP rules for the proxy service.
         * 
         * @return builder
         * 
         */
        public Builder ipRules(@Nullable Output<List<ZeroTrustTunnelCloudflaredConfigConfigIngressRuleOriginRequestIpRuleArgs>> ipRules) {
            $.ipRules = ipRules;
            return this;
        }

        /**
         * @param ipRules IP rules for the proxy service.
         * 
         * @return builder
         * 
         */
        public Builder ipRules(List<ZeroTrustTunnelCloudflaredConfigConfigIngressRuleOriginRequestIpRuleArgs> ipRules) {
            return ipRules(Output.of(ipRules));
        }

        /**
         * @param ipRules IP rules for the proxy service.
         * 
         * @return builder
         * 
         */
        public Builder ipRules(ZeroTrustTunnelCloudflaredConfigConfigIngressRuleOriginRequestIpRuleArgs... ipRules) {
            return ipRules(List.of(ipRules));
        }

        /**
         * @param keepAliveConnections Maximum number of idle keepalive connections between Tunnel and your origin. This does not restrict the total number of concurrent connections. Defaults to `100`.
         * 
         * @return builder
         * 
         */
        public Builder keepAliveConnections(@Nullable Output<Integer> keepAliveConnections) {
            $.keepAliveConnections = keepAliveConnections;
            return this;
        }

        /**
         * @param keepAliveConnections Maximum number of idle keepalive connections between Tunnel and your origin. This does not restrict the total number of concurrent connections. Defaults to `100`.
         * 
         * @return builder
         * 
         */
        public Builder keepAliveConnections(Integer keepAliveConnections) {
            return keepAliveConnections(Output.of(keepAliveConnections));
        }

        /**
         * @param keepAliveTimeout Timeout after which an idle keepalive connection can be discarded. Defaults to `1m30s`.
         * 
         * @return builder
         * 
         */
        public Builder keepAliveTimeout(@Nullable Output<String> keepAliveTimeout) {
            $.keepAliveTimeout = keepAliveTimeout;
            return this;
        }

        /**
         * @param keepAliveTimeout Timeout after which an idle keepalive connection can be discarded. Defaults to `1m30s`.
         * 
         * @return builder
         * 
         */
        public Builder keepAliveTimeout(String keepAliveTimeout) {
            return keepAliveTimeout(Output.of(keepAliveTimeout));
        }

        /**
         * @param noHappyEyeballs Disable the “happy eyeballs” algorithm for IPv4/IPv6 fallback if your local network has misconfigured one of the protocols. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder noHappyEyeballs(@Nullable Output<Boolean> noHappyEyeballs) {
            $.noHappyEyeballs = noHappyEyeballs;
            return this;
        }

        /**
         * @param noHappyEyeballs Disable the “happy eyeballs” algorithm for IPv4/IPv6 fallback if your local network has misconfigured one of the protocols. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder noHappyEyeballs(Boolean noHappyEyeballs) {
            return noHappyEyeballs(Output.of(noHappyEyeballs));
        }

        /**
         * @param noTlsVerify Disables TLS verification of the certificate presented by your origin. Will allow any certificate from the origin to be accepted. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder noTlsVerify(@Nullable Output<Boolean> noTlsVerify) {
            $.noTlsVerify = noTlsVerify;
            return this;
        }

        /**
         * @param noTlsVerify Disables TLS verification of the certificate presented by your origin. Will allow any certificate from the origin to be accepted. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder noTlsVerify(Boolean noTlsVerify) {
            return noTlsVerify(Output.of(noTlsVerify));
        }

        /**
         * @param originServerName Hostname that cloudflared should expect from your origin server certificate. Defaults to `&#34;&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder originServerName(@Nullable Output<String> originServerName) {
            $.originServerName = originServerName;
            return this;
        }

        /**
         * @param originServerName Hostname that cloudflared should expect from your origin server certificate. Defaults to `&#34;&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder originServerName(String originServerName) {
            return originServerName(Output.of(originServerName));
        }

        /**
         * @param proxyAddress cloudflared starts a proxy server to translate HTTP traffic into TCP when proxying, for example, SSH or RDP. This configures the listen address for that proxy. Defaults to `127.0.0.1`.
         * 
         * @return builder
         * 
         */
        public Builder proxyAddress(@Nullable Output<String> proxyAddress) {
            $.proxyAddress = proxyAddress;
            return this;
        }

        /**
         * @param proxyAddress cloudflared starts a proxy server to translate HTTP traffic into TCP when proxying, for example, SSH or RDP. This configures the listen address for that proxy. Defaults to `127.0.0.1`.
         * 
         * @return builder
         * 
         */
        public Builder proxyAddress(String proxyAddress) {
            return proxyAddress(Output.of(proxyAddress));
        }

        /**
         * @param proxyPort cloudflared starts a proxy server to translate HTTP traffic into TCP when proxying, for example, SSH or RDP. This configures the listen port for that proxy. If set to zero, an unused port will randomly be chosen. Defaults to `0`.
         * 
         * @return builder
         * 
         */
        public Builder proxyPort(@Nullable Output<Integer> proxyPort) {
            $.proxyPort = proxyPort;
            return this;
        }

        /**
         * @param proxyPort cloudflared starts a proxy server to translate HTTP traffic into TCP when proxying, for example, SSH or RDP. This configures the listen port for that proxy. If set to zero, an unused port will randomly be chosen. Defaults to `0`.
         * 
         * @return builder
         * 
         */
        public Builder proxyPort(Integer proxyPort) {
            return proxyPort(Output.of(proxyPort));
        }

        /**
         * @param proxyType cloudflared starts a proxy server to translate HTTP traffic into TCP when proxying, for example, SSH or RDP. This configures what type of proxy will be started. Available values: `&#34;&#34;`, `socks`. Defaults to `&#34;&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder proxyType(@Nullable Output<String> proxyType) {
            $.proxyType = proxyType;
            return this;
        }

        /**
         * @param proxyType cloudflared starts a proxy server to translate HTTP traffic into TCP when proxying, for example, SSH or RDP. This configures what type of proxy will be started. Available values: `&#34;&#34;`, `socks`. Defaults to `&#34;&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder proxyType(String proxyType) {
            return proxyType(Output.of(proxyType));
        }

        /**
         * @param tcpKeepAlive The timeout after which a TCP keepalive packet is sent on a connection between Tunnel and the origin server. Defaults to `30s`.
         * 
         * @return builder
         * 
         */
        public Builder tcpKeepAlive(@Nullable Output<String> tcpKeepAlive) {
            $.tcpKeepAlive = tcpKeepAlive;
            return this;
        }

        /**
         * @param tcpKeepAlive The timeout after which a TCP keepalive packet is sent on a connection between Tunnel and the origin server. Defaults to `30s`.
         * 
         * @return builder
         * 
         */
        public Builder tcpKeepAlive(String tcpKeepAlive) {
            return tcpKeepAlive(Output.of(tcpKeepAlive));
        }

        /**
         * @param tlsTimeout Timeout for completing a TLS handshake to your origin server, if you have chosen to connect Tunnel to an HTTPS server. Defaults to `10s`.
         * 
         * @return builder
         * 
         */
        public Builder tlsTimeout(@Nullable Output<String> tlsTimeout) {
            $.tlsTimeout = tlsTimeout;
            return this;
        }

        /**
         * @param tlsTimeout Timeout for completing a TLS handshake to your origin server, if you have chosen to connect Tunnel to an HTTPS server. Defaults to `10s`.
         * 
         * @return builder
         * 
         */
        public Builder tlsTimeout(String tlsTimeout) {
            return tlsTimeout(Output.of(tlsTimeout));
        }

        public ZeroTrustTunnelCloudflaredConfigConfigIngressRuleOriginRequestArgs build() {
            return $;
        }
    }

}
