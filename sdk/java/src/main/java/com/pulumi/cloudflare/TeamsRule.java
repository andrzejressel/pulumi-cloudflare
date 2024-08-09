// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.TeamsRuleArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.TeamsRuleState;
import com.pulumi.cloudflare.outputs.TeamsRuleRuleSettings;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Cloudflare Teams rule resource. Teams rules comprise secure web gateway policies.
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
 * import com.pulumi.cloudflare.TeamsRule;
 * import com.pulumi.cloudflare.TeamsRuleArgs;
 * import com.pulumi.cloudflare.inputs.TeamsRuleRuleSettingsArgs;
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
 *         var example = new TeamsRule("example", TeamsRuleArgs.builder()
 *             .accountId("f037e56e89293a057740de681ac9abbe")
 *             .name("office")
 *             .description("desc")
 *             .precedence(1)
 *             .action("block")
 *             .filters("http")
 *             .traffic("http.request.uri == \"https://www.example.com/malicious\"")
 *             .ruleSettings(TeamsRuleRuleSettingsArgs.builder()
 *                 .blockPageEnabled(true)
 *                 .blockPageReason("access not permitted")
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
 * $ pulumi import cloudflare:index/teamsRule:TeamsRule example &lt;account_id&gt;/&lt;teams_rule_id&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/teamsRule:TeamsRule")
public class TeamsRule extends com.pulumi.resources.CustomResource {
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
     * The action executed by matched teams rule. Available values: `allow`, `block`, `safesearch`, `ytrestricted`, `on`, `off`, `scan`, `noscan`, `isolate`, `noisolate`, `override`, `l4_override`, `egress`, `audit_ssh`, `resolve`.
     * 
     */
    @Export(name="action", refs={String.class}, tree="[0]")
    private Output<String> action;

    /**
     * @return The action executed by matched teams rule. Available values: `allow`, `block`, `safesearch`, `ytrestricted`, `on`, `off`, `scan`, `noscan`, `isolate`, `noisolate`, `override`, `l4_override`, `egress`, `audit_ssh`, `resolve`.
     * 
     */
    public Output<String> action() {
        return this.action;
    }
    /**
     * The description of the teams rule.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output<String> description;

    /**
     * @return The description of the teams rule.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * The wirefilter expression to be used for device_posture check matching.
     * 
     */
    @Export(name="devicePosture", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> devicePosture;

    /**
     * @return The wirefilter expression to be used for device_posture check matching.
     * 
     */
    public Output<Optional<String>> devicePosture() {
        return Codegen.optional(this.devicePosture);
    }
    /**
     * Indicator of rule enablement.
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Indicator of rule enablement.
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * The protocol or layer to evaluate the traffic and identity expressions.
     * 
     */
    @Export(name="filters", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> filters;

    /**
     * @return The protocol or layer to evaluate the traffic and identity expressions.
     * 
     */
    public Output<Optional<List<String>>> filters() {
        return Codegen.optional(this.filters);
    }
    /**
     * The wirefilter expression to be used for identity matching.
     * 
     */
    @Export(name="identity", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> identity;

    /**
     * @return The wirefilter expression to be used for identity matching.
     * 
     */
    public Output<Optional<String>> identity() {
        return Codegen.optional(this.identity);
    }
    /**
     * The name of the teams rule.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the teams rule.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The evaluation precedence of the teams rule.
     * 
     */
    @Export(name="precedence", refs={Integer.class}, tree="[0]")
    private Output<Integer> precedence;

    /**
     * @return The evaluation precedence of the teams rule.
     * 
     */
    public Output<Integer> precedence() {
        return this.precedence;
    }
    /**
     * Additional rule settings.
     * 
     */
    @Export(name="ruleSettings", refs={TeamsRuleRuleSettings.class}, tree="[0]")
    private Output</* @Nullable */ TeamsRuleRuleSettings> ruleSettings;

    /**
     * @return Additional rule settings.
     * 
     */
    public Output<Optional<TeamsRuleRuleSettings>> ruleSettings() {
        return Codegen.optional(this.ruleSettings);
    }
    /**
     * The wirefilter expression to be used for traffic matching.
     * 
     */
    @Export(name="traffic", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> traffic;

    /**
     * @return The wirefilter expression to be used for traffic matching.
     * 
     */
    public Output<Optional<String>> traffic() {
        return Codegen.optional(this.traffic);
    }
    @Export(name="version", refs={Integer.class}, tree="[0]")
    private Output<Integer> version;

    public Output<Integer> version() {
        return this.version;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TeamsRule(String name) {
        this(name, TeamsRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TeamsRule(String name, TeamsRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TeamsRule(String name, TeamsRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/teamsRule:TeamsRule", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private TeamsRule(String name, Output<String> id, @Nullable TeamsRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/teamsRule:TeamsRule", name, state, makeResourceOptions(options, id));
    }

    private static TeamsRuleArgs makeArgs(TeamsRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? TeamsRuleArgs.Empty : args;
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
    public static TeamsRule get(String name, Output<String> id, @Nullable TeamsRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TeamsRule(name, id, state, options);
    }
}
