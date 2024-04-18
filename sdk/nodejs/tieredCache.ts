// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a resource, that manages Cloudflare Tiered Cache settings.
 * This allows you to adjust topologies for your zone.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const example = new cloudflare.TieredCache("example", {
 *     zoneId: "0da42c8d2132a9ddaf714f9e7c920711",
 *     cacheType: "smart",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export class TieredCache extends pulumi.CustomResource {
    /**
     * Get an existing TieredCache resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TieredCacheState, opts?: pulumi.CustomResourceOptions): TieredCache {
        return new TieredCache(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/tieredCache:TieredCache';

    /**
     * Returns true if the given object is an instance of TieredCache.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is TieredCache {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === TieredCache.__pulumiType;
    }

    /**
     * The typed of tiered cache to utilize on the zone. Available values: `generic`, `smart`, `off`.
     */
    public readonly cacheType!: pulumi.Output<string>;
    /**
     * The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    public readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a TieredCache resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TieredCacheArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TieredCacheArgs | TieredCacheState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TieredCacheState | undefined;
            resourceInputs["cacheType"] = state ? state.cacheType : undefined;
            resourceInputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as TieredCacheArgs | undefined;
            if ((!args || args.cacheType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'cacheType'");
            }
            if ((!args || args.zoneId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'zoneId'");
            }
            resourceInputs["cacheType"] = args ? args.cacheType : undefined;
            resourceInputs["zoneId"] = args ? args.zoneId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(TieredCache.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering TieredCache resources.
 */
export interface TieredCacheState {
    /**
     * The typed of tiered cache to utilize on the zone. Available values: `generic`, `smart`, `off`.
     */
    cacheType?: pulumi.Input<string>;
    /**
     * The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a TieredCache resource.
 */
export interface TieredCacheArgs {
    /**
     * The typed of tiered cache to utilize on the zone. Available values: `generic`, `smart`, `off`.
     */
    cacheType: pulumi.Input<string>;
    /**
     * The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    zoneId: pulumi.Input<string>;
}
