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
    'GetTunnelVirtualNetworkResult',
    'AwaitableGetTunnelVirtualNetworkResult',
    'get_tunnel_virtual_network',
    'get_tunnel_virtual_network_output',
]

@pulumi.output_type
class GetTunnelVirtualNetworkResult:
    """
    A collection of values returned by getTunnelVirtualNetwork.
    """
    def __init__(__self__, account_id=None, comment=None, id=None, is_default=None, name=None):
        if account_id and not isinstance(account_id, str):
            raise TypeError("Expected argument 'account_id' to be a str")
        pulumi.set(__self__, "account_id", account_id)
        if comment and not isinstance(comment, str):
            raise TypeError("Expected argument 'comment' to be a str")
        pulumi.set(__self__, "comment", comment)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if is_default and not isinstance(is_default, bool):
            raise TypeError("Expected argument 'is_default' to be a bool")
        pulumi.set(__self__, "is_default", is_default)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> str:
        """
        The account identifier to target for the resource.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter
    def comment(self) -> str:
        """
        The Virtual Network Comment.
        """
        return pulumi.get(self, "comment")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="isDefault")
    def is_default(self) -> bool:
        """
        If true, only include deleted virtual networks. If false, exclude deleted virtual networks. If empty, all virtual networks will be included.
        """
        return pulumi.get(self, "is_default")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The Virtual Network Name.
        """
        return pulumi.get(self, "name")


class AwaitableGetTunnelVirtualNetworkResult(GetTunnelVirtualNetworkResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetTunnelVirtualNetworkResult(
            account_id=self.account_id,
            comment=self.comment,
            id=self.id,
            is_default=self.is_default,
            name=self.name)


def get_tunnel_virtual_network(account_id: Optional[str] = None,
                               name: Optional[str] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetTunnelVirtualNetworkResult:
    """
    Use this datasource to lookup a tunnel virtual network in an account.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example = cloudflare.get_tunnel_virtual_network(account_id="f037e56e89293a057740de681ac9abbe",
        name="example")
    ```
    <!--End PulumiCodeChooser -->


    :param str account_id: The account identifier to target for the resource.
    :param str name: The Virtual Network Name.
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('cloudflare:index/getTunnelVirtualNetwork:getTunnelVirtualNetwork', __args__, opts=opts, typ=GetTunnelVirtualNetworkResult).value

    return AwaitableGetTunnelVirtualNetworkResult(
        account_id=pulumi.get(__ret__, 'account_id'),
        comment=pulumi.get(__ret__, 'comment'),
        id=pulumi.get(__ret__, 'id'),
        is_default=pulumi.get(__ret__, 'is_default'),
        name=pulumi.get(__ret__, 'name'))


@_utilities.lift_output_func(get_tunnel_virtual_network)
def get_tunnel_virtual_network_output(account_id: Optional[pulumi.Input[str]] = None,
                                      name: Optional[pulumi.Input[str]] = None,
                                      opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetTunnelVirtualNetworkResult]:
    """
    Use this datasource to lookup a tunnel virtual network in an account.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example = cloudflare.get_tunnel_virtual_network(account_id="f037e56e89293a057740de681ac9abbe",
        name="example")
    ```
    <!--End PulumiCodeChooser -->


    :param str account_id: The account identifier to target for the resource.
    :param str name: The Virtual Network Name.
    """
    ...
