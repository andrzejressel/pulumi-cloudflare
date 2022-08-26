// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class WorkerScriptKvNamespaceBindingArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkerScriptKvNamespaceBindingArgs Empty = new WorkerScriptKvNamespaceBindingArgs();

    /**
     * The global variable for the binding in your Worker code.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The global variable for the binding in your Worker code.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    @Import(name="namespaceId", required=true)
    private Output<String> namespaceId;

    public Output<String> namespaceId() {
        return this.namespaceId;
    }

    private WorkerScriptKvNamespaceBindingArgs() {}

    private WorkerScriptKvNamespaceBindingArgs(WorkerScriptKvNamespaceBindingArgs $) {
        this.name = $.name;
        this.namespaceId = $.namespaceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkerScriptKvNamespaceBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkerScriptKvNamespaceBindingArgs $;

        public Builder() {
            $ = new WorkerScriptKvNamespaceBindingArgs();
        }

        public Builder(WorkerScriptKvNamespaceBindingArgs defaults) {
            $ = new WorkerScriptKvNamespaceBindingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The global variable for the binding in your Worker code.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The global variable for the binding in your Worker code.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder namespaceId(Output<String> namespaceId) {
            $.namespaceId = namespaceId;
            return this;
        }

        public Builder namespaceId(String namespaceId) {
            return namespaceId(Output.of(namespaceId));
        }

        public WorkerScriptKvNamespaceBindingArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.namespaceId = Objects.requireNonNull($.namespaceId, "expected parameter 'namespaceId' to be non-null");
            return $;
        }
    }

}
