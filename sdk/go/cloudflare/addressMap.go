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

// Provides the ability to manage IP addresses that can be used by DNS records when
// they are proxied through Cloudflare.
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
//			_, err := cloudflare.NewAddressMap(ctx, "example", &cloudflare.AddressMapArgs{
//				AccountId:   pulumi.String("f037e56e89293a057740de681ac9abbe"),
//				DefaultSni:  pulumi.String("*.example.com"),
//				Description: pulumi.String("My address map"),
//				Enabled:     pulumi.Bool(true),
//				Ips: cloudflare.AddressMapIpArray{
//					&cloudflare.AddressMapIpArgs{
//						Ip: pulumi.String("192.0.2.1"),
//					},
//					&cloudflare.AddressMapIpArgs{
//						Ip: pulumi.String("203.0.113.1"),
//					},
//				},
//				Memberships: cloudflare.AddressMapMembershipArray{
//					&cloudflare.AddressMapMembershipArgs{
//						Identifier: pulumi.String("92f17202ed8bd63d69a66b86a49a8f6b"),
//						Kind:       pulumi.String("account"),
//					},
//					&cloudflare.AddressMapMembershipArgs{
//						Identifier: pulumi.String("023e105f4ecef8ad9ca31a8372d0c353"),
//						Kind:       pulumi.String("zone"),
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
// ```sh
//
//	$ pulumi import cloudflare:index/addressMap:AddressMap example <account_id>/<address_map_id>
//
// ```
type AddressMap struct {
	pulumi.CustomResourceState

	// The account identifier to target for the resource.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// If set to false, then the Address Map cannot be deleted via API. This is true for Cloudflare-managed maps.
	CanDelete pulumi.BoolOutput `pulumi:"canDelete"`
	// If set to false, then the IPs on the Address Map cannot be modified via the API. This is true for Cloudflare-managed maps.
	CanModifyIps pulumi.BoolOutput `pulumi:"canModifyIps"`
	// If you have legacy TLS clients which do not send the TLS server name indicator, then you can specify one default SNI on the map.
	DefaultSni pulumi.StringPtrOutput `pulumi:"defaultSni"`
	// Description of the address map.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Whether the Address Map is enabled or not.
	Enabled pulumi.BoolOutput `pulumi:"enabled"`
	// The set of IPs on the Address Map.
	Ips AddressMapIpArrayOutput `pulumi:"ips"`
	// Zones and Accounts which will be assigned IPs on this Address Map.
	Memberships AddressMapMembershipArrayOutput `pulumi:"memberships"`
}

// NewAddressMap registers a new resource with the given unique name, arguments, and options.
func NewAddressMap(ctx *pulumi.Context,
	name string, args *AddressMapArgs, opts ...pulumi.ResourceOption) (*AddressMap, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	if args.Enabled == nil {
		return nil, errors.New("invalid value for required argument 'Enabled'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AddressMap
	err := ctx.RegisterResource("cloudflare:index/addressMap:AddressMap", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAddressMap gets an existing AddressMap resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAddressMap(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AddressMapState, opts ...pulumi.ResourceOption) (*AddressMap, error) {
	var resource AddressMap
	err := ctx.ReadResource("cloudflare:index/addressMap:AddressMap", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AddressMap resources.
type addressMapState struct {
	// The account identifier to target for the resource.
	AccountId *string `pulumi:"accountId"`
	// If set to false, then the Address Map cannot be deleted via API. This is true for Cloudflare-managed maps.
	CanDelete *bool `pulumi:"canDelete"`
	// If set to false, then the IPs on the Address Map cannot be modified via the API. This is true for Cloudflare-managed maps.
	CanModifyIps *bool `pulumi:"canModifyIps"`
	// If you have legacy TLS clients which do not send the TLS server name indicator, then you can specify one default SNI on the map.
	DefaultSni *string `pulumi:"defaultSni"`
	// Description of the address map.
	Description *string `pulumi:"description"`
	// Whether the Address Map is enabled or not.
	Enabled *bool `pulumi:"enabled"`
	// The set of IPs on the Address Map.
	Ips []AddressMapIp `pulumi:"ips"`
	// Zones and Accounts which will be assigned IPs on this Address Map.
	Memberships []AddressMapMembership `pulumi:"memberships"`
}

type AddressMapState struct {
	// The account identifier to target for the resource.
	AccountId pulumi.StringPtrInput
	// If set to false, then the Address Map cannot be deleted via API. This is true for Cloudflare-managed maps.
	CanDelete pulumi.BoolPtrInput
	// If set to false, then the IPs on the Address Map cannot be modified via the API. This is true for Cloudflare-managed maps.
	CanModifyIps pulumi.BoolPtrInput
	// If you have legacy TLS clients which do not send the TLS server name indicator, then you can specify one default SNI on the map.
	DefaultSni pulumi.StringPtrInput
	// Description of the address map.
	Description pulumi.StringPtrInput
	// Whether the Address Map is enabled or not.
	Enabled pulumi.BoolPtrInput
	// The set of IPs on the Address Map.
	Ips AddressMapIpArrayInput
	// Zones and Accounts which will be assigned IPs on this Address Map.
	Memberships AddressMapMembershipArrayInput
}

func (AddressMapState) ElementType() reflect.Type {
	return reflect.TypeOf((*addressMapState)(nil)).Elem()
}

type addressMapArgs struct {
	// The account identifier to target for the resource.
	AccountId string `pulumi:"accountId"`
	// If you have legacy TLS clients which do not send the TLS server name indicator, then you can specify one default SNI on the map.
	DefaultSni *string `pulumi:"defaultSni"`
	// Description of the address map.
	Description *string `pulumi:"description"`
	// Whether the Address Map is enabled or not.
	Enabled bool `pulumi:"enabled"`
	// The set of IPs on the Address Map.
	Ips []AddressMapIp `pulumi:"ips"`
	// Zones and Accounts which will be assigned IPs on this Address Map.
	Memberships []AddressMapMembership `pulumi:"memberships"`
}

// The set of arguments for constructing a AddressMap resource.
type AddressMapArgs struct {
	// The account identifier to target for the resource.
	AccountId pulumi.StringInput
	// If you have legacy TLS clients which do not send the TLS server name indicator, then you can specify one default SNI on the map.
	DefaultSni pulumi.StringPtrInput
	// Description of the address map.
	Description pulumi.StringPtrInput
	// Whether the Address Map is enabled or not.
	Enabled pulumi.BoolInput
	// The set of IPs on the Address Map.
	Ips AddressMapIpArrayInput
	// Zones and Accounts which will be assigned IPs on this Address Map.
	Memberships AddressMapMembershipArrayInput
}

func (AddressMapArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*addressMapArgs)(nil)).Elem()
}

type AddressMapInput interface {
	pulumi.Input

	ToAddressMapOutput() AddressMapOutput
	ToAddressMapOutputWithContext(ctx context.Context) AddressMapOutput
}

func (*AddressMap) ElementType() reflect.Type {
	return reflect.TypeOf((**AddressMap)(nil)).Elem()
}

func (i *AddressMap) ToAddressMapOutput() AddressMapOutput {
	return i.ToAddressMapOutputWithContext(context.Background())
}

func (i *AddressMap) ToAddressMapOutputWithContext(ctx context.Context) AddressMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AddressMapOutput)
}

// AddressMapArrayInput is an input type that accepts AddressMapArray and AddressMapArrayOutput values.
// You can construct a concrete instance of `AddressMapArrayInput` via:
//
//	AddressMapArray{ AddressMapArgs{...} }
type AddressMapArrayInput interface {
	pulumi.Input

	ToAddressMapArrayOutput() AddressMapArrayOutput
	ToAddressMapArrayOutputWithContext(context.Context) AddressMapArrayOutput
}

type AddressMapArray []AddressMapInput

func (AddressMapArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AddressMap)(nil)).Elem()
}

func (i AddressMapArray) ToAddressMapArrayOutput() AddressMapArrayOutput {
	return i.ToAddressMapArrayOutputWithContext(context.Background())
}

func (i AddressMapArray) ToAddressMapArrayOutputWithContext(ctx context.Context) AddressMapArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AddressMapArrayOutput)
}

// AddressMapMapInput is an input type that accepts AddressMapMap and AddressMapMapOutput values.
// You can construct a concrete instance of `AddressMapMapInput` via:
//
//	AddressMapMap{ "key": AddressMapArgs{...} }
type AddressMapMapInput interface {
	pulumi.Input

	ToAddressMapMapOutput() AddressMapMapOutput
	ToAddressMapMapOutputWithContext(context.Context) AddressMapMapOutput
}

type AddressMapMap map[string]AddressMapInput

func (AddressMapMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AddressMap)(nil)).Elem()
}

func (i AddressMapMap) ToAddressMapMapOutput() AddressMapMapOutput {
	return i.ToAddressMapMapOutputWithContext(context.Background())
}

func (i AddressMapMap) ToAddressMapMapOutputWithContext(ctx context.Context) AddressMapMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AddressMapMapOutput)
}

type AddressMapOutput struct{ *pulumi.OutputState }

func (AddressMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AddressMap)(nil)).Elem()
}

func (o AddressMapOutput) ToAddressMapOutput() AddressMapOutput {
	return o
}

func (o AddressMapOutput) ToAddressMapOutputWithContext(ctx context.Context) AddressMapOutput {
	return o
}

// The account identifier to target for the resource.
func (o AddressMapOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *AddressMap) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// If set to false, then the Address Map cannot be deleted via API. This is true for Cloudflare-managed maps.
func (o AddressMapOutput) CanDelete() pulumi.BoolOutput {
	return o.ApplyT(func(v *AddressMap) pulumi.BoolOutput { return v.CanDelete }).(pulumi.BoolOutput)
}

// If set to false, then the IPs on the Address Map cannot be modified via the API. This is true for Cloudflare-managed maps.
func (o AddressMapOutput) CanModifyIps() pulumi.BoolOutput {
	return o.ApplyT(func(v *AddressMap) pulumi.BoolOutput { return v.CanModifyIps }).(pulumi.BoolOutput)
}

// If you have legacy TLS clients which do not send the TLS server name indicator, then you can specify one default SNI on the map.
func (o AddressMapOutput) DefaultSni() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AddressMap) pulumi.StringPtrOutput { return v.DefaultSni }).(pulumi.StringPtrOutput)
}

// Description of the address map.
func (o AddressMapOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AddressMap) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Whether the Address Map is enabled or not.
func (o AddressMapOutput) Enabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *AddressMap) pulumi.BoolOutput { return v.Enabled }).(pulumi.BoolOutput)
}

// The set of IPs on the Address Map.
func (o AddressMapOutput) Ips() AddressMapIpArrayOutput {
	return o.ApplyT(func(v *AddressMap) AddressMapIpArrayOutput { return v.Ips }).(AddressMapIpArrayOutput)
}

// Zones and Accounts which will be assigned IPs on this Address Map.
func (o AddressMapOutput) Memberships() AddressMapMembershipArrayOutput {
	return o.ApplyT(func(v *AddressMap) AddressMapMembershipArrayOutput { return v.Memberships }).(AddressMapMembershipArrayOutput)
}

type AddressMapArrayOutput struct{ *pulumi.OutputState }

func (AddressMapArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AddressMap)(nil)).Elem()
}

func (o AddressMapArrayOutput) ToAddressMapArrayOutput() AddressMapArrayOutput {
	return o
}

func (o AddressMapArrayOutput) ToAddressMapArrayOutputWithContext(ctx context.Context) AddressMapArrayOutput {
	return o
}

func (o AddressMapArrayOutput) Index(i pulumi.IntInput) AddressMapOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AddressMap {
		return vs[0].([]*AddressMap)[vs[1].(int)]
	}).(AddressMapOutput)
}

type AddressMapMapOutput struct{ *pulumi.OutputState }

func (AddressMapMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AddressMap)(nil)).Elem()
}

func (o AddressMapMapOutput) ToAddressMapMapOutput() AddressMapMapOutput {
	return o
}

func (o AddressMapMapOutput) ToAddressMapMapOutputWithContext(ctx context.Context) AddressMapMapOutput {
	return o
}

func (o AddressMapMapOutput) MapIndex(k pulumi.StringInput) AddressMapOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AddressMap {
		return vs[0].(map[string]*AddressMap)[vs[1].(string)]
	}).(AddressMapOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AddressMapInput)(nil)).Elem(), &AddressMap{})
	pulumi.RegisterInputType(reflect.TypeOf((*AddressMapArrayInput)(nil)).Elem(), AddressMapArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AddressMapMapInput)(nil)).Elem(), AddressMapMap{})
	pulumi.RegisterOutputType(AddressMapOutput{})
	pulumi.RegisterOutputType(AddressMapArrayOutput{})
	pulumi.RegisterOutputType(AddressMapMapOutput{})
}
