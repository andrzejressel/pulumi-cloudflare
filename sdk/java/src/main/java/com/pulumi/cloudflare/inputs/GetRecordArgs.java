// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRecordArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRecordArgs Empty = new GetRecordArgs();

    /**
     * Content to filter record results on.
     * 
     */
    @Import(name="content")
    private @Nullable Output<String> content;

    /**
     * @return Content to filter record results on.
     * 
     */
    public Optional<Output<String>> content() {
        return Optional.ofNullable(this.content);
    }

    /**
     * Hostname to filter DNS record results on.
     * 
     */
    @Import(name="hostname", required=true)
    private Output<String> hostname;

    /**
     * @return Hostname to filter DNS record results on.
     * 
     */
    public Output<String> hostname() {
        return this.hostname;
    }

    /**
     * DNS priority to filter record results on.
     * 
     */
    @Import(name="priority")
    private @Nullable Output<Integer> priority;

    /**
     * @return DNS priority to filter record results on.
     * 
     */
    public Optional<Output<Integer>> priority() {
        return Optional.ofNullable(this.priority);
    }

    /**
     * DNS record type to filter record results on. Defaults to `A`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return DNS record type to filter record results on. Defaults to `A`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * The zone identifier to target for the resource.
     * 
     */
    @Import(name="zoneId", required=true)
    private Output<String> zoneId;

    /**
     * @return The zone identifier to target for the resource.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    private GetRecordArgs() {}

    private GetRecordArgs(GetRecordArgs $) {
        this.content = $.content;
        this.hostname = $.hostname;
        this.priority = $.priority;
        this.type = $.type;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRecordArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRecordArgs $;

        public Builder() {
            $ = new GetRecordArgs();
        }

        public Builder(GetRecordArgs defaults) {
            $ = new GetRecordArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param content Content to filter record results on.
         * 
         * @return builder
         * 
         */
        public Builder content(@Nullable Output<String> content) {
            $.content = content;
            return this;
        }

        /**
         * @param content Content to filter record results on.
         * 
         * @return builder
         * 
         */
        public Builder content(String content) {
            return content(Output.of(content));
        }

        /**
         * @param hostname Hostname to filter DNS record results on.
         * 
         * @return builder
         * 
         */
        public Builder hostname(Output<String> hostname) {
            $.hostname = hostname;
            return this;
        }

        /**
         * @param hostname Hostname to filter DNS record results on.
         * 
         * @return builder
         * 
         */
        public Builder hostname(String hostname) {
            return hostname(Output.of(hostname));
        }

        /**
         * @param priority DNS priority to filter record results on.
         * 
         * @return builder
         * 
         */
        public Builder priority(@Nullable Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority DNS priority to filter record results on.
         * 
         * @return builder
         * 
         */
        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        /**
         * @param type DNS record type to filter record results on. Defaults to `A`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type DNS record type to filter record results on. Defaults to `A`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param zoneId The zone identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The zone identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public GetRecordArgs build() {
            if ($.hostname == null) {
                throw new MissingRequiredPropertyException("GetRecordArgs", "hostname");
            }
            if ($.zoneId == null) {
                throw new MissingRequiredPropertyException("GetRecordArgs", "zoneId");
            }
            return $;
        }
    }

}
