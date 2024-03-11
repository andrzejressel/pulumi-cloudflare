// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.MtlsCertificateArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.MtlsCertificateState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Cloudflare mTLS certificate resource. These certificates may be used with mTLS enabled Cloudflare services.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.cloudflare.MtlsCertificate;
 * import com.pulumi.cloudflare.MtlsCertificateArgs;
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
 *         var example = new MtlsCertificate(&#34;example&#34;, MtlsCertificateArgs.builder()        
 *             .accountId(&#34;f037e56e89293a057740de681ac9abbe&#34;)
 *             .ca(true)
 *             .certificates(&#34;&#34;&#34;
 * -----BEGIN CERTIFICATE-----
 * MIIDmDCCAoCgAwIBAgIUKTOAZNj...i4JhqeoTewsxndhDDE
 * -----END CERTIFICATE-----
 *             &#34;&#34;&#34;)
 *             .name(&#34;example&#34;)
 *             .privateKey(&#34;&#34;&#34;
 * -----BEGIN PRIVATE KEY-----
 * MIIEvQIBADANBgkqhkiG9w0BAQE...1IS3EnQRrz6WMYA=
 * -----END PRIVATE KEY-----
 *             &#34;&#34;&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import cloudflare:index/mtlsCertificate:MtlsCertificate example &lt;account_id&gt;/&lt;mtls_certificate_id&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/mtlsCertificate:MtlsCertificate")
public class MtlsCertificate extends com.pulumi.resources.CustomResource {
    /**
     * The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    /**
     * @return The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * Whether this is a CA or leaf certificate. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="ca", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> ca;

    /**
     * @return Whether this is a CA or leaf certificate. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<Boolean> ca() {
        return this.ca;
    }
    /**
     * Certificate you intend to use with mTLS-enabled services. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="certificates", refs={String.class}, tree="[0]")
    private Output<String> certificates;

    /**
     * @return Certificate you intend to use with mTLS-enabled services. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<String> certificates() {
        return this.certificates;
    }
    /**
     * **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="expiresOn", refs={String.class}, tree="[0]")
    private Output<String> expiresOn;

    /**
     * @return **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<String> expiresOn() {
        return this.expiresOn;
    }
    /**
     * **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="issuer", refs={String.class}, tree="[0]")
    private Output<String> issuer;

    /**
     * @return **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<String> issuer() {
        return this.issuer;
    }
    /**
     * Optional unique name for the certificate. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> name;

    /**
     * @return Optional unique name for the certificate. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<Optional<String>> name() {
        return Codegen.optional(this.name);
    }
    /**
     * The certificate&#39;s private key. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="privateKey", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> privateKey;

    /**
     * @return The certificate&#39;s private key. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<Optional<String>> privateKey() {
        return Codegen.optional(this.privateKey);
    }
    /**
     * **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="serialNumber", refs={String.class}, tree="[0]")
    private Output<String> serialNumber;

    /**
     * @return **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<String> serialNumber() {
        return this.serialNumber;
    }
    /**
     * **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="signature", refs={String.class}, tree="[0]")
    private Output<String> signature;

    /**
     * @return **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<String> signature() {
        return this.signature;
    }
    /**
     * **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="uploadedOn", refs={String.class}, tree="[0]")
    private Output<String> uploadedOn;

    /**
     * @return **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<String> uploadedOn() {
        return this.uploadedOn;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MtlsCertificate(String name) {
        this(name, MtlsCertificateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MtlsCertificate(String name, MtlsCertificateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MtlsCertificate(String name, MtlsCertificateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/mtlsCertificate:MtlsCertificate", name, args == null ? MtlsCertificateArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MtlsCertificate(String name, Output<String> id, @Nullable MtlsCertificateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/mtlsCertificate:MtlsCertificate", name, state, makeResourceOptions(options, id));
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
    public static MtlsCertificate get(String name, Output<String> id, @Nullable MtlsCertificateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MtlsCertificate(name, id, state, options);
    }
}
