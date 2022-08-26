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
    'GetApiTokenPermissionGroupsResult',
    'AwaitableGetApiTokenPermissionGroupsResult',
    'get_api_token_permission_groups',
]

@pulumi.output_type
class GetApiTokenPermissionGroupsResult:
    """
    A collection of values returned by getApiTokenPermissionGroups.
    """
    def __init__(__self__, id=None, permissions=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if permissions and not isinstance(permissions, dict):
            raise TypeError("Expected argument 'permissions' to be a dict")
        pulumi.set(__self__, "permissions", permissions)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def permissions(self) -> Mapping[str, Any]:
        return pulumi.get(self, "permissions")


class AwaitableGetApiTokenPermissionGroupsResult(GetApiTokenPermissionGroupsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetApiTokenPermissionGroupsResult(
            id=self.id,
            permissions=self.permissions)


def get_api_token_permission_groups(opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetApiTokenPermissionGroupsResult:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('cloudflare:index/getApiTokenPermissionGroups:getApiTokenPermissionGroups', __args__, opts=opts, typ=GetApiTokenPermissionGroupsResult).value

    return AwaitableGetApiTokenPermissionGroupsResult(
        id=__ret__.id,
        permissions=__ret__.permissions)
