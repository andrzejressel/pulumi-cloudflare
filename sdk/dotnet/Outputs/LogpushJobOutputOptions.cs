// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Outputs
{

    [OutputType]
    public sealed class LogpushJobOutputOptions
    {
        /// <summary>
        /// String to be prepended before each batch.
        /// </summary>
        public readonly string? BatchPrefix;
        /// <summary>
        /// String to be appended after each batch.
        /// </summary>
        public readonly string? BatchSuffix;
        /// <summary>
        /// Mitigation for CVE-2021-44228. If set to true, will cause all occurrences of ${ in the generated files to be replaced with x{. Defaults to `false`.
        /// </summary>
        public readonly bool? Cve20214428;
        /// <summary>
        /// String to join fields. This field be ignored when record_template is set. Defaults to `,`.
        /// </summary>
        public readonly string? FieldDelimiter;
        /// <summary>
        /// List of field names to be included in the Logpush output.
        /// </summary>
        public readonly ImmutableArray<string> FieldNames;
        /// <summary>
        /// Specifies the output type. Available values: `ndjson`, `csv`. Defaults to `ndjson`.
        /// </summary>
        public readonly string? OutputType;
        /// <summary>
        /// String to be inserted in-between the records as separator.
        /// </summary>
        public readonly string? RecordDelimiter;
        /// <summary>
        /// String to be prepended before each record. Defaults to `{`.
        /// </summary>
        public readonly string? RecordPrefix;
        /// <summary>
        /// String to be appended after each record. Defaults to `}`.
        /// </summary>
        public readonly string? RecordSuffix;
        /// <summary>
        /// String to use as template for each record instead of the default comma-separated list.
        /// </summary>
        public readonly string? RecordTemplate;
        /// <summary>
        /// Specifies the sampling rate. Defaults to `1`.
        /// </summary>
        public readonly double? SampleRate;
        /// <summary>
        /// Specifies the format for timestamps. Available values: `unixnano`, `unix`, `rfc3339`. Defaults to `unixnano`.
        /// </summary>
        public readonly string? TimestampFormat;

        [OutputConstructor]
        private LogpushJobOutputOptions(
            string? batchPrefix,

            string? batchSuffix,

            bool? cve20214428,

            string? fieldDelimiter,

            ImmutableArray<string> fieldNames,

            string? outputType,

            string? recordDelimiter,

            string? recordPrefix,

            string? recordSuffix,

            string? recordTemplate,

            double? sampleRate,

            string? timestampFormat)
        {
            BatchPrefix = batchPrefix;
            BatchSuffix = batchSuffix;
            Cve20214428 = cve20214428;
            FieldDelimiter = fieldDelimiter;
            FieldNames = fieldNames;
            OutputType = outputType;
            RecordDelimiter = recordDelimiter;
            RecordPrefix = recordPrefix;
            RecordSuffix = recordSuffix;
            RecordTemplate = recordTemplate;
            SampleRate = sampleRate;
            TimestampFormat = timestampFormat;
        }
    }
}