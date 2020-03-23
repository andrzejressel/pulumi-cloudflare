// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

// nolint: lll
package cloudflare

import (
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Use this data source to look up [WAF Rules][1].
//
// > This content is derived from https://github.com/terraform-providers/terraform-provider-cloudflare/blob/master/website/docs/d/waf_rules.html.md.
func GetWafRules(ctx *pulumi.Context, args *GetWafRulesArgs, opts ...pulumi.InvokeOption) (*GetWafRulesResult, error) {
	var rv GetWafRulesResult
	err := ctx.Invoke("cloudflare:index/getWafRules:getWafRules", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getWafRules.
type GetWafRulesArgs struct {
	Filter *GetWafRulesFilter `pulumi:"filter"`
	PackageId *string `pulumi:"packageId"`
	ZoneId string `pulumi:"zoneId"`
}


// A collection of values returned by getWafRules.
type GetWafRulesResult struct {
	Filter *GetWafRulesFilter `pulumi:"filter"`
	// id is the provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	PackageId *string `pulumi:"packageId"`
	Rules []GetWafRulesRule `pulumi:"rules"`
	ZoneId string `pulumi:"zoneId"`
}

