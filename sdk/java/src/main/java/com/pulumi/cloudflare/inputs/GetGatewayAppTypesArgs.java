// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetGatewayAppTypesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGatewayAppTypesArgs Empty = new GetGatewayAppTypesArgs();

    /**
     * The account ID to fetch Gateway App Types from.
     * 
     */
    @Import(name="accountId", required=true)
    private Output<String> accountId;

    /**
     * @return The account ID to fetch Gateway App Types from.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }

    private GetGatewayAppTypesArgs() {}

    private GetGatewayAppTypesArgs(GetGatewayAppTypesArgs $) {
        this.accountId = $.accountId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGatewayAppTypesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGatewayAppTypesArgs $;

        public Builder() {
            $ = new GetGatewayAppTypesArgs();
        }

        public Builder(GetGatewayAppTypesArgs defaults) {
            $ = new GetGatewayAppTypesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account ID to fetch Gateway App Types from.
         * 
         * @return builder
         * 
         */
        public Builder accountId(Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The account ID to fetch Gateway App Types from.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        public GetGatewayAppTypesArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("GetGatewayAppTypesArgs", "accountId");
            }
            return $;
        }
    }

}