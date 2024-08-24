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

__all__ = ['ZeroTrustSplitTunnelArgs', 'ZeroTrustSplitTunnel']

@pulumi.input_type
class ZeroTrustSplitTunnelArgs:
    def __init__(__self__, *,
                 account_id: pulumi.Input[str],
                 mode: pulumi.Input[str],
                 tunnels: pulumi.Input[Sequence[pulumi.Input['ZeroTrustSplitTunnelTunnelArgs']]],
                 policy_id: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a ZeroTrustSplitTunnel resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[str] mode: The mode of the split tunnel policy. Available values: `include`, `exclude`.
        :param pulumi.Input[Sequence[pulumi.Input['ZeroTrustSplitTunnelTunnelArgs']]] tunnels: The value of the tunnel attributes.
        :param pulumi.Input[str] policy_id: The settings policy for which to configure this split tunnel policy.
        """
        pulumi.set(__self__, "account_id", account_id)
        pulumi.set(__self__, "mode", mode)
        pulumi.set(__self__, "tunnels", tunnels)
        if policy_id is not None:
            pulumi.set(__self__, "policy_id", policy_id)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Input[str]:
        """
        The account identifier to target for the resource.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter
    def mode(self) -> pulumi.Input[str]:
        """
        The mode of the split tunnel policy. Available values: `include`, `exclude`.
        """
        return pulumi.get(self, "mode")

    @mode.setter
    def mode(self, value: pulumi.Input[str]):
        pulumi.set(self, "mode", value)

    @property
    @pulumi.getter
    def tunnels(self) -> pulumi.Input[Sequence[pulumi.Input['ZeroTrustSplitTunnelTunnelArgs']]]:
        """
        The value of the tunnel attributes.
        """
        return pulumi.get(self, "tunnels")

    @tunnels.setter
    def tunnels(self, value: pulumi.Input[Sequence[pulumi.Input['ZeroTrustSplitTunnelTunnelArgs']]]):
        pulumi.set(self, "tunnels", value)

    @property
    @pulumi.getter(name="policyId")
    def policy_id(self) -> Optional[pulumi.Input[str]]:
        """
        The settings policy for which to configure this split tunnel policy.
        """
        return pulumi.get(self, "policy_id")

    @policy_id.setter
    def policy_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "policy_id", value)


@pulumi.input_type
class _ZeroTrustSplitTunnelState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[str]] = None,
                 mode: Optional[pulumi.Input[str]] = None,
                 policy_id: Optional[pulumi.Input[str]] = None,
                 tunnels: Optional[pulumi.Input[Sequence[pulumi.Input['ZeroTrustSplitTunnelTunnelArgs']]]] = None):
        """
        Input properties used for looking up and filtering ZeroTrustSplitTunnel resources.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[str] mode: The mode of the split tunnel policy. Available values: `include`, `exclude`.
        :param pulumi.Input[str] policy_id: The settings policy for which to configure this split tunnel policy.
        :param pulumi.Input[Sequence[pulumi.Input['ZeroTrustSplitTunnelTunnelArgs']]] tunnels: The value of the tunnel attributes.
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if mode is not None:
            pulumi.set(__self__, "mode", mode)
        if policy_id is not None:
            pulumi.set(__self__, "policy_id", policy_id)
        if tunnels is not None:
            pulumi.set(__self__, "tunnels", tunnels)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[str]]:
        """
        The account identifier to target for the resource.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter
    def mode(self) -> Optional[pulumi.Input[str]]:
        """
        The mode of the split tunnel policy. Available values: `include`, `exclude`.
        """
        return pulumi.get(self, "mode")

    @mode.setter
    def mode(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "mode", value)

    @property
    @pulumi.getter(name="policyId")
    def policy_id(self) -> Optional[pulumi.Input[str]]:
        """
        The settings policy for which to configure this split tunnel policy.
        """
        return pulumi.get(self, "policy_id")

    @policy_id.setter
    def policy_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "policy_id", value)

    @property
    @pulumi.getter
    def tunnels(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ZeroTrustSplitTunnelTunnelArgs']]]]:
        """
        The value of the tunnel attributes.
        """
        return pulumi.get(self, "tunnels")

    @tunnels.setter
    def tunnels(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ZeroTrustSplitTunnelTunnelArgs']]]]):
        pulumi.set(self, "tunnels", value)


class ZeroTrustSplitTunnel(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 mode: Optional[pulumi.Input[str]] = None,
                 policy_id: Optional[pulumi.Input[str]] = None,
                 tunnels: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ZeroTrustSplitTunnelTunnelArgs', 'ZeroTrustSplitTunnelTunnelArgsDict']]]]] = None,
                 __props__=None):
        """
        Provides a Cloudflare Split Tunnel resource. Split tunnels are used to either
        include or exclude lists of routes from the WARP client's tunnel.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[str] mode: The mode of the split tunnel policy. Available values: `include`, `exclude`.
        :param pulumi.Input[str] policy_id: The settings policy for which to configure this split tunnel policy.
        :param pulumi.Input[Sequence[pulumi.Input[Union['ZeroTrustSplitTunnelTunnelArgs', 'ZeroTrustSplitTunnelTunnelArgsDict']]]] tunnels: The value of the tunnel attributes.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ZeroTrustSplitTunnelArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Cloudflare Split Tunnel resource. Split tunnels are used to either
        include or exclude lists of routes from the WARP client's tunnel.

        :param str resource_name: The name of the resource.
        :param ZeroTrustSplitTunnelArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ZeroTrustSplitTunnelArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 mode: Optional[pulumi.Input[str]] = None,
                 policy_id: Optional[pulumi.Input[str]] = None,
                 tunnels: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ZeroTrustSplitTunnelTunnelArgs', 'ZeroTrustSplitTunnelTunnelArgsDict']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ZeroTrustSplitTunnelArgs.__new__(ZeroTrustSplitTunnelArgs)

            if account_id is None and not opts.urn:
                raise TypeError("Missing required property 'account_id'")
            __props__.__dict__["account_id"] = account_id
            if mode is None and not opts.urn:
                raise TypeError("Missing required property 'mode'")
            __props__.__dict__["mode"] = mode
            __props__.__dict__["policy_id"] = policy_id
            if tunnels is None and not opts.urn:
                raise TypeError("Missing required property 'tunnels'")
            __props__.__dict__["tunnels"] = tunnels
        super(ZeroTrustSplitTunnel, __self__).__init__(
            'cloudflare:index/zeroTrustSplitTunnel:ZeroTrustSplitTunnel',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[str]] = None,
            mode: Optional[pulumi.Input[str]] = None,
            policy_id: Optional[pulumi.Input[str]] = None,
            tunnels: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ZeroTrustSplitTunnelTunnelArgs', 'ZeroTrustSplitTunnelTunnelArgsDict']]]]] = None) -> 'ZeroTrustSplitTunnel':
        """
        Get an existing ZeroTrustSplitTunnel resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[str] mode: The mode of the split tunnel policy. Available values: `include`, `exclude`.
        :param pulumi.Input[str] policy_id: The settings policy for which to configure this split tunnel policy.
        :param pulumi.Input[Sequence[pulumi.Input[Union['ZeroTrustSplitTunnelTunnelArgs', 'ZeroTrustSplitTunnelTunnelArgsDict']]]] tunnels: The value of the tunnel attributes.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ZeroTrustSplitTunnelState.__new__(_ZeroTrustSplitTunnelState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["mode"] = mode
        __props__.__dict__["policy_id"] = policy_id
        __props__.__dict__["tunnels"] = tunnels
        return ZeroTrustSplitTunnel(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[str]:
        """
        The account identifier to target for the resource.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter
    def mode(self) -> pulumi.Output[str]:
        """
        The mode of the split tunnel policy. Available values: `include`, `exclude`.
        """
        return pulumi.get(self, "mode")

    @property
    @pulumi.getter(name="policyId")
    def policy_id(self) -> pulumi.Output[Optional[str]]:
        """
        The settings policy for which to configure this split tunnel policy.
        """
        return pulumi.get(self, "policy_id")

    @property
    @pulumi.getter
    def tunnels(self) -> pulumi.Output[Sequence['outputs.ZeroTrustSplitTunnelTunnel']]:
        """
        The value of the tunnel attributes.
        """
        return pulumi.get(self, "tunnels")
