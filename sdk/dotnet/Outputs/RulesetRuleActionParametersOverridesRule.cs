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
    public sealed class RulesetRuleActionParametersOverridesRule
    {
        /// <summary>
        /// Action to perform in the ruleset rule. Available values: `block`, `challenge`, `ddos_dynamic`, `execute`, `force_connection_close`, `js_challenge`, `log`, `log_custom_field`, `managed_challenge`, `redirect`, `rewrite`, `route`, `score`, `set_cache_settings`, `serve_error`, `skip`.
        /// </summary>
        public readonly string? Action;
        /// <summary>
        /// Whether the rule is active.
        /// </summary>
        public readonly bool? Enabled;
        /// <summary>
        /// Unique rule identifier.
        /// </summary>
        public readonly string? Id;
        public readonly int? ScoreThreshold;
        public readonly string? SensitivityLevel;
        public readonly string? Status;

        [OutputConstructor]
        private RulesetRuleActionParametersOverridesRule(
            string? action,

            bool? enabled,

            string? id,

            int? scoreThreshold,

            string? sensitivityLevel,

            string? status)
        {
            Action = action;
            Enabled = enabled;
            Id = id;
            ScoreThreshold = scoreThreshold;
            SensitivityLevel = sensitivityLevel;
            Status = status;
        }
    }
}
