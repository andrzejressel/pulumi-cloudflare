// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.AccessMutualTlsCertificateArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.AccessMutualTlsCertificateState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Cloudflare Access Mutual TLS Certificate resource.
 * Mutual TLS authentication ensures that the traffic is secure and
 * trusted in both directions between a client and server and can be
 *  used with Access to only allows requests from devices with a
 *  corresponding client certificate.
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
 * import com.pulumi.cloudflare.AccessMutualTlsCertificate;
 * import com.pulumi.cloudflare.AccessMutualTlsCertificateArgs;
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
 *         var myCert = new AccessMutualTlsCertificate(&#34;myCert&#34;, AccessMutualTlsCertificateArgs.builder()        
 *             .zoneId(&#34;0da42c8d2132a9ddaf714f9e7c920711&#34;)
 *             .name(&#34;My Root Cert&#34;)
 *             .certificate(var_.ca_pem())
 *             .associatedHostnames(&#34;staging.example.com&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Account level import.
 * 
 * ```sh
 *  $ pulumi import cloudflare:index/accessMutualTlsCertificate:AccessMutualTlsCertificate example account/&lt;account_id&gt;/&lt;mutual_tls_certificate_id&gt;
 * ```
 * 
 *  Zone level import.
 * 
 * ```sh
 *  $ pulumi import cloudflare:index/accessMutualTlsCertificate:AccessMutualTlsCertificate example zone/&lt;zone_id&gt;/&lt;mutual_tls_certificate_id&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/accessMutualTlsCertificate:AccessMutualTlsCertificate")
public class AccessMutualTlsCertificate extends com.pulumi.resources.CustomResource {
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
     * The hostnames that will be prompted for this certificate.
     * 
     */
    @Export(name="associatedHostnames", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> associatedHostnames;

    /**
     * @return The hostnames that will be prompted for this certificate.
     * 
     */
    public Output<Optional<List<String>>> associatedHostnames() {
        return Codegen.optional(this.associatedHostnames);
    }
    /**
     * The Root CA for your certificates.
     * 
     */
    @Export(name="certificate", type=String.class, parameters={})
    private Output</* @Nullable */ String> certificate;

    /**
     * @return The Root CA for your certificates.
     * 
     */
    public Output<Optional<String>> certificate() {
        return Codegen.optional(this.certificate);
    }
    @Export(name="fingerprint", type=String.class, parameters={})
    private Output<String> fingerprint;

    public Output<String> fingerprint() {
        return this.fingerprint;
    }
    /**
     * The name of the certificate.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the certificate.
     * 
     */
    public Output<String> name() {
        return this.name;
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
    public AccessMutualTlsCertificate(String name) {
        this(name, AccessMutualTlsCertificateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AccessMutualTlsCertificate(String name, AccessMutualTlsCertificateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AccessMutualTlsCertificate(String name, AccessMutualTlsCertificateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/accessMutualTlsCertificate:AccessMutualTlsCertificate", name, args == null ? AccessMutualTlsCertificateArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AccessMutualTlsCertificate(String name, Output<String> id, @Nullable AccessMutualTlsCertificateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/accessMutualTlsCertificate:AccessMutualTlsCertificate", name, state, makeResourceOptions(options, id));
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
    public static AccessMutualTlsCertificate get(String name, Output<String> id, @Nullable AccessMutualTlsCertificateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AccessMutualTlsCertificate(name, id, state, options);
    }
}