// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a resource which customizes Cloudflare zone settings. Note that after destroying this resource Zone Settings will be reset to their initial values.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-cloudflare/sdk/v4/go/cloudflare"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := cloudflare.NewZoneSettingsOverride(ctx, "test", &cloudflare.ZoneSettingsOverrideArgs{
//				ZoneId: pulumi.Any(_var.Cloudflare_zone_id),
//				Settings: &ZoneSettingsOverrideSettingsArgs{
//					Brotli:                  pulumi.String("on"),
//					ChallengeTtl:            pulumi.Int(2700),
//					SecurityLevel:           pulumi.String("high"),
//					OpportunisticEncryption: pulumi.String("on"),
//					AutomaticHttpsRewrites:  pulumi.String("on"),
//					Mirage:                  pulumi.String("on"),
//					Waf:                     pulumi.String("on"),
//					Minify: &ZoneSettingsOverrideSettingsMinifyArgs{
//						Css:  pulumi.String("on"),
//						Js:   pulumi.String("off"),
//						Html: pulumi.String("off"),
//					},
//					SecurityHeader: &ZoneSettingsOverrideSettingsSecurityHeaderArgs{
//						Enabled: pulumi.Bool(true),
//					},
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
type ZoneSettingsOverride struct {
	pulumi.CustomResourceState

	// Settings present in the zone at the time the resource is created. This will be used to restore the original settings when this resource is destroyed. Shares the same schema as the `settings` attribute (Above).
	InitialSettings ZoneSettingsOverrideInitialSettingArrayOutput `pulumi:"initialSettings"`
	// Time when this resource was created and the `initialSettings` were set.
	InitialSettingsReadAt pulumi.StringOutput `pulumi:"initialSettingsReadAt"`
	// Which of the current `settings` are not able to be set by the user. Which settings these are is determined by plan level and user permissions.
	// - `zoneStatus`. A full zone implies that DNS is hosted with Cloudflare. A partial zone is typically a partner-hosted zone or a CNAME setup.
	// - `zoneType`. Status of the zone. Valid values: active, pending, initializing, moved, deleted, deactivated.
	ReadonlySettings pulumi.StringArrayOutput `pulumi:"readonlySettings"`
	// Settings overrides that will be applied to the zone. If a setting is not specified the existing setting will be used. For a full list of available settings see below.
	Settings ZoneSettingsOverrideSettingsOutput `pulumi:"settings"`
	// The DNS zone ID to which apply settings.
	ZoneId     pulumi.StringOutput `pulumi:"zoneId"`
	ZoneStatus pulumi.StringOutput `pulumi:"zoneStatus"`
	ZoneType   pulumi.StringOutput `pulumi:"zoneType"`
}

// NewZoneSettingsOverride registers a new resource with the given unique name, arguments, and options.
func NewZoneSettingsOverride(ctx *pulumi.Context,
	name string, args *ZoneSettingsOverrideArgs, opts ...pulumi.ResourceOption) (*ZoneSettingsOverride, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ZoneId == nil {
		return nil, errors.New("invalid value for required argument 'ZoneId'")
	}
	var resource ZoneSettingsOverride
	err := ctx.RegisterResource("cloudflare:index/zoneSettingsOverride:ZoneSettingsOverride", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetZoneSettingsOverride gets an existing ZoneSettingsOverride resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetZoneSettingsOverride(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ZoneSettingsOverrideState, opts ...pulumi.ResourceOption) (*ZoneSettingsOverride, error) {
	var resource ZoneSettingsOverride
	err := ctx.ReadResource("cloudflare:index/zoneSettingsOverride:ZoneSettingsOverride", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ZoneSettingsOverride resources.
type zoneSettingsOverrideState struct {
	// Settings present in the zone at the time the resource is created. This will be used to restore the original settings when this resource is destroyed. Shares the same schema as the `settings` attribute (Above).
	InitialSettings []ZoneSettingsOverrideInitialSetting `pulumi:"initialSettings"`
	// Time when this resource was created and the `initialSettings` were set.
	InitialSettingsReadAt *string `pulumi:"initialSettingsReadAt"`
	// Which of the current `settings` are not able to be set by the user. Which settings these are is determined by plan level and user permissions.
	// - `zoneStatus`. A full zone implies that DNS is hosted with Cloudflare. A partial zone is typically a partner-hosted zone or a CNAME setup.
	// - `zoneType`. Status of the zone. Valid values: active, pending, initializing, moved, deleted, deactivated.
	ReadonlySettings []string `pulumi:"readonlySettings"`
	// Settings overrides that will be applied to the zone. If a setting is not specified the existing setting will be used. For a full list of available settings see below.
	Settings *ZoneSettingsOverrideSettings `pulumi:"settings"`
	// The DNS zone ID to which apply settings.
	ZoneId     *string `pulumi:"zoneId"`
	ZoneStatus *string `pulumi:"zoneStatus"`
	ZoneType   *string `pulumi:"zoneType"`
}

type ZoneSettingsOverrideState struct {
	// Settings present in the zone at the time the resource is created. This will be used to restore the original settings when this resource is destroyed. Shares the same schema as the `settings` attribute (Above).
	InitialSettings ZoneSettingsOverrideInitialSettingArrayInput
	// Time when this resource was created and the `initialSettings` were set.
	InitialSettingsReadAt pulumi.StringPtrInput
	// Which of the current `settings` are not able to be set by the user. Which settings these are is determined by plan level and user permissions.
	// - `zoneStatus`. A full zone implies that DNS is hosted with Cloudflare. A partial zone is typically a partner-hosted zone or a CNAME setup.
	// - `zoneType`. Status of the zone. Valid values: active, pending, initializing, moved, deleted, deactivated.
	ReadonlySettings pulumi.StringArrayInput
	// Settings overrides that will be applied to the zone. If a setting is not specified the existing setting will be used. For a full list of available settings see below.
	Settings ZoneSettingsOverrideSettingsPtrInput
	// The DNS zone ID to which apply settings.
	ZoneId     pulumi.StringPtrInput
	ZoneStatus pulumi.StringPtrInput
	ZoneType   pulumi.StringPtrInput
}

func (ZoneSettingsOverrideState) ElementType() reflect.Type {
	return reflect.TypeOf((*zoneSettingsOverrideState)(nil)).Elem()
}

type zoneSettingsOverrideArgs struct {
	// Settings overrides that will be applied to the zone. If a setting is not specified the existing setting will be used. For a full list of available settings see below.
	Settings *ZoneSettingsOverrideSettings `pulumi:"settings"`
	// The DNS zone ID to which apply settings.
	ZoneId string `pulumi:"zoneId"`
}

// The set of arguments for constructing a ZoneSettingsOverride resource.
type ZoneSettingsOverrideArgs struct {
	// Settings overrides that will be applied to the zone. If a setting is not specified the existing setting will be used. For a full list of available settings see below.
	Settings ZoneSettingsOverrideSettingsPtrInput
	// The DNS zone ID to which apply settings.
	ZoneId pulumi.StringInput
}

func (ZoneSettingsOverrideArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*zoneSettingsOverrideArgs)(nil)).Elem()
}

type ZoneSettingsOverrideInput interface {
	pulumi.Input

	ToZoneSettingsOverrideOutput() ZoneSettingsOverrideOutput
	ToZoneSettingsOverrideOutputWithContext(ctx context.Context) ZoneSettingsOverrideOutput
}

func (*ZoneSettingsOverride) ElementType() reflect.Type {
	return reflect.TypeOf((**ZoneSettingsOverride)(nil)).Elem()
}

func (i *ZoneSettingsOverride) ToZoneSettingsOverrideOutput() ZoneSettingsOverrideOutput {
	return i.ToZoneSettingsOverrideOutputWithContext(context.Background())
}

func (i *ZoneSettingsOverride) ToZoneSettingsOverrideOutputWithContext(ctx context.Context) ZoneSettingsOverrideOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ZoneSettingsOverrideOutput)
}

// ZoneSettingsOverrideArrayInput is an input type that accepts ZoneSettingsOverrideArray and ZoneSettingsOverrideArrayOutput values.
// You can construct a concrete instance of `ZoneSettingsOverrideArrayInput` via:
//
//	ZoneSettingsOverrideArray{ ZoneSettingsOverrideArgs{...} }
type ZoneSettingsOverrideArrayInput interface {
	pulumi.Input

	ToZoneSettingsOverrideArrayOutput() ZoneSettingsOverrideArrayOutput
	ToZoneSettingsOverrideArrayOutputWithContext(context.Context) ZoneSettingsOverrideArrayOutput
}

type ZoneSettingsOverrideArray []ZoneSettingsOverrideInput

func (ZoneSettingsOverrideArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ZoneSettingsOverride)(nil)).Elem()
}

func (i ZoneSettingsOverrideArray) ToZoneSettingsOverrideArrayOutput() ZoneSettingsOverrideArrayOutput {
	return i.ToZoneSettingsOverrideArrayOutputWithContext(context.Background())
}

func (i ZoneSettingsOverrideArray) ToZoneSettingsOverrideArrayOutputWithContext(ctx context.Context) ZoneSettingsOverrideArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ZoneSettingsOverrideArrayOutput)
}

// ZoneSettingsOverrideMapInput is an input type that accepts ZoneSettingsOverrideMap and ZoneSettingsOverrideMapOutput values.
// You can construct a concrete instance of `ZoneSettingsOverrideMapInput` via:
//
//	ZoneSettingsOverrideMap{ "key": ZoneSettingsOverrideArgs{...} }
type ZoneSettingsOverrideMapInput interface {
	pulumi.Input

	ToZoneSettingsOverrideMapOutput() ZoneSettingsOverrideMapOutput
	ToZoneSettingsOverrideMapOutputWithContext(context.Context) ZoneSettingsOverrideMapOutput
}

type ZoneSettingsOverrideMap map[string]ZoneSettingsOverrideInput

func (ZoneSettingsOverrideMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ZoneSettingsOverride)(nil)).Elem()
}

func (i ZoneSettingsOverrideMap) ToZoneSettingsOverrideMapOutput() ZoneSettingsOverrideMapOutput {
	return i.ToZoneSettingsOverrideMapOutputWithContext(context.Background())
}

func (i ZoneSettingsOverrideMap) ToZoneSettingsOverrideMapOutputWithContext(ctx context.Context) ZoneSettingsOverrideMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ZoneSettingsOverrideMapOutput)
}

type ZoneSettingsOverrideOutput struct{ *pulumi.OutputState }

func (ZoneSettingsOverrideOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ZoneSettingsOverride)(nil)).Elem()
}

func (o ZoneSettingsOverrideOutput) ToZoneSettingsOverrideOutput() ZoneSettingsOverrideOutput {
	return o
}

func (o ZoneSettingsOverrideOutput) ToZoneSettingsOverrideOutputWithContext(ctx context.Context) ZoneSettingsOverrideOutput {
	return o
}

// Settings present in the zone at the time the resource is created. This will be used to restore the original settings when this resource is destroyed. Shares the same schema as the `settings` attribute (Above).
func (o ZoneSettingsOverrideOutput) InitialSettings() ZoneSettingsOverrideInitialSettingArrayOutput {
	return o.ApplyT(func(v *ZoneSettingsOverride) ZoneSettingsOverrideInitialSettingArrayOutput { return v.InitialSettings }).(ZoneSettingsOverrideInitialSettingArrayOutput)
}

// Time when this resource was created and the `initialSettings` were set.
func (o ZoneSettingsOverrideOutput) InitialSettingsReadAt() pulumi.StringOutput {
	return o.ApplyT(func(v *ZoneSettingsOverride) pulumi.StringOutput { return v.InitialSettingsReadAt }).(pulumi.StringOutput)
}

// Which of the current `settings` are not able to be set by the user. Which settings these are is determined by plan level and user permissions.
// - `zoneStatus`. A full zone implies that DNS is hosted with Cloudflare. A partial zone is typically a partner-hosted zone or a CNAME setup.
// - `zoneType`. Status of the zone. Valid values: active, pending, initializing, moved, deleted, deactivated.
func (o ZoneSettingsOverrideOutput) ReadonlySettings() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ZoneSettingsOverride) pulumi.StringArrayOutput { return v.ReadonlySettings }).(pulumi.StringArrayOutput)
}

// Settings overrides that will be applied to the zone. If a setting is not specified the existing setting will be used. For a full list of available settings see below.
func (o ZoneSettingsOverrideOutput) Settings() ZoneSettingsOverrideSettingsOutput {
	return o.ApplyT(func(v *ZoneSettingsOverride) ZoneSettingsOverrideSettingsOutput { return v.Settings }).(ZoneSettingsOverrideSettingsOutput)
}

// The DNS zone ID to which apply settings.
func (o ZoneSettingsOverrideOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v *ZoneSettingsOverride) pulumi.StringOutput { return v.ZoneId }).(pulumi.StringOutput)
}

func (o ZoneSettingsOverrideOutput) ZoneStatus() pulumi.StringOutput {
	return o.ApplyT(func(v *ZoneSettingsOverride) pulumi.StringOutput { return v.ZoneStatus }).(pulumi.StringOutput)
}

func (o ZoneSettingsOverrideOutput) ZoneType() pulumi.StringOutput {
	return o.ApplyT(func(v *ZoneSettingsOverride) pulumi.StringOutput { return v.ZoneType }).(pulumi.StringOutput)
}

type ZoneSettingsOverrideArrayOutput struct{ *pulumi.OutputState }

func (ZoneSettingsOverrideArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ZoneSettingsOverride)(nil)).Elem()
}

func (o ZoneSettingsOverrideArrayOutput) ToZoneSettingsOverrideArrayOutput() ZoneSettingsOverrideArrayOutput {
	return o
}

func (o ZoneSettingsOverrideArrayOutput) ToZoneSettingsOverrideArrayOutputWithContext(ctx context.Context) ZoneSettingsOverrideArrayOutput {
	return o
}

func (o ZoneSettingsOverrideArrayOutput) Index(i pulumi.IntInput) ZoneSettingsOverrideOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ZoneSettingsOverride {
		return vs[0].([]*ZoneSettingsOverride)[vs[1].(int)]
	}).(ZoneSettingsOverrideOutput)
}

type ZoneSettingsOverrideMapOutput struct{ *pulumi.OutputState }

func (ZoneSettingsOverrideMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ZoneSettingsOverride)(nil)).Elem()
}

func (o ZoneSettingsOverrideMapOutput) ToZoneSettingsOverrideMapOutput() ZoneSettingsOverrideMapOutput {
	return o
}

func (o ZoneSettingsOverrideMapOutput) ToZoneSettingsOverrideMapOutputWithContext(ctx context.Context) ZoneSettingsOverrideMapOutput {
	return o
}

func (o ZoneSettingsOverrideMapOutput) MapIndex(k pulumi.StringInput) ZoneSettingsOverrideOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ZoneSettingsOverride {
		return vs[0].(map[string]*ZoneSettingsOverride)[vs[1].(string)]
	}).(ZoneSettingsOverrideOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ZoneSettingsOverrideInput)(nil)).Elem(), &ZoneSettingsOverride{})
	pulumi.RegisterInputType(reflect.TypeOf((*ZoneSettingsOverrideArrayInput)(nil)).Elem(), ZoneSettingsOverrideArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ZoneSettingsOverrideMapInput)(nil)).Elem(), ZoneSettingsOverrideMap{})
	pulumi.RegisterOutputType(ZoneSettingsOverrideOutput{})
	pulumi.RegisterOutputType(ZoneSettingsOverrideArrayOutput{})
	pulumi.RegisterOutputType(ZoneSettingsOverrideMapOutput{})
}
