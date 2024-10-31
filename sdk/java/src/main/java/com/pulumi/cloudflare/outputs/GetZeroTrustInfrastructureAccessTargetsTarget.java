// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.GetZeroTrustInfrastructureAccessTargetsTargetIp;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetZeroTrustInfrastructureAccessTargetsTarget {
    /**
     * @return The account identifier to target for the resource.
     * 
     */
    private String accountId;
    /**
     * @return The date and time at which the target was created.
     * 
     */
    private String createdAt;
    /**
     * @return A non-unique field that refers to a target.
     * 
     */
    private String hostname;
    /**
     * @return The identifier of this resource. This is target&#39;s unique identifier.
     * 
     */
    private String id;
    /**
     * @return The IPv4/IPv6 address that identifies where to reach a target.
     * 
     */
    private GetZeroTrustInfrastructureAccessTargetsTargetIp ip;
    /**
     * @return The date and time at which the target was last modified.
     * 
     */
    private String modifiedAt;

    private GetZeroTrustInfrastructureAccessTargetsTarget() {}
    /**
     * @return The account identifier to target for the resource.
     * 
     */
    public String accountId() {
        return this.accountId;
    }
    /**
     * @return The date and time at which the target was created.
     * 
     */
    public String createdAt() {
        return this.createdAt;
    }
    /**
     * @return A non-unique field that refers to a target.
     * 
     */
    public String hostname() {
        return this.hostname;
    }
    /**
     * @return The identifier of this resource. This is target&#39;s unique identifier.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The IPv4/IPv6 address that identifies where to reach a target.
     * 
     */
    public GetZeroTrustInfrastructureAccessTargetsTargetIp ip() {
        return this.ip;
    }
    /**
     * @return The date and time at which the target was last modified.
     * 
     */
    public String modifiedAt() {
        return this.modifiedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetZeroTrustInfrastructureAccessTargetsTarget defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountId;
        private String createdAt;
        private String hostname;
        private String id;
        private GetZeroTrustInfrastructureAccessTargetsTargetIp ip;
        private String modifiedAt;
        public Builder() {}
        public Builder(GetZeroTrustInfrastructureAccessTargetsTarget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.createdAt = defaults.createdAt;
    	      this.hostname = defaults.hostname;
    	      this.id = defaults.id;
    	      this.ip = defaults.ip;
    	      this.modifiedAt = defaults.modifiedAt;
        }

        @CustomType.Setter
        public Builder accountId(String accountId) {
            if (accountId == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustInfrastructureAccessTargetsTarget", "accountId");
            }
            this.accountId = accountId;
            return this;
        }
        @CustomType.Setter
        public Builder createdAt(String createdAt) {
            if (createdAt == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustInfrastructureAccessTargetsTarget", "createdAt");
            }
            this.createdAt = createdAt;
            return this;
        }
        @CustomType.Setter
        public Builder hostname(String hostname) {
            if (hostname == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustInfrastructureAccessTargetsTarget", "hostname");
            }
            this.hostname = hostname;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustInfrastructureAccessTargetsTarget", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ip(GetZeroTrustInfrastructureAccessTargetsTargetIp ip) {
            if (ip == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustInfrastructureAccessTargetsTarget", "ip");
            }
            this.ip = ip;
            return this;
        }
        @CustomType.Setter
        public Builder modifiedAt(String modifiedAt) {
            if (modifiedAt == null) {
              throw new MissingRequiredPropertyException("GetZeroTrustInfrastructureAccessTargetsTarget", "modifiedAt");
            }
            this.modifiedAt = modifiedAt;
            return this;
        }
        public GetZeroTrustInfrastructureAccessTargetsTarget build() {
            final var _resultValue = new GetZeroTrustInfrastructureAccessTargetsTarget();
            _resultValue.accountId = accountId;
            _resultValue.createdAt = createdAt;
            _resultValue.hostname = hostname;
            _resultValue.id = id;
            _resultValue.ip = ip;
            _resultValue.modifiedAt = modifiedAt;
            return _resultValue;
        }
    }
}
