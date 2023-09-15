// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.UrlNormalizationSettingsArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.UrlNormalizationSettingsState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a resource to manage URL Normalization Settings.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.cloudflare.UrlNormalizationSettings;
 * import com.pulumi.cloudflare.UrlNormalizationSettingsArgs;
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
 *         var example = new UrlNormalizationSettings(&#34;example&#34;, UrlNormalizationSettingsArgs.builder()        
 *             .scope(&#34;incoming&#34;)
 *             .type(&#34;cloudflare&#34;)
 *             .zoneId(&#34;0da42c8d2132a9ddaf714f9e7c920711&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/urlNormalizationSettings:UrlNormalizationSettings")
public class UrlNormalizationSettings extends com.pulumi.resources.CustomResource {
    /**
     * The scope of the URL normalization.
     * 
     */
    @Export(name="scope", type=String.class, parameters={})
    private Output<String> scope;

    /**
     * @return The scope of the URL normalization.
     * 
     */
    public Output<String> scope() {
        return this.scope;
    }
    /**
     * The type of URL normalization performed by Cloudflare.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of URL normalization performed by Cloudflare.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="zoneId", type=String.class, parameters={})
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
    public UrlNormalizationSettings(String name) {
        this(name, UrlNormalizationSettingsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public UrlNormalizationSettings(String name, UrlNormalizationSettingsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public UrlNormalizationSettings(String name, UrlNormalizationSettingsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/urlNormalizationSettings:UrlNormalizationSettings", name, args == null ? UrlNormalizationSettingsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private UrlNormalizationSettings(String name, Output<String> id, @Nullable UrlNormalizationSettingsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/urlNormalizationSettings:UrlNormalizationSettings", name, state, makeResourceOptions(options, id));
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
    public static UrlNormalizationSettings get(String name, Output<String> id, @Nullable UrlNormalizationSettingsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new UrlNormalizationSettings(name, id, state, options);
    }
}
