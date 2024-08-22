// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.ZeroTrustDnsLocationArgs;
import com.pulumi.cloudflare.inputs.ZeroTrustDnsLocationState;
import com.pulumi.cloudflare.outputs.ZeroTrustDnsLocationNetwork;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Cloudflare Teams Location resource. Teams Locations are
 * referenced when creating secure web gateway policies.
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
 * import com.pulumi.cloudflare.ZeroTrustDnsLocation;
 * import com.pulumi.cloudflare.ZeroTrustDnsLocationArgs;
 * import com.pulumi.cloudflare.inputs.ZeroTrustDnsLocationNetworkArgs;
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
 *         var example = new ZeroTrustDnsLocation("example", ZeroTrustDnsLocationArgs.builder()
 *             .accountId("f037e56e89293a057740de681ac9abbe")
 *             .name("office")
 *             .clientDefault(true)
 *             .ecsSupport(false)
 *             .networks(            
 *                 ZeroTrustDnsLocationNetworkArgs.builder()
 *                     .network("203.0.113.1/32")
 *                     .build(),
 *                 ZeroTrustDnsLocationNetworkArgs.builder()
 *                     .network("203.0.113.2/32")
 *                     .build())
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
 * $ pulumi import cloudflare:index/zeroTrustDnsLocation:ZeroTrustDnsLocation example &lt;account_id&gt;/&lt;teams_location_id&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/zeroTrustDnsLocation:ZeroTrustDnsLocation")
public class ZeroTrustDnsLocation extends com.pulumi.resources.CustomResource {
    /**
     * The account identifier to target for the resource.
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    /**
     * @return The account identifier to target for the resource.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * Indicator that anonymized logs are enabled.
     * 
     */
    @Export(name="anonymizedLogsEnabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> anonymizedLogsEnabled;

    /**
     * @return Indicator that anonymized logs are enabled.
     * 
     */
    public Output<Boolean> anonymizedLogsEnabled() {
        return this.anonymizedLogsEnabled;
    }
    /**
     * Indicator that this is the default location.
     * 
     */
    @Export(name="clientDefault", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> clientDefault;

    /**
     * @return Indicator that this is the default location.
     * 
     */
    public Output<Optional<Boolean>> clientDefault() {
        return Codegen.optional(this.clientDefault);
    }
    /**
     * The FQDN that DoH clients should be pointed at.
     * 
     */
    @Export(name="dohSubdomain", refs={String.class}, tree="[0]")
    private Output<String> dohSubdomain;

    /**
     * @return The FQDN that DoH clients should be pointed at.
     * 
     */
    public Output<String> dohSubdomain() {
        return this.dohSubdomain;
    }
    /**
     * Indicator that this location needs to resolve EDNS queries.
     * 
     */
    @Export(name="ecsSupport", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> ecsSupport;

    /**
     * @return Indicator that this location needs to resolve EDNS queries.
     * 
     */
    public Output<Optional<Boolean>> ecsSupport() {
        return Codegen.optional(this.ecsSupport);
    }
    /**
     * Client IP address.
     * 
     */
    @Export(name="ip", refs={String.class}, tree="[0]")
    private Output<String> ip;

    /**
     * @return Client IP address.
     * 
     */
    public Output<String> ip() {
        return this.ip;
    }
    /**
     * IP to direct all IPv4 DNS queries to.
     * 
     */
    @Export(name="ipv4Destination", refs={String.class}, tree="[0]")
    private Output<String> ipv4Destination;

    /**
     * @return IP to direct all IPv4 DNS queries to.
     * 
     */
    public Output<String> ipv4Destination() {
        return this.ipv4Destination;
    }
    /**
     * Name of the teams location.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the teams location.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The networks CIDRs that comprise the location.
     * 
     */
    @Export(name="networks", refs={List.class,ZeroTrustDnsLocationNetwork.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ZeroTrustDnsLocationNetwork>> networks;

    /**
     * @return The networks CIDRs that comprise the location.
     * 
     */
    public Output<Optional<List<ZeroTrustDnsLocationNetwork>>> networks() {
        return Codegen.optional(this.networks);
    }
    @Export(name="policyIds", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> policyIds;

    public Output<List<String>> policyIds() {
        return this.policyIds;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ZeroTrustDnsLocation(java.lang.String name) {
        this(name, ZeroTrustDnsLocationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ZeroTrustDnsLocation(java.lang.String name, ZeroTrustDnsLocationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ZeroTrustDnsLocation(java.lang.String name, ZeroTrustDnsLocationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/zeroTrustDnsLocation:ZeroTrustDnsLocation", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ZeroTrustDnsLocation(java.lang.String name, Output<java.lang.String> id, @Nullable ZeroTrustDnsLocationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/zeroTrustDnsLocation:ZeroTrustDnsLocation", name, state, makeResourceOptions(options, id), false);
    }

    private static ZeroTrustDnsLocationArgs makeArgs(ZeroTrustDnsLocationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ZeroTrustDnsLocationArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
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
    public static ZeroTrustDnsLocation get(java.lang.String name, Output<java.lang.String> id, @Nullable ZeroTrustDnsLocationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ZeroTrustDnsLocation(name, id, state, options);
    }
}
