// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Cloudflare page rule resource.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-cloudflare/sdk/v4/go/cloudflare"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := cloudflare.NewPageRule(ctx, "foobar", &cloudflare.PageRuleArgs{
//				ZoneId:   pulumi.Any(_var.Cloudflare_zone_id),
//				Target:   pulumi.String(fmt.Sprintf("sub.%v/page", _var.Cloudflare_zone)),
//				Priority: pulumi.Int(1),
//				Actions: &PageRuleActionsArgs{
//					Ssl:              pulumi.String("flexible"),
//					EmailObfuscation: pulumi.String("on"),
//					Minifies: PageRuleActionsMinifyArray{
//						&PageRuleActionsMinifyArgs{
//							Html: pulumi.String("off"),
//							Css:  pulumi.String("on"),
//							Js:   pulumi.String("on"),
//						},
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
//
// ## Import
//
// Page rules can be imported using a composite ID formed of zone ID and page rule ID, e.g.
//
// ```sh
//
//	$ pulumi import cloudflare:index/pageRule:PageRule default d41d8cd98f00b204e9800998ecf8427e/ch8374ftwdghsif43
//
// ```
type PageRule struct {
	pulumi.CustomResourceState

	// The actions taken by the page rule, options given below.
	Actions PageRuleActionsOutput `pulumi:"actions"`
	// The priority of the page rule among others for this target, the higher the number the higher the priority as per [API documentation](https://api.cloudflare.com/#page-rules-for-a-zone-create-page-rule).
	Priority pulumi.IntPtrOutput `pulumi:"priority"`
	// Whether the page rule is active or disabled.
	Status pulumi.StringPtrOutput `pulumi:"status"`
	// The URL pattern to target with the page rule.
	Target pulumi.StringOutput `pulumi:"target"`
	// The DNS zone ID to which the page rule should be added.
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewPageRule registers a new resource with the given unique name, arguments, and options.
func NewPageRule(ctx *pulumi.Context,
	name string, args *PageRuleArgs, opts ...pulumi.ResourceOption) (*PageRule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Actions == nil {
		return nil, errors.New("invalid value for required argument 'Actions'")
	}
	if args.Target == nil {
		return nil, errors.New("invalid value for required argument 'Target'")
	}
	if args.ZoneId == nil {
		return nil, errors.New("invalid value for required argument 'ZoneId'")
	}
	var resource PageRule
	err := ctx.RegisterResource("cloudflare:index/pageRule:PageRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPageRule gets an existing PageRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPageRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PageRuleState, opts ...pulumi.ResourceOption) (*PageRule, error) {
	var resource PageRule
	err := ctx.ReadResource("cloudflare:index/pageRule:PageRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering PageRule resources.
type pageRuleState struct {
	// The actions taken by the page rule, options given below.
	Actions *PageRuleActions `pulumi:"actions"`
	// The priority of the page rule among others for this target, the higher the number the higher the priority as per [API documentation](https://api.cloudflare.com/#page-rules-for-a-zone-create-page-rule).
	Priority *int `pulumi:"priority"`
	// Whether the page rule is active or disabled.
	Status *string `pulumi:"status"`
	// The URL pattern to target with the page rule.
	Target *string `pulumi:"target"`
	// The DNS zone ID to which the page rule should be added.
	ZoneId *string `pulumi:"zoneId"`
}

type PageRuleState struct {
	// The actions taken by the page rule, options given below.
	Actions PageRuleActionsPtrInput
	// The priority of the page rule among others for this target, the higher the number the higher the priority as per [API documentation](https://api.cloudflare.com/#page-rules-for-a-zone-create-page-rule).
	Priority pulumi.IntPtrInput
	// Whether the page rule is active or disabled.
	Status pulumi.StringPtrInput
	// The URL pattern to target with the page rule.
	Target pulumi.StringPtrInput
	// The DNS zone ID to which the page rule should be added.
	ZoneId pulumi.StringPtrInput
}

func (PageRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*pageRuleState)(nil)).Elem()
}

type pageRuleArgs struct {
	// The actions taken by the page rule, options given below.
	Actions PageRuleActions `pulumi:"actions"`
	// The priority of the page rule among others for this target, the higher the number the higher the priority as per [API documentation](https://api.cloudflare.com/#page-rules-for-a-zone-create-page-rule).
	Priority *int `pulumi:"priority"`
	// Whether the page rule is active or disabled.
	Status *string `pulumi:"status"`
	// The URL pattern to target with the page rule.
	Target string `pulumi:"target"`
	// The DNS zone ID to which the page rule should be added.
	ZoneId string `pulumi:"zoneId"`
}

// The set of arguments for constructing a PageRule resource.
type PageRuleArgs struct {
	// The actions taken by the page rule, options given below.
	Actions PageRuleActionsInput
	// The priority of the page rule among others for this target, the higher the number the higher the priority as per [API documentation](https://api.cloudflare.com/#page-rules-for-a-zone-create-page-rule).
	Priority pulumi.IntPtrInput
	// Whether the page rule is active or disabled.
	Status pulumi.StringPtrInput
	// The URL pattern to target with the page rule.
	Target pulumi.StringInput
	// The DNS zone ID to which the page rule should be added.
	ZoneId pulumi.StringInput
}

func (PageRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*pageRuleArgs)(nil)).Elem()
}

type PageRuleInput interface {
	pulumi.Input

	ToPageRuleOutput() PageRuleOutput
	ToPageRuleOutputWithContext(ctx context.Context) PageRuleOutput
}

func (*PageRule) ElementType() reflect.Type {
	return reflect.TypeOf((**PageRule)(nil)).Elem()
}

func (i *PageRule) ToPageRuleOutput() PageRuleOutput {
	return i.ToPageRuleOutputWithContext(context.Background())
}

func (i *PageRule) ToPageRuleOutputWithContext(ctx context.Context) PageRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PageRuleOutput)
}

// PageRuleArrayInput is an input type that accepts PageRuleArray and PageRuleArrayOutput values.
// You can construct a concrete instance of `PageRuleArrayInput` via:
//
//	PageRuleArray{ PageRuleArgs{...} }
type PageRuleArrayInput interface {
	pulumi.Input

	ToPageRuleArrayOutput() PageRuleArrayOutput
	ToPageRuleArrayOutputWithContext(context.Context) PageRuleArrayOutput
}

type PageRuleArray []PageRuleInput

func (PageRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PageRule)(nil)).Elem()
}

func (i PageRuleArray) ToPageRuleArrayOutput() PageRuleArrayOutput {
	return i.ToPageRuleArrayOutputWithContext(context.Background())
}

func (i PageRuleArray) ToPageRuleArrayOutputWithContext(ctx context.Context) PageRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PageRuleArrayOutput)
}

// PageRuleMapInput is an input type that accepts PageRuleMap and PageRuleMapOutput values.
// You can construct a concrete instance of `PageRuleMapInput` via:
//
//	PageRuleMap{ "key": PageRuleArgs{...} }
type PageRuleMapInput interface {
	pulumi.Input

	ToPageRuleMapOutput() PageRuleMapOutput
	ToPageRuleMapOutputWithContext(context.Context) PageRuleMapOutput
}

type PageRuleMap map[string]PageRuleInput

func (PageRuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PageRule)(nil)).Elem()
}

func (i PageRuleMap) ToPageRuleMapOutput() PageRuleMapOutput {
	return i.ToPageRuleMapOutputWithContext(context.Background())
}

func (i PageRuleMap) ToPageRuleMapOutputWithContext(ctx context.Context) PageRuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PageRuleMapOutput)
}

type PageRuleOutput struct{ *pulumi.OutputState }

func (PageRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**PageRule)(nil)).Elem()
}

func (o PageRuleOutput) ToPageRuleOutput() PageRuleOutput {
	return o
}

func (o PageRuleOutput) ToPageRuleOutputWithContext(ctx context.Context) PageRuleOutput {
	return o
}

// The actions taken by the page rule, options given below.
func (o PageRuleOutput) Actions() PageRuleActionsOutput {
	return o.ApplyT(func(v *PageRule) PageRuleActionsOutput { return v.Actions }).(PageRuleActionsOutput)
}

// The priority of the page rule among others for this target, the higher the number the higher the priority as per [API documentation](https://api.cloudflare.com/#page-rules-for-a-zone-create-page-rule).
func (o PageRuleOutput) Priority() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *PageRule) pulumi.IntPtrOutput { return v.Priority }).(pulumi.IntPtrOutput)
}

// Whether the page rule is active or disabled.
func (o PageRuleOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *PageRule) pulumi.StringPtrOutput { return v.Status }).(pulumi.StringPtrOutput)
}

// The URL pattern to target with the page rule.
func (o PageRuleOutput) Target() pulumi.StringOutput {
	return o.ApplyT(func(v *PageRule) pulumi.StringOutput { return v.Target }).(pulumi.StringOutput)
}

// The DNS zone ID to which the page rule should be added.
func (o PageRuleOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v *PageRule) pulumi.StringOutput { return v.ZoneId }).(pulumi.StringOutput)
}

type PageRuleArrayOutput struct{ *pulumi.OutputState }

func (PageRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PageRule)(nil)).Elem()
}

func (o PageRuleArrayOutput) ToPageRuleArrayOutput() PageRuleArrayOutput {
	return o
}

func (o PageRuleArrayOutput) ToPageRuleArrayOutputWithContext(ctx context.Context) PageRuleArrayOutput {
	return o
}

func (o PageRuleArrayOutput) Index(i pulumi.IntInput) PageRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *PageRule {
		return vs[0].([]*PageRule)[vs[1].(int)]
	}).(PageRuleOutput)
}

type PageRuleMapOutput struct{ *pulumi.OutputState }

func (PageRuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PageRule)(nil)).Elem()
}

func (o PageRuleMapOutput) ToPageRuleMapOutput() PageRuleMapOutput {
	return o
}

func (o PageRuleMapOutput) ToPageRuleMapOutputWithContext(ctx context.Context) PageRuleMapOutput {
	return o
}

func (o PageRuleMapOutput) MapIndex(k pulumi.StringInput) PageRuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *PageRule {
		return vs[0].(map[string]*PageRule)[vs[1].(string)]
	}).(PageRuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PageRuleInput)(nil)).Elem(), &PageRule{})
	pulumi.RegisterInputType(reflect.TypeOf((*PageRuleArrayInput)(nil)).Elem(), PageRuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PageRuleMapInput)(nil)).Elem(), PageRuleMap{})
	pulumi.RegisterOutputType(PageRuleOutput{})
	pulumi.RegisterOutputType(PageRuleArrayOutput{})
	pulumi.RegisterOutputType(PageRuleMapOutput{})
}
