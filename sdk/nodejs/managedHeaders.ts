// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * // Enable security headers using Managed Meaders
 * const example = new cloudflare.ManagedHeaders("example", {
 *     managedRequestHeaders: [{
 *         enabled: true,
 *         id: "add_true_client_ip_headers",
 *     }],
 *     managedResponseHeaders: [{
 *         enabled: true,
 *         id: "remove_x-powered-by_header",
 *     }],
 *     zoneId: "0da42c8d2132a9ddaf714f9e7c920711",
 * });
 * ```
 *
 * ## Import
 *
 * Import is not supported for this resource.
 */
export class ManagedHeaders extends pulumi.CustomResource {
    /**
     * Get an existing ManagedHeaders resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ManagedHeadersState, opts?: pulumi.CustomResourceOptions): ManagedHeaders {
        return new ManagedHeaders(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/managedHeaders:ManagedHeaders';

    /**
     * Returns true if the given object is an instance of ManagedHeaders.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ManagedHeaders {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ManagedHeaders.__pulumiType;
    }

    /**
     * The list of managed request headers.
     */
    public readonly managedRequestHeaders!: pulumi.Output<outputs.ManagedHeadersManagedRequestHeader[] | undefined>;
    /**
     * The list of managed response headers.
     */
    public readonly managedResponseHeaders!: pulumi.Output<outputs.ManagedHeadersManagedResponseHeader[] | undefined>;
    /**
     * The zone identifier to target for the resource.
     */
    public readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a ManagedHeaders resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ManagedHeadersArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ManagedHeadersArgs | ManagedHeadersState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ManagedHeadersState | undefined;
            resourceInputs["managedRequestHeaders"] = state ? state.managedRequestHeaders : undefined;
            resourceInputs["managedResponseHeaders"] = state ? state.managedResponseHeaders : undefined;
            resourceInputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as ManagedHeadersArgs | undefined;
            if ((!args || args.zoneId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'zoneId'");
            }
            resourceInputs["managedRequestHeaders"] = args ? args.managedRequestHeaders : undefined;
            resourceInputs["managedResponseHeaders"] = args ? args.managedResponseHeaders : undefined;
            resourceInputs["zoneId"] = args ? args.zoneId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ManagedHeaders.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ManagedHeaders resources.
 */
export interface ManagedHeadersState {
    /**
     * The list of managed request headers.
     */
    managedRequestHeaders?: pulumi.Input<pulumi.Input<inputs.ManagedHeadersManagedRequestHeader>[]>;
    /**
     * The list of managed response headers.
     */
    managedResponseHeaders?: pulumi.Input<pulumi.Input<inputs.ManagedHeadersManagedResponseHeader>[]>;
    /**
     * The zone identifier to target for the resource.
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ManagedHeaders resource.
 */
export interface ManagedHeadersArgs {
    /**
     * The list of managed request headers.
     */
    managedRequestHeaders?: pulumi.Input<pulumi.Input<inputs.ManagedHeadersManagedRequestHeader>[]>;
    /**
     * The list of managed response headers.
     */
    managedResponseHeaders?: pulumi.Input<pulumi.Input<inputs.ManagedHeadersManagedResponseHeader>[]>;
    /**
     * The zone identifier to target for the resource.
     */
    zoneId: pulumi.Input<string>;
}
