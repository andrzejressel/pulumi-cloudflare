// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    public static class GetTunnel
    {
        /// <summary>
        /// Use this datasource to lookup a tunnel in an account.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Cloudflare = Pulumi.Cloudflare;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Cloudflare.GetTunnel.Invoke(new()
        ///     {
        ///         AccountId = "f037e56e89293a057740de681ac9abbe",
        ///         Name = "my-tunnel",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetTunnelResult> InvokeAsync(GetTunnelArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetTunnelResult>("cloudflare:index/getTunnel:getTunnel", args ?? new GetTunnelArgs(), options.WithDefaults());

        /// <summary>
        /// Use this datasource to lookup a tunnel in an account.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Cloudflare = Pulumi.Cloudflare;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Cloudflare.GetTunnel.Invoke(new()
        ///     {
        ///         AccountId = "f037e56e89293a057740de681ac9abbe",
        ///         Name = "my-tunnel",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetTunnelResult> Invoke(GetTunnelInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetTunnelResult>("cloudflare:index/getTunnel:getTunnel", args ?? new GetTunnelInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetTunnelArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("accountId", required: true)]
        public string AccountId { get; set; } = null!;

        /// <summary>
        /// Name of the tunnel. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetTunnelArgs()
        {
        }
        public static new GetTunnelArgs Empty => new GetTunnelArgs();
    }

    public sealed class GetTunnelInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        /// <summary>
        /// Name of the tunnel. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public GetTunnelInvokeArgs()
        {
        }
        public static new GetTunnelInvokeArgs Empty => new GetTunnelInvokeArgs();
    }


    [OutputType]
    public sealed class GetTunnelResult
    {
        /// <summary>
        /// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        public readonly string AccountId;
        /// <summary>
        /// ID of the tunnel.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Name of the tunnel. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Whether the tunnel can be configured remotely from the Zero Trust dashboard.
        /// </summary>
        public readonly bool RemoteConfig;
        /// <summary>
        /// The status of the tunnel. Available values: `inactive`, `degraded`, `healthy`, `down`.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// The type of the tunnel. Available values: `cfd_tunnel`, `warp_connector`.
        /// </summary>
        public readonly string TunnelType;

        [OutputConstructor]
        private GetTunnelResult(
            string accountId,

            string id,

            string name,

            bool remoteConfig,

            string status,

            string tunnelType)
        {
            AccountId = accountId;
            Id = id;
            Name = name;
            RemoteConfig = remoteConfig;
            Status = status;
            TunnelType = tunnelType;
        }
    }
}