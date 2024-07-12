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

// Provides a Cloudflare rate limit resource for a given zone. This can
// be used to limit the traffic you receive zone-wide, or matching more
// specific types of requests/responses.
//
// > `RateLimit` is in a deprecation phase until January 15th, 2025.
//
//	During this time period, this resource is still
//	fully supported but you are strongly advised to move to the
//	`Ruleset` resource. Full details can be found in the
//	developer documentation.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-cloudflare/sdk/v5/go/cloudflare"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := cloudflare.NewRateLimit(ctx, "example", &cloudflare.RateLimitArgs{
//				ZoneId:    pulumi.String("0da42c8d2132a9ddaf714f9e7c920711"),
//				Threshold: pulumi.Int(2000),
//				Period:    pulumi.Int(2),
//				Match: &cloudflare.RateLimitMatchArgs{
//					Request: &cloudflare.RateLimitMatchRequestArgs{
//						UrlPattern: pulumi.String(fmt.Sprintf("%v/*", cloudflareZone)),
//						Schemes: pulumi.StringArray{
//							pulumi.String("HTTP"),
//							pulumi.String("HTTPS"),
//						},
//						Methods: pulumi.StringArray{
//							pulumi.String("GET"),
//							pulumi.String("POST"),
//							pulumi.String("PUT"),
//							pulumi.String("DELETE"),
//							pulumi.String("PATCH"),
//							pulumi.String("HEAD"),
//						},
//					},
//					Response: &cloudflare.RateLimitMatchResponseArgs{
//						Statuses: pulumi.IntArray{
//							pulumi.Int(200),
//							pulumi.Int(201),
//							pulumi.Int(202),
//							pulumi.Int(301),
//							pulumi.Int(429),
//						},
//						OriginTraffic: pulumi.Bool(false),
//						Headers: pulumi.StringMapArray{
//							pulumi.StringMap{
//								"name":  pulumi.String("Host"),
//								"op":    pulumi.String("eq"),
//								"value": pulumi.String("localhost"),
//							},
//							pulumi.StringMap{
//								"name":  pulumi.String("X-Example"),
//								"op":    pulumi.String("ne"),
//								"value": pulumi.String("my-example"),
//							},
//						},
//					},
//				},
//				Action: &cloudflare.RateLimitActionArgs{
//					Mode:    pulumi.String("simulate"),
//					Timeout: pulumi.Int(43200),
//					Response: &cloudflare.RateLimitActionResponseArgs{
//						ContentType: pulumi.String("text/plain"),
//						Body:        pulumi.String("custom response body"),
//					},
//				},
//				Correlate: &cloudflare.RateLimitCorrelateArgs{
//					By: pulumi.String("nat"),
//				},
//				Disabled:    pulumi.Bool(false),
//				Description: pulumi.String("example rate limit for a zone"),
//				BypassUrlPatterns: pulumi.StringArray{
//					pulumi.String("example.com/bypass1"),
//					pulumi.String("example.com/bypass2"),
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
//
// ## Import
//
// ```sh
// $ pulumi import cloudflare:index/rateLimit:RateLimit example <zone_id>/<rate_limit_id>
// ```
type RateLimit struct {
	pulumi.CustomResourceState

	// The action to be performed when the threshold of matched traffic within the period defined is exceeded.
	Action            RateLimitActionOutput    `pulumi:"action"`
	BypassUrlPatterns pulumi.StringArrayOutput `pulumi:"bypassUrlPatterns"`
	// Determines how rate limiting is applied. By default if not specified, rate limiting applies to the clients IP address.
	Correlate RateLimitCorrelatePtrOutput `pulumi:"correlate"`
	// A note that you can use to describe the reason for a rate limit. This value is sanitized and all tags are removed.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Whether this ratelimit is currently disabled. Defaults to `false`.
	Disabled pulumi.BoolPtrOutput `pulumi:"disabled"`
	// Determines which traffic the rate limit counts towards the threshold. By default matches all traffic in the zone.
	Match RateLimitMatchOutput `pulumi:"match"`
	// The time in seconds to count matching traffic. If the count exceeds threshold within this period the action will be performed.
	Period pulumi.IntOutput `pulumi:"period"`
	// The threshold that triggers the rate limit mitigations, combine with period.
	Threshold pulumi.IntOutput `pulumi:"threshold"`
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewRateLimit registers a new resource with the given unique name, arguments, and options.
func NewRateLimit(ctx *pulumi.Context,
	name string, args *RateLimitArgs, opts ...pulumi.ResourceOption) (*RateLimit, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Action == nil {
		return nil, errors.New("invalid value for required argument 'Action'")
	}
	if args.Period == nil {
		return nil, errors.New("invalid value for required argument 'Period'")
	}
	if args.Threshold == nil {
		return nil, errors.New("invalid value for required argument 'Threshold'")
	}
	if args.ZoneId == nil {
		return nil, errors.New("invalid value for required argument 'ZoneId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource RateLimit
	err := ctx.RegisterResource("cloudflare:index/rateLimit:RateLimit", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRateLimit gets an existing RateLimit resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRateLimit(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RateLimitState, opts ...pulumi.ResourceOption) (*RateLimit, error) {
	var resource RateLimit
	err := ctx.ReadResource("cloudflare:index/rateLimit:RateLimit", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RateLimit resources.
type rateLimitState struct {
	// The action to be performed when the threshold of matched traffic within the period defined is exceeded.
	Action            *RateLimitAction `pulumi:"action"`
	BypassUrlPatterns []string         `pulumi:"bypassUrlPatterns"`
	// Determines how rate limiting is applied. By default if not specified, rate limiting applies to the clients IP address.
	Correlate *RateLimitCorrelate `pulumi:"correlate"`
	// A note that you can use to describe the reason for a rate limit. This value is sanitized and all tags are removed.
	Description *string `pulumi:"description"`
	// Whether this ratelimit is currently disabled. Defaults to `false`.
	Disabled *bool `pulumi:"disabled"`
	// Determines which traffic the rate limit counts towards the threshold. By default matches all traffic in the zone.
	Match *RateLimitMatch `pulumi:"match"`
	// The time in seconds to count matching traffic. If the count exceeds threshold within this period the action will be performed.
	Period *int `pulumi:"period"`
	// The threshold that triggers the rate limit mitigations, combine with period.
	Threshold *int `pulumi:"threshold"`
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId *string `pulumi:"zoneId"`
}

type RateLimitState struct {
	// The action to be performed when the threshold of matched traffic within the period defined is exceeded.
	Action            RateLimitActionPtrInput
	BypassUrlPatterns pulumi.StringArrayInput
	// Determines how rate limiting is applied. By default if not specified, rate limiting applies to the clients IP address.
	Correlate RateLimitCorrelatePtrInput
	// A note that you can use to describe the reason for a rate limit. This value is sanitized and all tags are removed.
	Description pulumi.StringPtrInput
	// Whether this ratelimit is currently disabled. Defaults to `false`.
	Disabled pulumi.BoolPtrInput
	// Determines which traffic the rate limit counts towards the threshold. By default matches all traffic in the zone.
	Match RateLimitMatchPtrInput
	// The time in seconds to count matching traffic. If the count exceeds threshold within this period the action will be performed.
	Period pulumi.IntPtrInput
	// The threshold that triggers the rate limit mitigations, combine with period.
	Threshold pulumi.IntPtrInput
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringPtrInput
}

func (RateLimitState) ElementType() reflect.Type {
	return reflect.TypeOf((*rateLimitState)(nil)).Elem()
}

type rateLimitArgs struct {
	// The action to be performed when the threshold of matched traffic within the period defined is exceeded.
	Action            RateLimitAction `pulumi:"action"`
	BypassUrlPatterns []string        `pulumi:"bypassUrlPatterns"`
	// Determines how rate limiting is applied. By default if not specified, rate limiting applies to the clients IP address.
	Correlate *RateLimitCorrelate `pulumi:"correlate"`
	// A note that you can use to describe the reason for a rate limit. This value is sanitized and all tags are removed.
	Description *string `pulumi:"description"`
	// Whether this ratelimit is currently disabled. Defaults to `false`.
	Disabled *bool `pulumi:"disabled"`
	// Determines which traffic the rate limit counts towards the threshold. By default matches all traffic in the zone.
	Match *RateLimitMatch `pulumi:"match"`
	// The time in seconds to count matching traffic. If the count exceeds threshold within this period the action will be performed.
	Period int `pulumi:"period"`
	// The threshold that triggers the rate limit mitigations, combine with period.
	Threshold int `pulumi:"threshold"`
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId string `pulumi:"zoneId"`
}

// The set of arguments for constructing a RateLimit resource.
type RateLimitArgs struct {
	// The action to be performed when the threshold of matched traffic within the period defined is exceeded.
	Action            RateLimitActionInput
	BypassUrlPatterns pulumi.StringArrayInput
	// Determines how rate limiting is applied. By default if not specified, rate limiting applies to the clients IP address.
	Correlate RateLimitCorrelatePtrInput
	// A note that you can use to describe the reason for a rate limit. This value is sanitized and all tags are removed.
	Description pulumi.StringPtrInput
	// Whether this ratelimit is currently disabled. Defaults to `false`.
	Disabled pulumi.BoolPtrInput
	// Determines which traffic the rate limit counts towards the threshold. By default matches all traffic in the zone.
	Match RateLimitMatchPtrInput
	// The time in seconds to count matching traffic. If the count exceeds threshold within this period the action will be performed.
	Period pulumi.IntInput
	// The threshold that triggers the rate limit mitigations, combine with period.
	Threshold pulumi.IntInput
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringInput
}

func (RateLimitArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*rateLimitArgs)(nil)).Elem()
}

type RateLimitInput interface {
	pulumi.Input

	ToRateLimitOutput() RateLimitOutput
	ToRateLimitOutputWithContext(ctx context.Context) RateLimitOutput
}

func (*RateLimit) ElementType() reflect.Type {
	return reflect.TypeOf((**RateLimit)(nil)).Elem()
}

func (i *RateLimit) ToRateLimitOutput() RateLimitOutput {
	return i.ToRateLimitOutputWithContext(context.Background())
}

func (i *RateLimit) ToRateLimitOutputWithContext(ctx context.Context) RateLimitOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RateLimitOutput)
}

// RateLimitArrayInput is an input type that accepts RateLimitArray and RateLimitArrayOutput values.
// You can construct a concrete instance of `RateLimitArrayInput` via:
//
//	RateLimitArray{ RateLimitArgs{...} }
type RateLimitArrayInput interface {
	pulumi.Input

	ToRateLimitArrayOutput() RateLimitArrayOutput
	ToRateLimitArrayOutputWithContext(context.Context) RateLimitArrayOutput
}

type RateLimitArray []RateLimitInput

func (RateLimitArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RateLimit)(nil)).Elem()
}

func (i RateLimitArray) ToRateLimitArrayOutput() RateLimitArrayOutput {
	return i.ToRateLimitArrayOutputWithContext(context.Background())
}

func (i RateLimitArray) ToRateLimitArrayOutputWithContext(ctx context.Context) RateLimitArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RateLimitArrayOutput)
}

// RateLimitMapInput is an input type that accepts RateLimitMap and RateLimitMapOutput values.
// You can construct a concrete instance of `RateLimitMapInput` via:
//
//	RateLimitMap{ "key": RateLimitArgs{...} }
type RateLimitMapInput interface {
	pulumi.Input

	ToRateLimitMapOutput() RateLimitMapOutput
	ToRateLimitMapOutputWithContext(context.Context) RateLimitMapOutput
}

type RateLimitMap map[string]RateLimitInput

func (RateLimitMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RateLimit)(nil)).Elem()
}

func (i RateLimitMap) ToRateLimitMapOutput() RateLimitMapOutput {
	return i.ToRateLimitMapOutputWithContext(context.Background())
}

func (i RateLimitMap) ToRateLimitMapOutputWithContext(ctx context.Context) RateLimitMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RateLimitMapOutput)
}

type RateLimitOutput struct{ *pulumi.OutputState }

func (RateLimitOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RateLimit)(nil)).Elem()
}

func (o RateLimitOutput) ToRateLimitOutput() RateLimitOutput {
	return o
}

func (o RateLimitOutput) ToRateLimitOutputWithContext(ctx context.Context) RateLimitOutput {
	return o
}

// The action to be performed when the threshold of matched traffic within the period defined is exceeded.
func (o RateLimitOutput) Action() RateLimitActionOutput {
	return o.ApplyT(func(v *RateLimit) RateLimitActionOutput { return v.Action }).(RateLimitActionOutput)
}

func (o RateLimitOutput) BypassUrlPatterns() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *RateLimit) pulumi.StringArrayOutput { return v.BypassUrlPatterns }).(pulumi.StringArrayOutput)
}

// Determines how rate limiting is applied. By default if not specified, rate limiting applies to the clients IP address.
func (o RateLimitOutput) Correlate() RateLimitCorrelatePtrOutput {
	return o.ApplyT(func(v *RateLimit) RateLimitCorrelatePtrOutput { return v.Correlate }).(RateLimitCorrelatePtrOutput)
}

// A note that you can use to describe the reason for a rate limit. This value is sanitized and all tags are removed.
func (o RateLimitOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *RateLimit) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Whether this ratelimit is currently disabled. Defaults to `false`.
func (o RateLimitOutput) Disabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *RateLimit) pulumi.BoolPtrOutput { return v.Disabled }).(pulumi.BoolPtrOutput)
}

// Determines which traffic the rate limit counts towards the threshold. By default matches all traffic in the zone.
func (o RateLimitOutput) Match() RateLimitMatchOutput {
	return o.ApplyT(func(v *RateLimit) RateLimitMatchOutput { return v.Match }).(RateLimitMatchOutput)
}

// The time in seconds to count matching traffic. If the count exceeds threshold within this period the action will be performed.
func (o RateLimitOutput) Period() pulumi.IntOutput {
	return o.ApplyT(func(v *RateLimit) pulumi.IntOutput { return v.Period }).(pulumi.IntOutput)
}

// The threshold that triggers the rate limit mitigations, combine with period.
func (o RateLimitOutput) Threshold() pulumi.IntOutput {
	return o.ApplyT(func(v *RateLimit) pulumi.IntOutput { return v.Threshold }).(pulumi.IntOutput)
}

// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
func (o RateLimitOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v *RateLimit) pulumi.StringOutput { return v.ZoneId }).(pulumi.StringOutput)
}

type RateLimitArrayOutput struct{ *pulumi.OutputState }

func (RateLimitArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RateLimit)(nil)).Elem()
}

func (o RateLimitArrayOutput) ToRateLimitArrayOutput() RateLimitArrayOutput {
	return o
}

func (o RateLimitArrayOutput) ToRateLimitArrayOutputWithContext(ctx context.Context) RateLimitArrayOutput {
	return o
}

func (o RateLimitArrayOutput) Index(i pulumi.IntInput) RateLimitOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *RateLimit {
		return vs[0].([]*RateLimit)[vs[1].(int)]
	}).(RateLimitOutput)
}

type RateLimitMapOutput struct{ *pulumi.OutputState }

func (RateLimitMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RateLimit)(nil)).Elem()
}

func (o RateLimitMapOutput) ToRateLimitMapOutput() RateLimitMapOutput {
	return o
}

func (o RateLimitMapOutput) ToRateLimitMapOutputWithContext(ctx context.Context) RateLimitMapOutput {
	return o
}

func (o RateLimitMapOutput) MapIndex(k pulumi.StringInput) RateLimitOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *RateLimit {
		return vs[0].(map[string]*RateLimit)[vs[1].(string)]
	}).(RateLimitOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RateLimitInput)(nil)).Elem(), &RateLimit{})
	pulumi.RegisterInputType(reflect.TypeOf((*RateLimitArrayInput)(nil)).Elem(), RateLimitArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RateLimitMapInput)(nil)).Elem(), RateLimitMap{})
	pulumi.RegisterOutputType(RateLimitOutput{})
	pulumi.RegisterOutputType(RateLimitArrayOutput{})
	pulumi.RegisterOutputType(RateLimitMapOutput{})
}
