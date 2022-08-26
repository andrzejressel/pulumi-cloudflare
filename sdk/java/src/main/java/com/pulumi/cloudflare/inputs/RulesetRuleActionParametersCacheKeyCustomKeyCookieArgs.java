// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RulesetRuleActionParametersCacheKeyCustomKeyCookieArgs extends com.pulumi.resources.ResourceArgs {

    public static final RulesetRuleActionParametersCacheKeyCustomKeyCookieArgs Empty = new RulesetRuleActionParametersCacheKeyCustomKeyCookieArgs();

    @Import(name="checkPresences")
    private @Nullable Output<List<String>> checkPresences;

    public Optional<Output<List<String>>> checkPresences() {
        return Optional.ofNullable(this.checkPresences);
    }

    @Import(name="includes")
    private @Nullable Output<List<String>> includes;

    public Optional<Output<List<String>>> includes() {
        return Optional.ofNullable(this.includes);
    }

    private RulesetRuleActionParametersCacheKeyCustomKeyCookieArgs() {}

    private RulesetRuleActionParametersCacheKeyCustomKeyCookieArgs(RulesetRuleActionParametersCacheKeyCustomKeyCookieArgs $) {
        this.checkPresences = $.checkPresences;
        this.includes = $.includes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RulesetRuleActionParametersCacheKeyCustomKeyCookieArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RulesetRuleActionParametersCacheKeyCustomKeyCookieArgs $;

        public Builder() {
            $ = new RulesetRuleActionParametersCacheKeyCustomKeyCookieArgs();
        }

        public Builder(RulesetRuleActionParametersCacheKeyCustomKeyCookieArgs defaults) {
            $ = new RulesetRuleActionParametersCacheKeyCustomKeyCookieArgs(Objects.requireNonNull(defaults));
        }

        public Builder checkPresences(@Nullable Output<List<String>> checkPresences) {
            $.checkPresences = checkPresences;
            return this;
        }

        public Builder checkPresences(List<String> checkPresences) {
            return checkPresences(Output.of(checkPresences));
        }

        public Builder checkPresences(String... checkPresences) {
            return checkPresences(List.of(checkPresences));
        }

        public Builder includes(@Nullable Output<List<String>> includes) {
            $.includes = includes;
            return this;
        }

        public Builder includes(List<String> includes) {
            return includes(Output.of(includes));
        }

        public Builder includes(String... includes) {
            return includes(List.of(includes));
        }

        public RulesetRuleActionParametersCacheKeyCustomKeyCookieArgs build() {
            return $;
        }
    }

}
