// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to look up [Zone](https://api.cloudflare.com/#zone-properties) records.
//
// ## Example Usage
//
// Given you have the following zones in Cloudflare.
//
// - example.com
// - example.net
// - not-example.com
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
// 		_, err := cloudflare.GetZones(ctx, &cloudflare.GetZonesArgs{
// 			Filter: cloudflare.GetZonesFilter{
// 				Name: "example.com",
// 			},
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
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
// 		_, err := cloudflare.GetZones(ctx, &cloudflare.GetZonesArgs{
// 			Filter: cloudflare.GetZonesFilter{
// 				LookupType: "contains",
// 				Name:       "example",
// 			},
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
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
// 		_, err := cloudflare.GetZones(ctx, &cloudflare.GetZonesArgs{
// 			Filter: cloudflare.GetZonesFilter{
// 				LookupType: "contains",
// 				Match:      "^not-",
// 				Name:       "example",
// 			},
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func GetZones(ctx *pulumi.Context, args *GetZonesArgs, opts ...pulumi.InvokeOption) (*GetZonesResult, error) {
	var rv GetZonesResult
	err := ctx.Invoke("cloudflare:index/getZones:getZones", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getZones.
type GetZonesArgs struct {
	// One or more values used to look up zone records. If more than one value is given all
	// values must match in order to be included, see below for full list.
	Filter GetZonesFilter `pulumi:"filter"`
}

// A collection of values returned by getZones.
type GetZonesResult struct {
	Filter GetZonesFilter `pulumi:"filter"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of zone objects. Object format:
	Zones []GetZonesZone `pulumi:"zones"`
}
