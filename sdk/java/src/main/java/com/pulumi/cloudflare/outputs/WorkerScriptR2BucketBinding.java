// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class WorkerScriptR2BucketBinding {
    /**
     * @return The name of the Bucket to bind to.
     * 
     */
    private String bucketName;
    /**
     * @return The global variable for the binding in your Worker code.
     * 
     */
    private String name;

    private WorkerScriptR2BucketBinding() {}
    /**
     * @return The name of the Bucket to bind to.
     * 
     */
    public String bucketName() {
        return this.bucketName;
    }
    /**
     * @return The global variable for the binding in your Worker code.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkerScriptR2BucketBinding defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String bucketName;
        private String name;
        public Builder() {}
        public Builder(WorkerScriptR2BucketBinding defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder bucketName(String bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public WorkerScriptR2BucketBinding build() {
            final var _resultValue = new WorkerScriptR2BucketBinding();
            _resultValue.bucketName = bucketName;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
