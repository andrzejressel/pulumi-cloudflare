// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class RulesetRuleActionParametersFromListArgs extends com.pulumi.resources.ResourceArgs {

    public static final RulesetRuleActionParametersFromListArgs Empty = new RulesetRuleActionParametersFromListArgs();

    @Import(name="key", required=true)
    private Output<String> key;

    public Output<String> key() {
        return this.key;
    }

    /**
     * Name of the ruleset. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the ruleset. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private RulesetRuleActionParametersFromListArgs() {}

    private RulesetRuleActionParametersFromListArgs(RulesetRuleActionParametersFromListArgs $) {
        this.key = $.key;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RulesetRuleActionParametersFromListArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RulesetRuleActionParametersFromListArgs $;

        public Builder() {
            $ = new RulesetRuleActionParametersFromListArgs();
        }

        public Builder(RulesetRuleActionParametersFromListArgs defaults) {
            $ = new RulesetRuleActionParametersFromListArgs(Objects.requireNonNull(defaults));
        }

        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param name Name of the ruleset. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the ruleset. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public RulesetRuleActionParametersFromListArgs build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}