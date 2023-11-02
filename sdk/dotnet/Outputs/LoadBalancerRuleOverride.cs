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
    public sealed class LoadBalancerRuleOverride
    {
        /// <summary>
        /// Controls features that modify the routing of requests to pools and origins in response to dynamic conditions, such as during the interval between active health monitoring requests.
        /// </summary>
        public readonly ImmutableArray<Outputs.LoadBalancerRuleOverrideAdaptiveRouting> AdaptiveRoutings;
        /// <summary>
        /// A set containing mappings of country codes to a list of pool IDs (ordered by their failover priority) for the given country.
        /// </summary>
        public readonly ImmutableArray<Outputs.LoadBalancerRuleOverrideCountryPool> CountryPools;
        /// <summary>
        /// A list of pool IDs ordered by their failover priority. Used whenever `pop_pools`/`country_pools`/`region_pools` are not defined.
        /// </summary>
        public readonly ImmutableArray<string> DefaultPools;
        /// <summary>
        /// The pool ID to use when all other pools are detected as unhealthy.
        /// </summary>
        public readonly string? FallbackPool;
        /// <summary>
        /// Controls location-based steering for non-proxied requests.
        /// </summary>
        public readonly ImmutableArray<Outputs.LoadBalancerRuleOverrideLocationStrategy> LocationStrategies;
        /// <summary>
        /// A set containing mappings of Cloudflare Point-of-Presence (PoP) identifiers to a list of pool IDs (ordered by their failover priority) for the PoP (datacenter). This feature is only available to enterprise customers.
        /// </summary>
        public readonly ImmutableArray<Outputs.LoadBalancerRuleOverridePopPool> PopPools;
        /// <summary>
        /// Configures pool weights. When `steering_policy="random"`, a random pool is selected with probability proportional to pool weights. When `steering_policy="least_outstanding_requests"`, pool weights are used to scale each pool's outstanding requests. When `steering_policy="least_connections"`, pool weights are used to scale each pool's open connections.
        /// </summary>
        public readonly ImmutableArray<Outputs.LoadBalancerRuleOverrideRandomSteering> RandomSteerings;
        /// <summary>
        /// A set containing mappings of region codes to a list of pool IDs (ordered by their failover priority) for the given region.
        /// </summary>
        public readonly ImmutableArray<Outputs.LoadBalancerRuleOverrideRegionPool> RegionPools;
        /// <summary>
        /// Configure attributes for session affinity.
        /// </summary>
        public readonly string? SessionAffinity;
        /// <summary>
        /// Configure attributes for session affinity. Note that the property `drain_duration` is not currently supported as a rule override.
        /// </summary>
        public readonly ImmutableArray<Outputs.LoadBalancerRuleOverrideSessionAffinityAttribute> SessionAffinityAttributes;
        /// <summary>
        /// Time, in seconds, until this load balancer's session affinity cookie expires after being created. This parameter is ignored unless a supported session affinity policy is set. The current default of `82800` (23 hours) will be used unless `session_affinity_ttl` is explicitly set. Once the expiry time has been reached, subsequent requests may get sent to a different origin server. Valid values are between `1800` and `604800`.
        /// </summary>
        public readonly int? SessionAffinityTtl;
        /// <summary>
        /// The method the load balancer uses to determine the route to your origin. Value `off` uses `default_pool_ids`. Value `geo` uses `pop_pools`/`country_pools`/`region_pools`. For non-proxied requests, the `country` for `country_pools` is determined by `location_strategy`. Value `random` selects a pool randomly. Value `dynamic_latency` uses round trip time to select the closest pool in `default_pool_ids` (requires pool health checks). Value `proximity` uses the pools' latitude and longitude to select the closest pool using the Cloudflare PoP location for proxied requests or the location determined by `location_strategy` for non-proxied requests. Value `least_outstanding_requests` selects a pool by taking into consideration `random_steering` weights, as well as each pool's number of outstanding requests. Pools with more pending requests are weighted proportionately less relative to others. Value `least_connections` selects a pool by taking into consideration `random_steering` weights, as well as each pool's number of open connections. Pools with more open connections are weighted proportionately less relative to others. Supported for HTTP/1 and HTTP/2 connections. Value `""` maps to `geo` if you use `pop_pools`/`country_pools`/`region_pools` otherwise `off`. Available values: `off`, `geo`, `dynamic_latency`, `random`, `proximity`, `least_outstanding_requests`, `least_connections`, `""` Defaults to `""`.
        /// </summary>
        public readonly string? SteeringPolicy;
        /// <summary>
        /// Time to live (TTL) of the DNS entry for the IP address returned by this load balancer. This cannot be set for proxied load balancers. Defaults to `30`.
        /// </summary>
        public readonly int? Ttl;

        [OutputConstructor]
        private LoadBalancerRuleOverride(
            ImmutableArray<Outputs.LoadBalancerRuleOverrideAdaptiveRouting> adaptiveRoutings,

            ImmutableArray<Outputs.LoadBalancerRuleOverrideCountryPool> countryPools,

            ImmutableArray<string> defaultPools,

            string? fallbackPool,

            ImmutableArray<Outputs.LoadBalancerRuleOverrideLocationStrategy> locationStrategies,

            ImmutableArray<Outputs.LoadBalancerRuleOverridePopPool> popPools,

            ImmutableArray<Outputs.LoadBalancerRuleOverrideRandomSteering> randomSteerings,

            ImmutableArray<Outputs.LoadBalancerRuleOverrideRegionPool> regionPools,

            string? sessionAffinity,

            ImmutableArray<Outputs.LoadBalancerRuleOverrideSessionAffinityAttribute> sessionAffinityAttributes,

            int? sessionAffinityTtl,

            string? steeringPolicy,

            int? ttl)
        {
            AdaptiveRoutings = adaptiveRoutings;
            CountryPools = countryPools;
            DefaultPools = defaultPools;
            FallbackPool = fallbackPool;
            LocationStrategies = locationStrategies;
            PopPools = popPools;
            RandomSteerings = randomSteerings;
            RegionPools = regionPools;
            SessionAffinity = sessionAffinity;
            SessionAffinityAttributes = sessionAffinityAttributes;
            SessionAffinityTtl = sessionAffinityTtl;
            SteeringPolicy = steeringPolicy;
            Ttl = ttl;
        }
    }
}
