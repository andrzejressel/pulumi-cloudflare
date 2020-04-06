// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    public static partial class Invokes
    {
        /// <summary>
        /// Use this data source to look up [WAF Rule Packages][1].
        /// 
        /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-cloudflare/blob/master/website/docs/d/waf_packages.html.md.
        /// </summary>
        [Obsolete("Use GetWafPackages.InvokeAsync() instead")]
        public static Task<GetWafPackagesResult> GetWafPackages(GetWafPackagesArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetWafPackagesResult>("cloudflare:index/getWafPackages:getWafPackages", args ?? InvokeArgs.Empty, options.WithVersion());
    }
    public static class GetWafPackages
    {
        /// <summary>
        /// Use this data source to look up [WAF Rule Packages][1].
        /// 
        /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-cloudflare/blob/master/website/docs/d/waf_packages.html.md.
        /// </summary>
        public static Task<GetWafPackagesResult> InvokeAsync(GetWafPackagesArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetWafPackagesResult>("cloudflare:index/getWafPackages:getWafPackages", args ?? InvokeArgs.Empty, options.WithVersion());
    }

    public sealed class GetWafPackagesArgs : Pulumi.InvokeArgs
    {
        [Input("filter")]
        public Inputs.GetWafPackagesFilterArgs? Filter { get; set; }

        [Input("zoneId", required: true)]
        public string ZoneId { get; set; } = null!;

        public GetWafPackagesArgs()
        {
        }
    }

    [OutputType]
    public sealed class GetWafPackagesResult
    {
        public readonly Outputs.GetWafPackagesFilterResult? Filter;
        public readonly ImmutableArray<Outputs.GetWafPackagesPackagesResult> Packages;
        public readonly string ZoneId;
        /// <summary>
        /// id is the provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetWafPackagesResult(
            Outputs.GetWafPackagesFilterResult? filter,
            ImmutableArray<Outputs.GetWafPackagesPackagesResult> packages,
            string zoneId,
            string id)
        {
            Filter = filter;
            Packages = packages;
            ZoneId = zoneId;
            Id = id;
        }
    }

    namespace Inputs
    {

    public sealed class GetWafPackagesFilterArgs : Pulumi.InvokeArgs
    {
        [Input("actionMode")]
        public string? ActionMode { get; set; }

        [Input("detectionMode")]
        public string? DetectionMode { get; set; }

        [Input("name")]
        public string? Name { get; set; }

        [Input("sensitivity")]
        public string? Sensitivity { get; set; }

        public GetWafPackagesFilterArgs()
        {
        }
    }
    }

    namespace Outputs
    {

    [OutputType]
    public sealed class GetWafPackagesFilterResult
    {
        public readonly string? ActionMode;
        public readonly string? DetectionMode;
        public readonly string? Name;
        public readonly string? Sensitivity;

        [OutputConstructor]
        private GetWafPackagesFilterResult(
            string? actionMode,
            string? detectionMode,
            string? name,
            string? sensitivity)
        {
            ActionMode = actionMode;
            DetectionMode = detectionMode;
            Name = name;
            Sensitivity = sensitivity;
        }
    }

    [OutputType]
    public sealed class GetWafPackagesPackagesResult
    {
        public readonly string? ActionMode;
        public readonly string? Description;
        public readonly string? DetectionMode;
        public readonly string? Id;
        public readonly string? Name;
        public readonly string? Sensitivity;

        [OutputConstructor]
        private GetWafPackagesPackagesResult(
            string? actionMode,
            string? description,
            string? detectionMode,
            string? id,
            string? name,
            string? sensitivity)
        {
            ActionMode = actionMode;
            Description = description;
            DetectionMode = detectionMode;
            Id = id;
            Name = name;
            Sensitivity = sensitivity;
        }
    }
    }
}
