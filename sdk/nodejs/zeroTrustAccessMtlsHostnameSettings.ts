// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a Cloudflare Access Mutual TLS Certificate Settings resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const example = new cloudflare.ZeroTrustAccessMtlsHostnameSettings("example", {
 *     zoneId: "0da42c8d2132a9ddaf714f9e7c920711",
 *     settings: [{
 *         hostname: "example.com",
 *         clientCertificateForwarding: true,
 *         chinaNetwork: false,
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * Account level mTLS hostname settings import.
 *
 * ```sh
 * $ pulumi import cloudflare:index/zeroTrustAccessMtlsHostnameSettings:ZeroTrustAccessMtlsHostnameSettings example account/<account_id>
 * ```
 *
 * Zone level mTLS hostname settings import.
 *
 * ```sh
 * $ pulumi import cloudflare:index/zeroTrustAccessMtlsHostnameSettings:ZeroTrustAccessMtlsHostnameSettings example zone/<zone_id>
 * ```
 */
export class ZeroTrustAccessMtlsHostnameSettings extends pulumi.CustomResource {
    /**
     * Get an existing ZeroTrustAccessMtlsHostnameSettings resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ZeroTrustAccessMtlsHostnameSettingsState, opts?: pulumi.CustomResourceOptions): ZeroTrustAccessMtlsHostnameSettings {
        return new ZeroTrustAccessMtlsHostnameSettings(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/zeroTrustAccessMtlsHostnameSettings:ZeroTrustAccessMtlsHostnameSettings';

    /**
     * Returns true if the given object is an instance of ZeroTrustAccessMtlsHostnameSettings.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ZeroTrustAccessMtlsHostnameSettings {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ZeroTrustAccessMtlsHostnameSettings.__pulumiType;
    }

    /**
     * The account identifier to target for the resource.
     */
    public readonly accountId!: pulumi.Output<string | undefined>;
    public readonly settings!: pulumi.Output<outputs.ZeroTrustAccessMtlsHostnameSettingsSetting[] | undefined>;
    /**
     * The zone identifier to target for the resource.
     */
    public readonly zoneId!: pulumi.Output<string | undefined>;

    /**
     * Create a ZeroTrustAccessMtlsHostnameSettings resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: ZeroTrustAccessMtlsHostnameSettingsArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ZeroTrustAccessMtlsHostnameSettingsArgs | ZeroTrustAccessMtlsHostnameSettingsState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ZeroTrustAccessMtlsHostnameSettingsState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["settings"] = state ? state.settings : undefined;
            resourceInputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as ZeroTrustAccessMtlsHostnameSettingsArgs | undefined;
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["settings"] = args ? args.settings : undefined;
            resourceInputs["zoneId"] = args ? args.zoneId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ZeroTrustAccessMtlsHostnameSettings.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ZeroTrustAccessMtlsHostnameSettings resources.
 */
export interface ZeroTrustAccessMtlsHostnameSettingsState {
    /**
     * The account identifier to target for the resource.
     */
    accountId?: pulumi.Input<string>;
    settings?: pulumi.Input<pulumi.Input<inputs.ZeroTrustAccessMtlsHostnameSettingsSetting>[]>;
    /**
     * The zone identifier to target for the resource.
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ZeroTrustAccessMtlsHostnameSettings resource.
 */
export interface ZeroTrustAccessMtlsHostnameSettingsArgs {
    /**
     * The account identifier to target for the resource.
     */
    accountId?: pulumi.Input<string>;
    settings?: pulumi.Input<pulumi.Input<inputs.ZeroTrustAccessMtlsHostnameSettingsSetting>[]>;
    /**
     * The zone identifier to target for the resource.
     */
    zoneId?: pulumi.Input<string>;
}