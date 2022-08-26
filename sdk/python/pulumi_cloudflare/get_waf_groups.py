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

__all__ = [
    'GetWafGroupsResult',
    'AwaitableGetWafGroupsResult',
    'get_waf_groups',
    'get_waf_groups_output',
]

@pulumi.output_type
class GetWafGroupsResult:
    """
    A collection of values returned by getWafGroups.
    """
    def __init__(__self__, filter=None, groups=None, id=None, package_id=None, zone_id=None):
        if filter and not isinstance(filter, dict):
            raise TypeError("Expected argument 'filter' to be a dict")
        pulumi.set(__self__, "filter", filter)
        if groups and not isinstance(groups, list):
            raise TypeError("Expected argument 'groups' to be a list")
        pulumi.set(__self__, "groups", groups)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if package_id and not isinstance(package_id, str):
            raise TypeError("Expected argument 'package_id' to be a str")
        pulumi.set(__self__, "package_id", package_id)
        if zone_id and not isinstance(zone_id, str):
            raise TypeError("Expected argument 'zone_id' to be a str")
        pulumi.set(__self__, "zone_id", zone_id)

    @property
    @pulumi.getter
    def filter(self) -> Optional['outputs.GetWafGroupsFilterResult']:
        return pulumi.get(self, "filter")

    @property
    @pulumi.getter
    def groups(self) -> Sequence['outputs.GetWafGroupsGroupResult']:
        return pulumi.get(self, "groups")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="packageId")
    def package_id(self) -> Optional[str]:
        return pulumi.get(self, "package_id")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> str:
        """
        The zone identifier to target for the resource.
        """
        return pulumi.get(self, "zone_id")


class AwaitableGetWafGroupsResult(GetWafGroupsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetWafGroupsResult(
            filter=self.filter,
            groups=self.groups,
            id=self.id,
            package_id=self.package_id,
            zone_id=self.zone_id)


def get_waf_groups(filter: Optional[pulumi.InputType['GetWafGroupsFilterArgs']] = None,
                   package_id: Optional[str] = None,
                   zone_id: Optional[str] = None,
                   opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetWafGroupsResult:
    """
    Use this data source to access information about an existing resource.

    :param str zone_id: The zone identifier to target for the resource.
    """
    __args__ = dict()
    __args__['filter'] = filter
    __args__['packageId'] = package_id
    __args__['zoneId'] = zone_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('cloudflare:index/getWafGroups:getWafGroups', __args__, opts=opts, typ=GetWafGroupsResult).value

    return AwaitableGetWafGroupsResult(
        filter=__ret__.filter,
        groups=__ret__.groups,
        id=__ret__.id,
        package_id=__ret__.package_id,
        zone_id=__ret__.zone_id)


@_utilities.lift_output_func(get_waf_groups)
def get_waf_groups_output(filter: Optional[pulumi.Input[Optional[pulumi.InputType['GetWafGroupsFilterArgs']]]] = None,
                          package_id: Optional[pulumi.Input[Optional[str]]] = None,
                          zone_id: Optional[pulumi.Input[str]] = None,
                          opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetWafGroupsResult]:
    """
    Use this data source to access information about an existing resource.

    :param str zone_id: The zone identifier to target for the resource.
    """
    ...
