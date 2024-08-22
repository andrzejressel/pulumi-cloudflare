// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ZeroTrustAccessApplicationCorsHeader {
    /**
     * @return Value to determine whether all HTTP headers are exposed.
     * 
     */
    private @Nullable Boolean allowAllHeaders;
    /**
     * @return Value to determine whether all methods are exposed.
     * 
     */
    private @Nullable Boolean allowAllMethods;
    /**
     * @return Value to determine whether all origins are permitted to make CORS requests.
     * 
     */
    private @Nullable Boolean allowAllOrigins;
    /**
     * @return Value to determine if credentials (cookies, authorization headers, or TLS client certificates) are included with requests.
     * 
     */
    private @Nullable Boolean allowCredentials;
    /**
     * @return List of HTTP headers to expose via CORS.
     * 
     */
    private @Nullable List<String> allowedHeaders;
    /**
     * @return List of methods to expose via CORS.
     * 
     */
    private @Nullable List<String> allowedMethods;
    /**
     * @return List of origins permitted to make CORS requests.
     * 
     */
    private @Nullable List<String> allowedOrigins;
    /**
     * @return The maximum time a preflight request will be cached.
     * 
     */
    private @Nullable Integer maxAge;

    private ZeroTrustAccessApplicationCorsHeader() {}
    /**
     * @return Value to determine whether all HTTP headers are exposed.
     * 
     */
    public Optional<Boolean> allowAllHeaders() {
        return Optional.ofNullable(this.allowAllHeaders);
    }
    /**
     * @return Value to determine whether all methods are exposed.
     * 
     */
    public Optional<Boolean> allowAllMethods() {
        return Optional.ofNullable(this.allowAllMethods);
    }
    /**
     * @return Value to determine whether all origins are permitted to make CORS requests.
     * 
     */
    public Optional<Boolean> allowAllOrigins() {
        return Optional.ofNullable(this.allowAllOrigins);
    }
    /**
     * @return Value to determine if credentials (cookies, authorization headers, or TLS client certificates) are included with requests.
     * 
     */
    public Optional<Boolean> allowCredentials() {
        return Optional.ofNullable(this.allowCredentials);
    }
    /**
     * @return List of HTTP headers to expose via CORS.
     * 
     */
    public List<String> allowedHeaders() {
        return this.allowedHeaders == null ? List.of() : this.allowedHeaders;
    }
    /**
     * @return List of methods to expose via CORS.
     * 
     */
    public List<String> allowedMethods() {
        return this.allowedMethods == null ? List.of() : this.allowedMethods;
    }
    /**
     * @return List of origins permitted to make CORS requests.
     * 
     */
    public List<String> allowedOrigins() {
        return this.allowedOrigins == null ? List.of() : this.allowedOrigins;
    }
    /**
     * @return The maximum time a preflight request will be cached.
     * 
     */
    public Optional<Integer> maxAge() {
        return Optional.ofNullable(this.maxAge);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ZeroTrustAccessApplicationCorsHeader defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean allowAllHeaders;
        private @Nullable Boolean allowAllMethods;
        private @Nullable Boolean allowAllOrigins;
        private @Nullable Boolean allowCredentials;
        private @Nullable List<String> allowedHeaders;
        private @Nullable List<String> allowedMethods;
        private @Nullable List<String> allowedOrigins;
        private @Nullable Integer maxAge;
        public Builder() {}
        public Builder(ZeroTrustAccessApplicationCorsHeader defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowAllHeaders = defaults.allowAllHeaders;
    	      this.allowAllMethods = defaults.allowAllMethods;
    	      this.allowAllOrigins = defaults.allowAllOrigins;
    	      this.allowCredentials = defaults.allowCredentials;
    	      this.allowedHeaders = defaults.allowedHeaders;
    	      this.allowedMethods = defaults.allowedMethods;
    	      this.allowedOrigins = defaults.allowedOrigins;
    	      this.maxAge = defaults.maxAge;
        }

        @CustomType.Setter
        public Builder allowAllHeaders(@Nullable Boolean allowAllHeaders) {

            this.allowAllHeaders = allowAllHeaders;
            return this;
        }
        @CustomType.Setter
        public Builder allowAllMethods(@Nullable Boolean allowAllMethods) {

            this.allowAllMethods = allowAllMethods;
            return this;
        }
        @CustomType.Setter
        public Builder allowAllOrigins(@Nullable Boolean allowAllOrigins) {

            this.allowAllOrigins = allowAllOrigins;
            return this;
        }
        @CustomType.Setter
        public Builder allowCredentials(@Nullable Boolean allowCredentials) {

            this.allowCredentials = allowCredentials;
            return this;
        }
        @CustomType.Setter
        public Builder allowedHeaders(@Nullable List<String> allowedHeaders) {

            this.allowedHeaders = allowedHeaders;
            return this;
        }
        public Builder allowedHeaders(String... allowedHeaders) {
            return allowedHeaders(List.of(allowedHeaders));
        }
        @CustomType.Setter
        public Builder allowedMethods(@Nullable List<String> allowedMethods) {

            this.allowedMethods = allowedMethods;
            return this;
        }
        public Builder allowedMethods(String... allowedMethods) {
            return allowedMethods(List.of(allowedMethods));
        }
        @CustomType.Setter
        public Builder allowedOrigins(@Nullable List<String> allowedOrigins) {

            this.allowedOrigins = allowedOrigins;
            return this;
        }
        public Builder allowedOrigins(String... allowedOrigins) {
            return allowedOrigins(List.of(allowedOrigins));
        }
        @CustomType.Setter
        public Builder maxAge(@Nullable Integer maxAge) {

            this.maxAge = maxAge;
            return this;
        }
        public ZeroTrustAccessApplicationCorsHeader build() {
            final var _resultValue = new ZeroTrustAccessApplicationCorsHeader();
            _resultValue.allowAllHeaders = allowAllHeaders;
            _resultValue.allowAllMethods = allowAllMethods;
            _resultValue.allowAllOrigins = allowAllOrigins;
            _resultValue.allowCredentials = allowCredentials;
            _resultValue.allowedHeaders = allowedHeaders;
            _resultValue.allowedMethods = allowedMethods;
            _resultValue.allowedOrigins = allowedOrigins;
            _resultValue.maxAge = maxAge;
            return _resultValue;
        }
    }
}
