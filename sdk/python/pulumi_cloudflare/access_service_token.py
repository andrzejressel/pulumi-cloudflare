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

__all__ = ['AccessServiceTokenArgs', 'AccessServiceToken']

@pulumi.input_type
class AccessServiceTokenArgs:
    def __init__(__self__, *,
                 name: pulumi.Input[str],
                 account_id: Optional[pulumi.Input[str]] = None,
                 duration: Optional[pulumi.Input[str]] = None,
                 min_days_for_renewal: Optional[pulumi.Input[int]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a AccessServiceToken resource.
        :param pulumi.Input[str] name: Friendly name of the token's intent.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource. Conflicts with `zone_id`.
        :param pulumi.Input[str] duration: Length of time the service token is valid for. Available values: `8760h`, `17520h`, `43800h`, `87600h`, `forever`.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. Conflicts with `account_id`.
        """
        pulumi.set(__self__, "name", name)
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if duration is not None:
            pulumi.set(__self__, "duration", duration)
        if min_days_for_renewal is not None:
            pulumi.set(__self__, "min_days_for_renewal", min_days_for_renewal)
        if zone_id is not None:
            pulumi.set(__self__, "zone_id", zone_id)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Input[str]:
        """
        Friendly name of the token's intent.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[str]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[str]]:
        """
        The account identifier to target for the resource. Conflicts with `zone_id`.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter
    def duration(self) -> Optional[pulumi.Input[str]]:
        """
        Length of time the service token is valid for. Available values: `8760h`, `17520h`, `43800h`, `87600h`, `forever`.
        """
        return pulumi.get(self, "duration")

    @duration.setter
    def duration(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "duration", value)

    @property
    @pulumi.getter(name="minDaysForRenewal")
    def min_days_for_renewal(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "min_days_for_renewal")

    @min_days_for_renewal.setter
    def min_days_for_renewal(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "min_days_for_renewal", value)

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> Optional[pulumi.Input[str]]:
        """
        The zone identifier to target for the resource. Conflicts with `account_id`.
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "zone_id", value)


@pulumi.input_type
class _AccessServiceTokenState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[str]] = None,
                 client_id: Optional[pulumi.Input[str]] = None,
                 client_secret: Optional[pulumi.Input[str]] = None,
                 duration: Optional[pulumi.Input[str]] = None,
                 expires_at: Optional[pulumi.Input[str]] = None,
                 min_days_for_renewal: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering AccessServiceToken resources.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource. Conflicts with `zone_id`.
        :param pulumi.Input[str] client_id: Client ID associated with the Service Token. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] client_secret: A secret for interacting with Access protocols. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] duration: Length of time the service token is valid for. Available values: `8760h`, `17520h`, `43800h`, `87600h`, `forever`.
        :param pulumi.Input[str] expires_at: Date when the token expires.
        :param pulumi.Input[str] name: Friendly name of the token's intent.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. Conflicts with `account_id`.
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if client_id is not None:
            pulumi.set(__self__, "client_id", client_id)
        if client_secret is not None:
            pulumi.set(__self__, "client_secret", client_secret)
        if duration is not None:
            pulumi.set(__self__, "duration", duration)
        if expires_at is not None:
            pulumi.set(__self__, "expires_at", expires_at)
        if min_days_for_renewal is not None:
            pulumi.set(__self__, "min_days_for_renewal", min_days_for_renewal)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if zone_id is not None:
            pulumi.set(__self__, "zone_id", zone_id)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[str]]:
        """
        The account identifier to target for the resource. Conflicts with `zone_id`.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter(name="clientId")
    def client_id(self) -> Optional[pulumi.Input[str]]:
        """
        Client ID associated with the Service Token. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "client_id")

    @client_id.setter
    def client_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "client_id", value)

    @property
    @pulumi.getter(name="clientSecret")
    def client_secret(self) -> Optional[pulumi.Input[str]]:
        """
        A secret for interacting with Access protocols. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "client_secret")

    @client_secret.setter
    def client_secret(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "client_secret", value)

    @property
    @pulumi.getter
    def duration(self) -> Optional[pulumi.Input[str]]:
        """
        Length of time the service token is valid for. Available values: `8760h`, `17520h`, `43800h`, `87600h`, `forever`.
        """
        return pulumi.get(self, "duration")

    @duration.setter
    def duration(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "duration", value)

    @property
    @pulumi.getter(name="expiresAt")
    def expires_at(self) -> Optional[pulumi.Input[str]]:
        """
        Date when the token expires.
        """
        return pulumi.get(self, "expires_at")

    @expires_at.setter
    def expires_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "expires_at", value)

    @property
    @pulumi.getter(name="minDaysForRenewal")
    def min_days_for_renewal(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "min_days_for_renewal")

    @min_days_for_renewal.setter
    def min_days_for_renewal(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "min_days_for_renewal", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Friendly name of the token's intent.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> Optional[pulumi.Input[str]]:
        """
        The zone identifier to target for the resource. Conflicts with `account_id`.
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "zone_id", value)


class AccessServiceToken(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 duration: Optional[pulumi.Input[str]] = None,
                 min_days_for_renewal: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Access Service Tokens are used for service-to-service communication
        when an application is behind Cloudflare Access.

        ## Import

        If you are importing an Access Service Token you will not have the

        client_secret available in the state for use. The client_secret is only

        available once, at creation. In most cases, it is better to just create a new

        resource should you need to reference it in other resources.

        ```sh
        $ pulumi import cloudflare:index/accessServiceToken:AccessServiceToken example <account_id>/<service_token_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource. Conflicts with `zone_id`.
        :param pulumi.Input[str] duration: Length of time the service token is valid for. Available values: `8760h`, `17520h`, `43800h`, `87600h`, `forever`.
        :param pulumi.Input[str] name: Friendly name of the token's intent.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. Conflicts with `account_id`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AccessServiceTokenArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Access Service Tokens are used for service-to-service communication
        when an application is behind Cloudflare Access.

        ## Import

        If you are importing an Access Service Token you will not have the

        client_secret available in the state for use. The client_secret is only

        available once, at creation. In most cases, it is better to just create a new

        resource should you need to reference it in other resources.

        ```sh
        $ pulumi import cloudflare:index/accessServiceToken:AccessServiceToken example <account_id>/<service_token_id>
        ```

        :param str resource_name: The name of the resource.
        :param AccessServiceTokenArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AccessServiceTokenArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 duration: Optional[pulumi.Input[str]] = None,
                 min_days_for_renewal: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AccessServiceTokenArgs.__new__(AccessServiceTokenArgs)

            __props__.__dict__["account_id"] = account_id
            __props__.__dict__["duration"] = duration
            __props__.__dict__["min_days_for_renewal"] = min_days_for_renewal
            if name is None and not opts.urn:
                raise TypeError("Missing required property 'name'")
            __props__.__dict__["name"] = name
            __props__.__dict__["zone_id"] = zone_id
            __props__.__dict__["client_id"] = None
            __props__.__dict__["client_secret"] = None
            __props__.__dict__["expires_at"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["clientSecret"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(AccessServiceToken, __self__).__init__(
            'cloudflare:index/accessServiceToken:AccessServiceToken',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[str]] = None,
            client_id: Optional[pulumi.Input[str]] = None,
            client_secret: Optional[pulumi.Input[str]] = None,
            duration: Optional[pulumi.Input[str]] = None,
            expires_at: Optional[pulumi.Input[str]] = None,
            min_days_for_renewal: Optional[pulumi.Input[int]] = None,
            name: Optional[pulumi.Input[str]] = None,
            zone_id: Optional[pulumi.Input[str]] = None) -> 'AccessServiceToken':
        """
        Get an existing AccessServiceToken resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource. Conflicts with `zone_id`.
        :param pulumi.Input[str] client_id: Client ID associated with the Service Token. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] client_secret: A secret for interacting with Access protocols. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] duration: Length of time the service token is valid for. Available values: `8760h`, `17520h`, `43800h`, `87600h`, `forever`.
        :param pulumi.Input[str] expires_at: Date when the token expires.
        :param pulumi.Input[str] name: Friendly name of the token's intent.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. Conflicts with `account_id`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AccessServiceTokenState.__new__(_AccessServiceTokenState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["client_id"] = client_id
        __props__.__dict__["client_secret"] = client_secret
        __props__.__dict__["duration"] = duration
        __props__.__dict__["expires_at"] = expires_at
        __props__.__dict__["min_days_for_renewal"] = min_days_for_renewal
        __props__.__dict__["name"] = name
        __props__.__dict__["zone_id"] = zone_id
        return AccessServiceToken(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[Optional[str]]:
        """
        The account identifier to target for the resource. Conflicts with `zone_id`.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter(name="clientId")
    def client_id(self) -> pulumi.Output[str]:
        """
        Client ID associated with the Service Token. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "client_id")

    @property
    @pulumi.getter(name="clientSecret")
    def client_secret(self) -> pulumi.Output[str]:
        """
        A secret for interacting with Access protocols. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "client_secret")

    @property
    @pulumi.getter
    def duration(self) -> pulumi.Output[str]:
        """
        Length of time the service token is valid for. Available values: `8760h`, `17520h`, `43800h`, `87600h`, `forever`.
        """
        return pulumi.get(self, "duration")

    @property
    @pulumi.getter(name="expiresAt")
    def expires_at(self) -> pulumi.Output[str]:
        """
        Date when the token expires.
        """
        return pulumi.get(self, "expires_at")

    @property
    @pulumi.getter(name="minDaysForRenewal")
    def min_days_for_renewal(self) -> pulumi.Output[Optional[int]]:
        return pulumi.get(self, "min_days_for_renewal")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Friendly name of the token's intent.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Output[Optional[str]]:
        """
        The zone identifier to target for the resource. Conflicts with `account_id`.
        """
        return pulumi.get(self, "zone_id")

