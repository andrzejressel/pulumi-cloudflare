// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Use this data source to get the [IP ranges](https://www.cloudflare.com/ips/) of Cloudflare network.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 * import * as example from "@pulumi/example";
 *
 * const cloudflare = cloudflare.getIpRanges({});
 * const example = new example.index.FirewallResource("example", {
 *     name: "from-cloudflare",
 *     network: "default",
 *     sourceRanges: cloudflare.ipv4CidrBlocks,
 *     allow: [{
 *         ports: "443",
 *         protocol: "tcp",
 *     }],
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getIpRanges(opts?: pulumi.InvokeOptions): Promise<GetIpRangesResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("cloudflare:index/getIpRanges:getIpRanges", {
    }, opts);
}

/**
 * A collection of values returned by getIpRanges.
 */
export interface GetIpRangesResult {
    /**
     * The lexically ordered list of only the IPv4 China CIDR blocks.
     */
    readonly chinaIpv4CidrBlocks: string[];
    /**
     * The lexically ordered list of only the IPv6 China CIDR blocks.
     */
    readonly chinaIpv6CidrBlocks: string[];
    /**
     * The lexically ordered list of all non-China CIDR blocks.
     */
    readonly cidrBlocks: string[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The lexically ordered list of only the IPv4 CIDR blocks.
     */
    readonly ipv4CidrBlocks: string[];
    /**
     * The lexically ordered list of only the IPv6 CIDR blocks.
     */
    readonly ipv6CidrBlocks: string[];
}
/**
 * Use this data source to get the [IP ranges](https://www.cloudflare.com/ips/) of Cloudflare network.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 * import * as example from "@pulumi/example";
 *
 * const cloudflare = cloudflare.getIpRanges({});
 * const example = new example.index.FirewallResource("example", {
 *     name: "from-cloudflare",
 *     network: "default",
 *     sourceRanges: cloudflare.ipv4CidrBlocks,
 *     allow: [{
 *         ports: "443",
 *         protocol: "tcp",
 *     }],
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getIpRangesOutput(opts?: pulumi.InvokeOptions): pulumi.Output<GetIpRangesResult> {
    return pulumi.output(getIpRanges(opts))
}
