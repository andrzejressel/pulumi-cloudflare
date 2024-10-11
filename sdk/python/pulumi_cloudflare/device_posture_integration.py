# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['DevicePostureIntegrationArgs', 'DevicePostureIntegration']

@pulumi.input_type
class DevicePostureIntegrationArgs:
    def __init__(__self__, *,
                 account_id: pulumi.Input[str],
                 name: pulumi.Input[str],
                 type: pulumi.Input[str],
                 configs: Optional[pulumi.Input[Sequence[pulumi.Input['DevicePostureIntegrationConfigArgs']]]] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 interval: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a DevicePostureIntegration resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[str] name: Name of the device posture integration.
        :param pulumi.Input[str] type: The device posture integration type. Available values: `workspace_one`, `uptycs`, `crowdstrike_s2s`, `intune`, `kolide`, `sentinelone_s2s`, `tanium_s2s`, `custom_s2s`.
        :param pulumi.Input[Sequence[pulumi.Input['DevicePostureIntegrationConfigArgs']]] configs: The device posture integration's connection authorization parameters.
        :param pulumi.Input[str] interval: Indicates the frequency with which to poll the third-party API. Must be in the format `1h` or `30m`.
        """
        pulumi.set(__self__, "account_id", account_id)
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "type", type)
        if configs is not None:
            pulumi.set(__self__, "configs", configs)
        if identifier is not None:
            pulumi.set(__self__, "identifier", identifier)
        if interval is not None:
            pulumi.set(__self__, "interval", interval)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Input[str]:
        """
        The account identifier to target for the resource.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Input[str]:
        """
        Name of the device posture integration.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[str]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        The device posture integration type. Available values: `workspace_one`, `uptycs`, `crowdstrike_s2s`, `intune`, `kolide`, `sentinelone_s2s`, `tanium_s2s`, `custom_s2s`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter
    def configs(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['DevicePostureIntegrationConfigArgs']]]]:
        """
        The device posture integration's connection authorization parameters.
        """
        return pulumi.get(self, "configs")

    @configs.setter
    def configs(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['DevicePostureIntegrationConfigArgs']]]]):
        pulumi.set(self, "configs", value)

    @property
    @pulumi.getter
    def identifier(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "identifier")

    @identifier.setter
    def identifier(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "identifier", value)

    @property
    @pulumi.getter
    def interval(self) -> Optional[pulumi.Input[str]]:
        """
        Indicates the frequency with which to poll the third-party API. Must be in the format `1h` or `30m`.
        """
        return pulumi.get(self, "interval")

    @interval.setter
    def interval(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "interval", value)


@pulumi.input_type
class _DevicePostureIntegrationState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[str]] = None,
                 configs: Optional[pulumi.Input[Sequence[pulumi.Input['DevicePostureIntegrationConfigArgs']]]] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 interval: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering DevicePostureIntegration resources.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[Sequence[pulumi.Input['DevicePostureIntegrationConfigArgs']]] configs: The device posture integration's connection authorization parameters.
        :param pulumi.Input[str] interval: Indicates the frequency with which to poll the third-party API. Must be in the format `1h` or `30m`.
        :param pulumi.Input[str] name: Name of the device posture integration.
        :param pulumi.Input[str] type: The device posture integration type. Available values: `workspace_one`, `uptycs`, `crowdstrike_s2s`, `intune`, `kolide`, `sentinelone_s2s`, `tanium_s2s`, `custom_s2s`.
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if configs is not None:
            pulumi.set(__self__, "configs", configs)
        if identifier is not None:
            pulumi.set(__self__, "identifier", identifier)
        if interval is not None:
            pulumi.set(__self__, "interval", interval)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[str]]:
        """
        The account identifier to target for the resource.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter
    def configs(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['DevicePostureIntegrationConfigArgs']]]]:
        """
        The device posture integration's connection authorization parameters.
        """
        return pulumi.get(self, "configs")

    @configs.setter
    def configs(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['DevicePostureIntegrationConfigArgs']]]]):
        pulumi.set(self, "configs", value)

    @property
    @pulumi.getter
    def identifier(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "identifier")

    @identifier.setter
    def identifier(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "identifier", value)

    @property
    @pulumi.getter
    def interval(self) -> Optional[pulumi.Input[str]]:
        """
        Indicates the frequency with which to poll the third-party API. Must be in the format `1h` or `30m`.
        """
        return pulumi.get(self, "interval")

    @interval.setter
    def interval(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "interval", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the device posture integration.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        The device posture integration type. Available values: `workspace_one`, `uptycs`, `crowdstrike_s2s`, `intune`, `kolide`, `sentinelone_s2s`, `tanium_s2s`, `custom_s2s`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


class DevicePostureIntegration(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 configs: Optional[pulumi.Input[Sequence[pulumi.Input[Union['DevicePostureIntegrationConfigArgs', 'DevicePostureIntegrationConfigArgsDict']]]]] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 interval: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Cloudflare Device Posture Integration resource. Device
        posture integrations configure third-party data providers for device
        posture rules.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.DevicePostureIntegration("example",
            account_id="f037e56e89293a057740de681ac9abbe",
            name="Device posture integration",
            type="workspace_one",
            interval="24h",
            configs=[{
                "api_url": "https://example.com/api",
                "auth_url": "https://example.com/connect/token",
                "client_id": "client-id",
                "client_secret": "client-secret",
            }])
        ```

        ## Import

        ```sh
        $ pulumi import cloudflare:index/devicePostureIntegration:DevicePostureIntegration example <account_id>/<device_posture_integration_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[Union['DevicePostureIntegrationConfigArgs', 'DevicePostureIntegrationConfigArgsDict']]]] configs: The device posture integration's connection authorization parameters.
        :param pulumi.Input[str] interval: Indicates the frequency with which to poll the third-party API. Must be in the format `1h` or `30m`.
        :param pulumi.Input[str] name: Name of the device posture integration.
        :param pulumi.Input[str] type: The device posture integration type. Available values: `workspace_one`, `uptycs`, `crowdstrike_s2s`, `intune`, `kolide`, `sentinelone_s2s`, `tanium_s2s`, `custom_s2s`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DevicePostureIntegrationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Cloudflare Device Posture Integration resource. Device
        posture integrations configure third-party data providers for device
        posture rules.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.DevicePostureIntegration("example",
            account_id="f037e56e89293a057740de681ac9abbe",
            name="Device posture integration",
            type="workspace_one",
            interval="24h",
            configs=[{
                "api_url": "https://example.com/api",
                "auth_url": "https://example.com/connect/token",
                "client_id": "client-id",
                "client_secret": "client-secret",
            }])
        ```

        ## Import

        ```sh
        $ pulumi import cloudflare:index/devicePostureIntegration:DevicePostureIntegration example <account_id>/<device_posture_integration_id>
        ```

        :param str resource_name: The name of the resource.
        :param DevicePostureIntegrationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DevicePostureIntegrationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 configs: Optional[pulumi.Input[Sequence[pulumi.Input[Union['DevicePostureIntegrationConfigArgs', 'DevicePostureIntegrationConfigArgsDict']]]]] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 interval: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DevicePostureIntegrationArgs.__new__(DevicePostureIntegrationArgs)

            if account_id is None and not opts.urn:
                raise TypeError("Missing required property 'account_id'")
            __props__.__dict__["account_id"] = account_id
            __props__.__dict__["configs"] = configs
            __props__.__dict__["identifier"] = identifier
            __props__.__dict__["interval"] = interval
            if name is None and not opts.urn:
                raise TypeError("Missing required property 'name'")
            __props__.__dict__["name"] = name
            if type is None and not opts.urn:
                raise TypeError("Missing required property 'type'")
            __props__.__dict__["type"] = type
        super(DevicePostureIntegration, __self__).__init__(
            'cloudflare:index/devicePostureIntegration:DevicePostureIntegration',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[str]] = None,
            configs: Optional[pulumi.Input[Sequence[pulumi.Input[Union['DevicePostureIntegrationConfigArgs', 'DevicePostureIntegrationConfigArgsDict']]]]] = None,
            identifier: Optional[pulumi.Input[str]] = None,
            interval: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            type: Optional[pulumi.Input[str]] = None) -> 'DevicePostureIntegration':
        """
        Get an existing DevicePostureIntegration resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[Union['DevicePostureIntegrationConfigArgs', 'DevicePostureIntegrationConfigArgsDict']]]] configs: The device posture integration's connection authorization parameters.
        :param pulumi.Input[str] interval: Indicates the frequency with which to poll the third-party API. Must be in the format `1h` or `30m`.
        :param pulumi.Input[str] name: Name of the device posture integration.
        :param pulumi.Input[str] type: The device posture integration type. Available values: `workspace_one`, `uptycs`, `crowdstrike_s2s`, `intune`, `kolide`, `sentinelone_s2s`, `tanium_s2s`, `custom_s2s`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DevicePostureIntegrationState.__new__(_DevicePostureIntegrationState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["configs"] = configs
        __props__.__dict__["identifier"] = identifier
        __props__.__dict__["interval"] = interval
        __props__.__dict__["name"] = name
        __props__.__dict__["type"] = type
        return DevicePostureIntegration(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[str]:
        """
        The account identifier to target for the resource.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter
    def configs(self) -> pulumi.Output[Optional[Sequence['outputs.DevicePostureIntegrationConfig']]]:
        """
        The device posture integration's connection authorization parameters.
        """
        return pulumi.get(self, "configs")

    @property
    @pulumi.getter
    def identifier(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "identifier")

    @property
    @pulumi.getter
    def interval(self) -> pulumi.Output[Optional[str]]:
        """
        Indicates the frequency with which to poll the third-party API. Must be in the format `1h` or `30m`.
        """
        return pulumi.get(self, "interval")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the device posture integration.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        The device posture integration type. Available values: `workspace_one`, `uptycs`, `crowdstrike_s2s`, `intune`, `kolide`, `sentinelone_s2s`, `tanium_s2s`, `custom_s2s`.
        """
        return pulumi.get(self, "type")

