// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MagicFirewallRulesetState extends com.pulumi.resources.ResourceArgs {

    public static final MagicFirewallRulesetState Empty = new MagicFirewallRulesetState();

    /**
     * The ID of the account where the ruleset is being created.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return The ID of the account where the ruleset is being created.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * A note that can be used to annotate the rule.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A note that can be used to annotate the rule.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The name of the ruleset.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the ruleset.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="rules")
    private @Nullable Output<List<Map<String,String>>> rules;

    public Optional<Output<List<Map<String,String>>>> rules() {
        return Optional.ofNullable(this.rules);
    }

    private MagicFirewallRulesetState() {}

    private MagicFirewallRulesetState(MagicFirewallRulesetState $) {
        this.accountId = $.accountId;
        this.description = $.description;
        this.name = $.name;
        this.rules = $.rules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MagicFirewallRulesetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MagicFirewallRulesetState $;

        public Builder() {
            $ = new MagicFirewallRulesetState();
        }

        public Builder(MagicFirewallRulesetState defaults) {
            $ = new MagicFirewallRulesetState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The ID of the account where the ruleset is being created.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The ID of the account where the ruleset is being created.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param description A note that can be used to annotate the rule.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A note that can be used to annotate the rule.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name The name of the ruleset.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the ruleset.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder rules(@Nullable Output<List<Map<String,String>>> rules) {
            $.rules = rules;
            return this;
        }

        public Builder rules(List<Map<String,String>> rules) {
            return rules(Output.of(rules));
        }

        public Builder rules(Map<String,String>... rules) {
            return rules(List.of(rules));
        }

        public MagicFirewallRulesetState build() {
            return $;
        }
    }

}
