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

__all__ = [
    'GetInfrastructureAccessTargetsResult',
    'AwaitableGetInfrastructureAccessTargetsResult',
    'get_infrastructure_access_targets',
    'get_infrastructure_access_targets_output',
]

@pulumi.output_type
class GetInfrastructureAccessTargetsResult:
    """
    A collection of values returned by getInfrastructureAccessTargets.
    """
    def __init__(__self__, account_id=None, created_after=None, hostname=None, hostname_contains=None, id=None, ipv4=None, ipv6=None, modified_after=None, targets=None, virtual_network_id=None):
        if account_id and not isinstance(account_id, str):
            raise TypeError("Expected argument 'account_id' to be a str")
        pulumi.set(__self__, "account_id", account_id)
        if created_after and not isinstance(created_after, str):
            raise TypeError("Expected argument 'created_after' to be a str")
        pulumi.set(__self__, "created_after", created_after)
        if hostname and not isinstance(hostname, str):
            raise TypeError("Expected argument 'hostname' to be a str")
        pulumi.set(__self__, "hostname", hostname)
        if hostname_contains and not isinstance(hostname_contains, str):
            raise TypeError("Expected argument 'hostname_contains' to be a str")
        pulumi.set(__self__, "hostname_contains", hostname_contains)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ipv4 and not isinstance(ipv4, str):
            raise TypeError("Expected argument 'ipv4' to be a str")
        pulumi.set(__self__, "ipv4", ipv4)
        if ipv6 and not isinstance(ipv6, str):
            raise TypeError("Expected argument 'ipv6' to be a str")
        pulumi.set(__self__, "ipv6", ipv6)
        if modified_after and not isinstance(modified_after, str):
            raise TypeError("Expected argument 'modified_after' to be a str")
        pulumi.set(__self__, "modified_after", modified_after)
        if targets and not isinstance(targets, list):
            raise TypeError("Expected argument 'targets' to be a list")
        pulumi.set(__self__, "targets", targets)
        if virtual_network_id and not isinstance(virtual_network_id, str):
            raise TypeError("Expected argument 'virtual_network_id' to be a str")
        pulumi.set(__self__, "virtual_network_id", virtual_network_id)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> str:
        """
        The account identifier to target for the resource.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter(name="createdAfter")
    def created_after(self) -> Optional[str]:
        """
        A date and time after a target was created to filter on.
        """
        return pulumi.get(self, "created_after")

    @property
    @pulumi.getter
    def hostname(self) -> Optional[str]:
        """
        The name of the app type.
        """
        return pulumi.get(self, "hostname")

    @property
    @pulumi.getter(name="hostnameContains")
    def hostname_contains(self) -> Optional[str]:
        """
        The name of the app type.
        """
        return pulumi.get(self, "hostname_contains")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def ipv4(self) -> Optional[str]:
        """
        The name of the app type.
        """
        return pulumi.get(self, "ipv4")

    @property
    @pulumi.getter
    def ipv6(self) -> Optional[str]:
        """
        The name of the app type.
        """
        return pulumi.get(self, "ipv6")

    @property
    @pulumi.getter(name="modifiedAfter")
    def modified_after(self) -> Optional[str]:
        """
        A date and time after a target was modified to filter on.
        """
        return pulumi.get(self, "modified_after")

    @property
    @pulumi.getter
    def targets(self) -> Sequence['outputs.GetInfrastructureAccessTargetsTargetResult']:
        return pulumi.get(self, "targets")

    @property
    @pulumi.getter(name="virtualNetworkId")
    def virtual_network_id(self) -> Optional[str]:
        """
        The name of the app type.
        """
        return pulumi.get(self, "virtual_network_id")


class AwaitableGetInfrastructureAccessTargetsResult(GetInfrastructureAccessTargetsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetInfrastructureAccessTargetsResult(
            account_id=self.account_id,
            created_after=self.created_after,
            hostname=self.hostname,
            hostname_contains=self.hostname_contains,
            id=self.id,
            ipv4=self.ipv4,
            ipv6=self.ipv6,
            modified_after=self.modified_after,
            targets=self.targets,
            virtual_network_id=self.virtual_network_id)


def get_infrastructure_access_targets(account_id: Optional[str] = None,
                                      created_after: Optional[str] = None,
                                      hostname: Optional[str] = None,
                                      hostname_contains: Optional[str] = None,
                                      ipv4: Optional[str] = None,
                                      ipv6: Optional[str] = None,
                                      modified_after: Optional[str] = None,
                                      virtual_network_id: Optional[str] = None,
                                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetInfrastructureAccessTargetsResult:
    """
    Use this data source to retrieve all Infrastructure Access Targets.


    :param str account_id: The account identifier to target for the resource.
    :param str created_after: A date and time after a target was created to filter on.
    :param str hostname: The name of the app type.
    :param str hostname_contains: The name of the app type.
    :param str ipv4: The name of the app type.
    :param str ipv6: The name of the app type.
    :param str modified_after: A date and time after a target was modified to filter on.
    :param str virtual_network_id: The name of the app type.
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    __args__['createdAfter'] = created_after
    __args__['hostname'] = hostname
    __args__['hostnameContains'] = hostname_contains
    __args__['ipv4'] = ipv4
    __args__['ipv6'] = ipv6
    __args__['modifiedAfter'] = modified_after
    __args__['virtualNetworkId'] = virtual_network_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('cloudflare:index/getInfrastructureAccessTargets:getInfrastructureAccessTargets', __args__, opts=opts, typ=GetInfrastructureAccessTargetsResult).value

    return AwaitableGetInfrastructureAccessTargetsResult(
        account_id=pulumi.get(__ret__, 'account_id'),
        created_after=pulumi.get(__ret__, 'created_after'),
        hostname=pulumi.get(__ret__, 'hostname'),
        hostname_contains=pulumi.get(__ret__, 'hostname_contains'),
        id=pulumi.get(__ret__, 'id'),
        ipv4=pulumi.get(__ret__, 'ipv4'),
        ipv6=pulumi.get(__ret__, 'ipv6'),
        modified_after=pulumi.get(__ret__, 'modified_after'),
        targets=pulumi.get(__ret__, 'targets'),
        virtual_network_id=pulumi.get(__ret__, 'virtual_network_id'))


@_utilities.lift_output_func(get_infrastructure_access_targets)
def get_infrastructure_access_targets_output(account_id: Optional[pulumi.Input[str]] = None,
                                             created_after: Optional[pulumi.Input[Optional[str]]] = None,
                                             hostname: Optional[pulumi.Input[Optional[str]]] = None,
                                             hostname_contains: Optional[pulumi.Input[Optional[str]]] = None,
                                             ipv4: Optional[pulumi.Input[Optional[str]]] = None,
                                             ipv6: Optional[pulumi.Input[Optional[str]]] = None,
                                             modified_after: Optional[pulumi.Input[Optional[str]]] = None,
                                             virtual_network_id: Optional[pulumi.Input[Optional[str]]] = None,
                                             opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetInfrastructureAccessTargetsResult]:
    """
    Use this data source to retrieve all Infrastructure Access Targets.


    :param str account_id: The account identifier to target for the resource.
    :param str created_after: A date and time after a target was created to filter on.
    :param str hostname: The name of the app type.
    :param str hostname_contains: The name of the app type.
    :param str ipv4: The name of the app type.
    :param str ipv6: The name of the app type.
    :param str modified_after: A date and time after a target was modified to filter on.
    :param str virtual_network_id: The name of the app type.
    """
    ...
