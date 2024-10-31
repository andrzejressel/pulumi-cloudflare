// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-cloudflare/sdk/v5/go/cloudflare/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to retrieve all Infrastructure Access Targets.
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
//			example, err := cloudflare.GetZeroTrustInfrastructureAccessTargets(ctx, &cloudflare.GetZeroTrustInfrastructureAccessTargetsArgs{
//				AccountId:        "f037e56e89293a057740de681ac9abbe",
//				HostnameContains: pulumi.StringRef("example"),
//				Ipv4:             pulumi.StringRef("198.51.100.1"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("targets", example.Targets)
//			return nil
//		})
//	}
//
// ```
func GetZeroTrustInfrastructureAccessTargets(ctx *pulumi.Context, args *GetZeroTrustInfrastructureAccessTargetsArgs, opts ...pulumi.InvokeOption) (*GetZeroTrustInfrastructureAccessTargetsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetZeroTrustInfrastructureAccessTargetsResult
	err := ctx.Invoke("cloudflare:index/getZeroTrustInfrastructureAccessTargets:getZeroTrustInfrastructureAccessTargets", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getZeroTrustInfrastructureAccessTargets.
type GetZeroTrustInfrastructureAccessTargetsArgs struct {
	// The account identifier to target for the resource.
	AccountId string `pulumi:"accountId"`
	// A date and time after a target was created to filter on.
	CreatedAfter *string `pulumi:"createdAfter"`
	// The hostname of the target.
	Hostname *string `pulumi:"hostname"`
	// Partial match to the hostname of a target
	HostnameContains *string `pulumi:"hostnameContains"`
	// The target's IPv4 address.
	Ipv4 *string `pulumi:"ipv4"`
	// The target's IPv6 address.
	Ipv6 *string `pulumi:"ipv6"`
	// A date and time after a target was modified to filter on.
	ModifiedAfter *string `pulumi:"modifiedAfter"`
	// The private virtual network identifier for the target.
	VirtualNetworkId *string `pulumi:"virtualNetworkId"`
}

// A collection of values returned by getZeroTrustInfrastructureAccessTargets.
type GetZeroTrustInfrastructureAccessTargetsResult struct {
	// The account identifier to target for the resource.
	AccountId string `pulumi:"accountId"`
	// A date and time after a target was created to filter on.
	CreatedAfter *string `pulumi:"createdAfter"`
	// The hostname of the target.
	Hostname *string `pulumi:"hostname"`
	// Partial match to the hostname of a target
	HostnameContains *string `pulumi:"hostnameContains"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The target's IPv4 address.
	Ipv4 *string `pulumi:"ipv4"`
	// The target's IPv6 address.
	Ipv6 *string `pulumi:"ipv6"`
	// A date and time after a target was modified to filter on.
	ModifiedAfter *string                                         `pulumi:"modifiedAfter"`
	Targets       []GetZeroTrustInfrastructureAccessTargetsTarget `pulumi:"targets"`
	// The private virtual network identifier for the target.
	VirtualNetworkId *string `pulumi:"virtualNetworkId"`
}

func GetZeroTrustInfrastructureAccessTargetsOutput(ctx *pulumi.Context, args GetZeroTrustInfrastructureAccessTargetsOutputArgs, opts ...pulumi.InvokeOption) GetZeroTrustInfrastructureAccessTargetsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetZeroTrustInfrastructureAccessTargetsResultOutput, error) {
			args := v.(GetZeroTrustInfrastructureAccessTargetsArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv GetZeroTrustInfrastructureAccessTargetsResult
			secret, err := ctx.InvokePackageRaw("cloudflare:index/getZeroTrustInfrastructureAccessTargets:getZeroTrustInfrastructureAccessTargets", args, &rv, "", opts...)
			if err != nil {
				return GetZeroTrustInfrastructureAccessTargetsResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(GetZeroTrustInfrastructureAccessTargetsResultOutput)
			if secret {
				return pulumi.ToSecret(output).(GetZeroTrustInfrastructureAccessTargetsResultOutput), nil
			}
			return output, nil
		}).(GetZeroTrustInfrastructureAccessTargetsResultOutput)
}

// A collection of arguments for invoking getZeroTrustInfrastructureAccessTargets.
type GetZeroTrustInfrastructureAccessTargetsOutputArgs struct {
	// The account identifier to target for the resource.
	AccountId pulumi.StringInput `pulumi:"accountId"`
	// A date and time after a target was created to filter on.
	CreatedAfter pulumi.StringPtrInput `pulumi:"createdAfter"`
	// The hostname of the target.
	Hostname pulumi.StringPtrInput `pulumi:"hostname"`
	// Partial match to the hostname of a target
	HostnameContains pulumi.StringPtrInput `pulumi:"hostnameContains"`
	// The target's IPv4 address.
	Ipv4 pulumi.StringPtrInput `pulumi:"ipv4"`
	// The target's IPv6 address.
	Ipv6 pulumi.StringPtrInput `pulumi:"ipv6"`
	// A date and time after a target was modified to filter on.
	ModifiedAfter pulumi.StringPtrInput `pulumi:"modifiedAfter"`
	// The private virtual network identifier for the target.
	VirtualNetworkId pulumi.StringPtrInput `pulumi:"virtualNetworkId"`
}

func (GetZeroTrustInfrastructureAccessTargetsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetZeroTrustInfrastructureAccessTargetsArgs)(nil)).Elem()
}

// A collection of values returned by getZeroTrustInfrastructureAccessTargets.
type GetZeroTrustInfrastructureAccessTargetsResultOutput struct{ *pulumi.OutputState }

func (GetZeroTrustInfrastructureAccessTargetsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetZeroTrustInfrastructureAccessTargetsResult)(nil)).Elem()
}

func (o GetZeroTrustInfrastructureAccessTargetsResultOutput) ToGetZeroTrustInfrastructureAccessTargetsResultOutput() GetZeroTrustInfrastructureAccessTargetsResultOutput {
	return o
}

func (o GetZeroTrustInfrastructureAccessTargetsResultOutput) ToGetZeroTrustInfrastructureAccessTargetsResultOutputWithContext(ctx context.Context) GetZeroTrustInfrastructureAccessTargetsResultOutput {
	return o
}

// The account identifier to target for the resource.
func (o GetZeroTrustInfrastructureAccessTargetsResultOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v GetZeroTrustInfrastructureAccessTargetsResult) string { return v.AccountId }).(pulumi.StringOutput)
}

// A date and time after a target was created to filter on.
func (o GetZeroTrustInfrastructureAccessTargetsResultOutput) CreatedAfter() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetZeroTrustInfrastructureAccessTargetsResult) *string { return v.CreatedAfter }).(pulumi.StringPtrOutput)
}

// The hostname of the target.
func (o GetZeroTrustInfrastructureAccessTargetsResultOutput) Hostname() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetZeroTrustInfrastructureAccessTargetsResult) *string { return v.Hostname }).(pulumi.StringPtrOutput)
}

// Partial match to the hostname of a target
func (o GetZeroTrustInfrastructureAccessTargetsResultOutput) HostnameContains() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetZeroTrustInfrastructureAccessTargetsResult) *string { return v.HostnameContains }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetZeroTrustInfrastructureAccessTargetsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetZeroTrustInfrastructureAccessTargetsResult) string { return v.Id }).(pulumi.StringOutput)
}

// The target's IPv4 address.
func (o GetZeroTrustInfrastructureAccessTargetsResultOutput) Ipv4() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetZeroTrustInfrastructureAccessTargetsResult) *string { return v.Ipv4 }).(pulumi.StringPtrOutput)
}

// The target's IPv6 address.
func (o GetZeroTrustInfrastructureAccessTargetsResultOutput) Ipv6() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetZeroTrustInfrastructureAccessTargetsResult) *string { return v.Ipv6 }).(pulumi.StringPtrOutput)
}

// A date and time after a target was modified to filter on.
func (o GetZeroTrustInfrastructureAccessTargetsResultOutput) ModifiedAfter() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetZeroTrustInfrastructureAccessTargetsResult) *string { return v.ModifiedAfter }).(pulumi.StringPtrOutput)
}

func (o GetZeroTrustInfrastructureAccessTargetsResultOutput) Targets() GetZeroTrustInfrastructureAccessTargetsTargetArrayOutput {
	return o.ApplyT(func(v GetZeroTrustInfrastructureAccessTargetsResult) []GetZeroTrustInfrastructureAccessTargetsTarget {
		return v.Targets
	}).(GetZeroTrustInfrastructureAccessTargetsTargetArrayOutput)
}

// The private virtual network identifier for the target.
func (o GetZeroTrustInfrastructureAccessTargetsResultOutput) VirtualNetworkId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetZeroTrustInfrastructureAccessTargetsResult) *string { return v.VirtualNetworkId }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetZeroTrustInfrastructureAccessTargetsResultOutput{})
}
