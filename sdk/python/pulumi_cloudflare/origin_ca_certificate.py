# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from . import utilities, tables

class OriginCaCertificate(pulumi.CustomResource):
    certificate: pulumi.Output[str]
    """
    The Origin CA certificate
    """
    csr: pulumi.Output[str]
    """
    The Certificate Signing Request. Must be newline-encoded.
    """
    expires_on: pulumi.Output[str]
    """
    The datetime when the certificate will expire.
    """
    hostnames: pulumi.Output[list]
    """
    An array of hostnames or wildcard names bound to the certificate.
    """
    request_type: pulumi.Output[str]
    """
    The signature type desired on the certificate.
    """
    requested_validity: pulumi.Output[float]
    """
    The number of days for which the certificate should be valid.
    """
    def __init__(__self__, resource_name, opts=None, csr=None, hostnames=None, request_type=None, requested_validity=None, __props__=None, __name__=None, __opts__=None):
        """
        Provides a Cloudflare Origin CA certificate used to protect traffic to your origin without involving a third party Certificate Authority.

        **This resource requires you use your Origin CA Key as the `api_user_service_key`.**

        > This content is derived from https://github.com/terraform-providers/terraform-provider-cloudflare/blob/master/website/docs/r/origin_ca_certificate.html.markdown.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] csr: The Certificate Signing Request. Must be newline-encoded.
        :param pulumi.Input[list] hostnames: An array of hostnames or wildcard names bound to the certificate.
        :param pulumi.Input[str] request_type: The signature type desired on the certificate.
        :param pulumi.Input[float] requested_validity: The number of days for which the certificate should be valid.
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

            if csr is None:
                raise TypeError("Missing required property 'csr'")
            __props__['csr'] = csr
            if hostnames is None:
                raise TypeError("Missing required property 'hostnames'")
            __props__['hostnames'] = hostnames
            if request_type is None:
                raise TypeError("Missing required property 'request_type'")
            __props__['request_type'] = request_type
            __props__['requested_validity'] = requested_validity
            __props__['certificate'] = None
            __props__['expires_on'] = None
        super(OriginCaCertificate, __self__).__init__(
            'cloudflare:index/originCaCertificate:OriginCaCertificate',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, certificate=None, csr=None, expires_on=None, hostnames=None, request_type=None, requested_validity=None):
        """
        Get an existing OriginCaCertificate resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] certificate: The Origin CA certificate
        :param pulumi.Input[str] csr: The Certificate Signing Request. Must be newline-encoded.
        :param pulumi.Input[str] expires_on: The datetime when the certificate will expire.
        :param pulumi.Input[list] hostnames: An array of hostnames or wildcard names bound to the certificate.
        :param pulumi.Input[str] request_type: The signature type desired on the certificate.
        :param pulumi.Input[float] requested_validity: The number of days for which the certificate should be valid.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["certificate"] = certificate
        __props__["csr"] = csr
        __props__["expires_on"] = expires_on
        __props__["hostnames"] = hostnames
        __props__["request_type"] = request_type
        __props__["requested_validity"] = requested_validity
        return OriginCaCertificate(resource_name, opts=opts, __props__=__props__)
    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

