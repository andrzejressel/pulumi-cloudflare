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

__all__ = ['MagicWanGreTunnelArgs', 'MagicWanGreTunnel']

@pulumi.input_type
class MagicWanGreTunnelArgs:
    def __init__(__self__, *,
                 cloudflare_gre_endpoint: pulumi.Input[str],
                 customer_gre_endpoint: pulumi.Input[str],
                 interface_address: pulumi.Input[str],
                 name: pulumi.Input[str],
                 account_id: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 health_check_enabled: Optional[pulumi.Input[bool]] = None,
                 health_check_target: Optional[pulumi.Input[str]] = None,
                 health_check_type: Optional[pulumi.Input[str]] = None,
                 mtu: Optional[pulumi.Input[int]] = None,
                 ttl: Optional[pulumi.Input[int]] = None):
        """
        The set of arguments for constructing a MagicWanGreTunnel resource.
        :param pulumi.Input[str] cloudflare_gre_endpoint: The IP address assigned to the Cloudflare side of the GRE tunnel.
        :param pulumi.Input[str] customer_gre_endpoint: The IP address assigned to the customer side of the GRE tunnel.
        :param pulumi.Input[str] interface_address: 31-bit prefix (/31 in CIDR notation) supporting 2 hosts, one for each side of the tunnel.
        :param pulumi.Input[str] name: Name of the GRE tunnel.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] description: Description of the GRE tunnel intent.
        :param pulumi.Input[bool] health_check_enabled: Specifies if ICMP tunnel health checks are enabled.
        :param pulumi.Input[str] health_check_target: The IP address of the customer endpoint that will receive tunnel health checks.
        :param pulumi.Input[str] health_check_type: Specifies the ICMP echo type for the health check. Available values: `request`, `reply`.
        :param pulumi.Input[int] mtu: Maximum Transmission Unit (MTU) in bytes for the GRE tunnel.
        :param pulumi.Input[int] ttl: Time To Live (TTL) in number of hops of the GRE tunnel.
        """
        pulumi.set(__self__, "cloudflare_gre_endpoint", cloudflare_gre_endpoint)
        pulumi.set(__self__, "customer_gre_endpoint", customer_gre_endpoint)
        pulumi.set(__self__, "interface_address", interface_address)
        pulumi.set(__self__, "name", name)
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if health_check_enabled is not None:
            pulumi.set(__self__, "health_check_enabled", health_check_enabled)
        if health_check_target is not None:
            pulumi.set(__self__, "health_check_target", health_check_target)
        if health_check_type is not None:
            pulumi.set(__self__, "health_check_type", health_check_type)
        if mtu is not None:
            pulumi.set(__self__, "mtu", mtu)
        if ttl is not None:
            pulumi.set(__self__, "ttl", ttl)

    @property
    @pulumi.getter(name="cloudflareGreEndpoint")
    def cloudflare_gre_endpoint(self) -> pulumi.Input[str]:
        """
        The IP address assigned to the Cloudflare side of the GRE tunnel.
        """
        return pulumi.get(self, "cloudflare_gre_endpoint")

    @cloudflare_gre_endpoint.setter
    def cloudflare_gre_endpoint(self, value: pulumi.Input[str]):
        pulumi.set(self, "cloudflare_gre_endpoint", value)

    @property
    @pulumi.getter(name="customerGreEndpoint")
    def customer_gre_endpoint(self) -> pulumi.Input[str]:
        """
        The IP address assigned to the customer side of the GRE tunnel.
        """
        return pulumi.get(self, "customer_gre_endpoint")

    @customer_gre_endpoint.setter
    def customer_gre_endpoint(self, value: pulumi.Input[str]):
        pulumi.set(self, "customer_gre_endpoint", value)

    @property
    @pulumi.getter(name="interfaceAddress")
    def interface_address(self) -> pulumi.Input[str]:
        """
        31-bit prefix (/31 in CIDR notation) supporting 2 hosts, one for each side of the tunnel.
        """
        return pulumi.get(self, "interface_address")

    @interface_address.setter
    def interface_address(self, value: pulumi.Input[str]):
        pulumi.set(self, "interface_address", value)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Input[str]:
        """
        Name of the GRE tunnel.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[str]):
        pulumi.set(self, "name", value)

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
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the GRE tunnel intent.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="healthCheckEnabled")
    def health_check_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies if ICMP tunnel health checks are enabled.
        """
        return pulumi.get(self, "health_check_enabled")

    @health_check_enabled.setter
    def health_check_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "health_check_enabled", value)

    @property
    @pulumi.getter(name="healthCheckTarget")
    def health_check_target(self) -> Optional[pulumi.Input[str]]:
        """
        The IP address of the customer endpoint that will receive tunnel health checks.
        """
        return pulumi.get(self, "health_check_target")

    @health_check_target.setter
    def health_check_target(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "health_check_target", value)

    @property
    @pulumi.getter(name="healthCheckType")
    def health_check_type(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the ICMP echo type for the health check. Available values: `request`, `reply`.
        """
        return pulumi.get(self, "health_check_type")

    @health_check_type.setter
    def health_check_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "health_check_type", value)

    @property
    @pulumi.getter
    def mtu(self) -> Optional[pulumi.Input[int]]:
        """
        Maximum Transmission Unit (MTU) in bytes for the GRE tunnel.
        """
        return pulumi.get(self, "mtu")

    @mtu.setter
    def mtu(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "mtu", value)

    @property
    @pulumi.getter
    def ttl(self) -> Optional[pulumi.Input[int]]:
        """
        Time To Live (TTL) in number of hops of the GRE tunnel.
        """
        return pulumi.get(self, "ttl")

    @ttl.setter
    def ttl(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "ttl", value)


@pulumi.input_type
class _MagicWanGreTunnelState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[str]] = None,
                 cloudflare_gre_endpoint: Optional[pulumi.Input[str]] = None,
                 customer_gre_endpoint: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 health_check_enabled: Optional[pulumi.Input[bool]] = None,
                 health_check_target: Optional[pulumi.Input[str]] = None,
                 health_check_type: Optional[pulumi.Input[str]] = None,
                 interface_address: Optional[pulumi.Input[str]] = None,
                 mtu: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 ttl: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering MagicWanGreTunnel resources.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] cloudflare_gre_endpoint: The IP address assigned to the Cloudflare side of the GRE tunnel.
        :param pulumi.Input[str] customer_gre_endpoint: The IP address assigned to the customer side of the GRE tunnel.
        :param pulumi.Input[str] description: Description of the GRE tunnel intent.
        :param pulumi.Input[bool] health_check_enabled: Specifies if ICMP tunnel health checks are enabled.
        :param pulumi.Input[str] health_check_target: The IP address of the customer endpoint that will receive tunnel health checks.
        :param pulumi.Input[str] health_check_type: Specifies the ICMP echo type for the health check. Available values: `request`, `reply`.
        :param pulumi.Input[str] interface_address: 31-bit prefix (/31 in CIDR notation) supporting 2 hosts, one for each side of the tunnel.
        :param pulumi.Input[int] mtu: Maximum Transmission Unit (MTU) in bytes for the GRE tunnel.
        :param pulumi.Input[str] name: Name of the GRE tunnel.
        :param pulumi.Input[int] ttl: Time To Live (TTL) in number of hops of the GRE tunnel.
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if cloudflare_gre_endpoint is not None:
            pulumi.set(__self__, "cloudflare_gre_endpoint", cloudflare_gre_endpoint)
        if customer_gre_endpoint is not None:
            pulumi.set(__self__, "customer_gre_endpoint", customer_gre_endpoint)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if health_check_enabled is not None:
            pulumi.set(__self__, "health_check_enabled", health_check_enabled)
        if health_check_target is not None:
            pulumi.set(__self__, "health_check_target", health_check_target)
        if health_check_type is not None:
            pulumi.set(__self__, "health_check_type", health_check_type)
        if interface_address is not None:
            pulumi.set(__self__, "interface_address", interface_address)
        if mtu is not None:
            pulumi.set(__self__, "mtu", mtu)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if ttl is not None:
            pulumi.set(__self__, "ttl", ttl)

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
    @pulumi.getter(name="cloudflareGreEndpoint")
    def cloudflare_gre_endpoint(self) -> Optional[pulumi.Input[str]]:
        """
        The IP address assigned to the Cloudflare side of the GRE tunnel.
        """
        return pulumi.get(self, "cloudflare_gre_endpoint")

    @cloudflare_gre_endpoint.setter
    def cloudflare_gre_endpoint(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cloudflare_gre_endpoint", value)

    @property
    @pulumi.getter(name="customerGreEndpoint")
    def customer_gre_endpoint(self) -> Optional[pulumi.Input[str]]:
        """
        The IP address assigned to the customer side of the GRE tunnel.
        """
        return pulumi.get(self, "customer_gre_endpoint")

    @customer_gre_endpoint.setter
    def customer_gre_endpoint(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "customer_gre_endpoint", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the GRE tunnel intent.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="healthCheckEnabled")
    def health_check_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies if ICMP tunnel health checks are enabled.
        """
        return pulumi.get(self, "health_check_enabled")

    @health_check_enabled.setter
    def health_check_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "health_check_enabled", value)

    @property
    @pulumi.getter(name="healthCheckTarget")
    def health_check_target(self) -> Optional[pulumi.Input[str]]:
        """
        The IP address of the customer endpoint that will receive tunnel health checks.
        """
        return pulumi.get(self, "health_check_target")

    @health_check_target.setter
    def health_check_target(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "health_check_target", value)

    @property
    @pulumi.getter(name="healthCheckType")
    def health_check_type(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the ICMP echo type for the health check. Available values: `request`, `reply`.
        """
        return pulumi.get(self, "health_check_type")

    @health_check_type.setter
    def health_check_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "health_check_type", value)

    @property
    @pulumi.getter(name="interfaceAddress")
    def interface_address(self) -> Optional[pulumi.Input[str]]:
        """
        31-bit prefix (/31 in CIDR notation) supporting 2 hosts, one for each side of the tunnel.
        """
        return pulumi.get(self, "interface_address")

    @interface_address.setter
    def interface_address(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "interface_address", value)

    @property
    @pulumi.getter
    def mtu(self) -> Optional[pulumi.Input[int]]:
        """
        Maximum Transmission Unit (MTU) in bytes for the GRE tunnel.
        """
        return pulumi.get(self, "mtu")

    @mtu.setter
    def mtu(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "mtu", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the GRE tunnel.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def ttl(self) -> Optional[pulumi.Input[int]]:
        """
        Time To Live (TTL) in number of hops of the GRE tunnel.
        """
        return pulumi.get(self, "ttl")

    @ttl.setter
    def ttl(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "ttl", value)


class MagicWanGreTunnel(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 cloudflare_gre_endpoint: Optional[pulumi.Input[str]] = None,
                 customer_gre_endpoint: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 health_check_enabled: Optional[pulumi.Input[bool]] = None,
                 health_check_target: Optional[pulumi.Input[str]] = None,
                 health_check_type: Optional[pulumi.Input[str]] = None,
                 interface_address: Optional[pulumi.Input[str]] = None,
                 mtu: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 ttl: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        """
        Provides a resource, that manages GRE tunnels for Magic Transit.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.MagicWanGreTunnel("example",
            account_id="f037e56e89293a057740de681ac9abbe",
            name="GRE_1",
            customer_gre_endpoint="203.0.113.1",
            cloudflare_gre_endpoint="203.0.113.2",
            interface_address="192.0.2.0/31",
            description="Tunnel for ISP X",
            ttl=64,
            mtu=1476,
            health_check_enabled=True,
            health_check_target="203.0.113.1",
            health_check_type="reply")
        ```

        ## Import

        ```sh
        $ pulumi import cloudflare:index/magicWanGreTunnel:MagicWanGreTunnel example <account_id>/<tunnel_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] cloudflare_gre_endpoint: The IP address assigned to the Cloudflare side of the GRE tunnel.
        :param pulumi.Input[str] customer_gre_endpoint: The IP address assigned to the customer side of the GRE tunnel.
        :param pulumi.Input[str] description: Description of the GRE tunnel intent.
        :param pulumi.Input[bool] health_check_enabled: Specifies if ICMP tunnel health checks are enabled.
        :param pulumi.Input[str] health_check_target: The IP address of the customer endpoint that will receive tunnel health checks.
        :param pulumi.Input[str] health_check_type: Specifies the ICMP echo type for the health check. Available values: `request`, `reply`.
        :param pulumi.Input[str] interface_address: 31-bit prefix (/31 in CIDR notation) supporting 2 hosts, one for each side of the tunnel.
        :param pulumi.Input[int] mtu: Maximum Transmission Unit (MTU) in bytes for the GRE tunnel.
        :param pulumi.Input[str] name: Name of the GRE tunnel.
        :param pulumi.Input[int] ttl: Time To Live (TTL) in number of hops of the GRE tunnel.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: MagicWanGreTunnelArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a resource, that manages GRE tunnels for Magic Transit.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.MagicWanGreTunnel("example",
            account_id="f037e56e89293a057740de681ac9abbe",
            name="GRE_1",
            customer_gre_endpoint="203.0.113.1",
            cloudflare_gre_endpoint="203.0.113.2",
            interface_address="192.0.2.0/31",
            description="Tunnel for ISP X",
            ttl=64,
            mtu=1476,
            health_check_enabled=True,
            health_check_target="203.0.113.1",
            health_check_type="reply")
        ```

        ## Import

        ```sh
        $ pulumi import cloudflare:index/magicWanGreTunnel:MagicWanGreTunnel example <account_id>/<tunnel_id>
        ```

        :param str resource_name: The name of the resource.
        :param MagicWanGreTunnelArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(MagicWanGreTunnelArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 cloudflare_gre_endpoint: Optional[pulumi.Input[str]] = None,
                 customer_gre_endpoint: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 health_check_enabled: Optional[pulumi.Input[bool]] = None,
                 health_check_target: Optional[pulumi.Input[str]] = None,
                 health_check_type: Optional[pulumi.Input[str]] = None,
                 interface_address: Optional[pulumi.Input[str]] = None,
                 mtu: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 ttl: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = MagicWanGreTunnelArgs.__new__(MagicWanGreTunnelArgs)

            __props__.__dict__["account_id"] = account_id
            if cloudflare_gre_endpoint is None and not opts.urn:
                raise TypeError("Missing required property 'cloudflare_gre_endpoint'")
            __props__.__dict__["cloudflare_gre_endpoint"] = cloudflare_gre_endpoint
            if customer_gre_endpoint is None and not opts.urn:
                raise TypeError("Missing required property 'customer_gre_endpoint'")
            __props__.__dict__["customer_gre_endpoint"] = customer_gre_endpoint
            __props__.__dict__["description"] = description
            __props__.__dict__["health_check_enabled"] = health_check_enabled
            __props__.__dict__["health_check_target"] = health_check_target
            __props__.__dict__["health_check_type"] = health_check_type
            if interface_address is None and not opts.urn:
                raise TypeError("Missing required property 'interface_address'")
            __props__.__dict__["interface_address"] = interface_address
            __props__.__dict__["mtu"] = mtu
            if name is None and not opts.urn:
                raise TypeError("Missing required property 'name'")
            __props__.__dict__["name"] = name
            __props__.__dict__["ttl"] = ttl
        super(MagicWanGreTunnel, __self__).__init__(
            'cloudflare:index/magicWanGreTunnel:MagicWanGreTunnel',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[str]] = None,
            cloudflare_gre_endpoint: Optional[pulumi.Input[str]] = None,
            customer_gre_endpoint: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            health_check_enabled: Optional[pulumi.Input[bool]] = None,
            health_check_target: Optional[pulumi.Input[str]] = None,
            health_check_type: Optional[pulumi.Input[str]] = None,
            interface_address: Optional[pulumi.Input[str]] = None,
            mtu: Optional[pulumi.Input[int]] = None,
            name: Optional[pulumi.Input[str]] = None,
            ttl: Optional[pulumi.Input[int]] = None) -> 'MagicWanGreTunnel':
        """
        Get an existing MagicWanGreTunnel resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] cloudflare_gre_endpoint: The IP address assigned to the Cloudflare side of the GRE tunnel.
        :param pulumi.Input[str] customer_gre_endpoint: The IP address assigned to the customer side of the GRE tunnel.
        :param pulumi.Input[str] description: Description of the GRE tunnel intent.
        :param pulumi.Input[bool] health_check_enabled: Specifies if ICMP tunnel health checks are enabled.
        :param pulumi.Input[str] health_check_target: The IP address of the customer endpoint that will receive tunnel health checks.
        :param pulumi.Input[str] health_check_type: Specifies the ICMP echo type for the health check. Available values: `request`, `reply`.
        :param pulumi.Input[str] interface_address: 31-bit prefix (/31 in CIDR notation) supporting 2 hosts, one for each side of the tunnel.
        :param pulumi.Input[int] mtu: Maximum Transmission Unit (MTU) in bytes for the GRE tunnel.
        :param pulumi.Input[str] name: Name of the GRE tunnel.
        :param pulumi.Input[int] ttl: Time To Live (TTL) in number of hops of the GRE tunnel.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _MagicWanGreTunnelState.__new__(_MagicWanGreTunnelState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["cloudflare_gre_endpoint"] = cloudflare_gre_endpoint
        __props__.__dict__["customer_gre_endpoint"] = customer_gre_endpoint
        __props__.__dict__["description"] = description
        __props__.__dict__["health_check_enabled"] = health_check_enabled
        __props__.__dict__["health_check_target"] = health_check_target
        __props__.__dict__["health_check_type"] = health_check_type
        __props__.__dict__["interface_address"] = interface_address
        __props__.__dict__["mtu"] = mtu
        __props__.__dict__["name"] = name
        __props__.__dict__["ttl"] = ttl
        return MagicWanGreTunnel(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[Optional[str]]:
        """
        The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter(name="cloudflareGreEndpoint")
    def cloudflare_gre_endpoint(self) -> pulumi.Output[str]:
        """
        The IP address assigned to the Cloudflare side of the GRE tunnel.
        """
        return pulumi.get(self, "cloudflare_gre_endpoint")

    @property
    @pulumi.getter(name="customerGreEndpoint")
    def customer_gre_endpoint(self) -> pulumi.Output[str]:
        """
        The IP address assigned to the customer side of the GRE tunnel.
        """
        return pulumi.get(self, "customer_gre_endpoint")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Description of the GRE tunnel intent.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="healthCheckEnabled")
    def health_check_enabled(self) -> pulumi.Output[bool]:
        """
        Specifies if ICMP tunnel health checks are enabled.
        """
        return pulumi.get(self, "health_check_enabled")

    @property
    @pulumi.getter(name="healthCheckTarget")
    def health_check_target(self) -> pulumi.Output[str]:
        """
        The IP address of the customer endpoint that will receive tunnel health checks.
        """
        return pulumi.get(self, "health_check_target")

    @property
    @pulumi.getter(name="healthCheckType")
    def health_check_type(self) -> pulumi.Output[str]:
        """
        Specifies the ICMP echo type for the health check. Available values: `request`, `reply`.
        """
        return pulumi.get(self, "health_check_type")

    @property
    @pulumi.getter(name="interfaceAddress")
    def interface_address(self) -> pulumi.Output[str]:
        """
        31-bit prefix (/31 in CIDR notation) supporting 2 hosts, one for each side of the tunnel.
        """
        return pulumi.get(self, "interface_address")

    @property
    @pulumi.getter
    def mtu(self) -> pulumi.Output[int]:
        """
        Maximum Transmission Unit (MTU) in bytes for the GRE tunnel.
        """
        return pulumi.get(self, "mtu")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the GRE tunnel.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def ttl(self) -> pulumi.Output[int]:
        """
        Time To Live (TTL) in number of hops of the GRE tunnel.
        """
        return pulumi.get(self, "ttl")

