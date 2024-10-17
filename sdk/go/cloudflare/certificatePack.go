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

// ## Example Usage
//
// ## Import
//
// ```sh
// $ pulumi import cloudflare:index/certificatePack:CertificatePack example <zone_id>/<certificate_pack_id>
// ```
//
// While supported, importing isn't recommended and it is advised to replace the
//
// certificate entirely instead.
type CertificatePack struct {
	pulumi.CustomResourceState

	// Which certificate authority to issue the certificate pack. Available values: `digicert`, `letsEncrypt`, `google`, `sslCom`. **Modifying this attribute will force creation of a new resource.**
	CertificateAuthority pulumi.StringOutput `pulumi:"certificateAuthority"`
	// Whether or not to include Cloudflare branding. This will add `sni.cloudflaressl.com` as the Common Name if set to `true`. **Modifying this attribute will force creation of a new resource.**
	CloudflareBranding pulumi.BoolPtrOutput `pulumi:"cloudflareBranding"`
	// List of hostnames to provision the certificate pack for. The zone name must be included as a host. Note: If using Let's Encrypt, you cannot use individual subdomains and only a wildcard for subdomain is available. **Modifying this attribute will force creation of a new resource.**
	Hosts pulumi.StringArrayOutput `pulumi:"hosts"`
	// Certificate pack configuration type. Available values: `advanced`. **Modifying this attribute will force creation of a new resource.**
	Type             pulumi.StringOutput                       `pulumi:"type"`
	ValidationErrors CertificatePackValidationErrorArrayOutput `pulumi:"validationErrors"`
	// Which validation method to use in order to prove domain ownership. Available values: `txt`, `http`, `email`. **Modifying this attribute will force creation of a new resource.**
	ValidationMethod  pulumi.StringOutput                        `pulumi:"validationMethod"`
	ValidationRecords CertificatePackValidationRecordArrayOutput `pulumi:"validationRecords"`
	// How long the certificate is valid for. Note: If using Let's Encrypt, this value can only be 90 days. Available values: `14`, `30`, `90`, `365`. **Modifying this attribute will force creation of a new resource.**
	ValidityDays pulumi.IntOutput `pulumi:"validityDays"`
	// Whether or not to wait for a certificate pack to reach status `active` during creation. Defaults to `false`. **Modifying this attribute will force creation of a new resource.**
	WaitForActiveStatus pulumi.BoolPtrOutput `pulumi:"waitForActiveStatus"`
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewCertificatePack registers a new resource with the given unique name, arguments, and options.
func NewCertificatePack(ctx *pulumi.Context,
	name string, args *CertificatePackArgs, opts ...pulumi.ResourceOption) (*CertificatePack, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.CertificateAuthority == nil {
		return nil, errors.New("invalid value for required argument 'CertificateAuthority'")
	}
	if args.Hosts == nil {
		return nil, errors.New("invalid value for required argument 'Hosts'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	if args.ValidationMethod == nil {
		return nil, errors.New("invalid value for required argument 'ValidationMethod'")
	}
	if args.ValidityDays == nil {
		return nil, errors.New("invalid value for required argument 'ValidityDays'")
	}
	if args.ZoneId == nil {
		return nil, errors.New("invalid value for required argument 'ZoneId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource CertificatePack
	err := ctx.RegisterResource("cloudflare:index/certificatePack:CertificatePack", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCertificatePack gets an existing CertificatePack resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCertificatePack(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CertificatePackState, opts ...pulumi.ResourceOption) (*CertificatePack, error) {
	var resource CertificatePack
	err := ctx.ReadResource("cloudflare:index/certificatePack:CertificatePack", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CertificatePack resources.
type certificatePackState struct {
	// Which certificate authority to issue the certificate pack. Available values: `digicert`, `letsEncrypt`, `google`, `sslCom`. **Modifying this attribute will force creation of a new resource.**
	CertificateAuthority *string `pulumi:"certificateAuthority"`
	// Whether or not to include Cloudflare branding. This will add `sni.cloudflaressl.com` as the Common Name if set to `true`. **Modifying this attribute will force creation of a new resource.**
	CloudflareBranding *bool `pulumi:"cloudflareBranding"`
	// List of hostnames to provision the certificate pack for. The zone name must be included as a host. Note: If using Let's Encrypt, you cannot use individual subdomains and only a wildcard for subdomain is available. **Modifying this attribute will force creation of a new resource.**
	Hosts []string `pulumi:"hosts"`
	// Certificate pack configuration type. Available values: `advanced`. **Modifying this attribute will force creation of a new resource.**
	Type             *string                          `pulumi:"type"`
	ValidationErrors []CertificatePackValidationError `pulumi:"validationErrors"`
	// Which validation method to use in order to prove domain ownership. Available values: `txt`, `http`, `email`. **Modifying this attribute will force creation of a new resource.**
	ValidationMethod  *string                           `pulumi:"validationMethod"`
	ValidationRecords []CertificatePackValidationRecord `pulumi:"validationRecords"`
	// How long the certificate is valid for. Note: If using Let's Encrypt, this value can only be 90 days. Available values: `14`, `30`, `90`, `365`. **Modifying this attribute will force creation of a new resource.**
	ValidityDays *int `pulumi:"validityDays"`
	// Whether or not to wait for a certificate pack to reach status `active` during creation. Defaults to `false`. **Modifying this attribute will force creation of a new resource.**
	WaitForActiveStatus *bool `pulumi:"waitForActiveStatus"`
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId *string `pulumi:"zoneId"`
}

type CertificatePackState struct {
	// Which certificate authority to issue the certificate pack. Available values: `digicert`, `letsEncrypt`, `google`, `sslCom`. **Modifying this attribute will force creation of a new resource.**
	CertificateAuthority pulumi.StringPtrInput
	// Whether or not to include Cloudflare branding. This will add `sni.cloudflaressl.com` as the Common Name if set to `true`. **Modifying this attribute will force creation of a new resource.**
	CloudflareBranding pulumi.BoolPtrInput
	// List of hostnames to provision the certificate pack for. The zone name must be included as a host. Note: If using Let's Encrypt, you cannot use individual subdomains and only a wildcard for subdomain is available. **Modifying this attribute will force creation of a new resource.**
	Hosts pulumi.StringArrayInput
	// Certificate pack configuration type. Available values: `advanced`. **Modifying this attribute will force creation of a new resource.**
	Type             pulumi.StringPtrInput
	ValidationErrors CertificatePackValidationErrorArrayInput
	// Which validation method to use in order to prove domain ownership. Available values: `txt`, `http`, `email`. **Modifying this attribute will force creation of a new resource.**
	ValidationMethod  pulumi.StringPtrInput
	ValidationRecords CertificatePackValidationRecordArrayInput
	// How long the certificate is valid for. Note: If using Let's Encrypt, this value can only be 90 days. Available values: `14`, `30`, `90`, `365`. **Modifying this attribute will force creation of a new resource.**
	ValidityDays pulumi.IntPtrInput
	// Whether or not to wait for a certificate pack to reach status `active` during creation. Defaults to `false`. **Modifying this attribute will force creation of a new resource.**
	WaitForActiveStatus pulumi.BoolPtrInput
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringPtrInput
}

func (CertificatePackState) ElementType() reflect.Type {
	return reflect.TypeOf((*certificatePackState)(nil)).Elem()
}

type certificatePackArgs struct {
	// Which certificate authority to issue the certificate pack. Available values: `digicert`, `letsEncrypt`, `google`, `sslCom`. **Modifying this attribute will force creation of a new resource.**
	CertificateAuthority string `pulumi:"certificateAuthority"`
	// Whether or not to include Cloudflare branding. This will add `sni.cloudflaressl.com` as the Common Name if set to `true`. **Modifying this attribute will force creation of a new resource.**
	CloudflareBranding *bool `pulumi:"cloudflareBranding"`
	// List of hostnames to provision the certificate pack for. The zone name must be included as a host. Note: If using Let's Encrypt, you cannot use individual subdomains and only a wildcard for subdomain is available. **Modifying this attribute will force creation of a new resource.**
	Hosts []string `pulumi:"hosts"`
	// Certificate pack configuration type. Available values: `advanced`. **Modifying this attribute will force creation of a new resource.**
	Type             string                           `pulumi:"type"`
	ValidationErrors []CertificatePackValidationError `pulumi:"validationErrors"`
	// Which validation method to use in order to prove domain ownership. Available values: `txt`, `http`, `email`. **Modifying this attribute will force creation of a new resource.**
	ValidationMethod  string                            `pulumi:"validationMethod"`
	ValidationRecords []CertificatePackValidationRecord `pulumi:"validationRecords"`
	// How long the certificate is valid for. Note: If using Let's Encrypt, this value can only be 90 days. Available values: `14`, `30`, `90`, `365`. **Modifying this attribute will force creation of a new resource.**
	ValidityDays int `pulumi:"validityDays"`
	// Whether or not to wait for a certificate pack to reach status `active` during creation. Defaults to `false`. **Modifying this attribute will force creation of a new resource.**
	WaitForActiveStatus *bool `pulumi:"waitForActiveStatus"`
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId string `pulumi:"zoneId"`
}

// The set of arguments for constructing a CertificatePack resource.
type CertificatePackArgs struct {
	// Which certificate authority to issue the certificate pack. Available values: `digicert`, `letsEncrypt`, `google`, `sslCom`. **Modifying this attribute will force creation of a new resource.**
	CertificateAuthority pulumi.StringInput
	// Whether or not to include Cloudflare branding. This will add `sni.cloudflaressl.com` as the Common Name if set to `true`. **Modifying this attribute will force creation of a new resource.**
	CloudflareBranding pulumi.BoolPtrInput
	// List of hostnames to provision the certificate pack for. The zone name must be included as a host. Note: If using Let's Encrypt, you cannot use individual subdomains and only a wildcard for subdomain is available. **Modifying this attribute will force creation of a new resource.**
	Hosts pulumi.StringArrayInput
	// Certificate pack configuration type. Available values: `advanced`. **Modifying this attribute will force creation of a new resource.**
	Type             pulumi.StringInput
	ValidationErrors CertificatePackValidationErrorArrayInput
	// Which validation method to use in order to prove domain ownership. Available values: `txt`, `http`, `email`. **Modifying this attribute will force creation of a new resource.**
	ValidationMethod  pulumi.StringInput
	ValidationRecords CertificatePackValidationRecordArrayInput
	// How long the certificate is valid for. Note: If using Let's Encrypt, this value can only be 90 days. Available values: `14`, `30`, `90`, `365`. **Modifying this attribute will force creation of a new resource.**
	ValidityDays pulumi.IntInput
	// Whether or not to wait for a certificate pack to reach status `active` during creation. Defaults to `false`. **Modifying this attribute will force creation of a new resource.**
	WaitForActiveStatus pulumi.BoolPtrInput
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringInput
}

func (CertificatePackArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*certificatePackArgs)(nil)).Elem()
}

type CertificatePackInput interface {
	pulumi.Input

	ToCertificatePackOutput() CertificatePackOutput
	ToCertificatePackOutputWithContext(ctx context.Context) CertificatePackOutput
}

func (*CertificatePack) ElementType() reflect.Type {
	return reflect.TypeOf((**CertificatePack)(nil)).Elem()
}

func (i *CertificatePack) ToCertificatePackOutput() CertificatePackOutput {
	return i.ToCertificatePackOutputWithContext(context.Background())
}

func (i *CertificatePack) ToCertificatePackOutputWithContext(ctx context.Context) CertificatePackOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CertificatePackOutput)
}

// CertificatePackArrayInput is an input type that accepts CertificatePackArray and CertificatePackArrayOutput values.
// You can construct a concrete instance of `CertificatePackArrayInput` via:
//
//	CertificatePackArray{ CertificatePackArgs{...} }
type CertificatePackArrayInput interface {
	pulumi.Input

	ToCertificatePackArrayOutput() CertificatePackArrayOutput
	ToCertificatePackArrayOutputWithContext(context.Context) CertificatePackArrayOutput
}

type CertificatePackArray []CertificatePackInput

func (CertificatePackArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CertificatePack)(nil)).Elem()
}

func (i CertificatePackArray) ToCertificatePackArrayOutput() CertificatePackArrayOutput {
	return i.ToCertificatePackArrayOutputWithContext(context.Background())
}

func (i CertificatePackArray) ToCertificatePackArrayOutputWithContext(ctx context.Context) CertificatePackArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CertificatePackArrayOutput)
}

// CertificatePackMapInput is an input type that accepts CertificatePackMap and CertificatePackMapOutput values.
// You can construct a concrete instance of `CertificatePackMapInput` via:
//
//	CertificatePackMap{ "key": CertificatePackArgs{...} }
type CertificatePackMapInput interface {
	pulumi.Input

	ToCertificatePackMapOutput() CertificatePackMapOutput
	ToCertificatePackMapOutputWithContext(context.Context) CertificatePackMapOutput
}

type CertificatePackMap map[string]CertificatePackInput

func (CertificatePackMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CertificatePack)(nil)).Elem()
}

func (i CertificatePackMap) ToCertificatePackMapOutput() CertificatePackMapOutput {
	return i.ToCertificatePackMapOutputWithContext(context.Background())
}

func (i CertificatePackMap) ToCertificatePackMapOutputWithContext(ctx context.Context) CertificatePackMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CertificatePackMapOutput)
}

type CertificatePackOutput struct{ *pulumi.OutputState }

func (CertificatePackOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CertificatePack)(nil)).Elem()
}

func (o CertificatePackOutput) ToCertificatePackOutput() CertificatePackOutput {
	return o
}

func (o CertificatePackOutput) ToCertificatePackOutputWithContext(ctx context.Context) CertificatePackOutput {
	return o
}

// Which certificate authority to issue the certificate pack. Available values: `digicert`, `letsEncrypt`, `google`, `sslCom`. **Modifying this attribute will force creation of a new resource.**
func (o CertificatePackOutput) CertificateAuthority() pulumi.StringOutput {
	return o.ApplyT(func(v *CertificatePack) pulumi.StringOutput { return v.CertificateAuthority }).(pulumi.StringOutput)
}

// Whether or not to include Cloudflare branding. This will add `sni.cloudflaressl.com` as the Common Name if set to `true`. **Modifying this attribute will force creation of a new resource.**
func (o CertificatePackOutput) CloudflareBranding() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *CertificatePack) pulumi.BoolPtrOutput { return v.CloudflareBranding }).(pulumi.BoolPtrOutput)
}

// List of hostnames to provision the certificate pack for. The zone name must be included as a host. Note: If using Let's Encrypt, you cannot use individual subdomains and only a wildcard for subdomain is available. **Modifying this attribute will force creation of a new resource.**
func (o CertificatePackOutput) Hosts() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *CertificatePack) pulumi.StringArrayOutput { return v.Hosts }).(pulumi.StringArrayOutput)
}

// Certificate pack configuration type. Available values: `advanced`. **Modifying this attribute will force creation of a new resource.**
func (o CertificatePackOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *CertificatePack) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

func (o CertificatePackOutput) ValidationErrors() CertificatePackValidationErrorArrayOutput {
	return o.ApplyT(func(v *CertificatePack) CertificatePackValidationErrorArrayOutput { return v.ValidationErrors }).(CertificatePackValidationErrorArrayOutput)
}

// Which validation method to use in order to prove domain ownership. Available values: `txt`, `http`, `email`. **Modifying this attribute will force creation of a new resource.**
func (o CertificatePackOutput) ValidationMethod() pulumi.StringOutput {
	return o.ApplyT(func(v *CertificatePack) pulumi.StringOutput { return v.ValidationMethod }).(pulumi.StringOutput)
}

func (o CertificatePackOutput) ValidationRecords() CertificatePackValidationRecordArrayOutput {
	return o.ApplyT(func(v *CertificatePack) CertificatePackValidationRecordArrayOutput { return v.ValidationRecords }).(CertificatePackValidationRecordArrayOutput)
}

// How long the certificate is valid for. Note: If using Let's Encrypt, this value can only be 90 days. Available values: `14`, `30`, `90`, `365`. **Modifying this attribute will force creation of a new resource.**
func (o CertificatePackOutput) ValidityDays() pulumi.IntOutput {
	return o.ApplyT(func(v *CertificatePack) pulumi.IntOutput { return v.ValidityDays }).(pulumi.IntOutput)
}

// Whether or not to wait for a certificate pack to reach status `active` during creation. Defaults to `false`. **Modifying this attribute will force creation of a new resource.**
func (o CertificatePackOutput) WaitForActiveStatus() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *CertificatePack) pulumi.BoolPtrOutput { return v.WaitForActiveStatus }).(pulumi.BoolPtrOutput)
}

// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
func (o CertificatePackOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v *CertificatePack) pulumi.StringOutput { return v.ZoneId }).(pulumi.StringOutput)
}

type CertificatePackArrayOutput struct{ *pulumi.OutputState }

func (CertificatePackArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CertificatePack)(nil)).Elem()
}

func (o CertificatePackArrayOutput) ToCertificatePackArrayOutput() CertificatePackArrayOutput {
	return o
}

func (o CertificatePackArrayOutput) ToCertificatePackArrayOutputWithContext(ctx context.Context) CertificatePackArrayOutput {
	return o
}

func (o CertificatePackArrayOutput) Index(i pulumi.IntInput) CertificatePackOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CertificatePack {
		return vs[0].([]*CertificatePack)[vs[1].(int)]
	}).(CertificatePackOutput)
}

type CertificatePackMapOutput struct{ *pulumi.OutputState }

func (CertificatePackMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CertificatePack)(nil)).Elem()
}

func (o CertificatePackMapOutput) ToCertificatePackMapOutput() CertificatePackMapOutput {
	return o
}

func (o CertificatePackMapOutput) ToCertificatePackMapOutputWithContext(ctx context.Context) CertificatePackMapOutput {
	return o
}

func (o CertificatePackMapOutput) MapIndex(k pulumi.StringInput) CertificatePackOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CertificatePack {
		return vs[0].(map[string]*CertificatePack)[vs[1].(string)]
	}).(CertificatePackOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CertificatePackInput)(nil)).Elem(), &CertificatePack{})
	pulumi.RegisterInputType(reflect.TypeOf((*CertificatePackArrayInput)(nil)).Elem(), CertificatePackArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CertificatePackMapInput)(nil)).Elem(), CertificatePackMap{})
	pulumi.RegisterOutputType(CertificatePackOutput{})
	pulumi.RegisterOutputType(CertificatePackArrayOutput{})
	pulumi.RegisterOutputType(CertificatePackMapOutput{})
}
