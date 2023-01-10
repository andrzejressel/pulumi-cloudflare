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
 * Provides a Cloudflare Load Balancer pool resource. This provides a pool of origins that can be used by a Cloudflare Load Balancer. Note that the load balancing feature must be enabled in your Cloudflare account before you can use this resource.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="cloudflare:index/loadBalancerPool:LoadBalancerPool")
public class LoadBalancerPool extends com.pulumi.resources.CustomResource {
    /**
     * The account identifier to target for the resource.
     * 
     */
    @Export(name="accountId", type=String.class, parameters={})
    private Output</* @Nullable */ String> accountId;

    /**
     * @return The account identifier to target for the resource.
     * 
     */
    public Output<Optional<String>> accountId() {
        return Codegen.optional(this.accountId);
    }
    /**
     * A list of regions (specified by region code) from which to run health checks. Empty means every Cloudflare data center (the default), but requires an Enterprise plan. Region codes can be found [here](https://developers.cloudflare.com/load-balancing/reference/region-mapping-api).
     * 
     */
    @Export(name="checkRegions", type=List.class, parameters={String.class})
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
    @Export(name="createdOn", type=String.class, parameters={})
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
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Free text description.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Whether to enable (the default) this origin within the Pool. Disabled origins will not receive traffic and are excluded from health checks. The origin will only be disabled for the current pool.
     * 
     */
    @Export(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Whether to enable (the default) this origin within the Pool. Disabled origins will not receive traffic and are excluded from health checks. The origin will only be disabled for the current pool.
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * The latitude this pool is physically located at; used for proximity steering. Values should be between -90 and 90.
     * 
     */
    @Export(name="latitude", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> latitude;

    /**
     * @return The latitude this pool is physically located at; used for proximity steering. Values should be between -90 and 90.
     * 
     */
    public Output<Optional<Double>> latitude() {
        return Codegen.optional(this.latitude);
    }
    /**
     * Setting for controlling load shedding for this pool.
     * 
     */
    @Export(name="loadSheddings", type=List.class, parameters={LoadBalancerPoolLoadShedding.class})
    private Output</* @Nullable */ List<LoadBalancerPoolLoadShedding>> loadSheddings;

    /**
     * @return Setting for controlling load shedding for this pool.
     * 
     */
    public Output<Optional<List<LoadBalancerPoolLoadShedding>>> loadSheddings() {
        return Codegen.optional(this.loadSheddings);
    }
    /**
     * The longitude this pool is physically located at; used for proximity steering. Values should be between -180 and 180.
     * 
     */
    @Export(name="longitude", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> longitude;

    /**
     * @return The longitude this pool is physically located at; used for proximity steering. Values should be between -180 and 180.
     * 
     */
    public Output<Optional<Double>> longitude() {
        return Codegen.optional(this.longitude);
    }
    /**
     * The minimum number of origins that must be healthy for this pool to serve traffic. If the number of healthy origins falls below this number, the pool will be marked unhealthy and we will failover to the next available pool. Default: 1.
     * 
     */
    @Export(name="minimumOrigins", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> minimumOrigins;

    /**
     * @return The minimum number of origins that must be healthy for this pool to serve traffic. If the number of healthy origins falls below this number, the pool will be marked unhealthy and we will failover to the next available pool. Default: 1.
     * 
     */
    public Output<Optional<Integer>> minimumOrigins() {
        return Codegen.optional(this.minimumOrigins);
    }
    /**
     * The RFC3339 timestamp of when the load balancer was last modified.
     * 
     */
    @Export(name="modifiedOn", type=String.class, parameters={})
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
    @Export(name="monitor", type=String.class, parameters={})
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
    @Export(name="name", type=String.class, parameters={})
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
    @Export(name="notificationEmail", type=String.class, parameters={})
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
    @Export(name="originSteerings", type=List.class, parameters={LoadBalancerPoolOriginSteering.class})
    private Output</* @Nullable */ List<LoadBalancerPoolOriginSteering>> originSteerings;

    /**
     * @return Set an origin steering policy to control origin selection within a pool.
     * 
     */
    public Output<Optional<List<LoadBalancerPoolOriginSteering>>> originSteerings() {
        return Codegen.optional(this.originSteerings);
    }
    /**
     * The list of origins within this pool. Traffic directed at this pool is balanced across all currently healthy origins, provided the pool itself is healthy. It&#39;s a complex value. See description below.
     * 
     */
    @Export(name="origins", type=List.class, parameters={LoadBalancerPoolOrigin.class})
    private Output<List<LoadBalancerPoolOrigin>> origins;

    /**
     * @return The list of origins within this pool. Traffic directed at this pool is balanced across all currently healthy origins, provided the pool itself is healthy. It&#39;s a complex value. See description below.
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