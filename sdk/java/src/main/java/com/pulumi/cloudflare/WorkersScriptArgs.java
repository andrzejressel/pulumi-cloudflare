// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.inputs.WorkersScriptAnalyticsEngineBindingArgs;
import com.pulumi.cloudflare.inputs.WorkersScriptD1DatabaseBindingArgs;
import com.pulumi.cloudflare.inputs.WorkersScriptKvNamespaceBindingArgs;
import com.pulumi.cloudflare.inputs.WorkersScriptPlacementArgs;
import com.pulumi.cloudflare.inputs.WorkersScriptPlainTextBindingArgs;
import com.pulumi.cloudflare.inputs.WorkersScriptQueueBindingArgs;
import com.pulumi.cloudflare.inputs.WorkersScriptR2BucketBindingArgs;
import com.pulumi.cloudflare.inputs.WorkersScriptSecretTextBindingArgs;
import com.pulumi.cloudflare.inputs.WorkersScriptServiceBindingArgs;
import com.pulumi.cloudflare.inputs.WorkersScriptWebassemblyBindingArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkersScriptArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkersScriptArgs Empty = new WorkersScriptArgs();

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

    @Import(name="analyticsEngineBindings")
    private @Nullable Output<List<WorkersScriptAnalyticsEngineBindingArgs>> analyticsEngineBindings;

    public Optional<Output<List<WorkersScriptAnalyticsEngineBindingArgs>>> analyticsEngineBindings() {
        return Optional.ofNullable(this.analyticsEngineBindings);
    }

    /**
     * The date to use for the compatibility flag.
     * 
     */
    @Import(name="compatibilityDate")
    private @Nullable Output<String> compatibilityDate;

    /**
     * @return The date to use for the compatibility flag.
     * 
     */
    public Optional<Output<String>> compatibilityDate() {
        return Optional.ofNullable(this.compatibilityDate);
    }

    /**
     * Compatibility flags used for Worker Scripts.
     * 
     */
    @Import(name="compatibilityFlags")
    private @Nullable Output<List<String>> compatibilityFlags;

    /**
     * @return Compatibility flags used for Worker Scripts.
     * 
     */
    public Optional<Output<List<String>>> compatibilityFlags() {
        return Optional.ofNullable(this.compatibilityFlags);
    }

    /**
     * The script content.
     * 
     */
    @Import(name="content", required=true)
    private Output<String> content;

    /**
     * @return The script content.
     * 
     */
    public Output<String> content() {
        return this.content;
    }

    @Import(name="d1DatabaseBindings")
    private @Nullable Output<List<WorkersScriptD1DatabaseBindingArgs>> d1DatabaseBindings;

    public Optional<Output<List<WorkersScriptD1DatabaseBindingArgs>>> d1DatabaseBindings() {
        return Optional.ofNullable(this.d1DatabaseBindings);
    }

    /**
     * Name of the Workers for Platforms dispatch namespace.
     * 
     */
    @Import(name="dispatchNamespace")
    private @Nullable Output<String> dispatchNamespace;

    /**
     * @return Name of the Workers for Platforms dispatch namespace.
     * 
     */
    public Optional<Output<String>> dispatchNamespace() {
        return Optional.ofNullable(this.dispatchNamespace);
    }

    @Import(name="kvNamespaceBindings")
    private @Nullable Output<List<WorkersScriptKvNamespaceBindingArgs>> kvNamespaceBindings;

    public Optional<Output<List<WorkersScriptKvNamespaceBindingArgs>>> kvNamespaceBindings() {
        return Optional.ofNullable(this.kvNamespaceBindings);
    }

    /**
     * Enabling allows Worker events to be sent to a defined Logpush destination.
     * 
     */
    @Import(name="logpush")
    private @Nullable Output<Boolean> logpush;

    /**
     * @return Enabling allows Worker events to be sent to a defined Logpush destination.
     * 
     */
    public Optional<Output<Boolean>> logpush() {
        return Optional.ofNullable(this.logpush);
    }

    /**
     * Whether to upload Worker as a module.
     * 
     */
    @Import(name="module")
    private @Nullable Output<Boolean> module;

    /**
     * @return Whether to upload Worker as a module.
     * 
     */
    public Optional<Output<Boolean>> module() {
        return Optional.ofNullable(this.module);
    }

    /**
     * The name for the script. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name for the script. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    @Import(name="placements")
    private @Nullable Output<List<WorkersScriptPlacementArgs>> placements;

    public Optional<Output<List<WorkersScriptPlacementArgs>>> placements() {
        return Optional.ofNullable(this.placements);
    }

    @Import(name="plainTextBindings")
    private @Nullable Output<List<WorkersScriptPlainTextBindingArgs>> plainTextBindings;

    public Optional<Output<List<WorkersScriptPlainTextBindingArgs>>> plainTextBindings() {
        return Optional.ofNullable(this.plainTextBindings);
    }

    @Import(name="queueBindings")
    private @Nullable Output<List<WorkersScriptQueueBindingArgs>> queueBindings;

    public Optional<Output<List<WorkersScriptQueueBindingArgs>>> queueBindings() {
        return Optional.ofNullable(this.queueBindings);
    }

    @Import(name="r2BucketBindings")
    private @Nullable Output<List<WorkersScriptR2BucketBindingArgs>> r2BucketBindings;

    public Optional<Output<List<WorkersScriptR2BucketBindingArgs>>> r2BucketBindings() {
        return Optional.ofNullable(this.r2BucketBindings);
    }

    @Import(name="secretTextBindings")
    private @Nullable Output<List<WorkersScriptSecretTextBindingArgs>> secretTextBindings;

    public Optional<Output<List<WorkersScriptSecretTextBindingArgs>>> secretTextBindings() {
        return Optional.ofNullable(this.secretTextBindings);
    }

    @Import(name="serviceBindings")
    private @Nullable Output<List<WorkersScriptServiceBindingArgs>> serviceBindings;

    public Optional<Output<List<WorkersScriptServiceBindingArgs>>> serviceBindings() {
        return Optional.ofNullable(this.serviceBindings);
    }

    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    @Import(name="webassemblyBindings")
    private @Nullable Output<List<WorkersScriptWebassemblyBindingArgs>> webassemblyBindings;

    public Optional<Output<List<WorkersScriptWebassemblyBindingArgs>>> webassemblyBindings() {
        return Optional.ofNullable(this.webassemblyBindings);
    }

    private WorkersScriptArgs() {}

    private WorkersScriptArgs(WorkersScriptArgs $) {
        this.accountId = $.accountId;
        this.analyticsEngineBindings = $.analyticsEngineBindings;
        this.compatibilityDate = $.compatibilityDate;
        this.compatibilityFlags = $.compatibilityFlags;
        this.content = $.content;
        this.d1DatabaseBindings = $.d1DatabaseBindings;
        this.dispatchNamespace = $.dispatchNamespace;
        this.kvNamespaceBindings = $.kvNamespaceBindings;
        this.logpush = $.logpush;
        this.module = $.module;
        this.name = $.name;
        this.placements = $.placements;
        this.plainTextBindings = $.plainTextBindings;
        this.queueBindings = $.queueBindings;
        this.r2BucketBindings = $.r2BucketBindings;
        this.secretTextBindings = $.secretTextBindings;
        this.serviceBindings = $.serviceBindings;
        this.tags = $.tags;
        this.webassemblyBindings = $.webassemblyBindings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkersScriptArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkersScriptArgs $;

        public Builder() {
            $ = new WorkersScriptArgs();
        }

        public Builder(WorkersScriptArgs defaults) {
            $ = new WorkersScriptArgs(Objects.requireNonNull(defaults));
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

        public Builder analyticsEngineBindings(@Nullable Output<List<WorkersScriptAnalyticsEngineBindingArgs>> analyticsEngineBindings) {
            $.analyticsEngineBindings = analyticsEngineBindings;
            return this;
        }

        public Builder analyticsEngineBindings(List<WorkersScriptAnalyticsEngineBindingArgs> analyticsEngineBindings) {
            return analyticsEngineBindings(Output.of(analyticsEngineBindings));
        }

        public Builder analyticsEngineBindings(WorkersScriptAnalyticsEngineBindingArgs... analyticsEngineBindings) {
            return analyticsEngineBindings(List.of(analyticsEngineBindings));
        }

        /**
         * @param compatibilityDate The date to use for the compatibility flag.
         * 
         * @return builder
         * 
         */
        public Builder compatibilityDate(@Nullable Output<String> compatibilityDate) {
            $.compatibilityDate = compatibilityDate;
            return this;
        }

        /**
         * @param compatibilityDate The date to use for the compatibility flag.
         * 
         * @return builder
         * 
         */
        public Builder compatibilityDate(String compatibilityDate) {
            return compatibilityDate(Output.of(compatibilityDate));
        }

        /**
         * @param compatibilityFlags Compatibility flags used for Worker Scripts.
         * 
         * @return builder
         * 
         */
        public Builder compatibilityFlags(@Nullable Output<List<String>> compatibilityFlags) {
            $.compatibilityFlags = compatibilityFlags;
            return this;
        }

        /**
         * @param compatibilityFlags Compatibility flags used for Worker Scripts.
         * 
         * @return builder
         * 
         */
        public Builder compatibilityFlags(List<String> compatibilityFlags) {
            return compatibilityFlags(Output.of(compatibilityFlags));
        }

        /**
         * @param compatibilityFlags Compatibility flags used for Worker Scripts.
         * 
         * @return builder
         * 
         */
        public Builder compatibilityFlags(String... compatibilityFlags) {
            return compatibilityFlags(List.of(compatibilityFlags));
        }

        /**
         * @param content The script content.
         * 
         * @return builder
         * 
         */
        public Builder content(Output<String> content) {
            $.content = content;
            return this;
        }

        /**
         * @param content The script content.
         * 
         * @return builder
         * 
         */
        public Builder content(String content) {
            return content(Output.of(content));
        }

        public Builder d1DatabaseBindings(@Nullable Output<List<WorkersScriptD1DatabaseBindingArgs>> d1DatabaseBindings) {
            $.d1DatabaseBindings = d1DatabaseBindings;
            return this;
        }

        public Builder d1DatabaseBindings(List<WorkersScriptD1DatabaseBindingArgs> d1DatabaseBindings) {
            return d1DatabaseBindings(Output.of(d1DatabaseBindings));
        }

        public Builder d1DatabaseBindings(WorkersScriptD1DatabaseBindingArgs... d1DatabaseBindings) {
            return d1DatabaseBindings(List.of(d1DatabaseBindings));
        }

        /**
         * @param dispatchNamespace Name of the Workers for Platforms dispatch namespace.
         * 
         * @return builder
         * 
         */
        public Builder dispatchNamespace(@Nullable Output<String> dispatchNamespace) {
            $.dispatchNamespace = dispatchNamespace;
            return this;
        }

        /**
         * @param dispatchNamespace Name of the Workers for Platforms dispatch namespace.
         * 
         * @return builder
         * 
         */
        public Builder dispatchNamespace(String dispatchNamespace) {
            return dispatchNamespace(Output.of(dispatchNamespace));
        }

        public Builder kvNamespaceBindings(@Nullable Output<List<WorkersScriptKvNamespaceBindingArgs>> kvNamespaceBindings) {
            $.kvNamespaceBindings = kvNamespaceBindings;
            return this;
        }

        public Builder kvNamespaceBindings(List<WorkersScriptKvNamespaceBindingArgs> kvNamespaceBindings) {
            return kvNamespaceBindings(Output.of(kvNamespaceBindings));
        }

        public Builder kvNamespaceBindings(WorkersScriptKvNamespaceBindingArgs... kvNamespaceBindings) {
            return kvNamespaceBindings(List.of(kvNamespaceBindings));
        }

        /**
         * @param logpush Enabling allows Worker events to be sent to a defined Logpush destination.
         * 
         * @return builder
         * 
         */
        public Builder logpush(@Nullable Output<Boolean> logpush) {
            $.logpush = logpush;
            return this;
        }

        /**
         * @param logpush Enabling allows Worker events to be sent to a defined Logpush destination.
         * 
         * @return builder
         * 
         */
        public Builder logpush(Boolean logpush) {
            return logpush(Output.of(logpush));
        }

        /**
         * @param module Whether to upload Worker as a module.
         * 
         * @return builder
         * 
         */
        public Builder module(@Nullable Output<Boolean> module) {
            $.module = module;
            return this;
        }

        /**
         * @param module Whether to upload Worker as a module.
         * 
         * @return builder
         * 
         */
        public Builder module(Boolean module) {
            return module(Output.of(module));
        }

        /**
         * @param name The name for the script. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name for the script. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder placements(@Nullable Output<List<WorkersScriptPlacementArgs>> placements) {
            $.placements = placements;
            return this;
        }

        public Builder placements(List<WorkersScriptPlacementArgs> placements) {
            return placements(Output.of(placements));
        }

        public Builder placements(WorkersScriptPlacementArgs... placements) {
            return placements(List.of(placements));
        }

        public Builder plainTextBindings(@Nullable Output<List<WorkersScriptPlainTextBindingArgs>> plainTextBindings) {
            $.plainTextBindings = plainTextBindings;
            return this;
        }

        public Builder plainTextBindings(List<WorkersScriptPlainTextBindingArgs> plainTextBindings) {
            return plainTextBindings(Output.of(plainTextBindings));
        }

        public Builder plainTextBindings(WorkersScriptPlainTextBindingArgs... plainTextBindings) {
            return plainTextBindings(List.of(plainTextBindings));
        }

        public Builder queueBindings(@Nullable Output<List<WorkersScriptQueueBindingArgs>> queueBindings) {
            $.queueBindings = queueBindings;
            return this;
        }

        public Builder queueBindings(List<WorkersScriptQueueBindingArgs> queueBindings) {
            return queueBindings(Output.of(queueBindings));
        }

        public Builder queueBindings(WorkersScriptQueueBindingArgs... queueBindings) {
            return queueBindings(List.of(queueBindings));
        }

        public Builder r2BucketBindings(@Nullable Output<List<WorkersScriptR2BucketBindingArgs>> r2BucketBindings) {
            $.r2BucketBindings = r2BucketBindings;
            return this;
        }

        public Builder r2BucketBindings(List<WorkersScriptR2BucketBindingArgs> r2BucketBindings) {
            return r2BucketBindings(Output.of(r2BucketBindings));
        }

        public Builder r2BucketBindings(WorkersScriptR2BucketBindingArgs... r2BucketBindings) {
            return r2BucketBindings(List.of(r2BucketBindings));
        }

        public Builder secretTextBindings(@Nullable Output<List<WorkersScriptSecretTextBindingArgs>> secretTextBindings) {
            $.secretTextBindings = secretTextBindings;
            return this;
        }

        public Builder secretTextBindings(List<WorkersScriptSecretTextBindingArgs> secretTextBindings) {
            return secretTextBindings(Output.of(secretTextBindings));
        }

        public Builder secretTextBindings(WorkersScriptSecretTextBindingArgs... secretTextBindings) {
            return secretTextBindings(List.of(secretTextBindings));
        }

        public Builder serviceBindings(@Nullable Output<List<WorkersScriptServiceBindingArgs>> serviceBindings) {
            $.serviceBindings = serviceBindings;
            return this;
        }

        public Builder serviceBindings(List<WorkersScriptServiceBindingArgs> serviceBindings) {
            return serviceBindings(Output.of(serviceBindings));
        }

        public Builder serviceBindings(WorkersScriptServiceBindingArgs... serviceBindings) {
            return serviceBindings(List.of(serviceBindings));
        }

        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        public Builder webassemblyBindings(@Nullable Output<List<WorkersScriptWebassemblyBindingArgs>> webassemblyBindings) {
            $.webassemblyBindings = webassemblyBindings;
            return this;
        }

        public Builder webassemblyBindings(List<WorkersScriptWebassemblyBindingArgs> webassemblyBindings) {
            return webassemblyBindings(Output.of(webassemblyBindings));
        }

        public Builder webassemblyBindings(WorkersScriptWebassemblyBindingArgs... webassemblyBindings) {
            return webassemblyBindings(List.of(webassemblyBindings));
        }

        public WorkersScriptArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("WorkersScriptArgs", "accountId");
            }
            if ($.content == null) {
                throw new MissingRequiredPropertyException("WorkersScriptArgs", "content");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("WorkersScriptArgs", "name");
            }
            return $;
        }
    }

}
