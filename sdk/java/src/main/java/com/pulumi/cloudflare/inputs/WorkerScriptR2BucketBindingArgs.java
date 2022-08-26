// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class WorkerScriptR2BucketBindingArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkerScriptR2BucketBindingArgs Empty = new WorkerScriptR2BucketBindingArgs();

    /**
     * The name of the Bucket to bind to.
     * 
     */
    @Import(name="bucketName", required=true)
    private Output<String> bucketName;

    /**
     * @return The name of the Bucket to bind to.
     * 
     */
    public Output<String> bucketName() {
        return this.bucketName;
    }

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

    private WorkerScriptR2BucketBindingArgs() {}

    private WorkerScriptR2BucketBindingArgs(WorkerScriptR2BucketBindingArgs $) {
        this.bucketName = $.bucketName;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkerScriptR2BucketBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkerScriptR2BucketBindingArgs $;

        public Builder() {
            $ = new WorkerScriptR2BucketBindingArgs();
        }

        public Builder(WorkerScriptR2BucketBindingArgs defaults) {
            $ = new WorkerScriptR2BucketBindingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucketName The name of the Bucket to bind to.
         * 
         * @return builder
         * 
         */
        public Builder bucketName(Output<String> bucketName) {
            $.bucketName = bucketName;
            return this;
        }

        /**
         * @param bucketName The name of the Bucket to bind to.
         * 
         * @return builder
         * 
         */
        public Builder bucketName(String bucketName) {
            return bucketName(Output.of(bucketName));
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

        public WorkerScriptR2BucketBindingArgs build() {
            $.bucketName = Objects.requireNonNull($.bucketName, "expected parameter 'bucketName' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
