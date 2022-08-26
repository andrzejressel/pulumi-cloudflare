// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApiTokenPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApiTokenPolicyArgs Empty = new ApiTokenPolicyArgs();

    /**
     * Effect of the policy. Available values: `allow`, `deny`. Defaults to `allow`.
     * 
     */
    @Import(name="effect")
    private @Nullable Output<String> effect;

    /**
     * @return Effect of the policy. Available values: `allow`, `deny`. Defaults to `allow`.
     * 
     */
    public Optional<Output<String>> effect() {
        return Optional.ofNullable(this.effect);
    }

    /**
     * List of permissions groups IDs. See [documentation](https://developers.cloudflare.com/api/tokens/create/permissions) for more information.
     * 
     */
    @Import(name="permissionGroups", required=true)
    private Output<List<String>> permissionGroups;

    /**
     * @return List of permissions groups IDs. See [documentation](https://developers.cloudflare.com/api/tokens/create/permissions) for more information.
     * 
     */
    public Output<List<String>> permissionGroups() {
        return this.permissionGroups;
    }

    /**
     * Describes what operations against which resources are allowed or denied.
     * 
     */
    @Import(name="resources", required=true)
    private Output<Map<String,String>> resources;

    /**
     * @return Describes what operations against which resources are allowed or denied.
     * 
     */
    public Output<Map<String,String>> resources() {
        return this.resources;
    }

    private ApiTokenPolicyArgs() {}

    private ApiTokenPolicyArgs(ApiTokenPolicyArgs $) {
        this.effect = $.effect;
        this.permissionGroups = $.permissionGroups;
        this.resources = $.resources;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiTokenPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiTokenPolicyArgs $;

        public Builder() {
            $ = new ApiTokenPolicyArgs();
        }

        public Builder(ApiTokenPolicyArgs defaults) {
            $ = new ApiTokenPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param effect Effect of the policy. Available values: `allow`, `deny`. Defaults to `allow`.
         * 
         * @return builder
         * 
         */
        public Builder effect(@Nullable Output<String> effect) {
            $.effect = effect;
            return this;
        }

        /**
         * @param effect Effect of the policy. Available values: `allow`, `deny`. Defaults to `allow`.
         * 
         * @return builder
         * 
         */
        public Builder effect(String effect) {
            return effect(Output.of(effect));
        }

        /**
         * @param permissionGroups List of permissions groups IDs. See [documentation](https://developers.cloudflare.com/api/tokens/create/permissions) for more information.
         * 
         * @return builder
         * 
         */
        public Builder permissionGroups(Output<List<String>> permissionGroups) {
            $.permissionGroups = permissionGroups;
            return this;
        }

        /**
         * @param permissionGroups List of permissions groups IDs. See [documentation](https://developers.cloudflare.com/api/tokens/create/permissions) for more information.
         * 
         * @return builder
         * 
         */
        public Builder permissionGroups(List<String> permissionGroups) {
            return permissionGroups(Output.of(permissionGroups));
        }

        /**
         * @param permissionGroups List of permissions groups IDs. See [documentation](https://developers.cloudflare.com/api/tokens/create/permissions) for more information.
         * 
         * @return builder
         * 
         */
        public Builder permissionGroups(String... permissionGroups) {
            return permissionGroups(List.of(permissionGroups));
        }

        /**
         * @param resources Describes what operations against which resources are allowed or denied.
         * 
         * @return builder
         * 
         */
        public Builder resources(Output<Map<String,String>> resources) {
            $.resources = resources;
            return this;
        }

        /**
         * @param resources Describes what operations against which resources are allowed or denied.
         * 
         * @return builder
         * 
         */
        public Builder resources(Map<String,String> resources) {
            return resources(Output.of(resources));
        }

        public ApiTokenPolicyArgs build() {
            $.permissionGroups = Objects.requireNonNull($.permissionGroups, "expected parameter 'permissionGroups' to be non-null");
            $.resources = Objects.requireNonNull($.resources, "expected parameter 'resources' to be non-null");
            return $;
        }
    }

}
