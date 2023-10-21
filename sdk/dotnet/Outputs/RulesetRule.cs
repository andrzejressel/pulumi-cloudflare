// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Outputs
{

    [OutputType]
    public sealed class RulesetRule
    {
        /// <summary>
        /// Action to perform in the ruleset rule. Available values: `block`, `challenge`, `compress_response`, `ddos_dynamic`, `ddos_mitigation`, `execute`, `force_connection_close`, `js_challenge`, `log`, `log_custom_field`, `managed_challenge`, `redirect`, `rewrite`, `route`, `score`, `serve_error`, `set_cache_settings`, `set_config`, `skip`.
        /// </summary>
        public readonly string? Action;
        /// <summary>
        /// List of parameters that configure the behavior of the ruleset rule action.
        /// </summary>
        public readonly Outputs.RulesetRuleActionParameters? ActionParameters;
        /// <summary>
        /// Brief summary of the ruleset rule and its intended use.
        /// </summary>
        public readonly string? Description;
        /// <summary>
        /// Whether the rule is active.
        /// </summary>
        public readonly bool? Enabled;
        /// <summary>
        /// List of parameters that configure exposed credential checks.
        /// </summary>
        public readonly Outputs.RulesetRuleExposedCredentialCheck? ExposedCredentialCheck;
        /// <summary>
        /// Criteria for an HTTP request to trigger the ruleset rule action. Uses the Firewall Rules expression language based on Wireshark display filters. Refer to the [Firewall Rules language](https://developers.cloudflare.com/firewall/cf-firewall-language) documentation for all available fields, operators, and functions.
        /// </summary>
        public readonly string Expression;
        /// <summary>
        /// Unique rule identifier.
        /// </summary>
        public readonly string? Id;
        /// <summary>
        /// The most recent update to this rule.
        /// </summary>
        public readonly string? LastUpdated;
        /// <summary>
        /// List parameters to configure how the rule generates logs. Only valid for skip action.
        /// </summary>
        public readonly Outputs.RulesetRuleLogging? Logging;
        /// <summary>
        /// List of parameters that configure HTTP rate limiting behaviour.
        /// </summary>
        public readonly Outputs.RulesetRuleRatelimit? Ratelimit;
        /// <summary>
        /// Rule reference.
        /// </summary>
        public readonly string? Ref;
        /// <summary>
        /// Version of the ruleset to deploy.
        /// </summary>
        public readonly string? Version;

        [OutputConstructor]
        private RulesetRule(
            string? action,

            Outputs.RulesetRuleActionParameters? actionParameters,

            string? description,

            bool? enabled,

            Outputs.RulesetRuleExposedCredentialCheck? exposedCredentialCheck,

            string expression,

            string? id,

            string? lastUpdated,

            Outputs.RulesetRuleLogging? logging,

            Outputs.RulesetRuleRatelimit? ratelimit,

            string? @ref,

            string? version)
        {
            Action = action;
            ActionParameters = actionParameters;
            Description = description;
            Enabled = enabled;
            ExposedCredentialCheck = exposedCredentialCheck;
            Expression = expression;
            Id = id;
            LastUpdated = lastUpdated;
            Logging = logging;
            Ratelimit = ratelimit;
            Ref = @ref;
            Version = version;
        }
    }
}
