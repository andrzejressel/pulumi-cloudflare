// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-cloudflare/sdk/v5/go/cloudflare/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Provides a Cloudflare Teams List resource. Teams lists are
// referenced when creating secure web gateway policies or device
// posture rules.
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
//			_, err := cloudflare.NewTeamsList(ctx, "example", &cloudflare.TeamsListArgs{
//				AccountId:   pulumi.String("f037e56e89293a057740de681ac9abbe"),
//				Description: pulumi.String("Serial numbers for all corporate devices."),
//				Items: pulumi.StringArray{
//					pulumi.String("8GE8721REF"),
//					pulumi.String("5RE8543EGG"),
//					pulumi.String("1YE2880LNP"),
//				},
//				Name: pulumi.String("Corporate devices"),
//				Type: pulumi.String("SERIAL"),
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
//	$ pulumi import cloudflare:index/teamsList:TeamsList example <account_id>/<teams_list_id>
//
// ```
type TeamsList struct {
	pulumi.CustomResourceState

	// The account identifier to target for the resource.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// The description of the teams list.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The items of the teams list.
	Items pulumi.StringArrayOutput `pulumi:"items"`
	// Name of the teams list.
	Name pulumi.StringOutput `pulumi:"name"`
	// The teams list type. Available values: `IP`, `SERIAL`, `URL`, `DOMAIN`, `EMAIL`.
	Type pulumi.StringOutput `pulumi:"type"`
}

// NewTeamsList registers a new resource with the given unique name, arguments, and options.
func NewTeamsList(ctx *pulumi.Context,
	name string, args *TeamsListArgs, opts ...pulumi.ResourceOption) (*TeamsList, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	if args.Name == nil {
		return nil, errors.New("invalid value for required argument 'Name'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource TeamsList
	err := ctx.RegisterResource("cloudflare:index/teamsList:TeamsList", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTeamsList gets an existing TeamsList resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTeamsList(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TeamsListState, opts ...pulumi.ResourceOption) (*TeamsList, error) {
	var resource TeamsList
	err := ctx.ReadResource("cloudflare:index/teamsList:TeamsList", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TeamsList resources.
type teamsListState struct {
	// The account identifier to target for the resource.
	AccountId *string `pulumi:"accountId"`
	// The description of the teams list.
	Description *string `pulumi:"description"`
	// The items of the teams list.
	Items []string `pulumi:"items"`
	// Name of the teams list.
	Name *string `pulumi:"name"`
	// The teams list type. Available values: `IP`, `SERIAL`, `URL`, `DOMAIN`, `EMAIL`.
	Type *string `pulumi:"type"`
}

type TeamsListState struct {
	// The account identifier to target for the resource.
	AccountId pulumi.StringPtrInput
	// The description of the teams list.
	Description pulumi.StringPtrInput
	// The items of the teams list.
	Items pulumi.StringArrayInput
	// Name of the teams list.
	Name pulumi.StringPtrInput
	// The teams list type. Available values: `IP`, `SERIAL`, `URL`, `DOMAIN`, `EMAIL`.
	Type pulumi.StringPtrInput
}

func (TeamsListState) ElementType() reflect.Type {
	return reflect.TypeOf((*teamsListState)(nil)).Elem()
}

type teamsListArgs struct {
	// The account identifier to target for the resource.
	AccountId string `pulumi:"accountId"`
	// The description of the teams list.
	Description *string `pulumi:"description"`
	// The items of the teams list.
	Items []string `pulumi:"items"`
	// Name of the teams list.
	Name string `pulumi:"name"`
	// The teams list type. Available values: `IP`, `SERIAL`, `URL`, `DOMAIN`, `EMAIL`.
	Type string `pulumi:"type"`
}

// The set of arguments for constructing a TeamsList resource.
type TeamsListArgs struct {
	// The account identifier to target for the resource.
	AccountId pulumi.StringInput
	// The description of the teams list.
	Description pulumi.StringPtrInput
	// The items of the teams list.
	Items pulumi.StringArrayInput
	// Name of the teams list.
	Name pulumi.StringInput
	// The teams list type. Available values: `IP`, `SERIAL`, `URL`, `DOMAIN`, `EMAIL`.
	Type pulumi.StringInput
}

func (TeamsListArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*teamsListArgs)(nil)).Elem()
}

type TeamsListInput interface {
	pulumi.Input

	ToTeamsListOutput() TeamsListOutput
	ToTeamsListOutputWithContext(ctx context.Context) TeamsListOutput
}

func (*TeamsList) ElementType() reflect.Type {
	return reflect.TypeOf((**TeamsList)(nil)).Elem()
}

func (i *TeamsList) ToTeamsListOutput() TeamsListOutput {
	return i.ToTeamsListOutputWithContext(context.Background())
}

func (i *TeamsList) ToTeamsListOutputWithContext(ctx context.Context) TeamsListOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TeamsListOutput)
}

func (i *TeamsList) ToOutput(ctx context.Context) pulumix.Output[*TeamsList] {
	return pulumix.Output[*TeamsList]{
		OutputState: i.ToTeamsListOutputWithContext(ctx).OutputState,
	}
}

// TeamsListArrayInput is an input type that accepts TeamsListArray and TeamsListArrayOutput values.
// You can construct a concrete instance of `TeamsListArrayInput` via:
//
//	TeamsListArray{ TeamsListArgs{...} }
type TeamsListArrayInput interface {
	pulumi.Input

	ToTeamsListArrayOutput() TeamsListArrayOutput
	ToTeamsListArrayOutputWithContext(context.Context) TeamsListArrayOutput
}

type TeamsListArray []TeamsListInput

func (TeamsListArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TeamsList)(nil)).Elem()
}

func (i TeamsListArray) ToTeamsListArrayOutput() TeamsListArrayOutput {
	return i.ToTeamsListArrayOutputWithContext(context.Background())
}

func (i TeamsListArray) ToTeamsListArrayOutputWithContext(ctx context.Context) TeamsListArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TeamsListArrayOutput)
}

func (i TeamsListArray) ToOutput(ctx context.Context) pulumix.Output[[]*TeamsList] {
	return pulumix.Output[[]*TeamsList]{
		OutputState: i.ToTeamsListArrayOutputWithContext(ctx).OutputState,
	}
}

// TeamsListMapInput is an input type that accepts TeamsListMap and TeamsListMapOutput values.
// You can construct a concrete instance of `TeamsListMapInput` via:
//
//	TeamsListMap{ "key": TeamsListArgs{...} }
type TeamsListMapInput interface {
	pulumi.Input

	ToTeamsListMapOutput() TeamsListMapOutput
	ToTeamsListMapOutputWithContext(context.Context) TeamsListMapOutput
}

type TeamsListMap map[string]TeamsListInput

func (TeamsListMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TeamsList)(nil)).Elem()
}

func (i TeamsListMap) ToTeamsListMapOutput() TeamsListMapOutput {
	return i.ToTeamsListMapOutputWithContext(context.Background())
}

func (i TeamsListMap) ToTeamsListMapOutputWithContext(ctx context.Context) TeamsListMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TeamsListMapOutput)
}

func (i TeamsListMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*TeamsList] {
	return pulumix.Output[map[string]*TeamsList]{
		OutputState: i.ToTeamsListMapOutputWithContext(ctx).OutputState,
	}
}

type TeamsListOutput struct{ *pulumi.OutputState }

func (TeamsListOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**TeamsList)(nil)).Elem()
}

func (o TeamsListOutput) ToTeamsListOutput() TeamsListOutput {
	return o
}

func (o TeamsListOutput) ToTeamsListOutputWithContext(ctx context.Context) TeamsListOutput {
	return o
}

func (o TeamsListOutput) ToOutput(ctx context.Context) pulumix.Output[*TeamsList] {
	return pulumix.Output[*TeamsList]{
		OutputState: o.OutputState,
	}
}

// The account identifier to target for the resource.
func (o TeamsListOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *TeamsList) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// The description of the teams list.
func (o TeamsListOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TeamsList) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The items of the teams list.
func (o TeamsListOutput) Items() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *TeamsList) pulumi.StringArrayOutput { return v.Items }).(pulumi.StringArrayOutput)
}

// Name of the teams list.
func (o TeamsListOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *TeamsList) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The teams list type. Available values: `IP`, `SERIAL`, `URL`, `DOMAIN`, `EMAIL`.
func (o TeamsListOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *TeamsList) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

type TeamsListArrayOutput struct{ *pulumi.OutputState }

func (TeamsListArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TeamsList)(nil)).Elem()
}

func (o TeamsListArrayOutput) ToTeamsListArrayOutput() TeamsListArrayOutput {
	return o
}

func (o TeamsListArrayOutput) ToTeamsListArrayOutputWithContext(ctx context.Context) TeamsListArrayOutput {
	return o
}

func (o TeamsListArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*TeamsList] {
	return pulumix.Output[[]*TeamsList]{
		OutputState: o.OutputState,
	}
}

func (o TeamsListArrayOutput) Index(i pulumi.IntInput) TeamsListOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *TeamsList {
		return vs[0].([]*TeamsList)[vs[1].(int)]
	}).(TeamsListOutput)
}

type TeamsListMapOutput struct{ *pulumi.OutputState }

func (TeamsListMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TeamsList)(nil)).Elem()
}

func (o TeamsListMapOutput) ToTeamsListMapOutput() TeamsListMapOutput {
	return o
}

func (o TeamsListMapOutput) ToTeamsListMapOutputWithContext(ctx context.Context) TeamsListMapOutput {
	return o
}

func (o TeamsListMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*TeamsList] {
	return pulumix.Output[map[string]*TeamsList]{
		OutputState: o.OutputState,
	}
}

func (o TeamsListMapOutput) MapIndex(k pulumi.StringInput) TeamsListOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *TeamsList {
		return vs[0].(map[string]*TeamsList)[vs[1].(string)]
	}).(TeamsListOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TeamsListInput)(nil)).Elem(), &TeamsList{})
	pulumi.RegisterInputType(reflect.TypeOf((*TeamsListArrayInput)(nil)).Elem(), TeamsListArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TeamsListMapInput)(nil)).Elem(), TeamsListMap{})
	pulumi.RegisterOutputType(TeamsListOutput{})
	pulumi.RegisterOutputType(TeamsListArrayOutput{})
	pulumi.RegisterOutputType(TeamsListMapOutput{})
}
