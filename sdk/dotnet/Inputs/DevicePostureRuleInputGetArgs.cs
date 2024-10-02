// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class DevicePostureRuleInputGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The number of active threats from SentinelOne.
        /// </summary>
        [Input("activeThreats")]
        public Input<int>? ActiveThreats { get; set; }

        /// <summary>
        /// The UUID of a Cloudflare managed certificate.
        /// </summary>
        [Input("certificateId")]
        public Input<string>? CertificateId { get; set; }

        [Input("checkDisks")]
        private InputList<string>? _checkDisks;

        /// <summary>
        /// Specific volume(s) to check for encryption.
        /// </summary>
        public InputList<string> CheckDisks
        {
            get => _checkDisks ?? (_checkDisks = new InputList<string>());
            set => _checkDisks = value;
        }

        /// <summary>
        /// Confirm the certificate was not imported from another device.
        /// </summary>
        [Input("checkPrivateKey")]
        public Input<bool>? CheckPrivateKey { get; set; }

        /// <summary>
        /// The common name for a certificate.
        /// </summary>
        [Input("cn")]
        public Input<string>? Cn { get; set; }

        /// <summary>
        /// The workspace one or intune device compliance status. `compliant` and `noncompliant` are values supported by both providers. `unknown`, `conflict`, `error`, `ingraceperiod` values are only supported by intune. Available values: `compliant`, `noncompliant`, `unknown`, `conflict`, `error`, `ingraceperiod`.
        /// </summary>
        [Input("complianceStatus")]
        public Input<string>? ComplianceStatus { get; set; }

        /// <summary>
        /// The workspace one or intune connection id.
        /// </summary>
        [Input("connectionId")]
        public Input<string>? ConnectionId { get; set; }

        /// <summary>
        /// The count comparison operator for kolide. Available values: `&gt;`, `&gt;=`, `&lt;`, `&lt;=`, `==`.
        /// </summary>
        [Input("countOperator")]
        public Input<string>? CountOperator { get; set; }

        /// <summary>
        /// The domain that the client must join.
        /// </summary>
        [Input("domain")]
        public Input<string>? Domain { get; set; }

        /// <summary>
        /// The time a device last seen in Tanium. Must be in the format `1h` or `30m`. Valid units are `d`, `h` and `m`.
        /// </summary>
        [Input("eidLastSeen")]
        public Input<string>? EidLastSeen { get; set; }

        /// <summary>
        /// True if the firewall must be enabled.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Checks if the file should exist.
        /// </summary>
        [Input("exists")]
        public Input<bool>? Exists { get; set; }

        [Input("extendedKeyUsages")]
        private InputList<string>? _extendedKeyUsages;

        /// <summary>
        /// List of values indicating purposes for which the certificate public key can be used. Available values: `clientAuth`, `emailProtection`.
        /// </summary>
        public InputList<string> ExtendedKeyUsages
        {
            get => _extendedKeyUsages ?? (_extendedKeyUsages = new InputList<string>());
            set => _extendedKeyUsages = value;
        }

        /// <summary>
        /// The Teams List id. Required for `serial_number` and `unique_client_id` rule types.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// True if SentinelOne device is infected.
        /// </summary>
        [Input("infected")]
        public Input<bool>? Infected { get; set; }

        /// <summary>
        /// True if SentinelOne device is active.
        /// </summary>
        [Input("isActive")]
        public Input<bool>? IsActive { get; set; }

        /// <summary>
        /// The number of issues for kolide.
        /// </summary>
        [Input("issueCount")]
        public Input<string>? IssueCount { get; set; }

        /// <summary>
        /// The duration of time that the host was last seen from Crowdstrike. Must be in the format `1h` or `30m`. Valid units are `d`, `h` and `m`.
        /// </summary>
        [Input("lastSeen")]
        public Input<string>? LastSeen { get; set; }

        [Input("locations")]
        private InputList<Inputs.DevicePostureRuleInputLocationGetArgs>? _locations;

        /// <summary>
        /// List of operating system locations to check for a client certificate..
        /// </summary>
        public InputList<Inputs.DevicePostureRuleInputLocationGetArgs> Locations
        {
            get => _locations ?? (_locations = new InputList<Inputs.DevicePostureRuleInputLocationGetArgs>());
            set => _locations = value;
        }

        /// <summary>
        /// The network status from SentinelOne. Available values: `connected`, `disconnected`, `disconnecting`, `connecting`.
        /// </summary>
        [Input("networkStatus")]
        public Input<string>? NetworkStatus { get; set; }

        /// <summary>
        /// The version comparison operator. Available values: `&gt;`, `&gt;=`, `&lt;`, `&lt;=`, `==`.
        /// </summary>
        [Input("operator")]
        public Input<string>? Operator { get; set; }

        /// <summary>
        /// OS signal score from Crowdstrike. Value must be between 1 and 100.
        /// </summary>
        [Input("os")]
        public Input<string>? Os { get; set; }

        /// <summary>
        /// The operating system excluding version information.
        /// </summary>
        [Input("osDistroName")]
        public Input<string>? OsDistroName { get; set; }

        /// <summary>
        /// The operating system version excluding OS name information or release name.
        /// </summary>
        [Input("osDistroRevision")]
        public Input<string>? OsDistroRevision { get; set; }

        /// <summary>
        /// Extra version value following the operating system semantic version.
        /// </summary>
        [Input("osVersionExtra")]
        public Input<string>? OsVersionExtra { get; set; }

        /// <summary>
        /// Overall ZTA score from Crowdstrike. Value must be between 1 and 100.
        /// </summary>
        [Input("overall")]
        public Input<string>? Overall { get; set; }

        /// <summary>
        /// The path to the file.
        /// </summary>
        [Input("path")]
        public Input<string>? Path { get; set; }

        /// <summary>
        /// True if all drives must be encrypted.
        /// </summary>
        [Input("requireAll")]
        public Input<bool>? RequireAll { get; set; }

        /// <summary>
        /// The risk level from Tanium. Available values: `low`, `medium`, `high`, `critical`.
        /// </summary>
        [Input("riskLevel")]
        public Input<string>? RiskLevel { get; set; }

        /// <summary>
        /// Checks if the application should be running.
        /// </summary>
        [Input("running")]
        public Input<bool>? Running { get; set; }

        /// <summary>
        /// A value between 0-100 assigned to devices set by the 3rd party posture provider for custom device posture integrations.
        /// </summary>
        [Input("score")]
        public Input<int>? Score { get; set; }

        /// <summary>
        /// Sensor signal score from Crowdstrike. Value must be between 1 and 100.
        /// </summary>
        [Input("sensorConfig")]
        public Input<string>? SensorConfig { get; set; }

        /// <summary>
        /// The sha256 hash of the file.
        /// </summary>
        [Input("sha256")]
        public Input<string>? Sha256 { get; set; }

        /// <summary>
        /// The host’s current online status from Crowdstrike. Available values: `online`, `offline`, `unknown`.
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        /// <summary>
        /// The thumbprint of the file certificate.
        /// </summary>
        [Input("thumbprint")]
        public Input<string>? Thumbprint { get; set; }

        /// <summary>
        /// The total score from Tanium.
        /// </summary>
        [Input("totalScore")]
        public Input<int>? TotalScore { get; set; }

        /// <summary>
        /// The operating system semantic version.
        /// </summary>
        [Input("version")]
        public Input<string>? Version { get; set; }

        /// <summary>
        /// The version comparison operator for Crowdstrike. Available values: `&gt;`, `&gt;=`, `&lt;`, `&lt;=`, `==`.
        /// </summary>
        [Input("versionOperator")]
        public Input<string>? VersionOperator { get; set; }

        public DevicePostureRuleInputGetArgs()
        {
        }
        public static new DevicePostureRuleInputGetArgs Empty => new DevicePostureRuleInputGetArgs();
    }
}
