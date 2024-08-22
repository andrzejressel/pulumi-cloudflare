// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Cloudflare Access Mutual TLS Certificate resource.
 * Mutual TLS authentication ensures that the traffic is secure and
 * trusted in both directions between a client and server and can be
 *  used with Access to only allows requests from devices with a
 *  corresponding client certificate.
 *
 * > It's required that an `accountId` or `zoneId` is provided and in
 *    most cases using either is fine. However, if you're using a scoped
 *    access token, you must provide the argument that matches the token's
 *    scope. For example, an access token that is scoped to the "example.com"
 *    zone needs to use the `zoneId` argument.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const myCert = new cloudflare.ZeroTrustAccessMtlsCertificate("my_cert", {
 *     zoneId: "0da42c8d2132a9ddaf714f9e7c920711",
 *     name: "My Root Cert",
 *     certificate: caPem,
 *     associatedHostnames: ["staging.example.com"],
 * });
 * ```
 *
 * ## Import
 *
 * Account level import.
 *
 * ```sh
 * $ pulumi import cloudflare:index/zeroTrustAccessMtlsCertificate:ZeroTrustAccessMtlsCertificate cloudflare_zero_sd -t_access_mtls_certificate.example account/<account_id>/<mutual_tls_certificate_id>
 * ```
 *
 * Zone level import.
 *
 * ```sh
 * $ pulumi import cloudflare:index/zeroTrustAccessMtlsCertificate:ZeroTrustAccessMtlsCertificate cloudflare_zero_sd -t_access_mtls_certificate.example zone/<zone_id>/<mutual_tls_certificate_id>
 * ```
 */
export class ZeroTrustAccessMtlsCertificate extends pulumi.CustomResource {
    /**
     * Get an existing ZeroTrustAccessMtlsCertificate resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ZeroTrustAccessMtlsCertificateState, opts?: pulumi.CustomResourceOptions): ZeroTrustAccessMtlsCertificate {
        return new ZeroTrustAccessMtlsCertificate(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/zeroTrustAccessMtlsCertificate:ZeroTrustAccessMtlsCertificate';

    /**
     * Returns true if the given object is an instance of ZeroTrustAccessMtlsCertificate.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ZeroTrustAccessMtlsCertificate {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ZeroTrustAccessMtlsCertificate.__pulumiType;
    }

    /**
     * The account identifier to target for the resource. Conflicts with `zoneId`.
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * The hostnames that will be prompted for this certificate.
     */
    public readonly associatedHostnames!: pulumi.Output<string[] | undefined>;
    /**
     * The Root CA for your certificates.
     */
    public readonly certificate!: pulumi.Output<string | undefined>;
    public /*out*/ readonly fingerprint!: pulumi.Output<string>;
    /**
     * The name of the certificate.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The zone identifier to target for the resource. Conflicts with `accountId`.
     */
    public readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a ZeroTrustAccessMtlsCertificate resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ZeroTrustAccessMtlsCertificateArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ZeroTrustAccessMtlsCertificateArgs | ZeroTrustAccessMtlsCertificateState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ZeroTrustAccessMtlsCertificateState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["associatedHostnames"] = state ? state.associatedHostnames : undefined;
            resourceInputs["certificate"] = state ? state.certificate : undefined;
            resourceInputs["fingerprint"] = state ? state.fingerprint : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as ZeroTrustAccessMtlsCertificateArgs | undefined;
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["associatedHostnames"] = args ? args.associatedHostnames : undefined;
            resourceInputs["certificate"] = args ? args.certificate : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["zoneId"] = args ? args.zoneId : undefined;
            resourceInputs["fingerprint"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ZeroTrustAccessMtlsCertificate.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ZeroTrustAccessMtlsCertificate resources.
 */
export interface ZeroTrustAccessMtlsCertificateState {
    /**
     * The account identifier to target for the resource. Conflicts with `zoneId`.
     */
    accountId?: pulumi.Input<string>;
    /**
     * The hostnames that will be prompted for this certificate.
     */
    associatedHostnames?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The Root CA for your certificates.
     */
    certificate?: pulumi.Input<string>;
    fingerprint?: pulumi.Input<string>;
    /**
     * The name of the certificate.
     */
    name?: pulumi.Input<string>;
    /**
     * The zone identifier to target for the resource. Conflicts with `accountId`.
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ZeroTrustAccessMtlsCertificate resource.
 */
export interface ZeroTrustAccessMtlsCertificateArgs {
    /**
     * The account identifier to target for the resource. Conflicts with `zoneId`.
     */
    accountId?: pulumi.Input<string>;
    /**
     * The hostnames that will be prompted for this certificate.
     */
    associatedHostnames?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The Root CA for your certificates.
     */
    certificate?: pulumi.Input<string>;
    /**
     * The name of the certificate.
     */
    name: pulumi.Input<string>;
    /**
     * The zone identifier to target for the resource. Conflicts with `accountId`.
     */
    zoneId?: pulumi.Input<string>;
}
