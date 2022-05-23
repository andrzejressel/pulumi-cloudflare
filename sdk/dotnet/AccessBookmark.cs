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
    /// Provides a Cloudflare Access Bookmark resource. Access Bookmark
    /// applications are not protected behind Access but are displayed in the App
    /// Launcher.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Cloudflare = Pulumi.Cloudflare;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var myBookmarkApp = new Cloudflare.AccessBookmark("myBookmarkApp", new Cloudflare.AccessBookmarkArgs
    ///         {
    ///             AccountId = "1d5fdc9e88c8a8c4518b068cd94331fe",
    ///             AppLauncherVisible = true,
    ///             Domain = "example.com",
    ///             LogoUrl = "https://path-to-logo.com/example.png",
    ///             Name = "My Bookmark App",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Access Bookmarks can be imported using a composite ID formed of account ID and bookmark ID.
    /// 
    /// ```sh
    ///  $ pulumi import cloudflare:index/accessBookmark:AccessBookmark my_bookmark cb029e245cfdd66dc8d2e570d5dd3322/d41d8cd98f00b204e9800998ecf8427e
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/accessBookmark:AccessBookmark")]
    public partial class AccessBookmark : Pulumi.CustomResource
    {
        /// <summary>
        /// The account to which the Access bookmark application should be added. Conflicts with `zone_id`.
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        /// <summary>
        /// Option to show/hide the bookmark in the app launcher. Defaults to `true`.
        /// </summary>
        [Output("appLauncherVisible")]
        public Output<bool?> AppLauncherVisible { get; private set; } = null!;

        /// <summary>
        /// The domain of the bookmark application. Can include subdomains, paths, or both.
        /// </summary>
        [Output("domain")]
        public Output<string> Domain { get; private set; } = null!;

        /// <summary>
        /// The image URL for the logo shown in the app
        /// launcher dashboard.
        /// </summary>
        [Output("logoUrl")]
        public Output<string?> LogoUrl { get; private set; } = null!;

        /// <summary>
        /// Name of the bookmark application.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The DNS zone to which the Access bookmark application should be added. Conflicts with `account_id`.
        /// </summary>
        [Output("zoneId")]
        public Output<string> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a AccessBookmark resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AccessBookmark(string name, AccessBookmarkArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/accessBookmark:AccessBookmark", name, args ?? new AccessBookmarkArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AccessBookmark(string name, Input<string> id, AccessBookmarkState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/accessBookmark:AccessBookmark", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AccessBookmark resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AccessBookmark Get(string name, Input<string> id, AccessBookmarkState? state = null, CustomResourceOptions? options = null)
        {
            return new AccessBookmark(name, id, state, options);
        }
    }

    public sealed class AccessBookmarkArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account to which the Access bookmark application should be added. Conflicts with `zone_id`.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// Option to show/hide the bookmark in the app launcher. Defaults to `true`.
        /// </summary>
        [Input("appLauncherVisible")]
        public Input<bool>? AppLauncherVisible { get; set; }

        /// <summary>
        /// The domain of the bookmark application. Can include subdomains, paths, or both.
        /// </summary>
        [Input("domain", required: true)]
        public Input<string> Domain { get; set; } = null!;

        /// <summary>
        /// The image URL for the logo shown in the app
        /// launcher dashboard.
        /// </summary>
        [Input("logoUrl")]
        public Input<string>? LogoUrl { get; set; }

        /// <summary>
        /// Name of the bookmark application.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The DNS zone to which the Access bookmark application should be added. Conflicts with `account_id`.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public AccessBookmarkArgs()
        {
        }
    }

    public sealed class AccessBookmarkState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account to which the Access bookmark application should be added. Conflicts with `zone_id`.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// Option to show/hide the bookmark in the app launcher. Defaults to `true`.
        /// </summary>
        [Input("appLauncherVisible")]
        public Input<bool>? AppLauncherVisible { get; set; }

        /// <summary>
        /// The domain of the bookmark application. Can include subdomains, paths, or both.
        /// </summary>
        [Input("domain")]
        public Input<string>? Domain { get; set; }

        /// <summary>
        /// The image URL for the logo shown in the app
        /// launcher dashboard.
        /// </summary>
        [Input("logoUrl")]
        public Input<string>? LogoUrl { get; set; }

        /// <summary>
        /// Name of the bookmark application.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The DNS zone to which the Access bookmark application should be added. Conflicts with `account_id`.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public AccessBookmarkState()
        {
        }
    }
}
