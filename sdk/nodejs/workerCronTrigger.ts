// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Worker Cron Triggers allow users to map a cron expression to a Worker script
 * using a `ScheduledEvent` listener that enables Workers to be executed on a
 * schedule. Worker Cron Triggers are ideal for running periodic jobs for
 * maintenance or calling third-party APIs to collect up-to-date data.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 * import * as std from "@pulumi/std";
 *
 * const exampleScript = new cloudflare.WorkerScript("example_script", {
 *     accountId: "f037e56e89293a057740de681ac9abbe",
 *     name: "example-script",
 *     content: std.file({
 *         input: "path/to/my.js",
 *     }).then(invoke => invoke.result),
 * });
 * const exampleTrigger = new cloudflare.WorkerCronTrigger("example_trigger", {
 *     accountId: "f037e56e89293a057740de681ac9abbe",
 *     scriptName: exampleScript.name,
 *     schedules: [
 *         "*&#47;5 * * * *",
 *         "10 7 * * mon-fri",
 *     ],
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import cloudflare:index/workerCronTrigger:WorkerCronTrigger example <account_id>/<script_name>
 * ```
 */
export class WorkerCronTrigger extends pulumi.CustomResource {
    /**
     * Get an existing WorkerCronTrigger resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: WorkerCronTriggerState, opts?: pulumi.CustomResourceOptions): WorkerCronTrigger {
        return new WorkerCronTrigger(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/workerCronTrigger:WorkerCronTrigger';

    /**
     * Returns true if the given object is an instance of WorkerCronTrigger.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is WorkerCronTrigger {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === WorkerCronTrigger.__pulumiType;
    }

    /**
     * The account identifier to target for the resource.
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * Cron expressions to execute the Worker script.
     */
    public readonly schedules!: pulumi.Output<string[]>;
    /**
     * Worker script to target for the schedules.
     */
    public readonly scriptName!: pulumi.Output<string>;

    /**
     * Create a WorkerCronTrigger resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: WorkerCronTriggerArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: WorkerCronTriggerArgs | WorkerCronTriggerState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as WorkerCronTriggerState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["schedules"] = state ? state.schedules : undefined;
            resourceInputs["scriptName"] = state ? state.scriptName : undefined;
        } else {
            const args = argsOrState as WorkerCronTriggerArgs | undefined;
            if ((!args || args.accountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountId'");
            }
            if ((!args || args.schedules === undefined) && !opts.urn) {
                throw new Error("Missing required property 'schedules'");
            }
            if ((!args || args.scriptName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'scriptName'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["schedules"] = args ? args.schedules : undefined;
            resourceInputs["scriptName"] = args ? args.scriptName : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(WorkerCronTrigger.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering WorkerCronTrigger resources.
 */
export interface WorkerCronTriggerState {
    /**
     * The account identifier to target for the resource.
     */
    accountId?: pulumi.Input<string>;
    /**
     * Cron expressions to execute the Worker script.
     */
    schedules?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Worker script to target for the schedules.
     */
    scriptName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a WorkerCronTrigger resource.
 */
export interface WorkerCronTriggerArgs {
    /**
     * The account identifier to target for the resource.
     */
    accountId: pulumi.Input<string>;
    /**
     * Cron expressions to execute the Worker script.
     */
    schedules: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Worker script to target for the schedules.
     */
    scriptName: pulumi.Input<string>;
}
