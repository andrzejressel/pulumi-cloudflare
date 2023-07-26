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

// Provides a Cloudflare Access Policy resource. Access Policies are
// used in conjunction with Access Applications to restrict access to
// a particular resource.
//
// > It's required that an `accountId` or `zoneId` is provided and in
// most cases using either is fine. However, if you're using a scoped
// access token, you must provide the argument that matches the token's
// scope. For example, an access token that is scoped to the "example.com"
// zone needs to use the `zoneId` argument.
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
//			_, err := cloudflare.NewAccessPolicy(ctx, "testPolicyAccessPolicy", &cloudflare.AccessPolicyArgs{
//				ApplicationId: pulumi.String("cb029e245cfdd66dc8d2e570d5dd3322"),
//				ZoneId:        pulumi.String("0da42c8d2132a9ddaf714f9e7c920711"),
//				Name:          pulumi.String("staging policy"),
//				Precedence:    pulumi.Int(1),
//				Decision:      pulumi.String("allow"),
//				Includes: cloudflare.AccessPolicyIncludeArray{
//					&cloudflare.AccessPolicyIncludeArgs{
//						Emails: pulumi.StringArray{
//							pulumi.String("test@example.com"),
//						},
//					},
//				},
//				Requires: cloudflare.AccessPolicyRequireArray{
//					&cloudflare.AccessPolicyRequireArgs{
//						Emails: pulumi.StringArray{
//							pulumi.String("test@example.com"),
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = cloudflare.NewAccessPolicy(ctx, "testPolicyIndex/accessPolicyAccessPolicy", &cloudflare.AccessPolicyArgs{
//				ApplicationId: pulumi.String("cb029e245cfdd66dc8d2e570d5dd3322"),
//				ZoneId:        pulumi.String("0da42c8d2132a9ddaf714f9e7c920711"),
//				Name:          pulumi.String("staging policy"),
//				Precedence:    pulumi.Int(1),
//				Decision:      pulumi.String("allow"),
//				Includes: cloudflare.AccessPolicyIncludeArray{
//					&cloudflare.AccessPolicyIncludeArgs{
//						Emails: pulumi.StringArray{
//							pulumi.String("test@example.com"),
//						},
//					},
//				},
//				Requires: cloudflare.AccessPolicyRequireArray{
//					&cloudflare.AccessPolicyRequireArgs{
//						Ips: pulumi.StringArray{
//							_var.Office_ip,
//						},
//					},
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
// Account level import.
//
// ```sh
//
//	$ pulumi import cloudflare:index/accessPolicy:AccessPolicy example account/<account_id>/<application_id>/<policy_id>
//
// ```
//
//	Zone level import.
//
// ```sh
//
//	$ pulumi import cloudflare:index/accessPolicy:AccessPolicy example zone/<zone_id>/<application_id>/<policy_id>
//
// ```
type AccessPolicy struct {
	pulumi.CustomResourceState

	// The account identifier to target for the resource. Conflicts with `zoneId`.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// The ID of the application the policy is associated with.
	ApplicationId    pulumi.StringOutput                  `pulumi:"applicationId"`
	ApprovalGroups   AccessPolicyApprovalGroupArrayOutput `pulumi:"approvalGroups"`
	ApprovalRequired pulumi.BoolPtrOutput                 `pulumi:"approvalRequired"`
	// Defines the action Access will take if the policy matches the user. Available values: `allow`, `deny`, `nonIdentity`, `bypass`.
	Decision pulumi.StringOutput `pulumi:"decision"`
	// A series of access conditions, see Access Groups.
	Excludes AccessPolicyExcludeArrayOutput `pulumi:"excludes"`
	// A series of access conditions, see Access Groups.
	Includes AccessPolicyIncludeArrayOutput `pulumi:"includes"`
	// Require this application to be served in an isolated browser for users matching this policy.
	IsolationRequired pulumi.BoolPtrOutput `pulumi:"isolationRequired"`
	// Friendly name of the Access Policy.
	Name pulumi.StringOutput `pulumi:"name"`
	// The unique precedence for policies on a single application.
	Precedence pulumi.IntOutput `pulumi:"precedence"`
	// The prompt to display to the user for a justification for accessing the resource. Required when using `purposeJustificationRequired`.
	PurposeJustificationPrompt pulumi.StringPtrOutput `pulumi:"purposeJustificationPrompt"`
	// Whether to prompt the user for a justification for accessing the resource.
	PurposeJustificationRequired pulumi.BoolPtrOutput `pulumi:"purposeJustificationRequired"`
	// A series of access conditions, see Access Groups.
	Requires AccessPolicyRequireArrayOutput `pulumi:"requires"`
	// The zone identifier to target for the resource. Conflicts with `accountId`.
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewAccessPolicy registers a new resource with the given unique name, arguments, and options.
func NewAccessPolicy(ctx *pulumi.Context,
	name string, args *AccessPolicyArgs, opts ...pulumi.ResourceOption) (*AccessPolicy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ApplicationId == nil {
		return nil, errors.New("invalid value for required argument 'ApplicationId'")
	}
	if args.Decision == nil {
		return nil, errors.New("invalid value for required argument 'Decision'")
	}
	if args.Includes == nil {
		return nil, errors.New("invalid value for required argument 'Includes'")
	}
	if args.Name == nil {
		return nil, errors.New("invalid value for required argument 'Name'")
	}
	if args.Precedence == nil {
		return nil, errors.New("invalid value for required argument 'Precedence'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AccessPolicy
	err := ctx.RegisterResource("cloudflare:index/accessPolicy:AccessPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAccessPolicy gets an existing AccessPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAccessPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AccessPolicyState, opts ...pulumi.ResourceOption) (*AccessPolicy, error) {
	var resource AccessPolicy
	err := ctx.ReadResource("cloudflare:index/accessPolicy:AccessPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AccessPolicy resources.
type accessPolicyState struct {
	// The account identifier to target for the resource. Conflicts with `zoneId`.
	AccountId *string `pulumi:"accountId"`
	// The ID of the application the policy is associated with.
	ApplicationId    *string                     `pulumi:"applicationId"`
	ApprovalGroups   []AccessPolicyApprovalGroup `pulumi:"approvalGroups"`
	ApprovalRequired *bool                       `pulumi:"approvalRequired"`
	// Defines the action Access will take if the policy matches the user. Available values: `allow`, `deny`, `nonIdentity`, `bypass`.
	Decision *string `pulumi:"decision"`
	// A series of access conditions, see Access Groups.
	Excludes []AccessPolicyExclude `pulumi:"excludes"`
	// A series of access conditions, see Access Groups.
	Includes []AccessPolicyInclude `pulumi:"includes"`
	// Require this application to be served in an isolated browser for users matching this policy.
	IsolationRequired *bool `pulumi:"isolationRequired"`
	// Friendly name of the Access Policy.
	Name *string `pulumi:"name"`
	// The unique precedence for policies on a single application.
	Precedence *int `pulumi:"precedence"`
	// The prompt to display to the user for a justification for accessing the resource. Required when using `purposeJustificationRequired`.
	PurposeJustificationPrompt *string `pulumi:"purposeJustificationPrompt"`
	// Whether to prompt the user for a justification for accessing the resource.
	PurposeJustificationRequired *bool `pulumi:"purposeJustificationRequired"`
	// A series of access conditions, see Access Groups.
	Requires []AccessPolicyRequire `pulumi:"requires"`
	// The zone identifier to target for the resource. Conflicts with `accountId`.
	ZoneId *string `pulumi:"zoneId"`
}

type AccessPolicyState struct {
	// The account identifier to target for the resource. Conflicts with `zoneId`.
	AccountId pulumi.StringPtrInput
	// The ID of the application the policy is associated with.
	ApplicationId    pulumi.StringPtrInput
	ApprovalGroups   AccessPolicyApprovalGroupArrayInput
	ApprovalRequired pulumi.BoolPtrInput
	// Defines the action Access will take if the policy matches the user. Available values: `allow`, `deny`, `nonIdentity`, `bypass`.
	Decision pulumi.StringPtrInput
	// A series of access conditions, see Access Groups.
	Excludes AccessPolicyExcludeArrayInput
	// A series of access conditions, see Access Groups.
	Includes AccessPolicyIncludeArrayInput
	// Require this application to be served in an isolated browser for users matching this policy.
	IsolationRequired pulumi.BoolPtrInput
	// Friendly name of the Access Policy.
	Name pulumi.StringPtrInput
	// The unique precedence for policies on a single application.
	Precedence pulumi.IntPtrInput
	// The prompt to display to the user for a justification for accessing the resource. Required when using `purposeJustificationRequired`.
	PurposeJustificationPrompt pulumi.StringPtrInput
	// Whether to prompt the user for a justification for accessing the resource.
	PurposeJustificationRequired pulumi.BoolPtrInput
	// A series of access conditions, see Access Groups.
	Requires AccessPolicyRequireArrayInput
	// The zone identifier to target for the resource. Conflicts with `accountId`.
	ZoneId pulumi.StringPtrInput
}

func (AccessPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*accessPolicyState)(nil)).Elem()
}

type accessPolicyArgs struct {
	// The account identifier to target for the resource. Conflicts with `zoneId`.
	AccountId *string `pulumi:"accountId"`
	// The ID of the application the policy is associated with.
	ApplicationId    string                      `pulumi:"applicationId"`
	ApprovalGroups   []AccessPolicyApprovalGroup `pulumi:"approvalGroups"`
	ApprovalRequired *bool                       `pulumi:"approvalRequired"`
	// Defines the action Access will take if the policy matches the user. Available values: `allow`, `deny`, `nonIdentity`, `bypass`.
	Decision string `pulumi:"decision"`
	// A series of access conditions, see Access Groups.
	Excludes []AccessPolicyExclude `pulumi:"excludes"`
	// A series of access conditions, see Access Groups.
	Includes []AccessPolicyInclude `pulumi:"includes"`
	// Require this application to be served in an isolated browser for users matching this policy.
	IsolationRequired *bool `pulumi:"isolationRequired"`
	// Friendly name of the Access Policy.
	Name string `pulumi:"name"`
	// The unique precedence for policies on a single application.
	Precedence int `pulumi:"precedence"`
	// The prompt to display to the user for a justification for accessing the resource. Required when using `purposeJustificationRequired`.
	PurposeJustificationPrompt *string `pulumi:"purposeJustificationPrompt"`
	// Whether to prompt the user for a justification for accessing the resource.
	PurposeJustificationRequired *bool `pulumi:"purposeJustificationRequired"`
	// A series of access conditions, see Access Groups.
	Requires []AccessPolicyRequire `pulumi:"requires"`
	// The zone identifier to target for the resource. Conflicts with `accountId`.
	ZoneId *string `pulumi:"zoneId"`
}

// The set of arguments for constructing a AccessPolicy resource.
type AccessPolicyArgs struct {
	// The account identifier to target for the resource. Conflicts with `zoneId`.
	AccountId pulumi.StringPtrInput
	// The ID of the application the policy is associated with.
	ApplicationId    pulumi.StringInput
	ApprovalGroups   AccessPolicyApprovalGroupArrayInput
	ApprovalRequired pulumi.BoolPtrInput
	// Defines the action Access will take if the policy matches the user. Available values: `allow`, `deny`, `nonIdentity`, `bypass`.
	Decision pulumi.StringInput
	// A series of access conditions, see Access Groups.
	Excludes AccessPolicyExcludeArrayInput
	// A series of access conditions, see Access Groups.
	Includes AccessPolicyIncludeArrayInput
	// Require this application to be served in an isolated browser for users matching this policy.
	IsolationRequired pulumi.BoolPtrInput
	// Friendly name of the Access Policy.
	Name pulumi.StringInput
	// The unique precedence for policies on a single application.
	Precedence pulumi.IntInput
	// The prompt to display to the user for a justification for accessing the resource. Required when using `purposeJustificationRequired`.
	PurposeJustificationPrompt pulumi.StringPtrInput
	// Whether to prompt the user for a justification for accessing the resource.
	PurposeJustificationRequired pulumi.BoolPtrInput
	// A series of access conditions, see Access Groups.
	Requires AccessPolicyRequireArrayInput
	// The zone identifier to target for the resource. Conflicts with `accountId`.
	ZoneId pulumi.StringPtrInput
}

func (AccessPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*accessPolicyArgs)(nil)).Elem()
}

type AccessPolicyInput interface {
	pulumi.Input

	ToAccessPolicyOutput() AccessPolicyOutput
	ToAccessPolicyOutputWithContext(ctx context.Context) AccessPolicyOutput
}

func (*AccessPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((**AccessPolicy)(nil)).Elem()
}

func (i *AccessPolicy) ToAccessPolicyOutput() AccessPolicyOutput {
	return i.ToAccessPolicyOutputWithContext(context.Background())
}

func (i *AccessPolicy) ToAccessPolicyOutputWithContext(ctx context.Context) AccessPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessPolicyOutput)
}

// AccessPolicyArrayInput is an input type that accepts AccessPolicyArray and AccessPolicyArrayOutput values.
// You can construct a concrete instance of `AccessPolicyArrayInput` via:
//
//	AccessPolicyArray{ AccessPolicyArgs{...} }
type AccessPolicyArrayInput interface {
	pulumi.Input

	ToAccessPolicyArrayOutput() AccessPolicyArrayOutput
	ToAccessPolicyArrayOutputWithContext(context.Context) AccessPolicyArrayOutput
}

type AccessPolicyArray []AccessPolicyInput

func (AccessPolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AccessPolicy)(nil)).Elem()
}

func (i AccessPolicyArray) ToAccessPolicyArrayOutput() AccessPolicyArrayOutput {
	return i.ToAccessPolicyArrayOutputWithContext(context.Background())
}

func (i AccessPolicyArray) ToAccessPolicyArrayOutputWithContext(ctx context.Context) AccessPolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessPolicyArrayOutput)
}

// AccessPolicyMapInput is an input type that accepts AccessPolicyMap and AccessPolicyMapOutput values.
// You can construct a concrete instance of `AccessPolicyMapInput` via:
//
//	AccessPolicyMap{ "key": AccessPolicyArgs{...} }
type AccessPolicyMapInput interface {
	pulumi.Input

	ToAccessPolicyMapOutput() AccessPolicyMapOutput
	ToAccessPolicyMapOutputWithContext(context.Context) AccessPolicyMapOutput
}

type AccessPolicyMap map[string]AccessPolicyInput

func (AccessPolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AccessPolicy)(nil)).Elem()
}

func (i AccessPolicyMap) ToAccessPolicyMapOutput() AccessPolicyMapOutput {
	return i.ToAccessPolicyMapOutputWithContext(context.Background())
}

func (i AccessPolicyMap) ToAccessPolicyMapOutputWithContext(ctx context.Context) AccessPolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessPolicyMapOutput)
}

type AccessPolicyOutput struct{ *pulumi.OutputState }

func (AccessPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AccessPolicy)(nil)).Elem()
}

func (o AccessPolicyOutput) ToAccessPolicyOutput() AccessPolicyOutput {
	return o
}

func (o AccessPolicyOutput) ToAccessPolicyOutputWithContext(ctx context.Context) AccessPolicyOutput {
	return o
}

// The account identifier to target for the resource. Conflicts with `zoneId`.
func (o AccessPolicyOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *AccessPolicy) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// The ID of the application the policy is associated with.
func (o AccessPolicyOutput) ApplicationId() pulumi.StringOutput {
	return o.ApplyT(func(v *AccessPolicy) pulumi.StringOutput { return v.ApplicationId }).(pulumi.StringOutput)
}

func (o AccessPolicyOutput) ApprovalGroups() AccessPolicyApprovalGroupArrayOutput {
	return o.ApplyT(func(v *AccessPolicy) AccessPolicyApprovalGroupArrayOutput { return v.ApprovalGroups }).(AccessPolicyApprovalGroupArrayOutput)
}

func (o AccessPolicyOutput) ApprovalRequired() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *AccessPolicy) pulumi.BoolPtrOutput { return v.ApprovalRequired }).(pulumi.BoolPtrOutput)
}

// Defines the action Access will take if the policy matches the user. Available values: `allow`, `deny`, `nonIdentity`, `bypass`.
func (o AccessPolicyOutput) Decision() pulumi.StringOutput {
	return o.ApplyT(func(v *AccessPolicy) pulumi.StringOutput { return v.Decision }).(pulumi.StringOutput)
}

// A series of access conditions, see Access Groups.
func (o AccessPolicyOutput) Excludes() AccessPolicyExcludeArrayOutput {
	return o.ApplyT(func(v *AccessPolicy) AccessPolicyExcludeArrayOutput { return v.Excludes }).(AccessPolicyExcludeArrayOutput)
}

// A series of access conditions, see Access Groups.
func (o AccessPolicyOutput) Includes() AccessPolicyIncludeArrayOutput {
	return o.ApplyT(func(v *AccessPolicy) AccessPolicyIncludeArrayOutput { return v.Includes }).(AccessPolicyIncludeArrayOutput)
}

// Require this application to be served in an isolated browser for users matching this policy.
func (o AccessPolicyOutput) IsolationRequired() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *AccessPolicy) pulumi.BoolPtrOutput { return v.IsolationRequired }).(pulumi.BoolPtrOutput)
}

// Friendly name of the Access Policy.
func (o AccessPolicyOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *AccessPolicy) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The unique precedence for policies on a single application.
func (o AccessPolicyOutput) Precedence() pulumi.IntOutput {
	return o.ApplyT(func(v *AccessPolicy) pulumi.IntOutput { return v.Precedence }).(pulumi.IntOutput)
}

// The prompt to display to the user for a justification for accessing the resource. Required when using `purposeJustificationRequired`.
func (o AccessPolicyOutput) PurposeJustificationPrompt() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AccessPolicy) pulumi.StringPtrOutput { return v.PurposeJustificationPrompt }).(pulumi.StringPtrOutput)
}

// Whether to prompt the user for a justification for accessing the resource.
func (o AccessPolicyOutput) PurposeJustificationRequired() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *AccessPolicy) pulumi.BoolPtrOutput { return v.PurposeJustificationRequired }).(pulumi.BoolPtrOutput)
}

// A series of access conditions, see Access Groups.
func (o AccessPolicyOutput) Requires() AccessPolicyRequireArrayOutput {
	return o.ApplyT(func(v *AccessPolicy) AccessPolicyRequireArrayOutput { return v.Requires }).(AccessPolicyRequireArrayOutput)
}

// The zone identifier to target for the resource. Conflicts with `accountId`.
func (o AccessPolicyOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v *AccessPolicy) pulumi.StringOutput { return v.ZoneId }).(pulumi.StringOutput)
}

type AccessPolicyArrayOutput struct{ *pulumi.OutputState }

func (AccessPolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AccessPolicy)(nil)).Elem()
}

func (o AccessPolicyArrayOutput) ToAccessPolicyArrayOutput() AccessPolicyArrayOutput {
	return o
}

func (o AccessPolicyArrayOutput) ToAccessPolicyArrayOutputWithContext(ctx context.Context) AccessPolicyArrayOutput {
	return o
}

func (o AccessPolicyArrayOutput) Index(i pulumi.IntInput) AccessPolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AccessPolicy {
		return vs[0].([]*AccessPolicy)[vs[1].(int)]
	}).(AccessPolicyOutput)
}

type AccessPolicyMapOutput struct{ *pulumi.OutputState }

func (AccessPolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AccessPolicy)(nil)).Elem()
}

func (o AccessPolicyMapOutput) ToAccessPolicyMapOutput() AccessPolicyMapOutput {
	return o
}

func (o AccessPolicyMapOutput) ToAccessPolicyMapOutputWithContext(ctx context.Context) AccessPolicyMapOutput {
	return o
}

func (o AccessPolicyMapOutput) MapIndex(k pulumi.StringInput) AccessPolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AccessPolicy {
		return vs[0].(map[string]*AccessPolicy)[vs[1].(string)]
	}).(AccessPolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AccessPolicyInput)(nil)).Elem(), &AccessPolicy{})
	pulumi.RegisterInputType(reflect.TypeOf((*AccessPolicyArrayInput)(nil)).Elem(), AccessPolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AccessPolicyMapInput)(nil)).Elem(), AccessPolicyMap{})
	pulumi.RegisterOutputType(AccessPolicyOutput{})
	pulumi.RegisterOutputType(AccessPolicyArrayOutput{})
	pulumi.RegisterOutputType(AccessPolicyMapOutput{})
}
