// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.ArgoArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.ArgoState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Cloudflare Argo controls the routing to your origin and tiered
 * caching options to speed up your website browsing experience.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.cloudflare.Argo;
 * import com.pulumi.cloudflare.ArgoArgs;
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
 *         var example = new Argo(&#34;example&#34;, ArgoArgs.builder()        
 *             .smartRouting(&#34;on&#34;)
 *             .tieredCaching(&#34;on&#34;)
 *             .zoneId(&#34;0da42c8d2132a9ddaf714f9e7c920711&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * ```sh
 *  $ pulumi import cloudflare:index/argo:Argo example &lt;zone_id&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/argo:Argo")
public class Argo extends com.pulumi.resources.CustomResource {
    /**
     * Whether smart routing is enabled. Available values: `on`, `off`.
     * 
     */
    @Export(name="smartRouting", type=String.class, parameters={})
    private Output</* @Nullable */ String> smartRouting;

    /**
     * @return Whether smart routing is enabled. Available values: `on`, `off`.
     * 
     */
    public Output<Optional<String>> smartRouting() {
        return Codegen.optional(this.smartRouting);
    }
    /**
     * Whether tiered caching is enabled. Available values: `on`, `off`.
     * 
     */
    @Export(name="tieredCaching", type=String.class, parameters={})
    private Output</* @Nullable */ String> tieredCaching;

    /**
     * @return Whether tiered caching is enabled. Available values: `on`, `off`.
     * 
     */
    public Output<Optional<String>> tieredCaching() {
        return Codegen.optional(this.tieredCaching);
    }
    /**
     * The zone identifier to target for the resource.
     * 
     */
    @Export(name="zoneId", type=String.class, parameters={})
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
    public Argo(String name) {
        this(name, ArgoArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Argo(String name, ArgoArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Argo(String name, ArgoArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/argo:Argo", name, args == null ? ArgoArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Argo(String name, Output<String> id, @Nullable ArgoState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/argo:Argo", name, state, makeResourceOptions(options, id));
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
    public static Argo get(String name, Output<String> id, @Nullable ArgoState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Argo(name, id, state, options);
    }
}
