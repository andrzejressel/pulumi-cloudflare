// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApiTokenPolicy {
    /**
     * @return Effect of the policy. Available values: `allow`, `deny`. Defaults to `allow`.
     * 
     */
    private @Nullable String effect;
    /**
     * @return List of permissions groups IDs. See [documentation](https://developers.cloudflare.com/api/tokens/create/permissions) for more information.
     * 
     */
    private List<String> permissionGroups;
    /**
     * @return Describes what operations against which resources are allowed or denied.
     * 
     */
    private Map<String,String> resources;

    private ApiTokenPolicy() {}
    /**
     * @return Effect of the policy. Available values: `allow`, `deny`. Defaults to `allow`.
     * 
     */
    public Optional<String> effect() {
        return Optional.ofNullable(this.effect);
    }
    /**
     * @return List of permissions groups IDs. See [documentation](https://developers.cloudflare.com/api/tokens/create/permissions) for more information.
     * 
     */
    public List<String> permissionGroups() {
        return this.permissionGroups;
    }
    /**
     * @return Describes what operations against which resources are allowed or denied.
     * 
     */
    public Map<String,String> resources() {
        return this.resources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiTokenPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String effect;
        private List<String> permissionGroups;
        private Map<String,String> resources;
        public Builder() {}
        public Builder(ApiTokenPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.effect = defaults.effect;
    	      this.permissionGroups = defaults.permissionGroups;
    	      this.resources = defaults.resources;
        }

        @CustomType.Setter
        public Builder effect(@Nullable String effect) {
            this.effect = effect;
            return this;
        }
        @CustomType.Setter
        public Builder permissionGroups(List<String> permissionGroups) {
            this.permissionGroups = Objects.requireNonNull(permissionGroups);
            return this;
        }
        public Builder permissionGroups(String... permissionGroups) {
            return permissionGroups(List.of(permissionGroups));
        }
        @CustomType.Setter
        public Builder resources(Map<String,String> resources) {
            this.resources = Objects.requireNonNull(resources);
            return this;
        }
        public ApiTokenPolicy build() {
            final var _resultValue = new ApiTokenPolicy();
            _resultValue.effect = effect;
            _resultValue.permissionGroups = permissionGroups;
            _resultValue.resources = resources;
            return _resultValue;
        }
    }
}
