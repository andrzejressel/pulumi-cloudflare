# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['DevicePostureRuleArgs', 'DevicePostureRule']

@pulumi.input_type
class DevicePostureRuleArgs:
    def __init__(__self__, *,
                 account_id: pulumi.Input[str],
                 inputs: pulumi.Input[Sequence[pulumi.Input['DevicePostureRuleInputArgs']]],
                 type: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None,
                 matches: Optional[pulumi.Input[Sequence[pulumi.Input['DevicePostureRuleMatchArgs']]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 schedule: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a DevicePostureRule resource.
        :param pulumi.Input[str] account_id: The account to which the device posture rule should be added.
        :param pulumi.Input[Sequence[pulumi.Input['DevicePostureRuleInputArgs']]] inputs: The value to be checked against. See below for reference
               structure.
        :param pulumi.Input[str] type: The device posture rule type. Valid values are `file`, `application`, and `serial_number`.
        :param pulumi.Input[str] description: The description of the device posture rule.
        :param pulumi.Input[Sequence[pulumi.Input['DevicePostureRuleMatchArgs']]] matches: The conditions that the client must match to run the rule. See below for reference structure.
        :param pulumi.Input[str] name: Name of the device posture rule.
        :param pulumi.Input[str] schedule: Tells the client when to run the device posture check.
               Must be in the format `"1h"` or `"30m"`. Valid units are `h` and `m`.
        """
        pulumi.set(__self__, "account_id", account_id)
        pulumi.set(__self__, "inputs", inputs)
        pulumi.set(__self__, "type", type)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if matches is not None:
            pulumi.set(__self__, "matches", matches)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if schedule is not None:
            pulumi.set(__self__, "schedule", schedule)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Input[str]:
        """
        The account to which the device posture rule should be added.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter
    def inputs(self) -> pulumi.Input[Sequence[pulumi.Input['DevicePostureRuleInputArgs']]]:
        """
        The value to be checked against. See below for reference
        structure.
        """
        return pulumi.get(self, "inputs")

    @inputs.setter
    def inputs(self, value: pulumi.Input[Sequence[pulumi.Input['DevicePostureRuleInputArgs']]]):
        pulumi.set(self, "inputs", value)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        The device posture rule type. Valid values are `file`, `application`, and `serial_number`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the device posture rule.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def matches(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['DevicePostureRuleMatchArgs']]]]:
        """
        The conditions that the client must match to run the rule. See below for reference structure.
        """
        return pulumi.get(self, "matches")

    @matches.setter
    def matches(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['DevicePostureRuleMatchArgs']]]]):
        pulumi.set(self, "matches", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the device posture rule.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def schedule(self) -> Optional[pulumi.Input[str]]:
        """
        Tells the client when to run the device posture check.
        Must be in the format `"1h"` or `"30m"`. Valid units are `h` and `m`.
        """
        return pulumi.get(self, "schedule")

    @schedule.setter
    def schedule(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "schedule", value)


@pulumi.input_type
class _DevicePostureRuleState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 inputs: Optional[pulumi.Input[Sequence[pulumi.Input['DevicePostureRuleInputArgs']]]] = None,
                 matches: Optional[pulumi.Input[Sequence[pulumi.Input['DevicePostureRuleMatchArgs']]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 schedule: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering DevicePostureRule resources.
        :param pulumi.Input[str] account_id: The account to which the device posture rule should be added.
        :param pulumi.Input[str] description: The description of the device posture rule.
        :param pulumi.Input[Sequence[pulumi.Input['DevicePostureRuleInputArgs']]] inputs: The value to be checked against. See below for reference
               structure.
        :param pulumi.Input[Sequence[pulumi.Input['DevicePostureRuleMatchArgs']]] matches: The conditions that the client must match to run the rule. See below for reference structure.
        :param pulumi.Input[str] name: Name of the device posture rule.
        :param pulumi.Input[str] schedule: Tells the client when to run the device posture check.
               Must be in the format `"1h"` or `"30m"`. Valid units are `h` and `m`.
        :param pulumi.Input[str] type: The device posture rule type. Valid values are `file`, `application`, and `serial_number`.
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if inputs is not None:
            pulumi.set(__self__, "inputs", inputs)
        if matches is not None:
            pulumi.set(__self__, "matches", matches)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if schedule is not None:
            pulumi.set(__self__, "schedule", schedule)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[str]]:
        """
        The account to which the device posture rule should be added.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the device posture rule.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def inputs(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['DevicePostureRuleInputArgs']]]]:
        """
        The value to be checked against. See below for reference
        structure.
        """
        return pulumi.get(self, "inputs")

    @inputs.setter
    def inputs(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['DevicePostureRuleInputArgs']]]]):
        pulumi.set(self, "inputs", value)

    @property
    @pulumi.getter
    def matches(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['DevicePostureRuleMatchArgs']]]]:
        """
        The conditions that the client must match to run the rule. See below for reference structure.
        """
        return pulumi.get(self, "matches")

    @matches.setter
    def matches(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['DevicePostureRuleMatchArgs']]]]):
        pulumi.set(self, "matches", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the device posture rule.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def schedule(self) -> Optional[pulumi.Input[str]]:
        """
        Tells the client when to run the device posture check.
        Must be in the format `"1h"` or `"30m"`. Valid units are `h` and `m`.
        """
        return pulumi.get(self, "schedule")

    @schedule.setter
    def schedule(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "schedule", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        The device posture rule type. Valid values are `file`, `application`, and `serial_number`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


class DevicePostureRule(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 inputs: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DevicePostureRuleInputArgs']]]]] = None,
                 matches: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DevicePostureRuleMatchArgs']]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 schedule: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Cloudflare Device Posture Rule resource. Device posture rules configure security policies for device posture checks.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        corporate_devices_posture_rule = cloudflare.DevicePostureRule("corporateDevicesPostureRule",
            account_id="1d5fdc9e88c8a8c4518b068cd94331fe",
            name="Corporate devices posture rule",
            type="serial_number",
            description="Device posture rule for corporate devices.",
            schedule="24h",
            matches=[cloudflare.DevicePostureRuleMatchArgs(
                platform="mac",
            )],
            inputs=[cloudflare.DevicePostureRuleInputArgs(
                id=cloudflare_teams_list["corporate_devices"]["id"],
            )])
        ```

        ## Import

        Device posture rules can be imported using a composite ID formed of account ID and device posture rule ID.

        ```sh
         $ pulumi import cloudflare:index/devicePostureRule:DevicePostureRule corporate_devices cb029e245cfdd66dc8d2e570d5dd3322/d41d8cd98f00b204e9800998ecf8427e
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account to which the device posture rule should be added.
        :param pulumi.Input[str] description: The description of the device posture rule.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DevicePostureRuleInputArgs']]]] inputs: The value to be checked against. See below for reference
               structure.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DevicePostureRuleMatchArgs']]]] matches: The conditions that the client must match to run the rule. See below for reference structure.
        :param pulumi.Input[str] name: Name of the device posture rule.
        :param pulumi.Input[str] schedule: Tells the client when to run the device posture check.
               Must be in the format `"1h"` or `"30m"`. Valid units are `h` and `m`.
        :param pulumi.Input[str] type: The device posture rule type. Valid values are `file`, `application`, and `serial_number`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DevicePostureRuleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Cloudflare Device Posture Rule resource. Device posture rules configure security policies for device posture checks.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        corporate_devices_posture_rule = cloudflare.DevicePostureRule("corporateDevicesPostureRule",
            account_id="1d5fdc9e88c8a8c4518b068cd94331fe",
            name="Corporate devices posture rule",
            type="serial_number",
            description="Device posture rule for corporate devices.",
            schedule="24h",
            matches=[cloudflare.DevicePostureRuleMatchArgs(
                platform="mac",
            )],
            inputs=[cloudflare.DevicePostureRuleInputArgs(
                id=cloudflare_teams_list["corporate_devices"]["id"],
            )])
        ```

        ## Import

        Device posture rules can be imported using a composite ID formed of account ID and device posture rule ID.

        ```sh
         $ pulumi import cloudflare:index/devicePostureRule:DevicePostureRule corporate_devices cb029e245cfdd66dc8d2e570d5dd3322/d41d8cd98f00b204e9800998ecf8427e
        ```

        :param str resource_name: The name of the resource.
        :param DevicePostureRuleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DevicePostureRuleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 inputs: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DevicePostureRuleInputArgs']]]]] = None,
                 matches: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DevicePostureRuleMatchArgs']]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 schedule: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DevicePostureRuleArgs.__new__(DevicePostureRuleArgs)

            if account_id is None and not opts.urn:
                raise TypeError("Missing required property 'account_id'")
            __props__.__dict__["account_id"] = account_id
            __props__.__dict__["description"] = description
            if inputs is None and not opts.urn:
                raise TypeError("Missing required property 'inputs'")
            __props__.__dict__["inputs"] = inputs
            __props__.__dict__["matches"] = matches
            __props__.__dict__["name"] = name
            __props__.__dict__["schedule"] = schedule
            if type is None and not opts.urn:
                raise TypeError("Missing required property 'type'")
            __props__.__dict__["type"] = type
        super(DevicePostureRule, __self__).__init__(
            'cloudflare:index/devicePostureRule:DevicePostureRule',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            inputs: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DevicePostureRuleInputArgs']]]]] = None,
            matches: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DevicePostureRuleMatchArgs']]]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            schedule: Optional[pulumi.Input[str]] = None,
            type: Optional[pulumi.Input[str]] = None) -> 'DevicePostureRule':
        """
        Get an existing DevicePostureRule resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account to which the device posture rule should be added.
        :param pulumi.Input[str] description: The description of the device posture rule.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DevicePostureRuleInputArgs']]]] inputs: The value to be checked against. See below for reference
               structure.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DevicePostureRuleMatchArgs']]]] matches: The conditions that the client must match to run the rule. See below for reference structure.
        :param pulumi.Input[str] name: Name of the device posture rule.
        :param pulumi.Input[str] schedule: Tells the client when to run the device posture check.
               Must be in the format `"1h"` or `"30m"`. Valid units are `h` and `m`.
        :param pulumi.Input[str] type: The device posture rule type. Valid values are `file`, `application`, and `serial_number`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DevicePostureRuleState.__new__(_DevicePostureRuleState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["description"] = description
        __props__.__dict__["inputs"] = inputs
        __props__.__dict__["matches"] = matches
        __props__.__dict__["name"] = name
        __props__.__dict__["schedule"] = schedule
        __props__.__dict__["type"] = type
        return DevicePostureRule(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[str]:
        """
        The account to which the device posture rule should be added.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        The description of the device posture rule.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def inputs(self) -> pulumi.Output[Sequence['outputs.DevicePostureRuleInput']]:
        """
        The value to be checked against. See below for reference
        structure.
        """
        return pulumi.get(self, "inputs")

    @property
    @pulumi.getter
    def matches(self) -> pulumi.Output[Optional[Sequence['outputs.DevicePostureRuleMatch']]]:
        """
        The conditions that the client must match to run the rule. See below for reference structure.
        """
        return pulumi.get(self, "matches")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[Optional[str]]:
        """
        Name of the device posture rule.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def schedule(self) -> pulumi.Output[Optional[str]]:
        """
        Tells the client when to run the device posture check.
        Must be in the format `"1h"` or `"30m"`. Valid units are `h` and `m`.
        """
        return pulumi.get(self, "schedule")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        The device posture rule type. Valid values are `file`, `application`, and `serial_number`.
        """
        return pulumi.get(self, "type")
