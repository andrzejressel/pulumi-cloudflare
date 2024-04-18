// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a resource, that manages a webhook destination. These destinations can be tied to the notification policies created for Cloudflare's products.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const example = new cloudflare.NotificationPolicyWebhooks("example", {
 *     accountId: "f037e56e89293a057740de681ac9abbe",
 *     name: "Webhooks destination",
 *     url: "https://example.com",
 *     secret: "my-secret",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import cloudflare:index/notificationPolicyWebhooks:NotificationPolicyWebhooks example <account_id>/<notification_webhook_id>
 * ```
 */
export class NotificationPolicyWebhooks extends pulumi.CustomResource {
    /**
     * Get an existing NotificationPolicyWebhooks resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: NotificationPolicyWebhooksState, opts?: pulumi.CustomResourceOptions): NotificationPolicyWebhooks {
        return new NotificationPolicyWebhooks(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/notificationPolicyWebhooks:NotificationPolicyWebhooks';

    /**
     * Returns true if the given object is an instance of NotificationPolicyWebhooks.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is NotificationPolicyWebhooks {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === NotificationPolicyWebhooks.__pulumiType;
    }

    /**
     * The account identifier to target for the resource.
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * Timestamp of when the notification webhook was created.
     */
    public /*out*/ readonly createdAt!: pulumi.Output<string>;
    /**
     * Timestamp of when the notification webhook last faiuled.
     */
    public /*out*/ readonly lastFailure!: pulumi.Output<string>;
    /**
     * Timestamp of when the notification webhook was last successful.
     */
    public /*out*/ readonly lastSuccess!: pulumi.Output<string>;
    /**
     * The name of the webhook destination.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * An optional secret can be provided that will be passed in the `cf-webhook-auth` header when dispatching a webhook notification. Secrets are not returned in any API response body. Refer to the [documentation](https://api.cloudflare.com/#notification-webhooks-create-webhook) for more details.
     */
    public readonly secret!: pulumi.Output<string | undefined>;
    public /*out*/ readonly type!: pulumi.Output<string>;
    /**
     * The URL of the webhook destinations. **Modifying this attribute will force creation of a new resource.**
     */
    public readonly url!: pulumi.Output<string | undefined>;

    /**
     * Create a NotificationPolicyWebhooks resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: NotificationPolicyWebhooksArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: NotificationPolicyWebhooksArgs | NotificationPolicyWebhooksState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as NotificationPolicyWebhooksState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["createdAt"] = state ? state.createdAt : undefined;
            resourceInputs["lastFailure"] = state ? state.lastFailure : undefined;
            resourceInputs["lastSuccess"] = state ? state.lastSuccess : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["secret"] = state ? state.secret : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["url"] = state ? state.url : undefined;
        } else {
            const args = argsOrState as NotificationPolicyWebhooksArgs | undefined;
            if ((!args || args.accountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountId'");
            }
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["secret"] = args ? args.secret : undefined;
            resourceInputs["url"] = args ? args.url : undefined;
            resourceInputs["createdAt"] = undefined /*out*/;
            resourceInputs["lastFailure"] = undefined /*out*/;
            resourceInputs["lastSuccess"] = undefined /*out*/;
            resourceInputs["type"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(NotificationPolicyWebhooks.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering NotificationPolicyWebhooks resources.
 */
export interface NotificationPolicyWebhooksState {
    /**
     * The account identifier to target for the resource.
     */
    accountId?: pulumi.Input<string>;
    /**
     * Timestamp of when the notification webhook was created.
     */
    createdAt?: pulumi.Input<string>;
    /**
     * Timestamp of when the notification webhook last faiuled.
     */
    lastFailure?: pulumi.Input<string>;
    /**
     * Timestamp of when the notification webhook was last successful.
     */
    lastSuccess?: pulumi.Input<string>;
    /**
     * The name of the webhook destination.
     */
    name?: pulumi.Input<string>;
    /**
     * An optional secret can be provided that will be passed in the `cf-webhook-auth` header when dispatching a webhook notification. Secrets are not returned in any API response body. Refer to the [documentation](https://api.cloudflare.com/#notification-webhooks-create-webhook) for more details.
     */
    secret?: pulumi.Input<string>;
    type?: pulumi.Input<string>;
    /**
     * The URL of the webhook destinations. **Modifying this attribute will force creation of a new resource.**
     */
    url?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a NotificationPolicyWebhooks resource.
 */
export interface NotificationPolicyWebhooksArgs {
    /**
     * The account identifier to target for the resource.
     */
    accountId: pulumi.Input<string>;
    /**
     * The name of the webhook destination.
     */
    name: pulumi.Input<string>;
    /**
     * An optional secret can be provided that will be passed in the `cf-webhook-auth` header when dispatching a webhook notification. Secrets are not returned in any API response body. Refer to the [documentation](https://api.cloudflare.com/#notification-webhooks-create-webhook) for more details.
     */
    secret?: pulumi.Input<string>;
    /**
     * The URL of the webhook destinations. **Modifying this attribute will force creation of a new resource.**
     */
    url?: pulumi.Input<string>;
}
