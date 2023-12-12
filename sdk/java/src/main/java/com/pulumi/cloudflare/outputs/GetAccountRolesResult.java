// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.GetAccountRolesRole;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAccountRolesResult {
    /**
     * @return The account identifier to target for the resource.
     * 
     */
    private String accountId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return A list of roles object.
     * 
     */
    private List<GetAccountRolesRole> roles;

    private GetAccountRolesResult() {}
    /**
     * @return The account identifier to target for the resource.
     * 
     */
    public String accountId() {
        return this.accountId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of roles object.
     * 
     */
    public List<GetAccountRolesRole> roles() {
        return this.roles;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccountRolesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountId;
        private String id;
        private List<GetAccountRolesRole> roles;
        public Builder() {}
        public Builder(GetAccountRolesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.id = defaults.id;
    	      this.roles = defaults.roles;
        }

        @CustomType.Setter
        public Builder accountId(String accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder roles(List<GetAccountRolesRole> roles) {
            this.roles = Objects.requireNonNull(roles);
            return this;
        }
        public Builder roles(GetAccountRolesRole... roles) {
            return roles(List.of(roles));
        }
        public GetAccountRolesResult build() {
            final var _resultValue = new GetAccountRolesResult();
            _resultValue.accountId = accountId;
            _resultValue.id = id;
            _resultValue.roles = roles;
            return _resultValue;
        }
    }
}
