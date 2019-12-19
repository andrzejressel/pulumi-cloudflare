// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    /// <summary>
    /// Provides a Cloudflare Load Balancer resource. This sits in front of a number of defined pools of origins and provides various options for geographically-aware load balancing. Note that the load balancing feature must be enabled in your Clouflare account before you can use this resource.
    /// 
    /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-cloudflare/blob/master/website/docs/r/load_balancer.html.markdown.
    /// </summary>
    public partial class LoadBalancer : Pulumi.CustomResource
    {
        /// <summary>
        /// The RFC3339 timestamp of when the load balancer was created.
        /// </summary>
        [Output("createdOn")]
        public Output<string> CreatedOn { get; private set; } = null!;

        /// <summary>
        /// A list of pool IDs ordered by their failover priority. Used whenever region/pop pools are not defined.
        /// </summary>
        [Output("defaultPoolIds")]
        public Output<ImmutableArray<string>> DefaultPoolIds { get; private set; } = null!;

        /// <summary>
        /// Free text description.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Enable or disable the load balancer. Defaults to `true` (enabled).
        /// </summary>
        [Output("enabled")]
        public Output<bool?> Enabled { get; private set; } = null!;

        /// <summary>
        /// The pool ID to use when all other pools are detected as unhealthy.
        /// </summary>
        [Output("fallbackPoolId")]
        public Output<string> FallbackPoolId { get; private set; } = null!;

        /// <summary>
        /// The RFC3339 timestamp of when the load balancer was last modified.
        /// </summary>
        [Output("modifiedOn")]
        public Output<string> ModifiedOn { get; private set; } = null!;

        /// <summary>
        /// The DNS name (FQDN, including the zone) to associate with the load balancer.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// A set containing mappings of Cloudflare Point-of-Presence (PoP) identifiers to a list of pool IDs (ordered by their failover priority) for the PoP (datacenter). This feature is only available to enterprise customers. Fields documented below.
        /// </summary>
        [Output("popPools")]
        public Output<ImmutableArray<Outputs.LoadBalancerPopPools>> PopPools { get; private set; } = null!;

        /// <summary>
        /// Whether the hostname gets Cloudflare's origin protection. Defaults to `false`.
        /// </summary>
        [Output("proxied")]
        public Output<bool?> Proxied { get; private set; } = null!;

        /// <summary>
        /// A set containing mappings of region/country codes to a list of pool IDs (ordered by their failover priority) for the given region. Fields documented below.
        /// </summary>
        [Output("regionPools")]
        public Output<ImmutableArray<Outputs.LoadBalancerRegionPools>> RegionPools { get; private set; } = null!;

        /// <summary>
        /// Associates all requests coming from an end-user with a single origin. Cloudflare will set a cookie on the initial response to the client, such that consequent requests with the cookie in the request will go to the same origin, so long as it is available.
        /// </summary>
        [Output("sessionAffinity")]
        public Output<string?> SessionAffinity { get; private set; } = null!;

        /// <summary>
        /// Determine which method the load balancer uses to determine the fastest route to your origin. Valid values  are: `"off"`, `"geo"`, `"dynamic_latency"`, `"random"` or `""`. Default is `""`.
        /// </summary>
        [Output("steeringPolicy")]
        public Output<string> SteeringPolicy { get; private set; } = null!;

        /// <summary>
        /// Time to live (TTL) of this load balancer's DNS `name`. Conflicts with `proxied` - this cannot be set for proxied load balancers. Default is `30`.
        /// </summary>
        [Output("ttl")]
        public Output<int> Ttl { get; private set; } = null!;

        /// <summary>
        /// The zone ID to add the load balancer to.
        /// </summary>
        [Output("zoneId")]
        public Output<string> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a LoadBalancer resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public LoadBalancer(string name, LoadBalancerArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/loadBalancer:LoadBalancer", name, args ?? ResourceArgs.Empty, MakeResourceOptions(options, ""))
        {
        }

        private LoadBalancer(string name, Input<string> id, LoadBalancerState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/loadBalancer:LoadBalancer", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing LoadBalancer resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static LoadBalancer Get(string name, Input<string> id, LoadBalancerState? state = null, CustomResourceOptions? options = null)
        {
            return new LoadBalancer(name, id, state, options);
        }
    }

    public sealed class LoadBalancerArgs : Pulumi.ResourceArgs
    {
        [Input("defaultPoolIds", required: true)]
        private InputList<string>? _defaultPoolIds;

        /// <summary>
        /// A list of pool IDs ordered by their failover priority. Used whenever region/pop pools are not defined.
        /// </summary>
        public InputList<string> DefaultPoolIds
        {
            get => _defaultPoolIds ?? (_defaultPoolIds = new InputList<string>());
            set => _defaultPoolIds = value;
        }

        /// <summary>
        /// Free text description.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Enable or disable the load balancer. Defaults to `true` (enabled).
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// The pool ID to use when all other pools are detected as unhealthy.
        /// </summary>
        [Input("fallbackPoolId", required: true)]
        public Input<string> FallbackPoolId { get; set; } = null!;

        /// <summary>
        /// The DNS name (FQDN, including the zone) to associate with the load balancer.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("popPools")]
        private InputList<Inputs.LoadBalancerPopPoolsArgs>? _popPools;

        /// <summary>
        /// A set containing mappings of Cloudflare Point-of-Presence (PoP) identifiers to a list of pool IDs (ordered by their failover priority) for the PoP (datacenter). This feature is only available to enterprise customers. Fields documented below.
        /// </summary>
        public InputList<Inputs.LoadBalancerPopPoolsArgs> PopPools
        {
            get => _popPools ?? (_popPools = new InputList<Inputs.LoadBalancerPopPoolsArgs>());
            set => _popPools = value;
        }

        /// <summary>
        /// Whether the hostname gets Cloudflare's origin protection. Defaults to `false`.
        /// </summary>
        [Input("proxied")]
        public Input<bool>? Proxied { get; set; }

        [Input("regionPools")]
        private InputList<Inputs.LoadBalancerRegionPoolsArgs>? _regionPools;

        /// <summary>
        /// A set containing mappings of region/country codes to a list of pool IDs (ordered by their failover priority) for the given region. Fields documented below.
        /// </summary>
        public InputList<Inputs.LoadBalancerRegionPoolsArgs> RegionPools
        {
            get => _regionPools ?? (_regionPools = new InputList<Inputs.LoadBalancerRegionPoolsArgs>());
            set => _regionPools = value;
        }

        /// <summary>
        /// Associates all requests coming from an end-user with a single origin. Cloudflare will set a cookie on the initial response to the client, such that consequent requests with the cookie in the request will go to the same origin, so long as it is available.
        /// </summary>
        [Input("sessionAffinity")]
        public Input<string>? SessionAffinity { get; set; }

        /// <summary>
        /// Determine which method the load balancer uses to determine the fastest route to your origin. Valid values  are: `"off"`, `"geo"`, `"dynamic_latency"`, `"random"` or `""`. Default is `""`.
        /// </summary>
        [Input("steeringPolicy")]
        public Input<string>? SteeringPolicy { get; set; }

        /// <summary>
        /// Time to live (TTL) of this load balancer's DNS `name`. Conflicts with `proxied` - this cannot be set for proxied load balancers. Default is `30`.
        /// </summary>
        [Input("ttl")]
        public Input<int>? Ttl { get; set; }

        /// <summary>
        /// The zone ID to add the load balancer to.
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public LoadBalancerArgs()
        {
        }
    }

    public sealed class LoadBalancerState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The RFC3339 timestamp of when the load balancer was created.
        /// </summary>
        [Input("createdOn")]
        public Input<string>? CreatedOn { get; set; }

        [Input("defaultPoolIds")]
        private InputList<string>? _defaultPoolIds;

        /// <summary>
        /// A list of pool IDs ordered by their failover priority. Used whenever region/pop pools are not defined.
        /// </summary>
        public InputList<string> DefaultPoolIds
        {
            get => _defaultPoolIds ?? (_defaultPoolIds = new InputList<string>());
            set => _defaultPoolIds = value;
        }

        /// <summary>
        /// Free text description.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Enable or disable the load balancer. Defaults to `true` (enabled).
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// The pool ID to use when all other pools are detected as unhealthy.
        /// </summary>
        [Input("fallbackPoolId")]
        public Input<string>? FallbackPoolId { get; set; }

        /// <summary>
        /// The RFC3339 timestamp of when the load balancer was last modified.
        /// </summary>
        [Input("modifiedOn")]
        public Input<string>? ModifiedOn { get; set; }

        /// <summary>
        /// The DNS name (FQDN, including the zone) to associate with the load balancer.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("popPools")]
        private InputList<Inputs.LoadBalancerPopPoolsGetArgs>? _popPools;

        /// <summary>
        /// A set containing mappings of Cloudflare Point-of-Presence (PoP) identifiers to a list of pool IDs (ordered by their failover priority) for the PoP (datacenter). This feature is only available to enterprise customers. Fields documented below.
        /// </summary>
        public InputList<Inputs.LoadBalancerPopPoolsGetArgs> PopPools
        {
            get => _popPools ?? (_popPools = new InputList<Inputs.LoadBalancerPopPoolsGetArgs>());
            set => _popPools = value;
        }

        /// <summary>
        /// Whether the hostname gets Cloudflare's origin protection. Defaults to `false`.
        /// </summary>
        [Input("proxied")]
        public Input<bool>? Proxied { get; set; }

        [Input("regionPools")]
        private InputList<Inputs.LoadBalancerRegionPoolsGetArgs>? _regionPools;

        /// <summary>
        /// A set containing mappings of region/country codes to a list of pool IDs (ordered by their failover priority) for the given region. Fields documented below.
        /// </summary>
        public InputList<Inputs.LoadBalancerRegionPoolsGetArgs> RegionPools
        {
            get => _regionPools ?? (_regionPools = new InputList<Inputs.LoadBalancerRegionPoolsGetArgs>());
            set => _regionPools = value;
        }

        /// <summary>
        /// Associates all requests coming from an end-user with a single origin. Cloudflare will set a cookie on the initial response to the client, such that consequent requests with the cookie in the request will go to the same origin, so long as it is available.
        /// </summary>
        [Input("sessionAffinity")]
        public Input<string>? SessionAffinity { get; set; }

        /// <summary>
        /// Determine which method the load balancer uses to determine the fastest route to your origin. Valid values  are: `"off"`, `"geo"`, `"dynamic_latency"`, `"random"` or `""`. Default is `""`.
        /// </summary>
        [Input("steeringPolicy")]
        public Input<string>? SteeringPolicy { get; set; }

        /// <summary>
        /// Time to live (TTL) of this load balancer's DNS `name`. Conflicts with `proxied` - this cannot be set for proxied load balancers. Default is `30`.
        /// </summary>
        [Input("ttl")]
        public Input<int>? Ttl { get; set; }

        /// <summary>
        /// The zone ID to add the load balancer to.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public LoadBalancerState()
        {
        }
    }

    namespace Inputs
    {

    public sealed class LoadBalancerPopPoolsArgs : Pulumi.ResourceArgs
    {
        [Input("poolIds", required: true)]
        private InputList<string>? _poolIds;

        /// <summary>
        /// A list of pool IDs in failover priority to use for traffic reaching the given PoP.
        /// </summary>
        public InputList<string> PoolIds
        {
            get => _poolIds ?? (_poolIds = new InputList<string>());
            set => _poolIds = value;
        }

        /// <summary>
        /// A 3-letter code for the Point-of-Presence. Allowed values can be found in the list of datacenters on the [status page](https://www.cloudflarestatus.com/). Multiple entries should not be specified with the same PoP.
        /// </summary>
        [Input("pop", required: true)]
        public Input<string> Pop { get; set; } = null!;

        public LoadBalancerPopPoolsArgs()
        {
        }
    }

    public sealed class LoadBalancerPopPoolsGetArgs : Pulumi.ResourceArgs
    {
        [Input("poolIds", required: true)]
        private InputList<string>? _poolIds;

        /// <summary>
        /// A list of pool IDs in failover priority to use for traffic reaching the given PoP.
        /// </summary>
        public InputList<string> PoolIds
        {
            get => _poolIds ?? (_poolIds = new InputList<string>());
            set => _poolIds = value;
        }

        /// <summary>
        /// A 3-letter code for the Point-of-Presence. Allowed values can be found in the list of datacenters on the [status page](https://www.cloudflarestatus.com/). Multiple entries should not be specified with the same PoP.
        /// </summary>
        [Input("pop", required: true)]
        public Input<string> Pop { get; set; } = null!;

        public LoadBalancerPopPoolsGetArgs()
        {
        }
    }

    public sealed class LoadBalancerRegionPoolsArgs : Pulumi.ResourceArgs
    {
        [Input("poolIds", required: true)]
        private InputList<string>? _poolIds;

        /// <summary>
        /// A list of pool IDs in failover priority to use for traffic reaching the given PoP.
        /// </summary>
        public InputList<string> PoolIds
        {
            get => _poolIds ?? (_poolIds = new InputList<string>());
            set => _poolIds = value;
        }

        /// <summary>
        /// A region code which must be in the list defined [here](https://support.cloudflare.com/hc/en-us/articles/115000540888-Load-Balancing-Geographic-Regions). Multiple entries should not be specified with the same region.
        /// </summary>
        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        public LoadBalancerRegionPoolsArgs()
        {
        }
    }

    public sealed class LoadBalancerRegionPoolsGetArgs : Pulumi.ResourceArgs
    {
        [Input("poolIds", required: true)]
        private InputList<string>? _poolIds;

        /// <summary>
        /// A list of pool IDs in failover priority to use for traffic reaching the given PoP.
        /// </summary>
        public InputList<string> PoolIds
        {
            get => _poolIds ?? (_poolIds = new InputList<string>());
            set => _poolIds = value;
        }

        /// <summary>
        /// A region code which must be in the list defined [here](https://support.cloudflare.com/hc/en-us/articles/115000540888-Load-Balancing-Geographic-Regions). Multiple entries should not be specified with the same region.
        /// </summary>
        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        public LoadBalancerRegionPoolsGetArgs()
        {
        }
    }
    }

    namespace Outputs
    {

    [OutputType]
    public sealed class LoadBalancerPopPools
    {
        /// <summary>
        /// A list of pool IDs in failover priority to use for traffic reaching the given PoP.
        /// </summary>
        public readonly ImmutableArray<string> PoolIds;
        /// <summary>
        /// A 3-letter code for the Point-of-Presence. Allowed values can be found in the list of datacenters on the [status page](https://www.cloudflarestatus.com/). Multiple entries should not be specified with the same PoP.
        /// </summary>
        public readonly string Pop;

        [OutputConstructor]
        private LoadBalancerPopPools(
            ImmutableArray<string> poolIds,
            string pop)
        {
            PoolIds = poolIds;
            Pop = pop;
        }
    }

    [OutputType]
    public sealed class LoadBalancerRegionPools
    {
        /// <summary>
        /// A list of pool IDs in failover priority to use for traffic reaching the given PoP.
        /// </summary>
        public readonly ImmutableArray<string> PoolIds;
        /// <summary>
        /// A region code which must be in the list defined [here](https://support.cloudflare.com/hc/en-us/articles/115000540888-Load-Balancing-Geographic-Regions). Multiple entries should not be specified with the same region.
        /// </summary>
        public readonly string Region;

        [OutputConstructor]
        private LoadBalancerRegionPools(
            ImmutableArray<string> poolIds,
            string region)
        {
            PoolIds = poolIds;
            Region = region;
        }
    }
    }
}
