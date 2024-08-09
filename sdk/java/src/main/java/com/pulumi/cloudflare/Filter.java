// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.FilterArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.FilterState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Filter expressions that can be referenced across multiple features,
 * e.g. Firewall Rules. See [what is a filter](https://developers.cloudflare.com/firewall/api/cf-filters/what-is-a-filter/)
 * for more details and available fields and operators.
 * 
 * &gt; `cloudflare.Filter` is in a deprecation phase until January 15th, 2025.
 *   During this time period, this resource is still fully
 *   supported but you are strongly advised to move to the
 *   `cloudflare.Ruleset` resource. Full details can be found in the
 *   developer documentation.
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
 * import com.pulumi.cloudflare.Filter;
 * import com.pulumi.cloudflare.FilterArgs;
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
 *         var wordpress = new Filter("wordpress", FilterArgs.builder()
 *             .zoneId("0da42c8d2132a9ddaf714f9e7c920711")
 *             .description("Wordpress break-in attempts that are outside of the office")
 *             .expression("(http.request.uri.path ~ \".*wp-login.php\" or http.request.uri.path ~ \".*xmlrpc.php\") and ip.src ne 192.0.2.1")
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
 * $ pulumi import cloudflare:index/filter:Filter example &lt;zone_id&gt;/&lt;filter_id&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/filter:Filter")
public class Filter extends com.pulumi.resources.CustomResource {
    /**
     * A note that you can use to describe the purpose of the filter.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return A note that you can use to describe the purpose of the filter.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The filter expression to be used.
     * 
     */
    @Export(name="expression", refs={String.class}, tree="[0]")
    private Output<String> expression;

    /**
     * @return The filter expression to be used.
     * 
     */
    public Output<String> expression() {
        return this.expression;
    }
    /**
     * Whether this filter is currently paused.
     * 
     */
    @Export(name="paused", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> paused;

    /**
     * @return Whether this filter is currently paused.
     * 
     */
    public Output<Optional<Boolean>> paused() {
        return Codegen.optional(this.paused);
    }
    /**
     * Short reference tag to quickly select related rules.
     * 
     */
    @Export(name="ref", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ref;

    /**
     * @return Short reference tag to quickly select related rules.
     * 
     */
    public Output<Optional<String>> ref() {
        return Codegen.optional(this.ref);
    }
    /**
     * The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="zoneId", refs={String.class}, tree="[0]")
    private Output<String> zoneId;

    /**
     * @return The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Filter(String name) {
        this(name, FilterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Filter(String name, FilterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Filter(String name, FilterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/filter:Filter", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private Filter(String name, Output<String> id, @Nullable FilterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/filter:Filter", name, state, makeResourceOptions(options, id));
    }

    private static FilterArgs makeArgs(FilterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? FilterArgs.Empty : args;
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
    public static Filter get(String name, Output<String> id, @Nullable FilterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Filter(name, id, state, options);
    }
}
