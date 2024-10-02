// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.ZeroTrustAccessApplicationTargetCriteriaTargetAttribute;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ZeroTrustAccessApplicationTargetCriteria {
    /**
     * @return The port that the targets use for the chosen communication protocol. A port cannot be assigned to multiple protocols.
     * 
     */
    private Integer port;
    /**
     * @return The communication protocol your application secures.
     * 
     */
    private String protocol;
    /**
     * @return Contains a map of target attribute keys to target attribute values.
     * 
     */
    private List<ZeroTrustAccessApplicationTargetCriteriaTargetAttribute> targetAttributes;

    private ZeroTrustAccessApplicationTargetCriteria() {}
    /**
     * @return The port that the targets use for the chosen communication protocol. A port cannot be assigned to multiple protocols.
     * 
     */
    public Integer port() {
        return this.port;
    }
    /**
     * @return The communication protocol your application secures.
     * 
     */
    public String protocol() {
        return this.protocol;
    }
    /**
     * @return Contains a map of target attribute keys to target attribute values.
     * 
     */
    public List<ZeroTrustAccessApplicationTargetCriteriaTargetAttribute> targetAttributes() {
        return this.targetAttributes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ZeroTrustAccessApplicationTargetCriteria defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer port;
        private String protocol;
        private List<ZeroTrustAccessApplicationTargetCriteriaTargetAttribute> targetAttributes;
        public Builder() {}
        public Builder(ZeroTrustAccessApplicationTargetCriteria defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
    	      this.targetAttributes = defaults.targetAttributes;
        }

        @CustomType.Setter
        public Builder port(Integer port) {
            if (port == null) {
              throw new MissingRequiredPropertyException("ZeroTrustAccessApplicationTargetCriteria", "port");
            }
            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder protocol(String protocol) {
            if (protocol == null) {
              throw new MissingRequiredPropertyException("ZeroTrustAccessApplicationTargetCriteria", "protocol");
            }
            this.protocol = protocol;
            return this;
        }
        @CustomType.Setter
        public Builder targetAttributes(List<ZeroTrustAccessApplicationTargetCriteriaTargetAttribute> targetAttributes) {
            if (targetAttributes == null) {
              throw new MissingRequiredPropertyException("ZeroTrustAccessApplicationTargetCriteria", "targetAttributes");
            }
            this.targetAttributes = targetAttributes;
            return this;
        }
        public Builder targetAttributes(ZeroTrustAccessApplicationTargetCriteriaTargetAttribute... targetAttributes) {
            return targetAttributes(List.of(targetAttributes));
        }
        public ZeroTrustAccessApplicationTargetCriteria build() {
            final var _resultValue = new ZeroTrustAccessApplicationTargetCriteria();
            _resultValue.port = port;
            _resultValue.protocol = protocol;
            _resultValue.targetAttributes = targetAttributes;
            return _resultValue;
        }
    }
}