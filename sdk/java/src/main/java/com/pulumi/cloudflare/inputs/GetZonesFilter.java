// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetZonesFilter extends com.pulumi.resources.InvokeArgs {

    public static final GetZonesFilter Empty = new GetZonesFilter();

    /**
     * The account identifier to target for the resource.
     * 
     */
    @Import(name="accountId")
    private @Nullable String accountId;

    /**
     * @return The account identifier to target for the resource.
     * 
     */
    public Optional<String> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * Defaults to `exact`.
     * 
     */
    @Import(name="lookupType")
    private @Nullable String lookupType;

    /**
     * @return Defaults to `exact`.
     * 
     */
    public Optional<String> lookupType() {
        return Optional.ofNullable(this.lookupType);
    }

    @Import(name="match")
    private @Nullable String match;

    public Optional<String> match() {
        return Optional.ofNullable(this.match);
    }

    @Import(name="name")
    private @Nullable String name;

    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Defaults to `false`.
     * 
     */
    @Import(name="paused")
    private @Nullable Boolean paused;

    /**
     * @return Defaults to `false`.
     * 
     */
    public Optional<Boolean> paused() {
        return Optional.ofNullable(this.paused);
    }

    @Import(name="status")
    private @Nullable String status;

    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    private GetZonesFilter() {}

    private GetZonesFilter(GetZonesFilter $) {
        this.accountId = $.accountId;
        this.lookupType = $.lookupType;
        this.match = $.match;
        this.name = $.name;
        this.paused = $.paused;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetZonesFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetZonesFilter $;

        public Builder() {
            $ = new GetZonesFilter();
        }

        public Builder(GetZonesFilter defaults) {
            $ = new GetZonesFilter(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable String accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param lookupType Defaults to `exact`.
         * 
         * @return builder
         * 
         */
        public Builder lookupType(@Nullable String lookupType) {
            $.lookupType = lookupType;
            return this;
        }

        public Builder match(@Nullable String match) {
            $.match = match;
            return this;
        }

        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param paused Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder paused(@Nullable Boolean paused) {
            $.paused = paused;
            return this;
        }

        public Builder status(@Nullable String status) {
            $.status = status;
            return this;
        }

        public GetZonesFilter build() {
            return $;
        }
    }

}
