// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.DeviceSettingsPolicyArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.DeviceSettingsPolicyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Cloudflare Device Settings Policy resource. Device policies configure settings applied to WARP devices.
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
 * import com.pulumi.cloudflare.DeviceSettingsPolicy;
 * import com.pulumi.cloudflare.DeviceSettingsPolicyArgs;
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
 *         var developerWarpPolicy = new DeviceSettingsPolicy("developerWarpPolicy", DeviceSettingsPolicyArgs.builder()
 *             .accountId("f037e56e89293a057740de681ac9abbe")
 *             .name("Developers WARP settings policy")
 *             .description("Developers WARP settings policy description")
 *             .precedence(10)
 *             .match("any(identity.groups.name[*] in {\"Developers\"})")
 *             .default_(false)
 *             .enabled(true)
 *             .allowModeSwitch(true)
 *             .allowUpdates(true)
 *             .allowedToLeave(true)
 *             .autoConnect(0)
 *             .captivePortal(5)
 *             .disableAutoFallback(true)
 *             .supportUrl("https://cloudflare.com")
 *             .switchLocked(true)
 *             .serviceModeV2Mode("warp")
 *             .serviceModeV2Port(3000)
 *             .excludeOfficeIps(false)
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
 * For default device settings policies you must use &#34;default&#34; as the policy ID.
 * 
 * ```sh
 * $ pulumi import cloudflare:index/deviceSettingsPolicy:DeviceSettingsPolicy example &lt;account_id&gt;/&lt;device_policy_id&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/deviceSettingsPolicy:DeviceSettingsPolicy")
public class DeviceSettingsPolicy extends com.pulumi.resources.CustomResource {
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
     * Whether to allow mode switch for this policy.
     * 
     */
    @Export(name="allowModeSwitch", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> allowModeSwitch;

    /**
     * @return Whether to allow mode switch for this policy.
     * 
     */
    public Output<Optional<Boolean>> allowModeSwitch() {
        return Codegen.optional(this.allowModeSwitch);
    }
    /**
     * Whether to allow updates under this policy.
     * 
     */
    @Export(name="allowUpdates", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> allowUpdates;

    /**
     * @return Whether to allow updates under this policy.
     * 
     */
    public Output<Optional<Boolean>> allowUpdates() {
        return Codegen.optional(this.allowUpdates);
    }
    /**
     * Whether to allow devices to leave the organization. Defaults to `true`.
     * 
     */
    @Export(name="allowedToLeave", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> allowedToLeave;

    /**
     * @return Whether to allow devices to leave the organization. Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> allowedToLeave() {
        return Codegen.optional(this.allowedToLeave);
    }
    /**
     * The amount of time in seconds to reconnect after having been disabled.
     * 
     */
    @Export(name="autoConnect", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> autoConnect;

    /**
     * @return The amount of time in seconds to reconnect after having been disabled.
     * 
     */
    public Output<Optional<Integer>> autoConnect() {
        return Codegen.optional(this.autoConnect);
    }
    /**
     * The captive portal value for this policy. Defaults to `180`.
     * 
     */
    @Export(name="captivePortal", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> captivePortal;

    /**
     * @return The captive portal value for this policy. Defaults to `180`.
     * 
     */
    public Output<Optional<Integer>> captivePortal() {
        return Codegen.optional(this.captivePortal);
    }
    /**
     * Whether the policy refers to the default account policy.
     * 
     */
    @Export(name="default", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> default_;

    /**
     * @return Whether the policy refers to the default account policy.
     * 
     */
    public Output<Optional<Boolean>> default_() {
        return Codegen.optional(this.default_);
    }
    /**
     * Description of Policy.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output<String> description;

    /**
     * @return Description of Policy.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * Whether to disable auto fallback for this policy.
     * 
     */
    @Export(name="disableAutoFallback", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> disableAutoFallback;

    /**
     * @return Whether to disable auto fallback for this policy.
     * 
     */
    public Output<Optional<Boolean>> disableAutoFallback() {
        return Codegen.optional(this.disableAutoFallback);
    }
    /**
     * Whether the policy is enabled (cannot be set for default policies). Defaults to `true`.
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Whether the policy is enabled (cannot be set for default policies). Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * Whether to add Microsoft IPs to split tunnel exclusions.
     * 
     */
    @Export(name="excludeOfficeIps", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> excludeOfficeIps;

    /**
     * @return Whether to add Microsoft IPs to split tunnel exclusions.
     * 
     */
    public Output<Optional<Boolean>> excludeOfficeIps() {
        return Codegen.optional(this.excludeOfficeIps);
    }
    /**
     * Wirefilter expression to match a device against when evaluating whether this policy should take effect for that device.
     * 
     */
    @Export(name="match", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> match;

    /**
     * @return Wirefilter expression to match a device against when evaluating whether this policy should take effect for that device.
     * 
     */
    public Output<Optional<String>> match() {
        return Codegen.optional(this.match);
    }
    /**
     * Name of the policy.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the policy.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The precedence of the policy. Lower values indicate higher precedence.
     * 
     */
    @Export(name="precedence", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> precedence;

    /**
     * @return The precedence of the policy. Lower values indicate higher precedence.
     * 
     */
    public Output<Optional<Integer>> precedence() {
        return Codegen.optional(this.precedence);
    }
    /**
     * The service mode. Available values: `1dot1`, `warp`, `proxy`, `posture_only`, `warp_tunnel_only`. Defaults to `warp`.
     * 
     */
    @Export(name="serviceModeV2Mode", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> serviceModeV2Mode;

    /**
     * @return The service mode. Available values: `1dot1`, `warp`, `proxy`, `posture_only`, `warp_tunnel_only`. Defaults to `warp`.
     * 
     */
    public Output<Optional<String>> serviceModeV2Mode() {
        return Codegen.optional(this.serviceModeV2Mode);
    }
    /**
     * The port to use for the proxy service mode. Required when using `service_mode_v2_mode`.
     * 
     */
    @Export(name="serviceModeV2Port", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> serviceModeV2Port;

    /**
     * @return The port to use for the proxy service mode. Required when using `service_mode_v2_mode`.
     * 
     */
    public Output<Optional<Integer>> serviceModeV2Port() {
        return Codegen.optional(this.serviceModeV2Port);
    }
    /**
     * The support URL that will be opened when sending feedback.
     * 
     */
    @Export(name="supportUrl", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> supportUrl;

    /**
     * @return The support URL that will be opened when sending feedback.
     * 
     */
    public Output<Optional<String>> supportUrl() {
        return Codegen.optional(this.supportUrl);
    }
    /**
     * Enablement of the ZT client switch lock.
     * 
     */
    @Export(name="switchLocked", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> switchLocked;

    /**
     * @return Enablement of the ZT client switch lock.
     * 
     */
    public Output<Optional<Boolean>> switchLocked() {
        return Codegen.optional(this.switchLocked);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DeviceSettingsPolicy(String name) {
        this(name, DeviceSettingsPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DeviceSettingsPolicy(String name, DeviceSettingsPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DeviceSettingsPolicy(String name, DeviceSettingsPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/deviceSettingsPolicy:DeviceSettingsPolicy", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private DeviceSettingsPolicy(String name, Output<String> id, @Nullable DeviceSettingsPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/deviceSettingsPolicy:DeviceSettingsPolicy", name, state, makeResourceOptions(options, id));
    }

    private static DeviceSettingsPolicyArgs makeArgs(DeviceSettingsPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? DeviceSettingsPolicyArgs.Empty : args;
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
    public static DeviceSettingsPolicy get(String name, Output<String> id, @Nullable DeviceSettingsPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DeviceSettingsPolicy(name, id, state, options);
    }
}
