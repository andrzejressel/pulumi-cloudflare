// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-cloudflare/sdk/v5/go/cloudflare/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// The provider type for the cloudflare package. By default, resources use package-wide configuration
// settings, however an explicit `Provider` instance may be created and passed during resource
// construction to achieve fine-grained programmatic control over provider settings. See the
// [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
type Provider struct {
	pulumi.ProviderResourceState

	// Configure the base path used by the API client. Alternatively, can be configured using the `CLOUDFLARE_API_BASE_PATH`
	// environment variable.
	ApiBasePath pulumi.StringPtrOutput `pulumi:"apiBasePath"`
	// Configure the hostname used by the API client. Alternatively, can be configured using the `CLOUDFLARE_API_HOSTNAME`
	// environment variable.
	ApiHostname pulumi.StringPtrOutput `pulumi:"apiHostname"`
	// The API key for operations. Alternatively, can be configured using the `CLOUDFLARE_API_KEY` environment variable. API
	// keys are [now considered legacy by
	// Cloudflare](https://developers.cloudflare.com/fundamentals/api/get-started/keys/#limitations), API tokens should be used
	// instead. Must provide only one of `api_key`, `api_token`, `api_user_service_key`.
	ApiKey pulumi.StringPtrOutput `pulumi:"apiKey"`
	// The API Token for operations. Alternatively, can be configured using the `CLOUDFLARE_API_TOKEN` environment variable.
	// Must provide only one of `api_key`, `api_token`, `api_user_service_key`.
	ApiToken pulumi.StringPtrOutput `pulumi:"apiToken"`
	// A special Cloudflare API key good for a restricted set of endpoints. Alternatively, can be configured using the
	// `CLOUDFLARE_API_USER_SERVICE_KEY` environment variable. Must provide only one of `api_key`, `api_token`,
	// `api_user_service_key`.
	ApiUserServiceKey pulumi.StringPtrOutput `pulumi:"apiUserServiceKey"`
	// A registered Cloudflare email address. Alternatively, can be configured using the `CLOUDFLARE_EMAIL` environment
	// variable. Required when using `api_key`. Conflicts with `api_token`.
	Email pulumi.StringPtrOutput `pulumi:"email"`
}

// NewProvider registers a new resource with the given unique name, arguments, and options.
func NewProvider(ctx *pulumi.Context,
	name string, args *ProviderArgs, opts ...pulumi.ResourceOption) (*Provider, error) {
	if args == nil {
		args = &ProviderArgs{}
	}

	if args.ApiClientLogging == nil {
		if d := internal.GetEnvOrDefault(false, internal.ParseEnvBool, "CLOUDFLARE_API_CLIENT_LOGGING"); d != nil {
			args.ApiClientLogging = pulumi.BoolPtr(d.(bool))
		}
	}
	if args.MaxBackoff == nil {
		if d := internal.GetEnvOrDefault(30, internal.ParseEnvInt, "CLOUDFLARE_MAX_BACKOFF"); d != nil {
			args.MaxBackoff = pulumi.IntPtr(d.(int))
		}
	}
	if args.MinBackoff == nil {
		if d := internal.GetEnvOrDefault(1, internal.ParseEnvInt, "CLOUDFLARE_MIN_BACKOFF"); d != nil {
			args.MinBackoff = pulumi.IntPtr(d.(int))
		}
	}
	if args.Retries == nil {
		if d := internal.GetEnvOrDefault(3, internal.ParseEnvInt, "CLOUDFLARE_RETRIES"); d != nil {
			args.Retries = pulumi.IntPtr(d.(int))
		}
	}
	if args.Rps == nil {
		if d := internal.GetEnvOrDefault(4, internal.ParseEnvInt, "CLOUDFLARE_RPS"); d != nil {
			args.Rps = pulumi.IntPtr(d.(int))
		}
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Provider
	err := ctx.RegisterResource("pulumi:providers:cloudflare", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

type providerArgs struct {
	// Configure the base path used by the API client. Alternatively, can be configured using the `CLOUDFLARE_API_BASE_PATH`
	// environment variable.
	ApiBasePath *string `pulumi:"apiBasePath"`
	// Whether to print logs from the API client (using the default log library logger). Alternatively, can be configured using
	// the `CLOUDFLARE_API_CLIENT_LOGGING` environment variable.
	ApiClientLogging *bool `pulumi:"apiClientLogging"`
	// Configure the hostname used by the API client. Alternatively, can be configured using the `CLOUDFLARE_API_HOSTNAME`
	// environment variable.
	ApiHostname *string `pulumi:"apiHostname"`
	// The API key for operations. Alternatively, can be configured using the `CLOUDFLARE_API_KEY` environment variable. API
	// keys are [now considered legacy by
	// Cloudflare](https://developers.cloudflare.com/fundamentals/api/get-started/keys/#limitations), API tokens should be used
	// instead. Must provide only one of `api_key`, `api_token`, `api_user_service_key`.
	ApiKey *string `pulumi:"apiKey"`
	// The API Token for operations. Alternatively, can be configured using the `CLOUDFLARE_API_TOKEN` environment variable.
	// Must provide only one of `api_key`, `api_token`, `api_user_service_key`.
	ApiToken *string `pulumi:"apiToken"`
	// A special Cloudflare API key good for a restricted set of endpoints. Alternatively, can be configured using the
	// `CLOUDFLARE_API_USER_SERVICE_KEY` environment variable. Must provide only one of `api_key`, `api_token`,
	// `api_user_service_key`.
	ApiUserServiceKey *string `pulumi:"apiUserServiceKey"`
	// A registered Cloudflare email address. Alternatively, can be configured using the `CLOUDFLARE_EMAIL` environment
	// variable. Required when using `api_key`. Conflicts with `api_token`.
	Email *string `pulumi:"email"`
	// Maximum backoff period in seconds after failed API calls. Alternatively, can be configured using the
	// `CLOUDFLARE_MAX_BACKOFF` environment variable.
	MaxBackoff *int `pulumi:"maxBackoff"`
	// Minimum backoff period in seconds after failed API calls. Alternatively, can be configured using the
	// `CLOUDFLARE_MIN_BACKOFF` environment variable.
	MinBackoff *int `pulumi:"minBackoff"`
	// Maximum number of retries to perform when an API request fails. Alternatively, can be configured using the
	// `CLOUDFLARE_RETRIES` environment variable.
	Retries *int `pulumi:"retries"`
	// RPS limit to apply when making calls to the API. Alternatively, can be configured using the `CLOUDFLARE_RPS` environment
	// variable.
	Rps *int `pulumi:"rps"`
}

// The set of arguments for constructing a Provider resource.
type ProviderArgs struct {
	// Configure the base path used by the API client. Alternatively, can be configured using the `CLOUDFLARE_API_BASE_PATH`
	// environment variable.
	ApiBasePath pulumi.StringPtrInput
	// Whether to print logs from the API client (using the default log library logger). Alternatively, can be configured using
	// the `CLOUDFLARE_API_CLIENT_LOGGING` environment variable.
	ApiClientLogging pulumi.BoolPtrInput
	// Configure the hostname used by the API client. Alternatively, can be configured using the `CLOUDFLARE_API_HOSTNAME`
	// environment variable.
	ApiHostname pulumi.StringPtrInput
	// The API key for operations. Alternatively, can be configured using the `CLOUDFLARE_API_KEY` environment variable. API
	// keys are [now considered legacy by
	// Cloudflare](https://developers.cloudflare.com/fundamentals/api/get-started/keys/#limitations), API tokens should be used
	// instead. Must provide only one of `api_key`, `api_token`, `api_user_service_key`.
	ApiKey pulumi.StringPtrInput
	// The API Token for operations. Alternatively, can be configured using the `CLOUDFLARE_API_TOKEN` environment variable.
	// Must provide only one of `api_key`, `api_token`, `api_user_service_key`.
	ApiToken pulumi.StringPtrInput
	// A special Cloudflare API key good for a restricted set of endpoints. Alternatively, can be configured using the
	// `CLOUDFLARE_API_USER_SERVICE_KEY` environment variable. Must provide only one of `api_key`, `api_token`,
	// `api_user_service_key`.
	ApiUserServiceKey pulumi.StringPtrInput
	// A registered Cloudflare email address. Alternatively, can be configured using the `CLOUDFLARE_EMAIL` environment
	// variable. Required when using `api_key`. Conflicts with `api_token`.
	Email pulumi.StringPtrInput
	// Maximum backoff period in seconds after failed API calls. Alternatively, can be configured using the
	// `CLOUDFLARE_MAX_BACKOFF` environment variable.
	MaxBackoff pulumi.IntPtrInput
	// Minimum backoff period in seconds after failed API calls. Alternatively, can be configured using the
	// `CLOUDFLARE_MIN_BACKOFF` environment variable.
	MinBackoff pulumi.IntPtrInput
	// Maximum number of retries to perform when an API request fails. Alternatively, can be configured using the
	// `CLOUDFLARE_RETRIES` environment variable.
	Retries pulumi.IntPtrInput
	// RPS limit to apply when making calls to the API. Alternatively, can be configured using the `CLOUDFLARE_RPS` environment
	// variable.
	Rps pulumi.IntPtrInput
}

func (ProviderArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*providerArgs)(nil)).Elem()
}

type ProviderInput interface {
	pulumi.Input

	ToProviderOutput() ProviderOutput
	ToProviderOutputWithContext(ctx context.Context) ProviderOutput
}

func (*Provider) ElementType() reflect.Type {
	return reflect.TypeOf((**Provider)(nil)).Elem()
}

func (i *Provider) ToProviderOutput() ProviderOutput {
	return i.ToProviderOutputWithContext(context.Background())
}

func (i *Provider) ToProviderOutputWithContext(ctx context.Context) ProviderOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProviderOutput)
}

func (i *Provider) ToOutput(ctx context.Context) pulumix.Output[*Provider] {
	return pulumix.Output[*Provider]{
		OutputState: i.ToProviderOutputWithContext(ctx).OutputState,
	}
}

type ProviderOutput struct{ *pulumi.OutputState }

func (ProviderOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Provider)(nil)).Elem()
}

func (o ProviderOutput) ToProviderOutput() ProviderOutput {
	return o
}

func (o ProviderOutput) ToProviderOutputWithContext(ctx context.Context) ProviderOutput {
	return o
}

func (o ProviderOutput) ToOutput(ctx context.Context) pulumix.Output[*Provider] {
	return pulumix.Output[*Provider]{
		OutputState: o.OutputState,
	}
}

// Configure the base path used by the API client. Alternatively, can be configured using the `CLOUDFLARE_API_BASE_PATH`
// environment variable.
func (o ProviderOutput) ApiBasePath() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.ApiBasePath }).(pulumi.StringPtrOutput)
}

// Configure the hostname used by the API client. Alternatively, can be configured using the `CLOUDFLARE_API_HOSTNAME`
// environment variable.
func (o ProviderOutput) ApiHostname() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.ApiHostname }).(pulumi.StringPtrOutput)
}

// The API key for operations. Alternatively, can be configured using the `CLOUDFLARE_API_KEY` environment variable. API
// keys are [now considered legacy by
// Cloudflare](https://developers.cloudflare.com/fundamentals/api/get-started/keys/#limitations), API tokens should be used
// instead. Must provide only one of `api_key`, `api_token`, `api_user_service_key`.
func (o ProviderOutput) ApiKey() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.ApiKey }).(pulumi.StringPtrOutput)
}

// The API Token for operations. Alternatively, can be configured using the `CLOUDFLARE_API_TOKEN` environment variable.
// Must provide only one of `api_key`, `api_token`, `api_user_service_key`.
func (o ProviderOutput) ApiToken() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.ApiToken }).(pulumi.StringPtrOutput)
}

// A special Cloudflare API key good for a restricted set of endpoints. Alternatively, can be configured using the
// `CLOUDFLARE_API_USER_SERVICE_KEY` environment variable. Must provide only one of `api_key`, `api_token`,
// `api_user_service_key`.
func (o ProviderOutput) ApiUserServiceKey() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.ApiUserServiceKey }).(pulumi.StringPtrOutput)
}

// A registered Cloudflare email address. Alternatively, can be configured using the `CLOUDFLARE_EMAIL` environment
// variable. Required when using `api_key`. Conflicts with `api_token`.
func (o ProviderOutput) Email() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.Email }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ProviderInput)(nil)).Elem(), &Provider{})
	pulumi.RegisterOutputType(ProviderOutput{})
}
