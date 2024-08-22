# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['WorkersCronTriggerArgs', 'WorkersCronTrigger']

@pulumi.input_type
class WorkersCronTriggerArgs:
    def __init__(__self__, *,
                 account_id: pulumi.Input[str],
                 schedules: pulumi.Input[Sequence[pulumi.Input[str]]],
                 script_name: pulumi.Input[str]):
        """
        The set of arguments for constructing a WorkersCronTrigger resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] schedules: Cron expressions to execute the Worker script.
        :param pulumi.Input[str] script_name: Worker script to target for the schedules.
        """
        pulumi.set(__self__, "account_id", account_id)
        pulumi.set(__self__, "schedules", schedules)
        pulumi.set(__self__, "script_name", script_name)

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
    def schedules(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        Cron expressions to execute the Worker script.
        """
        return pulumi.get(self, "schedules")

    @schedules.setter
    def schedules(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "schedules", value)

    @property
    @pulumi.getter(name="scriptName")
    def script_name(self) -> pulumi.Input[str]:
        """
        Worker script to target for the schedules.
        """
        return pulumi.get(self, "script_name")

    @script_name.setter
    def script_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "script_name", value)


@pulumi.input_type
class _WorkersCronTriggerState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[str]] = None,
                 schedules: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 script_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering WorkersCronTrigger resources.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] schedules: Cron expressions to execute the Worker script.
        :param pulumi.Input[str] script_name: Worker script to target for the schedules.
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if schedules is not None:
            pulumi.set(__self__, "schedules", schedules)
        if script_name is not None:
            pulumi.set(__self__, "script_name", script_name)

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
    def schedules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Cron expressions to execute the Worker script.
        """
        return pulumi.get(self, "schedules")

    @schedules.setter
    def schedules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "schedules", value)

    @property
    @pulumi.getter(name="scriptName")
    def script_name(self) -> Optional[pulumi.Input[str]]:
        """
        Worker script to target for the schedules.
        """
        return pulumi.get(self, "script_name")

    @script_name.setter
    def script_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "script_name", value)


class WorkersCronTrigger(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 schedules: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 script_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Worker Cron Triggers allow users to map a cron expression to a Worker script
        using a `ScheduledEvent` listener that enables Workers to be executed on a
        schedule. Worker Cron Triggers are ideal for running periodic jobs for
        maintenance or calling third-party APIs to collect up-to-date data.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare
        import pulumi_std as std

        example_script = cloudflare.WorkersScript("example_script",
            account_id="f037e56e89293a057740de681ac9abbe",
            name="example-script",
            content=std.file(input="path/to/my.js").result)
        example_trigger = cloudflare.WorkersCronTrigger("example_trigger",
            account_id="f037e56e89293a057740de681ac9abbe",
            script_name=example_script.name,
            schedules=[
                "*/5 * * * *",
                "10 7 * * mon-fri",
            ])
        ```

        ## Import

        ```sh
        $ pulumi import cloudflare:index/workersCronTrigger:WorkersCronTrigger example <account_id>/<script_name>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] schedules: Cron expressions to execute the Worker script.
        :param pulumi.Input[str] script_name: Worker script to target for the schedules.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: WorkersCronTriggerArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Worker Cron Triggers allow users to map a cron expression to a Worker script
        using a `ScheduledEvent` listener that enables Workers to be executed on a
        schedule. Worker Cron Triggers are ideal for running periodic jobs for
        maintenance or calling third-party APIs to collect up-to-date data.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare
        import pulumi_std as std

        example_script = cloudflare.WorkersScript("example_script",
            account_id="f037e56e89293a057740de681ac9abbe",
            name="example-script",
            content=std.file(input="path/to/my.js").result)
        example_trigger = cloudflare.WorkersCronTrigger("example_trigger",
            account_id="f037e56e89293a057740de681ac9abbe",
            script_name=example_script.name,
            schedules=[
                "*/5 * * * *",
                "10 7 * * mon-fri",
            ])
        ```

        ## Import

        ```sh
        $ pulumi import cloudflare:index/workersCronTrigger:WorkersCronTrigger example <account_id>/<script_name>
        ```

        :param str resource_name: The name of the resource.
        :param WorkersCronTriggerArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(WorkersCronTriggerArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 schedules: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 script_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = WorkersCronTriggerArgs.__new__(WorkersCronTriggerArgs)

            if account_id is None and not opts.urn:
                raise TypeError("Missing required property 'account_id'")
            __props__.__dict__["account_id"] = account_id
            if schedules is None and not opts.urn:
                raise TypeError("Missing required property 'schedules'")
            __props__.__dict__["schedules"] = schedules
            if script_name is None and not opts.urn:
                raise TypeError("Missing required property 'script_name'")
            __props__.__dict__["script_name"] = script_name
        super(WorkersCronTrigger, __self__).__init__(
            'cloudflare:index/workersCronTrigger:WorkersCronTrigger',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[str]] = None,
            schedules: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            script_name: Optional[pulumi.Input[str]] = None) -> 'WorkersCronTrigger':
        """
        Get an existing WorkersCronTrigger resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] schedules: Cron expressions to execute the Worker script.
        :param pulumi.Input[str] script_name: Worker script to target for the schedules.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _WorkersCronTriggerState.__new__(_WorkersCronTriggerState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["schedules"] = schedules
        __props__.__dict__["script_name"] = script_name
        return WorkersCronTrigger(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[str]:
        """
        The account identifier to target for the resource.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter
    def schedules(self) -> pulumi.Output[Sequence[str]]:
        """
        Cron expressions to execute the Worker script.
        """
        return pulumi.get(self, "schedules")

    @property
    @pulumi.getter(name="scriptName")
    def script_name(self) -> pulumi.Output[str]:
        """
        Worker script to target for the schedules.
        """
        return pulumi.get(self, "script_name")

