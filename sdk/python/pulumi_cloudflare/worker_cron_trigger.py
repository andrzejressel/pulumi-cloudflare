# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['WorkerCronTriggerArgs', 'WorkerCronTrigger']

@pulumi.input_type
class WorkerCronTriggerArgs:
    def __init__(__self__, *,
                 account_id: pulumi.Input[str],
                 schedules: pulumi.Input[Sequence[pulumi.Input[str]]],
                 script_name: pulumi.Input[str]):
        """
        The set of arguments for constructing a WorkerCronTrigger resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] schedules: List of cron expressions to execute the Worker Script
        :param pulumi.Input[str] script_name: Worker script to target for the schedules
        """
        pulumi.set(__self__, "account_id", account_id)
        pulumi.set(__self__, "schedules", schedules)
        pulumi.set(__self__, "script_name", script_name)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Input[str]:
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter
    def schedules(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        List of cron expressions to execute the Worker Script
        """
        return pulumi.get(self, "schedules")

    @schedules.setter
    def schedules(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "schedules", value)

    @property
    @pulumi.getter(name="scriptName")
    def script_name(self) -> pulumi.Input[str]:
        """
        Worker script to target for the schedules
        """
        return pulumi.get(self, "script_name")

    @script_name.setter
    def script_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "script_name", value)


@pulumi.input_type
class _WorkerCronTriggerState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[str]] = None,
                 schedules: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 script_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering WorkerCronTrigger resources.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] schedules: List of cron expressions to execute the Worker Script
        :param pulumi.Input[str] script_name: Worker script to target for the schedules
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
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter
    def schedules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        List of cron expressions to execute the Worker Script
        """
        return pulumi.get(self, "schedules")

    @schedules.setter
    def schedules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "schedules", value)

    @property
    @pulumi.getter(name="scriptName")
    def script_name(self) -> Optional[pulumi.Input[str]]:
        """
        Worker script to target for the schedules
        """
        return pulumi.get(self, "script_name")

    @script_name.setter
    def script_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "script_name", value)


class WorkerCronTrigger(pulumi.CustomResource):
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

        example_script = cloudflare.WorkerScript("exampleScript",
            name="example-script",
            content=(lambda path: open(path).read())("path/to/my.js"))
        example_trigger = cloudflare.WorkerCronTrigger("exampleTrigger",
            script_name=example_script.name,
            schedules=[
                "*/5 * * * *",
                "10 7 * * mon-fri",
            ])
        ```

        ## Import

        Worker Cron Triggers can be imported using the script name of the Worker they are targeting.

        ```sh
         $ pulumi import cloudflare:index/workerCronTrigger:WorkerCronTrigger example my-script
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] schedules: List of cron expressions to execute the Worker Script
        :param pulumi.Input[str] script_name: Worker script to target for the schedules
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: WorkerCronTriggerArgs,
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

        example_script = cloudflare.WorkerScript("exampleScript",
            name="example-script",
            content=(lambda path: open(path).read())("path/to/my.js"))
        example_trigger = cloudflare.WorkerCronTrigger("exampleTrigger",
            script_name=example_script.name,
            schedules=[
                "*/5 * * * *",
                "10 7 * * mon-fri",
            ])
        ```

        ## Import

        Worker Cron Triggers can be imported using the script name of the Worker they are targeting.

        ```sh
         $ pulumi import cloudflare:index/workerCronTrigger:WorkerCronTrigger example my-script
        ```

        :param str resource_name: The name of the resource.
        :param WorkerCronTriggerArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(WorkerCronTriggerArgs, pulumi.ResourceOptions, *args, **kwargs)
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
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = WorkerCronTriggerArgs.__new__(WorkerCronTriggerArgs)

            if account_id is None and not opts.urn:
                raise TypeError("Missing required property 'account_id'")
            __props__.__dict__["account_id"] = account_id
            if schedules is None and not opts.urn:
                raise TypeError("Missing required property 'schedules'")
            __props__.__dict__["schedules"] = schedules
            if script_name is None and not opts.urn:
                raise TypeError("Missing required property 'script_name'")
            __props__.__dict__["script_name"] = script_name
        super(WorkerCronTrigger, __self__).__init__(
            'cloudflare:index/workerCronTrigger:WorkerCronTrigger',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[str]] = None,
            schedules: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            script_name: Optional[pulumi.Input[str]] = None) -> 'WorkerCronTrigger':
        """
        Get an existing WorkerCronTrigger resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] schedules: List of cron expressions to execute the Worker Script
        :param pulumi.Input[str] script_name: Worker script to target for the schedules
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _WorkerCronTriggerState.__new__(_WorkerCronTriggerState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["schedules"] = schedules
        __props__.__dict__["script_name"] = script_name
        return WorkerCronTrigger(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter
    def schedules(self) -> pulumi.Output[Sequence[str]]:
        """
        List of cron expressions to execute the Worker Script
        """
        return pulumi.get(self, "schedules")

    @property
    @pulumi.getter(name="scriptName")
    def script_name(self) -> pulumi.Output[str]:
        """
        Worker script to target for the schedules
        """
        return pulumi.get(self, "script_name")

