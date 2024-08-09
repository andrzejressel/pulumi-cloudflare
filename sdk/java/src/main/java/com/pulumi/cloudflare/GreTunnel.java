// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.GreTunnelArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.GreTunnelState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a resource, that manages GRE tunnels for Magic Transit.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.cloudflare.GreTunnel;
 * import com.pulumi.cloudflare.GreTunnelArgs;
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
 *         var example = new GreTunnel("example", GreTunnelArgs.builder()
 *             .accountId("f037e56e89293a057740de681ac9abbe")
 *             .name("GRE_1")
 *             .customerGreEndpoint("203.0.113.1")
 *             .cloudflareGreEndpoint("203.0.113.2")
 *             .interfaceAddress("192.0.2.0/31")
 *             .description("Tunnel for ISP X")
 *             .ttl(64)
 *             .mtu(1476)
 *             .healthCheckEnabled(true)
 *             .healthCheckTarget("203.0.113.1")
 *             .healthCheckType("reply")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import cloudflare:index/greTunnel:GreTunnel example &lt;account_id&gt;/&lt;tunnel_id&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/greTunnel:GreTunnel")
public class GreTunnel extends com.pulumi.resources.CustomResource {
    /**
     * The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> accountId;

    /**
     * @return The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<Optional<String>> accountId() {
        return Codegen.optional(this.accountId);
    }
    /**
     * The IP address assigned to the Cloudflare side of the GRE tunnel.
     * 
     */
    @Export(name="cloudflareGreEndpoint", refs={String.class}, tree="[0]")
    private Output<String> cloudflareGreEndpoint;

    /**
     * @return The IP address assigned to the Cloudflare side of the GRE tunnel.
     * 
     */
    public Output<String> cloudflareGreEndpoint() {
        return this.cloudflareGreEndpoint;
    }
    /**
     * The IP address assigned to the customer side of the GRE tunnel.
     * 
     */
    @Export(name="customerGreEndpoint", refs={String.class}, tree="[0]")
    private Output<String> customerGreEndpoint;

    /**
     * @return The IP address assigned to the customer side of the GRE tunnel.
     * 
     */
    public Output<String> customerGreEndpoint() {
        return this.customerGreEndpoint;
    }
    /**
     * Description of the GRE tunnel intent.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the GRE tunnel intent.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Specifies if ICMP tunnel health checks are enabled.
     * 
     */
    @Export(name="healthCheckEnabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> healthCheckEnabled;

    /**
     * @return Specifies if ICMP tunnel health checks are enabled.
     * 
     */
    public Output<Boolean> healthCheckEnabled() {
        return this.healthCheckEnabled;
    }
    /**
     * The IP address of the customer endpoint that will receive tunnel health checks.
     * 
     */
    @Export(name="healthCheckTarget", refs={String.class}, tree="[0]")
    private Output<String> healthCheckTarget;

    /**
     * @return The IP address of the customer endpoint that will receive tunnel health checks.
     * 
     */
    public Output<String> healthCheckTarget() {
        return this.healthCheckTarget;
    }
    /**
     * Specifies the ICMP echo type for the health check. Available values: `request`, `reply`.
     * 
     */
    @Export(name="healthCheckType", refs={String.class}, tree="[0]")
    private Output<String> healthCheckType;

    /**
     * @return Specifies the ICMP echo type for the health check. Available values: `request`, `reply`.
     * 
     */
    public Output<String> healthCheckType() {
        return this.healthCheckType;
    }
    /**
     * 31-bit prefix (/31 in CIDR notation) supporting 2 hosts, one for each side of the tunnel.
     * 
     */
    @Export(name="interfaceAddress", refs={String.class}, tree="[0]")
    private Output<String> interfaceAddress;

    /**
     * @return 31-bit prefix (/31 in CIDR notation) supporting 2 hosts, one for each side of the tunnel.
     * 
     */
    public Output<String> interfaceAddress() {
        return this.interfaceAddress;
    }
    /**
     * Maximum Transmission Unit (MTU) in bytes for the GRE tunnel.
     * 
     */
    @Export(name="mtu", refs={Integer.class}, tree="[0]")
    private Output<Integer> mtu;

    /**
     * @return Maximum Transmission Unit (MTU) in bytes for the GRE tunnel.
     * 
     */
    public Output<Integer> mtu() {
        return this.mtu;
    }
    /**
     * Name of the GRE tunnel.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the GRE tunnel.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Time To Live (TTL) in number of hops of the GRE tunnel.
     * 
     */
    @Export(name="ttl", refs={Integer.class}, tree="[0]")
    private Output<Integer> ttl;

    /**
     * @return Time To Live (TTL) in number of hops of the GRE tunnel.
     * 
     */
    public Output<Integer> ttl() {
        return this.ttl;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GreTunnel(String name) {
        this(name, GreTunnelArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GreTunnel(String name, GreTunnelArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GreTunnel(String name, GreTunnelArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/greTunnel:GreTunnel", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private GreTunnel(String name, Output<String> id, @Nullable GreTunnelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/greTunnel:GreTunnel", name, state, makeResourceOptions(options, id));
    }

    private static GreTunnelArgs makeArgs(GreTunnelArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? GreTunnelArgs.Empty : args;
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
    public static GreTunnel get(String name, Output<String> id, @Nullable GreTunnelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GreTunnel(name, id, state, options);
    }
}
