// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.AccessRuleArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.AccessRuleState;
import com.pulumi.cloudflare.outputs.AccessRuleConfiguration;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Cloudflare IP Firewall Access Rule resource. Access
 * control can be applied on basis of IP addresses, IP ranges, AS
 * numbers or countries.
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
 * import com.pulumi.cloudflare.AccessRule;
 * import com.pulumi.cloudflare.AccessRuleArgs;
 * import com.pulumi.cloudflare.inputs.AccessRuleConfigurationArgs;
 * import com.pulumi.codegen.internal.KeyedValue;
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
 *         final var config = ctx.config();
 *         // Challenge requests coming from known Tor exit nodes.
 *         var torExitNodes = new AccessRule(&#34;torExitNodes&#34;, AccessRuleArgs.builder()        
 *             .zoneId(&#34;0da42c8d2132a9ddaf714f9e7c920711&#34;)
 *             .notes(&#34;Requests coming from known Tor exit nodes&#34;)
 *             .mode(&#34;challenge&#34;)
 *             .configuration(AccessRuleConfigurationArgs.builder()
 *                 .target(&#34;country&#34;)
 *                 .value(&#34;T1&#34;)
 *                 .build())
 *             .build());
 * 
 *         // Allowlist requests coming from Antarctica, but only for single zone.
 *         var antarctica = new AccessRule(&#34;antarctica&#34;, AccessRuleArgs.builder()        
 *             .zoneId(&#34;0da42c8d2132a9ddaf714f9e7c920711&#34;)
 *             .notes(&#34;Requests coming from Antarctica&#34;)
 *             .mode(&#34;whitelist&#34;)
 *             .configuration(AccessRuleConfigurationArgs.builder()
 *                 .target(&#34;country&#34;)
 *                 .value(&#34;AQ&#34;)
 *                 .build())
 *             .build());
 * 
 *         final var myOffice = config.get(&#34;myOffice&#34;).orElse(        
 *             &#34;192.0.2.0/24&#34;,
 *             &#34;198.51.100.0/24&#34;,
 *             &#34;2001:db8::/56&#34;);
 *         for (var i = 0; i &lt; myOffice.length(); i++) {
 *             new AccessRule(&#34;officeNetwork-&#34; + i, AccessRuleArgs.builder()            
 *                 .accountId(&#34;f037e56e89293a057740de681ac9abbe&#34;)
 *                 .notes(&#34;Requests coming from office network&#34;)
 *                 .mode(&#34;whitelist&#34;)
 *                 .configuration(AccessRuleConfigurationArgs.builder()
 *                     .target(&#34;ip_range&#34;)
 *                     .value(myOffice[count.index()])
 *                     .build())
 *                 .build());
 * 
 *         
 * }
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * User level access rule import.
 * 
 * ```sh
 * $ pulumi import cloudflare:index/accessRule:AccessRule default user/&lt;user_id&gt;/&lt;rule_id&gt;
 * ```
 * 
 * Zone level access rule import.
 * 
 * ```sh
 * $ pulumi import cloudflare:index/accessRule:AccessRule default zone/&lt;zone_id&gt;/&lt;rule_id&gt;
 * ```
 * 
 * Account level access rule import.
 * 
 * ```sh
 * $ pulumi import cloudflare:index/accessRule:AccessRule default account/&lt;account_id&gt;/&lt;rule_id&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/accessRule:AccessRule")
public class AccessRule extends com.pulumi.resources.CustomResource {
    /**
     * The account identifier to target for the resource. Must provide only one of `account_id`, `zone_id`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    /**
     * @return The account identifier to target for the resource. Must provide only one of `account_id`, `zone_id`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * Rule configuration to apply to a matched request. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="configuration", refs={AccessRuleConfiguration.class}, tree="[0]")
    private Output<AccessRuleConfiguration> configuration;

    /**
     * @return Rule configuration to apply to a matched request. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<AccessRuleConfiguration> configuration() {
        return this.configuration;
    }
    /**
     * The action to apply to a matched request. Available values: `block`, `challenge`, `whitelist`, `js_challenge`, `managed_challenge`.
     * 
     */
    @Export(name="mode", refs={String.class}, tree="[0]")
    private Output<String> mode;

    /**
     * @return The action to apply to a matched request. Available values: `block`, `challenge`, `whitelist`, `js_challenge`, `managed_challenge`.
     * 
     */
    public Output<String> mode() {
        return this.mode;
    }
    /**
     * A personal note about the rule. Typically used as a reminder or explanation for the rule.
     * 
     */
    @Export(name="notes", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> notes;

    /**
     * @return A personal note about the rule. Typically used as a reminder or explanation for the rule.
     * 
     */
    public Output<Optional<String>> notes() {
        return Codegen.optional(this.notes);
    }
    /**
     * The zone identifier to target for the resource. Must provide only one of `account_id`, `zone_id`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="zoneId", refs={String.class}, tree="[0]")
    private Output<String> zoneId;

    /**
     * @return The zone identifier to target for the resource. Must provide only one of `account_id`, `zone_id`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AccessRule(String name) {
        this(name, AccessRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AccessRule(String name, AccessRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AccessRule(String name, AccessRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/accessRule:AccessRule", name, args == null ? AccessRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AccessRule(String name, Output<String> id, @Nullable AccessRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/accessRule:AccessRule", name, state, makeResourceOptions(options, id));
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
    public static AccessRule get(String name, Output<String> id, @Nullable AccessRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AccessRule(name, id, state, options);
    }
}
