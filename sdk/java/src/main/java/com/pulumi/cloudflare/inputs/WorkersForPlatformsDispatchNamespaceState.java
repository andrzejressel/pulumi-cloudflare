// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkersForPlatformsDispatchNamespaceState extends com.pulumi.resources.ResourceArgs {

    public static final WorkersForPlatformsDispatchNamespaceState Empty = new WorkersForPlatformsDispatchNamespaceState();

    /**
     * The account identifier to target for the resource.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return The account identifier to target for the resource.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * The name of the Workers for Platforms namespace.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Workers for Platforms namespace.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private WorkersForPlatformsDispatchNamespaceState() {}

    private WorkersForPlatformsDispatchNamespaceState(WorkersForPlatformsDispatchNamespaceState $) {
        this.accountId = $.accountId;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkersForPlatformsDispatchNamespaceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkersForPlatformsDispatchNamespaceState $;

        public Builder() {
            $ = new WorkersForPlatformsDispatchNamespaceState();
        }

        public Builder(WorkersForPlatformsDispatchNamespaceState defaults) {
            $ = new WorkersForPlatformsDispatchNamespaceState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The account identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param name The name of the Workers for Platforms namespace.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Workers for Platforms namespace.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public WorkersForPlatformsDispatchNamespaceState build() {
            return $;
        }
    }

}
