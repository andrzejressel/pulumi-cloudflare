// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

// nolint: lll
package cloudflare

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Provides a Cloudflare WAF rule resource for a particular zone. This can be used to configure firewall behaviour for pre-defined firewall rules.
//
// > This content is derived from https://github.com/terraform-providers/terraform-provider-cloudflare/blob/master/website/docs/r/waf_rule.html.markdown.
type WafRule struct {
	pulumi.CustomResourceState

	// The ID of the WAF Rule Group that contains the rule.
	GroupId pulumi.StringOutput `pulumi:"groupId"`
	// The mode of the rule, can be one of ["block", "challenge", "default", "disable", "simulate"].
	Mode pulumi.StringOutput `pulumi:"mode"`
	// The ID of the WAF Rule Package that contains the rule.
	PackageId pulumi.StringOutput `pulumi:"packageId"`
	// The WAF Rule ID.
	RuleId pulumi.StringOutput `pulumi:"ruleId"`
	// The DNS zone ID to apply to.
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewWafRule registers a new resource with the given unique name, arguments, and options.
func NewWafRule(ctx *pulumi.Context,
	name string, args *WafRuleArgs, opts ...pulumi.ResourceOption) (*WafRule, error) {
	if args == nil || args.Mode == nil {
		return nil, errors.New("missing required argument 'Mode'")
	}
	if args == nil || args.RuleId == nil {
		return nil, errors.New("missing required argument 'RuleId'")
	}
	if args == nil || args.ZoneId == nil {
		return nil, errors.New("missing required argument 'ZoneId'")
	}
	if args == nil {
		args = &WafRuleArgs{}
	}
	var resource WafRule
	err := ctx.RegisterResource("cloudflare:index/wafRule:WafRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetWafRule gets an existing WafRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetWafRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *WafRuleState, opts ...pulumi.ResourceOption) (*WafRule, error) {
	var resource WafRule
	err := ctx.ReadResource("cloudflare:index/wafRule:WafRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering WafRule resources.
type wafRuleState struct {
	// The ID of the WAF Rule Group that contains the rule.
	GroupId *string `pulumi:"groupId"`
	// The mode of the rule, can be one of ["block", "challenge", "default", "disable", "simulate"].
	Mode *string `pulumi:"mode"`
	// The ID of the WAF Rule Package that contains the rule.
	PackageId *string `pulumi:"packageId"`
	// The WAF Rule ID.
	RuleId *string `pulumi:"ruleId"`
	// The DNS zone ID to apply to.
	ZoneId *string `pulumi:"zoneId"`
}

type WafRuleState struct {
	// The ID of the WAF Rule Group that contains the rule.
	GroupId pulumi.StringPtrInput
	// The mode of the rule, can be one of ["block", "challenge", "default", "disable", "simulate"].
	Mode pulumi.StringPtrInput
	// The ID of the WAF Rule Package that contains the rule.
	PackageId pulumi.StringPtrInput
	// The WAF Rule ID.
	RuleId pulumi.StringPtrInput
	// The DNS zone ID to apply to.
	ZoneId pulumi.StringPtrInput
}

func (WafRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*wafRuleState)(nil)).Elem()
}

type wafRuleArgs struct {
	// The mode of the rule, can be one of ["block", "challenge", "default", "disable", "simulate"].
	Mode string `pulumi:"mode"`
	// The ID of the WAF Rule Package that contains the rule.
	PackageId *string `pulumi:"packageId"`
	// The WAF Rule ID.
	RuleId string `pulumi:"ruleId"`
	// The DNS zone ID to apply to.
	ZoneId string `pulumi:"zoneId"`
}

// The set of arguments for constructing a WafRule resource.
type WafRuleArgs struct {
	// The mode of the rule, can be one of ["block", "challenge", "default", "disable", "simulate"].
	Mode pulumi.StringInput
	// The ID of the WAF Rule Package that contains the rule.
	PackageId pulumi.StringPtrInput
	// The WAF Rule ID.
	RuleId pulumi.StringInput
	// The DNS zone ID to apply to.
	ZoneId pulumi.StringInput
}

func (WafRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*wafRuleArgs)(nil)).Elem()
}

