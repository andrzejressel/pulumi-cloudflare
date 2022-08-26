// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Cloudflare Device Posture Integration resource. Device posture integrations configure third-party data providers for device posture rules.
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
//			_, err := cloudflare.NewDevicePostureIntegration(ctx, "thirdPartyDevicesPostureIntegration", &cloudflare.DevicePostureIntegrationArgs{
//				AccountId: pulumi.String("1d5fdc9e88c8a8c4518b068cd94331fe"),
//				Configs: DevicePostureIntegrationConfigArray{
//					&DevicePostureIntegrationConfigArgs{
//						ApiUrl:       pulumi.String("https://example.com/api"),
//						AuthUrl:      pulumi.String("https://example.com/connect/token"),
//						ClientId:     pulumi.String("client-id"),
//						ClientSecret: pulumi.String("client-secret"),
//					},
//				},
//				Interval: pulumi.String("24h"),
//				Name:     pulumi.String("Device posture integration"),
//				Type:     pulumi.String("workspace_one"),
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
// Device posture integrations can be imported using a composite ID formed of account ID and device posture integration ID.
//
// ```sh
//
//	$ pulumi import cloudflare:index/devicePostureIntegration:DevicePostureIntegration corporate_devices cb029e245cfdd66dc8d2e570d5dd3322/0ade592a-62d6-46ab-bac8-01f47c7fa792
//
// ```
type DevicePostureIntegration struct {
	pulumi.CustomResourceState

	// The account to which the device posture integration should be added.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// The device posture integration's connection authorization parameters.
	Configs    DevicePostureIntegrationConfigArrayOutput `pulumi:"configs"`
	Identifier pulumi.StringPtrOutput                    `pulumi:"identifier"`
	// Indicates the frequency with which to poll the third-party API.
	// Must be in the format `"1h"` or `"30m"`. Valid units are `h` and `m`.
	Interval pulumi.StringPtrOutput `pulumi:"interval"`
	// Name of the device posture integration.
	Name pulumi.StringOutput `pulumi:"name"`
	// The device posture integration type. Valid values are `workspaceOne`.
	Type pulumi.StringOutput `pulumi:"type"`
}

// NewDevicePostureIntegration registers a new resource with the given unique name, arguments, and options.
func NewDevicePostureIntegration(ctx *pulumi.Context,
	name string, args *DevicePostureIntegrationArgs, opts ...pulumi.ResourceOption) (*DevicePostureIntegration, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	if args.Name == nil {
		return nil, errors.New("invalid value for required argument 'Name'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	var resource DevicePostureIntegration
	err := ctx.RegisterResource("cloudflare:index/devicePostureIntegration:DevicePostureIntegration", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDevicePostureIntegration gets an existing DevicePostureIntegration resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDevicePostureIntegration(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DevicePostureIntegrationState, opts ...pulumi.ResourceOption) (*DevicePostureIntegration, error) {
	var resource DevicePostureIntegration
	err := ctx.ReadResource("cloudflare:index/devicePostureIntegration:DevicePostureIntegration", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DevicePostureIntegration resources.
type devicePostureIntegrationState struct {
	// The account to which the device posture integration should be added.
	AccountId *string `pulumi:"accountId"`
	// The device posture integration's connection authorization parameters.
	Configs    []DevicePostureIntegrationConfig `pulumi:"configs"`
	Identifier *string                          `pulumi:"identifier"`
	// Indicates the frequency with which to poll the third-party API.
	// Must be in the format `"1h"` or `"30m"`. Valid units are `h` and `m`.
	Interval *string `pulumi:"interval"`
	// Name of the device posture integration.
	Name *string `pulumi:"name"`
	// The device posture integration type. Valid values are `workspaceOne`.
	Type *string `pulumi:"type"`
}

type DevicePostureIntegrationState struct {
	// The account to which the device posture integration should be added.
	AccountId pulumi.StringPtrInput
	// The device posture integration's connection authorization parameters.
	Configs    DevicePostureIntegrationConfigArrayInput
	Identifier pulumi.StringPtrInput
	// Indicates the frequency with which to poll the third-party API.
	// Must be in the format `"1h"` or `"30m"`. Valid units are `h` and `m`.
	Interval pulumi.StringPtrInput
	// Name of the device posture integration.
	Name pulumi.StringPtrInput
	// The device posture integration type. Valid values are `workspaceOne`.
	Type pulumi.StringPtrInput
}

func (DevicePostureIntegrationState) ElementType() reflect.Type {
	return reflect.TypeOf((*devicePostureIntegrationState)(nil)).Elem()
}

type devicePostureIntegrationArgs struct {
	// The account to which the device posture integration should be added.
	AccountId string `pulumi:"accountId"`
	// The device posture integration's connection authorization parameters.
	Configs    []DevicePostureIntegrationConfig `pulumi:"configs"`
	Identifier *string                          `pulumi:"identifier"`
	// Indicates the frequency with which to poll the third-party API.
	// Must be in the format `"1h"` or `"30m"`. Valid units are `h` and `m`.
	Interval *string `pulumi:"interval"`
	// Name of the device posture integration.
	Name string `pulumi:"name"`
	// The device posture integration type. Valid values are `workspaceOne`.
	Type string `pulumi:"type"`
}

// The set of arguments for constructing a DevicePostureIntegration resource.
type DevicePostureIntegrationArgs struct {
	// The account to which the device posture integration should be added.
	AccountId pulumi.StringInput
	// The device posture integration's connection authorization parameters.
	Configs    DevicePostureIntegrationConfigArrayInput
	Identifier pulumi.StringPtrInput
	// Indicates the frequency with which to poll the third-party API.
	// Must be in the format `"1h"` or `"30m"`. Valid units are `h` and `m`.
	Interval pulumi.StringPtrInput
	// Name of the device posture integration.
	Name pulumi.StringInput
	// The device posture integration type. Valid values are `workspaceOne`.
	Type pulumi.StringInput
}

func (DevicePostureIntegrationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*devicePostureIntegrationArgs)(nil)).Elem()
}

type DevicePostureIntegrationInput interface {
	pulumi.Input

	ToDevicePostureIntegrationOutput() DevicePostureIntegrationOutput
	ToDevicePostureIntegrationOutputWithContext(ctx context.Context) DevicePostureIntegrationOutput
}

func (*DevicePostureIntegration) ElementType() reflect.Type {
	return reflect.TypeOf((**DevicePostureIntegration)(nil)).Elem()
}

func (i *DevicePostureIntegration) ToDevicePostureIntegrationOutput() DevicePostureIntegrationOutput {
	return i.ToDevicePostureIntegrationOutputWithContext(context.Background())
}

func (i *DevicePostureIntegration) ToDevicePostureIntegrationOutputWithContext(ctx context.Context) DevicePostureIntegrationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DevicePostureIntegrationOutput)
}

// DevicePostureIntegrationArrayInput is an input type that accepts DevicePostureIntegrationArray and DevicePostureIntegrationArrayOutput values.
// You can construct a concrete instance of `DevicePostureIntegrationArrayInput` via:
//
//	DevicePostureIntegrationArray{ DevicePostureIntegrationArgs{...} }
type DevicePostureIntegrationArrayInput interface {
	pulumi.Input

	ToDevicePostureIntegrationArrayOutput() DevicePostureIntegrationArrayOutput
	ToDevicePostureIntegrationArrayOutputWithContext(context.Context) DevicePostureIntegrationArrayOutput
}

type DevicePostureIntegrationArray []DevicePostureIntegrationInput

func (DevicePostureIntegrationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DevicePostureIntegration)(nil)).Elem()
}

func (i DevicePostureIntegrationArray) ToDevicePostureIntegrationArrayOutput() DevicePostureIntegrationArrayOutput {
	return i.ToDevicePostureIntegrationArrayOutputWithContext(context.Background())
}

func (i DevicePostureIntegrationArray) ToDevicePostureIntegrationArrayOutputWithContext(ctx context.Context) DevicePostureIntegrationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DevicePostureIntegrationArrayOutput)
}

// DevicePostureIntegrationMapInput is an input type that accepts DevicePostureIntegrationMap and DevicePostureIntegrationMapOutput values.
// You can construct a concrete instance of `DevicePostureIntegrationMapInput` via:
//
//	DevicePostureIntegrationMap{ "key": DevicePostureIntegrationArgs{...} }
type DevicePostureIntegrationMapInput interface {
	pulumi.Input

	ToDevicePostureIntegrationMapOutput() DevicePostureIntegrationMapOutput
	ToDevicePostureIntegrationMapOutputWithContext(context.Context) DevicePostureIntegrationMapOutput
}

type DevicePostureIntegrationMap map[string]DevicePostureIntegrationInput

func (DevicePostureIntegrationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DevicePostureIntegration)(nil)).Elem()
}

func (i DevicePostureIntegrationMap) ToDevicePostureIntegrationMapOutput() DevicePostureIntegrationMapOutput {
	return i.ToDevicePostureIntegrationMapOutputWithContext(context.Background())
}

func (i DevicePostureIntegrationMap) ToDevicePostureIntegrationMapOutputWithContext(ctx context.Context) DevicePostureIntegrationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DevicePostureIntegrationMapOutput)
}

type DevicePostureIntegrationOutput struct{ *pulumi.OutputState }

func (DevicePostureIntegrationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DevicePostureIntegration)(nil)).Elem()
}

func (o DevicePostureIntegrationOutput) ToDevicePostureIntegrationOutput() DevicePostureIntegrationOutput {
	return o
}

func (o DevicePostureIntegrationOutput) ToDevicePostureIntegrationOutputWithContext(ctx context.Context) DevicePostureIntegrationOutput {
	return o
}

// The account to which the device posture integration should be added.
func (o DevicePostureIntegrationOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *DevicePostureIntegration) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// The device posture integration's connection authorization parameters.
func (o DevicePostureIntegrationOutput) Configs() DevicePostureIntegrationConfigArrayOutput {
	return o.ApplyT(func(v *DevicePostureIntegration) DevicePostureIntegrationConfigArrayOutput { return v.Configs }).(DevicePostureIntegrationConfigArrayOutput)
}

func (o DevicePostureIntegrationOutput) Identifier() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *DevicePostureIntegration) pulumi.StringPtrOutput { return v.Identifier }).(pulumi.StringPtrOutput)
}

// Indicates the frequency with which to poll the third-party API.
// Must be in the format `"1h"` or `"30m"`. Valid units are `h` and `m`.
func (o DevicePostureIntegrationOutput) Interval() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *DevicePostureIntegration) pulumi.StringPtrOutput { return v.Interval }).(pulumi.StringPtrOutput)
}

// Name of the device posture integration.
func (o DevicePostureIntegrationOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *DevicePostureIntegration) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The device posture integration type. Valid values are `workspaceOne`.
func (o DevicePostureIntegrationOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *DevicePostureIntegration) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

type DevicePostureIntegrationArrayOutput struct{ *pulumi.OutputState }

func (DevicePostureIntegrationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DevicePostureIntegration)(nil)).Elem()
}

func (o DevicePostureIntegrationArrayOutput) ToDevicePostureIntegrationArrayOutput() DevicePostureIntegrationArrayOutput {
	return o
}

func (o DevicePostureIntegrationArrayOutput) ToDevicePostureIntegrationArrayOutputWithContext(ctx context.Context) DevicePostureIntegrationArrayOutput {
	return o
}

func (o DevicePostureIntegrationArrayOutput) Index(i pulumi.IntInput) DevicePostureIntegrationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DevicePostureIntegration {
		return vs[0].([]*DevicePostureIntegration)[vs[1].(int)]
	}).(DevicePostureIntegrationOutput)
}

type DevicePostureIntegrationMapOutput struct{ *pulumi.OutputState }

func (DevicePostureIntegrationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DevicePostureIntegration)(nil)).Elem()
}

func (o DevicePostureIntegrationMapOutput) ToDevicePostureIntegrationMapOutput() DevicePostureIntegrationMapOutput {
	return o
}

func (o DevicePostureIntegrationMapOutput) ToDevicePostureIntegrationMapOutputWithContext(ctx context.Context) DevicePostureIntegrationMapOutput {
	return o
}

func (o DevicePostureIntegrationMapOutput) MapIndex(k pulumi.StringInput) DevicePostureIntegrationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DevicePostureIntegration {
		return vs[0].(map[string]*DevicePostureIntegration)[vs[1].(string)]
	}).(DevicePostureIntegrationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DevicePostureIntegrationInput)(nil)).Elem(), &DevicePostureIntegration{})
	pulumi.RegisterInputType(reflect.TypeOf((*DevicePostureIntegrationArrayInput)(nil)).Elem(), DevicePostureIntegrationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DevicePostureIntegrationMapInput)(nil)).Elem(), DevicePostureIntegrationMap{})
	pulumi.RegisterOutputType(DevicePostureIntegrationOutput{})
	pulumi.RegisterOutputType(DevicePostureIntegrationArrayOutput{})
	pulumi.RegisterOutputType(DevicePostureIntegrationMapOutput{})
}
