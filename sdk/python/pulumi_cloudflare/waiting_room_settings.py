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

__all__ = ['WaitingRoomSettingsArgs', 'WaitingRoomSettings']

@pulumi.input_type
class WaitingRoomSettingsArgs:
    def __init__(__self__, *,
                 zone_id: pulumi.Input[str],
                 search_engine_crawler_bypass: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a WaitingRoomSettings resource.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[bool] search_engine_crawler_bypass: Whether to allow verified search engine crawlers to bypass all waiting rooms on this zone. Defaults to `false`.
        """
        pulumi.set(__self__, "zone_id", zone_id)
        if search_engine_crawler_bypass is not None:
            pulumi.set(__self__, "search_engine_crawler_bypass", search_engine_crawler_bypass)

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
    @pulumi.getter(name="searchEngineCrawlerBypass")
    def search_engine_crawler_bypass(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether to allow verified search engine crawlers to bypass all waiting rooms on this zone. Defaults to `false`.
        """
        return pulumi.get(self, "search_engine_crawler_bypass")

    @search_engine_crawler_bypass.setter
    def search_engine_crawler_bypass(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "search_engine_crawler_bypass", value)


@pulumi.input_type
class _WaitingRoomSettingsState:
    def __init__(__self__, *,
                 search_engine_crawler_bypass: Optional[pulumi.Input[bool]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering WaitingRoomSettings resources.
        :param pulumi.Input[bool] search_engine_crawler_bypass: Whether to allow verified search engine crawlers to bypass all waiting rooms on this zone. Defaults to `false`.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        if search_engine_crawler_bypass is not None:
            pulumi.set(__self__, "search_engine_crawler_bypass", search_engine_crawler_bypass)
        if zone_id is not None:
            pulumi.set(__self__, "zone_id", zone_id)

    @property
    @pulumi.getter(name="searchEngineCrawlerBypass")
    def search_engine_crawler_bypass(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether to allow verified search engine crawlers to bypass all waiting rooms on this zone. Defaults to `false`.
        """
        return pulumi.get(self, "search_engine_crawler_bypass")

    @search_engine_crawler_bypass.setter
    def search_engine_crawler_bypass(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "search_engine_crawler_bypass", value)

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


class WaitingRoomSettings(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 search_engine_crawler_bypass: Optional[pulumi.Input[bool]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Configure zone-wide settings for Cloudflare waiting rooms.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.WaitingRoomSettings("example",
            zone_id="0da42c8d2132a9ddaf714f9e7c920711",
            search_engine_crawler_bypass=True)
        ```

        ## Import

        ```sh
        $ pulumi import cloudflare:index/waitingRoomSettings:WaitingRoomSettings example <zone_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] search_engine_crawler_bypass: Whether to allow verified search engine crawlers to bypass all waiting rooms on this zone. Defaults to `false`.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: WaitingRoomSettingsArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Configure zone-wide settings for Cloudflare waiting rooms.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.WaitingRoomSettings("example",
            zone_id="0da42c8d2132a9ddaf714f9e7c920711",
            search_engine_crawler_bypass=True)
        ```

        ## Import

        ```sh
        $ pulumi import cloudflare:index/waitingRoomSettings:WaitingRoomSettings example <zone_id>
        ```

        :param str resource_name: The name of the resource.
        :param WaitingRoomSettingsArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(WaitingRoomSettingsArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 search_engine_crawler_bypass: Optional[pulumi.Input[bool]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = WaitingRoomSettingsArgs.__new__(WaitingRoomSettingsArgs)

            __props__.__dict__["search_engine_crawler_bypass"] = search_engine_crawler_bypass
            if zone_id is None and not opts.urn:
                raise TypeError("Missing required property 'zone_id'")
            __props__.__dict__["zone_id"] = zone_id
        super(WaitingRoomSettings, __self__).__init__(
            'cloudflare:index/waitingRoomSettings:WaitingRoomSettings',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            search_engine_crawler_bypass: Optional[pulumi.Input[bool]] = None,
            zone_id: Optional[pulumi.Input[str]] = None) -> 'WaitingRoomSettings':
        """
        Get an existing WaitingRoomSettings resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] search_engine_crawler_bypass: Whether to allow verified search engine crawlers to bypass all waiting rooms on this zone. Defaults to `false`.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _WaitingRoomSettingsState.__new__(_WaitingRoomSettingsState)

        __props__.__dict__["search_engine_crawler_bypass"] = search_engine_crawler_bypass
        __props__.__dict__["zone_id"] = zone_id
        return WaitingRoomSettings(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="searchEngineCrawlerBypass")
    def search_engine_crawler_bypass(self) -> pulumi.Output[Optional[bool]]:
        """
        Whether to allow verified search engine crawlers to bypass all waiting rooms on this zone. Defaults to `false`.
        """
        return pulumi.get(self, "search_engine_crawler_bypass")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Output[str]:
        """
        The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "zone_id")

