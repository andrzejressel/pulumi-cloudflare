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
    /// Provides a Cloudflare Teams List resource. Teams lists are
    /// referenced when creating secure web gateway policies or device
    /// posture rules.
    /// 
    /// ## Example Usage
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Cloudflare = Pulumi.Cloudflare;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Cloudflare.TeamsList("example", new()
    ///     {
    ///         AccountId = "f037e56e89293a057740de681ac9abbe",
    ///         Name = "Corporate devices",
    ///         Type = "SERIAL",
    ///         Description = "Serial numbers for all corporate devices.",
    ///         Items = new[]
    ///         {
    ///             "8GE8721REF",
    ///             "5RE8543EGG",
    ///             "1YE2880LNP",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import cloudflare:index/teamsList:TeamsList example &lt;account_id&gt;/&lt;teams_list_id&gt;
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/teamsList:TeamsList")]
    public partial class TeamsList : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        /// <summary>
        /// The description of the teams list.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The items of the teams list.
        /// </summary>
        [Output("items")]
        public Output<ImmutableArray<string>> Items { get; private set; } = null!;

        /// <summary>
        /// Name of the teams list.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The teams list type. Available values: `IP`, `SERIAL`, `URL`, `DOMAIN`, `EMAIL`.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;


        /// <summary>
        /// Create a TeamsList resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public TeamsList(string name, TeamsListArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/teamsList:TeamsList", name, args ?? new TeamsListArgs(), MakeResourceOptions(options, ""))
        {
        }

        private TeamsList(string name, Input<string> id, TeamsListState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/teamsList:TeamsList", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing TeamsList resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static TeamsList Get(string name, Input<string> id, TeamsListState? state = null, CustomResourceOptions? options = null)
        {
            return new TeamsList(name, id, state, options);
        }
    }

    public sealed class TeamsListArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        /// <summary>
        /// The description of the teams list.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("items")]
        private InputList<string>? _items;

        /// <summary>
        /// The items of the teams list.
        /// </summary>
        public InputList<string> Items
        {
            get => _items ?? (_items = new InputList<string>());
            set => _items = value;
        }

        /// <summary>
        /// Name of the teams list.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The teams list type. Available values: `IP`, `SERIAL`, `URL`, `DOMAIN`, `EMAIL`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public TeamsListArgs()
        {
        }
        public static new TeamsListArgs Empty => new TeamsListArgs();
    }

    public sealed class TeamsListState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// The description of the teams list.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("items")]
        private InputList<string>? _items;

        /// <summary>
        /// The items of the teams list.
        /// </summary>
        public InputList<string> Items
        {
            get => _items ?? (_items = new InputList<string>());
            set => _items = value;
        }

        /// <summary>
        /// Name of the teams list.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The teams list type. Available values: `IP`, `SERIAL`, `URL`, `DOMAIN`, `EMAIL`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public TeamsListState()
        {
        }
        public static new TeamsListState Empty => new TeamsListState();
    }
}
