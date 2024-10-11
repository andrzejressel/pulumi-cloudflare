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

__all__ = ['NotificationPolicyWebhooksArgs', 'NotificationPolicyWebhooks']

@pulumi.input_type
class NotificationPolicyWebhooksArgs:
    def __init__(__self__, *,
                 account_id: pulumi.Input[str],
                 name: pulumi.Input[str],
                 secret: Optional[pulumi.Input[str]] = None,
                 url: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a NotificationPolicyWebhooks resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[str] name: The name of the webhook destination.
        :param pulumi.Input[str] secret: An optional secret can be provided that will be passed in the `cf-webhook-auth` header when dispatching a webhook notification. Secrets are not returned in any API response body. Refer to the [documentation](https://api.cloudflare.com/#notification-webhooks-create-webhook) for more details.
        :param pulumi.Input[str] url: The URL of the webhook destinations. **Modifying this attribute will force creation of a new resource.**
        """
        pulumi.set(__self__, "account_id", account_id)
        pulumi.set(__self__, "name", name)
        if secret is not None:
            pulumi.set(__self__, "secret", secret)
        if url is not None:
            pulumi.set(__self__, "url", url)

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
        The name of the webhook destination.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[str]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def secret(self) -> Optional[pulumi.Input[str]]:
        """
        An optional secret can be provided that will be passed in the `cf-webhook-auth` header when dispatching a webhook notification. Secrets are not returned in any API response body. Refer to the [documentation](https://api.cloudflare.com/#notification-webhooks-create-webhook) for more details.
        """
        return pulumi.get(self, "secret")

    @secret.setter
    def secret(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "secret", value)

    @property
    @pulumi.getter
    def url(self) -> Optional[pulumi.Input[str]]:
        """
        The URL of the webhook destinations. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "url")

    @url.setter
    def url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "url", value)


@pulumi.input_type
class _NotificationPolicyWebhooksState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[str]] = None,
                 created_at: Optional[pulumi.Input[str]] = None,
                 last_failure: Optional[pulumi.Input[str]] = None,
                 last_success: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 secret: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 url: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering NotificationPolicyWebhooks resources.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[str] created_at: Timestamp of when the notification webhook was created.
        :param pulumi.Input[str] last_failure: Timestamp of when the notification webhook last failed.
        :param pulumi.Input[str] last_success: Timestamp of when the notification webhook was last successful.
        :param pulumi.Input[str] name: The name of the webhook destination.
        :param pulumi.Input[str] secret: An optional secret can be provided that will be passed in the `cf-webhook-auth` header when dispatching a webhook notification. Secrets are not returned in any API response body. Refer to the [documentation](https://api.cloudflare.com/#notification-webhooks-create-webhook) for more details.
        :param pulumi.Input[str] url: The URL of the webhook destinations. **Modifying this attribute will force creation of a new resource.**
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if created_at is not None:
            pulumi.set(__self__, "created_at", created_at)
        if last_failure is not None:
            pulumi.set(__self__, "last_failure", last_failure)
        if last_success is not None:
            pulumi.set(__self__, "last_success", last_success)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if secret is not None:
            pulumi.set(__self__, "secret", secret)
        if type is not None:
            pulumi.set(__self__, "type", type)
        if url is not None:
            pulumi.set(__self__, "url", url)

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
    @pulumi.getter(name="createdAt")
    def created_at(self) -> Optional[pulumi.Input[str]]:
        """
        Timestamp of when the notification webhook was created.
        """
        return pulumi.get(self, "created_at")

    @created_at.setter
    def created_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "created_at", value)

    @property
    @pulumi.getter(name="lastFailure")
    def last_failure(self) -> Optional[pulumi.Input[str]]:
        """
        Timestamp of when the notification webhook last failed.
        """
        return pulumi.get(self, "last_failure")

    @last_failure.setter
    def last_failure(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "last_failure", value)

    @property
    @pulumi.getter(name="lastSuccess")
    def last_success(self) -> Optional[pulumi.Input[str]]:
        """
        Timestamp of when the notification webhook was last successful.
        """
        return pulumi.get(self, "last_success")

    @last_success.setter
    def last_success(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "last_success", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the webhook destination.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def secret(self) -> Optional[pulumi.Input[str]]:
        """
        An optional secret can be provided that will be passed in the `cf-webhook-auth` header when dispatching a webhook notification. Secrets are not returned in any API response body. Refer to the [documentation](https://api.cloudflare.com/#notification-webhooks-create-webhook) for more details.
        """
        return pulumi.get(self, "secret")

    @secret.setter
    def secret(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "secret", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter
    def url(self) -> Optional[pulumi.Input[str]]:
        """
        The URL of the webhook destinations. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "url")

    @url.setter
    def url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "url", value)


class NotificationPolicyWebhooks(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 secret: Optional[pulumi.Input[str]] = None,
                 url: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a resource, that manages a webhook destination. These destinations can be tied to the notification policies created for Cloudflare's products.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.NotificationPolicyWebhooks("example",
            account_id="f037e56e89293a057740de681ac9abbe",
            name="Webhooks destination",
            url="https://example.com",
            secret="my-secret")
        ```

        ## Import

        ```sh
        $ pulumi import cloudflare:index/notificationPolicyWebhooks:NotificationPolicyWebhooks example <account_id>/<notification_webhook_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[str] name: The name of the webhook destination.
        :param pulumi.Input[str] secret: An optional secret can be provided that will be passed in the `cf-webhook-auth` header when dispatching a webhook notification. Secrets are not returned in any API response body. Refer to the [documentation](https://api.cloudflare.com/#notification-webhooks-create-webhook) for more details.
        :param pulumi.Input[str] url: The URL of the webhook destinations. **Modifying this attribute will force creation of a new resource.**
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: NotificationPolicyWebhooksArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a resource, that manages a webhook destination. These destinations can be tied to the notification policies created for Cloudflare's products.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.NotificationPolicyWebhooks("example",
            account_id="f037e56e89293a057740de681ac9abbe",
            name="Webhooks destination",
            url="https://example.com",
            secret="my-secret")
        ```

        ## Import

        ```sh
        $ pulumi import cloudflare:index/notificationPolicyWebhooks:NotificationPolicyWebhooks example <account_id>/<notification_webhook_id>
        ```

        :param str resource_name: The name of the resource.
        :param NotificationPolicyWebhooksArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(NotificationPolicyWebhooksArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 secret: Optional[pulumi.Input[str]] = None,
                 url: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = NotificationPolicyWebhooksArgs.__new__(NotificationPolicyWebhooksArgs)

            if account_id is None and not opts.urn:
                raise TypeError("Missing required property 'account_id'")
            __props__.__dict__["account_id"] = account_id
            if name is None and not opts.urn:
                raise TypeError("Missing required property 'name'")
            __props__.__dict__["name"] = name
            __props__.__dict__["secret"] = secret
            __props__.__dict__["url"] = url
            __props__.__dict__["created_at"] = None
            __props__.__dict__["last_failure"] = None
            __props__.__dict__["last_success"] = None
            __props__.__dict__["type"] = None
        super(NotificationPolicyWebhooks, __self__).__init__(
            'cloudflare:index/notificationPolicyWebhooks:NotificationPolicyWebhooks',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[str]] = None,
            created_at: Optional[pulumi.Input[str]] = None,
            last_failure: Optional[pulumi.Input[str]] = None,
            last_success: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            secret: Optional[pulumi.Input[str]] = None,
            type: Optional[pulumi.Input[str]] = None,
            url: Optional[pulumi.Input[str]] = None) -> 'NotificationPolicyWebhooks':
        """
        Get an existing NotificationPolicyWebhooks resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[str] created_at: Timestamp of when the notification webhook was created.
        :param pulumi.Input[str] last_failure: Timestamp of when the notification webhook last failed.
        :param pulumi.Input[str] last_success: Timestamp of when the notification webhook was last successful.
        :param pulumi.Input[str] name: The name of the webhook destination.
        :param pulumi.Input[str] secret: An optional secret can be provided that will be passed in the `cf-webhook-auth` header when dispatching a webhook notification. Secrets are not returned in any API response body. Refer to the [documentation](https://api.cloudflare.com/#notification-webhooks-create-webhook) for more details.
        :param pulumi.Input[str] url: The URL of the webhook destinations. **Modifying this attribute will force creation of a new resource.**
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _NotificationPolicyWebhooksState.__new__(_NotificationPolicyWebhooksState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["created_at"] = created_at
        __props__.__dict__["last_failure"] = last_failure
        __props__.__dict__["last_success"] = last_success
        __props__.__dict__["name"] = name
        __props__.__dict__["secret"] = secret
        __props__.__dict__["type"] = type
        __props__.__dict__["url"] = url
        return NotificationPolicyWebhooks(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[str]:
        """
        The account identifier to target for the resource.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> pulumi.Output[str]:
        """
        Timestamp of when the notification webhook was created.
        """
        return pulumi.get(self, "created_at")

    @property
    @pulumi.getter(name="lastFailure")
    def last_failure(self) -> pulumi.Output[str]:
        """
        Timestamp of when the notification webhook last failed.
        """
        return pulumi.get(self, "last_failure")

    @property
    @pulumi.getter(name="lastSuccess")
    def last_success(self) -> pulumi.Output[str]:
        """
        Timestamp of when the notification webhook was last successful.
        """
        return pulumi.get(self, "last_success")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the webhook destination.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def secret(self) -> pulumi.Output[Optional[str]]:
        """
        An optional secret can be provided that will be passed in the `cf-webhook-auth` header when dispatching a webhook notification. Secrets are not returned in any API response body. Refer to the [documentation](https://api.cloudflare.com/#notification-webhooks-create-webhook) for more details.
        """
        return pulumi.get(self, "secret")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        return pulumi.get(self, "type")

    @property
    @pulumi.getter
    def url(self) -> pulumi.Output[Optional[str]]:
        """
        The URL of the webhook destinations. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "url")

