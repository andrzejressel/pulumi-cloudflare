// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a resource to manage API Shield configurations.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const example = new cloudflare.ApiShield("example", {
 *     authIdCharacteristics: [{
 *         name: "my-example-header",
 *         type: "header",
 *     }],
 *     zoneId: "0da42c8d2132a9ddaf714f9e7c920711",
 * });
 * ```
 */
export class ApiShield extends pulumi.CustomResource {
    /**
     * Get an existing ApiShield resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ApiShieldState, opts?: pulumi.CustomResourceOptions): ApiShield {
        return new ApiShield(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/apiShield:ApiShield';

    /**
     * Returns true if the given object is an instance of ApiShield.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ApiShield {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ApiShield.__pulumiType;
    }

    /**
     * Characteristics define properties across which auth-ids can be computed in a privacy-preserving manner.
     */
    public readonly authIdCharacteristics!: pulumi.Output<outputs.ApiShieldAuthIdCharacteristic[] | undefined>;
    /**
     * The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    public readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a ApiShield resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ApiShieldArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ApiShieldArgs | ApiShieldState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ApiShieldState | undefined;
            resourceInputs["authIdCharacteristics"] = state ? state.authIdCharacteristics : undefined;
            resourceInputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as ApiShieldArgs | undefined;
            if ((!args || args.zoneId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'zoneId'");
            }
            resourceInputs["authIdCharacteristics"] = args ? args.authIdCharacteristics : undefined;
            resourceInputs["zoneId"] = args ? args.zoneId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ApiShield.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ApiShield resources.
 */
export interface ApiShieldState {
    /**
     * Characteristics define properties across which auth-ids can be computed in a privacy-preserving manner.
     */
    authIdCharacteristics?: pulumi.Input<pulumi.Input<inputs.ApiShieldAuthIdCharacteristic>[]>;
    /**
     * The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ApiShield resource.
 */
export interface ApiShieldArgs {
    /**
     * Characteristics define properties across which auth-ids can be computed in a privacy-preserving manner.
     */
    authIdCharacteristics?: pulumi.Input<pulumi.Input<inputs.ApiShieldAuthIdCharacteristic>[]>;
    /**
     * The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    zoneId: pulumi.Input<string>;
}