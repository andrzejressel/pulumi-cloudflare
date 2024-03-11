// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Cloudflare per-hostname TLS setting resource. Used to set TLS settings for hostnames under the specified zone.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const example = new cloudflare.HostnameTlsSetting("example", {
 *     hostname: "sub.example.com",
 *     setting: "min_tls_version",
 *     value: "1.2",
 *     zoneId: "0da42c8d2132a9ddaf714f9e7c920711",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import cloudflare:index/hostnameTlsSetting:HostnameTlsSetting example <zone_id>/<hostname>/<setting_name>
 * ```
 */
export class HostnameTlsSetting extends pulumi.CustomResource {
    /**
     * Get an existing HostnameTlsSetting resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: HostnameTlsSettingState, opts?: pulumi.CustomResourceOptions): HostnameTlsSetting {
        return new HostnameTlsSetting(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/hostnameTlsSetting:HostnameTlsSetting';

    /**
     * Returns true if the given object is an instance of HostnameTlsSetting.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is HostnameTlsSetting {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === HostnameTlsSetting.__pulumiType;
    }

    public /*out*/ readonly createdAt!: pulumi.Output<string>;
    /**
     * Hostname that belongs to this zone name. **Modifying this attribute will force creation of a new resource.**
     */
    public readonly hostname!: pulumi.Output<string>;
    /**
     * TLS setting name. **Modifying this attribute will force creation of a new resource.**
     */
    public readonly setting!: pulumi.Output<string>;
    public /*out*/ readonly updatedAt!: pulumi.Output<string>;
    /**
     * TLS setting value.
     */
    public readonly value!: pulumi.Output<string>;
    /**
     * The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    public readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a HostnameTlsSetting resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: HostnameTlsSettingArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: HostnameTlsSettingArgs | HostnameTlsSettingState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as HostnameTlsSettingState | undefined;
            resourceInputs["createdAt"] = state ? state.createdAt : undefined;
            resourceInputs["hostname"] = state ? state.hostname : undefined;
            resourceInputs["setting"] = state ? state.setting : undefined;
            resourceInputs["updatedAt"] = state ? state.updatedAt : undefined;
            resourceInputs["value"] = state ? state.value : undefined;
            resourceInputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as HostnameTlsSettingArgs | undefined;
            if ((!args || args.hostname === undefined) && !opts.urn) {
                throw new Error("Missing required property 'hostname'");
            }
            if ((!args || args.setting === undefined) && !opts.urn) {
                throw new Error("Missing required property 'setting'");
            }
            if ((!args || args.value === undefined) && !opts.urn) {
                throw new Error("Missing required property 'value'");
            }
            if ((!args || args.zoneId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'zoneId'");
            }
            resourceInputs["hostname"] = args ? args.hostname : undefined;
            resourceInputs["setting"] = args ? args.setting : undefined;
            resourceInputs["value"] = args ? args.value : undefined;
            resourceInputs["zoneId"] = args ? args.zoneId : undefined;
            resourceInputs["createdAt"] = undefined /*out*/;
            resourceInputs["updatedAt"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(HostnameTlsSetting.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering HostnameTlsSetting resources.
 */
export interface HostnameTlsSettingState {
    createdAt?: pulumi.Input<string>;
    /**
     * Hostname that belongs to this zone name. **Modifying this attribute will force creation of a new resource.**
     */
    hostname?: pulumi.Input<string>;
    /**
     * TLS setting name. **Modifying this attribute will force creation of a new resource.**
     */
    setting?: pulumi.Input<string>;
    updatedAt?: pulumi.Input<string>;
    /**
     * TLS setting value.
     */
    value?: pulumi.Input<string>;
    /**
     * The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a HostnameTlsSetting resource.
 */
export interface HostnameTlsSettingArgs {
    /**
     * Hostname that belongs to this zone name. **Modifying this attribute will force creation of a new resource.**
     */
    hostname: pulumi.Input<string>;
    /**
     * TLS setting name. **Modifying this attribute will force creation of a new resource.**
     */
    setting: pulumi.Input<string>;
    /**
     * TLS setting value.
     */
    value: pulumi.Input<string>;
    /**
     * The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    zoneId: pulumi.Input<string>;
}
