// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.MagicFirewallRulesetArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.MagicFirewallRulesetState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Magic Firewall is a network-level firewall to protect networks that are onboarded to Cloudflare&#39;s Magic Transit. This resource
 * creates a root ruleset on the account level and contains one or more rules. Rules can be crafted in Wireshark syntax and
 * are evaluated in order, with the first rule having the highest priority.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.cloudflare.MagicFirewallRuleset;
 * import com.pulumi.cloudflare.MagicFirewallRulesetArgs;
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
 *         var example = new MagicFirewallRuleset(&#34;example&#34;, MagicFirewallRulesetArgs.builder()        
 *             .accountId(&#34;d41d8cd98f00b204e9800998ecf8427e&#34;)
 *             .description(&#34;Global mitigations&#34;)
 *             .name(&#34;Magic Transit Ruleset&#34;)
 *             .rules(            
 *                 Map.ofEntries(
 *                     Map.entry(&#34;action&#34;, &#34;allow&#34;),
 *                     Map.entry(&#34;description&#34;, &#34;Allow TCP Ephemeral Ports&#34;),
 *                     Map.entry(&#34;enabled&#34;, &#34;true&#34;),
 *                     Map.entry(&#34;expression&#34;, &#34;tcp.dstport in { 32768..65535 }&#34;)
 *                 ),
 *                 Map.ofEntries(
 *                     Map.entry(&#34;action&#34;, &#34;block&#34;),
 *                     Map.entry(&#34;description&#34;, &#34;Block all&#34;),
 *                     Map.entry(&#34;enabled&#34;, &#34;true&#34;),
 *                     Map.entry(&#34;expression&#34;, &#34;ip.len &gt;= 0&#34;)
 *                 ))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * An existing Magic Firewall Ruleset can be imported using the account ID and ruleset ID
 * 
 * ```sh
 *  $ pulumi import cloudflare:index/magicFirewallRuleset:MagicFirewallRuleset example d41d8cd98f00b204e9800998ecf8427e/cb029e245cfdd66dc8d2e570d5dd3322
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/magicFirewallRuleset:MagicFirewallRuleset")
public class MagicFirewallRuleset extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the account where the ruleset is being created.
     * 
     */
    @Export(name="accountId", type=String.class, parameters={})
    private Output<String> accountId;

    /**
     * @return The ID of the account where the ruleset is being created.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * A note that can be used to annotate the rule.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A note that can be used to annotate the rule.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The name of the ruleset.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the ruleset.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    @Export(name="rules", type=List.class, parameters={Map.class})
    private Output</* @Nullable */ List<Map<String,String>>> rules;

    public Output<Optional<List<Map<String,String>>>> rules() {
        return Codegen.optional(this.rules);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MagicFirewallRuleset(String name) {
        this(name, MagicFirewallRulesetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MagicFirewallRuleset(String name, MagicFirewallRulesetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MagicFirewallRuleset(String name, MagicFirewallRulesetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/magicFirewallRuleset:MagicFirewallRuleset", name, args == null ? MagicFirewallRulesetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MagicFirewallRuleset(String name, Output<String> id, @Nullable MagicFirewallRulesetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/magicFirewallRuleset:MagicFirewallRuleset", name, state, makeResourceOptions(options, id));
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
    public static MagicFirewallRuleset get(String name, Output<String> id, @Nullable MagicFirewallRulesetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MagicFirewallRuleset(name, id, state, options);
    }
}