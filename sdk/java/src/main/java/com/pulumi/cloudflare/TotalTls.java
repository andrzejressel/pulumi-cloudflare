// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.TotalTlsArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.TotalTlsState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a resource which manages Total TLS for a zone.
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
 * import com.pulumi.cloudflare.TotalTls;
 * import com.pulumi.cloudflare.TotalTlsArgs;
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
 *         var example = new TotalTls("example", TotalTlsArgs.builder()
 *             .zoneId("0da42c8d2132a9ddaf714f9e7c920711")
 *             .enabled(true)
 *             .certificateAuthority("lets_encrypt")
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
 * $ pulumi import cloudflare:index/totalTls:TotalTls example &lt;zone_id&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/totalTls:TotalTls")
public class TotalTls extends com.pulumi.resources.CustomResource {
    /**
     * The Certificate Authority that Total TLS certificates will be issued through. Available values: `google`, `lets_encrypt`.
     * 
     */
    @Export(name="certificateAuthority", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> certificateAuthority;

    /**
     * @return The Certificate Authority that Total TLS certificates will be issued through. Available values: `google`, `lets_encrypt`.
     * 
     */
    public Output<Optional<String>> certificateAuthority() {
        return Codegen.optional(this.certificateAuthority);
    }
    /**
     * Enable Total TLS for the zone.
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> enabled;

    /**
     * @return Enable Total TLS for the zone.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
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
    public TotalTls(java.lang.String name) {
        this(name, TotalTlsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TotalTls(java.lang.String name, TotalTlsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TotalTls(java.lang.String name, TotalTlsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/totalTls:TotalTls", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private TotalTls(java.lang.String name, Output<java.lang.String> id, @Nullable TotalTlsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/totalTls:TotalTls", name, state, makeResourceOptions(options, id), false);
    }

    private static TotalTlsArgs makeArgs(TotalTlsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? TotalTlsArgs.Empty : args;
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
    public static TotalTls get(java.lang.String name, Output<java.lang.String> id, @Nullable TotalTlsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TotalTls(name, id, state, options);
    }
}
