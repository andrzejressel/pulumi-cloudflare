// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a resource for managing Email Routing rules.
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
//			_, err := cloudflare.NewEmailRoutingRule(ctx, "main", &cloudflare.EmailRoutingRuleArgs{
//				Actions: cloudflare.EmailRoutingRuleActionArray{
//					&cloudflare.EmailRoutingRuleActionArgs{
//						Type: pulumi.String("forward"),
//						Values: pulumi.StringArray{
//							pulumi.String("destinationaddress@example.net"),
//						},
//					},
//				},
//				Enabled: pulumi.Bool(true),
//				Matchers: cloudflare.EmailRoutingRuleMatcherArray{
//					&cloudflare.EmailRoutingRuleMatcherArgs{
//						Field: pulumi.String("to"),
//						Type:  pulumi.String("literal"),
//						Value: pulumi.String("test@example.com"),
//					},
//				},
//				Name:   pulumi.String("terraform rule"),
//				ZoneId: pulumi.String("0da42c8d2132a9ddaf714f9e7c920711"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type EmailRoutingRule struct {
	pulumi.CustomResourceState

	// List actions patterns.
	Actions EmailRoutingRuleActionArrayOutput `pulumi:"actions"`
	// Routing rule status.
	Enabled pulumi.BoolPtrOutput `pulumi:"enabled"`
	// Matching patterns to forward to your actions.
	Matchers EmailRoutingRuleMatcherArrayOutput `pulumi:"matchers"`
	// Routing rule name.
	Name pulumi.StringOutput `pulumi:"name"`
	// Priority of the routing rule.
	Priority pulumi.IntOutput `pulumi:"priority"`
	// Routing rule identifier.
	Tag pulumi.StringOutput `pulumi:"tag"`
	// The zone identifier to target for the resource.
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewEmailRoutingRule registers a new resource with the given unique name, arguments, and options.
func NewEmailRoutingRule(ctx *pulumi.Context,
	name string, args *EmailRoutingRuleArgs, opts ...pulumi.ResourceOption) (*EmailRoutingRule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Actions == nil {
		return nil, errors.New("invalid value for required argument 'Actions'")
	}
	if args.Matchers == nil {
		return nil, errors.New("invalid value for required argument 'Matchers'")
	}
	if args.Name == nil {
		return nil, errors.New("invalid value for required argument 'Name'")
	}
	if args.ZoneId == nil {
		return nil, errors.New("invalid value for required argument 'ZoneId'")
	}
	var resource EmailRoutingRule
	err := ctx.RegisterResource("cloudflare:index/emailRoutingRule:EmailRoutingRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEmailRoutingRule gets an existing EmailRoutingRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEmailRoutingRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EmailRoutingRuleState, opts ...pulumi.ResourceOption) (*EmailRoutingRule, error) {
	var resource EmailRoutingRule
	err := ctx.ReadResource("cloudflare:index/emailRoutingRule:EmailRoutingRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering EmailRoutingRule resources.
type emailRoutingRuleState struct {
	// List actions patterns.
	Actions []EmailRoutingRuleAction `pulumi:"actions"`
	// Routing rule status.
	Enabled *bool `pulumi:"enabled"`
	// Matching patterns to forward to your actions.
	Matchers []EmailRoutingRuleMatcher `pulumi:"matchers"`
	// Routing rule name.
	Name *string `pulumi:"name"`
	// Priority of the routing rule.
	Priority *int `pulumi:"priority"`
	// Routing rule identifier.
	Tag *string `pulumi:"tag"`
	// The zone identifier to target for the resource.
	ZoneId *string `pulumi:"zoneId"`
}

type EmailRoutingRuleState struct {
	// List actions patterns.
	Actions EmailRoutingRuleActionArrayInput
	// Routing rule status.
	Enabled pulumi.BoolPtrInput
	// Matching patterns to forward to your actions.
	Matchers EmailRoutingRuleMatcherArrayInput
	// Routing rule name.
	Name pulumi.StringPtrInput
	// Priority of the routing rule.
	Priority pulumi.IntPtrInput
	// Routing rule identifier.
	Tag pulumi.StringPtrInput
	// The zone identifier to target for the resource.
	ZoneId pulumi.StringPtrInput
}

func (EmailRoutingRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*emailRoutingRuleState)(nil)).Elem()
}

type emailRoutingRuleArgs struct {
	// List actions patterns.
	Actions []EmailRoutingRuleAction `pulumi:"actions"`
	// Routing rule status.
	Enabled *bool `pulumi:"enabled"`
	// Matching patterns to forward to your actions.
	Matchers []EmailRoutingRuleMatcher `pulumi:"matchers"`
	// Routing rule name.
	Name string `pulumi:"name"`
	// Priority of the routing rule.
	Priority *int `pulumi:"priority"`
	// The zone identifier to target for the resource.
	ZoneId string `pulumi:"zoneId"`
}

// The set of arguments for constructing a EmailRoutingRule resource.
type EmailRoutingRuleArgs struct {
	// List actions patterns.
	Actions EmailRoutingRuleActionArrayInput
	// Routing rule status.
	Enabled pulumi.BoolPtrInput
	// Matching patterns to forward to your actions.
	Matchers EmailRoutingRuleMatcherArrayInput
	// Routing rule name.
	Name pulumi.StringInput
	// Priority of the routing rule.
	Priority pulumi.IntPtrInput
	// The zone identifier to target for the resource.
	ZoneId pulumi.StringInput
}

func (EmailRoutingRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*emailRoutingRuleArgs)(nil)).Elem()
}

type EmailRoutingRuleInput interface {
	pulumi.Input

	ToEmailRoutingRuleOutput() EmailRoutingRuleOutput
	ToEmailRoutingRuleOutputWithContext(ctx context.Context) EmailRoutingRuleOutput
}

func (*EmailRoutingRule) ElementType() reflect.Type {
	return reflect.TypeOf((**EmailRoutingRule)(nil)).Elem()
}

func (i *EmailRoutingRule) ToEmailRoutingRuleOutput() EmailRoutingRuleOutput {
	return i.ToEmailRoutingRuleOutputWithContext(context.Background())
}

func (i *EmailRoutingRule) ToEmailRoutingRuleOutputWithContext(ctx context.Context) EmailRoutingRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EmailRoutingRuleOutput)
}

// EmailRoutingRuleArrayInput is an input type that accepts EmailRoutingRuleArray and EmailRoutingRuleArrayOutput values.
// You can construct a concrete instance of `EmailRoutingRuleArrayInput` via:
//
//	EmailRoutingRuleArray{ EmailRoutingRuleArgs{...} }
type EmailRoutingRuleArrayInput interface {
	pulumi.Input

	ToEmailRoutingRuleArrayOutput() EmailRoutingRuleArrayOutput
	ToEmailRoutingRuleArrayOutputWithContext(context.Context) EmailRoutingRuleArrayOutput
}

type EmailRoutingRuleArray []EmailRoutingRuleInput

func (EmailRoutingRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EmailRoutingRule)(nil)).Elem()
}

func (i EmailRoutingRuleArray) ToEmailRoutingRuleArrayOutput() EmailRoutingRuleArrayOutput {
	return i.ToEmailRoutingRuleArrayOutputWithContext(context.Background())
}

func (i EmailRoutingRuleArray) ToEmailRoutingRuleArrayOutputWithContext(ctx context.Context) EmailRoutingRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EmailRoutingRuleArrayOutput)
}

// EmailRoutingRuleMapInput is an input type that accepts EmailRoutingRuleMap and EmailRoutingRuleMapOutput values.
// You can construct a concrete instance of `EmailRoutingRuleMapInput` via:
//
//	EmailRoutingRuleMap{ "key": EmailRoutingRuleArgs{...} }
type EmailRoutingRuleMapInput interface {
	pulumi.Input

	ToEmailRoutingRuleMapOutput() EmailRoutingRuleMapOutput
	ToEmailRoutingRuleMapOutputWithContext(context.Context) EmailRoutingRuleMapOutput
}

type EmailRoutingRuleMap map[string]EmailRoutingRuleInput

func (EmailRoutingRuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EmailRoutingRule)(nil)).Elem()
}

func (i EmailRoutingRuleMap) ToEmailRoutingRuleMapOutput() EmailRoutingRuleMapOutput {
	return i.ToEmailRoutingRuleMapOutputWithContext(context.Background())
}

func (i EmailRoutingRuleMap) ToEmailRoutingRuleMapOutputWithContext(ctx context.Context) EmailRoutingRuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EmailRoutingRuleMapOutput)
}

type EmailRoutingRuleOutput struct{ *pulumi.OutputState }

func (EmailRoutingRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**EmailRoutingRule)(nil)).Elem()
}

func (o EmailRoutingRuleOutput) ToEmailRoutingRuleOutput() EmailRoutingRuleOutput {
	return o
}

func (o EmailRoutingRuleOutput) ToEmailRoutingRuleOutputWithContext(ctx context.Context) EmailRoutingRuleOutput {
	return o
}

// List actions patterns.
func (o EmailRoutingRuleOutput) Actions() EmailRoutingRuleActionArrayOutput {
	return o.ApplyT(func(v *EmailRoutingRule) EmailRoutingRuleActionArrayOutput { return v.Actions }).(EmailRoutingRuleActionArrayOutput)
}

// Routing rule status.
func (o EmailRoutingRuleOutput) Enabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *EmailRoutingRule) pulumi.BoolPtrOutput { return v.Enabled }).(pulumi.BoolPtrOutput)
}

// Matching patterns to forward to your actions.
func (o EmailRoutingRuleOutput) Matchers() EmailRoutingRuleMatcherArrayOutput {
	return o.ApplyT(func(v *EmailRoutingRule) EmailRoutingRuleMatcherArrayOutput { return v.Matchers }).(EmailRoutingRuleMatcherArrayOutput)
}

// Routing rule name.
func (o EmailRoutingRuleOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *EmailRoutingRule) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Priority of the routing rule.
func (o EmailRoutingRuleOutput) Priority() pulumi.IntOutput {
	return o.ApplyT(func(v *EmailRoutingRule) pulumi.IntOutput { return v.Priority }).(pulumi.IntOutput)
}

// Routing rule identifier.
func (o EmailRoutingRuleOutput) Tag() pulumi.StringOutput {
	return o.ApplyT(func(v *EmailRoutingRule) pulumi.StringOutput { return v.Tag }).(pulumi.StringOutput)
}

// The zone identifier to target for the resource.
func (o EmailRoutingRuleOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v *EmailRoutingRule) pulumi.StringOutput { return v.ZoneId }).(pulumi.StringOutput)
}

type EmailRoutingRuleArrayOutput struct{ *pulumi.OutputState }

func (EmailRoutingRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EmailRoutingRule)(nil)).Elem()
}

func (o EmailRoutingRuleArrayOutput) ToEmailRoutingRuleArrayOutput() EmailRoutingRuleArrayOutput {
	return o
}

func (o EmailRoutingRuleArrayOutput) ToEmailRoutingRuleArrayOutputWithContext(ctx context.Context) EmailRoutingRuleArrayOutput {
	return o
}

func (o EmailRoutingRuleArrayOutput) Index(i pulumi.IntInput) EmailRoutingRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *EmailRoutingRule {
		return vs[0].([]*EmailRoutingRule)[vs[1].(int)]
	}).(EmailRoutingRuleOutput)
}

type EmailRoutingRuleMapOutput struct{ *pulumi.OutputState }

func (EmailRoutingRuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EmailRoutingRule)(nil)).Elem()
}

func (o EmailRoutingRuleMapOutput) ToEmailRoutingRuleMapOutput() EmailRoutingRuleMapOutput {
	return o
}

func (o EmailRoutingRuleMapOutput) ToEmailRoutingRuleMapOutputWithContext(ctx context.Context) EmailRoutingRuleMapOutput {
	return o
}

func (o EmailRoutingRuleMapOutput) MapIndex(k pulumi.StringInput) EmailRoutingRuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *EmailRoutingRule {
		return vs[0].(map[string]*EmailRoutingRule)[vs[1].(string)]
	}).(EmailRoutingRuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*EmailRoutingRuleInput)(nil)).Elem(), &EmailRoutingRule{})
	pulumi.RegisterInputType(reflect.TypeOf((*EmailRoutingRuleArrayInput)(nil)).Elem(), EmailRoutingRuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*EmailRoutingRuleMapInput)(nil)).Elem(), EmailRoutingRuleMap{})
	pulumi.RegisterOutputType(EmailRoutingRuleOutput{})
	pulumi.RegisterOutputType(EmailRoutingRuleArrayOutput{})
	pulumi.RegisterOutputType(EmailRoutingRuleMapOutput{})
}