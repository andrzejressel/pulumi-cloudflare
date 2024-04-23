// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * The [Email Routing Rule](https://developers.cloudflare.com/email-routing/setup/email-routing-addresses/#email-rule-actions) resource allows you to create and manage email routing rules for a zone.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const main = new cloudflare.EmailRoutingRule("main", {
 *     zoneId: "0da42c8d2132a9ddaf714f9e7c920711",
 *     name: "terraform rule",
 *     enabled: true,
 *     matchers: [{
 *         type: "literal",
 *         field: "to",
 *         value: "test@example.com",
 *     }],
 *     actions: [{
 *         type: "forward",
 *         values: ["destinationaddress@example.net"],
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import cloudflare:index/emailRoutingRule:EmailRoutingRule example <zone_id>/<email_routing_rule_id>
 * ```
 */
export class EmailRoutingRule extends pulumi.CustomResource {
    /**
     * Get an existing EmailRoutingRule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EmailRoutingRuleState, opts?: pulumi.CustomResourceOptions): EmailRoutingRule {
        return new EmailRoutingRule(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/emailRoutingRule:EmailRoutingRule';

    /**
     * Returns true if the given object is an instance of EmailRoutingRule.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is EmailRoutingRule {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === EmailRoutingRule.__pulumiType;
    }

    /**
     * Actions to take when a match is found.
     */
    public readonly actions!: pulumi.Output<outputs.EmailRoutingRuleAction[] | undefined>;
    /**
     * Whether the email routing rule is enabled.
     */
    public readonly enabled!: pulumi.Output<boolean | undefined>;
    /**
     * Matching patterns to forward to your actions.
     */
    public readonly matchers!: pulumi.Output<outputs.EmailRoutingRuleMatcher[] | undefined>;
    /**
     * Routing rule name.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The priority of the email routing rule.
     */
    public readonly priority!: pulumi.Output<number>;
    /**
     * The tag of the email routing rule.
     */
    public /*out*/ readonly tag!: pulumi.Output<string>;
    /**
     * The zone identifier to target for the resource.
     */
    public readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a EmailRoutingRule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: EmailRoutingRuleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EmailRoutingRuleArgs | EmailRoutingRuleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EmailRoutingRuleState | undefined;
            resourceInputs["actions"] = state ? state.actions : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["matchers"] = state ? state.matchers : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["priority"] = state ? state.priority : undefined;
            resourceInputs["tag"] = state ? state.tag : undefined;
            resourceInputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as EmailRoutingRuleArgs | undefined;
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
            resourceInputs["priority"] = args ? args.priority : undefined;
            resourceInputs["zoneId"] = args ? args.zoneId : undefined;
            resourceInputs["tag"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(EmailRoutingRule.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering EmailRoutingRule resources.
 */
export interface EmailRoutingRuleState {
    /**
     * Actions to take when a match is found.
     */
    actions?: pulumi.Input<pulumi.Input<inputs.EmailRoutingRuleAction>[]>;
    /**
     * Whether the email routing rule is enabled.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Matching patterns to forward to your actions.
     */
    matchers?: pulumi.Input<pulumi.Input<inputs.EmailRoutingRuleMatcher>[]>;
    /**
     * Routing rule name.
     */
    name?: pulumi.Input<string>;
    /**
     * The priority of the email routing rule.
     */
    priority?: pulumi.Input<number>;
    /**
     * The tag of the email routing rule.
     */
    tag?: pulumi.Input<string>;
    /**
     * The zone identifier to target for the resource.
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a EmailRoutingRule resource.
 */
export interface EmailRoutingRuleArgs {
    /**
     * Actions to take when a match is found.
     */
    actions?: pulumi.Input<pulumi.Input<inputs.EmailRoutingRuleAction>[]>;
    /**
     * Whether the email routing rule is enabled.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Matching patterns to forward to your actions.
     */
    matchers?: pulumi.Input<pulumi.Input<inputs.EmailRoutingRuleMatcher>[]>;
    /**
     * Routing rule name.
     */
    name: pulumi.Input<string>;
    /**
     * The priority of the email routing rule.
     */
    priority?: pulumi.Input<number>;
    /**
     * The zone identifier to target for the resource.
     */
    zoneId: pulumi.Input<string>;
}
