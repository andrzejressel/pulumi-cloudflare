# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from . import utilities, tables

class LogpushJob(pulumi.CustomResource):
    destination_conf: pulumi.Output[str]
    enabled: pulumi.Output[bool]
    logpull_options: pulumi.Output[str]
    name: pulumi.Output[str]
    ownership_challenge: pulumi.Output[str]
    """
    Ownership challenge token to prove destination ownership. See [https://developers.cloudflare.com/logs/tutorials/tutorial-logpush-curl/](https://developers.cloudflare.com/logs/tutorials/tutorial-logpush-curl/)
    """
    zone_id: pulumi.Output[str]
    def __init__(__self__, resource_name, opts=None, destination_conf=None, enabled=None, logpull_options=None, name=None, ownership_challenge=None, zone_id=None, __name__=None, __opts__=None):
        """
        Provides a resource which manages Cloudflare logpush jobs.
        
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] ownership_challenge: Ownership challenge token to prove destination ownership. See [https://developers.cloudflare.com/logs/tutorials/tutorial-logpush-curl/](https://developers.cloudflare.com/logs/tutorials/tutorial-logpush-curl/)
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if not resource_name:
            raise TypeError('Missing resource name argument (for URN creation)')
        if not isinstance(resource_name, str):
            raise TypeError('Expected resource name to be a string')
        if opts and not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')

        __props__ = dict()

        if destination_conf is None:
            raise TypeError("Missing required property 'destination_conf'")
        __props__['destination_conf'] = destination_conf

        __props__['enabled'] = enabled

        __props__['logpull_options'] = logpull_options

        __props__['name'] = name

        if ownership_challenge is None:
            raise TypeError("Missing required property 'ownership_challenge'")
        __props__['ownership_challenge'] = ownership_challenge

        if zone_id is None:
            raise TypeError("Missing required property 'zone_id'")
        __props__['zone_id'] = zone_id

        if opts is None:
            opts = pulumi.ResourceOptions()
        if opts.version is None:
            opts.version = utilities.get_version()
        super(LogpushJob, __self__).__init__(
            'cloudflare:index/logpushJob:LogpushJob',
            resource_name,
            __props__,
            opts)


    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

