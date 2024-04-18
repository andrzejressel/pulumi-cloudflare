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
    /// Provides a Cloudflare custom hostname (also known as SSL for SaaS) resource.
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
    ///     var example = new Cloudflare.CustomHostname("example", new()
    ///     {
    ///         ZoneId = "0da42c8d2132a9ddaf714f9e7c920711",
    ///         Hostname = "hostname.example.com",
    ///         Ssls = new[]
    ///         {
    ///             new Cloudflare.Inputs.CustomHostnameSslArgs
    ///             {
    ///                 Method = "txt",
    ///             },
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
    /// $ pulumi import cloudflare:index/customHostname:CustomHostname example 1d5fdc9e88c8a8c4518b068cd94331fe/0d89c70d-ad9f-4843-b99f-6cc0252067e9
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/customHostname:CustomHostname")]
    public partial class CustomHostname : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Custom metadata associated with custom hostname. Only supports primitive string values, all other values are accessible via the API directly.
        /// </summary>
        [Output("customMetadata")]
        public Output<ImmutableDictionary<string, string>?> CustomMetadata { get; private set; } = null!;

        /// <summary>
        /// The custom origin server used for certificates.
        /// </summary>
        [Output("customOriginServer")]
        public Output<string?> CustomOriginServer { get; private set; } = null!;

        /// <summary>
        /// The [custom origin SNI](https://developers.cloudflare.com/ssl/ssl-for-saas/hostname-specific-behavior/custom-origin) used for certificates.
        /// </summary>
        [Output("customOriginSni")]
        public Output<string?> CustomOriginSni { get; private set; } = null!;

        /// <summary>
        /// Hostname you intend to request a certificate for. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("hostname")]
        public Output<string> Hostname { get; private set; } = null!;

        [Output("ownershipVerification")]
        public Output<ImmutableDictionary<string, string>> OwnershipVerification { get; private set; } = null!;

        [Output("ownershipVerificationHttp")]
        public Output<ImmutableDictionary<string, string>> OwnershipVerificationHttp { get; private set; } = null!;

        /// <summary>
        /// SSL properties used when creating the custom hostname.
        /// </summary>
        [Output("ssls")]
        public Output<ImmutableArray<Outputs.CustomHostnameSsl>> Ssls { get; private set; } = null!;

        /// <summary>
        /// Status of the certificate.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// Whether to wait for a custom hostname SSL sub-object to reach status `pending_validation` during creation. Defaults to `false`.
        /// </summary>
        [Output("waitForSslPendingValidation")]
        public Output<bool?> WaitForSslPendingValidation { get; private set; } = null!;

        /// <summary>
        /// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("zoneId")]
        public Output<string> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a CustomHostname resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CustomHostname(string name, CustomHostnameArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/customHostname:CustomHostname", name, args ?? new CustomHostnameArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CustomHostname(string name, Input<string> id, CustomHostnameState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/customHostname:CustomHostname", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing CustomHostname resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CustomHostname Get(string name, Input<string> id, CustomHostnameState? state = null, CustomResourceOptions? options = null)
        {
            return new CustomHostname(name, id, state, options);
        }
    }

    public sealed class CustomHostnameArgs : global::Pulumi.ResourceArgs
    {
        [Input("customMetadata")]
        private InputMap<string>? _customMetadata;

        /// <summary>
        /// Custom metadata associated with custom hostname. Only supports primitive string values, all other values are accessible via the API directly.
        /// </summary>
        public InputMap<string> CustomMetadata
        {
            get => _customMetadata ?? (_customMetadata = new InputMap<string>());
            set => _customMetadata = value;
        }

        /// <summary>
        /// The custom origin server used for certificates.
        /// </summary>
        [Input("customOriginServer")]
        public Input<string>? CustomOriginServer { get; set; }

        /// <summary>
        /// The [custom origin SNI](https://developers.cloudflare.com/ssl/ssl-for-saas/hostname-specific-behavior/custom-origin) used for certificates.
        /// </summary>
        [Input("customOriginSni")]
        public Input<string>? CustomOriginSni { get; set; }

        /// <summary>
        /// Hostname you intend to request a certificate for. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("hostname", required: true)]
        public Input<string> Hostname { get; set; } = null!;

        [Input("ssls")]
        private InputList<Inputs.CustomHostnameSslArgs>? _ssls;

        /// <summary>
        /// SSL properties used when creating the custom hostname.
        /// </summary>
        public InputList<Inputs.CustomHostnameSslArgs> Ssls
        {
            get => _ssls ?? (_ssls = new InputList<Inputs.CustomHostnameSslArgs>());
            set => _ssls = value;
        }

        /// <summary>
        /// Whether to wait for a custom hostname SSL sub-object to reach status `pending_validation` during creation. Defaults to `false`.
        /// </summary>
        [Input("waitForSslPendingValidation")]
        public Input<bool>? WaitForSslPendingValidation { get; set; }

        /// <summary>
        /// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public CustomHostnameArgs()
        {
        }
        public static new CustomHostnameArgs Empty => new CustomHostnameArgs();
    }

    public sealed class CustomHostnameState : global::Pulumi.ResourceArgs
    {
        [Input("customMetadata")]
        private InputMap<string>? _customMetadata;

        /// <summary>
        /// Custom metadata associated with custom hostname. Only supports primitive string values, all other values are accessible via the API directly.
        /// </summary>
        public InputMap<string> CustomMetadata
        {
            get => _customMetadata ?? (_customMetadata = new InputMap<string>());
            set => _customMetadata = value;
        }

        /// <summary>
        /// The custom origin server used for certificates.
        /// </summary>
        [Input("customOriginServer")]
        public Input<string>? CustomOriginServer { get; set; }

        /// <summary>
        /// The [custom origin SNI](https://developers.cloudflare.com/ssl/ssl-for-saas/hostname-specific-behavior/custom-origin) used for certificates.
        /// </summary>
        [Input("customOriginSni")]
        public Input<string>? CustomOriginSni { get; set; }

        /// <summary>
        /// Hostname you intend to request a certificate for. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("hostname")]
        public Input<string>? Hostname { get; set; }

        [Input("ownershipVerification")]
        private InputMap<string>? _ownershipVerification;
        public InputMap<string> OwnershipVerification
        {
            get => _ownershipVerification ?? (_ownershipVerification = new InputMap<string>());
            set => _ownershipVerification = value;
        }

        [Input("ownershipVerificationHttp")]
        private InputMap<string>? _ownershipVerificationHttp;
        public InputMap<string> OwnershipVerificationHttp
        {
            get => _ownershipVerificationHttp ?? (_ownershipVerificationHttp = new InputMap<string>());
            set => _ownershipVerificationHttp = value;
        }

        [Input("ssls")]
        private InputList<Inputs.CustomHostnameSslGetArgs>? _ssls;

        /// <summary>
        /// SSL properties used when creating the custom hostname.
        /// </summary>
        public InputList<Inputs.CustomHostnameSslGetArgs> Ssls
        {
            get => _ssls ?? (_ssls = new InputList<Inputs.CustomHostnameSslGetArgs>());
            set => _ssls = value;
        }

        /// <summary>
        /// Status of the certificate.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// Whether to wait for a custom hostname SSL sub-object to reach status `pending_validation` during creation. Defaults to `false`.
        /// </summary>
        [Input("waitForSslPendingValidation")]
        public Input<bool>? WaitForSslPendingValidation { get; set; }

        /// <summary>
        /// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public CustomHostnameState()
        {
        }
        public static new CustomHostnameState Empty => new CustomHostnameState();
    }
}
