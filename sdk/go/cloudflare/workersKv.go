// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

// nolint: lll
package cloudflare

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Provides a Workers KV Pair.  *NOTE:*  This resource uses the Cloudflare account APIs.  This requires setting the `CLOUDFLARE_ACCOUNT_ID` environment variable or `accountId` provider argument.
//
// > This content is derived from https://github.com/terraform-providers/terraform-provider-cloudflare/blob/master/website/docs/r/workers_kv.html.markdown.
type WorkersKv struct {
	pulumi.CustomResourceState

	// The key name
	Key pulumi.StringOutput `pulumi:"key"`
	// The ID of the Workers KV namespace in which you want to create the KV pair
	NamespaceId pulumi.StringOutput `pulumi:"namespaceId"`
	// The string value to be stored in the key
	Value pulumi.StringOutput `pulumi:"value"`
}

// NewWorkersKv registers a new resource with the given unique name, arguments, and options.
func NewWorkersKv(ctx *pulumi.Context,
	name string, args *WorkersKvArgs, opts ...pulumi.ResourceOption) (*WorkersKv, error) {
	if args == nil || args.Key == nil {
		return nil, errors.New("missing required argument 'Key'")
	}
	if args == nil || args.NamespaceId == nil {
		return nil, errors.New("missing required argument 'NamespaceId'")
	}
	if args == nil || args.Value == nil {
		return nil, errors.New("missing required argument 'Value'")
	}
	if args == nil {
		args = &WorkersKvArgs{}
	}
	var resource WorkersKv
	err := ctx.RegisterResource("cloudflare:index/workersKv:WorkersKv", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetWorkersKv gets an existing WorkersKv resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetWorkersKv(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *WorkersKvState, opts ...pulumi.ResourceOption) (*WorkersKv, error) {
	var resource WorkersKv
	err := ctx.ReadResource("cloudflare:index/workersKv:WorkersKv", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering WorkersKv resources.
type workersKvState struct {
	// The key name
	Key *string `pulumi:"key"`
	// The ID of the Workers KV namespace in which you want to create the KV pair
	NamespaceId *string `pulumi:"namespaceId"`
	// The string value to be stored in the key
	Value *string `pulumi:"value"`
}

type WorkersKvState struct {
	// The key name
	Key pulumi.StringPtrInput
	// The ID of the Workers KV namespace in which you want to create the KV pair
	NamespaceId pulumi.StringPtrInput
	// The string value to be stored in the key
	Value pulumi.StringPtrInput
}

func (WorkersKvState) ElementType() reflect.Type {
	return reflect.TypeOf((*workersKvState)(nil)).Elem()
}

type workersKvArgs struct {
	// The key name
	Key string `pulumi:"key"`
	// The ID of the Workers KV namespace in which you want to create the KV pair
	NamespaceId string `pulumi:"namespaceId"`
	// The string value to be stored in the key
	Value string `pulumi:"value"`
}

// The set of arguments for constructing a WorkersKv resource.
type WorkersKvArgs struct {
	// The key name
	Key pulumi.StringInput
	// The ID of the Workers KV namespace in which you want to create the KV pair
	NamespaceId pulumi.StringInput
	// The string value to be stored in the key
	Value pulumi.StringInput
}

func (WorkersKvArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*workersKvArgs)(nil)).Elem()
}
