// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OriginCaCertificateState extends com.pulumi.resources.ResourceArgs {

    public static final OriginCaCertificateState Empty = new OriginCaCertificateState();

    /**
     * The Origin CA certificate
     * 
     */
    @Import(name="certificate")
    private @Nullable Output<String> certificate;

    /**
     * @return The Origin CA certificate
     * 
     */
    public Optional<Output<String>> certificate() {
        return Optional.ofNullable(this.certificate);
    }

    /**
     * The Certificate Signing Request. Must be newline-encoded.
     * 
     */
    @Import(name="csr")
    private @Nullable Output<String> csr;

    /**
     * @return The Certificate Signing Request. Must be newline-encoded.
     * 
     */
    public Optional<Output<String>> csr() {
        return Optional.ofNullable(this.csr);
    }

    /**
     * The datetime when the certificate will expire.
     * 
     */
    @Import(name="expiresOn")
    private @Nullable Output<String> expiresOn;

    /**
     * @return The datetime when the certificate will expire.
     * 
     */
    public Optional<Output<String>> expiresOn() {
        return Optional.ofNullable(this.expiresOn);
    }

    /**
     * An array of hostnames or wildcard names bound to the certificate.
     * 
     */
    @Import(name="hostnames")
    private @Nullable Output<List<String>> hostnames;

    /**
     * @return An array of hostnames or wildcard names bound to the certificate.
     * 
     */
    public Optional<Output<List<String>>> hostnames() {
        return Optional.ofNullable(this.hostnames);
    }

    /**
     * The signature type desired on the certificate.
     * 
     */
    @Import(name="requestType")
    private @Nullable Output<String> requestType;

    /**
     * @return The signature type desired on the certificate.
     * 
     */
    public Optional<Output<String>> requestType() {
        return Optional.ofNullable(this.requestType);
    }

    /**
     * The number of days for which the certificate should be valid.
     * 
     */
    @Import(name="requestedValidity")
    private @Nullable Output<Integer> requestedValidity;

    /**
     * @return The number of days for which the certificate should be valid.
     * 
     */
    public Optional<Output<Integer>> requestedValidity() {
        return Optional.ofNullable(this.requestedValidity);
    }

    private OriginCaCertificateState() {}

    private OriginCaCertificateState(OriginCaCertificateState $) {
        this.certificate = $.certificate;
        this.csr = $.csr;
        this.expiresOn = $.expiresOn;
        this.hostnames = $.hostnames;
        this.requestType = $.requestType;
        this.requestedValidity = $.requestedValidity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OriginCaCertificateState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OriginCaCertificateState $;

        public Builder() {
            $ = new OriginCaCertificateState();
        }

        public Builder(OriginCaCertificateState defaults) {
            $ = new OriginCaCertificateState(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificate The Origin CA certificate
         * 
         * @return builder
         * 
         */
        public Builder certificate(@Nullable Output<String> certificate) {
            $.certificate = certificate;
            return this;
        }

        /**
         * @param certificate The Origin CA certificate
         * 
         * @return builder
         * 
         */
        public Builder certificate(String certificate) {
            return certificate(Output.of(certificate));
        }

        /**
         * @param csr The Certificate Signing Request. Must be newline-encoded.
         * 
         * @return builder
         * 
         */
        public Builder csr(@Nullable Output<String> csr) {
            $.csr = csr;
            return this;
        }

        /**
         * @param csr The Certificate Signing Request. Must be newline-encoded.
         * 
         * @return builder
         * 
         */
        public Builder csr(String csr) {
            return csr(Output.of(csr));
        }

        /**
         * @param expiresOn The datetime when the certificate will expire.
         * 
         * @return builder
         * 
         */
        public Builder expiresOn(@Nullable Output<String> expiresOn) {
            $.expiresOn = expiresOn;
            return this;
        }

        /**
         * @param expiresOn The datetime when the certificate will expire.
         * 
         * @return builder
         * 
         */
        public Builder expiresOn(String expiresOn) {
            return expiresOn(Output.of(expiresOn));
        }

        /**
         * @param hostnames An array of hostnames or wildcard names bound to the certificate.
         * 
         * @return builder
         * 
         */
        public Builder hostnames(@Nullable Output<List<String>> hostnames) {
            $.hostnames = hostnames;
            return this;
        }

        /**
         * @param hostnames An array of hostnames or wildcard names bound to the certificate.
         * 
         * @return builder
         * 
         */
        public Builder hostnames(List<String> hostnames) {
            return hostnames(Output.of(hostnames));
        }

        /**
         * @param hostnames An array of hostnames or wildcard names bound to the certificate.
         * 
         * @return builder
         * 
         */
        public Builder hostnames(String... hostnames) {
            return hostnames(List.of(hostnames));
        }

        /**
         * @param requestType The signature type desired on the certificate.
         * 
         * @return builder
         * 
         */
        public Builder requestType(@Nullable Output<String> requestType) {
            $.requestType = requestType;
            return this;
        }

        /**
         * @param requestType The signature type desired on the certificate.
         * 
         * @return builder
         * 
         */
        public Builder requestType(String requestType) {
            return requestType(Output.of(requestType));
        }

        /**
         * @param requestedValidity The number of days for which the certificate should be valid.
         * 
         * @return builder
         * 
         */
        public Builder requestedValidity(@Nullable Output<Integer> requestedValidity) {
            $.requestedValidity = requestedValidity;
            return this;
        }

        /**
         * @param requestedValidity The number of days for which the certificate should be valid.
         * 
         * @return builder
         * 
         */
        public Builder requestedValidity(Integer requestedValidity) {
            return requestedValidity(Output.of(requestedValidity));
        }

        public OriginCaCertificateState build() {
            return $;
        }
    }

}
