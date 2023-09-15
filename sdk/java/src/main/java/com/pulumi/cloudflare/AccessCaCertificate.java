// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.AccessCaCertificateArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.AccessCaCertificateState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Cloudflare Access can replace traditional SSH key models with
 * short-lived certificates issued to your users based on the token
 * generated by their Access login.
 * 
 * &gt; It&#39;s required that an `account_id` or `zone_id` is provided and in
 * most cases using either is fine. However, if you&#39;re using a scoped
 * access token, you must provide the argument that matches the token&#39;s
 * scope. For example, an access token that is scoped to the &#34;example.com&#34;
 * zone needs to use the `zone_id` argument.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.cloudflare.AccessCaCertificate;
 * import com.pulumi.cloudflare.AccessCaCertificateArgs;
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
 *         var example = new AccessCaCertificate(&#34;example&#34;, AccessCaCertificateArgs.builder()        
 *             .accountId(&#34;f037e56e89293a057740de681ac9abbe&#34;)
 *             .applicationId(&#34;6cd6cea3-3ef2-4542-9aea-85a0bbcd5414&#34;)
 *             .build());
 * 
 *         var anotherExample = new AccessCaCertificate(&#34;anotherExample&#34;, AccessCaCertificateArgs.builder()        
 *             .applicationId(&#34;fe2be0ff-7f13-4350-8c8e-a9b9795fe3c2&#34;)
 *             .zoneId(&#34;0da42c8d2132a9ddaf714f9e7c920711&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Account level CA certificate import.
 * 
 * ```sh
 *  $ pulumi import cloudflare:index/accessCaCertificate:AccessCaCertificate example account/&lt;account_id&gt;/&lt;application_id&gt;
 * ```
 * 
 *  Zone level CA certificate import.
 * 
 * ```sh
 *  $ pulumi import cloudflare:index/accessCaCertificate:AccessCaCertificate example account/&lt;zone_id&gt;/&lt;application_id&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/accessCaCertificate:AccessCaCertificate")
public class AccessCaCertificate extends com.pulumi.resources.CustomResource {
    /**
     * The account identifier to target for the resource. Conflicts with `zone_id`.
     * 
     */
    @Export(name="accountId", type=String.class, parameters={})
    private Output<String> accountId;

    /**
     * @return The account identifier to target for the resource. Conflicts with `zone_id`.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * The Access Application ID to associate with the CA certificate.
     * 
     */
    @Export(name="applicationId", type=String.class, parameters={})
    private Output<String> applicationId;

    /**
     * @return The Access Application ID to associate with the CA certificate.
     * 
     */
    public Output<String> applicationId() {
        return this.applicationId;
    }
    /**
     * Application Audience (AUD) Tag of the CA certificate.
     * 
     */
    @Export(name="aud", type=String.class, parameters={})
    private Output<String> aud;

    /**
     * @return Application Audience (AUD) Tag of the CA certificate.
     * 
     */
    public Output<String> aud() {
        return this.aud;
    }
    /**
     * Cryptographic public key of the generated CA certificate.
     * 
     */
    @Export(name="publicKey", type=String.class, parameters={})
    private Output<String> publicKey;

    /**
     * @return Cryptographic public key of the generated CA certificate.
     * 
     */
    public Output<String> publicKey() {
        return this.publicKey;
    }
    /**
     * The zone identifier to target for the resource. Conflicts with `account_id`.
     * 
     */
    @Export(name="zoneId", type=String.class, parameters={})
    private Output<String> zoneId;

    /**
     * @return The zone identifier to target for the resource. Conflicts with `account_id`.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AccessCaCertificate(String name) {
        this(name, AccessCaCertificateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AccessCaCertificate(String name, AccessCaCertificateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AccessCaCertificate(String name, AccessCaCertificateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/accessCaCertificate:AccessCaCertificate", name, args == null ? AccessCaCertificateArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AccessCaCertificate(String name, Output<String> id, @Nullable AccessCaCertificateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/accessCaCertificate:AccessCaCertificate", name, state, makeResourceOptions(options, id));
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
    public static AccessCaCertificate get(String name, Output<String> id, @Nullable AccessCaCertificateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AccessCaCertificate(name, id, state, options);
    }
}
