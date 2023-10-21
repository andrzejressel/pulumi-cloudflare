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
    /// The provider type for the cloudflare package. By default, resources use package-wide configuration
    /// settings, however an explicit `Provider` instance may be created and passed during resource
    /// construction to achieve fine-grained programmatic control over provider settings. See the
    /// [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
    /// </summary>
    [CloudflareResourceType("pulumi:providers:cloudflare")]
    public partial class Provider : global::Pulumi.ProviderResource
    {
        /// <summary>
        /// Configure the base path used by the API client. Alternatively, can be configured using the `CLOUDFLARE_API_BASE_PATH`
        /// environment variable.
        /// </summary>
        [Output("apiBasePath")]
        public Output<string?> ApiBasePath { get; private set; } = null!;

        /// <summary>
        /// Configure the hostname used by the API client. Alternatively, can be configured using the `CLOUDFLARE_API_HOSTNAME`
        /// environment variable.
        /// </summary>
        [Output("apiHostname")]
        public Output<string?> ApiHostname { get; private set; } = null!;

        /// <summary>
        /// The API key for operations. Alternatively, can be configured using the `CLOUDFLARE_API_KEY` environment variable. API
        /// keys are [now considered legacy by
        /// Cloudflare](https://developers.cloudflare.com/fundamentals/api/get-started/keys/#limitations), API tokens should be used
        /// instead. Must provide only one of `api_key`, `api_token`, `api_user_service_key`.
        /// </summary>
        [Output("apiKey")]
        public Output<string?> ApiKey { get; private set; } = null!;

        /// <summary>
        /// The API Token for operations. Alternatively, can be configured using the `CLOUDFLARE_API_TOKEN` environment variable.
        /// Must provide only one of `api_key`, `api_token`, `api_user_service_key`.
        /// </summary>
        [Output("apiToken")]
        public Output<string?> ApiToken { get; private set; } = null!;

        /// <summary>
        /// A special Cloudflare API key good for a restricted set of endpoints. Alternatively, can be configured using the
        /// `CLOUDFLARE_API_USER_SERVICE_KEY` environment variable. Must provide only one of `api_key`, `api_token`,
        /// `api_user_service_key`.
        /// </summary>
        [Output("apiUserServiceKey")]
        public Output<string?> ApiUserServiceKey { get; private set; } = null!;

        /// <summary>
        /// A registered Cloudflare email address. Alternatively, can be configured using the `CLOUDFLARE_EMAIL` environment
        /// variable. Required when using `api_key`. Conflicts with `api_token`.
        /// </summary>
        [Output("email")]
        public Output<string?> Email { get; private set; } = null!;

        /// <summary>
        /// A value to append to the HTTP User Agent for all API calls. This value is not something most users need to modify
        /// however, if you are using a non-standard provider or operator configuration, this is recommended to assist in uniquely
        /// identifying your traffic. **Setting this value will remove the Terraform version from the HTTP User Agent string and may
        /// have unintended consequences**. Alternatively, can be configured using the `CLOUDFLARE_USER_AGENT_OPERATOR_SUFFIX`
        /// environment variable.
        /// </summary>
        [Output("userAgentOperatorSuffix")]
        public Output<string?> UserAgentOperatorSuffix { get; private set; } = null!;


        /// <summary>
        /// Create a Provider resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Provider(string name, ProviderArgs? args = null, CustomResourceOptions? options = null)
            : base("cloudflare", name, args ?? new ProviderArgs(), MakeResourceOptions(options, ""))
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
    }

    public sealed class ProviderArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Configure the base path used by the API client. Alternatively, can be configured using the `CLOUDFLARE_API_BASE_PATH`
        /// environment variable.
        /// </summary>
        [Input("apiBasePath")]
        public Input<string>? ApiBasePath { get; set; }

        /// <summary>
        /// Whether to print logs from the API client (using the default log library logger). Alternatively, can be configured using
        /// the `CLOUDFLARE_API_CLIENT_LOGGING` environment variable.
        /// </summary>
        [Input("apiClientLogging", json: true)]
        public Input<bool>? ApiClientLogging { get; set; }

        /// <summary>
        /// Configure the hostname used by the API client. Alternatively, can be configured using the `CLOUDFLARE_API_HOSTNAME`
        /// environment variable.
        /// </summary>
        [Input("apiHostname")]
        public Input<string>? ApiHostname { get; set; }

        /// <summary>
        /// The API key for operations. Alternatively, can be configured using the `CLOUDFLARE_API_KEY` environment variable. API
        /// keys are [now considered legacy by
        /// Cloudflare](https://developers.cloudflare.com/fundamentals/api/get-started/keys/#limitations), API tokens should be used
        /// instead. Must provide only one of `api_key`, `api_token`, `api_user_service_key`.
        /// </summary>
        [Input("apiKey")]
        public Input<string>? ApiKey { get; set; }

        /// <summary>
        /// The API Token for operations. Alternatively, can be configured using the `CLOUDFLARE_API_TOKEN` environment variable.
        /// Must provide only one of `api_key`, `api_token`, `api_user_service_key`.
        /// </summary>
        [Input("apiToken")]
        public Input<string>? ApiToken { get; set; }

        /// <summary>
        /// A special Cloudflare API key good for a restricted set of endpoints. Alternatively, can be configured using the
        /// `CLOUDFLARE_API_USER_SERVICE_KEY` environment variable. Must provide only one of `api_key`, `api_token`,
        /// `api_user_service_key`.
        /// </summary>
        [Input("apiUserServiceKey")]
        public Input<string>? ApiUserServiceKey { get; set; }

        /// <summary>
        /// A registered Cloudflare email address. Alternatively, can be configured using the `CLOUDFLARE_EMAIL` environment
        /// variable. Required when using `api_key`. Conflicts with `api_token`.
        /// </summary>
        [Input("email")]
        public Input<string>? Email { get; set; }

        /// <summary>
        /// Maximum backoff period in seconds after failed API calls. Alternatively, can be configured using the
        /// `CLOUDFLARE_MAX_BACKOFF` environment variable.
        /// </summary>
        [Input("maxBackoff", json: true)]
        public Input<int>? MaxBackoff { get; set; }

        /// <summary>
        /// Minimum backoff period in seconds after failed API calls. Alternatively, can be configured using the
        /// `CLOUDFLARE_MIN_BACKOFF` environment variable.
        /// </summary>
        [Input("minBackoff", json: true)]
        public Input<int>? MinBackoff { get; set; }

        /// <summary>
        /// Maximum number of retries to perform when an API request fails. Alternatively, can be configured using the
        /// `CLOUDFLARE_RETRIES` environment variable.
        /// </summary>
        [Input("retries", json: true)]
        public Input<int>? Retries { get; set; }

        /// <summary>
        /// RPS limit to apply when making calls to the API. Alternatively, can be configured using the `CLOUDFLARE_RPS` environment
        /// variable.
        /// </summary>
        [Input("rps", json: true)]
        public Input<int>? Rps { get; set; }

        /// <summary>
        /// A value to append to the HTTP User Agent for all API calls. This value is not something most users need to modify
        /// however, if you are using a non-standard provider or operator configuration, this is recommended to assist in uniquely
        /// identifying your traffic. **Setting this value will remove the Terraform version from the HTTP User Agent string and may
        /// have unintended consequences**. Alternatively, can be configured using the `CLOUDFLARE_USER_AGENT_OPERATOR_SUFFIX`
        /// environment variable.
        /// </summary>
        [Input("userAgentOperatorSuffix")]
        public Input<string>? UserAgentOperatorSuffix { get; set; }

        public ProviderArgs()
        {
            ApiClientLogging = Utilities.GetEnvBoolean("CLOUDFLARE_API_CLIENT_LOGGING") ?? false;
            MaxBackoff = Utilities.GetEnvInt32("CLOUDFLARE_MAX_BACKOFF") ?? 30;
            MinBackoff = Utilities.GetEnvInt32("CLOUDFLARE_MIN_BACKOFF") ?? 1;
            Retries = Utilities.GetEnvInt32("CLOUDFLARE_RETRIES") ?? 3;
            Rps = Utilities.GetEnvInt32("CLOUDFLARE_RPS") ?? 4;
        }
        public static new ProviderArgs Empty => new ProviderArgs();
    }
}
