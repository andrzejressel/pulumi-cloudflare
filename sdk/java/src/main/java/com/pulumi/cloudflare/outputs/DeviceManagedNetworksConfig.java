// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DeviceManagedNetworksConfig {
    /**
     * @return The SHA-256 hash of the TLS certificate presented by the host found at tls_sockaddr. If absent, regular certificate verification (trusted roots, valid timestamp, etc) will be used to validate the certificate.
     * 
     */
    private String sha256;
    /**
     * @return A network address of the form &#34;host:port&#34; that the WARP client will use to detect the presence of a TLS host.
     * 
     */
    private String tlsSockaddr;

    private DeviceManagedNetworksConfig() {}
    /**
     * @return The SHA-256 hash of the TLS certificate presented by the host found at tls_sockaddr. If absent, regular certificate verification (trusted roots, valid timestamp, etc) will be used to validate the certificate.
     * 
     */
    public String sha256() {
        return this.sha256;
    }
    /**
     * @return A network address of the form &#34;host:port&#34; that the WARP client will use to detect the presence of a TLS host.
     * 
     */
    public String tlsSockaddr() {
        return this.tlsSockaddr;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceManagedNetworksConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String sha256;
        private String tlsSockaddr;
        public Builder() {}
        public Builder(DeviceManagedNetworksConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sha256 = defaults.sha256;
    	      this.tlsSockaddr = defaults.tlsSockaddr;
        }

        @CustomType.Setter
        public Builder sha256(String sha256) {
            this.sha256 = Objects.requireNonNull(sha256);
            return this;
        }
        @CustomType.Setter
        public Builder tlsSockaddr(String tlsSockaddr) {
            this.tlsSockaddr = Objects.requireNonNull(tlsSockaddr);
            return this;
        }
        public DeviceManagedNetworksConfig build() {
            final var _resultValue = new DeviceManagedNetworksConfig();
            _resultValue.sha256 = sha256;
            _resultValue.tlsSockaddr = tlsSockaddr;
            return _resultValue;
        }
    }
}
