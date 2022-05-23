// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Cloudflare worker script resource. In order for a script to be active, you'll also need to setup a `WorkerRoute`. *NOTE:*  This resource uses the Cloudflare account APIs. This requires setting the `CLOUDFLARE_ACCOUNT_ID` environment variable or `accountId` provider argument.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"encoding/base64"
// 	"io/ioutil"
//
// 	"github.com/pulumi/pulumi-cloudflare/sdk/v4/go/cloudflare"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func filebase64OrPanic(path string) pulumi.StringPtrInput {
// 	if fileData, err := ioutil.ReadFile(path); err == nil {
// 		return pulumi.String(base64.StdEncoding.EncodeToString(fileData[:]))
// 	} else {
// 		panic(err.Error())
// 	}
// }
//
// func readFileOrPanic(path string) pulumi.StringPtrInput {
// 	data, err := ioutil.ReadFile(path)
// 	if err != nil {
// 		panic(err.Error())
// 	}
// 	return pulumi.String(string(data))
// }
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		myNamespace, err := cloudflare.NewWorkersKvNamespace(ctx, "myNamespace", &cloudflare.WorkersKvNamespaceArgs{
// 			Title: pulumi.String("example"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = cloudflare.NewWorkerScript(ctx, "myScript", &cloudflare.WorkerScriptArgs{
// 			Name:    pulumi.String("script_1"),
// 			Content: readFileOrPanic("script.js"),
// 			KvNamespaceBindings: WorkerScriptKvNamespaceBindingArray{
// 				&WorkerScriptKvNamespaceBindingArgs{
// 					Name:        pulumi.String("MY_EXAMPLE_KV_NAMESPACE"),
// 					NamespaceId: myNamespace.ID(),
// 				},
// 			},
// 			PlainTextBindings: WorkerScriptPlainTextBindingArray{
// 				&WorkerScriptPlainTextBindingArgs{
// 					Name: pulumi.String("MY_EXAMPLE_PLAIN_TEXT"),
// 					Text: pulumi.String("foobar"),
// 				},
// 			},
// 			SecretTextBindings: WorkerScriptSecretTextBindingArray{
// 				&WorkerScriptSecretTextBindingArgs{
// 					Name: pulumi.String("MY_EXAMPLE_SECRET_TEXT"),
// 					Text: pulumi.Any(_var.Secret_foo_value),
// 				},
// 			},
// 			WebassemblyBindings: WorkerScriptWebassemblyBindingArray{
// 				&WorkerScriptWebassemblyBindingArgs{
// 					Name:   pulumi.String("MY_EXAMPLE_WASM"),
// 					Module: filebase64OrPanic("example.wasm"),
// 				},
// 			},
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
// To import a script, use a script name, e.g. `script_name`
//
// ```sh
//  $ pulumi import cloudflare:index/workerScript:WorkerScript default script_name
// ```
//
//  where* `script_name` - the script name
type WorkerScript struct {
	pulumi.CustomResourceState

	// The script content.
	Content             pulumi.StringOutput                       `pulumi:"content"`
	KvNamespaceBindings WorkerScriptKvNamespaceBindingArrayOutput `pulumi:"kvNamespaceBindings"`
	// The global variable for the binding in your Worker code.
	Name                pulumi.StringOutput                       `pulumi:"name"`
	PlainTextBindings   WorkerScriptPlainTextBindingArrayOutput   `pulumi:"plainTextBindings"`
	SecretTextBindings  WorkerScriptSecretTextBindingArrayOutput  `pulumi:"secretTextBindings"`
	WebassemblyBindings WorkerScriptWebassemblyBindingArrayOutput `pulumi:"webassemblyBindings"`
}

// NewWorkerScript registers a new resource with the given unique name, arguments, and options.
func NewWorkerScript(ctx *pulumi.Context,
	name string, args *WorkerScriptArgs, opts ...pulumi.ResourceOption) (*WorkerScript, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Content == nil {
		return nil, errors.New("invalid value for required argument 'Content'")
	}
	if args.Name == nil {
		return nil, errors.New("invalid value for required argument 'Name'")
	}
	var resource WorkerScript
	err := ctx.RegisterResource("cloudflare:index/workerScript:WorkerScript", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetWorkerScript gets an existing WorkerScript resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetWorkerScript(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *WorkerScriptState, opts ...pulumi.ResourceOption) (*WorkerScript, error) {
	var resource WorkerScript
	err := ctx.ReadResource("cloudflare:index/workerScript:WorkerScript", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering WorkerScript resources.
type workerScriptState struct {
	// The script content.
	Content             *string                          `pulumi:"content"`
	KvNamespaceBindings []WorkerScriptKvNamespaceBinding `pulumi:"kvNamespaceBindings"`
	// The global variable for the binding in your Worker code.
	Name                *string                          `pulumi:"name"`
	PlainTextBindings   []WorkerScriptPlainTextBinding   `pulumi:"plainTextBindings"`
	SecretTextBindings  []WorkerScriptSecretTextBinding  `pulumi:"secretTextBindings"`
	WebassemblyBindings []WorkerScriptWebassemblyBinding `pulumi:"webassemblyBindings"`
}

type WorkerScriptState struct {
	// The script content.
	Content             pulumi.StringPtrInput
	KvNamespaceBindings WorkerScriptKvNamespaceBindingArrayInput
	// The global variable for the binding in your Worker code.
	Name                pulumi.StringPtrInput
	PlainTextBindings   WorkerScriptPlainTextBindingArrayInput
	SecretTextBindings  WorkerScriptSecretTextBindingArrayInput
	WebassemblyBindings WorkerScriptWebassemblyBindingArrayInput
}

func (WorkerScriptState) ElementType() reflect.Type {
	return reflect.TypeOf((*workerScriptState)(nil)).Elem()
}

type workerScriptArgs struct {
	// The script content.
	Content             string                           `pulumi:"content"`
	KvNamespaceBindings []WorkerScriptKvNamespaceBinding `pulumi:"kvNamespaceBindings"`
	// The global variable for the binding in your Worker code.
	Name                string                           `pulumi:"name"`
	PlainTextBindings   []WorkerScriptPlainTextBinding   `pulumi:"plainTextBindings"`
	SecretTextBindings  []WorkerScriptSecretTextBinding  `pulumi:"secretTextBindings"`
	WebassemblyBindings []WorkerScriptWebassemblyBinding `pulumi:"webassemblyBindings"`
}

// The set of arguments for constructing a WorkerScript resource.
type WorkerScriptArgs struct {
	// The script content.
	Content             pulumi.StringInput
	KvNamespaceBindings WorkerScriptKvNamespaceBindingArrayInput
	// The global variable for the binding in your Worker code.
	Name                pulumi.StringInput
	PlainTextBindings   WorkerScriptPlainTextBindingArrayInput
	SecretTextBindings  WorkerScriptSecretTextBindingArrayInput
	WebassemblyBindings WorkerScriptWebassemblyBindingArrayInput
}

func (WorkerScriptArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*workerScriptArgs)(nil)).Elem()
}

type WorkerScriptInput interface {
	pulumi.Input

	ToWorkerScriptOutput() WorkerScriptOutput
	ToWorkerScriptOutputWithContext(ctx context.Context) WorkerScriptOutput
}

func (*WorkerScript) ElementType() reflect.Type {
	return reflect.TypeOf((**WorkerScript)(nil)).Elem()
}

func (i *WorkerScript) ToWorkerScriptOutput() WorkerScriptOutput {
	return i.ToWorkerScriptOutputWithContext(context.Background())
}

func (i *WorkerScript) ToWorkerScriptOutputWithContext(ctx context.Context) WorkerScriptOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkerScriptOutput)
}

// WorkerScriptArrayInput is an input type that accepts WorkerScriptArray and WorkerScriptArrayOutput values.
// You can construct a concrete instance of `WorkerScriptArrayInput` via:
//
//          WorkerScriptArray{ WorkerScriptArgs{...} }
type WorkerScriptArrayInput interface {
	pulumi.Input

	ToWorkerScriptArrayOutput() WorkerScriptArrayOutput
	ToWorkerScriptArrayOutputWithContext(context.Context) WorkerScriptArrayOutput
}

type WorkerScriptArray []WorkerScriptInput

func (WorkerScriptArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WorkerScript)(nil)).Elem()
}

func (i WorkerScriptArray) ToWorkerScriptArrayOutput() WorkerScriptArrayOutput {
	return i.ToWorkerScriptArrayOutputWithContext(context.Background())
}

func (i WorkerScriptArray) ToWorkerScriptArrayOutputWithContext(ctx context.Context) WorkerScriptArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkerScriptArrayOutput)
}

// WorkerScriptMapInput is an input type that accepts WorkerScriptMap and WorkerScriptMapOutput values.
// You can construct a concrete instance of `WorkerScriptMapInput` via:
//
//          WorkerScriptMap{ "key": WorkerScriptArgs{...} }
type WorkerScriptMapInput interface {
	pulumi.Input

	ToWorkerScriptMapOutput() WorkerScriptMapOutput
	ToWorkerScriptMapOutputWithContext(context.Context) WorkerScriptMapOutput
}

type WorkerScriptMap map[string]WorkerScriptInput

func (WorkerScriptMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WorkerScript)(nil)).Elem()
}

func (i WorkerScriptMap) ToWorkerScriptMapOutput() WorkerScriptMapOutput {
	return i.ToWorkerScriptMapOutputWithContext(context.Background())
}

func (i WorkerScriptMap) ToWorkerScriptMapOutputWithContext(ctx context.Context) WorkerScriptMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkerScriptMapOutput)
}

type WorkerScriptOutput struct{ *pulumi.OutputState }

func (WorkerScriptOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**WorkerScript)(nil)).Elem()
}

func (o WorkerScriptOutput) ToWorkerScriptOutput() WorkerScriptOutput {
	return o
}

func (o WorkerScriptOutput) ToWorkerScriptOutputWithContext(ctx context.Context) WorkerScriptOutput {
	return o
}

// The script content.
func (o WorkerScriptOutput) Content() pulumi.StringOutput {
	return o.ApplyT(func(v *WorkerScript) pulumi.StringOutput { return v.Content }).(pulumi.StringOutput)
}

func (o WorkerScriptOutput) KvNamespaceBindings() WorkerScriptKvNamespaceBindingArrayOutput {
	return o.ApplyT(func(v *WorkerScript) WorkerScriptKvNamespaceBindingArrayOutput { return v.KvNamespaceBindings }).(WorkerScriptKvNamespaceBindingArrayOutput)
}

// The global variable for the binding in your Worker code.
func (o WorkerScriptOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *WorkerScript) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

func (o WorkerScriptOutput) PlainTextBindings() WorkerScriptPlainTextBindingArrayOutput {
	return o.ApplyT(func(v *WorkerScript) WorkerScriptPlainTextBindingArrayOutput { return v.PlainTextBindings }).(WorkerScriptPlainTextBindingArrayOutput)
}

func (o WorkerScriptOutput) SecretTextBindings() WorkerScriptSecretTextBindingArrayOutput {
	return o.ApplyT(func(v *WorkerScript) WorkerScriptSecretTextBindingArrayOutput { return v.SecretTextBindings }).(WorkerScriptSecretTextBindingArrayOutput)
}

func (o WorkerScriptOutput) WebassemblyBindings() WorkerScriptWebassemblyBindingArrayOutput {
	return o.ApplyT(func(v *WorkerScript) WorkerScriptWebassemblyBindingArrayOutput { return v.WebassemblyBindings }).(WorkerScriptWebassemblyBindingArrayOutput)
}

type WorkerScriptArrayOutput struct{ *pulumi.OutputState }

func (WorkerScriptArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WorkerScript)(nil)).Elem()
}

func (o WorkerScriptArrayOutput) ToWorkerScriptArrayOutput() WorkerScriptArrayOutput {
	return o
}

func (o WorkerScriptArrayOutput) ToWorkerScriptArrayOutputWithContext(ctx context.Context) WorkerScriptArrayOutput {
	return o
}

func (o WorkerScriptArrayOutput) Index(i pulumi.IntInput) WorkerScriptOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *WorkerScript {
		return vs[0].([]*WorkerScript)[vs[1].(int)]
	}).(WorkerScriptOutput)
}

type WorkerScriptMapOutput struct{ *pulumi.OutputState }

func (WorkerScriptMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WorkerScript)(nil)).Elem()
}

func (o WorkerScriptMapOutput) ToWorkerScriptMapOutput() WorkerScriptMapOutput {
	return o
}

func (o WorkerScriptMapOutput) ToWorkerScriptMapOutputWithContext(ctx context.Context) WorkerScriptMapOutput {
	return o
}

func (o WorkerScriptMapOutput) MapIndex(k pulumi.StringInput) WorkerScriptOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *WorkerScript {
		return vs[0].(map[string]*WorkerScript)[vs[1].(string)]
	}).(WorkerScriptOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*WorkerScriptInput)(nil)).Elem(), &WorkerScript{})
	pulumi.RegisterInputType(reflect.TypeOf((*WorkerScriptArrayInput)(nil)).Elem(), WorkerScriptArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*WorkerScriptMapInput)(nil)).Elem(), WorkerScriptMap{})
	pulumi.RegisterOutputType(WorkerScriptOutput{})
	pulumi.RegisterOutputType(WorkerScriptArrayOutput{})
	pulumi.RegisterOutputType(WorkerScriptMapOutput{})
}
