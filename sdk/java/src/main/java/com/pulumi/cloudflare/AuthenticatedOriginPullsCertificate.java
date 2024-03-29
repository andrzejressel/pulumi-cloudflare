// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.AuthenticatedOriginPullsCertificateArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.AuthenticatedOriginPullsCertificateState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides a Cloudflare Authenticated Origin Pulls certificate
 * resource. An uploaded client certificate is required to use Per-Zone
 *  or Per-Hostname Authenticated Origin Pulls.
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
 * import com.pulumi.cloudflare.AuthenticatedOriginPullsCertificate;
 * import com.pulumi.cloudflare.AuthenticatedOriginPullsCertificateArgs;
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
 *         // Per-Zone Authenticated Origin Pulls certificate
 *         var myPerZoneAopCert = new AuthenticatedOriginPullsCertificate(&#34;myPerZoneAopCert&#34;, AuthenticatedOriginPullsCertificateArgs.builder()        
 *             .certificate(&#34;-----INSERT CERTIFICATE-----&#34;)
 *             .privateKey(&#34;-----INSERT PRIVATE KEY-----&#34;)
 *             .type(&#34;per-zone&#34;)
 *             .zoneId(&#34;0da42c8d2132a9ddaf714f9e7c920711&#34;)
 *             .build());
 * 
 *         // Per-Hostname Authenticated Origin Pulls certificate
 *         var myPerHostnameAopCert = new AuthenticatedOriginPullsCertificate(&#34;myPerHostnameAopCert&#34;, AuthenticatedOriginPullsCertificateArgs.builder()        
 *             .certificate(&#34;-----INSERT CERTIFICATE-----&#34;)
 *             .privateKey(&#34;-----INSERT PRIVATE KEY-----&#34;)
 *             .type(&#34;per-hostname&#34;)
 *             .zoneId(&#34;0da42c8d2132a9ddaf714f9e7c920711&#34;)
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
 * $ pulumi import cloudflare:index/authenticatedOriginPullsCertificate:AuthenticatedOriginPullsCertificate example &lt;zone_id&gt;/&lt;certificate_type&gt;/&lt;certificate_id&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/authenticatedOriginPullsCertificate:AuthenticatedOriginPullsCertificate")
public class AuthenticatedOriginPullsCertificate extends com.pulumi.resources.CustomResource {
    /**
     * The public client certificate. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="certificate", refs={String.class}, tree="[0]")
    private Output<String> certificate;

    /**
     * @return The public client certificate. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<String> certificate() {
        return this.certificate;
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
     * The private key of the client certificate. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="privateKey", refs={String.class}, tree="[0]")
    private Output<String> privateKey;

    /**
     * @return The private key of the client certificate. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<String> privateKey() {
        return this.privateKey;
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
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The form of Authenticated Origin Pulls to upload the certificate to. Available values: `per-zone`, `per-hostname`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return The form of Authenticated Origin Pulls to upload the certificate to. Available values: `per-zone`, `per-hostname`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<String> type() {
        return this.type;
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
    public AuthenticatedOriginPullsCertificate(String name) {
        this(name, AuthenticatedOriginPullsCertificateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AuthenticatedOriginPullsCertificate(String name, AuthenticatedOriginPullsCertificateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AuthenticatedOriginPullsCertificate(String name, AuthenticatedOriginPullsCertificateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/authenticatedOriginPullsCertificate:AuthenticatedOriginPullsCertificate", name, args == null ? AuthenticatedOriginPullsCertificateArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AuthenticatedOriginPullsCertificate(String name, Output<String> id, @Nullable AuthenticatedOriginPullsCertificateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/authenticatedOriginPullsCertificate:AuthenticatedOriginPullsCertificate", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "privateKey"
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
    public static AuthenticatedOriginPullsCertificate get(String name, Output<String> id, @Nullable AuthenticatedOriginPullsCertificateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AuthenticatedOriginPullsCertificate(name, id, state, options);
    }
}
