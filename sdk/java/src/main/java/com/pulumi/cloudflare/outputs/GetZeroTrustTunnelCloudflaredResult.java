// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetZeroTrustTunnelCloudflaredResult {
    /**
     * @return The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    private String accountId;
    /**
     * @return ID of the tunnel.
     * 
     */
    private String id;
    /**
     * @return If true, only include deleted tunnels. If false, exclude deleted tunnels. If empty, all tunnels will be included. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    private @Nullable Boolean isDeleted;
    /**
     * @return Name of the tunnel. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    private String name;
    /**
     * @return Whether the tunnel can be configured remotely from the Zero Trust dashboard.
     * 
     */
    private Boolean remoteConfig;
    /**
     * @return The status of the tunnel. Available values: `inactive`, `degraded`, `healthy`, `down`.
     * 
     */
    private String status;
    /**
     * @return The type of the tunnel. Available values: `cfd_tunnel`, `warp_connector`.
     * 
     */
    private String tunnelType;

    private GetZeroTrustTunnelCloudflaredResult() {}
    /**
     * @return The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public String accountId() {
        return this.accountId;
    }
    /**
     * @return ID of the tunnel.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return If true, only include deleted tunnels. If false, exclude deleted tunnels. If empty, all tunnels will be included. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Optional<Boolean> isDeleted() {
        return Optional.ofNullable(this.isDeleted);
    }
    /**
     * @return Name of the tunnel. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Whether the tunnel can be configured remotely from the Zero Trust dashboard.
     * 
     */
    public Boolean remoteConfig() {
        return this.remoteConfig;
    }
    /**
     * @return The status of the tunnel. Available values: `inactive`, `degraded`, `healthy`, `down`.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The type of the tunnel. Available values: `cfd_tunnel`, `warp_connector`.
     * 
     */
    public String tunnelType() {
        return this.tunnelType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetZeroTrustTunnelCloudflaredResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountId;
        private String id;
        private @Nullable Boolean isDeleted;
        private String name;
        private Boolean remoteConfig;
        private String status;
        private String tunnelType;
        public Builder() {}
        public Builder(GetZeroTrustTunnelCloudflaredResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.id = defaults.id;
    	      this.isDeleted = defaults.isDeleted;
    	      this.name = defaults.name;
    	      this.remoteConfig = defaults.remoteConfig;
    	      this.status = defaults.status;
    	      this.tunnelType = defaults.tunnelType;
        }

        @CustomType.Setter
        public Builder accountId(String accountId) {
            if (accountId == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustTunnelCloudflaredResult", "accountId");
            }
            this.accountId = accountId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustTunnelCloudflaredResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder isDeleted(@Nullable Boolean isDeleted) {

            this.isDeleted = isDeleted;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustTunnelCloudflaredResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder remoteConfig(Boolean remoteConfig) {
            if (remoteConfig == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustTunnelCloudflaredResult", "remoteConfig");
            }
            this.remoteConfig = remoteConfig;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustTunnelCloudflaredResult", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder tunnelType(String tunnelType) {
            if (tunnelType == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustTunnelCloudflaredResult", "tunnelType");
            }
            this.tunnelType = tunnelType;
            return this;
        }
        public GetZeroTrustTunnelCloudflaredResult build() {
            final var _resultValue = new GetZeroTrustTunnelCloudflaredResult();
            _resultValue.accountId = accountId;
            _resultValue.id = id;
            _resultValue.isDeleted = isDeleted;
            _resultValue.name = name;
            _resultValue.remoteConfig = remoteConfig;
            _resultValue.status = status;
            _resultValue.tunnelType = tunnelType;
            return _resultValue;
        }
    }
}
