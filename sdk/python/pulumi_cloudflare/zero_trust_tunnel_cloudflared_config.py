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
from . import outputs
from ._inputs import *

__all__ = ['ZeroTrustTunnelCloudflaredConfigArgs', 'ZeroTrustTunnelCloudflaredConfig']

@pulumi.input_type
class ZeroTrustTunnelCloudflaredConfigArgs:
    def __init__(__self__, *,
                 account_id: pulumi.Input[str],
                 config: pulumi.Input['ZeroTrustTunnelCloudflaredConfigConfigArgs'],
                 tunnel_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a ZeroTrustTunnelCloudflaredConfig resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input['ZeroTrustTunnelCloudflaredConfigConfigArgs'] config: Configuration block for Tunnel Configuration.
        :param pulumi.Input[str] tunnel_id: Identifier of the Tunnel to target for this configuration.
        """
        pulumi.set(__self__, "account_id", account_id)
        pulumi.set(__self__, "config", config)
        pulumi.set(__self__, "tunnel_id", tunnel_id)

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
    def config(self) -> pulumi.Input['ZeroTrustTunnelCloudflaredConfigConfigArgs']:
        """
        Configuration block for Tunnel Configuration.
        """
        return pulumi.get(self, "config")

    @config.setter
    def config(self, value: pulumi.Input['ZeroTrustTunnelCloudflaredConfigConfigArgs']):
        pulumi.set(self, "config", value)

    @property
    @pulumi.getter(name="tunnelId")
    def tunnel_id(self) -> pulumi.Input[str]:
        """
        Identifier of the Tunnel to target for this configuration.
        """
        return pulumi.get(self, "tunnel_id")

    @tunnel_id.setter
    def tunnel_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "tunnel_id", value)


@pulumi.input_type
class _ZeroTrustTunnelCloudflaredConfigState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[str]] = None,
                 config: Optional[pulumi.Input['ZeroTrustTunnelCloudflaredConfigConfigArgs']] = None,
                 tunnel_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ZeroTrustTunnelCloudflaredConfig resources.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input['ZeroTrustTunnelCloudflaredConfigConfigArgs'] config: Configuration block for Tunnel Configuration.
        :param pulumi.Input[str] tunnel_id: Identifier of the Tunnel to target for this configuration.
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if config is not None:
            pulumi.set(__self__, "config", config)
        if tunnel_id is not None:
            pulumi.set(__self__, "tunnel_id", tunnel_id)

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
    def config(self) -> Optional[pulumi.Input['ZeroTrustTunnelCloudflaredConfigConfigArgs']]:
        """
        Configuration block for Tunnel Configuration.
        """
        return pulumi.get(self, "config")

    @config.setter
    def config(self, value: Optional[pulumi.Input['ZeroTrustTunnelCloudflaredConfigConfigArgs']]):
        pulumi.set(self, "config", value)

    @property
    @pulumi.getter(name="tunnelId")
    def tunnel_id(self) -> Optional[pulumi.Input[str]]:
        """
        Identifier of the Tunnel to target for this configuration.
        """
        return pulumi.get(self, "tunnel_id")

    @tunnel_id.setter
    def tunnel_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "tunnel_id", value)


class ZeroTrustTunnelCloudflaredConfig(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 config: Optional[pulumi.Input[Union['ZeroTrustTunnelCloudflaredConfigConfigArgs', 'ZeroTrustTunnelCloudflaredConfigConfigArgsDict']]] = None,
                 tunnel_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Cloudflare Tunnel configuration resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example_tunnel = cloudflare.ZeroTrustTunnelCloudflared("example_tunnel",
            account_id="f037e56e89293a057740de681ac9abbe",
            name="example_tunnel",
            secret="<32 character secret>")
        example_config = cloudflare.ZeroTrustTunnelCloudflaredConfig("example_config",
            account_id="f037e56e89293a057740de681ac9abbe",
            tunnel_id=example_tunnel.id,
            config={
                "warp_routing": {
                    "enabled": True,
                },
                "origin_request": {
                    "connect_timeout": "1m0s",
                    "tls_timeout": "1m0s",
                    "tcp_keep_alive": "1m0s",
                    "no_happy_eyeballs": False,
                    "keep_alive_connections": 1024,
                    "keep_alive_timeout": "1m0s",
                    "http_host_header": "baz",
                    "origin_server_name": "foobar",
                    "ca_pool": "/path/to/unsigned/ca/pool",
                    "no_tls_verify": False,
                    "disable_chunked_encoding": False,
                    "bastion_mode": False,
                    "proxy_address": "10.0.0.1",
                    "proxy_port": 8123,
                    "proxy_type": "socks",
                    "ip_rules": [{
                        "prefix": "/web",
                        "ports": [
                            80,
                            443,
                        ],
                        "allow": False,
                    }],
                },
                "ingress_rules": [
                    {
                        "hostname": "foo",
                        "path": "/bar",
                        "service": "http://10.0.0.2:8080",
                        "origin_request": {
                            "connect_timeout": "2m0s",
                            "access": {
                                "required": True,
                                "team_name": "terraform",
                                "aud_tags": ["AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"],
                            },
                        },
                    },
                    {
                        "service": "https://10.0.0.3:8081",
                    },
                ],
            })
        ```

        ## Import

        ```sh
        $ pulumi import cloudflare:index/zeroTrustTunnelCloudflaredConfig:ZeroTrustTunnelCloudflaredConfig example <account_id>/<tunnel_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[Union['ZeroTrustTunnelCloudflaredConfigConfigArgs', 'ZeroTrustTunnelCloudflaredConfigConfigArgsDict']] config: Configuration block for Tunnel Configuration.
        :param pulumi.Input[str] tunnel_id: Identifier of the Tunnel to target for this configuration.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ZeroTrustTunnelCloudflaredConfigArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Cloudflare Tunnel configuration resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example_tunnel = cloudflare.ZeroTrustTunnelCloudflared("example_tunnel",
            account_id="f037e56e89293a057740de681ac9abbe",
            name="example_tunnel",
            secret="<32 character secret>")
        example_config = cloudflare.ZeroTrustTunnelCloudflaredConfig("example_config",
            account_id="f037e56e89293a057740de681ac9abbe",
            tunnel_id=example_tunnel.id,
            config={
                "warp_routing": {
                    "enabled": True,
                },
                "origin_request": {
                    "connect_timeout": "1m0s",
                    "tls_timeout": "1m0s",
                    "tcp_keep_alive": "1m0s",
                    "no_happy_eyeballs": False,
                    "keep_alive_connections": 1024,
                    "keep_alive_timeout": "1m0s",
                    "http_host_header": "baz",
                    "origin_server_name": "foobar",
                    "ca_pool": "/path/to/unsigned/ca/pool",
                    "no_tls_verify": False,
                    "disable_chunked_encoding": False,
                    "bastion_mode": False,
                    "proxy_address": "10.0.0.1",
                    "proxy_port": 8123,
                    "proxy_type": "socks",
                    "ip_rules": [{
                        "prefix": "/web",
                        "ports": [
                            80,
                            443,
                        ],
                        "allow": False,
                    }],
                },
                "ingress_rules": [
                    {
                        "hostname": "foo",
                        "path": "/bar",
                        "service": "http://10.0.0.2:8080",
                        "origin_request": {
                            "connect_timeout": "2m0s",
                            "access": {
                                "required": True,
                                "team_name": "terraform",
                                "aud_tags": ["AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"],
                            },
                        },
                    },
                    {
                        "service": "https://10.0.0.3:8081",
                    },
                ],
            })
        ```

        ## Import

        ```sh
        $ pulumi import cloudflare:index/zeroTrustTunnelCloudflaredConfig:ZeroTrustTunnelCloudflaredConfig example <account_id>/<tunnel_id>
        ```

        :param str resource_name: The name of the resource.
        :param ZeroTrustTunnelCloudflaredConfigArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ZeroTrustTunnelCloudflaredConfigArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 config: Optional[pulumi.Input[Union['ZeroTrustTunnelCloudflaredConfigConfigArgs', 'ZeroTrustTunnelCloudflaredConfigConfigArgsDict']]] = None,
                 tunnel_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ZeroTrustTunnelCloudflaredConfigArgs.__new__(ZeroTrustTunnelCloudflaredConfigArgs)

            if account_id is None and not opts.urn:
                raise TypeError("Missing required property 'account_id'")
            __props__.__dict__["account_id"] = account_id
            if config is None and not opts.urn:
                raise TypeError("Missing required property 'config'")
            __props__.__dict__["config"] = config
            if tunnel_id is None and not opts.urn:
                raise TypeError("Missing required property 'tunnel_id'")
            __props__.__dict__["tunnel_id"] = tunnel_id
        super(ZeroTrustTunnelCloudflaredConfig, __self__).__init__(
            'cloudflare:index/zeroTrustTunnelCloudflaredConfig:ZeroTrustTunnelCloudflaredConfig',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[str]] = None,
            config: Optional[pulumi.Input[Union['ZeroTrustTunnelCloudflaredConfigConfigArgs', 'ZeroTrustTunnelCloudflaredConfigConfigArgsDict']]] = None,
            tunnel_id: Optional[pulumi.Input[str]] = None) -> 'ZeroTrustTunnelCloudflaredConfig':
        """
        Get an existing ZeroTrustTunnelCloudflaredConfig resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[Union['ZeroTrustTunnelCloudflaredConfigConfigArgs', 'ZeroTrustTunnelCloudflaredConfigConfigArgsDict']] config: Configuration block for Tunnel Configuration.
        :param pulumi.Input[str] tunnel_id: Identifier of the Tunnel to target for this configuration.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ZeroTrustTunnelCloudflaredConfigState.__new__(_ZeroTrustTunnelCloudflaredConfigState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["config"] = config
        __props__.__dict__["tunnel_id"] = tunnel_id
        return ZeroTrustTunnelCloudflaredConfig(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[str]:
        """
        The account identifier to target for the resource.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter
    def config(self) -> pulumi.Output['outputs.ZeroTrustTunnelCloudflaredConfigConfig']:
        """
        Configuration block for Tunnel Configuration.
        """
        return pulumi.get(self, "config")

    @property
    @pulumi.getter(name="tunnelId")
    def tunnel_id(self) -> pulumi.Output[str]:
        """
        Identifier of the Tunnel to target for this configuration.
        """
        return pulumi.get(self, "tunnel_id")

