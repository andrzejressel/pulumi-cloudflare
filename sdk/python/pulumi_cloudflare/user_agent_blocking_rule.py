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

__all__ = ['UserAgentBlockingRuleArgs', 'UserAgentBlockingRule']

@pulumi.input_type
class UserAgentBlockingRuleArgs:
    def __init__(__self__, *,
                 configuration: pulumi.Input['UserAgentBlockingRuleConfigurationArgs'],
                 description: pulumi.Input[str],
                 mode: pulumi.Input[str],
                 paused: pulumi.Input[bool],
                 zone_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a UserAgentBlockingRule resource.
        :param pulumi.Input['UserAgentBlockingRuleConfigurationArgs'] configuration: The configuration object for the current rule.
        :param pulumi.Input[str] description: An informative summary of the rule.
        :param pulumi.Input[str] mode: The action to apply to a matched request. Available values: `block`, `challenge`, `js_challenge`, `managed_challenge`.
        :param pulumi.Input[bool] paused: When true, indicates that the rule is currently paused.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        pulumi.set(__self__, "configuration", configuration)
        pulumi.set(__self__, "description", description)
        pulumi.set(__self__, "mode", mode)
        pulumi.set(__self__, "paused", paused)
        pulumi.set(__self__, "zone_id", zone_id)

    @property
    @pulumi.getter
    def configuration(self) -> pulumi.Input['UserAgentBlockingRuleConfigurationArgs']:
        """
        The configuration object for the current rule.
        """
        return pulumi.get(self, "configuration")

    @configuration.setter
    def configuration(self, value: pulumi.Input['UserAgentBlockingRuleConfigurationArgs']):
        pulumi.set(self, "configuration", value)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Input[str]:
        """
        An informative summary of the rule.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: pulumi.Input[str]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def mode(self) -> pulumi.Input[str]:
        """
        The action to apply to a matched request. Available values: `block`, `challenge`, `js_challenge`, `managed_challenge`.
        """
        return pulumi.get(self, "mode")

    @mode.setter
    def mode(self, value: pulumi.Input[str]):
        pulumi.set(self, "mode", value)

    @property
    @pulumi.getter
    def paused(self) -> pulumi.Input[bool]:
        """
        When true, indicates that the rule is currently paused.
        """
        return pulumi.get(self, "paused")

    @paused.setter
    def paused(self, value: pulumi.Input[bool]):
        pulumi.set(self, "paused", value)

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Input[str]:
        """
        The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "zone_id", value)


@pulumi.input_type
class _UserAgentBlockingRuleState:
    def __init__(__self__, *,
                 configuration: Optional[pulumi.Input['UserAgentBlockingRuleConfigurationArgs']] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 mode: Optional[pulumi.Input[str]] = None,
                 paused: Optional[pulumi.Input[bool]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering UserAgentBlockingRule resources.
        :param pulumi.Input['UserAgentBlockingRuleConfigurationArgs'] configuration: The configuration object for the current rule.
        :param pulumi.Input[str] description: An informative summary of the rule.
        :param pulumi.Input[str] mode: The action to apply to a matched request. Available values: `block`, `challenge`, `js_challenge`, `managed_challenge`.
        :param pulumi.Input[bool] paused: When true, indicates that the rule is currently paused.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        if configuration is not None:
            pulumi.set(__self__, "configuration", configuration)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if mode is not None:
            pulumi.set(__self__, "mode", mode)
        if paused is not None:
            pulumi.set(__self__, "paused", paused)
        if zone_id is not None:
            pulumi.set(__self__, "zone_id", zone_id)

    @property
    @pulumi.getter
    def configuration(self) -> Optional[pulumi.Input['UserAgentBlockingRuleConfigurationArgs']]:
        """
        The configuration object for the current rule.
        """
        return pulumi.get(self, "configuration")

    @configuration.setter
    def configuration(self, value: Optional[pulumi.Input['UserAgentBlockingRuleConfigurationArgs']]):
        pulumi.set(self, "configuration", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        An informative summary of the rule.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def mode(self) -> Optional[pulumi.Input[str]]:
        """
        The action to apply to a matched request. Available values: `block`, `challenge`, `js_challenge`, `managed_challenge`.
        """
        return pulumi.get(self, "mode")

    @mode.setter
    def mode(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "mode", value)

    @property
    @pulumi.getter
    def paused(self) -> Optional[pulumi.Input[bool]]:
        """
        When true, indicates that the rule is currently paused.
        """
        return pulumi.get(self, "paused")

    @paused.setter
    def paused(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "paused", value)

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> Optional[pulumi.Input[str]]:
        """
        The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "zone_id", value)


class UserAgentBlockingRule(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 configuration: Optional[pulumi.Input[pulumi.InputType['UserAgentBlockingRuleConfigurationArgs']]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 mode: Optional[pulumi.Input[str]] = None,
                 paused: Optional[pulumi.Input[bool]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a resource to manage User Agent Blocking Rules.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example1 = cloudflare.UserAgentBlockingRule("example_1",
            zone_id="0da42c8d2132a9ddaf714f9e7c920711",
            mode="js_challenge",
            paused=False,
            description="My description 1",
            configuration=cloudflare.UserAgentBlockingRuleConfigurationArgs(
                target="ua",
                value="Chrome",
            ))
        example2 = cloudflare.UserAgentBlockingRule("example_2",
            zone_id="0da42c8d2132a9ddaf714f9e7c920711",
            mode="challenge",
            paused=True,
            description="My description 22",
            configuration=cloudflare.UserAgentBlockingRuleConfigurationArgs(
                target="ua",
                value="Mozilla",
            ))
        ```

        ## Import

        ```sh
        $ pulumi import cloudflare:index/userAgentBlockingRule:UserAgentBlockingRule example <zone_id>/<user_agent_blocking_rule_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['UserAgentBlockingRuleConfigurationArgs']] configuration: The configuration object for the current rule.
        :param pulumi.Input[str] description: An informative summary of the rule.
        :param pulumi.Input[str] mode: The action to apply to a matched request. Available values: `block`, `challenge`, `js_challenge`, `managed_challenge`.
        :param pulumi.Input[bool] paused: When true, indicates that the rule is currently paused.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: UserAgentBlockingRuleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a resource to manage User Agent Blocking Rules.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example1 = cloudflare.UserAgentBlockingRule("example_1",
            zone_id="0da42c8d2132a9ddaf714f9e7c920711",
            mode="js_challenge",
            paused=False,
            description="My description 1",
            configuration=cloudflare.UserAgentBlockingRuleConfigurationArgs(
                target="ua",
                value="Chrome",
            ))
        example2 = cloudflare.UserAgentBlockingRule("example_2",
            zone_id="0da42c8d2132a9ddaf714f9e7c920711",
            mode="challenge",
            paused=True,
            description="My description 22",
            configuration=cloudflare.UserAgentBlockingRuleConfigurationArgs(
                target="ua",
                value="Mozilla",
            ))
        ```

        ## Import

        ```sh
        $ pulumi import cloudflare:index/userAgentBlockingRule:UserAgentBlockingRule example <zone_id>/<user_agent_blocking_rule_id>
        ```

        :param str resource_name: The name of the resource.
        :param UserAgentBlockingRuleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(UserAgentBlockingRuleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 configuration: Optional[pulumi.Input[pulumi.InputType['UserAgentBlockingRuleConfigurationArgs']]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 mode: Optional[pulumi.Input[str]] = None,
                 paused: Optional[pulumi.Input[bool]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = UserAgentBlockingRuleArgs.__new__(UserAgentBlockingRuleArgs)

            if configuration is None and not opts.urn:
                raise TypeError("Missing required property 'configuration'")
            __props__.__dict__["configuration"] = configuration
            if description is None and not opts.urn:
                raise TypeError("Missing required property 'description'")
            __props__.__dict__["description"] = description
            if mode is None and not opts.urn:
                raise TypeError("Missing required property 'mode'")
            __props__.__dict__["mode"] = mode
            if paused is None and not opts.urn:
                raise TypeError("Missing required property 'paused'")
            __props__.__dict__["paused"] = paused
            if zone_id is None and not opts.urn:
                raise TypeError("Missing required property 'zone_id'")
            __props__.__dict__["zone_id"] = zone_id
        super(UserAgentBlockingRule, __self__).__init__(
            'cloudflare:index/userAgentBlockingRule:UserAgentBlockingRule',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            configuration: Optional[pulumi.Input[pulumi.InputType['UserAgentBlockingRuleConfigurationArgs']]] = None,
            description: Optional[pulumi.Input[str]] = None,
            mode: Optional[pulumi.Input[str]] = None,
            paused: Optional[pulumi.Input[bool]] = None,
            zone_id: Optional[pulumi.Input[str]] = None) -> 'UserAgentBlockingRule':
        """
        Get an existing UserAgentBlockingRule resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['UserAgentBlockingRuleConfigurationArgs']] configuration: The configuration object for the current rule.
        :param pulumi.Input[str] description: An informative summary of the rule.
        :param pulumi.Input[str] mode: The action to apply to a matched request. Available values: `block`, `challenge`, `js_challenge`, `managed_challenge`.
        :param pulumi.Input[bool] paused: When true, indicates that the rule is currently paused.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _UserAgentBlockingRuleState.__new__(_UserAgentBlockingRuleState)

        __props__.__dict__["configuration"] = configuration
        __props__.__dict__["description"] = description
        __props__.__dict__["mode"] = mode
        __props__.__dict__["paused"] = paused
        __props__.__dict__["zone_id"] = zone_id
        return UserAgentBlockingRule(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def configuration(self) -> pulumi.Output['outputs.UserAgentBlockingRuleConfiguration']:
        """
        The configuration object for the current rule.
        """
        return pulumi.get(self, "configuration")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[str]:
        """
        An informative summary of the rule.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def mode(self) -> pulumi.Output[str]:
        """
        The action to apply to a matched request. Available values: `block`, `challenge`, `js_challenge`, `managed_challenge`.
        """
        return pulumi.get(self, "mode")

    @property
    @pulumi.getter
    def paused(self) -> pulumi.Output[bool]:
        """
        When true, indicates that the rule is currently paused.
        """
        return pulumi.get(self, "paused")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Output[str]:
        """
        The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "zone_id")

