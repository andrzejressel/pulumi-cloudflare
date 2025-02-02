// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    public static class GetZeroTrustInfrastructureAccessTargets
    {
        /// <summary>
        /// Use this data source to retrieve all Infrastructure Access Targets.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Cloudflare = Pulumi.Cloudflare;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Cloudflare.GetZeroTrustInfrastructureAccessTargets.Invoke(new()
        ///     {
        ///         AccountId = "f037e56e89293a057740de681ac9abbe",
        ///         HostnameContains = "example",
        ///         Ipv4 = "198.51.100.1",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["targets"] = example.Apply(getZeroTrustInfrastructureAccessTargetsResult =&gt; getZeroTrustInfrastructureAccessTargetsResult.Targets),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetZeroTrustInfrastructureAccessTargetsResult> InvokeAsync(GetZeroTrustInfrastructureAccessTargetsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetZeroTrustInfrastructureAccessTargetsResult>("cloudflare:index/getZeroTrustInfrastructureAccessTargets:getZeroTrustInfrastructureAccessTargets", args ?? new GetZeroTrustInfrastructureAccessTargetsArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to retrieve all Infrastructure Access Targets.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Cloudflare = Pulumi.Cloudflare;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Cloudflare.GetZeroTrustInfrastructureAccessTargets.Invoke(new()
        ///     {
        ///         AccountId = "f037e56e89293a057740de681ac9abbe",
        ///         HostnameContains = "example",
        ///         Ipv4 = "198.51.100.1",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["targets"] = example.Apply(getZeroTrustInfrastructureAccessTargetsResult =&gt; getZeroTrustInfrastructureAccessTargetsResult.Targets),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetZeroTrustInfrastructureAccessTargetsResult> Invoke(GetZeroTrustInfrastructureAccessTargetsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetZeroTrustInfrastructureAccessTargetsResult>("cloudflare:index/getZeroTrustInfrastructureAccessTargets:getZeroTrustInfrastructureAccessTargets", args ?? new GetZeroTrustInfrastructureAccessTargetsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetZeroTrustInfrastructureAccessTargetsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Input("accountId", required: true)]
        public string AccountId { get; set; } = null!;

        /// <summary>
        /// A date and time after a target was created to filter on.
        /// </summary>
        [Input("createdAfter")]
        public string? CreatedAfter { get; set; }

        /// <summary>
        /// The hostname of the target.
        /// </summary>
        [Input("hostname")]
        public string? Hostname { get; set; }

        /// <summary>
        /// Partial match to the hostname of a target
        /// </summary>
        [Input("hostnameContains")]
        public string? HostnameContains { get; set; }

        /// <summary>
        /// The target's IPv4 address.
        /// </summary>
        [Input("ipv4")]
        public string? Ipv4 { get; set; }

        /// <summary>
        /// The target's IPv6 address.
        /// </summary>
        [Input("ipv6")]
        public string? Ipv6 { get; set; }

        /// <summary>
        /// A date and time after a target was modified to filter on.
        /// </summary>
        [Input("modifiedAfter")]
        public string? ModifiedAfter { get; set; }

        /// <summary>
        /// The private virtual network identifier for the target.
        /// </summary>
        [Input("virtualNetworkId")]
        public string? VirtualNetworkId { get; set; }

        public GetZeroTrustInfrastructureAccessTargetsArgs()
        {
        }
        public static new GetZeroTrustInfrastructureAccessTargetsArgs Empty => new GetZeroTrustInfrastructureAccessTargetsArgs();
    }

    public sealed class GetZeroTrustInfrastructureAccessTargetsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        /// <summary>
        /// A date and time after a target was created to filter on.
        /// </summary>
        [Input("createdAfter")]
        public Input<string>? CreatedAfter { get; set; }

        /// <summary>
        /// The hostname of the target.
        /// </summary>
        [Input("hostname")]
        public Input<string>? Hostname { get; set; }

        /// <summary>
        /// Partial match to the hostname of a target
        /// </summary>
        [Input("hostnameContains")]
        public Input<string>? HostnameContains { get; set; }

        /// <summary>
        /// The target's IPv4 address.
        /// </summary>
        [Input("ipv4")]
        public Input<string>? Ipv4 { get; set; }

        /// <summary>
        /// The target's IPv6 address.
        /// </summary>
        [Input("ipv6")]
        public Input<string>? Ipv6 { get; set; }

        /// <summary>
        /// A date and time after a target was modified to filter on.
        /// </summary>
        [Input("modifiedAfter")]
        public Input<string>? ModifiedAfter { get; set; }

        /// <summary>
        /// The private virtual network identifier for the target.
        /// </summary>
        [Input("virtualNetworkId")]
        public Input<string>? VirtualNetworkId { get; set; }

        public GetZeroTrustInfrastructureAccessTargetsInvokeArgs()
        {
        }
        public static new GetZeroTrustInfrastructureAccessTargetsInvokeArgs Empty => new GetZeroTrustInfrastructureAccessTargetsInvokeArgs();
    }


    [OutputType]
    public sealed class GetZeroTrustInfrastructureAccessTargetsResult
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        public readonly string AccountId;
        /// <summary>
        /// A date and time after a target was created to filter on.
        /// </summary>
        public readonly string? CreatedAfter;
        /// <summary>
        /// The hostname of the target.
        /// </summary>
        public readonly string? Hostname;
        /// <summary>
        /// Partial match to the hostname of a target
        /// </summary>
        public readonly string? HostnameContains;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The target's IPv4 address.
        /// </summary>
        public readonly string? Ipv4;
        /// <summary>
        /// The target's IPv6 address.
        /// </summary>
        public readonly string? Ipv6;
        /// <summary>
        /// A date and time after a target was modified to filter on.
        /// </summary>
        public readonly string? ModifiedAfter;
        public readonly ImmutableArray<Outputs.GetZeroTrustInfrastructureAccessTargetsTargetResult> Targets;
        /// <summary>
        /// The private virtual network identifier for the target.
        /// </summary>
        public readonly string? VirtualNetworkId;

        [OutputConstructor]
        private GetZeroTrustInfrastructureAccessTargetsResult(
            string accountId,

            string? createdAfter,

            string? hostname,

            string? hostnameContains,

            string id,

            string? ipv4,

            string? ipv6,

            string? modifiedAfter,

            ImmutableArray<Outputs.GetZeroTrustInfrastructureAccessTargetsTargetResult> targets,

            string? virtualNetworkId)
        {
            AccountId = accountId;
            CreatedAfter = createdAfter;
            Hostname = hostname;
            HostnameContains = hostnameContains;
            Id = id;
            Ipv4 = ipv4;
            Ipv6 = ipv6;
            ModifiedAfter = modifiedAfter;
            Targets = targets;
            VirtualNetworkId = virtualNetworkId;
        }
    }
}
