// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.DeviceManagedNetworksArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.DeviceManagedNetworksState;
import com.pulumi.cloudflare.outputs.DeviceManagedNetworksConfig;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Cloudflare Device Managed Network resource. Device managed networks allow for building location-aware device settings policies.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.cloudflare.DeviceManagedNetworks;
 * import com.pulumi.cloudflare.DeviceManagedNetworksArgs;
 * import com.pulumi.cloudflare.inputs.DeviceManagedNetworksConfigArgs;
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
 *         var managedNetworks = new DeviceManagedNetworks(&#34;managedNetworks&#34;, DeviceManagedNetworksArgs.builder()        
 *             .accountId(&#34;f037e56e89293a057740de681ac9abbe&#34;)
 *             .config(DeviceManagedNetworksConfigArgs.builder()
 *                 .sha256(&#34;b5bb9d8014a0f9b1d61e21e796d78dccdf1352f23cd32812f4850b878ae4944c&#34;)
 *                 .tlsSockaddr(&#34;foobar:1234&#34;)
 *                 .build())
 *             .name(&#34;managed-network-1&#34;)
 *             .type(&#34;tls&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * ```sh
 *  $ pulumi import cloudflare:index/deviceManagedNetworks:DeviceManagedNetworks example &lt;account_id&gt;/&lt;device_managed_networks_id&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/deviceManagedNetworks:DeviceManagedNetworks")
public class DeviceManagedNetworks extends com.pulumi.resources.CustomResource {
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
     * The configuration containing information for the WARP client to detect the managed network.
     * 
     */
    @Export(name="config", refs={DeviceManagedNetworksConfig.class}, tree="[0]")
    private Output<DeviceManagedNetworksConfig> config;

    /**
     * @return The configuration containing information for the WARP client to detect the managed network.
     * 
     */
    public Output<DeviceManagedNetworksConfig> config() {
        return this.config;
    }
    /**
     * The name of the Device Managed Network. Must be unique.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the Device Managed Network. Must be unique.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The type of Device Managed Network. Available values: `tls`.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return The type of Device Managed Network. Available values: `tls`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DeviceManagedNetworks(String name) {
        this(name, DeviceManagedNetworksArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DeviceManagedNetworks(String name, DeviceManagedNetworksArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DeviceManagedNetworks(String name, DeviceManagedNetworksArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/deviceManagedNetworks:DeviceManagedNetworks", name, args == null ? DeviceManagedNetworksArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DeviceManagedNetworks(String name, Output<String> id, @Nullable DeviceManagedNetworksState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/deviceManagedNetworks:DeviceManagedNetworks", name, state, makeResourceOptions(options, id));
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
    public static DeviceManagedNetworks get(String name, Output<String> id, @Nullable DeviceManagedNetworksState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DeviceManagedNetworks(name, id, state, options);
    }
}
