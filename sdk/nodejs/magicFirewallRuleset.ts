// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Magic Firewall is a network-level firewall to protect networks that are onboarded to Cloudflare's Magic Transit. This resource
 * creates a root ruleset on the account level and contains one or more rules. Rules can be crafted in Wireshark syntax and
 * are evaluated in order, with the first rule having the highest priority.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const example = new cloudflare.MagicFirewallRuleset("example", {
 *     accountId: "d41d8cd98f00b204e9800998ecf8427e",
 *     name: "Magic Transit Ruleset",
 *     description: "Global mitigations",
 *     rules: [
 *         {
 *             action: "allow",
 *             expression: "tcp.dstport in { 32768..65535 }",
 *             description: "Allow TCP Ephemeral Ports",
 *             enabled: "true",
 *         },
 *         {
 *             action: "block",
 *             expression: "ip.len >= 0",
 *             description: "Block all",
 *             enabled: "true",
 *         },
 *     ],
 * });
 * ```
 *
 * ## Import
 *
 * An existing Magic Firewall Ruleset can be imported using the account ID and ruleset ID
 *
 * ```sh
 * $ pulumi import cloudflare:index/magicFirewallRuleset:MagicFirewallRuleset example d41d8cd98f00b204e9800998ecf8427e/cb029e245cfdd66dc8d2e570d5dd3322
 * ```
 */
export class MagicFirewallRuleset extends pulumi.CustomResource {
    /**
     * Get an existing MagicFirewallRuleset resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: MagicFirewallRulesetState, opts?: pulumi.CustomResourceOptions): MagicFirewallRuleset {
        return new MagicFirewallRuleset(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/magicFirewallRuleset:MagicFirewallRuleset';

    /**
     * Returns true if the given object is an instance of MagicFirewallRuleset.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is MagicFirewallRuleset {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === MagicFirewallRuleset.__pulumiType;
    }

    /**
     * The ID of the account where the ruleset is being created.
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * A note that can be used to annotate the rule.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The name of the ruleset.
     */
    public readonly name!: pulumi.Output<string>;
    public readonly rules!: pulumi.Output<{[key: string]: string}[] | undefined>;

    /**
     * Create a MagicFirewallRuleset resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: MagicFirewallRulesetArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: MagicFirewallRulesetArgs | MagicFirewallRulesetState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as MagicFirewallRulesetState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["rules"] = state ? state.rules : undefined;
        } else {
            const args = argsOrState as MagicFirewallRulesetArgs | undefined;
            if ((!args || args.accountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountId'");
            }
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["rules"] = args ? args.rules : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(MagicFirewallRuleset.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering MagicFirewallRuleset resources.
 */
export interface MagicFirewallRulesetState {
    /**
     * The ID of the account where the ruleset is being created.
     */
    accountId?: pulumi.Input<string>;
    /**
     * A note that can be used to annotate the rule.
     */
    description?: pulumi.Input<string>;
    /**
     * The name of the ruleset.
     */
    name?: pulumi.Input<string>;
    rules?: pulumi.Input<pulumi.Input<{[key: string]: pulumi.Input<string>}>[]>;
}

/**
 * The set of arguments for constructing a MagicFirewallRuleset resource.
 */
export interface MagicFirewallRulesetArgs {
    /**
     * The ID of the account where the ruleset is being created.
     */
    accountId: pulumi.Input<string>;
    /**
     * A note that can be used to annotate the rule.
     */
    description?: pulumi.Input<string>;
    /**
     * The name of the ruleset.
     */
    name: pulumi.Input<string>;
    rules?: pulumi.Input<pulumi.Input<{[key: string]: pulumi.Input<string>}>[]>;
}
