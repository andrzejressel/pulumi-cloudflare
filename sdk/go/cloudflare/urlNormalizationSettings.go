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

// Provides a resource to manage URL Normalization Settings.
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
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
//			_, err := cloudflare.NewUrlNormalizationSettings(ctx, "example", &cloudflare.UrlNormalizationSettingsArgs{
//				ZoneId: pulumi.String("0da42c8d2132a9ddaf714f9e7c920711"),
//				Type:   pulumi.String("cloudflare"),
//				Scope:  pulumi.String("incoming"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
type UrlNormalizationSettings struct {
	pulumi.CustomResourceState

	// The scope of the URL normalization.
	Scope pulumi.StringOutput `pulumi:"scope"`
	// The type of URL normalization performed by Cloudflare.
	Type pulumi.StringOutput `pulumi:"type"`
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewUrlNormalizationSettings registers a new resource with the given unique name, arguments, and options.
func NewUrlNormalizationSettings(ctx *pulumi.Context,
	name string, args *UrlNormalizationSettingsArgs, opts ...pulumi.ResourceOption) (*UrlNormalizationSettings, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Scope == nil {
		return nil, errors.New("invalid value for required argument 'Scope'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	if args.ZoneId == nil {
		return nil, errors.New("invalid value for required argument 'ZoneId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource UrlNormalizationSettings
	err := ctx.RegisterResource("cloudflare:index/urlNormalizationSettings:UrlNormalizationSettings", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetUrlNormalizationSettings gets an existing UrlNormalizationSettings resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetUrlNormalizationSettings(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *UrlNormalizationSettingsState, opts ...pulumi.ResourceOption) (*UrlNormalizationSettings, error) {
	var resource UrlNormalizationSettings
	err := ctx.ReadResource("cloudflare:index/urlNormalizationSettings:UrlNormalizationSettings", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering UrlNormalizationSettings resources.
type urlNormalizationSettingsState struct {
	// The scope of the URL normalization.
	Scope *string `pulumi:"scope"`
	// The type of URL normalization performed by Cloudflare.
	Type *string `pulumi:"type"`
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId *string `pulumi:"zoneId"`
}

type UrlNormalizationSettingsState struct {
	// The scope of the URL normalization.
	Scope pulumi.StringPtrInput
	// The type of URL normalization performed by Cloudflare.
	Type pulumi.StringPtrInput
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringPtrInput
}

func (UrlNormalizationSettingsState) ElementType() reflect.Type {
	return reflect.TypeOf((*urlNormalizationSettingsState)(nil)).Elem()
}

type urlNormalizationSettingsArgs struct {
	// The scope of the URL normalization.
	Scope string `pulumi:"scope"`
	// The type of URL normalization performed by Cloudflare.
	Type string `pulumi:"type"`
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId string `pulumi:"zoneId"`
}

// The set of arguments for constructing a UrlNormalizationSettings resource.
type UrlNormalizationSettingsArgs struct {
	// The scope of the URL normalization.
	Scope pulumi.StringInput
	// The type of URL normalization performed by Cloudflare.
	Type pulumi.StringInput
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringInput
}

func (UrlNormalizationSettingsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*urlNormalizationSettingsArgs)(nil)).Elem()
}

type UrlNormalizationSettingsInput interface {
	pulumi.Input

	ToUrlNormalizationSettingsOutput() UrlNormalizationSettingsOutput
	ToUrlNormalizationSettingsOutputWithContext(ctx context.Context) UrlNormalizationSettingsOutput
}

func (*UrlNormalizationSettings) ElementType() reflect.Type {
	return reflect.TypeOf((**UrlNormalizationSettings)(nil)).Elem()
}

func (i *UrlNormalizationSettings) ToUrlNormalizationSettingsOutput() UrlNormalizationSettingsOutput {
	return i.ToUrlNormalizationSettingsOutputWithContext(context.Background())
}

func (i *UrlNormalizationSettings) ToUrlNormalizationSettingsOutputWithContext(ctx context.Context) UrlNormalizationSettingsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UrlNormalizationSettingsOutput)
}

// UrlNormalizationSettingsArrayInput is an input type that accepts UrlNormalizationSettingsArray and UrlNormalizationSettingsArrayOutput values.
// You can construct a concrete instance of `UrlNormalizationSettingsArrayInput` via:
//
//	UrlNormalizationSettingsArray{ UrlNormalizationSettingsArgs{...} }
type UrlNormalizationSettingsArrayInput interface {
	pulumi.Input

	ToUrlNormalizationSettingsArrayOutput() UrlNormalizationSettingsArrayOutput
	ToUrlNormalizationSettingsArrayOutputWithContext(context.Context) UrlNormalizationSettingsArrayOutput
}

type UrlNormalizationSettingsArray []UrlNormalizationSettingsInput

func (UrlNormalizationSettingsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*UrlNormalizationSettings)(nil)).Elem()
}

func (i UrlNormalizationSettingsArray) ToUrlNormalizationSettingsArrayOutput() UrlNormalizationSettingsArrayOutput {
	return i.ToUrlNormalizationSettingsArrayOutputWithContext(context.Background())
}

func (i UrlNormalizationSettingsArray) ToUrlNormalizationSettingsArrayOutputWithContext(ctx context.Context) UrlNormalizationSettingsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UrlNormalizationSettingsArrayOutput)
}

// UrlNormalizationSettingsMapInput is an input type that accepts UrlNormalizationSettingsMap and UrlNormalizationSettingsMapOutput values.
// You can construct a concrete instance of `UrlNormalizationSettingsMapInput` via:
//
//	UrlNormalizationSettingsMap{ "key": UrlNormalizationSettingsArgs{...} }
type UrlNormalizationSettingsMapInput interface {
	pulumi.Input

	ToUrlNormalizationSettingsMapOutput() UrlNormalizationSettingsMapOutput
	ToUrlNormalizationSettingsMapOutputWithContext(context.Context) UrlNormalizationSettingsMapOutput
}

type UrlNormalizationSettingsMap map[string]UrlNormalizationSettingsInput

func (UrlNormalizationSettingsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*UrlNormalizationSettings)(nil)).Elem()
}

func (i UrlNormalizationSettingsMap) ToUrlNormalizationSettingsMapOutput() UrlNormalizationSettingsMapOutput {
	return i.ToUrlNormalizationSettingsMapOutputWithContext(context.Background())
}

func (i UrlNormalizationSettingsMap) ToUrlNormalizationSettingsMapOutputWithContext(ctx context.Context) UrlNormalizationSettingsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UrlNormalizationSettingsMapOutput)
}

type UrlNormalizationSettingsOutput struct{ *pulumi.OutputState }

func (UrlNormalizationSettingsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**UrlNormalizationSettings)(nil)).Elem()
}

func (o UrlNormalizationSettingsOutput) ToUrlNormalizationSettingsOutput() UrlNormalizationSettingsOutput {
	return o
}

func (o UrlNormalizationSettingsOutput) ToUrlNormalizationSettingsOutputWithContext(ctx context.Context) UrlNormalizationSettingsOutput {
	return o
}

// The scope of the URL normalization.
func (o UrlNormalizationSettingsOutput) Scope() pulumi.StringOutput {
	return o.ApplyT(func(v *UrlNormalizationSettings) pulumi.StringOutput { return v.Scope }).(pulumi.StringOutput)
}

// The type of URL normalization performed by Cloudflare.
func (o UrlNormalizationSettingsOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *UrlNormalizationSettings) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
func (o UrlNormalizationSettingsOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v *UrlNormalizationSettings) pulumi.StringOutput { return v.ZoneId }).(pulumi.StringOutput)
}

type UrlNormalizationSettingsArrayOutput struct{ *pulumi.OutputState }

func (UrlNormalizationSettingsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*UrlNormalizationSettings)(nil)).Elem()
}

func (o UrlNormalizationSettingsArrayOutput) ToUrlNormalizationSettingsArrayOutput() UrlNormalizationSettingsArrayOutput {
	return o
}

func (o UrlNormalizationSettingsArrayOutput) ToUrlNormalizationSettingsArrayOutputWithContext(ctx context.Context) UrlNormalizationSettingsArrayOutput {
	return o
}

func (o UrlNormalizationSettingsArrayOutput) Index(i pulumi.IntInput) UrlNormalizationSettingsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *UrlNormalizationSettings {
		return vs[0].([]*UrlNormalizationSettings)[vs[1].(int)]
	}).(UrlNormalizationSettingsOutput)
}

type UrlNormalizationSettingsMapOutput struct{ *pulumi.OutputState }

func (UrlNormalizationSettingsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*UrlNormalizationSettings)(nil)).Elem()
}

func (o UrlNormalizationSettingsMapOutput) ToUrlNormalizationSettingsMapOutput() UrlNormalizationSettingsMapOutput {
	return o
}

func (o UrlNormalizationSettingsMapOutput) ToUrlNormalizationSettingsMapOutputWithContext(ctx context.Context) UrlNormalizationSettingsMapOutput {
	return o
}

func (o UrlNormalizationSettingsMapOutput) MapIndex(k pulumi.StringInput) UrlNormalizationSettingsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *UrlNormalizationSettings {
		return vs[0].(map[string]*UrlNormalizationSettings)[vs[1].(string)]
	}).(UrlNormalizationSettingsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*UrlNormalizationSettingsInput)(nil)).Elem(), &UrlNormalizationSettings{})
	pulumi.RegisterInputType(reflect.TypeOf((*UrlNormalizationSettingsArrayInput)(nil)).Elem(), UrlNormalizationSettingsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*UrlNormalizationSettingsMapInput)(nil)).Elem(), UrlNormalizationSettingsMap{})
	pulumi.RegisterOutputType(UrlNormalizationSettingsOutput{})
	pulumi.RegisterOutputType(UrlNormalizationSettingsArrayOutput{})
	pulumi.RegisterOutputType(UrlNormalizationSettingsMapOutput{})
}
