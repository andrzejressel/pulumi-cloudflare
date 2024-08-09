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
    /// Provides a Cloudflare worker route resource. A route will also require a `cloudflare.WorkerScript`.
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
    ///     // Runs the specified worker script for all URLs that match `example.com/*`
    ///     var myRoute = new Cloudflare.WorkersRoute("my_route", new()
    ///     {
    ///         ZoneId = "0da42c8d2132a9ddaf714f9e7c920711",
    ///         Pattern = "example.com/*",
    ///         ScriptName = myScriptCloudflareWorkerScript.Name,
    ///     });
    /// 
    ///     var myScript = new Cloudflare.WorkersScript("my_script");
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import cloudflare:index/workersRoute:WorkersRoute example &lt;zone_id&gt;/&lt;route_id&gt;
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/workersRoute:WorkersRoute")]
    public partial class WorkersRoute : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The [route pattern](https://developers.cloudflare.com/workers/about/routes/) to associate the Worker with.
        /// </summary>
        [Output("pattern")]
        public Output<string> Pattern { get; private set; } = null!;

        /// <summary>
        /// Worker script name to invoke for requests that match the route pattern.
        /// </summary>
        [Output("scriptName")]
        public Output<string?> ScriptName { get; private set; } = null!;

        /// <summary>
        /// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("zoneId")]
        public Output<string> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a WorkersRoute resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public WorkersRoute(string name, WorkersRouteArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/workersRoute:WorkersRoute", name, args ?? new WorkersRouteArgs(), MakeResourceOptions(options, ""))
        {
        }

        private WorkersRoute(string name, Input<string> id, WorkersRouteState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/workersRoute:WorkersRoute", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing WorkersRoute resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static WorkersRoute Get(string name, Input<string> id, WorkersRouteState? state = null, CustomResourceOptions? options = null)
        {
            return new WorkersRoute(name, id, state, options);
        }
    }

    public sealed class WorkersRouteArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The [route pattern](https://developers.cloudflare.com/workers/about/routes/) to associate the Worker with.
        /// </summary>
        [Input("pattern", required: true)]
        public Input<string> Pattern { get; set; } = null!;

        /// <summary>
        /// Worker script name to invoke for requests that match the route pattern.
        /// </summary>
        [Input("scriptName")]
        public Input<string>? ScriptName { get; set; }

        /// <summary>
        /// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public WorkersRouteArgs()
        {
        }
        public static new WorkersRouteArgs Empty => new WorkersRouteArgs();
    }

    public sealed class WorkersRouteState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The [route pattern](https://developers.cloudflare.com/workers/about/routes/) to associate the Worker with.
        /// </summary>
        [Input("pattern")]
        public Input<string>? Pattern { get; set; }

        /// <summary>
        /// Worker script name to invoke for requests that match the route pattern.
        /// </summary>
        [Input("scriptName")]
        public Input<string>? ScriptName { get; set; }

        /// <summary>
        /// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public WorkersRouteState()
        {
        }
        public static new WorkersRouteState Empty => new WorkersRouteState();
    }
}
