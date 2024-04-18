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

// Provides a resource, that manages Cloudflare static routes for Magic
// Transit or Magic WAN. Static routes are used to route traffic
// through GRE tunnels.
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
//			_, err := cloudflare.NewStaticRoute(ctx, "example", &cloudflare.StaticRouteArgs{
//				AccountId:   pulumi.String("f037e56e89293a057740de681ac9abbe"),
//				Description: pulumi.String("New route for new prefix 192.0.2.0/24"),
//				Prefix:      pulumi.String("192.0.2.0/24"),
//				Nexthop:     pulumi.String("10.0.0.0"),
//				Priority:    pulumi.Int(100),
//				Weight:      pulumi.Int(10),
//				ColoNames: pulumi.StringArray{
//					pulumi.String("den01"),
//				},
//				ColoRegions: pulumi.StringArray{
//					pulumi.String("APAC"),
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
// $ pulumi import cloudflare:index/staticRoute:StaticRoute example <account_id>/<static_route_id>
// ```
type StaticRoute struct {
	pulumi.CustomResourceState

	// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	AccountId pulumi.StringPtrOutput `pulumi:"accountId"`
	// List of Cloudflare colocation regions for this static route.
	ColoNames pulumi.StringArrayOutput `pulumi:"coloNames"`
	// List of Cloudflare colocation names for this static route.
	ColoRegions pulumi.StringArrayOutput `pulumi:"coloRegions"`
	// Description of the static route.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The nexthop IP address where traffic will be routed to.
	Nexthop pulumi.StringOutput `pulumi:"nexthop"`
	// Your network prefix using CIDR notation.
	Prefix pulumi.StringOutput `pulumi:"prefix"`
	// The priority for the static route.
	Priority pulumi.IntOutput `pulumi:"priority"`
	// The optional weight for ECMP routes. **Modifying this attribute will force creation of a new resource.**
	Weight pulumi.IntPtrOutput `pulumi:"weight"`
}

// NewStaticRoute registers a new resource with the given unique name, arguments, and options.
func NewStaticRoute(ctx *pulumi.Context,
	name string, args *StaticRouteArgs, opts ...pulumi.ResourceOption) (*StaticRoute, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Nexthop == nil {
		return nil, errors.New("invalid value for required argument 'Nexthop'")
	}
	if args.Prefix == nil {
		return nil, errors.New("invalid value for required argument 'Prefix'")
	}
	if args.Priority == nil {
		return nil, errors.New("invalid value for required argument 'Priority'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource StaticRoute
	err := ctx.RegisterResource("cloudflare:index/staticRoute:StaticRoute", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetStaticRoute gets an existing StaticRoute resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetStaticRoute(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *StaticRouteState, opts ...pulumi.ResourceOption) (*StaticRoute, error) {
	var resource StaticRoute
	err := ctx.ReadResource("cloudflare:index/staticRoute:StaticRoute", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering StaticRoute resources.
type staticRouteState struct {
	// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	AccountId *string `pulumi:"accountId"`
	// List of Cloudflare colocation regions for this static route.
	ColoNames []string `pulumi:"coloNames"`
	// List of Cloudflare colocation names for this static route.
	ColoRegions []string `pulumi:"coloRegions"`
	// Description of the static route.
	Description *string `pulumi:"description"`
	// The nexthop IP address where traffic will be routed to.
	Nexthop *string `pulumi:"nexthop"`
	// Your network prefix using CIDR notation.
	Prefix *string `pulumi:"prefix"`
	// The priority for the static route.
	Priority *int `pulumi:"priority"`
	// The optional weight for ECMP routes. **Modifying this attribute will force creation of a new resource.**
	Weight *int `pulumi:"weight"`
}

type StaticRouteState struct {
	// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	AccountId pulumi.StringPtrInput
	// List of Cloudflare colocation regions for this static route.
	ColoNames pulumi.StringArrayInput
	// List of Cloudflare colocation names for this static route.
	ColoRegions pulumi.StringArrayInput
	// Description of the static route.
	Description pulumi.StringPtrInput
	// The nexthop IP address where traffic will be routed to.
	Nexthop pulumi.StringPtrInput
	// Your network prefix using CIDR notation.
	Prefix pulumi.StringPtrInput
	// The priority for the static route.
	Priority pulumi.IntPtrInput
	// The optional weight for ECMP routes. **Modifying this attribute will force creation of a new resource.**
	Weight pulumi.IntPtrInput
}

func (StaticRouteState) ElementType() reflect.Type {
	return reflect.TypeOf((*staticRouteState)(nil)).Elem()
}

type staticRouteArgs struct {
	// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	AccountId *string `pulumi:"accountId"`
	// List of Cloudflare colocation regions for this static route.
	ColoNames []string `pulumi:"coloNames"`
	// List of Cloudflare colocation names for this static route.
	ColoRegions []string `pulumi:"coloRegions"`
	// Description of the static route.
	Description *string `pulumi:"description"`
	// The nexthop IP address where traffic will be routed to.
	Nexthop string `pulumi:"nexthop"`
	// Your network prefix using CIDR notation.
	Prefix string `pulumi:"prefix"`
	// The priority for the static route.
	Priority int `pulumi:"priority"`
	// The optional weight for ECMP routes. **Modifying this attribute will force creation of a new resource.**
	Weight *int `pulumi:"weight"`
}

// The set of arguments for constructing a StaticRoute resource.
type StaticRouteArgs struct {
	// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	AccountId pulumi.StringPtrInput
	// List of Cloudflare colocation regions for this static route.
	ColoNames pulumi.StringArrayInput
	// List of Cloudflare colocation names for this static route.
	ColoRegions pulumi.StringArrayInput
	// Description of the static route.
	Description pulumi.StringPtrInput
	// The nexthop IP address where traffic will be routed to.
	Nexthop pulumi.StringInput
	// Your network prefix using CIDR notation.
	Prefix pulumi.StringInput
	// The priority for the static route.
	Priority pulumi.IntInput
	// The optional weight for ECMP routes. **Modifying this attribute will force creation of a new resource.**
	Weight pulumi.IntPtrInput
}

func (StaticRouteArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*staticRouteArgs)(nil)).Elem()
}

type StaticRouteInput interface {
	pulumi.Input

	ToStaticRouteOutput() StaticRouteOutput
	ToStaticRouteOutputWithContext(ctx context.Context) StaticRouteOutput
}

func (*StaticRoute) ElementType() reflect.Type {
	return reflect.TypeOf((**StaticRoute)(nil)).Elem()
}

func (i *StaticRoute) ToStaticRouteOutput() StaticRouteOutput {
	return i.ToStaticRouteOutputWithContext(context.Background())
}

func (i *StaticRoute) ToStaticRouteOutputWithContext(ctx context.Context) StaticRouteOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StaticRouteOutput)
}

// StaticRouteArrayInput is an input type that accepts StaticRouteArray and StaticRouteArrayOutput values.
// You can construct a concrete instance of `StaticRouteArrayInput` via:
//
//	StaticRouteArray{ StaticRouteArgs{...} }
type StaticRouteArrayInput interface {
	pulumi.Input

	ToStaticRouteArrayOutput() StaticRouteArrayOutput
	ToStaticRouteArrayOutputWithContext(context.Context) StaticRouteArrayOutput
}

type StaticRouteArray []StaticRouteInput

func (StaticRouteArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*StaticRoute)(nil)).Elem()
}

func (i StaticRouteArray) ToStaticRouteArrayOutput() StaticRouteArrayOutput {
	return i.ToStaticRouteArrayOutputWithContext(context.Background())
}

func (i StaticRouteArray) ToStaticRouteArrayOutputWithContext(ctx context.Context) StaticRouteArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StaticRouteArrayOutput)
}

// StaticRouteMapInput is an input type that accepts StaticRouteMap and StaticRouteMapOutput values.
// You can construct a concrete instance of `StaticRouteMapInput` via:
//
//	StaticRouteMap{ "key": StaticRouteArgs{...} }
type StaticRouteMapInput interface {
	pulumi.Input

	ToStaticRouteMapOutput() StaticRouteMapOutput
	ToStaticRouteMapOutputWithContext(context.Context) StaticRouteMapOutput
}

type StaticRouteMap map[string]StaticRouteInput

func (StaticRouteMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*StaticRoute)(nil)).Elem()
}

func (i StaticRouteMap) ToStaticRouteMapOutput() StaticRouteMapOutput {
	return i.ToStaticRouteMapOutputWithContext(context.Background())
}

func (i StaticRouteMap) ToStaticRouteMapOutputWithContext(ctx context.Context) StaticRouteMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StaticRouteMapOutput)
}

type StaticRouteOutput struct{ *pulumi.OutputState }

func (StaticRouteOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**StaticRoute)(nil)).Elem()
}

func (o StaticRouteOutput) ToStaticRouteOutput() StaticRouteOutput {
	return o
}

func (o StaticRouteOutput) ToStaticRouteOutputWithContext(ctx context.Context) StaticRouteOutput {
	return o
}

// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
func (o StaticRouteOutput) AccountId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *StaticRoute) pulumi.StringPtrOutput { return v.AccountId }).(pulumi.StringPtrOutput)
}

// List of Cloudflare colocation regions for this static route.
func (o StaticRouteOutput) ColoNames() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *StaticRoute) pulumi.StringArrayOutput { return v.ColoNames }).(pulumi.StringArrayOutput)
}

// List of Cloudflare colocation names for this static route.
func (o StaticRouteOutput) ColoRegions() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *StaticRoute) pulumi.StringArrayOutput { return v.ColoRegions }).(pulumi.StringArrayOutput)
}

// Description of the static route.
func (o StaticRouteOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *StaticRoute) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The nexthop IP address where traffic will be routed to.
func (o StaticRouteOutput) Nexthop() pulumi.StringOutput {
	return o.ApplyT(func(v *StaticRoute) pulumi.StringOutput { return v.Nexthop }).(pulumi.StringOutput)
}

// Your network prefix using CIDR notation.
func (o StaticRouteOutput) Prefix() pulumi.StringOutput {
	return o.ApplyT(func(v *StaticRoute) pulumi.StringOutput { return v.Prefix }).(pulumi.StringOutput)
}

// The priority for the static route.
func (o StaticRouteOutput) Priority() pulumi.IntOutput {
	return o.ApplyT(func(v *StaticRoute) pulumi.IntOutput { return v.Priority }).(pulumi.IntOutput)
}

// The optional weight for ECMP routes. **Modifying this attribute will force creation of a new resource.**
func (o StaticRouteOutput) Weight() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *StaticRoute) pulumi.IntPtrOutput { return v.Weight }).(pulumi.IntPtrOutput)
}

type StaticRouteArrayOutput struct{ *pulumi.OutputState }

func (StaticRouteArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*StaticRoute)(nil)).Elem()
}

func (o StaticRouteArrayOutput) ToStaticRouteArrayOutput() StaticRouteArrayOutput {
	return o
}

func (o StaticRouteArrayOutput) ToStaticRouteArrayOutputWithContext(ctx context.Context) StaticRouteArrayOutput {
	return o
}

func (o StaticRouteArrayOutput) Index(i pulumi.IntInput) StaticRouteOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *StaticRoute {
		return vs[0].([]*StaticRoute)[vs[1].(int)]
	}).(StaticRouteOutput)
}

type StaticRouteMapOutput struct{ *pulumi.OutputState }

func (StaticRouteMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*StaticRoute)(nil)).Elem()
}

func (o StaticRouteMapOutput) ToStaticRouteMapOutput() StaticRouteMapOutput {
	return o
}

func (o StaticRouteMapOutput) ToStaticRouteMapOutputWithContext(ctx context.Context) StaticRouteMapOutput {
	return o
}

func (o StaticRouteMapOutput) MapIndex(k pulumi.StringInput) StaticRouteOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *StaticRoute {
		return vs[0].(map[string]*StaticRoute)[vs[1].(string)]
	}).(StaticRouteOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*StaticRouteInput)(nil)).Elem(), &StaticRoute{})
	pulumi.RegisterInputType(reflect.TypeOf((*StaticRouteArrayInput)(nil)).Elem(), StaticRouteArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*StaticRouteMapInput)(nil)).Elem(), StaticRouteMap{})
	pulumi.RegisterOutputType(StaticRouteOutput{})
	pulumi.RegisterOutputType(StaticRouteArrayOutput{})
	pulumi.RegisterOutputType(StaticRouteMapOutput{})
}
