// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.SpectrumApplicationDnsArgs;
import com.pulumi.cloudflare.inputs.SpectrumApplicationOriginDnsArgs;
import com.pulumi.cloudflare.inputs.SpectrumApplicationOriginPortRangeArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SpectrumApplicationState extends com.pulumi.resources.ResourceArgs {

    public static final SpectrumApplicationState Empty = new SpectrumApplicationState();

    /**
     * . Enables Argo Smart Routing. Defaults to `false`.
     * 
     */
    @Import(name="argoSmartRouting")
    private @Nullable Output<Boolean> argoSmartRouting;

    /**
     * @return . Enables Argo Smart Routing. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> argoSmartRouting() {
        return Optional.ofNullable(this.argoSmartRouting);
    }

    /**
     * The name and type of DNS record for the Spectrum application. Fields documented below.
     * 
     */
    @Import(name="dns")
    private @Nullable Output<SpectrumApplicationDnsArgs> dns;

    /**
     * @return The name and type of DNS record for the Spectrum application. Fields documented below.
     * 
     */
    public Optional<Output<SpectrumApplicationDnsArgs>> dns() {
        return Optional.ofNullable(this.dns);
    }

    /**
     * . Choose which types of IP addresses will be provisioned for this subdomain. Valid values are: `all`, `ipv4`, `ipv6`. Defaults to `all`.
     * 
     */
    @Import(name="edgeIpConnectivity")
    private @Nullable Output<String> edgeIpConnectivity;

    /**
     * @return . Choose which types of IP addresses will be provisioned for this subdomain. Valid values are: `all`, `ipv4`, `ipv6`. Defaults to `all`.
     * 
     */
    public Optional<Output<String>> edgeIpConnectivity() {
        return Optional.ofNullable(this.edgeIpConnectivity);
    }

    /**
     * . A list of edge IPs (IPv4 and/or IPv6) to configure Spectrum application to. Requires [Bring Your Own IP](https://developers.cloudflare.com/spectrum/getting-started/byoip/) provisioned.
     * 
     */
    @Import(name="edgeIps")
    private @Nullable Output<List<String>> edgeIps;

    /**
     * @return . A list of edge IPs (IPv4 and/or IPv6) to configure Spectrum application to. Requires [Bring Your Own IP](https://developers.cloudflare.com/spectrum/getting-started/byoip/) provisioned.
     * 
     */
    public Optional<Output<List<String>>> edgeIps() {
        return Optional.ofNullable(this.edgeIps);
    }

    /**
     * Enables the IP Firewall for this application. Defaults to `true`.
     * 
     */
    @Import(name="ipFirewall")
    private @Nullable Output<Boolean> ipFirewall;

    /**
     * @return Enables the IP Firewall for this application. Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> ipFirewall() {
        return Optional.ofNullable(this.ipFirewall);
    }

    /**
     * A list of destination addresses to the origin. e.g. `tcp://192.0.2.1:22`.
     * 
     */
    @Import(name="originDirects")
    private @Nullable Output<List<String>> originDirects;

    /**
     * @return A list of destination addresses to the origin. e.g. `tcp://192.0.2.1:22`.
     * 
     */
    public Optional<Output<List<String>>> originDirects() {
        return Optional.ofNullable(this.originDirects);
    }

    /**
     * A destination DNS addresses to the origin. Fields documented below.
     * 
     */
    @Import(name="originDns")
    private @Nullable Output<SpectrumApplicationOriginDnsArgs> originDns;

    /**
     * @return A destination DNS addresses to the origin. Fields documented below.
     * 
     */
    public Optional<Output<SpectrumApplicationOriginDnsArgs>> originDns() {
        return Optional.ofNullable(this.originDns);
    }

    /**
     * If using `origin_dns` and not `origin_port_range`, this is a required attribute. Origin port to proxy traffice to e.g. `22`.
     * 
     */
    @Import(name="originPort")
    private @Nullable Output<Integer> originPort;

    /**
     * @return If using `origin_dns` and not `origin_port_range`, this is a required attribute. Origin port to proxy traffice to e.g. `22`.
     * 
     */
    public Optional<Output<Integer>> originPort() {
        return Optional.ofNullable(this.originPort);
    }

    /**
     * If using `origin_dns` and not `origin_port`, this is a required attribute. Origin port range to proxy traffice to. When using a range, the protocol field must also specify a range, e.g. `tcp/22-23`. Fields documented below.
     * 
     */
    @Import(name="originPortRange")
    private @Nullable Output<SpectrumApplicationOriginPortRangeArgs> originPortRange;

    /**
     * @return If using `origin_dns` and not `origin_port`, this is a required attribute. Origin port range to proxy traffice to. When using a range, the protocol field must also specify a range, e.g. `tcp/22-23`. Fields documented below.
     * 
     */
    public Optional<Output<SpectrumApplicationOriginPortRangeArgs>> originPortRange() {
        return Optional.ofNullable(this.originPortRange);
    }

    /**
     * The port configuration at Cloudflare’s edge. e.g. `tcp/22`.
     * 
     */
    @Import(name="protocol")
    private @Nullable Output<String> protocol;

    /**
     * @return The port configuration at Cloudflare’s edge. e.g. `tcp/22`.
     * 
     */
    public Optional<Output<String>> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    /**
     * Enables a proxy protocol to the origin. Valid values are: `off`, `v1`, `v2`, and `simple`. Defaults to `off`.
     * 
     */
    @Import(name="proxyProtocol")
    private @Nullable Output<String> proxyProtocol;

    /**
     * @return Enables a proxy protocol to the origin. Valid values are: `off`, `v1`, `v2`, and `simple`. Defaults to `off`.
     * 
     */
    public Optional<Output<String>> proxyProtocol() {
        return Optional.ofNullable(this.proxyProtocol);
    }

    /**
     * TLS configuration option for Cloudflare to connect to your origin. Valid values are: `off`, `flexible`, `full` and `strict`. Defaults to `off`.
     * 
     */
    @Import(name="tls")
    private @Nullable Output<String> tls;

    /**
     * @return TLS configuration option for Cloudflare to connect to your origin. Valid values are: `off`, `flexible`, `full` and `strict`. Defaults to `off`.
     * 
     */
    public Optional<Output<String>> tls() {
        return Optional.ofNullable(this.tls);
    }

    /**
     * Sets application type. Valid values are: `direct`, `http`, `https`. Defaults to `direct`.
     * 
     */
    @Import(name="trafficType")
    private @Nullable Output<String> trafficType;

    /**
     * @return Sets application type. Valid values are: `direct`, `http`, `https`. Defaults to `direct`.
     * 
     */
    public Optional<Output<String>> trafficType() {
        return Optional.ofNullable(this.trafficType);
    }

    /**
     * The DNS zone ID to add the application to
     * 
     */
    @Import(name="zoneId")
    private @Nullable Output<String> zoneId;

    /**
     * @return The DNS zone ID to add the application to
     * 
     */
    public Optional<Output<String>> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    private SpectrumApplicationState() {}

    private SpectrumApplicationState(SpectrumApplicationState $) {
        this.argoSmartRouting = $.argoSmartRouting;
        this.dns = $.dns;
        this.edgeIpConnectivity = $.edgeIpConnectivity;
        this.edgeIps = $.edgeIps;
        this.ipFirewall = $.ipFirewall;
        this.originDirects = $.originDirects;
        this.originDns = $.originDns;
        this.originPort = $.originPort;
        this.originPortRange = $.originPortRange;
        this.protocol = $.protocol;
        this.proxyProtocol = $.proxyProtocol;
        this.tls = $.tls;
        this.trafficType = $.trafficType;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SpectrumApplicationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SpectrumApplicationState $;

        public Builder() {
            $ = new SpectrumApplicationState();
        }

        public Builder(SpectrumApplicationState defaults) {
            $ = new SpectrumApplicationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param argoSmartRouting . Enables Argo Smart Routing. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder argoSmartRouting(@Nullable Output<Boolean> argoSmartRouting) {
            $.argoSmartRouting = argoSmartRouting;
            return this;
        }

        /**
         * @param argoSmartRouting . Enables Argo Smart Routing. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder argoSmartRouting(Boolean argoSmartRouting) {
            return argoSmartRouting(Output.of(argoSmartRouting));
        }

        /**
         * @param dns The name and type of DNS record for the Spectrum application. Fields documented below.
         * 
         * @return builder
         * 
         */
        public Builder dns(@Nullable Output<SpectrumApplicationDnsArgs> dns) {
            $.dns = dns;
            return this;
        }

        /**
         * @param dns The name and type of DNS record for the Spectrum application. Fields documented below.
         * 
         * @return builder
         * 
         */
        public Builder dns(SpectrumApplicationDnsArgs dns) {
            return dns(Output.of(dns));
        }

        /**
         * @param edgeIpConnectivity . Choose which types of IP addresses will be provisioned for this subdomain. Valid values are: `all`, `ipv4`, `ipv6`. Defaults to `all`.
         * 
         * @return builder
         * 
         */
        public Builder edgeIpConnectivity(@Nullable Output<String> edgeIpConnectivity) {
            $.edgeIpConnectivity = edgeIpConnectivity;
            return this;
        }

        /**
         * @param edgeIpConnectivity . Choose which types of IP addresses will be provisioned for this subdomain. Valid values are: `all`, `ipv4`, `ipv6`. Defaults to `all`.
         * 
         * @return builder
         * 
         */
        public Builder edgeIpConnectivity(String edgeIpConnectivity) {
            return edgeIpConnectivity(Output.of(edgeIpConnectivity));
        }

        /**
         * @param edgeIps . A list of edge IPs (IPv4 and/or IPv6) to configure Spectrum application to. Requires [Bring Your Own IP](https://developers.cloudflare.com/spectrum/getting-started/byoip/) provisioned.
         * 
         * @return builder
         * 
         */
        public Builder edgeIps(@Nullable Output<List<String>> edgeIps) {
            $.edgeIps = edgeIps;
            return this;
        }

        /**
         * @param edgeIps . A list of edge IPs (IPv4 and/or IPv6) to configure Spectrum application to. Requires [Bring Your Own IP](https://developers.cloudflare.com/spectrum/getting-started/byoip/) provisioned.
         * 
         * @return builder
         * 
         */
        public Builder edgeIps(List<String> edgeIps) {
            return edgeIps(Output.of(edgeIps));
        }

        /**
         * @param edgeIps . A list of edge IPs (IPv4 and/or IPv6) to configure Spectrum application to. Requires [Bring Your Own IP](https://developers.cloudflare.com/spectrum/getting-started/byoip/) provisioned.
         * 
         * @return builder
         * 
         */
        public Builder edgeIps(String... edgeIps) {
            return edgeIps(List.of(edgeIps));
        }

        /**
         * @param ipFirewall Enables the IP Firewall for this application. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder ipFirewall(@Nullable Output<Boolean> ipFirewall) {
            $.ipFirewall = ipFirewall;
            return this;
        }

        /**
         * @param ipFirewall Enables the IP Firewall for this application. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder ipFirewall(Boolean ipFirewall) {
            return ipFirewall(Output.of(ipFirewall));
        }

        /**
         * @param originDirects A list of destination addresses to the origin. e.g. `tcp://192.0.2.1:22`.
         * 
         * @return builder
         * 
         */
        public Builder originDirects(@Nullable Output<List<String>> originDirects) {
            $.originDirects = originDirects;
            return this;
        }

        /**
         * @param originDirects A list of destination addresses to the origin. e.g. `tcp://192.0.2.1:22`.
         * 
         * @return builder
         * 
         */
        public Builder originDirects(List<String> originDirects) {
            return originDirects(Output.of(originDirects));
        }

        /**
         * @param originDirects A list of destination addresses to the origin. e.g. `tcp://192.0.2.1:22`.
         * 
         * @return builder
         * 
         */
        public Builder originDirects(String... originDirects) {
            return originDirects(List.of(originDirects));
        }

        /**
         * @param originDns A destination DNS addresses to the origin. Fields documented below.
         * 
         * @return builder
         * 
         */
        public Builder originDns(@Nullable Output<SpectrumApplicationOriginDnsArgs> originDns) {
            $.originDns = originDns;
            return this;
        }

        /**
         * @param originDns A destination DNS addresses to the origin. Fields documented below.
         * 
         * @return builder
         * 
         */
        public Builder originDns(SpectrumApplicationOriginDnsArgs originDns) {
            return originDns(Output.of(originDns));
        }

        /**
         * @param originPort If using `origin_dns` and not `origin_port_range`, this is a required attribute. Origin port to proxy traffice to e.g. `22`.
         * 
         * @return builder
         * 
         */
        public Builder originPort(@Nullable Output<Integer> originPort) {
            $.originPort = originPort;
            return this;
        }

        /**
         * @param originPort If using `origin_dns` and not `origin_port_range`, this is a required attribute. Origin port to proxy traffice to e.g. `22`.
         * 
         * @return builder
         * 
         */
        public Builder originPort(Integer originPort) {
            return originPort(Output.of(originPort));
        }

        /**
         * @param originPortRange If using `origin_dns` and not `origin_port`, this is a required attribute. Origin port range to proxy traffice to. When using a range, the protocol field must also specify a range, e.g. `tcp/22-23`. Fields documented below.
         * 
         * @return builder
         * 
         */
        public Builder originPortRange(@Nullable Output<SpectrumApplicationOriginPortRangeArgs> originPortRange) {
            $.originPortRange = originPortRange;
            return this;
        }

        /**
         * @param originPortRange If using `origin_dns` and not `origin_port`, this is a required attribute. Origin port range to proxy traffice to. When using a range, the protocol field must also specify a range, e.g. `tcp/22-23`. Fields documented below.
         * 
         * @return builder
         * 
         */
        public Builder originPortRange(SpectrumApplicationOriginPortRangeArgs originPortRange) {
            return originPortRange(Output.of(originPortRange));
        }

        /**
         * @param protocol The port configuration at Cloudflare’s edge. e.g. `tcp/22`.
         * 
         * @return builder
         * 
         */
        public Builder protocol(@Nullable Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol The port configuration at Cloudflare’s edge. e.g. `tcp/22`.
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        /**
         * @param proxyProtocol Enables a proxy protocol to the origin. Valid values are: `off`, `v1`, `v2`, and `simple`. Defaults to `off`.
         * 
         * @return builder
         * 
         */
        public Builder proxyProtocol(@Nullable Output<String> proxyProtocol) {
            $.proxyProtocol = proxyProtocol;
            return this;
        }

        /**
         * @param proxyProtocol Enables a proxy protocol to the origin. Valid values are: `off`, `v1`, `v2`, and `simple`. Defaults to `off`.
         * 
         * @return builder
         * 
         */
        public Builder proxyProtocol(String proxyProtocol) {
            return proxyProtocol(Output.of(proxyProtocol));
        }

        /**
         * @param tls TLS configuration option for Cloudflare to connect to your origin. Valid values are: `off`, `flexible`, `full` and `strict`. Defaults to `off`.
         * 
         * @return builder
         * 
         */
        public Builder tls(@Nullable Output<String> tls) {
            $.tls = tls;
            return this;
        }

        /**
         * @param tls TLS configuration option for Cloudflare to connect to your origin. Valid values are: `off`, `flexible`, `full` and `strict`. Defaults to `off`.
         * 
         * @return builder
         * 
         */
        public Builder tls(String tls) {
            return tls(Output.of(tls));
        }

        /**
         * @param trafficType Sets application type. Valid values are: `direct`, `http`, `https`. Defaults to `direct`.
         * 
         * @return builder
         * 
         */
        public Builder trafficType(@Nullable Output<String> trafficType) {
            $.trafficType = trafficType;
            return this;
        }

        /**
         * @param trafficType Sets application type. Valid values are: `direct`, `http`, `https`. Defaults to `direct`.
         * 
         * @return builder
         * 
         */
        public Builder trafficType(String trafficType) {
            return trafficType(Output.of(trafficType));
        }

        /**
         * @param zoneId The DNS zone ID to add the application to
         * 
         * @return builder
         * 
         */
        public Builder zoneId(@Nullable Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The DNS zone ID to add the application to
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public SpectrumApplicationState build() {
            return $;
        }
    }

}
