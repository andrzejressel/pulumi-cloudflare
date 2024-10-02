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

// The Cloud Connector Rules resource allows you to create and manage cloud connector rules for a zone.
type CloudConnectorRules struct {
	pulumi.CustomResourceState

	// List of Cloud Connector Rules
	Rules CloudConnectorRulesRuleArrayOutput `pulumi:"rules"`
	// The zone identifier to target for the resource.
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewCloudConnectorRules registers a new resource with the given unique name, arguments, and options.
func NewCloudConnectorRules(ctx *pulumi.Context,
	name string, args *CloudConnectorRulesArgs, opts ...pulumi.ResourceOption) (*CloudConnectorRules, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ZoneId == nil {
		return nil, errors.New("invalid value for required argument 'ZoneId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource CloudConnectorRules
	err := ctx.RegisterResource("cloudflare:index/cloudConnectorRules:CloudConnectorRules", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCloudConnectorRules gets an existing CloudConnectorRules resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCloudConnectorRules(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CloudConnectorRulesState, opts ...pulumi.ResourceOption) (*CloudConnectorRules, error) {
	var resource CloudConnectorRules
	err := ctx.ReadResource("cloudflare:index/cloudConnectorRules:CloudConnectorRules", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CloudConnectorRules resources.
type cloudConnectorRulesState struct {
	// List of Cloud Connector Rules
	Rules []CloudConnectorRulesRule `pulumi:"rules"`
	// The zone identifier to target for the resource.
	ZoneId *string `pulumi:"zoneId"`
}

type CloudConnectorRulesState struct {
	// List of Cloud Connector Rules
	Rules CloudConnectorRulesRuleArrayInput
	// The zone identifier to target for the resource.
	ZoneId pulumi.StringPtrInput
}

func (CloudConnectorRulesState) ElementType() reflect.Type {
	return reflect.TypeOf((*cloudConnectorRulesState)(nil)).Elem()
}

type cloudConnectorRulesArgs struct {
	// List of Cloud Connector Rules
	Rules []CloudConnectorRulesRule `pulumi:"rules"`
	// The zone identifier to target for the resource.
	ZoneId string `pulumi:"zoneId"`
}

// The set of arguments for constructing a CloudConnectorRules resource.
type CloudConnectorRulesArgs struct {
	// List of Cloud Connector Rules
	Rules CloudConnectorRulesRuleArrayInput
	// The zone identifier to target for the resource.
	ZoneId pulumi.StringInput
}

func (CloudConnectorRulesArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*cloudConnectorRulesArgs)(nil)).Elem()
}

type CloudConnectorRulesInput interface {
	pulumi.Input

	ToCloudConnectorRulesOutput() CloudConnectorRulesOutput
	ToCloudConnectorRulesOutputWithContext(ctx context.Context) CloudConnectorRulesOutput
}

func (*CloudConnectorRules) ElementType() reflect.Type {
	return reflect.TypeOf((**CloudConnectorRules)(nil)).Elem()
}

func (i *CloudConnectorRules) ToCloudConnectorRulesOutput() CloudConnectorRulesOutput {
	return i.ToCloudConnectorRulesOutputWithContext(context.Background())
}

func (i *CloudConnectorRules) ToCloudConnectorRulesOutputWithContext(ctx context.Context) CloudConnectorRulesOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CloudConnectorRulesOutput)
}

// CloudConnectorRulesArrayInput is an input type that accepts CloudConnectorRulesArray and CloudConnectorRulesArrayOutput values.
// You can construct a concrete instance of `CloudConnectorRulesArrayInput` via:
//
//	CloudConnectorRulesArray{ CloudConnectorRulesArgs{...} }
type CloudConnectorRulesArrayInput interface {
	pulumi.Input

	ToCloudConnectorRulesArrayOutput() CloudConnectorRulesArrayOutput
	ToCloudConnectorRulesArrayOutputWithContext(context.Context) CloudConnectorRulesArrayOutput
}

type CloudConnectorRulesArray []CloudConnectorRulesInput

func (CloudConnectorRulesArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CloudConnectorRules)(nil)).Elem()
}

func (i CloudConnectorRulesArray) ToCloudConnectorRulesArrayOutput() CloudConnectorRulesArrayOutput {
	return i.ToCloudConnectorRulesArrayOutputWithContext(context.Background())
}

func (i CloudConnectorRulesArray) ToCloudConnectorRulesArrayOutputWithContext(ctx context.Context) CloudConnectorRulesArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CloudConnectorRulesArrayOutput)
}

// CloudConnectorRulesMapInput is an input type that accepts CloudConnectorRulesMap and CloudConnectorRulesMapOutput values.
// You can construct a concrete instance of `CloudConnectorRulesMapInput` via:
//
//	CloudConnectorRulesMap{ "key": CloudConnectorRulesArgs{...} }
type CloudConnectorRulesMapInput interface {
	pulumi.Input

	ToCloudConnectorRulesMapOutput() CloudConnectorRulesMapOutput
	ToCloudConnectorRulesMapOutputWithContext(context.Context) CloudConnectorRulesMapOutput
}

type CloudConnectorRulesMap map[string]CloudConnectorRulesInput

func (CloudConnectorRulesMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CloudConnectorRules)(nil)).Elem()
}

func (i CloudConnectorRulesMap) ToCloudConnectorRulesMapOutput() CloudConnectorRulesMapOutput {
	return i.ToCloudConnectorRulesMapOutputWithContext(context.Background())
}

func (i CloudConnectorRulesMap) ToCloudConnectorRulesMapOutputWithContext(ctx context.Context) CloudConnectorRulesMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CloudConnectorRulesMapOutput)
}

type CloudConnectorRulesOutput struct{ *pulumi.OutputState }

func (CloudConnectorRulesOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CloudConnectorRules)(nil)).Elem()
}

func (o CloudConnectorRulesOutput) ToCloudConnectorRulesOutput() CloudConnectorRulesOutput {
	return o
}

func (o CloudConnectorRulesOutput) ToCloudConnectorRulesOutputWithContext(ctx context.Context) CloudConnectorRulesOutput {
	return o
}

// List of Cloud Connector Rules
func (o CloudConnectorRulesOutput) Rules() CloudConnectorRulesRuleArrayOutput {
	return o.ApplyT(func(v *CloudConnectorRules) CloudConnectorRulesRuleArrayOutput { return v.Rules }).(CloudConnectorRulesRuleArrayOutput)
}

// The zone identifier to target for the resource.
func (o CloudConnectorRulesOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v *CloudConnectorRules) pulumi.StringOutput { return v.ZoneId }).(pulumi.StringOutput)
}

type CloudConnectorRulesArrayOutput struct{ *pulumi.OutputState }

func (CloudConnectorRulesArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CloudConnectorRules)(nil)).Elem()
}

func (o CloudConnectorRulesArrayOutput) ToCloudConnectorRulesArrayOutput() CloudConnectorRulesArrayOutput {
	return o
}

func (o CloudConnectorRulesArrayOutput) ToCloudConnectorRulesArrayOutputWithContext(ctx context.Context) CloudConnectorRulesArrayOutput {
	return o
}

func (o CloudConnectorRulesArrayOutput) Index(i pulumi.IntInput) CloudConnectorRulesOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CloudConnectorRules {
		return vs[0].([]*CloudConnectorRules)[vs[1].(int)]
	}).(CloudConnectorRulesOutput)
}

type CloudConnectorRulesMapOutput struct{ *pulumi.OutputState }

func (CloudConnectorRulesMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CloudConnectorRules)(nil)).Elem()
}

func (o CloudConnectorRulesMapOutput) ToCloudConnectorRulesMapOutput() CloudConnectorRulesMapOutput {
	return o
}

func (o CloudConnectorRulesMapOutput) ToCloudConnectorRulesMapOutputWithContext(ctx context.Context) CloudConnectorRulesMapOutput {
	return o
}

func (o CloudConnectorRulesMapOutput) MapIndex(k pulumi.StringInput) CloudConnectorRulesOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CloudConnectorRules {
		return vs[0].(map[string]*CloudConnectorRules)[vs[1].(string)]
	}).(CloudConnectorRulesOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CloudConnectorRulesInput)(nil)).Elem(), &CloudConnectorRules{})
	pulumi.RegisterInputType(reflect.TypeOf((*CloudConnectorRulesArrayInput)(nil)).Elem(), CloudConnectorRulesArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CloudConnectorRulesMapInput)(nil)).Elem(), CloudConnectorRulesMap{})
	pulumi.RegisterOutputType(CloudConnectorRulesOutput{})
	pulumi.RegisterOutputType(CloudConnectorRulesArrayOutput{})
	pulumi.RegisterOutputType(CloudConnectorRulesMapOutput{})
}