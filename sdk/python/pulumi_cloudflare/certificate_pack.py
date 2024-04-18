# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['CertificatePackArgs', 'CertificatePack']

@pulumi.input_type
class CertificatePackArgs:
    def __init__(__self__, *,
                 certificate_authority: pulumi.Input[str],
                 hosts: pulumi.Input[Sequence[pulumi.Input[str]]],
                 type: pulumi.Input[str],
                 validation_method: pulumi.Input[str],
                 validity_days: pulumi.Input[int],
                 zone_id: pulumi.Input[str],
                 cloudflare_branding: Optional[pulumi.Input[bool]] = None,
                 validation_errors: Optional[pulumi.Input[Sequence[pulumi.Input['CertificatePackValidationErrorArgs']]]] = None,
                 validation_records: Optional[pulumi.Input[Sequence[pulumi.Input['CertificatePackValidationRecordArgs']]]] = None,
                 wait_for_active_status: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a CertificatePack resource.
        :param pulumi.Input[str] certificate_authority: Which certificate authority to issue the certificate pack. Available values: `digicert`, `lets_encrypt`, `google`. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[Sequence[pulumi.Input[str]]] hosts: List of hostnames to provision the certificate pack for. The zone name must be included as a host. Note: If using Let's Encrypt, you cannot use individual subdomains and only a wildcard for subdomain is available. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] type: Certificate pack configuration type. Available values: `advanced`. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] validation_method: Which validation method to use in order to prove domain ownership. Available values: `txt`, `http`, `email`. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[int] validity_days: How long the certificate is valid for. Note: If using Let's Encrypt, this value can only be 90 days. Available values: `14`, `30`, `90`, `365`. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[bool] cloudflare_branding: Whether or not to include Cloudflare branding. This will add `sni.cloudflaressl.com` as the Common Name if set to `true`. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[bool] wait_for_active_status: Whether or not to wait for a certificate pack to reach status `active` during creation. Defaults to `false`. **Modifying this attribute will force creation of a new resource.**
        """
        pulumi.set(__self__, "certificate_authority", certificate_authority)
        pulumi.set(__self__, "hosts", hosts)
        pulumi.set(__self__, "type", type)
        pulumi.set(__self__, "validation_method", validation_method)
        pulumi.set(__self__, "validity_days", validity_days)
        pulumi.set(__self__, "zone_id", zone_id)
        if cloudflare_branding is not None:
            pulumi.set(__self__, "cloudflare_branding", cloudflare_branding)
        if validation_errors is not None:
            pulumi.set(__self__, "validation_errors", validation_errors)
        if validation_records is not None:
            pulumi.set(__self__, "validation_records", validation_records)
        if wait_for_active_status is not None:
            pulumi.set(__self__, "wait_for_active_status", wait_for_active_status)

    @property
    @pulumi.getter(name="certificateAuthority")
    def certificate_authority(self) -> pulumi.Input[str]:
        """
        Which certificate authority to issue the certificate pack. Available values: `digicert`, `lets_encrypt`, `google`. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "certificate_authority")

    @certificate_authority.setter
    def certificate_authority(self, value: pulumi.Input[str]):
        pulumi.set(self, "certificate_authority", value)

    @property
    @pulumi.getter
    def hosts(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        List of hostnames to provision the certificate pack for. The zone name must be included as a host. Note: If using Let's Encrypt, you cannot use individual subdomains and only a wildcard for subdomain is available. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "hosts")

    @hosts.setter
    def hosts(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "hosts", value)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        Certificate pack configuration type. Available values: `advanced`. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter(name="validationMethod")
    def validation_method(self) -> pulumi.Input[str]:
        """
        Which validation method to use in order to prove domain ownership. Available values: `txt`, `http`, `email`. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "validation_method")

    @validation_method.setter
    def validation_method(self, value: pulumi.Input[str]):
        pulumi.set(self, "validation_method", value)

    @property
    @pulumi.getter(name="validityDays")
    def validity_days(self) -> pulumi.Input[int]:
        """
        How long the certificate is valid for. Note: If using Let's Encrypt, this value can only be 90 days. Available values: `14`, `30`, `90`, `365`. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "validity_days")

    @validity_days.setter
    def validity_days(self, value: pulumi.Input[int]):
        pulumi.set(self, "validity_days", value)

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Input[str]:
        """
        The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "zone_id", value)

    @property
    @pulumi.getter(name="cloudflareBranding")
    def cloudflare_branding(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether or not to include Cloudflare branding. This will add `sni.cloudflaressl.com` as the Common Name if set to `true`. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "cloudflare_branding")

    @cloudflare_branding.setter
    def cloudflare_branding(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "cloudflare_branding", value)

    @property
    @pulumi.getter(name="validationErrors")
    def validation_errors(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['CertificatePackValidationErrorArgs']]]]:
        return pulumi.get(self, "validation_errors")

    @validation_errors.setter
    def validation_errors(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['CertificatePackValidationErrorArgs']]]]):
        pulumi.set(self, "validation_errors", value)

    @property
    @pulumi.getter(name="validationRecords")
    def validation_records(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['CertificatePackValidationRecordArgs']]]]:
        return pulumi.get(self, "validation_records")

    @validation_records.setter
    def validation_records(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['CertificatePackValidationRecordArgs']]]]):
        pulumi.set(self, "validation_records", value)

    @property
    @pulumi.getter(name="waitForActiveStatus")
    def wait_for_active_status(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether or not to wait for a certificate pack to reach status `active` during creation. Defaults to `false`. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "wait_for_active_status")

    @wait_for_active_status.setter
    def wait_for_active_status(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "wait_for_active_status", value)


@pulumi.input_type
class _CertificatePackState:
    def __init__(__self__, *,
                 certificate_authority: Optional[pulumi.Input[str]] = None,
                 cloudflare_branding: Optional[pulumi.Input[bool]] = None,
                 hosts: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 validation_errors: Optional[pulumi.Input[Sequence[pulumi.Input['CertificatePackValidationErrorArgs']]]] = None,
                 validation_method: Optional[pulumi.Input[str]] = None,
                 validation_records: Optional[pulumi.Input[Sequence[pulumi.Input['CertificatePackValidationRecordArgs']]]] = None,
                 validity_days: Optional[pulumi.Input[int]] = None,
                 wait_for_active_status: Optional[pulumi.Input[bool]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering CertificatePack resources.
        :param pulumi.Input[str] certificate_authority: Which certificate authority to issue the certificate pack. Available values: `digicert`, `lets_encrypt`, `google`. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[bool] cloudflare_branding: Whether or not to include Cloudflare branding. This will add `sni.cloudflaressl.com` as the Common Name if set to `true`. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[Sequence[pulumi.Input[str]]] hosts: List of hostnames to provision the certificate pack for. The zone name must be included as a host. Note: If using Let's Encrypt, you cannot use individual subdomains and only a wildcard for subdomain is available. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] type: Certificate pack configuration type. Available values: `advanced`. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] validation_method: Which validation method to use in order to prove domain ownership. Available values: `txt`, `http`, `email`. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[int] validity_days: How long the certificate is valid for. Note: If using Let's Encrypt, this value can only be 90 days. Available values: `14`, `30`, `90`, `365`. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[bool] wait_for_active_status: Whether or not to wait for a certificate pack to reach status `active` during creation. Defaults to `false`. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        if certificate_authority is not None:
            pulumi.set(__self__, "certificate_authority", certificate_authority)
        if cloudflare_branding is not None:
            pulumi.set(__self__, "cloudflare_branding", cloudflare_branding)
        if hosts is not None:
            pulumi.set(__self__, "hosts", hosts)
        if type is not None:
            pulumi.set(__self__, "type", type)
        if validation_errors is not None:
            pulumi.set(__self__, "validation_errors", validation_errors)
        if validation_method is not None:
            pulumi.set(__self__, "validation_method", validation_method)
        if validation_records is not None:
            pulumi.set(__self__, "validation_records", validation_records)
        if validity_days is not None:
            pulumi.set(__self__, "validity_days", validity_days)
        if wait_for_active_status is not None:
            pulumi.set(__self__, "wait_for_active_status", wait_for_active_status)
        if zone_id is not None:
            pulumi.set(__self__, "zone_id", zone_id)

    @property
    @pulumi.getter(name="certificateAuthority")
    def certificate_authority(self) -> Optional[pulumi.Input[str]]:
        """
        Which certificate authority to issue the certificate pack. Available values: `digicert`, `lets_encrypt`, `google`. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "certificate_authority")

    @certificate_authority.setter
    def certificate_authority(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "certificate_authority", value)

    @property
    @pulumi.getter(name="cloudflareBranding")
    def cloudflare_branding(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether or not to include Cloudflare branding. This will add `sni.cloudflaressl.com` as the Common Name if set to `true`. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "cloudflare_branding")

    @cloudflare_branding.setter
    def cloudflare_branding(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "cloudflare_branding", value)

    @property
    @pulumi.getter
    def hosts(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        List of hostnames to provision the certificate pack for. The zone name must be included as a host. Note: If using Let's Encrypt, you cannot use individual subdomains and only a wildcard for subdomain is available. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "hosts")

    @hosts.setter
    def hosts(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "hosts", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        Certificate pack configuration type. Available values: `advanced`. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter(name="validationErrors")
    def validation_errors(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['CertificatePackValidationErrorArgs']]]]:
        return pulumi.get(self, "validation_errors")

    @validation_errors.setter
    def validation_errors(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['CertificatePackValidationErrorArgs']]]]):
        pulumi.set(self, "validation_errors", value)

    @property
    @pulumi.getter(name="validationMethod")
    def validation_method(self) -> Optional[pulumi.Input[str]]:
        """
        Which validation method to use in order to prove domain ownership. Available values: `txt`, `http`, `email`. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "validation_method")

    @validation_method.setter
    def validation_method(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "validation_method", value)

    @property
    @pulumi.getter(name="validationRecords")
    def validation_records(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['CertificatePackValidationRecordArgs']]]]:
        return pulumi.get(self, "validation_records")

    @validation_records.setter
    def validation_records(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['CertificatePackValidationRecordArgs']]]]):
        pulumi.set(self, "validation_records", value)

    @property
    @pulumi.getter(name="validityDays")
    def validity_days(self) -> Optional[pulumi.Input[int]]:
        """
        How long the certificate is valid for. Note: If using Let's Encrypt, this value can only be 90 days. Available values: `14`, `30`, `90`, `365`. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "validity_days")

    @validity_days.setter
    def validity_days(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "validity_days", value)

    @property
    @pulumi.getter(name="waitForActiveStatus")
    def wait_for_active_status(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether or not to wait for a certificate pack to reach status `active` during creation. Defaults to `false`. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "wait_for_active_status")

    @wait_for_active_status.setter
    def wait_for_active_status(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "wait_for_active_status", value)

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> Optional[pulumi.Input[str]]:
        """
        The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "zone_id", value)


class CertificatePack(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 certificate_authority: Optional[pulumi.Input[str]] = None,
                 cloudflare_branding: Optional[pulumi.Input[bool]] = None,
                 hosts: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 validation_errors: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['CertificatePackValidationErrorArgs']]]]] = None,
                 validation_method: Optional[pulumi.Input[str]] = None,
                 validation_records: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['CertificatePackValidationRecordArgs']]]]] = None,
                 validity_days: Optional[pulumi.Input[int]] = None,
                 wait_for_active_status: Optional[pulumi.Input[bool]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Example Usage

        ## Import

        ```sh
        $ pulumi import cloudflare:index/certificatePack:CertificatePack example <zone_id>/<certificate_pack_id>
        ```

        While supported, importing isn't recommended and it is advised to replace the

        certificate entirely instead.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] certificate_authority: Which certificate authority to issue the certificate pack. Available values: `digicert`, `lets_encrypt`, `google`. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[bool] cloudflare_branding: Whether or not to include Cloudflare branding. This will add `sni.cloudflaressl.com` as the Common Name if set to `true`. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[Sequence[pulumi.Input[str]]] hosts: List of hostnames to provision the certificate pack for. The zone name must be included as a host. Note: If using Let's Encrypt, you cannot use individual subdomains and only a wildcard for subdomain is available. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] type: Certificate pack configuration type. Available values: `advanced`. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] validation_method: Which validation method to use in order to prove domain ownership. Available values: `txt`, `http`, `email`. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[int] validity_days: How long the certificate is valid for. Note: If using Let's Encrypt, this value can only be 90 days. Available values: `14`, `30`, `90`, `365`. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[bool] wait_for_active_status: Whether or not to wait for a certificate pack to reach status `active` during creation. Defaults to `false`. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: CertificatePackArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ## Import

        ```sh
        $ pulumi import cloudflare:index/certificatePack:CertificatePack example <zone_id>/<certificate_pack_id>
        ```

        While supported, importing isn't recommended and it is advised to replace the

        certificate entirely instead.

        :param str resource_name: The name of the resource.
        :param CertificatePackArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(CertificatePackArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 certificate_authority: Optional[pulumi.Input[str]] = None,
                 cloudflare_branding: Optional[pulumi.Input[bool]] = None,
                 hosts: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 validation_errors: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['CertificatePackValidationErrorArgs']]]]] = None,
                 validation_method: Optional[pulumi.Input[str]] = None,
                 validation_records: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['CertificatePackValidationRecordArgs']]]]] = None,
                 validity_days: Optional[pulumi.Input[int]] = None,
                 wait_for_active_status: Optional[pulumi.Input[bool]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = CertificatePackArgs.__new__(CertificatePackArgs)

            if certificate_authority is None and not opts.urn:
                raise TypeError("Missing required property 'certificate_authority'")
            __props__.__dict__["certificate_authority"] = certificate_authority
            __props__.__dict__["cloudflare_branding"] = cloudflare_branding
            if hosts is None and not opts.urn:
                raise TypeError("Missing required property 'hosts'")
            __props__.__dict__["hosts"] = hosts
            if type is None and not opts.urn:
                raise TypeError("Missing required property 'type'")
            __props__.__dict__["type"] = type
            __props__.__dict__["validation_errors"] = validation_errors
            if validation_method is None and not opts.urn:
                raise TypeError("Missing required property 'validation_method'")
            __props__.__dict__["validation_method"] = validation_method
            __props__.__dict__["validation_records"] = validation_records
            if validity_days is None and not opts.urn:
                raise TypeError("Missing required property 'validity_days'")
            __props__.__dict__["validity_days"] = validity_days
            __props__.__dict__["wait_for_active_status"] = wait_for_active_status
            if zone_id is None and not opts.urn:
                raise TypeError("Missing required property 'zone_id'")
            __props__.__dict__["zone_id"] = zone_id
        super(CertificatePack, __self__).__init__(
            'cloudflare:index/certificatePack:CertificatePack',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            certificate_authority: Optional[pulumi.Input[str]] = None,
            cloudflare_branding: Optional[pulumi.Input[bool]] = None,
            hosts: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            type: Optional[pulumi.Input[str]] = None,
            validation_errors: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['CertificatePackValidationErrorArgs']]]]] = None,
            validation_method: Optional[pulumi.Input[str]] = None,
            validation_records: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['CertificatePackValidationRecordArgs']]]]] = None,
            validity_days: Optional[pulumi.Input[int]] = None,
            wait_for_active_status: Optional[pulumi.Input[bool]] = None,
            zone_id: Optional[pulumi.Input[str]] = None) -> 'CertificatePack':
        """
        Get an existing CertificatePack resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] certificate_authority: Which certificate authority to issue the certificate pack. Available values: `digicert`, `lets_encrypt`, `google`. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[bool] cloudflare_branding: Whether or not to include Cloudflare branding. This will add `sni.cloudflaressl.com` as the Common Name if set to `true`. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[Sequence[pulumi.Input[str]]] hosts: List of hostnames to provision the certificate pack for. The zone name must be included as a host. Note: If using Let's Encrypt, you cannot use individual subdomains and only a wildcard for subdomain is available. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] type: Certificate pack configuration type. Available values: `advanced`. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] validation_method: Which validation method to use in order to prove domain ownership. Available values: `txt`, `http`, `email`. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[int] validity_days: How long the certificate is valid for. Note: If using Let's Encrypt, this value can only be 90 days. Available values: `14`, `30`, `90`, `365`. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[bool] wait_for_active_status: Whether or not to wait for a certificate pack to reach status `active` during creation. Defaults to `false`. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _CertificatePackState.__new__(_CertificatePackState)

        __props__.__dict__["certificate_authority"] = certificate_authority
        __props__.__dict__["cloudflare_branding"] = cloudflare_branding
        __props__.__dict__["hosts"] = hosts
        __props__.__dict__["type"] = type
        __props__.__dict__["validation_errors"] = validation_errors
        __props__.__dict__["validation_method"] = validation_method
        __props__.__dict__["validation_records"] = validation_records
        __props__.__dict__["validity_days"] = validity_days
        __props__.__dict__["wait_for_active_status"] = wait_for_active_status
        __props__.__dict__["zone_id"] = zone_id
        return CertificatePack(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="certificateAuthority")
    def certificate_authority(self) -> pulumi.Output[str]:
        """
        Which certificate authority to issue the certificate pack. Available values: `digicert`, `lets_encrypt`, `google`. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "certificate_authority")

    @property
    @pulumi.getter(name="cloudflareBranding")
    def cloudflare_branding(self) -> pulumi.Output[Optional[bool]]:
        """
        Whether or not to include Cloudflare branding. This will add `sni.cloudflaressl.com` as the Common Name if set to `true`. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "cloudflare_branding")

    @property
    @pulumi.getter
    def hosts(self) -> pulumi.Output[Sequence[str]]:
        """
        List of hostnames to provision the certificate pack for. The zone name must be included as a host. Note: If using Let's Encrypt, you cannot use individual subdomains and only a wildcard for subdomain is available. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "hosts")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        Certificate pack configuration type. Available values: `advanced`. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter(name="validationErrors")
    def validation_errors(self) -> pulumi.Output[Sequence['outputs.CertificatePackValidationError']]:
        return pulumi.get(self, "validation_errors")

    @property
    @pulumi.getter(name="validationMethod")
    def validation_method(self) -> pulumi.Output[str]:
        """
        Which validation method to use in order to prove domain ownership. Available values: `txt`, `http`, `email`. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "validation_method")

    @property
    @pulumi.getter(name="validationRecords")
    def validation_records(self) -> pulumi.Output[Sequence['outputs.CertificatePackValidationRecord']]:
        return pulumi.get(self, "validation_records")

    @property
    @pulumi.getter(name="validityDays")
    def validity_days(self) -> pulumi.Output[int]:
        """
        How long the certificate is valid for. Note: If using Let's Encrypt, this value can only be 90 days. Available values: `14`, `30`, `90`, `365`. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "validity_days")

    @property
    @pulumi.getter(name="waitForActiveStatus")
    def wait_for_active_status(self) -> pulumi.Output[Optional[bool]]:
        """
        Whether or not to wait for a certificate pack to reach status `active` during creation. Defaults to `false`. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "wait_for_active_status")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Output[str]:
        """
        The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "zone_id")

