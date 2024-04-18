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
    'GetAccessIdentityProviderResult',
    'AwaitableGetAccessIdentityProviderResult',
    'get_access_identity_provider',
    'get_access_identity_provider_output',
]

@pulumi.output_type
class GetAccessIdentityProviderResult:
    """
    A collection of values returned by getAccessIdentityProvider.
    """
    def __init__(__self__, account_id=None, id=None, name=None, type=None, zone_id=None):
        if account_id and not isinstance(account_id, str):
            raise TypeError("Expected argument 'account_id' to be a str")
        pulumi.set(__self__, "account_id", account_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)
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
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        Access Identity Provider name to search for.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        Access Identity Provider Type.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> Optional[str]:
        """
        The zone identifier to target for the resource. Must provide only one of `zone_id`, `account_id`.
        """
        return pulumi.get(self, "zone_id")


class AwaitableGetAccessIdentityProviderResult(GetAccessIdentityProviderResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAccessIdentityProviderResult(
            account_id=self.account_id,
            id=self.id,
            name=self.name,
            type=self.type,
            zone_id=self.zone_id)


def get_access_identity_provider(account_id: Optional[str] = None,
                                 name: Optional[str] = None,
                                 zone_id: Optional[str] = None,
                                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAccessIdentityProviderResult:
    """
    Use this data source to lookup a single [Access Identity Provider](https://developers.cloudflare.com/cloudflare-one/identity/idp-integration) by name.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example = cloudflare.get_access_identity_provider(name="Google SSO",
        account_id="f037e56e89293a057740de681ac9abbe")
    example_access_application = cloudflare.AccessApplication("example",
        zone_id="0da42c8d2132a9ddaf714f9e7c920711",
        name="name",
        domain="name.example.com",
        type="self_hosted",
        session_duration="24h",
        allowed_idps=[example.id],
        auto_redirect_to_identity=True)
    ```
    <!--End PulumiCodeChooser -->


    :param str account_id: The account identifier to target for the resource. Must provide only one of `zone_id`, `account_id`.
    :param str name: Access Identity Provider name to search for.
    :param str zone_id: The zone identifier to target for the resource. Must provide only one of `zone_id`, `account_id`.
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    __args__['name'] = name
    __args__['zoneId'] = zone_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('cloudflare:index/getAccessIdentityProvider:getAccessIdentityProvider', __args__, opts=opts, typ=GetAccessIdentityProviderResult).value

    return AwaitableGetAccessIdentityProviderResult(
        account_id=pulumi.get(__ret__, 'account_id'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        type=pulumi.get(__ret__, 'type'),
        zone_id=pulumi.get(__ret__, 'zone_id'))


@_utilities.lift_output_func(get_access_identity_provider)
def get_access_identity_provider_output(account_id: Optional[pulumi.Input[Optional[str]]] = None,
                                        name: Optional[pulumi.Input[str]] = None,
                                        zone_id: Optional[pulumi.Input[Optional[str]]] = None,
                                        opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetAccessIdentityProviderResult]:
    """
    Use this data source to lookup a single [Access Identity Provider](https://developers.cloudflare.com/cloudflare-one/identity/idp-integration) by name.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example = cloudflare.get_access_identity_provider(name="Google SSO",
        account_id="f037e56e89293a057740de681ac9abbe")
    example_access_application = cloudflare.AccessApplication("example",
        zone_id="0da42c8d2132a9ddaf714f9e7c920711",
        name="name",
        domain="name.example.com",
        type="self_hosted",
        session_duration="24h",
        allowed_idps=[example.id],
        auto_redirect_to_identity=True)
    ```
    <!--End PulumiCodeChooser -->


    :param str account_id: The account identifier to target for the resource. Must provide only one of `zone_id`, `account_id`.
    :param str name: Access Identity Provider name to search for.
    :param str zone_id: The zone identifier to target for the resource. Must provide only one of `zone_id`, `account_id`.
    """
    ...
