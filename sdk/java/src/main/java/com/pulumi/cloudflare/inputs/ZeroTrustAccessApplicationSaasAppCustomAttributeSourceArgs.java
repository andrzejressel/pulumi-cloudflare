// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ZeroTrustAccessApplicationSaasAppCustomAttributeSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ZeroTrustAccessApplicationSaasAppCustomAttributeSourceArgs Empty = new ZeroTrustAccessApplicationSaasAppCustomAttributeSourceArgs();

    /**
     * The name of the attribute as provided by the IDP.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the attribute as provided by the IDP.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * A mapping from IdP ID to claim name.
     * 
     */
    @Import(name="nameByIdp")
    private @Nullable Output<Map<String,String>> nameByIdp;

    /**
     * @return A mapping from IdP ID to claim name.
     * 
     */
    public Optional<Output<Map<String,String>>> nameByIdp() {
        return Optional.ofNullable(this.nameByIdp);
    }

    private ZeroTrustAccessApplicationSaasAppCustomAttributeSourceArgs() {}

    private ZeroTrustAccessApplicationSaasAppCustomAttributeSourceArgs(ZeroTrustAccessApplicationSaasAppCustomAttributeSourceArgs $) {
        this.name = $.name;
        this.nameByIdp = $.nameByIdp;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZeroTrustAccessApplicationSaasAppCustomAttributeSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZeroTrustAccessApplicationSaasAppCustomAttributeSourceArgs $;

        public Builder() {
            $ = new ZeroTrustAccessApplicationSaasAppCustomAttributeSourceArgs();
        }

        public Builder(ZeroTrustAccessApplicationSaasAppCustomAttributeSourceArgs defaults) {
            $ = new ZeroTrustAccessApplicationSaasAppCustomAttributeSourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the attribute as provided by the IDP.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the attribute as provided by the IDP.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param nameByIdp A mapping from IdP ID to claim name.
         * 
         * @return builder
         * 
         */
        public Builder nameByIdp(@Nullable Output<Map<String,String>> nameByIdp) {
            $.nameByIdp = nameByIdp;
            return this;
        }

        /**
         * @param nameByIdp A mapping from IdP ID to claim name.
         * 
         * @return builder
         * 
         */
        public Builder nameByIdp(Map<String,String> nameByIdp) {
            return nameByIdp(Output.of(nameByIdp));
        }

        public ZeroTrustAccessApplicationSaasAppCustomAttributeSourceArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("ZeroTrustAccessApplicationSaasAppCustomAttributeSourceArgs", "name");
            }
            return $;
        }
    }

}
