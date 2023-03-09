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
    'GetRulesetsResult',
    'AwaitableGetRulesetsResult',
    'get_rulesets',
    'get_rulesets_output',
]

@pulumi.output_type
class GetRulesetsResult:
    """
    A collection of values returned by getRulesets.
    """
    def __init__(__self__, account_id=None, filter=None, id=None, include_rules=None, rulesets=None, zone_id=None):
        if account_id and not isinstance(account_id, str):
            raise TypeError("Expected argument 'account_id' to be a str")
        pulumi.set(__self__, "account_id", account_id)
        if filter and not isinstance(filter, dict):
            raise TypeError("Expected argument 'filter' to be a dict")
        pulumi.set(__self__, "filter", filter)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if include_rules and not isinstance(include_rules, bool):
            raise TypeError("Expected argument 'include_rules' to be a bool")
        pulumi.set(__self__, "include_rules", include_rules)
        if rulesets and not isinstance(rulesets, list):
            raise TypeError("Expected argument 'rulesets' to be a list")
        pulumi.set(__self__, "rulesets", rulesets)
        if zone_id and not isinstance(zone_id, str):
            raise TypeError("Expected argument 'zone_id' to be a str")
        pulumi.set(__self__, "zone_id", zone_id)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[str]:
        """
        The account identifier to target for the resource. Must provide only one of `zone_id`, `account_id`.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter
    def filter(self) -> Optional['outputs.GetRulesetsFilterResult']:
        return pulumi.get(self, "filter")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="includeRules")
    def include_rules(self) -> Optional[bool]:
        """
        Include rule data in response.
        """
        return pulumi.get(self, "include_rules")

    @property
    @pulumi.getter
    def rulesets(self) -> Sequence['outputs.GetRulesetsRulesetResult']:
        return pulumi.get(self, "rulesets")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> Optional[str]:
        """
        The zone identifier to target for the resource. Must provide only one of `zone_id`, `account_id`.
        """
        return pulumi.get(self, "zone_id")


class AwaitableGetRulesetsResult(GetRulesetsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetRulesetsResult(
            account_id=self.account_id,
            filter=self.filter,
            id=self.id,
            include_rules=self.include_rules,
            rulesets=self.rulesets,
            zone_id=self.zone_id)


def get_rulesets(account_id: Optional[str] = None,
                 filter: Optional[pulumi.InputType['GetRulesetsFilterArgs']] = None,
                 include_rules: Optional[bool] = None,
                 zone_id: Optional[str] = None,
                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetRulesetsResult:
    """
    Use this datasource to lookup Rulesets in an account or zone.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example = cloudflare.get_rulesets(filter=cloudflare.GetRulesetsFilterArgs(
            name=".*OWASP.*",
        ),
        zone_id="0da42c8d2132a9ddaf714f9e7c920711")
    ```


    :param str account_id: The account identifier to target for the resource. Must provide only one of `zone_id`, `account_id`.
    :param bool include_rules: Include rule data in response.
    :param str zone_id: The zone identifier to target for the resource. Must provide only one of `zone_id`, `account_id`.
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    __args__['filter'] = filter
    __args__['includeRules'] = include_rules
    __args__['zoneId'] = zone_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('cloudflare:index/getRulesets:getRulesets', __args__, opts=opts, typ=GetRulesetsResult).value

    return AwaitableGetRulesetsResult(
        account_id=__ret__.account_id,
        filter=__ret__.filter,
        id=__ret__.id,
        include_rules=__ret__.include_rules,
        rulesets=__ret__.rulesets,
        zone_id=__ret__.zone_id)


@_utilities.lift_output_func(get_rulesets)
def get_rulesets_output(account_id: Optional[pulumi.Input[Optional[str]]] = None,
                        filter: Optional[pulumi.Input[Optional[pulumi.InputType['GetRulesetsFilterArgs']]]] = None,
                        include_rules: Optional[pulumi.Input[Optional[bool]]] = None,
                        zone_id: Optional[pulumi.Input[Optional[str]]] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetRulesetsResult]:
    """
    Use this datasource to lookup Rulesets in an account or zone.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example = cloudflare.get_rulesets(filter=cloudflare.GetRulesetsFilterArgs(
            name=".*OWASP.*",
        ),
        zone_id="0da42c8d2132a9ddaf714f9e7c920711")
    ```


    :param str account_id: The account identifier to target for the resource. Must provide only one of `zone_id`, `account_id`.
    :param bool include_rules: Include rule data in response.
    :param str zone_id: The zone identifier to target for the resource. Must provide only one of `zone_id`, `account_id`.
    """
    ...
