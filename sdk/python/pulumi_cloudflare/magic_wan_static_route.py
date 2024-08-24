# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['MagicWanStaticRouteArgs', 'MagicWanStaticRoute']

@pulumi.input_type
class MagicWanStaticRouteArgs:
    def __init__(__self__, *,
                 nexthop: pulumi.Input[str],
                 prefix: pulumi.Input[str],
                 priority: pulumi.Input[int],
                 account_id: Optional[pulumi.Input[str]] = None,
                 colo_names: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 colo_regions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 weight: Optional[pulumi.Input[int]] = None):
        """
        The set of arguments for constructing a MagicWanStaticRoute resource.
        :param pulumi.Input[str] nexthop: The nexthop IP address where traffic will be routed to.
        :param pulumi.Input[str] prefix: Your network prefix using CIDR notation.
        :param pulumi.Input[int] priority: The priority for the static route.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[Sequence[pulumi.Input[str]]] colo_names: List of Cloudflare colocation regions for this static route.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] colo_regions: List of Cloudflare colocation names for this static route.
        :param pulumi.Input[str] description: Description of the static route.
        :param pulumi.Input[int] weight: The optional weight for ECMP routes. **Modifying this attribute will force creation of a new resource.**
        """
        pulumi.set(__self__, "nexthop", nexthop)
        pulumi.set(__self__, "prefix", prefix)
        pulumi.set(__self__, "priority", priority)
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if colo_names is not None:
            pulumi.set(__self__, "colo_names", colo_names)
        if colo_regions is not None:
            pulumi.set(__self__, "colo_regions", colo_regions)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if weight is not None:
            pulumi.set(__self__, "weight", weight)

    @property
    @pulumi.getter
    def nexthop(self) -> pulumi.Input[str]:
        """
        The nexthop IP address where traffic will be routed to.
        """
        return pulumi.get(self, "nexthop")

    @nexthop.setter
    def nexthop(self, value: pulumi.Input[str]):
        pulumi.set(self, "nexthop", value)

    @property
    @pulumi.getter
    def prefix(self) -> pulumi.Input[str]:
        """
        Your network prefix using CIDR notation.
        """
        return pulumi.get(self, "prefix")

    @prefix.setter
    def prefix(self, value: pulumi.Input[str]):
        pulumi.set(self, "prefix", value)

    @property
    @pulumi.getter
    def priority(self) -> pulumi.Input[int]:
        """
        The priority for the static route.
        """
        return pulumi.get(self, "priority")

    @priority.setter
    def priority(self, value: pulumi.Input[int]):
        pulumi.set(self, "priority", value)

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
    @pulumi.getter(name="coloNames")
    def colo_names(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        List of Cloudflare colocation regions for this static route.
        """
        return pulumi.get(self, "colo_names")

    @colo_names.setter
    def colo_names(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "colo_names", value)

    @property
    @pulumi.getter(name="coloRegions")
    def colo_regions(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        List of Cloudflare colocation names for this static route.
        """
        return pulumi.get(self, "colo_regions")

    @colo_regions.setter
    def colo_regions(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "colo_regions", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the static route.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def weight(self) -> Optional[pulumi.Input[int]]:
        """
        The optional weight for ECMP routes. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "weight")

    @weight.setter
    def weight(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "weight", value)


@pulumi.input_type
class _MagicWanStaticRouteState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[str]] = None,
                 colo_names: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 colo_regions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 nexthop: Optional[pulumi.Input[str]] = None,
                 prefix: Optional[pulumi.Input[str]] = None,
                 priority: Optional[pulumi.Input[int]] = None,
                 weight: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering MagicWanStaticRoute resources.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[Sequence[pulumi.Input[str]]] colo_names: List of Cloudflare colocation regions for this static route.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] colo_regions: List of Cloudflare colocation names for this static route.
        :param pulumi.Input[str] description: Description of the static route.
        :param pulumi.Input[str] nexthop: The nexthop IP address where traffic will be routed to.
        :param pulumi.Input[str] prefix: Your network prefix using CIDR notation.
        :param pulumi.Input[int] priority: The priority for the static route.
        :param pulumi.Input[int] weight: The optional weight for ECMP routes. **Modifying this attribute will force creation of a new resource.**
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if colo_names is not None:
            pulumi.set(__self__, "colo_names", colo_names)
        if colo_regions is not None:
            pulumi.set(__self__, "colo_regions", colo_regions)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if nexthop is not None:
            pulumi.set(__self__, "nexthop", nexthop)
        if prefix is not None:
            pulumi.set(__self__, "prefix", prefix)
        if priority is not None:
            pulumi.set(__self__, "priority", priority)
        if weight is not None:
            pulumi.set(__self__, "weight", weight)

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
    @pulumi.getter(name="coloNames")
    def colo_names(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        List of Cloudflare colocation regions for this static route.
        """
        return pulumi.get(self, "colo_names")

    @colo_names.setter
    def colo_names(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "colo_names", value)

    @property
    @pulumi.getter(name="coloRegions")
    def colo_regions(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        List of Cloudflare colocation names for this static route.
        """
        return pulumi.get(self, "colo_regions")

    @colo_regions.setter
    def colo_regions(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "colo_regions", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the static route.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def nexthop(self) -> Optional[pulumi.Input[str]]:
        """
        The nexthop IP address where traffic will be routed to.
        """
        return pulumi.get(self, "nexthop")

    @nexthop.setter
    def nexthop(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "nexthop", value)

    @property
    @pulumi.getter
    def prefix(self) -> Optional[pulumi.Input[str]]:
        """
        Your network prefix using CIDR notation.
        """
        return pulumi.get(self, "prefix")

    @prefix.setter
    def prefix(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "prefix", value)

    @property
    @pulumi.getter
    def priority(self) -> Optional[pulumi.Input[int]]:
        """
        The priority for the static route.
        """
        return pulumi.get(self, "priority")

    @priority.setter
    def priority(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "priority", value)

    @property
    @pulumi.getter
    def weight(self) -> Optional[pulumi.Input[int]]:
        """
        The optional weight for ECMP routes. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "weight")

    @weight.setter
    def weight(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "weight", value)


class MagicWanStaticRoute(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 colo_names: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 colo_regions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 nexthop: Optional[pulumi.Input[str]] = None,
                 prefix: Optional[pulumi.Input[str]] = None,
                 priority: Optional[pulumi.Input[int]] = None,
                 weight: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        """
        Provides a resource, that manages Cloudflare static routes for Magic
        Transit or Magic WAN. Static routes are used to route traffic
        through GRE tunnels.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.MagicWanStaticRoute("example",
            account_id="f037e56e89293a057740de681ac9abbe",
            description="New route for new prefix 192.0.2.0/24",
            prefix="192.0.2.0/24",
            nexthop="10.0.0.0",
            priority=100,
            weight=10,
            colo_names=["den01"],
            colo_regions=["APAC"])
        ```

        ## Import

        ```sh
        $ pulumi import cloudflare:index/magicWanStaticRoute:MagicWanStaticRoute example <account_id>/<static_route_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[Sequence[pulumi.Input[str]]] colo_names: List of Cloudflare colocation regions for this static route.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] colo_regions: List of Cloudflare colocation names for this static route.
        :param pulumi.Input[str] description: Description of the static route.
        :param pulumi.Input[str] nexthop: The nexthop IP address where traffic will be routed to.
        :param pulumi.Input[str] prefix: Your network prefix using CIDR notation.
        :param pulumi.Input[int] priority: The priority for the static route.
        :param pulumi.Input[int] weight: The optional weight for ECMP routes. **Modifying this attribute will force creation of a new resource.**
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: MagicWanStaticRouteArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a resource, that manages Cloudflare static routes for Magic
        Transit or Magic WAN. Static routes are used to route traffic
        through GRE tunnels.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.MagicWanStaticRoute("example",
            account_id="f037e56e89293a057740de681ac9abbe",
            description="New route for new prefix 192.0.2.0/24",
            prefix="192.0.2.0/24",
            nexthop="10.0.0.0",
            priority=100,
            weight=10,
            colo_names=["den01"],
            colo_regions=["APAC"])
        ```

        ## Import

        ```sh
        $ pulumi import cloudflare:index/magicWanStaticRoute:MagicWanStaticRoute example <account_id>/<static_route_id>
        ```

        :param str resource_name: The name of the resource.
        :param MagicWanStaticRouteArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(MagicWanStaticRouteArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 colo_names: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 colo_regions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 nexthop: Optional[pulumi.Input[str]] = None,
                 prefix: Optional[pulumi.Input[str]] = None,
                 priority: Optional[pulumi.Input[int]] = None,
                 weight: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = MagicWanStaticRouteArgs.__new__(MagicWanStaticRouteArgs)

            __props__.__dict__["account_id"] = account_id
            __props__.__dict__["colo_names"] = colo_names
            __props__.__dict__["colo_regions"] = colo_regions
            __props__.__dict__["description"] = description
            if nexthop is None and not opts.urn:
                raise TypeError("Missing required property 'nexthop'")
            __props__.__dict__["nexthop"] = nexthop
            if prefix is None and not opts.urn:
                raise TypeError("Missing required property 'prefix'")
            __props__.__dict__["prefix"] = prefix
            if priority is None and not opts.urn:
                raise TypeError("Missing required property 'priority'")
            __props__.__dict__["priority"] = priority
            __props__.__dict__["weight"] = weight
        super(MagicWanStaticRoute, __self__).__init__(
            'cloudflare:index/magicWanStaticRoute:MagicWanStaticRoute',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[str]] = None,
            colo_names: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            colo_regions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            description: Optional[pulumi.Input[str]] = None,
            nexthop: Optional[pulumi.Input[str]] = None,
            prefix: Optional[pulumi.Input[str]] = None,
            priority: Optional[pulumi.Input[int]] = None,
            weight: Optional[pulumi.Input[int]] = None) -> 'MagicWanStaticRoute':
        """
        Get an existing MagicWanStaticRoute resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[Sequence[pulumi.Input[str]]] colo_names: List of Cloudflare colocation regions for this static route.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] colo_regions: List of Cloudflare colocation names for this static route.
        :param pulumi.Input[str] description: Description of the static route.
        :param pulumi.Input[str] nexthop: The nexthop IP address where traffic will be routed to.
        :param pulumi.Input[str] prefix: Your network prefix using CIDR notation.
        :param pulumi.Input[int] priority: The priority for the static route.
        :param pulumi.Input[int] weight: The optional weight for ECMP routes. **Modifying this attribute will force creation of a new resource.**
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _MagicWanStaticRouteState.__new__(_MagicWanStaticRouteState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["colo_names"] = colo_names
        __props__.__dict__["colo_regions"] = colo_regions
        __props__.__dict__["description"] = description
        __props__.__dict__["nexthop"] = nexthop
        __props__.__dict__["prefix"] = prefix
        __props__.__dict__["priority"] = priority
        __props__.__dict__["weight"] = weight
        return MagicWanStaticRoute(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[Optional[str]]:
        """
        The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter(name="coloNames")
    def colo_names(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        List of Cloudflare colocation regions for this static route.
        """
        return pulumi.get(self, "colo_names")

    @property
    @pulumi.getter(name="coloRegions")
    def colo_regions(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        List of Cloudflare colocation names for this static route.
        """
        return pulumi.get(self, "colo_regions")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Description of the static route.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def nexthop(self) -> pulumi.Output[str]:
        """
        The nexthop IP address where traffic will be routed to.
        """
        return pulumi.get(self, "nexthop")

    @property
    @pulumi.getter
    def prefix(self) -> pulumi.Output[str]:
        """
        Your network prefix using CIDR notation.
        """
        return pulumi.get(self, "prefix")

    @property
    @pulumi.getter
    def priority(self) -> pulumi.Output[int]:
        """
        The priority for the static route.
        """
        return pulumi.get(self, "priority")

    @property
    @pulumi.getter
    def weight(self) -> pulumi.Output[Optional[int]]:
        """
        The optional weight for ECMP routes. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "weight")
