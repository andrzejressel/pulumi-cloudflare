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

__all__ = [
    'GetIpRangesResult',
    'AwaitableGetIpRangesResult',
    'get_ip_ranges',
    'get_ip_ranges_output',
]

@pulumi.output_type
class GetIpRangesResult:
    """
    A collection of values returned by getIpRanges.
    """
    def __init__(__self__, china_ipv4_cidr_blocks=None, china_ipv6_cidr_blocks=None, cidr_blocks=None, id=None, ipv4_cidr_blocks=None, ipv6_cidr_blocks=None):
        if china_ipv4_cidr_blocks and not isinstance(china_ipv4_cidr_blocks, list):
            raise TypeError("Expected argument 'china_ipv4_cidr_blocks' to be a list")
        pulumi.set(__self__, "china_ipv4_cidr_blocks", china_ipv4_cidr_blocks)
        if china_ipv6_cidr_blocks and not isinstance(china_ipv6_cidr_blocks, list):
            raise TypeError("Expected argument 'china_ipv6_cidr_blocks' to be a list")
        pulumi.set(__self__, "china_ipv6_cidr_blocks", china_ipv6_cidr_blocks)
        if cidr_blocks and not isinstance(cidr_blocks, list):
            raise TypeError("Expected argument 'cidr_blocks' to be a list")
        pulumi.set(__self__, "cidr_blocks", cidr_blocks)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ipv4_cidr_blocks and not isinstance(ipv4_cidr_blocks, list):
            raise TypeError("Expected argument 'ipv4_cidr_blocks' to be a list")
        pulumi.set(__self__, "ipv4_cidr_blocks", ipv4_cidr_blocks)
        if ipv6_cidr_blocks and not isinstance(ipv6_cidr_blocks, list):
            raise TypeError("Expected argument 'ipv6_cidr_blocks' to be a list")
        pulumi.set(__self__, "ipv6_cidr_blocks", ipv6_cidr_blocks)

    @property
    @pulumi.getter(name="chinaIpv4CidrBlocks")
    def china_ipv4_cidr_blocks(self) -> Sequence[str]:
        """
        The lexically ordered list of only the IPv4 China CIDR blocks.
        """
        return pulumi.get(self, "china_ipv4_cidr_blocks")

    @property
    @pulumi.getter(name="chinaIpv6CidrBlocks")
    def china_ipv6_cidr_blocks(self) -> Sequence[str]:
        """
        The lexically ordered list of only the IPv6 China CIDR blocks.
        """
        return pulumi.get(self, "china_ipv6_cidr_blocks")

    @property
    @pulumi.getter(name="cidrBlocks")
    def cidr_blocks(self) -> Sequence[str]:
        """
        The lexically ordered list of all non-China CIDR blocks.
        """
        return pulumi.get(self, "cidr_blocks")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="ipv4CidrBlocks")
    def ipv4_cidr_blocks(self) -> Sequence[str]:
        """
        The lexically ordered list of only the IPv4 CIDR blocks.
        """
        return pulumi.get(self, "ipv4_cidr_blocks")

    @property
    @pulumi.getter(name="ipv6CidrBlocks")
    def ipv6_cidr_blocks(self) -> Sequence[str]:
        """
        The lexically ordered list of only the IPv6 CIDR blocks.
        """
        return pulumi.get(self, "ipv6_cidr_blocks")


class AwaitableGetIpRangesResult(GetIpRangesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetIpRangesResult(
            china_ipv4_cidr_blocks=self.china_ipv4_cidr_blocks,
            china_ipv6_cidr_blocks=self.china_ipv6_cidr_blocks,
            cidr_blocks=self.cidr_blocks,
            id=self.id,
            ipv4_cidr_blocks=self.ipv4_cidr_blocks,
            ipv6_cidr_blocks=self.ipv6_cidr_blocks)


def get_ip_ranges(opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetIpRangesResult:
    """
    Use this data source to get the [IP ranges](https://www.cloudflare.com/ips/) of Cloudflare network.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare
    import pulumi_example as example

    cloudflare = cloudflare.get_ip_ranges()
    example = example.index.FirewallResource("example",
        name=from-cloudflare,
        network=default,
        source_ranges=cloudflare.ipv4_cidr_blocks,
        allow=[{
            ports: 443,
            protocol: tcp,
        }])
    ```
    """
    __args__ = dict()
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('cloudflare:index/getIpRanges:getIpRanges', __args__, opts=opts, typ=GetIpRangesResult).value

    return AwaitableGetIpRangesResult(
        china_ipv4_cidr_blocks=pulumi.get(__ret__, 'china_ipv4_cidr_blocks'),
        china_ipv6_cidr_blocks=pulumi.get(__ret__, 'china_ipv6_cidr_blocks'),
        cidr_blocks=pulumi.get(__ret__, 'cidr_blocks'),
        id=pulumi.get(__ret__, 'id'),
        ipv4_cidr_blocks=pulumi.get(__ret__, 'ipv4_cidr_blocks'),
        ipv6_cidr_blocks=pulumi.get(__ret__, 'ipv6_cidr_blocks'))
def get_ip_ranges_output(opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetIpRangesResult]:
    """
    Use this data source to get the [IP ranges](https://www.cloudflare.com/ips/) of Cloudflare network.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare
    import pulumi_example as example

    cloudflare = cloudflare.get_ip_ranges()
    example = example.index.FirewallResource("example",
        name=from-cloudflare,
        network=default,
        source_ranges=cloudflare.ipv4_cidr_blocks,
        allow=[{
            ports: 443,
            protocol: tcp,
        }])
    ```
    """
    __args__ = dict()
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('cloudflare:index/getIpRanges:getIpRanges', __args__, opts=opts, typ=GetIpRangesResult)
    return __ret__.apply(lambda __response__: GetIpRangesResult(
        china_ipv4_cidr_blocks=pulumi.get(__response__, 'china_ipv4_cidr_blocks'),
        china_ipv6_cidr_blocks=pulumi.get(__response__, 'china_ipv6_cidr_blocks'),
        cidr_blocks=pulumi.get(__response__, 'cidr_blocks'),
        id=pulumi.get(__response__, 'id'),
        ipv4_cidr_blocks=pulumi.get(__response__, 'ipv4_cidr_blocks'),
        ipv6_cidr_blocks=pulumi.get(__response__, 'ipv6_cidr_blocks')))
