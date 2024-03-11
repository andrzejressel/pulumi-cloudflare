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
    ///     // Advanced certificate manager for Let's Encrypt
    ///     var example = new Cloudflare.CertificatePack("example", new()
    ///     {
    ///         CertificateAuthority = "lets_encrypt",
    ///         CloudflareBranding = false,
    ///         Hosts = new[]
    ///         {
    ///             "example.com",
    ///             "*.example.com",
    ///         },
    ///         Type = "advanced",
    ///         ValidationMethod = "http",
    ///         ValidityDays = 90,
    ///         WaitForActiveStatus = true,
    ///         ZoneId = "0da42c8d2132a9ddaf714f9e7c920711",
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import cloudflare:index/certificatePack:CertificatePack example &lt;zone_id&gt;/&lt;certificate_pack_id&gt;
    /// ```
    /// 
    /// While supported, importing isn't recommended and it is advised to replace the
    /// 
    /// certificate entirely instead.
    /// </summary>
    [CloudflareResourceType("cloudflare:index/certificatePack:CertificatePack")]
    public partial class CertificatePack : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Which certificate authority to issue the certificate pack. Available values: `digicert`, `lets_encrypt`, `google`. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("certificateAuthority")]
        public Output<string> CertificateAuthority { get; private set; } = null!;

        /// <summary>
        /// Whether or not to include Cloudflare branding. This will add `sni.cloudflaressl.com` as the Common Name if set to `true`. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("cloudflareBranding")]
        public Output<bool?> CloudflareBranding { get; private set; } = null!;

        /// <summary>
        /// List of hostnames to provision the certificate pack for. The zone name must be included as a host. Note: If using Let's Encrypt, you cannot use individual subdomains and only a wildcard for subdomain is available. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("hosts")]
        public Output<ImmutableArray<string>> Hosts { get; private set; } = null!;

        /// <summary>
        /// Certificate pack configuration type. Available values: `advanced`. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        [Output("validationErrors")]
        public Output<ImmutableArray<Outputs.CertificatePackValidationError>> ValidationErrors { get; private set; } = null!;

        /// <summary>
        /// Which validation method to use in order to prove domain ownership. Available values: `txt`, `http`, `email`. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("validationMethod")]
        public Output<string> ValidationMethod { get; private set; } = null!;

        [Output("validationRecords")]
        public Output<ImmutableArray<Outputs.CertificatePackValidationRecord>> ValidationRecords { get; private set; } = null!;

        /// <summary>
        /// How long the certificate is valid for. Note: If using Let's Encrypt, this value can only be 90 days. Available values: `14`, `30`, `90`, `365`. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("validityDays")]
        public Output<int> ValidityDays { get; private set; } = null!;

        /// <summary>
        /// Whether or not to wait for a certificate pack to reach status `active` during creation. Defaults to `false`. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("waitForActiveStatus")]
        public Output<bool?> WaitForActiveStatus { get; private set; } = null!;

        /// <summary>
        /// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("zoneId")]
        public Output<string> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a CertificatePack resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CertificatePack(string name, CertificatePackArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/certificatePack:CertificatePack", name, args ?? new CertificatePackArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CertificatePack(string name, Input<string> id, CertificatePackState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/certificatePack:CertificatePack", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing CertificatePack resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CertificatePack Get(string name, Input<string> id, CertificatePackState? state = null, CustomResourceOptions? options = null)
        {
            return new CertificatePack(name, id, state, options);
        }
    }

    public sealed class CertificatePackArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Which certificate authority to issue the certificate pack. Available values: `digicert`, `lets_encrypt`, `google`. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("certificateAuthority", required: true)]
        public Input<string> CertificateAuthority { get; set; } = null!;

        /// <summary>
        /// Whether or not to include Cloudflare branding. This will add `sni.cloudflaressl.com` as the Common Name if set to `true`. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("cloudflareBranding")]
        public Input<bool>? CloudflareBranding { get; set; }

        [Input("hosts", required: true)]
        private InputList<string>? _hosts;

        /// <summary>
        /// List of hostnames to provision the certificate pack for. The zone name must be included as a host. Note: If using Let's Encrypt, you cannot use individual subdomains and only a wildcard for subdomain is available. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        public InputList<string> Hosts
        {
            get => _hosts ?? (_hosts = new InputList<string>());
            set => _hosts = value;
        }

        /// <summary>
        /// Certificate pack configuration type. Available values: `advanced`. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        [Input("validationErrors")]
        private InputList<Inputs.CertificatePackValidationErrorArgs>? _validationErrors;
        public InputList<Inputs.CertificatePackValidationErrorArgs> ValidationErrors
        {
            get => _validationErrors ?? (_validationErrors = new InputList<Inputs.CertificatePackValidationErrorArgs>());
            set => _validationErrors = value;
        }

        /// <summary>
        /// Which validation method to use in order to prove domain ownership. Available values: `txt`, `http`, `email`. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("validationMethod", required: true)]
        public Input<string> ValidationMethod { get; set; } = null!;

        [Input("validationRecords")]
        private InputList<Inputs.CertificatePackValidationRecordArgs>? _validationRecords;
        public InputList<Inputs.CertificatePackValidationRecordArgs> ValidationRecords
        {
            get => _validationRecords ?? (_validationRecords = new InputList<Inputs.CertificatePackValidationRecordArgs>());
            set => _validationRecords = value;
        }

        /// <summary>
        /// How long the certificate is valid for. Note: If using Let's Encrypt, this value can only be 90 days. Available values: `14`, `30`, `90`, `365`. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("validityDays", required: true)]
        public Input<int> ValidityDays { get; set; } = null!;

        /// <summary>
        /// Whether or not to wait for a certificate pack to reach status `active` during creation. Defaults to `false`. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("waitForActiveStatus")]
        public Input<bool>? WaitForActiveStatus { get; set; }

        /// <summary>
        /// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public CertificatePackArgs()
        {
        }
        public static new CertificatePackArgs Empty => new CertificatePackArgs();
    }

    public sealed class CertificatePackState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Which certificate authority to issue the certificate pack. Available values: `digicert`, `lets_encrypt`, `google`. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("certificateAuthority")]
        public Input<string>? CertificateAuthority { get; set; }

        /// <summary>
        /// Whether or not to include Cloudflare branding. This will add `sni.cloudflaressl.com` as the Common Name if set to `true`. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("cloudflareBranding")]
        public Input<bool>? CloudflareBranding { get; set; }

        [Input("hosts")]
        private InputList<string>? _hosts;

        /// <summary>
        /// List of hostnames to provision the certificate pack for. The zone name must be included as a host. Note: If using Let's Encrypt, you cannot use individual subdomains and only a wildcard for subdomain is available. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        public InputList<string> Hosts
        {
            get => _hosts ?? (_hosts = new InputList<string>());
            set => _hosts = value;
        }

        /// <summary>
        /// Certificate pack configuration type. Available values: `advanced`. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        [Input("validationErrors")]
        private InputList<Inputs.CertificatePackValidationErrorGetArgs>? _validationErrors;
        public InputList<Inputs.CertificatePackValidationErrorGetArgs> ValidationErrors
        {
            get => _validationErrors ?? (_validationErrors = new InputList<Inputs.CertificatePackValidationErrorGetArgs>());
            set => _validationErrors = value;
        }

        /// <summary>
        /// Which validation method to use in order to prove domain ownership. Available values: `txt`, `http`, `email`. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("validationMethod")]
        public Input<string>? ValidationMethod { get; set; }

        [Input("validationRecords")]
        private InputList<Inputs.CertificatePackValidationRecordGetArgs>? _validationRecords;
        public InputList<Inputs.CertificatePackValidationRecordGetArgs> ValidationRecords
        {
            get => _validationRecords ?? (_validationRecords = new InputList<Inputs.CertificatePackValidationRecordGetArgs>());
            set => _validationRecords = value;
        }

        /// <summary>
        /// How long the certificate is valid for. Note: If using Let's Encrypt, this value can only be 90 days. Available values: `14`, `30`, `90`, `365`. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("validityDays")]
        public Input<int>? ValidityDays { get; set; }

        /// <summary>
        /// Whether or not to wait for a certificate pack to reach status `active` during creation. Defaults to `false`. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("waitForActiveStatus")]
        public Input<bool>? WaitForActiveStatus { get; set; }

        /// <summary>
        /// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public CertificatePackState()
        {
        }
        public static new CertificatePackState Empty => new CertificatePackState();
    }
}
