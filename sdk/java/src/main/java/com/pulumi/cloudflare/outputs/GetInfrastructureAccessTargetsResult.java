// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.GetInfrastructureAccessTargetsTarget;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetInfrastructureAccessTargetsResult {
    /**
     * @return The account identifier to target for the resource.
     * 
     */
    private String accountId;
    /**
     * @return A date and time after a target was created to filter on.
     * 
     */
    private @Nullable String createdAfter;
    /**
     * @return The hostname of the target.
     * 
     */
    private @Nullable String hostname;
    /**
     * @return Partial match to the hostname of a target
     * 
     */
    private @Nullable String hostnameContains;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The target&#39;s IPv4 address.
     * 
     */
    private @Nullable String ipv4;
    /**
     * @return The target&#39;s IPv6 address.
     * 
     */
    private @Nullable String ipv6;
    /**
     * @return A date and time after a target was modified to filter on.
     * 
     */
    private @Nullable String modifiedAfter;
    private List<GetInfrastructureAccessTargetsTarget> targets;
    /**
     * @return The private virtual network identifier for the target.
     * 
     */
    private @Nullable String virtualNetworkId;

    private GetInfrastructureAccessTargetsResult() {}
    /**
     * @return The account identifier to target for the resource.
     * 
     */
    public String accountId() {
        return this.accountId;
    }
    /**
     * @return A date and time after a target was created to filter on.
     * 
     */
    public Optional<String> createdAfter() {
        return Optional.ofNullable(this.createdAfter);
    }
    /**
     * @return The hostname of the target.
     * 
     */
    public Optional<String> hostname() {
        return Optional.ofNullable(this.hostname);
    }
    /**
     * @return Partial match to the hostname of a target
     * 
     */
    public Optional<String> hostnameContains() {
        return Optional.ofNullable(this.hostnameContains);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The target&#39;s IPv4 address.
     * 
     */
    public Optional<String> ipv4() {
        return Optional.ofNullable(this.ipv4);
    }
    /**
     * @return The target&#39;s IPv6 address.
     * 
     */
    public Optional<String> ipv6() {
        return Optional.ofNullable(this.ipv6);
    }
    /**
     * @return A date and time after a target was modified to filter on.
     * 
     */
    public Optional<String> modifiedAfter() {
        return Optional.ofNullable(this.modifiedAfter);
    }
    public List<GetInfrastructureAccessTargetsTarget> targets() {
        return this.targets;
    }
    /**
     * @return The private virtual network identifier for the target.
     * 
     */
    public Optional<String> virtualNetworkId() {
        return Optional.ofNullable(this.virtualNetworkId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInfrastructureAccessTargetsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountId;
        private @Nullable String createdAfter;
        private @Nullable String hostname;
        private @Nullable String hostnameContains;
        private String id;
        private @Nullable String ipv4;
        private @Nullable String ipv6;
        private @Nullable String modifiedAfter;
        private List<GetInfrastructureAccessTargetsTarget> targets;
        private @Nullable String virtualNetworkId;
        public Builder() {}
        public Builder(GetInfrastructureAccessTargetsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.createdAfter = defaults.createdAfter;
    	      this.hostname = defaults.hostname;
    	      this.hostnameContains = defaults.hostnameContains;
    	      this.id = defaults.id;
    	      this.ipv4 = defaults.ipv4;
    	      this.ipv6 = defaults.ipv6;
    	      this.modifiedAfter = defaults.modifiedAfter;
    	      this.targets = defaults.targets;
    	      this.virtualNetworkId = defaults.virtualNetworkId;
        }

        @CustomType.Setter
        public Builder accountId(String accountId) {
            if (accountId == null) {
              throw new MissingRequiredPropertyException("GetInfrastructureAccessTargetsResult", "accountId");
            }
            this.accountId = accountId;
            return this;
        }
        @CustomType.Setter
        public Builder createdAfter(@Nullable String createdAfter) {

            this.createdAfter = createdAfter;
            return this;
        }
        @CustomType.Setter
        public Builder hostname(@Nullable String hostname) {

            this.hostname = hostname;
            return this;
        }
        @CustomType.Setter
        public Builder hostnameContains(@Nullable String hostnameContains) {

            this.hostnameContains = hostnameContains;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetInfrastructureAccessTargetsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ipv4(@Nullable String ipv4) {

            this.ipv4 = ipv4;
            return this;
        }
        @CustomType.Setter
        public Builder ipv6(@Nullable String ipv6) {

            this.ipv6 = ipv6;
            return this;
        }
        @CustomType.Setter
        public Builder modifiedAfter(@Nullable String modifiedAfter) {

            this.modifiedAfter = modifiedAfter;
            return this;
        }
        @CustomType.Setter
        public Builder targets(List<GetInfrastructureAccessTargetsTarget> targets) {
            if (targets == null) {
              throw new MissingRequiredPropertyException("GetInfrastructureAccessTargetsResult", "targets");
            }
            this.targets = targets;
            return this;
        }
        public Builder targets(GetInfrastructureAccessTargetsTarget... targets) {
            return targets(List.of(targets));
        }
        @CustomType.Setter
        public Builder virtualNetworkId(@Nullable String virtualNetworkId) {

            this.virtualNetworkId = virtualNetworkId;
            return this;
        }
        public GetInfrastructureAccessTargetsResult build() {
            final var _resultValue = new GetInfrastructureAccessTargetsResult();
            _resultValue.accountId = accountId;
            _resultValue.createdAfter = createdAfter;
            _resultValue.hostname = hostname;
            _resultValue.hostnameContains = hostnameContains;
            _resultValue.id = id;
            _resultValue.ipv4 = ipv4;
            _resultValue.ipv6 = ipv6;
            _resultValue.modifiedAfter = modifiedAfter;
            _resultValue.targets = targets;
            _resultValue.virtualNetworkId = virtualNetworkId;
            return _resultValue;
        }
    }
}
