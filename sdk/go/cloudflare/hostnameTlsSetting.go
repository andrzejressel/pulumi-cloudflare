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

// Provides a Cloudflare per-hostname TLS setting resource. Used to set TLS settings for hostnames under the specified zone.
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
//			_, err := cloudflare.NewHostnameTlsSetting(ctx, "example", &cloudflare.HostnameTlsSettingArgs{
//				ZoneId:   pulumi.String("0da42c8d2132a9ddaf714f9e7c920711"),
//				Hostname: pulumi.String("sub.example.com"),
//				Setting:  pulumi.String("min_tls_version"),
//				Value:    pulumi.String("1.2"),
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
// $ pulumi import cloudflare:index/hostnameTlsSetting:HostnameTlsSetting example <zone_id>/<hostname>/<setting_name>
// ```
type HostnameTlsSetting struct {
	pulumi.CustomResourceState

	CreatedAt pulumi.StringOutput `pulumi:"createdAt"`
	// Hostname that belongs to this zone name. **Modifying this attribute will force creation of a new resource.**
	Hostname pulumi.StringOutput `pulumi:"hostname"`
	// TLS setting name. **Modifying this attribute will force creation of a new resource.**
	Setting   pulumi.StringOutput `pulumi:"setting"`
	UpdatedAt pulumi.StringOutput `pulumi:"updatedAt"`
	// TLS setting value.
	Value pulumi.StringOutput `pulumi:"value"`
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewHostnameTlsSetting registers a new resource with the given unique name, arguments, and options.
func NewHostnameTlsSetting(ctx *pulumi.Context,
	name string, args *HostnameTlsSettingArgs, opts ...pulumi.ResourceOption) (*HostnameTlsSetting, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Hostname == nil {
		return nil, errors.New("invalid value for required argument 'Hostname'")
	}
	if args.Setting == nil {
		return nil, errors.New("invalid value for required argument 'Setting'")
	}
	if args.Value == nil {
		return nil, errors.New("invalid value for required argument 'Value'")
	}
	if args.ZoneId == nil {
		return nil, errors.New("invalid value for required argument 'ZoneId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource HostnameTlsSetting
	err := ctx.RegisterResource("cloudflare:index/hostnameTlsSetting:HostnameTlsSetting", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetHostnameTlsSetting gets an existing HostnameTlsSetting resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetHostnameTlsSetting(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *HostnameTlsSettingState, opts ...pulumi.ResourceOption) (*HostnameTlsSetting, error) {
	var resource HostnameTlsSetting
	err := ctx.ReadResource("cloudflare:index/hostnameTlsSetting:HostnameTlsSetting", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering HostnameTlsSetting resources.
type hostnameTlsSettingState struct {
	CreatedAt *string `pulumi:"createdAt"`
	// Hostname that belongs to this zone name. **Modifying this attribute will force creation of a new resource.**
	Hostname *string `pulumi:"hostname"`
	// TLS setting name. **Modifying this attribute will force creation of a new resource.**
	Setting   *string `pulumi:"setting"`
	UpdatedAt *string `pulumi:"updatedAt"`
	// TLS setting value.
	Value *string `pulumi:"value"`
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId *string `pulumi:"zoneId"`
}

type HostnameTlsSettingState struct {
	CreatedAt pulumi.StringPtrInput
	// Hostname that belongs to this zone name. **Modifying this attribute will force creation of a new resource.**
	Hostname pulumi.StringPtrInput
	// TLS setting name. **Modifying this attribute will force creation of a new resource.**
	Setting   pulumi.StringPtrInput
	UpdatedAt pulumi.StringPtrInput
	// TLS setting value.
	Value pulumi.StringPtrInput
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringPtrInput
}

func (HostnameTlsSettingState) ElementType() reflect.Type {
	return reflect.TypeOf((*hostnameTlsSettingState)(nil)).Elem()
}

type hostnameTlsSettingArgs struct {
	// Hostname that belongs to this zone name. **Modifying this attribute will force creation of a new resource.**
	Hostname string `pulumi:"hostname"`
	// TLS setting name. **Modifying this attribute will force creation of a new resource.**
	Setting string `pulumi:"setting"`
	// TLS setting value.
	Value string `pulumi:"value"`
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId string `pulumi:"zoneId"`
}

// The set of arguments for constructing a HostnameTlsSetting resource.
type HostnameTlsSettingArgs struct {
	// Hostname that belongs to this zone name. **Modifying this attribute will force creation of a new resource.**
	Hostname pulumi.StringInput
	// TLS setting name. **Modifying this attribute will force creation of a new resource.**
	Setting pulumi.StringInput
	// TLS setting value.
	Value pulumi.StringInput
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringInput
}

func (HostnameTlsSettingArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*hostnameTlsSettingArgs)(nil)).Elem()
}

type HostnameTlsSettingInput interface {
	pulumi.Input

	ToHostnameTlsSettingOutput() HostnameTlsSettingOutput
	ToHostnameTlsSettingOutputWithContext(ctx context.Context) HostnameTlsSettingOutput
}

func (*HostnameTlsSetting) ElementType() reflect.Type {
	return reflect.TypeOf((**HostnameTlsSetting)(nil)).Elem()
}

func (i *HostnameTlsSetting) ToHostnameTlsSettingOutput() HostnameTlsSettingOutput {
	return i.ToHostnameTlsSettingOutputWithContext(context.Background())
}

func (i *HostnameTlsSetting) ToHostnameTlsSettingOutputWithContext(ctx context.Context) HostnameTlsSettingOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HostnameTlsSettingOutput)
}

// HostnameTlsSettingArrayInput is an input type that accepts HostnameTlsSettingArray and HostnameTlsSettingArrayOutput values.
// You can construct a concrete instance of `HostnameTlsSettingArrayInput` via:
//
//	HostnameTlsSettingArray{ HostnameTlsSettingArgs{...} }
type HostnameTlsSettingArrayInput interface {
	pulumi.Input

	ToHostnameTlsSettingArrayOutput() HostnameTlsSettingArrayOutput
	ToHostnameTlsSettingArrayOutputWithContext(context.Context) HostnameTlsSettingArrayOutput
}

type HostnameTlsSettingArray []HostnameTlsSettingInput

func (HostnameTlsSettingArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*HostnameTlsSetting)(nil)).Elem()
}

func (i HostnameTlsSettingArray) ToHostnameTlsSettingArrayOutput() HostnameTlsSettingArrayOutput {
	return i.ToHostnameTlsSettingArrayOutputWithContext(context.Background())
}

func (i HostnameTlsSettingArray) ToHostnameTlsSettingArrayOutputWithContext(ctx context.Context) HostnameTlsSettingArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HostnameTlsSettingArrayOutput)
}

// HostnameTlsSettingMapInput is an input type that accepts HostnameTlsSettingMap and HostnameTlsSettingMapOutput values.
// You can construct a concrete instance of `HostnameTlsSettingMapInput` via:
//
//	HostnameTlsSettingMap{ "key": HostnameTlsSettingArgs{...} }
type HostnameTlsSettingMapInput interface {
	pulumi.Input

	ToHostnameTlsSettingMapOutput() HostnameTlsSettingMapOutput
	ToHostnameTlsSettingMapOutputWithContext(context.Context) HostnameTlsSettingMapOutput
}

type HostnameTlsSettingMap map[string]HostnameTlsSettingInput

func (HostnameTlsSettingMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*HostnameTlsSetting)(nil)).Elem()
}

func (i HostnameTlsSettingMap) ToHostnameTlsSettingMapOutput() HostnameTlsSettingMapOutput {
	return i.ToHostnameTlsSettingMapOutputWithContext(context.Background())
}

func (i HostnameTlsSettingMap) ToHostnameTlsSettingMapOutputWithContext(ctx context.Context) HostnameTlsSettingMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HostnameTlsSettingMapOutput)
}

type HostnameTlsSettingOutput struct{ *pulumi.OutputState }

func (HostnameTlsSettingOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**HostnameTlsSetting)(nil)).Elem()
}

func (o HostnameTlsSettingOutput) ToHostnameTlsSettingOutput() HostnameTlsSettingOutput {
	return o
}

func (o HostnameTlsSettingOutput) ToHostnameTlsSettingOutputWithContext(ctx context.Context) HostnameTlsSettingOutput {
	return o
}

func (o HostnameTlsSettingOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *HostnameTlsSetting) pulumi.StringOutput { return v.CreatedAt }).(pulumi.StringOutput)
}

// Hostname that belongs to this zone name. **Modifying this attribute will force creation of a new resource.**
func (o HostnameTlsSettingOutput) Hostname() pulumi.StringOutput {
	return o.ApplyT(func(v *HostnameTlsSetting) pulumi.StringOutput { return v.Hostname }).(pulumi.StringOutput)
}

// TLS setting name. **Modifying this attribute will force creation of a new resource.**
func (o HostnameTlsSettingOutput) Setting() pulumi.StringOutput {
	return o.ApplyT(func(v *HostnameTlsSetting) pulumi.StringOutput { return v.Setting }).(pulumi.StringOutput)
}

func (o HostnameTlsSettingOutput) UpdatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *HostnameTlsSetting) pulumi.StringOutput { return v.UpdatedAt }).(pulumi.StringOutput)
}

// TLS setting value.
func (o HostnameTlsSettingOutput) Value() pulumi.StringOutput {
	return o.ApplyT(func(v *HostnameTlsSetting) pulumi.StringOutput { return v.Value }).(pulumi.StringOutput)
}

// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
func (o HostnameTlsSettingOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v *HostnameTlsSetting) pulumi.StringOutput { return v.ZoneId }).(pulumi.StringOutput)
}

type HostnameTlsSettingArrayOutput struct{ *pulumi.OutputState }

func (HostnameTlsSettingArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*HostnameTlsSetting)(nil)).Elem()
}

func (o HostnameTlsSettingArrayOutput) ToHostnameTlsSettingArrayOutput() HostnameTlsSettingArrayOutput {
	return o
}

func (o HostnameTlsSettingArrayOutput) ToHostnameTlsSettingArrayOutputWithContext(ctx context.Context) HostnameTlsSettingArrayOutput {
	return o
}

func (o HostnameTlsSettingArrayOutput) Index(i pulumi.IntInput) HostnameTlsSettingOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *HostnameTlsSetting {
		return vs[0].([]*HostnameTlsSetting)[vs[1].(int)]
	}).(HostnameTlsSettingOutput)
}

type HostnameTlsSettingMapOutput struct{ *pulumi.OutputState }

func (HostnameTlsSettingMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*HostnameTlsSetting)(nil)).Elem()
}

func (o HostnameTlsSettingMapOutput) ToHostnameTlsSettingMapOutput() HostnameTlsSettingMapOutput {
	return o
}

func (o HostnameTlsSettingMapOutput) ToHostnameTlsSettingMapOutputWithContext(ctx context.Context) HostnameTlsSettingMapOutput {
	return o
}

func (o HostnameTlsSettingMapOutput) MapIndex(k pulumi.StringInput) HostnameTlsSettingOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *HostnameTlsSetting {
		return vs[0].(map[string]*HostnameTlsSetting)[vs[1].(string)]
	}).(HostnameTlsSettingOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*HostnameTlsSettingInput)(nil)).Elem(), &HostnameTlsSetting{})
	pulumi.RegisterInputType(reflect.TypeOf((*HostnameTlsSettingArrayInput)(nil)).Elem(), HostnameTlsSettingArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*HostnameTlsSettingMapInput)(nil)).Elem(), HostnameTlsSettingMap{})
	pulumi.RegisterOutputType(HostnameTlsSettingOutput{})
	pulumi.RegisterOutputType(HostnameTlsSettingArrayOutput{})
	pulumi.RegisterOutputType(HostnameTlsSettingMapOutput{})
}
