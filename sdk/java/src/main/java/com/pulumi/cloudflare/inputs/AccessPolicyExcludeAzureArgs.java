// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccessPolicyExcludeAzureArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessPolicyExcludeAzureArgs Empty = new AccessPolicyExcludeAzureArgs();

    @Import(name="identityProviderId")
    private @Nullable Output<String> identityProviderId;

    public Optional<Output<String>> identityProviderId() {
        return Optional.ofNullable(this.identityProviderId);
    }

    /**
     * The ID of this resource.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return The ID of this resource.
     * 
     */
    public Optional<Output<List<String>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    private AccessPolicyExcludeAzureArgs() {}

    private AccessPolicyExcludeAzureArgs(AccessPolicyExcludeAzureArgs $) {
        this.identityProviderId = $.identityProviderId;
        this.ids = $.ids;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessPolicyExcludeAzureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessPolicyExcludeAzureArgs $;

        public Builder() {
            $ = new AccessPolicyExcludeAzureArgs();
        }

        public Builder(AccessPolicyExcludeAzureArgs defaults) {
            $ = new AccessPolicyExcludeAzureArgs(Objects.requireNonNull(defaults));
        }

        public Builder identityProviderId(@Nullable Output<String> identityProviderId) {
            $.identityProviderId = identityProviderId;
            return this;
        }

        public Builder identityProviderId(String identityProviderId) {
            return identityProviderId(Output.of(identityProviderId));
        }

        /**
         * @param ids The ID of this resource.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids The ID of this resource.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param ids The ID of this resource.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        public AccessPolicyExcludeAzureArgs build() {
            return $;
        }
    }

}
