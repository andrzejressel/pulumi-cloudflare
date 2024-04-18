# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['PagesDomainArgs', 'PagesDomain']

@pulumi.input_type
class PagesDomainArgs:
    def __init__(__self__, *,
                 account_id: pulumi.Input[str],
                 domain: pulumi.Input[str],
                 project_name: pulumi.Input[str]):
        """
        The set of arguments for constructing a PagesDomain resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] domain: Custom domain. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] project_name: Name of the Pages Project. **Modifying this attribute will force creation of a new resource.**
        """
        pulumi.set(__self__, "account_id", account_id)
        pulumi.set(__self__, "domain", domain)
        pulumi.set(__self__, "project_name", project_name)

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
    def domain(self) -> pulumi.Input[str]:
        """
        Custom domain. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "domain")

    @domain.setter
    def domain(self, value: pulumi.Input[str]):
        pulumi.set(self, "domain", value)

    @property
    @pulumi.getter(name="projectName")
    def project_name(self) -> pulumi.Input[str]:
        """
        Name of the Pages Project. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "project_name")

    @project_name.setter
    def project_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "project_name", value)


@pulumi.input_type
class _PagesDomainState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[str]] = None,
                 domain: Optional[pulumi.Input[str]] = None,
                 project_name: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering PagesDomain resources.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] domain: Custom domain. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] project_name: Name of the Pages Project. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] status: Status of the custom domain.
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if domain is not None:
            pulumi.set(__self__, "domain", domain)
        if project_name is not None:
            pulumi.set(__self__, "project_name", project_name)
        if status is not None:
            pulumi.set(__self__, "status", status)

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
    def domain(self) -> Optional[pulumi.Input[str]]:
        """
        Custom domain. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "domain")

    @domain.setter
    def domain(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "domain", value)

    @property
    @pulumi.getter(name="projectName")
    def project_name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the Pages Project. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "project_name")

    @project_name.setter
    def project_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_name", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        Status of the custom domain.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)


class PagesDomain(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 domain: Optional[pulumi.Input[str]] = None,
                 project_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a resource for managing Cloudflare Pages domains.

        > A DNS record for the domain is not automatically created. You need to create
           a `Record` resource for the domain you want to use.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        my_domain = cloudflare.PagesDomain("my-domain",
            account_id="f037e56e89293a057740de681ac9abbe",
            project_name="my-example-project",
            domain="example.com")
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        ```sh
        $ pulumi import cloudflare:index/pagesDomain:PagesDomain example <account_id>/<project_name>/<domain-name>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] domain: Custom domain. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] project_name: Name of the Pages Project. **Modifying this attribute will force creation of a new resource.**
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: PagesDomainArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a resource for managing Cloudflare Pages domains.

        > A DNS record for the domain is not automatically created. You need to create
           a `Record` resource for the domain you want to use.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        my_domain = cloudflare.PagesDomain("my-domain",
            account_id="f037e56e89293a057740de681ac9abbe",
            project_name="my-example-project",
            domain="example.com")
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        ```sh
        $ pulumi import cloudflare:index/pagesDomain:PagesDomain example <account_id>/<project_name>/<domain-name>
        ```

        :param str resource_name: The name of the resource.
        :param PagesDomainArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(PagesDomainArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 domain: Optional[pulumi.Input[str]] = None,
                 project_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = PagesDomainArgs.__new__(PagesDomainArgs)

            if account_id is None and not opts.urn:
                raise TypeError("Missing required property 'account_id'")
            __props__.__dict__["account_id"] = account_id
            if domain is None and not opts.urn:
                raise TypeError("Missing required property 'domain'")
            __props__.__dict__["domain"] = domain
            if project_name is None and not opts.urn:
                raise TypeError("Missing required property 'project_name'")
            __props__.__dict__["project_name"] = project_name
            __props__.__dict__["status"] = None
        super(PagesDomain, __self__).__init__(
            'cloudflare:index/pagesDomain:PagesDomain',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[str]] = None,
            domain: Optional[pulumi.Input[str]] = None,
            project_name: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None) -> 'PagesDomain':
        """
        Get an existing PagesDomain resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] domain: Custom domain. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] project_name: Name of the Pages Project. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] status: Status of the custom domain.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _PagesDomainState.__new__(_PagesDomainState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["domain"] = domain
        __props__.__dict__["project_name"] = project_name
        __props__.__dict__["status"] = status
        return PagesDomain(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[str]:
        """
        The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter
    def domain(self) -> pulumi.Output[str]:
        """
        Custom domain. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "domain")

    @property
    @pulumi.getter(name="projectName")
    def project_name(self) -> pulumi.Output[str]:
        """
        Name of the Pages Project. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "project_name")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        Status of the custom domain.
        """
        return pulumi.get(self, "status")

