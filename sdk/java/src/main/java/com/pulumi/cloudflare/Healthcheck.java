// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.HealthcheckArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.HealthcheckState;
import com.pulumi.cloudflare.outputs.HealthcheckHeader;
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
 * Standalone Health Checks provide a way to monitor origin servers
 * without needing a Cloudflare Load Balancer.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.cloudflare.Healthcheck;
 * import com.pulumi.cloudflare.HealthcheckArgs;
 * import com.pulumi.cloudflare.inputs.HealthcheckHeaderArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         // HTTPS Healthcheck
 *         var httpHealthCheck = new Healthcheck("httpHealthCheck", HealthcheckArgs.builder()
 *             .zoneId(cloudflareZoneId)
 *             .name("http-health-check")
 *             .description("example http health check")
 *             .address("example.com")
 *             .suspended(false)
 *             .checkRegions(            
 *                 "WEU",
 *                 "EEU")
 *             .type("HTTPS")
 *             .port(443)
 *             .method("GET")
 *             .path("/health")
 *             .expectedBody("alive")
 *             .expectedCodes(            
 *                 "2xx",
 *                 "301")
 *             .followRedirects(true)
 *             .allowInsecure(false)
 *             .headers(HealthcheckHeaderArgs.builder()
 *                 .header("Host")
 *                 .values("example.com")
 *                 .build())
 *             .timeout(10)
 *             .retries(2)
 *             .interval(60)
 *             .consecutiveFails(3)
 *             .consecutiveSuccesses(2)
 *             .build());
 * 
 *         // TCP Healthcheck
 *         var tcpHealthCheck = new Healthcheck("tcpHealthCheck", HealthcheckArgs.builder()
 *             .zoneId(cloudflareZoneId)
 *             .name("tcp-health-check")
 *             .description("example tcp health check")
 *             .address("example.com")
 *             .suspended(false)
 *             .checkRegions(            
 *                 "WEU",
 *                 "EEU")
 *             .type("TCP")
 *             .port(22)
 *             .method("connection_established")
 *             .timeout(10)
 *             .retries(2)
 *             .interval(60)
 *             .consecutiveFails(3)
 *             .consecutiveSuccesses(2)
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Use the Zone ID and Healthcheck ID to import.
 * 
 * ```sh
 * $ pulumi import cloudflare:index/healthcheck:Healthcheck example &lt;zone_id&gt;/&lt;healthcheck_id&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/healthcheck:Healthcheck")
public class Healthcheck extends com.pulumi.resources.CustomResource {
    /**
     * The hostname or IP address of the origin server to run health checks on.
     * 
     */
    @Export(name="address", refs={String.class}, tree="[0]")
    private Output<String> address;

    /**
     * @return The hostname or IP address of the origin server to run health checks on.
     * 
     */
    public Output<String> address() {
        return this.address;
    }
    /**
     * Do not validate the certificate when the health check uses HTTPS. Defaults to `false`.
     * 
     */
    @Export(name="allowInsecure", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> allowInsecure;

    /**
     * @return Do not validate the certificate when the health check uses HTTPS. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> allowInsecure() {
        return Codegen.optional(this.allowInsecure);
    }
    /**
     * A list of regions from which to run health checks. If not set, Cloudflare will pick a default region. Available values: `WNAM`, `ENAM`, `WEU`, `EEU`, `NSAM`, `SSAM`, `OC`, `ME`, `NAF`, `SAF`, `IN`, `SEAS`, `NEAS`, `ALL_REGIONS`.
     * 
     */
    @Export(name="checkRegions", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> checkRegions;

    /**
     * @return A list of regions from which to run health checks. If not set, Cloudflare will pick a default region. Available values: `WNAM`, `ENAM`, `WEU`, `EEU`, `NSAM`, `SSAM`, `OC`, `ME`, `NAF`, `SAF`, `IN`, `SEAS`, `NEAS`, `ALL_REGIONS`.
     * 
     */
    public Output<List<String>> checkRegions() {
        return this.checkRegions;
    }
    /**
     * The number of consecutive fails required from a health check before changing the health to unhealthy. Defaults to `1`.
     * 
     */
    @Export(name="consecutiveFails", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> consecutiveFails;

    /**
     * @return The number of consecutive fails required from a health check before changing the health to unhealthy. Defaults to `1`.
     * 
     */
    public Output<Optional<Integer>> consecutiveFails() {
        return Codegen.optional(this.consecutiveFails);
    }
    /**
     * The number of consecutive successes required from a health check before changing the health to healthy. Defaults to `1`.
     * 
     */
    @Export(name="consecutiveSuccesses", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> consecutiveSuccesses;

    /**
     * @return The number of consecutive successes required from a health check before changing the health to healthy. Defaults to `1`.
     * 
     */
    public Output<Optional<Integer>> consecutiveSuccesses() {
        return Codegen.optional(this.consecutiveSuccesses);
    }
    /**
     * Creation time.
     * 
     */
    @Export(name="createdOn", refs={String.class}, tree="[0]")
    private Output<String> createdOn;

    /**
     * @return Creation time.
     * 
     */
    public Output<String> createdOn() {
        return this.createdOn;
    }
    /**
     * A human-readable description of the health check.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return A human-readable description of the health check.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * A case-insensitive sub-string to look for in the response body. If this string is not found the origin will be marked as unhealthy.
     * 
     */
    @Export(name="expectedBody", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> expectedBody;

    /**
     * @return A case-insensitive sub-string to look for in the response body. If this string is not found the origin will be marked as unhealthy.
     * 
     */
    public Output<Optional<String>> expectedBody() {
        return Codegen.optional(this.expectedBody);
    }
    /**
     * The expected HTTP response codes (e.g. &#39;200&#39;) or code ranges (e.g. &#39;2xx&#39; for all codes starting with 2) of the health check.
     * 
     */
    @Export(name="expectedCodes", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> expectedCodes;

    /**
     * @return The expected HTTP response codes (e.g. &#39;200&#39;) or code ranges (e.g. &#39;2xx&#39; for all codes starting with 2) of the health check.
     * 
     */
    public Output<Optional<List<String>>> expectedCodes() {
        return Codegen.optional(this.expectedCodes);
    }
    /**
     * Follow redirects if the origin returns a 3xx status code. Defaults to `false`.
     * 
     */
    @Export(name="followRedirects", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> followRedirects;

    /**
     * @return Follow redirects if the origin returns a 3xx status code. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> followRedirects() {
        return Codegen.optional(this.followRedirects);
    }
    /**
     * The HTTP request headers to send in the health check. It is recommended you set a Host header by default. The User-Agent header cannot be overridden.
     * 
     */
    @Export(name="headers", refs={List.class,HealthcheckHeader.class}, tree="[0,1]")
    private Output</* @Nullable */ List<HealthcheckHeader>> headers;

    /**
     * @return The HTTP request headers to send in the health check. It is recommended you set a Host header by default. The User-Agent header cannot be overridden.
     * 
     */
    public Output<Optional<List<HealthcheckHeader>>> headers() {
        return Codegen.optional(this.headers);
    }
    /**
     * The interval between each health check. Shorter intervals may give quicker notifications if the origin status changes, but will increase the load on the origin as we check from multiple locations. Defaults to `60`.
     * 
     */
    @Export(name="interval", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> interval;

    /**
     * @return The interval between each health check. Shorter intervals may give quicker notifications if the origin status changes, but will increase the load on the origin as we check from multiple locations. Defaults to `60`.
     * 
     */
    public Output<Optional<Integer>> interval() {
        return Codegen.optional(this.interval);
    }
    /**
     * The HTTP method to use for the health check. Available values: `connection_established`, `GET`, `HEAD`.
     * 
     */
    @Export(name="method", refs={String.class}, tree="[0]")
    private Output<String> method;

    /**
     * @return The HTTP method to use for the health check. Available values: `connection_established`, `GET`, `HEAD`.
     * 
     */
    public Output<String> method() {
        return this.method;
    }
    /**
     * Last modified time.
     * 
     */
    @Export(name="modifiedOn", refs={String.class}, tree="[0]")
    private Output<String> modifiedOn;

    /**
     * @return Last modified time.
     * 
     */
    public Output<String> modifiedOn() {
        return this.modifiedOn;
    }
    /**
     * A short name to identify the health check. Only alphanumeric characters, hyphens, and underscores are allowed.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return A short name to identify the health check. Only alphanumeric characters, hyphens, and underscores are allowed.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The endpoint path to health check against. Defaults to `/`.
     * 
     */
    @Export(name="path", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> path;

    /**
     * @return The endpoint path to health check against. Defaults to `/`.
     * 
     */
    public Output<Optional<String>> path() {
        return Codegen.optional(this.path);
    }
    /**
     * Port number to connect to for the health check. Defaults to `80`.
     * 
     */
    @Export(name="port", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> port;

    /**
     * @return Port number to connect to for the health check. Defaults to `80`.
     * 
     */
    public Output<Optional<Integer>> port() {
        return Codegen.optional(this.port);
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
     * If suspended, no health checks are sent to the origin. Defaults to `false`.
     * 
     */
    @Export(name="suspended", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> suspended;

    /**
     * @return If suspended, no health checks are sent to the origin. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> suspended() {
        return Codegen.optional(this.suspended);
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
     * The protocol to use for the health check. Available values: `TCP`, `HTTP`, `HTTPS`.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return The protocol to use for the health check. Available values: `TCP`, `HTTP`, `HTTPS`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="zoneId", refs={String.class}, tree="[0]")
    private Output<String> zoneId;

    /**
     * @return The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Healthcheck(java.lang.String name) {
        this(name, HealthcheckArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Healthcheck(java.lang.String name, HealthcheckArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Healthcheck(java.lang.String name, HealthcheckArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/healthcheck:Healthcheck", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Healthcheck(java.lang.String name, Output<java.lang.String> id, @Nullable HealthcheckState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/healthcheck:Healthcheck", name, state, makeResourceOptions(options, id), false);
    }

    private static HealthcheckArgs makeArgs(HealthcheckArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? HealthcheckArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
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
    public static Healthcheck get(java.lang.String name, Output<java.lang.String> id, @Nullable HealthcheckState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Healthcheck(name, id, state, options);
    }
}
