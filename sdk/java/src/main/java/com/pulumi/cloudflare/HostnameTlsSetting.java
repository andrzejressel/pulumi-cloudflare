// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.HostnameTlsSettingArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.HostnameTlsSettingState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Cloudflare per-hostname TLS setting resource. Used to set TLS settings for hostnames under the specified zone.
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
 * import com.pulumi.cloudflare.HostnameTlsSetting;
 * import com.pulumi.cloudflare.HostnameTlsSettingArgs;
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
 *         var example = new HostnameTlsSetting("example", HostnameTlsSettingArgs.builder()
 *             .zoneId("0da42c8d2132a9ddaf714f9e7c920711")
 *             .hostname("sub.example.com")
 *             .setting("min_tls_version")
 *             .value("1.2")
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
 * $ pulumi import cloudflare:index/hostnameTlsSetting:HostnameTlsSetting example &lt;zone_id&gt;/&lt;hostname&gt;/&lt;setting_name&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/hostnameTlsSetting:HostnameTlsSetting")
public class HostnameTlsSetting extends com.pulumi.resources.CustomResource {
    @Export(name="createdAt", refs={String.class}, tree="[0]")
    private Output<String> createdAt;

    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * Hostname that belongs to this zone name. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="hostname", refs={String.class}, tree="[0]")
    private Output<String> hostname;

    /**
     * @return Hostname that belongs to this zone name. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<String> hostname() {
        return this.hostname;
    }
    /**
     * TLS setting name. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="setting", refs={String.class}, tree="[0]")
    private Output<String> setting;

    /**
     * @return TLS setting name. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<String> setting() {
        return this.setting;
    }
    @Export(name="updatedAt", refs={String.class}, tree="[0]")
    private Output<String> updatedAt;

    public Output<String> updatedAt() {
        return this.updatedAt;
    }
    /**
     * TLS setting value.
     * 
     */
    @Export(name="value", refs={String.class}, tree="[0]")
    private Output<String> value;

    /**
     * @return TLS setting value.
     * 
     */
    public Output<String> value() {
        return this.value;
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
    public HostnameTlsSetting(String name) {
        this(name, HostnameTlsSettingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public HostnameTlsSetting(String name, HostnameTlsSettingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HostnameTlsSetting(String name, HostnameTlsSettingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/hostnameTlsSetting:HostnameTlsSetting", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private HostnameTlsSetting(String name, Output<String> id, @Nullable HostnameTlsSettingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/hostnameTlsSetting:HostnameTlsSetting", name, state, makeResourceOptions(options, id));
    }

    private static HostnameTlsSettingArgs makeArgs(HostnameTlsSettingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? HostnameTlsSettingArgs.Empty : args;
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
    public static HostnameTlsSetting get(String name, Output<String> id, @Nullable HostnameTlsSettingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new HostnameTlsSetting(name, id, state, options);
    }
}
