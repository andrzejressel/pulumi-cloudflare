// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RateLimitMatchResponse {
    /**
     * @return List of HTTP headers maps to match the origin response on.
     * 
     */
    private @Nullable List<Map<String,String>> headers;
    /**
     * @return Only count traffic that has come from your origin servers. If true, cached items that Cloudflare serve will not count towards rate limiting.
     * 
     */
    private @Nullable Boolean originTraffic;
    /**
     * @return HTTP Status codes, can be one, many or indicate all by not providing this value.
     * 
     */
    private @Nullable List<Integer> statuses;

    private RateLimitMatchResponse() {}
    /**
     * @return List of HTTP headers maps to match the origin response on.
     * 
     */
    public List<Map<String,String>> headers() {
        return this.headers == null ? List.of() : this.headers;
    }
    /**
     * @return Only count traffic that has come from your origin servers. If true, cached items that Cloudflare serve will not count towards rate limiting.
     * 
     */
    public Optional<Boolean> originTraffic() {
        return Optional.ofNullable(this.originTraffic);
    }
    /**
     * @return HTTP Status codes, can be one, many or indicate all by not providing this value.
     * 
     */
    public List<Integer> statuses() {
        return this.statuses == null ? List.of() : this.statuses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RateLimitMatchResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<Map<String,String>> headers;
        private @Nullable Boolean originTraffic;
        private @Nullable List<Integer> statuses;
        public Builder() {}
        public Builder(RateLimitMatchResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headers = defaults.headers;
    	      this.originTraffic = defaults.originTraffic;
    	      this.statuses = defaults.statuses;
        }

        @CustomType.Setter
        public Builder headers(@Nullable List<Map<String,String>> headers) {
            this.headers = headers;
            return this;
        }
        @CustomType.Setter
        public Builder originTraffic(@Nullable Boolean originTraffic) {
            this.originTraffic = originTraffic;
            return this;
        }
        @CustomType.Setter
        public Builder statuses(@Nullable List<Integer> statuses) {
            this.statuses = statuses;
            return this;
        }
        public Builder statuses(Integer... statuses) {
            return statuses(List.of(statuses));
        }
        public RateLimitMatchResponse build() {
            final var _resultValue = new RateLimitMatchResponse();
            _resultValue.headers = headers;
            _resultValue.originTraffic = originTraffic;
            _resultValue.statuses = statuses;
            return _resultValue;
        }
    }
}
