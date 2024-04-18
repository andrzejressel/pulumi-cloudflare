// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.RecordArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.RecordState;
import com.pulumi.cloudflare.outputs.RecordData;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Cloudflare record resource.
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
 * import com.pulumi.cloudflare.Record;
 * import com.pulumi.cloudflare.RecordArgs;
 * import com.pulumi.cloudflare.inputs.RecordDataArgs;
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
 *         // Add a record to the domain
 *         var example = new Record(&#34;example&#34;, RecordArgs.builder()        
 *             .zoneId(cloudflareZoneId)
 *             .name(&#34;example&#34;)
 *             .value(&#34;192.0.2.1&#34;)
 *             .type(&#34;A&#34;)
 *             .ttl(3600)
 *             .build());
 * 
 *         // Add a record requiring a data map
 *         var _sipTls = new Record(&#34;_sipTls&#34;, RecordArgs.builder()        
 *             .zoneId(cloudflareZoneId)
 *             .name(&#34;_sip._tls&#34;)
 *             .type(&#34;SRV&#34;)
 *             .data(RecordDataArgs.builder()
 *                 .service(&#34;_sip&#34;)
 *                 .proto(&#34;_tls&#34;)
 *                 .name(&#34;example-srv&#34;)
 *                 .priority(0)
 *                 .weight(0)
 *                 .port(443)
 *                 .target(&#34;example.com&#34;)
 *                 .build())
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
 * $ pulumi import cloudflare:index/record:Record example &lt;zone_id&gt;/&lt;record_id&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/record:Record")
public class Record extends com.pulumi.resources.CustomResource {
    /**
     * Allow creation of this record in Terraform to overwrite an existing record, if any. This does not affect the ability to
     * update the record in Terraform and does not prevent other resources within Terraform or manual changes outside Terraform
     * from overwriting this record. **This configuration is not recommended for most environments**
     * 
     */
    @Export(name="allowOverwrite", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> allowOverwrite;

    /**
     * @return Allow creation of this record in Terraform to overwrite an existing record, if any. This does not affect the ability to
     * update the record in Terraform and does not prevent other resources within Terraform or manual changes outside Terraform
     * from overwriting this record. **This configuration is not recommended for most environments**
     * 
     */
    public Output<Optional<Boolean>> allowOverwrite() {
        return Codegen.optional(this.allowOverwrite);
    }
    /**
     * Comments or notes about the DNS record. This field has no effect on DNS responses.
     * 
     */
    @Export(name="comment", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> comment;

    /**
     * @return Comments or notes about the DNS record. This field has no effect on DNS responses.
     * 
     */
    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    /**
     * The RFC3339 timestamp of when the record was created.
     * 
     */
    @Export(name="createdOn", refs={String.class}, tree="[0]")
    private Output<String> createdOn;

    /**
     * @return The RFC3339 timestamp of when the record was created.
     * 
     */
    public Output<String> createdOn() {
        return this.createdOn;
    }
    /**
     * Map of attributes that constitute the record value. Conflicts with `value`.
     * 
     */
    @Export(name="data", refs={RecordData.class}, tree="[0]")
    private Output</* @Nullable */ RecordData> data;

    /**
     * @return Map of attributes that constitute the record value. Conflicts with `value`.
     * 
     */
    public Output<Optional<RecordData>> data() {
        return Codegen.optional(this.data);
    }
    /**
     * The FQDN of the record.
     * 
     */
    @Export(name="hostname", refs={String.class}, tree="[0]")
    private Output<String> hostname;

    /**
     * @return The FQDN of the record.
     * 
     */
    public Output<String> hostname() {
        return this.hostname;
    }
    /**
     * A key-value map of string metadata Cloudflare associates with the record.
     * 
     */
    @Export(name="metadata", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output<Map<String,Object>> metadata;

    /**
     * @return A key-value map of string metadata Cloudflare associates with the record.
     * 
     */
    public Output<Map<String,Object>> metadata() {
        return this.metadata;
    }
    /**
     * The RFC3339 timestamp of when the record was last modified.
     * 
     */
    @Export(name="modifiedOn", refs={String.class}, tree="[0]")
    private Output<String> modifiedOn;

    /**
     * @return The RFC3339 timestamp of when the record was last modified.
     * 
     */
    public Output<String> modifiedOn() {
        return this.modifiedOn;
    }
    /**
     * The name of the record.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the record.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The priority of the record.
     * 
     */
    @Export(name="priority", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> priority;

    /**
     * @return The priority of the record.
     * 
     */
    public Output<Optional<Integer>> priority() {
        return Codegen.optional(this.priority);
    }
    /**
     * Shows whether this record can be proxied.
     * 
     */
    @Export(name="proxiable", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> proxiable;

    /**
     * @return Shows whether this record can be proxied.
     * 
     */
    public Output<Boolean> proxiable() {
        return this.proxiable;
    }
    /**
     * Whether the record gets Cloudflare&#39;s origin protection.
     * 
     */
    @Export(name="proxied", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> proxied;

    /**
     * @return Whether the record gets Cloudflare&#39;s origin protection.
     * 
     */
    public Output<Optional<Boolean>> proxied() {
        return Codegen.optional(this.proxied);
    }
    /**
     * Custom tags for the DNS record.
     * 
     */
    @Export(name="tags", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> tags;

    /**
     * @return Custom tags for the DNS record.
     * 
     */
    public Output<Optional<List<String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The TTL of the record.
     * 
     */
    @Export(name="ttl", refs={Integer.class}, tree="[0]")
    private Output<Integer> ttl;

    /**
     * @return The TTL of the record.
     * 
     */
    public Output<Integer> ttl() {
        return this.ttl;
    }
    /**
     * The type of the record. Available values: `A`, `AAAA`, `CAA`, `CNAME`, `TXT`, `SRV`, `LOC`, `MX`, `NS`, `SPF`, `CERT`,
     * `DNSKEY`, `DS`, `NAPTR`, `SMIMEA`, `SSHFP`, `TLSA`, `URI`, `PTR`, `HTTPS`, `SVCB`
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return The type of the record. Available values: `A`, `AAAA`, `CAA`, `CNAME`, `TXT`, `SRV`, `LOC`, `MX`, `NS`, `SPF`, `CERT`,
     * `DNSKEY`, `DS`, `NAPTR`, `SMIMEA`, `SSHFP`, `TLSA`, `URI`, `PTR`, `HTTPS`, `SVCB`
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * The value of the record.
     * 
     */
    @Export(name="value", refs={String.class}, tree="[0]")
    private Output<String> value;

    /**
     * @return The value of the record.
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
    public Record(String name) {
        this(name, RecordArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Record(String name, RecordArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Record(String name, RecordArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/record:Record", name, args == null ? RecordArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Record(String name, Output<String> id, @Nullable RecordState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/record:Record", name, state, makeResourceOptions(options, id));
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
    public static Record get(String name, Output<String> id, @Nullable RecordState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Record(name, id, state, options);
    }
}
