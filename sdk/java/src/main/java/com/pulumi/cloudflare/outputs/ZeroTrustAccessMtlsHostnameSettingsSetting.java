// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ZeroTrustAccessMtlsHostnameSettingsSetting {
    /**
     * @return Request client certificates for this hostname in China. Can only be set to true if this zone is china network enabled.
     * 
     */
    private @Nullable Boolean chinaNetwork;
    /**
     * @return Client Certificate Forwarding is a feature that takes the client cert provided by the eyeball to the edge, and forwards it to the origin as a HTTP header to allow logging on the origin.
     * 
     */
    private @Nullable Boolean clientCertificateForwarding;
    /**
     * @return The hostname that these settings apply to.
     * 
     */
    private String hostname;

    private ZeroTrustAccessMtlsHostnameSettingsSetting() {}
    /**
     * @return Request client certificates for this hostname in China. Can only be set to true if this zone is china network enabled.
     * 
     */
    public Optional<Boolean> chinaNetwork() {
        return Optional.ofNullable(this.chinaNetwork);
    }
    /**
     * @return Client Certificate Forwarding is a feature that takes the client cert provided by the eyeball to the edge, and forwards it to the origin as a HTTP header to allow logging on the origin.
     * 
     */
    public Optional<Boolean> clientCertificateForwarding() {
        return Optional.ofNullable(this.clientCertificateForwarding);
    }
    /**
     * @return The hostname that these settings apply to.
     * 
     */
    public String hostname() {
        return this.hostname;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ZeroTrustAccessMtlsHostnameSettingsSetting defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean chinaNetwork;
        private @Nullable Boolean clientCertificateForwarding;
        private String hostname;
        public Builder() {}
        public Builder(ZeroTrustAccessMtlsHostnameSettingsSetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.chinaNetwork = defaults.chinaNetwork;
    	      this.clientCertificateForwarding = defaults.clientCertificateForwarding;
    	      this.hostname = defaults.hostname;
        }

        @CustomType.Setter
        public Builder chinaNetwork(@Nullable Boolean chinaNetwork) {

            this.chinaNetwork = chinaNetwork;
            return this;
        }
        @CustomType.Setter
        public Builder clientCertificateForwarding(@Nullable Boolean clientCertificateForwarding) {

            this.clientCertificateForwarding = clientCertificateForwarding;
            return this;
        }
        @CustomType.Setter
        public Builder hostname(String hostname) {
            if (hostname == null) {
              throw new MissingRequiredPropertyException("ZeroTrustAccessMtlsHostnameSettingsSetting", "hostname");
            }
            this.hostname = hostname;
            return this;
        }
        public ZeroTrustAccessMtlsHostnameSettingsSetting build() {
            final var _resultValue = new ZeroTrustAccessMtlsHostnameSettingsSetting();
            _resultValue.chinaNetwork = chinaNetwork;
            _resultValue.clientCertificateForwarding = clientCertificateForwarding;
            _resultValue.hostname = hostname;
            return _resultValue;
        }
    }
}