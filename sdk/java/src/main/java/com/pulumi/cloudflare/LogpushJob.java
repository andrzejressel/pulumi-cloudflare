// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.LogpushJobArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.LogpushJobState;
import com.pulumi.cloudflare.outputs.LogpushJobOutputOptions;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * ## Import
 * 
 * Import an account-scoped job.
 * 
 * ```sh
 * $ pulumi import cloudflare:index/logpushJob:LogpushJob example account/&lt;account_id&gt;/&lt;job_id&gt;
 * ```
 * 
 * Import a zone-scoped job.
 * 
 * ```sh
 * $ pulumi import cloudflare:index/logpushJob:LogpushJob example zone/&lt;zone_id&gt;/&lt;job_id&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/logpushJob:LogpushJob")
public class LogpushJob extends com.pulumi.resources.CustomResource {
    /**
     * The account identifier to target for the resource. Must provide only one of `account_id`, `zone_id`.
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> accountId;

    /**
     * @return The account identifier to target for the resource. Must provide only one of `account_id`, `zone_id`.
     * 
     */
    public Output<Optional<String>> accountId() {
        return Codegen.optional(this.accountId);
    }
    /**
     * The kind of the dataset to use with the logpush job. Available values: `access_requests`, `casb_findings`, `firewall_events`, `http_requests`, `spectrum_events`, `nel_reports`, `audit_logs`, `gateway_dns`, `gateway_http`, `gateway_network`, `dns_logs`, `network_analytics_logs`, `workers_trace_events`, `device_posture_results`, `zero_trust_network_sessions`, `magic_ids_detections`, `page_shield_events`.
     * 
     */
    @Export(name="dataset", refs={String.class}, tree="[0]")
    private Output<String> dataset;

    /**
     * @return The kind of the dataset to use with the logpush job. Available values: `access_requests`, `casb_findings`, `firewall_events`, `http_requests`, `spectrum_events`, `nel_reports`, `audit_logs`, `gateway_dns`, `gateway_http`, `gateway_network`, `dns_logs`, `network_analytics_logs`, `workers_trace_events`, `device_posture_results`, `zero_trust_network_sessions`, `magic_ids_detections`, `page_shield_events`.
     * 
     */
    public Output<String> dataset() {
        return this.dataset;
    }
    /**
     * Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included. See [Logpush destination documentation](https://developers.cloudflare.com/logs/reference/logpush-api-configuration#destination).
     * 
     */
    @Export(name="destinationConf", refs={String.class}, tree="[0]")
    private Output<String> destinationConf;

    /**
     * @return Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included. See [Logpush destination documentation](https://developers.cloudflare.com/logs/reference/logpush-api-configuration#destination).
     * 
     */
    public Output<String> destinationConf() {
        return this.destinationConf;
    }
    /**
     * Whether to enable the job.
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Whether to enable the job.
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * Use filters to select the events to include and/or remove from your logs. For more information, refer to [Filters](https://developers.cloudflare.com/logs/reference/logpush-api-configuration/filters/).
     * 
     */
    @Export(name="filter", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> filter;

    /**
     * @return Use filters to select the events to include and/or remove from your logs. For more information, refer to [Filters](https://developers.cloudflare.com/logs/reference/logpush-api-configuration/filters/).
     * 
     */
    public Output<Optional<String>> filter() {
        return Codegen.optional(this.filter);
    }
    /**
     * A higher frequency will result in logs being pushed on faster with smaller files. `low` frequency will push logs less often with larger files. Available values: `high`, `low`. Defaults to `high`.
     * 
     */
    @Export(name="frequency", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> frequency;

    /**
     * @return A higher frequency will result in logs being pushed on faster with smaller files. `low` frequency will push logs less often with larger files. Available values: `high`, `low`. Defaults to `high`.
     * 
     */
    public Output<Optional<String>> frequency() {
        return Codegen.optional(this.frequency);
    }
    /**
     * The kind of logpush job to create. Available values: `edge`, `instant-logs`, `&#34;&#34;`.
     * 
     */
    @Export(name="kind", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> kind;

    /**
     * @return The kind of logpush job to create. Available values: `edge`, `instant-logs`, `&#34;&#34;`.
     * 
     */
    public Output<Optional<String>> kind() {
        return Codegen.optional(this.kind);
    }
    /**
     * Configuration string for the Logshare API. It specifies things like requested fields and timestamp formats. See [Logpush options documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#options).
     * 
     */
    @Export(name="logpullOptions", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> logpullOptions;

    /**
     * @return Configuration string for the Logshare API. It specifies things like requested fields and timestamp formats. See [Logpush options documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#options).
     * 
     */
    public Output<Optional<String>> logpullOptions() {
        return Codegen.optional(this.logpullOptions);
    }
    /**
     * The maximum uncompressed file size of a batch of logs. Value must be between 5MB and 1GB.
     * 
     */
    @Export(name="maxUploadBytes", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> maxUploadBytes;

    /**
     * @return The maximum uncompressed file size of a batch of logs. Value must be between 5MB and 1GB.
     * 
     */
    public Output<Optional<Integer>> maxUploadBytes() {
        return Codegen.optional(this.maxUploadBytes);
    }
    /**
     * The maximum interval in seconds for log batches. Value must be between 30 and 300.
     * 
     */
    @Export(name="maxUploadIntervalSeconds", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> maxUploadIntervalSeconds;

    /**
     * @return The maximum interval in seconds for log batches. Value must be between 30 and 300.
     * 
     */
    public Output<Optional<Integer>> maxUploadIntervalSeconds() {
        return Codegen.optional(this.maxUploadIntervalSeconds);
    }
    /**
     * The maximum number of log lines per batch. Value must be between 1000 and 1,000,000.
     * 
     */
    @Export(name="maxUploadRecords", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> maxUploadRecords;

    /**
     * @return The maximum number of log lines per batch. Value must be between 1000 and 1,000,000.
     * 
     */
    public Output<Optional<Integer>> maxUploadRecords() {
        return Codegen.optional(this.maxUploadRecords);
    }
    /**
     * The name of the logpush job to create.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> name;

    /**
     * @return The name of the logpush job to create.
     * 
     */
    public Output<Optional<String>> name() {
        return Codegen.optional(this.name);
    }
    /**
     * Structured replacement for logpull*options. When including this field, the logpull*option field will be ignored.
     * 
     */
    @Export(name="outputOptions", refs={LogpushJobOutputOptions.class}, tree="[0]")
    private Output</* @Nullable */ LogpushJobOutputOptions> outputOptions;

    /**
     * @return Structured replacement for logpull*options. When including this field, the logpull*option field will be ignored.
     * 
     */
    public Output<Optional<LogpushJobOutputOptions>> outputOptions() {
        return Codegen.optional(this.outputOptions);
    }
    /**
     * Ownership challenge token to prove destination ownership, required when destination is Amazon S3, Google Cloud Storage, Microsoft Azure or Sumo Logic. See [Developer documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#usage).
     * 
     */
    @Export(name="ownershipChallenge", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ownershipChallenge;

    /**
     * @return Ownership challenge token to prove destination ownership, required when destination is Amazon S3, Google Cloud Storage, Microsoft Azure or Sumo Logic. See [Developer documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#usage).
     * 
     */
    public Output<Optional<String>> ownershipChallenge() {
        return Codegen.optional(this.ownershipChallenge);
    }
    /**
     * The zone identifier to target for the resource. Must provide only one of `account_id`, `zone_id`.
     * 
     */
    @Export(name="zoneId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> zoneId;

    /**
     * @return The zone identifier to target for the resource. Must provide only one of `account_id`, `zone_id`.
     * 
     */
    public Output<Optional<String>> zoneId() {
        return Codegen.optional(this.zoneId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LogpushJob(String name) {
        this(name, LogpushJobArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LogpushJob(String name, LogpushJobArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LogpushJob(String name, LogpushJobArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/logpushJob:LogpushJob", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private LogpushJob(String name, Output<String> id, @Nullable LogpushJobState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/logpushJob:LogpushJob", name, state, makeResourceOptions(options, id));
    }

    private static LogpushJobArgs makeArgs(LogpushJobArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? LogpushJobArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static LogpushJob get(String name, Output<String> id, @Nullable LogpushJobState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LogpushJob(name, id, state, options);
    }
}
