// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a resource to configure Bot Management.
 *
 * Specifically, this resource can be used to manage:
 *
 * - **Bot Fight Mode**
 * - **Super Bot Fight Mode**
 * - **Bot Management for Enterprise**
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const example = new cloudflare.BotManagement("example", {
 *     zoneId: "0da42c8d2132a9ddaf714f9e7c920711",
 *     enableJs: true,
 *     sbfmDefinitelyAutomated: "block",
 *     sbfmLikelyAutomated: "managed_challenge",
 *     sbfmVerifiedBots: "allow",
 *     sbfmStaticResourceProtection: false,
 *     optimizeWordpress: true,
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import cloudflare:index/botManagement:BotManagement example <zone_id>
 * ```
 */
export class BotManagement extends pulumi.CustomResource {
    /**
     * Get an existing BotManagement resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: BotManagementState, opts?: pulumi.CustomResourceOptions): BotManagement {
        return new BotManagement(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/botManagement:BotManagement';

    /**
     * Returns true if the given object is an instance of BotManagement.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is BotManagement {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === BotManagement.__pulumiType;
    }

    /**
     * Automatically update to the newest bot detection models created by Cloudflare as they are released. [Learn more.](https://developers.cloudflare.com/bots/reference/machine-learning-models#model-versions-and-release-notes).
     */
    public readonly autoUpdateModel!: pulumi.Output<boolean | undefined>;
    /**
     * Use lightweight, invisible JavaScript detections to improve Bot Management. [Learn more about JavaScript Detections](https://developers.cloudflare.com/bots/reference/javascript-detections/).
     */
    public readonly enableJs!: pulumi.Output<boolean | undefined>;
    /**
     * Whether to enable Bot Fight Mode.
     */
    public readonly fightMode!: pulumi.Output<boolean | undefined>;
    /**
     * Whether to optimize Super Bot Fight Mode protections for Wordpress.
     */
    public readonly optimizeWordpress!: pulumi.Output<boolean | undefined>;
    /**
     * Super Bot Fight Mode (SBFM) action to take on definitely automated requests.
     */
    public readonly sbfmDefinitelyAutomated!: pulumi.Output<string | undefined>;
    /**
     * Super Bot Fight Mode (SBFM) action to take on likely automated requests.
     */
    public readonly sbfmLikelyAutomated!: pulumi.Output<string | undefined>;
    /**
     * Super Bot Fight Mode (SBFM) to enable static resource protection. Enable if static resources on your application need bot protection. Note: Static resource protection can also result in legitimate traffic being blocked.
     */
    public readonly sbfmStaticResourceProtection!: pulumi.Output<boolean | undefined>;
    /**
     * Super Bot Fight Mode (SBFM) action to take on verified bots requests.
     */
    public readonly sbfmVerifiedBots!: pulumi.Output<string | undefined>;
    /**
     * Whether to disable tracking the highest bot score for a session in the Bot Management cookie.
     */
    public readonly suppressSessionScore!: pulumi.Output<boolean | undefined>;
    /**
     * A read-only field that indicates whether the zone currently is running the latest ML model.
     */
    public /*out*/ readonly usingLatestModel!: pulumi.Output<boolean>;
    /**
     * The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    public readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a BotManagement resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: BotManagementArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: BotManagementArgs | BotManagementState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as BotManagementState | undefined;
            resourceInputs["autoUpdateModel"] = state ? state.autoUpdateModel : undefined;
            resourceInputs["enableJs"] = state ? state.enableJs : undefined;
            resourceInputs["fightMode"] = state ? state.fightMode : undefined;
            resourceInputs["optimizeWordpress"] = state ? state.optimizeWordpress : undefined;
            resourceInputs["sbfmDefinitelyAutomated"] = state ? state.sbfmDefinitelyAutomated : undefined;
            resourceInputs["sbfmLikelyAutomated"] = state ? state.sbfmLikelyAutomated : undefined;
            resourceInputs["sbfmStaticResourceProtection"] = state ? state.sbfmStaticResourceProtection : undefined;
            resourceInputs["sbfmVerifiedBots"] = state ? state.sbfmVerifiedBots : undefined;
            resourceInputs["suppressSessionScore"] = state ? state.suppressSessionScore : undefined;
            resourceInputs["usingLatestModel"] = state ? state.usingLatestModel : undefined;
            resourceInputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as BotManagementArgs | undefined;
            if ((!args || args.zoneId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'zoneId'");
            }
            resourceInputs["autoUpdateModel"] = args ? args.autoUpdateModel : undefined;
            resourceInputs["enableJs"] = args ? args.enableJs : undefined;
            resourceInputs["fightMode"] = args ? args.fightMode : undefined;
            resourceInputs["optimizeWordpress"] = args ? args.optimizeWordpress : undefined;
            resourceInputs["sbfmDefinitelyAutomated"] = args ? args.sbfmDefinitelyAutomated : undefined;
            resourceInputs["sbfmLikelyAutomated"] = args ? args.sbfmLikelyAutomated : undefined;
            resourceInputs["sbfmStaticResourceProtection"] = args ? args.sbfmStaticResourceProtection : undefined;
            resourceInputs["sbfmVerifiedBots"] = args ? args.sbfmVerifiedBots : undefined;
            resourceInputs["suppressSessionScore"] = args ? args.suppressSessionScore : undefined;
            resourceInputs["zoneId"] = args ? args.zoneId : undefined;
            resourceInputs["usingLatestModel"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(BotManagement.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering BotManagement resources.
 */
export interface BotManagementState {
    /**
     * Automatically update to the newest bot detection models created by Cloudflare as they are released. [Learn more.](https://developers.cloudflare.com/bots/reference/machine-learning-models#model-versions-and-release-notes).
     */
    autoUpdateModel?: pulumi.Input<boolean>;
    /**
     * Use lightweight, invisible JavaScript detections to improve Bot Management. [Learn more about JavaScript Detections](https://developers.cloudflare.com/bots/reference/javascript-detections/).
     */
    enableJs?: pulumi.Input<boolean>;
    /**
     * Whether to enable Bot Fight Mode.
     */
    fightMode?: pulumi.Input<boolean>;
    /**
     * Whether to optimize Super Bot Fight Mode protections for Wordpress.
     */
    optimizeWordpress?: pulumi.Input<boolean>;
    /**
     * Super Bot Fight Mode (SBFM) action to take on definitely automated requests.
     */
    sbfmDefinitelyAutomated?: pulumi.Input<string>;
    /**
     * Super Bot Fight Mode (SBFM) action to take on likely automated requests.
     */
    sbfmLikelyAutomated?: pulumi.Input<string>;
    /**
     * Super Bot Fight Mode (SBFM) to enable static resource protection. Enable if static resources on your application need bot protection. Note: Static resource protection can also result in legitimate traffic being blocked.
     */
    sbfmStaticResourceProtection?: pulumi.Input<boolean>;
    /**
     * Super Bot Fight Mode (SBFM) action to take on verified bots requests.
     */
    sbfmVerifiedBots?: pulumi.Input<string>;
    /**
     * Whether to disable tracking the highest bot score for a session in the Bot Management cookie.
     */
    suppressSessionScore?: pulumi.Input<boolean>;
    /**
     * A read-only field that indicates whether the zone currently is running the latest ML model.
     */
    usingLatestModel?: pulumi.Input<boolean>;
    /**
     * The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a BotManagement resource.
 */
export interface BotManagementArgs {
    /**
     * Automatically update to the newest bot detection models created by Cloudflare as they are released. [Learn more.](https://developers.cloudflare.com/bots/reference/machine-learning-models#model-versions-and-release-notes).
     */
    autoUpdateModel?: pulumi.Input<boolean>;
    /**
     * Use lightweight, invisible JavaScript detections to improve Bot Management. [Learn more about JavaScript Detections](https://developers.cloudflare.com/bots/reference/javascript-detections/).
     */
    enableJs?: pulumi.Input<boolean>;
    /**
     * Whether to enable Bot Fight Mode.
     */
    fightMode?: pulumi.Input<boolean>;
    /**
     * Whether to optimize Super Bot Fight Mode protections for Wordpress.
     */
    optimizeWordpress?: pulumi.Input<boolean>;
    /**
     * Super Bot Fight Mode (SBFM) action to take on definitely automated requests.
     */
    sbfmDefinitelyAutomated?: pulumi.Input<string>;
    /**
     * Super Bot Fight Mode (SBFM) action to take on likely automated requests.
     */
    sbfmLikelyAutomated?: pulumi.Input<string>;
    /**
     * Super Bot Fight Mode (SBFM) to enable static resource protection. Enable if static resources on your application need bot protection. Note: Static resource protection can also result in legitimate traffic being blocked.
     */
    sbfmStaticResourceProtection?: pulumi.Input<boolean>;
    /**
     * Super Bot Fight Mode (SBFM) action to take on verified bots requests.
     */
    sbfmVerifiedBots?: pulumi.Input<string>;
    /**
     * Whether to disable tracking the highest bot score for a session in the Bot Management cookie.
     */
    suppressSessionScore?: pulumi.Input<boolean>;
    /**
     * The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    zoneId: pulumi.Input<string>;
}
