// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Cloudflare custom hostname fallback origin resource.
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
//			_, err := cloudflare.NewCustomHostnameFallbackOrigin(ctx, "fallbackOrigin", &cloudflare.CustomHostnameFallbackOriginArgs{
//				Origin: pulumi.String("fallback.example.com"),
//				ZoneId: pulumi.String("d41d8cd98f00b204e9800998ecf8427e"),
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
// Custom hostname fallback origins can be imported using a composite ID formed of the zone ID and [fallback origin](https://api.cloudflare.com/#custom-hostname-fallback-origin-for-a-zone-properties), separated by a "/" e.g.
//
// ```sh
//
//	$ pulumi import cloudflare:index/customHostnameFallbackOrigin:CustomHostnameFallbackOrigin example d41d8cd98f00b204e9800998ecf8427e/fallback.example.com
//
// ```
type CustomHostnameFallbackOrigin struct {
	pulumi.CustomResourceState

	// Hostname you intend to fallback requests to. Origin must be a proxied A/AAAA/CNAME DNS record within Clouldflare.
	Origin pulumi.StringOutput `pulumi:"origin"`
	// Status of the fallback origin's activation.
	Status pulumi.StringOutput `pulumi:"status"`
	// The DNS zone ID where the custom hostname should be assigned.
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewCustomHostnameFallbackOrigin registers a new resource with the given unique name, arguments, and options.
func NewCustomHostnameFallbackOrigin(ctx *pulumi.Context,
	name string, args *CustomHostnameFallbackOriginArgs, opts ...pulumi.ResourceOption) (*CustomHostnameFallbackOrigin, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Origin == nil {
		return nil, errors.New("invalid value for required argument 'Origin'")
	}
	if args.ZoneId == nil {
		return nil, errors.New("invalid value for required argument 'ZoneId'")
	}
	var resource CustomHostnameFallbackOrigin
	err := ctx.RegisterResource("cloudflare:index/customHostnameFallbackOrigin:CustomHostnameFallbackOrigin", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCustomHostnameFallbackOrigin gets an existing CustomHostnameFallbackOrigin resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCustomHostnameFallbackOrigin(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CustomHostnameFallbackOriginState, opts ...pulumi.ResourceOption) (*CustomHostnameFallbackOrigin, error) {
	var resource CustomHostnameFallbackOrigin
	err := ctx.ReadResource("cloudflare:index/customHostnameFallbackOrigin:CustomHostnameFallbackOrigin", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CustomHostnameFallbackOrigin resources.
type customHostnameFallbackOriginState struct {
	// Hostname you intend to fallback requests to. Origin must be a proxied A/AAAA/CNAME DNS record within Clouldflare.
	Origin *string `pulumi:"origin"`
	// Status of the fallback origin's activation.
	Status *string `pulumi:"status"`
	// The DNS zone ID where the custom hostname should be assigned.
	ZoneId *string `pulumi:"zoneId"`
}

type CustomHostnameFallbackOriginState struct {
	// Hostname you intend to fallback requests to. Origin must be a proxied A/AAAA/CNAME DNS record within Clouldflare.
	Origin pulumi.StringPtrInput
	// Status of the fallback origin's activation.
	Status pulumi.StringPtrInput
	// The DNS zone ID where the custom hostname should be assigned.
	ZoneId pulumi.StringPtrInput
}

func (CustomHostnameFallbackOriginState) ElementType() reflect.Type {
	return reflect.TypeOf((*customHostnameFallbackOriginState)(nil)).Elem()
}

type customHostnameFallbackOriginArgs struct {
	// Hostname you intend to fallback requests to. Origin must be a proxied A/AAAA/CNAME DNS record within Clouldflare.
	Origin string `pulumi:"origin"`
	// The DNS zone ID where the custom hostname should be assigned.
	ZoneId string `pulumi:"zoneId"`
}

// The set of arguments for constructing a CustomHostnameFallbackOrigin resource.
type CustomHostnameFallbackOriginArgs struct {
	// Hostname you intend to fallback requests to. Origin must be a proxied A/AAAA/CNAME DNS record within Clouldflare.
	Origin pulumi.StringInput
	// The DNS zone ID where the custom hostname should be assigned.
	ZoneId pulumi.StringInput
}

func (CustomHostnameFallbackOriginArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*customHostnameFallbackOriginArgs)(nil)).Elem()
}

type CustomHostnameFallbackOriginInput interface {
	pulumi.Input

	ToCustomHostnameFallbackOriginOutput() CustomHostnameFallbackOriginOutput
	ToCustomHostnameFallbackOriginOutputWithContext(ctx context.Context) CustomHostnameFallbackOriginOutput
}

func (*CustomHostnameFallbackOrigin) ElementType() reflect.Type {
	return reflect.TypeOf((**CustomHostnameFallbackOrigin)(nil)).Elem()
}

func (i *CustomHostnameFallbackOrigin) ToCustomHostnameFallbackOriginOutput() CustomHostnameFallbackOriginOutput {
	return i.ToCustomHostnameFallbackOriginOutputWithContext(context.Background())
}

func (i *CustomHostnameFallbackOrigin) ToCustomHostnameFallbackOriginOutputWithContext(ctx context.Context) CustomHostnameFallbackOriginOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomHostnameFallbackOriginOutput)
}

// CustomHostnameFallbackOriginArrayInput is an input type that accepts CustomHostnameFallbackOriginArray and CustomHostnameFallbackOriginArrayOutput values.
// You can construct a concrete instance of `CustomHostnameFallbackOriginArrayInput` via:
//
//	CustomHostnameFallbackOriginArray{ CustomHostnameFallbackOriginArgs{...} }
type CustomHostnameFallbackOriginArrayInput interface {
	pulumi.Input

	ToCustomHostnameFallbackOriginArrayOutput() CustomHostnameFallbackOriginArrayOutput
	ToCustomHostnameFallbackOriginArrayOutputWithContext(context.Context) CustomHostnameFallbackOriginArrayOutput
}

type CustomHostnameFallbackOriginArray []CustomHostnameFallbackOriginInput

func (CustomHostnameFallbackOriginArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CustomHostnameFallbackOrigin)(nil)).Elem()
}

func (i CustomHostnameFallbackOriginArray) ToCustomHostnameFallbackOriginArrayOutput() CustomHostnameFallbackOriginArrayOutput {
	return i.ToCustomHostnameFallbackOriginArrayOutputWithContext(context.Background())
}

func (i CustomHostnameFallbackOriginArray) ToCustomHostnameFallbackOriginArrayOutputWithContext(ctx context.Context) CustomHostnameFallbackOriginArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomHostnameFallbackOriginArrayOutput)
}

// CustomHostnameFallbackOriginMapInput is an input type that accepts CustomHostnameFallbackOriginMap and CustomHostnameFallbackOriginMapOutput values.
// You can construct a concrete instance of `CustomHostnameFallbackOriginMapInput` via:
//
//	CustomHostnameFallbackOriginMap{ "key": CustomHostnameFallbackOriginArgs{...} }
type CustomHostnameFallbackOriginMapInput interface {
	pulumi.Input

	ToCustomHostnameFallbackOriginMapOutput() CustomHostnameFallbackOriginMapOutput
	ToCustomHostnameFallbackOriginMapOutputWithContext(context.Context) CustomHostnameFallbackOriginMapOutput
}

type CustomHostnameFallbackOriginMap map[string]CustomHostnameFallbackOriginInput

func (CustomHostnameFallbackOriginMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CustomHostnameFallbackOrigin)(nil)).Elem()
}

func (i CustomHostnameFallbackOriginMap) ToCustomHostnameFallbackOriginMapOutput() CustomHostnameFallbackOriginMapOutput {
	return i.ToCustomHostnameFallbackOriginMapOutputWithContext(context.Background())
}

func (i CustomHostnameFallbackOriginMap) ToCustomHostnameFallbackOriginMapOutputWithContext(ctx context.Context) CustomHostnameFallbackOriginMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomHostnameFallbackOriginMapOutput)
}

type CustomHostnameFallbackOriginOutput struct{ *pulumi.OutputState }

func (CustomHostnameFallbackOriginOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CustomHostnameFallbackOrigin)(nil)).Elem()
}

func (o CustomHostnameFallbackOriginOutput) ToCustomHostnameFallbackOriginOutput() CustomHostnameFallbackOriginOutput {
	return o
}

func (o CustomHostnameFallbackOriginOutput) ToCustomHostnameFallbackOriginOutputWithContext(ctx context.Context) CustomHostnameFallbackOriginOutput {
	return o
}

// Hostname you intend to fallback requests to. Origin must be a proxied A/AAAA/CNAME DNS record within Clouldflare.
func (o CustomHostnameFallbackOriginOutput) Origin() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomHostnameFallbackOrigin) pulumi.StringOutput { return v.Origin }).(pulumi.StringOutput)
}

// Status of the fallback origin's activation.
func (o CustomHostnameFallbackOriginOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomHostnameFallbackOrigin) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// The DNS zone ID where the custom hostname should be assigned.
func (o CustomHostnameFallbackOriginOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomHostnameFallbackOrigin) pulumi.StringOutput { return v.ZoneId }).(pulumi.StringOutput)
}

type CustomHostnameFallbackOriginArrayOutput struct{ *pulumi.OutputState }

func (CustomHostnameFallbackOriginArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CustomHostnameFallbackOrigin)(nil)).Elem()
}

func (o CustomHostnameFallbackOriginArrayOutput) ToCustomHostnameFallbackOriginArrayOutput() CustomHostnameFallbackOriginArrayOutput {
	return o
}

func (o CustomHostnameFallbackOriginArrayOutput) ToCustomHostnameFallbackOriginArrayOutputWithContext(ctx context.Context) CustomHostnameFallbackOriginArrayOutput {
	return o
}

func (o CustomHostnameFallbackOriginArrayOutput) Index(i pulumi.IntInput) CustomHostnameFallbackOriginOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CustomHostnameFallbackOrigin {
		return vs[0].([]*CustomHostnameFallbackOrigin)[vs[1].(int)]
	}).(CustomHostnameFallbackOriginOutput)
}

type CustomHostnameFallbackOriginMapOutput struct{ *pulumi.OutputState }

func (CustomHostnameFallbackOriginMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CustomHostnameFallbackOrigin)(nil)).Elem()
}

func (o CustomHostnameFallbackOriginMapOutput) ToCustomHostnameFallbackOriginMapOutput() CustomHostnameFallbackOriginMapOutput {
	return o
}

func (o CustomHostnameFallbackOriginMapOutput) ToCustomHostnameFallbackOriginMapOutputWithContext(ctx context.Context) CustomHostnameFallbackOriginMapOutput {
	return o
}

func (o CustomHostnameFallbackOriginMapOutput) MapIndex(k pulumi.StringInput) CustomHostnameFallbackOriginOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CustomHostnameFallbackOrigin {
		return vs[0].(map[string]*CustomHostnameFallbackOrigin)[vs[1].(string)]
	}).(CustomHostnameFallbackOriginOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CustomHostnameFallbackOriginInput)(nil)).Elem(), &CustomHostnameFallbackOrigin{})
	pulumi.RegisterInputType(reflect.TypeOf((*CustomHostnameFallbackOriginArrayInput)(nil)).Elem(), CustomHostnameFallbackOriginArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CustomHostnameFallbackOriginMapInput)(nil)).Elem(), CustomHostnameFallbackOriginMap{})
	pulumi.RegisterOutputType(CustomHostnameFallbackOriginOutput{})
	pulumi.RegisterOutputType(CustomHostnameFallbackOriginArrayOutput{})
	pulumi.RegisterOutputType(CustomHostnameFallbackOriginMapOutput{})
}
