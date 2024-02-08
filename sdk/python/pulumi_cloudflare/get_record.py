# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetRecordResult',
    'AwaitableGetRecordResult',
    'get_record',
    'get_record_output',
]

@pulumi.output_type
class GetRecordResult:
    """
    A collection of values returned by getRecord.
    """
    def __init__(__self__, content=None, hostname=None, id=None, locked=None, priority=None, proxiable=None, proxied=None, ttl=None, type=None, value=None, zone_id=None, zone_name=None):
        if content and not isinstance(content, str):
            raise TypeError("Expected argument 'content' to be a str")
        pulumi.set(__self__, "content", content)
        if hostname and not isinstance(hostname, str):
            raise TypeError("Expected argument 'hostname' to be a str")
        pulumi.set(__self__, "hostname", hostname)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if locked and not isinstance(locked, bool):
            raise TypeError("Expected argument 'locked' to be a bool")
        pulumi.set(__self__, "locked", locked)
        if priority and not isinstance(priority, int):
            raise TypeError("Expected argument 'priority' to be a int")
        pulumi.set(__self__, "priority", priority)
        if proxiable and not isinstance(proxiable, bool):
            raise TypeError("Expected argument 'proxiable' to be a bool")
        pulumi.set(__self__, "proxiable", proxiable)
        if proxied and not isinstance(proxied, bool):
            raise TypeError("Expected argument 'proxied' to be a bool")
        pulumi.set(__self__, "proxied", proxied)
        if ttl and not isinstance(ttl, int):
            raise TypeError("Expected argument 'ttl' to be a int")
        pulumi.set(__self__, "ttl", ttl)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)
        if value and not isinstance(value, str):
            raise TypeError("Expected argument 'value' to be a str")
        pulumi.set(__self__, "value", value)
        if zone_id and not isinstance(zone_id, str):
            raise TypeError("Expected argument 'zone_id' to be a str")
        pulumi.set(__self__, "zone_id", zone_id)
        if zone_name and not isinstance(zone_name, str):
            raise TypeError("Expected argument 'zone_name' to be a str")
        pulumi.set(__self__, "zone_name", zone_name)

    @property
    @pulumi.getter
    def content(self) -> Optional[str]:
        """
        Content to filter record results on.
        """
        return pulumi.get(self, "content")

    @property
    @pulumi.getter
    def hostname(self) -> str:
        """
        Hostname to filter DNS record results on.
        """
        return pulumi.get(self, "hostname")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def locked(self) -> bool:
        """
        Locked status of the found DNS record.
        """
        return pulumi.get(self, "locked")

    @property
    @pulumi.getter
    def priority(self) -> Optional[int]:
        """
        DNS priority to filter record results on.
        """
        return pulumi.get(self, "priority")

    @property
    @pulumi.getter
    def proxiable(self) -> bool:
        """
        Proxiable status of the found DNS record.
        """
        return pulumi.get(self, "proxiable")

    @property
    @pulumi.getter
    def proxied(self) -> bool:
        """
        Proxied status of the found DNS record.
        """
        return pulumi.get(self, "proxied")

    @property
    @pulumi.getter
    def ttl(self) -> int:
        """
        TTL of the found DNS record.
        """
        return pulumi.get(self, "ttl")

    @property
    @pulumi.getter
    def type(self) -> Optional[str]:
        """
        DNS record type to filter record results on. Defaults to `A`.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter
    def value(self) -> str:
        """
        Value of the found DNS record.
        """
        return pulumi.get(self, "value")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> str:
        """
        The zone identifier to target for the resource.
        """
        return pulumi.get(self, "zone_id")

    @property
    @pulumi.getter(name="zoneName")
    def zone_name(self) -> str:
        """
        Zone name of the found DNS record.
        """
        return pulumi.get(self, "zone_name")


class AwaitableGetRecordResult(GetRecordResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetRecordResult(
            content=self.content,
            hostname=self.hostname,
            id=self.id,
            locked=self.locked,
            priority=self.priority,
            proxiable=self.proxiable,
            proxied=self.proxied,
            ttl=self.ttl,
            type=self.type,
            value=self.value,
            zone_id=self.zone_id,
            zone_name=self.zone_name)


def get_record(content: Optional[str] = None,
               hostname: Optional[str] = None,
               priority: Optional[int] = None,
               type: Optional[str] = None,
               zone_id: Optional[str] = None,
               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetRecordResult:
    """
    Use this data source to lookup a single [DNS Record](https://api.cloudflare.com/#dns-records-for-a-zone-properties).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example = cloudflare.get_record(hostname="example.com",
        zone_id="0da42c8d2132a9ddaf714f9e7c920711")
    ```


    :param str content: Content to filter record results on.
    :param str hostname: Hostname to filter DNS record results on.
    :param int priority: DNS priority to filter record results on.
    :param str type: DNS record type to filter record results on. Defaults to `A`.
    :param str zone_id: The zone identifier to target for the resource.
    """
    __args__ = dict()
    __args__['content'] = content
    __args__['hostname'] = hostname
    __args__['priority'] = priority
    __args__['type'] = type
    __args__['zoneId'] = zone_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('cloudflare:index/getRecord:getRecord', __args__, opts=opts, typ=GetRecordResult).value

    return AwaitableGetRecordResult(
        content=pulumi.get(__ret__, 'content'),
        hostname=pulumi.get(__ret__, 'hostname'),
        id=pulumi.get(__ret__, 'id'),
        locked=pulumi.get(__ret__, 'locked'),
        priority=pulumi.get(__ret__, 'priority'),
        proxiable=pulumi.get(__ret__, 'proxiable'),
        proxied=pulumi.get(__ret__, 'proxied'),
        ttl=pulumi.get(__ret__, 'ttl'),
        type=pulumi.get(__ret__, 'type'),
        value=pulumi.get(__ret__, 'value'),
        zone_id=pulumi.get(__ret__, 'zone_id'),
        zone_name=pulumi.get(__ret__, 'zone_name'))


@_utilities.lift_output_func(get_record)
def get_record_output(content: Optional[pulumi.Input[Optional[str]]] = None,
                      hostname: Optional[pulumi.Input[str]] = None,
                      priority: Optional[pulumi.Input[Optional[int]]] = None,
                      type: Optional[pulumi.Input[Optional[str]]] = None,
                      zone_id: Optional[pulumi.Input[str]] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetRecordResult]:
    """
    Use this data source to lookup a single [DNS Record](https://api.cloudflare.com/#dns-records-for-a-zone-properties).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example = cloudflare.get_record(hostname="example.com",
        zone_id="0da42c8d2132a9ddaf714f9e7c920711")
    ```


    :param str content: Content to filter record results on.
    :param str hostname: Hostname to filter DNS record results on.
    :param int priority: DNS priority to filter record results on.
    :param str type: DNS record type to filter record results on. Defaults to `A`.
    :param str zone_id: The zone identifier to target for the resource.
    """
    ...
