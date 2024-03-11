// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.SpectrumApplicationArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.SpectrumApplicationState;
import com.pulumi.cloudflare.outputs.SpectrumApplicationDns;
import com.pulumi.cloudflare.outputs.SpectrumApplicationEdgeIps;
import com.pulumi.cloudflare.outputs.SpectrumApplicationOriginDns;
import com.pulumi.cloudflare.outputs.SpectrumApplicationOriginPortRange;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Cloudflare Spectrum Application. You can extend the power
 * of Cloudflare&#39;s DDoS, TLS, and IP Firewall to your other TCP-based
 * services.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.cloudflare.SpectrumApplication;
 * import com.pulumi.cloudflare.SpectrumApplicationArgs;
 * import com.pulumi.cloudflare.inputs.SpectrumApplicationDnsArgs;
 * import com.pulumi.cloudflare.inputs.SpectrumApplicationEdgeIpsArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new SpectrumApplication(&#34;example&#34;, SpectrumApplicationArgs.builder()        
 *             .dns(SpectrumApplicationDnsArgs.builder()
 *                 .name(&#34;ssh.example.com&#34;)
 *                 .type(&#34;CNAME&#34;)
 *                 .build())
 *             .edgeIps(SpectrumApplicationEdgeIpsArgs.builder()
 *                 .ips(                
 *                     &#34;203.0.113.1&#34;,
 *                     &#34;203.0.113.2&#34;)
 *                 .type(&#34;static&#34;)
 *                 .build())
 *             .originDirects(&#34;tcp://192.0.2.1:22&#34;)
 *             .protocol(&#34;tcp/22&#34;)
 *             .trafficType(&#34;direct&#34;)
 *             .zoneId(&#34;0da42c8d2132a9ddaf714f9e7c920711&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import cloudflare:index/spectrumApplication:SpectrumApplication example &lt;zone_id&gt;/&lt;spectrum_application_id&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/spectrumApplication:SpectrumApplication")
public class SpectrumApplication extends com.pulumi.resources.CustomResource {
    /**
     * Enables Argo Smart Routing.
     * 
     */
    @Export(name="argoSmartRouting", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> argoSmartRouting;

    /**
     * @return Enables Argo Smart Routing.
     * 
     */
    public Output<Boolean> argoSmartRouting() {
        return this.argoSmartRouting;
    }
    /**
     * The name and type of DNS record for the Spectrum application.
     * 
     */
    @Export(name="dns", refs={SpectrumApplicationDns.class}, tree="[0]")
    private Output<SpectrumApplicationDns> dns;

    /**
     * @return The name and type of DNS record for the Spectrum application.
     * 
     */
    public Output<SpectrumApplicationDns> dns() {
        return this.dns;
    }
    /**
     * The anycast edge IP configuration for the hostname of this application.
     * 
     */
    @Export(name="edgeIps", refs={SpectrumApplicationEdgeIps.class}, tree="[0]")
    private Output<SpectrumApplicationEdgeIps> edgeIps;

    /**
     * @return The anycast edge IP configuration for the hostname of this application.
     * 
     */
    public Output<SpectrumApplicationEdgeIps> edgeIps() {
        return this.edgeIps;
    }
    /**
     * Enables the IP Firewall for this application.
     * 
     */
    @Export(name="ipFirewall", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> ipFirewall;

    /**
     * @return Enables the IP Firewall for this application.
     * 
     */
    public Output<Boolean> ipFirewall() {
        return this.ipFirewall;
    }
    /**
     * A list of destination addresses to the origin. e.g. `tcp://192.0.2.1:22`.
     * 
     */
    @Export(name="originDirects", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> originDirects;

    /**
     * @return A list of destination addresses to the origin. e.g. `tcp://192.0.2.1:22`.
     * 
     */
    public Output<Optional<List<String>>> originDirects() {
        return Codegen.optional(this.originDirects);
    }
    /**
     * A destination DNS addresses to the origin.
     * 
     */
    @Export(name="originDns", refs={SpectrumApplicationOriginDns.class}, tree="[0]")
    private Output</* @Nullable */ SpectrumApplicationOriginDns> originDns;

    /**
     * @return A destination DNS addresses to the origin.
     * 
     */
    public Output<Optional<SpectrumApplicationOriginDns>> originDns() {
        return Codegen.optional(this.originDns);
    }
    /**
     * Origin port to proxy traffice to. Conflicts with `origin_port_range`.
     * 
     */
    @Export(name="originPort", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> originPort;

    /**
     * @return Origin port to proxy traffice to. Conflicts with `origin_port_range`.
     * 
     */
    public Output<Optional<Integer>> originPort() {
        return Codegen.optional(this.originPort);
    }
    /**
     * Origin port range to proxy traffice to. When using a range, the protocol field must also specify a range, e.g. `tcp/22-23`. Conflicts with `origin_port`.
     * 
     */
    @Export(name="originPortRange", refs={SpectrumApplicationOriginPortRange.class}, tree="[0]")
    private Output</* @Nullable */ SpectrumApplicationOriginPortRange> originPortRange;

    /**
     * @return Origin port range to proxy traffice to. When using a range, the protocol field must also specify a range, e.g. `tcp/22-23`. Conflicts with `origin_port`.
     * 
     */
    public Output<Optional<SpectrumApplicationOriginPortRange>> originPortRange() {
        return Codegen.optional(this.originPortRange);
    }
    /**
     * The port configuration at Cloudflare&#39;s edge. e.g. `tcp/22`.
     * 
     */
    @Export(name="protocol", refs={String.class}, tree="[0]")
    private Output<String> protocol;

    /**
     * @return The port configuration at Cloudflare&#39;s edge. e.g. `tcp/22`.
     * 
     */
    public Output<String> protocol() {
        return this.protocol;
    }
    /**
     * Enables a proxy protocol to the origin. Available values: `off`, `v1`, `v2`, `simple`.
     * 
     */
    @Export(name="proxyProtocol", refs={String.class}, tree="[0]")
    private Output<String> proxyProtocol;

    /**
     * @return Enables a proxy protocol to the origin. Available values: `off`, `v1`, `v2`, `simple`.
     * 
     */
    public Output<String> proxyProtocol() {
        return this.proxyProtocol;
    }
    /**
     * TLS configuration option for Cloudflare to connect to your origin. Available values: `off`, `flexible`, `full`, `strict`.
     * 
     */
    @Export(name="tls", refs={String.class}, tree="[0]")
    private Output<String> tls;

    /**
     * @return TLS configuration option for Cloudflare to connect to your origin. Available values: `off`, `flexible`, `full`, `strict`.
     * 
     */
    public Output<String> tls() {
        return this.tls;
    }
    /**
     * Sets application type. Available values: `direct`, `http`, `https`.
     * 
     */
    @Export(name="trafficType", refs={String.class}, tree="[0]")
    private Output<String> trafficType;

    /**
     * @return Sets application type. Available values: `direct`, `http`, `https`.
     * 
     */
    public Output<String> trafficType() {
        return this.trafficType;
    }
    /**
     * The zone identifier to target for the resource.
     * 
     */
    @Export(name="zoneId", refs={String.class}, tree="[0]")
    private Output<String> zoneId;

    /**
     * @return The zone identifier to target for the resource.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SpectrumApplication(String name) {
        this(name, SpectrumApplicationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SpectrumApplication(String name, SpectrumApplicationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SpectrumApplication(String name, SpectrumApplicationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/spectrumApplication:SpectrumApplication", name, args == null ? SpectrumApplicationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SpectrumApplication(String name, Output<String> id, @Nullable SpectrumApplicationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/spectrumApplication:SpectrumApplication", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static SpectrumApplication get(String name, Output<String> id, @Nullable SpectrumApplicationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SpectrumApplication(name, id, state, options);
    }
}
