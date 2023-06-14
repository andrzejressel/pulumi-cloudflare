// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListItemValueHostnameArgs extends com.pulumi.resources.ResourceArgs {

    public static final ListItemValueHostnameArgs Empty = new ListItemValueHostnameArgs();

    @Import(name="urlHostname", required=true)
    private Output<String> urlHostname;

    public Output<String> urlHostname() {
        return this.urlHostname;
    }

    private ListItemValueHostnameArgs() {}

    private ListItemValueHostnameArgs(ListItemValueHostnameArgs $) {
        this.urlHostname = $.urlHostname;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListItemValueHostnameArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListItemValueHostnameArgs $;

        public Builder() {
            $ = new ListItemValueHostnameArgs();
        }

        public Builder(ListItemValueHostnameArgs defaults) {
            $ = new ListItemValueHostnameArgs(Objects.requireNonNull(defaults));
        }

        public Builder urlHostname(Output<String> urlHostname) {
            $.urlHostname = urlHostname;
            return this;
        }

        public Builder urlHostname(String urlHostname) {
            return urlHostname(Output.of(urlHostname));
        }

        public ListItemValueHostnameArgs build() {
            $.urlHostname = Objects.requireNonNull($.urlHostname, "expected parameter 'urlHostname' to be non-null");
            return $;
        }
    }

}