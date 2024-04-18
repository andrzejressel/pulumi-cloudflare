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

// Configure zone-wide settings for Cloudflare waiting rooms.
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
//			_, err := cloudflare.NewWaitingRoomSettings(ctx, "example", &cloudflare.WaitingRoomSettingsArgs{
//				ZoneId:                    pulumi.String("0da42c8d2132a9ddaf714f9e7c920711"),
//				SearchEngineCrawlerBypass: pulumi.Bool(true),
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
//
// ## Import
//
// ```sh
// $ pulumi import cloudflare:index/waitingRoomSettings:WaitingRoomSettings example <zone_id>
// ```
type WaitingRoomSettings struct {
	pulumi.CustomResourceState

	// Whether to allow verified search engine crawlers to bypass all waiting rooms on this zone. Defaults to `false`.
	SearchEngineCrawlerBypass pulumi.BoolPtrOutput `pulumi:"searchEngineCrawlerBypass"`
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewWaitingRoomSettings registers a new resource with the given unique name, arguments, and options.
func NewWaitingRoomSettings(ctx *pulumi.Context,
	name string, args *WaitingRoomSettingsArgs, opts ...pulumi.ResourceOption) (*WaitingRoomSettings, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ZoneId == nil {
		return nil, errors.New("invalid value for required argument 'ZoneId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource WaitingRoomSettings
	err := ctx.RegisterResource("cloudflare:index/waitingRoomSettings:WaitingRoomSettings", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetWaitingRoomSettings gets an existing WaitingRoomSettings resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetWaitingRoomSettings(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *WaitingRoomSettingsState, opts ...pulumi.ResourceOption) (*WaitingRoomSettings, error) {
	var resource WaitingRoomSettings
	err := ctx.ReadResource("cloudflare:index/waitingRoomSettings:WaitingRoomSettings", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering WaitingRoomSettings resources.
type waitingRoomSettingsState struct {
	// Whether to allow verified search engine crawlers to bypass all waiting rooms on this zone. Defaults to `false`.
	SearchEngineCrawlerBypass *bool `pulumi:"searchEngineCrawlerBypass"`
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId *string `pulumi:"zoneId"`
}

type WaitingRoomSettingsState struct {
	// Whether to allow verified search engine crawlers to bypass all waiting rooms on this zone. Defaults to `false`.
	SearchEngineCrawlerBypass pulumi.BoolPtrInput
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringPtrInput
}

func (WaitingRoomSettingsState) ElementType() reflect.Type {
	return reflect.TypeOf((*waitingRoomSettingsState)(nil)).Elem()
}

type waitingRoomSettingsArgs struct {
	// Whether to allow verified search engine crawlers to bypass all waiting rooms on this zone. Defaults to `false`.
	SearchEngineCrawlerBypass *bool `pulumi:"searchEngineCrawlerBypass"`
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId string `pulumi:"zoneId"`
}

// The set of arguments for constructing a WaitingRoomSettings resource.
type WaitingRoomSettingsArgs struct {
	// Whether to allow verified search engine crawlers to bypass all waiting rooms on this zone. Defaults to `false`.
	SearchEngineCrawlerBypass pulumi.BoolPtrInput
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringInput
}

func (WaitingRoomSettingsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*waitingRoomSettingsArgs)(nil)).Elem()
}

type WaitingRoomSettingsInput interface {
	pulumi.Input

	ToWaitingRoomSettingsOutput() WaitingRoomSettingsOutput
	ToWaitingRoomSettingsOutputWithContext(ctx context.Context) WaitingRoomSettingsOutput
}

func (*WaitingRoomSettings) ElementType() reflect.Type {
	return reflect.TypeOf((**WaitingRoomSettings)(nil)).Elem()
}

func (i *WaitingRoomSettings) ToWaitingRoomSettingsOutput() WaitingRoomSettingsOutput {
	return i.ToWaitingRoomSettingsOutputWithContext(context.Background())
}

func (i *WaitingRoomSettings) ToWaitingRoomSettingsOutputWithContext(ctx context.Context) WaitingRoomSettingsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WaitingRoomSettingsOutput)
}

// WaitingRoomSettingsArrayInput is an input type that accepts WaitingRoomSettingsArray and WaitingRoomSettingsArrayOutput values.
// You can construct a concrete instance of `WaitingRoomSettingsArrayInput` via:
//
//	WaitingRoomSettingsArray{ WaitingRoomSettingsArgs{...} }
type WaitingRoomSettingsArrayInput interface {
	pulumi.Input

	ToWaitingRoomSettingsArrayOutput() WaitingRoomSettingsArrayOutput
	ToWaitingRoomSettingsArrayOutputWithContext(context.Context) WaitingRoomSettingsArrayOutput
}

type WaitingRoomSettingsArray []WaitingRoomSettingsInput

func (WaitingRoomSettingsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WaitingRoomSettings)(nil)).Elem()
}

func (i WaitingRoomSettingsArray) ToWaitingRoomSettingsArrayOutput() WaitingRoomSettingsArrayOutput {
	return i.ToWaitingRoomSettingsArrayOutputWithContext(context.Background())
}

func (i WaitingRoomSettingsArray) ToWaitingRoomSettingsArrayOutputWithContext(ctx context.Context) WaitingRoomSettingsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WaitingRoomSettingsArrayOutput)
}

// WaitingRoomSettingsMapInput is an input type that accepts WaitingRoomSettingsMap and WaitingRoomSettingsMapOutput values.
// You can construct a concrete instance of `WaitingRoomSettingsMapInput` via:
//
//	WaitingRoomSettingsMap{ "key": WaitingRoomSettingsArgs{...} }
type WaitingRoomSettingsMapInput interface {
	pulumi.Input

	ToWaitingRoomSettingsMapOutput() WaitingRoomSettingsMapOutput
	ToWaitingRoomSettingsMapOutputWithContext(context.Context) WaitingRoomSettingsMapOutput
}

type WaitingRoomSettingsMap map[string]WaitingRoomSettingsInput

func (WaitingRoomSettingsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WaitingRoomSettings)(nil)).Elem()
}

func (i WaitingRoomSettingsMap) ToWaitingRoomSettingsMapOutput() WaitingRoomSettingsMapOutput {
	return i.ToWaitingRoomSettingsMapOutputWithContext(context.Background())
}

func (i WaitingRoomSettingsMap) ToWaitingRoomSettingsMapOutputWithContext(ctx context.Context) WaitingRoomSettingsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WaitingRoomSettingsMapOutput)
}

type WaitingRoomSettingsOutput struct{ *pulumi.OutputState }

func (WaitingRoomSettingsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**WaitingRoomSettings)(nil)).Elem()
}

func (o WaitingRoomSettingsOutput) ToWaitingRoomSettingsOutput() WaitingRoomSettingsOutput {
	return o
}

func (o WaitingRoomSettingsOutput) ToWaitingRoomSettingsOutputWithContext(ctx context.Context) WaitingRoomSettingsOutput {
	return o
}

// Whether to allow verified search engine crawlers to bypass all waiting rooms on this zone. Defaults to `false`.
func (o WaitingRoomSettingsOutput) SearchEngineCrawlerBypass() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *WaitingRoomSettings) pulumi.BoolPtrOutput { return v.SearchEngineCrawlerBypass }).(pulumi.BoolPtrOutput)
}

// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
func (o WaitingRoomSettingsOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v *WaitingRoomSettings) pulumi.StringOutput { return v.ZoneId }).(pulumi.StringOutput)
}

type WaitingRoomSettingsArrayOutput struct{ *pulumi.OutputState }

func (WaitingRoomSettingsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WaitingRoomSettings)(nil)).Elem()
}

func (o WaitingRoomSettingsArrayOutput) ToWaitingRoomSettingsArrayOutput() WaitingRoomSettingsArrayOutput {
	return o
}

func (o WaitingRoomSettingsArrayOutput) ToWaitingRoomSettingsArrayOutputWithContext(ctx context.Context) WaitingRoomSettingsArrayOutput {
	return o
}

func (o WaitingRoomSettingsArrayOutput) Index(i pulumi.IntInput) WaitingRoomSettingsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *WaitingRoomSettings {
		return vs[0].([]*WaitingRoomSettings)[vs[1].(int)]
	}).(WaitingRoomSettingsOutput)
}

type WaitingRoomSettingsMapOutput struct{ *pulumi.OutputState }

func (WaitingRoomSettingsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WaitingRoomSettings)(nil)).Elem()
}

func (o WaitingRoomSettingsMapOutput) ToWaitingRoomSettingsMapOutput() WaitingRoomSettingsMapOutput {
	return o
}

func (o WaitingRoomSettingsMapOutput) ToWaitingRoomSettingsMapOutputWithContext(ctx context.Context) WaitingRoomSettingsMapOutput {
	return o
}

func (o WaitingRoomSettingsMapOutput) MapIndex(k pulumi.StringInput) WaitingRoomSettingsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *WaitingRoomSettings {
		return vs[0].(map[string]*WaitingRoomSettings)[vs[1].(string)]
	}).(WaitingRoomSettingsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*WaitingRoomSettingsInput)(nil)).Elem(), &WaitingRoomSettings{})
	pulumi.RegisterInputType(reflect.TypeOf((*WaitingRoomSettingsArrayInput)(nil)).Elem(), WaitingRoomSettingsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*WaitingRoomSettingsMapInput)(nil)).Elem(), WaitingRoomSettingsMap{})
	pulumi.RegisterOutputType(WaitingRoomSettingsOutput{})
	pulumi.RegisterOutputType(WaitingRoomSettingsArrayOutput{})
	pulumi.RegisterOutputType(WaitingRoomSettingsMapOutput{})
}
