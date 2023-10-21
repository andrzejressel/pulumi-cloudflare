# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['TeamsRuleArgs', 'TeamsRule']

@pulumi.input_type
class TeamsRuleArgs:
    def __init__(__self__, *,
                 account_id: pulumi.Input[str],
                 action: pulumi.Input[str],
                 description: pulumi.Input[str],
                 name: pulumi.Input[str],
                 precedence: pulumi.Input[int],
                 device_posture: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 filters: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 identity: Optional[pulumi.Input[str]] = None,
                 rule_settings: Optional[pulumi.Input['TeamsRuleRuleSettingsArgs']] = None,
                 traffic: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a TeamsRule resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[str] action: Action to be taken when the SSL certificate of upstream is invalid. Available values: `pass_through`, `block`, `error`.
        :param pulumi.Input[str] description: The description of the teams rule.
        :param pulumi.Input[str] name: The name of the teams rule.
        :param pulumi.Input[int] precedence: The evaluation precedence of the teams rule.
        :param pulumi.Input[str] device_posture: The wirefilter expression to be used for device_posture check matching.
        :param pulumi.Input[bool] enabled: Enable or disable DLP Payload Logging for this rule.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] filters: The protocol or layer to evaluate the traffic and identity expressions.
        :param pulumi.Input[str] identity: The wirefilter expression to be used for identity matching.
        :param pulumi.Input['TeamsRuleRuleSettingsArgs'] rule_settings: Additional rule settings.
        :param pulumi.Input[str] traffic: The wirefilter expression to be used for traffic matching.
        """
        TeamsRuleArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            account_id=account_id,
            action=action,
            description=description,
            name=name,
            precedence=precedence,
            device_posture=device_posture,
            enabled=enabled,
            filters=filters,
            identity=identity,
            rule_settings=rule_settings,
            traffic=traffic,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             account_id: pulumi.Input[str],
             action: pulumi.Input[str],
             description: pulumi.Input[str],
             name: pulumi.Input[str],
             precedence: pulumi.Input[int],
             device_posture: Optional[pulumi.Input[str]] = None,
             enabled: Optional[pulumi.Input[bool]] = None,
             filters: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             identity: Optional[pulumi.Input[str]] = None,
             rule_settings: Optional[pulumi.Input['TeamsRuleRuleSettingsArgs']] = None,
             traffic: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if 'accountId' in kwargs:
            account_id = kwargs['accountId']
        if 'devicePosture' in kwargs:
            device_posture = kwargs['devicePosture']
        if 'ruleSettings' in kwargs:
            rule_settings = kwargs['ruleSettings']

        _setter("account_id", account_id)
        _setter("action", action)
        _setter("description", description)
        _setter("name", name)
        _setter("precedence", precedence)
        if device_posture is not None:
            _setter("device_posture", device_posture)
        if enabled is not None:
            _setter("enabled", enabled)
        if filters is not None:
            _setter("filters", filters)
        if identity is not None:
            _setter("identity", identity)
        if rule_settings is not None:
            _setter("rule_settings", rule_settings)
        if traffic is not None:
            _setter("traffic", traffic)

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
    def action(self) -> pulumi.Input[str]:
        """
        Action to be taken when the SSL certificate of upstream is invalid. Available values: `pass_through`, `block`, `error`.
        """
        return pulumi.get(self, "action")

    @action.setter
    def action(self, value: pulumi.Input[str]):
        pulumi.set(self, "action", value)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Input[str]:
        """
        The description of the teams rule.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: pulumi.Input[str]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Input[str]:
        """
        The name of the teams rule.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[str]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def precedence(self) -> pulumi.Input[int]:
        """
        The evaluation precedence of the teams rule.
        """
        return pulumi.get(self, "precedence")

    @precedence.setter
    def precedence(self, value: pulumi.Input[int]):
        pulumi.set(self, "precedence", value)

    @property
    @pulumi.getter(name="devicePosture")
    def device_posture(self) -> Optional[pulumi.Input[str]]:
        """
        The wirefilter expression to be used for device_posture check matching.
        """
        return pulumi.get(self, "device_posture")

    @device_posture.setter
    def device_posture(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "device_posture", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable or disable DLP Payload Logging for this rule.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def filters(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The protocol or layer to evaluate the traffic and identity expressions.
        """
        return pulumi.get(self, "filters")

    @filters.setter
    def filters(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "filters", value)

    @property
    @pulumi.getter
    def identity(self) -> Optional[pulumi.Input[str]]:
        """
        The wirefilter expression to be used for identity matching.
        """
        return pulumi.get(self, "identity")

    @identity.setter
    def identity(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "identity", value)

    @property
    @pulumi.getter(name="ruleSettings")
    def rule_settings(self) -> Optional[pulumi.Input['TeamsRuleRuleSettingsArgs']]:
        """
        Additional rule settings.
        """
        return pulumi.get(self, "rule_settings")

    @rule_settings.setter
    def rule_settings(self, value: Optional[pulumi.Input['TeamsRuleRuleSettingsArgs']]):
        pulumi.set(self, "rule_settings", value)

    @property
    @pulumi.getter
    def traffic(self) -> Optional[pulumi.Input[str]]:
        """
        The wirefilter expression to be used for traffic matching.
        """
        return pulumi.get(self, "traffic")

    @traffic.setter
    def traffic(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "traffic", value)


@pulumi.input_type
class _TeamsRuleState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[str]] = None,
                 action: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 device_posture: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 filters: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 identity: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 precedence: Optional[pulumi.Input[int]] = None,
                 rule_settings: Optional[pulumi.Input['TeamsRuleRuleSettingsArgs']] = None,
                 traffic: Optional[pulumi.Input[str]] = None,
                 version: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering TeamsRule resources.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[str] action: Action to be taken when the SSL certificate of upstream is invalid. Available values: `pass_through`, `block`, `error`.
        :param pulumi.Input[str] description: The description of the teams rule.
        :param pulumi.Input[str] device_posture: The wirefilter expression to be used for device_posture check matching.
        :param pulumi.Input[bool] enabled: Enable or disable DLP Payload Logging for this rule.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] filters: The protocol or layer to evaluate the traffic and identity expressions.
        :param pulumi.Input[str] identity: The wirefilter expression to be used for identity matching.
        :param pulumi.Input[str] name: The name of the teams rule.
        :param pulumi.Input[int] precedence: The evaluation precedence of the teams rule.
        :param pulumi.Input['TeamsRuleRuleSettingsArgs'] rule_settings: Additional rule settings.
        :param pulumi.Input[str] traffic: The wirefilter expression to be used for traffic matching.
        """
        _TeamsRuleState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            account_id=account_id,
            action=action,
            description=description,
            device_posture=device_posture,
            enabled=enabled,
            filters=filters,
            identity=identity,
            name=name,
            precedence=precedence,
            rule_settings=rule_settings,
            traffic=traffic,
            version=version,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             account_id: Optional[pulumi.Input[str]] = None,
             action: Optional[pulumi.Input[str]] = None,
             description: Optional[pulumi.Input[str]] = None,
             device_posture: Optional[pulumi.Input[str]] = None,
             enabled: Optional[pulumi.Input[bool]] = None,
             filters: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             identity: Optional[pulumi.Input[str]] = None,
             name: Optional[pulumi.Input[str]] = None,
             precedence: Optional[pulumi.Input[int]] = None,
             rule_settings: Optional[pulumi.Input['TeamsRuleRuleSettingsArgs']] = None,
             traffic: Optional[pulumi.Input[str]] = None,
             version: Optional[pulumi.Input[int]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if 'accountId' in kwargs:
            account_id = kwargs['accountId']
        if 'devicePosture' in kwargs:
            device_posture = kwargs['devicePosture']
        if 'ruleSettings' in kwargs:
            rule_settings = kwargs['ruleSettings']

        if account_id is not None:
            _setter("account_id", account_id)
        if action is not None:
            _setter("action", action)
        if description is not None:
            _setter("description", description)
        if device_posture is not None:
            _setter("device_posture", device_posture)
        if enabled is not None:
            _setter("enabled", enabled)
        if filters is not None:
            _setter("filters", filters)
        if identity is not None:
            _setter("identity", identity)
        if name is not None:
            _setter("name", name)
        if precedence is not None:
            _setter("precedence", precedence)
        if rule_settings is not None:
            _setter("rule_settings", rule_settings)
        if traffic is not None:
            _setter("traffic", traffic)
        if version is not None:
            _setter("version", version)

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
    def action(self) -> Optional[pulumi.Input[str]]:
        """
        Action to be taken when the SSL certificate of upstream is invalid. Available values: `pass_through`, `block`, `error`.
        """
        return pulumi.get(self, "action")

    @action.setter
    def action(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "action", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the teams rule.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="devicePosture")
    def device_posture(self) -> Optional[pulumi.Input[str]]:
        """
        The wirefilter expression to be used for device_posture check matching.
        """
        return pulumi.get(self, "device_posture")

    @device_posture.setter
    def device_posture(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "device_posture", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable or disable DLP Payload Logging for this rule.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def filters(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The protocol or layer to evaluate the traffic and identity expressions.
        """
        return pulumi.get(self, "filters")

    @filters.setter
    def filters(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "filters", value)

    @property
    @pulumi.getter
    def identity(self) -> Optional[pulumi.Input[str]]:
        """
        The wirefilter expression to be used for identity matching.
        """
        return pulumi.get(self, "identity")

    @identity.setter
    def identity(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "identity", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the teams rule.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def precedence(self) -> Optional[pulumi.Input[int]]:
        """
        The evaluation precedence of the teams rule.
        """
        return pulumi.get(self, "precedence")

    @precedence.setter
    def precedence(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "precedence", value)

    @property
    @pulumi.getter(name="ruleSettings")
    def rule_settings(self) -> Optional[pulumi.Input['TeamsRuleRuleSettingsArgs']]:
        """
        Additional rule settings.
        """
        return pulumi.get(self, "rule_settings")

    @rule_settings.setter
    def rule_settings(self, value: Optional[pulumi.Input['TeamsRuleRuleSettingsArgs']]):
        pulumi.set(self, "rule_settings", value)

    @property
    @pulumi.getter
    def traffic(self) -> Optional[pulumi.Input[str]]:
        """
        The wirefilter expression to be used for traffic matching.
        """
        return pulumi.get(self, "traffic")

    @traffic.setter
    def traffic(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "traffic", value)

    @property
    @pulumi.getter
    def version(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "version")

    @version.setter
    def version(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "version", value)


class TeamsRule(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 action: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 device_posture: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 filters: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 identity: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 precedence: Optional[pulumi.Input[int]] = None,
                 rule_settings: Optional[pulumi.Input[pulumi.InputType['TeamsRuleRuleSettingsArgs']]] = None,
                 traffic: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Cloudflare Teams rule resource. Teams rules comprise secure web gateway policies.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.TeamsRule("example",
            account_id="f037e56e89293a057740de681ac9abbe",
            action="block",
            description="desc",
            filters=["http"],
            name="office",
            precedence=1,
            rule_settings=cloudflare.TeamsRuleRuleSettingsArgs(
                block_page_enabled=True,
                block_page_reason="access not permitted",
            ),
            traffic="http.request.uri == \\"https://www.example.com/malicious\\"")
        ```

        ## Import

        ```sh
         $ pulumi import cloudflare:index/teamsRule:TeamsRule example <account_id>/<teams_rule_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[str] action: Action to be taken when the SSL certificate of upstream is invalid. Available values: `pass_through`, `block`, `error`.
        :param pulumi.Input[str] description: The description of the teams rule.
        :param pulumi.Input[str] device_posture: The wirefilter expression to be used for device_posture check matching.
        :param pulumi.Input[bool] enabled: Enable or disable DLP Payload Logging for this rule.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] filters: The protocol or layer to evaluate the traffic and identity expressions.
        :param pulumi.Input[str] identity: The wirefilter expression to be used for identity matching.
        :param pulumi.Input[str] name: The name of the teams rule.
        :param pulumi.Input[int] precedence: The evaluation precedence of the teams rule.
        :param pulumi.Input[pulumi.InputType['TeamsRuleRuleSettingsArgs']] rule_settings: Additional rule settings.
        :param pulumi.Input[str] traffic: The wirefilter expression to be used for traffic matching.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: TeamsRuleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Cloudflare Teams rule resource. Teams rules comprise secure web gateway policies.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.TeamsRule("example",
            account_id="f037e56e89293a057740de681ac9abbe",
            action="block",
            description="desc",
            filters=["http"],
            name="office",
            precedence=1,
            rule_settings=cloudflare.TeamsRuleRuleSettingsArgs(
                block_page_enabled=True,
                block_page_reason="access not permitted",
            ),
            traffic="http.request.uri == \\"https://www.example.com/malicious\\"")
        ```

        ## Import

        ```sh
         $ pulumi import cloudflare:index/teamsRule:TeamsRule example <account_id>/<teams_rule_id>
        ```

        :param str resource_name: The name of the resource.
        :param TeamsRuleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(TeamsRuleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            TeamsRuleArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 action: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 device_posture: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 filters: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 identity: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 precedence: Optional[pulumi.Input[int]] = None,
                 rule_settings: Optional[pulumi.Input[pulumi.InputType['TeamsRuleRuleSettingsArgs']]] = None,
                 traffic: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = TeamsRuleArgs.__new__(TeamsRuleArgs)

            if account_id is None and not opts.urn:
                raise TypeError("Missing required property 'account_id'")
            __props__.__dict__["account_id"] = account_id
            if action is None and not opts.urn:
                raise TypeError("Missing required property 'action'")
            __props__.__dict__["action"] = action
            if description is None and not opts.urn:
                raise TypeError("Missing required property 'description'")
            __props__.__dict__["description"] = description
            __props__.__dict__["device_posture"] = device_posture
            __props__.__dict__["enabled"] = enabled
            __props__.__dict__["filters"] = filters
            __props__.__dict__["identity"] = identity
            if name is None and not opts.urn:
                raise TypeError("Missing required property 'name'")
            __props__.__dict__["name"] = name
            if precedence is None and not opts.urn:
                raise TypeError("Missing required property 'precedence'")
            __props__.__dict__["precedence"] = precedence
            if rule_settings is not None and not isinstance(rule_settings, TeamsRuleRuleSettingsArgs):
                rule_settings = rule_settings or {}
                def _setter(key, value):
                    rule_settings[key] = value
                TeamsRuleRuleSettingsArgs._configure(_setter, **rule_settings)
            __props__.__dict__["rule_settings"] = rule_settings
            __props__.__dict__["traffic"] = traffic
            __props__.__dict__["version"] = None
        super(TeamsRule, __self__).__init__(
            'cloudflare:index/teamsRule:TeamsRule',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[str]] = None,
            action: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            device_posture: Optional[pulumi.Input[str]] = None,
            enabled: Optional[pulumi.Input[bool]] = None,
            filters: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            identity: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            precedence: Optional[pulumi.Input[int]] = None,
            rule_settings: Optional[pulumi.Input[pulumi.InputType['TeamsRuleRuleSettingsArgs']]] = None,
            traffic: Optional[pulumi.Input[str]] = None,
            version: Optional[pulumi.Input[int]] = None) -> 'TeamsRule':
        """
        Get an existing TeamsRule resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[str] action: Action to be taken when the SSL certificate of upstream is invalid. Available values: `pass_through`, `block`, `error`.
        :param pulumi.Input[str] description: The description of the teams rule.
        :param pulumi.Input[str] device_posture: The wirefilter expression to be used for device_posture check matching.
        :param pulumi.Input[bool] enabled: Enable or disable DLP Payload Logging for this rule.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] filters: The protocol or layer to evaluate the traffic and identity expressions.
        :param pulumi.Input[str] identity: The wirefilter expression to be used for identity matching.
        :param pulumi.Input[str] name: The name of the teams rule.
        :param pulumi.Input[int] precedence: The evaluation precedence of the teams rule.
        :param pulumi.Input[pulumi.InputType['TeamsRuleRuleSettingsArgs']] rule_settings: Additional rule settings.
        :param pulumi.Input[str] traffic: The wirefilter expression to be used for traffic matching.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _TeamsRuleState.__new__(_TeamsRuleState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["action"] = action
        __props__.__dict__["description"] = description
        __props__.__dict__["device_posture"] = device_posture
        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["filters"] = filters
        __props__.__dict__["identity"] = identity
        __props__.__dict__["name"] = name
        __props__.__dict__["precedence"] = precedence
        __props__.__dict__["rule_settings"] = rule_settings
        __props__.__dict__["traffic"] = traffic
        __props__.__dict__["version"] = version
        return TeamsRule(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[str]:
        """
        The account identifier to target for the resource.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter
    def action(self) -> pulumi.Output[str]:
        """
        Action to be taken when the SSL certificate of upstream is invalid. Available values: `pass_through`, `block`, `error`.
        """
        return pulumi.get(self, "action")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[str]:
        """
        The description of the teams rule.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="devicePosture")
    def device_posture(self) -> pulumi.Output[Optional[str]]:
        """
        The wirefilter expression to be used for device_posture check matching.
        """
        return pulumi.get(self, "device_posture")

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[Optional[bool]]:
        """
        Enable or disable DLP Payload Logging for this rule.
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter
    def filters(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        The protocol or layer to evaluate the traffic and identity expressions.
        """
        return pulumi.get(self, "filters")

    @property
    @pulumi.getter
    def identity(self) -> pulumi.Output[Optional[str]]:
        """
        The wirefilter expression to be used for identity matching.
        """
        return pulumi.get(self, "identity")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the teams rule.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def precedence(self) -> pulumi.Output[int]:
        """
        The evaluation precedence of the teams rule.
        """
        return pulumi.get(self, "precedence")

    @property
    @pulumi.getter(name="ruleSettings")
    def rule_settings(self) -> pulumi.Output[Optional['outputs.TeamsRuleRuleSettings']]:
        """
        Additional rule settings.
        """
        return pulumi.get(self, "rule_settings")

    @property
    @pulumi.getter
    def traffic(self) -> pulumi.Output[Optional[str]]:
        """
        The wirefilter expression to be used for traffic matching.
        """
        return pulumi.get(self, "traffic")

    @property
    @pulumi.getter
    def version(self) -> pulumi.Output[int]:
        return pulumi.get(self, "version")

