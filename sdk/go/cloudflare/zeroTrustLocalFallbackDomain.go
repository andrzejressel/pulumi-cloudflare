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

// Provides a Cloudflare Fallback Domain resource. Fallback domains are
// used to ignore DNS requests to a given list of domains. These DNS
// requests will be passed back to other DNS servers configured on
// existing network interfaces on the device.
type ZeroTrustLocalFallbackDomain struct {
	pulumi.CustomResourceState

	// The account identifier to target for the resource.
	AccountId pulumi.StringOutput                           `pulumi:"accountId"`
	Domains   ZeroTrustLocalFallbackDomainDomainArrayOutput `pulumi:"domains"`
	// The settings policy for which to configure this fallback domain policy.
	PolicyId pulumi.StringPtrOutput `pulumi:"policyId"`
}

// NewZeroTrustLocalFallbackDomain registers a new resource with the given unique name, arguments, and options.
func NewZeroTrustLocalFallbackDomain(ctx *pulumi.Context,
	name string, args *ZeroTrustLocalFallbackDomainArgs, opts ...pulumi.ResourceOption) (*ZeroTrustLocalFallbackDomain, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	if args.Domains == nil {
		return nil, errors.New("invalid value for required argument 'Domains'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ZeroTrustLocalFallbackDomain
	err := ctx.RegisterResource("cloudflare:index/zeroTrustLocalFallbackDomain:ZeroTrustLocalFallbackDomain", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetZeroTrustLocalFallbackDomain gets an existing ZeroTrustLocalFallbackDomain resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetZeroTrustLocalFallbackDomain(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ZeroTrustLocalFallbackDomainState, opts ...pulumi.ResourceOption) (*ZeroTrustLocalFallbackDomain, error) {
	var resource ZeroTrustLocalFallbackDomain
	err := ctx.ReadResource("cloudflare:index/zeroTrustLocalFallbackDomain:ZeroTrustLocalFallbackDomain", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ZeroTrustLocalFallbackDomain resources.
type zeroTrustLocalFallbackDomainState struct {
	// The account identifier to target for the resource.
	AccountId *string                              `pulumi:"accountId"`
	Domains   []ZeroTrustLocalFallbackDomainDomain `pulumi:"domains"`
	// The settings policy for which to configure this fallback domain policy.
	PolicyId *string `pulumi:"policyId"`
}

type ZeroTrustLocalFallbackDomainState struct {
	// The account identifier to target for the resource.
	AccountId pulumi.StringPtrInput
	Domains   ZeroTrustLocalFallbackDomainDomainArrayInput
	// The settings policy for which to configure this fallback domain policy.
	PolicyId pulumi.StringPtrInput
}

func (ZeroTrustLocalFallbackDomainState) ElementType() reflect.Type {
	return reflect.TypeOf((*zeroTrustLocalFallbackDomainState)(nil)).Elem()
}

type zeroTrustLocalFallbackDomainArgs struct {
	// The account identifier to target for the resource.
	AccountId string                               `pulumi:"accountId"`
	Domains   []ZeroTrustLocalFallbackDomainDomain `pulumi:"domains"`
	// The settings policy for which to configure this fallback domain policy.
	PolicyId *string `pulumi:"policyId"`
}

// The set of arguments for constructing a ZeroTrustLocalFallbackDomain resource.
type ZeroTrustLocalFallbackDomainArgs struct {
	// The account identifier to target for the resource.
	AccountId pulumi.StringInput
	Domains   ZeroTrustLocalFallbackDomainDomainArrayInput
	// The settings policy for which to configure this fallback domain policy.
	PolicyId pulumi.StringPtrInput
}

func (ZeroTrustLocalFallbackDomainArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*zeroTrustLocalFallbackDomainArgs)(nil)).Elem()
}

type ZeroTrustLocalFallbackDomainInput interface {
	pulumi.Input

	ToZeroTrustLocalFallbackDomainOutput() ZeroTrustLocalFallbackDomainOutput
	ToZeroTrustLocalFallbackDomainOutputWithContext(ctx context.Context) ZeroTrustLocalFallbackDomainOutput
}

func (*ZeroTrustLocalFallbackDomain) ElementType() reflect.Type {
	return reflect.TypeOf((**ZeroTrustLocalFallbackDomain)(nil)).Elem()
}

func (i *ZeroTrustLocalFallbackDomain) ToZeroTrustLocalFallbackDomainOutput() ZeroTrustLocalFallbackDomainOutput {
	return i.ToZeroTrustLocalFallbackDomainOutputWithContext(context.Background())
}

func (i *ZeroTrustLocalFallbackDomain) ToZeroTrustLocalFallbackDomainOutputWithContext(ctx context.Context) ZeroTrustLocalFallbackDomainOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ZeroTrustLocalFallbackDomainOutput)
}

// ZeroTrustLocalFallbackDomainArrayInput is an input type that accepts ZeroTrustLocalFallbackDomainArray and ZeroTrustLocalFallbackDomainArrayOutput values.
// You can construct a concrete instance of `ZeroTrustLocalFallbackDomainArrayInput` via:
//
//	ZeroTrustLocalFallbackDomainArray{ ZeroTrustLocalFallbackDomainArgs{...} }
type ZeroTrustLocalFallbackDomainArrayInput interface {
	pulumi.Input

	ToZeroTrustLocalFallbackDomainArrayOutput() ZeroTrustLocalFallbackDomainArrayOutput
	ToZeroTrustLocalFallbackDomainArrayOutputWithContext(context.Context) ZeroTrustLocalFallbackDomainArrayOutput
}

type ZeroTrustLocalFallbackDomainArray []ZeroTrustLocalFallbackDomainInput

func (ZeroTrustLocalFallbackDomainArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ZeroTrustLocalFallbackDomain)(nil)).Elem()
}

func (i ZeroTrustLocalFallbackDomainArray) ToZeroTrustLocalFallbackDomainArrayOutput() ZeroTrustLocalFallbackDomainArrayOutput {
	return i.ToZeroTrustLocalFallbackDomainArrayOutputWithContext(context.Background())
}

func (i ZeroTrustLocalFallbackDomainArray) ToZeroTrustLocalFallbackDomainArrayOutputWithContext(ctx context.Context) ZeroTrustLocalFallbackDomainArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ZeroTrustLocalFallbackDomainArrayOutput)
}

// ZeroTrustLocalFallbackDomainMapInput is an input type that accepts ZeroTrustLocalFallbackDomainMap and ZeroTrustLocalFallbackDomainMapOutput values.
// You can construct a concrete instance of `ZeroTrustLocalFallbackDomainMapInput` via:
//
//	ZeroTrustLocalFallbackDomainMap{ "key": ZeroTrustLocalFallbackDomainArgs{...} }
type ZeroTrustLocalFallbackDomainMapInput interface {
	pulumi.Input

	ToZeroTrustLocalFallbackDomainMapOutput() ZeroTrustLocalFallbackDomainMapOutput
	ToZeroTrustLocalFallbackDomainMapOutputWithContext(context.Context) ZeroTrustLocalFallbackDomainMapOutput
}

type ZeroTrustLocalFallbackDomainMap map[string]ZeroTrustLocalFallbackDomainInput

func (ZeroTrustLocalFallbackDomainMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ZeroTrustLocalFallbackDomain)(nil)).Elem()
}

func (i ZeroTrustLocalFallbackDomainMap) ToZeroTrustLocalFallbackDomainMapOutput() ZeroTrustLocalFallbackDomainMapOutput {
	return i.ToZeroTrustLocalFallbackDomainMapOutputWithContext(context.Background())
}

func (i ZeroTrustLocalFallbackDomainMap) ToZeroTrustLocalFallbackDomainMapOutputWithContext(ctx context.Context) ZeroTrustLocalFallbackDomainMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ZeroTrustLocalFallbackDomainMapOutput)
}

type ZeroTrustLocalFallbackDomainOutput struct{ *pulumi.OutputState }

func (ZeroTrustLocalFallbackDomainOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ZeroTrustLocalFallbackDomain)(nil)).Elem()
}

func (o ZeroTrustLocalFallbackDomainOutput) ToZeroTrustLocalFallbackDomainOutput() ZeroTrustLocalFallbackDomainOutput {
	return o
}

func (o ZeroTrustLocalFallbackDomainOutput) ToZeroTrustLocalFallbackDomainOutputWithContext(ctx context.Context) ZeroTrustLocalFallbackDomainOutput {
	return o
}

// The account identifier to target for the resource.
func (o ZeroTrustLocalFallbackDomainOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *ZeroTrustLocalFallbackDomain) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

func (o ZeroTrustLocalFallbackDomainOutput) Domains() ZeroTrustLocalFallbackDomainDomainArrayOutput {
	return o.ApplyT(func(v *ZeroTrustLocalFallbackDomain) ZeroTrustLocalFallbackDomainDomainArrayOutput { return v.Domains }).(ZeroTrustLocalFallbackDomainDomainArrayOutput)
}

// The settings policy for which to configure this fallback domain policy.
func (o ZeroTrustLocalFallbackDomainOutput) PolicyId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ZeroTrustLocalFallbackDomain) pulumi.StringPtrOutput { return v.PolicyId }).(pulumi.StringPtrOutput)
}

type ZeroTrustLocalFallbackDomainArrayOutput struct{ *pulumi.OutputState }

func (ZeroTrustLocalFallbackDomainArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ZeroTrustLocalFallbackDomain)(nil)).Elem()
}

func (o ZeroTrustLocalFallbackDomainArrayOutput) ToZeroTrustLocalFallbackDomainArrayOutput() ZeroTrustLocalFallbackDomainArrayOutput {
	return o
}

func (o ZeroTrustLocalFallbackDomainArrayOutput) ToZeroTrustLocalFallbackDomainArrayOutputWithContext(ctx context.Context) ZeroTrustLocalFallbackDomainArrayOutput {
	return o
}

func (o ZeroTrustLocalFallbackDomainArrayOutput) Index(i pulumi.IntInput) ZeroTrustLocalFallbackDomainOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ZeroTrustLocalFallbackDomain {
		return vs[0].([]*ZeroTrustLocalFallbackDomain)[vs[1].(int)]
	}).(ZeroTrustLocalFallbackDomainOutput)
}

type ZeroTrustLocalFallbackDomainMapOutput struct{ *pulumi.OutputState }

func (ZeroTrustLocalFallbackDomainMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ZeroTrustLocalFallbackDomain)(nil)).Elem()
}

func (o ZeroTrustLocalFallbackDomainMapOutput) ToZeroTrustLocalFallbackDomainMapOutput() ZeroTrustLocalFallbackDomainMapOutput {
	return o
}

func (o ZeroTrustLocalFallbackDomainMapOutput) ToZeroTrustLocalFallbackDomainMapOutputWithContext(ctx context.Context) ZeroTrustLocalFallbackDomainMapOutput {
	return o
}

func (o ZeroTrustLocalFallbackDomainMapOutput) MapIndex(k pulumi.StringInput) ZeroTrustLocalFallbackDomainOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ZeroTrustLocalFallbackDomain {
		return vs[0].(map[string]*ZeroTrustLocalFallbackDomain)[vs[1].(string)]
	}).(ZeroTrustLocalFallbackDomainOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ZeroTrustLocalFallbackDomainInput)(nil)).Elem(), &ZeroTrustLocalFallbackDomain{})
	pulumi.RegisterInputType(reflect.TypeOf((*ZeroTrustLocalFallbackDomainArrayInput)(nil)).Elem(), ZeroTrustLocalFallbackDomainArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ZeroTrustLocalFallbackDomainMapInput)(nil)).Elem(), ZeroTrustLocalFallbackDomainMap{})
	pulumi.RegisterOutputType(ZeroTrustLocalFallbackDomainOutput{})
	pulumi.RegisterOutputType(ZeroTrustLocalFallbackDomainArrayOutput{})
	pulumi.RegisterOutputType(ZeroTrustLocalFallbackDomainMapOutput{})
}
