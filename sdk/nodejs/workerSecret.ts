// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Cloudflare Worker secret resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const mySecret = new cloudflare.WorkerSecret("mySecret", {
 *     accountId: "f037e56e89293a057740de681ac9abbe",
 *     name: "MY_EXAMPLE_SECRET_TEXT",
 *     scriptName: "script_1",
 *     secretText: "my_secret_value",
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 *  $ pulumi import cloudflare:index/workerSecret:WorkerSecret example <account_id>/<script_name>/<secret_name>
 * ```
 */
export class WorkerSecret extends pulumi.CustomResource {
    /**
     * Get an existing WorkerSecret resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: WorkerSecretState, opts?: pulumi.CustomResourceOptions): WorkerSecret {
        return new WorkerSecret(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/workerSecret:WorkerSecret';

    /**
     * Returns true if the given object is an instance of WorkerSecret.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is WorkerSecret {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === WorkerSecret.__pulumiType;
    }

    /**
     * The account identifier to target for the resource.
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * The name of the Worker secret. **Modifying this attribute will force creation of a new resource.**
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The name of the Worker script to associate the secret with. **Modifying this attribute will force creation of a new resource.**
     */
    public readonly scriptName!: pulumi.Output<string>;
    /**
     * The text of the Worker secret. **Modifying this attribute will force creation of a new resource.**
     */
    public readonly secretText!: pulumi.Output<string>;

    /**
     * Create a WorkerSecret resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: WorkerSecretArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: WorkerSecretArgs | WorkerSecretState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as WorkerSecretState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["scriptName"] = state ? state.scriptName : undefined;
            resourceInputs["secretText"] = state ? state.secretText : undefined;
        } else {
            const args = argsOrState as WorkerSecretArgs | undefined;
            if ((!args || args.accountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountId'");
            }
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            if ((!args || args.scriptName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'scriptName'");
            }
            if ((!args || args.secretText === undefined) && !opts.urn) {
                throw new Error("Missing required property 'secretText'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["scriptName"] = args ? args.scriptName : undefined;
            resourceInputs["secretText"] = args?.secretText ? pulumi.secret(args.secretText) : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["secretText"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(WorkerSecret.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering WorkerSecret resources.
 */
export interface WorkerSecretState {
    /**
     * The account identifier to target for the resource.
     */
    accountId?: pulumi.Input<string>;
    /**
     * The name of the Worker secret. **Modifying this attribute will force creation of a new resource.**
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the Worker script to associate the secret with. **Modifying this attribute will force creation of a new resource.**
     */
    scriptName?: pulumi.Input<string>;
    /**
     * The text of the Worker secret. **Modifying this attribute will force creation of a new resource.**
     */
    secretText?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a WorkerSecret resource.
 */
export interface WorkerSecretArgs {
    /**
     * The account identifier to target for the resource.
     */
    accountId: pulumi.Input<string>;
    /**
     * The name of the Worker secret. **Modifying this attribute will force creation of a new resource.**
     */
    name: pulumi.Input<string>;
    /**
     * The name of the Worker script to associate the secret with. **Modifying this attribute will force creation of a new resource.**
     */
    scriptName: pulumi.Input<string>;
    /**
     * The text of the Worker secret. **Modifying this attribute will force creation of a new resource.**
     */
    secretText: pulumi.Input<string>;
}
