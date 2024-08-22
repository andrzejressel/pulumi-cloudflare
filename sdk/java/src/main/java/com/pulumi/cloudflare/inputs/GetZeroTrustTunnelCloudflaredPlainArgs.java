// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetZeroTrustTunnelCloudflaredPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetZeroTrustTunnelCloudflaredPlainArgs Empty = new GetZeroTrustTunnelCloudflaredPlainArgs();

    /**
     * The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Import(name="accountId", required=true)
    private String accountId;

    /**
     * @return The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public String accountId() {
        return this.accountId;
    }

    /**
     * If true, only include deleted tunnels. If false, exclude deleted tunnels. If empty, all tunnels will be included. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Import(name="isDeleted")
    private @Nullable Boolean isDeleted;

    /**
     * @return If true, only include deleted tunnels. If false, exclude deleted tunnels. If empty, all tunnels will be included. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Optional<Boolean> isDeleted() {
        return Optional.ofNullable(this.isDeleted);
    }

    /**
     * Name of the tunnel. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Name of the tunnel. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public String name() {
        return this.name;
    }

    private GetZeroTrustTunnelCloudflaredPlainArgs() {}

    private GetZeroTrustTunnelCloudflaredPlainArgs(GetZeroTrustTunnelCloudflaredPlainArgs $) {
        this.accountId = $.accountId;
        this.isDeleted = $.isDeleted;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetZeroTrustTunnelCloudflaredPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetZeroTrustTunnelCloudflaredPlainArgs $;

        public Builder() {
            $ = new GetZeroTrustTunnelCloudflaredPlainArgs();
        }

        public Builder(GetZeroTrustTunnelCloudflaredPlainArgs defaults) {
            $ = new GetZeroTrustTunnelCloudflaredPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param isDeleted If true, only include deleted tunnels. If false, exclude deleted tunnels. If empty, all tunnels will be included. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder isDeleted(@Nullable Boolean isDeleted) {
            $.isDeleted = isDeleted;
            return this;
        }

        /**
         * @param name Name of the tunnel. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetZeroTrustTunnelCloudflaredPlainArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("GetZeroTrustTunnelCloudflaredPlainArgs", "accountId");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetZeroTrustTunnelCloudflaredPlainArgs", "name");
            }
            return $;
        }
    }

}
