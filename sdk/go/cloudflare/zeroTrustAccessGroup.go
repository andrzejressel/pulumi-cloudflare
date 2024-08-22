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

// Provides a Cloudflare Access Group resource. Access Groups are used
// in conjunction with Access Policies to restrict access to a
// particular resource based on group membership.
//
// > It's required that an `accountId` or `zoneId` is provided and in
//
//	most cases using either is fine. However, if you're using a scoped
//	access token, you must provide the argument that matches the token's
//	scope. For example, an access token that is scoped to the "example.com"
//	zone needs to use the `zoneId` argument.
//
// ## Import
//
// ```sh
// $ pulumi import cloudflare:index/zeroTrustAccessGroup:ZeroTrustAccessGroup example <account_id>/<group_id>
// ```
type ZeroTrustAccessGroup struct {
	pulumi.CustomResourceState

	// The account identifier to target for the resource. Conflicts with `zoneId`. **Modifying this attribute will force creation of a new resource.**
	AccountId pulumi.StringPtrOutput                 `pulumi:"accountId"`
	Excludes  ZeroTrustAccessGroupExcludeArrayOutput `pulumi:"excludes"`
	Includes  ZeroTrustAccessGroupIncludeArrayOutput `pulumi:"includes"`
	Name      pulumi.StringOutput                    `pulumi:"name"`
	Requires  ZeroTrustAccessGroupRequireArrayOutput `pulumi:"requires"`
	// The zone identifier to target for the resource. Conflicts with `accountId`.
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewZeroTrustAccessGroup registers a new resource with the given unique name, arguments, and options.
func NewZeroTrustAccessGroup(ctx *pulumi.Context,
	name string, args *ZeroTrustAccessGroupArgs, opts ...pulumi.ResourceOption) (*ZeroTrustAccessGroup, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Includes == nil {
		return nil, errors.New("invalid value for required argument 'Includes'")
	}
	if args.Name == nil {
		return nil, errors.New("invalid value for required argument 'Name'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ZeroTrustAccessGroup
	err := ctx.RegisterResource("cloudflare:index/zeroTrustAccessGroup:ZeroTrustAccessGroup", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetZeroTrustAccessGroup gets an existing ZeroTrustAccessGroup resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetZeroTrustAccessGroup(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ZeroTrustAccessGroupState, opts ...pulumi.ResourceOption) (*ZeroTrustAccessGroup, error) {
	var resource ZeroTrustAccessGroup
	err := ctx.ReadResource("cloudflare:index/zeroTrustAccessGroup:ZeroTrustAccessGroup", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ZeroTrustAccessGroup resources.
type zeroTrustAccessGroupState struct {
	// The account identifier to target for the resource. Conflicts with `zoneId`. **Modifying this attribute will force creation of a new resource.**
	AccountId *string                       `pulumi:"accountId"`
	Excludes  []ZeroTrustAccessGroupExclude `pulumi:"excludes"`
	Includes  []ZeroTrustAccessGroupInclude `pulumi:"includes"`
	Name      *string                       `pulumi:"name"`
	Requires  []ZeroTrustAccessGroupRequire `pulumi:"requires"`
	// The zone identifier to target for the resource. Conflicts with `accountId`.
	ZoneId *string `pulumi:"zoneId"`
}

type ZeroTrustAccessGroupState struct {
	// The account identifier to target for the resource. Conflicts with `zoneId`. **Modifying this attribute will force creation of a new resource.**
	AccountId pulumi.StringPtrInput
	Excludes  ZeroTrustAccessGroupExcludeArrayInput
	Includes  ZeroTrustAccessGroupIncludeArrayInput
	Name      pulumi.StringPtrInput
	Requires  ZeroTrustAccessGroupRequireArrayInput
	// The zone identifier to target for the resource. Conflicts with `accountId`.
	ZoneId pulumi.StringPtrInput
}

func (ZeroTrustAccessGroupState) ElementType() reflect.Type {
	return reflect.TypeOf((*zeroTrustAccessGroupState)(nil)).Elem()
}

type zeroTrustAccessGroupArgs struct {
	// The account identifier to target for the resource. Conflicts with `zoneId`. **Modifying this attribute will force creation of a new resource.**
	AccountId *string                       `pulumi:"accountId"`
	Excludes  []ZeroTrustAccessGroupExclude `pulumi:"excludes"`
	Includes  []ZeroTrustAccessGroupInclude `pulumi:"includes"`
	Name      string                        `pulumi:"name"`
	Requires  []ZeroTrustAccessGroupRequire `pulumi:"requires"`
	// The zone identifier to target for the resource. Conflicts with `accountId`.
	ZoneId *string `pulumi:"zoneId"`
}

// The set of arguments for constructing a ZeroTrustAccessGroup resource.
type ZeroTrustAccessGroupArgs struct {
	// The account identifier to target for the resource. Conflicts with `zoneId`. **Modifying this attribute will force creation of a new resource.**
	AccountId pulumi.StringPtrInput
	Excludes  ZeroTrustAccessGroupExcludeArrayInput
	Includes  ZeroTrustAccessGroupIncludeArrayInput
	Name      pulumi.StringInput
	Requires  ZeroTrustAccessGroupRequireArrayInput
	// The zone identifier to target for the resource. Conflicts with `accountId`.
	ZoneId pulumi.StringPtrInput
}

func (ZeroTrustAccessGroupArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*zeroTrustAccessGroupArgs)(nil)).Elem()
}

type ZeroTrustAccessGroupInput interface {
	pulumi.Input

	ToZeroTrustAccessGroupOutput() ZeroTrustAccessGroupOutput
	ToZeroTrustAccessGroupOutputWithContext(ctx context.Context) ZeroTrustAccessGroupOutput
}

func (*ZeroTrustAccessGroup) ElementType() reflect.Type {
	return reflect.TypeOf((**ZeroTrustAccessGroup)(nil)).Elem()
}

func (i *ZeroTrustAccessGroup) ToZeroTrustAccessGroupOutput() ZeroTrustAccessGroupOutput {
	return i.ToZeroTrustAccessGroupOutputWithContext(context.Background())
}

func (i *ZeroTrustAccessGroup) ToZeroTrustAccessGroupOutputWithContext(ctx context.Context) ZeroTrustAccessGroupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ZeroTrustAccessGroupOutput)
}

// ZeroTrustAccessGroupArrayInput is an input type that accepts ZeroTrustAccessGroupArray and ZeroTrustAccessGroupArrayOutput values.
// You can construct a concrete instance of `ZeroTrustAccessGroupArrayInput` via:
//
//	ZeroTrustAccessGroupArray{ ZeroTrustAccessGroupArgs{...} }
type ZeroTrustAccessGroupArrayInput interface {
	pulumi.Input

	ToZeroTrustAccessGroupArrayOutput() ZeroTrustAccessGroupArrayOutput
	ToZeroTrustAccessGroupArrayOutputWithContext(context.Context) ZeroTrustAccessGroupArrayOutput
}

type ZeroTrustAccessGroupArray []ZeroTrustAccessGroupInput

func (ZeroTrustAccessGroupArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ZeroTrustAccessGroup)(nil)).Elem()
}

func (i ZeroTrustAccessGroupArray) ToZeroTrustAccessGroupArrayOutput() ZeroTrustAccessGroupArrayOutput {
	return i.ToZeroTrustAccessGroupArrayOutputWithContext(context.Background())
}

func (i ZeroTrustAccessGroupArray) ToZeroTrustAccessGroupArrayOutputWithContext(ctx context.Context) ZeroTrustAccessGroupArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ZeroTrustAccessGroupArrayOutput)
}

// ZeroTrustAccessGroupMapInput is an input type that accepts ZeroTrustAccessGroupMap and ZeroTrustAccessGroupMapOutput values.
// You can construct a concrete instance of `ZeroTrustAccessGroupMapInput` via:
//
//	ZeroTrustAccessGroupMap{ "key": ZeroTrustAccessGroupArgs{...} }
type ZeroTrustAccessGroupMapInput interface {
	pulumi.Input

	ToZeroTrustAccessGroupMapOutput() ZeroTrustAccessGroupMapOutput
	ToZeroTrustAccessGroupMapOutputWithContext(context.Context) ZeroTrustAccessGroupMapOutput
}

type ZeroTrustAccessGroupMap map[string]ZeroTrustAccessGroupInput

func (ZeroTrustAccessGroupMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ZeroTrustAccessGroup)(nil)).Elem()
}

func (i ZeroTrustAccessGroupMap) ToZeroTrustAccessGroupMapOutput() ZeroTrustAccessGroupMapOutput {
	return i.ToZeroTrustAccessGroupMapOutputWithContext(context.Background())
}

func (i ZeroTrustAccessGroupMap) ToZeroTrustAccessGroupMapOutputWithContext(ctx context.Context) ZeroTrustAccessGroupMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ZeroTrustAccessGroupMapOutput)
}

type ZeroTrustAccessGroupOutput struct{ *pulumi.OutputState }

func (ZeroTrustAccessGroupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ZeroTrustAccessGroup)(nil)).Elem()
}

func (o ZeroTrustAccessGroupOutput) ToZeroTrustAccessGroupOutput() ZeroTrustAccessGroupOutput {
	return o
}

func (o ZeroTrustAccessGroupOutput) ToZeroTrustAccessGroupOutputWithContext(ctx context.Context) ZeroTrustAccessGroupOutput {
	return o
}

// The account identifier to target for the resource. Conflicts with `zoneId`. **Modifying this attribute will force creation of a new resource.**
func (o ZeroTrustAccessGroupOutput) AccountId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ZeroTrustAccessGroup) pulumi.StringPtrOutput { return v.AccountId }).(pulumi.StringPtrOutput)
}

func (o ZeroTrustAccessGroupOutput) Excludes() ZeroTrustAccessGroupExcludeArrayOutput {
	return o.ApplyT(func(v *ZeroTrustAccessGroup) ZeroTrustAccessGroupExcludeArrayOutput { return v.Excludes }).(ZeroTrustAccessGroupExcludeArrayOutput)
}

func (o ZeroTrustAccessGroupOutput) Includes() ZeroTrustAccessGroupIncludeArrayOutput {
	return o.ApplyT(func(v *ZeroTrustAccessGroup) ZeroTrustAccessGroupIncludeArrayOutput { return v.Includes }).(ZeroTrustAccessGroupIncludeArrayOutput)
}

func (o ZeroTrustAccessGroupOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ZeroTrustAccessGroup) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

func (o ZeroTrustAccessGroupOutput) Requires() ZeroTrustAccessGroupRequireArrayOutput {
	return o.ApplyT(func(v *ZeroTrustAccessGroup) ZeroTrustAccessGroupRequireArrayOutput { return v.Requires }).(ZeroTrustAccessGroupRequireArrayOutput)
}

// The zone identifier to target for the resource. Conflicts with `accountId`.
func (o ZeroTrustAccessGroupOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v *ZeroTrustAccessGroup) pulumi.StringOutput { return v.ZoneId }).(pulumi.StringOutput)
}

type ZeroTrustAccessGroupArrayOutput struct{ *pulumi.OutputState }

func (ZeroTrustAccessGroupArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ZeroTrustAccessGroup)(nil)).Elem()
}

func (o ZeroTrustAccessGroupArrayOutput) ToZeroTrustAccessGroupArrayOutput() ZeroTrustAccessGroupArrayOutput {
	return o
}

func (o ZeroTrustAccessGroupArrayOutput) ToZeroTrustAccessGroupArrayOutputWithContext(ctx context.Context) ZeroTrustAccessGroupArrayOutput {
	return o
}

func (o ZeroTrustAccessGroupArrayOutput) Index(i pulumi.IntInput) ZeroTrustAccessGroupOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ZeroTrustAccessGroup {
		return vs[0].([]*ZeroTrustAccessGroup)[vs[1].(int)]
	}).(ZeroTrustAccessGroupOutput)
}

type ZeroTrustAccessGroupMapOutput struct{ *pulumi.OutputState }

func (ZeroTrustAccessGroupMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ZeroTrustAccessGroup)(nil)).Elem()
}

func (o ZeroTrustAccessGroupMapOutput) ToZeroTrustAccessGroupMapOutput() ZeroTrustAccessGroupMapOutput {
	return o
}

func (o ZeroTrustAccessGroupMapOutput) ToZeroTrustAccessGroupMapOutputWithContext(ctx context.Context) ZeroTrustAccessGroupMapOutput {
	return o
}

func (o ZeroTrustAccessGroupMapOutput) MapIndex(k pulumi.StringInput) ZeroTrustAccessGroupOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ZeroTrustAccessGroup {
		return vs[0].(map[string]*ZeroTrustAccessGroup)[vs[1].(string)]
	}).(ZeroTrustAccessGroupOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ZeroTrustAccessGroupInput)(nil)).Elem(), &ZeroTrustAccessGroup{})
	pulumi.RegisterInputType(reflect.TypeOf((*ZeroTrustAccessGroupArrayInput)(nil)).Elem(), ZeroTrustAccessGroupArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ZeroTrustAccessGroupMapInput)(nil)).Elem(), ZeroTrustAccessGroupMap{})
	pulumi.RegisterOutputType(ZeroTrustAccessGroupOutput{})
	pulumi.RegisterOutputType(ZeroTrustAccessGroupArrayOutput{})
	pulumi.RegisterOutputType(ZeroTrustAccessGroupMapOutput{})
}
