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

// Provides a Cloudflare custom hostname (also known as SSL for SaaS) resource.
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
//			_, err := cloudflare.NewCustomHostname(ctx, "example", &cloudflare.CustomHostnameArgs{
//				ZoneId:   pulumi.String("0da42c8d2132a9ddaf714f9e7c920711"),
//				Hostname: pulumi.String("hostname.example.com"),
//				Ssls: cloudflare.CustomHostnameSslArray{
//					&cloudflare.CustomHostnameSslArgs{
//						Method: pulumi.String("txt"),
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
// ```sh
// $ pulumi import cloudflare:index/customHostname:CustomHostname example 1d5fdc9e88c8a8c4518b068cd94331fe/0d89c70d-ad9f-4843-b99f-6cc0252067e9
// ```
type CustomHostname struct {
	pulumi.CustomResourceState

	// Custom metadata associated with custom hostname. Only supports primitive string values, all other values are accessible via the API directly.
	CustomMetadata pulumi.StringMapOutput `pulumi:"customMetadata"`
	// The custom origin server used for certificates.
	CustomOriginServer pulumi.StringPtrOutput `pulumi:"customOriginServer"`
	// The [custom origin SNI](https://developers.cloudflare.com/ssl/ssl-for-saas/hostname-specific-behavior/custom-origin) used for certificates.
	CustomOriginSni pulumi.StringPtrOutput `pulumi:"customOriginSni"`
	// Hostname you intend to request a certificate for. **Modifying this attribute will force creation of a new resource.**
	Hostname                  pulumi.StringOutput    `pulumi:"hostname"`
	OwnershipVerification     pulumi.StringMapOutput `pulumi:"ownershipVerification"`
	OwnershipVerificationHttp pulumi.StringMapOutput `pulumi:"ownershipVerificationHttp"`
	// SSL properties used when creating the custom hostname.
	Ssls CustomHostnameSslArrayOutput `pulumi:"ssls"`
	// Status of the certificate.
	Status pulumi.StringOutput `pulumi:"status"`
	// Whether to wait for a custom hostname SSL sub-object to reach status `pendingValidation` during creation. Defaults to `false`.
	WaitForSslPendingValidation pulumi.BoolPtrOutput `pulumi:"waitForSslPendingValidation"`
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewCustomHostname registers a new resource with the given unique name, arguments, and options.
func NewCustomHostname(ctx *pulumi.Context,
	name string, args *CustomHostnameArgs, opts ...pulumi.ResourceOption) (*CustomHostname, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Hostname == nil {
		return nil, errors.New("invalid value for required argument 'Hostname'")
	}
	if args.ZoneId == nil {
		return nil, errors.New("invalid value for required argument 'ZoneId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource CustomHostname
	err := ctx.RegisterResource("cloudflare:index/customHostname:CustomHostname", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCustomHostname gets an existing CustomHostname resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCustomHostname(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CustomHostnameState, opts ...pulumi.ResourceOption) (*CustomHostname, error) {
	var resource CustomHostname
	err := ctx.ReadResource("cloudflare:index/customHostname:CustomHostname", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CustomHostname resources.
type customHostnameState struct {
	// Custom metadata associated with custom hostname. Only supports primitive string values, all other values are accessible via the API directly.
	CustomMetadata map[string]string `pulumi:"customMetadata"`
	// The custom origin server used for certificates.
	CustomOriginServer *string `pulumi:"customOriginServer"`
	// The [custom origin SNI](https://developers.cloudflare.com/ssl/ssl-for-saas/hostname-specific-behavior/custom-origin) used for certificates.
	CustomOriginSni *string `pulumi:"customOriginSni"`
	// Hostname you intend to request a certificate for. **Modifying this attribute will force creation of a new resource.**
	Hostname                  *string           `pulumi:"hostname"`
	OwnershipVerification     map[string]string `pulumi:"ownershipVerification"`
	OwnershipVerificationHttp map[string]string `pulumi:"ownershipVerificationHttp"`
	// SSL properties used when creating the custom hostname.
	Ssls []CustomHostnameSsl `pulumi:"ssls"`
	// Status of the certificate.
	Status *string `pulumi:"status"`
	// Whether to wait for a custom hostname SSL sub-object to reach status `pendingValidation` during creation. Defaults to `false`.
	WaitForSslPendingValidation *bool `pulumi:"waitForSslPendingValidation"`
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId *string `pulumi:"zoneId"`
}

type CustomHostnameState struct {
	// Custom metadata associated with custom hostname. Only supports primitive string values, all other values are accessible via the API directly.
	CustomMetadata pulumi.StringMapInput
	// The custom origin server used for certificates.
	CustomOriginServer pulumi.StringPtrInput
	// The [custom origin SNI](https://developers.cloudflare.com/ssl/ssl-for-saas/hostname-specific-behavior/custom-origin) used for certificates.
	CustomOriginSni pulumi.StringPtrInput
	// Hostname you intend to request a certificate for. **Modifying this attribute will force creation of a new resource.**
	Hostname                  pulumi.StringPtrInput
	OwnershipVerification     pulumi.StringMapInput
	OwnershipVerificationHttp pulumi.StringMapInput
	// SSL properties used when creating the custom hostname.
	Ssls CustomHostnameSslArrayInput
	// Status of the certificate.
	Status pulumi.StringPtrInput
	// Whether to wait for a custom hostname SSL sub-object to reach status `pendingValidation` during creation. Defaults to `false`.
	WaitForSslPendingValidation pulumi.BoolPtrInput
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringPtrInput
}

func (CustomHostnameState) ElementType() reflect.Type {
	return reflect.TypeOf((*customHostnameState)(nil)).Elem()
}

type customHostnameArgs struct {
	// Custom metadata associated with custom hostname. Only supports primitive string values, all other values are accessible via the API directly.
	CustomMetadata map[string]string `pulumi:"customMetadata"`
	// The custom origin server used for certificates.
	CustomOriginServer *string `pulumi:"customOriginServer"`
	// The [custom origin SNI](https://developers.cloudflare.com/ssl/ssl-for-saas/hostname-specific-behavior/custom-origin) used for certificates.
	CustomOriginSni *string `pulumi:"customOriginSni"`
	// Hostname you intend to request a certificate for. **Modifying this attribute will force creation of a new resource.**
	Hostname string `pulumi:"hostname"`
	// SSL properties used when creating the custom hostname.
	Ssls []CustomHostnameSsl `pulumi:"ssls"`
	// Whether to wait for a custom hostname SSL sub-object to reach status `pendingValidation` during creation. Defaults to `false`.
	WaitForSslPendingValidation *bool `pulumi:"waitForSslPendingValidation"`
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId string `pulumi:"zoneId"`
}

// The set of arguments for constructing a CustomHostname resource.
type CustomHostnameArgs struct {
	// Custom metadata associated with custom hostname. Only supports primitive string values, all other values are accessible via the API directly.
	CustomMetadata pulumi.StringMapInput
	// The custom origin server used for certificates.
	CustomOriginServer pulumi.StringPtrInput
	// The [custom origin SNI](https://developers.cloudflare.com/ssl/ssl-for-saas/hostname-specific-behavior/custom-origin) used for certificates.
	CustomOriginSni pulumi.StringPtrInput
	// Hostname you intend to request a certificate for. **Modifying this attribute will force creation of a new resource.**
	Hostname pulumi.StringInput
	// SSL properties used when creating the custom hostname.
	Ssls CustomHostnameSslArrayInput
	// Whether to wait for a custom hostname SSL sub-object to reach status `pendingValidation` during creation. Defaults to `false`.
	WaitForSslPendingValidation pulumi.BoolPtrInput
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringInput
}

func (CustomHostnameArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*customHostnameArgs)(nil)).Elem()
}

type CustomHostnameInput interface {
	pulumi.Input

	ToCustomHostnameOutput() CustomHostnameOutput
	ToCustomHostnameOutputWithContext(ctx context.Context) CustomHostnameOutput
}

func (*CustomHostname) ElementType() reflect.Type {
	return reflect.TypeOf((**CustomHostname)(nil)).Elem()
}

func (i *CustomHostname) ToCustomHostnameOutput() CustomHostnameOutput {
	return i.ToCustomHostnameOutputWithContext(context.Background())
}

func (i *CustomHostname) ToCustomHostnameOutputWithContext(ctx context.Context) CustomHostnameOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomHostnameOutput)
}

// CustomHostnameArrayInput is an input type that accepts CustomHostnameArray and CustomHostnameArrayOutput values.
// You can construct a concrete instance of `CustomHostnameArrayInput` via:
//
//	CustomHostnameArray{ CustomHostnameArgs{...} }
type CustomHostnameArrayInput interface {
	pulumi.Input

	ToCustomHostnameArrayOutput() CustomHostnameArrayOutput
	ToCustomHostnameArrayOutputWithContext(context.Context) CustomHostnameArrayOutput
}

type CustomHostnameArray []CustomHostnameInput

func (CustomHostnameArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CustomHostname)(nil)).Elem()
}

func (i CustomHostnameArray) ToCustomHostnameArrayOutput() CustomHostnameArrayOutput {
	return i.ToCustomHostnameArrayOutputWithContext(context.Background())
}

func (i CustomHostnameArray) ToCustomHostnameArrayOutputWithContext(ctx context.Context) CustomHostnameArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomHostnameArrayOutput)
}

// CustomHostnameMapInput is an input type that accepts CustomHostnameMap and CustomHostnameMapOutput values.
// You can construct a concrete instance of `CustomHostnameMapInput` via:
//
//	CustomHostnameMap{ "key": CustomHostnameArgs{...} }
type CustomHostnameMapInput interface {
	pulumi.Input

	ToCustomHostnameMapOutput() CustomHostnameMapOutput
	ToCustomHostnameMapOutputWithContext(context.Context) CustomHostnameMapOutput
}

type CustomHostnameMap map[string]CustomHostnameInput

func (CustomHostnameMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CustomHostname)(nil)).Elem()
}

func (i CustomHostnameMap) ToCustomHostnameMapOutput() CustomHostnameMapOutput {
	return i.ToCustomHostnameMapOutputWithContext(context.Background())
}

func (i CustomHostnameMap) ToCustomHostnameMapOutputWithContext(ctx context.Context) CustomHostnameMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomHostnameMapOutput)
}

type CustomHostnameOutput struct{ *pulumi.OutputState }

func (CustomHostnameOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CustomHostname)(nil)).Elem()
}

func (o CustomHostnameOutput) ToCustomHostnameOutput() CustomHostnameOutput {
	return o
}

func (o CustomHostnameOutput) ToCustomHostnameOutputWithContext(ctx context.Context) CustomHostnameOutput {
	return o
}

// Custom metadata associated with custom hostname. Only supports primitive string values, all other values are accessible via the API directly.
func (o CustomHostnameOutput) CustomMetadata() pulumi.StringMapOutput {
	return o.ApplyT(func(v *CustomHostname) pulumi.StringMapOutput { return v.CustomMetadata }).(pulumi.StringMapOutput)
}

// The custom origin server used for certificates.
func (o CustomHostnameOutput) CustomOriginServer() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CustomHostname) pulumi.StringPtrOutput { return v.CustomOriginServer }).(pulumi.StringPtrOutput)
}

// The [custom origin SNI](https://developers.cloudflare.com/ssl/ssl-for-saas/hostname-specific-behavior/custom-origin) used for certificates.
func (o CustomHostnameOutput) CustomOriginSni() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CustomHostname) pulumi.StringPtrOutput { return v.CustomOriginSni }).(pulumi.StringPtrOutput)
}

// Hostname you intend to request a certificate for. **Modifying this attribute will force creation of a new resource.**
func (o CustomHostnameOutput) Hostname() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomHostname) pulumi.StringOutput { return v.Hostname }).(pulumi.StringOutput)
}

func (o CustomHostnameOutput) OwnershipVerification() pulumi.StringMapOutput {
	return o.ApplyT(func(v *CustomHostname) pulumi.StringMapOutput { return v.OwnershipVerification }).(pulumi.StringMapOutput)
}

func (o CustomHostnameOutput) OwnershipVerificationHttp() pulumi.StringMapOutput {
	return o.ApplyT(func(v *CustomHostname) pulumi.StringMapOutput { return v.OwnershipVerificationHttp }).(pulumi.StringMapOutput)
}

// SSL properties used when creating the custom hostname.
func (o CustomHostnameOutput) Ssls() CustomHostnameSslArrayOutput {
	return o.ApplyT(func(v *CustomHostname) CustomHostnameSslArrayOutput { return v.Ssls }).(CustomHostnameSslArrayOutput)
}

// Status of the certificate.
func (o CustomHostnameOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomHostname) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// Whether to wait for a custom hostname SSL sub-object to reach status `pendingValidation` during creation. Defaults to `false`.
func (o CustomHostnameOutput) WaitForSslPendingValidation() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *CustomHostname) pulumi.BoolPtrOutput { return v.WaitForSslPendingValidation }).(pulumi.BoolPtrOutput)
}

// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
func (o CustomHostnameOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomHostname) pulumi.StringOutput { return v.ZoneId }).(pulumi.StringOutput)
}

type CustomHostnameArrayOutput struct{ *pulumi.OutputState }

func (CustomHostnameArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CustomHostname)(nil)).Elem()
}

func (o CustomHostnameArrayOutput) ToCustomHostnameArrayOutput() CustomHostnameArrayOutput {
	return o
}

func (o CustomHostnameArrayOutput) ToCustomHostnameArrayOutputWithContext(ctx context.Context) CustomHostnameArrayOutput {
	return o
}

func (o CustomHostnameArrayOutput) Index(i pulumi.IntInput) CustomHostnameOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CustomHostname {
		return vs[0].([]*CustomHostname)[vs[1].(int)]
	}).(CustomHostnameOutput)
}

type CustomHostnameMapOutput struct{ *pulumi.OutputState }

func (CustomHostnameMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CustomHostname)(nil)).Elem()
}

func (o CustomHostnameMapOutput) ToCustomHostnameMapOutput() CustomHostnameMapOutput {
	return o
}

func (o CustomHostnameMapOutput) ToCustomHostnameMapOutputWithContext(ctx context.Context) CustomHostnameMapOutput {
	return o
}

func (o CustomHostnameMapOutput) MapIndex(k pulumi.StringInput) CustomHostnameOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CustomHostname {
		return vs[0].(map[string]*CustomHostname)[vs[1].(string)]
	}).(CustomHostnameOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CustomHostnameInput)(nil)).Elem(), &CustomHostname{})
	pulumi.RegisterInputType(reflect.TypeOf((*CustomHostnameArrayInput)(nil)).Elem(), CustomHostnameArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CustomHostnameMapInput)(nil)).Elem(), CustomHostnameMap{})
	pulumi.RegisterOutputType(CustomHostnameOutput{})
	pulumi.RegisterOutputType(CustomHostnameArrayOutput{})
	pulumi.RegisterOutputType(CustomHostnameMapOutput{})
}
