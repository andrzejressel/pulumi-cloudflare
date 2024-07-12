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
//			_, err := cloudflare.NewR2Bucket(ctx, "example", &cloudflare.R2BucketArgs{
//				AccountId: pulumi.String("f037e56e89293a057740de681ac9abbe"),
//				Name:      pulumi.String("terraform-bucket"),
//				Location:  pulumi.String("enam"),
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
// > Available location values can be found in the [R2 documentation](https://developers.cloudflare.com/r2/reference/data-location/#available-hints).
//
// ## Import
//
// ```sh
// $ pulumi import cloudflare:index/r2Bucket:R2Bucket default <account id>/<bucket name>
// ```
type R2Bucket struct {
	pulumi.CustomResourceState

	// The account identifier to target for the resource.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// The location hint of the R2 bucket. Available values: `WNAM`, `ENAM`, `WEUR`, `EEUR`, `APAC`
	Location pulumi.StringOutput `pulumi:"location"`
	// The name of the R2 bucket.
	Name pulumi.StringOutput `pulumi:"name"`
}

// NewR2Bucket registers a new resource with the given unique name, arguments, and options.
func NewR2Bucket(ctx *pulumi.Context,
	name string, args *R2BucketArgs, opts ...pulumi.ResourceOption) (*R2Bucket, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	if args.Name == nil {
		return nil, errors.New("invalid value for required argument 'Name'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource R2Bucket
	err := ctx.RegisterResource("cloudflare:index/r2Bucket:R2Bucket", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetR2Bucket gets an existing R2Bucket resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetR2Bucket(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *R2BucketState, opts ...pulumi.ResourceOption) (*R2Bucket, error) {
	var resource R2Bucket
	err := ctx.ReadResource("cloudflare:index/r2Bucket:R2Bucket", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering R2Bucket resources.
type r2bucketState struct {
	// The account identifier to target for the resource.
	AccountId *string `pulumi:"accountId"`
	// The location hint of the R2 bucket. Available values: `WNAM`, `ENAM`, `WEUR`, `EEUR`, `APAC`
	Location *string `pulumi:"location"`
	// The name of the R2 bucket.
	Name *string `pulumi:"name"`
}

type R2BucketState struct {
	// The account identifier to target for the resource.
	AccountId pulumi.StringPtrInput
	// The location hint of the R2 bucket. Available values: `WNAM`, `ENAM`, `WEUR`, `EEUR`, `APAC`
	Location pulumi.StringPtrInput
	// The name of the R2 bucket.
	Name pulumi.StringPtrInput
}

func (R2BucketState) ElementType() reflect.Type {
	return reflect.TypeOf((*r2bucketState)(nil)).Elem()
}

type r2bucketArgs struct {
	// The account identifier to target for the resource.
	AccountId string `pulumi:"accountId"`
	// The location hint of the R2 bucket. Available values: `WNAM`, `ENAM`, `WEUR`, `EEUR`, `APAC`
	Location *string `pulumi:"location"`
	// The name of the R2 bucket.
	Name string `pulumi:"name"`
}

// The set of arguments for constructing a R2Bucket resource.
type R2BucketArgs struct {
	// The account identifier to target for the resource.
	AccountId pulumi.StringInput
	// The location hint of the R2 bucket. Available values: `WNAM`, `ENAM`, `WEUR`, `EEUR`, `APAC`
	Location pulumi.StringPtrInput
	// The name of the R2 bucket.
	Name pulumi.StringInput
}

func (R2BucketArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*r2bucketArgs)(nil)).Elem()
}

type R2BucketInput interface {
	pulumi.Input

	ToR2BucketOutput() R2BucketOutput
	ToR2BucketOutputWithContext(ctx context.Context) R2BucketOutput
}

func (*R2Bucket) ElementType() reflect.Type {
	return reflect.TypeOf((**R2Bucket)(nil)).Elem()
}

func (i *R2Bucket) ToR2BucketOutput() R2BucketOutput {
	return i.ToR2BucketOutputWithContext(context.Background())
}

func (i *R2Bucket) ToR2BucketOutputWithContext(ctx context.Context) R2BucketOutput {
	return pulumi.ToOutputWithContext(ctx, i).(R2BucketOutput)
}

// R2BucketArrayInput is an input type that accepts R2BucketArray and R2BucketArrayOutput values.
// You can construct a concrete instance of `R2BucketArrayInput` via:
//
//	R2BucketArray{ R2BucketArgs{...} }
type R2BucketArrayInput interface {
	pulumi.Input

	ToR2BucketArrayOutput() R2BucketArrayOutput
	ToR2BucketArrayOutputWithContext(context.Context) R2BucketArrayOutput
}

type R2BucketArray []R2BucketInput

func (R2BucketArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*R2Bucket)(nil)).Elem()
}

func (i R2BucketArray) ToR2BucketArrayOutput() R2BucketArrayOutput {
	return i.ToR2BucketArrayOutputWithContext(context.Background())
}

func (i R2BucketArray) ToR2BucketArrayOutputWithContext(ctx context.Context) R2BucketArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(R2BucketArrayOutput)
}

// R2BucketMapInput is an input type that accepts R2BucketMap and R2BucketMapOutput values.
// You can construct a concrete instance of `R2BucketMapInput` via:
//
//	R2BucketMap{ "key": R2BucketArgs{...} }
type R2BucketMapInput interface {
	pulumi.Input

	ToR2BucketMapOutput() R2BucketMapOutput
	ToR2BucketMapOutputWithContext(context.Context) R2BucketMapOutput
}

type R2BucketMap map[string]R2BucketInput

func (R2BucketMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*R2Bucket)(nil)).Elem()
}

func (i R2BucketMap) ToR2BucketMapOutput() R2BucketMapOutput {
	return i.ToR2BucketMapOutputWithContext(context.Background())
}

func (i R2BucketMap) ToR2BucketMapOutputWithContext(ctx context.Context) R2BucketMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(R2BucketMapOutput)
}

type R2BucketOutput struct{ *pulumi.OutputState }

func (R2BucketOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**R2Bucket)(nil)).Elem()
}

func (o R2BucketOutput) ToR2BucketOutput() R2BucketOutput {
	return o
}

func (o R2BucketOutput) ToR2BucketOutputWithContext(ctx context.Context) R2BucketOutput {
	return o
}

// The account identifier to target for the resource.
func (o R2BucketOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *R2Bucket) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// The location hint of the R2 bucket. Available values: `WNAM`, `ENAM`, `WEUR`, `EEUR`, `APAC`
func (o R2BucketOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *R2Bucket) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// The name of the R2 bucket.
func (o R2BucketOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *R2Bucket) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

type R2BucketArrayOutput struct{ *pulumi.OutputState }

func (R2BucketArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*R2Bucket)(nil)).Elem()
}

func (o R2BucketArrayOutput) ToR2BucketArrayOutput() R2BucketArrayOutput {
	return o
}

func (o R2BucketArrayOutput) ToR2BucketArrayOutputWithContext(ctx context.Context) R2BucketArrayOutput {
	return o
}

func (o R2BucketArrayOutput) Index(i pulumi.IntInput) R2BucketOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *R2Bucket {
		return vs[0].([]*R2Bucket)[vs[1].(int)]
	}).(R2BucketOutput)
}

type R2BucketMapOutput struct{ *pulumi.OutputState }

func (R2BucketMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*R2Bucket)(nil)).Elem()
}

func (o R2BucketMapOutput) ToR2BucketMapOutput() R2BucketMapOutput {
	return o
}

func (o R2BucketMapOutput) ToR2BucketMapOutputWithContext(ctx context.Context) R2BucketMapOutput {
	return o
}

func (o R2BucketMapOutput) MapIndex(k pulumi.StringInput) R2BucketOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *R2Bucket {
		return vs[0].(map[string]*R2Bucket)[vs[1].(string)]
	}).(R2BucketOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*R2BucketInput)(nil)).Elem(), &R2Bucket{})
	pulumi.RegisterInputType(reflect.TypeOf((*R2BucketArrayInput)(nil)).Elem(), R2BucketArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*R2BucketMapInput)(nil)).Elem(), R2BucketMap{})
	pulumi.RegisterOutputType(R2BucketOutput{})
	pulumi.RegisterOutputType(R2BucketArrayOutput{})
	pulumi.RegisterOutputType(R2BucketMapOutput{})
}
