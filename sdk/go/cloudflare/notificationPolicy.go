// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-cloudflare/sdk/v5/go/cloudflare/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Provides a resource, that manages a notification policy for
// Cloudflare's products. The delivery mechanisms supported are email,
// webhooks, and PagerDuty.
//
// ## Import
//
// ```sh
//
//	$ pulumi import cloudflare:index/notificationPolicy:NotificationPolicy example <account_id>/<policy_id>
//
// ```
type NotificationPolicy struct {
	pulumi.CustomResourceState

	// The account identifier to target for the resource.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// The event type that will trigger the dispatch of a notification. See the developer documentation for descriptions of [available alert types](https://developers.cloudflare.com/fundamentals/notifications/notification-available/). Available values: `accessCustomCertificateExpirationType`, `advancedDdosAttackL4Alert`, `advancedDdosAttackL7Alert`, `bgpHijackNotification`, `billingUsageAlert`, `blockNotificationBlockRemoved`, `blockNotificationNewBlock`, `blockNotificationReviewRejected`, `clickhouseAlertFwAnomaly`, `clickhouseAlertFwEntAnomaly`, `customSslCertificateEventType`, `dedicatedSslCertificateEventType`, `dosAttackL4`, `dosAttackL7`, `expiringServiceTokenAlert`, `failingLogpushJobDisabledAlert`, `fbmAutoAdvertisement`, `fbmDosdAttack`, `fbmVolumetricAttack`, `healthCheckStatusNotification`, `hostnameAopCustomCertificateExpirationType`, `httpAlertEdgeError`, `httpAlertOriginError`, `loadBalancingHealthAlert`, `loadBalancingPoolEnablementAlert`, `realOriginMonitoring`, `scriptmonitorAlertNewCodeChangeDetections`, `scriptmonitorAlertNewHosts`, `scriptmonitorAlertNewMaliciousHosts`, `scriptmonitorAlertNewMaliciousScripts`, `scriptmonitorAlertNewMaliciousUrl`, `scriptmonitorAlertNewMaxLengthResourceUrl`, `scriptmonitorAlertNewResources`, `secondaryDnsAllPrimariesFailing`, `secondaryDnsPrimariesFailing`, `secondaryDnsZoneSuccessfullyUpdated`, `secondaryDnsZoneValidationWarning`, `sentinelAlert`, `streamLiveNotifications`, `tunnelHealthEvent`, `tunnelUpdateEvent`, `universalSslEventType`, `webAnalyticsMetricsUpdate`, `weeklyAccountOverview`, `workersAlert`, `zoneAopCustomCertificateExpirationType`.
	AlertType pulumi.StringOutput `pulumi:"alertType"`
	// When the notification policy was created.
	Created pulumi.StringOutput `pulumi:"created"`
	// Description of the notification policy.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The email id to which the notification should be dispatched. One of email, webhooks, or PagerDuty mechanisms is required.
	EmailIntegrations NotificationPolicyEmailIntegrationArrayOutput `pulumi:"emailIntegrations"`
	// The status of the notification policy.
	Enabled pulumi.BoolOutput `pulumi:"enabled"`
	// An optional nested block of filters that applies to the selected `alertType`. A key-value map that specifies the type of filter and the values to match against (refer to the alert type block for available fields).
	Filters NotificationPolicyFiltersPtrOutput `pulumi:"filters"`
	// When the notification policy was last modified.
	Modified pulumi.StringOutput `pulumi:"modified"`
	// The name of the notification policy.
	Name pulumi.StringOutput `pulumi:"name"`
	// The unique id of a configured pagerduty endpoint to which the notification should be dispatched. One of email, webhooks, or PagerDuty mechanisms is required.
	PagerdutyIntegrations NotificationPolicyPagerdutyIntegrationArrayOutput `pulumi:"pagerdutyIntegrations"`
	// The unique id of a configured webhooks endpoint to which the notification should be dispatched. One of email, webhooks, or PagerDuty mechanisms is required.
	WebhooksIntegrations NotificationPolicyWebhooksIntegrationArrayOutput `pulumi:"webhooksIntegrations"`
}

// NewNotificationPolicy registers a new resource with the given unique name, arguments, and options.
func NewNotificationPolicy(ctx *pulumi.Context,
	name string, args *NotificationPolicyArgs, opts ...pulumi.ResourceOption) (*NotificationPolicy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	if args.AlertType == nil {
		return nil, errors.New("invalid value for required argument 'AlertType'")
	}
	if args.Enabled == nil {
		return nil, errors.New("invalid value for required argument 'Enabled'")
	}
	if args.Name == nil {
		return nil, errors.New("invalid value for required argument 'Name'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource NotificationPolicy
	err := ctx.RegisterResource("cloudflare:index/notificationPolicy:NotificationPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetNotificationPolicy gets an existing NotificationPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNotificationPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *NotificationPolicyState, opts ...pulumi.ResourceOption) (*NotificationPolicy, error) {
	var resource NotificationPolicy
	err := ctx.ReadResource("cloudflare:index/notificationPolicy:NotificationPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering NotificationPolicy resources.
type notificationPolicyState struct {
	// The account identifier to target for the resource.
	AccountId *string `pulumi:"accountId"`
	// The event type that will trigger the dispatch of a notification. See the developer documentation for descriptions of [available alert types](https://developers.cloudflare.com/fundamentals/notifications/notification-available/). Available values: `accessCustomCertificateExpirationType`, `advancedDdosAttackL4Alert`, `advancedDdosAttackL7Alert`, `bgpHijackNotification`, `billingUsageAlert`, `blockNotificationBlockRemoved`, `blockNotificationNewBlock`, `blockNotificationReviewRejected`, `clickhouseAlertFwAnomaly`, `clickhouseAlertFwEntAnomaly`, `customSslCertificateEventType`, `dedicatedSslCertificateEventType`, `dosAttackL4`, `dosAttackL7`, `expiringServiceTokenAlert`, `failingLogpushJobDisabledAlert`, `fbmAutoAdvertisement`, `fbmDosdAttack`, `fbmVolumetricAttack`, `healthCheckStatusNotification`, `hostnameAopCustomCertificateExpirationType`, `httpAlertEdgeError`, `httpAlertOriginError`, `loadBalancingHealthAlert`, `loadBalancingPoolEnablementAlert`, `realOriginMonitoring`, `scriptmonitorAlertNewCodeChangeDetections`, `scriptmonitorAlertNewHosts`, `scriptmonitorAlertNewMaliciousHosts`, `scriptmonitorAlertNewMaliciousScripts`, `scriptmonitorAlertNewMaliciousUrl`, `scriptmonitorAlertNewMaxLengthResourceUrl`, `scriptmonitorAlertNewResources`, `secondaryDnsAllPrimariesFailing`, `secondaryDnsPrimariesFailing`, `secondaryDnsZoneSuccessfullyUpdated`, `secondaryDnsZoneValidationWarning`, `sentinelAlert`, `streamLiveNotifications`, `tunnelHealthEvent`, `tunnelUpdateEvent`, `universalSslEventType`, `webAnalyticsMetricsUpdate`, `weeklyAccountOverview`, `workersAlert`, `zoneAopCustomCertificateExpirationType`.
	AlertType *string `pulumi:"alertType"`
	// When the notification policy was created.
	Created *string `pulumi:"created"`
	// Description of the notification policy.
	Description *string `pulumi:"description"`
	// The email id to which the notification should be dispatched. One of email, webhooks, or PagerDuty mechanisms is required.
	EmailIntegrations []NotificationPolicyEmailIntegration `pulumi:"emailIntegrations"`
	// The status of the notification policy.
	Enabled *bool `pulumi:"enabled"`
	// An optional nested block of filters that applies to the selected `alertType`. A key-value map that specifies the type of filter and the values to match against (refer to the alert type block for available fields).
	Filters *NotificationPolicyFilters `pulumi:"filters"`
	// When the notification policy was last modified.
	Modified *string `pulumi:"modified"`
	// The name of the notification policy.
	Name *string `pulumi:"name"`
	// The unique id of a configured pagerduty endpoint to which the notification should be dispatched. One of email, webhooks, or PagerDuty mechanisms is required.
	PagerdutyIntegrations []NotificationPolicyPagerdutyIntegration `pulumi:"pagerdutyIntegrations"`
	// The unique id of a configured webhooks endpoint to which the notification should be dispatched. One of email, webhooks, or PagerDuty mechanisms is required.
	WebhooksIntegrations []NotificationPolicyWebhooksIntegration `pulumi:"webhooksIntegrations"`
}

type NotificationPolicyState struct {
	// The account identifier to target for the resource.
	AccountId pulumi.StringPtrInput
	// The event type that will trigger the dispatch of a notification. See the developer documentation for descriptions of [available alert types](https://developers.cloudflare.com/fundamentals/notifications/notification-available/). Available values: `accessCustomCertificateExpirationType`, `advancedDdosAttackL4Alert`, `advancedDdosAttackL7Alert`, `bgpHijackNotification`, `billingUsageAlert`, `blockNotificationBlockRemoved`, `blockNotificationNewBlock`, `blockNotificationReviewRejected`, `clickhouseAlertFwAnomaly`, `clickhouseAlertFwEntAnomaly`, `customSslCertificateEventType`, `dedicatedSslCertificateEventType`, `dosAttackL4`, `dosAttackL7`, `expiringServiceTokenAlert`, `failingLogpushJobDisabledAlert`, `fbmAutoAdvertisement`, `fbmDosdAttack`, `fbmVolumetricAttack`, `healthCheckStatusNotification`, `hostnameAopCustomCertificateExpirationType`, `httpAlertEdgeError`, `httpAlertOriginError`, `loadBalancingHealthAlert`, `loadBalancingPoolEnablementAlert`, `realOriginMonitoring`, `scriptmonitorAlertNewCodeChangeDetections`, `scriptmonitorAlertNewHosts`, `scriptmonitorAlertNewMaliciousHosts`, `scriptmonitorAlertNewMaliciousScripts`, `scriptmonitorAlertNewMaliciousUrl`, `scriptmonitorAlertNewMaxLengthResourceUrl`, `scriptmonitorAlertNewResources`, `secondaryDnsAllPrimariesFailing`, `secondaryDnsPrimariesFailing`, `secondaryDnsZoneSuccessfullyUpdated`, `secondaryDnsZoneValidationWarning`, `sentinelAlert`, `streamLiveNotifications`, `tunnelHealthEvent`, `tunnelUpdateEvent`, `universalSslEventType`, `webAnalyticsMetricsUpdate`, `weeklyAccountOverview`, `workersAlert`, `zoneAopCustomCertificateExpirationType`.
	AlertType pulumi.StringPtrInput
	// When the notification policy was created.
	Created pulumi.StringPtrInput
	// Description of the notification policy.
	Description pulumi.StringPtrInput
	// The email id to which the notification should be dispatched. One of email, webhooks, or PagerDuty mechanisms is required.
	EmailIntegrations NotificationPolicyEmailIntegrationArrayInput
	// The status of the notification policy.
	Enabled pulumi.BoolPtrInput
	// An optional nested block of filters that applies to the selected `alertType`. A key-value map that specifies the type of filter and the values to match against (refer to the alert type block for available fields).
	Filters NotificationPolicyFiltersPtrInput
	// When the notification policy was last modified.
	Modified pulumi.StringPtrInput
	// The name of the notification policy.
	Name pulumi.StringPtrInput
	// The unique id of a configured pagerduty endpoint to which the notification should be dispatched. One of email, webhooks, or PagerDuty mechanisms is required.
	PagerdutyIntegrations NotificationPolicyPagerdutyIntegrationArrayInput
	// The unique id of a configured webhooks endpoint to which the notification should be dispatched. One of email, webhooks, or PagerDuty mechanisms is required.
	WebhooksIntegrations NotificationPolicyWebhooksIntegrationArrayInput
}

func (NotificationPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*notificationPolicyState)(nil)).Elem()
}

type notificationPolicyArgs struct {
	// The account identifier to target for the resource.
	AccountId string `pulumi:"accountId"`
	// The event type that will trigger the dispatch of a notification. See the developer documentation for descriptions of [available alert types](https://developers.cloudflare.com/fundamentals/notifications/notification-available/). Available values: `accessCustomCertificateExpirationType`, `advancedDdosAttackL4Alert`, `advancedDdosAttackL7Alert`, `bgpHijackNotification`, `billingUsageAlert`, `blockNotificationBlockRemoved`, `blockNotificationNewBlock`, `blockNotificationReviewRejected`, `clickhouseAlertFwAnomaly`, `clickhouseAlertFwEntAnomaly`, `customSslCertificateEventType`, `dedicatedSslCertificateEventType`, `dosAttackL4`, `dosAttackL7`, `expiringServiceTokenAlert`, `failingLogpushJobDisabledAlert`, `fbmAutoAdvertisement`, `fbmDosdAttack`, `fbmVolumetricAttack`, `healthCheckStatusNotification`, `hostnameAopCustomCertificateExpirationType`, `httpAlertEdgeError`, `httpAlertOriginError`, `loadBalancingHealthAlert`, `loadBalancingPoolEnablementAlert`, `realOriginMonitoring`, `scriptmonitorAlertNewCodeChangeDetections`, `scriptmonitorAlertNewHosts`, `scriptmonitorAlertNewMaliciousHosts`, `scriptmonitorAlertNewMaliciousScripts`, `scriptmonitorAlertNewMaliciousUrl`, `scriptmonitorAlertNewMaxLengthResourceUrl`, `scriptmonitorAlertNewResources`, `secondaryDnsAllPrimariesFailing`, `secondaryDnsPrimariesFailing`, `secondaryDnsZoneSuccessfullyUpdated`, `secondaryDnsZoneValidationWarning`, `sentinelAlert`, `streamLiveNotifications`, `tunnelHealthEvent`, `tunnelUpdateEvent`, `universalSslEventType`, `webAnalyticsMetricsUpdate`, `weeklyAccountOverview`, `workersAlert`, `zoneAopCustomCertificateExpirationType`.
	AlertType string `pulumi:"alertType"`
	// Description of the notification policy.
	Description *string `pulumi:"description"`
	// The email id to which the notification should be dispatched. One of email, webhooks, or PagerDuty mechanisms is required.
	EmailIntegrations []NotificationPolicyEmailIntegration `pulumi:"emailIntegrations"`
	// The status of the notification policy.
	Enabled bool `pulumi:"enabled"`
	// An optional nested block of filters that applies to the selected `alertType`. A key-value map that specifies the type of filter and the values to match against (refer to the alert type block for available fields).
	Filters *NotificationPolicyFilters `pulumi:"filters"`
	// The name of the notification policy.
	Name string `pulumi:"name"`
	// The unique id of a configured pagerduty endpoint to which the notification should be dispatched. One of email, webhooks, or PagerDuty mechanisms is required.
	PagerdutyIntegrations []NotificationPolicyPagerdutyIntegration `pulumi:"pagerdutyIntegrations"`
	// The unique id of a configured webhooks endpoint to which the notification should be dispatched. One of email, webhooks, or PagerDuty mechanisms is required.
	WebhooksIntegrations []NotificationPolicyWebhooksIntegration `pulumi:"webhooksIntegrations"`
}

// The set of arguments for constructing a NotificationPolicy resource.
type NotificationPolicyArgs struct {
	// The account identifier to target for the resource.
	AccountId pulumi.StringInput
	// The event type that will trigger the dispatch of a notification. See the developer documentation for descriptions of [available alert types](https://developers.cloudflare.com/fundamentals/notifications/notification-available/). Available values: `accessCustomCertificateExpirationType`, `advancedDdosAttackL4Alert`, `advancedDdosAttackL7Alert`, `bgpHijackNotification`, `billingUsageAlert`, `blockNotificationBlockRemoved`, `blockNotificationNewBlock`, `blockNotificationReviewRejected`, `clickhouseAlertFwAnomaly`, `clickhouseAlertFwEntAnomaly`, `customSslCertificateEventType`, `dedicatedSslCertificateEventType`, `dosAttackL4`, `dosAttackL7`, `expiringServiceTokenAlert`, `failingLogpushJobDisabledAlert`, `fbmAutoAdvertisement`, `fbmDosdAttack`, `fbmVolumetricAttack`, `healthCheckStatusNotification`, `hostnameAopCustomCertificateExpirationType`, `httpAlertEdgeError`, `httpAlertOriginError`, `loadBalancingHealthAlert`, `loadBalancingPoolEnablementAlert`, `realOriginMonitoring`, `scriptmonitorAlertNewCodeChangeDetections`, `scriptmonitorAlertNewHosts`, `scriptmonitorAlertNewMaliciousHosts`, `scriptmonitorAlertNewMaliciousScripts`, `scriptmonitorAlertNewMaliciousUrl`, `scriptmonitorAlertNewMaxLengthResourceUrl`, `scriptmonitorAlertNewResources`, `secondaryDnsAllPrimariesFailing`, `secondaryDnsPrimariesFailing`, `secondaryDnsZoneSuccessfullyUpdated`, `secondaryDnsZoneValidationWarning`, `sentinelAlert`, `streamLiveNotifications`, `tunnelHealthEvent`, `tunnelUpdateEvent`, `universalSslEventType`, `webAnalyticsMetricsUpdate`, `weeklyAccountOverview`, `workersAlert`, `zoneAopCustomCertificateExpirationType`.
	AlertType pulumi.StringInput
	// Description of the notification policy.
	Description pulumi.StringPtrInput
	// The email id to which the notification should be dispatched. One of email, webhooks, or PagerDuty mechanisms is required.
	EmailIntegrations NotificationPolicyEmailIntegrationArrayInput
	// The status of the notification policy.
	Enabled pulumi.BoolInput
	// An optional nested block of filters that applies to the selected `alertType`. A key-value map that specifies the type of filter and the values to match against (refer to the alert type block for available fields).
	Filters NotificationPolicyFiltersPtrInput
	// The name of the notification policy.
	Name pulumi.StringInput
	// The unique id of a configured pagerduty endpoint to which the notification should be dispatched. One of email, webhooks, or PagerDuty mechanisms is required.
	PagerdutyIntegrations NotificationPolicyPagerdutyIntegrationArrayInput
	// The unique id of a configured webhooks endpoint to which the notification should be dispatched. One of email, webhooks, or PagerDuty mechanisms is required.
	WebhooksIntegrations NotificationPolicyWebhooksIntegrationArrayInput
}

func (NotificationPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*notificationPolicyArgs)(nil)).Elem()
}

type NotificationPolicyInput interface {
	pulumi.Input

	ToNotificationPolicyOutput() NotificationPolicyOutput
	ToNotificationPolicyOutputWithContext(ctx context.Context) NotificationPolicyOutput
}

func (*NotificationPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((**NotificationPolicy)(nil)).Elem()
}

func (i *NotificationPolicy) ToNotificationPolicyOutput() NotificationPolicyOutput {
	return i.ToNotificationPolicyOutputWithContext(context.Background())
}

func (i *NotificationPolicy) ToNotificationPolicyOutputWithContext(ctx context.Context) NotificationPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NotificationPolicyOutput)
}

func (i *NotificationPolicy) ToOutput(ctx context.Context) pulumix.Output[*NotificationPolicy] {
	return pulumix.Output[*NotificationPolicy]{
		OutputState: i.ToNotificationPolicyOutputWithContext(ctx).OutputState,
	}
}

// NotificationPolicyArrayInput is an input type that accepts NotificationPolicyArray and NotificationPolicyArrayOutput values.
// You can construct a concrete instance of `NotificationPolicyArrayInput` via:
//
//	NotificationPolicyArray{ NotificationPolicyArgs{...} }
type NotificationPolicyArrayInput interface {
	pulumi.Input

	ToNotificationPolicyArrayOutput() NotificationPolicyArrayOutput
	ToNotificationPolicyArrayOutputWithContext(context.Context) NotificationPolicyArrayOutput
}

type NotificationPolicyArray []NotificationPolicyInput

func (NotificationPolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NotificationPolicy)(nil)).Elem()
}

func (i NotificationPolicyArray) ToNotificationPolicyArrayOutput() NotificationPolicyArrayOutput {
	return i.ToNotificationPolicyArrayOutputWithContext(context.Background())
}

func (i NotificationPolicyArray) ToNotificationPolicyArrayOutputWithContext(ctx context.Context) NotificationPolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NotificationPolicyArrayOutput)
}

func (i NotificationPolicyArray) ToOutput(ctx context.Context) pulumix.Output[[]*NotificationPolicy] {
	return pulumix.Output[[]*NotificationPolicy]{
		OutputState: i.ToNotificationPolicyArrayOutputWithContext(ctx).OutputState,
	}
}

// NotificationPolicyMapInput is an input type that accepts NotificationPolicyMap and NotificationPolicyMapOutput values.
// You can construct a concrete instance of `NotificationPolicyMapInput` via:
//
//	NotificationPolicyMap{ "key": NotificationPolicyArgs{...} }
type NotificationPolicyMapInput interface {
	pulumi.Input

	ToNotificationPolicyMapOutput() NotificationPolicyMapOutput
	ToNotificationPolicyMapOutputWithContext(context.Context) NotificationPolicyMapOutput
}

type NotificationPolicyMap map[string]NotificationPolicyInput

func (NotificationPolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NotificationPolicy)(nil)).Elem()
}

func (i NotificationPolicyMap) ToNotificationPolicyMapOutput() NotificationPolicyMapOutput {
	return i.ToNotificationPolicyMapOutputWithContext(context.Background())
}

func (i NotificationPolicyMap) ToNotificationPolicyMapOutputWithContext(ctx context.Context) NotificationPolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NotificationPolicyMapOutput)
}

func (i NotificationPolicyMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*NotificationPolicy] {
	return pulumix.Output[map[string]*NotificationPolicy]{
		OutputState: i.ToNotificationPolicyMapOutputWithContext(ctx).OutputState,
	}
}

type NotificationPolicyOutput struct{ *pulumi.OutputState }

func (NotificationPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**NotificationPolicy)(nil)).Elem()
}

func (o NotificationPolicyOutput) ToNotificationPolicyOutput() NotificationPolicyOutput {
	return o
}

func (o NotificationPolicyOutput) ToNotificationPolicyOutputWithContext(ctx context.Context) NotificationPolicyOutput {
	return o
}

func (o NotificationPolicyOutput) ToOutput(ctx context.Context) pulumix.Output[*NotificationPolicy] {
	return pulumix.Output[*NotificationPolicy]{
		OutputState: o.OutputState,
	}
}

// The account identifier to target for the resource.
func (o NotificationPolicyOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *NotificationPolicy) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// The event type that will trigger the dispatch of a notification. See the developer documentation for descriptions of [available alert types](https://developers.cloudflare.com/fundamentals/notifications/notification-available/). Available values: `accessCustomCertificateExpirationType`, `advancedDdosAttackL4Alert`, `advancedDdosAttackL7Alert`, `bgpHijackNotification`, `billingUsageAlert`, `blockNotificationBlockRemoved`, `blockNotificationNewBlock`, `blockNotificationReviewRejected`, `clickhouseAlertFwAnomaly`, `clickhouseAlertFwEntAnomaly`, `customSslCertificateEventType`, `dedicatedSslCertificateEventType`, `dosAttackL4`, `dosAttackL7`, `expiringServiceTokenAlert`, `failingLogpushJobDisabledAlert`, `fbmAutoAdvertisement`, `fbmDosdAttack`, `fbmVolumetricAttack`, `healthCheckStatusNotification`, `hostnameAopCustomCertificateExpirationType`, `httpAlertEdgeError`, `httpAlertOriginError`, `loadBalancingHealthAlert`, `loadBalancingPoolEnablementAlert`, `realOriginMonitoring`, `scriptmonitorAlertNewCodeChangeDetections`, `scriptmonitorAlertNewHosts`, `scriptmonitorAlertNewMaliciousHosts`, `scriptmonitorAlertNewMaliciousScripts`, `scriptmonitorAlertNewMaliciousUrl`, `scriptmonitorAlertNewMaxLengthResourceUrl`, `scriptmonitorAlertNewResources`, `secondaryDnsAllPrimariesFailing`, `secondaryDnsPrimariesFailing`, `secondaryDnsZoneSuccessfullyUpdated`, `secondaryDnsZoneValidationWarning`, `sentinelAlert`, `streamLiveNotifications`, `tunnelHealthEvent`, `tunnelUpdateEvent`, `universalSslEventType`, `webAnalyticsMetricsUpdate`, `weeklyAccountOverview`, `workersAlert`, `zoneAopCustomCertificateExpirationType`.
func (o NotificationPolicyOutput) AlertType() pulumi.StringOutput {
	return o.ApplyT(func(v *NotificationPolicy) pulumi.StringOutput { return v.AlertType }).(pulumi.StringOutput)
}

// When the notification policy was created.
func (o NotificationPolicyOutput) Created() pulumi.StringOutput {
	return o.ApplyT(func(v *NotificationPolicy) pulumi.StringOutput { return v.Created }).(pulumi.StringOutput)
}

// Description of the notification policy.
func (o NotificationPolicyOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *NotificationPolicy) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The email id to which the notification should be dispatched. One of email, webhooks, or PagerDuty mechanisms is required.
func (o NotificationPolicyOutput) EmailIntegrations() NotificationPolicyEmailIntegrationArrayOutput {
	return o.ApplyT(func(v *NotificationPolicy) NotificationPolicyEmailIntegrationArrayOutput { return v.EmailIntegrations }).(NotificationPolicyEmailIntegrationArrayOutput)
}

// The status of the notification policy.
func (o NotificationPolicyOutput) Enabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *NotificationPolicy) pulumi.BoolOutput { return v.Enabled }).(pulumi.BoolOutput)
}

// An optional nested block of filters that applies to the selected `alertType`. A key-value map that specifies the type of filter and the values to match against (refer to the alert type block for available fields).
func (o NotificationPolicyOutput) Filters() NotificationPolicyFiltersPtrOutput {
	return o.ApplyT(func(v *NotificationPolicy) NotificationPolicyFiltersPtrOutput { return v.Filters }).(NotificationPolicyFiltersPtrOutput)
}

// When the notification policy was last modified.
func (o NotificationPolicyOutput) Modified() pulumi.StringOutput {
	return o.ApplyT(func(v *NotificationPolicy) pulumi.StringOutput { return v.Modified }).(pulumi.StringOutput)
}

// The name of the notification policy.
func (o NotificationPolicyOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *NotificationPolicy) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The unique id of a configured pagerduty endpoint to which the notification should be dispatched. One of email, webhooks, or PagerDuty mechanisms is required.
func (o NotificationPolicyOutput) PagerdutyIntegrations() NotificationPolicyPagerdutyIntegrationArrayOutput {
	return o.ApplyT(func(v *NotificationPolicy) NotificationPolicyPagerdutyIntegrationArrayOutput {
		return v.PagerdutyIntegrations
	}).(NotificationPolicyPagerdutyIntegrationArrayOutput)
}

// The unique id of a configured webhooks endpoint to which the notification should be dispatched. One of email, webhooks, or PagerDuty mechanisms is required.
func (o NotificationPolicyOutput) WebhooksIntegrations() NotificationPolicyWebhooksIntegrationArrayOutput {
	return o.ApplyT(func(v *NotificationPolicy) NotificationPolicyWebhooksIntegrationArrayOutput {
		return v.WebhooksIntegrations
	}).(NotificationPolicyWebhooksIntegrationArrayOutput)
}

type NotificationPolicyArrayOutput struct{ *pulumi.OutputState }

func (NotificationPolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NotificationPolicy)(nil)).Elem()
}

func (o NotificationPolicyArrayOutput) ToNotificationPolicyArrayOutput() NotificationPolicyArrayOutput {
	return o
}

func (o NotificationPolicyArrayOutput) ToNotificationPolicyArrayOutputWithContext(ctx context.Context) NotificationPolicyArrayOutput {
	return o
}

func (o NotificationPolicyArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*NotificationPolicy] {
	return pulumix.Output[[]*NotificationPolicy]{
		OutputState: o.OutputState,
	}
}

func (o NotificationPolicyArrayOutput) Index(i pulumi.IntInput) NotificationPolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *NotificationPolicy {
		return vs[0].([]*NotificationPolicy)[vs[1].(int)]
	}).(NotificationPolicyOutput)
}

type NotificationPolicyMapOutput struct{ *pulumi.OutputState }

func (NotificationPolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NotificationPolicy)(nil)).Elem()
}

func (o NotificationPolicyMapOutput) ToNotificationPolicyMapOutput() NotificationPolicyMapOutput {
	return o
}

func (o NotificationPolicyMapOutput) ToNotificationPolicyMapOutputWithContext(ctx context.Context) NotificationPolicyMapOutput {
	return o
}

func (o NotificationPolicyMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*NotificationPolicy] {
	return pulumix.Output[map[string]*NotificationPolicy]{
		OutputState: o.OutputState,
	}
}

func (o NotificationPolicyMapOutput) MapIndex(k pulumi.StringInput) NotificationPolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *NotificationPolicy {
		return vs[0].(map[string]*NotificationPolicy)[vs[1].(string)]
	}).(NotificationPolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*NotificationPolicyInput)(nil)).Elem(), &NotificationPolicy{})
	pulumi.RegisterInputType(reflect.TypeOf((*NotificationPolicyArrayInput)(nil)).Elem(), NotificationPolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*NotificationPolicyMapInput)(nil)).Elem(), NotificationPolicyMap{})
	pulumi.RegisterOutputType(NotificationPolicyOutput{})
	pulumi.RegisterOutputType(NotificationPolicyArrayOutput{})
	pulumi.RegisterOutputType(NotificationPolicyMapOutput{})
}
