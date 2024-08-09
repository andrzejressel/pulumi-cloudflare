// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.WorkersSecretArgs;
import com.pulumi.cloudflare.inputs.WorkersSecretState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides a Cloudflare Worker secret resource.
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
 * import com.pulumi.cloudflare.WorkersSecret;
 * import com.pulumi.cloudflare.WorkersSecretArgs;
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
 *         var mySecret = new WorkersSecret("mySecret", WorkersSecretArgs.builder()
 *             .accountId("f037e56e89293a057740de681ac9abbe")
 *             .name("MY_EXAMPLE_SECRET_TEXT")
 *             .scriptName("script_1")
 *             .secretText("my_secret_value")
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
 * $ pulumi import cloudflare:index/workersSecret:WorkersSecret example &lt;account_id&gt;/&lt;script_name&gt;/&lt;secret_name&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/workersSecret:WorkersSecret")
public class WorkersSecret extends com.pulumi.resources.CustomResource {
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
     * The name of the Worker secret. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the Worker secret. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the Worker script to associate the secret with. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="scriptName", refs={String.class}, tree="[0]")
    private Output<String> scriptName;

    /**
     * @return The name of the Worker script to associate the secret with. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<String> scriptName() {
        return this.scriptName;
    }
    /**
     * The text of the Worker secret. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="secretText", refs={String.class}, tree="[0]")
    private Output<String> secretText;

    /**
     * @return The text of the Worker secret. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<String> secretText() {
        return this.secretText;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WorkersSecret(String name) {
        this(name, WorkersSecretArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WorkersSecret(String name, WorkersSecretArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WorkersSecret(String name, WorkersSecretArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/workersSecret:WorkersSecret", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private WorkersSecret(String name, Output<String> id, @Nullable WorkersSecretState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/workersSecret:WorkersSecret", name, state, makeResourceOptions(options, id));
    }

    private static WorkersSecretArgs makeArgs(WorkersSecretArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? WorkersSecretArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "secretText"
            ))
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
    public static WorkersSecret get(String name, Output<String> id, @Nullable WorkersSecretState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new WorkersSecret(name, id, state, options);
    }
}
