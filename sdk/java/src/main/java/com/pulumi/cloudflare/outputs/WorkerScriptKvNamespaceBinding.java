// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class WorkerScriptKvNamespaceBinding {
    /**
     * @return The global variable for the binding in your Worker code.
     * 
     */
    private String name;
    /**
     * @return ID of the KV namespace you want to use.
     * 
     */
    private String namespaceId;

    private WorkerScriptKvNamespaceBinding() {}
    /**
     * @return The global variable for the binding in your Worker code.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return ID of the KV namespace you want to use.
     * 
     */
    public String namespaceId() {
        return this.namespaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkerScriptKvNamespaceBinding defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String namespaceId;
        public Builder() {}
        public Builder(WorkerScriptKvNamespaceBinding defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.namespaceId = defaults.namespaceId;
        }

        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder namespaceId(String namespaceId) {
            this.namespaceId = Objects.requireNonNull(namespaceId);
            return this;
        }
        public WorkerScriptKvNamespaceBinding build() {
            final var o = new WorkerScriptKvNamespaceBinding();
            o.name = name;
            o.namespaceId = namespaceId;
            return o;
        }
    }
}