// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Cloudflare Teams Location resource. Teams Locations are referenced
// when creating secure web gateway policies.
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
// 		_, err := cloudflare.NewTeamsLocation(ctx, "corporateOffice", &cloudflare.TeamsLocationArgs{
// 			AccountId:     pulumi.String("1d5fdc9e88c8a8c4518b068cd94331fe"),
// 			ClientDefault: pulumi.Bool(true),
// 			Name:          pulumi.String("office"),
// 			Networks: cloudflare.TeamsLocationNetworkArray{
// 				&cloudflare.TeamsLocationNetworkArgs{
// 					Network: pulumi.String("203.0.113.1/32"),
// 				},
// 				&cloudflare.TeamsLocationNetworkArgs{
// 					Network: pulumi.String("203.0.113.2/32"),
// 				},
// 			},
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
// Teams locations can be imported using a composite ID formed of account ID and teams location ID.
//
// ```sh
//  $ pulumi import cloudflare:index/teamsLocation:TeamsLocation corporate_office cb029e245cfdd66dc8d2e570d5dd3322/d41d8cd98f00b204e9800998ecf8427e
// ```
type TeamsLocation struct {
	pulumi.CustomResourceState

	// The account to which the teams location should be added.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// Indicator that anonymized logs are enabled.
	AnonymizedLogsEnabled pulumi.BoolOutput `pulumi:"anonymizedLogsEnabled"`
	// Indicator that this is the default location.
	ClientDefault pulumi.BoolPtrOutput `pulumi:"clientDefault"`
	// The FQDN that DoH clients should be pointed at.
	DohSubdomain pulumi.StringOutput `pulumi:"dohSubdomain"`
	// Client IP address
	Ip pulumi.StringOutput `pulumi:"ip"`
	// IP to direct all IPv4 DNS queries too.
	Ipv4Destination pulumi.StringOutput `pulumi:"ipv4Destination"`
	// Name of the teams location.
	Name pulumi.StringOutput `pulumi:"name"`
	// The networks CIDRs that comprise the location.
	Networks  TeamsLocationNetworkArrayOutput `pulumi:"networks"`
	PolicyIds pulumi.StringArrayOutput        `pulumi:"policyIds"`
}

// NewTeamsLocation registers a new resource with the given unique name, arguments, and options.
func NewTeamsLocation(ctx *pulumi.Context,
	name string, args *TeamsLocationArgs, opts ...pulumi.ResourceOption) (*TeamsLocation, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	if args.Name == nil {
		return nil, errors.New("invalid value for required argument 'Name'")
	}
	var resource TeamsLocation
	err := ctx.RegisterResource("cloudflare:index/teamsLocation:TeamsLocation", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTeamsLocation gets an existing TeamsLocation resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTeamsLocation(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TeamsLocationState, opts ...pulumi.ResourceOption) (*TeamsLocation, error) {
	var resource TeamsLocation
	err := ctx.ReadResource("cloudflare:index/teamsLocation:TeamsLocation", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TeamsLocation resources.
type teamsLocationState struct {
	// The account to which the teams location should be added.
	AccountId *string `pulumi:"accountId"`
	// Indicator that anonymized logs are enabled.
	AnonymizedLogsEnabled *bool `pulumi:"anonymizedLogsEnabled"`
	// Indicator that this is the default location.
	ClientDefault *bool `pulumi:"clientDefault"`
	// The FQDN that DoH clients should be pointed at.
	DohSubdomain *string `pulumi:"dohSubdomain"`
	// Client IP address
	Ip *string `pulumi:"ip"`
	// IP to direct all IPv4 DNS queries too.
	Ipv4Destination *string `pulumi:"ipv4Destination"`
	// Name of the teams location.
	Name *string `pulumi:"name"`
	// The networks CIDRs that comprise the location.
	Networks  []TeamsLocationNetwork `pulumi:"networks"`
	PolicyIds []string               `pulumi:"policyIds"`
}

type TeamsLocationState struct {
	// The account to which the teams location should be added.
	AccountId pulumi.StringPtrInput
	// Indicator that anonymized logs are enabled.
	AnonymizedLogsEnabled pulumi.BoolPtrInput
	// Indicator that this is the default location.
	ClientDefault pulumi.BoolPtrInput
	// The FQDN that DoH clients should be pointed at.
	DohSubdomain pulumi.StringPtrInput
	// Client IP address
	Ip pulumi.StringPtrInput
	// IP to direct all IPv4 DNS queries too.
	Ipv4Destination pulumi.StringPtrInput
	// Name of the teams location.
	Name pulumi.StringPtrInput
	// The networks CIDRs that comprise the location.
	Networks  TeamsLocationNetworkArrayInput
	PolicyIds pulumi.StringArrayInput
}

func (TeamsLocationState) ElementType() reflect.Type {
	return reflect.TypeOf((*teamsLocationState)(nil)).Elem()
}

type teamsLocationArgs struct {
	// The account to which the teams location should be added.
	AccountId string `pulumi:"accountId"`
	// Indicator that this is the default location.
	ClientDefault *bool `pulumi:"clientDefault"`
	// Name of the teams location.
	Name string `pulumi:"name"`
	// The networks CIDRs that comprise the location.
	Networks []TeamsLocationNetwork `pulumi:"networks"`
}

// The set of arguments for constructing a TeamsLocation resource.
type TeamsLocationArgs struct {
	// The account to which the teams location should be added.
	AccountId pulumi.StringInput
	// Indicator that this is the default location.
	ClientDefault pulumi.BoolPtrInput
	// Name of the teams location.
	Name pulumi.StringInput
	// The networks CIDRs that comprise the location.
	Networks TeamsLocationNetworkArrayInput
}

func (TeamsLocationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*teamsLocationArgs)(nil)).Elem()
}

type TeamsLocationInput interface {
	pulumi.Input

	ToTeamsLocationOutput() TeamsLocationOutput
	ToTeamsLocationOutputWithContext(ctx context.Context) TeamsLocationOutput
}

func (*TeamsLocation) ElementType() reflect.Type {
	return reflect.TypeOf((*TeamsLocation)(nil))
}

func (i *TeamsLocation) ToTeamsLocationOutput() TeamsLocationOutput {
	return i.ToTeamsLocationOutputWithContext(context.Background())
}

func (i *TeamsLocation) ToTeamsLocationOutputWithContext(ctx context.Context) TeamsLocationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TeamsLocationOutput)
}

func (i *TeamsLocation) ToTeamsLocationPtrOutput() TeamsLocationPtrOutput {
	return i.ToTeamsLocationPtrOutputWithContext(context.Background())
}

func (i *TeamsLocation) ToTeamsLocationPtrOutputWithContext(ctx context.Context) TeamsLocationPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TeamsLocationPtrOutput)
}

type TeamsLocationPtrInput interface {
	pulumi.Input

	ToTeamsLocationPtrOutput() TeamsLocationPtrOutput
	ToTeamsLocationPtrOutputWithContext(ctx context.Context) TeamsLocationPtrOutput
}

type teamsLocationPtrType TeamsLocationArgs

func (*teamsLocationPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**TeamsLocation)(nil))
}

func (i *teamsLocationPtrType) ToTeamsLocationPtrOutput() TeamsLocationPtrOutput {
	return i.ToTeamsLocationPtrOutputWithContext(context.Background())
}

func (i *teamsLocationPtrType) ToTeamsLocationPtrOutputWithContext(ctx context.Context) TeamsLocationPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TeamsLocationPtrOutput)
}

// TeamsLocationArrayInput is an input type that accepts TeamsLocationArray and TeamsLocationArrayOutput values.
// You can construct a concrete instance of `TeamsLocationArrayInput` via:
//
//          TeamsLocationArray{ TeamsLocationArgs{...} }
type TeamsLocationArrayInput interface {
	pulumi.Input

	ToTeamsLocationArrayOutput() TeamsLocationArrayOutput
	ToTeamsLocationArrayOutputWithContext(context.Context) TeamsLocationArrayOutput
}

type TeamsLocationArray []TeamsLocationInput

func (TeamsLocationArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*TeamsLocation)(nil))
}

func (i TeamsLocationArray) ToTeamsLocationArrayOutput() TeamsLocationArrayOutput {
	return i.ToTeamsLocationArrayOutputWithContext(context.Background())
}

func (i TeamsLocationArray) ToTeamsLocationArrayOutputWithContext(ctx context.Context) TeamsLocationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TeamsLocationArrayOutput)
}

// TeamsLocationMapInput is an input type that accepts TeamsLocationMap and TeamsLocationMapOutput values.
// You can construct a concrete instance of `TeamsLocationMapInput` via:
//
//          TeamsLocationMap{ "key": TeamsLocationArgs{...} }
type TeamsLocationMapInput interface {
	pulumi.Input

	ToTeamsLocationMapOutput() TeamsLocationMapOutput
	ToTeamsLocationMapOutputWithContext(context.Context) TeamsLocationMapOutput
}

type TeamsLocationMap map[string]TeamsLocationInput

func (TeamsLocationMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*TeamsLocation)(nil))
}

func (i TeamsLocationMap) ToTeamsLocationMapOutput() TeamsLocationMapOutput {
	return i.ToTeamsLocationMapOutputWithContext(context.Background())
}

func (i TeamsLocationMap) ToTeamsLocationMapOutputWithContext(ctx context.Context) TeamsLocationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TeamsLocationMapOutput)
}

type TeamsLocationOutput struct {
	*pulumi.OutputState
}

func (TeamsLocationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*TeamsLocation)(nil))
}

func (o TeamsLocationOutput) ToTeamsLocationOutput() TeamsLocationOutput {
	return o
}

func (o TeamsLocationOutput) ToTeamsLocationOutputWithContext(ctx context.Context) TeamsLocationOutput {
	return o
}

func (o TeamsLocationOutput) ToTeamsLocationPtrOutput() TeamsLocationPtrOutput {
	return o.ToTeamsLocationPtrOutputWithContext(context.Background())
}

func (o TeamsLocationOutput) ToTeamsLocationPtrOutputWithContext(ctx context.Context) TeamsLocationPtrOutput {
	return o.ApplyT(func(v TeamsLocation) *TeamsLocation {
		return &v
	}).(TeamsLocationPtrOutput)
}

type TeamsLocationPtrOutput struct {
	*pulumi.OutputState
}

func (TeamsLocationPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**TeamsLocation)(nil))
}

func (o TeamsLocationPtrOutput) ToTeamsLocationPtrOutput() TeamsLocationPtrOutput {
	return o
}

func (o TeamsLocationPtrOutput) ToTeamsLocationPtrOutputWithContext(ctx context.Context) TeamsLocationPtrOutput {
	return o
}

type TeamsLocationArrayOutput struct{ *pulumi.OutputState }

func (TeamsLocationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]TeamsLocation)(nil))
}

func (o TeamsLocationArrayOutput) ToTeamsLocationArrayOutput() TeamsLocationArrayOutput {
	return o
}

func (o TeamsLocationArrayOutput) ToTeamsLocationArrayOutputWithContext(ctx context.Context) TeamsLocationArrayOutput {
	return o
}

func (o TeamsLocationArrayOutput) Index(i pulumi.IntInput) TeamsLocationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) TeamsLocation {
		return vs[0].([]TeamsLocation)[vs[1].(int)]
	}).(TeamsLocationOutput)
}

type TeamsLocationMapOutput struct{ *pulumi.OutputState }

func (TeamsLocationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]TeamsLocation)(nil))
}

func (o TeamsLocationMapOutput) ToTeamsLocationMapOutput() TeamsLocationMapOutput {
	return o
}

func (o TeamsLocationMapOutput) ToTeamsLocationMapOutputWithContext(ctx context.Context) TeamsLocationMapOutput {
	return o
}

func (o TeamsLocationMapOutput) MapIndex(k pulumi.StringInput) TeamsLocationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) TeamsLocation {
		return vs[0].(map[string]TeamsLocation)[vs[1].(string)]
	}).(TeamsLocationOutput)
}

func init() {
	pulumi.RegisterOutputType(TeamsLocationOutput{})
	pulumi.RegisterOutputType(TeamsLocationPtrOutput{})
	pulumi.RegisterOutputType(TeamsLocationArrayOutput{})
	pulumi.RegisterOutputType(TeamsLocationMapOutput{})
}
