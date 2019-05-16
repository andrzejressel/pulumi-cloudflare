# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from .. import utilities, tables

__config__ = pulumi.Config('cloudflare')

api_client_logging = __config__.get('apiClientLogging') or (utilities.get_env_bool('CLOUDFLARE_API_CLIENT_LOGGING') or False)
"""
Whether to print logs from the API client (using the default log library logger)
"""

email = __config__.get('email') or utilities.get_env('CLOUDFLARE_EMAIL')
"""
A registered Cloudflare email address.
"""

max_backoff = __config__.get('maxBackoff') or (utilities.get_env_int('CLOUDFLARE_MAX_BACKOFF') or 30)
"""
Maximum backoff period in seconds after failed API calls
"""

min_backoff = __config__.get('minBackoff') or (utilities.get_env_int('CLOUDFLARE_MIN_BACKOFF') or 1)
"""
Minimum backoff period in seconds after failed API calls
"""

org_id = __config__.get('orgId') or utilities.get_env('CLOUDFLARE_ORG_ID')
"""
Configure API client to always use that organization. If set this will override 'user_owner_from_zone'
"""

retries = __config__.get('retries') or (utilities.get_env_int('CLOUDFLARE_RETRIES') or 3)
"""
Maximum number of retries to perform when an API request fails
"""

rps = __config__.get('rps') or (utilities.get_env_int('CLOUDFLARE_RPS') or 4)
"""
RPS limit to apply when making calls to the API
"""

token = __config__.get('token') or utilities.get_env('CLOUDFLARE_TOKEN')
"""
The token key for API operations.
"""

use_org_from_zone = __config__.get('useOrgFromZone') or utilities.get_env('CLOUDFLARE_ORG_ZONE')
"""
If specified zone is owned by an organization, configure API client to always use that organization
"""

