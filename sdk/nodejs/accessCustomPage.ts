// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a resource to customize the pages your end users will see
 * when trying to reach applications behind Cloudflare Access.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const example = new cloudflare.AccessCustomPage("example", {
 *     customHtml: "<html><body><h1>Forbidden</h1></body></html>",
 *     name: "example",
 *     type: "forbidden",
 *     zoneId: "0da42c8d2132a9ddaf714f9e7c920711",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export class AccessCustomPage extends pulumi.CustomResource {
    /**
     * Get an existing AccessCustomPage resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AccessCustomPageState, opts?: pulumi.CustomResourceOptions): AccessCustomPage {
        return new AccessCustomPage(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/accessCustomPage:AccessCustomPage';

    /**
     * Returns true if the given object is an instance of AccessCustomPage.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AccessCustomPage {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AccessCustomPage.__pulumiType;
    }

    /**
     * The account identifier to target for the resource. Conflicts with `zoneId`. **Modifying this attribute will force creation of a new resource.**
     */
    public readonly accountId!: pulumi.Output<string | undefined>;
    /**
     * Number of apps to display on the custom page.
     */
    public readonly appCount!: pulumi.Output<number | undefined>;
    /**
     * Custom HTML to display on the custom page.
     */
    public readonly customHtml!: pulumi.Output<string | undefined>;
    /**
     * Friendly name of the Access Custom Page configuration.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Type of Access custom page to create. Available values: `identityDenied`, `forbidden`.
     */
    public readonly type!: pulumi.Output<string>;
    /**
     * The zone identifier to target for the resource. Conflicts with `accountId`. **Modifying this attribute will force creation of a new resource.**
     */
    public readonly zoneId!: pulumi.Output<string | undefined>;

    /**
     * Create a AccessCustomPage resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AccessCustomPageArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AccessCustomPageArgs | AccessCustomPageState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AccessCustomPageState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["appCount"] = state ? state.appCount : undefined;
            resourceInputs["customHtml"] = state ? state.customHtml : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as AccessCustomPageArgs | undefined;
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["appCount"] = args ? args.appCount : undefined;
            resourceInputs["customHtml"] = args ? args.customHtml : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["zoneId"] = args ? args.zoneId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AccessCustomPage.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AccessCustomPage resources.
 */
export interface AccessCustomPageState {
    /**
     * The account identifier to target for the resource. Conflicts with `zoneId`. **Modifying this attribute will force creation of a new resource.**
     */
    accountId?: pulumi.Input<string>;
    /**
     * Number of apps to display on the custom page.
     */
    appCount?: pulumi.Input<number>;
    /**
     * Custom HTML to display on the custom page.
     */
    customHtml?: pulumi.Input<string>;
    /**
     * Friendly name of the Access Custom Page configuration.
     */
    name?: pulumi.Input<string>;
    /**
     * Type of Access custom page to create. Available values: `identityDenied`, `forbidden`.
     */
    type?: pulumi.Input<string>;
    /**
     * The zone identifier to target for the resource. Conflicts with `accountId`. **Modifying this attribute will force creation of a new resource.**
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AccessCustomPage resource.
 */
export interface AccessCustomPageArgs {
    /**
     * The account identifier to target for the resource. Conflicts with `zoneId`. **Modifying this attribute will force creation of a new resource.**
     */
    accountId?: pulumi.Input<string>;
    /**
     * Number of apps to display on the custom page.
     */
    appCount?: pulumi.Input<number>;
    /**
     * Custom HTML to display on the custom page.
     */
    customHtml?: pulumi.Input<string>;
    /**
     * Friendly name of the Access Custom Page configuration.
     */
    name: pulumi.Input<string>;
    /**
     * Type of Access custom page to create. Available values: `identityDenied`, `forbidden`.
     */
    type: pulumi.Input<string>;
    /**
     * The zone identifier to target for the resource. Conflicts with `accountId`. **Modifying this attribute will force creation of a new resource.**
     */
    zoneId?: pulumi.Input<string>;
}
