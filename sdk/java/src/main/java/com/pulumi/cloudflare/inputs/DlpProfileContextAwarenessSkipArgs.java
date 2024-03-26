// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.Objects;


public final class DlpProfileContextAwarenessSkipArgs extends com.pulumi.resources.ResourceArgs {

    public static final DlpProfileContextAwarenessSkipArgs Empty = new DlpProfileContextAwarenessSkipArgs();

    /**
     * Return all matches, regardless of context analysis result, if the data is a file.
     * 
     */
    @Import(name="files", required=true)
    private Output<Boolean> files;

    /**
     * @return Return all matches, regardless of context analysis result, if the data is a file.
     * 
     */
    public Output<Boolean> files() {
        return this.files;
    }

    private DlpProfileContextAwarenessSkipArgs() {}

    private DlpProfileContextAwarenessSkipArgs(DlpProfileContextAwarenessSkipArgs $) {
        this.files = $.files;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DlpProfileContextAwarenessSkipArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DlpProfileContextAwarenessSkipArgs $;

        public Builder() {
            $ = new DlpProfileContextAwarenessSkipArgs();
        }

        public Builder(DlpProfileContextAwarenessSkipArgs defaults) {
            $ = new DlpProfileContextAwarenessSkipArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param files Return all matches, regardless of context analysis result, if the data is a file.
         * 
         * @return builder
         * 
         */
        public Builder files(Output<Boolean> files) {
            $.files = files;
            return this;
        }

        /**
         * @param files Return all matches, regardless of context analysis result, if the data is a file.
         * 
         * @return builder
         * 
         */
        public Builder files(Boolean files) {
            return files(Output.of(files));
        }

        public DlpProfileContextAwarenessSkipArgs build() {
            if ($.files == null) {
                throw new MissingRequiredPropertyException("DlpProfileContextAwarenessSkipArgs", "files");
            }
            return $;
        }
    }

}