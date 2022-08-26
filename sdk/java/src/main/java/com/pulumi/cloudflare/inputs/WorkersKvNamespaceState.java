// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkersKvNamespaceState extends com.pulumi.resources.ResourceArgs {

    public static final WorkersKvNamespaceState Empty = new WorkersKvNamespaceState();

    /**
     * The name of the namespace you wish to create.
     * 
     */
    @Import(name="title")
    private @Nullable Output<String> title;

    /**
     * @return The name of the namespace you wish to create.
     * 
     */
    public Optional<Output<String>> title() {
        return Optional.ofNullable(this.title);
    }

    private WorkersKvNamespaceState() {}

    private WorkersKvNamespaceState(WorkersKvNamespaceState $) {
        this.title = $.title;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkersKvNamespaceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkersKvNamespaceState $;

        public Builder() {
            $ = new WorkersKvNamespaceState();
        }

        public Builder(WorkersKvNamespaceState defaults) {
            $ = new WorkersKvNamespaceState(Objects.requireNonNull(defaults));
        }

        /**
         * @param title The name of the namespace you wish to create.
         * 
         * @return builder
         * 
         */
        public Builder title(@Nullable Output<String> title) {
            $.title = title;
            return this;
        }

        /**
         * @param title The name of the namespace you wish to create.
         * 
         * @return builder
         * 
         */
        public Builder title(String title) {
            return title(Output.of(title));
        }

        public WorkersKvNamespaceState build() {
            return $;
        }
    }

}
