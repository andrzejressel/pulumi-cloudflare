// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-cloudflare/sdk/v5/go/cloudflare/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Cloudflare Access Mutual TLS Certificate Settings resource.
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
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
//			_, err := cloudflare.NewAccessMutualTlsHostnameSettings(ctx, "example", &cloudflare.AccessMutualTlsHostnameSettingsArgs{
//				ZoneId: pulumi.String("0da42c8d2132a9ddaf714f9e7c920711"),
//				Settings: cloudflare.AccessMutualTlsHostnameSettingsSettingArray{
//					&cloudflare.AccessMutualTlsHostnameSettingsSettingArgs{
//						Hostname:                    pulumi.String("example.com"),
//						ClientCertificateForwarding: pulumi.Bool(true),
//						ChinaNetwork:                pulumi.Bool(false),
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
// <!--End PulumiCodeChooser -->
//
// ## Import
//
// Account level mTLS hostname settings import.
//
// ```sh
// $ pulumi import cloudflare:index/accessMutualTlsHostnameSettings:AccessMutualTlsHostnameSettings example account/<account_id>
// ```
//
// Zone level mTLS hostname settings import.
//
// ```sh
// $ pulumi import cloudflare:index/accessMutualTlsHostnameSettings:AccessMutualTlsHostnameSettings example zone/<zone_id>
// ```
type AccessMutualTlsHostnameSettings struct {
	pulumi.CustomResourceState

	// The account identifier to target for the resource.
	AccountId pulumi.StringPtrOutput                            `pulumi:"accountId"`
	Settings  AccessMutualTlsHostnameSettingsSettingArrayOutput `pulumi:"settings"`
	// The zone identifier to target for the resource.
	ZoneId pulumi.StringPtrOutput `pulumi:"zoneId"`
}

// NewAccessMutualTlsHostnameSettings registers a new resource with the given unique name, arguments, and options.
func NewAccessMutualTlsHostnameSettings(ctx *pulumi.Context,
	name string, args *AccessMutualTlsHostnameSettingsArgs, opts ...pulumi.ResourceOption) (*AccessMutualTlsHostnameSettings, error) {
	if args == nil {
		args = &AccessMutualTlsHostnameSettingsArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AccessMutualTlsHostnameSettings
	err := ctx.RegisterResource("cloudflare:index/accessMutualTlsHostnameSettings:AccessMutualTlsHostnameSettings", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAccessMutualTlsHostnameSettings gets an existing AccessMutualTlsHostnameSettings resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAccessMutualTlsHostnameSettings(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AccessMutualTlsHostnameSettingsState, opts ...pulumi.ResourceOption) (*AccessMutualTlsHostnameSettings, error) {
	var resource AccessMutualTlsHostnameSettings
	err := ctx.ReadResource("cloudflare:index/accessMutualTlsHostnameSettings:AccessMutualTlsHostnameSettings", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AccessMutualTlsHostnameSettings resources.
type accessMutualTlsHostnameSettingsState struct {
	// The account identifier to target for the resource.
	AccountId *string                                  `pulumi:"accountId"`
	Settings  []AccessMutualTlsHostnameSettingsSetting `pulumi:"settings"`
	// The zone identifier to target for the resource.
	ZoneId *string `pulumi:"zoneId"`
}

type AccessMutualTlsHostnameSettingsState struct {
	// The account identifier to target for the resource.
	AccountId pulumi.StringPtrInput
	Settings  AccessMutualTlsHostnameSettingsSettingArrayInput
	// The zone identifier to target for the resource.
	ZoneId pulumi.StringPtrInput
}

func (AccessMutualTlsHostnameSettingsState) ElementType() reflect.Type {
	return reflect.TypeOf((*accessMutualTlsHostnameSettingsState)(nil)).Elem()
}

type accessMutualTlsHostnameSettingsArgs struct {
	// The account identifier to target for the resource.
	AccountId *string                                  `pulumi:"accountId"`
	Settings  []AccessMutualTlsHostnameSettingsSetting `pulumi:"settings"`
	// The zone identifier to target for the resource.
	ZoneId *string `pulumi:"zoneId"`
}

// The set of arguments for constructing a AccessMutualTlsHostnameSettings resource.
type AccessMutualTlsHostnameSettingsArgs struct {
	// The account identifier to target for the resource.
	AccountId pulumi.StringPtrInput
	Settings  AccessMutualTlsHostnameSettingsSettingArrayInput
	// The zone identifier to target for the resource.
	ZoneId pulumi.StringPtrInput
}

func (AccessMutualTlsHostnameSettingsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*accessMutualTlsHostnameSettingsArgs)(nil)).Elem()
}

type AccessMutualTlsHostnameSettingsInput interface {
	pulumi.Input

	ToAccessMutualTlsHostnameSettingsOutput() AccessMutualTlsHostnameSettingsOutput
	ToAccessMutualTlsHostnameSettingsOutputWithContext(ctx context.Context) AccessMutualTlsHostnameSettingsOutput
}

func (*AccessMutualTlsHostnameSettings) ElementType() reflect.Type {
	return reflect.TypeOf((**AccessMutualTlsHostnameSettings)(nil)).Elem()
}

func (i *AccessMutualTlsHostnameSettings) ToAccessMutualTlsHostnameSettingsOutput() AccessMutualTlsHostnameSettingsOutput {
	return i.ToAccessMutualTlsHostnameSettingsOutputWithContext(context.Background())
}

func (i *AccessMutualTlsHostnameSettings) ToAccessMutualTlsHostnameSettingsOutputWithContext(ctx context.Context) AccessMutualTlsHostnameSettingsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessMutualTlsHostnameSettingsOutput)
}

// AccessMutualTlsHostnameSettingsArrayInput is an input type that accepts AccessMutualTlsHostnameSettingsArray and AccessMutualTlsHostnameSettingsArrayOutput values.
// You can construct a concrete instance of `AccessMutualTlsHostnameSettingsArrayInput` via:
//
//	AccessMutualTlsHostnameSettingsArray{ AccessMutualTlsHostnameSettingsArgs{...} }
type AccessMutualTlsHostnameSettingsArrayInput interface {
	pulumi.Input

	ToAccessMutualTlsHostnameSettingsArrayOutput() AccessMutualTlsHostnameSettingsArrayOutput
	ToAccessMutualTlsHostnameSettingsArrayOutputWithContext(context.Context) AccessMutualTlsHostnameSettingsArrayOutput
}

type AccessMutualTlsHostnameSettingsArray []AccessMutualTlsHostnameSettingsInput

func (AccessMutualTlsHostnameSettingsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AccessMutualTlsHostnameSettings)(nil)).Elem()
}

func (i AccessMutualTlsHostnameSettingsArray) ToAccessMutualTlsHostnameSettingsArrayOutput() AccessMutualTlsHostnameSettingsArrayOutput {
	return i.ToAccessMutualTlsHostnameSettingsArrayOutputWithContext(context.Background())
}

func (i AccessMutualTlsHostnameSettingsArray) ToAccessMutualTlsHostnameSettingsArrayOutputWithContext(ctx context.Context) AccessMutualTlsHostnameSettingsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessMutualTlsHostnameSettingsArrayOutput)
}

// AccessMutualTlsHostnameSettingsMapInput is an input type that accepts AccessMutualTlsHostnameSettingsMap and AccessMutualTlsHostnameSettingsMapOutput values.
// You can construct a concrete instance of `AccessMutualTlsHostnameSettingsMapInput` via:
//
//	AccessMutualTlsHostnameSettingsMap{ "key": AccessMutualTlsHostnameSettingsArgs{...} }
type AccessMutualTlsHostnameSettingsMapInput interface {
	pulumi.Input

	ToAccessMutualTlsHostnameSettingsMapOutput() AccessMutualTlsHostnameSettingsMapOutput
	ToAccessMutualTlsHostnameSettingsMapOutputWithContext(context.Context) AccessMutualTlsHostnameSettingsMapOutput
}

type AccessMutualTlsHostnameSettingsMap map[string]AccessMutualTlsHostnameSettingsInput

func (AccessMutualTlsHostnameSettingsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AccessMutualTlsHostnameSettings)(nil)).Elem()
}

func (i AccessMutualTlsHostnameSettingsMap) ToAccessMutualTlsHostnameSettingsMapOutput() AccessMutualTlsHostnameSettingsMapOutput {
	return i.ToAccessMutualTlsHostnameSettingsMapOutputWithContext(context.Background())
}

func (i AccessMutualTlsHostnameSettingsMap) ToAccessMutualTlsHostnameSettingsMapOutputWithContext(ctx context.Context) AccessMutualTlsHostnameSettingsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessMutualTlsHostnameSettingsMapOutput)
}

type AccessMutualTlsHostnameSettingsOutput struct{ *pulumi.OutputState }

func (AccessMutualTlsHostnameSettingsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AccessMutualTlsHostnameSettings)(nil)).Elem()
}

func (o AccessMutualTlsHostnameSettingsOutput) ToAccessMutualTlsHostnameSettingsOutput() AccessMutualTlsHostnameSettingsOutput {
	return o
}

func (o AccessMutualTlsHostnameSettingsOutput) ToAccessMutualTlsHostnameSettingsOutputWithContext(ctx context.Context) AccessMutualTlsHostnameSettingsOutput {
	return o
}

// The account identifier to target for the resource.
func (o AccessMutualTlsHostnameSettingsOutput) AccountId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AccessMutualTlsHostnameSettings) pulumi.StringPtrOutput { return v.AccountId }).(pulumi.StringPtrOutput)
}

func (o AccessMutualTlsHostnameSettingsOutput) Settings() AccessMutualTlsHostnameSettingsSettingArrayOutput {
	return o.ApplyT(func(v *AccessMutualTlsHostnameSettings) AccessMutualTlsHostnameSettingsSettingArrayOutput {
		return v.Settings
	}).(AccessMutualTlsHostnameSettingsSettingArrayOutput)
}

// The zone identifier to target for the resource.
func (o AccessMutualTlsHostnameSettingsOutput) ZoneId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AccessMutualTlsHostnameSettings) pulumi.StringPtrOutput { return v.ZoneId }).(pulumi.StringPtrOutput)
}

type AccessMutualTlsHostnameSettingsArrayOutput struct{ *pulumi.OutputState }

func (AccessMutualTlsHostnameSettingsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AccessMutualTlsHostnameSettings)(nil)).Elem()
}

func (o AccessMutualTlsHostnameSettingsArrayOutput) ToAccessMutualTlsHostnameSettingsArrayOutput() AccessMutualTlsHostnameSettingsArrayOutput {
	return o
}

func (o AccessMutualTlsHostnameSettingsArrayOutput) ToAccessMutualTlsHostnameSettingsArrayOutputWithContext(ctx context.Context) AccessMutualTlsHostnameSettingsArrayOutput {
	return o
}

func (o AccessMutualTlsHostnameSettingsArrayOutput) Index(i pulumi.IntInput) AccessMutualTlsHostnameSettingsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AccessMutualTlsHostnameSettings {
		return vs[0].([]*AccessMutualTlsHostnameSettings)[vs[1].(int)]
	}).(AccessMutualTlsHostnameSettingsOutput)
}

type AccessMutualTlsHostnameSettingsMapOutput struct{ *pulumi.OutputState }

func (AccessMutualTlsHostnameSettingsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AccessMutualTlsHostnameSettings)(nil)).Elem()
}

func (o AccessMutualTlsHostnameSettingsMapOutput) ToAccessMutualTlsHostnameSettingsMapOutput() AccessMutualTlsHostnameSettingsMapOutput {
	return o
}

func (o AccessMutualTlsHostnameSettingsMapOutput) ToAccessMutualTlsHostnameSettingsMapOutputWithContext(ctx context.Context) AccessMutualTlsHostnameSettingsMapOutput {
	return o
}

func (o AccessMutualTlsHostnameSettingsMapOutput) MapIndex(k pulumi.StringInput) AccessMutualTlsHostnameSettingsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AccessMutualTlsHostnameSettings {
		return vs[0].(map[string]*AccessMutualTlsHostnameSettings)[vs[1].(string)]
	}).(AccessMutualTlsHostnameSettingsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AccessMutualTlsHostnameSettingsInput)(nil)).Elem(), &AccessMutualTlsHostnameSettings{})
	pulumi.RegisterInputType(reflect.TypeOf((*AccessMutualTlsHostnameSettingsArrayInput)(nil)).Elem(), AccessMutualTlsHostnameSettingsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AccessMutualTlsHostnameSettingsMapInput)(nil)).Elem(), AccessMutualTlsHostnameSettingsMap{})
	pulumi.RegisterOutputType(AccessMutualTlsHostnameSettingsOutput{})
	pulumi.RegisterOutputType(AccessMutualTlsHostnameSettingsArrayOutput{})
	pulumi.RegisterOutputType(AccessMutualTlsHostnameSettingsMapOutput{})
}
