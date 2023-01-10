// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class EmailRoutingRuleAction {
    /**
     * @return Type of supported action.
     * 
     */
    private String type;
    /**
     * @return An array with items in the following form.
     * 
     */
    private List<String> values;

    private EmailRoutingRuleAction() {}
    /**
     * @return Type of supported action.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return An array with items in the following form.
     * 
     */
    public List<String> values() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EmailRoutingRuleAction defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String type;
        private List<String> values;
        public Builder() {}
        public Builder(EmailRoutingRuleAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.values = defaults.values;
        }

        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        @CustomType.Setter
        public Builder values(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }
        public EmailRoutingRuleAction build() {
            final var o = new EmailRoutingRuleAction();
            o.type = type;
            o.values = values;
            return o;
        }
    }
}