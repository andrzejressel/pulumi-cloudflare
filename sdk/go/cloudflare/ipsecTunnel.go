// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-cloudflare/sdk/v5/go/cloudflare/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Provides a resource, that manages IPsec tunnels for Magic Transit.
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
//			_, err := cloudflare.NewIpsecTunnel(ctx, "example", &cloudflare.IpsecTunnelArgs{
//				AccountId:          pulumi.String("f037e56e89293a057740de681ac9abbe"),
//				AllowNullCipher:    pulumi.Bool(false),
//				CloudflareEndpoint: pulumi.String("203.0.113.1"),
//				CustomerEndpoint:   pulumi.String("203.0.113.1"),
//				Description:        pulumi.String("Tunnel for ISP X"),
//				HealthCheckEnabled: pulumi.Bool(true),
//				HealthCheckTarget:  pulumi.String("203.0.113.1"),
//				HealthCheckType:    pulumi.String("reply"),
//				InterfaceAddress:   pulumi.String("192.0.2.0/31"),
//				Name:               pulumi.String("IPsec_1"),
//				Psk:                pulumi.String("asdf12341234"),
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
//	$ pulumi import cloudflare:index/ipsecTunnel:IpsecTunnel example <account_id>/<tunnel_id>
//
// ```
type IpsecTunnel struct {
	pulumi.CustomResourceState

	// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	AccountId pulumi.StringPtrOutput `pulumi:"accountId"`
	// Specifies if this tunnel may use a null cipher (ENCR_NULL) in Phase 2. Defaults to `false`.
	AllowNullCipher pulumi.BoolPtrOutput `pulumi:"allowNullCipher"`
	// IP address assigned to the Cloudflare side of the IPsec tunnel.
	CloudflareEndpoint pulumi.StringOutput `pulumi:"cloudflareEndpoint"`
	// IP address assigned to the customer side of the IPsec tunnel.
	CustomerEndpoint pulumi.StringOutput `pulumi:"customerEndpoint"`
	// An optional description of the IPsec tunnel.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// `remoteId` in the form of a fqdn. This value is generated by cloudflare.
	FqdnId pulumi.StringOutput `pulumi:"fqdnId"`
	// Specifies if ICMP tunnel health checks are enabled. Default: `true`.
	HealthCheckEnabled pulumi.BoolOutput `pulumi:"healthCheckEnabled"`
	// The IP address of the customer endpoint that will receive tunnel health checks. Default: `<customer_gre_endpoint>`.
	HealthCheckTarget pulumi.StringOutput `pulumi:"healthCheckTarget"`
	// Specifies the ICMP echo type for the health check (`request` or `reply`). Available values: `request`, `reply` Default: `reply`.
	HealthCheckType pulumi.StringOutput `pulumi:"healthCheckType"`
	// `remoteId` as a hex string. This value is generated by cloudflare.
	HexId pulumi.StringOutput `pulumi:"hexId"`
	// 31-bit prefix (/31 in CIDR notation) supporting 2 hosts, one for each side of the tunnel.
	InterfaceAddress pulumi.StringOutput `pulumi:"interfaceAddress"`
	// Name of the IPsec tunnel.
	Name pulumi.StringOutput `pulumi:"name"`
	// Pre shared key to be used with the IPsec tunnel. If left unset, it will be autogenerated.
	Psk pulumi.StringOutput `pulumi:"psk"`
	// ID to be used while setting up the IPsec tunnel. This value is generated by cloudflare.
	RemoteId pulumi.StringOutput `pulumi:"remoteId"`
	// `remoteId` in the form of an email address. This value is generated by cloudflare.
	UserId pulumi.StringOutput `pulumi:"userId"`
}

// NewIpsecTunnel registers a new resource with the given unique name, arguments, and options.
func NewIpsecTunnel(ctx *pulumi.Context,
	name string, args *IpsecTunnelArgs, opts ...pulumi.ResourceOption) (*IpsecTunnel, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.CloudflareEndpoint == nil {
		return nil, errors.New("invalid value for required argument 'CloudflareEndpoint'")
	}
	if args.CustomerEndpoint == nil {
		return nil, errors.New("invalid value for required argument 'CustomerEndpoint'")
	}
	if args.InterfaceAddress == nil {
		return nil, errors.New("invalid value for required argument 'InterfaceAddress'")
	}
	if args.Name == nil {
		return nil, errors.New("invalid value for required argument 'Name'")
	}
	if args.Psk != nil {
		args.Psk = pulumi.ToSecret(args.Psk).(pulumi.StringPtrInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"psk",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource IpsecTunnel
	err := ctx.RegisterResource("cloudflare:index/ipsecTunnel:IpsecTunnel", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetIpsecTunnel gets an existing IpsecTunnel resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetIpsecTunnel(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *IpsecTunnelState, opts ...pulumi.ResourceOption) (*IpsecTunnel, error) {
	var resource IpsecTunnel
	err := ctx.ReadResource("cloudflare:index/ipsecTunnel:IpsecTunnel", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering IpsecTunnel resources.
type ipsecTunnelState struct {
	// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	AccountId *string `pulumi:"accountId"`
	// Specifies if this tunnel may use a null cipher (ENCR_NULL) in Phase 2. Defaults to `false`.
	AllowNullCipher *bool `pulumi:"allowNullCipher"`
	// IP address assigned to the Cloudflare side of the IPsec tunnel.
	CloudflareEndpoint *string `pulumi:"cloudflareEndpoint"`
	// IP address assigned to the customer side of the IPsec tunnel.
	CustomerEndpoint *string `pulumi:"customerEndpoint"`
	// An optional description of the IPsec tunnel.
	Description *string `pulumi:"description"`
	// `remoteId` in the form of a fqdn. This value is generated by cloudflare.
	FqdnId *string `pulumi:"fqdnId"`
	// Specifies if ICMP tunnel health checks are enabled. Default: `true`.
	HealthCheckEnabled *bool `pulumi:"healthCheckEnabled"`
	// The IP address of the customer endpoint that will receive tunnel health checks. Default: `<customer_gre_endpoint>`.
	HealthCheckTarget *string `pulumi:"healthCheckTarget"`
	// Specifies the ICMP echo type for the health check (`request` or `reply`). Available values: `request`, `reply` Default: `reply`.
	HealthCheckType *string `pulumi:"healthCheckType"`
	// `remoteId` as a hex string. This value is generated by cloudflare.
	HexId *string `pulumi:"hexId"`
	// 31-bit prefix (/31 in CIDR notation) supporting 2 hosts, one for each side of the tunnel.
	InterfaceAddress *string `pulumi:"interfaceAddress"`
	// Name of the IPsec tunnel.
	Name *string `pulumi:"name"`
	// Pre shared key to be used with the IPsec tunnel. If left unset, it will be autogenerated.
	Psk *string `pulumi:"psk"`
	// ID to be used while setting up the IPsec tunnel. This value is generated by cloudflare.
	RemoteId *string `pulumi:"remoteId"`
	// `remoteId` in the form of an email address. This value is generated by cloudflare.
	UserId *string `pulumi:"userId"`
}

type IpsecTunnelState struct {
	// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	AccountId pulumi.StringPtrInput
	// Specifies if this tunnel may use a null cipher (ENCR_NULL) in Phase 2. Defaults to `false`.
	AllowNullCipher pulumi.BoolPtrInput
	// IP address assigned to the Cloudflare side of the IPsec tunnel.
	CloudflareEndpoint pulumi.StringPtrInput
	// IP address assigned to the customer side of the IPsec tunnel.
	CustomerEndpoint pulumi.StringPtrInput
	// An optional description of the IPsec tunnel.
	Description pulumi.StringPtrInput
	// `remoteId` in the form of a fqdn. This value is generated by cloudflare.
	FqdnId pulumi.StringPtrInput
	// Specifies if ICMP tunnel health checks are enabled. Default: `true`.
	HealthCheckEnabled pulumi.BoolPtrInput
	// The IP address of the customer endpoint that will receive tunnel health checks. Default: `<customer_gre_endpoint>`.
	HealthCheckTarget pulumi.StringPtrInput
	// Specifies the ICMP echo type for the health check (`request` or `reply`). Available values: `request`, `reply` Default: `reply`.
	HealthCheckType pulumi.StringPtrInput
	// `remoteId` as a hex string. This value is generated by cloudflare.
	HexId pulumi.StringPtrInput
	// 31-bit prefix (/31 in CIDR notation) supporting 2 hosts, one for each side of the tunnel.
	InterfaceAddress pulumi.StringPtrInput
	// Name of the IPsec tunnel.
	Name pulumi.StringPtrInput
	// Pre shared key to be used with the IPsec tunnel. If left unset, it will be autogenerated.
	Psk pulumi.StringPtrInput
	// ID to be used while setting up the IPsec tunnel. This value is generated by cloudflare.
	RemoteId pulumi.StringPtrInput
	// `remoteId` in the form of an email address. This value is generated by cloudflare.
	UserId pulumi.StringPtrInput
}

func (IpsecTunnelState) ElementType() reflect.Type {
	return reflect.TypeOf((*ipsecTunnelState)(nil)).Elem()
}

type ipsecTunnelArgs struct {
	// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	AccountId *string `pulumi:"accountId"`
	// Specifies if this tunnel may use a null cipher (ENCR_NULL) in Phase 2. Defaults to `false`.
	AllowNullCipher *bool `pulumi:"allowNullCipher"`
	// IP address assigned to the Cloudflare side of the IPsec tunnel.
	CloudflareEndpoint string `pulumi:"cloudflareEndpoint"`
	// IP address assigned to the customer side of the IPsec tunnel.
	CustomerEndpoint string `pulumi:"customerEndpoint"`
	// An optional description of the IPsec tunnel.
	Description *string `pulumi:"description"`
	// `remoteId` in the form of a fqdn. This value is generated by cloudflare.
	FqdnId *string `pulumi:"fqdnId"`
	// Specifies if ICMP tunnel health checks are enabled. Default: `true`.
	HealthCheckEnabled *bool `pulumi:"healthCheckEnabled"`
	// The IP address of the customer endpoint that will receive tunnel health checks. Default: `<customer_gre_endpoint>`.
	HealthCheckTarget *string `pulumi:"healthCheckTarget"`
	// Specifies the ICMP echo type for the health check (`request` or `reply`). Available values: `request`, `reply` Default: `reply`.
	HealthCheckType *string `pulumi:"healthCheckType"`
	// `remoteId` as a hex string. This value is generated by cloudflare.
	HexId *string `pulumi:"hexId"`
	// 31-bit prefix (/31 in CIDR notation) supporting 2 hosts, one for each side of the tunnel.
	InterfaceAddress string `pulumi:"interfaceAddress"`
	// Name of the IPsec tunnel.
	Name string `pulumi:"name"`
	// Pre shared key to be used with the IPsec tunnel. If left unset, it will be autogenerated.
	Psk *string `pulumi:"psk"`
	// ID to be used while setting up the IPsec tunnel. This value is generated by cloudflare.
	RemoteId *string `pulumi:"remoteId"`
	// `remoteId` in the form of an email address. This value is generated by cloudflare.
	UserId *string `pulumi:"userId"`
}

// The set of arguments for constructing a IpsecTunnel resource.
type IpsecTunnelArgs struct {
	// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	AccountId pulumi.StringPtrInput
	// Specifies if this tunnel may use a null cipher (ENCR_NULL) in Phase 2. Defaults to `false`.
	AllowNullCipher pulumi.BoolPtrInput
	// IP address assigned to the Cloudflare side of the IPsec tunnel.
	CloudflareEndpoint pulumi.StringInput
	// IP address assigned to the customer side of the IPsec tunnel.
	CustomerEndpoint pulumi.StringInput
	// An optional description of the IPsec tunnel.
	Description pulumi.StringPtrInput
	// `remoteId` in the form of a fqdn. This value is generated by cloudflare.
	FqdnId pulumi.StringPtrInput
	// Specifies if ICMP tunnel health checks are enabled. Default: `true`.
	HealthCheckEnabled pulumi.BoolPtrInput
	// The IP address of the customer endpoint that will receive tunnel health checks. Default: `<customer_gre_endpoint>`.
	HealthCheckTarget pulumi.StringPtrInput
	// Specifies the ICMP echo type for the health check (`request` or `reply`). Available values: `request`, `reply` Default: `reply`.
	HealthCheckType pulumi.StringPtrInput
	// `remoteId` as a hex string. This value is generated by cloudflare.
	HexId pulumi.StringPtrInput
	// 31-bit prefix (/31 in CIDR notation) supporting 2 hosts, one for each side of the tunnel.
	InterfaceAddress pulumi.StringInput
	// Name of the IPsec tunnel.
	Name pulumi.StringInput
	// Pre shared key to be used with the IPsec tunnel. If left unset, it will be autogenerated.
	Psk pulumi.StringPtrInput
	// ID to be used while setting up the IPsec tunnel. This value is generated by cloudflare.
	RemoteId pulumi.StringPtrInput
	// `remoteId` in the form of an email address. This value is generated by cloudflare.
	UserId pulumi.StringPtrInput
}

func (IpsecTunnelArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ipsecTunnelArgs)(nil)).Elem()
}

type IpsecTunnelInput interface {
	pulumi.Input

	ToIpsecTunnelOutput() IpsecTunnelOutput
	ToIpsecTunnelOutputWithContext(ctx context.Context) IpsecTunnelOutput
}

func (*IpsecTunnel) ElementType() reflect.Type {
	return reflect.TypeOf((**IpsecTunnel)(nil)).Elem()
}

func (i *IpsecTunnel) ToIpsecTunnelOutput() IpsecTunnelOutput {
	return i.ToIpsecTunnelOutputWithContext(context.Background())
}

func (i *IpsecTunnel) ToIpsecTunnelOutputWithContext(ctx context.Context) IpsecTunnelOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IpsecTunnelOutput)
}

func (i *IpsecTunnel) ToOutput(ctx context.Context) pulumix.Output[*IpsecTunnel] {
	return pulumix.Output[*IpsecTunnel]{
		OutputState: i.ToIpsecTunnelOutputWithContext(ctx).OutputState,
	}
}

// IpsecTunnelArrayInput is an input type that accepts IpsecTunnelArray and IpsecTunnelArrayOutput values.
// You can construct a concrete instance of `IpsecTunnelArrayInput` via:
//
//	IpsecTunnelArray{ IpsecTunnelArgs{...} }
type IpsecTunnelArrayInput interface {
	pulumi.Input

	ToIpsecTunnelArrayOutput() IpsecTunnelArrayOutput
	ToIpsecTunnelArrayOutputWithContext(context.Context) IpsecTunnelArrayOutput
}

type IpsecTunnelArray []IpsecTunnelInput

func (IpsecTunnelArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*IpsecTunnel)(nil)).Elem()
}

func (i IpsecTunnelArray) ToIpsecTunnelArrayOutput() IpsecTunnelArrayOutput {
	return i.ToIpsecTunnelArrayOutputWithContext(context.Background())
}

func (i IpsecTunnelArray) ToIpsecTunnelArrayOutputWithContext(ctx context.Context) IpsecTunnelArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IpsecTunnelArrayOutput)
}

func (i IpsecTunnelArray) ToOutput(ctx context.Context) pulumix.Output[[]*IpsecTunnel] {
	return pulumix.Output[[]*IpsecTunnel]{
		OutputState: i.ToIpsecTunnelArrayOutputWithContext(ctx).OutputState,
	}
}

// IpsecTunnelMapInput is an input type that accepts IpsecTunnelMap and IpsecTunnelMapOutput values.
// You can construct a concrete instance of `IpsecTunnelMapInput` via:
//
//	IpsecTunnelMap{ "key": IpsecTunnelArgs{...} }
type IpsecTunnelMapInput interface {
	pulumi.Input

	ToIpsecTunnelMapOutput() IpsecTunnelMapOutput
	ToIpsecTunnelMapOutputWithContext(context.Context) IpsecTunnelMapOutput
}

type IpsecTunnelMap map[string]IpsecTunnelInput

func (IpsecTunnelMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*IpsecTunnel)(nil)).Elem()
}

func (i IpsecTunnelMap) ToIpsecTunnelMapOutput() IpsecTunnelMapOutput {
	return i.ToIpsecTunnelMapOutputWithContext(context.Background())
}

func (i IpsecTunnelMap) ToIpsecTunnelMapOutputWithContext(ctx context.Context) IpsecTunnelMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IpsecTunnelMapOutput)
}

func (i IpsecTunnelMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*IpsecTunnel] {
	return pulumix.Output[map[string]*IpsecTunnel]{
		OutputState: i.ToIpsecTunnelMapOutputWithContext(ctx).OutputState,
	}
}

type IpsecTunnelOutput struct{ *pulumi.OutputState }

func (IpsecTunnelOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**IpsecTunnel)(nil)).Elem()
}

func (o IpsecTunnelOutput) ToIpsecTunnelOutput() IpsecTunnelOutput {
	return o
}

func (o IpsecTunnelOutput) ToIpsecTunnelOutputWithContext(ctx context.Context) IpsecTunnelOutput {
	return o
}

func (o IpsecTunnelOutput) ToOutput(ctx context.Context) pulumix.Output[*IpsecTunnel] {
	return pulumix.Output[*IpsecTunnel]{
		OutputState: o.OutputState,
	}
}

// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
func (o IpsecTunnelOutput) AccountId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *IpsecTunnel) pulumi.StringPtrOutput { return v.AccountId }).(pulumi.StringPtrOutput)
}

// Specifies if this tunnel may use a null cipher (ENCR_NULL) in Phase 2. Defaults to `false`.
func (o IpsecTunnelOutput) AllowNullCipher() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *IpsecTunnel) pulumi.BoolPtrOutput { return v.AllowNullCipher }).(pulumi.BoolPtrOutput)
}

// IP address assigned to the Cloudflare side of the IPsec tunnel.
func (o IpsecTunnelOutput) CloudflareEndpoint() pulumi.StringOutput {
	return o.ApplyT(func(v *IpsecTunnel) pulumi.StringOutput { return v.CloudflareEndpoint }).(pulumi.StringOutput)
}

// IP address assigned to the customer side of the IPsec tunnel.
func (o IpsecTunnelOutput) CustomerEndpoint() pulumi.StringOutput {
	return o.ApplyT(func(v *IpsecTunnel) pulumi.StringOutput { return v.CustomerEndpoint }).(pulumi.StringOutput)
}

// An optional description of the IPsec tunnel.
func (o IpsecTunnelOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *IpsecTunnel) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// `remoteId` in the form of a fqdn. This value is generated by cloudflare.
func (o IpsecTunnelOutput) FqdnId() pulumi.StringOutput {
	return o.ApplyT(func(v *IpsecTunnel) pulumi.StringOutput { return v.FqdnId }).(pulumi.StringOutput)
}

// Specifies if ICMP tunnel health checks are enabled. Default: `true`.
func (o IpsecTunnelOutput) HealthCheckEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *IpsecTunnel) pulumi.BoolOutput { return v.HealthCheckEnabled }).(pulumi.BoolOutput)
}

// The IP address of the customer endpoint that will receive tunnel health checks. Default: `<customer_gre_endpoint>`.
func (o IpsecTunnelOutput) HealthCheckTarget() pulumi.StringOutput {
	return o.ApplyT(func(v *IpsecTunnel) pulumi.StringOutput { return v.HealthCheckTarget }).(pulumi.StringOutput)
}

// Specifies the ICMP echo type for the health check (`request` or `reply`). Available values: `request`, `reply` Default: `reply`.
func (o IpsecTunnelOutput) HealthCheckType() pulumi.StringOutput {
	return o.ApplyT(func(v *IpsecTunnel) pulumi.StringOutput { return v.HealthCheckType }).(pulumi.StringOutput)
}

// `remoteId` as a hex string. This value is generated by cloudflare.
func (o IpsecTunnelOutput) HexId() pulumi.StringOutput {
	return o.ApplyT(func(v *IpsecTunnel) pulumi.StringOutput { return v.HexId }).(pulumi.StringOutput)
}

// 31-bit prefix (/31 in CIDR notation) supporting 2 hosts, one for each side of the tunnel.
func (o IpsecTunnelOutput) InterfaceAddress() pulumi.StringOutput {
	return o.ApplyT(func(v *IpsecTunnel) pulumi.StringOutput { return v.InterfaceAddress }).(pulumi.StringOutput)
}

// Name of the IPsec tunnel.
func (o IpsecTunnelOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *IpsecTunnel) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Pre shared key to be used with the IPsec tunnel. If left unset, it will be autogenerated.
func (o IpsecTunnelOutput) Psk() pulumi.StringOutput {
	return o.ApplyT(func(v *IpsecTunnel) pulumi.StringOutput { return v.Psk }).(pulumi.StringOutput)
}

// ID to be used while setting up the IPsec tunnel. This value is generated by cloudflare.
func (o IpsecTunnelOutput) RemoteId() pulumi.StringOutput {
	return o.ApplyT(func(v *IpsecTunnel) pulumi.StringOutput { return v.RemoteId }).(pulumi.StringOutput)
}

// `remoteId` in the form of an email address. This value is generated by cloudflare.
func (o IpsecTunnelOutput) UserId() pulumi.StringOutput {
	return o.ApplyT(func(v *IpsecTunnel) pulumi.StringOutput { return v.UserId }).(pulumi.StringOutput)
}

type IpsecTunnelArrayOutput struct{ *pulumi.OutputState }

func (IpsecTunnelArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*IpsecTunnel)(nil)).Elem()
}

func (o IpsecTunnelArrayOutput) ToIpsecTunnelArrayOutput() IpsecTunnelArrayOutput {
	return o
}

func (o IpsecTunnelArrayOutput) ToIpsecTunnelArrayOutputWithContext(ctx context.Context) IpsecTunnelArrayOutput {
	return o
}

func (o IpsecTunnelArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*IpsecTunnel] {
	return pulumix.Output[[]*IpsecTunnel]{
		OutputState: o.OutputState,
	}
}

func (o IpsecTunnelArrayOutput) Index(i pulumi.IntInput) IpsecTunnelOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *IpsecTunnel {
		return vs[0].([]*IpsecTunnel)[vs[1].(int)]
	}).(IpsecTunnelOutput)
}

type IpsecTunnelMapOutput struct{ *pulumi.OutputState }

func (IpsecTunnelMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*IpsecTunnel)(nil)).Elem()
}

func (o IpsecTunnelMapOutput) ToIpsecTunnelMapOutput() IpsecTunnelMapOutput {
	return o
}

func (o IpsecTunnelMapOutput) ToIpsecTunnelMapOutputWithContext(ctx context.Context) IpsecTunnelMapOutput {
	return o
}

func (o IpsecTunnelMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*IpsecTunnel] {
	return pulumix.Output[map[string]*IpsecTunnel]{
		OutputState: o.OutputState,
	}
}

func (o IpsecTunnelMapOutput) MapIndex(k pulumi.StringInput) IpsecTunnelOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *IpsecTunnel {
		return vs[0].(map[string]*IpsecTunnel)[vs[1].(string)]
	}).(IpsecTunnelOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*IpsecTunnelInput)(nil)).Elem(), &IpsecTunnel{})
	pulumi.RegisterInputType(reflect.TypeOf((*IpsecTunnelArrayInput)(nil)).Elem(), IpsecTunnelArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*IpsecTunnelMapInput)(nil)).Elem(), IpsecTunnelMap{})
	pulumi.RegisterOutputType(IpsecTunnelOutput{})
	pulumi.RegisterOutputType(IpsecTunnelArrayOutput{})
	pulumi.RegisterOutputType(IpsecTunnelMapOutput{})
}
