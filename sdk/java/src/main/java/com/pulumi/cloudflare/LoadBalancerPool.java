// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.LoadBalancerPoolArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.LoadBalancerPoolState;
import com.pulumi.cloudflare.outputs.LoadBalancerPoolLoadShedding;
import com.pulumi.cloudflare.outputs.LoadBalancerPoolOrigin;
import com.pulumi.cloudflare.outputs.LoadBalancerPoolOriginSteering;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Cloudflare Load Balancer pool resource. This provides a
 * pool of origins that can be used by a Cloudflare Load Balancer.
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
 * import com.pulumi.cloudflare.LoadBalancerPool;
 * import com.pulumi.cloudflare.LoadBalancerPoolArgs;
 * import com.pulumi.cloudflare.inputs.LoadBalancerPoolLoadSheddingArgs;
 * import com.pulumi.cloudflare.inputs.LoadBalancerPoolOriginSteeringArgs;
 * import com.pulumi.cloudflare.inputs.LoadBalancerPoolOriginArgs;
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
 *         var example = new LoadBalancerPool(&#34;example&#34;, LoadBalancerPoolArgs.builder()        
 *             .accountId(&#34;f037e56e89293a057740de681ac9abbe&#34;)
 *             .description(&#34;example load balancer pool&#34;)
 *             .enabled(false)
 *             .latitude(55)
 *             .loadSheddings(LoadBalancerPoolLoadSheddingArgs.builder()
 *                 .defaultPercent(55)
 *                 .defaultPolicy(&#34;random&#34;)
 *                 .sessionPercent(12)
 *                 .sessionPolicy(&#34;hash&#34;)
 *                 .build())
 *             .longitude(&#34;TODO: GenUnaryOpExpression&#34;)
 *             .minimumOrigins(1)
 *             .name(&#34;example-pool&#34;)
 *             .notificationEmail(&#34;someone@example.com&#34;)
 *             .originSteerings(LoadBalancerPoolOriginSteeringArgs.builder()
 *                 .policy(&#34;random&#34;)
 *                 .build())
 *             .origins(            
 *                 LoadBalancerPoolOriginArgs.builder()
 *                     .address(&#34;192.0.2.1&#34;)
 *                     .enabled(false)
 *                     .headers(LoadBalancerPoolOriginHeaderArgs.builder()
 *                         .header(&#34;Host&#34;)
 *                         .values(&#34;example-1&#34;)
 *                         .build())
 *                     .name(&#34;example-1&#34;)
 *                     .build(),
 *                 LoadBalancerPoolOriginArgs.builder()
 *                     .address(&#34;192.0.2.2&#34;)
 *                     .headers(LoadBalancerPoolOriginHeaderArgs.builder()
 *                         .header(&#34;Host&#34;)
 *                         .values(&#34;example-2&#34;)
 *                         .build())
 *                     .name(&#34;example-2&#34;)
 *                     .build())
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
 * $ pulumi import cloudflare:index/loadBalancerPool:LoadBalancerPool example &lt;account_id&gt;/&lt;load_balancer_pool_id&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/loadBalancerPool:LoadBalancerPool")
public class LoadBalancerPool extends com.pulumi.resources.CustomResource {
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
     * A list of regions (specified by region code) from which to run health checks. Empty means every Cloudflare data center (the default), but requires an Enterprise plan. Region codes can be found [here](https://developers.cloudflare.com/load-balancing/reference/region-mapping-api).
     * 
     */
    @Export(name="checkRegions", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> checkRegions;

    /**
     * @return A list of regions (specified by region code) from which to run health checks. Empty means every Cloudflare data center (the default), but requires an Enterprise plan. Region codes can be found [here](https://developers.cloudflare.com/load-balancing/reference/region-mapping-api).
     * 
     */
    public Output<List<String>> checkRegions() {
        return this.checkRegions;
    }
    /**
     * The RFC3339 timestamp of when the load balancer was created.
     * 
     */
    @Export(name="createdOn", refs={String.class}, tree="[0]")
    private Output<String> createdOn;

    /**
     * @return The RFC3339 timestamp of when the load balancer was created.
     * 
     */
    public Output<String> createdOn() {
        return this.createdOn;
    }
    /**
     * Free text description.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Free text description.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Whether this origin is enabled. Disabled origins will not receive traffic and are excluded from health checks. Defaults to `true`.
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Whether this origin is enabled. Disabled origins will not receive traffic and are excluded from health checks. Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * The latitude this pool is physically located at; used for proximity steering.
     * 
     */
    @Export(name="latitude", refs={Double.class}, tree="[0]")
    private Output</* @Nullable */ Double> latitude;

    /**
     * @return The latitude this pool is physically located at; used for proximity steering.
     * 
     */
    public Output<Optional<Double>> latitude() {
        return Codegen.optional(this.latitude);
    }
    /**
     * Setting for controlling load shedding for this pool.
     * 
     */
    @Export(name="loadSheddings", refs={List.class,LoadBalancerPoolLoadShedding.class}, tree="[0,1]")
    private Output</* @Nullable */ List<LoadBalancerPoolLoadShedding>> loadSheddings;

    /**
     * @return Setting for controlling load shedding for this pool.
     * 
     */
    public Output<Optional<List<LoadBalancerPoolLoadShedding>>> loadSheddings() {
        return Codegen.optional(this.loadSheddings);
    }
    /**
     * The longitude this pool is physically located at; used for proximity steering.
     * 
     */
    @Export(name="longitude", refs={Double.class}, tree="[0]")
    private Output</* @Nullable */ Double> longitude;

    /**
     * @return The longitude this pool is physically located at; used for proximity steering.
     * 
     */
    public Output<Optional<Double>> longitude() {
        return Codegen.optional(this.longitude);
    }
    /**
     * The minimum number of origins that must be healthy for this pool to serve traffic. If the number of healthy origins falls below this number, the pool will be marked unhealthy and we will failover to the next available pool. Defaults to `1`.
     * 
     */
    @Export(name="minimumOrigins", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> minimumOrigins;

    /**
     * @return The minimum number of origins that must be healthy for this pool to serve traffic. If the number of healthy origins falls below this number, the pool will be marked unhealthy and we will failover to the next available pool. Defaults to `1`.
     * 
     */
    public Output<Optional<Integer>> minimumOrigins() {
        return Codegen.optional(this.minimumOrigins);
    }
    /**
     * The RFC3339 timestamp of when the load balancer was last modified.
     * 
     */
    @Export(name="modifiedOn", refs={String.class}, tree="[0]")
    private Output<String> modifiedOn;

    /**
     * @return The RFC3339 timestamp of when the load balancer was last modified.
     * 
     */
    public Output<String> modifiedOn() {
        return this.modifiedOn;
    }
    /**
     * The ID of the Monitor to use for health checking origins within this pool.
     * 
     */
    @Export(name="monitor", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> monitor;

    /**
     * @return The ID of the Monitor to use for health checking origins within this pool.
     * 
     */
    public Output<Optional<String>> monitor() {
        return Codegen.optional(this.monitor);
    }
    /**
     * A human-identifiable name for the origin.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return A human-identifiable name for the origin.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The email address to send health status notifications to. This can be an individual mailbox or a mailing list. Multiple emails can be supplied as a comma delimited list.
     * 
     */
    @Export(name="notificationEmail", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> notificationEmail;

    /**
     * @return The email address to send health status notifications to. This can be an individual mailbox or a mailing list. Multiple emails can be supplied as a comma delimited list.
     * 
     */
    public Output<Optional<String>> notificationEmail() {
        return Codegen.optional(this.notificationEmail);
    }
    /**
     * Set an origin steering policy to control origin selection within a pool.
     * 
     */
    @Export(name="originSteerings", refs={List.class,LoadBalancerPoolOriginSteering.class}, tree="[0,1]")
    private Output</* @Nullable */ List<LoadBalancerPoolOriginSteering>> originSteerings;

    /**
     * @return Set an origin steering policy to control origin selection within a pool.
     * 
     */
    public Output<Optional<List<LoadBalancerPoolOriginSteering>>> originSteerings() {
        return Codegen.optional(this.originSteerings);
    }
    /**
     * The list of origins within this pool. Traffic directed at this pool is balanced across all currently healthy origins, provided the pool itself is healthy.
     * 
     */
    @Export(name="origins", refs={List.class,LoadBalancerPoolOrigin.class}, tree="[0,1]")
    private Output<List<LoadBalancerPoolOrigin>> origins;

    /**
     * @return The list of origins within this pool. Traffic directed at this pool is balanced across all currently healthy origins, provided the pool itself is healthy.
     * 
     */
    public Output<List<LoadBalancerPoolOrigin>> origins() {
        return this.origins;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LoadBalancerPool(String name) {
        this(name, LoadBalancerPoolArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LoadBalancerPool(String name, LoadBalancerPoolArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LoadBalancerPool(String name, LoadBalancerPoolArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/loadBalancerPool:LoadBalancerPool", name, args == null ? LoadBalancerPoolArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LoadBalancerPool(String name, Output<String> id, @Nullable LoadBalancerPoolState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/loadBalancerPool:LoadBalancerPool", name, state, makeResourceOptions(options, id));
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
    public static LoadBalancerPool get(String name, Output<String> id, @Nullable LoadBalancerPoolState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LoadBalancerPool(name, id, state, options);
    }
}
