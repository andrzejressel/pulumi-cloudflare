// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Import
//
// Import is not supported for this resource.
type Ruleset struct {
	pulumi.CustomResourceState

	// The account identifier to target for the resource. Conflicts with `zoneId`.
	AccountId pulumi.StringPtrOutput `pulumi:"accountId"`
	// Brief summary of the ruleset and its intended use.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Type of Ruleset to create. Available values: `custom`, `managed`, `root`, `schema`, `zone`.
	Kind pulumi.StringOutput `pulumi:"kind"`
	// Name of the ruleset.
	Name pulumi.StringOutput `pulumi:"name"`
	// Point in the request/response lifecycle where the ruleset will be created. Available values: `ddosL4`, `ddosL7`, `httpCustomErrors`, `httpLogCustomFields`, `httpRequestCacheSettings`, `httpRequestFirewallCustom`, `httpRequestFirewallManaged`, `httpRequestLateTransform`, `httpRequestLateTransformManaged`, `httpRequestMain`, `httpRequestOrigin`, `httpRequestDynamicRedirect`, `httpRequestRedirect`, `httpRequestSanitize`, `httpRequestTransform`, `httpResponseFirewallManaged`, `httpResponseHeadersTransform`, `httpResponseHeadersTransformManaged`, `magicTransit`, `httpRatelimit`, `httpRequestSbfm`.
	Phase pulumi.StringOutput `pulumi:"phase"`
	// List of rules to apply to the ruleset.
	Rules RulesetRuleArrayOutput `pulumi:"rules"`
	// Name of entitlement that is shareable between entities.
	ShareableEntitlementName pulumi.StringPtrOutput `pulumi:"shareableEntitlementName"`
	// The zone identifier to target for the resource. Conflicts with `accountId`.
	ZoneId pulumi.StringPtrOutput `pulumi:"zoneId"`
}

// NewRuleset registers a new resource with the given unique name, arguments, and options.
func NewRuleset(ctx *pulumi.Context,
	name string, args *RulesetArgs, opts ...pulumi.ResourceOption) (*Ruleset, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Kind == nil {
		return nil, errors.New("invalid value for required argument 'Kind'")
	}
	if args.Name == nil {
		return nil, errors.New("invalid value for required argument 'Name'")
	}
	if args.Phase == nil {
		return nil, errors.New("invalid value for required argument 'Phase'")
	}
	var resource Ruleset
	err := ctx.RegisterResource("cloudflare:index/ruleset:Ruleset", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRuleset gets an existing Ruleset resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRuleset(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RulesetState, opts ...pulumi.ResourceOption) (*Ruleset, error) {
	var resource Ruleset
	err := ctx.ReadResource("cloudflare:index/ruleset:Ruleset", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Ruleset resources.
type rulesetState struct {
	// The account identifier to target for the resource. Conflicts with `zoneId`.
	AccountId *string `pulumi:"accountId"`
	// Brief summary of the ruleset and its intended use.
	Description *string `pulumi:"description"`
	// Type of Ruleset to create. Available values: `custom`, `managed`, `root`, `schema`, `zone`.
	Kind *string `pulumi:"kind"`
	// Name of the ruleset.
	Name *string `pulumi:"name"`
	// Point in the request/response lifecycle where the ruleset will be created. Available values: `ddosL4`, `ddosL7`, `httpCustomErrors`, `httpLogCustomFields`, `httpRequestCacheSettings`, `httpRequestFirewallCustom`, `httpRequestFirewallManaged`, `httpRequestLateTransform`, `httpRequestLateTransformManaged`, `httpRequestMain`, `httpRequestOrigin`, `httpRequestDynamicRedirect`, `httpRequestRedirect`, `httpRequestSanitize`, `httpRequestTransform`, `httpResponseFirewallManaged`, `httpResponseHeadersTransform`, `httpResponseHeadersTransformManaged`, `magicTransit`, `httpRatelimit`, `httpRequestSbfm`.
	Phase *string `pulumi:"phase"`
	// List of rules to apply to the ruleset.
	Rules []RulesetRule `pulumi:"rules"`
	// Name of entitlement that is shareable between entities.
	ShareableEntitlementName *string `pulumi:"shareableEntitlementName"`
	// The zone identifier to target for the resource. Conflicts with `accountId`.
	ZoneId *string `pulumi:"zoneId"`
}

type RulesetState struct {
	// The account identifier to target for the resource. Conflicts with `zoneId`.
	AccountId pulumi.StringPtrInput
	// Brief summary of the ruleset and its intended use.
	Description pulumi.StringPtrInput
	// Type of Ruleset to create. Available values: `custom`, `managed`, `root`, `schema`, `zone`.
	Kind pulumi.StringPtrInput
	// Name of the ruleset.
	Name pulumi.StringPtrInput
	// Point in the request/response lifecycle where the ruleset will be created. Available values: `ddosL4`, `ddosL7`, `httpCustomErrors`, `httpLogCustomFields`, `httpRequestCacheSettings`, `httpRequestFirewallCustom`, `httpRequestFirewallManaged`, `httpRequestLateTransform`, `httpRequestLateTransformManaged`, `httpRequestMain`, `httpRequestOrigin`, `httpRequestDynamicRedirect`, `httpRequestRedirect`, `httpRequestSanitize`, `httpRequestTransform`, `httpResponseFirewallManaged`, `httpResponseHeadersTransform`, `httpResponseHeadersTransformManaged`, `magicTransit`, `httpRatelimit`, `httpRequestSbfm`.
	Phase pulumi.StringPtrInput
	// List of rules to apply to the ruleset.
	Rules RulesetRuleArrayInput
	// Name of entitlement that is shareable between entities.
	ShareableEntitlementName pulumi.StringPtrInput
	// The zone identifier to target for the resource. Conflicts with `accountId`.
	ZoneId pulumi.StringPtrInput
}

func (RulesetState) ElementType() reflect.Type {
	return reflect.TypeOf((*rulesetState)(nil)).Elem()
}

type rulesetArgs struct {
	// The account identifier to target for the resource. Conflicts with `zoneId`.
	AccountId *string `pulumi:"accountId"`
	// Brief summary of the ruleset and its intended use.
	Description *string `pulumi:"description"`
	// Type of Ruleset to create. Available values: `custom`, `managed`, `root`, `schema`, `zone`.
	Kind string `pulumi:"kind"`
	// Name of the ruleset.
	Name string `pulumi:"name"`
	// Point in the request/response lifecycle where the ruleset will be created. Available values: `ddosL4`, `ddosL7`, `httpCustomErrors`, `httpLogCustomFields`, `httpRequestCacheSettings`, `httpRequestFirewallCustom`, `httpRequestFirewallManaged`, `httpRequestLateTransform`, `httpRequestLateTransformManaged`, `httpRequestMain`, `httpRequestOrigin`, `httpRequestDynamicRedirect`, `httpRequestRedirect`, `httpRequestSanitize`, `httpRequestTransform`, `httpResponseFirewallManaged`, `httpResponseHeadersTransform`, `httpResponseHeadersTransformManaged`, `magicTransit`, `httpRatelimit`, `httpRequestSbfm`.
	Phase string `pulumi:"phase"`
	// List of rules to apply to the ruleset.
	Rules []RulesetRule `pulumi:"rules"`
	// Name of entitlement that is shareable between entities.
	ShareableEntitlementName *string `pulumi:"shareableEntitlementName"`
	// The zone identifier to target for the resource. Conflicts with `accountId`.
	ZoneId *string `pulumi:"zoneId"`
}

// The set of arguments for constructing a Ruleset resource.
type RulesetArgs struct {
	// The account identifier to target for the resource. Conflicts with `zoneId`.
	AccountId pulumi.StringPtrInput
	// Brief summary of the ruleset and its intended use.
	Description pulumi.StringPtrInput
	// Type of Ruleset to create. Available values: `custom`, `managed`, `root`, `schema`, `zone`.
	Kind pulumi.StringInput
	// Name of the ruleset.
	Name pulumi.StringInput
	// Point in the request/response lifecycle where the ruleset will be created. Available values: `ddosL4`, `ddosL7`, `httpCustomErrors`, `httpLogCustomFields`, `httpRequestCacheSettings`, `httpRequestFirewallCustom`, `httpRequestFirewallManaged`, `httpRequestLateTransform`, `httpRequestLateTransformManaged`, `httpRequestMain`, `httpRequestOrigin`, `httpRequestDynamicRedirect`, `httpRequestRedirect`, `httpRequestSanitize`, `httpRequestTransform`, `httpResponseFirewallManaged`, `httpResponseHeadersTransform`, `httpResponseHeadersTransformManaged`, `magicTransit`, `httpRatelimit`, `httpRequestSbfm`.
	Phase pulumi.StringInput
	// List of rules to apply to the ruleset.
	Rules RulesetRuleArrayInput
	// Name of entitlement that is shareable between entities.
	ShareableEntitlementName pulumi.StringPtrInput
	// The zone identifier to target for the resource. Conflicts with `accountId`.
	ZoneId pulumi.StringPtrInput
}

func (RulesetArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*rulesetArgs)(nil)).Elem()
}

type RulesetInput interface {
	pulumi.Input

	ToRulesetOutput() RulesetOutput
	ToRulesetOutputWithContext(ctx context.Context) RulesetOutput
}

func (*Ruleset) ElementType() reflect.Type {
	return reflect.TypeOf((**Ruleset)(nil)).Elem()
}

func (i *Ruleset) ToRulesetOutput() RulesetOutput {
	return i.ToRulesetOutputWithContext(context.Background())
}

func (i *Ruleset) ToRulesetOutputWithContext(ctx context.Context) RulesetOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RulesetOutput)
}

// RulesetArrayInput is an input type that accepts RulesetArray and RulesetArrayOutput values.
// You can construct a concrete instance of `RulesetArrayInput` via:
//
//	RulesetArray{ RulesetArgs{...} }
type RulesetArrayInput interface {
	pulumi.Input

	ToRulesetArrayOutput() RulesetArrayOutput
	ToRulesetArrayOutputWithContext(context.Context) RulesetArrayOutput
}

type RulesetArray []RulesetInput

func (RulesetArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Ruleset)(nil)).Elem()
}

func (i RulesetArray) ToRulesetArrayOutput() RulesetArrayOutput {
	return i.ToRulesetArrayOutputWithContext(context.Background())
}

func (i RulesetArray) ToRulesetArrayOutputWithContext(ctx context.Context) RulesetArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RulesetArrayOutput)
}

// RulesetMapInput is an input type that accepts RulesetMap and RulesetMapOutput values.
// You can construct a concrete instance of `RulesetMapInput` via:
//
//	RulesetMap{ "key": RulesetArgs{...} }
type RulesetMapInput interface {
	pulumi.Input

	ToRulesetMapOutput() RulesetMapOutput
	ToRulesetMapOutputWithContext(context.Context) RulesetMapOutput
}

type RulesetMap map[string]RulesetInput

func (RulesetMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Ruleset)(nil)).Elem()
}

func (i RulesetMap) ToRulesetMapOutput() RulesetMapOutput {
	return i.ToRulesetMapOutputWithContext(context.Background())
}

func (i RulesetMap) ToRulesetMapOutputWithContext(ctx context.Context) RulesetMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RulesetMapOutput)
}

type RulesetOutput struct{ *pulumi.OutputState }

func (RulesetOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Ruleset)(nil)).Elem()
}

func (o RulesetOutput) ToRulesetOutput() RulesetOutput {
	return o
}

func (o RulesetOutput) ToRulesetOutputWithContext(ctx context.Context) RulesetOutput {
	return o
}

// The account identifier to target for the resource. Conflicts with `zoneId`.
func (o RulesetOutput) AccountId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Ruleset) pulumi.StringPtrOutput { return v.AccountId }).(pulumi.StringPtrOutput)
}

// Brief summary of the ruleset and its intended use.
func (o RulesetOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Ruleset) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Type of Ruleset to create. Available values: `custom`, `managed`, `root`, `schema`, `zone`.
func (o RulesetOutput) Kind() pulumi.StringOutput {
	return o.ApplyT(func(v *Ruleset) pulumi.StringOutput { return v.Kind }).(pulumi.StringOutput)
}

// Name of the ruleset.
func (o RulesetOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Ruleset) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Point in the request/response lifecycle where the ruleset will be created. Available values: `ddosL4`, `ddosL7`, `httpCustomErrors`, `httpLogCustomFields`, `httpRequestCacheSettings`, `httpRequestFirewallCustom`, `httpRequestFirewallManaged`, `httpRequestLateTransform`, `httpRequestLateTransformManaged`, `httpRequestMain`, `httpRequestOrigin`, `httpRequestDynamicRedirect`, `httpRequestRedirect`, `httpRequestSanitize`, `httpRequestTransform`, `httpResponseFirewallManaged`, `httpResponseHeadersTransform`, `httpResponseHeadersTransformManaged`, `magicTransit`, `httpRatelimit`, `httpRequestSbfm`.
func (o RulesetOutput) Phase() pulumi.StringOutput {
	return o.ApplyT(func(v *Ruleset) pulumi.StringOutput { return v.Phase }).(pulumi.StringOutput)
}

// List of rules to apply to the ruleset.
func (o RulesetOutput) Rules() RulesetRuleArrayOutput {
	return o.ApplyT(func(v *Ruleset) RulesetRuleArrayOutput { return v.Rules }).(RulesetRuleArrayOutput)
}

// Name of entitlement that is shareable between entities.
func (o RulesetOutput) ShareableEntitlementName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Ruleset) pulumi.StringPtrOutput { return v.ShareableEntitlementName }).(pulumi.StringPtrOutput)
}

// The zone identifier to target for the resource. Conflicts with `accountId`.
func (o RulesetOutput) ZoneId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Ruleset) pulumi.StringPtrOutput { return v.ZoneId }).(pulumi.StringPtrOutput)
}

type RulesetArrayOutput struct{ *pulumi.OutputState }

func (RulesetArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Ruleset)(nil)).Elem()
}

func (o RulesetArrayOutput) ToRulesetArrayOutput() RulesetArrayOutput {
	return o
}

func (o RulesetArrayOutput) ToRulesetArrayOutputWithContext(ctx context.Context) RulesetArrayOutput {
	return o
}

func (o RulesetArrayOutput) Index(i pulumi.IntInput) RulesetOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Ruleset {
		return vs[0].([]*Ruleset)[vs[1].(int)]
	}).(RulesetOutput)
}

type RulesetMapOutput struct{ *pulumi.OutputState }

func (RulesetMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Ruleset)(nil)).Elem()
}

func (o RulesetMapOutput) ToRulesetMapOutput() RulesetMapOutput {
	return o
}

func (o RulesetMapOutput) ToRulesetMapOutputWithContext(ctx context.Context) RulesetMapOutput {
	return o
}

func (o RulesetMapOutput) MapIndex(k pulumi.StringInput) RulesetOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Ruleset {
		return vs[0].(map[string]*Ruleset)[vs[1].(string)]
	}).(RulesetOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RulesetInput)(nil)).Elem(), &Ruleset{})
	pulumi.RegisterInputType(reflect.TypeOf((*RulesetArrayInput)(nil)).Elem(), RulesetArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RulesetMapInput)(nil)).Elem(), RulesetMap{})
	pulumi.RegisterOutputType(RulesetOutput{})
	pulumi.RegisterOutputType(RulesetArrayOutput{})
	pulumi.RegisterOutputType(RulesetMapOutput{})
}
