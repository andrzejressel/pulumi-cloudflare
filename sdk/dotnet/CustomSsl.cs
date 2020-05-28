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
    /// Provides a Cloudflare custom ssl resource.
    /// 
    /// ## Example Usage
    /// 
    /// 
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Cloudflare = Pulumi.Cloudflare;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var config = new Config();
    ///         var cloudflareZoneId = config.Get("cloudflareZoneId") ?? "1d5fdc9e88c8a8c4518b068cd94331fe";
    ///         // Add a custom ssl certificate to the domain
    ///         var foossl = new Cloudflare.CustomSsl("foossl", new Cloudflare.CustomSslArgs
    ///         {
    ///             CustomSslOptions = new Cloudflare.Inputs.CustomSslCustomSslOptionsArgs
    ///             {
    ///                 Bundle_method = "ubiquitous",
    ///                 Certificate = "-----INSERT CERTIFICATE-----",
    ///                 Geo_restrictions = "us",
    ///                 Private_key = "-----INSERT PRIVATE KEY-----",
    ///                 Type = "legacy_custom",
    ///             },
    ///             ZoneId = cloudflareZoneId,
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// </summary>
    public partial class CustomSsl : Pulumi.CustomResource
    {
        /// <summary>
        /// The certificate, private key and associated optional parameters, such as bundle_method, geo_restrictions, and type.
        /// </summary>
        [Output("customSslOptions")]
        public Output<Outputs.CustomSslCustomSslOptions?> CustomSslOptions { get; private set; } = null!;

        [Output("customSslPriorities")]
        public Output<ImmutableArray<Outputs.CustomSslCustomSslPriority>> CustomSslPriorities { get; private set; } = null!;

        [Output("expiresOn")]
        public Output<string> ExpiresOn { get; private set; } = null!;

        [Output("hosts")]
        public Output<ImmutableArray<string>> Hosts { get; private set; } = null!;

        [Output("issuer")]
        public Output<string> Issuer { get; private set; } = null!;

        [Output("modifiedOn")]
        public Output<string> ModifiedOn { get; private set; } = null!;

        [Output("priority")]
        public Output<int> Priority { get; private set; } = null!;

        [Output("signature")]
        public Output<string> Signature { get; private set; } = null!;

        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        [Output("uploadedOn")]
        public Output<string> UploadedOn { get; private set; } = null!;

        /// <summary>
        /// The DNS zone id to the custom ssl cert should be added.
        /// </summary>
        [Output("zoneId")]
        public Output<string> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a CustomSsl resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CustomSsl(string name, CustomSslArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/customSsl:CustomSsl", name, args ?? new CustomSslArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CustomSsl(string name, Input<string> id, CustomSslState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/customSsl:CustomSsl", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing CustomSsl resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CustomSsl Get(string name, Input<string> id, CustomSslState? state = null, CustomResourceOptions? options = null)
        {
            return new CustomSsl(name, id, state, options);
        }
    }

    public sealed class CustomSslArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The certificate, private key and associated optional parameters, such as bundle_method, geo_restrictions, and type.
        /// </summary>
        [Input("customSslOptions")]
        public Input<Inputs.CustomSslCustomSslOptionsArgs>? CustomSslOptions { get; set; }

        [Input("customSslPriorities")]
        private InputList<Inputs.CustomSslCustomSslPriorityArgs>? _customSslPriorities;
        public InputList<Inputs.CustomSslCustomSslPriorityArgs> CustomSslPriorities
        {
            get => _customSslPriorities ?? (_customSslPriorities = new InputList<Inputs.CustomSslCustomSslPriorityArgs>());
            set => _customSslPriorities = value;
        }

        /// <summary>
        /// The DNS zone id to the custom ssl cert should be added.
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public CustomSslArgs()
        {
        }
    }

    public sealed class CustomSslState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The certificate, private key and associated optional parameters, such as bundle_method, geo_restrictions, and type.
        /// </summary>
        [Input("customSslOptions")]
        public Input<Inputs.CustomSslCustomSslOptionsGetArgs>? CustomSslOptions { get; set; }

        [Input("customSslPriorities")]
        private InputList<Inputs.CustomSslCustomSslPriorityGetArgs>? _customSslPriorities;
        public InputList<Inputs.CustomSslCustomSslPriorityGetArgs> CustomSslPriorities
        {
            get => _customSslPriorities ?? (_customSslPriorities = new InputList<Inputs.CustomSslCustomSslPriorityGetArgs>());
            set => _customSslPriorities = value;
        }

        [Input("expiresOn")]
        public Input<string>? ExpiresOn { get; set; }

        [Input("hosts")]
        private InputList<string>? _hosts;
        public InputList<string> Hosts
        {
            get => _hosts ?? (_hosts = new InputList<string>());
            set => _hosts = value;
        }

        [Input("issuer")]
        public Input<string>? Issuer { get; set; }

        [Input("modifiedOn")]
        public Input<string>? ModifiedOn { get; set; }

        [Input("priority")]
        public Input<int>? Priority { get; set; }

        [Input("signature")]
        public Input<string>? Signature { get; set; }

        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("uploadedOn")]
        public Input<string>? UploadedOn { get; set; }

        /// <summary>
        /// The DNS zone id to the custom ssl cert should be added.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public CustomSslState()
        {
        }
    }
}
