// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetZoneDnssecResult {
    /**
     * @return Zone DNSSEC algorithm.
     * 
     */
    private String algorithm;
    /**
     * @return Zone DNSSEC digest.
     * 
     */
    private String digest;
    /**
     * @return Digest algorithm use for Zone DNSSEC.
     * 
     */
    private String digestAlgorithm;
    /**
     * @return Digest Type for Zone DNSSEC.
     * 
     */
    private String digestType;
    /**
     * @return DS for the Zone DNSSEC.
     * 
     */
    private String ds;
    /**
     * @return Zone DNSSEC flags.
     * 
     */
    private Integer flags;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Key Tag for the Zone DNSSEC.
     * 
     */
    private Integer keyTag;
    /**
     * @return Key type used for Zone DNSSEC.
     * 
     */
    private String keyType;
    /**
     * @return Public Key for the Zone DNSSEC.
     * 
     */
    private String publicKey;
    /**
     * @return The status of the Zone DNSSEC.
     * 
     */
    private String status;
    private String zoneId;

    private GetZoneDnssecResult() {}
    /**
     * @return Zone DNSSEC algorithm.
     * 
     */
    public String algorithm() {
        return this.algorithm;
    }
    /**
     * @return Zone DNSSEC digest.
     * 
     */
    public String digest() {
        return this.digest;
    }
    /**
     * @return Digest algorithm use for Zone DNSSEC.
     * 
     */
    public String digestAlgorithm() {
        return this.digestAlgorithm;
    }
    /**
     * @return Digest Type for Zone DNSSEC.
     * 
     */
    public String digestType() {
        return this.digestType;
    }
    /**
     * @return DS for the Zone DNSSEC.
     * 
     */
    public String ds() {
        return this.ds;
    }
    /**
     * @return Zone DNSSEC flags.
     * 
     */
    public Integer flags() {
        return this.flags;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Key Tag for the Zone DNSSEC.
     * 
     */
    public Integer keyTag() {
        return this.keyTag;
    }
    /**
     * @return Key type used for Zone DNSSEC.
     * 
     */
    public String keyType() {
        return this.keyType;
    }
    /**
     * @return Public Key for the Zone DNSSEC.
     * 
     */
    public String publicKey() {
        return this.publicKey;
    }
    /**
     * @return The status of the Zone DNSSEC.
     * 
     */
    public String status() {
        return this.status;
    }
    public String zoneId() {
        return this.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetZoneDnssecResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String algorithm;
        private String digest;
        private String digestAlgorithm;
        private String digestType;
        private String ds;
        private Integer flags;
        private String id;
        private Integer keyTag;
        private String keyType;
        private String publicKey;
        private String status;
        private String zoneId;
        public Builder() {}
        public Builder(GetZoneDnssecResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithm = defaults.algorithm;
    	      this.digest = defaults.digest;
    	      this.digestAlgorithm = defaults.digestAlgorithm;
    	      this.digestType = defaults.digestType;
    	      this.ds = defaults.ds;
    	      this.flags = defaults.flags;
    	      this.id = defaults.id;
    	      this.keyTag = defaults.keyTag;
    	      this.keyType = defaults.keyType;
    	      this.publicKey = defaults.publicKey;
    	      this.status = defaults.status;
    	      this.zoneId = defaults.zoneId;
        }

        @CustomType.Setter
        public Builder algorithm(String algorithm) {
            this.algorithm = Objects.requireNonNull(algorithm);
            return this;
        }
        @CustomType.Setter
        public Builder digest(String digest) {
            this.digest = Objects.requireNonNull(digest);
            return this;
        }
        @CustomType.Setter
        public Builder digestAlgorithm(String digestAlgorithm) {
            this.digestAlgorithm = Objects.requireNonNull(digestAlgorithm);
            return this;
        }
        @CustomType.Setter
        public Builder digestType(String digestType) {
            this.digestType = Objects.requireNonNull(digestType);
            return this;
        }
        @CustomType.Setter
        public Builder ds(String ds) {
            this.ds = Objects.requireNonNull(ds);
            return this;
        }
        @CustomType.Setter
        public Builder flags(Integer flags) {
            this.flags = Objects.requireNonNull(flags);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder keyTag(Integer keyTag) {
            this.keyTag = Objects.requireNonNull(keyTag);
            return this;
        }
        @CustomType.Setter
        public Builder keyType(String keyType) {
            this.keyType = Objects.requireNonNull(keyType);
            return this;
        }
        @CustomType.Setter
        public Builder publicKey(String publicKey) {
            this.publicKey = Objects.requireNonNull(publicKey);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder zoneId(String zoneId) {
            this.zoneId = Objects.requireNonNull(zoneId);
            return this;
        }
        public GetZoneDnssecResult build() {
            final var o = new GetZoneDnssecResult();
            o.algorithm = algorithm;
            o.digest = digest;
            o.digestAlgorithm = digestAlgorithm;
            o.digestType = digestType;
            o.ds = ds;
            o.flags = flags;
            o.id = id;
            o.keyTag = keyTag;
            o.keyType = keyType;
            o.publicKey = publicKey;
            o.status = status;
            o.zoneId = zoneId;
            return o;
        }
    }
}