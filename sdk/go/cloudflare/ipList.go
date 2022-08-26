// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// IP Lists are a set of IP addresses or CIDR ranges that are configured on the account level. Once created, IP Lists can be
// used in Firewall Rules across all zones within the same account.
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
//			_, err := cloudflare.NewIpList(ctx, "example", &cloudflare.IpListArgs{
//				AccountId:   pulumi.String("d41d8cd98f00b204e9800998ecf8427e"),
//				Description: pulumi.String("list description"),
//				Items: IpListItemArray{
//					&IpListItemArgs{
//						Comment: pulumi.String("Office IP"),
//						Value:   pulumi.String("192.0.2.1"),
//					},
//					&IpListItemArgs{
//						Comment: pulumi.String("Datacenter range"),
//						Value:   pulumi.String("203.0.113.0/24"),
//					},
//				},
//				Kind: pulumi.String("ip"),
//				Name: pulumi.String("example_list"),
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
// # An existing IP List can be imported using the account ID and list ID
//
// ```sh
//
//	$ pulumi import cloudflare:index/ipList:IpList example d41d8cd98f00b204e9800998ecf8427e/cb029e245cfdd66dc8d2e570d5dd3322
//
// ```
type IpList struct {
	pulumi.CustomResourceState

	// The ID of the account where the IP List is being created.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// A note that can be used to annotate the List. Maximum Length: 500
	Description pulumi.StringPtrOutput `pulumi:"description"`
	Items       IpListItemArrayOutput  `pulumi:"items"`
	// The kind of values in the List. Valid values: `ip`.
	Kind pulumi.StringOutput `pulumi:"kind"`
	// The name of the list (used in filter expressions). Valid pattern: `^[a-zA-Z0-9_]+$`. Maximum Length: 50
	Name pulumi.StringOutput `pulumi:"name"`
}

// NewIpList registers a new resource with the given unique name, arguments, and options.
func NewIpList(ctx *pulumi.Context,
	name string, args *IpListArgs, opts ...pulumi.ResourceOption) (*IpList, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	if args.Kind == nil {
		return nil, errors.New("invalid value for required argument 'Kind'")
	}
	if args.Name == nil {
		return nil, errors.New("invalid value for required argument 'Name'")
	}
	var resource IpList
	err := ctx.RegisterResource("cloudflare:index/ipList:IpList", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetIpList gets an existing IpList resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetIpList(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *IpListState, opts ...pulumi.ResourceOption) (*IpList, error) {
	var resource IpList
	err := ctx.ReadResource("cloudflare:index/ipList:IpList", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering IpList resources.
type ipListState struct {
	// The ID of the account where the IP List is being created.
	AccountId *string `pulumi:"accountId"`
	// A note that can be used to annotate the List. Maximum Length: 500
	Description *string      `pulumi:"description"`
	Items       []IpListItem `pulumi:"items"`
	// The kind of values in the List. Valid values: `ip`.
	Kind *string `pulumi:"kind"`
	// The name of the list (used in filter expressions). Valid pattern: `^[a-zA-Z0-9_]+$`. Maximum Length: 50
	Name *string `pulumi:"name"`
}

type IpListState struct {
	// The ID of the account where the IP List is being created.
	AccountId pulumi.StringPtrInput
	// A note that can be used to annotate the List. Maximum Length: 500
	Description pulumi.StringPtrInput
	Items       IpListItemArrayInput
	// The kind of values in the List. Valid values: `ip`.
	Kind pulumi.StringPtrInput
	// The name of the list (used in filter expressions). Valid pattern: `^[a-zA-Z0-9_]+$`. Maximum Length: 50
	Name pulumi.StringPtrInput
}

func (IpListState) ElementType() reflect.Type {
	return reflect.TypeOf((*ipListState)(nil)).Elem()
}

type ipListArgs struct {
	// The ID of the account where the IP List is being created.
	AccountId string `pulumi:"accountId"`
	// A note that can be used to annotate the List. Maximum Length: 500
	Description *string      `pulumi:"description"`
	Items       []IpListItem `pulumi:"items"`
	// The kind of values in the List. Valid values: `ip`.
	Kind string `pulumi:"kind"`
	// The name of the list (used in filter expressions). Valid pattern: `^[a-zA-Z0-9_]+$`. Maximum Length: 50
	Name string `pulumi:"name"`
}

// The set of arguments for constructing a IpList resource.
type IpListArgs struct {
	// The ID of the account where the IP List is being created.
	AccountId pulumi.StringInput
	// A note that can be used to annotate the List. Maximum Length: 500
	Description pulumi.StringPtrInput
	Items       IpListItemArrayInput
	// The kind of values in the List. Valid values: `ip`.
	Kind pulumi.StringInput
	// The name of the list (used in filter expressions). Valid pattern: `^[a-zA-Z0-9_]+$`. Maximum Length: 50
	Name pulumi.StringInput
}

func (IpListArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ipListArgs)(nil)).Elem()
}

type IpListInput interface {
	pulumi.Input

	ToIpListOutput() IpListOutput
	ToIpListOutputWithContext(ctx context.Context) IpListOutput
}

func (*IpList) ElementType() reflect.Type {
	return reflect.TypeOf((**IpList)(nil)).Elem()
}

func (i *IpList) ToIpListOutput() IpListOutput {
	return i.ToIpListOutputWithContext(context.Background())
}

func (i *IpList) ToIpListOutputWithContext(ctx context.Context) IpListOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IpListOutput)
}

// IpListArrayInput is an input type that accepts IpListArray and IpListArrayOutput values.
// You can construct a concrete instance of `IpListArrayInput` via:
//
//	IpListArray{ IpListArgs{...} }
type IpListArrayInput interface {
	pulumi.Input

	ToIpListArrayOutput() IpListArrayOutput
	ToIpListArrayOutputWithContext(context.Context) IpListArrayOutput
}

type IpListArray []IpListInput

func (IpListArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*IpList)(nil)).Elem()
}

func (i IpListArray) ToIpListArrayOutput() IpListArrayOutput {
	return i.ToIpListArrayOutputWithContext(context.Background())
}

func (i IpListArray) ToIpListArrayOutputWithContext(ctx context.Context) IpListArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IpListArrayOutput)
}

// IpListMapInput is an input type that accepts IpListMap and IpListMapOutput values.
// You can construct a concrete instance of `IpListMapInput` via:
//
//	IpListMap{ "key": IpListArgs{...} }
type IpListMapInput interface {
	pulumi.Input

	ToIpListMapOutput() IpListMapOutput
	ToIpListMapOutputWithContext(context.Context) IpListMapOutput
}

type IpListMap map[string]IpListInput

func (IpListMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*IpList)(nil)).Elem()
}

func (i IpListMap) ToIpListMapOutput() IpListMapOutput {
	return i.ToIpListMapOutputWithContext(context.Background())
}

func (i IpListMap) ToIpListMapOutputWithContext(ctx context.Context) IpListMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IpListMapOutput)
}

type IpListOutput struct{ *pulumi.OutputState }

func (IpListOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**IpList)(nil)).Elem()
}

func (o IpListOutput) ToIpListOutput() IpListOutput {
	return o
}

func (o IpListOutput) ToIpListOutputWithContext(ctx context.Context) IpListOutput {
	return o
}

// The ID of the account where the IP List is being created.
func (o IpListOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *IpList) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// A note that can be used to annotate the List. Maximum Length: 500
func (o IpListOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *IpList) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

func (o IpListOutput) Items() IpListItemArrayOutput {
	return o.ApplyT(func(v *IpList) IpListItemArrayOutput { return v.Items }).(IpListItemArrayOutput)
}

// The kind of values in the List. Valid values: `ip`.
func (o IpListOutput) Kind() pulumi.StringOutput {
	return o.ApplyT(func(v *IpList) pulumi.StringOutput { return v.Kind }).(pulumi.StringOutput)
}

// The name of the list (used in filter expressions). Valid pattern: `^[a-zA-Z0-9_]+$`. Maximum Length: 50
func (o IpListOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *IpList) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

type IpListArrayOutput struct{ *pulumi.OutputState }

func (IpListArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*IpList)(nil)).Elem()
}

func (o IpListArrayOutput) ToIpListArrayOutput() IpListArrayOutput {
	return o
}

func (o IpListArrayOutput) ToIpListArrayOutputWithContext(ctx context.Context) IpListArrayOutput {
	return o
}

func (o IpListArrayOutput) Index(i pulumi.IntInput) IpListOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *IpList {
		return vs[0].([]*IpList)[vs[1].(int)]
	}).(IpListOutput)
}

type IpListMapOutput struct{ *pulumi.OutputState }

func (IpListMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*IpList)(nil)).Elem()
}

func (o IpListMapOutput) ToIpListMapOutput() IpListMapOutput {
	return o
}

func (o IpListMapOutput) ToIpListMapOutputWithContext(ctx context.Context) IpListMapOutput {
	return o
}

func (o IpListMapOutput) MapIndex(k pulumi.StringInput) IpListOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *IpList {
		return vs[0].(map[string]*IpList)[vs[1].(string)]
	}).(IpListOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*IpListInput)(nil)).Elem(), &IpList{})
	pulumi.RegisterInputType(reflect.TypeOf((*IpListArrayInput)(nil)).Elem(), IpListArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*IpListMapInput)(nil)).Elem(), IpListMap{})
	pulumi.RegisterOutputType(IpListOutput{})
	pulumi.RegisterOutputType(IpListArrayOutput{})
	pulumi.RegisterOutputType(IpListMapOutput{})
}
