// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.ListArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.ListState;
import com.pulumi.cloudflare.outputs.ListItem;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import cloudflare:index/list:List example &lt;account_id&gt;/&lt;list_id&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/list:List")
public class List extends com.pulumi.resources.CustomResource {
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
     * An optional description of the list.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return An optional description of the list.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The items in the list.
     * 
     */
    @Export(name="items", refs={java.util.List.class,ListItem.class}, tree="[0,1]")
    private Output</* @Nullable */ java.util.List<ListItem>> items;

    /**
     * @return The items in the list.
     * 
     */
    public Output<Optional<java.util.List<ListItem>>> items() {
        return Codegen.optional(this.items);
    }
    /**
     * The type of items the list will contain. Must provide only one of: `ip`, `redirect`, `hostname`, `asn`..
     * 
     */
    @Export(name="kind", refs={String.class}, tree="[0]")
    private Output<String> kind;

    /**
     * @return The type of items the list will contain. Must provide only one of: `ip`, `redirect`, `hostname`, `asn`..
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * The name of the list.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the list.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public List(java.lang.String name) {
        this(name, ListArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public List(java.lang.String name, ListArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public List(java.lang.String name, ListArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/list:List", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private List(java.lang.String name, Output<java.lang.String> id, @Nullable ListState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/list:List", name, state, makeResourceOptions(options, id), false);
    }

    private static ListArgs makeArgs(ListArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ListArgs.Empty : args;
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
    public static List get(java.lang.String name, Output<java.lang.String> id, @Nullable ListState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new List(name, id, state, options);
    }
}
