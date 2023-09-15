// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.AccessApplicationArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.AccessApplicationState;
import com.pulumi.cloudflare.outputs.AccessApplicationCorsHeader;
import com.pulumi.cloudflare.outputs.AccessApplicationSaasApp;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Cloudflare Access Application resource. Access
 * Applications are used to restrict access to a whole application using an
 * authorisation gateway managed by Cloudflare.
 * 
 * &gt; It&#39;s required that an `account_id` or `zone_id` is provided and in
 * most cases using either is fine. However, if you&#39;re using a scoped
 * access token, you must provide the argument that matches the token&#39;s
 * scope. For example, an access token that is scoped to the &#34;example.com&#34;
 * zone needs to use the `zone_id` argument.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.cloudflare.AccessApplication;
 * import com.pulumi.cloudflare.AccessApplicationArgs;
 * import com.pulumi.cloudflare.inputs.AccessApplicationCorsHeaderArgs;
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
 *         var stagingApp = new AccessApplication(&#34;stagingApp&#34;, AccessApplicationArgs.builder()        
 *             .corsHeaders(AccessApplicationCorsHeaderArgs.builder()
 *                 .allowCredentials(true)
 *                 .allowedMethods(                
 *                     &#34;GET&#34;,
 *                     &#34;POST&#34;,
 *                     &#34;OPTIONS&#34;)
 *                 .allowedOrigins(&#34;https://example.com&#34;)
 *                 .maxAge(10)
 *                 .build())
 *             .domain(&#34;staging.example.com&#34;)
 *             .name(&#34;staging application&#34;)
 *             .sessionDuration(&#34;24h&#34;)
 *             .type(&#34;self_hosted&#34;)
 *             .zoneId(&#34;0da42c8d2132a9ddaf714f9e7c920711&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * ```sh
 *  $ pulumi import cloudflare:index/accessApplication:AccessApplication example &lt;account_id&gt;/&lt;application_id&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/accessApplication:AccessApplication")
public class AccessApplication extends com.pulumi.resources.CustomResource {
    /**
     * The account identifier to target for the resource. Conflicts with `zone_id`.
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    /**
     * @return The account identifier to target for the resource. Conflicts with `zone_id`.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * The identity providers selected for the application.
     * 
     */
    @Export(name="allowedIdps", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> allowedIdps;

    /**
     * @return The identity providers selected for the application.
     * 
     */
    public Output<Optional<List<String>>> allowedIdps() {
        return Codegen.optional(this.allowedIdps);
    }
    /**
     * Option to show/hide applications in App Launcher. Defaults to `true`.
     * 
     */
    @Export(name="appLauncherVisible", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> appLauncherVisible;

    /**
     * @return Option to show/hide applications in App Launcher. Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> appLauncherVisible() {
        return Codegen.optional(this.appLauncherVisible);
    }
    /**
     * Application Audience (AUD) Tag of the application.
     * 
     */
    @Export(name="aud", refs={String.class}, tree="[0]")
    private Output<String> aud;

    /**
     * @return Application Audience (AUD) Tag of the application.
     * 
     */
    public Output<String> aud() {
        return this.aud;
    }
    /**
     * Option to skip identity provider selection if only one is configured in `allowed_idps`. Defaults to `false`.
     * 
     */
    @Export(name="autoRedirectToIdentity", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> autoRedirectToIdentity;

    /**
     * @return Option to skip identity provider selection if only one is configured in `allowed_idps`. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> autoRedirectToIdentity() {
        return Codegen.optional(this.autoRedirectToIdentity);
    }
    /**
     * CORS configuration for the Access Application. See below for reference structure.
     * 
     */
    @Export(name="corsHeaders", refs={List.class,AccessApplicationCorsHeader.class}, tree="[0,1]")
    private Output</* @Nullable */ List<AccessApplicationCorsHeader>> corsHeaders;

    /**
     * @return CORS configuration for the Access Application. See below for reference structure.
     * 
     */
    public Output<Optional<List<AccessApplicationCorsHeader>>> corsHeaders() {
        return Codegen.optional(this.corsHeaders);
    }
    /**
     * Option that returns a custom error message when a user is denied access to the application.
     * 
     */
    @Export(name="customDenyMessage", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> customDenyMessage;

    /**
     * @return Option that returns a custom error message when a user is denied access to the application.
     * 
     */
    public Output<Optional<String>> customDenyMessage() {
        return Codegen.optional(this.customDenyMessage);
    }
    /**
     * Option that redirects to a custom URL when a user is denied access to the application via identity based rules.
     * 
     */
    @Export(name="customDenyUrl", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> customDenyUrl;

    /**
     * @return Option that redirects to a custom URL when a user is denied access to the application via identity based rules.
     * 
     */
    public Output<Optional<String>> customDenyUrl() {
        return Codegen.optional(this.customDenyUrl);
    }
    /**
     * Option that redirects to a custom URL when a user is denied access to the application via non identity rules.
     * 
     */
    @Export(name="customNonIdentityDenyUrl", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> customNonIdentityDenyUrl;

    /**
     * @return Option that redirects to a custom URL when a user is denied access to the application via non identity rules.
     * 
     */
    public Output<Optional<String>> customNonIdentityDenyUrl() {
        return Codegen.optional(this.customNonIdentityDenyUrl);
    }
    /**
     * The custom pages selected for the application.
     * 
     */
    @Export(name="customPages", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> customPages;

    /**
     * @return The custom pages selected for the application.
     * 
     */
    public Output<Optional<List<String>>> customPages() {
        return Codegen.optional(this.customPages);
    }
    /**
     * The primary hostname and path that Access will secure. If the app is visible in the App Launcher dashboard, this is the domain that will be displayed.
     * 
     */
    @Export(name="domain", refs={String.class}, tree="[0]")
    private Output<String> domain;

    /**
     * @return The primary hostname and path that Access will secure. If the app is visible in the App Launcher dashboard, this is the domain that will be displayed.
     * 
     */
    public Output<String> domain() {
        return this.domain;
    }
    /**
     * Option to provide increased security against compromised authorization tokens and CSRF attacks by requiring an additional &#34;binding&#34; cookie on requests. Defaults to `false`.
     * 
     */
    @Export(name="enableBindingCookie", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enableBindingCookie;

    /**
     * @return Option to provide increased security against compromised authorization tokens and CSRF attacks by requiring an additional &#34;binding&#34; cookie on requests. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> enableBindingCookie() {
        return Codegen.optional(this.enableBindingCookie);
    }
    /**
     * Option to add the `HttpOnly` cookie flag to access tokens.
     * 
     */
    @Export(name="httpOnlyCookieAttribute", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> httpOnlyCookieAttribute;

    /**
     * @return Option to add the `HttpOnly` cookie flag to access tokens.
     * 
     */
    public Output<Optional<Boolean>> httpOnlyCookieAttribute() {
        return Codegen.optional(this.httpOnlyCookieAttribute);
    }
    /**
     * Image URL for the logo shown in the app launcher dashboard.
     * 
     */
    @Export(name="logoUrl", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> logoUrl;

    /**
     * @return Image URL for the logo shown in the app launcher dashboard.
     * 
     */
    public Output<Optional<String>> logoUrl() {
        return Codegen.optional(this.logoUrl);
    }
    /**
     * Friendly name of the Access Application.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Friendly name of the Access Application.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * SaaS configuration for the Access Application.
     * 
     */
    @Export(name="saasApp", refs={AccessApplicationSaasApp.class}, tree="[0]")
    private Output</* @Nullable */ AccessApplicationSaasApp> saasApp;

    /**
     * @return SaaS configuration for the Access Application.
     * 
     */
    public Output<Optional<AccessApplicationSaasApp>> saasApp() {
        return Codegen.optional(this.saasApp);
    }
    /**
     * Defines the same-site cookie setting for access tokens. Available values: `none`, `lax`, `strict`.
     * 
     */
    @Export(name="sameSiteCookieAttribute", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> sameSiteCookieAttribute;

    /**
     * @return Defines the same-site cookie setting for access tokens. Available values: `none`, `lax`, `strict`.
     * 
     */
    public Output<Optional<String>> sameSiteCookieAttribute() {
        return Codegen.optional(this.sameSiteCookieAttribute);
    }
    /**
     * List of domains that access will secure. Only present for self_hosted, vnc, and ssh applications. Always includes the value set as `domain`.
     * 
     */
    @Export(name="selfHostedDomains", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> selfHostedDomains;

    /**
     * @return List of domains that access will secure. Only present for self_hosted, vnc, and ssh applications. Always includes the value set as `domain`.
     * 
     */
    public Output<Optional<List<String>>> selfHostedDomains() {
        return Codegen.optional(this.selfHostedDomains);
    }
    /**
     * Option to return a 401 status code in service authentication rules on failed requests. Defaults to `false`.
     * 
     */
    @Export(name="serviceAuth401Redirect", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> serviceAuth401Redirect;

    /**
     * @return Option to return a 401 status code in service authentication rules on failed requests. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> serviceAuth401Redirect() {
        return Codegen.optional(this.serviceAuth401Redirect);
    }
    /**
     * How often a user will be forced to re-authorise. Must be in the format `48h` or `2h45m`. Defaults to `24h`.
     * 
     */
    @Export(name="sessionDuration", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> sessionDuration;

    /**
     * @return How often a user will be forced to re-authorise. Must be in the format `48h` or `2h45m`. Defaults to `24h`.
     * 
     */
    public Output<Optional<String>> sessionDuration() {
        return Codegen.optional(this.sessionDuration);
    }
    /**
     * Option to skip the authorization interstitial when using the CLI. Defaults to `false`.
     * 
     */
    @Export(name="skipInterstitial", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> skipInterstitial;

    /**
     * @return Option to skip the authorization interstitial when using the CLI. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> skipInterstitial() {
        return Codegen.optional(this.skipInterstitial);
    }
    /**
     * The application type. Available values: `app_launcher`, `bookmark`, `biso`, `dash_sso`, `saas`, `self_hosted`, `ssh`, `vnc`, `warp`. Defaults to `self_hosted`.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> type;

    /**
     * @return The application type. Available values: `app_launcher`, `bookmark`, `biso`, `dash_sso`, `saas`, `self_hosted`, `ssh`, `vnc`, `warp`. Defaults to `self_hosted`.
     * 
     */
    public Output<Optional<String>> type() {
        return Codegen.optional(this.type);
    }
    /**
     * The zone identifier to target for the resource. Conflicts with `account_id`.
     * 
     */
    @Export(name="zoneId", refs={String.class}, tree="[0]")
    private Output<String> zoneId;

    /**
     * @return The zone identifier to target for the resource. Conflicts with `account_id`.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AccessApplication(String name) {
        this(name, AccessApplicationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AccessApplication(String name, AccessApplicationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AccessApplication(String name, AccessApplicationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/accessApplication:AccessApplication", name, args == null ? AccessApplicationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AccessApplication(String name, Output<String> id, @Nullable AccessApplicationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/accessApplication:AccessApplication", name, state, makeResourceOptions(options, id));
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
    public static AccessApplication get(String name, Output<String> id, @Nullable AccessApplicationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AccessApplication(name, id, state, options);
    }
}
