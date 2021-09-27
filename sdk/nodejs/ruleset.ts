// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * The [Cloudflare Ruleset Engine](https://developers.cloudflare.com/firewall/cf-rulesets)
 * allows you to create and deploy rules and rulesets.
 * The engine syntax, inspired by the Wireshark Display Filter language, is the
 * same syntax used in custom Firewall Rules. Cloudflare uses the Ruleset Engine
 * in different products, allowing you to configure several products using the same
 * basic syntax.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * // Magic Transit
 * const magicTransitExample = new cloudflare.Ruleset("magic_transit_example", {
 *     accountId: "d41d8cd98f00b204e9800998ecf8427e",
 *     description: "example magic transit ruleset description",
 *     kind: "root",
 *     name: "account magic transit",
 *     phase: "magic_transit",
 *     rules: [{
 *         action: "allow",
 *         description: "Allow TCP Ephemeral Ports",
 *         expression: "tcp.dstport in { 32768..65535 }",
 *     }],
 * });
 * // Zone-level WAF Managed Ruleset
 * const zoneLevelManagedWaf = new cloudflare.Ruleset("zone_level_managed_waf", {
 *     description: "managed WAF ruleset description",
 *     kind: "zone",
 *     name: "managed WAF",
 *     phase: "http_request_firewall_managed",
 *     rules: [{
 *         action: "execute",
 *         actionParameters: {
 *             id: "efb7b8c949ac4650a09736fc376e9aee",
 *         },
 *         description: "Execute Cloudflare Managed Ruleset on my zone-level phase entry point ruleset",
 *         enabled: true,
 *         expression: "true",
 *     }],
 *     zoneId: "cb029e245cfdd66dc8d2e570d5dd3322",
 * });
 * // Zone-level WAF with tag-based overrides
 * const zoneLevelManagedWafWithCategoryBasedOverrides = new cloudflare.Ruleset("zone_level_managed_waf_with_category_based_overrides", {
 *     description: "managed WAF with tag-based overrides ruleset description",
 *     kind: "zone",
 *     name: "managed WAF with tag-based overrides",
 *     phase: "http_request_firewall_managed",
 *     rules: [{
 *         action: "execute",
 *         actionParameters: {
 *             id: "efb7b8c949ac4650a09736fc376e9aee",
 *             overrides: {
 *                 categories: [
 *                     {
 *                         action: "block",
 *                         category: "wordpress",
 *                         enabled: true,
 *                     },
 *                     {
 *                         action: "block",
 *                         category: "joomla",
 *                         enabled: true,
 *                     },
 *                 ],
 *             },
 *         },
 *         description: "overrides to only enable wordpress rules to block",
 *         enabled: false,
 *         expression: "true",
 *     }],
 *     zoneId: "cb029e245cfdd66dc8d2e570d5dd3322",
 * });
 * // Rewrite the URI path component to a static path
 * const transformUriRulePath = new cloudflare.Ruleset("transform_uri_rule_path", {
 *     description: "change the URI path to a new static path",
 *     kind: "zone",
 *     name: "transform rule for URI path",
 *     phase: "http_request_transform",
 *     rules: [{
 *         action: "rewrite",
 *         actionParameters: {
 *             uri: {
 *                 path: {
 *                     value: "/my-new-route",
 *                 },
 *             },
 *         },
 *         description: "example URI path transform rule",
 *         enabled: true,
 *         expression: "(http.host eq \"example.com\" and http.uri.path eq \"/old-path\")",
 *     }],
 *     zoneId: "cb029e245cfdd66dc8d2e570d5dd3322",
 * });
 * // Rewrite the URI query component to a static query
 * const transformUriRuleQuery = new cloudflare.Ruleset("transform_uri_rule_query", {
 *     description: "change the URI query to a new static query",
 *     kind: "zone",
 *     name: "transform rule for URI query parameter",
 *     phase: "http_request_transform",
 *     rules: [{
 *         action: "rewrite",
 *         actionParameters: {
 *             uri: {
 *                 query: {
 *                     value: "old=new_again",
 *                 },
 *             },
 *         },
 *         description: "URI transformation query example",
 *         enabled: true,
 *         expression: "true",
 *     }],
 *     zoneId: "cb029e245cfdd66dc8d2e570d5dd3322",
 * });
 * // Rewrite HTTP headers to a modified values
 * const transformUriHttpHeaders = new cloudflare.Ruleset("transform_uri_http_headers", {
 *     description: "modify HTTP headers before reaching origin",
 *     kind: "zone",
 *     name: "transform rule for HTTP headers",
 *     phase: "http_request_late_transform",
 *     rules: [{
 *         action: "rewrite",
 *         actionParameters: {
 *             headers: [
 *                 {
 *                     name: "example-http-header-1",
 *                     operation: "set",
 *                     value: "my-http-header-value-1",
 *                 },
 *                 {
 *                     expression: "cf.zone.name",
 *                     name: "example-http-header-2",
 *                     operation: "set",
 *                 },
 *                 {
 *                     name: "example-http-header-3-to-remove",
 *                     operation: "remove",
 *                 },
 *             ],
 *         },
 *         description: "example request header transform rule",
 *         enabled: false,
 *         expression: "true",
 *     }],
 *     zoneId: "cb029e245cfdd66dc8d2e570d5dd3322",
 * });
 * // HTTP rate limit for an API route
 * const rateLimitingExample = new cloudflare.Ruleset("rate_limiting_example", {
 *     description: "apply HTTP rate limiting for a route",
 *     kind: "zone",
 *     name: "restrict API requests count",
 *     phase: "http_ratelimit",
 *     rules: [{
 *         action: "block",
 *         description: "rate limit for API",
 *         enabled: true,
 *         expression: "(http.request.uri.path matches \"^/api/\")",
 *         ratelimit: {
 *             characteristics: [
 *                 "cf.colo.id",
 *                 "ip.src",
 *             ],
 *             mitigationTimeout: 600,
 *             period: 60,
 *             requestsPerPeriod: 100,
 *         },
 *     }],
 *     zoneId: "cb029e245cfdd66dc8d2e570d5dd3322",
 * });
 * ```
 *
 * ## Import
 *
 * Currently, you cannot import rulesets.
 */
export class Ruleset extends pulumi.CustomResource {
    /**
     * Get an existing Ruleset resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RulesetState, opts?: pulumi.CustomResourceOptions): Ruleset {
        return new Ruleset(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/ruleset:Ruleset';

    /**
     * Returns true if the given object is an instance of Ruleset.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Ruleset {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Ruleset.__pulumiType;
    }

    /**
     * The ID of the account where the ruleset is being created. Conflicts with `"zoneId"`.
     */
    public readonly accountId!: pulumi.Output<string | undefined>;
    /**
     * Brief summary of the ruleset rule and its intended use.
     */
    public readonly description!: pulumi.Output<string>;
    /**
     * Type of Ruleset to create. Valid values are `"custom"`, `"managed"`, `"root"`, `"schema"` or `"zone"`.
     */
    public readonly kind!: pulumi.Output<string>;
    /**
     * Name of the HTTP request header to target.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Point in the request/response lifecycle where the ruleset will be created. Valid values are `"ddosL4"`, `"ddosL7"`, `"httpRequestFirewallCustom"`, `"httpRequestFirewallManaged"`, `"httpRequestLateTransform"`, `"httpRequestMain"`, `"httpRequestSanitize"`, `"httpRequestTransform"`, `"httpResponseFirewallManaged"`, `"magicTransit"`, or `"httpRatelimit"`.
     */
    public readonly phase!: pulumi.Output<string>;
    /**
     * List of rule-based overrides (refer to the nested schema).
     */
    public readonly rules!: pulumi.Output<outputs.RulesetRule[] | undefined>;
    /**
     * Name of entitlement that is shareable between entities.
     */
    public readonly shareableEntitlementName!: pulumi.Output<string | undefined>;
    /**
     * The ID of the zone where the ruleset is being created. Conflicts with `"accountId"`.
     */
    public readonly zoneId!: pulumi.Output<string | undefined>;

    /**
     * Create a Ruleset resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RulesetArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RulesetArgs | RulesetState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RulesetState | undefined;
            inputs["accountId"] = state ? state.accountId : undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["kind"] = state ? state.kind : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["phase"] = state ? state.phase : undefined;
            inputs["rules"] = state ? state.rules : undefined;
            inputs["shareableEntitlementName"] = state ? state.shareableEntitlementName : undefined;
            inputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as RulesetArgs | undefined;
            if ((!args || args.description === undefined) && !opts.urn) {
                throw new Error("Missing required property 'description'");
            }
            if ((!args || args.kind === undefined) && !opts.urn) {
                throw new Error("Missing required property 'kind'");
            }
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            if ((!args || args.phase === undefined) && !opts.urn) {
                throw new Error("Missing required property 'phase'");
            }
            inputs["accountId"] = args ? args.accountId : undefined;
            inputs["description"] = args ? args.description : undefined;
            inputs["kind"] = args ? args.kind : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["phase"] = args ? args.phase : undefined;
            inputs["rules"] = args ? args.rules : undefined;
            inputs["shareableEntitlementName"] = args ? args.shareableEntitlementName : undefined;
            inputs["zoneId"] = args ? args.zoneId : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(Ruleset.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Ruleset resources.
 */
export interface RulesetState {
    /**
     * The ID of the account where the ruleset is being created. Conflicts with `"zoneId"`.
     */
    accountId?: pulumi.Input<string>;
    /**
     * Brief summary of the ruleset rule and its intended use.
     */
    description?: pulumi.Input<string>;
    /**
     * Type of Ruleset to create. Valid values are `"custom"`, `"managed"`, `"root"`, `"schema"` or `"zone"`.
     */
    kind?: pulumi.Input<string>;
    /**
     * Name of the HTTP request header to target.
     */
    name?: pulumi.Input<string>;
    /**
     * Point in the request/response lifecycle where the ruleset will be created. Valid values are `"ddosL4"`, `"ddosL7"`, `"httpRequestFirewallCustom"`, `"httpRequestFirewallManaged"`, `"httpRequestLateTransform"`, `"httpRequestMain"`, `"httpRequestSanitize"`, `"httpRequestTransform"`, `"httpResponseFirewallManaged"`, `"magicTransit"`, or `"httpRatelimit"`.
     */
    phase?: pulumi.Input<string>;
    /**
     * List of rule-based overrides (refer to the nested schema).
     */
    rules?: pulumi.Input<pulumi.Input<inputs.RulesetRule>[]>;
    /**
     * Name of entitlement that is shareable between entities.
     */
    shareableEntitlementName?: pulumi.Input<string>;
    /**
     * The ID of the zone where the ruleset is being created. Conflicts with `"accountId"`.
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Ruleset resource.
 */
export interface RulesetArgs {
    /**
     * The ID of the account where the ruleset is being created. Conflicts with `"zoneId"`.
     */
    accountId?: pulumi.Input<string>;
    /**
     * Brief summary of the ruleset rule and its intended use.
     */
    description: pulumi.Input<string>;
    /**
     * Type of Ruleset to create. Valid values are `"custom"`, `"managed"`, `"root"`, `"schema"` or `"zone"`.
     */
    kind: pulumi.Input<string>;
    /**
     * Name of the HTTP request header to target.
     */
    name: pulumi.Input<string>;
    /**
     * Point in the request/response lifecycle where the ruleset will be created. Valid values are `"ddosL4"`, `"ddosL7"`, `"httpRequestFirewallCustom"`, `"httpRequestFirewallManaged"`, `"httpRequestLateTransform"`, `"httpRequestMain"`, `"httpRequestSanitize"`, `"httpRequestTransform"`, `"httpResponseFirewallManaged"`, `"magicTransit"`, or `"httpRatelimit"`.
     */
    phase: pulumi.Input<string>;
    /**
     * List of rule-based overrides (refer to the nested schema).
     */
    rules?: pulumi.Input<pulumi.Input<inputs.RulesetRule>[]>;
    /**
     * Name of entitlement that is shareable between entities.
     */
    shareableEntitlementName?: pulumi.Input<string>;
    /**
     * The ID of the zone where the ruleset is being created. Conflicts with `"accountId"`.
     */
    zoneId?: pulumi.Input<string>;
}
