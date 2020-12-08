// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Use this data source to look up [API Token Permission Groups](https://developers.cloudflare.com/api/tokens/create/permissions). Commonly used as references within [`ApiToken`](https://www.terraform.io/docs/providers/cloudflare/r/api_token.html) resources.
func GetApiTokenPermissionGroups(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetApiTokenPermissionGroupsResult, error) {
	var rv GetApiTokenPermissionGroupsResult
	err := ctx.Invoke("cloudflare:index/getApiTokenPermissionGroups:getApiTokenPermissionGroups", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getApiTokenPermissionGroups.
type GetApiTokenPermissionGroupsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A map of permission groups where keys are human-readable permission names
	// and values are permission IDs.
	Permissions map[string]interface{} `pulumi:"permissions"`
}
