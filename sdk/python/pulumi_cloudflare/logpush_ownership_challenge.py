# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['LogpushOwnershipChallengeArgs', 'LogpushOwnershipChallenge']

@pulumi.input_type
class LogpushOwnershipChallengeArgs:
    def __init__(__self__, *,
                 destination_conf: pulumi.Input[str],
                 account_id: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a LogpushOwnershipChallenge resource.
        :param pulumi.Input[str] destination_conf: Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included. See [Logpush destination documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#destination). **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] account_id: The account identifier to target for the resource. Must provide only one of `account_id`, `zone_id`.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. Must provide only one of `account_id`, `zone_id`.
        """
        pulumi.set(__self__, "destination_conf", destination_conf)
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if zone_id is not None:
            pulumi.set(__self__, "zone_id", zone_id)

    @property
    @pulumi.getter(name="destinationConf")
    def destination_conf(self) -> pulumi.Input[str]:
        """
        Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included. See [Logpush destination documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#destination). **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "destination_conf")

    @destination_conf.setter
    def destination_conf(self, value: pulumi.Input[str]):
        pulumi.set(self, "destination_conf", value)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[str]]:
        """
        The account identifier to target for the resource. Must provide only one of `account_id`, `zone_id`.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> Optional[pulumi.Input[str]]:
        """
        The zone identifier to target for the resource. Must provide only one of `account_id`, `zone_id`.
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "zone_id", value)


@pulumi.input_type
class _LogpushOwnershipChallengeState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[str]] = None,
                 destination_conf: Optional[pulumi.Input[str]] = None,
                 ownership_challenge_filename: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering LogpushOwnershipChallenge resources.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource. Must provide only one of `account_id`, `zone_id`.
        :param pulumi.Input[str] destination_conf: Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included. See [Logpush destination documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#destination). **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] ownership_challenge_filename: The filename of the ownership challenge which	contains the contents required for Logpush Job creation.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. Must provide only one of `account_id`, `zone_id`.
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if destination_conf is not None:
            pulumi.set(__self__, "destination_conf", destination_conf)
        if ownership_challenge_filename is not None:
            pulumi.set(__self__, "ownership_challenge_filename", ownership_challenge_filename)
        if zone_id is not None:
            pulumi.set(__self__, "zone_id", zone_id)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[str]]:
        """
        The account identifier to target for the resource. Must provide only one of `account_id`, `zone_id`.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter(name="destinationConf")
    def destination_conf(self) -> Optional[pulumi.Input[str]]:
        """
        Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included. See [Logpush destination documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#destination). **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "destination_conf")

    @destination_conf.setter
    def destination_conf(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "destination_conf", value)

    @property
    @pulumi.getter(name="ownershipChallengeFilename")
    def ownership_challenge_filename(self) -> Optional[pulumi.Input[str]]:
        """
        The filename of the ownership challenge which	contains the contents required for Logpush Job creation.
        """
        return pulumi.get(self, "ownership_challenge_filename")

    @ownership_challenge_filename.setter
    def ownership_challenge_filename(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ownership_challenge_filename", value)

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> Optional[pulumi.Input[str]]:
        """
        The zone identifier to target for the resource. Must provide only one of `account_id`, `zone_id`.
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "zone_id", value)


class LogpushOwnershipChallenge(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 destination_conf: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a resource which manages Cloudflare Logpush ownership
        challenges to use in a Logpush Job. On it's own, doesn't do much
        however this resource should be used in conjunction to create
        Logpush jobs.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.LogpushOwnershipChallenge("example",
            zone_id="0da42c8d2132a9ddaf714f9e7c920711",
            destination_conf="s3://my-bucket-path?region=us-west-2")
        ```
        <!--End PulumiCodeChooser -->

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource. Must provide only one of `account_id`, `zone_id`.
        :param pulumi.Input[str] destination_conf: Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included. See [Logpush destination documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#destination). **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. Must provide only one of `account_id`, `zone_id`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: LogpushOwnershipChallengeArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a resource which manages Cloudflare Logpush ownership
        challenges to use in a Logpush Job. On it's own, doesn't do much
        however this resource should be used in conjunction to create
        Logpush jobs.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.LogpushOwnershipChallenge("example",
            zone_id="0da42c8d2132a9ddaf714f9e7c920711",
            destination_conf="s3://my-bucket-path?region=us-west-2")
        ```
        <!--End PulumiCodeChooser -->

        :param str resource_name: The name of the resource.
        :param LogpushOwnershipChallengeArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(LogpushOwnershipChallengeArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 destination_conf: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = LogpushOwnershipChallengeArgs.__new__(LogpushOwnershipChallengeArgs)

            __props__.__dict__["account_id"] = account_id
            if destination_conf is None and not opts.urn:
                raise TypeError("Missing required property 'destination_conf'")
            __props__.__dict__["destination_conf"] = destination_conf
            __props__.__dict__["zone_id"] = zone_id
            __props__.__dict__["ownership_challenge_filename"] = None
        super(LogpushOwnershipChallenge, __self__).__init__(
            'cloudflare:index/logpushOwnershipChallenge:LogpushOwnershipChallenge',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[str]] = None,
            destination_conf: Optional[pulumi.Input[str]] = None,
            ownership_challenge_filename: Optional[pulumi.Input[str]] = None,
            zone_id: Optional[pulumi.Input[str]] = None) -> 'LogpushOwnershipChallenge':
        """
        Get an existing LogpushOwnershipChallenge resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource. Must provide only one of `account_id`, `zone_id`.
        :param pulumi.Input[str] destination_conf: Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included. See [Logpush destination documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#destination). **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] ownership_challenge_filename: The filename of the ownership challenge which	contains the contents required for Logpush Job creation.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. Must provide only one of `account_id`, `zone_id`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _LogpushOwnershipChallengeState.__new__(_LogpushOwnershipChallengeState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["destination_conf"] = destination_conf
        __props__.__dict__["ownership_challenge_filename"] = ownership_challenge_filename
        __props__.__dict__["zone_id"] = zone_id
        return LogpushOwnershipChallenge(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[Optional[str]]:
        """
        The account identifier to target for the resource. Must provide only one of `account_id`, `zone_id`.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter(name="destinationConf")
    def destination_conf(self) -> pulumi.Output[str]:
        """
        Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included. See [Logpush destination documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#destination). **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "destination_conf")

    @property
    @pulumi.getter(name="ownershipChallengeFilename")
    def ownership_challenge_filename(self) -> pulumi.Output[str]:
        """
        The filename of the ownership challenge which	contains the contents required for Logpush Job creation.
        """
        return pulumi.get(self, "ownership_challenge_filename")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Output[Optional[str]]:
        """
        The zone identifier to target for the resource. Must provide only one of `account_id`, `zone_id`.
        """
        return pulumi.get(self, "zone_id")

