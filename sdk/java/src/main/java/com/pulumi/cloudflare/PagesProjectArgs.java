// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.inputs.PagesProjectBuildConfigArgs;
import com.pulumi.cloudflare.inputs.PagesProjectDeploymentConfigsArgs;
import com.pulumi.cloudflare.inputs.PagesProjectSourceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PagesProjectArgs extends com.pulumi.resources.ResourceArgs {

    public static final PagesProjectArgs Empty = new PagesProjectArgs();

    /**
     * The account identifier to target for the resource.
     * 
     */
    @Import(name="accountId", required=true)
    private Output<String> accountId;

    /**
     * @return The account identifier to target for the resource.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }

    /**
     * Configuration for the project build process. Read more about the build configuration in the [developer documentation](https://developers.cloudflare.com/pages/platform/build-configuration).
     * 
     */
    @Import(name="buildConfig")
    private @Nullable Output<PagesProjectBuildConfigArgs> buildConfig;

    /**
     * @return Configuration for the project build process. Read more about the build configuration in the [developer documentation](https://developers.cloudflare.com/pages/platform/build-configuration).
     * 
     */
    public Optional<Output<PagesProjectBuildConfigArgs>> buildConfig() {
        return Optional.ofNullable(this.buildConfig);
    }

    /**
     * Configuration for deployments in a project.
     * 
     */
    @Import(name="deploymentConfigs")
    private @Nullable Output<PagesProjectDeploymentConfigsArgs> deploymentConfigs;

    /**
     * @return Configuration for deployments in a project.
     * 
     */
    public Optional<Output<PagesProjectDeploymentConfigsArgs>> deploymentConfigs() {
        return Optional.ofNullable(this.deploymentConfigs);
    }

    /**
     * Name of the project.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the project.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The name of the branch that is used for the production environment.
     * 
     */
    @Import(name="productionBranch", required=true)
    private Output<String> productionBranch;

    /**
     * @return The name of the branch that is used for the production environment.
     * 
     */
    public Output<String> productionBranch() {
        return this.productionBranch;
    }

    /**
     * Configuration for the project source. Read more about the source configuration in the [developer documentation](https://developers.cloudflare.com/pages/platform/branch-build-controls/).
     * 
     */
    @Import(name="source")
    private @Nullable Output<PagesProjectSourceArgs> source;

    /**
     * @return Configuration for the project source. Read more about the source configuration in the [developer documentation](https://developers.cloudflare.com/pages/platform/branch-build-controls/).
     * 
     */
    public Optional<Output<PagesProjectSourceArgs>> source() {
        return Optional.ofNullable(this.source);
    }

    private PagesProjectArgs() {}

    private PagesProjectArgs(PagesProjectArgs $) {
        this.accountId = $.accountId;
        this.buildConfig = $.buildConfig;
        this.deploymentConfigs = $.deploymentConfigs;
        this.name = $.name;
        this.productionBranch = $.productionBranch;
        this.source = $.source;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PagesProjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PagesProjectArgs $;

        public Builder() {
            $ = new PagesProjectArgs();
        }

        public Builder(PagesProjectArgs defaults) {
            $ = new PagesProjectArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder accountId(Output<String> accountId) {
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
         * @param buildConfig Configuration for the project build process. Read more about the build configuration in the [developer documentation](https://developers.cloudflare.com/pages/platform/build-configuration).
         * 
         * @return builder
         * 
         */
        public Builder buildConfig(@Nullable Output<PagesProjectBuildConfigArgs> buildConfig) {
            $.buildConfig = buildConfig;
            return this;
        }

        /**
         * @param buildConfig Configuration for the project build process. Read more about the build configuration in the [developer documentation](https://developers.cloudflare.com/pages/platform/build-configuration).
         * 
         * @return builder
         * 
         */
        public Builder buildConfig(PagesProjectBuildConfigArgs buildConfig) {
            return buildConfig(Output.of(buildConfig));
        }

        /**
         * @param deploymentConfigs Configuration for deployments in a project.
         * 
         * @return builder
         * 
         */
        public Builder deploymentConfigs(@Nullable Output<PagesProjectDeploymentConfigsArgs> deploymentConfigs) {
            $.deploymentConfigs = deploymentConfigs;
            return this;
        }

        /**
         * @param deploymentConfigs Configuration for deployments in a project.
         * 
         * @return builder
         * 
         */
        public Builder deploymentConfigs(PagesProjectDeploymentConfigsArgs deploymentConfigs) {
            return deploymentConfigs(Output.of(deploymentConfigs));
        }

        /**
         * @param name Name of the project.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the project.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param productionBranch The name of the branch that is used for the production environment.
         * 
         * @return builder
         * 
         */
        public Builder productionBranch(Output<String> productionBranch) {
            $.productionBranch = productionBranch;
            return this;
        }

        /**
         * @param productionBranch The name of the branch that is used for the production environment.
         * 
         * @return builder
         * 
         */
        public Builder productionBranch(String productionBranch) {
            return productionBranch(Output.of(productionBranch));
        }

        /**
         * @param source Configuration for the project source. Read more about the source configuration in the [developer documentation](https://developers.cloudflare.com/pages/platform/branch-build-controls/).
         * 
         * @return builder
         * 
         */
        public Builder source(@Nullable Output<PagesProjectSourceArgs> source) {
            $.source = source;
            return this;
        }

        /**
         * @param source Configuration for the project source. Read more about the source configuration in the [developer documentation](https://developers.cloudflare.com/pages/platform/branch-build-controls/).
         * 
         * @return builder
         * 
         */
        public Builder source(PagesProjectSourceArgs source) {
            return source(Output.of(source));
        }

        public PagesProjectArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("PagesProjectArgs", "accountId");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("PagesProjectArgs", "name");
            }
            if ($.productionBranch == null) {
                throw new MissingRequiredPropertyException("PagesProjectArgs", "productionBranch");
            }
            return $;
        }
    }

}
