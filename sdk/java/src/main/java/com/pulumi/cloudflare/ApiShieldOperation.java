// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.ApiShieldOperationArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.ApiShieldOperationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a resource to manage an operation in API Shield Endpoint Management.
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
 * import com.pulumi.cloudflare.ApiShieldOperation;
 * import com.pulumi.cloudflare.ApiShieldOperationArgs;
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
 *         var example = new ApiShieldOperation("example", ApiShieldOperationArgs.builder()
 *             .zoneId("0da42c8d2132a9ddaf714f9e7c920711")
 *             .method("GET")
 *             .host("api.example.com")
 *             .endpoint("/path")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="cloudflare:index/apiShieldOperation:ApiShieldOperation")
public class ApiShieldOperation extends com.pulumi.resources.CustomResource {
    /**
     * The endpoint which can contain path parameter templates in curly braces, each will be replaced from left to right with `{varN}`, starting with `{var1}`. This will then be [Cloudflare-normalized](https://developers.cloudflare.com/rules/normalization/how-it-works/). **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="endpoint", refs={String.class}, tree="[0]")
    private Output<String> endpoint;

    /**
     * @return The endpoint which can contain path parameter templates in curly braces, each will be replaced from left to right with `{varN}`, starting with `{var1}`. This will then be [Cloudflare-normalized](https://developers.cloudflare.com/rules/normalization/how-it-works/). **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<String> endpoint() {
        return this.endpoint;
    }
    /**
     * RFC3986-compliant host. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="host", refs={String.class}, tree="[0]")
    private Output<String> host;

    /**
     * @return RFC3986-compliant host. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<String> host() {
        return this.host;
    }
    /**
     * The HTTP method used to access the endpoint. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="method", refs={String.class}, tree="[0]")
    private Output<String> method;

    /**
     * @return The HTTP method used to access the endpoint. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<String> method() {
        return this.method;
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
    public ApiShieldOperation(java.lang.String name) {
        this(name, ApiShieldOperationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ApiShieldOperation(java.lang.String name, ApiShieldOperationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ApiShieldOperation(java.lang.String name, ApiShieldOperationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/apiShieldOperation:ApiShieldOperation", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ApiShieldOperation(java.lang.String name, Output<java.lang.String> id, @Nullable ApiShieldOperationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/apiShieldOperation:ApiShieldOperation", name, state, makeResourceOptions(options, id), false);
    }

    private static ApiShieldOperationArgs makeArgs(ApiShieldOperationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ApiShieldOperationArgs.Empty : args;
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
    public static ApiShieldOperation get(java.lang.String name, Output<java.lang.String> id, @Nullable ApiShieldOperationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ApiShieldOperation(name, id, state, options);
    }
}
