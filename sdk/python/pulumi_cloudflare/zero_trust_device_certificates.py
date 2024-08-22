# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['ZeroTrustDeviceCertificatesArgs', 'ZeroTrustDeviceCertificates']

@pulumi.input_type
class ZeroTrustDeviceCertificatesArgs:
    def __init__(__self__, *,
                 enabled: pulumi.Input[bool],
                 zone_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a ZeroTrustDeviceCertificates resource.
        :param pulumi.Input[bool] enabled: `true` if certificate generation is enabled.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource.
        """
        pulumi.set(__self__, "enabled", enabled)
        pulumi.set(__self__, "zone_id", zone_id)

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Input[bool]:
        """
        `true` if certificate generation is enabled.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: pulumi.Input[bool]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Input[str]:
        """
        The zone identifier to target for the resource.
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "zone_id", value)


@pulumi.input_type
class _ZeroTrustDeviceCertificatesState:
    def __init__(__self__, *,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ZeroTrustDeviceCertificates resources.
        :param pulumi.Input[bool] enabled: `true` if certificate generation is enabled.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource.
        """
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if zone_id is not None:
            pulumi.set(__self__, "zone_id", zone_id)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        `true` if certificate generation is enabled.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> Optional[pulumi.Input[str]]:
        """
        The zone identifier to target for the resource.
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "zone_id", value)


class ZeroTrustDeviceCertificates(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Cloudflare device policy certificates resource. Device
        policy certificate resources enable client device certificate
        generation.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.ZeroTrustDeviceCertificates("example",
            zone_id="0da42c8d2132a9ddaf714f9e7c920711",
            enabled=True)
        ```

        ## Import

        ```sh
        $ pulumi import cloudflare:index/zeroTrustDeviceCertificates:ZeroTrustDeviceCertificates example <zone_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] enabled: `true` if certificate generation is enabled.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ZeroTrustDeviceCertificatesArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Cloudflare device policy certificates resource. Device
        policy certificate resources enable client device certificate
        generation.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.ZeroTrustDeviceCertificates("example",
            zone_id="0da42c8d2132a9ddaf714f9e7c920711",
            enabled=True)
        ```

        ## Import

        ```sh
        $ pulumi import cloudflare:index/zeroTrustDeviceCertificates:ZeroTrustDeviceCertificates example <zone_id>
        ```

        :param str resource_name: The name of the resource.
        :param ZeroTrustDeviceCertificatesArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ZeroTrustDeviceCertificatesArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ZeroTrustDeviceCertificatesArgs.__new__(ZeroTrustDeviceCertificatesArgs)

            if enabled is None and not opts.urn:
                raise TypeError("Missing required property 'enabled'")
            __props__.__dict__["enabled"] = enabled
            if zone_id is None and not opts.urn:
                raise TypeError("Missing required property 'zone_id'")
            __props__.__dict__["zone_id"] = zone_id
        super(ZeroTrustDeviceCertificates, __self__).__init__(
            'cloudflare:index/zeroTrustDeviceCertificates:ZeroTrustDeviceCertificates',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            enabled: Optional[pulumi.Input[bool]] = None,
            zone_id: Optional[pulumi.Input[str]] = None) -> 'ZeroTrustDeviceCertificates':
        """
        Get an existing ZeroTrustDeviceCertificates resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] enabled: `true` if certificate generation is enabled.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ZeroTrustDeviceCertificatesState.__new__(_ZeroTrustDeviceCertificatesState)

        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["zone_id"] = zone_id
        return ZeroTrustDeviceCertificates(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[bool]:
        """
        `true` if certificate generation is enabled.
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Output[str]:
        """
        The zone identifier to target for the resource.
        """
        return pulumi.get(self, "zone_id")

