// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.CustomHostnameArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.CustomHostnameState;
import com.pulumi.cloudflare.outputs.CustomHostnameSsl;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Cloudflare custom hostname (also known as SSL for SaaS) resource.
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
 * import com.pulumi.cloudflare.CustomHostname;
 * import com.pulumi.cloudflare.CustomHostnameArgs;
 * import com.pulumi.cloudflare.inputs.CustomHostnameSslArgs;
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
 *         var example = new CustomHostname("example", CustomHostnameArgs.builder()
 *             .zoneId("0da42c8d2132a9ddaf714f9e7c920711")
 *             .hostname("hostname.example.com")
 *             .ssls(CustomHostnameSslArgs.builder()
 *                 .method("txt")
 *                 .build())
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
 * $ pulumi import cloudflare:index/customHostname:CustomHostname example 1d5fdc9e88c8a8c4518b068cd94331fe/0d89c70d-ad9f-4843-b99f-6cc0252067e9
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/customHostname:CustomHostname")
public class CustomHostname extends com.pulumi.resources.CustomResource {
    /**
     * Custom metadata associated with custom hostname. Only supports primitive string values, all other values are accessible via the API directly.
     * 
     */
    @Export(name="customMetadata", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> customMetadata;

    /**
     * @return Custom metadata associated with custom hostname. Only supports primitive string values, all other values are accessible via the API directly.
     * 
     */
    public Output<Optional<Map<String,String>>> customMetadata() {
        return Codegen.optional(this.customMetadata);
    }
    /**
     * The custom origin server used for certificates.
     * 
     */
    @Export(name="customOriginServer", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> customOriginServer;

    /**
     * @return The custom origin server used for certificates.
     * 
     */
    public Output<Optional<String>> customOriginServer() {
        return Codegen.optional(this.customOriginServer);
    }
    /**
     * The [custom origin SNI](https://developers.cloudflare.com/ssl/ssl-for-saas/hostname-specific-behavior/custom-origin) used for certificates.
     * 
     */
    @Export(name="customOriginSni", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> customOriginSni;

    /**
     * @return The [custom origin SNI](https://developers.cloudflare.com/ssl/ssl-for-saas/hostname-specific-behavior/custom-origin) used for certificates.
     * 
     */
    public Output<Optional<String>> customOriginSni() {
        return Codegen.optional(this.customOriginSni);
    }
    /**
     * Hostname you intend to request a certificate for. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="hostname", refs={String.class}, tree="[0]")
    private Output<String> hostname;

    /**
     * @return Hostname you intend to request a certificate for. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<String> hostname() {
        return this.hostname;
    }
    @Export(name="ownershipVerification", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> ownershipVerification;

    public Output<Map<String,String>> ownershipVerification() {
        return this.ownershipVerification;
    }
    @Export(name="ownershipVerificationHttp", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> ownershipVerificationHttp;

    public Output<Map<String,String>> ownershipVerificationHttp() {
        return this.ownershipVerificationHttp;
    }
    /**
     * SSL properties used when creating the custom hostname.
     * 
     */
    @Export(name="ssls", refs={List.class,CustomHostnameSsl.class}, tree="[0,1]")
    private Output</* @Nullable */ List<CustomHostnameSsl>> ssls;

    /**
     * @return SSL properties used when creating the custom hostname.
     * 
     */
    public Output<Optional<List<CustomHostnameSsl>>> ssls() {
        return Codegen.optional(this.ssls);
    }
    /**
     * Status of the certificate.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return Status of the certificate.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * Whether to wait for a custom hostname SSL sub-object to reach status `pending_validation` during creation. Defaults to `false`.
     * 
     */
    @Export(name="waitForSslPendingValidation", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> waitForSslPendingValidation;

    /**
     * @return Whether to wait for a custom hostname SSL sub-object to reach status `pending_validation` during creation. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> waitForSslPendingValidation() {
        return Codegen.optional(this.waitForSslPendingValidation);
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
    public CustomHostname(String name) {
        this(name, CustomHostnameArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CustomHostname(String name, CustomHostnameArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CustomHostname(String name, CustomHostnameArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/customHostname:CustomHostname", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private CustomHostname(String name, Output<String> id, @Nullable CustomHostnameState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/customHostname:CustomHostname", name, state, makeResourceOptions(options, id));
    }

    private static CustomHostnameArgs makeArgs(CustomHostnameArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? CustomHostnameArgs.Empty : args;
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
    public static CustomHostname get(String name, Output<String> id, @Nullable CustomHostnameState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CustomHostname(name, id, state, options);
    }
}
