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
    /// Provides a Cloudflare worker script resource. In order for a script to be active, you'll also need to setup a `cloudflare.WorkerRoute`.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Cloudflare = Pulumi.Cloudflare;
    /// using Std = Pulumi.Std;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var myNamespace = new Cloudflare.WorkersKvNamespace("my_namespace", new()
    ///     {
    ///         AccountId = "f037e56e89293a057740de681ac9abbe",
    ///         Title = "example",
    ///     });
    /// 
    ///     // Sets the script with the name "script_1"
    ///     var myScript = new Cloudflare.WorkersScript("my_script", new()
    ///     {
    ///         AccountId = "f037e56e89293a057740de681ac9abbe",
    ///         Name = "script_1",
    ///         Content = Std.File.Invoke(new()
    ///         {
    ///             Input = "script.js",
    ///         }).Apply(invoke =&gt; invoke.Result),
    ///         KvNamespaceBindings = new[]
    ///         {
    ///             new Cloudflare.Inputs.WorkersScriptKvNamespaceBindingArgs
    ///             {
    ///                 Name = "MY_EXAMPLE_KV_NAMESPACE",
    ///                 NamespaceId = myNamespace.Id,
    ///             },
    ///         },
    ///         PlainTextBindings = new[]
    ///         {
    ///             new Cloudflare.Inputs.WorkersScriptPlainTextBindingArgs
    ///             {
    ///                 Name = "MY_EXAMPLE_PLAIN_TEXT",
    ///                 Text = "foobar",
    ///             },
    ///         },
    ///         SecretTextBindings = new[]
    ///         {
    ///             new Cloudflare.Inputs.WorkersScriptSecretTextBindingArgs
    ///             {
    ///                 Name = "MY_EXAMPLE_SECRET_TEXT",
    ///                 Text = secretFooValue,
    ///             },
    ///         },
    ///         WebassemblyBindings = new[]
    ///         {
    ///             new Cloudflare.Inputs.WorkersScriptWebassemblyBindingArgs
    ///             {
    ///                 Name = "MY_EXAMPLE_WASM",
    ///                 Module = Std.Filebase64.Invoke(new()
    ///                 {
    ///                     Input = "example.wasm",
    ///                 }).Apply(invoke =&gt; invoke.Result),
    ///             },
    ///         },
    ///         ServiceBindings = new[]
    ///         {
    ///             new Cloudflare.Inputs.WorkersScriptServiceBindingArgs
    ///             {
    ///                 Name = "MY_SERVICE_BINDING",
    ///                 Service = "MY_SERVICE",
    ///                 Environment = "production",
    ///             },
    ///         },
    ///         R2BucketBindings = new[]
    ///         {
    ///             new Cloudflare.Inputs.WorkersScriptR2BucketBindingArgs
    ///             {
    ///                 Name = "MY_BUCKET",
    ///                 BucketName = "MY_BUCKET_NAME",
    ///             },
    ///         },
    ///         AnalyticsEngineBindings = new[]
    ///         {
    ///             new Cloudflare.Inputs.WorkersScriptAnalyticsEngineBindingArgs
    ///             {
    ///                 Name = "MY_DATASET",
    ///                 Dataset = "dataset1",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import cloudflare:index/workersScript:WorkersScript example &lt;account_id&gt;/&lt;script_name&gt;
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/workersScript:WorkersScript")]
    public partial class WorkersScript : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        [Output("analyticsEngineBindings")]
        public Output<ImmutableArray<Outputs.WorkersScriptAnalyticsEngineBinding>> AnalyticsEngineBindings { get; private set; } = null!;

        /// <summary>
        /// The date to use for the compatibility flag.
        /// </summary>
        [Output("compatibilityDate")]
        public Output<string?> CompatibilityDate { get; private set; } = null!;

        /// <summary>
        /// Compatibility flags used for Worker Scripts.
        /// </summary>
        [Output("compatibilityFlags")]
        public Output<ImmutableArray<string>> CompatibilityFlags { get; private set; } = null!;

        /// <summary>
        /// The script content.
        /// </summary>
        [Output("content")]
        public Output<string> Content { get; private set; } = null!;

        [Output("d1DatabaseBindings")]
        public Output<ImmutableArray<Outputs.WorkersScriptD1DatabaseBinding>> D1DatabaseBindings { get; private set; } = null!;

        /// <summary>
        /// Name of the Workers for Platforms dispatch namespace.
        /// </summary>
        [Output("dispatchNamespace")]
        public Output<string?> DispatchNamespace { get; private set; } = null!;

        [Output("kvNamespaceBindings")]
        public Output<ImmutableArray<Outputs.WorkersScriptKvNamespaceBinding>> KvNamespaceBindings { get; private set; } = null!;

        /// <summary>
        /// Enabling allows Worker events to be sent to a defined Logpush destination.
        /// </summary>
        [Output("logpush")]
        public Output<bool?> Logpush { get; private set; } = null!;

        /// <summary>
        /// Whether to upload Worker as a module.
        /// </summary>
        [Output("module")]
        public Output<bool?> Module { get; private set; } = null!;

        /// <summary>
        /// The name for the script. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("placements")]
        public Output<ImmutableArray<Outputs.WorkersScriptPlacement>> Placements { get; private set; } = null!;

        [Output("plainTextBindings")]
        public Output<ImmutableArray<Outputs.WorkersScriptPlainTextBinding>> PlainTextBindings { get; private set; } = null!;

        [Output("queueBindings")]
        public Output<ImmutableArray<Outputs.WorkersScriptQueueBinding>> QueueBindings { get; private set; } = null!;

        [Output("r2BucketBindings")]
        public Output<ImmutableArray<Outputs.WorkersScriptR2BucketBinding>> R2BucketBindings { get; private set; } = null!;

        [Output("secretTextBindings")]
        public Output<ImmutableArray<Outputs.WorkersScriptSecretTextBinding>> SecretTextBindings { get; private set; } = null!;

        [Output("serviceBindings")]
        public Output<ImmutableArray<Outputs.WorkersScriptServiceBinding>> ServiceBindings { get; private set; } = null!;

        [Output("tags")]
        public Output<ImmutableArray<string>> Tags { get; private set; } = null!;

        [Output("webassemblyBindings")]
        public Output<ImmutableArray<Outputs.WorkersScriptWebassemblyBinding>> WebassemblyBindings { get; private set; } = null!;


        /// <summary>
        /// Create a WorkersScript resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public WorkersScript(string name, WorkersScriptArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/workersScript:WorkersScript", name, args ?? new WorkersScriptArgs(), MakeResourceOptions(options, ""))
        {
        }

        private WorkersScript(string name, Input<string> id, WorkersScriptState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/workersScript:WorkersScript", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing WorkersScript resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static WorkersScript Get(string name, Input<string> id, WorkersScriptState? state = null, CustomResourceOptions? options = null)
        {
            return new WorkersScript(name, id, state, options);
        }
    }

    public sealed class WorkersScriptArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        [Input("analyticsEngineBindings")]
        private InputList<Inputs.WorkersScriptAnalyticsEngineBindingArgs>? _analyticsEngineBindings;
        public InputList<Inputs.WorkersScriptAnalyticsEngineBindingArgs> AnalyticsEngineBindings
        {
            get => _analyticsEngineBindings ?? (_analyticsEngineBindings = new InputList<Inputs.WorkersScriptAnalyticsEngineBindingArgs>());
            set => _analyticsEngineBindings = value;
        }

        /// <summary>
        /// The date to use for the compatibility flag.
        /// </summary>
        [Input("compatibilityDate")]
        public Input<string>? CompatibilityDate { get; set; }

        [Input("compatibilityFlags")]
        private InputList<string>? _compatibilityFlags;

        /// <summary>
        /// Compatibility flags used for Worker Scripts.
        /// </summary>
        public InputList<string> CompatibilityFlags
        {
            get => _compatibilityFlags ?? (_compatibilityFlags = new InputList<string>());
            set => _compatibilityFlags = value;
        }

        /// <summary>
        /// The script content.
        /// </summary>
        [Input("content", required: true)]
        public Input<string> Content { get; set; } = null!;

        [Input("d1DatabaseBindings")]
        private InputList<Inputs.WorkersScriptD1DatabaseBindingArgs>? _d1DatabaseBindings;
        public InputList<Inputs.WorkersScriptD1DatabaseBindingArgs> D1DatabaseBindings
        {
            get => _d1DatabaseBindings ?? (_d1DatabaseBindings = new InputList<Inputs.WorkersScriptD1DatabaseBindingArgs>());
            set => _d1DatabaseBindings = value;
        }

        /// <summary>
        /// Name of the Workers for Platforms dispatch namespace.
        /// </summary>
        [Input("dispatchNamespace")]
        public Input<string>? DispatchNamespace { get; set; }

        [Input("kvNamespaceBindings")]
        private InputList<Inputs.WorkersScriptKvNamespaceBindingArgs>? _kvNamespaceBindings;
        public InputList<Inputs.WorkersScriptKvNamespaceBindingArgs> KvNamespaceBindings
        {
            get => _kvNamespaceBindings ?? (_kvNamespaceBindings = new InputList<Inputs.WorkersScriptKvNamespaceBindingArgs>());
            set => _kvNamespaceBindings = value;
        }

        /// <summary>
        /// Enabling allows Worker events to be sent to a defined Logpush destination.
        /// </summary>
        [Input("logpush")]
        public Input<bool>? Logpush { get; set; }

        /// <summary>
        /// Whether to upload Worker as a module.
        /// </summary>
        [Input("module")]
        public Input<bool>? Module { get; set; }

        /// <summary>
        /// The name for the script. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("placements")]
        private InputList<Inputs.WorkersScriptPlacementArgs>? _placements;
        public InputList<Inputs.WorkersScriptPlacementArgs> Placements
        {
            get => _placements ?? (_placements = new InputList<Inputs.WorkersScriptPlacementArgs>());
            set => _placements = value;
        }

        [Input("plainTextBindings")]
        private InputList<Inputs.WorkersScriptPlainTextBindingArgs>? _plainTextBindings;
        public InputList<Inputs.WorkersScriptPlainTextBindingArgs> PlainTextBindings
        {
            get => _plainTextBindings ?? (_plainTextBindings = new InputList<Inputs.WorkersScriptPlainTextBindingArgs>());
            set => _plainTextBindings = value;
        }

        [Input("queueBindings")]
        private InputList<Inputs.WorkersScriptQueueBindingArgs>? _queueBindings;
        public InputList<Inputs.WorkersScriptQueueBindingArgs> QueueBindings
        {
            get => _queueBindings ?? (_queueBindings = new InputList<Inputs.WorkersScriptQueueBindingArgs>());
            set => _queueBindings = value;
        }

        [Input("r2BucketBindings")]
        private InputList<Inputs.WorkersScriptR2BucketBindingArgs>? _r2BucketBindings;
        public InputList<Inputs.WorkersScriptR2BucketBindingArgs> R2BucketBindings
        {
            get => _r2BucketBindings ?? (_r2BucketBindings = new InputList<Inputs.WorkersScriptR2BucketBindingArgs>());
            set => _r2BucketBindings = value;
        }

        [Input("secretTextBindings")]
        private InputList<Inputs.WorkersScriptSecretTextBindingArgs>? _secretTextBindings;
        public InputList<Inputs.WorkersScriptSecretTextBindingArgs> SecretTextBindings
        {
            get => _secretTextBindings ?? (_secretTextBindings = new InputList<Inputs.WorkersScriptSecretTextBindingArgs>());
            set => _secretTextBindings = value;
        }

        [Input("serviceBindings")]
        private InputList<Inputs.WorkersScriptServiceBindingArgs>? _serviceBindings;
        public InputList<Inputs.WorkersScriptServiceBindingArgs> ServiceBindings
        {
            get => _serviceBindings ?? (_serviceBindings = new InputList<Inputs.WorkersScriptServiceBindingArgs>());
            set => _serviceBindings = value;
        }

        [Input("tags")]
        private InputList<string>? _tags;
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        [Input("webassemblyBindings")]
        private InputList<Inputs.WorkersScriptWebassemblyBindingArgs>? _webassemblyBindings;
        public InputList<Inputs.WorkersScriptWebassemblyBindingArgs> WebassemblyBindings
        {
            get => _webassemblyBindings ?? (_webassemblyBindings = new InputList<Inputs.WorkersScriptWebassemblyBindingArgs>());
            set => _webassemblyBindings = value;
        }

        public WorkersScriptArgs()
        {
        }
        public static new WorkersScriptArgs Empty => new WorkersScriptArgs();
    }

    public sealed class WorkersScriptState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        [Input("analyticsEngineBindings")]
        private InputList<Inputs.WorkersScriptAnalyticsEngineBindingGetArgs>? _analyticsEngineBindings;
        public InputList<Inputs.WorkersScriptAnalyticsEngineBindingGetArgs> AnalyticsEngineBindings
        {
            get => _analyticsEngineBindings ?? (_analyticsEngineBindings = new InputList<Inputs.WorkersScriptAnalyticsEngineBindingGetArgs>());
            set => _analyticsEngineBindings = value;
        }

        /// <summary>
        /// The date to use for the compatibility flag.
        /// </summary>
        [Input("compatibilityDate")]
        public Input<string>? CompatibilityDate { get; set; }

        [Input("compatibilityFlags")]
        private InputList<string>? _compatibilityFlags;

        /// <summary>
        /// Compatibility flags used for Worker Scripts.
        /// </summary>
        public InputList<string> CompatibilityFlags
        {
            get => _compatibilityFlags ?? (_compatibilityFlags = new InputList<string>());
            set => _compatibilityFlags = value;
        }

        /// <summary>
        /// The script content.
        /// </summary>
        [Input("content")]
        public Input<string>? Content { get; set; }

        [Input("d1DatabaseBindings")]
        private InputList<Inputs.WorkersScriptD1DatabaseBindingGetArgs>? _d1DatabaseBindings;
        public InputList<Inputs.WorkersScriptD1DatabaseBindingGetArgs> D1DatabaseBindings
        {
            get => _d1DatabaseBindings ?? (_d1DatabaseBindings = new InputList<Inputs.WorkersScriptD1DatabaseBindingGetArgs>());
            set => _d1DatabaseBindings = value;
        }

        /// <summary>
        /// Name of the Workers for Platforms dispatch namespace.
        /// </summary>
        [Input("dispatchNamespace")]
        public Input<string>? DispatchNamespace { get; set; }

        [Input("kvNamespaceBindings")]
        private InputList<Inputs.WorkersScriptKvNamespaceBindingGetArgs>? _kvNamespaceBindings;
        public InputList<Inputs.WorkersScriptKvNamespaceBindingGetArgs> KvNamespaceBindings
        {
            get => _kvNamespaceBindings ?? (_kvNamespaceBindings = new InputList<Inputs.WorkersScriptKvNamespaceBindingGetArgs>());
            set => _kvNamespaceBindings = value;
        }

        /// <summary>
        /// Enabling allows Worker events to be sent to a defined Logpush destination.
        /// </summary>
        [Input("logpush")]
        public Input<bool>? Logpush { get; set; }

        /// <summary>
        /// Whether to upload Worker as a module.
        /// </summary>
        [Input("module")]
        public Input<bool>? Module { get; set; }

        /// <summary>
        /// The name for the script. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("placements")]
        private InputList<Inputs.WorkersScriptPlacementGetArgs>? _placements;
        public InputList<Inputs.WorkersScriptPlacementGetArgs> Placements
        {
            get => _placements ?? (_placements = new InputList<Inputs.WorkersScriptPlacementGetArgs>());
            set => _placements = value;
        }

        [Input("plainTextBindings")]
        private InputList<Inputs.WorkersScriptPlainTextBindingGetArgs>? _plainTextBindings;
        public InputList<Inputs.WorkersScriptPlainTextBindingGetArgs> PlainTextBindings
        {
            get => _plainTextBindings ?? (_plainTextBindings = new InputList<Inputs.WorkersScriptPlainTextBindingGetArgs>());
            set => _plainTextBindings = value;
        }

        [Input("queueBindings")]
        private InputList<Inputs.WorkersScriptQueueBindingGetArgs>? _queueBindings;
        public InputList<Inputs.WorkersScriptQueueBindingGetArgs> QueueBindings
        {
            get => _queueBindings ?? (_queueBindings = new InputList<Inputs.WorkersScriptQueueBindingGetArgs>());
            set => _queueBindings = value;
        }

        [Input("r2BucketBindings")]
        private InputList<Inputs.WorkersScriptR2BucketBindingGetArgs>? _r2BucketBindings;
        public InputList<Inputs.WorkersScriptR2BucketBindingGetArgs> R2BucketBindings
        {
            get => _r2BucketBindings ?? (_r2BucketBindings = new InputList<Inputs.WorkersScriptR2BucketBindingGetArgs>());
            set => _r2BucketBindings = value;
        }

        [Input("secretTextBindings")]
        private InputList<Inputs.WorkersScriptSecretTextBindingGetArgs>? _secretTextBindings;
        public InputList<Inputs.WorkersScriptSecretTextBindingGetArgs> SecretTextBindings
        {
            get => _secretTextBindings ?? (_secretTextBindings = new InputList<Inputs.WorkersScriptSecretTextBindingGetArgs>());
            set => _secretTextBindings = value;
        }

        [Input("serviceBindings")]
        private InputList<Inputs.WorkersScriptServiceBindingGetArgs>? _serviceBindings;
        public InputList<Inputs.WorkersScriptServiceBindingGetArgs> ServiceBindings
        {
            get => _serviceBindings ?? (_serviceBindings = new InputList<Inputs.WorkersScriptServiceBindingGetArgs>());
            set => _serviceBindings = value;
        }

        [Input("tags")]
        private InputList<string>? _tags;
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        [Input("webassemblyBindings")]
        private InputList<Inputs.WorkersScriptWebassemblyBindingGetArgs>? _webassemblyBindings;
        public InputList<Inputs.WorkersScriptWebassemblyBindingGetArgs> WebassemblyBindings
        {
            get => _webassemblyBindings ?? (_webassemblyBindings = new InputList<Inputs.WorkersScriptWebassemblyBindingGetArgs>());
            set => _webassemblyBindings = value;
        }

        public WorkersScriptState()
        {
        }
        public static new WorkersScriptState Empty => new WorkersScriptState();
    }
}
