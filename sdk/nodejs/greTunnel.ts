// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a resource, that manages GRE tunnels for Magic Transit.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const example = new cloudflare.GreTunnel("example", {
 *     accountId: "f037e56e89293a057740de681ac9abbe",
 *     name: "GRE_1",
 *     customerGreEndpoint: "203.0.113.1",
 *     cloudflareGreEndpoint: "203.0.113.2",
 *     interfaceAddress: "192.0.2.0/31",
 *     description: "Tunnel for ISP X",
 *     ttl: 64,
 *     mtu: 1476,
 *     healthCheckEnabled: true,
 *     healthCheckTarget: "203.0.113.1",
 *     healthCheckType: "reply",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import cloudflare:index/greTunnel:GreTunnel example <account_id>/<tunnel_id>
 * ```
 */
export class GreTunnel extends pulumi.CustomResource {
    /**
     * Get an existing GreTunnel resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: GreTunnelState, opts?: pulumi.CustomResourceOptions): GreTunnel {
        return new GreTunnel(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/greTunnel:GreTunnel';

    /**
     * Returns true if the given object is an instance of GreTunnel.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is GreTunnel {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === GreTunnel.__pulumiType;
    }

    /**
     * The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    public readonly accountId!: pulumi.Output<string | undefined>;
    /**
     * The IP address assigned to the Cloudflare side of the GRE tunnel.
     */
    public readonly cloudflareGreEndpoint!: pulumi.Output<string>;
    /**
     * The IP address assigned to the customer side of the GRE tunnel.
     */
    public readonly customerGreEndpoint!: pulumi.Output<string>;
    /**
     * Description of the GRE tunnel intent.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Specifies if ICMP tunnel health checks are enabled.
     */
    public readonly healthCheckEnabled!: pulumi.Output<boolean>;
    /**
     * The IP address of the customer endpoint that will receive tunnel health checks.
     */
    public readonly healthCheckTarget!: pulumi.Output<string>;
    /**
     * Specifies the ICMP echo type for the health check. Available values: `request`, `reply`.
     */
    public readonly healthCheckType!: pulumi.Output<string>;
    /**
     * 31-bit prefix (/31 in CIDR notation) supporting 2 hosts, one for each side of the tunnel.
     */
    public readonly interfaceAddress!: pulumi.Output<string>;
    /**
     * Maximum Transmission Unit (MTU) in bytes for the GRE tunnel.
     */
    public readonly mtu!: pulumi.Output<number>;
    /**
     * Name of the GRE tunnel.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Time To Live (TTL) in number of hops of the GRE tunnel.
     */
    public readonly ttl!: pulumi.Output<number>;

    /**
     * Create a GreTunnel resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: GreTunnelArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: GreTunnelArgs | GreTunnelState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as GreTunnelState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["cloudflareGreEndpoint"] = state ? state.cloudflareGreEndpoint : undefined;
            resourceInputs["customerGreEndpoint"] = state ? state.customerGreEndpoint : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["healthCheckEnabled"] = state ? state.healthCheckEnabled : undefined;
            resourceInputs["healthCheckTarget"] = state ? state.healthCheckTarget : undefined;
            resourceInputs["healthCheckType"] = state ? state.healthCheckType : undefined;
            resourceInputs["interfaceAddress"] = state ? state.interfaceAddress : undefined;
            resourceInputs["mtu"] = state ? state.mtu : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["ttl"] = state ? state.ttl : undefined;
        } else {
            const args = argsOrState as GreTunnelArgs | undefined;
            if ((!args || args.cloudflareGreEndpoint === undefined) && !opts.urn) {
                throw new Error("Missing required property 'cloudflareGreEndpoint'");
            }
            if ((!args || args.customerGreEndpoint === undefined) && !opts.urn) {
                throw new Error("Missing required property 'customerGreEndpoint'");
            }
            if ((!args || args.interfaceAddress === undefined) && !opts.urn) {
                throw new Error("Missing required property 'interfaceAddress'");
            }
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["cloudflareGreEndpoint"] = args ? args.cloudflareGreEndpoint : undefined;
            resourceInputs["customerGreEndpoint"] = args ? args.customerGreEndpoint : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["healthCheckEnabled"] = args ? args.healthCheckEnabled : undefined;
            resourceInputs["healthCheckTarget"] = args ? args.healthCheckTarget : undefined;
            resourceInputs["healthCheckType"] = args ? args.healthCheckType : undefined;
            resourceInputs["interfaceAddress"] = args ? args.interfaceAddress : undefined;
            resourceInputs["mtu"] = args ? args.mtu : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["ttl"] = args ? args.ttl : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(GreTunnel.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering GreTunnel resources.
 */
export interface GreTunnelState {
    /**
     * The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    accountId?: pulumi.Input<string>;
    /**
     * The IP address assigned to the Cloudflare side of the GRE tunnel.
     */
    cloudflareGreEndpoint?: pulumi.Input<string>;
    /**
     * The IP address assigned to the customer side of the GRE tunnel.
     */
    customerGreEndpoint?: pulumi.Input<string>;
    /**
     * Description of the GRE tunnel intent.
     */
    description?: pulumi.Input<string>;
    /**
     * Specifies if ICMP tunnel health checks are enabled.
     */
    healthCheckEnabled?: pulumi.Input<boolean>;
    /**
     * The IP address of the customer endpoint that will receive tunnel health checks.
     */
    healthCheckTarget?: pulumi.Input<string>;
    /**
     * Specifies the ICMP echo type for the health check. Available values: `request`, `reply`.
     */
    healthCheckType?: pulumi.Input<string>;
    /**
     * 31-bit prefix (/31 in CIDR notation) supporting 2 hosts, one for each side of the tunnel.
     */
    interfaceAddress?: pulumi.Input<string>;
    /**
     * Maximum Transmission Unit (MTU) in bytes for the GRE tunnel.
     */
    mtu?: pulumi.Input<number>;
    /**
     * Name of the GRE tunnel.
     */
    name?: pulumi.Input<string>;
    /**
     * Time To Live (TTL) in number of hops of the GRE tunnel.
     */
    ttl?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a GreTunnel resource.
 */
export interface GreTunnelArgs {
    /**
     * The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    accountId?: pulumi.Input<string>;
    /**
     * The IP address assigned to the Cloudflare side of the GRE tunnel.
     */
    cloudflareGreEndpoint: pulumi.Input<string>;
    /**
     * The IP address assigned to the customer side of the GRE tunnel.
     */
    customerGreEndpoint: pulumi.Input<string>;
    /**
     * Description of the GRE tunnel intent.
     */
    description?: pulumi.Input<string>;
    /**
     * Specifies if ICMP tunnel health checks are enabled.
     */
    healthCheckEnabled?: pulumi.Input<boolean>;
    /**
     * The IP address of the customer endpoint that will receive tunnel health checks.
     */
    healthCheckTarget?: pulumi.Input<string>;
    /**
     * Specifies the ICMP echo type for the health check. Available values: `request`, `reply`.
     */
    healthCheckType?: pulumi.Input<string>;
    /**
     * 31-bit prefix (/31 in CIDR notation) supporting 2 hosts, one for each side of the tunnel.
     */
    interfaceAddress: pulumi.Input<string>;
    /**
     * Maximum Transmission Unit (MTU) in bytes for the GRE tunnel.
     */
    mtu?: pulumi.Input<number>;
    /**
     * Name of the GRE tunnel.
     */
    name: pulumi.Input<string>;
    /**
     * Time To Live (TTL) in number of hops of the GRE tunnel.
     */
    ttl?: pulumi.Input<number>;
}
