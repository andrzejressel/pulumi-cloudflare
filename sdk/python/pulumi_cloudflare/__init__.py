# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

from . import _utilities
import typing
# Export this package's modules as members:
from .access_application import *
from .access_ca_certificate import *
from .access_custom_page import *
from .access_group import *
from .access_identity_provider import *
from .access_keys_configuration import *
from .access_mutual_tls_certificate import *
from .access_mutual_tls_hostname_settings import *
from .access_organization import *
from .access_policy import *
from .access_rule import *
from .access_service_token import *
from .access_tag import *
from .account import *
from .account_member import *
from .address_map import *
from .api_shield import *
from .api_shield_operation import *
from .api_shield_operation_schema_validation_settings import *
from .api_shield_schema import *
from .api_shield_schema_validation_settings import *
from .api_token import *
from .argo import *
from .authenticated_origin_pulls import *
from .authenticated_origin_pulls_certificate import *
from .bot_management import *
from .byo_ip_prefix import *
from .certificate_pack import *
from .custom_hostname import *
from .custom_hostname_fallback_origin import *
from .custom_pages import *
from .custom_ssl import *
from .d1_database import *
from .device_dex_test import *
from .device_managed_networks import *
from .device_policy_certificates import *
from .device_posture_integration import *
from .device_posture_rule import *
from .device_settings_policy import *
from .dlp_profile import *
from .email_routing_address import *
from .email_routing_catch_all import *
from .email_routing_rule import *
from .email_routing_settings import *
from .fallback_domain import *
from .filter import *
from .firewall_rule import *
from .get_access_application import *
from .get_access_identity_provider import *
from .get_account_roles import *
from .get_accounts import *
from .get_api_token_permission_groups import *
from .get_device_posture_rules import *
from .get_devices import *
from .get_dlp_datasets import *
from .get_gateway_app_types import *
from .get_gateway_categories import *
from .get_ip_ranges import *
from .get_list import *
from .get_lists import *
from .get_load_balancer_pools import *
from .get_origin_ca_certificate import *
from .get_origin_ca_root_certificate import *
from .get_record import *
from .get_rulesets import *
from .get_tunnel import *
from .get_tunnel_virtual_network import *
from .get_user import *
from .get_zone import *
from .get_zone_cache_reserve import *
from .get_zone_dnssec import *
from .get_zones import *
from .gre_tunnel import *
from .healthcheck import *
from .hostname_tls_setting import *
from .hostname_tls_setting_ciphers import *
from .hyperdrive_config import *
from .ipsec_tunnel import *
from .keyless_certificate import *
from .list import *
from .list_item import *
from .load_balancer import *
from .load_balancer_monitor import *
from .load_balancer_pool import *
from .logpull_retention import *
from .logpush_job import *
from .logpush_ownership_challenge import *
from .magic_firewall_ruleset import *
from .managed_headers import *
from .mtls_certificate import *
from .notification_policy import *
from .notification_policy_webhooks import *
from .observatory_scheduled_test import *
from .origin_ca_certificate import *
from .page_rule import *
from .pages_domain import *
from .pages_project import *
from .provider import *
from .queue import *
from .r2_bucket import *
from .rate_limit import *
from .record import *
from .regional_hostname import *
from .regional_tiered_cache import *
from .risk_behavior import *
from .ruleset import *
from .spectrum_application import *
from .split_tunnel import *
from .static_route import *
from .teams_account import *
from .teams_list import *
from .teams_location import *
from .teams_proxy_endpoint import *
from .teams_rule import *
from .tiered_cache import *
from .total_tls import *
from .tunnel import *
from .tunnel_config import *
from .tunnel_route import *
from .tunnel_virtual_network import *
from .turnstile_widget import *
from .url_normalization_settings import *
from .user_agent_blocking_rule import *
from .waiting_room import *
from .waiting_room_event import *
from .waiting_room_rules import *
from .waiting_room_settings import *
from .web3_hostname import *
from .web_analytics_rule import *
from .web_analytics_site import *
from .worker_cron_trigger import *
from .worker_domain import *
from .worker_route import *
from .worker_script import *
from .worker_secret import *
from .workers_cron_trigger import *
from .workers_domain import *
from .workers_for_platforms_dispatch_namespace import *
from .workers_for_platforms_namespace import *
from .workers_kv import *
from .workers_kv_namespace import *
from .workers_route import *
from .workers_script import *
from .workers_secret import *
from .zone import *
from .zone_cache_reserve import *
from .zone_cache_variants import *
from .zone_dnssec import *
from .zone_hold import *
from .zone_lockdown import *
from .zone_settings_override import *
from ._inputs import *
from . import outputs

# Make subpackages available:
if typing.TYPE_CHECKING:
    import pulumi_cloudflare.config as __config
    config = __config
else:
    config = _utilities.lazy_import('pulumi_cloudflare.config')

_utilities.register(
    resource_modules="""
[
 {
  "pkg": "cloudflare",
  "mod": "index/accessApplication",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/accessApplication:AccessApplication": "AccessApplication"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/accessCaCertificate",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/accessCaCertificate:AccessCaCertificate": "AccessCaCertificate"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/accessCustomPage",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/accessCustomPage:AccessCustomPage": "AccessCustomPage"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/accessGroup",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/accessGroup:AccessGroup": "AccessGroup"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/accessIdentityProvider",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/accessIdentityProvider:AccessIdentityProvider": "AccessIdentityProvider"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/accessKeysConfiguration",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/accessKeysConfiguration:AccessKeysConfiguration": "AccessKeysConfiguration"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/accessMutualTlsCertificate",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/accessMutualTlsCertificate:AccessMutualTlsCertificate": "AccessMutualTlsCertificate"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/accessMutualTlsHostnameSettings",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/accessMutualTlsHostnameSettings:AccessMutualTlsHostnameSettings": "AccessMutualTlsHostnameSettings"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/accessOrganization",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/accessOrganization:AccessOrganization": "AccessOrganization"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/accessPolicy",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/accessPolicy:AccessPolicy": "AccessPolicy"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/accessRule",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/accessRule:AccessRule": "AccessRule"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/accessServiceToken",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/accessServiceToken:AccessServiceToken": "AccessServiceToken"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/accessTag",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/accessTag:AccessTag": "AccessTag"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/account",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/account:Account": "Account"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/accountMember",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/accountMember:AccountMember": "AccountMember"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/addressMap",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/addressMap:AddressMap": "AddressMap"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/apiShield",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/apiShield:ApiShield": "ApiShield"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/apiShieldOperation",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/apiShieldOperation:ApiShieldOperation": "ApiShieldOperation"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/apiShieldOperationSchemaValidationSettings",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/apiShieldOperationSchemaValidationSettings:ApiShieldOperationSchemaValidationSettings": "ApiShieldOperationSchemaValidationSettings"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/apiShieldSchema",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/apiShieldSchema:ApiShieldSchema": "ApiShieldSchema"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/apiShieldSchemaValidationSettings",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/apiShieldSchemaValidationSettings:ApiShieldSchemaValidationSettings": "ApiShieldSchemaValidationSettings"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/apiToken",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/apiToken:ApiToken": "ApiToken"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/argo",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/argo:Argo": "Argo"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/authenticatedOriginPulls",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/authenticatedOriginPulls:AuthenticatedOriginPulls": "AuthenticatedOriginPulls"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/authenticatedOriginPullsCertificate",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/authenticatedOriginPullsCertificate:AuthenticatedOriginPullsCertificate": "AuthenticatedOriginPullsCertificate"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/botManagement",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/botManagement:BotManagement": "BotManagement"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/byoIpPrefix",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/byoIpPrefix:ByoIpPrefix": "ByoIpPrefix"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/certificatePack",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/certificatePack:CertificatePack": "CertificatePack"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/customHostname",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/customHostname:CustomHostname": "CustomHostname"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/customHostnameFallbackOrigin",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/customHostnameFallbackOrigin:CustomHostnameFallbackOrigin": "CustomHostnameFallbackOrigin"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/customPages",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/customPages:CustomPages": "CustomPages"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/customSsl",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/customSsl:CustomSsl": "CustomSsl"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/d1Database",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/d1Database:D1Database": "D1Database"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/deviceDexTest",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/deviceDexTest:DeviceDexTest": "DeviceDexTest"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/deviceManagedNetworks",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/deviceManagedNetworks:DeviceManagedNetworks": "DeviceManagedNetworks"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/devicePolicyCertificates",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/devicePolicyCertificates:DevicePolicyCertificates": "DevicePolicyCertificates"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/devicePostureIntegration",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/devicePostureIntegration:DevicePostureIntegration": "DevicePostureIntegration"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/devicePostureRule",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/devicePostureRule:DevicePostureRule": "DevicePostureRule"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/deviceSettingsPolicy",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/deviceSettingsPolicy:DeviceSettingsPolicy": "DeviceSettingsPolicy"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/dlpProfile",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/dlpProfile:DlpProfile": "DlpProfile"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/emailRoutingAddress",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/emailRoutingAddress:EmailRoutingAddress": "EmailRoutingAddress"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/emailRoutingCatchAll",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/emailRoutingCatchAll:EmailRoutingCatchAll": "EmailRoutingCatchAll"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/emailRoutingRule",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/emailRoutingRule:EmailRoutingRule": "EmailRoutingRule"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/emailRoutingSettings",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/emailRoutingSettings:EmailRoutingSettings": "EmailRoutingSettings"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/fallbackDomain",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/fallbackDomain:FallbackDomain": "FallbackDomain"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/filter",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/filter:Filter": "Filter"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/firewallRule",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/firewallRule:FirewallRule": "FirewallRule"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/greTunnel",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/greTunnel:GreTunnel": "GreTunnel"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/healthcheck",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/healthcheck:Healthcheck": "Healthcheck"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/hostnameTlsSetting",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/hostnameTlsSetting:HostnameTlsSetting": "HostnameTlsSetting"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/hostnameTlsSettingCiphers",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/hostnameTlsSettingCiphers:HostnameTlsSettingCiphers": "HostnameTlsSettingCiphers"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/hyperdriveConfig",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/hyperdriveConfig:HyperdriveConfig": "HyperdriveConfig"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/ipsecTunnel",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/ipsecTunnel:IpsecTunnel": "IpsecTunnel"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/keylessCertificate",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/keylessCertificate:KeylessCertificate": "KeylessCertificate"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/list",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/list:List": "List"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/listItem",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/listItem:ListItem": "ListItem"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/loadBalancer",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/loadBalancer:LoadBalancer": "LoadBalancer"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/loadBalancerMonitor",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/loadBalancerMonitor:LoadBalancerMonitor": "LoadBalancerMonitor"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/loadBalancerPool",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/loadBalancerPool:LoadBalancerPool": "LoadBalancerPool"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/logpullRetention",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/logpullRetention:LogpullRetention": "LogpullRetention"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/logpushJob",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/logpushJob:LogpushJob": "LogpushJob"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/logpushOwnershipChallenge",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/logpushOwnershipChallenge:LogpushOwnershipChallenge": "LogpushOwnershipChallenge"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/magicFirewallRuleset",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/magicFirewallRuleset:MagicFirewallRuleset": "MagicFirewallRuleset"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/managedHeaders",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/managedHeaders:ManagedHeaders": "ManagedHeaders"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/mtlsCertificate",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/mtlsCertificate:MtlsCertificate": "MtlsCertificate"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/notificationPolicy",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/notificationPolicy:NotificationPolicy": "NotificationPolicy"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/notificationPolicyWebhooks",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/notificationPolicyWebhooks:NotificationPolicyWebhooks": "NotificationPolicyWebhooks"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/observatoryScheduledTest",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/observatoryScheduledTest:ObservatoryScheduledTest": "ObservatoryScheduledTest"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/originCaCertificate",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/originCaCertificate:OriginCaCertificate": "OriginCaCertificate"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/pageRule",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/pageRule:PageRule": "PageRule"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/pagesDomain",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/pagesDomain:PagesDomain": "PagesDomain"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/pagesProject",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/pagesProject:PagesProject": "PagesProject"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/queue",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/queue:Queue": "Queue"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/r2Bucket",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/r2Bucket:R2Bucket": "R2Bucket"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/rateLimit",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/rateLimit:RateLimit": "RateLimit"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/record",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/record:Record": "Record"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/regionalHostname",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/regionalHostname:RegionalHostname": "RegionalHostname"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/regionalTieredCache",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/regionalTieredCache:RegionalTieredCache": "RegionalTieredCache"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/riskBehavior",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/riskBehavior:RiskBehavior": "RiskBehavior"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/ruleset",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/ruleset:Ruleset": "Ruleset"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/spectrumApplication",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/spectrumApplication:SpectrumApplication": "SpectrumApplication"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/splitTunnel",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/splitTunnel:SplitTunnel": "SplitTunnel"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/staticRoute",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/staticRoute:StaticRoute": "StaticRoute"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/teamsAccount",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/teamsAccount:TeamsAccount": "TeamsAccount"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/teamsList",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/teamsList:TeamsList": "TeamsList"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/teamsLocation",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/teamsLocation:TeamsLocation": "TeamsLocation"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/teamsProxyEndpoint",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/teamsProxyEndpoint:TeamsProxyEndpoint": "TeamsProxyEndpoint"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/teamsRule",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/teamsRule:TeamsRule": "TeamsRule"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/tieredCache",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/tieredCache:TieredCache": "TieredCache"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/totalTls",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/totalTls:TotalTls": "TotalTls"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/tunnel",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/tunnel:Tunnel": "Tunnel"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/tunnelConfig",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/tunnelConfig:TunnelConfig": "TunnelConfig"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/tunnelRoute",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/tunnelRoute:TunnelRoute": "TunnelRoute"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/tunnelVirtualNetwork",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/tunnelVirtualNetwork:TunnelVirtualNetwork": "TunnelVirtualNetwork"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/turnstileWidget",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/turnstileWidget:TurnstileWidget": "TurnstileWidget"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/urlNormalizationSettings",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/urlNormalizationSettings:UrlNormalizationSettings": "UrlNormalizationSettings"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/userAgentBlockingRule",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/userAgentBlockingRule:UserAgentBlockingRule": "UserAgentBlockingRule"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/waitingRoom",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/waitingRoom:WaitingRoom": "WaitingRoom"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/waitingRoomEvent",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/waitingRoomEvent:WaitingRoomEvent": "WaitingRoomEvent"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/waitingRoomRules",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/waitingRoomRules:WaitingRoomRules": "WaitingRoomRules"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/waitingRoomSettings",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/waitingRoomSettings:WaitingRoomSettings": "WaitingRoomSettings"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/web3Hostname",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/web3Hostname:Web3Hostname": "Web3Hostname"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/webAnalyticsRule",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/webAnalyticsRule:WebAnalyticsRule": "WebAnalyticsRule"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/webAnalyticsSite",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/webAnalyticsSite:WebAnalyticsSite": "WebAnalyticsSite"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/workerCronTrigger",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/workerCronTrigger:WorkerCronTrigger": "WorkerCronTrigger"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/workerDomain",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/workerDomain:WorkerDomain": "WorkerDomain"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/workerRoute",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/workerRoute:WorkerRoute": "WorkerRoute"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/workerScript",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/workerScript:WorkerScript": "WorkerScript"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/workerSecret",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/workerSecret:WorkerSecret": "WorkerSecret"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/workersCronTrigger",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/workersCronTrigger:WorkersCronTrigger": "WorkersCronTrigger"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/workersDomain",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/workersDomain:WorkersDomain": "WorkersDomain"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/workersForPlatformsDispatchNamespace",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/workersForPlatformsDispatchNamespace:WorkersForPlatformsDispatchNamespace": "WorkersForPlatformsDispatchNamespace"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/workersForPlatformsNamespace",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/workersForPlatformsNamespace:WorkersForPlatformsNamespace": "WorkersForPlatformsNamespace"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/workersKv",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/workersKv:WorkersKv": "WorkersKv"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/workersKvNamespace",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/workersKvNamespace:WorkersKvNamespace": "WorkersKvNamespace"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/workersRoute",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/workersRoute:WorkersRoute": "WorkersRoute"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/workersScript",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/workersScript:WorkersScript": "WorkersScript"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/workersSecret",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/workersSecret:WorkersSecret": "WorkersSecret"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/zone",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/zone:Zone": "Zone"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/zoneCacheReserve",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/zoneCacheReserve:ZoneCacheReserve": "ZoneCacheReserve"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/zoneCacheVariants",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/zoneCacheVariants:ZoneCacheVariants": "ZoneCacheVariants"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/zoneDnssec",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/zoneDnssec:ZoneDnssec": "ZoneDnssec"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/zoneHold",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/zoneHold:ZoneHold": "ZoneHold"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/zoneLockdown",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/zoneLockdown:ZoneLockdown": "ZoneLockdown"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/zoneSettingsOverride",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/zoneSettingsOverride:ZoneSettingsOverride": "ZoneSettingsOverride"
  }
 }
]
""",
    resource_packages="""
[
 {
  "pkg": "cloudflare",
  "token": "pulumi:providers:cloudflare",
  "fqn": "pulumi_cloudflare",
  "class": "Provider"
 }
]
"""
)
