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

// Provides a resource, that manages GRE tunnels for Magic Transit.
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
//			_, err := cloudflare.NewMagicWanGreTunnel(ctx, "example", &cloudflare.MagicWanGreTunnelArgs{
//				AccountId:             pulumi.String("f037e56e89293a057740de681ac9abbe"),
//				Name:                  pulumi.String("GRE_1"),
//				CustomerGreEndpoint:   pulumi.String("203.0.113.1"),
//				CloudflareGreEndpoint: pulumi.String("203.0.113.2"),
//				InterfaceAddress:      pulumi.String("192.0.2.0/31"),
//				Description:           pulumi.String("Tunnel for ISP X"),
//				Ttl:                   pulumi.Int(64),
//				Mtu:                   pulumi.Int(1476),
//				HealthCheckEnabled:    pulumi.Bool(true),
//				HealthCheckTarget:     pulumi.String("203.0.113.1"),
//				HealthCheckType:       pulumi.String("reply"),
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
// $ pulumi import cloudflare:index/magicWanGreTunnel:MagicWanGreTunnel example <account_id>/<tunnel_id>
// ```
type MagicWanGreTunnel struct {
	pulumi.CustomResourceState

	// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	AccountId pulumi.StringPtrOutput `pulumi:"accountId"`
	// The IP address assigned to the Cloudflare side of the GRE tunnel.
	CloudflareGreEndpoint pulumi.StringOutput `pulumi:"cloudflareGreEndpoint"`
	// The IP address assigned to the customer side of the GRE tunnel.
	CustomerGreEndpoint pulumi.StringOutput `pulumi:"customerGreEndpoint"`
	// Description of the GRE tunnel intent.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Specifies if ICMP tunnel health checks are enabled.
	HealthCheckEnabled pulumi.BoolOutput `pulumi:"healthCheckEnabled"`
	// The IP address of the customer endpoint that will receive tunnel health checks.
	HealthCheckTarget pulumi.StringOutput `pulumi:"healthCheckTarget"`
	// Specifies the ICMP echo type for the health check. Available values: `request`, `reply`.
	HealthCheckType pulumi.StringOutput `pulumi:"healthCheckType"`
	// 31-bit prefix (/31 in CIDR notation) supporting 2 hosts, one for each side of the tunnel.
	InterfaceAddress pulumi.StringOutput `pulumi:"interfaceAddress"`
	// Maximum Transmission Unit (MTU) in bytes for the GRE tunnel.
	Mtu pulumi.IntOutput `pulumi:"mtu"`
	// Name of the GRE tunnel.
	Name pulumi.StringOutput `pulumi:"name"`
	// Time To Live (TTL) in number of hops of the GRE tunnel.
	Ttl pulumi.IntOutput `pulumi:"ttl"`
}

// NewMagicWanGreTunnel registers a new resource with the given unique name, arguments, and options.
func NewMagicWanGreTunnel(ctx *pulumi.Context,
	name string, args *MagicWanGreTunnelArgs, opts ...pulumi.ResourceOption) (*MagicWanGreTunnel, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.CloudflareGreEndpoint == nil {
		return nil, errors.New("invalid value for required argument 'CloudflareGreEndpoint'")
	}
	if args.CustomerGreEndpoint == nil {
		return nil, errors.New("invalid value for required argument 'CustomerGreEndpoint'")
	}
	if args.InterfaceAddress == nil {
		return nil, errors.New("invalid value for required argument 'InterfaceAddress'")
	}
	if args.Name == nil {
		return nil, errors.New("invalid value for required argument 'Name'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource MagicWanGreTunnel
	err := ctx.RegisterResource("cloudflare:index/magicWanGreTunnel:MagicWanGreTunnel", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMagicWanGreTunnel gets an existing MagicWanGreTunnel resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMagicWanGreTunnel(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MagicWanGreTunnelState, opts ...pulumi.ResourceOption) (*MagicWanGreTunnel, error) {
	var resource MagicWanGreTunnel
	err := ctx.ReadResource("cloudflare:index/magicWanGreTunnel:MagicWanGreTunnel", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering MagicWanGreTunnel resources.
type magicWanGreTunnelState struct {
	// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	AccountId *string `pulumi:"accountId"`
	// The IP address assigned to the Cloudflare side of the GRE tunnel.
	CloudflareGreEndpoint *string `pulumi:"cloudflareGreEndpoint"`
	// The IP address assigned to the customer side of the GRE tunnel.
	CustomerGreEndpoint *string `pulumi:"customerGreEndpoint"`
	// Description of the GRE tunnel intent.
	Description *string `pulumi:"description"`
	// Specifies if ICMP tunnel health checks are enabled.
	HealthCheckEnabled *bool `pulumi:"healthCheckEnabled"`
	// The IP address of the customer endpoint that will receive tunnel health checks.
	HealthCheckTarget *string `pulumi:"healthCheckTarget"`
	// Specifies the ICMP echo type for the health check. Available values: `request`, `reply`.
	HealthCheckType *string `pulumi:"healthCheckType"`
	// 31-bit prefix (/31 in CIDR notation) supporting 2 hosts, one for each side of the tunnel.
	InterfaceAddress *string `pulumi:"interfaceAddress"`
	// Maximum Transmission Unit (MTU) in bytes for the GRE tunnel.
	Mtu *int `pulumi:"mtu"`
	// Name of the GRE tunnel.
	Name *string `pulumi:"name"`
	// Time To Live (TTL) in number of hops of the GRE tunnel.
	Ttl *int `pulumi:"ttl"`
}

type MagicWanGreTunnelState struct {
	// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	AccountId pulumi.StringPtrInput
	// The IP address assigned to the Cloudflare side of the GRE tunnel.
	CloudflareGreEndpoint pulumi.StringPtrInput
	// The IP address assigned to the customer side of the GRE tunnel.
	CustomerGreEndpoint pulumi.StringPtrInput
	// Description of the GRE tunnel intent.
	Description pulumi.StringPtrInput
	// Specifies if ICMP tunnel health checks are enabled.
	HealthCheckEnabled pulumi.BoolPtrInput
	// The IP address of the customer endpoint that will receive tunnel health checks.
	HealthCheckTarget pulumi.StringPtrInput
	// Specifies the ICMP echo type for the health check. Available values: `request`, `reply`.
	HealthCheckType pulumi.StringPtrInput
	// 31-bit prefix (/31 in CIDR notation) supporting 2 hosts, one for each side of the tunnel.
	InterfaceAddress pulumi.StringPtrInput
	// Maximum Transmission Unit (MTU) in bytes for the GRE tunnel.
	Mtu pulumi.IntPtrInput
	// Name of the GRE tunnel.
	Name pulumi.StringPtrInput
	// Time To Live (TTL) in number of hops of the GRE tunnel.
	Ttl pulumi.IntPtrInput
}

func (MagicWanGreTunnelState) ElementType() reflect.Type {
	return reflect.TypeOf((*magicWanGreTunnelState)(nil)).Elem()
}

type magicWanGreTunnelArgs struct {
	// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	AccountId *string `pulumi:"accountId"`
	// The IP address assigned to the Cloudflare side of the GRE tunnel.
	CloudflareGreEndpoint string `pulumi:"cloudflareGreEndpoint"`
	// The IP address assigned to the customer side of the GRE tunnel.
	CustomerGreEndpoint string `pulumi:"customerGreEndpoint"`
	// Description of the GRE tunnel intent.
	Description *string `pulumi:"description"`
	// Specifies if ICMP tunnel health checks are enabled.
	HealthCheckEnabled *bool `pulumi:"healthCheckEnabled"`
	// The IP address of the customer endpoint that will receive tunnel health checks.
	HealthCheckTarget *string `pulumi:"healthCheckTarget"`
	// Specifies the ICMP echo type for the health check. Available values: `request`, `reply`.
	HealthCheckType *string `pulumi:"healthCheckType"`
	// 31-bit prefix (/31 in CIDR notation) supporting 2 hosts, one for each side of the tunnel.
	InterfaceAddress string `pulumi:"interfaceAddress"`
	// Maximum Transmission Unit (MTU) in bytes for the GRE tunnel.
	Mtu *int `pulumi:"mtu"`
	// Name of the GRE tunnel.
	Name string `pulumi:"name"`
	// Time To Live (TTL) in number of hops of the GRE tunnel.
	Ttl *int `pulumi:"ttl"`
}

// The set of arguments for constructing a MagicWanGreTunnel resource.
type MagicWanGreTunnelArgs struct {
	// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	AccountId pulumi.StringPtrInput
	// The IP address assigned to the Cloudflare side of the GRE tunnel.
	CloudflareGreEndpoint pulumi.StringInput
	// The IP address assigned to the customer side of the GRE tunnel.
	CustomerGreEndpoint pulumi.StringInput
	// Description of the GRE tunnel intent.
	Description pulumi.StringPtrInput
	// Specifies if ICMP tunnel health checks are enabled.
	HealthCheckEnabled pulumi.BoolPtrInput
	// The IP address of the customer endpoint that will receive tunnel health checks.
	HealthCheckTarget pulumi.StringPtrInput
	// Specifies the ICMP echo type for the health check. Available values: `request`, `reply`.
	HealthCheckType pulumi.StringPtrInput
	// 31-bit prefix (/31 in CIDR notation) supporting 2 hosts, one for each side of the tunnel.
	InterfaceAddress pulumi.StringInput
	// Maximum Transmission Unit (MTU) in bytes for the GRE tunnel.
	Mtu pulumi.IntPtrInput
	// Name of the GRE tunnel.
	Name pulumi.StringInput
	// Time To Live (TTL) in number of hops of the GRE tunnel.
	Ttl pulumi.IntPtrInput
}

func (MagicWanGreTunnelArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*magicWanGreTunnelArgs)(nil)).Elem()
}

type MagicWanGreTunnelInput interface {
	pulumi.Input

	ToMagicWanGreTunnelOutput() MagicWanGreTunnelOutput
	ToMagicWanGreTunnelOutputWithContext(ctx context.Context) MagicWanGreTunnelOutput
}

func (*MagicWanGreTunnel) ElementType() reflect.Type {
	return reflect.TypeOf((**MagicWanGreTunnel)(nil)).Elem()
}

func (i *MagicWanGreTunnel) ToMagicWanGreTunnelOutput() MagicWanGreTunnelOutput {
	return i.ToMagicWanGreTunnelOutputWithContext(context.Background())
}

func (i *MagicWanGreTunnel) ToMagicWanGreTunnelOutputWithContext(ctx context.Context) MagicWanGreTunnelOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MagicWanGreTunnelOutput)
}

// MagicWanGreTunnelArrayInput is an input type that accepts MagicWanGreTunnelArray and MagicWanGreTunnelArrayOutput values.
// You can construct a concrete instance of `MagicWanGreTunnelArrayInput` via:
//
//	MagicWanGreTunnelArray{ MagicWanGreTunnelArgs{...} }
type MagicWanGreTunnelArrayInput interface {
	pulumi.Input

	ToMagicWanGreTunnelArrayOutput() MagicWanGreTunnelArrayOutput
	ToMagicWanGreTunnelArrayOutputWithContext(context.Context) MagicWanGreTunnelArrayOutput
}

type MagicWanGreTunnelArray []MagicWanGreTunnelInput

func (MagicWanGreTunnelArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MagicWanGreTunnel)(nil)).Elem()
}

func (i MagicWanGreTunnelArray) ToMagicWanGreTunnelArrayOutput() MagicWanGreTunnelArrayOutput {
	return i.ToMagicWanGreTunnelArrayOutputWithContext(context.Background())
}

func (i MagicWanGreTunnelArray) ToMagicWanGreTunnelArrayOutputWithContext(ctx context.Context) MagicWanGreTunnelArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MagicWanGreTunnelArrayOutput)
}

// MagicWanGreTunnelMapInput is an input type that accepts MagicWanGreTunnelMap and MagicWanGreTunnelMapOutput values.
// You can construct a concrete instance of `MagicWanGreTunnelMapInput` via:
//
//	MagicWanGreTunnelMap{ "key": MagicWanGreTunnelArgs{...} }
type MagicWanGreTunnelMapInput interface {
	pulumi.Input

	ToMagicWanGreTunnelMapOutput() MagicWanGreTunnelMapOutput
	ToMagicWanGreTunnelMapOutputWithContext(context.Context) MagicWanGreTunnelMapOutput
}

type MagicWanGreTunnelMap map[string]MagicWanGreTunnelInput

func (MagicWanGreTunnelMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MagicWanGreTunnel)(nil)).Elem()
}

func (i MagicWanGreTunnelMap) ToMagicWanGreTunnelMapOutput() MagicWanGreTunnelMapOutput {
	return i.ToMagicWanGreTunnelMapOutputWithContext(context.Background())
}

func (i MagicWanGreTunnelMap) ToMagicWanGreTunnelMapOutputWithContext(ctx context.Context) MagicWanGreTunnelMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MagicWanGreTunnelMapOutput)
}

type MagicWanGreTunnelOutput struct{ *pulumi.OutputState }

func (MagicWanGreTunnelOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**MagicWanGreTunnel)(nil)).Elem()
}

func (o MagicWanGreTunnelOutput) ToMagicWanGreTunnelOutput() MagicWanGreTunnelOutput {
	return o
}

func (o MagicWanGreTunnelOutput) ToMagicWanGreTunnelOutputWithContext(ctx context.Context) MagicWanGreTunnelOutput {
	return o
}

// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
func (o MagicWanGreTunnelOutput) AccountId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MagicWanGreTunnel) pulumi.StringPtrOutput { return v.AccountId }).(pulumi.StringPtrOutput)
}

// The IP address assigned to the Cloudflare side of the GRE tunnel.
func (o MagicWanGreTunnelOutput) CloudflareGreEndpoint() pulumi.StringOutput {
	return o.ApplyT(func(v *MagicWanGreTunnel) pulumi.StringOutput { return v.CloudflareGreEndpoint }).(pulumi.StringOutput)
}

// The IP address assigned to the customer side of the GRE tunnel.
func (o MagicWanGreTunnelOutput) CustomerGreEndpoint() pulumi.StringOutput {
	return o.ApplyT(func(v *MagicWanGreTunnel) pulumi.StringOutput { return v.CustomerGreEndpoint }).(pulumi.StringOutput)
}

// Description of the GRE tunnel intent.
func (o MagicWanGreTunnelOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MagicWanGreTunnel) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Specifies if ICMP tunnel health checks are enabled.
func (o MagicWanGreTunnelOutput) HealthCheckEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *MagicWanGreTunnel) pulumi.BoolOutput { return v.HealthCheckEnabled }).(pulumi.BoolOutput)
}

// The IP address of the customer endpoint that will receive tunnel health checks.
func (o MagicWanGreTunnelOutput) HealthCheckTarget() pulumi.StringOutput {
	return o.ApplyT(func(v *MagicWanGreTunnel) pulumi.StringOutput { return v.HealthCheckTarget }).(pulumi.StringOutput)
}

// Specifies the ICMP echo type for the health check. Available values: `request`, `reply`.
func (o MagicWanGreTunnelOutput) HealthCheckType() pulumi.StringOutput {
	return o.ApplyT(func(v *MagicWanGreTunnel) pulumi.StringOutput { return v.HealthCheckType }).(pulumi.StringOutput)
}

// 31-bit prefix (/31 in CIDR notation) supporting 2 hosts, one for each side of the tunnel.
func (o MagicWanGreTunnelOutput) InterfaceAddress() pulumi.StringOutput {
	return o.ApplyT(func(v *MagicWanGreTunnel) pulumi.StringOutput { return v.InterfaceAddress }).(pulumi.StringOutput)
}

// Maximum Transmission Unit (MTU) in bytes for the GRE tunnel.
func (o MagicWanGreTunnelOutput) Mtu() pulumi.IntOutput {
	return o.ApplyT(func(v *MagicWanGreTunnel) pulumi.IntOutput { return v.Mtu }).(pulumi.IntOutput)
}

// Name of the GRE tunnel.
func (o MagicWanGreTunnelOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *MagicWanGreTunnel) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Time To Live (TTL) in number of hops of the GRE tunnel.
func (o MagicWanGreTunnelOutput) Ttl() pulumi.IntOutput {
	return o.ApplyT(func(v *MagicWanGreTunnel) pulumi.IntOutput { return v.Ttl }).(pulumi.IntOutput)
}

type MagicWanGreTunnelArrayOutput struct{ *pulumi.OutputState }

func (MagicWanGreTunnelArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MagicWanGreTunnel)(nil)).Elem()
}

func (o MagicWanGreTunnelArrayOutput) ToMagicWanGreTunnelArrayOutput() MagicWanGreTunnelArrayOutput {
	return o
}

func (o MagicWanGreTunnelArrayOutput) ToMagicWanGreTunnelArrayOutputWithContext(ctx context.Context) MagicWanGreTunnelArrayOutput {
	return o
}

func (o MagicWanGreTunnelArrayOutput) Index(i pulumi.IntInput) MagicWanGreTunnelOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *MagicWanGreTunnel {
		return vs[0].([]*MagicWanGreTunnel)[vs[1].(int)]
	}).(MagicWanGreTunnelOutput)
}

type MagicWanGreTunnelMapOutput struct{ *pulumi.OutputState }

func (MagicWanGreTunnelMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MagicWanGreTunnel)(nil)).Elem()
}

func (o MagicWanGreTunnelMapOutput) ToMagicWanGreTunnelMapOutput() MagicWanGreTunnelMapOutput {
	return o
}

func (o MagicWanGreTunnelMapOutput) ToMagicWanGreTunnelMapOutputWithContext(ctx context.Context) MagicWanGreTunnelMapOutput {
	return o
}

func (o MagicWanGreTunnelMapOutput) MapIndex(k pulumi.StringInput) MagicWanGreTunnelOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *MagicWanGreTunnel {
		return vs[0].(map[string]*MagicWanGreTunnel)[vs[1].(string)]
	}).(MagicWanGreTunnelOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*MagicWanGreTunnelInput)(nil)).Elem(), &MagicWanGreTunnel{})
	pulumi.RegisterInputType(reflect.TypeOf((*MagicWanGreTunnelArrayInput)(nil)).Elem(), MagicWanGreTunnelArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*MagicWanGreTunnelMapInput)(nil)).Elem(), MagicWanGreTunnelMap{})
	pulumi.RegisterOutputType(MagicWanGreTunnelOutput{})
	pulumi.RegisterOutputType(MagicWanGreTunnelArrayOutput{})
	pulumi.RegisterOutputType(MagicWanGreTunnelMapOutput{})
}