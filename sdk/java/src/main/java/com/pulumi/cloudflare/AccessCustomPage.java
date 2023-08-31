// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.AccessCustomPageArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.AccessCustomPageState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a resource to customize the pages your end users will see
 * when trying to reach applications behind Cloudflare Access.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.cloudflare.AccessCustomPage;
 * import com.pulumi.cloudflare.AccessCustomPageArgs;
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
 *         var example = new AccessCustomPage(&#34;example&#34;, AccessCustomPageArgs.builder()        
 *             .customHtml(&#34;&lt;html&gt;&lt;body&gt;&lt;h1&gt;Forbidden&lt;/h1&gt;&lt;/body&gt;&lt;/html&gt;&#34;)
 *             .name(&#34;example&#34;)
 *             .type(&#34;forbidden&#34;)
 *             .zoneId(&#34;0da42c8d2132a9ddaf714f9e7c920711&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/accessCustomPage:AccessCustomPage")
public class AccessCustomPage extends com.pulumi.resources.CustomResource {
    /**
     * The account identifier to target for the resource. Conflicts with `zone_id`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> accountId;

    /**
     * @return The account identifier to target for the resource. Conflicts with `zone_id`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<Optional<String>> accountId() {
        return Codegen.optional(this.accountId);
    }
    /**
     * Number of apps to display on the custom page.
     * 
     */
    @Export(name="appCount", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> appCount;

    /**
     * @return Number of apps to display on the custom page.
     * 
     */
    public Output<Optional<Integer>> appCount() {
        return Codegen.optional(this.appCount);
    }
    /**
     * Custom HTML to display on the custom page.
     * 
     */
    @Export(name="customHtml", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> customHtml;

    /**
     * @return Custom HTML to display on the custom page.
     * 
     */
    public Output<Optional<String>> customHtml() {
        return Codegen.optional(this.customHtml);
    }
    /**
     * Friendly name of the Access Custom Page configuration.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Friendly name of the Access Custom Page configuration.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Type of Access custom page to create. Available values: `identity_denied`, `forbidden`.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return Type of Access custom page to create. Available values: `identity_denied`, `forbidden`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * The zone identifier to target for the resource. Conflicts with `account_id`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="zoneId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> zoneId;

    /**
     * @return The zone identifier to target for the resource. Conflicts with `account_id`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<Optional<String>> zoneId() {
        return Codegen.optional(this.zoneId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AccessCustomPage(String name) {
        this(name, AccessCustomPageArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AccessCustomPage(String name, AccessCustomPageArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AccessCustomPage(String name, AccessCustomPageArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/accessCustomPage:AccessCustomPage", name, args == null ? AccessCustomPageArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AccessCustomPage(String name, Output<String> id, @Nullable AccessCustomPageState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/accessCustomPage:AccessCustomPage", name, state, makeResourceOptions(options, id));
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
    public static AccessCustomPage get(String name, Output<String> id, @Nullable AccessCustomPageState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AccessCustomPage(name, id, state, options);
    }
}