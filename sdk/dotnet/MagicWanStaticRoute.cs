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
    /// Provides a resource, that manages Cloudflare static routes for Magic
    /// Transit or Magic WAN. Static routes are used to route traffic
    /// through GRE tunnels.
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
    ///     var example = new Cloudflare.MagicWanStaticRoute("example", new()
    ///     {
    ///         AccountId = "f037e56e89293a057740de681ac9abbe",
    ///         Description = "New route for new prefix 192.0.2.0/24",
    ///         Prefix = "192.0.2.0/24",
    ///         Nexthop = "10.0.0.0",
    ///         Priority = 100,
    ///         Weight = 10,
    ///         ColoNames = new[]
    ///         {
    ///             "den01",
    ///         },
    ///         ColoRegions = new[]
    ///         {
    ///             "APAC",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import cloudflare:index/magicWanStaticRoute:MagicWanStaticRoute example &lt;account_id&gt;/&lt;static_route_id&gt;
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/magicWanStaticRoute:MagicWanStaticRoute")]
    public partial class MagicWanStaticRoute : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("accountId")]
        public Output<string?> AccountId { get; private set; } = null!;

        /// <summary>
        /// List of Cloudflare colocation regions for this static route.
        /// </summary>
        [Output("coloNames")]
        public Output<ImmutableArray<string>> ColoNames { get; private set; } = null!;

        /// <summary>
        /// List of Cloudflare colocation names for this static route.
        /// </summary>
        [Output("coloRegions")]
        public Output<ImmutableArray<string>> ColoRegions { get; private set; } = null!;

        /// <summary>
        /// Description of the static route.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The nexthop IP address where traffic will be routed to.
        /// </summary>
        [Output("nexthop")]
        public Output<string> Nexthop { get; private set; } = null!;

        /// <summary>
        /// Your network prefix using CIDR notation.
        /// </summary>
        [Output("prefix")]
        public Output<string> Prefix { get; private set; } = null!;

        /// <summary>
        /// The priority for the static route.
        /// </summary>
        [Output("priority")]
        public Output<int> Priority { get; private set; } = null!;

        /// <summary>
        /// The optional weight for ECMP routes. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("weight")]
        public Output<int?> Weight { get; private set; } = null!;


        /// <summary>
        /// Create a MagicWanStaticRoute resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public MagicWanStaticRoute(string name, MagicWanStaticRouteArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/magicWanStaticRoute:MagicWanStaticRoute", name, args ?? new MagicWanStaticRouteArgs(), MakeResourceOptions(options, ""))
        {
        }

        private MagicWanStaticRoute(string name, Input<string> id, MagicWanStaticRouteState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/magicWanStaticRoute:MagicWanStaticRoute", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing MagicWanStaticRoute resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static MagicWanStaticRoute Get(string name, Input<string> id, MagicWanStaticRouteState? state = null, CustomResourceOptions? options = null)
        {
            return new MagicWanStaticRoute(name, id, state, options);
        }
    }

    public sealed class MagicWanStaticRouteArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        [Input("coloNames")]
        private InputList<string>? _coloNames;

        /// <summary>
        /// List of Cloudflare colocation regions for this static route.
        /// </summary>
        public InputList<string> ColoNames
        {
            get => _coloNames ?? (_coloNames = new InputList<string>());
            set => _coloNames = value;
        }

        [Input("coloRegions")]
        private InputList<string>? _coloRegions;

        /// <summary>
        /// List of Cloudflare colocation names for this static route.
        /// </summary>
        public InputList<string> ColoRegions
        {
            get => _coloRegions ?? (_coloRegions = new InputList<string>());
            set => _coloRegions = value;
        }

        /// <summary>
        /// Description of the static route.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The nexthop IP address where traffic will be routed to.
        /// </summary>
        [Input("nexthop", required: true)]
        public Input<string> Nexthop { get; set; } = null!;

        /// <summary>
        /// Your network prefix using CIDR notation.
        /// </summary>
        [Input("prefix", required: true)]
        public Input<string> Prefix { get; set; } = null!;

        /// <summary>
        /// The priority for the static route.
        /// </summary>
        [Input("priority", required: true)]
        public Input<int> Priority { get; set; } = null!;

        /// <summary>
        /// The optional weight for ECMP routes. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("weight")]
        public Input<int>? Weight { get; set; }

        public MagicWanStaticRouteArgs()
        {
        }
        public static new MagicWanStaticRouteArgs Empty => new MagicWanStaticRouteArgs();
    }

    public sealed class MagicWanStaticRouteState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        [Input("coloNames")]
        private InputList<string>? _coloNames;

        /// <summary>
        /// List of Cloudflare colocation regions for this static route.
        /// </summary>
        public InputList<string> ColoNames
        {
            get => _coloNames ?? (_coloNames = new InputList<string>());
            set => _coloNames = value;
        }

        [Input("coloRegions")]
        private InputList<string>? _coloRegions;

        /// <summary>
        /// List of Cloudflare colocation names for this static route.
        /// </summary>
        public InputList<string> ColoRegions
        {
            get => _coloRegions ?? (_coloRegions = new InputList<string>());
            set => _coloRegions = value;
        }

        /// <summary>
        /// Description of the static route.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The nexthop IP address where traffic will be routed to.
        /// </summary>
        [Input("nexthop")]
        public Input<string>? Nexthop { get; set; }

        /// <summary>
        /// Your network prefix using CIDR notation.
        /// </summary>
        [Input("prefix")]
        public Input<string>? Prefix { get; set; }

        /// <summary>
        /// The priority for the static route.
        /// </summary>
        [Input("priority")]
        public Input<int>? Priority { get; set; }

        /// <summary>
        /// The optional weight for ECMP routes. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("weight")]
        public Input<int>? Weight { get; set; }

        public MagicWanStaticRouteState()
        {
        }
        public static new MagicWanStaticRouteState Empty => new MagicWanStaticRouteState();
    }
}
