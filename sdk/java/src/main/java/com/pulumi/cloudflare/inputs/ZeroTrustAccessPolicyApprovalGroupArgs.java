// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ZeroTrustAccessPolicyApprovalGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final ZeroTrustAccessPolicyApprovalGroupArgs Empty = new ZeroTrustAccessPolicyApprovalGroupArgs();

    /**
     * Number of approvals needed.
     * 
     */
    @Import(name="approvalsNeeded", required=true)
    private Output<Integer> approvalsNeeded;

    /**
     * @return Number of approvals needed.
     * 
     */
    public Output<Integer> approvalsNeeded() {
        return this.approvalsNeeded;
    }

    /**
     * List of emails to request approval from.
     * 
     */
    @Import(name="emailAddresses")
    private @Nullable Output<List<String>> emailAddresses;

    /**
     * @return List of emails to request approval from.
     * 
     */
    public Optional<Output<List<String>>> emailAddresses() {
        return Optional.ofNullable(this.emailAddresses);
    }

    @Import(name="emailListUuid")
    private @Nullable Output<String> emailListUuid;

    public Optional<Output<String>> emailListUuid() {
        return Optional.ofNullable(this.emailListUuid);
    }

    private ZeroTrustAccessPolicyApprovalGroupArgs() {}

    private ZeroTrustAccessPolicyApprovalGroupArgs(ZeroTrustAccessPolicyApprovalGroupArgs $) {
        this.approvalsNeeded = $.approvalsNeeded;
        this.emailAddresses = $.emailAddresses;
        this.emailListUuid = $.emailListUuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZeroTrustAccessPolicyApprovalGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZeroTrustAccessPolicyApprovalGroupArgs $;

        public Builder() {
            $ = new ZeroTrustAccessPolicyApprovalGroupArgs();
        }

        public Builder(ZeroTrustAccessPolicyApprovalGroupArgs defaults) {
            $ = new ZeroTrustAccessPolicyApprovalGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param approvalsNeeded Number of approvals needed.
         * 
         * @return builder
         * 
         */
        public Builder approvalsNeeded(Output<Integer> approvalsNeeded) {
            $.approvalsNeeded = approvalsNeeded;
            return this;
        }

        /**
         * @param approvalsNeeded Number of approvals needed.
         * 
         * @return builder
         * 
         */
        public Builder approvalsNeeded(Integer approvalsNeeded) {
            return approvalsNeeded(Output.of(approvalsNeeded));
        }

        /**
         * @param emailAddresses List of emails to request approval from.
         * 
         * @return builder
         * 
         */
        public Builder emailAddresses(@Nullable Output<List<String>> emailAddresses) {
            $.emailAddresses = emailAddresses;
            return this;
        }

        /**
         * @param emailAddresses List of emails to request approval from.
         * 
         * @return builder
         * 
         */
        public Builder emailAddresses(List<String> emailAddresses) {
            return emailAddresses(Output.of(emailAddresses));
        }

        /**
         * @param emailAddresses List of emails to request approval from.
         * 
         * @return builder
         * 
         */
        public Builder emailAddresses(String... emailAddresses) {
            return emailAddresses(List.of(emailAddresses));
        }

        public Builder emailListUuid(@Nullable Output<String> emailListUuid) {
            $.emailListUuid = emailListUuid;
            return this;
        }

        public Builder emailListUuid(String emailListUuid) {
            return emailListUuid(Output.of(emailListUuid));
        }

        public ZeroTrustAccessPolicyApprovalGroupArgs build() {
            if ($.approvalsNeeded == null) {
                throw new MissingRequiredPropertyException("ZeroTrustAccessPolicyApprovalGroupArgs", "approvalsNeeded");
            }
            return $;
        }
    }

}