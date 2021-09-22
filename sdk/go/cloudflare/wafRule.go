// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Cloudflare WAF rule resource for a particular zone. This can be used to configure firewall behaviour for pre-defined firewall rules.
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
// 		_, err := cloudflare.NewWafRule(ctx, "rule100000", &cloudflare.WafRuleArgs{
// 			Mode:   pulumi.String("simulate"),
// 			RuleId: pulumi.String("100000"),
// 			ZoneId: pulumi.String("ae36f999674d196762efcc5abb06b345"),
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
// Rules can be imported using a composite ID formed of zone ID and the WAF Rule ID, e.g.
//
// ```sh
//  $ pulumi import cloudflare:index/wafRule:WafRule 100000 ae36f999674d196762efcc5abb06b345/100000
// ```
type WafRule struct {
	pulumi.CustomResourceState

	// The ID of the WAF Rule Group that contains the rule.
	GroupId pulumi.StringOutput `pulumi:"groupId"`
	// The mode of the rule, can be one of ["block", "challenge", "default", "disable", "simulate"] or ["on", "off"] depending on the WAF Rule type.
	Mode pulumi.StringOutput `pulumi:"mode"`
	// The ID of the WAF Rule Package that contains the rule.
	PackageId pulumi.StringOutput `pulumi:"packageId"`
	// The WAF Rule ID.
	RuleId pulumi.StringOutput `pulumi:"ruleId"`
	// The DNS zone ID to apply to.
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewWafRule registers a new resource with the given unique name, arguments, and options.
func NewWafRule(ctx *pulumi.Context,
	name string, args *WafRuleArgs, opts ...pulumi.ResourceOption) (*WafRule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Mode == nil {
		return nil, errors.New("invalid value for required argument 'Mode'")
	}
	if args.RuleId == nil {
		return nil, errors.New("invalid value for required argument 'RuleId'")
	}
	if args.ZoneId == nil {
		return nil, errors.New("invalid value for required argument 'ZoneId'")
	}
	var resource WafRule
	err := ctx.RegisterResource("cloudflare:index/wafRule:WafRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetWafRule gets an existing WafRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetWafRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *WafRuleState, opts ...pulumi.ResourceOption) (*WafRule, error) {
	var resource WafRule
	err := ctx.ReadResource("cloudflare:index/wafRule:WafRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering WafRule resources.
type wafRuleState struct {
	// The ID of the WAF Rule Group that contains the rule.
	GroupId *string `pulumi:"groupId"`
	// The mode of the rule, can be one of ["block", "challenge", "default", "disable", "simulate"] or ["on", "off"] depending on the WAF Rule type.
	Mode *string `pulumi:"mode"`
	// The ID of the WAF Rule Package that contains the rule.
	PackageId *string `pulumi:"packageId"`
	// The WAF Rule ID.
	RuleId *string `pulumi:"ruleId"`
	// The DNS zone ID to apply to.
	ZoneId *string `pulumi:"zoneId"`
}

type WafRuleState struct {
	// The ID of the WAF Rule Group that contains the rule.
	GroupId pulumi.StringPtrInput
	// The mode of the rule, can be one of ["block", "challenge", "default", "disable", "simulate"] or ["on", "off"] depending on the WAF Rule type.
	Mode pulumi.StringPtrInput
	// The ID of the WAF Rule Package that contains the rule.
	PackageId pulumi.StringPtrInput
	// The WAF Rule ID.
	RuleId pulumi.StringPtrInput
	// The DNS zone ID to apply to.
	ZoneId pulumi.StringPtrInput
}

func (WafRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*wafRuleState)(nil)).Elem()
}

type wafRuleArgs struct {
	// The mode of the rule, can be one of ["block", "challenge", "default", "disable", "simulate"] or ["on", "off"] depending on the WAF Rule type.
	Mode string `pulumi:"mode"`
	// The ID of the WAF Rule Package that contains the rule.
	PackageId *string `pulumi:"packageId"`
	// The WAF Rule ID.
	RuleId string `pulumi:"ruleId"`
	// The DNS zone ID to apply to.
	ZoneId string `pulumi:"zoneId"`
}

// The set of arguments for constructing a WafRule resource.
type WafRuleArgs struct {
	// The mode of the rule, can be one of ["block", "challenge", "default", "disable", "simulate"] or ["on", "off"] depending on the WAF Rule type.
	Mode pulumi.StringInput
	// The ID of the WAF Rule Package that contains the rule.
	PackageId pulumi.StringPtrInput
	// The WAF Rule ID.
	RuleId pulumi.StringInput
	// The DNS zone ID to apply to.
	ZoneId pulumi.StringInput
}

func (WafRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*wafRuleArgs)(nil)).Elem()
}

type WafRuleInput interface {
	pulumi.Input

	ToWafRuleOutput() WafRuleOutput
	ToWafRuleOutputWithContext(ctx context.Context) WafRuleOutput
}

func (*WafRule) ElementType() reflect.Type {
	return reflect.TypeOf((*WafRule)(nil))
}

func (i *WafRule) ToWafRuleOutput() WafRuleOutput {
	return i.ToWafRuleOutputWithContext(context.Background())
}

func (i *WafRule) ToWafRuleOutputWithContext(ctx context.Context) WafRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WafRuleOutput)
}

func (i *WafRule) ToWafRulePtrOutput() WafRulePtrOutput {
	return i.ToWafRulePtrOutputWithContext(context.Background())
}

func (i *WafRule) ToWafRulePtrOutputWithContext(ctx context.Context) WafRulePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WafRulePtrOutput)
}

type WafRulePtrInput interface {
	pulumi.Input

	ToWafRulePtrOutput() WafRulePtrOutput
	ToWafRulePtrOutputWithContext(ctx context.Context) WafRulePtrOutput
}

type wafRulePtrType WafRuleArgs

func (*wafRulePtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**WafRule)(nil))
}

func (i *wafRulePtrType) ToWafRulePtrOutput() WafRulePtrOutput {
	return i.ToWafRulePtrOutputWithContext(context.Background())
}

func (i *wafRulePtrType) ToWafRulePtrOutputWithContext(ctx context.Context) WafRulePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WafRulePtrOutput)
}

// WafRuleArrayInput is an input type that accepts WafRuleArray and WafRuleArrayOutput values.
// You can construct a concrete instance of `WafRuleArrayInput` via:
//
//          WafRuleArray{ WafRuleArgs{...} }
type WafRuleArrayInput interface {
	pulumi.Input

	ToWafRuleArrayOutput() WafRuleArrayOutput
	ToWafRuleArrayOutputWithContext(context.Context) WafRuleArrayOutput
}

type WafRuleArray []WafRuleInput

func (WafRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*WafRule)(nil))
}

func (i WafRuleArray) ToWafRuleArrayOutput() WafRuleArrayOutput {
	return i.ToWafRuleArrayOutputWithContext(context.Background())
}

func (i WafRuleArray) ToWafRuleArrayOutputWithContext(ctx context.Context) WafRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WafRuleArrayOutput)
}

// WafRuleMapInput is an input type that accepts WafRuleMap and WafRuleMapOutput values.
// You can construct a concrete instance of `WafRuleMapInput` via:
//
//          WafRuleMap{ "key": WafRuleArgs{...} }
type WafRuleMapInput interface {
	pulumi.Input

	ToWafRuleMapOutput() WafRuleMapOutput
	ToWafRuleMapOutputWithContext(context.Context) WafRuleMapOutput
}

type WafRuleMap map[string]WafRuleInput

func (WafRuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*WafRule)(nil))
}

func (i WafRuleMap) ToWafRuleMapOutput() WafRuleMapOutput {
	return i.ToWafRuleMapOutputWithContext(context.Background())
}

func (i WafRuleMap) ToWafRuleMapOutputWithContext(ctx context.Context) WafRuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WafRuleMapOutput)
}

type WafRuleOutput struct {
	*pulumi.OutputState
}

func (WafRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*WafRule)(nil))
}

func (o WafRuleOutput) ToWafRuleOutput() WafRuleOutput {
	return o
}

func (o WafRuleOutput) ToWafRuleOutputWithContext(ctx context.Context) WafRuleOutput {
	return o
}

func (o WafRuleOutput) ToWafRulePtrOutput() WafRulePtrOutput {
	return o.ToWafRulePtrOutputWithContext(context.Background())
}

func (o WafRuleOutput) ToWafRulePtrOutputWithContext(ctx context.Context) WafRulePtrOutput {
	return o.ApplyT(func(v WafRule) *WafRule {
		return &v
	}).(WafRulePtrOutput)
}

type WafRulePtrOutput struct {
	*pulumi.OutputState
}

func (WafRulePtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**WafRule)(nil))
}

func (o WafRulePtrOutput) ToWafRulePtrOutput() WafRulePtrOutput {
	return o
}

func (o WafRulePtrOutput) ToWafRulePtrOutputWithContext(ctx context.Context) WafRulePtrOutput {
	return o
}

type WafRuleArrayOutput struct{ *pulumi.OutputState }

func (WafRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]WafRule)(nil))
}

func (o WafRuleArrayOutput) ToWafRuleArrayOutput() WafRuleArrayOutput {
	return o
}

func (o WafRuleArrayOutput) ToWafRuleArrayOutputWithContext(ctx context.Context) WafRuleArrayOutput {
	return o
}

func (o WafRuleArrayOutput) Index(i pulumi.IntInput) WafRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) WafRule {
		return vs[0].([]WafRule)[vs[1].(int)]
	}).(WafRuleOutput)
}

type WafRuleMapOutput struct{ *pulumi.OutputState }

func (WafRuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]WafRule)(nil))
}

func (o WafRuleMapOutput) ToWafRuleMapOutput() WafRuleMapOutput {
	return o
}

func (o WafRuleMapOutput) ToWafRuleMapOutputWithContext(ctx context.Context) WafRuleMapOutput {
	return o
}

func (o WafRuleMapOutput) MapIndex(k pulumi.StringInput) WafRuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) WafRule {
		return vs[0].(map[string]WafRule)[vs[1].(string)]
	}).(WafRuleOutput)
}

func init() {
	pulumi.RegisterOutputType(WafRuleOutput{})
	pulumi.RegisterOutputType(WafRulePtrOutput{})
	pulumi.RegisterOutputType(WafRuleArrayOutput{})
	pulumi.RegisterOutputType(WafRuleMapOutput{})
}
