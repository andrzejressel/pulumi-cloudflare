// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAccountsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAccountsPlainArgs Empty = new GetAccountsPlainArgs();

    /**
     * The account name to target for the resource.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return The account name to target for the resource.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    private GetAccountsPlainArgs() {}

    private GetAccountsPlainArgs(GetAccountsPlainArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAccountsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAccountsPlainArgs $;

        public Builder() {
            $ = new GetAccountsPlainArgs();
        }

        public Builder(GetAccountsPlainArgs defaults) {
            $ = new GetAccountsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The account name to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public GetAccountsPlainArgs build() {
            return $;
        }
    }

}
