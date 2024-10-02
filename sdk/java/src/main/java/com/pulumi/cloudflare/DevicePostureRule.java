// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.DevicePostureRuleArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.DevicePostureRuleState;
import com.pulumi.cloudflare.outputs.DevicePostureRuleInput;
import com.pulumi.cloudflare.outputs.DevicePostureRuleMatch;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Cloudflare Device Posture Rule resource. Device posture rules configure security policies for device posture checks.
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
 * import com.pulumi.cloudflare.DevicePostureRule;
 * import com.pulumi.cloudflare.DevicePostureRuleArgs;
 * import com.pulumi.cloudflare.inputs.DevicePostureRuleMatchArgs;
 * import com.pulumi.cloudflare.inputs.DevicePostureRuleInputArgs;
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
 *         var eaxmple = new DevicePostureRule("eaxmple", DevicePostureRuleArgs.builder()
 *             .accountId("f037e56e89293a057740de681ac9abbe")
 *             .name("Corporate devices posture rule")
 *             .type("os_version")
 *             .description("Device posture rule for corporate devices.")
 *             .schedule("24h")
 *             .expiration("24h")
 *             .matches(DevicePostureRuleMatchArgs.builder()
 *                 .platform("linux")
 *                 .build())
 *             .inputs(DevicePostureRuleInputArgs.builder()
 *                 .id(corporateDevices.id())
 *                 .version("1.0.0")
 *                 .operator("<")
 *                 .osDistroName("ubuntu")
 *                 .osDistroRevision("1.0.0")
 *                 .osVersionExtra("(a)")
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
 * $ pulumi import cloudflare:index/devicePostureRule:DevicePostureRule example &lt;account_id&gt;/&lt;device_posture_rule_id&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/devicePostureRule:DevicePostureRule")
public class DevicePostureRule extends com.pulumi.resources.CustomResource {
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
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Expire posture results after the specified amount of time. Must be in the format `1h` or `30m`. Valid units are `h` and `m`.
     * 
     */
    @Export(name="expiration", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> expiration;

    /**
     * @return Expire posture results after the specified amount of time. Must be in the format `1h` or `30m`. Valid units are `h` and `m`.
     * 
     */
    public Output<Optional<String>> expiration() {
        return Codegen.optional(this.expiration);
    }
    /**
     * Required for all rule types except `warp`, `gateway`, and `tanium`.
     * 
     */
    @Export(name="inputs", refs={List.class,DevicePostureRuleInput.class}, tree="[0,1]")
    private Output<List<DevicePostureRuleInput>> inputs;

    /**
     * @return Required for all rule types except `warp`, `gateway`, and `tanium`.
     * 
     */
    public Output<List<DevicePostureRuleInput>> inputs() {
        return this.inputs;
    }
    /**
     * The conditions that the client must match to run the rule.
     * 
     */
    @Export(name="matches", refs={List.class,DevicePostureRuleMatch.class}, tree="[0,1]")
    private Output</* @Nullable */ List<DevicePostureRuleMatch>> matches;

    /**
     * @return The conditions that the client must match to run the rule.
     * 
     */
    public Output<Optional<List<DevicePostureRuleMatch>>> matches() {
        return Codegen.optional(this.matches);
    }
    /**
     * Name of the device posture rule.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> name;

    /**
     * @return Name of the device posture rule.
     * 
     */
    public Output<Optional<String>> name() {
        return Codegen.optional(this.name);
    }
    /**
     * Tells the client when to run the device posture check. Must be in the format `1h` or `30m`. Valid units are `h` and `m`.
     * 
     */
    @Export(name="schedule", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> schedule;

    /**
     * @return Tells the client when to run the device posture check. Must be in the format `1h` or `30m`. Valid units are `h` and `m`.
     * 
     */
    public Output<Optional<String>> schedule() {
        return Codegen.optional(this.schedule);
    }
    /**
     * The device posture rule type. Available values: `serial_number`, `file`, `application`, `gateway`, `warp`, `domain_joined`, `os_version`, `disk_encryption`, `firewall`, `client_certificate`, `client_certificate_v2`, `workspace_one`, `unique_client_id`, `crowdstrike_s2s`, `sentinelone`, `kolide`, `tanium_s2s`, `intune`, `sentinelone_s2s`, `custom_s2s`.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return The device posture rule type. Available values: `serial_number`, `file`, `application`, `gateway`, `warp`, `domain_joined`, `os_version`, `disk_encryption`, `firewall`, `client_certificate`, `client_certificate_v2`, `workspace_one`, `unique_client_id`, `crowdstrike_s2s`, `sentinelone`, `kolide`, `tanium_s2s`, `intune`, `sentinelone_s2s`, `custom_s2s`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DevicePostureRule(java.lang.String name) {
        this(name, DevicePostureRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DevicePostureRule(java.lang.String name, DevicePostureRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DevicePostureRule(java.lang.String name, DevicePostureRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/devicePostureRule:DevicePostureRule", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private DevicePostureRule(java.lang.String name, Output<java.lang.String> id, @Nullable DevicePostureRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/devicePostureRule:DevicePostureRule", name, state, makeResourceOptions(options, id), false);
    }

    private static DevicePostureRuleArgs makeArgs(DevicePostureRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? DevicePostureRuleArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
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
    public static DevicePostureRule get(java.lang.String name, Output<java.lang.String> id, @Nullable DevicePostureRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DevicePostureRule(name, id, state, options);
    }
}
