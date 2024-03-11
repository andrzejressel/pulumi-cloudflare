// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.LogpushOwnershipChallengeArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.LogpushOwnershipChallengeState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a resource which manages Cloudflare Logpush ownership
 * challenges to use in a Logpush Job. On it&#39;s own, doesn&#39;t do much
 * however this resource should be used in conjunction to create
 * Logpush jobs.
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
 * import com.pulumi.cloudflare.LogpushOwnershipChallenge;
 * import com.pulumi.cloudflare.LogpushOwnershipChallengeArgs;
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
 *         var example = new LogpushOwnershipChallenge(&#34;example&#34;, LogpushOwnershipChallengeArgs.builder()        
 *             .destinationConf(&#34;s3://my-bucket-path?region=us-west-2&#34;)
 *             .zoneId(&#34;0da42c8d2132a9ddaf714f9e7c920711&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="cloudflare:index/logpushOwnershipChallenge:LogpushOwnershipChallenge")
public class LogpushOwnershipChallenge extends com.pulumi.resources.CustomResource {
    /**
     * The account identifier to target for the resource. Must provide only one of `account_id`, `zone_id`.
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> accountId;

    /**
     * @return The account identifier to target for the resource. Must provide only one of `account_id`, `zone_id`.
     * 
     */
    public Output<Optional<String>> accountId() {
        return Codegen.optional(this.accountId);
    }
    /**
     * Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included. See [Logpush destination documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#destination). **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="destinationConf", refs={String.class}, tree="[0]")
    private Output<String> destinationConf;

    /**
     * @return Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included. See [Logpush destination documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#destination). **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<String> destinationConf() {
        return this.destinationConf;
    }
    /**
     * The filename of the ownership challenge which	contains the contents required for Logpush Job creation.
     * 
     */
    @Export(name="ownershipChallengeFilename", refs={String.class}, tree="[0]")
    private Output<String> ownershipChallengeFilename;

    /**
     * @return The filename of the ownership challenge which	contains the contents required for Logpush Job creation.
     * 
     */
    public Output<String> ownershipChallengeFilename() {
        return this.ownershipChallengeFilename;
    }
    /**
     * The zone identifier to target for the resource. Must provide only one of `account_id`, `zone_id`.
     * 
     */
    @Export(name="zoneId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> zoneId;

    /**
     * @return The zone identifier to target for the resource. Must provide only one of `account_id`, `zone_id`.
     * 
     */
    public Output<Optional<String>> zoneId() {
        return Codegen.optional(this.zoneId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LogpushOwnershipChallenge(String name) {
        this(name, LogpushOwnershipChallengeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LogpushOwnershipChallenge(String name, LogpushOwnershipChallengeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LogpushOwnershipChallenge(String name, LogpushOwnershipChallengeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/logpushOwnershipChallenge:LogpushOwnershipChallenge", name, args == null ? LogpushOwnershipChallengeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LogpushOwnershipChallenge(String name, Output<String> id, @Nullable LogpushOwnershipChallengeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/logpushOwnershipChallenge:LogpushOwnershipChallenge", name, state, makeResourceOptions(options, id));
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
    public static LogpushOwnershipChallenge get(String name, Output<String> id, @Nullable LogpushOwnershipChallengeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LogpushOwnershipChallenge(name, id, state, options);
    }
}
