// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Use this data source to lookup a single [DNS Record](https://api.cloudflare.com/#dns-records-for-a-zone-properties).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const example = cloudflare.getRecord({
 *     zoneId: "0da42c8d2132a9ddaf714f9e7c920711",
 *     hostname: "example.com",
 * });
 * ```
 */
export function getRecord(args: GetRecordArgs, opts?: pulumi.InvokeOptions): Promise<GetRecordResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("cloudflare:index/getRecord:getRecord", {
        "content": args.content,
        "hostname": args.hostname,
        "priority": args.priority,
        "type": args.type,
        "zoneId": args.zoneId,
    }, opts);
}

/**
 * A collection of arguments for invoking getRecord.
 */
export interface GetRecordArgs {
    /**
     * Content to filter record results on.
     */
    content?: string;
    /**
     * Hostname to filter DNS record results on.
     */
    hostname: string;
    /**
     * DNS priority to filter record results on.
     */
    priority?: number;
    /**
     * DNS record type to filter record results on. Defaults to `A`.
     */
    type?: string;
    /**
     * The zone identifier to target for the resource.
     */
    zoneId: string;
}

/**
 * A collection of values returned by getRecord.
 */
export interface GetRecordResult {
    /**
     * Content to filter record results on.
     */
    readonly content?: string;
    /**
     * Hostname to filter DNS record results on.
     */
    readonly hostname: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * DNS priority to filter record results on.
     */
    readonly priority?: number;
    /**
     * Proxiable status of the found DNS record.
     */
    readonly proxiable: boolean;
    /**
     * Proxied status of the found DNS record.
     */
    readonly proxied: boolean;
    /**
     * TTL of the found DNS record.
     */
    readonly ttl: number;
    /**
     * DNS record type to filter record results on. Defaults to `A`.
     */
    readonly type?: string;
    /**
     * Value of the found DNS record.
     */
    readonly value: string;
    /**
     * The zone identifier to target for the resource.
     */
    readonly zoneId: string;
    /**
     * Zone name of the found DNS record.
     */
    readonly zoneName: string;
}
/**
 * Use this data source to lookup a single [DNS Record](https://api.cloudflare.com/#dns-records-for-a-zone-properties).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const example = cloudflare.getRecord({
 *     zoneId: "0da42c8d2132a9ddaf714f9e7c920711",
 *     hostname: "example.com",
 * });
 * ```
 */
export function getRecordOutput(args: GetRecordOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetRecordResult> {
    return pulumi.output(args).apply((a: any) => getRecord(a, opts))
}

/**
 * A collection of arguments for invoking getRecord.
 */
export interface GetRecordOutputArgs {
    /**
     * Content to filter record results on.
     */
    content?: pulumi.Input<string>;
    /**
     * Hostname to filter DNS record results on.
     */
    hostname: pulumi.Input<string>;
    /**
     * DNS priority to filter record results on.
     */
    priority?: pulumi.Input<number>;
    /**
     * DNS record type to filter record results on. Defaults to `A`.
     */
    type?: pulumi.Input<string>;
    /**
     * The zone identifier to target for the resource.
     */
    zoneId: pulumi.Input<string>;
}
