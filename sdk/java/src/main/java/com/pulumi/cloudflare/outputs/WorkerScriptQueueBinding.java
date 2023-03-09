// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class WorkerScriptQueueBinding {
    /**
     * @return The name of the global variable for the binding in your Worker code.
     * 
     */
    private String binding;
    /**
     * @return Name of the queue you want to use.
     * 
     */
    private String queue;

    private WorkerScriptQueueBinding() {}
    /**
     * @return The name of the global variable for the binding in your Worker code.
     * 
     */
    public String binding() {
        return this.binding;
    }
    /**
     * @return Name of the queue you want to use.
     * 
     */
    public String queue() {
        return this.queue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkerScriptQueueBinding defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String binding;
        private String queue;
        public Builder() {}
        public Builder(WorkerScriptQueueBinding defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.binding = defaults.binding;
    	      this.queue = defaults.queue;
        }

        @CustomType.Setter
        public Builder binding(String binding) {
            this.binding = Objects.requireNonNull(binding);
            return this;
        }
        @CustomType.Setter
        public Builder queue(String queue) {
            this.queue = Objects.requireNonNull(queue);
            return this;
        }
        public WorkerScriptQueueBinding build() {
            final var o = new WorkerScriptQueueBinding();
            o.binding = binding;
            o.queue = queue;
            return o;
        }
    }
}
