// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a Cloudflare Zone DNSSEC resource.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-cloudflare/sdk/v2/go/cloudflare"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		exampleZone, err := cloudflare.NewZone(ctx, "exampleZone", &cloudflare.ZoneArgs{
// 			Zone: pulumi.String("example.com"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = cloudflare.NewZoneDnssec(ctx, "exampleZoneDnssec", &cloudflare.ZoneDnssecArgs{
// 			ZoneId: exampleZone.ID(),
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
// Zone DNSSEC resource can be imported using a zone ID, e.g.
//
// ```sh
//  $ pulumi import cloudflare:index/zoneDnssec:ZoneDnssec example d41d8cd98f00b204e9800998ecf8427e
// ```
//
//  where* `d41d8cd98f00b204e9800998ecf8427e` - zone ID, as returned from [API](https://api.cloudflare.com/#zone-list-zones)
type ZoneDnssec struct {
	pulumi.CustomResourceState

	// Zone DNSSEC algorithm.
	Algorithm pulumi.StringOutput `pulumi:"algorithm"`
	// Zone DNSSEC digest.
	Digest pulumi.StringOutput `pulumi:"digest"`
	// Digest algorithm use for Zone DNSSEC.
	DigestAlgorithm pulumi.StringOutput `pulumi:"digestAlgorithm"`
	// Digest Type for Zone DNSSEC.
	DigestType pulumi.StringOutput `pulumi:"digestType"`
	// DS for the Zone DNSSEC.
	Ds pulumi.StringOutput `pulumi:"ds"`
	// Zone DNSSEC flags.
	Flags pulumi.IntOutput `pulumi:"flags"`
	// Key Tag for the Zone DNSSEC.
	KeyTag pulumi.IntOutput `pulumi:"keyTag"`
	// Key type used for Zone DNSSEC.
	KeyType pulumi.StringOutput `pulumi:"keyType"`
	// Zone DNSSEC updated time.
	ModifiedOn pulumi.StringOutput `pulumi:"modifiedOn"`
	// Public Key for the Zone DNSSEC.
	PublicKey pulumi.StringOutput `pulumi:"publicKey"`
	// The status of the Zone DNSSEC.
	Status pulumi.StringOutput `pulumi:"status"`
	// The zone id for the zone.
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewZoneDnssec registers a new resource with the given unique name, arguments, and options.
func NewZoneDnssec(ctx *pulumi.Context,
	name string, args *ZoneDnssecArgs, opts ...pulumi.ResourceOption) (*ZoneDnssec, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ZoneId == nil {
		return nil, errors.New("invalid value for required argument 'ZoneId'")
	}
	var resource ZoneDnssec
	err := ctx.RegisterResource("cloudflare:index/zoneDnssec:ZoneDnssec", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetZoneDnssec gets an existing ZoneDnssec resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetZoneDnssec(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ZoneDnssecState, opts ...pulumi.ResourceOption) (*ZoneDnssec, error) {
	var resource ZoneDnssec
	err := ctx.ReadResource("cloudflare:index/zoneDnssec:ZoneDnssec", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ZoneDnssec resources.
type zoneDnssecState struct {
	// Zone DNSSEC algorithm.
	Algorithm *string `pulumi:"algorithm"`
	// Zone DNSSEC digest.
	Digest *string `pulumi:"digest"`
	// Digest algorithm use for Zone DNSSEC.
	DigestAlgorithm *string `pulumi:"digestAlgorithm"`
	// Digest Type for Zone DNSSEC.
	DigestType *string `pulumi:"digestType"`
	// DS for the Zone DNSSEC.
	Ds *string `pulumi:"ds"`
	// Zone DNSSEC flags.
	Flags *int `pulumi:"flags"`
	// Key Tag for the Zone DNSSEC.
	KeyTag *int `pulumi:"keyTag"`
	// Key type used for Zone DNSSEC.
	KeyType *string `pulumi:"keyType"`
	// Zone DNSSEC updated time.
	ModifiedOn *string `pulumi:"modifiedOn"`
	// Public Key for the Zone DNSSEC.
	PublicKey *string `pulumi:"publicKey"`
	// The status of the Zone DNSSEC.
	Status *string `pulumi:"status"`
	// The zone id for the zone.
	ZoneId *string `pulumi:"zoneId"`
}

type ZoneDnssecState struct {
	// Zone DNSSEC algorithm.
	Algorithm pulumi.StringPtrInput
	// Zone DNSSEC digest.
	Digest pulumi.StringPtrInput
	// Digest algorithm use for Zone DNSSEC.
	DigestAlgorithm pulumi.StringPtrInput
	// Digest Type for Zone DNSSEC.
	DigestType pulumi.StringPtrInput
	// DS for the Zone DNSSEC.
	Ds pulumi.StringPtrInput
	// Zone DNSSEC flags.
	Flags pulumi.IntPtrInput
	// Key Tag for the Zone DNSSEC.
	KeyTag pulumi.IntPtrInput
	// Key type used for Zone DNSSEC.
	KeyType pulumi.StringPtrInput
	// Zone DNSSEC updated time.
	ModifiedOn pulumi.StringPtrInput
	// Public Key for the Zone DNSSEC.
	PublicKey pulumi.StringPtrInput
	// The status of the Zone DNSSEC.
	Status pulumi.StringPtrInput
	// The zone id for the zone.
	ZoneId pulumi.StringPtrInput
}

func (ZoneDnssecState) ElementType() reflect.Type {
	return reflect.TypeOf((*zoneDnssecState)(nil)).Elem()
}

type zoneDnssecArgs struct {
	// Zone DNSSEC updated time.
	ModifiedOn *string `pulumi:"modifiedOn"`
	// The zone id for the zone.
	ZoneId string `pulumi:"zoneId"`
}

// The set of arguments for constructing a ZoneDnssec resource.
type ZoneDnssecArgs struct {
	// Zone DNSSEC updated time.
	ModifiedOn pulumi.StringPtrInput
	// The zone id for the zone.
	ZoneId pulumi.StringInput
}

func (ZoneDnssecArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*zoneDnssecArgs)(nil)).Elem()
}

type ZoneDnssecInput interface {
	pulumi.Input

	ToZoneDnssecOutput() ZoneDnssecOutput
	ToZoneDnssecOutputWithContext(ctx context.Context) ZoneDnssecOutput
}

func (*ZoneDnssec) ElementType() reflect.Type {
	return reflect.TypeOf((*ZoneDnssec)(nil))
}

func (i *ZoneDnssec) ToZoneDnssecOutput() ZoneDnssecOutput {
	return i.ToZoneDnssecOutputWithContext(context.Background())
}

func (i *ZoneDnssec) ToZoneDnssecOutputWithContext(ctx context.Context) ZoneDnssecOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ZoneDnssecOutput)
}

func (i *ZoneDnssec) ToZoneDnssecPtrOutput() ZoneDnssecPtrOutput {
	return i.ToZoneDnssecPtrOutputWithContext(context.Background())
}

func (i *ZoneDnssec) ToZoneDnssecPtrOutputWithContext(ctx context.Context) ZoneDnssecPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ZoneDnssecPtrOutput)
}

type ZoneDnssecPtrInput interface {
	pulumi.Input

	ToZoneDnssecPtrOutput() ZoneDnssecPtrOutput
	ToZoneDnssecPtrOutputWithContext(ctx context.Context) ZoneDnssecPtrOutput
}

type zoneDnssecPtrType ZoneDnssecArgs

func (*zoneDnssecPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**ZoneDnssec)(nil))
}

func (i *zoneDnssecPtrType) ToZoneDnssecPtrOutput() ZoneDnssecPtrOutput {
	return i.ToZoneDnssecPtrOutputWithContext(context.Background())
}

func (i *zoneDnssecPtrType) ToZoneDnssecPtrOutputWithContext(ctx context.Context) ZoneDnssecPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ZoneDnssecPtrOutput)
}

// ZoneDnssecArrayInput is an input type that accepts ZoneDnssecArray and ZoneDnssecArrayOutput values.
// You can construct a concrete instance of `ZoneDnssecArrayInput` via:
//
//          ZoneDnssecArray{ ZoneDnssecArgs{...} }
type ZoneDnssecArrayInput interface {
	pulumi.Input

	ToZoneDnssecArrayOutput() ZoneDnssecArrayOutput
	ToZoneDnssecArrayOutputWithContext(context.Context) ZoneDnssecArrayOutput
}

type ZoneDnssecArray []ZoneDnssecInput

func (ZoneDnssecArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*ZoneDnssec)(nil))
}

func (i ZoneDnssecArray) ToZoneDnssecArrayOutput() ZoneDnssecArrayOutput {
	return i.ToZoneDnssecArrayOutputWithContext(context.Background())
}

func (i ZoneDnssecArray) ToZoneDnssecArrayOutputWithContext(ctx context.Context) ZoneDnssecArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ZoneDnssecArrayOutput)
}

// ZoneDnssecMapInput is an input type that accepts ZoneDnssecMap and ZoneDnssecMapOutput values.
// You can construct a concrete instance of `ZoneDnssecMapInput` via:
//
//          ZoneDnssecMap{ "key": ZoneDnssecArgs{...} }
type ZoneDnssecMapInput interface {
	pulumi.Input

	ToZoneDnssecMapOutput() ZoneDnssecMapOutput
	ToZoneDnssecMapOutputWithContext(context.Context) ZoneDnssecMapOutput
}

type ZoneDnssecMap map[string]ZoneDnssecInput

func (ZoneDnssecMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*ZoneDnssec)(nil))
}

func (i ZoneDnssecMap) ToZoneDnssecMapOutput() ZoneDnssecMapOutput {
	return i.ToZoneDnssecMapOutputWithContext(context.Background())
}

func (i ZoneDnssecMap) ToZoneDnssecMapOutputWithContext(ctx context.Context) ZoneDnssecMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ZoneDnssecMapOutput)
}

type ZoneDnssecOutput struct {
	*pulumi.OutputState
}

func (ZoneDnssecOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ZoneDnssec)(nil))
}

func (o ZoneDnssecOutput) ToZoneDnssecOutput() ZoneDnssecOutput {
	return o
}

func (o ZoneDnssecOutput) ToZoneDnssecOutputWithContext(ctx context.Context) ZoneDnssecOutput {
	return o
}

func (o ZoneDnssecOutput) ToZoneDnssecPtrOutput() ZoneDnssecPtrOutput {
	return o.ToZoneDnssecPtrOutputWithContext(context.Background())
}

func (o ZoneDnssecOutput) ToZoneDnssecPtrOutputWithContext(ctx context.Context) ZoneDnssecPtrOutput {
	return o.ApplyT(func(v ZoneDnssec) *ZoneDnssec {
		return &v
	}).(ZoneDnssecPtrOutput)
}

type ZoneDnssecPtrOutput struct {
	*pulumi.OutputState
}

func (ZoneDnssecPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ZoneDnssec)(nil))
}

func (o ZoneDnssecPtrOutput) ToZoneDnssecPtrOutput() ZoneDnssecPtrOutput {
	return o
}

func (o ZoneDnssecPtrOutput) ToZoneDnssecPtrOutputWithContext(ctx context.Context) ZoneDnssecPtrOutput {
	return o
}

type ZoneDnssecArrayOutput struct{ *pulumi.OutputState }

func (ZoneDnssecArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]ZoneDnssec)(nil))
}

func (o ZoneDnssecArrayOutput) ToZoneDnssecArrayOutput() ZoneDnssecArrayOutput {
	return o
}

func (o ZoneDnssecArrayOutput) ToZoneDnssecArrayOutputWithContext(ctx context.Context) ZoneDnssecArrayOutput {
	return o
}

func (o ZoneDnssecArrayOutput) Index(i pulumi.IntInput) ZoneDnssecOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) ZoneDnssec {
		return vs[0].([]ZoneDnssec)[vs[1].(int)]
	}).(ZoneDnssecOutput)
}

type ZoneDnssecMapOutput struct{ *pulumi.OutputState }

func (ZoneDnssecMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]ZoneDnssec)(nil))
}

func (o ZoneDnssecMapOutput) ToZoneDnssecMapOutput() ZoneDnssecMapOutput {
	return o
}

func (o ZoneDnssecMapOutput) ToZoneDnssecMapOutputWithContext(ctx context.Context) ZoneDnssecMapOutput {
	return o
}

func (o ZoneDnssecMapOutput) MapIndex(k pulumi.StringInput) ZoneDnssecOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) ZoneDnssec {
		return vs[0].(map[string]ZoneDnssec)[vs[1].(string)]
	}).(ZoneDnssecOutput)
}

func init() {
	pulumi.RegisterOutputType(ZoneDnssecOutput{})
	pulumi.RegisterOutputType(ZoneDnssecPtrOutput{})
	pulumi.RegisterOutputType(ZoneDnssecArrayOutput{})
	pulumi.RegisterOutputType(ZoneDnssecMapOutput{})
}