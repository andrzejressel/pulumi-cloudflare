// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.GetDevicePostureRulesRule;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDevicePostureRulesResult {
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
     * @return Name of the Device Posture Rule.
     * 
     */
    private @Nullable String name;
    /**
     * @return A list of matching Device Posture Rules.
     * 
     */
    private List<GetDevicePostureRulesRule> rules;
    /**
     * @return The device posture rule type. Available values: `serial_number`, `file`, `application`, `gateway`, `warp`, `domain_joined`, `os_version`, `disk_encryption`, `firewall`, `client_certificate`, `workspace_one`, `unique_client_id`, `crowdstrike_s2s`, `sentinelone`, `kolide`, `tanium_s2s`, `intune`, `sentinelone_s2s`.
     * 
     */
    private @Nullable String type;

    private GetDevicePostureRulesResult() {}
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
     * @return Name of the Device Posture Rule.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return A list of matching Device Posture Rules.
     * 
     */
    public List<GetDevicePostureRulesRule> rules() {
        return this.rules;
    }
    /**
     * @return The device posture rule type. Available values: `serial_number`, `file`, `application`, `gateway`, `warp`, `domain_joined`, `os_version`, `disk_encryption`, `firewall`, `client_certificate`, `workspace_one`, `unique_client_id`, `crowdstrike_s2s`, `sentinelone`, `kolide`, `tanium_s2s`, `intune`, `sentinelone_s2s`.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDevicePostureRulesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountId;
        private String id;
        private @Nullable String name;
        private List<GetDevicePostureRulesRule> rules;
        private @Nullable String type;
        public Builder() {}
        public Builder(GetDevicePostureRulesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.rules = defaults.rules;
    	      this.type = defaults.type;
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
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder rules(List<GetDevicePostureRulesRule> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }
        public Builder rules(GetDevicePostureRulesRule... rules) {
            return rules(List.of(rules));
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public GetDevicePostureRulesResult build() {
            final var _resultValue = new GetDevicePostureRulesResult();
            _resultValue.accountId = accountId;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.rules = rules;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
