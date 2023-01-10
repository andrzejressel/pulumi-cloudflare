// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.WafOverrideArgs;
import com.pulumi.cloudflare.inputs.WafOverrideState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Cloudflare WAF override resource. This enables the ability to toggle
 * WAF rules and groups on or off based on URIs.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.cloudflare.WafOverride;
 * import com.pulumi.cloudflare.WafOverrideArgs;
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
 *         var shopEcxample = new WafOverride(&#34;shopEcxample&#34;, WafOverrideArgs.builder()        
 *             .zoneId(&#34;1d5fdc9e88c8a8c4518b068cd94331fe&#34;)
 *             .urls(            
 *                 &#34;example.com/no-waf-here&#34;,
 *                 &#34;example.com/another/path/*&#34;)
 *             .rules(Map.of(&#34;100015&#34;, &#34;disable&#34;))
 *             .groups(Map.of(&#34;ea8687e59929c1fd05ba97574ad43f77&#34;, &#34;default&#34;))
 *             .rewriteAction(Map.ofEntries(
 *                 Map.entry(&#34;default&#34;, &#34;block&#34;),
 *                 Map.entry(&#34;challenge&#34;, &#34;block&#34;)
 *             ))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * WAF Overrides can be imported using a composite ID formed of zone ID and override ID.
 * 
 * ```sh
 *  $ pulumi import cloudflare:index/wafOverride:WafOverride my_example_waf_override 3abe5b950053dbddf1516d89f9ef1e8a/9d4e66d7649c178663bf62e06dbacb23
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/wafOverride:WafOverride")
public class WafOverride extends com.pulumi.resources.CustomResource {
    /**
     * Description of what the WAF override does.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of what the WAF override does.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Similar to `rules`; which WAF groups you want to alter.
     * 
     */
    @Export(name="groups", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> groups;

    /**
     * @return Similar to `rules`; which WAF groups you want to alter.
     * 
     */
    public Output<Optional<Map<String,String>>> groups() {
        return Codegen.optional(this.groups);
    }
    @Export(name="overrideId", type=String.class, parameters={})
    private Output<String> overrideId;

    public Output<String> overrideId() {
        return this.overrideId;
    }
    /**
     * Whether this package is currently paused.
     * 
     */
    @Export(name="paused", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> paused;

    /**
     * @return Whether this package is currently paused.
     * 
     */
    public Output<Optional<Boolean>> paused() {
        return Codegen.optional(this.paused);
    }
    /**
     * Relative priority of this configuration when multiple configurations match a single URL.
     * 
     */
    @Export(name="priority", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> priority;

    /**
     * @return Relative priority of this configuration when multiple configurations match a single URL.
     * 
     */
    public Output<Optional<Integer>> priority() {
        return Codegen.optional(this.priority);
    }
    /**
     * When a WAF rule matches, substitute its configured action for a different action specified by this definition.
     * 
     */
    @Export(name="rewriteAction", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> rewriteAction;

    /**
     * @return When a WAF rule matches, substitute its configured action for a different action specified by this definition.
     * 
     */
    public Output<Optional<Map<String,String>>> rewriteAction() {
        return Codegen.optional(this.rewriteAction);
    }
    /**
     * A list of WAF rule ID to rule action you intend to apply.
     * 
     */
    @Export(name="rules", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> rules;

    /**
     * @return A list of WAF rule ID to rule action you intend to apply.
     * 
     */
    public Output<Optional<Map<String,String>>> rules() {
        return Codegen.optional(this.rules);
    }
    /**
     * An array of URLs to apply the WAF override to.
     * 
     */
    @Export(name="urls", type=List.class, parameters={String.class})
    private Output<List<String>> urls;

    /**
     * @return An array of URLs to apply the WAF override to.
     * 
     */
    public Output<List<String>> urls() {
        return this.urls;
    }
    /**
     * The DNS zone to which the WAF override condition should be added.
     * 
     */
    @Export(name="zoneId", type=String.class, parameters={})
    private Output<String> zoneId;

    /**
     * @return The DNS zone to which the WAF override condition should be added.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WafOverride(String name) {
        this(name, WafOverrideArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WafOverride(String name, WafOverrideArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WafOverride(String name, WafOverrideArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/wafOverride:WafOverride", name, args == null ? WafOverrideArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private WafOverride(String name, Output<String> id, @Nullable WafOverrideState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/wafOverride:WafOverride", name, state, makeResourceOptions(options, id));
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
    public static WafOverride get(String name, Output<String> id, @Nullable WafOverrideState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new WafOverride(name, id, state, options);
    }
}