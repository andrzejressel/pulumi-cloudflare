# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['ProviderArgs', 'Provider']

@pulumi.input_type
class ProviderArgs:
    def __init__(__self__, *,
                 api_base_path: Optional[pulumi.Input[str]] = None,
                 api_client_logging: Optional[pulumi.Input[bool]] = None,
                 api_hostname: Optional[pulumi.Input[str]] = None,
                 api_key: Optional[pulumi.Input[str]] = None,
                 api_token: Optional[pulumi.Input[str]] = None,
                 api_user_service_key: Optional[pulumi.Input[str]] = None,
                 email: Optional[pulumi.Input[str]] = None,
                 max_backoff: Optional[pulumi.Input[int]] = None,
                 min_backoff: Optional[pulumi.Input[int]] = None,
                 retries: Optional[pulumi.Input[int]] = None,
                 rps: Optional[pulumi.Input[int]] = None,
                 user_agent_operator_suffix: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Provider resource.
        :param pulumi.Input[str] api_base_path: Configure the base path used by the API client. Alternatively, can be configured using the `CLOUDFLARE_API_BASE_PATH`
               environment variable.
        :param pulumi.Input[bool] api_client_logging: Whether to print logs from the API client (using the default log library logger). Alternatively, can be configured using
               the `CLOUDFLARE_API_CLIENT_LOGGING` environment variable.
        :param pulumi.Input[str] api_hostname: Configure the hostname used by the API client. Alternatively, can be configured using the `CLOUDFLARE_API_HOSTNAME`
               environment variable.
        :param pulumi.Input[str] api_key: The API key for operations. Alternatively, can be configured using the `CLOUDFLARE_API_KEY` environment variable. API
               keys are [now considered legacy by
               Cloudflare](https://developers.cloudflare.com/fundamentals/api/get-started/keys/#limitations), API tokens should be used
               instead. Must provide only one of `api_key`, `api_token`, `api_user_service_key`.
        :param pulumi.Input[str] api_token: The API Token for operations. Alternatively, can be configured using the `CLOUDFLARE_API_TOKEN` environment variable.
               Must provide only one of `api_key`, `api_token`, `api_user_service_key`.
        :param pulumi.Input[str] api_user_service_key: A special Cloudflare API key good for a restricted set of endpoints. Alternatively, can be configured using the
               `CLOUDFLARE_API_USER_SERVICE_KEY` environment variable. Must provide only one of `api_key`, `api_token`,
               `api_user_service_key`.
        :param pulumi.Input[str] email: A registered Cloudflare email address. Alternatively, can be configured using the `CLOUDFLARE_EMAIL` environment
               variable. Required when using `api_key`. Conflicts with `api_token`.
        :param pulumi.Input[int] max_backoff: Maximum backoff period in seconds after failed API calls. Alternatively, can be configured using the
               `CLOUDFLARE_MAX_BACKOFF` environment variable.
        :param pulumi.Input[int] min_backoff: Minimum backoff period in seconds after failed API calls. Alternatively, can be configured using the
               `CLOUDFLARE_MIN_BACKOFF` environment variable.
        :param pulumi.Input[int] retries: Maximum number of retries to perform when an API request fails. Alternatively, can be configured using the
               `CLOUDFLARE_RETRIES` environment variable.
        :param pulumi.Input[int] rps: RPS limit to apply when making calls to the API. Alternatively, can be configured using the `CLOUDFLARE_RPS` environment
               variable.
        :param pulumi.Input[str] user_agent_operator_suffix: A value to append to the HTTP User Agent for all API calls. This value is not something most users need to modify
               however, if you are using a non-standard provider or operator configuration, this is recommended to assist in uniquely
               identifying your traffic. **Setting this value will remove the Terraform version from the HTTP User Agent string and may
               have unintended consequences**. Alternatively, can be configured using the `CLOUDFLARE_USER_AGENT_OPERATOR_SUFFIX`
               environment variable.
        """
        ProviderArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            api_base_path=api_base_path,
            api_client_logging=api_client_logging,
            api_hostname=api_hostname,
            api_key=api_key,
            api_token=api_token,
            api_user_service_key=api_user_service_key,
            email=email,
            max_backoff=max_backoff,
            min_backoff=min_backoff,
            retries=retries,
            rps=rps,
            user_agent_operator_suffix=user_agent_operator_suffix,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             api_base_path: Optional[pulumi.Input[str]] = None,
             api_client_logging: Optional[pulumi.Input[bool]] = None,
             api_hostname: Optional[pulumi.Input[str]] = None,
             api_key: Optional[pulumi.Input[str]] = None,
             api_token: Optional[pulumi.Input[str]] = None,
             api_user_service_key: Optional[pulumi.Input[str]] = None,
             email: Optional[pulumi.Input[str]] = None,
             max_backoff: Optional[pulumi.Input[int]] = None,
             min_backoff: Optional[pulumi.Input[int]] = None,
             retries: Optional[pulumi.Input[int]] = None,
             rps: Optional[pulumi.Input[int]] = None,
             user_agent_operator_suffix: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if 'apiBasePath' in kwargs:
            api_base_path = kwargs['apiBasePath']
        if 'apiClientLogging' in kwargs:
            api_client_logging = kwargs['apiClientLogging']
        if 'apiHostname' in kwargs:
            api_hostname = kwargs['apiHostname']
        if 'apiKey' in kwargs:
            api_key = kwargs['apiKey']
        if 'apiToken' in kwargs:
            api_token = kwargs['apiToken']
        if 'apiUserServiceKey' in kwargs:
            api_user_service_key = kwargs['apiUserServiceKey']
        if 'maxBackoff' in kwargs:
            max_backoff = kwargs['maxBackoff']
        if 'minBackoff' in kwargs:
            min_backoff = kwargs['minBackoff']
        if 'userAgentOperatorSuffix' in kwargs:
            user_agent_operator_suffix = kwargs['userAgentOperatorSuffix']

        if api_base_path is not None:
            _setter("api_base_path", api_base_path)
        if api_client_logging is None:
            api_client_logging = (_utilities.get_env_bool('CLOUDFLARE_API_CLIENT_LOGGING') or False)
        if api_client_logging is not None:
            _setter("api_client_logging", api_client_logging)
        if api_hostname is not None:
            _setter("api_hostname", api_hostname)
        if api_key is not None:
            _setter("api_key", api_key)
        if api_token is not None:
            _setter("api_token", api_token)
        if api_user_service_key is not None:
            _setter("api_user_service_key", api_user_service_key)
        if email is not None:
            _setter("email", email)
        if max_backoff is None:
            max_backoff = (_utilities.get_env_int('CLOUDFLARE_MAX_BACKOFF') or 30)
        if max_backoff is not None:
            _setter("max_backoff", max_backoff)
        if min_backoff is None:
            min_backoff = (_utilities.get_env_int('CLOUDFLARE_MIN_BACKOFF') or 1)
        if min_backoff is not None:
            _setter("min_backoff", min_backoff)
        if retries is None:
            retries = (_utilities.get_env_int('CLOUDFLARE_RETRIES') or 3)
        if retries is not None:
            _setter("retries", retries)
        if rps is None:
            rps = (_utilities.get_env_int('CLOUDFLARE_RPS') or 4)
        if rps is not None:
            _setter("rps", rps)
        if user_agent_operator_suffix is not None:
            _setter("user_agent_operator_suffix", user_agent_operator_suffix)

    @property
    @pulumi.getter(name="apiBasePath")
    def api_base_path(self) -> Optional[pulumi.Input[str]]:
        """
        Configure the base path used by the API client. Alternatively, can be configured using the `CLOUDFLARE_API_BASE_PATH`
        environment variable.
        """
        return pulumi.get(self, "api_base_path")

    @api_base_path.setter
    def api_base_path(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "api_base_path", value)

    @property
    @pulumi.getter(name="apiClientLogging")
    def api_client_logging(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether to print logs from the API client (using the default log library logger). Alternatively, can be configured using
        the `CLOUDFLARE_API_CLIENT_LOGGING` environment variable.
        """
        return pulumi.get(self, "api_client_logging")

    @api_client_logging.setter
    def api_client_logging(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "api_client_logging", value)

    @property
    @pulumi.getter(name="apiHostname")
    def api_hostname(self) -> Optional[pulumi.Input[str]]:
        """
        Configure the hostname used by the API client. Alternatively, can be configured using the `CLOUDFLARE_API_HOSTNAME`
        environment variable.
        """
        return pulumi.get(self, "api_hostname")

    @api_hostname.setter
    def api_hostname(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "api_hostname", value)

    @property
    @pulumi.getter(name="apiKey")
    def api_key(self) -> Optional[pulumi.Input[str]]:
        """
        The API key for operations. Alternatively, can be configured using the `CLOUDFLARE_API_KEY` environment variable. API
        keys are [now considered legacy by
        Cloudflare](https://developers.cloudflare.com/fundamentals/api/get-started/keys/#limitations), API tokens should be used
        instead. Must provide only one of `api_key`, `api_token`, `api_user_service_key`.
        """
        return pulumi.get(self, "api_key")

    @api_key.setter
    def api_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "api_key", value)

    @property
    @pulumi.getter(name="apiToken")
    def api_token(self) -> Optional[pulumi.Input[str]]:
        """
        The API Token for operations. Alternatively, can be configured using the `CLOUDFLARE_API_TOKEN` environment variable.
        Must provide only one of `api_key`, `api_token`, `api_user_service_key`.
        """
        return pulumi.get(self, "api_token")

    @api_token.setter
    def api_token(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "api_token", value)

    @property
    @pulumi.getter(name="apiUserServiceKey")
    def api_user_service_key(self) -> Optional[pulumi.Input[str]]:
        """
        A special Cloudflare API key good for a restricted set of endpoints. Alternatively, can be configured using the
        `CLOUDFLARE_API_USER_SERVICE_KEY` environment variable. Must provide only one of `api_key`, `api_token`,
        `api_user_service_key`.
        """
        return pulumi.get(self, "api_user_service_key")

    @api_user_service_key.setter
    def api_user_service_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "api_user_service_key", value)

    @property
    @pulumi.getter
    def email(self) -> Optional[pulumi.Input[str]]:
        """
        A registered Cloudflare email address. Alternatively, can be configured using the `CLOUDFLARE_EMAIL` environment
        variable. Required when using `api_key`. Conflicts with `api_token`.
        """
        return pulumi.get(self, "email")

    @email.setter
    def email(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "email", value)

    @property
    @pulumi.getter(name="maxBackoff")
    def max_backoff(self) -> Optional[pulumi.Input[int]]:
        """
        Maximum backoff period in seconds after failed API calls. Alternatively, can be configured using the
        `CLOUDFLARE_MAX_BACKOFF` environment variable.
        """
        return pulumi.get(self, "max_backoff")

    @max_backoff.setter
    def max_backoff(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "max_backoff", value)

    @property
    @pulumi.getter(name="minBackoff")
    def min_backoff(self) -> Optional[pulumi.Input[int]]:
        """
        Minimum backoff period in seconds after failed API calls. Alternatively, can be configured using the
        `CLOUDFLARE_MIN_BACKOFF` environment variable.
        """
        return pulumi.get(self, "min_backoff")

    @min_backoff.setter
    def min_backoff(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "min_backoff", value)

    @property
    @pulumi.getter
    def retries(self) -> Optional[pulumi.Input[int]]:
        """
        Maximum number of retries to perform when an API request fails. Alternatively, can be configured using the
        `CLOUDFLARE_RETRIES` environment variable.
        """
        return pulumi.get(self, "retries")

    @retries.setter
    def retries(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "retries", value)

    @property
    @pulumi.getter
    def rps(self) -> Optional[pulumi.Input[int]]:
        """
        RPS limit to apply when making calls to the API. Alternatively, can be configured using the `CLOUDFLARE_RPS` environment
        variable.
        """
        return pulumi.get(self, "rps")

    @rps.setter
    def rps(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "rps", value)

    @property
    @pulumi.getter(name="userAgentOperatorSuffix")
    def user_agent_operator_suffix(self) -> Optional[pulumi.Input[str]]:
        """
        A value to append to the HTTP User Agent for all API calls. This value is not something most users need to modify
        however, if you are using a non-standard provider or operator configuration, this is recommended to assist in uniquely
        identifying your traffic. **Setting this value will remove the Terraform version from the HTTP User Agent string and may
        have unintended consequences**. Alternatively, can be configured using the `CLOUDFLARE_USER_AGENT_OPERATOR_SUFFIX`
        environment variable.
        """
        return pulumi.get(self, "user_agent_operator_suffix")

    @user_agent_operator_suffix.setter
    def user_agent_operator_suffix(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "user_agent_operator_suffix", value)


class Provider(pulumi.ProviderResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 api_base_path: Optional[pulumi.Input[str]] = None,
                 api_client_logging: Optional[pulumi.Input[bool]] = None,
                 api_hostname: Optional[pulumi.Input[str]] = None,
                 api_key: Optional[pulumi.Input[str]] = None,
                 api_token: Optional[pulumi.Input[str]] = None,
                 api_user_service_key: Optional[pulumi.Input[str]] = None,
                 email: Optional[pulumi.Input[str]] = None,
                 max_backoff: Optional[pulumi.Input[int]] = None,
                 min_backoff: Optional[pulumi.Input[int]] = None,
                 retries: Optional[pulumi.Input[int]] = None,
                 rps: Optional[pulumi.Input[int]] = None,
                 user_agent_operator_suffix: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        The provider type for the cloudflare package. By default, resources use package-wide configuration
        settings, however an explicit `Provider` instance may be created and passed during resource
        construction to achieve fine-grained programmatic control over provider settings. See the
        [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] api_base_path: Configure the base path used by the API client. Alternatively, can be configured using the `CLOUDFLARE_API_BASE_PATH`
               environment variable.
        :param pulumi.Input[bool] api_client_logging: Whether to print logs from the API client (using the default log library logger). Alternatively, can be configured using
               the `CLOUDFLARE_API_CLIENT_LOGGING` environment variable.
        :param pulumi.Input[str] api_hostname: Configure the hostname used by the API client. Alternatively, can be configured using the `CLOUDFLARE_API_HOSTNAME`
               environment variable.
        :param pulumi.Input[str] api_key: The API key for operations. Alternatively, can be configured using the `CLOUDFLARE_API_KEY` environment variable. API
               keys are [now considered legacy by
               Cloudflare](https://developers.cloudflare.com/fundamentals/api/get-started/keys/#limitations), API tokens should be used
               instead. Must provide only one of `api_key`, `api_token`, `api_user_service_key`.
        :param pulumi.Input[str] api_token: The API Token for operations. Alternatively, can be configured using the `CLOUDFLARE_API_TOKEN` environment variable.
               Must provide only one of `api_key`, `api_token`, `api_user_service_key`.
        :param pulumi.Input[str] api_user_service_key: A special Cloudflare API key good for a restricted set of endpoints. Alternatively, can be configured using the
               `CLOUDFLARE_API_USER_SERVICE_KEY` environment variable. Must provide only one of `api_key`, `api_token`,
               `api_user_service_key`.
        :param pulumi.Input[str] email: A registered Cloudflare email address. Alternatively, can be configured using the `CLOUDFLARE_EMAIL` environment
               variable. Required when using `api_key`. Conflicts with `api_token`.
        :param pulumi.Input[int] max_backoff: Maximum backoff period in seconds after failed API calls. Alternatively, can be configured using the
               `CLOUDFLARE_MAX_BACKOFF` environment variable.
        :param pulumi.Input[int] min_backoff: Minimum backoff period in seconds after failed API calls. Alternatively, can be configured using the
               `CLOUDFLARE_MIN_BACKOFF` environment variable.
        :param pulumi.Input[int] retries: Maximum number of retries to perform when an API request fails. Alternatively, can be configured using the
               `CLOUDFLARE_RETRIES` environment variable.
        :param pulumi.Input[int] rps: RPS limit to apply when making calls to the API. Alternatively, can be configured using the `CLOUDFLARE_RPS` environment
               variable.
        :param pulumi.Input[str] user_agent_operator_suffix: A value to append to the HTTP User Agent for all API calls. This value is not something most users need to modify
               however, if you are using a non-standard provider or operator configuration, this is recommended to assist in uniquely
               identifying your traffic. **Setting this value will remove the Terraform version from the HTTP User Agent string and may
               have unintended consequences**. Alternatively, can be configured using the `CLOUDFLARE_USER_AGENT_OPERATOR_SUFFIX`
               environment variable.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[ProviderArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        The provider type for the cloudflare package. By default, resources use package-wide configuration
        settings, however an explicit `Provider` instance may be created and passed during resource
        construction to achieve fine-grained programmatic control over provider settings. See the
        [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.

        :param str resource_name: The name of the resource.
        :param ProviderArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ProviderArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            ProviderArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 api_base_path: Optional[pulumi.Input[str]] = None,
                 api_client_logging: Optional[pulumi.Input[bool]] = None,
                 api_hostname: Optional[pulumi.Input[str]] = None,
                 api_key: Optional[pulumi.Input[str]] = None,
                 api_token: Optional[pulumi.Input[str]] = None,
                 api_user_service_key: Optional[pulumi.Input[str]] = None,
                 email: Optional[pulumi.Input[str]] = None,
                 max_backoff: Optional[pulumi.Input[int]] = None,
                 min_backoff: Optional[pulumi.Input[int]] = None,
                 retries: Optional[pulumi.Input[int]] = None,
                 rps: Optional[pulumi.Input[int]] = None,
                 user_agent_operator_suffix: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ProviderArgs.__new__(ProviderArgs)

            __props__.__dict__["api_base_path"] = api_base_path
            if api_client_logging is None:
                api_client_logging = (_utilities.get_env_bool('CLOUDFLARE_API_CLIENT_LOGGING') or False)
            __props__.__dict__["api_client_logging"] = pulumi.Output.from_input(api_client_logging).apply(pulumi.runtime.to_json) if api_client_logging is not None else None
            __props__.__dict__["api_hostname"] = api_hostname
            __props__.__dict__["api_key"] = api_key
            __props__.__dict__["api_token"] = api_token
            __props__.__dict__["api_user_service_key"] = api_user_service_key
            __props__.__dict__["email"] = email
            if max_backoff is None:
                max_backoff = (_utilities.get_env_int('CLOUDFLARE_MAX_BACKOFF') or 30)
            __props__.__dict__["max_backoff"] = pulumi.Output.from_input(max_backoff).apply(pulumi.runtime.to_json) if max_backoff is not None else None
            if min_backoff is None:
                min_backoff = (_utilities.get_env_int('CLOUDFLARE_MIN_BACKOFF') or 1)
            __props__.__dict__["min_backoff"] = pulumi.Output.from_input(min_backoff).apply(pulumi.runtime.to_json) if min_backoff is not None else None
            if retries is None:
                retries = (_utilities.get_env_int('CLOUDFLARE_RETRIES') or 3)
            __props__.__dict__["retries"] = pulumi.Output.from_input(retries).apply(pulumi.runtime.to_json) if retries is not None else None
            if rps is None:
                rps = (_utilities.get_env_int('CLOUDFLARE_RPS') or 4)
            __props__.__dict__["rps"] = pulumi.Output.from_input(rps).apply(pulumi.runtime.to_json) if rps is not None else None
            __props__.__dict__["user_agent_operator_suffix"] = user_agent_operator_suffix
        super(Provider, __self__).__init__(
            'cloudflare',
            resource_name,
            __props__,
            opts)

    @property
    @pulumi.getter(name="apiBasePath")
    def api_base_path(self) -> pulumi.Output[Optional[str]]:
        """
        Configure the base path used by the API client. Alternatively, can be configured using the `CLOUDFLARE_API_BASE_PATH`
        environment variable.
        """
        return pulumi.get(self, "api_base_path")

    @property
    @pulumi.getter(name="apiHostname")
    def api_hostname(self) -> pulumi.Output[Optional[str]]:
        """
        Configure the hostname used by the API client. Alternatively, can be configured using the `CLOUDFLARE_API_HOSTNAME`
        environment variable.
        """
        return pulumi.get(self, "api_hostname")

    @property
    @pulumi.getter(name="apiKey")
    def api_key(self) -> pulumi.Output[Optional[str]]:
        """
        The API key for operations. Alternatively, can be configured using the `CLOUDFLARE_API_KEY` environment variable. API
        keys are [now considered legacy by
        Cloudflare](https://developers.cloudflare.com/fundamentals/api/get-started/keys/#limitations), API tokens should be used
        instead. Must provide only one of `api_key`, `api_token`, `api_user_service_key`.
        """
        return pulumi.get(self, "api_key")

    @property
    @pulumi.getter(name="apiToken")
    def api_token(self) -> pulumi.Output[Optional[str]]:
        """
        The API Token for operations. Alternatively, can be configured using the `CLOUDFLARE_API_TOKEN` environment variable.
        Must provide only one of `api_key`, `api_token`, `api_user_service_key`.
        """
        return pulumi.get(self, "api_token")

    @property
    @pulumi.getter(name="apiUserServiceKey")
    def api_user_service_key(self) -> pulumi.Output[Optional[str]]:
        """
        A special Cloudflare API key good for a restricted set of endpoints. Alternatively, can be configured using the
        `CLOUDFLARE_API_USER_SERVICE_KEY` environment variable. Must provide only one of `api_key`, `api_token`,
        `api_user_service_key`.
        """
        return pulumi.get(self, "api_user_service_key")

    @property
    @pulumi.getter
    def email(self) -> pulumi.Output[Optional[str]]:
        """
        A registered Cloudflare email address. Alternatively, can be configured using the `CLOUDFLARE_EMAIL` environment
        variable. Required when using `api_key`. Conflicts with `api_token`.
        """
        return pulumi.get(self, "email")

    @property
    @pulumi.getter(name="userAgentOperatorSuffix")
    def user_agent_operator_suffix(self) -> pulumi.Output[Optional[str]]:
        """
        A value to append to the HTTP User Agent for all API calls. This value is not something most users need to modify
        however, if you are using a non-standard provider or operator configuration, this is recommended to assist in uniquely
        identifying your traffic. **Setting this value will remove the Terraform version from the HTTP User Agent string and may
        have unintended consequences**. Alternatively, can be configured using the `CLOUDFLARE_USER_AGENT_OPERATOR_SUFFIX`
        environment variable.
        """
        return pulumi.get(self, "user_agent_operator_suffix")

