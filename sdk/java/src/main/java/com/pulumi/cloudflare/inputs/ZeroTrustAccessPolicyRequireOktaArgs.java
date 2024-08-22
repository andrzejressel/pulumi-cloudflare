// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ZeroTrustAccessPolicyRequireOktaArgs extends com.pulumi.resources.ResourceArgs {

    public static final ZeroTrustAccessPolicyRequireOktaArgs Empty = new ZeroTrustAccessPolicyRequireOktaArgs();

    @Import(name="identityProviderId")
    private @Nullable Output<String> identityProviderId;

    public Optional<Output<String>> identityProviderId() {
        return Optional.ofNullable(this.identityProviderId);
    }

    @Import(name="names")
    private @Nullable Output<List<String>> names;

    public Optional<Output<List<String>>> names() {
        return Optional.ofNullable(this.names);
    }

    private ZeroTrustAccessPolicyRequireOktaArgs() {}

    private ZeroTrustAccessPolicyRequireOktaArgs(ZeroTrustAccessPolicyRequireOktaArgs $) {
        this.identityProviderId = $.identityProviderId;
        this.names = $.names;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZeroTrustAccessPolicyRequireOktaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZeroTrustAccessPolicyRequireOktaArgs $;

        public Builder() {
            $ = new ZeroTrustAccessPolicyRequireOktaArgs();
        }

        public Builder(ZeroTrustAccessPolicyRequireOktaArgs defaults) {
            $ = new ZeroTrustAccessPolicyRequireOktaArgs(Objects.requireNonNull(defaults));
        }

        public Builder identityProviderId(@Nullable Output<String> identityProviderId) {
            $.identityProviderId = identityProviderId;
            return this;
        }

        public Builder identityProviderId(String identityProviderId) {
            return identityProviderId(Output.of(identityProviderId));
        }

        public Builder names(@Nullable Output<List<String>> names) {
            $.names = names;
            return this;
        }

        public Builder names(List<String> names) {
            return names(Output.of(names));
        }

        public Builder names(String... names) {
            return names(List.of(names));
        }

        public ZeroTrustAccessPolicyRequireOktaArgs build() {
            return $;
        }
    }

}
