// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Provides a Cloudflare Access Policy resource. Access Policies are used
 * in conjunction with Access Applications to restrict access to a
 * particular resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * // Allowing access to `test@example.com` email address only
 * const testPolicyAccessPolicy = new cloudflare.AccessPolicy("testPolicyAccessPolicy", {
 *     applicationId: "cb029e245cfdd66dc8d2e570d5dd3322",
 *     zoneId: "d41d8cd98f00b204e9800998ecf8427e",
 *     name: "staging policy",
 *     precedence: "1",
 *     decision: "allow",
 *     includes: [{
 *         emails: ["test@example.com"],
 *     }],
 *     requires: [{
 *         emails: ["test@example.com"],
 *     }],
 * });
 * // Allowing `test@example.com` to access but only when coming from a
 * // specific IP.
 * const testPolicyIndex_accessPolicyAccessPolicy = new cloudflare.AccessPolicy("testPolicyIndex/accessPolicyAccessPolicy", {
 *     applicationId: "cb029e245cfdd66dc8d2e570d5dd3322",
 *     zoneId: "d41d8cd98f00b204e9800998ecf8427e",
 *     name: "staging policy",
 *     precedence: "1",
 *     decision: "allow",
 *     includes: [{
 *         emails: ["test@example.com"],
 *     }],
 *     requires: [{
 *         ips: [_var.office_ip],
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * Access Policies can be imported using a composite ID formed of identifier type (`zone` or `account`), identifier ID (`zone_id` or `account_id`), application ID and policy ID. # import a zone level Access policy
 *
 * ```sh
 *  $ pulumi import cloudflare:index/accessPolicy:AccessPolicy staging zone/cb029e245cfdd66dc8d2e570d5dd3322/d41d8cd98f00b204e9800998ecf8427e/67ea780ce4982c1cfbe6b7293afc765d
 * ```
 *
 * # import an account level Access policy
 *
 * ```sh
 *  $ pulumi import cloudflare:index/accessPolicy:AccessPolicy production account/0d599f0ec05c3bda8c3b8a68c32a1b47/d41d8cd98f00b204e9800998ecf8427e/67ea780ce4982c1cfbe6b7293afc765d
 * ```
 */
export class AccessPolicy extends pulumi.CustomResource {
    /**
     * Get an existing AccessPolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AccessPolicyState, opts?: pulumi.CustomResourceOptions): AccessPolicy {
        return new AccessPolicy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/accessPolicy:AccessPolicy';

    /**
     * Returns true if the given object is an instance of AccessPolicy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AccessPolicy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AccessPolicy.__pulumiType;
    }

    /**
     * The account to which the access rule should be added. Conflicts with `zoneId`.
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * The ID of the application the policy is associated with.
     */
    public readonly applicationId!: pulumi.Output<string>;
    /**
     * Defines the action Access will take if the policy matches the user.
     * Allowed values: `allow`, `deny`, `nonIdentity`, `bypass`
     */
    public readonly decision!: pulumi.Output<string>;
    /**
     * A series of access conditions, see [Access Groups](https://www.terraform.io/providers/cloudflare/cloudflare/latest/docs/resources/access_group#conditions).
     */
    public readonly excludes!: pulumi.Output<outputs.AccessPolicyExclude[] | undefined>;
    /**
     * A series of access conditions, see [Access Groups](https://www.terraform.io/providers/cloudflare/cloudflare/latest/docs/resources/access_group#conditions).
     */
    public readonly includes!: pulumi.Output<outputs.AccessPolicyInclude[]>;
    /**
     * Friendly name of the Access Application.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The unique precedence for policies on a single application. Integer.
     */
    public readonly precedence!: pulumi.Output<number>;
    /**
     * A series of access conditions, see [Access Groups](https://www.terraform.io/providers/cloudflare/cloudflare/latest/docs/resources/access_group#conditions).
     */
    public readonly requires!: pulumi.Output<outputs.AccessPolicyRequire[] | undefined>;
    /**
     * The DNS zone to which the access rule should be added. Conflicts with `accountId`.
     */
    public readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a AccessPolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AccessPolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AccessPolicyArgs | AccessPolicyState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AccessPolicyState | undefined;
            inputs["accountId"] = state ? state.accountId : undefined;
            inputs["applicationId"] = state ? state.applicationId : undefined;
            inputs["decision"] = state ? state.decision : undefined;
            inputs["excludes"] = state ? state.excludes : undefined;
            inputs["includes"] = state ? state.includes : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["precedence"] = state ? state.precedence : undefined;
            inputs["requires"] = state ? state.requires : undefined;
            inputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as AccessPolicyArgs | undefined;
            if ((!args || args.applicationId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'applicationId'");
            }
            if ((!args || args.decision === undefined) && !opts.urn) {
                throw new Error("Missing required property 'decision'");
            }
            if ((!args || args.includes === undefined) && !opts.urn) {
                throw new Error("Missing required property 'includes'");
            }
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            if ((!args || args.precedence === undefined) && !opts.urn) {
                throw new Error("Missing required property 'precedence'");
            }
            inputs["accountId"] = args ? args.accountId : undefined;
            inputs["applicationId"] = args ? args.applicationId : undefined;
            inputs["decision"] = args ? args.decision : undefined;
            inputs["excludes"] = args ? args.excludes : undefined;
            inputs["includes"] = args ? args.includes : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["precedence"] = args ? args.precedence : undefined;
            inputs["requires"] = args ? args.requires : undefined;
            inputs["zoneId"] = args ? args.zoneId : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(AccessPolicy.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AccessPolicy resources.
 */
export interface AccessPolicyState {
    /**
     * The account to which the access rule should be added. Conflicts with `zoneId`.
     */
    accountId?: pulumi.Input<string>;
    /**
     * The ID of the application the policy is associated with.
     */
    applicationId?: pulumi.Input<string>;
    /**
     * Defines the action Access will take if the policy matches the user.
     * Allowed values: `allow`, `deny`, `nonIdentity`, `bypass`
     */
    decision?: pulumi.Input<string>;
    /**
     * A series of access conditions, see [Access Groups](https://www.terraform.io/providers/cloudflare/cloudflare/latest/docs/resources/access_group#conditions).
     */
    excludes?: pulumi.Input<pulumi.Input<inputs.AccessPolicyExclude>[]>;
    /**
     * A series of access conditions, see [Access Groups](https://www.terraform.io/providers/cloudflare/cloudflare/latest/docs/resources/access_group#conditions).
     */
    includes?: pulumi.Input<pulumi.Input<inputs.AccessPolicyInclude>[]>;
    /**
     * Friendly name of the Access Application.
     */
    name?: pulumi.Input<string>;
    /**
     * The unique precedence for policies on a single application. Integer.
     */
    precedence?: pulumi.Input<number>;
    /**
     * A series of access conditions, see [Access Groups](https://www.terraform.io/providers/cloudflare/cloudflare/latest/docs/resources/access_group#conditions).
     */
    requires?: pulumi.Input<pulumi.Input<inputs.AccessPolicyRequire>[]>;
    /**
     * The DNS zone to which the access rule should be added. Conflicts with `accountId`.
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AccessPolicy resource.
 */
export interface AccessPolicyArgs {
    /**
     * The account to which the access rule should be added. Conflicts with `zoneId`.
     */
    accountId?: pulumi.Input<string>;
    /**
     * The ID of the application the policy is associated with.
     */
    applicationId: pulumi.Input<string>;
    /**
     * Defines the action Access will take if the policy matches the user.
     * Allowed values: `allow`, `deny`, `nonIdentity`, `bypass`
     */
    decision: pulumi.Input<string>;
    /**
     * A series of access conditions, see [Access Groups](https://www.terraform.io/providers/cloudflare/cloudflare/latest/docs/resources/access_group#conditions).
     */
    excludes?: pulumi.Input<pulumi.Input<inputs.AccessPolicyExclude>[]>;
    /**
     * A series of access conditions, see [Access Groups](https://www.terraform.io/providers/cloudflare/cloudflare/latest/docs/resources/access_group#conditions).
     */
    includes: pulumi.Input<pulumi.Input<inputs.AccessPolicyInclude>[]>;
    /**
     * Friendly name of the Access Application.
     */
    name: pulumi.Input<string>;
    /**
     * The unique precedence for policies on a single application. Integer.
     */
    precedence: pulumi.Input<number>;
    /**
     * A series of access conditions, see [Access Groups](https://www.terraform.io/providers/cloudflare/cloudflare/latest/docs/resources/access_group#conditions).
     */
    requires?: pulumi.Input<pulumi.Input<inputs.AccessPolicyRequire>[]>;
    /**
     * The DNS zone to which the access rule should be added. Conflicts with `accountId`.
     */
    zoneId?: pulumi.Input<string>;
}
