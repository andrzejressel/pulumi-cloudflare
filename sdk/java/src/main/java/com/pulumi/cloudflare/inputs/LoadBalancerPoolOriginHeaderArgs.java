// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class LoadBalancerPoolOriginHeaderArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoadBalancerPoolOriginHeaderArgs Empty = new LoadBalancerPoolOriginHeaderArgs();

    /**
     * HTTP Header name.
     * 
     */
    @Import(name="header", required=true)
    private Output<String> header;

    /**
     * @return HTTP Header name.
     * 
     */
    public Output<String> header() {
        return this.header;
    }

    /**
     * Values for the HTTP headers.
     * 
     */
    @Import(name="values", required=true)
    private Output<List<String>> values;

    /**
     * @return Values for the HTTP headers.
     * 
     */
    public Output<List<String>> values() {
        return this.values;
    }

    private LoadBalancerPoolOriginHeaderArgs() {}

    private LoadBalancerPoolOriginHeaderArgs(LoadBalancerPoolOriginHeaderArgs $) {
        this.header = $.header;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadBalancerPoolOriginHeaderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadBalancerPoolOriginHeaderArgs $;

        public Builder() {
            $ = new LoadBalancerPoolOriginHeaderArgs();
        }

        public Builder(LoadBalancerPoolOriginHeaderArgs defaults) {
            $ = new LoadBalancerPoolOriginHeaderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param header HTTP Header name.
         * 
         * @return builder
         * 
         */
        public Builder header(Output<String> header) {
            $.header = header;
            return this;
        }

        /**
         * @param header HTTP Header name.
         * 
         * @return builder
         * 
         */
        public Builder header(String header) {
            return header(Output.of(header));
        }

        /**
         * @param values Values for the HTTP headers.
         * 
         * @return builder
         * 
         */
        public Builder values(Output<List<String>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values Values for the HTTP headers.
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        /**
         * @param values Values for the HTTP headers.
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public LoadBalancerPoolOriginHeaderArgs build() {
            if ($.header == null) {
                throw new MissingRequiredPropertyException("LoadBalancerPoolOriginHeaderArgs", "header");
            }
            if ($.values == null) {
                throw new MissingRequiredPropertyException("LoadBalancerPoolOriginHeaderArgs", "values");
            }
            return $;
        }
    }

}
