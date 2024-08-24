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

// Provides a Cloudflare Teams Proxy Endpoint resource. Teams Proxy
// Endpoints are used for pointing proxy clients at Cloudflare Secure
// Gateway.
//
// ## Example Usage
//
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
//			_, err := cloudflare.NewZeroTrustGatewayProxyEndpoint(ctx, "example", &cloudflare.ZeroTrustGatewayProxyEndpointArgs{
//				AccountId: pulumi.String("f037e56e89293a057740de681ac9abbe"),
//				Name:      pulumi.String("office"),
//				Ips: pulumi.StringArray{
//					pulumi.String("192.0.2.0/24"),
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
// ```sh
// $ pulumi import cloudflare:index/zeroTrustGatewayProxyEndpoint:ZeroTrustGatewayProxyEndpoint example <account_id>/<proxy_endpoint_id>
// ```
type ZeroTrustGatewayProxyEndpoint struct {
	pulumi.CustomResourceState

	// The account identifier to target for the resource.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// The networks CIDRs that will be allowed to initiate proxy connections.
	Ips pulumi.StringArrayOutput `pulumi:"ips"`
	// Name of the teams proxy endpoint.
	Name pulumi.StringOutput `pulumi:"name"`
	// The FQDN that proxy clients should be pointed at.
	Subdomain pulumi.StringOutput `pulumi:"subdomain"`
}

// NewZeroTrustGatewayProxyEndpoint registers a new resource with the given unique name, arguments, and options.
func NewZeroTrustGatewayProxyEndpoint(ctx *pulumi.Context,
	name string, args *ZeroTrustGatewayProxyEndpointArgs, opts ...pulumi.ResourceOption) (*ZeroTrustGatewayProxyEndpoint, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	if args.Ips == nil {
		return nil, errors.New("invalid value for required argument 'Ips'")
	}
	if args.Name == nil {
		return nil, errors.New("invalid value for required argument 'Name'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ZeroTrustGatewayProxyEndpoint
	err := ctx.RegisterResource("cloudflare:index/zeroTrustGatewayProxyEndpoint:ZeroTrustGatewayProxyEndpoint", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetZeroTrustGatewayProxyEndpoint gets an existing ZeroTrustGatewayProxyEndpoint resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetZeroTrustGatewayProxyEndpoint(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ZeroTrustGatewayProxyEndpointState, opts ...pulumi.ResourceOption) (*ZeroTrustGatewayProxyEndpoint, error) {
	var resource ZeroTrustGatewayProxyEndpoint
	err := ctx.ReadResource("cloudflare:index/zeroTrustGatewayProxyEndpoint:ZeroTrustGatewayProxyEndpoint", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ZeroTrustGatewayProxyEndpoint resources.
type zeroTrustGatewayProxyEndpointState struct {
	// The account identifier to target for the resource.
	AccountId *string `pulumi:"accountId"`
	// The networks CIDRs that will be allowed to initiate proxy connections.
	Ips []string `pulumi:"ips"`
	// Name of the teams proxy endpoint.
	Name *string `pulumi:"name"`
	// The FQDN that proxy clients should be pointed at.
	Subdomain *string `pulumi:"subdomain"`
}

type ZeroTrustGatewayProxyEndpointState struct {
	// The account identifier to target for the resource.
	AccountId pulumi.StringPtrInput
	// The networks CIDRs that will be allowed to initiate proxy connections.
	Ips pulumi.StringArrayInput
	// Name of the teams proxy endpoint.
	Name pulumi.StringPtrInput
	// The FQDN that proxy clients should be pointed at.
	Subdomain pulumi.StringPtrInput
}

func (ZeroTrustGatewayProxyEndpointState) ElementType() reflect.Type {
	return reflect.TypeOf((*zeroTrustGatewayProxyEndpointState)(nil)).Elem()
}

type zeroTrustGatewayProxyEndpointArgs struct {
	// The account identifier to target for the resource.
	AccountId string `pulumi:"accountId"`
	// The networks CIDRs that will be allowed to initiate proxy connections.
	Ips []string `pulumi:"ips"`
	// Name of the teams proxy endpoint.
	Name string `pulumi:"name"`
}

// The set of arguments for constructing a ZeroTrustGatewayProxyEndpoint resource.
type ZeroTrustGatewayProxyEndpointArgs struct {
	// The account identifier to target for the resource.
	AccountId pulumi.StringInput
	// The networks CIDRs that will be allowed to initiate proxy connections.
	Ips pulumi.StringArrayInput
	// Name of the teams proxy endpoint.
	Name pulumi.StringInput
}

func (ZeroTrustGatewayProxyEndpointArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*zeroTrustGatewayProxyEndpointArgs)(nil)).Elem()
}

type ZeroTrustGatewayProxyEndpointInput interface {
	pulumi.Input

	ToZeroTrustGatewayProxyEndpointOutput() ZeroTrustGatewayProxyEndpointOutput
	ToZeroTrustGatewayProxyEndpointOutputWithContext(ctx context.Context) ZeroTrustGatewayProxyEndpointOutput
}

func (*ZeroTrustGatewayProxyEndpoint) ElementType() reflect.Type {
	return reflect.TypeOf((**ZeroTrustGatewayProxyEndpoint)(nil)).Elem()
}

func (i *ZeroTrustGatewayProxyEndpoint) ToZeroTrustGatewayProxyEndpointOutput() ZeroTrustGatewayProxyEndpointOutput {
	return i.ToZeroTrustGatewayProxyEndpointOutputWithContext(context.Background())
}

func (i *ZeroTrustGatewayProxyEndpoint) ToZeroTrustGatewayProxyEndpointOutputWithContext(ctx context.Context) ZeroTrustGatewayProxyEndpointOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ZeroTrustGatewayProxyEndpointOutput)
}

// ZeroTrustGatewayProxyEndpointArrayInput is an input type that accepts ZeroTrustGatewayProxyEndpointArray and ZeroTrustGatewayProxyEndpointArrayOutput values.
// You can construct a concrete instance of `ZeroTrustGatewayProxyEndpointArrayInput` via:
//
//	ZeroTrustGatewayProxyEndpointArray{ ZeroTrustGatewayProxyEndpointArgs{...} }
type ZeroTrustGatewayProxyEndpointArrayInput interface {
	pulumi.Input

	ToZeroTrustGatewayProxyEndpointArrayOutput() ZeroTrustGatewayProxyEndpointArrayOutput
	ToZeroTrustGatewayProxyEndpointArrayOutputWithContext(context.Context) ZeroTrustGatewayProxyEndpointArrayOutput
}

type ZeroTrustGatewayProxyEndpointArray []ZeroTrustGatewayProxyEndpointInput

func (ZeroTrustGatewayProxyEndpointArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ZeroTrustGatewayProxyEndpoint)(nil)).Elem()
}

func (i ZeroTrustGatewayProxyEndpointArray) ToZeroTrustGatewayProxyEndpointArrayOutput() ZeroTrustGatewayProxyEndpointArrayOutput {
	return i.ToZeroTrustGatewayProxyEndpointArrayOutputWithContext(context.Background())
}

func (i ZeroTrustGatewayProxyEndpointArray) ToZeroTrustGatewayProxyEndpointArrayOutputWithContext(ctx context.Context) ZeroTrustGatewayProxyEndpointArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ZeroTrustGatewayProxyEndpointArrayOutput)
}

// ZeroTrustGatewayProxyEndpointMapInput is an input type that accepts ZeroTrustGatewayProxyEndpointMap and ZeroTrustGatewayProxyEndpointMapOutput values.
// You can construct a concrete instance of `ZeroTrustGatewayProxyEndpointMapInput` via:
//
//	ZeroTrustGatewayProxyEndpointMap{ "key": ZeroTrustGatewayProxyEndpointArgs{...} }
type ZeroTrustGatewayProxyEndpointMapInput interface {
	pulumi.Input

	ToZeroTrustGatewayProxyEndpointMapOutput() ZeroTrustGatewayProxyEndpointMapOutput
	ToZeroTrustGatewayProxyEndpointMapOutputWithContext(context.Context) ZeroTrustGatewayProxyEndpointMapOutput
}

type ZeroTrustGatewayProxyEndpointMap map[string]ZeroTrustGatewayProxyEndpointInput

func (ZeroTrustGatewayProxyEndpointMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ZeroTrustGatewayProxyEndpoint)(nil)).Elem()
}

func (i ZeroTrustGatewayProxyEndpointMap) ToZeroTrustGatewayProxyEndpointMapOutput() ZeroTrustGatewayProxyEndpointMapOutput {
	return i.ToZeroTrustGatewayProxyEndpointMapOutputWithContext(context.Background())
}

func (i ZeroTrustGatewayProxyEndpointMap) ToZeroTrustGatewayProxyEndpointMapOutputWithContext(ctx context.Context) ZeroTrustGatewayProxyEndpointMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ZeroTrustGatewayProxyEndpointMapOutput)
}

type ZeroTrustGatewayProxyEndpointOutput struct{ *pulumi.OutputState }

func (ZeroTrustGatewayProxyEndpointOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ZeroTrustGatewayProxyEndpoint)(nil)).Elem()
}

func (o ZeroTrustGatewayProxyEndpointOutput) ToZeroTrustGatewayProxyEndpointOutput() ZeroTrustGatewayProxyEndpointOutput {
	return o
}

func (o ZeroTrustGatewayProxyEndpointOutput) ToZeroTrustGatewayProxyEndpointOutputWithContext(ctx context.Context) ZeroTrustGatewayProxyEndpointOutput {
	return o
}

// The account identifier to target for the resource.
func (o ZeroTrustGatewayProxyEndpointOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *ZeroTrustGatewayProxyEndpoint) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// The networks CIDRs that will be allowed to initiate proxy connections.
func (o ZeroTrustGatewayProxyEndpointOutput) Ips() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ZeroTrustGatewayProxyEndpoint) pulumi.StringArrayOutput { return v.Ips }).(pulumi.StringArrayOutput)
}

// Name of the teams proxy endpoint.
func (o ZeroTrustGatewayProxyEndpointOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ZeroTrustGatewayProxyEndpoint) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The FQDN that proxy clients should be pointed at.
func (o ZeroTrustGatewayProxyEndpointOutput) Subdomain() pulumi.StringOutput {
	return o.ApplyT(func(v *ZeroTrustGatewayProxyEndpoint) pulumi.StringOutput { return v.Subdomain }).(pulumi.StringOutput)
}

type ZeroTrustGatewayProxyEndpointArrayOutput struct{ *pulumi.OutputState }

func (ZeroTrustGatewayProxyEndpointArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ZeroTrustGatewayProxyEndpoint)(nil)).Elem()
}

func (o ZeroTrustGatewayProxyEndpointArrayOutput) ToZeroTrustGatewayProxyEndpointArrayOutput() ZeroTrustGatewayProxyEndpointArrayOutput {
	return o
}

func (o ZeroTrustGatewayProxyEndpointArrayOutput) ToZeroTrustGatewayProxyEndpointArrayOutputWithContext(ctx context.Context) ZeroTrustGatewayProxyEndpointArrayOutput {
	return o
}

func (o ZeroTrustGatewayProxyEndpointArrayOutput) Index(i pulumi.IntInput) ZeroTrustGatewayProxyEndpointOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ZeroTrustGatewayProxyEndpoint {
		return vs[0].([]*ZeroTrustGatewayProxyEndpoint)[vs[1].(int)]
	}).(ZeroTrustGatewayProxyEndpointOutput)
}

type ZeroTrustGatewayProxyEndpointMapOutput struct{ *pulumi.OutputState }

func (ZeroTrustGatewayProxyEndpointMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ZeroTrustGatewayProxyEndpoint)(nil)).Elem()
}

func (o ZeroTrustGatewayProxyEndpointMapOutput) ToZeroTrustGatewayProxyEndpointMapOutput() ZeroTrustGatewayProxyEndpointMapOutput {
	return o
}

func (o ZeroTrustGatewayProxyEndpointMapOutput) ToZeroTrustGatewayProxyEndpointMapOutputWithContext(ctx context.Context) ZeroTrustGatewayProxyEndpointMapOutput {
	return o
}

func (o ZeroTrustGatewayProxyEndpointMapOutput) MapIndex(k pulumi.StringInput) ZeroTrustGatewayProxyEndpointOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ZeroTrustGatewayProxyEndpoint {
		return vs[0].(map[string]*ZeroTrustGatewayProxyEndpoint)[vs[1].(string)]
	}).(ZeroTrustGatewayProxyEndpointOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ZeroTrustGatewayProxyEndpointInput)(nil)).Elem(), &ZeroTrustGatewayProxyEndpoint{})
	pulumi.RegisterInputType(reflect.TypeOf((*ZeroTrustGatewayProxyEndpointArrayInput)(nil)).Elem(), ZeroTrustGatewayProxyEndpointArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ZeroTrustGatewayProxyEndpointMapInput)(nil)).Elem(), ZeroTrustGatewayProxyEndpointMap{})
	pulumi.RegisterOutputType(ZeroTrustGatewayProxyEndpointOutput{})
	pulumi.RegisterOutputType(ZeroTrustGatewayProxyEndpointArrayOutput{})
	pulumi.RegisterOutputType(ZeroTrustGatewayProxyEndpointMapOutput{})
}