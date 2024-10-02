// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class WorkersScriptHyperdriveConfigBindingArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkersScriptHyperdriveConfigBindingArgs Empty = new WorkersScriptHyperdriveConfigBindingArgs();

    /**
     * The global variable for the binding in your Worker code.
     * 
     */
    @Import(name="binding", required=true)
    private Output<String> binding;

    /**
     * @return The global variable for the binding in your Worker code.
     * 
     */
    public Output<String> binding() {
        return this.binding;
    }

    /**
     * The ID of the Hyperdrive config to use.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The ID of the Hyperdrive config to use.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    private WorkersScriptHyperdriveConfigBindingArgs() {}

    private WorkersScriptHyperdriveConfigBindingArgs(WorkersScriptHyperdriveConfigBindingArgs $) {
        this.binding = $.binding;
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkersScriptHyperdriveConfigBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkersScriptHyperdriveConfigBindingArgs $;

        public Builder() {
            $ = new WorkersScriptHyperdriveConfigBindingArgs();
        }

        public Builder(WorkersScriptHyperdriveConfigBindingArgs defaults) {
            $ = new WorkersScriptHyperdriveConfigBindingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param binding The global variable for the binding in your Worker code.
         * 
         * @return builder
         * 
         */
        public Builder binding(Output<String> binding) {
            $.binding = binding;
            return this;
        }

        /**
         * @param binding The global variable for the binding in your Worker code.
         * 
         * @return builder
         * 
         */
        public Builder binding(String binding) {
            return binding(Output.of(binding));
        }

        /**
         * @param id The ID of the Hyperdrive config to use.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the Hyperdrive config to use.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public WorkersScriptHyperdriveConfigBindingArgs build() {
            if ($.binding == null) {
                throw new MissingRequiredPropertyException("WorkersScriptHyperdriveConfigBindingArgs", "binding");
            }
            if ($.id == null) {
                throw new MissingRequiredPropertyException("WorkersScriptHyperdriveConfigBindingArgs", "id");
            }
            return $;
        }
    }

}