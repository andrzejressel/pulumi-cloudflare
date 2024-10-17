// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.DevicePostureRuleInputLocation;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DevicePostureRuleInput {
    /**
     * @return The number of active threats from SentinelOne.
     * 
     */
    private @Nullable Integer activeThreats;
    /**
     * @return The UUID of a Cloudflare managed certificate.
     * 
     */
    private @Nullable String certificateId;
    /**
     * @return Specific volume(s) to check for encryption.
     * 
     */
    private @Nullable List<String> checkDisks;
    /**
     * @return Confirm the certificate was not imported from another device.
     * 
     */
    private @Nullable Boolean checkPrivateKey;
    /**
     * @return The common name for a certificate.
     * 
     */
    private @Nullable String cn;
    /**
     * @return The workspace one or intune device compliance status. `compliant` and `noncompliant` are values supported by both providers. `unknown`, `conflict`, `error`, `ingraceperiod` values are only supported by intune. Available values: `compliant`, `noncompliant`, `unknown`, `conflict`, `error`, `ingraceperiod`.
     * 
     */
    private @Nullable String complianceStatus;
    /**
     * @return The workspace one or intune connection id.
     * 
     */
    private @Nullable String connectionId;
    /**
     * @return The count comparison operator for kolide. Available values: `&gt;`, `&gt;=`, `&lt;`, `&lt;=`, `==`.
     * 
     */
    private @Nullable String countOperator;
    /**
     * @return The domain that the client must join.
     * 
     */
    private @Nullable String domain;
    /**
     * @return The time a device last seen in Tanium. Must be in the format `1h` or `30m`. Valid units are `d`, `h` and `m`.
     * 
     */
    private @Nullable String eidLastSeen;
    /**
     * @return True if the firewall must be enabled.
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return Checks if the file should exist.
     * 
     */
    private @Nullable Boolean exists;
    /**
     * @return List of values indicating purposes for which the certificate public key can be used. Available values: `clientAuth`, `emailProtection`.
     * 
     */
    private @Nullable List<String> extendedKeyUsages;
    /**
     * @return The Teams List id. Required for `serial_number` and `unique_client_id` rule types.
     * 
     */
    private @Nullable String id;
    /**
     * @return True if SentinelOne device is infected.
     * 
     */
    private @Nullable Boolean infected;
    /**
     * @return True if SentinelOne device is active.
     * 
     */
    private @Nullable Boolean isActive;
    /**
     * @return The number of issues for kolide.
     * 
     */
    private @Nullable String issueCount;
    /**
     * @return The duration of time that the host was last seen from Crowdstrike. Must be in the format `1h` or `30m`. Valid units are `d`, `h` and `m`.
     * 
     */
    private @Nullable String lastSeen;
    /**
     * @return List of operating system locations to check for a client certificate..
     * 
     */
    private @Nullable List<DevicePostureRuleInputLocation> locations;
    /**
     * @return The network status from SentinelOne. Available values: `connected`, `disconnected`, `disconnecting`, `connecting`.
     * 
     */
    private @Nullable String networkStatus;
    /**
     * @return The current operational state of a SentinelOne Agent. Available values: `na`, `partially_disabled`, `auto_fully_disabled`, `fully_disabled`, `auto_partially_disabled`, `disabled_error`, `db_corruption`.
     * 
     */
    private @Nullable String operationalState;
    /**
     * @return The version comparison operator. Available values: `&gt;`, `&gt;=`, `&lt;`, `&lt;=`, `==`.
     * 
     */
    private @Nullable String operator;
    /**
     * @return OS signal score from Crowdstrike. Value must be between 1 and 100.
     * 
     */
    private @Nullable String os;
    /**
     * @return The operating system excluding version information.
     * 
     */
    private @Nullable String osDistroName;
    /**
     * @return The operating system version excluding OS name information or release name.
     * 
     */
    private @Nullable String osDistroRevision;
    /**
     * @return Extra version value following the operating system semantic version.
     * 
     */
    private @Nullable String osVersionExtra;
    /**
     * @return Overall ZTA score from Crowdstrike. Value must be between 1 and 100.
     * 
     */
    private @Nullable String overall;
    /**
     * @return The path to the file.
     * 
     */
    private @Nullable String path;
    /**
     * @return True if all drives must be encrypted.
     * 
     */
    private @Nullable Boolean requireAll;
    /**
     * @return The risk level from Tanium. Available values: `low`, `medium`, `high`, `critical`.
     * 
     */
    private @Nullable String riskLevel;
    /**
     * @return Checks if the application should be running.
     * 
     */
    private @Nullable Boolean running;
    /**
     * @return A value between 0-100 assigned to devices set by the 3rd party posture provider for custom device posture integrations.
     * 
     */
    private @Nullable Integer score;
    /**
     * @return Sensor signal score from Crowdstrike. Value must be between 1 and 100.
     * 
     */
    private @Nullable String sensorConfig;
    /**
     * @return The sha256 hash of the file.
     * 
     */
    private @Nullable String sha256;
    /**
     * @return The host’s current online status from Crowdstrike. Available values: `online`, `offline`, `unknown`.
     * 
     */
    private @Nullable String state;
    /**
     * @return The thumbprint of the file certificate.
     * 
     */
    private @Nullable String thumbprint;
    /**
     * @return The total score from Tanium.
     * 
     */
    private @Nullable Integer totalScore;
    /**
     * @return The operating system semantic version.
     * 
     */
    private @Nullable String version;
    /**
     * @return The version comparison operator for Crowdstrike. Available values: `&gt;`, `&gt;=`, `&lt;`, `&lt;=`, `==`.
     * 
     */
    private @Nullable String versionOperator;

    private DevicePostureRuleInput() {}
    /**
     * @return The number of active threats from SentinelOne.
     * 
     */
    public Optional<Integer> activeThreats() {
        return Optional.ofNullable(this.activeThreats);
    }
    /**
     * @return The UUID of a Cloudflare managed certificate.
     * 
     */
    public Optional<String> certificateId() {
        return Optional.ofNullable(this.certificateId);
    }
    /**
     * @return Specific volume(s) to check for encryption.
     * 
     */
    public List<String> checkDisks() {
        return this.checkDisks == null ? List.of() : this.checkDisks;
    }
    /**
     * @return Confirm the certificate was not imported from another device.
     * 
     */
    public Optional<Boolean> checkPrivateKey() {
        return Optional.ofNullable(this.checkPrivateKey);
    }
    /**
     * @return The common name for a certificate.
     * 
     */
    public Optional<String> cn() {
        return Optional.ofNullable(this.cn);
    }
    /**
     * @return The workspace one or intune device compliance status. `compliant` and `noncompliant` are values supported by both providers. `unknown`, `conflict`, `error`, `ingraceperiod` values are only supported by intune. Available values: `compliant`, `noncompliant`, `unknown`, `conflict`, `error`, `ingraceperiod`.
     * 
     */
    public Optional<String> complianceStatus() {
        return Optional.ofNullable(this.complianceStatus);
    }
    /**
     * @return The workspace one or intune connection id.
     * 
     */
    public Optional<String> connectionId() {
        return Optional.ofNullable(this.connectionId);
    }
    /**
     * @return The count comparison operator for kolide. Available values: `&gt;`, `&gt;=`, `&lt;`, `&lt;=`, `==`.
     * 
     */
    public Optional<String> countOperator() {
        return Optional.ofNullable(this.countOperator);
    }
    /**
     * @return The domain that the client must join.
     * 
     */
    public Optional<String> domain() {
        return Optional.ofNullable(this.domain);
    }
    /**
     * @return The time a device last seen in Tanium. Must be in the format `1h` or `30m`. Valid units are `d`, `h` and `m`.
     * 
     */
    public Optional<String> eidLastSeen() {
        return Optional.ofNullable(this.eidLastSeen);
    }
    /**
     * @return True if the firewall must be enabled.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return Checks if the file should exist.
     * 
     */
    public Optional<Boolean> exists() {
        return Optional.ofNullable(this.exists);
    }
    /**
     * @return List of values indicating purposes for which the certificate public key can be used. Available values: `clientAuth`, `emailProtection`.
     * 
     */
    public List<String> extendedKeyUsages() {
        return this.extendedKeyUsages == null ? List.of() : this.extendedKeyUsages;
    }
    /**
     * @return The Teams List id. Required for `serial_number` and `unique_client_id` rule types.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return True if SentinelOne device is infected.
     * 
     */
    public Optional<Boolean> infected() {
        return Optional.ofNullable(this.infected);
    }
    /**
     * @return True if SentinelOne device is active.
     * 
     */
    public Optional<Boolean> isActive() {
        return Optional.ofNullable(this.isActive);
    }
    /**
     * @return The number of issues for kolide.
     * 
     */
    public Optional<String> issueCount() {
        return Optional.ofNullable(this.issueCount);
    }
    /**
     * @return The duration of time that the host was last seen from Crowdstrike. Must be in the format `1h` or `30m`. Valid units are `d`, `h` and `m`.
     * 
     */
    public Optional<String> lastSeen() {
        return Optional.ofNullable(this.lastSeen);
    }
    /**
     * @return List of operating system locations to check for a client certificate..
     * 
     */
    public List<DevicePostureRuleInputLocation> locations() {
        return this.locations == null ? List.of() : this.locations;
    }
    /**
     * @return The network status from SentinelOne. Available values: `connected`, `disconnected`, `disconnecting`, `connecting`.
     * 
     */
    public Optional<String> networkStatus() {
        return Optional.ofNullable(this.networkStatus);
    }
    /**
     * @return The current operational state of a SentinelOne Agent. Available values: `na`, `partially_disabled`, `auto_fully_disabled`, `fully_disabled`, `auto_partially_disabled`, `disabled_error`, `db_corruption`.
     * 
     */
    public Optional<String> operationalState() {
        return Optional.ofNullable(this.operationalState);
    }
    /**
     * @return The version comparison operator. Available values: `&gt;`, `&gt;=`, `&lt;`, `&lt;=`, `==`.
     * 
     */
    public Optional<String> operator() {
        return Optional.ofNullable(this.operator);
    }
    /**
     * @return OS signal score from Crowdstrike. Value must be between 1 and 100.
     * 
     */
    public Optional<String> os() {
        return Optional.ofNullable(this.os);
    }
    /**
     * @return The operating system excluding version information.
     * 
     */
    public Optional<String> osDistroName() {
        return Optional.ofNullable(this.osDistroName);
    }
    /**
     * @return The operating system version excluding OS name information or release name.
     * 
     */
    public Optional<String> osDistroRevision() {
        return Optional.ofNullable(this.osDistroRevision);
    }
    /**
     * @return Extra version value following the operating system semantic version.
     * 
     */
    public Optional<String> osVersionExtra() {
        return Optional.ofNullable(this.osVersionExtra);
    }
    /**
     * @return Overall ZTA score from Crowdstrike. Value must be between 1 and 100.
     * 
     */
    public Optional<String> overall() {
        return Optional.ofNullable(this.overall);
    }
    /**
     * @return The path to the file.
     * 
     */
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }
    /**
     * @return True if all drives must be encrypted.
     * 
     */
    public Optional<Boolean> requireAll() {
        return Optional.ofNullable(this.requireAll);
    }
    /**
     * @return The risk level from Tanium. Available values: `low`, `medium`, `high`, `critical`.
     * 
     */
    public Optional<String> riskLevel() {
        return Optional.ofNullable(this.riskLevel);
    }
    /**
     * @return Checks if the application should be running.
     * 
     */
    public Optional<Boolean> running() {
        return Optional.ofNullable(this.running);
    }
    /**
     * @return A value between 0-100 assigned to devices set by the 3rd party posture provider for custom device posture integrations.
     * 
     */
    public Optional<Integer> score() {
        return Optional.ofNullable(this.score);
    }
    /**
     * @return Sensor signal score from Crowdstrike. Value must be between 1 and 100.
     * 
     */
    public Optional<String> sensorConfig() {
        return Optional.ofNullable(this.sensorConfig);
    }
    /**
     * @return The sha256 hash of the file.
     * 
     */
    public Optional<String> sha256() {
        return Optional.ofNullable(this.sha256);
    }
    /**
     * @return The host’s current online status from Crowdstrike. Available values: `online`, `offline`, `unknown`.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }
    /**
     * @return The thumbprint of the file certificate.
     * 
     */
    public Optional<String> thumbprint() {
        return Optional.ofNullable(this.thumbprint);
    }
    /**
     * @return The total score from Tanium.
     * 
     */
    public Optional<Integer> totalScore() {
        return Optional.ofNullable(this.totalScore);
    }
    /**
     * @return The operating system semantic version.
     * 
     */
    public Optional<String> version() {
        return Optional.ofNullable(this.version);
    }
    /**
     * @return The version comparison operator for Crowdstrike. Available values: `&gt;`, `&gt;=`, `&lt;`, `&lt;=`, `==`.
     * 
     */
    public Optional<String> versionOperator() {
        return Optional.ofNullable(this.versionOperator);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DevicePostureRuleInput defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer activeThreats;
        private @Nullable String certificateId;
        private @Nullable List<String> checkDisks;
        private @Nullable Boolean checkPrivateKey;
        private @Nullable String cn;
        private @Nullable String complianceStatus;
        private @Nullable String connectionId;
        private @Nullable String countOperator;
        private @Nullable String domain;
        private @Nullable String eidLastSeen;
        private @Nullable Boolean enabled;
        private @Nullable Boolean exists;
        private @Nullable List<String> extendedKeyUsages;
        private @Nullable String id;
        private @Nullable Boolean infected;
        private @Nullable Boolean isActive;
        private @Nullable String issueCount;
        private @Nullable String lastSeen;
        private @Nullable List<DevicePostureRuleInputLocation> locations;
        private @Nullable String networkStatus;
        private @Nullable String operationalState;
        private @Nullable String operator;
        private @Nullable String os;
        private @Nullable String osDistroName;
        private @Nullable String osDistroRevision;
        private @Nullable String osVersionExtra;
        private @Nullable String overall;
        private @Nullable String path;
        private @Nullable Boolean requireAll;
        private @Nullable String riskLevel;
        private @Nullable Boolean running;
        private @Nullable Integer score;
        private @Nullable String sensorConfig;
        private @Nullable String sha256;
        private @Nullable String state;
        private @Nullable String thumbprint;
        private @Nullable Integer totalScore;
        private @Nullable String version;
        private @Nullable String versionOperator;
        public Builder() {}
        public Builder(DevicePostureRuleInput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeThreats = defaults.activeThreats;
    	      this.certificateId = defaults.certificateId;
    	      this.checkDisks = defaults.checkDisks;
    	      this.checkPrivateKey = defaults.checkPrivateKey;
    	      this.cn = defaults.cn;
    	      this.complianceStatus = defaults.complianceStatus;
    	      this.connectionId = defaults.connectionId;
    	      this.countOperator = defaults.countOperator;
    	      this.domain = defaults.domain;
    	      this.eidLastSeen = defaults.eidLastSeen;
    	      this.enabled = defaults.enabled;
    	      this.exists = defaults.exists;
    	      this.extendedKeyUsages = defaults.extendedKeyUsages;
    	      this.id = defaults.id;
    	      this.infected = defaults.infected;
    	      this.isActive = defaults.isActive;
    	      this.issueCount = defaults.issueCount;
    	      this.lastSeen = defaults.lastSeen;
    	      this.locations = defaults.locations;
    	      this.networkStatus = defaults.networkStatus;
    	      this.operationalState = defaults.operationalState;
    	      this.operator = defaults.operator;
    	      this.os = defaults.os;
    	      this.osDistroName = defaults.osDistroName;
    	      this.osDistroRevision = defaults.osDistroRevision;
    	      this.osVersionExtra = defaults.osVersionExtra;
    	      this.overall = defaults.overall;
    	      this.path = defaults.path;
    	      this.requireAll = defaults.requireAll;
    	      this.riskLevel = defaults.riskLevel;
    	      this.running = defaults.running;
    	      this.score = defaults.score;
    	      this.sensorConfig = defaults.sensorConfig;
    	      this.sha256 = defaults.sha256;
    	      this.state = defaults.state;
    	      this.thumbprint = defaults.thumbprint;
    	      this.totalScore = defaults.totalScore;
    	      this.version = defaults.version;
    	      this.versionOperator = defaults.versionOperator;
        }

        @CustomType.Setter
        public Builder activeThreats(@Nullable Integer activeThreats) {

            this.activeThreats = activeThreats;
            return this;
        }
        @CustomType.Setter
        public Builder certificateId(@Nullable String certificateId) {

            this.certificateId = certificateId;
            return this;
        }
        @CustomType.Setter
        public Builder checkDisks(@Nullable List<String> checkDisks) {

            this.checkDisks = checkDisks;
            return this;
        }
        public Builder checkDisks(String... checkDisks) {
            return checkDisks(List.of(checkDisks));
        }
        @CustomType.Setter
        public Builder checkPrivateKey(@Nullable Boolean checkPrivateKey) {

            this.checkPrivateKey = checkPrivateKey;
            return this;
        }
        @CustomType.Setter
        public Builder cn(@Nullable String cn) {

            this.cn = cn;
            return this;
        }
        @CustomType.Setter
        public Builder complianceStatus(@Nullable String complianceStatus) {

            this.complianceStatus = complianceStatus;
            return this;
        }
        @CustomType.Setter
        public Builder connectionId(@Nullable String connectionId) {

            this.connectionId = connectionId;
            return this;
        }
        @CustomType.Setter
        public Builder countOperator(@Nullable String countOperator) {

            this.countOperator = countOperator;
            return this;
        }
        @CustomType.Setter
        public Builder domain(@Nullable String domain) {

            this.domain = domain;
            return this;
        }
        @CustomType.Setter
        public Builder eidLastSeen(@Nullable String eidLastSeen) {

            this.eidLastSeen = eidLastSeen;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder exists(@Nullable Boolean exists) {

            this.exists = exists;
            return this;
        }
        @CustomType.Setter
        public Builder extendedKeyUsages(@Nullable List<String> extendedKeyUsages) {

            this.extendedKeyUsages = extendedKeyUsages;
            return this;
        }
        public Builder extendedKeyUsages(String... extendedKeyUsages) {
            return extendedKeyUsages(List.of(extendedKeyUsages));
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {

            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder infected(@Nullable Boolean infected) {

            this.infected = infected;
            return this;
        }
        @CustomType.Setter
        public Builder isActive(@Nullable Boolean isActive) {

            this.isActive = isActive;
            return this;
        }
        @CustomType.Setter
        public Builder issueCount(@Nullable String issueCount) {

            this.issueCount = issueCount;
            return this;
        }
        @CustomType.Setter
        public Builder lastSeen(@Nullable String lastSeen) {

            this.lastSeen = lastSeen;
            return this;
        }
        @CustomType.Setter
        public Builder locations(@Nullable List<DevicePostureRuleInputLocation> locations) {

            this.locations = locations;
            return this;
        }
        public Builder locations(DevicePostureRuleInputLocation... locations) {
            return locations(List.of(locations));
        }
        @CustomType.Setter
        public Builder networkStatus(@Nullable String networkStatus) {

            this.networkStatus = networkStatus;
            return this;
        }
        @CustomType.Setter
        public Builder operationalState(@Nullable String operationalState) {

            this.operationalState = operationalState;
            return this;
        }
        @CustomType.Setter
        public Builder operator(@Nullable String operator) {

            this.operator = operator;
            return this;
        }
        @CustomType.Setter
        public Builder os(@Nullable String os) {

            this.os = os;
            return this;
        }
        @CustomType.Setter
        public Builder osDistroName(@Nullable String osDistroName) {

            this.osDistroName = osDistroName;
            return this;
        }
        @CustomType.Setter
        public Builder osDistroRevision(@Nullable String osDistroRevision) {

            this.osDistroRevision = osDistroRevision;
            return this;
        }
        @CustomType.Setter
        public Builder osVersionExtra(@Nullable String osVersionExtra) {

            this.osVersionExtra = osVersionExtra;
            return this;
        }
        @CustomType.Setter
        public Builder overall(@Nullable String overall) {

            this.overall = overall;
            return this;
        }
        @CustomType.Setter
        public Builder path(@Nullable String path) {

            this.path = path;
            return this;
        }
        @CustomType.Setter
        public Builder requireAll(@Nullable Boolean requireAll) {

            this.requireAll = requireAll;
            return this;
        }
        @CustomType.Setter
        public Builder riskLevel(@Nullable String riskLevel) {

            this.riskLevel = riskLevel;
            return this;
        }
        @CustomType.Setter
        public Builder running(@Nullable Boolean running) {

            this.running = running;
            return this;
        }
        @CustomType.Setter
        public Builder score(@Nullable Integer score) {

            this.score = score;
            return this;
        }
        @CustomType.Setter
        public Builder sensorConfig(@Nullable String sensorConfig) {

            this.sensorConfig = sensorConfig;
            return this;
        }
        @CustomType.Setter
        public Builder sha256(@Nullable String sha256) {

            this.sha256 = sha256;
            return this;
        }
        @CustomType.Setter
        public Builder state(@Nullable String state) {

            this.state = state;
            return this;
        }
        @CustomType.Setter
        public Builder thumbprint(@Nullable String thumbprint) {

            this.thumbprint = thumbprint;
            return this;
        }
        @CustomType.Setter
        public Builder totalScore(@Nullable Integer totalScore) {

            this.totalScore = totalScore;
            return this;
        }
        @CustomType.Setter
        public Builder version(@Nullable String version) {

            this.version = version;
            return this;
        }
        @CustomType.Setter
        public Builder versionOperator(@Nullable String versionOperator) {

            this.versionOperator = versionOperator;
            return this;
        }
        public DevicePostureRuleInput build() {
            final var _resultValue = new DevicePostureRuleInput();
            _resultValue.activeThreats = activeThreats;
            _resultValue.certificateId = certificateId;
            _resultValue.checkDisks = checkDisks;
            _resultValue.checkPrivateKey = checkPrivateKey;
            _resultValue.cn = cn;
            _resultValue.complianceStatus = complianceStatus;
            _resultValue.connectionId = connectionId;
            _resultValue.countOperator = countOperator;
            _resultValue.domain = domain;
            _resultValue.eidLastSeen = eidLastSeen;
            _resultValue.enabled = enabled;
            _resultValue.exists = exists;
            _resultValue.extendedKeyUsages = extendedKeyUsages;
            _resultValue.id = id;
            _resultValue.infected = infected;
            _resultValue.isActive = isActive;
            _resultValue.issueCount = issueCount;
            _resultValue.lastSeen = lastSeen;
            _resultValue.locations = locations;
            _resultValue.networkStatus = networkStatus;
            _resultValue.operationalState = operationalState;
            _resultValue.operator = operator;
            _resultValue.os = os;
            _resultValue.osDistroName = osDistroName;
            _resultValue.osDistroRevision = osDistroRevision;
            _resultValue.osVersionExtra = osVersionExtra;
            _resultValue.overall = overall;
            _resultValue.path = path;
            _resultValue.requireAll = requireAll;
            _resultValue.riskLevel = riskLevel;
            _resultValue.running = running;
            _resultValue.score = score;
            _resultValue.sensorConfig = sensorConfig;
            _resultValue.sha256 = sha256;
            _resultValue.state = state;
            _resultValue.thumbprint = thumbprint;
            _resultValue.totalScore = totalScore;
            _resultValue.version = version;
            _resultValue.versionOperator = versionOperator;
            return _resultValue;
        }
    }
}
