// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a resource, that manages Cloudflare tunnel routes for Zero
 * Trust. Tunnel routes are used to direct IP traffic through
 * Cloudflare Tunnels.
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import cloudflare:index/zeroTrustTunnelRoute:ZeroTrustTunnelRoute example <account_id>/<network_cidr>/<virtual_network_id>
 * ```
 */
export class ZeroTrustTunnelRoute extends pulumi.CustomResource {
    /**
     * Get an existing ZeroTrustTunnelRoute resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ZeroTrustTunnelRouteState, opts?: pulumi.CustomResourceOptions): ZeroTrustTunnelRoute {
        return new ZeroTrustTunnelRoute(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/zeroTrustTunnelRoute:ZeroTrustTunnelRoute';

    /**
     * Returns true if the given object is an instance of ZeroTrustTunnelRoute.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ZeroTrustTunnelRoute {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ZeroTrustTunnelRoute.__pulumiType;
    }

    /**
     * The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * Description of the tunnel route.
     */
    public readonly comment!: pulumi.Output<string | undefined>;
    /**
     * The IPv4 or IPv6 network that should use this tunnel route, in CIDR notation.
     */
    public readonly network!: pulumi.Output<string>;
    /**
     * The ID of the tunnel that will service the tunnel route.
     */
    public readonly tunnelId!: pulumi.Output<string>;
    /**
     * The ID of the virtual network for which this route is being added; uses the default virtual network of the account if none is provided. **Modifying this attribute will force creation of a new resource.**
     */
    public readonly virtualNetworkId!: pulumi.Output<string | undefined>;

    /**
     * Create a ZeroTrustTunnelRoute resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ZeroTrustTunnelRouteArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ZeroTrustTunnelRouteArgs | ZeroTrustTunnelRouteState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ZeroTrustTunnelRouteState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["network"] = state ? state.network : undefined;
            resourceInputs["tunnelId"] = state ? state.tunnelId : undefined;
            resourceInputs["virtualNetworkId"] = state ? state.virtualNetworkId : undefined;
        } else {
            const args = argsOrState as ZeroTrustTunnelRouteArgs | undefined;
            if ((!args || args.accountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountId'");
            }
            if ((!args || args.network === undefined) && !opts.urn) {
                throw new Error("Missing required property 'network'");
            }
            if ((!args || args.tunnelId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'tunnelId'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["network"] = args ? args.network : undefined;
            resourceInputs["tunnelId"] = args ? args.tunnelId : undefined;
            resourceInputs["virtualNetworkId"] = args ? args.virtualNetworkId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ZeroTrustTunnelRoute.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ZeroTrustTunnelRoute resources.
 */
export interface ZeroTrustTunnelRouteState {
    /**
     * The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    accountId?: pulumi.Input<string>;
    /**
     * Description of the tunnel route.
     */
    comment?: pulumi.Input<string>;
    /**
     * The IPv4 or IPv6 network that should use this tunnel route, in CIDR notation.
     */
    network?: pulumi.Input<string>;
    /**
     * The ID of the tunnel that will service the tunnel route.
     */
    tunnelId?: pulumi.Input<string>;
    /**
     * The ID of the virtual network for which this route is being added; uses the default virtual network of the account if none is provided. **Modifying this attribute will force creation of a new resource.**
     */
    virtualNetworkId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ZeroTrustTunnelRoute resource.
 */
export interface ZeroTrustTunnelRouteArgs {
    /**
     * The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    accountId: pulumi.Input<string>;
    /**
     * Description of the tunnel route.
     */
    comment?: pulumi.Input<string>;
    /**
     * The IPv4 or IPv6 network that should use this tunnel route, in CIDR notation.
     */
    network: pulumi.Input<string>;
    /**
     * The ID of the tunnel that will service the tunnel route.
     */
    tunnelId: pulumi.Input<string>;
    /**
     * The ID of the virtual network for which this route is being added; uses the default virtual network of the account if none is provided. **Modifying this attribute will force creation of a new resource.**
     */
    virtualNetworkId?: pulumi.Input<string>;
}