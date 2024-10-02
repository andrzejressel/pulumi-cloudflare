// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"fmt"

	"github.com/blang/semver"
	"github.com/pulumi/pulumi-cloudflare/sdk/v5/go/cloudflare/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type module struct {
	version semver.Version
}

func (m *module) Version() semver.Version {
	return m.version
}

func (m *module) Construct(ctx *pulumi.Context, name, typ, urn string) (r pulumi.Resource, err error) {
	switch typ {
	case "cloudflare:index/accessApplication:AccessApplication":
		r = &AccessApplication{}
	case "cloudflare:index/accessCaCertificate:AccessCaCertificate":
		r = &AccessCaCertificate{}
	case "cloudflare:index/accessCustomPage:AccessCustomPage":
		r = &AccessCustomPage{}
	case "cloudflare:index/accessGroup:AccessGroup":
		r = &AccessGroup{}
	case "cloudflare:index/accessIdentityProvider:AccessIdentityProvider":
		r = &AccessIdentityProvider{}
	case "cloudflare:index/accessKeysConfiguration:AccessKeysConfiguration":
		r = &AccessKeysConfiguration{}
	case "cloudflare:index/accessMutualTlsCertificate:AccessMutualTlsCertificate":
		r = &AccessMutualTlsCertificate{}
	case "cloudflare:index/accessMutualTlsHostnameSettings:AccessMutualTlsHostnameSettings":
		r = &AccessMutualTlsHostnameSettings{}
	case "cloudflare:index/accessOrganization:AccessOrganization":
		r = &AccessOrganization{}
	case "cloudflare:index/accessPolicy:AccessPolicy":
		r = &AccessPolicy{}
	case "cloudflare:index/accessRule:AccessRule":
		r = &AccessRule{}
	case "cloudflare:index/accessServiceToken:AccessServiceToken":
		r = &AccessServiceToken{}
	case "cloudflare:index/accessTag:AccessTag":
		r = &AccessTag{}
	case "cloudflare:index/account:Account":
		r = &Account{}
	case "cloudflare:index/accountMember:AccountMember":
		r = &AccountMember{}
	case "cloudflare:index/addressMap:AddressMap":
		r = &AddressMap{}
	case "cloudflare:index/apiShield:ApiShield":
		r = &ApiShield{}
	case "cloudflare:index/apiShieldOperation:ApiShieldOperation":
		r = &ApiShieldOperation{}
	case "cloudflare:index/apiShieldOperationSchemaValidationSettings:ApiShieldOperationSchemaValidationSettings":
		r = &ApiShieldOperationSchemaValidationSettings{}
	case "cloudflare:index/apiShieldSchema:ApiShieldSchema":
		r = &ApiShieldSchema{}
	case "cloudflare:index/apiShieldSchemaValidationSettings:ApiShieldSchemaValidationSettings":
		r = &ApiShieldSchemaValidationSettings{}
	case "cloudflare:index/apiToken:ApiToken":
		r = &ApiToken{}
	case "cloudflare:index/argo:Argo":
		r = &Argo{}
	case "cloudflare:index/authenticatedOriginPulls:AuthenticatedOriginPulls":
		r = &AuthenticatedOriginPulls{}
	case "cloudflare:index/authenticatedOriginPullsCertificate:AuthenticatedOriginPullsCertificate":
		r = &AuthenticatedOriginPullsCertificate{}
	case "cloudflare:index/botManagement:BotManagement":
		r = &BotManagement{}
	case "cloudflare:index/byoIpPrefix:ByoIpPrefix":
		r = &ByoIpPrefix{}
	case "cloudflare:index/certificatePack:CertificatePack":
		r = &CertificatePack{}
	case "cloudflare:index/cloudConnectorRules:CloudConnectorRules":
		r = &CloudConnectorRules{}
	case "cloudflare:index/customHostname:CustomHostname":
		r = &CustomHostname{}
	case "cloudflare:index/customHostnameFallbackOrigin:CustomHostnameFallbackOrigin":
		r = &CustomHostnameFallbackOrigin{}
	case "cloudflare:index/customPages:CustomPages":
		r = &CustomPages{}
	case "cloudflare:index/customSsl:CustomSsl":
		r = &CustomSsl{}
	case "cloudflare:index/d1Database:D1Database":
		r = &D1Database{}
	case "cloudflare:index/deviceDexTest:DeviceDexTest":
		r = &DeviceDexTest{}
	case "cloudflare:index/deviceManagedNetworks:DeviceManagedNetworks":
		r = &DeviceManagedNetworks{}
	case "cloudflare:index/devicePolicyCertificates:DevicePolicyCertificates":
		r = &DevicePolicyCertificates{}
	case "cloudflare:index/devicePostureIntegration:DevicePostureIntegration":
		r = &DevicePostureIntegration{}
	case "cloudflare:index/devicePostureRule:DevicePostureRule":
		r = &DevicePostureRule{}
	case "cloudflare:index/deviceSettingsPolicy:DeviceSettingsPolicy":
		r = &DeviceSettingsPolicy{}
	case "cloudflare:index/dlpProfile:DlpProfile":
		r = &DlpProfile{}
	case "cloudflare:index/emailRoutingAddress:EmailRoutingAddress":
		r = &EmailRoutingAddress{}
	case "cloudflare:index/emailRoutingCatchAll:EmailRoutingCatchAll":
		r = &EmailRoutingCatchAll{}
	case "cloudflare:index/emailRoutingRule:EmailRoutingRule":
		r = &EmailRoutingRule{}
	case "cloudflare:index/emailRoutingSettings:EmailRoutingSettings":
		r = &EmailRoutingSettings{}
	case "cloudflare:index/fallbackDomain:FallbackDomain":
		r = &FallbackDomain{}
	case "cloudflare:index/filter:Filter":
		r = &Filter{}
	case "cloudflare:index/firewallRule:FirewallRule":
		r = &FirewallRule{}
	case "cloudflare:index/greTunnel:GreTunnel":
		r = &GreTunnel{}
	case "cloudflare:index/healthcheck:Healthcheck":
		r = &Healthcheck{}
	case "cloudflare:index/hostnameTlsSetting:HostnameTlsSetting":
		r = &HostnameTlsSetting{}
	case "cloudflare:index/hostnameTlsSettingCiphers:HostnameTlsSettingCiphers":
		r = &HostnameTlsSettingCiphers{}
	case "cloudflare:index/hyperdriveConfig:HyperdriveConfig":
		r = &HyperdriveConfig{}
	case "cloudflare:index/infrastructureAccessTarget:InfrastructureAccessTarget":
		r = &InfrastructureAccessTarget{}
	case "cloudflare:index/ipsecTunnel:IpsecTunnel":
		r = &IpsecTunnel{}
	case "cloudflare:index/keylessCertificate:KeylessCertificate":
		r = &KeylessCertificate{}
	case "cloudflare:index/list:List":
		r = &List{}
	case "cloudflare:index/listItem:ListItem":
		r = &ListItem{}
	case "cloudflare:index/loadBalancer:LoadBalancer":
		r = &LoadBalancer{}
	case "cloudflare:index/loadBalancerMonitor:LoadBalancerMonitor":
		r = &LoadBalancerMonitor{}
	case "cloudflare:index/loadBalancerPool:LoadBalancerPool":
		r = &LoadBalancerPool{}
	case "cloudflare:index/logpullRetention:LogpullRetention":
		r = &LogpullRetention{}
	case "cloudflare:index/logpushJob:LogpushJob":
		r = &LogpushJob{}
	case "cloudflare:index/logpushOwnershipChallenge:LogpushOwnershipChallenge":
		r = &LogpushOwnershipChallenge{}
	case "cloudflare:index/magicFirewallRuleset:MagicFirewallRuleset":
		r = &MagicFirewallRuleset{}
	case "cloudflare:index/magicWanGreTunnel:MagicWanGreTunnel":
		r = &MagicWanGreTunnel{}
	case "cloudflare:index/magicWanIpsecTunnel:MagicWanIpsecTunnel":
		r = &MagicWanIpsecTunnel{}
	case "cloudflare:index/magicWanStaticRoute:MagicWanStaticRoute":
		r = &MagicWanStaticRoute{}
	case "cloudflare:index/managedHeaders:ManagedHeaders":
		r = &ManagedHeaders{}
	case "cloudflare:index/mtlsCertificate:MtlsCertificate":
		r = &MtlsCertificate{}
	case "cloudflare:index/notificationPolicy:NotificationPolicy":
		r = &NotificationPolicy{}
	case "cloudflare:index/notificationPolicyWebhooks:NotificationPolicyWebhooks":
		r = &NotificationPolicyWebhooks{}
	case "cloudflare:index/observatoryScheduledTest:ObservatoryScheduledTest":
		r = &ObservatoryScheduledTest{}
	case "cloudflare:index/originCaCertificate:OriginCaCertificate":
		r = &OriginCaCertificate{}
	case "cloudflare:index/pageRule:PageRule":
		r = &PageRule{}
	case "cloudflare:index/pagesDomain:PagesDomain":
		r = &PagesDomain{}
	case "cloudflare:index/pagesProject:PagesProject":
		r = &PagesProject{}
	case "cloudflare:index/queue:Queue":
		r = &Queue{}
	case "cloudflare:index/r2Bucket:R2Bucket":
		r = &R2Bucket{}
	case "cloudflare:index/rateLimit:RateLimit":
		r = &RateLimit{}
	case "cloudflare:index/record:Record":
		r = &Record{}
	case "cloudflare:index/regionalHostname:RegionalHostname":
		r = &RegionalHostname{}
	case "cloudflare:index/regionalTieredCache:RegionalTieredCache":
		r = &RegionalTieredCache{}
	case "cloudflare:index/riskBehavior:RiskBehavior":
		r = &RiskBehavior{}
	case "cloudflare:index/ruleset:Ruleset":
		r = &Ruleset{}
	case "cloudflare:index/spectrumApplication:SpectrumApplication":
		r = &SpectrumApplication{}
	case "cloudflare:index/splitTunnel:SplitTunnel":
		r = &SplitTunnel{}
	case "cloudflare:index/staticRoute:StaticRoute":
		r = &StaticRoute{}
	case "cloudflare:index/teamsAccount:TeamsAccount":
		r = &TeamsAccount{}
	case "cloudflare:index/teamsList:TeamsList":
		r = &TeamsList{}
	case "cloudflare:index/teamsLocation:TeamsLocation":
		r = &TeamsLocation{}
	case "cloudflare:index/teamsProxyEndpoint:TeamsProxyEndpoint":
		r = &TeamsProxyEndpoint{}
	case "cloudflare:index/teamsRule:TeamsRule":
		r = &TeamsRule{}
	case "cloudflare:index/tieredCache:TieredCache":
		r = &TieredCache{}
	case "cloudflare:index/totalTls:TotalTls":
		r = &TotalTls{}
	case "cloudflare:index/tunnel:Tunnel":
		r = &Tunnel{}
	case "cloudflare:index/tunnelConfig:TunnelConfig":
		r = &TunnelConfig{}
	case "cloudflare:index/tunnelRoute:TunnelRoute":
		r = &TunnelRoute{}
	case "cloudflare:index/tunnelVirtualNetwork:TunnelVirtualNetwork":
		r = &TunnelVirtualNetwork{}
	case "cloudflare:index/turnstileWidget:TurnstileWidget":
		r = &TurnstileWidget{}
	case "cloudflare:index/urlNormalizationSettings:UrlNormalizationSettings":
		r = &UrlNormalizationSettings{}
	case "cloudflare:index/userAgentBlockingRule:UserAgentBlockingRule":
		r = &UserAgentBlockingRule{}
	case "cloudflare:index/waitingRoom:WaitingRoom":
		r = &WaitingRoom{}
	case "cloudflare:index/waitingRoomEvent:WaitingRoomEvent":
		r = &WaitingRoomEvent{}
	case "cloudflare:index/waitingRoomRules:WaitingRoomRules":
		r = &WaitingRoomRules{}
	case "cloudflare:index/waitingRoomSettings:WaitingRoomSettings":
		r = &WaitingRoomSettings{}
	case "cloudflare:index/web3Hostname:Web3Hostname":
		r = &Web3Hostname{}
	case "cloudflare:index/webAnalyticsRule:WebAnalyticsRule":
		r = &WebAnalyticsRule{}
	case "cloudflare:index/webAnalyticsSite:WebAnalyticsSite":
		r = &WebAnalyticsSite{}
	case "cloudflare:index/workerCronTrigger:WorkerCronTrigger":
		r = &WorkerCronTrigger{}
	case "cloudflare:index/workerDomain:WorkerDomain":
		r = &WorkerDomain{}
	case "cloudflare:index/workerRoute:WorkerRoute":
		r = &WorkerRoute{}
	case "cloudflare:index/workerScript:WorkerScript":
		r = &WorkerScript{}
	case "cloudflare:index/workerSecret:WorkerSecret":
		r = &WorkerSecret{}
	case "cloudflare:index/workersCronTrigger:WorkersCronTrigger":
		r = &WorkersCronTrigger{}
	case "cloudflare:index/workersDomain:WorkersDomain":
		r = &WorkersDomain{}
	case "cloudflare:index/workersForPlatformsDispatchNamespace:WorkersForPlatformsDispatchNamespace":
		r = &WorkersForPlatformsDispatchNamespace{}
	case "cloudflare:index/workersForPlatformsNamespace:WorkersForPlatformsNamespace":
		r = &WorkersForPlatformsNamespace{}
	case "cloudflare:index/workersKv:WorkersKv":
		r = &WorkersKv{}
	case "cloudflare:index/workersKvNamespace:WorkersKvNamespace":
		r = &WorkersKvNamespace{}
	case "cloudflare:index/workersRoute:WorkersRoute":
		r = &WorkersRoute{}
	case "cloudflare:index/workersScript:WorkersScript":
		r = &WorkersScript{}
	case "cloudflare:index/workersSecret:WorkersSecret":
		r = &WorkersSecret{}
	case "cloudflare:index/zeroTrustAccessApplication:ZeroTrustAccessApplication":
		r = &ZeroTrustAccessApplication{}
	case "cloudflare:index/zeroTrustAccessCustomPage:ZeroTrustAccessCustomPage":
		r = &ZeroTrustAccessCustomPage{}
	case "cloudflare:index/zeroTrustAccessGroup:ZeroTrustAccessGroup":
		r = &ZeroTrustAccessGroup{}
	case "cloudflare:index/zeroTrustAccessIdentityProvider:ZeroTrustAccessIdentityProvider":
		r = &ZeroTrustAccessIdentityProvider{}
	case "cloudflare:index/zeroTrustAccessMtlsCertificate:ZeroTrustAccessMtlsCertificate":
		r = &ZeroTrustAccessMtlsCertificate{}
	case "cloudflare:index/zeroTrustAccessMtlsHostnameSettings:ZeroTrustAccessMtlsHostnameSettings":
		r = &ZeroTrustAccessMtlsHostnameSettings{}
	case "cloudflare:index/zeroTrustAccessOrganization:ZeroTrustAccessOrganization":
		r = &ZeroTrustAccessOrganization{}
	case "cloudflare:index/zeroTrustAccessPolicy:ZeroTrustAccessPolicy":
		r = &ZeroTrustAccessPolicy{}
	case "cloudflare:index/zeroTrustAccessServiceToken:ZeroTrustAccessServiceToken":
		r = &ZeroTrustAccessServiceToken{}
	case "cloudflare:index/zeroTrustAccessShortLivedCertificate:ZeroTrustAccessShortLivedCertificate":
		r = &ZeroTrustAccessShortLivedCertificate{}
	case "cloudflare:index/zeroTrustAccessTag:ZeroTrustAccessTag":
		r = &ZeroTrustAccessTag{}
	case "cloudflare:index/zeroTrustDeviceCertificates:ZeroTrustDeviceCertificates":
		r = &ZeroTrustDeviceCertificates{}
	case "cloudflare:index/zeroTrustDeviceManagedNetworks:ZeroTrustDeviceManagedNetworks":
		r = &ZeroTrustDeviceManagedNetworks{}
	case "cloudflare:index/zeroTrustDevicePostureIntegration:ZeroTrustDevicePostureIntegration":
		r = &ZeroTrustDevicePostureIntegration{}
	case "cloudflare:index/zeroTrustDevicePostureRule:ZeroTrustDevicePostureRule":
		r = &ZeroTrustDevicePostureRule{}
	case "cloudflare:index/zeroTrustDeviceProfiles:ZeroTrustDeviceProfiles":
		r = &ZeroTrustDeviceProfiles{}
	case "cloudflare:index/zeroTrustDexTest:ZeroTrustDexTest":
		r = &ZeroTrustDexTest{}
	case "cloudflare:index/zeroTrustDlpProfile:ZeroTrustDlpProfile":
		r = &ZeroTrustDlpProfile{}
	case "cloudflare:index/zeroTrustDnsLocation:ZeroTrustDnsLocation":
		r = &ZeroTrustDnsLocation{}
	case "cloudflare:index/zeroTrustGatewayCertificate:ZeroTrustGatewayCertificate":
		r = &ZeroTrustGatewayCertificate{}
	case "cloudflare:index/zeroTrustGatewayPolicy:ZeroTrustGatewayPolicy":
		r = &ZeroTrustGatewayPolicy{}
	case "cloudflare:index/zeroTrustGatewayProxyEndpoint:ZeroTrustGatewayProxyEndpoint":
		r = &ZeroTrustGatewayProxyEndpoint{}
	case "cloudflare:index/zeroTrustGatewaySettings:ZeroTrustGatewaySettings":
		r = &ZeroTrustGatewaySettings{}
	case "cloudflare:index/zeroTrustKeyAccessKeyConfiguration:ZeroTrustKeyAccessKeyConfiguration":
		r = &ZeroTrustKeyAccessKeyConfiguration{}
	case "cloudflare:index/zeroTrustList:ZeroTrustList":
		r = &ZeroTrustList{}
	case "cloudflare:index/zeroTrustLocalFallbackDomain:ZeroTrustLocalFallbackDomain":
		r = &ZeroTrustLocalFallbackDomain{}
	case "cloudflare:index/zeroTrustRiskBehavior:ZeroTrustRiskBehavior":
		r = &ZeroTrustRiskBehavior{}
	case "cloudflare:index/zeroTrustRiskScoreIntegration:ZeroTrustRiskScoreIntegration":
		r = &ZeroTrustRiskScoreIntegration{}
	case "cloudflare:index/zeroTrustSplitTunnel:ZeroTrustSplitTunnel":
		r = &ZeroTrustSplitTunnel{}
	case "cloudflare:index/zeroTrustTunnelCloudflared:ZeroTrustTunnelCloudflared":
		r = &ZeroTrustTunnelCloudflared{}
	case "cloudflare:index/zeroTrustTunnelCloudflaredConfig:ZeroTrustTunnelCloudflaredConfig":
		r = &ZeroTrustTunnelCloudflaredConfig{}
	case "cloudflare:index/zeroTrustTunnelRoute:ZeroTrustTunnelRoute":
		r = &ZeroTrustTunnelRoute{}
	case "cloudflare:index/zeroTrustTunnelVirtualNetwork:ZeroTrustTunnelVirtualNetwork":
		r = &ZeroTrustTunnelVirtualNetwork{}
	case "cloudflare:index/zone:Zone":
		r = &Zone{}
	case "cloudflare:index/zoneCacheReserve:ZoneCacheReserve":
		r = &ZoneCacheReserve{}
	case "cloudflare:index/zoneCacheVariants:ZoneCacheVariants":
		r = &ZoneCacheVariants{}
	case "cloudflare:index/zoneDnssec:ZoneDnssec":
		r = &ZoneDnssec{}
	case "cloudflare:index/zoneHold:ZoneHold":
		r = &ZoneHold{}
	case "cloudflare:index/zoneLockdown:ZoneLockdown":
		r = &ZoneLockdown{}
	case "cloudflare:index/zoneSettingsOverride:ZoneSettingsOverride":
		r = &ZoneSettingsOverride{}
	default:
		return nil, fmt.Errorf("unknown resource type: %s", typ)
	}

	err = ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return
}

type pkg struct {
	version semver.Version
}

func (p *pkg) Version() semver.Version {
	return p.version
}

func (p *pkg) ConstructProvider(ctx *pulumi.Context, name, typ, urn string) (pulumi.ProviderResource, error) {
	if typ != "pulumi:providers:cloudflare" {
		return nil, fmt.Errorf("unknown provider type: %s", typ)
	}

	r := &Provider{}
	err := ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return r, err
}

func init() {
	version, err := internal.PkgVersion()
	if err != nil {
		version = semver.Version{Major: 1}
	}
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/accessApplication",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/accessCaCertificate",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/accessCustomPage",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/accessGroup",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/accessIdentityProvider",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/accessKeysConfiguration",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/accessMutualTlsCertificate",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/accessMutualTlsHostnameSettings",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/accessOrganization",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/accessPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/accessRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/accessServiceToken",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/accessTag",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/account",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/accountMember",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/addressMap",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/apiShield",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/apiShieldOperation",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/apiShieldOperationSchemaValidationSettings",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/apiShieldSchema",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/apiShieldSchemaValidationSettings",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/apiToken",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/argo",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/authenticatedOriginPulls",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/authenticatedOriginPullsCertificate",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/botManagement",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/byoIpPrefix",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/certificatePack",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/cloudConnectorRules",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/customHostname",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/customHostnameFallbackOrigin",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/customPages",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/customSsl",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/d1Database",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/deviceDexTest",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/deviceManagedNetworks",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/devicePolicyCertificates",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/devicePostureIntegration",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/devicePostureRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/deviceSettingsPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/dlpProfile",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/emailRoutingAddress",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/emailRoutingCatchAll",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/emailRoutingRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/emailRoutingSettings",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/fallbackDomain",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/filter",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/firewallRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/greTunnel",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/healthcheck",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/hostnameTlsSetting",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/hostnameTlsSettingCiphers",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/hyperdriveConfig",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/infrastructureAccessTarget",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/ipsecTunnel",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/keylessCertificate",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/list",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/listItem",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/loadBalancer",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/loadBalancerMonitor",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/loadBalancerPool",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/logpullRetention",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/logpushJob",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/logpushOwnershipChallenge",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/magicFirewallRuleset",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/magicWanGreTunnel",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/magicWanIpsecTunnel",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/magicWanStaticRoute",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/managedHeaders",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/mtlsCertificate",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/notificationPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/notificationPolicyWebhooks",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/observatoryScheduledTest",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/originCaCertificate",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/pageRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/pagesDomain",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/pagesProject",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/queue",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/r2Bucket",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/rateLimit",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/record",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/regionalHostname",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/regionalTieredCache",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/riskBehavior",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/ruleset",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/spectrumApplication",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/splitTunnel",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/staticRoute",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/teamsAccount",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/teamsList",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/teamsLocation",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/teamsProxyEndpoint",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/teamsRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/tieredCache",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/totalTls",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/tunnel",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/tunnelConfig",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/tunnelRoute",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/tunnelVirtualNetwork",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/turnstileWidget",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/urlNormalizationSettings",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/userAgentBlockingRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/waitingRoom",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/waitingRoomEvent",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/waitingRoomRules",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/waitingRoomSettings",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/web3Hostname",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/webAnalyticsRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/webAnalyticsSite",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/workerCronTrigger",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/workerDomain",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/workerRoute",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/workerScript",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/workerSecret",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/workersCronTrigger",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/workersDomain",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/workersForPlatformsDispatchNamespace",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/workersForPlatformsNamespace",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/workersKv",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/workersKvNamespace",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/workersRoute",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/workersScript",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/workersSecret",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/zeroTrustAccessApplication",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/zeroTrustAccessCustomPage",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/zeroTrustAccessGroup",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/zeroTrustAccessIdentityProvider",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/zeroTrustAccessMtlsCertificate",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/zeroTrustAccessMtlsHostnameSettings",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/zeroTrustAccessOrganization",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/zeroTrustAccessPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/zeroTrustAccessServiceToken",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/zeroTrustAccessShortLivedCertificate",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/zeroTrustAccessTag",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/zeroTrustDeviceCertificates",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/zeroTrustDeviceManagedNetworks",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/zeroTrustDevicePostureIntegration",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/zeroTrustDevicePostureRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/zeroTrustDeviceProfiles",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/zeroTrustDexTest",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/zeroTrustDlpProfile",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/zeroTrustDnsLocation",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/zeroTrustGatewayCertificate",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/zeroTrustGatewayPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/zeroTrustGatewayProxyEndpoint",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/zeroTrustGatewaySettings",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/zeroTrustKeyAccessKeyConfiguration",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/zeroTrustList",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/zeroTrustLocalFallbackDomain",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/zeroTrustRiskBehavior",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/zeroTrustRiskScoreIntegration",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/zeroTrustSplitTunnel",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/zeroTrustTunnelCloudflared",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/zeroTrustTunnelCloudflaredConfig",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/zeroTrustTunnelRoute",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/zeroTrustTunnelVirtualNetwork",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/zone",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/zoneCacheReserve",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/zoneCacheVariants",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/zoneDnssec",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/zoneHold",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/zoneLockdown",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/zoneSettingsOverride",
		&module{version},
	)
	pulumi.RegisterResourcePackage(
		"cloudflare",
		&pkg{version},
	)
}
