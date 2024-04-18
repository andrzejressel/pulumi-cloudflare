# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['HostnameTlsSettingCiphersArgs', 'HostnameTlsSettingCiphers']

@pulumi.input_type
class HostnameTlsSettingCiphersArgs:
    def __init__(__self__, *,
                 hostname: pulumi.Input[str],
                 values: pulumi.Input[Sequence[pulumi.Input[str]]],
                 zone_id: pulumi.Input[str],
                 ports: Optional[pulumi.Input[Sequence[pulumi.Input[int]]]] = None):
        """
        The set of arguments for constructing a HostnameTlsSettingCiphers resource.
        :param pulumi.Input[str] hostname: Hostname that belongs to this zone name. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[Sequence[pulumi.Input[str]]] values: Ciphers suites value.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[Sequence[pulumi.Input[int]]] ports: Ports to use within the IP rule.
        """
        pulumi.set(__self__, "hostname", hostname)
        pulumi.set(__self__, "values", values)
        pulumi.set(__self__, "zone_id", zone_id)
        if ports is not None:
            pulumi.set(__self__, "ports", ports)

    @property
    @pulumi.getter
    def hostname(self) -> pulumi.Input[str]:
        """
        Hostname that belongs to this zone name. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "hostname")

    @hostname.setter
    def hostname(self, value: pulumi.Input[str]):
        pulumi.set(self, "hostname", value)

    @property
    @pulumi.getter
    def values(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        Ciphers suites value.
        """
        return pulumi.get(self, "values")

    @values.setter
    def values(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "values", value)

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
    @pulumi.getter
    def ports(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[int]]]]:
        """
        Ports to use within the IP rule.
        """
        return pulumi.get(self, "ports")

    @ports.setter
    def ports(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[int]]]]):
        pulumi.set(self, "ports", value)


@pulumi.input_type
class _HostnameTlsSettingCiphersState:
    def __init__(__self__, *,
                 created_at: Optional[pulumi.Input[str]] = None,
                 hostname: Optional[pulumi.Input[str]] = None,
                 ports: Optional[pulumi.Input[Sequence[pulumi.Input[int]]]] = None,
                 updated_at: Optional[pulumi.Input[str]] = None,
                 values: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering HostnameTlsSettingCiphers resources.
        :param pulumi.Input[str] hostname: Hostname that belongs to this zone name. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[Sequence[pulumi.Input[int]]] ports: Ports to use within the IP rule.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] values: Ciphers suites value.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        if created_at is not None:
            pulumi.set(__self__, "created_at", created_at)
        if hostname is not None:
            pulumi.set(__self__, "hostname", hostname)
        if ports is not None:
            pulumi.set(__self__, "ports", ports)
        if updated_at is not None:
            pulumi.set(__self__, "updated_at", updated_at)
        if values is not None:
            pulumi.set(__self__, "values", values)
        if zone_id is not None:
            pulumi.set(__self__, "zone_id", zone_id)

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "created_at")

    @created_at.setter
    def created_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "created_at", value)

    @property
    @pulumi.getter
    def hostname(self) -> Optional[pulumi.Input[str]]:
        """
        Hostname that belongs to this zone name. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "hostname")

    @hostname.setter
    def hostname(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "hostname", value)

    @property
    @pulumi.getter
    def ports(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[int]]]]:
        """
        Ports to use within the IP rule.
        """
        return pulumi.get(self, "ports")

    @ports.setter
    def ports(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[int]]]]):
        pulumi.set(self, "ports", value)

    @property
    @pulumi.getter(name="updatedAt")
    def updated_at(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "updated_at")

    @updated_at.setter
    def updated_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "updated_at", value)

    @property
    @pulumi.getter
    def values(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Ciphers suites value.
        """
        return pulumi.get(self, "values")

    @values.setter
    def values(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "values", value)

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


class HostnameTlsSettingCiphers(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 hostname: Optional[pulumi.Input[str]] = None,
                 ports: Optional[pulumi.Input[Sequence[pulumi.Input[int]]]] = None,
                 values: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Cloudflare per-hostname TLS setting resource, specifically for ciphers suites. Used to set ciphers suites for hostnames under the specified zone.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.HostnameTlsSettingCiphers("example",
            zone_id="0da42c8d2132a9ddaf714f9e7c920711",
            hostname="sub.example.com",
            values=["ECDHE-RSA-AES128-GCM-SHA256"])
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        ```sh
        $ pulumi import cloudflare:index/hostnameTlsSettingCiphers:HostnameTlsSettingCiphers example <zone_id>/<hostname>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] hostname: Hostname that belongs to this zone name. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[Sequence[pulumi.Input[int]]] ports: Ports to use within the IP rule.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] values: Ciphers suites value.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: HostnameTlsSettingCiphersArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Cloudflare per-hostname TLS setting resource, specifically for ciphers suites. Used to set ciphers suites for hostnames under the specified zone.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.HostnameTlsSettingCiphers("example",
            zone_id="0da42c8d2132a9ddaf714f9e7c920711",
            hostname="sub.example.com",
            values=["ECDHE-RSA-AES128-GCM-SHA256"])
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        ```sh
        $ pulumi import cloudflare:index/hostnameTlsSettingCiphers:HostnameTlsSettingCiphers example <zone_id>/<hostname>
        ```

        :param str resource_name: The name of the resource.
        :param HostnameTlsSettingCiphersArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(HostnameTlsSettingCiphersArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 hostname: Optional[pulumi.Input[str]] = None,
                 ports: Optional[pulumi.Input[Sequence[pulumi.Input[int]]]] = None,
                 values: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = HostnameTlsSettingCiphersArgs.__new__(HostnameTlsSettingCiphersArgs)

            if hostname is None and not opts.urn:
                raise TypeError("Missing required property 'hostname'")
            __props__.__dict__["hostname"] = hostname
            __props__.__dict__["ports"] = ports
            if values is None and not opts.urn:
                raise TypeError("Missing required property 'values'")
            __props__.__dict__["values"] = values
            if zone_id is None and not opts.urn:
                raise TypeError("Missing required property 'zone_id'")
            __props__.__dict__["zone_id"] = zone_id
            __props__.__dict__["created_at"] = None
            __props__.__dict__["updated_at"] = None
        super(HostnameTlsSettingCiphers, __self__).__init__(
            'cloudflare:index/hostnameTlsSettingCiphers:HostnameTlsSettingCiphers',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            created_at: Optional[pulumi.Input[str]] = None,
            hostname: Optional[pulumi.Input[str]] = None,
            ports: Optional[pulumi.Input[Sequence[pulumi.Input[int]]]] = None,
            updated_at: Optional[pulumi.Input[str]] = None,
            values: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            zone_id: Optional[pulumi.Input[str]] = None) -> 'HostnameTlsSettingCiphers':
        """
        Get an existing HostnameTlsSettingCiphers resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] hostname: Hostname that belongs to this zone name. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[Sequence[pulumi.Input[int]]] ports: Ports to use within the IP rule.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] values: Ciphers suites value.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _HostnameTlsSettingCiphersState.__new__(_HostnameTlsSettingCiphersState)

        __props__.__dict__["created_at"] = created_at
        __props__.__dict__["hostname"] = hostname
        __props__.__dict__["ports"] = ports
        __props__.__dict__["updated_at"] = updated_at
        __props__.__dict__["values"] = values
        __props__.__dict__["zone_id"] = zone_id
        return HostnameTlsSettingCiphers(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> pulumi.Output[str]:
        return pulumi.get(self, "created_at")

    @property
    @pulumi.getter
    def hostname(self) -> pulumi.Output[str]:
        """
        Hostname that belongs to this zone name. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "hostname")

    @property
    @pulumi.getter
    def ports(self) -> pulumi.Output[Optional[Sequence[int]]]:
        """
        Ports to use within the IP rule.
        """
        return pulumi.get(self, "ports")

    @property
    @pulumi.getter(name="updatedAt")
    def updated_at(self) -> pulumi.Output[str]:
        return pulumi.get(self, "updated_at")

    @property
    @pulumi.getter
    def values(self) -> pulumi.Output[Sequence[str]]:
        """
        Ciphers suites value.
        """
        return pulumi.get(self, "values")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Output[str]:
        """
        The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "zone_id")

