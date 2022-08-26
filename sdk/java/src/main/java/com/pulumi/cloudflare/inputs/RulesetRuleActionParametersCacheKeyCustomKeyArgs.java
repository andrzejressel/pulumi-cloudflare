// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.RulesetRuleActionParametersCacheKeyCustomKeyCookieArgs;
import com.pulumi.cloudflare.inputs.RulesetRuleActionParametersCacheKeyCustomKeyHeaderArgs;
import com.pulumi.cloudflare.inputs.RulesetRuleActionParametersCacheKeyCustomKeyHostArgs;
import com.pulumi.cloudflare.inputs.RulesetRuleActionParametersCacheKeyCustomKeyQueryStringArgs;
import com.pulumi.cloudflare.inputs.RulesetRuleActionParametersCacheKeyCustomKeyUserArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RulesetRuleActionParametersCacheKeyCustomKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final RulesetRuleActionParametersCacheKeyCustomKeyArgs Empty = new RulesetRuleActionParametersCacheKeyCustomKeyArgs();

    @Import(name="cookie")
    private @Nullable Output<RulesetRuleActionParametersCacheKeyCustomKeyCookieArgs> cookie;

    public Optional<Output<RulesetRuleActionParametersCacheKeyCustomKeyCookieArgs>> cookie() {
        return Optional.ofNullable(this.cookie);
    }

    @Import(name="header")
    private @Nullable Output<RulesetRuleActionParametersCacheKeyCustomKeyHeaderArgs> header;

    public Optional<Output<RulesetRuleActionParametersCacheKeyCustomKeyHeaderArgs>> header() {
        return Optional.ofNullable(this.header);
    }

    @Import(name="host")
    private @Nullable Output<RulesetRuleActionParametersCacheKeyCustomKeyHostArgs> host;

    public Optional<Output<RulesetRuleActionParametersCacheKeyCustomKeyHostArgs>> host() {
        return Optional.ofNullable(this.host);
    }

    @Import(name="queryString")
    private @Nullable Output<RulesetRuleActionParametersCacheKeyCustomKeyQueryStringArgs> queryString;

    public Optional<Output<RulesetRuleActionParametersCacheKeyCustomKeyQueryStringArgs>> queryString() {
        return Optional.ofNullable(this.queryString);
    }

    @Import(name="user")
    private @Nullable Output<RulesetRuleActionParametersCacheKeyCustomKeyUserArgs> user;

    public Optional<Output<RulesetRuleActionParametersCacheKeyCustomKeyUserArgs>> user() {
        return Optional.ofNullable(this.user);
    }

    private RulesetRuleActionParametersCacheKeyCustomKeyArgs() {}

    private RulesetRuleActionParametersCacheKeyCustomKeyArgs(RulesetRuleActionParametersCacheKeyCustomKeyArgs $) {
        this.cookie = $.cookie;
        this.header = $.header;
        this.host = $.host;
        this.queryString = $.queryString;
        this.user = $.user;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RulesetRuleActionParametersCacheKeyCustomKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RulesetRuleActionParametersCacheKeyCustomKeyArgs $;

        public Builder() {
            $ = new RulesetRuleActionParametersCacheKeyCustomKeyArgs();
        }

        public Builder(RulesetRuleActionParametersCacheKeyCustomKeyArgs defaults) {
            $ = new RulesetRuleActionParametersCacheKeyCustomKeyArgs(Objects.requireNonNull(defaults));
        }

        public Builder cookie(@Nullable Output<RulesetRuleActionParametersCacheKeyCustomKeyCookieArgs> cookie) {
            $.cookie = cookie;
            return this;
        }

        public Builder cookie(RulesetRuleActionParametersCacheKeyCustomKeyCookieArgs cookie) {
            return cookie(Output.of(cookie));
        }

        public Builder header(@Nullable Output<RulesetRuleActionParametersCacheKeyCustomKeyHeaderArgs> header) {
            $.header = header;
            return this;
        }

        public Builder header(RulesetRuleActionParametersCacheKeyCustomKeyHeaderArgs header) {
            return header(Output.of(header));
        }

        public Builder host(@Nullable Output<RulesetRuleActionParametersCacheKeyCustomKeyHostArgs> host) {
            $.host = host;
            return this;
        }

        public Builder host(RulesetRuleActionParametersCacheKeyCustomKeyHostArgs host) {
            return host(Output.of(host));
        }

        public Builder queryString(@Nullable Output<RulesetRuleActionParametersCacheKeyCustomKeyQueryStringArgs> queryString) {
            $.queryString = queryString;
            return this;
        }

        public Builder queryString(RulesetRuleActionParametersCacheKeyCustomKeyQueryStringArgs queryString) {
            return queryString(Output.of(queryString));
        }

        public Builder user(@Nullable Output<RulesetRuleActionParametersCacheKeyCustomKeyUserArgs> user) {
            $.user = user;
            return this;
        }

        public Builder user(RulesetRuleActionParametersCacheKeyCustomKeyUserArgs user) {
            return user(Output.of(user));
        }

        public RulesetRuleActionParametersCacheKeyCustomKeyArgs build() {
            return $;
        }
    }

}
