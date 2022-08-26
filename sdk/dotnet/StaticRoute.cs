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
    /// Provides a resource, that manages Cloudflare static routes for Magic Transit or Magic WAN.
    /// Static routes are used to route traffic through GRE tunnels.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Cloudflare = Pulumi.Cloudflare;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Cloudflare.StaticRoute("example", new()
    ///     {
    ///         AccountId = "c4a7362d577a6c3019a474fd6f485821",
    ///         ColoNames = new[]
    ///         {
    ///             "den01",
    ///         },
    ///         ColoRegions = new[]
    ///         {
    ///             "APAC",
    ///         },
    ///         Description = "New route for new prefix 192.0.2.0/24",
    ///         Nexthop = "10.0.0.0",
    ///         Prefix = "192.0.2.0/24",
    ///         Priority = 100,
    ///         Weight = 10,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// An existing static route can be imported using the account ID and static route ID
    /// 
    /// ```sh
    ///  $ pulumi import cloudflare:index/staticRoute:StaticRoute example d41d8cd98f00b204e9800998ecf8427e/cb029e245cfdd66dc8d2e570d5dd3322
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/staticRoute:StaticRoute")]
    public partial class StaticRoute : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the account where the static route is being created.
        /// </summary>
        [Output("accountId")]
        public Output<string?> AccountId { get; private set; } = null!;

        /// <summary>
        /// Optional list of Cloudflare colocation names for this static route.
        /// </summary>
        [Output("coloNames")]
        public Output<ImmutableArray<string>> ColoNames { get; private set; } = null!;

        /// <summary>
        /// Optional list of Cloudflare colocation regions for this static route.
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
        /// The optional weight for ECMP routes.
        /// </summary>
        [Output("weight")]
        public Output<int?> Weight { get; private set; } = null!;


        /// <summary>
        /// Create a StaticRoute resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public StaticRoute(string name, StaticRouteArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/staticRoute:StaticRoute", name, args ?? new StaticRouteArgs(), MakeResourceOptions(options, ""))
        {
        }

        private StaticRoute(string name, Input<string> id, StaticRouteState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/staticRoute:StaticRoute", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing StaticRoute resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static StaticRoute Get(string name, Input<string> id, StaticRouteState? state = null, CustomResourceOptions? options = null)
        {
            return new StaticRoute(name, id, state, options);
        }
    }

    public sealed class StaticRouteArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the account where the static route is being created.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        [Input("coloNames")]
        private InputList<string>? _coloNames;

        /// <summary>
        /// Optional list of Cloudflare colocation names for this static route.
        /// </summary>
        public InputList<string> ColoNames
        {
            get => _coloNames ?? (_coloNames = new InputList<string>());
            set => _coloNames = value;
        }

        [Input("coloRegions")]
        private InputList<string>? _coloRegions;

        /// <summary>
        /// Optional list of Cloudflare colocation regions for this static route.
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
        /// The optional weight for ECMP routes.
        /// </summary>
        [Input("weight")]
        public Input<int>? Weight { get; set; }

        public StaticRouteArgs()
        {
        }
        public static new StaticRouteArgs Empty => new StaticRouteArgs();
    }

    public sealed class StaticRouteState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the account where the static route is being created.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        [Input("coloNames")]
        private InputList<string>? _coloNames;

        /// <summary>
        /// Optional list of Cloudflare colocation names for this static route.
        /// </summary>
        public InputList<string> ColoNames
        {
            get => _coloNames ?? (_coloNames = new InputList<string>());
            set => _coloNames = value;
        }

        [Input("coloRegions")]
        private InputList<string>? _coloRegions;

        /// <summary>
        /// Optional list of Cloudflare colocation regions for this static route.
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
        /// The optional weight for ECMP routes.
        /// </summary>
        [Input("weight")]
        public Input<int>? Weight { get; set; }

        public StaticRouteState()
        {
        }
        public static new StaticRouteState Empty => new StaticRouteState();
    }
}
