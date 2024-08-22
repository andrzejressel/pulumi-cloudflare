// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ZeroTrustDexTestDataArgs extends com.pulumi.resources.ResourceArgs {

    public static final ZeroTrustDexTestDataArgs Empty = new ZeroTrustDexTestDataArgs();

    /**
     * The host URL for `http` test `kind`. For `traceroute`, it must be a valid hostname or IP address.
     * 
     */
    @Import(name="host", required=true)
    private Output<String> host;

    /**
     * @return The host URL for `http` test `kind`. For `traceroute`, it must be a valid hostname or IP address.
     * 
     */
    public Output<String> host() {
        return this.host;
    }

    /**
     * The type of Device Dex Test. Available values: `http`, `traceroute`.
     * 
     */
    @Import(name="kind", required=true)
    private Output<String> kind;

    /**
     * @return The type of Device Dex Test. Available values: `http`, `traceroute`.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }

    /**
     * The http request method. Available values: `GET`.
     * 
     */
    @Import(name="method")
    private @Nullable Output<String> method;

    /**
     * @return The http request method. Available values: `GET`.
     * 
     */
    public Optional<Output<String>> method() {
        return Optional.ofNullable(this.method);
    }

    private ZeroTrustDexTestDataArgs() {}

    private ZeroTrustDexTestDataArgs(ZeroTrustDexTestDataArgs $) {
        this.host = $.host;
        this.kind = $.kind;
        this.method = $.method;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZeroTrustDexTestDataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZeroTrustDexTestDataArgs $;

        public Builder() {
            $ = new ZeroTrustDexTestDataArgs();
        }

        public Builder(ZeroTrustDexTestDataArgs defaults) {
            $ = new ZeroTrustDexTestDataArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param host The host URL for `http` test `kind`. For `traceroute`, it must be a valid hostname or IP address.
         * 
         * @return builder
         * 
         */
        public Builder host(Output<String> host) {
            $.host = host;
            return this;
        }

        /**
         * @param host The host URL for `http` test `kind`. For `traceroute`, it must be a valid hostname or IP address.
         * 
         * @return builder
         * 
         */
        public Builder host(String host) {
            return host(Output.of(host));
        }

        /**
         * @param kind The type of Device Dex Test. Available values: `http`, `traceroute`.
         * 
         * @return builder
         * 
         */
        public Builder kind(Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind The type of Device Dex Test. Available values: `http`, `traceroute`.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param method The http request method. Available values: `GET`.
         * 
         * @return builder
         * 
         */
        public Builder method(@Nullable Output<String> method) {
            $.method = method;
            return this;
        }

        /**
         * @param method The http request method. Available values: `GET`.
         * 
         * @return builder
         * 
         */
        public Builder method(String method) {
            return method(Output.of(method));
        }

        public ZeroTrustDexTestDataArgs build() {
            if ($.host == null) {
                throw new MissingRequiredPropertyException("ZeroTrustDexTestDataArgs", "host");
            }
            if ($.kind == null) {
                throw new MissingRequiredPropertyException("ZeroTrustDexTestDataArgs", "kind");
            }
            return $;
        }
    }

}
