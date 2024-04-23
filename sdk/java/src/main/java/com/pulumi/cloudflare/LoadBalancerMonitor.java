// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.LoadBalancerMonitorArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.LoadBalancerMonitorState;
import com.pulumi.cloudflare.outputs.LoadBalancerMonitorHeader;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * If Cloudflare&#39;s Load Balancing to load-balance across multiple
 * origin servers or data centers, you configure one of these Monitors
 * to actively check the availability of those servers over HTTP(S) or
 * TCP.
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import cloudflare:index/loadBalancerMonitor:LoadBalancerMonitor example &lt;account_id&gt;/&lt;load_balancer_monitor_id&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/loadBalancerMonitor:LoadBalancerMonitor")
public class LoadBalancerMonitor extends com.pulumi.resources.CustomResource {
    /**
     * The account identifier to target for the resource.
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    /**
     * @return The account identifier to target for the resource.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * Do not validate the certificate when monitor use HTTPS.  Only valid if `type` is &#34;http&#34; or &#34;https&#34;.
     * 
     */
    @Export(name="allowInsecure", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> allowInsecure;

    /**
     * @return Do not validate the certificate when monitor use HTTPS.  Only valid if `type` is &#34;http&#34; or &#34;https&#34;.
     * 
     */
    public Output<Optional<Boolean>> allowInsecure() {
        return Codegen.optional(this.allowInsecure);
    }
    /**
     * To be marked unhealthy the monitored origin must fail this healthcheck N consecutive times. Defaults to `0`.
     * 
     */
    @Export(name="consecutiveDown", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> consecutiveDown;

    /**
     * @return To be marked unhealthy the monitored origin must fail this healthcheck N consecutive times. Defaults to `0`.
     * 
     */
    public Output<Optional<Integer>> consecutiveDown() {
        return Codegen.optional(this.consecutiveDown);
    }
    /**
     * To be marked healthy the monitored origin must pass this healthcheck N consecutive times. Defaults to `0`.
     * 
     */
    @Export(name="consecutiveUp", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> consecutiveUp;

    /**
     * @return To be marked healthy the monitored origin must pass this healthcheck N consecutive times. Defaults to `0`.
     * 
     */
    public Output<Optional<Integer>> consecutiveUp() {
        return Codegen.optional(this.consecutiveUp);
    }
    /**
     * The RFC3339 timestamp of when the load balancer monitor was created.
     * 
     */
    @Export(name="createdOn", refs={String.class}, tree="[0]")
    private Output<String> createdOn;

    /**
     * @return The RFC3339 timestamp of when the load balancer monitor was created.
     * 
     */
    public Output<String> createdOn() {
        return this.createdOn;
    }
    /**
     * Free text description.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Free text description.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * A case-insensitive sub-string to look for in the response body. If this string is not found, the origin will be marked as unhealthy. Only valid if `type` is &#34;http&#34; or &#34;https&#34;.
     * 
     */
    @Export(name="expectedBody", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> expectedBody;

    /**
     * @return A case-insensitive sub-string to look for in the response body. If this string is not found, the origin will be marked as unhealthy. Only valid if `type` is &#34;http&#34; or &#34;https&#34;.
     * 
     */
    public Output<Optional<String>> expectedBody() {
        return Codegen.optional(this.expectedBody);
    }
    /**
     * The expected HTTP response code or code range of the health check. Eg `2xx`. Only valid and required if `type` is &#34;http&#34; or &#34;https&#34;.
     * 
     */
    @Export(name="expectedCodes", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> expectedCodes;

    /**
     * @return The expected HTTP response code or code range of the health check. Eg `2xx`. Only valid and required if `type` is &#34;http&#34; or &#34;https&#34;.
     * 
     */
    public Output<Optional<String>> expectedCodes() {
        return Codegen.optional(this.expectedCodes);
    }
    /**
     * Follow redirects if returned by the origin. Only valid if `type` is &#34;http&#34; or &#34;https&#34;.
     * 
     */
    @Export(name="followRedirects", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> followRedirects;

    /**
     * @return Follow redirects if returned by the origin. Only valid if `type` is &#34;http&#34; or &#34;https&#34;.
     * 
     */
    public Output<Optional<Boolean>> followRedirects() {
        return Codegen.optional(this.followRedirects);
    }
    /**
     * The HTTP request headers to send in the health check. It is recommended you set a Host header by default. The User-Agent header cannot be overridden.
     * 
     */
    @Export(name="headers", refs={List.class,LoadBalancerMonitorHeader.class}, tree="[0,1]")
    private Output</* @Nullable */ List<LoadBalancerMonitorHeader>> headers;

    /**
     * @return The HTTP request headers to send in the health check. It is recommended you set a Host header by default. The User-Agent header cannot be overridden.
     * 
     */
    public Output<Optional<List<LoadBalancerMonitorHeader>>> headers() {
        return Codegen.optional(this.headers);
    }
    /**
     * The interval between each health check. Shorter intervals may improve failover time, but will increase load on the origins as we check from multiple locations. Defaults to `60`.
     * 
     */
    @Export(name="interval", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> interval;

    /**
     * @return The interval between each health check. Shorter intervals may improve failover time, but will increase load on the origins as we check from multiple locations. Defaults to `60`.
     * 
     */
    public Output<Optional<Integer>> interval() {
        return Codegen.optional(this.interval);
    }
    /**
     * The method to use for the health check.
     * 
     */
    @Export(name="method", refs={String.class}, tree="[0]")
    private Output<String> method;

    /**
     * @return The method to use for the health check.
     * 
     */
    public Output<String> method() {
        return this.method;
    }
    /**
     * The RFC3339 timestamp of when the load balancer monitor was last modified.
     * 
     */
    @Export(name="modifiedOn", refs={String.class}, tree="[0]")
    private Output<String> modifiedOn;

    /**
     * @return The RFC3339 timestamp of when the load balancer monitor was last modified.
     * 
     */
    public Output<String> modifiedOn() {
        return this.modifiedOn;
    }
    /**
     * The endpoint path to health check against.
     * 
     */
    @Export(name="path", refs={String.class}, tree="[0]")
    private Output<String> path;

    /**
     * @return The endpoint path to health check against.
     * 
     */
    public Output<String> path() {
        return this.path;
    }
    /**
     * The port number to use for the healthcheck, required when creating a TCP monitor.
     * 
     */
    @Export(name="port", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> port;

    /**
     * @return The port number to use for the healthcheck, required when creating a TCP monitor.
     * 
     */
    public Output<Optional<Integer>> port() {
        return Codegen.optional(this.port);
    }
    /**
     * Assign this monitor to emulate the specified zone while probing. Only valid if `type` is &#34;http&#34; or &#34;https&#34;.
     * 
     */
    @Export(name="probeZone", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> probeZone;

    /**
     * @return Assign this monitor to emulate the specified zone while probing. Only valid if `type` is &#34;http&#34; or &#34;https&#34;.
     * 
     */
    public Output<Optional<String>> probeZone() {
        return Codegen.optional(this.probeZone);
    }
    /**
     * The number of retries to attempt in case of a timeout before marking the origin as unhealthy. Retries are attempted immediately. Defaults to `2`.
     * 
     */
    @Export(name="retries", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> retries;

    /**
     * @return The number of retries to attempt in case of a timeout before marking the origin as unhealthy. Retries are attempted immediately. Defaults to `2`.
     * 
     */
    public Output<Optional<Integer>> retries() {
        return Codegen.optional(this.retries);
    }
    /**
     * The timeout (in seconds) before marking the health check as failed. Defaults to `5`.
     * 
     */
    @Export(name="timeout", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> timeout;

    /**
     * @return The timeout (in seconds) before marking the health check as failed. Defaults to `5`.
     * 
     */
    public Output<Optional<Integer>> timeout() {
        return Codegen.optional(this.timeout);
    }
    /**
     * The protocol to use for the healthcheck. Available values: `http`, `https`, `tcp`, `udp_icmp`, `icmp_ping`, `smtp`. Defaults to `http`.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> type;

    /**
     * @return The protocol to use for the healthcheck. Available values: `http`, `https`, `tcp`, `udp_icmp`, `icmp_ping`, `smtp`. Defaults to `http`.
     * 
     */
    public Output<Optional<String>> type() {
        return Codegen.optional(this.type);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LoadBalancerMonitor(String name) {
        this(name, LoadBalancerMonitorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LoadBalancerMonitor(String name, LoadBalancerMonitorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LoadBalancerMonitor(String name, LoadBalancerMonitorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/loadBalancerMonitor:LoadBalancerMonitor", name, args == null ? LoadBalancerMonitorArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LoadBalancerMonitor(String name, Output<String> id, @Nullable LoadBalancerMonitorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/loadBalancerMonitor:LoadBalancerMonitor", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static LoadBalancerMonitor get(String name, Output<String> id, @Nullable LoadBalancerMonitorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LoadBalancerMonitor(name, id, state, options);
    }
}
