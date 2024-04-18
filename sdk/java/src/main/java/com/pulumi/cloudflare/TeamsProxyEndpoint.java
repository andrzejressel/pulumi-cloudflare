// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.TeamsProxyEndpointArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.TeamsProxyEndpointState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides a Cloudflare Teams Proxy Endpoint resource. Teams Proxy
 * Endpoints are used for pointing proxy clients at Cloudflare Secure
 * Gateway.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.cloudflare.TeamsProxyEndpoint;
 * import com.pulumi.cloudflare.TeamsProxyEndpointArgs;
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
 *         var example = new TeamsProxyEndpoint(&#34;example&#34;, TeamsProxyEndpointArgs.builder()        
 *             .accountId(&#34;f037e56e89293a057740de681ac9abbe&#34;)
 *             .name(&#34;office&#34;)
 *             .ips(&#34;192.0.2.0/24&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import cloudflare:index/teamsProxyEndpoint:TeamsProxyEndpoint example &lt;account_id&gt;/&lt;proxy_endpoint_id&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/teamsProxyEndpoint:TeamsProxyEndpoint")
public class TeamsProxyEndpoint extends com.pulumi.resources.CustomResource {
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
     * The networks CIDRs that will be allowed to initiate proxy connections.
     * 
     */
    @Export(name="ips", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> ips;

    /**
     * @return The networks CIDRs that will be allowed to initiate proxy connections.
     * 
     */
    public Output<List<String>> ips() {
        return this.ips;
    }
    /**
     * Name of the teams proxy endpoint.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the teams proxy endpoint.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The FQDN that proxy clients should be pointed at.
     * 
     */
    @Export(name="subdomain", refs={String.class}, tree="[0]")
    private Output<String> subdomain;

    /**
     * @return The FQDN that proxy clients should be pointed at.
     * 
     */
    public Output<String> subdomain() {
        return this.subdomain;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TeamsProxyEndpoint(String name) {
        this(name, TeamsProxyEndpointArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TeamsProxyEndpoint(String name, TeamsProxyEndpointArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TeamsProxyEndpoint(String name, TeamsProxyEndpointArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/teamsProxyEndpoint:TeamsProxyEndpoint", name, args == null ? TeamsProxyEndpointArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TeamsProxyEndpoint(String name, Output<String> id, @Nullable TeamsProxyEndpointState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/teamsProxyEndpoint:TeamsProxyEndpoint", name, state, makeResourceOptions(options, id));
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
    public static TeamsProxyEndpoint get(String name, Output<String> id, @Nullable TeamsProxyEndpointState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TeamsProxyEndpoint(name, id, state, options);
    }
}
