// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.DevicePolicyCertificatesArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.DevicePolicyCertificatesState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Cloudflare device policy certificates resource. Device policy certificate resources enable client device certificate generation.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.cloudflare.DevicePolicyCertificates;
 * import com.pulumi.cloudflare.DevicePolicyCertificatesArgs;
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
 *         var example = new DevicePolicyCertificates(&#34;example&#34;, DevicePolicyCertificatesArgs.builder()        
 *             .enabled(true)
 *             .zoneId(&#34;1d5fdc9e88c8a8c4518b068cd94331fe&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Device policy certificate settings can be imported using the zone ID.
 * 
 * ```sh
 *  $ pulumi import cloudflare:index/devicePolicyCertificates:DevicePolicyCertificates example cb029e245cfdd66dc8d2e570d5dd3322
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/devicePolicyCertificates:DevicePolicyCertificates")
public class DevicePolicyCertificates extends com.pulumi.resources.CustomResource {
    /**
     * True if certificate generation is enabled.
     * 
     */
    @Export(name="enabled", type=Boolean.class, parameters={})
    private Output<Boolean> enabled;

    /**
     * @return True if certificate generation is enabled.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }
    /**
     * The zone ID where certificate generation is allowed.
     * 
     */
    @Export(name="zoneId", type=String.class, parameters={})
    private Output<String> zoneId;

    /**
     * @return The zone ID where certificate generation is allowed.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DevicePolicyCertificates(String name) {
        this(name, DevicePolicyCertificatesArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DevicePolicyCertificates(String name, DevicePolicyCertificatesArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DevicePolicyCertificates(String name, DevicePolicyCertificatesArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/devicePolicyCertificates:DevicePolicyCertificates", name, args == null ? DevicePolicyCertificatesArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DevicePolicyCertificates(String name, Output<String> id, @Nullable DevicePolicyCertificatesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/devicePolicyCertificates:DevicePolicyCertificates", name, state, makeResourceOptions(options, id));
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
    public static DevicePolicyCertificates get(String name, Output<String> id, @Nullable DevicePolicyCertificatesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DevicePolicyCertificates(name, id, state, options);
    }
}