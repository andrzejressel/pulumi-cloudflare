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

__all__ = ['ZeroTrustDexTestArgs', 'ZeroTrustDexTest']

@pulumi.input_type
class ZeroTrustDexTestArgs:
    def __init__(__self__, *,
                 account_id: pulumi.Input[str],
                 data: pulumi.Input['ZeroTrustDexTestDataArgs'],
                 description: pulumi.Input[str],
                 enabled: pulumi.Input[bool],
                 interval: pulumi.Input[str],
                 name: pulumi.Input[str]):
        """
        The set of arguments for constructing a ZeroTrustDexTest resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input['ZeroTrustDexTestDataArgs'] data: The configuration object which contains the details for the WARP client to conduct the test.
        :param pulumi.Input[str] description: Additional details about the test.
        :param pulumi.Input[bool] enabled: Determines whether or not the test is active.
        :param pulumi.Input[str] interval: How often the test will run.
        :param pulumi.Input[str] name: The name of the Device Dex Test. Must be unique.
        """
        pulumi.set(__self__, "account_id", account_id)
        pulumi.set(__self__, "data", data)
        pulumi.set(__self__, "description", description)
        pulumi.set(__self__, "enabled", enabled)
        pulumi.set(__self__, "interval", interval)
        pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Input[str]:
        """
        The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter
    def data(self) -> pulumi.Input['ZeroTrustDexTestDataArgs']:
        """
        The configuration object which contains the details for the WARP client to conduct the test.
        """
        return pulumi.get(self, "data")

    @data.setter
    def data(self, value: pulumi.Input['ZeroTrustDexTestDataArgs']):
        pulumi.set(self, "data", value)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Input[str]:
        """
        Additional details about the test.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: pulumi.Input[str]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Input[bool]:
        """
        Determines whether or not the test is active.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: pulumi.Input[bool]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def interval(self) -> pulumi.Input[str]:
        """
        How often the test will run.
        """
        return pulumi.get(self, "interval")

    @interval.setter
    def interval(self, value: pulumi.Input[str]):
        pulumi.set(self, "interval", value)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Input[str]:
        """
        The name of the Device Dex Test. Must be unique.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[str]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _ZeroTrustDexTestState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[str]] = None,
                 created: Optional[pulumi.Input[str]] = None,
                 data: Optional[pulumi.Input['ZeroTrustDexTestDataArgs']] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 interval: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 updated: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ZeroTrustDexTest resources.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] created: Timestamp of when the Dex Test was created.
        :param pulumi.Input['ZeroTrustDexTestDataArgs'] data: The configuration object which contains the details for the WARP client to conduct the test.
        :param pulumi.Input[str] description: Additional details about the test.
        :param pulumi.Input[bool] enabled: Determines whether or not the test is active.
        :param pulumi.Input[str] interval: How often the test will run.
        :param pulumi.Input[str] name: The name of the Device Dex Test. Must be unique.
        :param pulumi.Input[str] updated: Timestamp of when the Dex Test was last updated.
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if created is not None:
            pulumi.set(__self__, "created", created)
        if data is not None:
            pulumi.set(__self__, "data", data)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if interval is not None:
            pulumi.set(__self__, "interval", interval)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if updated is not None:
            pulumi.set(__self__, "updated", updated)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[str]]:
        """
        The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter
    def created(self) -> Optional[pulumi.Input[str]]:
        """
        Timestamp of when the Dex Test was created.
        """
        return pulumi.get(self, "created")

    @created.setter
    def created(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "created", value)

    @property
    @pulumi.getter
    def data(self) -> Optional[pulumi.Input['ZeroTrustDexTestDataArgs']]:
        """
        The configuration object which contains the details for the WARP client to conduct the test.
        """
        return pulumi.get(self, "data")

    @data.setter
    def data(self, value: Optional[pulumi.Input['ZeroTrustDexTestDataArgs']]):
        pulumi.set(self, "data", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Additional details about the test.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Determines whether or not the test is active.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def interval(self) -> Optional[pulumi.Input[str]]:
        """
        How often the test will run.
        """
        return pulumi.get(self, "interval")

    @interval.setter
    def interval(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "interval", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Device Dex Test. Must be unique.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def updated(self) -> Optional[pulumi.Input[str]]:
        """
        Timestamp of when the Dex Test was last updated.
        """
        return pulumi.get(self, "updated")

    @updated.setter
    def updated(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "updated", value)


class ZeroTrustDexTest(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 data: Optional[pulumi.Input[Union['ZeroTrustDexTestDataArgs', 'ZeroTrustDexTestDataArgsDict']]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 interval: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Cloudflare Device Dex Test resource. Device Dex Tests allow for building location-aware device settings policies.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.ZeroTrustDexTest("example",
            account_id="f037e56e89293a057740de681ac9abbe",
            name="GET homepage",
            description="Send a HTTP GET request to the home endpoint every half hour.",
            interval="0h30m0s",
            enabled=True,
            data={
                "host": "https://example.com/home",
                "kind": "http",
                "method": "GET",
            })
        ```

        ## Import

        ```sh
        $ pulumi import cloudflare:index/zeroTrustDexTest:ZeroTrustDexTest example <account_id>/<device_dex_test_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[Union['ZeroTrustDexTestDataArgs', 'ZeroTrustDexTestDataArgsDict']] data: The configuration object which contains the details for the WARP client to conduct the test.
        :param pulumi.Input[str] description: Additional details about the test.
        :param pulumi.Input[bool] enabled: Determines whether or not the test is active.
        :param pulumi.Input[str] interval: How often the test will run.
        :param pulumi.Input[str] name: The name of the Device Dex Test. Must be unique.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ZeroTrustDexTestArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Cloudflare Device Dex Test resource. Device Dex Tests allow for building location-aware device settings policies.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.ZeroTrustDexTest("example",
            account_id="f037e56e89293a057740de681ac9abbe",
            name="GET homepage",
            description="Send a HTTP GET request to the home endpoint every half hour.",
            interval="0h30m0s",
            enabled=True,
            data={
                "host": "https://example.com/home",
                "kind": "http",
                "method": "GET",
            })
        ```

        ## Import

        ```sh
        $ pulumi import cloudflare:index/zeroTrustDexTest:ZeroTrustDexTest example <account_id>/<device_dex_test_id>
        ```

        :param str resource_name: The name of the resource.
        :param ZeroTrustDexTestArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ZeroTrustDexTestArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 data: Optional[pulumi.Input[Union['ZeroTrustDexTestDataArgs', 'ZeroTrustDexTestDataArgsDict']]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 interval: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ZeroTrustDexTestArgs.__new__(ZeroTrustDexTestArgs)

            if account_id is None and not opts.urn:
                raise TypeError("Missing required property 'account_id'")
            __props__.__dict__["account_id"] = account_id
            if data is None and not opts.urn:
                raise TypeError("Missing required property 'data'")
            __props__.__dict__["data"] = data
            if description is None and not opts.urn:
                raise TypeError("Missing required property 'description'")
            __props__.__dict__["description"] = description
            if enabled is None and not opts.urn:
                raise TypeError("Missing required property 'enabled'")
            __props__.__dict__["enabled"] = enabled
            if interval is None and not opts.urn:
                raise TypeError("Missing required property 'interval'")
            __props__.__dict__["interval"] = interval
            if name is None and not opts.urn:
                raise TypeError("Missing required property 'name'")
            __props__.__dict__["name"] = name
            __props__.__dict__["created"] = None
            __props__.__dict__["updated"] = None
        super(ZeroTrustDexTest, __self__).__init__(
            'cloudflare:index/zeroTrustDexTest:ZeroTrustDexTest',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[str]] = None,
            created: Optional[pulumi.Input[str]] = None,
            data: Optional[pulumi.Input[Union['ZeroTrustDexTestDataArgs', 'ZeroTrustDexTestDataArgsDict']]] = None,
            description: Optional[pulumi.Input[str]] = None,
            enabled: Optional[pulumi.Input[bool]] = None,
            interval: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            updated: Optional[pulumi.Input[str]] = None) -> 'ZeroTrustDexTest':
        """
        Get an existing ZeroTrustDexTest resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] created: Timestamp of when the Dex Test was created.
        :param pulumi.Input[Union['ZeroTrustDexTestDataArgs', 'ZeroTrustDexTestDataArgsDict']] data: The configuration object which contains the details for the WARP client to conduct the test.
        :param pulumi.Input[str] description: Additional details about the test.
        :param pulumi.Input[bool] enabled: Determines whether or not the test is active.
        :param pulumi.Input[str] interval: How often the test will run.
        :param pulumi.Input[str] name: The name of the Device Dex Test. Must be unique.
        :param pulumi.Input[str] updated: Timestamp of when the Dex Test was last updated.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ZeroTrustDexTestState.__new__(_ZeroTrustDexTestState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["created"] = created
        __props__.__dict__["data"] = data
        __props__.__dict__["description"] = description
        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["interval"] = interval
        __props__.__dict__["name"] = name
        __props__.__dict__["updated"] = updated
        return ZeroTrustDexTest(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[str]:
        """
        The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter
    def created(self) -> pulumi.Output[str]:
        """
        Timestamp of when the Dex Test was created.
        """
        return pulumi.get(self, "created")

    @property
    @pulumi.getter
    def data(self) -> pulumi.Output['outputs.ZeroTrustDexTestData']:
        """
        The configuration object which contains the details for the WARP client to conduct the test.
        """
        return pulumi.get(self, "data")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[str]:
        """
        Additional details about the test.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[bool]:
        """
        Determines whether or not the test is active.
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter
    def interval(self) -> pulumi.Output[str]:
        """
        How often the test will run.
        """
        return pulumi.get(self, "interval")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the Device Dex Test. Must be unique.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def updated(self) -> pulumi.Output[str]:
        """
        Timestamp of when the Dex Test was last updated.
        """
        return pulumi.get(self, "updated")

