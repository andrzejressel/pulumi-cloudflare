// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.AccessPolicyApprovalGroupArgs;
import com.pulumi.cloudflare.inputs.AccessPolicyExcludeArgs;
import com.pulumi.cloudflare.inputs.AccessPolicyIncludeArgs;
import com.pulumi.cloudflare.inputs.AccessPolicyRequireArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccessPolicyState extends com.pulumi.resources.ResourceArgs {

    public static final AccessPolicyState Empty = new AccessPolicyState();

    /**
     * The account identifier to target for the resource. Conflicts with `zone_id`.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return The account identifier to target for the resource. Conflicts with `zone_id`.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * The ID of the application the policy is associated with.
     * 
     */
    @Import(name="applicationId")
    private @Nullable Output<String> applicationId;

    /**
     * @return The ID of the application the policy is associated with.
     * 
     */
    public Optional<Output<String>> applicationId() {
        return Optional.ofNullable(this.applicationId);
    }

    @Import(name="approvalGroups")
    private @Nullable Output<List<AccessPolicyApprovalGroupArgs>> approvalGroups;

    public Optional<Output<List<AccessPolicyApprovalGroupArgs>>> approvalGroups() {
        return Optional.ofNullable(this.approvalGroups);
    }

    @Import(name="approvalRequired")
    private @Nullable Output<Boolean> approvalRequired;

    public Optional<Output<Boolean>> approvalRequired() {
        return Optional.ofNullable(this.approvalRequired);
    }

    /**
     * Defines the action Access will take if the policy matches the user. Available values: `allow`, `deny`, `non_identity`, `bypass`.
     * 
     */
    @Import(name="decision")
    private @Nullable Output<String> decision;

    /**
     * @return Defines the action Access will take if the policy matches the user. Available values: `allow`, `deny`, `non_identity`, `bypass`.
     * 
     */
    public Optional<Output<String>> decision() {
        return Optional.ofNullable(this.decision);
    }

    /**
     * A series of access conditions, see [Access
     * Groups](https://registry.terraform.io/providers/cloudflare/cloudflare/latest/docs/resources/access_group#conditions).
     * 
     */
    @Import(name="excludes")
    private @Nullable Output<List<AccessPolicyExcludeArgs>> excludes;

    /**
     * @return A series of access conditions, see [Access
     * Groups](https://registry.terraform.io/providers/cloudflare/cloudflare/latest/docs/resources/access_group#conditions).
     * 
     */
    public Optional<Output<List<AccessPolicyExcludeArgs>>> excludes() {
        return Optional.ofNullable(this.excludes);
    }

    /**
     * A series of access conditions, see [Access
     * Groups](https://registry.terraform.io/providers/cloudflare/cloudflare/latest/docs/resources/access_group#conditions).
     * 
     */
    @Import(name="includes")
    private @Nullable Output<List<AccessPolicyIncludeArgs>> includes;

    /**
     * @return A series of access conditions, see [Access
     * Groups](https://registry.terraform.io/providers/cloudflare/cloudflare/latest/docs/resources/access_group#conditions).
     * 
     */
    public Optional<Output<List<AccessPolicyIncludeArgs>>> includes() {
        return Optional.ofNullable(this.includes);
    }

    /**
     * Friendly name of the Access Policy.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Friendly name of the Access Policy.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The unique precedence for policies on a single application.
     * 
     */
    @Import(name="precedence")
    private @Nullable Output<Integer> precedence;

    /**
     * @return The unique precedence for policies on a single application.
     * 
     */
    public Optional<Output<Integer>> precedence() {
        return Optional.ofNullable(this.precedence);
    }

    /**
     * The prompt to display to the user for a justification for accessing the resource.
     * 
     */
    @Import(name="purposeJustificationPrompt")
    private @Nullable Output<String> purposeJustificationPrompt;

    /**
     * @return The prompt to display to the user for a justification for accessing the resource.
     * 
     */
    public Optional<Output<String>> purposeJustificationPrompt() {
        return Optional.ofNullable(this.purposeJustificationPrompt);
    }

    /**
     * Whether to prompt the user for a justification for accessing the resource.
     * 
     */
    @Import(name="purposeJustificationRequired")
    private @Nullable Output<Boolean> purposeJustificationRequired;

    /**
     * @return Whether to prompt the user for a justification for accessing the resource.
     * 
     */
    public Optional<Output<Boolean>> purposeJustificationRequired() {
        return Optional.ofNullable(this.purposeJustificationRequired);
    }

    /**
     * A series of access conditions, see [Access
     * Groups](https://registry.terraform.io/providers/cloudflare/cloudflare/latest/docs/resources/access_group#conditions).
     * 
     */
    @Import(name="requires")
    private @Nullable Output<List<AccessPolicyRequireArgs>> requires;

    /**
     * @return A series of access conditions, see [Access
     * Groups](https://registry.terraform.io/providers/cloudflare/cloudflare/latest/docs/resources/access_group#conditions).
     * 
     */
    public Optional<Output<List<AccessPolicyRequireArgs>>> requires() {
        return Optional.ofNullable(this.requires);
    }

    /**
     * The zone identifier to target for the resource. Conflicts with `account_id`.
     * 
     */
    @Import(name="zoneId")
    private @Nullable Output<String> zoneId;

    /**
     * @return The zone identifier to target for the resource. Conflicts with `account_id`.
     * 
     */
    public Optional<Output<String>> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    private AccessPolicyState() {}

    private AccessPolicyState(AccessPolicyState $) {
        this.accountId = $.accountId;
        this.applicationId = $.applicationId;
        this.approvalGroups = $.approvalGroups;
        this.approvalRequired = $.approvalRequired;
        this.decision = $.decision;
        this.excludes = $.excludes;
        this.includes = $.includes;
        this.name = $.name;
        this.precedence = $.precedence;
        this.purposeJustificationPrompt = $.purposeJustificationPrompt;
        this.purposeJustificationRequired = $.purposeJustificationRequired;
        this.requires = $.requires;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessPolicyState $;

        public Builder() {
            $ = new AccessPolicyState();
        }

        public Builder(AccessPolicyState defaults) {
            $ = new AccessPolicyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account identifier to target for the resource. Conflicts with `zone_id`.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The account identifier to target for the resource. Conflicts with `zone_id`.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param applicationId The ID of the application the policy is associated with.
         * 
         * @return builder
         * 
         */
        public Builder applicationId(@Nullable Output<String> applicationId) {
            $.applicationId = applicationId;
            return this;
        }

        /**
         * @param applicationId The ID of the application the policy is associated with.
         * 
         * @return builder
         * 
         */
        public Builder applicationId(String applicationId) {
            return applicationId(Output.of(applicationId));
        }

        public Builder approvalGroups(@Nullable Output<List<AccessPolicyApprovalGroupArgs>> approvalGroups) {
            $.approvalGroups = approvalGroups;
            return this;
        }

        public Builder approvalGroups(List<AccessPolicyApprovalGroupArgs> approvalGroups) {
            return approvalGroups(Output.of(approvalGroups));
        }

        public Builder approvalGroups(AccessPolicyApprovalGroupArgs... approvalGroups) {
            return approvalGroups(List.of(approvalGroups));
        }

        public Builder approvalRequired(@Nullable Output<Boolean> approvalRequired) {
            $.approvalRequired = approvalRequired;
            return this;
        }

        public Builder approvalRequired(Boolean approvalRequired) {
            return approvalRequired(Output.of(approvalRequired));
        }

        /**
         * @param decision Defines the action Access will take if the policy matches the user. Available values: `allow`, `deny`, `non_identity`, `bypass`.
         * 
         * @return builder
         * 
         */
        public Builder decision(@Nullable Output<String> decision) {
            $.decision = decision;
            return this;
        }

        /**
         * @param decision Defines the action Access will take if the policy matches the user. Available values: `allow`, `deny`, `non_identity`, `bypass`.
         * 
         * @return builder
         * 
         */
        public Builder decision(String decision) {
            return decision(Output.of(decision));
        }

        /**
         * @param excludes A series of access conditions, see [Access
         * Groups](https://registry.terraform.io/providers/cloudflare/cloudflare/latest/docs/resources/access_group#conditions).
         * 
         * @return builder
         * 
         */
        public Builder excludes(@Nullable Output<List<AccessPolicyExcludeArgs>> excludes) {
            $.excludes = excludes;
            return this;
        }

        /**
         * @param excludes A series of access conditions, see [Access
         * Groups](https://registry.terraform.io/providers/cloudflare/cloudflare/latest/docs/resources/access_group#conditions).
         * 
         * @return builder
         * 
         */
        public Builder excludes(List<AccessPolicyExcludeArgs> excludes) {
            return excludes(Output.of(excludes));
        }

        /**
         * @param excludes A series of access conditions, see [Access
         * Groups](https://registry.terraform.io/providers/cloudflare/cloudflare/latest/docs/resources/access_group#conditions).
         * 
         * @return builder
         * 
         */
        public Builder excludes(AccessPolicyExcludeArgs... excludes) {
            return excludes(List.of(excludes));
        }

        /**
         * @param includes A series of access conditions, see [Access
         * Groups](https://registry.terraform.io/providers/cloudflare/cloudflare/latest/docs/resources/access_group#conditions).
         * 
         * @return builder
         * 
         */
        public Builder includes(@Nullable Output<List<AccessPolicyIncludeArgs>> includes) {
            $.includes = includes;
            return this;
        }

        /**
         * @param includes A series of access conditions, see [Access
         * Groups](https://registry.terraform.io/providers/cloudflare/cloudflare/latest/docs/resources/access_group#conditions).
         * 
         * @return builder
         * 
         */
        public Builder includes(List<AccessPolicyIncludeArgs> includes) {
            return includes(Output.of(includes));
        }

        /**
         * @param includes A series of access conditions, see [Access
         * Groups](https://registry.terraform.io/providers/cloudflare/cloudflare/latest/docs/resources/access_group#conditions).
         * 
         * @return builder
         * 
         */
        public Builder includes(AccessPolicyIncludeArgs... includes) {
            return includes(List.of(includes));
        }

        /**
         * @param name Friendly name of the Access Policy.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Friendly name of the Access Policy.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param precedence The unique precedence for policies on a single application.
         * 
         * @return builder
         * 
         */
        public Builder precedence(@Nullable Output<Integer> precedence) {
            $.precedence = precedence;
            return this;
        }

        /**
         * @param precedence The unique precedence for policies on a single application.
         * 
         * @return builder
         * 
         */
        public Builder precedence(Integer precedence) {
            return precedence(Output.of(precedence));
        }

        /**
         * @param purposeJustificationPrompt The prompt to display to the user for a justification for accessing the resource.
         * 
         * @return builder
         * 
         */
        public Builder purposeJustificationPrompt(@Nullable Output<String> purposeJustificationPrompt) {
            $.purposeJustificationPrompt = purposeJustificationPrompt;
            return this;
        }

        /**
         * @param purposeJustificationPrompt The prompt to display to the user for a justification for accessing the resource.
         * 
         * @return builder
         * 
         */
        public Builder purposeJustificationPrompt(String purposeJustificationPrompt) {
            return purposeJustificationPrompt(Output.of(purposeJustificationPrompt));
        }

        /**
         * @param purposeJustificationRequired Whether to prompt the user for a justification for accessing the resource.
         * 
         * @return builder
         * 
         */
        public Builder purposeJustificationRequired(@Nullable Output<Boolean> purposeJustificationRequired) {
            $.purposeJustificationRequired = purposeJustificationRequired;
            return this;
        }

        /**
         * @param purposeJustificationRequired Whether to prompt the user for a justification for accessing the resource.
         * 
         * @return builder
         * 
         */
        public Builder purposeJustificationRequired(Boolean purposeJustificationRequired) {
            return purposeJustificationRequired(Output.of(purposeJustificationRequired));
        }

        /**
         * @param requires A series of access conditions, see [Access
         * Groups](https://registry.terraform.io/providers/cloudflare/cloudflare/latest/docs/resources/access_group#conditions).
         * 
         * @return builder
         * 
         */
        public Builder requires(@Nullable Output<List<AccessPolicyRequireArgs>> requires) {
            $.requires = requires;
            return this;
        }

        /**
         * @param requires A series of access conditions, see [Access
         * Groups](https://registry.terraform.io/providers/cloudflare/cloudflare/latest/docs/resources/access_group#conditions).
         * 
         * @return builder
         * 
         */
        public Builder requires(List<AccessPolicyRequireArgs> requires) {
            return requires(Output.of(requires));
        }

        /**
         * @param requires A series of access conditions, see [Access
         * Groups](https://registry.terraform.io/providers/cloudflare/cloudflare/latest/docs/resources/access_group#conditions).
         * 
         * @return builder
         * 
         */
        public Builder requires(AccessPolicyRequireArgs... requires) {
            return requires(List.of(requires));
        }

        /**
         * @param zoneId The zone identifier to target for the resource. Conflicts with `account_id`.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(@Nullable Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The zone identifier to target for the resource. Conflicts with `account_id`.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public AccessPolicyState build() {
            return $;
        }
    }

}
