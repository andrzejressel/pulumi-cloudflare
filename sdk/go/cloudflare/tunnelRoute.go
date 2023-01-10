// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a resource, that manages Cloudflare tunnel routes for Zero
// Trust. Tunnel routes are used to direct IP traffic through
// Cloudflare Tunnels.
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
//			_, err := cloudflare.NewTunnelRoute(ctx, "exampleTunnelRoute", &cloudflare.TunnelRouteArgs{
//				AccountId:        pulumi.String("f037e56e89293a057740de681ac9abbe"),
//				TunnelId:         pulumi.String("f70ff985-a4ef-4643-bbbc-4a0ed4fc8415"),
//				Network:          pulumi.String("192.0.2.24/32"),
//				Comment:          pulumi.String("New tunnel route for documentation"),
//				VirtualNetworkId: pulumi.String("bdc39a3c-3104-4c23-8ac0-9f455dda691a"),
//			})
//			if err != nil {
//				return err
//			}
//			tunnel, err := cloudflare.NewArgoTunnel(ctx, "tunnel", &cloudflare.ArgoTunnelArgs{
//				AccountId: pulumi.String("f037e56e89293a057740de681ac9abbe"),
//				Name:      pulumi.String("my_tunnel"),
//				Secret:    pulumi.String("AQIDBAUGBwgBAgMEBQYHCAECAwQFBgcIAQIDBAUGBwg="),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = cloudflare.NewTunnelRoute(ctx, "exampleIndex/tunnelRouteTunnelRoute", &cloudflare.TunnelRouteArgs{
//				AccountId:        pulumi.String("f037e56e89293a057740de681ac9abbe"),
//				TunnelId:         tunnel.ID(),
//				Network:          pulumi.String("192.0.2.24/32"),
//				Comment:          pulumi.String("New tunnel route for documentation"),
//				VirtualNetworkId: pulumi.String("bdc39a3c-3104-4c23-8ac0-9f455dda691a"),
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
//
//	$ pulumi import cloudflare:index/tunnelRoute:TunnelRoute example <account_id>/<network_cidr>/<virtual_network_id>
//
// ```
type TunnelRoute struct {
	pulumi.CustomResourceState

	// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// Description of the tunnel route.
	Comment pulumi.StringPtrOutput `pulumi:"comment"`
	// The IPv4 or IPv6 network that should use this tunnel route, in CIDR notation.
	Network pulumi.StringOutput `pulumi:"network"`
	// The ID of the tunnel that will service the tunnel route.
	TunnelId pulumi.StringOutput `pulumi:"tunnelId"`
	// The ID of the virtual network for which this route is being added; uses the default virtual network of the account if none is provided. **Modifying this attribute will force creation of a new resource.**
	VirtualNetworkId pulumi.StringPtrOutput `pulumi:"virtualNetworkId"`
}

// NewTunnelRoute registers a new resource with the given unique name, arguments, and options.
func NewTunnelRoute(ctx *pulumi.Context,
	name string, args *TunnelRouteArgs, opts ...pulumi.ResourceOption) (*TunnelRoute, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	if args.Network == nil {
		return nil, errors.New("invalid value for required argument 'Network'")
	}
	if args.TunnelId == nil {
		return nil, errors.New("invalid value for required argument 'TunnelId'")
	}
	var resource TunnelRoute
	err := ctx.RegisterResource("cloudflare:index/tunnelRoute:TunnelRoute", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTunnelRoute gets an existing TunnelRoute resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTunnelRoute(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TunnelRouteState, opts ...pulumi.ResourceOption) (*TunnelRoute, error) {
	var resource TunnelRoute
	err := ctx.ReadResource("cloudflare:index/tunnelRoute:TunnelRoute", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TunnelRoute resources.
type tunnelRouteState struct {
	// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	AccountId *string `pulumi:"accountId"`
	// Description of the tunnel route.
	Comment *string `pulumi:"comment"`
	// The IPv4 or IPv6 network that should use this tunnel route, in CIDR notation.
	Network *string `pulumi:"network"`
	// The ID of the tunnel that will service the tunnel route.
	TunnelId *string `pulumi:"tunnelId"`
	// The ID of the virtual network for which this route is being added; uses the default virtual network of the account if none is provided. **Modifying this attribute will force creation of a new resource.**
	VirtualNetworkId *string `pulumi:"virtualNetworkId"`
}

type TunnelRouteState struct {
	// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	AccountId pulumi.StringPtrInput
	// Description of the tunnel route.
	Comment pulumi.StringPtrInput
	// The IPv4 or IPv6 network that should use this tunnel route, in CIDR notation.
	Network pulumi.StringPtrInput
	// The ID of the tunnel that will service the tunnel route.
	TunnelId pulumi.StringPtrInput
	// The ID of the virtual network for which this route is being added; uses the default virtual network of the account if none is provided. **Modifying this attribute will force creation of a new resource.**
	VirtualNetworkId pulumi.StringPtrInput
}

func (TunnelRouteState) ElementType() reflect.Type {
	return reflect.TypeOf((*tunnelRouteState)(nil)).Elem()
}

type tunnelRouteArgs struct {
	// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	AccountId string `pulumi:"accountId"`
	// Description of the tunnel route.
	Comment *string `pulumi:"comment"`
	// The IPv4 or IPv6 network that should use this tunnel route, in CIDR notation.
	Network string `pulumi:"network"`
	// The ID of the tunnel that will service the tunnel route.
	TunnelId string `pulumi:"tunnelId"`
	// The ID of the virtual network for which this route is being added; uses the default virtual network of the account if none is provided. **Modifying this attribute will force creation of a new resource.**
	VirtualNetworkId *string `pulumi:"virtualNetworkId"`
}

// The set of arguments for constructing a TunnelRoute resource.
type TunnelRouteArgs struct {
	// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	AccountId pulumi.StringInput
	// Description of the tunnel route.
	Comment pulumi.StringPtrInput
	// The IPv4 or IPv6 network that should use this tunnel route, in CIDR notation.
	Network pulumi.StringInput
	// The ID of the tunnel that will service the tunnel route.
	TunnelId pulumi.StringInput
	// The ID of the virtual network for which this route is being added; uses the default virtual network of the account if none is provided. **Modifying this attribute will force creation of a new resource.**
	VirtualNetworkId pulumi.StringPtrInput
}

func (TunnelRouteArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*tunnelRouteArgs)(nil)).Elem()
}

type TunnelRouteInput interface {
	pulumi.Input

	ToTunnelRouteOutput() TunnelRouteOutput
	ToTunnelRouteOutputWithContext(ctx context.Context) TunnelRouteOutput
}

func (*TunnelRoute) ElementType() reflect.Type {
	return reflect.TypeOf((**TunnelRoute)(nil)).Elem()
}

func (i *TunnelRoute) ToTunnelRouteOutput() TunnelRouteOutput {
	return i.ToTunnelRouteOutputWithContext(context.Background())
}

func (i *TunnelRoute) ToTunnelRouteOutputWithContext(ctx context.Context) TunnelRouteOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TunnelRouteOutput)
}

// TunnelRouteArrayInput is an input type that accepts TunnelRouteArray and TunnelRouteArrayOutput values.
// You can construct a concrete instance of `TunnelRouteArrayInput` via:
//
//	TunnelRouteArray{ TunnelRouteArgs{...} }
type TunnelRouteArrayInput interface {
	pulumi.Input

	ToTunnelRouteArrayOutput() TunnelRouteArrayOutput
	ToTunnelRouteArrayOutputWithContext(context.Context) TunnelRouteArrayOutput
}

type TunnelRouteArray []TunnelRouteInput

func (TunnelRouteArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TunnelRoute)(nil)).Elem()
}

func (i TunnelRouteArray) ToTunnelRouteArrayOutput() TunnelRouteArrayOutput {
	return i.ToTunnelRouteArrayOutputWithContext(context.Background())
}

func (i TunnelRouteArray) ToTunnelRouteArrayOutputWithContext(ctx context.Context) TunnelRouteArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TunnelRouteArrayOutput)
}

// TunnelRouteMapInput is an input type that accepts TunnelRouteMap and TunnelRouteMapOutput values.
// You can construct a concrete instance of `TunnelRouteMapInput` via:
//
//	TunnelRouteMap{ "key": TunnelRouteArgs{...} }
type TunnelRouteMapInput interface {
	pulumi.Input

	ToTunnelRouteMapOutput() TunnelRouteMapOutput
	ToTunnelRouteMapOutputWithContext(context.Context) TunnelRouteMapOutput
}

type TunnelRouteMap map[string]TunnelRouteInput

func (TunnelRouteMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TunnelRoute)(nil)).Elem()
}

func (i TunnelRouteMap) ToTunnelRouteMapOutput() TunnelRouteMapOutput {
	return i.ToTunnelRouteMapOutputWithContext(context.Background())
}

func (i TunnelRouteMap) ToTunnelRouteMapOutputWithContext(ctx context.Context) TunnelRouteMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TunnelRouteMapOutput)
}

type TunnelRouteOutput struct{ *pulumi.OutputState }

func (TunnelRouteOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**TunnelRoute)(nil)).Elem()
}

func (o TunnelRouteOutput) ToTunnelRouteOutput() TunnelRouteOutput {
	return o
}

func (o TunnelRouteOutput) ToTunnelRouteOutputWithContext(ctx context.Context) TunnelRouteOutput {
	return o
}

// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
func (o TunnelRouteOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *TunnelRoute) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// Description of the tunnel route.
func (o TunnelRouteOutput) Comment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TunnelRoute) pulumi.StringPtrOutput { return v.Comment }).(pulumi.StringPtrOutput)
}

// The IPv4 or IPv6 network that should use this tunnel route, in CIDR notation.
func (o TunnelRouteOutput) Network() pulumi.StringOutput {
	return o.ApplyT(func(v *TunnelRoute) pulumi.StringOutput { return v.Network }).(pulumi.StringOutput)
}

// The ID of the tunnel that will service the tunnel route.
func (o TunnelRouteOutput) TunnelId() pulumi.StringOutput {
	return o.ApplyT(func(v *TunnelRoute) pulumi.StringOutput { return v.TunnelId }).(pulumi.StringOutput)
}

// The ID of the virtual network for which this route is being added; uses the default virtual network of the account if none is provided. **Modifying this attribute will force creation of a new resource.**
func (o TunnelRouteOutput) VirtualNetworkId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TunnelRoute) pulumi.StringPtrOutput { return v.VirtualNetworkId }).(pulumi.StringPtrOutput)
}

type TunnelRouteArrayOutput struct{ *pulumi.OutputState }

func (TunnelRouteArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TunnelRoute)(nil)).Elem()
}

func (o TunnelRouteArrayOutput) ToTunnelRouteArrayOutput() TunnelRouteArrayOutput {
	return o
}

func (o TunnelRouteArrayOutput) ToTunnelRouteArrayOutputWithContext(ctx context.Context) TunnelRouteArrayOutput {
	return o
}

func (o TunnelRouteArrayOutput) Index(i pulumi.IntInput) TunnelRouteOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *TunnelRoute {
		return vs[0].([]*TunnelRoute)[vs[1].(int)]
	}).(TunnelRouteOutput)
}

type TunnelRouteMapOutput struct{ *pulumi.OutputState }

func (TunnelRouteMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TunnelRoute)(nil)).Elem()
}

func (o TunnelRouteMapOutput) ToTunnelRouteMapOutput() TunnelRouteMapOutput {
	return o
}

func (o TunnelRouteMapOutput) ToTunnelRouteMapOutputWithContext(ctx context.Context) TunnelRouteMapOutput {
	return o
}

func (o TunnelRouteMapOutput) MapIndex(k pulumi.StringInput) TunnelRouteOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *TunnelRoute {
		return vs[0].(map[string]*TunnelRoute)[vs[1].(string)]
	}).(TunnelRouteOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TunnelRouteInput)(nil)).Elem(), &TunnelRoute{})
	pulumi.RegisterInputType(reflect.TypeOf((*TunnelRouteArrayInput)(nil)).Elem(), TunnelRouteArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TunnelRouteMapInput)(nil)).Elem(), TunnelRouteMap{})
	pulumi.RegisterOutputType(TunnelRouteOutput{})
	pulumi.RegisterOutputType(TunnelRouteArrayOutput{})
	pulumi.RegisterOutputType(TunnelRouteMapOutput{})
}