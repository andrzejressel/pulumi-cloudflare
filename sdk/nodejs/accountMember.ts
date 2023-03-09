// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a resource which manages Cloudflare account members.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const exampleUser = new cloudflare.AccountMember("exampleUser", {
 *     emailAddress: "user@example.com",
 *     roleIds: [
 *         "68b329da9893e34099c7d8ad5cb9c940",
 *         "d784fa8b6d98d27699781bd9a7cf19f0",
 *     ],
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 *  $ pulumi import cloudflare:index/accountMember:AccountMember example <account_id>/<member_id>
 * ```
 */
export class AccountMember extends pulumi.CustomResource {
    /**
     * Get an existing AccountMember resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AccountMemberState, opts?: pulumi.CustomResourceOptions): AccountMember {
        return new AccountMember(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/accountMember:AccountMember';

    /**
     * Returns true if the given object is an instance of AccountMember.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AccountMember {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AccountMember.__pulumiType;
    }

    /**
     * Account ID to create the account member in.
     */
    public readonly accountId!: pulumi.Output<string | undefined>;
    /**
     * The email address of the user who you wish to manage. Following creation, this field becomes read only via the API and cannot be updated.
     */
    public readonly emailAddress!: pulumi.Output<string>;
    /**
     * List of account role IDs that you want to assign to a member.
     */
    public readonly roleIds!: pulumi.Output<string[]>;
    /**
     * A member's status in the account. Available values: `accepted`, `pending`.
     */
    public readonly status!: pulumi.Output<string>;

    /**
     * Create a AccountMember resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AccountMemberArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AccountMemberArgs | AccountMemberState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AccountMemberState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["emailAddress"] = state ? state.emailAddress : undefined;
            resourceInputs["roleIds"] = state ? state.roleIds : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
        } else {
            const args = argsOrState as AccountMemberArgs | undefined;
            if ((!args || args.emailAddress === undefined) && !opts.urn) {
                throw new Error("Missing required property 'emailAddress'");
            }
            if ((!args || args.roleIds === undefined) && !opts.urn) {
                throw new Error("Missing required property 'roleIds'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["emailAddress"] = args ? args.emailAddress : undefined;
            resourceInputs["roleIds"] = args ? args.roleIds : undefined;
            resourceInputs["status"] = args ? args.status : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AccountMember.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AccountMember resources.
 */
export interface AccountMemberState {
    /**
     * Account ID to create the account member in.
     */
    accountId?: pulumi.Input<string>;
    /**
     * The email address of the user who you wish to manage. Following creation, this field becomes read only via the API and cannot be updated.
     */
    emailAddress?: pulumi.Input<string>;
    /**
     * List of account role IDs that you want to assign to a member.
     */
    roleIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A member's status in the account. Available values: `accepted`, `pending`.
     */
    status?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AccountMember resource.
 */
export interface AccountMemberArgs {
    /**
     * Account ID to create the account member in.
     */
    accountId?: pulumi.Input<string>;
    /**
     * The email address of the user who you wish to manage. Following creation, this field becomes read only via the API and cannot be updated.
     */
    emailAddress: pulumi.Input<string>;
    /**
     * List of account role IDs that you want to assign to a member.
     */
    roleIds: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A member's status in the account. Available values: `accepted`, `pending`.
     */
    status?: pulumi.Input<string>;
}
