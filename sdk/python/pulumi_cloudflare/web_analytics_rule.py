# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['WebAnalyticsRuleArgs', 'WebAnalyticsRule']

@pulumi.input_type
class WebAnalyticsRuleArgs:
    def __init__(__self__, *,
                 account_id: pulumi.Input[str],
                 host: pulumi.Input[str],
                 inclusive: pulumi.Input[bool],
                 is_paused: pulumi.Input[bool],
                 paths: pulumi.Input[Sequence[pulumi.Input[str]]],
                 ruleset_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a WebAnalyticsRule resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] host: The host to apply the rule to.
        :param pulumi.Input[bool] inclusive: Whether the rule includes or excludes the matched traffic from being measured in Web Analytics.
        :param pulumi.Input[bool] is_paused: Whether the rule is paused or not.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] paths: A list of paths to apply the rule to.
        :param pulumi.Input[str] ruleset_id: The Web Analytics ruleset id. **Modifying this attribute will force creation of a new resource.**
        """
        pulumi.set(__self__, "account_id", account_id)
        pulumi.set(__self__, "host", host)
        pulumi.set(__self__, "inclusive", inclusive)
        pulumi.set(__self__, "is_paused", is_paused)
        pulumi.set(__self__, "paths", paths)
        pulumi.set(__self__, "ruleset_id", ruleset_id)

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
    def host(self) -> pulumi.Input[str]:
        """
        The host to apply the rule to.
        """
        return pulumi.get(self, "host")

    @host.setter
    def host(self, value: pulumi.Input[str]):
        pulumi.set(self, "host", value)

    @property
    @pulumi.getter
    def inclusive(self) -> pulumi.Input[bool]:
        """
        Whether the rule includes or excludes the matched traffic from being measured in Web Analytics.
        """
        return pulumi.get(self, "inclusive")

    @inclusive.setter
    def inclusive(self, value: pulumi.Input[bool]):
        pulumi.set(self, "inclusive", value)

    @property
    @pulumi.getter(name="isPaused")
    def is_paused(self) -> pulumi.Input[bool]:
        """
        Whether the rule is paused or not.
        """
        return pulumi.get(self, "is_paused")

    @is_paused.setter
    def is_paused(self, value: pulumi.Input[bool]):
        pulumi.set(self, "is_paused", value)

    @property
    @pulumi.getter
    def paths(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        A list of paths to apply the rule to.
        """
        return pulumi.get(self, "paths")

    @paths.setter
    def paths(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "paths", value)

    @property
    @pulumi.getter(name="rulesetId")
    def ruleset_id(self) -> pulumi.Input[str]:
        """
        The Web Analytics ruleset id. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "ruleset_id")

    @ruleset_id.setter
    def ruleset_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "ruleset_id", value)


@pulumi.input_type
class _WebAnalyticsRuleState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[str]] = None,
                 host: Optional[pulumi.Input[str]] = None,
                 inclusive: Optional[pulumi.Input[bool]] = None,
                 is_paused: Optional[pulumi.Input[bool]] = None,
                 paths: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 ruleset_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering WebAnalyticsRule resources.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] host: The host to apply the rule to.
        :param pulumi.Input[bool] inclusive: Whether the rule includes or excludes the matched traffic from being measured in Web Analytics.
        :param pulumi.Input[bool] is_paused: Whether the rule is paused or not.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] paths: A list of paths to apply the rule to.
        :param pulumi.Input[str] ruleset_id: The Web Analytics ruleset id. **Modifying this attribute will force creation of a new resource.**
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if host is not None:
            pulumi.set(__self__, "host", host)
        if inclusive is not None:
            pulumi.set(__self__, "inclusive", inclusive)
        if is_paused is not None:
            pulumi.set(__self__, "is_paused", is_paused)
        if paths is not None:
            pulumi.set(__self__, "paths", paths)
        if ruleset_id is not None:
            pulumi.set(__self__, "ruleset_id", ruleset_id)

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
    def host(self) -> Optional[pulumi.Input[str]]:
        """
        The host to apply the rule to.
        """
        return pulumi.get(self, "host")

    @host.setter
    def host(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "host", value)

    @property
    @pulumi.getter
    def inclusive(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether the rule includes or excludes the matched traffic from being measured in Web Analytics.
        """
        return pulumi.get(self, "inclusive")

    @inclusive.setter
    def inclusive(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "inclusive", value)

    @property
    @pulumi.getter(name="isPaused")
    def is_paused(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether the rule is paused or not.
        """
        return pulumi.get(self, "is_paused")

    @is_paused.setter
    def is_paused(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "is_paused", value)

    @property
    @pulumi.getter
    def paths(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        A list of paths to apply the rule to.
        """
        return pulumi.get(self, "paths")

    @paths.setter
    def paths(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "paths", value)

    @property
    @pulumi.getter(name="rulesetId")
    def ruleset_id(self) -> Optional[pulumi.Input[str]]:
        """
        The Web Analytics ruleset id. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "ruleset_id")

    @ruleset_id.setter
    def ruleset_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ruleset_id", value)


class WebAnalyticsRule(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 host: Optional[pulumi.Input[str]] = None,
                 inclusive: Optional[pulumi.Input[bool]] = None,
                 is_paused: Optional[pulumi.Input[bool]] = None,
                 paths: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 ruleset_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Cloudflare Web Analytics Rule resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example_web_analytics_site = cloudflare.WebAnalyticsSite("exampleWebAnalyticsSite",
            account_id="f037e56e89293a057740de681ac9abbe",
            zone_tag="0da42c8d2132a9ddaf714f9e7c920711",
            auto_install=True)
        example_web_analytics_rule = cloudflare.WebAnalyticsRule("exampleWebAnalyticsRule",
            account_id="f037e56e89293a057740de681ac9abbe",
            ruleset_id=example_web_analytics_site.ruleset_id,
            host="*",
            paths=["/excluded"],
            inclusive=False,
            is_paused=False,
            opts=pulumi.ResourceOptions(depends_on=[example_web_analytics_site]))
        ```

        ## Import

        ```sh
         $ pulumi import cloudflare:index/webAnalyticsRule:WebAnalyticsRule example <account_id>/<ruleset_id>/<rule_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] host: The host to apply the rule to.
        :param pulumi.Input[bool] inclusive: Whether the rule includes or excludes the matched traffic from being measured in Web Analytics.
        :param pulumi.Input[bool] is_paused: Whether the rule is paused or not.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] paths: A list of paths to apply the rule to.
        :param pulumi.Input[str] ruleset_id: The Web Analytics ruleset id. **Modifying this attribute will force creation of a new resource.**
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: WebAnalyticsRuleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Cloudflare Web Analytics Rule resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example_web_analytics_site = cloudflare.WebAnalyticsSite("exampleWebAnalyticsSite",
            account_id="f037e56e89293a057740de681ac9abbe",
            zone_tag="0da42c8d2132a9ddaf714f9e7c920711",
            auto_install=True)
        example_web_analytics_rule = cloudflare.WebAnalyticsRule("exampleWebAnalyticsRule",
            account_id="f037e56e89293a057740de681ac9abbe",
            ruleset_id=example_web_analytics_site.ruleset_id,
            host="*",
            paths=["/excluded"],
            inclusive=False,
            is_paused=False,
            opts=pulumi.ResourceOptions(depends_on=[example_web_analytics_site]))
        ```

        ## Import

        ```sh
         $ pulumi import cloudflare:index/webAnalyticsRule:WebAnalyticsRule example <account_id>/<ruleset_id>/<rule_id>
        ```

        :param str resource_name: The name of the resource.
        :param WebAnalyticsRuleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(WebAnalyticsRuleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 host: Optional[pulumi.Input[str]] = None,
                 inclusive: Optional[pulumi.Input[bool]] = None,
                 is_paused: Optional[pulumi.Input[bool]] = None,
                 paths: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 ruleset_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = WebAnalyticsRuleArgs.__new__(WebAnalyticsRuleArgs)

            if account_id is None and not opts.urn:
                raise TypeError("Missing required property 'account_id'")
            __props__.__dict__["account_id"] = account_id
            if host is None and not opts.urn:
                raise TypeError("Missing required property 'host'")
            __props__.__dict__["host"] = host
            if inclusive is None and not opts.urn:
                raise TypeError("Missing required property 'inclusive'")
            __props__.__dict__["inclusive"] = inclusive
            if is_paused is None and not opts.urn:
                raise TypeError("Missing required property 'is_paused'")
            __props__.__dict__["is_paused"] = is_paused
            if paths is None and not opts.urn:
                raise TypeError("Missing required property 'paths'")
            __props__.__dict__["paths"] = paths
            if ruleset_id is None and not opts.urn:
                raise TypeError("Missing required property 'ruleset_id'")
            __props__.__dict__["ruleset_id"] = ruleset_id
        super(WebAnalyticsRule, __self__).__init__(
            'cloudflare:index/webAnalyticsRule:WebAnalyticsRule',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[str]] = None,
            host: Optional[pulumi.Input[str]] = None,
            inclusive: Optional[pulumi.Input[bool]] = None,
            is_paused: Optional[pulumi.Input[bool]] = None,
            paths: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            ruleset_id: Optional[pulumi.Input[str]] = None) -> 'WebAnalyticsRule':
        """
        Get an existing WebAnalyticsRule resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] host: The host to apply the rule to.
        :param pulumi.Input[bool] inclusive: Whether the rule includes or excludes the matched traffic from being measured in Web Analytics.
        :param pulumi.Input[bool] is_paused: Whether the rule is paused or not.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] paths: A list of paths to apply the rule to.
        :param pulumi.Input[str] ruleset_id: The Web Analytics ruleset id. **Modifying this attribute will force creation of a new resource.**
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _WebAnalyticsRuleState.__new__(_WebAnalyticsRuleState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["host"] = host
        __props__.__dict__["inclusive"] = inclusive
        __props__.__dict__["is_paused"] = is_paused
        __props__.__dict__["paths"] = paths
        __props__.__dict__["ruleset_id"] = ruleset_id
        return WebAnalyticsRule(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[str]:
        """
        The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter
    def host(self) -> pulumi.Output[str]:
        """
        The host to apply the rule to.
        """
        return pulumi.get(self, "host")

    @property
    @pulumi.getter
    def inclusive(self) -> pulumi.Output[bool]:
        """
        Whether the rule includes or excludes the matched traffic from being measured in Web Analytics.
        """
        return pulumi.get(self, "inclusive")

    @property
    @pulumi.getter(name="isPaused")
    def is_paused(self) -> pulumi.Output[bool]:
        """
        Whether the rule is paused or not.
        """
        return pulumi.get(self, "is_paused")

    @property
    @pulumi.getter
    def paths(self) -> pulumi.Output[Sequence[str]]:
        """
        A list of paths to apply the rule to.
        """
        return pulumi.get(self, "paths")

    @property
    @pulumi.getter(name="rulesetId")
    def ruleset_id(self) -> pulumi.Output[str]:
        """
        The Web Analytics ruleset id. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "ruleset_id")
