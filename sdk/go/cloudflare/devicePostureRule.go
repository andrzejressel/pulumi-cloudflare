// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Cloudflare Device Posture Rule resource. Device posture rules configure security policies for device posture checks.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-cloudflare/sdk/v4/go/cloudflare"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := cloudflare.NewDevicePostureRule(ctx, "corporateDevicesPostureRule", &cloudflare.DevicePostureRuleArgs{
// 			AccountId:   pulumi.String("1d5fdc9e88c8a8c4518b068cd94331fe"),
// 			Name:        pulumi.String("Corporate devices posture rule"),
// 			Type:        pulumi.String("serial_number"),
// 			Description: pulumi.String("Device posture rule for corporate devices."),
// 			Schedule:    pulumi.String("24h"),
// 			Matches: cloudflare.DevicePostureRuleMatchArray{
// 				&cloudflare.DevicePostureRuleMatchArgs{
// 					Platform: pulumi.String("mac"),
// 				},
// 			},
// 			Inputs: cloudflare.DevicePostureRuleInputArray{
// 				&cloudflare.DevicePostureRuleInputArgs{
// 					Id: pulumi.Any(cloudflare_teams_list.Corporate_devices.Id),
// 				},
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// Device posture rules can be imported using a composite ID formed of account ID and device posture rule ID.
//
// ```sh
//  $ pulumi import cloudflare:index/devicePostureRule:DevicePostureRule corporate_devices cb029e245cfdd66dc8d2e570d5dd3322/d41d8cd98f00b204e9800998ecf8427e
// ```
type DevicePostureRule struct {
	pulumi.CustomResourceState

	// The account to which the device posture rule should be added.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// The description of the device posture rule.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The value to be checked against. See below for reference
	// structure.
	Inputs DevicePostureRuleInputTypeArrayOutput `pulumi:"inputs"`
	// The conditions that the client must match to run the rule. See below for reference structure.
	Matches DevicePostureRuleMatchArrayOutput `pulumi:"matches"`
	// Name of the device posture rule.
	Name pulumi.StringPtrOutput `pulumi:"name"`
	// Tells the client when to run the device posture check.
	// Must be in the format `"1h"` or `"30m"`. Valid units are `h` and `m`.
	Schedule pulumi.StringPtrOutput `pulumi:"schedule"`
	// The device posture rule type. Valid values are `file`, `application`, and `serialNumber`.
	Type pulumi.StringOutput `pulumi:"type"`
}

// NewDevicePostureRule registers a new resource with the given unique name, arguments, and options.
func NewDevicePostureRule(ctx *pulumi.Context,
	name string, args *DevicePostureRuleArgs, opts ...pulumi.ResourceOption) (*DevicePostureRule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	var resource DevicePostureRule
	err := ctx.RegisterResource("cloudflare:index/devicePostureRule:DevicePostureRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDevicePostureRule gets an existing DevicePostureRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDevicePostureRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DevicePostureRuleState, opts ...pulumi.ResourceOption) (*DevicePostureRule, error) {
	var resource DevicePostureRule
	err := ctx.ReadResource("cloudflare:index/devicePostureRule:DevicePostureRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DevicePostureRule resources.
type devicePostureRuleState struct {
	// The account to which the device posture rule should be added.
	AccountId *string `pulumi:"accountId"`
	// The description of the device posture rule.
	Description *string `pulumi:"description"`
	// The value to be checked against. See below for reference
	// structure.
	Inputs []DevicePostureRuleInputType `pulumi:"inputs"`
	// The conditions that the client must match to run the rule. See below for reference structure.
	Matches []DevicePostureRuleMatch `pulumi:"matches"`
	// Name of the device posture rule.
	Name *string `pulumi:"name"`
	// Tells the client when to run the device posture check.
	// Must be in the format `"1h"` or `"30m"`. Valid units are `h` and `m`.
	Schedule *string `pulumi:"schedule"`
	// The device posture rule type. Valid values are `file`, `application`, and `serialNumber`.
	Type *string `pulumi:"type"`
}

type DevicePostureRuleState struct {
	// The account to which the device posture rule should be added.
	AccountId pulumi.StringPtrInput
	// The description of the device posture rule.
	Description pulumi.StringPtrInput
	// The value to be checked against. See below for reference
	// structure.
	Inputs DevicePostureRuleInputTypeArrayInput
	// The conditions that the client must match to run the rule. See below for reference structure.
	Matches DevicePostureRuleMatchArrayInput
	// Name of the device posture rule.
	Name pulumi.StringPtrInput
	// Tells the client when to run the device posture check.
	// Must be in the format `"1h"` or `"30m"`. Valid units are `h` and `m`.
	Schedule pulumi.StringPtrInput
	// The device posture rule type. Valid values are `file`, `application`, and `serialNumber`.
	Type pulumi.StringPtrInput
}

func (DevicePostureRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*devicePostureRuleState)(nil)).Elem()
}

type devicePostureRuleArgs struct {
	// The account to which the device posture rule should be added.
	AccountId string `pulumi:"accountId"`
	// The description of the device posture rule.
	Description *string `pulumi:"description"`
	// The value to be checked against. See below for reference
	// structure.
	Inputs []DevicePostureRuleInputType `pulumi:"inputs"`
	// The conditions that the client must match to run the rule. See below for reference structure.
	Matches []DevicePostureRuleMatch `pulumi:"matches"`
	// Name of the device posture rule.
	Name *string `pulumi:"name"`
	// Tells the client when to run the device posture check.
	// Must be in the format `"1h"` or `"30m"`. Valid units are `h` and `m`.
	Schedule *string `pulumi:"schedule"`
	// The device posture rule type. Valid values are `file`, `application`, and `serialNumber`.
	Type string `pulumi:"type"`
}

// The set of arguments for constructing a DevicePostureRule resource.
type DevicePostureRuleArgs struct {
	// The account to which the device posture rule should be added.
	AccountId pulumi.StringInput
	// The description of the device posture rule.
	Description pulumi.StringPtrInput
	// The value to be checked against. See below for reference
	// structure.
	Inputs DevicePostureRuleInputTypeArrayInput
	// The conditions that the client must match to run the rule. See below for reference structure.
	Matches DevicePostureRuleMatchArrayInput
	// Name of the device posture rule.
	Name pulumi.StringPtrInput
	// Tells the client when to run the device posture check.
	// Must be in the format `"1h"` or `"30m"`. Valid units are `h` and `m`.
	Schedule pulumi.StringPtrInput
	// The device posture rule type. Valid values are `file`, `application`, and `serialNumber`.
	Type pulumi.StringInput
}

func (DevicePostureRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*devicePostureRuleArgs)(nil)).Elem()
}

type DevicePostureRuleInput interface {
	pulumi.Input

	ToDevicePostureRuleOutput() DevicePostureRuleOutput
	ToDevicePostureRuleOutputWithContext(ctx context.Context) DevicePostureRuleOutput
}

func (*DevicePostureRule) ElementType() reflect.Type {
	return reflect.TypeOf((*DevicePostureRule)(nil))
}

func (i *DevicePostureRule) ToDevicePostureRuleOutput() DevicePostureRuleOutput {
	return i.ToDevicePostureRuleOutputWithContext(context.Background())
}

func (i *DevicePostureRule) ToDevicePostureRuleOutputWithContext(ctx context.Context) DevicePostureRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DevicePostureRuleOutput)
}

func (i *DevicePostureRule) ToDevicePostureRulePtrOutput() DevicePostureRulePtrOutput {
	return i.ToDevicePostureRulePtrOutputWithContext(context.Background())
}

func (i *DevicePostureRule) ToDevicePostureRulePtrOutputWithContext(ctx context.Context) DevicePostureRulePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DevicePostureRulePtrOutput)
}

type DevicePostureRulePtrInput interface {
	pulumi.Input

	ToDevicePostureRulePtrOutput() DevicePostureRulePtrOutput
	ToDevicePostureRulePtrOutputWithContext(ctx context.Context) DevicePostureRulePtrOutput
}

type devicePostureRulePtrType DevicePostureRuleArgs

func (*devicePostureRulePtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**DevicePostureRule)(nil))
}

func (i *devicePostureRulePtrType) ToDevicePostureRulePtrOutput() DevicePostureRulePtrOutput {
	return i.ToDevicePostureRulePtrOutputWithContext(context.Background())
}

func (i *devicePostureRulePtrType) ToDevicePostureRulePtrOutputWithContext(ctx context.Context) DevicePostureRulePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DevicePostureRulePtrOutput)
}

// DevicePostureRuleArrayInput is an input type that accepts DevicePostureRuleArray and DevicePostureRuleArrayOutput values.
// You can construct a concrete instance of `DevicePostureRuleArrayInput` via:
//
//          DevicePostureRuleArray{ DevicePostureRuleArgs{...} }
type DevicePostureRuleArrayInput interface {
	pulumi.Input

	ToDevicePostureRuleArrayOutput() DevicePostureRuleArrayOutput
	ToDevicePostureRuleArrayOutputWithContext(context.Context) DevicePostureRuleArrayOutput
}

type DevicePostureRuleArray []DevicePostureRuleInput

func (DevicePostureRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*DevicePostureRule)(nil))
}

func (i DevicePostureRuleArray) ToDevicePostureRuleArrayOutput() DevicePostureRuleArrayOutput {
	return i.ToDevicePostureRuleArrayOutputWithContext(context.Background())
}

func (i DevicePostureRuleArray) ToDevicePostureRuleArrayOutputWithContext(ctx context.Context) DevicePostureRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DevicePostureRuleArrayOutput)
}

// DevicePostureRuleMapInput is an input type that accepts DevicePostureRuleMap and DevicePostureRuleMapOutput values.
// You can construct a concrete instance of `DevicePostureRuleMapInput` via:
//
//          DevicePostureRuleMap{ "key": DevicePostureRuleArgs{...} }
type DevicePostureRuleMapInput interface {
	pulumi.Input

	ToDevicePostureRuleMapOutput() DevicePostureRuleMapOutput
	ToDevicePostureRuleMapOutputWithContext(context.Context) DevicePostureRuleMapOutput
}

type DevicePostureRuleMap map[string]DevicePostureRuleInput

func (DevicePostureRuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*DevicePostureRule)(nil))
}

func (i DevicePostureRuleMap) ToDevicePostureRuleMapOutput() DevicePostureRuleMapOutput {
	return i.ToDevicePostureRuleMapOutputWithContext(context.Background())
}

func (i DevicePostureRuleMap) ToDevicePostureRuleMapOutputWithContext(ctx context.Context) DevicePostureRuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DevicePostureRuleMapOutput)
}

type DevicePostureRuleOutput struct {
	*pulumi.OutputState
}

func (DevicePostureRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*DevicePostureRule)(nil))
}

func (o DevicePostureRuleOutput) ToDevicePostureRuleOutput() DevicePostureRuleOutput {
	return o
}

func (o DevicePostureRuleOutput) ToDevicePostureRuleOutputWithContext(ctx context.Context) DevicePostureRuleOutput {
	return o
}

func (o DevicePostureRuleOutput) ToDevicePostureRulePtrOutput() DevicePostureRulePtrOutput {
	return o.ToDevicePostureRulePtrOutputWithContext(context.Background())
}

func (o DevicePostureRuleOutput) ToDevicePostureRulePtrOutputWithContext(ctx context.Context) DevicePostureRulePtrOutput {
	return o.ApplyT(func(v DevicePostureRule) *DevicePostureRule {
		return &v
	}).(DevicePostureRulePtrOutput)
}

type DevicePostureRulePtrOutput struct {
	*pulumi.OutputState
}

func (DevicePostureRulePtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DevicePostureRule)(nil))
}

func (o DevicePostureRulePtrOutput) ToDevicePostureRulePtrOutput() DevicePostureRulePtrOutput {
	return o
}

func (o DevicePostureRulePtrOutput) ToDevicePostureRulePtrOutputWithContext(ctx context.Context) DevicePostureRulePtrOutput {
	return o
}

type DevicePostureRuleArrayOutput struct{ *pulumi.OutputState }

func (DevicePostureRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]DevicePostureRule)(nil))
}

func (o DevicePostureRuleArrayOutput) ToDevicePostureRuleArrayOutput() DevicePostureRuleArrayOutput {
	return o
}

func (o DevicePostureRuleArrayOutput) ToDevicePostureRuleArrayOutputWithContext(ctx context.Context) DevicePostureRuleArrayOutput {
	return o
}

func (o DevicePostureRuleArrayOutput) Index(i pulumi.IntInput) DevicePostureRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) DevicePostureRule {
		return vs[0].([]DevicePostureRule)[vs[1].(int)]
	}).(DevicePostureRuleOutput)
}

type DevicePostureRuleMapOutput struct{ *pulumi.OutputState }

func (DevicePostureRuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]DevicePostureRule)(nil))
}

func (o DevicePostureRuleMapOutput) ToDevicePostureRuleMapOutput() DevicePostureRuleMapOutput {
	return o
}

func (o DevicePostureRuleMapOutput) ToDevicePostureRuleMapOutputWithContext(ctx context.Context) DevicePostureRuleMapOutput {
	return o
}

func (o DevicePostureRuleMapOutput) MapIndex(k pulumi.StringInput) DevicePostureRuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) DevicePostureRule {
		return vs[0].(map[string]DevicePostureRule)[vs[1].(string)]
	}).(DevicePostureRuleOutput)
}

func init() {
	pulumi.RegisterOutputType(DevicePostureRuleOutput{})
	pulumi.RegisterOutputType(DevicePostureRulePtrOutput{})
	pulumi.RegisterOutputType(DevicePostureRuleArrayOutput{})
	pulumi.RegisterOutputType(DevicePostureRuleMapOutput{})
}
