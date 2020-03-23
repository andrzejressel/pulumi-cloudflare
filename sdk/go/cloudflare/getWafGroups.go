// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

// nolint: lll
package cloudflare

import (
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Use this data source to look up [WAF Rule Groups][1].
//
// > This content is derived from https://github.com/terraform-providers/terraform-provider-cloudflare/blob/master/website/docs/d/waf_groups.html.md.
func GetWafGroups(ctx *pulumi.Context, args *GetWafGroupsArgs, opts ...pulumi.InvokeOption) (*GetWafGroupsResult, error) {
	var rv GetWafGroupsResult
	err := ctx.Invoke("cloudflare:index/getWafGroups:getWafGroups", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getWafGroups.
type GetWafGroupsArgs struct {
	Filter *GetWafGroupsFilter `pulumi:"filter"`
	PackageId *string `pulumi:"packageId"`
	ZoneId string `pulumi:"zoneId"`
}


// A collection of values returned by getWafGroups.
type GetWafGroupsResult struct {
	Filter *GetWafGroupsFilter `pulumi:"filter"`
	Groups []GetWafGroupsGroup `pulumi:"groups"`
	// id is the provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	PackageId *string `pulumi:"packageId"`
	ZoneId string `pulumi:"zoneId"`
}

