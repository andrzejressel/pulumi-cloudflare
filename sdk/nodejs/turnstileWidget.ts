// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * The [Turnstile Widget](https://developers.cloudflare.com/turnstile/) resource allows you to manage Cloudflare Turnstile Widgets.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const example = new cloudflare.TurnstileWidget("example", {
 *     accountId: "f037e56e89293a057740de681ac9abbe",
 *     botFightMode: false,
 *     domains: ["example.com"],
 *     mode: "invisible",
 *     name: "example widget",
 *     region: "world",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import cloudflare:index/turnstileWidget:TurnstileWidget example <account_id>/<site_key>
 * ```
 */
export class TurnstileWidget extends pulumi.CustomResource {
    /**
     * Get an existing TurnstileWidget resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TurnstileWidgetState, opts?: pulumi.CustomResourceOptions): TurnstileWidget {
        return new TurnstileWidget(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/turnstileWidget:TurnstileWidget';

    /**
     * Returns true if the given object is an instance of TurnstileWidget.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is TurnstileWidget {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === TurnstileWidget.__pulumiType;
    }

    /**
     * The account identifier to target for the resource.
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * If bot*fight*mode is set to true, Cloudflare issues computationally expensive challenges in response to malicious bots (Enterprise only).
     */
    public readonly botFightMode!: pulumi.Output<boolean>;
    /**
     * Domains where the widget is deployed
     */
    public readonly domains!: pulumi.Output<string[]>;
    /**
     * Widget Mode. Available values: `non-interactive`, `invisible`, `managed`
     */
    public readonly mode!: pulumi.Output<string>;
    /**
     * Human readable widget name.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Do not show any Cloudflare branding on the widget (Enterprise only).
     */
    public readonly offlabel!: pulumi.Output<boolean>;
    /**
     * Region where this widget can be used.
     */
    public readonly region!: pulumi.Output<string>;
    /**
     * Secret key for this widget.
     */
    public /*out*/ readonly secret!: pulumi.Output<string>;

    /**
     * Create a TurnstileWidget resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TurnstileWidgetArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TurnstileWidgetArgs | TurnstileWidgetState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TurnstileWidgetState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["botFightMode"] = state ? state.botFightMode : undefined;
            resourceInputs["domains"] = state ? state.domains : undefined;
            resourceInputs["mode"] = state ? state.mode : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["offlabel"] = state ? state.offlabel : undefined;
            resourceInputs["region"] = state ? state.region : undefined;
            resourceInputs["secret"] = state ? state.secret : undefined;
        } else {
            const args = argsOrState as TurnstileWidgetArgs | undefined;
            if ((!args || args.accountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountId'");
            }
            if ((!args || args.domains === undefined) && !opts.urn) {
                throw new Error("Missing required property 'domains'");
            }
            if ((!args || args.mode === undefined) && !opts.urn) {
                throw new Error("Missing required property 'mode'");
            }
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["botFightMode"] = args ? args.botFightMode : undefined;
            resourceInputs["domains"] = args ? args.domains : undefined;
            resourceInputs["mode"] = args ? args.mode : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["offlabel"] = args ? args.offlabel : undefined;
            resourceInputs["region"] = args ? args.region : undefined;
            resourceInputs["secret"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["secret"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(TurnstileWidget.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering TurnstileWidget resources.
 */
export interface TurnstileWidgetState {
    /**
     * The account identifier to target for the resource.
     */
    accountId?: pulumi.Input<string>;
    /**
     * If bot*fight*mode is set to true, Cloudflare issues computationally expensive challenges in response to malicious bots (Enterprise only).
     */
    botFightMode?: pulumi.Input<boolean>;
    /**
     * Domains where the widget is deployed
     */
    domains?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Widget Mode. Available values: `non-interactive`, `invisible`, `managed`
     */
    mode?: pulumi.Input<string>;
    /**
     * Human readable widget name.
     */
    name?: pulumi.Input<string>;
    /**
     * Do not show any Cloudflare branding on the widget (Enterprise only).
     */
    offlabel?: pulumi.Input<boolean>;
    /**
     * Region where this widget can be used.
     */
    region?: pulumi.Input<string>;
    /**
     * Secret key for this widget.
     */
    secret?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a TurnstileWidget resource.
 */
export interface TurnstileWidgetArgs {
    /**
     * The account identifier to target for the resource.
     */
    accountId: pulumi.Input<string>;
    /**
     * If bot*fight*mode is set to true, Cloudflare issues computationally expensive challenges in response to malicious bots (Enterprise only).
     */
    botFightMode?: pulumi.Input<boolean>;
    /**
     * Domains where the widget is deployed
     */
    domains: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Widget Mode. Available values: `non-interactive`, `invisible`, `managed`
     */
    mode: pulumi.Input<string>;
    /**
     * Human readable widget name.
     */
    name: pulumi.Input<string>;
    /**
     * Do not show any Cloudflare branding on the widget (Enterprise only).
     */
    offlabel?: pulumi.Input<boolean>;
    /**
     * Region where this widget can be used.
     */
    region?: pulumi.Input<string>;
}
