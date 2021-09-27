// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Cloudflare Teams Account resource. The Teams Account resource defines configuration for secure web gateway.
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
// 		_, err := cloudflare.NewTeamsAccount(ctx, "main", &cloudflare.TeamsAccountArgs{
// 			AccountId: pulumi.String("1d5fdc9e88c8a8c4518b068cd94331fe"),
// 			BlockPage: &cloudflare.TeamsAccountBlockPageArgs{
// 				BackgroundColor: pulumi.String("#000000"),
// 				FooterText:      pulumi.String("hello"),
// 				HeaderText:      pulumi.String("hello"),
// 				LogoPath:        pulumi.String("https://google.com"),
// 			},
// 			TlsDecryptEnabled: pulumi.Bool(true),
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
// Since a Teams account does not have a unique resource ID, configuration can be imported using the account ID.
//
// ```sh
//  $ pulumi import cloudflare:index/teamsAccount:TeamsAccount example cb029e245cfdd66dc8d2e570d5dd3322
// ```
type TeamsAccount struct {
	pulumi.CustomResourceState

	// The account to which the teams location should be added.
	AccountId          pulumi.StringOutput  `pulumi:"accountId"`
	ActivityLogEnabled pulumi.BoolPtrOutput `pulumi:"activityLogEnabled"`
	// Configuration for antivirus traffic scanning.
	Antivirus TeamsAccountAntivirusPtrOutput `pulumi:"antivirus"`
	// Configuration for a custom block page.
	BlockPage TeamsAccountBlockPagePtrOutput `pulumi:"blockPage"`
	// Indicator that decryption of TLS traffic is enabled.
	TlsDecryptEnabled pulumi.BoolPtrOutput `pulumi:"tlsDecryptEnabled"`
}

// NewTeamsAccount registers a new resource with the given unique name, arguments, and options.
func NewTeamsAccount(ctx *pulumi.Context,
	name string, args *TeamsAccountArgs, opts ...pulumi.ResourceOption) (*TeamsAccount, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	var resource TeamsAccount
	err := ctx.RegisterResource("cloudflare:index/teamsAccount:TeamsAccount", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTeamsAccount gets an existing TeamsAccount resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTeamsAccount(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TeamsAccountState, opts ...pulumi.ResourceOption) (*TeamsAccount, error) {
	var resource TeamsAccount
	err := ctx.ReadResource("cloudflare:index/teamsAccount:TeamsAccount", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TeamsAccount resources.
type teamsAccountState struct {
	// The account to which the teams location should be added.
	AccountId          *string `pulumi:"accountId"`
	ActivityLogEnabled *bool   `pulumi:"activityLogEnabled"`
	// Configuration for antivirus traffic scanning.
	Antivirus *TeamsAccountAntivirus `pulumi:"antivirus"`
	// Configuration for a custom block page.
	BlockPage *TeamsAccountBlockPage `pulumi:"blockPage"`
	// Indicator that decryption of TLS traffic is enabled.
	TlsDecryptEnabled *bool `pulumi:"tlsDecryptEnabled"`
}

type TeamsAccountState struct {
	// The account to which the teams location should be added.
	AccountId          pulumi.StringPtrInput
	ActivityLogEnabled pulumi.BoolPtrInput
	// Configuration for antivirus traffic scanning.
	Antivirus TeamsAccountAntivirusPtrInput
	// Configuration for a custom block page.
	BlockPage TeamsAccountBlockPagePtrInput
	// Indicator that decryption of TLS traffic is enabled.
	TlsDecryptEnabled pulumi.BoolPtrInput
}

func (TeamsAccountState) ElementType() reflect.Type {
	return reflect.TypeOf((*teamsAccountState)(nil)).Elem()
}

type teamsAccountArgs struct {
	// The account to which the teams location should be added.
	AccountId          string `pulumi:"accountId"`
	ActivityLogEnabled *bool  `pulumi:"activityLogEnabled"`
	// Configuration for antivirus traffic scanning.
	Antivirus *TeamsAccountAntivirus `pulumi:"antivirus"`
	// Configuration for a custom block page.
	BlockPage *TeamsAccountBlockPage `pulumi:"blockPage"`
	// Indicator that decryption of TLS traffic is enabled.
	TlsDecryptEnabled *bool `pulumi:"tlsDecryptEnabled"`
}

// The set of arguments for constructing a TeamsAccount resource.
type TeamsAccountArgs struct {
	// The account to which the teams location should be added.
	AccountId          pulumi.StringInput
	ActivityLogEnabled pulumi.BoolPtrInput
	// Configuration for antivirus traffic scanning.
	Antivirus TeamsAccountAntivirusPtrInput
	// Configuration for a custom block page.
	BlockPage TeamsAccountBlockPagePtrInput
	// Indicator that decryption of TLS traffic is enabled.
	TlsDecryptEnabled pulumi.BoolPtrInput
}

func (TeamsAccountArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*teamsAccountArgs)(nil)).Elem()
}

type TeamsAccountInput interface {
	pulumi.Input

	ToTeamsAccountOutput() TeamsAccountOutput
	ToTeamsAccountOutputWithContext(ctx context.Context) TeamsAccountOutput
}

func (*TeamsAccount) ElementType() reflect.Type {
	return reflect.TypeOf((*TeamsAccount)(nil))
}

func (i *TeamsAccount) ToTeamsAccountOutput() TeamsAccountOutput {
	return i.ToTeamsAccountOutputWithContext(context.Background())
}

func (i *TeamsAccount) ToTeamsAccountOutputWithContext(ctx context.Context) TeamsAccountOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TeamsAccountOutput)
}

func (i *TeamsAccount) ToTeamsAccountPtrOutput() TeamsAccountPtrOutput {
	return i.ToTeamsAccountPtrOutputWithContext(context.Background())
}

func (i *TeamsAccount) ToTeamsAccountPtrOutputWithContext(ctx context.Context) TeamsAccountPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TeamsAccountPtrOutput)
}

type TeamsAccountPtrInput interface {
	pulumi.Input

	ToTeamsAccountPtrOutput() TeamsAccountPtrOutput
	ToTeamsAccountPtrOutputWithContext(ctx context.Context) TeamsAccountPtrOutput
}

type teamsAccountPtrType TeamsAccountArgs

func (*teamsAccountPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**TeamsAccount)(nil))
}

func (i *teamsAccountPtrType) ToTeamsAccountPtrOutput() TeamsAccountPtrOutput {
	return i.ToTeamsAccountPtrOutputWithContext(context.Background())
}

func (i *teamsAccountPtrType) ToTeamsAccountPtrOutputWithContext(ctx context.Context) TeamsAccountPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TeamsAccountPtrOutput)
}

// TeamsAccountArrayInput is an input type that accepts TeamsAccountArray and TeamsAccountArrayOutput values.
// You can construct a concrete instance of `TeamsAccountArrayInput` via:
//
//          TeamsAccountArray{ TeamsAccountArgs{...} }
type TeamsAccountArrayInput interface {
	pulumi.Input

	ToTeamsAccountArrayOutput() TeamsAccountArrayOutput
	ToTeamsAccountArrayOutputWithContext(context.Context) TeamsAccountArrayOutput
}

type TeamsAccountArray []TeamsAccountInput

func (TeamsAccountArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*TeamsAccount)(nil))
}

func (i TeamsAccountArray) ToTeamsAccountArrayOutput() TeamsAccountArrayOutput {
	return i.ToTeamsAccountArrayOutputWithContext(context.Background())
}

func (i TeamsAccountArray) ToTeamsAccountArrayOutputWithContext(ctx context.Context) TeamsAccountArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TeamsAccountArrayOutput)
}

// TeamsAccountMapInput is an input type that accepts TeamsAccountMap and TeamsAccountMapOutput values.
// You can construct a concrete instance of `TeamsAccountMapInput` via:
//
//          TeamsAccountMap{ "key": TeamsAccountArgs{...} }
type TeamsAccountMapInput interface {
	pulumi.Input

	ToTeamsAccountMapOutput() TeamsAccountMapOutput
	ToTeamsAccountMapOutputWithContext(context.Context) TeamsAccountMapOutput
}

type TeamsAccountMap map[string]TeamsAccountInput

func (TeamsAccountMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*TeamsAccount)(nil))
}

func (i TeamsAccountMap) ToTeamsAccountMapOutput() TeamsAccountMapOutput {
	return i.ToTeamsAccountMapOutputWithContext(context.Background())
}

func (i TeamsAccountMap) ToTeamsAccountMapOutputWithContext(ctx context.Context) TeamsAccountMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TeamsAccountMapOutput)
}

type TeamsAccountOutput struct {
	*pulumi.OutputState
}

func (TeamsAccountOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*TeamsAccount)(nil))
}

func (o TeamsAccountOutput) ToTeamsAccountOutput() TeamsAccountOutput {
	return o
}

func (o TeamsAccountOutput) ToTeamsAccountOutputWithContext(ctx context.Context) TeamsAccountOutput {
	return o
}

func (o TeamsAccountOutput) ToTeamsAccountPtrOutput() TeamsAccountPtrOutput {
	return o.ToTeamsAccountPtrOutputWithContext(context.Background())
}

func (o TeamsAccountOutput) ToTeamsAccountPtrOutputWithContext(ctx context.Context) TeamsAccountPtrOutput {
	return o.ApplyT(func(v TeamsAccount) *TeamsAccount {
		return &v
	}).(TeamsAccountPtrOutput)
}

type TeamsAccountPtrOutput struct {
	*pulumi.OutputState
}

func (TeamsAccountPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**TeamsAccount)(nil))
}

func (o TeamsAccountPtrOutput) ToTeamsAccountPtrOutput() TeamsAccountPtrOutput {
	return o
}

func (o TeamsAccountPtrOutput) ToTeamsAccountPtrOutputWithContext(ctx context.Context) TeamsAccountPtrOutput {
	return o
}

type TeamsAccountArrayOutput struct{ *pulumi.OutputState }

func (TeamsAccountArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]TeamsAccount)(nil))
}

func (o TeamsAccountArrayOutput) ToTeamsAccountArrayOutput() TeamsAccountArrayOutput {
	return o
}

func (o TeamsAccountArrayOutput) ToTeamsAccountArrayOutputWithContext(ctx context.Context) TeamsAccountArrayOutput {
	return o
}

func (o TeamsAccountArrayOutput) Index(i pulumi.IntInput) TeamsAccountOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) TeamsAccount {
		return vs[0].([]TeamsAccount)[vs[1].(int)]
	}).(TeamsAccountOutput)
}

type TeamsAccountMapOutput struct{ *pulumi.OutputState }

func (TeamsAccountMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]TeamsAccount)(nil))
}

func (o TeamsAccountMapOutput) ToTeamsAccountMapOutput() TeamsAccountMapOutput {
	return o
}

func (o TeamsAccountMapOutput) ToTeamsAccountMapOutputWithContext(ctx context.Context) TeamsAccountMapOutput {
	return o
}

func (o TeamsAccountMapOutput) MapIndex(k pulumi.StringInput) TeamsAccountOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) TeamsAccount {
		return vs[0].(map[string]TeamsAccount)[vs[1].(string)]
	}).(TeamsAccountOutput)
}

func init() {
	pulumi.RegisterOutputType(TeamsAccountOutput{})
	pulumi.RegisterOutputType(TeamsAccountPtrOutput{})
	pulumi.RegisterOutputType(TeamsAccountArrayOutput{})
	pulumi.RegisterOutputType(TeamsAccountMapOutput{})
}
