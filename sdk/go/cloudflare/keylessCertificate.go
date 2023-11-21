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

// Provides a resource, that manages Keyless certificates.
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
//			_, err := cloudflare.NewKeylessCertificate(ctx, "example", &cloudflare.KeylessCertificateArgs{
//				BundleMethod: pulumi.String("ubiquitous"),
//				Certificate:  pulumi.String("-----INSERT CERTIFICATE-----"),
//				Enabled:      pulumi.Bool(true),
//				Host:         pulumi.String("example.com"),
//				Name:         pulumi.String("example.com Keyless SSL"),
//				Port:         pulumi.Int(24008),
//				ZoneId:       pulumi.String("0da42c8d2132a9ddaf714f9e7c920711"),
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
//	$ pulumi import cloudflare:index/keylessCertificate:KeylessCertificate example <zone_id>/<keyless_certificate_id>
//
// ```
type KeylessCertificate struct {
	pulumi.CustomResourceState

	// A ubiquitous bundle has the highest probability of being verified everywhere, even by clients using outdated or unusual trust stores. An optimal bundle uses the shortest chain and newest intermediates. And the force bundle verifies the chain, but does not otherwise modify it. Available values: `ubiquitous`, `optimal`, `force`. Defaults to `ubiquitous`. **Modifying this attribute will force creation of a new resource.**
	BundleMethod pulumi.StringPtrOutput `pulumi:"bundleMethod"`
	// The zone's SSL certificate or SSL certificate and intermediate(s). **Modifying this attribute will force creation of a new resource.**
	Certificate pulumi.StringOutput `pulumi:"certificate"`
	// Whether the KeyLess SSL is on.
	Enabled pulumi.BoolPtrOutput `pulumi:"enabled"`
	// The KeyLess SSL host.
	Host pulumi.StringOutput `pulumi:"host"`
	// The KeyLess SSL name.
	Name pulumi.StringPtrOutput `pulumi:"name"`
	// The KeyLess SSL port used to communicate between Cloudflare and the client's KeyLess SSL server. Defaults to `24008`.
	Port pulumi.IntPtrOutput `pulumi:"port"`
	// Status of the KeyLess SSL.
	Status pulumi.StringOutput `pulumi:"status"`
	// The zone identifier to target for the resource.
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewKeylessCertificate registers a new resource with the given unique name, arguments, and options.
func NewKeylessCertificate(ctx *pulumi.Context,
	name string, args *KeylessCertificateArgs, opts ...pulumi.ResourceOption) (*KeylessCertificate, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Certificate == nil {
		return nil, errors.New("invalid value for required argument 'Certificate'")
	}
	if args.Host == nil {
		return nil, errors.New("invalid value for required argument 'Host'")
	}
	if args.ZoneId == nil {
		return nil, errors.New("invalid value for required argument 'ZoneId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource KeylessCertificate
	err := ctx.RegisterResource("cloudflare:index/keylessCertificate:KeylessCertificate", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetKeylessCertificate gets an existing KeylessCertificate resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetKeylessCertificate(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *KeylessCertificateState, opts ...pulumi.ResourceOption) (*KeylessCertificate, error) {
	var resource KeylessCertificate
	err := ctx.ReadResource("cloudflare:index/keylessCertificate:KeylessCertificate", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering KeylessCertificate resources.
type keylessCertificateState struct {
	// A ubiquitous bundle has the highest probability of being verified everywhere, even by clients using outdated or unusual trust stores. An optimal bundle uses the shortest chain and newest intermediates. And the force bundle verifies the chain, but does not otherwise modify it. Available values: `ubiquitous`, `optimal`, `force`. Defaults to `ubiquitous`. **Modifying this attribute will force creation of a new resource.**
	BundleMethod *string `pulumi:"bundleMethod"`
	// The zone's SSL certificate or SSL certificate and intermediate(s). **Modifying this attribute will force creation of a new resource.**
	Certificate *string `pulumi:"certificate"`
	// Whether the KeyLess SSL is on.
	Enabled *bool `pulumi:"enabled"`
	// The KeyLess SSL host.
	Host *string `pulumi:"host"`
	// The KeyLess SSL name.
	Name *string `pulumi:"name"`
	// The KeyLess SSL port used to communicate between Cloudflare and the client's KeyLess SSL server. Defaults to `24008`.
	Port *int `pulumi:"port"`
	// Status of the KeyLess SSL.
	Status *string `pulumi:"status"`
	// The zone identifier to target for the resource.
	ZoneId *string `pulumi:"zoneId"`
}

type KeylessCertificateState struct {
	// A ubiquitous bundle has the highest probability of being verified everywhere, even by clients using outdated or unusual trust stores. An optimal bundle uses the shortest chain and newest intermediates. And the force bundle verifies the chain, but does not otherwise modify it. Available values: `ubiquitous`, `optimal`, `force`. Defaults to `ubiquitous`. **Modifying this attribute will force creation of a new resource.**
	BundleMethod pulumi.StringPtrInput
	// The zone's SSL certificate or SSL certificate and intermediate(s). **Modifying this attribute will force creation of a new resource.**
	Certificate pulumi.StringPtrInput
	// Whether the KeyLess SSL is on.
	Enabled pulumi.BoolPtrInput
	// The KeyLess SSL host.
	Host pulumi.StringPtrInput
	// The KeyLess SSL name.
	Name pulumi.StringPtrInput
	// The KeyLess SSL port used to communicate between Cloudflare and the client's KeyLess SSL server. Defaults to `24008`.
	Port pulumi.IntPtrInput
	// Status of the KeyLess SSL.
	Status pulumi.StringPtrInput
	// The zone identifier to target for the resource.
	ZoneId pulumi.StringPtrInput
}

func (KeylessCertificateState) ElementType() reflect.Type {
	return reflect.TypeOf((*keylessCertificateState)(nil)).Elem()
}

type keylessCertificateArgs struct {
	// A ubiquitous bundle has the highest probability of being verified everywhere, even by clients using outdated or unusual trust stores. An optimal bundle uses the shortest chain and newest intermediates. And the force bundle verifies the chain, but does not otherwise modify it. Available values: `ubiquitous`, `optimal`, `force`. Defaults to `ubiquitous`. **Modifying this attribute will force creation of a new resource.**
	BundleMethod *string `pulumi:"bundleMethod"`
	// The zone's SSL certificate or SSL certificate and intermediate(s). **Modifying this attribute will force creation of a new resource.**
	Certificate string `pulumi:"certificate"`
	// Whether the KeyLess SSL is on.
	Enabled *bool `pulumi:"enabled"`
	// The KeyLess SSL host.
	Host string `pulumi:"host"`
	// The KeyLess SSL name.
	Name *string `pulumi:"name"`
	// The KeyLess SSL port used to communicate between Cloudflare and the client's KeyLess SSL server. Defaults to `24008`.
	Port *int `pulumi:"port"`
	// The zone identifier to target for the resource.
	ZoneId string `pulumi:"zoneId"`
}

// The set of arguments for constructing a KeylessCertificate resource.
type KeylessCertificateArgs struct {
	// A ubiquitous bundle has the highest probability of being verified everywhere, even by clients using outdated or unusual trust stores. An optimal bundle uses the shortest chain and newest intermediates. And the force bundle verifies the chain, but does not otherwise modify it. Available values: `ubiquitous`, `optimal`, `force`. Defaults to `ubiquitous`. **Modifying this attribute will force creation of a new resource.**
	BundleMethod pulumi.StringPtrInput
	// The zone's SSL certificate or SSL certificate and intermediate(s). **Modifying this attribute will force creation of a new resource.**
	Certificate pulumi.StringInput
	// Whether the KeyLess SSL is on.
	Enabled pulumi.BoolPtrInput
	// The KeyLess SSL host.
	Host pulumi.StringInput
	// The KeyLess SSL name.
	Name pulumi.StringPtrInput
	// The KeyLess SSL port used to communicate between Cloudflare and the client's KeyLess SSL server. Defaults to `24008`.
	Port pulumi.IntPtrInput
	// The zone identifier to target for the resource.
	ZoneId pulumi.StringInput
}

func (KeylessCertificateArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*keylessCertificateArgs)(nil)).Elem()
}

type KeylessCertificateInput interface {
	pulumi.Input

	ToKeylessCertificateOutput() KeylessCertificateOutput
	ToKeylessCertificateOutputWithContext(ctx context.Context) KeylessCertificateOutput
}

func (*KeylessCertificate) ElementType() reflect.Type {
	return reflect.TypeOf((**KeylessCertificate)(nil)).Elem()
}

func (i *KeylessCertificate) ToKeylessCertificateOutput() KeylessCertificateOutput {
	return i.ToKeylessCertificateOutputWithContext(context.Background())
}

func (i *KeylessCertificate) ToKeylessCertificateOutputWithContext(ctx context.Context) KeylessCertificateOutput {
	return pulumi.ToOutputWithContext(ctx, i).(KeylessCertificateOutput)
}

// KeylessCertificateArrayInput is an input type that accepts KeylessCertificateArray and KeylessCertificateArrayOutput values.
// You can construct a concrete instance of `KeylessCertificateArrayInput` via:
//
//	KeylessCertificateArray{ KeylessCertificateArgs{...} }
type KeylessCertificateArrayInput interface {
	pulumi.Input

	ToKeylessCertificateArrayOutput() KeylessCertificateArrayOutput
	ToKeylessCertificateArrayOutputWithContext(context.Context) KeylessCertificateArrayOutput
}

type KeylessCertificateArray []KeylessCertificateInput

func (KeylessCertificateArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*KeylessCertificate)(nil)).Elem()
}

func (i KeylessCertificateArray) ToKeylessCertificateArrayOutput() KeylessCertificateArrayOutput {
	return i.ToKeylessCertificateArrayOutputWithContext(context.Background())
}

func (i KeylessCertificateArray) ToKeylessCertificateArrayOutputWithContext(ctx context.Context) KeylessCertificateArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(KeylessCertificateArrayOutput)
}

// KeylessCertificateMapInput is an input type that accepts KeylessCertificateMap and KeylessCertificateMapOutput values.
// You can construct a concrete instance of `KeylessCertificateMapInput` via:
//
//	KeylessCertificateMap{ "key": KeylessCertificateArgs{...} }
type KeylessCertificateMapInput interface {
	pulumi.Input

	ToKeylessCertificateMapOutput() KeylessCertificateMapOutput
	ToKeylessCertificateMapOutputWithContext(context.Context) KeylessCertificateMapOutput
}

type KeylessCertificateMap map[string]KeylessCertificateInput

func (KeylessCertificateMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*KeylessCertificate)(nil)).Elem()
}

func (i KeylessCertificateMap) ToKeylessCertificateMapOutput() KeylessCertificateMapOutput {
	return i.ToKeylessCertificateMapOutputWithContext(context.Background())
}

func (i KeylessCertificateMap) ToKeylessCertificateMapOutputWithContext(ctx context.Context) KeylessCertificateMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(KeylessCertificateMapOutput)
}

type KeylessCertificateOutput struct{ *pulumi.OutputState }

func (KeylessCertificateOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**KeylessCertificate)(nil)).Elem()
}

func (o KeylessCertificateOutput) ToKeylessCertificateOutput() KeylessCertificateOutput {
	return o
}

func (o KeylessCertificateOutput) ToKeylessCertificateOutputWithContext(ctx context.Context) KeylessCertificateOutput {
	return o
}

// A ubiquitous bundle has the highest probability of being verified everywhere, even by clients using outdated or unusual trust stores. An optimal bundle uses the shortest chain and newest intermediates. And the force bundle verifies the chain, but does not otherwise modify it. Available values: `ubiquitous`, `optimal`, `force`. Defaults to `ubiquitous`. **Modifying this attribute will force creation of a new resource.**
func (o KeylessCertificateOutput) BundleMethod() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *KeylessCertificate) pulumi.StringPtrOutput { return v.BundleMethod }).(pulumi.StringPtrOutput)
}

// The zone's SSL certificate or SSL certificate and intermediate(s). **Modifying this attribute will force creation of a new resource.**
func (o KeylessCertificateOutput) Certificate() pulumi.StringOutput {
	return o.ApplyT(func(v *KeylessCertificate) pulumi.StringOutput { return v.Certificate }).(pulumi.StringOutput)
}

// Whether the KeyLess SSL is on.
func (o KeylessCertificateOutput) Enabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *KeylessCertificate) pulumi.BoolPtrOutput { return v.Enabled }).(pulumi.BoolPtrOutput)
}

// The KeyLess SSL host.
func (o KeylessCertificateOutput) Host() pulumi.StringOutput {
	return o.ApplyT(func(v *KeylessCertificate) pulumi.StringOutput { return v.Host }).(pulumi.StringOutput)
}

// The KeyLess SSL name.
func (o KeylessCertificateOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *KeylessCertificate) pulumi.StringPtrOutput { return v.Name }).(pulumi.StringPtrOutput)
}

// The KeyLess SSL port used to communicate between Cloudflare and the client's KeyLess SSL server. Defaults to `24008`.
func (o KeylessCertificateOutput) Port() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *KeylessCertificate) pulumi.IntPtrOutput { return v.Port }).(pulumi.IntPtrOutput)
}

// Status of the KeyLess SSL.
func (o KeylessCertificateOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *KeylessCertificate) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// The zone identifier to target for the resource.
func (o KeylessCertificateOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v *KeylessCertificate) pulumi.StringOutput { return v.ZoneId }).(pulumi.StringOutput)
}

type KeylessCertificateArrayOutput struct{ *pulumi.OutputState }

func (KeylessCertificateArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*KeylessCertificate)(nil)).Elem()
}

func (o KeylessCertificateArrayOutput) ToKeylessCertificateArrayOutput() KeylessCertificateArrayOutput {
	return o
}

func (o KeylessCertificateArrayOutput) ToKeylessCertificateArrayOutputWithContext(ctx context.Context) KeylessCertificateArrayOutput {
	return o
}

func (o KeylessCertificateArrayOutput) Index(i pulumi.IntInput) KeylessCertificateOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *KeylessCertificate {
		return vs[0].([]*KeylessCertificate)[vs[1].(int)]
	}).(KeylessCertificateOutput)
}

type KeylessCertificateMapOutput struct{ *pulumi.OutputState }

func (KeylessCertificateMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*KeylessCertificate)(nil)).Elem()
}

func (o KeylessCertificateMapOutput) ToKeylessCertificateMapOutput() KeylessCertificateMapOutput {
	return o
}

func (o KeylessCertificateMapOutput) ToKeylessCertificateMapOutputWithContext(ctx context.Context) KeylessCertificateMapOutput {
	return o
}

func (o KeylessCertificateMapOutput) MapIndex(k pulumi.StringInput) KeylessCertificateOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *KeylessCertificate {
		return vs[0].(map[string]*KeylessCertificate)[vs[1].(string)]
	}).(KeylessCertificateOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*KeylessCertificateInput)(nil)).Elem(), &KeylessCertificate{})
	pulumi.RegisterInputType(reflect.TypeOf((*KeylessCertificateArrayInput)(nil)).Elem(), KeylessCertificateArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*KeylessCertificateMapInput)(nil)).Elem(), KeylessCertificateMap{})
	pulumi.RegisterOutputType(KeylessCertificateOutput{})
	pulumi.RegisterOutputType(KeylessCertificateArrayOutput{})
	pulumi.RegisterOutputType(KeylessCertificateMapOutput{})
}