# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from . import utilities, tables

class CustomPages(pulumi.CustomResource):
    account_id: pulumi.Output[str]
    """
    The account ID where the custom pages should be
    updated. Either `account_id` or `zone_id` must be provided. If
    `account_id` is present, it will override the zone setting.
    """
    state: pulumi.Output[str]
    type: pulumi.Output[str]
    """
    The type of custom page you wish to update. Must
    be one of `basic_challenge`, `waf_challenge`, `waf_block`,
    `ratelimit_block`, `country_challenge`, `ip_block`, `under_attack`,
    `500_errors`, `1000_errors`, `always_online`.
    """
    url: pulumi.Output[str]
    """
    URL of where the custom page source is located.
    """
    zone_id: pulumi.Output[str]
    """
    The zone ID where the custom pages should be
    updated. Either `zone_id` or `account_id` must be provided.
    """
    def __init__(__self__, resource_name, opts=None, account_id=None, state=None, type=None, url=None, zone_id=None, __props__=None, __name__=None, __opts__=None):
        """
        Provides a resource which manages Cloudflare custom error pages.
        
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account ID where the custom pages should be
               updated. Either `account_id` or `zone_id` must be provided. If
               `account_id` is present, it will override the zone setting.
        :param pulumi.Input[str] type: The type of custom page you wish to update. Must
               be one of `basic_challenge`, `waf_challenge`, `waf_block`,
               `ratelimit_block`, `country_challenge`, `ip_block`, `under_attack`,
               `500_errors`, `1000_errors`, `always_online`.
        :param pulumi.Input[str] url: URL of where the custom page source is located.
        :param pulumi.Input[str] zone_id: The zone ID where the custom pages should be
               updated. Either `zone_id` or `account_id` must be provided.

        > This content is derived from https://github.com/terraform-providers/terraform-provider-cloudflare/blob/master/website/docs/r/custom_pages.html.markdown.
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['account_id'] = account_id
            __props__['state'] = state
            if type is None:
                raise TypeError("Missing required property 'type'")
            __props__['type'] = type
            if url is None:
                raise TypeError("Missing required property 'url'")
            __props__['url'] = url
            __props__['zone_id'] = zone_id
        super(CustomPages, __self__).__init__(
            'cloudflare:index/customPages:CustomPages',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, account_id=None, state=None, type=None, url=None, zone_id=None):
        """
        Get an existing CustomPages resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.
        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account ID where the custom pages should be
               updated. Either `account_id` or `zone_id` must be provided. If
               `account_id` is present, it will override the zone setting.
        :param pulumi.Input[str] type: The type of custom page you wish to update. Must
               be one of `basic_challenge`, `waf_challenge`, `waf_block`,
               `ratelimit_block`, `country_challenge`, `ip_block`, `under_attack`,
               `500_errors`, `1000_errors`, `always_online`.
        :param pulumi.Input[str] url: URL of where the custom page source is located.
        :param pulumi.Input[str] zone_id: The zone ID where the custom pages should be
               updated. Either `zone_id` or `account_id` must be provided.

        > This content is derived from https://github.com/terraform-providers/terraform-provider-cloudflare/blob/master/website/docs/r/custom_pages.html.markdown.
        """
        opts = pulumi.ResourceOptions(id=id) if opts is None else opts.merge(pulumi.ResourceOptions(id=id))

        __props__ = dict()
        __props__["account_id"] = account_id
        __props__["state"] = state
        __props__["type"] = type
        __props__["url"] = url
        __props__["zone_id"] = zone_id
        return CustomPages(resource_name, opts=opts, __props__=__props__)
    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

