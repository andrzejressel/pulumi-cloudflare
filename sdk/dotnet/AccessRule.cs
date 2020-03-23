// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    /// <summary>
    /// Provides a Cloudflare IP Firewall Access Rule resource. Access control can be applied on basis of IP addresses, IP ranges, AS numbers or countries.
    /// 
    /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-cloudflare/blob/master/website/docs/r/access_rule.html.markdown.
    /// </summary>
    public partial class AccessRule : Pulumi.CustomResource
    {
        /// <summary>
        /// Rule configuration to apply to a matched request. It's a complex value. See description below.
        /// </summary>
        [Output("configuration")]
        public Output<Outputs.AccessRuleConfiguration> Configuration { get; private set; } = null!;

        /// <summary>
        /// The action to apply to a matched request. Allowed values: "block", "challenge", "whitelist", "js_challenge"
        /// </summary>
        [Output("mode")]
        public Output<string> Mode { get; private set; } = null!;

        /// <summary>
        /// A personal note about the rule. Typically used as a reminder or explanation for the rule.
        /// </summary>
        [Output("notes")]
        public Output<string?> Notes { get; private set; } = null!;

        /// <summary>
        /// The DNS zone to which the access rule should be added.
        /// </summary>
        [Output("zoneId")]
        public Output<string> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a AccessRule resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AccessRule(string name, AccessRuleArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/accessRule:AccessRule", name, args ?? ResourceArgs.Empty, MakeResourceOptions(options, ""))
        {
        }

        private AccessRule(string name, Input<string> id, AccessRuleState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/accessRule:AccessRule", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing AccessRule resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AccessRule Get(string name, Input<string> id, AccessRuleState? state = null, CustomResourceOptions? options = null)
        {
            return new AccessRule(name, id, state, options);
        }
    }

    public sealed class AccessRuleArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Rule configuration to apply to a matched request. It's a complex value. See description below.
        /// </summary>
        [Input("configuration", required: true)]
        public Input<Inputs.AccessRuleConfigurationArgs> Configuration { get; set; } = null!;

        /// <summary>
        /// The action to apply to a matched request. Allowed values: "block", "challenge", "whitelist", "js_challenge"
        /// </summary>
        [Input("mode", required: true)]
        public Input<string> Mode { get; set; } = null!;

        /// <summary>
        /// A personal note about the rule. Typically used as a reminder or explanation for the rule.
        /// </summary>
        [Input("notes")]
        public Input<string>? Notes { get; set; }

        /// <summary>
        /// The DNS zone to which the access rule should be added.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public AccessRuleArgs()
        {
        }
    }

    public sealed class AccessRuleState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Rule configuration to apply to a matched request. It's a complex value. See description below.
        /// </summary>
        [Input("configuration")]
        public Input<Inputs.AccessRuleConfigurationGetArgs>? Configuration { get; set; }

        /// <summary>
        /// The action to apply to a matched request. Allowed values: "block", "challenge", "whitelist", "js_challenge"
        /// </summary>
        [Input("mode")]
        public Input<string>? Mode { get; set; }

        /// <summary>
        /// A personal note about the rule. Typically used as a reminder or explanation for the rule.
        /// </summary>
        [Input("notes")]
        public Input<string>? Notes { get; set; }

        /// <summary>
        /// The DNS zone to which the access rule should be added.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public AccessRuleState()
        {
        }
    }

    namespace Inputs
    {

    public sealed class AccessRuleConfigurationArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The request property to target. Allowed values: "ip", "ip6", "ip_range", "asn", "country"
        /// </summary>
        [Input("target", required: true)]
        public Input<string> Target { get; set; } = null!;

        /// <summary>
        /// The value to target. Depends on target's type.
        /// </summary>
        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public AccessRuleConfigurationArgs()
        {
        }
    }

    public sealed class AccessRuleConfigurationGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The request property to target. Allowed values: "ip", "ip6", "ip_range", "asn", "country"
        /// </summary>
        [Input("target", required: true)]
        public Input<string> Target { get; set; } = null!;

        /// <summary>
        /// The value to target. Depends on target's type.
        /// </summary>
        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public AccessRuleConfigurationGetArgs()
        {
        }
    }
    }

    namespace Outputs
    {

    [OutputType]
    public sealed class AccessRuleConfiguration
    {
        /// <summary>
        /// The request property to target. Allowed values: "ip", "ip6", "ip_range", "asn", "country"
        /// </summary>
        public readonly string Target;
        /// <summary>
        /// The value to target. Depends on target's type.
        /// </summary>
        public readonly string Value;

        [OutputConstructor]
        private AccessRuleConfiguration(
            string target,
            string value)
        {
            Target = target;
            Value = value;
        }
    }
    }
}
