// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.PagesProjectDeploymentConfigsProductionPlacement;
import com.pulumi.cloudflare.outputs.PagesProjectDeploymentConfigsProductionServiceBinding;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PagesProjectDeploymentConfigsProduction {
    /**
     * @return Use latest compatibility date for Pages Functions. Defaults to `false`.
     * 
     */
    private @Nullable Boolean alwaysUseLatestCompatibilityDate;
    /**
     * @return Compatibility date used for Pages Functions.
     * 
     */
    private @Nullable String compatibilityDate;
    /**
     * @return Compatibility flags used for Pages Functions.
     * 
     */
    private @Nullable List<String> compatibilityFlags;
    /**
     * @return D1 Databases used for Pages Functions. Defaults to `map[]`.
     * 
     */
    private @Nullable Map<String,Object> d1Databases;
    /**
     * @return Durable Object namespaces used for Pages Functions. Defaults to `map[]`.
     * 
     */
    private @Nullable Map<String,Object> durableObjectNamespaces;
    /**
     * @return Environment variables for Pages Functions. Defaults to `map[]`.
     * 
     */
    private @Nullable Map<String,Object> environmentVariables;
    /**
     * @return Fail open used for Pages Functions. Defaults to `false`.
     * 
     */
    private @Nullable Boolean failOpen;
    /**
     * @return KV namespaces used for Pages Functions. Defaults to `map[]`.
     * 
     */
    private @Nullable Map<String,Object> kvNamespaces;
    /**
     * @return Configuration for placement in the Cloudflare Pages project.
     * 
     */
    private @Nullable PagesProjectDeploymentConfigsProductionPlacement placement;
    /**
     * @return R2 Buckets used for Pages Functions. Defaults to `map[]`.
     * 
     */
    private @Nullable Map<String,Object> r2Buckets;
    /**
     * @return Encrypted environment variables for Pages Functions. Defaults to `map[]`.
     * 
     */
    private @Nullable Map<String,Object> secrets;
    /**
     * @return Services used for Pages Functions.
     * 
     */
    private @Nullable List<PagesProjectDeploymentConfigsProductionServiceBinding> serviceBindings;
    /**
     * @return Usage model used for Pages Functions. Defaults to `bundled`.
     * 
     */
    private @Nullable String usageModel;

    private PagesProjectDeploymentConfigsProduction() {}
    /**
     * @return Use latest compatibility date for Pages Functions. Defaults to `false`.
     * 
     */
    public Optional<Boolean> alwaysUseLatestCompatibilityDate() {
        return Optional.ofNullable(this.alwaysUseLatestCompatibilityDate);
    }
    /**
     * @return Compatibility date used for Pages Functions.
     * 
     */
    public Optional<String> compatibilityDate() {
        return Optional.ofNullable(this.compatibilityDate);
    }
    /**
     * @return Compatibility flags used for Pages Functions.
     * 
     */
    public List<String> compatibilityFlags() {
        return this.compatibilityFlags == null ? List.of() : this.compatibilityFlags;
    }
    /**
     * @return D1 Databases used for Pages Functions. Defaults to `map[]`.
     * 
     */
    public Map<String,Object> d1Databases() {
        return this.d1Databases == null ? Map.of() : this.d1Databases;
    }
    /**
     * @return Durable Object namespaces used for Pages Functions. Defaults to `map[]`.
     * 
     */
    public Map<String,Object> durableObjectNamespaces() {
        return this.durableObjectNamespaces == null ? Map.of() : this.durableObjectNamespaces;
    }
    /**
     * @return Environment variables for Pages Functions. Defaults to `map[]`.
     * 
     */
    public Map<String,Object> environmentVariables() {
        return this.environmentVariables == null ? Map.of() : this.environmentVariables;
    }
    /**
     * @return Fail open used for Pages Functions. Defaults to `false`.
     * 
     */
    public Optional<Boolean> failOpen() {
        return Optional.ofNullable(this.failOpen);
    }
    /**
     * @return KV namespaces used for Pages Functions. Defaults to `map[]`.
     * 
     */
    public Map<String,Object> kvNamespaces() {
        return this.kvNamespaces == null ? Map.of() : this.kvNamespaces;
    }
    /**
     * @return Configuration for placement in the Cloudflare Pages project.
     * 
     */
    public Optional<PagesProjectDeploymentConfigsProductionPlacement> placement() {
        return Optional.ofNullable(this.placement);
    }
    /**
     * @return R2 Buckets used for Pages Functions. Defaults to `map[]`.
     * 
     */
    public Map<String,Object> r2Buckets() {
        return this.r2Buckets == null ? Map.of() : this.r2Buckets;
    }
    /**
     * @return Encrypted environment variables for Pages Functions. Defaults to `map[]`.
     * 
     */
    public Map<String,Object> secrets() {
        return this.secrets == null ? Map.of() : this.secrets;
    }
    /**
     * @return Services used for Pages Functions.
     * 
     */
    public List<PagesProjectDeploymentConfigsProductionServiceBinding> serviceBindings() {
        return this.serviceBindings == null ? List.of() : this.serviceBindings;
    }
    /**
     * @return Usage model used for Pages Functions. Defaults to `bundled`.
     * 
     */
    public Optional<String> usageModel() {
        return Optional.ofNullable(this.usageModel);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PagesProjectDeploymentConfigsProduction defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean alwaysUseLatestCompatibilityDate;
        private @Nullable String compatibilityDate;
        private @Nullable List<String> compatibilityFlags;
        private @Nullable Map<String,Object> d1Databases;
        private @Nullable Map<String,Object> durableObjectNamespaces;
        private @Nullable Map<String,Object> environmentVariables;
        private @Nullable Boolean failOpen;
        private @Nullable Map<String,Object> kvNamespaces;
        private @Nullable PagesProjectDeploymentConfigsProductionPlacement placement;
        private @Nullable Map<String,Object> r2Buckets;
        private @Nullable Map<String,Object> secrets;
        private @Nullable List<PagesProjectDeploymentConfigsProductionServiceBinding> serviceBindings;
        private @Nullable String usageModel;
        public Builder() {}
        public Builder(PagesProjectDeploymentConfigsProduction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alwaysUseLatestCompatibilityDate = defaults.alwaysUseLatestCompatibilityDate;
    	      this.compatibilityDate = defaults.compatibilityDate;
    	      this.compatibilityFlags = defaults.compatibilityFlags;
    	      this.d1Databases = defaults.d1Databases;
    	      this.durableObjectNamespaces = defaults.durableObjectNamespaces;
    	      this.environmentVariables = defaults.environmentVariables;
    	      this.failOpen = defaults.failOpen;
    	      this.kvNamespaces = defaults.kvNamespaces;
    	      this.placement = defaults.placement;
    	      this.r2Buckets = defaults.r2Buckets;
    	      this.secrets = defaults.secrets;
    	      this.serviceBindings = defaults.serviceBindings;
    	      this.usageModel = defaults.usageModel;
        }

        @CustomType.Setter
        public Builder alwaysUseLatestCompatibilityDate(@Nullable Boolean alwaysUseLatestCompatibilityDate) {
            this.alwaysUseLatestCompatibilityDate = alwaysUseLatestCompatibilityDate;
            return this;
        }
        @CustomType.Setter
        public Builder compatibilityDate(@Nullable String compatibilityDate) {
            this.compatibilityDate = compatibilityDate;
            return this;
        }
        @CustomType.Setter
        public Builder compatibilityFlags(@Nullable List<String> compatibilityFlags) {
            this.compatibilityFlags = compatibilityFlags;
            return this;
        }
        public Builder compatibilityFlags(String... compatibilityFlags) {
            return compatibilityFlags(List.of(compatibilityFlags));
        }
        @CustomType.Setter
        public Builder d1Databases(@Nullable Map<String,Object> d1Databases) {
            this.d1Databases = d1Databases;
            return this;
        }
        @CustomType.Setter
        public Builder durableObjectNamespaces(@Nullable Map<String,Object> durableObjectNamespaces) {
            this.durableObjectNamespaces = durableObjectNamespaces;
            return this;
        }
        @CustomType.Setter
        public Builder environmentVariables(@Nullable Map<String,Object> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }
        @CustomType.Setter
        public Builder failOpen(@Nullable Boolean failOpen) {
            this.failOpen = failOpen;
            return this;
        }
        @CustomType.Setter
        public Builder kvNamespaces(@Nullable Map<String,Object> kvNamespaces) {
            this.kvNamespaces = kvNamespaces;
            return this;
        }
        @CustomType.Setter
        public Builder placement(@Nullable PagesProjectDeploymentConfigsProductionPlacement placement) {
            this.placement = placement;
            return this;
        }
        @CustomType.Setter
        public Builder r2Buckets(@Nullable Map<String,Object> r2Buckets) {
            this.r2Buckets = r2Buckets;
            return this;
        }
        @CustomType.Setter
        public Builder secrets(@Nullable Map<String,Object> secrets) {
            this.secrets = secrets;
            return this;
        }
        @CustomType.Setter
        public Builder serviceBindings(@Nullable List<PagesProjectDeploymentConfigsProductionServiceBinding> serviceBindings) {
            this.serviceBindings = serviceBindings;
            return this;
        }
        public Builder serviceBindings(PagesProjectDeploymentConfigsProductionServiceBinding... serviceBindings) {
            return serviceBindings(List.of(serviceBindings));
        }
        @CustomType.Setter
        public Builder usageModel(@Nullable String usageModel) {
            this.usageModel = usageModel;
            return this;
        }
        public PagesProjectDeploymentConfigsProduction build() {
            final var _resultValue = new PagesProjectDeploymentConfigsProduction();
            _resultValue.alwaysUseLatestCompatibilityDate = alwaysUseLatestCompatibilityDate;
            _resultValue.compatibilityDate = compatibilityDate;
            _resultValue.compatibilityFlags = compatibilityFlags;
            _resultValue.d1Databases = d1Databases;
            _resultValue.durableObjectNamespaces = durableObjectNamespaces;
            _resultValue.environmentVariables = environmentVariables;
            _resultValue.failOpen = failOpen;
            _resultValue.kvNamespaces = kvNamespaces;
            _resultValue.placement = placement;
            _resultValue.r2Buckets = r2Buckets;
            _resultValue.secrets = secrets;
            _resultValue.serviceBindings = serviceBindings;
            _resultValue.usageModel = usageModel;
            return _resultValue;
        }
    }
}
