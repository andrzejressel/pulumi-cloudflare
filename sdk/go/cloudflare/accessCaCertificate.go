// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Cloudflare Access can replace traditional SSH key models with short-lived
// certificates issued to your users based on the token generated by their Access
// login.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-cloudflare/sdk/v4/go/cloudflare"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := cloudflare.NewAccessCaCertificate(ctx, "example", &cloudflare.AccessCaCertificateArgs{
// 			AccountId:     pulumi.String("1d5fdc9e88c8a8c4518b068cd94331fe"),
// 			ApplicationId: pulumi.String("6cd6cea3-3ef2-4542-9aea-85a0bbcd5414"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = cloudflare.NewAccessCaCertificate(ctx, "anotherExample", &cloudflare.AccessCaCertificateArgs{
// 			ApplicationId: pulumi.String("fe2be0ff-7f13-4350-8c8e-a9b9795fe3c2"),
// 			ZoneId:        pulumi.String("b6bc7eb6027c792a6bca3dc91fd2d7e0"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// Access CA certificates can be imported using a composite ID formed of identifer ("account" or "zone"), identifier ID and the CA certificate ID.
//
// ```sh
//  $ pulumi import cloudflare:index/accessCaCertificate:AccessCaCertificate example account/1d5fdc9e88c8a8c4518b068cd94331fe/edc1e4e24567217764b4322669c44df985dddffdf03ac781
// ```
type AccessCaCertificate struct {
	pulumi.CustomResourceState

	// The account to which the Access CA certificate should be added. Conflicts with `zoneId`.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// The Access Application ID to associate with the CA certificate.
	ApplicationId pulumi.StringOutput `pulumi:"applicationId"`
	// Application Audience (AUD) Tag of the CA certificate
	Aud pulumi.StringOutput `pulumi:"aud"`
	// Cryptographic public key of the generated CA certificate
	PublicKey pulumi.StringOutput `pulumi:"publicKey"`
	// The DNS zone to which the Access CA certificate should be added. Conflicts with `accountId`.
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewAccessCaCertificate registers a new resource with the given unique name, arguments, and options.
func NewAccessCaCertificate(ctx *pulumi.Context,
	name string, args *AccessCaCertificateArgs, opts ...pulumi.ResourceOption) (*AccessCaCertificate, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ApplicationId == nil {
		return nil, errors.New("invalid value for required argument 'ApplicationId'")
	}
	var resource AccessCaCertificate
	err := ctx.RegisterResource("cloudflare:index/accessCaCertificate:AccessCaCertificate", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAccessCaCertificate gets an existing AccessCaCertificate resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAccessCaCertificate(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AccessCaCertificateState, opts ...pulumi.ResourceOption) (*AccessCaCertificate, error) {
	var resource AccessCaCertificate
	err := ctx.ReadResource("cloudflare:index/accessCaCertificate:AccessCaCertificate", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AccessCaCertificate resources.
type accessCaCertificateState struct {
	// The account to which the Access CA certificate should be added. Conflicts with `zoneId`.
	AccountId *string `pulumi:"accountId"`
	// The Access Application ID to associate with the CA certificate.
	ApplicationId *string `pulumi:"applicationId"`
	// Application Audience (AUD) Tag of the CA certificate
	Aud *string `pulumi:"aud"`
	// Cryptographic public key of the generated CA certificate
	PublicKey *string `pulumi:"publicKey"`
	// The DNS zone to which the Access CA certificate should be added. Conflicts with `accountId`.
	ZoneId *string `pulumi:"zoneId"`
}

type AccessCaCertificateState struct {
	// The account to which the Access CA certificate should be added. Conflicts with `zoneId`.
	AccountId pulumi.StringPtrInput
	// The Access Application ID to associate with the CA certificate.
	ApplicationId pulumi.StringPtrInput
	// Application Audience (AUD) Tag of the CA certificate
	Aud pulumi.StringPtrInput
	// Cryptographic public key of the generated CA certificate
	PublicKey pulumi.StringPtrInput
	// The DNS zone to which the Access CA certificate should be added. Conflicts with `accountId`.
	ZoneId pulumi.StringPtrInput
}

func (AccessCaCertificateState) ElementType() reflect.Type {
	return reflect.TypeOf((*accessCaCertificateState)(nil)).Elem()
}

type accessCaCertificateArgs struct {
	// The account to which the Access CA certificate should be added. Conflicts with `zoneId`.
	AccountId *string `pulumi:"accountId"`
	// The Access Application ID to associate with the CA certificate.
	ApplicationId string `pulumi:"applicationId"`
	// The DNS zone to which the Access CA certificate should be added. Conflicts with `accountId`.
	ZoneId *string `pulumi:"zoneId"`
}

// The set of arguments for constructing a AccessCaCertificate resource.
type AccessCaCertificateArgs struct {
	// The account to which the Access CA certificate should be added. Conflicts with `zoneId`.
	AccountId pulumi.StringPtrInput
	// The Access Application ID to associate with the CA certificate.
	ApplicationId pulumi.StringInput
	// The DNS zone to which the Access CA certificate should be added. Conflicts with `accountId`.
	ZoneId pulumi.StringPtrInput
}

func (AccessCaCertificateArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*accessCaCertificateArgs)(nil)).Elem()
}

type AccessCaCertificateInput interface {
	pulumi.Input

	ToAccessCaCertificateOutput() AccessCaCertificateOutput
	ToAccessCaCertificateOutputWithContext(ctx context.Context) AccessCaCertificateOutput
}

func (*AccessCaCertificate) ElementType() reflect.Type {
	return reflect.TypeOf((*AccessCaCertificate)(nil))
}

func (i *AccessCaCertificate) ToAccessCaCertificateOutput() AccessCaCertificateOutput {
	return i.ToAccessCaCertificateOutputWithContext(context.Background())
}

func (i *AccessCaCertificate) ToAccessCaCertificateOutputWithContext(ctx context.Context) AccessCaCertificateOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessCaCertificateOutput)
}

func (i *AccessCaCertificate) ToAccessCaCertificatePtrOutput() AccessCaCertificatePtrOutput {
	return i.ToAccessCaCertificatePtrOutputWithContext(context.Background())
}

func (i *AccessCaCertificate) ToAccessCaCertificatePtrOutputWithContext(ctx context.Context) AccessCaCertificatePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessCaCertificatePtrOutput)
}

type AccessCaCertificatePtrInput interface {
	pulumi.Input

	ToAccessCaCertificatePtrOutput() AccessCaCertificatePtrOutput
	ToAccessCaCertificatePtrOutputWithContext(ctx context.Context) AccessCaCertificatePtrOutput
}

type accessCaCertificatePtrType AccessCaCertificateArgs

func (*accessCaCertificatePtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**AccessCaCertificate)(nil))
}

func (i *accessCaCertificatePtrType) ToAccessCaCertificatePtrOutput() AccessCaCertificatePtrOutput {
	return i.ToAccessCaCertificatePtrOutputWithContext(context.Background())
}

func (i *accessCaCertificatePtrType) ToAccessCaCertificatePtrOutputWithContext(ctx context.Context) AccessCaCertificatePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessCaCertificatePtrOutput)
}

// AccessCaCertificateArrayInput is an input type that accepts AccessCaCertificateArray and AccessCaCertificateArrayOutput values.
// You can construct a concrete instance of `AccessCaCertificateArrayInput` via:
//
//          AccessCaCertificateArray{ AccessCaCertificateArgs{...} }
type AccessCaCertificateArrayInput interface {
	pulumi.Input

	ToAccessCaCertificateArrayOutput() AccessCaCertificateArrayOutput
	ToAccessCaCertificateArrayOutputWithContext(context.Context) AccessCaCertificateArrayOutput
}

type AccessCaCertificateArray []AccessCaCertificateInput

func (AccessCaCertificateArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*AccessCaCertificate)(nil))
}

func (i AccessCaCertificateArray) ToAccessCaCertificateArrayOutput() AccessCaCertificateArrayOutput {
	return i.ToAccessCaCertificateArrayOutputWithContext(context.Background())
}

func (i AccessCaCertificateArray) ToAccessCaCertificateArrayOutputWithContext(ctx context.Context) AccessCaCertificateArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessCaCertificateArrayOutput)
}

// AccessCaCertificateMapInput is an input type that accepts AccessCaCertificateMap and AccessCaCertificateMapOutput values.
// You can construct a concrete instance of `AccessCaCertificateMapInput` via:
//
//          AccessCaCertificateMap{ "key": AccessCaCertificateArgs{...} }
type AccessCaCertificateMapInput interface {
	pulumi.Input

	ToAccessCaCertificateMapOutput() AccessCaCertificateMapOutput
	ToAccessCaCertificateMapOutputWithContext(context.Context) AccessCaCertificateMapOutput
}

type AccessCaCertificateMap map[string]AccessCaCertificateInput

func (AccessCaCertificateMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*AccessCaCertificate)(nil))
}

func (i AccessCaCertificateMap) ToAccessCaCertificateMapOutput() AccessCaCertificateMapOutput {
	return i.ToAccessCaCertificateMapOutputWithContext(context.Background())
}

func (i AccessCaCertificateMap) ToAccessCaCertificateMapOutputWithContext(ctx context.Context) AccessCaCertificateMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessCaCertificateMapOutput)
}

type AccessCaCertificateOutput struct {
	*pulumi.OutputState
}

func (AccessCaCertificateOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*AccessCaCertificate)(nil))
}

func (o AccessCaCertificateOutput) ToAccessCaCertificateOutput() AccessCaCertificateOutput {
	return o
}

func (o AccessCaCertificateOutput) ToAccessCaCertificateOutputWithContext(ctx context.Context) AccessCaCertificateOutput {
	return o
}

func (o AccessCaCertificateOutput) ToAccessCaCertificatePtrOutput() AccessCaCertificatePtrOutput {
	return o.ToAccessCaCertificatePtrOutputWithContext(context.Background())
}

func (o AccessCaCertificateOutput) ToAccessCaCertificatePtrOutputWithContext(ctx context.Context) AccessCaCertificatePtrOutput {
	return o.ApplyT(func(v AccessCaCertificate) *AccessCaCertificate {
		return &v
	}).(AccessCaCertificatePtrOutput)
}

type AccessCaCertificatePtrOutput struct {
	*pulumi.OutputState
}

func (AccessCaCertificatePtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AccessCaCertificate)(nil))
}

func (o AccessCaCertificatePtrOutput) ToAccessCaCertificatePtrOutput() AccessCaCertificatePtrOutput {
	return o
}

func (o AccessCaCertificatePtrOutput) ToAccessCaCertificatePtrOutputWithContext(ctx context.Context) AccessCaCertificatePtrOutput {
	return o
}

type AccessCaCertificateArrayOutput struct{ *pulumi.OutputState }

func (AccessCaCertificateArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]AccessCaCertificate)(nil))
}

func (o AccessCaCertificateArrayOutput) ToAccessCaCertificateArrayOutput() AccessCaCertificateArrayOutput {
	return o
}

func (o AccessCaCertificateArrayOutput) ToAccessCaCertificateArrayOutputWithContext(ctx context.Context) AccessCaCertificateArrayOutput {
	return o
}

func (o AccessCaCertificateArrayOutput) Index(i pulumi.IntInput) AccessCaCertificateOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) AccessCaCertificate {
		return vs[0].([]AccessCaCertificate)[vs[1].(int)]
	}).(AccessCaCertificateOutput)
}

type AccessCaCertificateMapOutput struct{ *pulumi.OutputState }

func (AccessCaCertificateMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]AccessCaCertificate)(nil))
}

func (o AccessCaCertificateMapOutput) ToAccessCaCertificateMapOutput() AccessCaCertificateMapOutput {
	return o
}

func (o AccessCaCertificateMapOutput) ToAccessCaCertificateMapOutputWithContext(ctx context.Context) AccessCaCertificateMapOutput {
	return o
}

func (o AccessCaCertificateMapOutput) MapIndex(k pulumi.StringInput) AccessCaCertificateOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) AccessCaCertificate {
		return vs[0].(map[string]AccessCaCertificate)[vs[1].(string)]
	}).(AccessCaCertificateOutput)
}

func init() {
	pulumi.RegisterOutputType(AccessCaCertificateOutput{})
	pulumi.RegisterOutputType(AccessCaCertificatePtrOutput{})
	pulumi.RegisterOutputType(AccessCaCertificateArrayOutput{})
	pulumi.RegisterOutputType(AccessCaCertificateMapOutput{})
}
