// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.EmailRoutingSettingsArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.EmailRoutingSettingsState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a resource for managing Email Routing settings.
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
 * import com.pulumi.cloudflare.EmailRoutingSettings;
 * import com.pulumi.cloudflare.EmailRoutingSettingsArgs;
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
 *         var myZone = new EmailRoutingSettings("myZone", EmailRoutingSettingsArgs.builder()
 *             .zoneId("0da42c8d2132a9ddaf714f9e7c920711")
 *             .enabled("true")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="cloudflare:index/emailRoutingSettings:EmailRoutingSettings")
public class EmailRoutingSettings extends com.pulumi.resources.CustomResource {
    /**
     * The date and time the settings have been created.
     * 
     */
    @Export(name="created", refs={String.class}, tree="[0]")
    private Output<String> created;

    /**
     * @return The date and time the settings have been created.
     * 
     */
    public Output<String> created() {
        return this.created;
    }
    /**
     * State of the zone settings for Email Routing. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> enabled;

    /**
     * @return State of the zone settings for Email Routing. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }
    /**
     * The date and time the settings have been modified.
     * 
     */
    @Export(name="modified", refs={String.class}, tree="[0]")
    private Output<String> modified;

    /**
     * @return The date and time the settings have been modified.
     * 
     */
    public Output<String> modified() {
        return this.modified;
    }
    /**
     * Domain of your zone.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Domain of your zone.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Flag to check if the user skipped the configuration wizard.
     * 
     */
    @Export(name="skipWizard", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> skipWizard;

    /**
     * @return Flag to check if the user skipped the configuration wizard.
     * 
     */
    public Output<Boolean> skipWizard() {
        return this.skipWizard;
    }
    /**
     * Show the state of your account, and the type or configuration error.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return Show the state of your account, and the type or configuration error.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * Email Routing settings identifier.
     * 
     */
    @Export(name="tag", refs={String.class}, tree="[0]")
    private Output<String> tag;

    /**
     * @return Email Routing settings identifier.
     * 
     */
    public Output<String> tag() {
        return this.tag;
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
    public EmailRoutingSettings(String name) {
        this(name, EmailRoutingSettingsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EmailRoutingSettings(String name, EmailRoutingSettingsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EmailRoutingSettings(String name, EmailRoutingSettingsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/emailRoutingSettings:EmailRoutingSettings", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private EmailRoutingSettings(String name, Output<String> id, @Nullable EmailRoutingSettingsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/emailRoutingSettings:EmailRoutingSettings", name, state, makeResourceOptions(options, id));
    }

    private static EmailRoutingSettingsArgs makeArgs(EmailRoutingSettingsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? EmailRoutingSettingsArgs.Empty : args;
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
    public static EmailRoutingSettings get(String name, Output<String> id, @Nullable EmailRoutingSettingsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EmailRoutingSettings(name, id, state, options);
    }
}
