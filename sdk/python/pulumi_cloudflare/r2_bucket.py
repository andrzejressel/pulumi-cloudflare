# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['R2BucketArgs', 'R2Bucket']

@pulumi.input_type
class R2BucketArgs:
    def __init__(__self__, *,
                 account_id: pulumi.Input[str],
                 name: pulumi.Input[str],
                 location: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a R2Bucket resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[str] name: The name of the R2 bucket.
        :param pulumi.Input[str] location: The location hint of the R2 bucket.
        """
        pulumi.set(__self__, "account_id", account_id)
        pulumi.set(__self__, "name", name)
        if location is not None:
            pulumi.set(__self__, "location", location)

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
    def name(self) -> pulumi.Input[str]:
        """
        The name of the R2 bucket.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[str]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input[str]]:
        """
        The location hint of the R2 bucket.
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "location", value)


@pulumi.input_type
class _R2BucketState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[str]] = None,
                 location: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering R2Bucket resources.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[str] location: The location hint of the R2 bucket.
        :param pulumi.Input[str] name: The name of the R2 bucket.
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if name is not None:
            pulumi.set(__self__, "name", name)

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
    def location(self) -> Optional[pulumi.Input[str]]:
        """
        The location hint of the R2 bucket.
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "location", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the R2 bucket.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


class R2Bucket(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 location: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.R2Bucket("example",
            account_id="f037e56e89293a057740de681ac9abbe",
            name="terraform-bucket",
            location="enam")
        ```
        <!--End PulumiCodeChooser -->

        > Available location values can be found in the [R2 documentation](https://developers.cloudflare.com/r2/reference/data-location/#available-hints).

        ## Import

        ```sh
        $ pulumi import cloudflare:index/r2Bucket:R2Bucket default <account id>/<bucket name>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[str] location: The location hint of the R2 bucket.
        :param pulumi.Input[str] name: The name of the R2 bucket.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: R2BucketArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.R2Bucket("example",
            account_id="f037e56e89293a057740de681ac9abbe",
            name="terraform-bucket",
            location="enam")
        ```
        <!--End PulumiCodeChooser -->

        > Available location values can be found in the [R2 documentation](https://developers.cloudflare.com/r2/reference/data-location/#available-hints).

        ## Import

        ```sh
        $ pulumi import cloudflare:index/r2Bucket:R2Bucket default <account id>/<bucket name>
        ```

        :param str resource_name: The name of the resource.
        :param R2BucketArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(R2BucketArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 location: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = R2BucketArgs.__new__(R2BucketArgs)

            if account_id is None and not opts.urn:
                raise TypeError("Missing required property 'account_id'")
            __props__.__dict__["account_id"] = account_id
            __props__.__dict__["location"] = location
            if name is None and not opts.urn:
                raise TypeError("Missing required property 'name'")
            __props__.__dict__["name"] = name
        super(R2Bucket, __self__).__init__(
            'cloudflare:index/r2Bucket:R2Bucket',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[str]] = None,
            location: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None) -> 'R2Bucket':
        """
        Get an existing R2Bucket resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[str] location: The location hint of the R2 bucket.
        :param pulumi.Input[str] name: The name of the R2 bucket.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _R2BucketState.__new__(_R2BucketState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["location"] = location
        __props__.__dict__["name"] = name
        return R2Bucket(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[str]:
        """
        The account identifier to target for the resource.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter
    def location(self) -> pulumi.Output[str]:
        """
        The location hint of the R2 bucket.
        """
        return pulumi.get(self, "location")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the R2 bucket.
        """
        return pulumi.get(self, "name")

