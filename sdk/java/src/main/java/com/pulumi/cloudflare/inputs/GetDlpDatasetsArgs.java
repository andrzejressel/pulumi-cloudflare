// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetDlpDatasetsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDlpDatasetsArgs Empty = new GetDlpDatasetsArgs();

    /**
     * The account ID to fetch DLP Datasets from.
     * 
     */
    @Import(name="accountId", required=true)
    private Output<String> accountId;

    /**
     * @return The account ID to fetch DLP Datasets from.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }

    private GetDlpDatasetsArgs() {}

    private GetDlpDatasetsArgs(GetDlpDatasetsArgs $) {
        this.accountId = $.accountId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDlpDatasetsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDlpDatasetsArgs $;

        public Builder() {
            $ = new GetDlpDatasetsArgs();
        }

        public Builder(GetDlpDatasetsArgs defaults) {
            $ = new GetDlpDatasetsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account ID to fetch DLP Datasets from.
         * 
         * @return builder
         * 
         */
        public Builder accountId(Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The account ID to fetch DLP Datasets from.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        public GetDlpDatasetsArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("GetDlpDatasetsArgs", "accountId");
            }
            return $;
        }
    }

}