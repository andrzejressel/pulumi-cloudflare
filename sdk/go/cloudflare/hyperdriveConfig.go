// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-cloudflare/sdk/v5/go/cloudflare/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The [Hyperdrive Config](https://developers.cloudflare.com/hyperdrive/) resource allows you to manage Cloudflare Hyperdrive Configs.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-cloudflare/sdk/v5/go/cloudflare"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := cloudflare.NewHyperdriveConfig(ctx, "no_defaults", &cloudflare.HyperdriveConfigArgs{
//				AccountId: pulumi.String("f037e56e89293a057740de681ac9abbe"),
//				Name:      pulumi.String("my-hyperdrive-config"),
//				Origin: &cloudflare.HyperdriveConfigOriginArgs{
//					Database: pulumi.String("postgres"),
//					Password: pulumi.String("my-password"),
//					Host:     pulumi.String("my-database.example.com"),
//					Port:     pulumi.Int(5432),
//					Scheme:   pulumi.String("postgres"),
//					User:     pulumi.String("my-user"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// ```sh
// $ pulumi import cloudflare:index/hyperdriveConfig:HyperdriveConfig example <account_id>/<hyperdrive_config_id>
// ```
type HyperdriveConfig struct {
	pulumi.CustomResourceState

	// The account identifier to target for the resource.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// The caching details for the Hyperdrive configuration.
	Caching HyperdriveConfigCachingOutput `pulumi:"caching"`
	// The name of the Hyperdrive configuration.
	Name pulumi.StringOutput `pulumi:"name"`
	// The origin details for the Hyperdrive configuration.
	Origin HyperdriveConfigOriginOutput `pulumi:"origin"`
	// The identifier of this resource. This is the hyperdrive config value.
	ResourceId pulumi.StringOutput `pulumi:"resourceId"`
}

// NewHyperdriveConfig registers a new resource with the given unique name, arguments, and options.
func NewHyperdriveConfig(ctx *pulumi.Context,
	name string, args *HyperdriveConfigArgs, opts ...pulumi.ResourceOption) (*HyperdriveConfig, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	if args.Name == nil {
		return nil, errors.New("invalid value for required argument 'Name'")
	}
	if args.Origin == nil {
		return nil, errors.New("invalid value for required argument 'Origin'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource HyperdriveConfig
	err := ctx.RegisterResource("cloudflare:index/hyperdriveConfig:HyperdriveConfig", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetHyperdriveConfig gets an existing HyperdriveConfig resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetHyperdriveConfig(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *HyperdriveConfigState, opts ...pulumi.ResourceOption) (*HyperdriveConfig, error) {
	var resource HyperdriveConfig
	err := ctx.ReadResource("cloudflare:index/hyperdriveConfig:HyperdriveConfig", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering HyperdriveConfig resources.
type hyperdriveConfigState struct {
	// The account identifier to target for the resource.
	AccountId *string `pulumi:"accountId"`
	// The caching details for the Hyperdrive configuration.
	Caching *HyperdriveConfigCaching `pulumi:"caching"`
	// The name of the Hyperdrive configuration.
	Name *string `pulumi:"name"`
	// The origin details for the Hyperdrive configuration.
	Origin *HyperdriveConfigOrigin `pulumi:"origin"`
	// The identifier of this resource. This is the hyperdrive config value.
	ResourceId *string `pulumi:"resourceId"`
}

type HyperdriveConfigState struct {
	// The account identifier to target for the resource.
	AccountId pulumi.StringPtrInput
	// The caching details for the Hyperdrive configuration.
	Caching HyperdriveConfigCachingPtrInput
	// The name of the Hyperdrive configuration.
	Name pulumi.StringPtrInput
	// The origin details for the Hyperdrive configuration.
	Origin HyperdriveConfigOriginPtrInput
	// The identifier of this resource. This is the hyperdrive config value.
	ResourceId pulumi.StringPtrInput
}

func (HyperdriveConfigState) ElementType() reflect.Type {
	return reflect.TypeOf((*hyperdriveConfigState)(nil)).Elem()
}

type hyperdriveConfigArgs struct {
	// The account identifier to target for the resource.
	AccountId string `pulumi:"accountId"`
	// The caching details for the Hyperdrive configuration.
	Caching *HyperdriveConfigCaching `pulumi:"caching"`
	// The name of the Hyperdrive configuration.
	Name string `pulumi:"name"`
	// The origin details for the Hyperdrive configuration.
	Origin HyperdriveConfigOrigin `pulumi:"origin"`
	// The identifier of this resource. This is the hyperdrive config value.
	ResourceId *string `pulumi:"resourceId"`
}

// The set of arguments for constructing a HyperdriveConfig resource.
type HyperdriveConfigArgs struct {
	// The account identifier to target for the resource.
	AccountId pulumi.StringInput
	// The caching details for the Hyperdrive configuration.
	Caching HyperdriveConfigCachingPtrInput
	// The name of the Hyperdrive configuration.
	Name pulumi.StringInput
	// The origin details for the Hyperdrive configuration.
	Origin HyperdriveConfigOriginInput
	// The identifier of this resource. This is the hyperdrive config value.
	ResourceId pulumi.StringPtrInput
}

func (HyperdriveConfigArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*hyperdriveConfigArgs)(nil)).Elem()
}

type HyperdriveConfigInput interface {
	pulumi.Input

	ToHyperdriveConfigOutput() HyperdriveConfigOutput
	ToHyperdriveConfigOutputWithContext(ctx context.Context) HyperdriveConfigOutput
}

func (*HyperdriveConfig) ElementType() reflect.Type {
	return reflect.TypeOf((**HyperdriveConfig)(nil)).Elem()
}

func (i *HyperdriveConfig) ToHyperdriveConfigOutput() HyperdriveConfigOutput {
	return i.ToHyperdriveConfigOutputWithContext(context.Background())
}

func (i *HyperdriveConfig) ToHyperdriveConfigOutputWithContext(ctx context.Context) HyperdriveConfigOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HyperdriveConfigOutput)
}

// HyperdriveConfigArrayInput is an input type that accepts HyperdriveConfigArray and HyperdriveConfigArrayOutput values.
// You can construct a concrete instance of `HyperdriveConfigArrayInput` via:
//
//	HyperdriveConfigArray{ HyperdriveConfigArgs{...} }
type HyperdriveConfigArrayInput interface {
	pulumi.Input

	ToHyperdriveConfigArrayOutput() HyperdriveConfigArrayOutput
	ToHyperdriveConfigArrayOutputWithContext(context.Context) HyperdriveConfigArrayOutput
}

type HyperdriveConfigArray []HyperdriveConfigInput

func (HyperdriveConfigArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*HyperdriveConfig)(nil)).Elem()
}

func (i HyperdriveConfigArray) ToHyperdriveConfigArrayOutput() HyperdriveConfigArrayOutput {
	return i.ToHyperdriveConfigArrayOutputWithContext(context.Background())
}

func (i HyperdriveConfigArray) ToHyperdriveConfigArrayOutputWithContext(ctx context.Context) HyperdriveConfigArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HyperdriveConfigArrayOutput)
}

// HyperdriveConfigMapInput is an input type that accepts HyperdriveConfigMap and HyperdriveConfigMapOutput values.
// You can construct a concrete instance of `HyperdriveConfigMapInput` via:
//
//	HyperdriveConfigMap{ "key": HyperdriveConfigArgs{...} }
type HyperdriveConfigMapInput interface {
	pulumi.Input

	ToHyperdriveConfigMapOutput() HyperdriveConfigMapOutput
	ToHyperdriveConfigMapOutputWithContext(context.Context) HyperdriveConfigMapOutput
}

type HyperdriveConfigMap map[string]HyperdriveConfigInput

func (HyperdriveConfigMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*HyperdriveConfig)(nil)).Elem()
}

func (i HyperdriveConfigMap) ToHyperdriveConfigMapOutput() HyperdriveConfigMapOutput {
	return i.ToHyperdriveConfigMapOutputWithContext(context.Background())
}

func (i HyperdriveConfigMap) ToHyperdriveConfigMapOutputWithContext(ctx context.Context) HyperdriveConfigMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HyperdriveConfigMapOutput)
}

type HyperdriveConfigOutput struct{ *pulumi.OutputState }

func (HyperdriveConfigOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**HyperdriveConfig)(nil)).Elem()
}

func (o HyperdriveConfigOutput) ToHyperdriveConfigOutput() HyperdriveConfigOutput {
	return o
}

func (o HyperdriveConfigOutput) ToHyperdriveConfigOutputWithContext(ctx context.Context) HyperdriveConfigOutput {
	return o
}

// The account identifier to target for the resource.
func (o HyperdriveConfigOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *HyperdriveConfig) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// The caching details for the Hyperdrive configuration.
func (o HyperdriveConfigOutput) Caching() HyperdriveConfigCachingOutput {
	return o.ApplyT(func(v *HyperdriveConfig) HyperdriveConfigCachingOutput { return v.Caching }).(HyperdriveConfigCachingOutput)
}

// The name of the Hyperdrive configuration.
func (o HyperdriveConfigOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *HyperdriveConfig) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The origin details for the Hyperdrive configuration.
func (o HyperdriveConfigOutput) Origin() HyperdriveConfigOriginOutput {
	return o.ApplyT(func(v *HyperdriveConfig) HyperdriveConfigOriginOutput { return v.Origin }).(HyperdriveConfigOriginOutput)
}

// The identifier of this resource. This is the hyperdrive config value.
func (o HyperdriveConfigOutput) ResourceId() pulumi.StringOutput {
	return o.ApplyT(func(v *HyperdriveConfig) pulumi.StringOutput { return v.ResourceId }).(pulumi.StringOutput)
}

type HyperdriveConfigArrayOutput struct{ *pulumi.OutputState }

func (HyperdriveConfigArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*HyperdriveConfig)(nil)).Elem()
}

func (o HyperdriveConfigArrayOutput) ToHyperdriveConfigArrayOutput() HyperdriveConfigArrayOutput {
	return o
}

func (o HyperdriveConfigArrayOutput) ToHyperdriveConfigArrayOutputWithContext(ctx context.Context) HyperdriveConfigArrayOutput {
	return o
}

func (o HyperdriveConfigArrayOutput) Index(i pulumi.IntInput) HyperdriveConfigOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *HyperdriveConfig {
		return vs[0].([]*HyperdriveConfig)[vs[1].(int)]
	}).(HyperdriveConfigOutput)
}

type HyperdriveConfigMapOutput struct{ *pulumi.OutputState }

func (HyperdriveConfigMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*HyperdriveConfig)(nil)).Elem()
}

func (o HyperdriveConfigMapOutput) ToHyperdriveConfigMapOutput() HyperdriveConfigMapOutput {
	return o
}

func (o HyperdriveConfigMapOutput) ToHyperdriveConfigMapOutputWithContext(ctx context.Context) HyperdriveConfigMapOutput {
	return o
}

func (o HyperdriveConfigMapOutput) MapIndex(k pulumi.StringInput) HyperdriveConfigOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *HyperdriveConfig {
		return vs[0].(map[string]*HyperdriveConfig)[vs[1].(string)]
	}).(HyperdriveConfigOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*HyperdriveConfigInput)(nil)).Elem(), &HyperdriveConfig{})
	pulumi.RegisterInputType(reflect.TypeOf((*HyperdriveConfigArrayInput)(nil)).Elem(), HyperdriveConfigArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*HyperdriveConfigMapInput)(nil)).Elem(), HyperdriveConfigMap{})
	pulumi.RegisterOutputType(HyperdriveConfigOutput{})
	pulumi.RegisterOutputType(HyperdriveConfigArrayOutput{})
	pulumi.RegisterOutputType(HyperdriveConfigMapOutput{})
}
