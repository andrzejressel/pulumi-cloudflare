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

__all__ = ['ZoneSettingsOverrideArgs', 'ZoneSettingsOverride']

@pulumi.input_type
class ZoneSettingsOverrideArgs:
    def __init__(__self__, *,
                 zone_id: pulumi.Input[str],
                 settings: Optional[pulumi.Input['ZoneSettingsOverrideSettingsArgs']] = None):
        """
        The set of arguments for constructing a ZoneSettingsOverride resource.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        pulumi.set(__self__, "zone_id", zone_id)
        if settings is not None:
            pulumi.set(__self__, "settings", settings)

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
    def settings(self) -> Optional[pulumi.Input['ZoneSettingsOverrideSettingsArgs']]:
        return pulumi.get(self, "settings")

    @settings.setter
    def settings(self, value: Optional[pulumi.Input['ZoneSettingsOverrideSettingsArgs']]):
        pulumi.set(self, "settings", value)


@pulumi.input_type
class _ZoneSettingsOverrideState:
    def __init__(__self__, *,
                 initial_settings: Optional[pulumi.Input[Sequence[pulumi.Input['ZoneSettingsOverrideInitialSettingArgs']]]] = None,
                 initial_settings_read_at: Optional[pulumi.Input[str]] = None,
                 readonly_settings: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 settings: Optional[pulumi.Input['ZoneSettingsOverrideSettingsArgs']] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 zone_status: Optional[pulumi.Input[str]] = None,
                 zone_type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ZoneSettingsOverride resources.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        if initial_settings is not None:
            pulumi.set(__self__, "initial_settings", initial_settings)
        if initial_settings_read_at is not None:
            pulumi.set(__self__, "initial_settings_read_at", initial_settings_read_at)
        if readonly_settings is not None:
            pulumi.set(__self__, "readonly_settings", readonly_settings)
        if settings is not None:
            pulumi.set(__self__, "settings", settings)
        if zone_id is not None:
            pulumi.set(__self__, "zone_id", zone_id)
        if zone_status is not None:
            pulumi.set(__self__, "zone_status", zone_status)
        if zone_type is not None:
            pulumi.set(__self__, "zone_type", zone_type)

    @property
    @pulumi.getter(name="initialSettings")
    def initial_settings(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ZoneSettingsOverrideInitialSettingArgs']]]]:
        return pulumi.get(self, "initial_settings")

    @initial_settings.setter
    def initial_settings(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ZoneSettingsOverrideInitialSettingArgs']]]]):
        pulumi.set(self, "initial_settings", value)

    @property
    @pulumi.getter(name="initialSettingsReadAt")
    def initial_settings_read_at(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "initial_settings_read_at")

    @initial_settings_read_at.setter
    def initial_settings_read_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "initial_settings_read_at", value)

    @property
    @pulumi.getter(name="readonlySettings")
    def readonly_settings(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        return pulumi.get(self, "readonly_settings")

    @readonly_settings.setter
    def readonly_settings(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "readonly_settings", value)

    @property
    @pulumi.getter
    def settings(self) -> Optional[pulumi.Input['ZoneSettingsOverrideSettingsArgs']]:
        return pulumi.get(self, "settings")

    @settings.setter
    def settings(self, value: Optional[pulumi.Input['ZoneSettingsOverrideSettingsArgs']]):
        pulumi.set(self, "settings", value)

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

    @property
    @pulumi.getter(name="zoneStatus")
    def zone_status(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "zone_status")

    @zone_status.setter
    def zone_status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "zone_status", value)

    @property
    @pulumi.getter(name="zoneType")
    def zone_type(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "zone_type")

    @zone_type.setter
    def zone_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "zone_type", value)


class ZoneSettingsOverride(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 settings: Optional[pulumi.Input[pulumi.InputType['ZoneSettingsOverrideSettingsArgs']]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a resource which customizes Cloudflare zone settings.

        > You **should not** use this resource to manage every zone setting. This
          resource is only intended to override those which you do not want the default.
          Attempting to manage all settings will result in problems with the resource
          applying in a consistent manner.

        ## Plan-Dependent Settings

        Note that some settings are only available on certain plans. Setting an argument
        for a feature that is not available on the plan configured for the zone will
        result in an error:

        This is true even when setting the argument to its default value. These values
        should either be omitted or set to `null` for zones with plans that don't
        support the feature. See the [plan feature matrices](https://www.cloudflare.com/plans/) for details on
        feature support by plan.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        test = cloudflare.ZoneSettingsOverride("test",
            zone_id="0da42c8d2132a9ddaf714f9e7c920711",
            settings=cloudflare.ZoneSettingsOverrideSettingsArgs(
                brotli="on",
                challenge_ttl=2700,
                security_level="high",
                opportunistic_encryption="on",
                automatic_https_rewrites="on",
                mirage="on",
                waf="on",
                minify=cloudflare.ZoneSettingsOverrideSettingsMinifyArgs(
                    css="on",
                    js="off",
                    html="off",
                ),
                security_header=cloudflare.ZoneSettingsOverrideSettingsSecurityHeaderArgs(
                    enabled=True,
                ),
            ))
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ZoneSettingsOverrideArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a resource which customizes Cloudflare zone settings.

        > You **should not** use this resource to manage every zone setting. This
          resource is only intended to override those which you do not want the default.
          Attempting to manage all settings will result in problems with the resource
          applying in a consistent manner.

        ## Plan-Dependent Settings

        Note that some settings are only available on certain plans. Setting an argument
        for a feature that is not available on the plan configured for the zone will
        result in an error:

        This is true even when setting the argument to its default value. These values
        should either be omitted or set to `null` for zones with plans that don't
        support the feature. See the [plan feature matrices](https://www.cloudflare.com/plans/) for details on
        feature support by plan.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        test = cloudflare.ZoneSettingsOverride("test",
            zone_id="0da42c8d2132a9ddaf714f9e7c920711",
            settings=cloudflare.ZoneSettingsOverrideSettingsArgs(
                brotli="on",
                challenge_ttl=2700,
                security_level="high",
                opportunistic_encryption="on",
                automatic_https_rewrites="on",
                mirage="on",
                waf="on",
                minify=cloudflare.ZoneSettingsOverrideSettingsMinifyArgs(
                    css="on",
                    js="off",
                    html="off",
                ),
                security_header=cloudflare.ZoneSettingsOverrideSettingsSecurityHeaderArgs(
                    enabled=True,
                ),
            ))
        ```

        :param str resource_name: The name of the resource.
        :param ZoneSettingsOverrideArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ZoneSettingsOverrideArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 settings: Optional[pulumi.Input[pulumi.InputType['ZoneSettingsOverrideSettingsArgs']]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ZoneSettingsOverrideArgs.__new__(ZoneSettingsOverrideArgs)

            __props__.__dict__["settings"] = settings
            if zone_id is None and not opts.urn:
                raise TypeError("Missing required property 'zone_id'")
            __props__.__dict__["zone_id"] = zone_id
            __props__.__dict__["initial_settings"] = None
            __props__.__dict__["initial_settings_read_at"] = None
            __props__.__dict__["readonly_settings"] = None
            __props__.__dict__["zone_status"] = None
            __props__.__dict__["zone_type"] = None
        super(ZoneSettingsOverride, __self__).__init__(
            'cloudflare:index/zoneSettingsOverride:ZoneSettingsOverride',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            initial_settings: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ZoneSettingsOverrideInitialSettingArgs']]]]] = None,
            initial_settings_read_at: Optional[pulumi.Input[str]] = None,
            readonly_settings: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            settings: Optional[pulumi.Input[pulumi.InputType['ZoneSettingsOverrideSettingsArgs']]] = None,
            zone_id: Optional[pulumi.Input[str]] = None,
            zone_status: Optional[pulumi.Input[str]] = None,
            zone_type: Optional[pulumi.Input[str]] = None) -> 'ZoneSettingsOverride':
        """
        Get an existing ZoneSettingsOverride resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ZoneSettingsOverrideState.__new__(_ZoneSettingsOverrideState)

        __props__.__dict__["initial_settings"] = initial_settings
        __props__.__dict__["initial_settings_read_at"] = initial_settings_read_at
        __props__.__dict__["readonly_settings"] = readonly_settings
        __props__.__dict__["settings"] = settings
        __props__.__dict__["zone_id"] = zone_id
        __props__.__dict__["zone_status"] = zone_status
        __props__.__dict__["zone_type"] = zone_type
        return ZoneSettingsOverride(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="initialSettings")
    def initial_settings(self) -> pulumi.Output[Sequence['outputs.ZoneSettingsOverrideInitialSetting']]:
        return pulumi.get(self, "initial_settings")

    @property
    @pulumi.getter(name="initialSettingsReadAt")
    def initial_settings_read_at(self) -> pulumi.Output[str]:
        return pulumi.get(self, "initial_settings_read_at")

    @property
    @pulumi.getter(name="readonlySettings")
    def readonly_settings(self) -> pulumi.Output[Sequence[str]]:
        return pulumi.get(self, "readonly_settings")

    @property
    @pulumi.getter
    def settings(self) -> pulumi.Output['outputs.ZoneSettingsOverrideSettings']:
        return pulumi.get(self, "settings")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Output[str]:
        """
        The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "zone_id")

    @property
    @pulumi.getter(name="zoneStatus")
    def zone_status(self) -> pulumi.Output[str]:
        return pulumi.get(self, "zone_status")

    @property
    @pulumi.getter(name="zoneType")
    def zone_type(self) -> pulumi.Output[str]:
        return pulumi.get(self, "zone_type")

