// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDevicePostureRulesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDevicePostureRulesPlainArgs Empty = new GetDevicePostureRulesPlainArgs();

    /**
     * The account identifier to target for the resource.
     * 
     */
    @Import(name="accountId", required=true)
    private String accountId;

    /**
     * @return The account identifier to target for the resource.
     * 
     */
    public String accountId() {
        return this.accountId;
    }

    /**
     * Name of the Device Posture Rule.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return Name of the Device Posture Rule.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The device posture rule type. Available values: `serial_number`, `file`, `application`, `gateway`, `warp`, `domain_joined`, `os_version`, `disk_encryption`, `firewall`, `client_certificate`, `client_certificate_v2`, `workspace_one`, `unique_client_id`, `crowdstrike_s2s`, `sentinelone`, `kolide`, `tanium_s2s`, `intune`, `sentinelone_s2s`, `custom_s2s`.
     * 
     */
    @Import(name="type")
    private @Nullable String type;

    /**
     * @return The device posture rule type. Available values: `serial_number`, `file`, `application`, `gateway`, `warp`, `domain_joined`, `os_version`, `disk_encryption`, `firewall`, `client_certificate`, `client_certificate_v2`, `workspace_one`, `unique_client_id`, `crowdstrike_s2s`, `sentinelone`, `kolide`, `tanium_s2s`, `intune`, `sentinelone_s2s`, `custom_s2s`.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    private GetDevicePostureRulesPlainArgs() {}

    private GetDevicePostureRulesPlainArgs(GetDevicePostureRulesPlainArgs $) {
        this.accountId = $.accountId;
        this.name = $.name;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDevicePostureRulesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDevicePostureRulesPlainArgs $;

        public Builder() {
            $ = new GetDevicePostureRulesPlainArgs();
        }

        public Builder(GetDevicePostureRulesPlainArgs defaults) {
            $ = new GetDevicePostureRulesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param name Name of the Device Posture Rule.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param type The device posture rule type. Available values: `serial_number`, `file`, `application`, `gateway`, `warp`, `domain_joined`, `os_version`, `disk_encryption`, `firewall`, `client_certificate`, `client_certificate_v2`, `workspace_one`, `unique_client_id`, `crowdstrike_s2s`, `sentinelone`, `kolide`, `tanium_s2s`, `intune`, `sentinelone_s2s`, `custom_s2s`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable String type) {
            $.type = type;
            return this;
        }

        public GetDevicePostureRulesPlainArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("GetDevicePostureRulesPlainArgs", "accountId");
            }
            return $;
        }
    }

}
