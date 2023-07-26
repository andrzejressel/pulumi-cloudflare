// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class RecordDataGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("algorithm")]
        public Input<int>? Algorithm { get; set; }

        [Input("altitude")]
        public Input<double>? Altitude { get; set; }

        [Input("certificate")]
        public Input<string>? Certificate { get; set; }

        [Input("content")]
        public Input<string>? Content { get; set; }

        [Input("digest")]
        public Input<string>? Digest { get; set; }

        [Input("digestType")]
        public Input<int>? DigestType { get; set; }

        [Input("fingerprint")]
        public Input<string>? Fingerprint { get; set; }

        [Input("flags")]
        public Input<string>? Flags { get; set; }

        [Input("keyTag")]
        public Input<int>? KeyTag { get; set; }

        [Input("latDegrees")]
        public Input<int>? LatDegrees { get; set; }

        [Input("latDirection")]
        public Input<string>? LatDirection { get; set; }

        [Input("latMinutes")]
        public Input<int>? LatMinutes { get; set; }

        [Input("latSeconds")]
        public Input<double>? LatSeconds { get; set; }

        [Input("longDegrees")]
        public Input<int>? LongDegrees { get; set; }

        [Input("longDirection")]
        public Input<string>? LongDirection { get; set; }

        [Input("longMinutes")]
        public Input<int>? LongMinutes { get; set; }

        [Input("longSeconds")]
        public Input<double>? LongSeconds { get; set; }

        [Input("matchingType")]
        public Input<int>? MatchingType { get; set; }

        /// <summary>
        /// The name of the record. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("order")]
        public Input<int>? Order { get; set; }

        [Input("port")]
        public Input<int>? Port { get; set; }

        [Input("precisionHorz")]
        public Input<double>? PrecisionHorz { get; set; }

        [Input("precisionVert")]
        public Input<double>? PrecisionVert { get; set; }

        [Input("preference")]
        public Input<int>? Preference { get; set; }

        /// <summary>
        /// The priority of the record.
        /// </summary>
        [Input("priority")]
        public Input<int>? Priority { get; set; }

        [Input("proto")]
        public Input<string>? Proto { get; set; }

        [Input("protocol")]
        public Input<int>? Protocol { get; set; }

        [Input("publicKey")]
        public Input<string>? PublicKey { get; set; }

        [Input("regex")]
        public Input<string>? Regex { get; set; }

        [Input("replacement")]
        public Input<string>? Replacement { get; set; }

        [Input("selector")]
        public Input<int>? Selector { get; set; }

        [Input("service")]
        public Input<string>? Service { get; set; }

        [Input("size")]
        public Input<double>? Size { get; set; }

        [Input("tag")]
        public Input<string>? Tag { get; set; }

        [Input("target")]
        public Input<string>? Target { get; set; }

        /// <summary>
        /// The type of the record. Available values: `A`, `AAAA`, `CAA`, `CNAME`, `TXT`, `SRV`, `LOC`, `MX`, `NS`, `SPF`, `CERT`, `DNSKEY`, `DS`, `NAPTR`, `SMIMEA`, `SSHFP`, `TLSA`, `URI`, `PTR`, `HTTPS`, `SVCB`. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("type")]
        public Input<int>? Type { get; set; }

        [Input("usage")]
        public Input<int>? Usage { get; set; }

        /// <summary>
        /// The value of the record. Conflicts with `data`.
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        [Input("weight")]
        public Input<int>? Weight { get; set; }

        public RecordDataGetArgs()
        {
        }
        public static new RecordDataGetArgs Empty => new RecordDataGetArgs();
    }
}
