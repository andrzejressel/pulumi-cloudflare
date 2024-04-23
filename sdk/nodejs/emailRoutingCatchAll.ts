// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a resource for managing Email Routing Addresses catch all behaviour.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const example = new cloudflare.EmailRoutingCatchAll("example", {
 *     zoneId: "0da42c8d2132a9ddaf714f9e7c920711",
 *     name: "example catch all",
 *     enabled: true,
 *     matchers: [{
 *         type: "all",
 *     }],
 *     actions: [{
 *         type: "forward",
 *         values: ["destinationaddress@example.net"],
 *     }],
 * });
 * ```
 */
export class EmailRoutingCatchAll extends pulumi.CustomResource {
    /**
     * Get an existing EmailRoutingCatchAll resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EmailRoutingCatchAllState, opts?: pulumi.CustomResourceOptions): EmailRoutingCatchAll {
        return new EmailRoutingCatchAll(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/emailRoutingCatchAll:EmailRoutingCatchAll';

    /**
     * Returns true if the given object is an instance of EmailRoutingCatchAll.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is EmailRoutingCatchAll {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === EmailRoutingCatchAll.__pulumiType;
    }

    /**
     * List actions patterns.
     */
    public readonly actions!: pulumi.Output<outputs.EmailRoutingCatchAllAction[]>;
    /**
     * Routing rule status.
     */
    public readonly enabled!: pulumi.Output<boolean | undefined>;
    /**
     * Matching patterns to forward to your actions.
     */
    public readonly matchers!: pulumi.Output<outputs.EmailRoutingCatchAllMatcher[]>;
    /**
     * Routing rule name.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Routing rule identifier.
     */
    public /*out*/ readonly tag!: pulumi.Output<string>;
    /**
     * The zone identifier to target for the resource.
     */
    public readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a EmailRoutingCatchAll resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: EmailRoutingCatchAllArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EmailRoutingCatchAllArgs | EmailRoutingCatchAllState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EmailRoutingCatchAllState | undefined;
            resourceInputs["actions"] = state ? state.actions : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["matchers"] = state ? state.matchers : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["tag"] = state ? state.tag : undefined;
            resourceInputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as EmailRoutingCatchAllArgs | undefined;
            if ((!args || args.actions === undefined) && !opts.urn) {
                throw new Error("Missing required property 'actions'");
            }
            if ((!args || args.matchers === undefined) && !opts.urn) {
                throw new Error("Missing required property 'matchers'");
            }
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            if ((!args || args.zoneId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'zoneId'");
            }
            resourceInputs["actions"] = args ? args.actions : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["matchers"] = args ? args.matchers : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["zoneId"] = args ? args.zoneId : undefined;
            resourceInputs["tag"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(EmailRoutingCatchAll.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering EmailRoutingCatchAll resources.
 */
export interface EmailRoutingCatchAllState {
    /**
     * List actions patterns.
     */
    actions?: pulumi.Input<pulumi.Input<inputs.EmailRoutingCatchAllAction>[]>;
    /**
     * Routing rule status.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Matching patterns to forward to your actions.
     */
    matchers?: pulumi.Input<pulumi.Input<inputs.EmailRoutingCatchAllMatcher>[]>;
    /**
     * Routing rule name.
     */
    name?: pulumi.Input<string>;
    /**
     * Routing rule identifier.
     */
    tag?: pulumi.Input<string>;
    /**
     * The zone identifier to target for the resource.
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a EmailRoutingCatchAll resource.
 */
export interface EmailRoutingCatchAllArgs {
    /**
     * List actions patterns.
     */
    actions: pulumi.Input<pulumi.Input<inputs.EmailRoutingCatchAllAction>[]>;
    /**
     * Routing rule status.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Matching patterns to forward to your actions.
     */
    matchers: pulumi.Input<pulumi.Input<inputs.EmailRoutingCatchAllMatcher>[]>;
    /**
     * Routing rule name.
     */
    name: pulumi.Input<string>;
    /**
     * The zone identifier to target for the resource.
     */
    zoneId: pulumi.Input<string>;
}
