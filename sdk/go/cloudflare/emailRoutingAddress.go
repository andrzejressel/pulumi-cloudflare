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

// Provides a resource for managing Email Routing Addresses.
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
//			_, err := cloudflare.NewEmailRoutingAddress(ctx, "example", &cloudflare.EmailRoutingAddressArgs{
//				AccountId: pulumi.String("f037e56e89293a057740de681ac9abbe"),
//				Email:     pulumi.String("user@example.com"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type EmailRoutingAddress struct {
	pulumi.CustomResourceState

	// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// The date and time the destination address has been created.
	Created pulumi.StringOutput `pulumi:"created"`
	// The contact email address of the user. **Modifying this attribute will force creation of a new resource.**
	Email pulumi.StringOutput `pulumi:"email"`
	// The date and time the destination address was last modified.
	Modified pulumi.StringOutput `pulumi:"modified"`
	// Destination address identifier.
	Tag pulumi.StringOutput `pulumi:"tag"`
	// The date and time the destination address has been verified. Null means not verified yet.
	Verified pulumi.StringOutput `pulumi:"verified"`
}

// NewEmailRoutingAddress registers a new resource with the given unique name, arguments, and options.
func NewEmailRoutingAddress(ctx *pulumi.Context,
	name string, args *EmailRoutingAddressArgs, opts ...pulumi.ResourceOption) (*EmailRoutingAddress, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	if args.Email == nil {
		return nil, errors.New("invalid value for required argument 'Email'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource EmailRoutingAddress
	err := ctx.RegisterResource("cloudflare:index/emailRoutingAddress:EmailRoutingAddress", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEmailRoutingAddress gets an existing EmailRoutingAddress resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEmailRoutingAddress(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EmailRoutingAddressState, opts ...pulumi.ResourceOption) (*EmailRoutingAddress, error) {
	var resource EmailRoutingAddress
	err := ctx.ReadResource("cloudflare:index/emailRoutingAddress:EmailRoutingAddress", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering EmailRoutingAddress resources.
type emailRoutingAddressState struct {
	// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	AccountId *string `pulumi:"accountId"`
	// The date and time the destination address has been created.
	Created *string `pulumi:"created"`
	// The contact email address of the user. **Modifying this attribute will force creation of a new resource.**
	Email *string `pulumi:"email"`
	// The date and time the destination address was last modified.
	Modified *string `pulumi:"modified"`
	// Destination address identifier.
	Tag *string `pulumi:"tag"`
	// The date and time the destination address has been verified. Null means not verified yet.
	Verified *string `pulumi:"verified"`
}

type EmailRoutingAddressState struct {
	// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	AccountId pulumi.StringPtrInput
	// The date and time the destination address has been created.
	Created pulumi.StringPtrInput
	// The contact email address of the user. **Modifying this attribute will force creation of a new resource.**
	Email pulumi.StringPtrInput
	// The date and time the destination address was last modified.
	Modified pulumi.StringPtrInput
	// Destination address identifier.
	Tag pulumi.StringPtrInput
	// The date and time the destination address has been verified. Null means not verified yet.
	Verified pulumi.StringPtrInput
}

func (EmailRoutingAddressState) ElementType() reflect.Type {
	return reflect.TypeOf((*emailRoutingAddressState)(nil)).Elem()
}

type emailRoutingAddressArgs struct {
	// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	AccountId string `pulumi:"accountId"`
	// The contact email address of the user. **Modifying this attribute will force creation of a new resource.**
	Email string `pulumi:"email"`
}

// The set of arguments for constructing a EmailRoutingAddress resource.
type EmailRoutingAddressArgs struct {
	// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	AccountId pulumi.StringInput
	// The contact email address of the user. **Modifying this attribute will force creation of a new resource.**
	Email pulumi.StringInput
}

func (EmailRoutingAddressArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*emailRoutingAddressArgs)(nil)).Elem()
}

type EmailRoutingAddressInput interface {
	pulumi.Input

	ToEmailRoutingAddressOutput() EmailRoutingAddressOutput
	ToEmailRoutingAddressOutputWithContext(ctx context.Context) EmailRoutingAddressOutput
}

func (*EmailRoutingAddress) ElementType() reflect.Type {
	return reflect.TypeOf((**EmailRoutingAddress)(nil)).Elem()
}

func (i *EmailRoutingAddress) ToEmailRoutingAddressOutput() EmailRoutingAddressOutput {
	return i.ToEmailRoutingAddressOutputWithContext(context.Background())
}

func (i *EmailRoutingAddress) ToEmailRoutingAddressOutputWithContext(ctx context.Context) EmailRoutingAddressOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EmailRoutingAddressOutput)
}

// EmailRoutingAddressArrayInput is an input type that accepts EmailRoutingAddressArray and EmailRoutingAddressArrayOutput values.
// You can construct a concrete instance of `EmailRoutingAddressArrayInput` via:
//
//	EmailRoutingAddressArray{ EmailRoutingAddressArgs{...} }
type EmailRoutingAddressArrayInput interface {
	pulumi.Input

	ToEmailRoutingAddressArrayOutput() EmailRoutingAddressArrayOutput
	ToEmailRoutingAddressArrayOutputWithContext(context.Context) EmailRoutingAddressArrayOutput
}

type EmailRoutingAddressArray []EmailRoutingAddressInput

func (EmailRoutingAddressArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EmailRoutingAddress)(nil)).Elem()
}

func (i EmailRoutingAddressArray) ToEmailRoutingAddressArrayOutput() EmailRoutingAddressArrayOutput {
	return i.ToEmailRoutingAddressArrayOutputWithContext(context.Background())
}

func (i EmailRoutingAddressArray) ToEmailRoutingAddressArrayOutputWithContext(ctx context.Context) EmailRoutingAddressArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EmailRoutingAddressArrayOutput)
}

// EmailRoutingAddressMapInput is an input type that accepts EmailRoutingAddressMap and EmailRoutingAddressMapOutput values.
// You can construct a concrete instance of `EmailRoutingAddressMapInput` via:
//
//	EmailRoutingAddressMap{ "key": EmailRoutingAddressArgs{...} }
type EmailRoutingAddressMapInput interface {
	pulumi.Input

	ToEmailRoutingAddressMapOutput() EmailRoutingAddressMapOutput
	ToEmailRoutingAddressMapOutputWithContext(context.Context) EmailRoutingAddressMapOutput
}

type EmailRoutingAddressMap map[string]EmailRoutingAddressInput

func (EmailRoutingAddressMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EmailRoutingAddress)(nil)).Elem()
}

func (i EmailRoutingAddressMap) ToEmailRoutingAddressMapOutput() EmailRoutingAddressMapOutput {
	return i.ToEmailRoutingAddressMapOutputWithContext(context.Background())
}

func (i EmailRoutingAddressMap) ToEmailRoutingAddressMapOutputWithContext(ctx context.Context) EmailRoutingAddressMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EmailRoutingAddressMapOutput)
}

type EmailRoutingAddressOutput struct{ *pulumi.OutputState }

func (EmailRoutingAddressOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**EmailRoutingAddress)(nil)).Elem()
}

func (o EmailRoutingAddressOutput) ToEmailRoutingAddressOutput() EmailRoutingAddressOutput {
	return o
}

func (o EmailRoutingAddressOutput) ToEmailRoutingAddressOutputWithContext(ctx context.Context) EmailRoutingAddressOutput {
	return o
}

// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
func (o EmailRoutingAddressOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *EmailRoutingAddress) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// The date and time the destination address has been created.
func (o EmailRoutingAddressOutput) Created() pulumi.StringOutput {
	return o.ApplyT(func(v *EmailRoutingAddress) pulumi.StringOutput { return v.Created }).(pulumi.StringOutput)
}

// The contact email address of the user. **Modifying this attribute will force creation of a new resource.**
func (o EmailRoutingAddressOutput) Email() pulumi.StringOutput {
	return o.ApplyT(func(v *EmailRoutingAddress) pulumi.StringOutput { return v.Email }).(pulumi.StringOutput)
}

// The date and time the destination address was last modified.
func (o EmailRoutingAddressOutput) Modified() pulumi.StringOutput {
	return o.ApplyT(func(v *EmailRoutingAddress) pulumi.StringOutput { return v.Modified }).(pulumi.StringOutput)
}

// Destination address identifier.
func (o EmailRoutingAddressOutput) Tag() pulumi.StringOutput {
	return o.ApplyT(func(v *EmailRoutingAddress) pulumi.StringOutput { return v.Tag }).(pulumi.StringOutput)
}

// The date and time the destination address has been verified. Null means not verified yet.
func (o EmailRoutingAddressOutput) Verified() pulumi.StringOutput {
	return o.ApplyT(func(v *EmailRoutingAddress) pulumi.StringOutput { return v.Verified }).(pulumi.StringOutput)
}

type EmailRoutingAddressArrayOutput struct{ *pulumi.OutputState }

func (EmailRoutingAddressArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EmailRoutingAddress)(nil)).Elem()
}

func (o EmailRoutingAddressArrayOutput) ToEmailRoutingAddressArrayOutput() EmailRoutingAddressArrayOutput {
	return o
}

func (o EmailRoutingAddressArrayOutput) ToEmailRoutingAddressArrayOutputWithContext(ctx context.Context) EmailRoutingAddressArrayOutput {
	return o
}

func (o EmailRoutingAddressArrayOutput) Index(i pulumi.IntInput) EmailRoutingAddressOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *EmailRoutingAddress {
		return vs[0].([]*EmailRoutingAddress)[vs[1].(int)]
	}).(EmailRoutingAddressOutput)
}

type EmailRoutingAddressMapOutput struct{ *pulumi.OutputState }

func (EmailRoutingAddressMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EmailRoutingAddress)(nil)).Elem()
}

func (o EmailRoutingAddressMapOutput) ToEmailRoutingAddressMapOutput() EmailRoutingAddressMapOutput {
	return o
}

func (o EmailRoutingAddressMapOutput) ToEmailRoutingAddressMapOutputWithContext(ctx context.Context) EmailRoutingAddressMapOutput {
	return o
}

func (o EmailRoutingAddressMapOutput) MapIndex(k pulumi.StringInput) EmailRoutingAddressOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *EmailRoutingAddress {
		return vs[0].(map[string]*EmailRoutingAddress)[vs[1].(string)]
	}).(EmailRoutingAddressOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*EmailRoutingAddressInput)(nil)).Elem(), &EmailRoutingAddress{})
	pulumi.RegisterInputType(reflect.TypeOf((*EmailRoutingAddressArrayInput)(nil)).Elem(), EmailRoutingAddressArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*EmailRoutingAddressMapInput)(nil)).Elem(), EmailRoutingAddressMap{})
	pulumi.RegisterOutputType(EmailRoutingAddressOutput{})
	pulumi.RegisterOutputType(EmailRoutingAddressArrayOutput{})
	pulumi.RegisterOutputType(EmailRoutingAddressMapOutput{})
}
