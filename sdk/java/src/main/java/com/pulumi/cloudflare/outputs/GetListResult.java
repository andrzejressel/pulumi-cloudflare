// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetListResult {
    /**
     * @return The account identifier to target for the resource.
     * 
     */
    private String accountId;
    /**
     * @return List description.
     * 
     */
    private String description;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return List kind.
     * 
     */
    private String kind;
    /**
     * @return The list name to target for the resource.
     * 
     */
    private String name;
    /**
     * @return Number of items in list.
     * 
     */
    private Integer numitems;

    private GetListResult() {}
    /**
     * @return The account identifier to target for the resource.
     * 
     */
    public String accountId() {
        return this.accountId;
    }
    /**
     * @return List description.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return List kind.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return The list name to target for the resource.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Number of items in list.
     * 
     */
    public Integer numitems() {
        return this.numitems;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetListResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountId;
        private String description;
        private String id;
        private String kind;
        private String name;
        private Integer numitems;
        public Builder() {}
        public Builder(GetListResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.numitems = defaults.numitems;
        }

        @CustomType.Setter
        public Builder accountId(String accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder numitems(Integer numitems) {
            this.numitems = Objects.requireNonNull(numitems);
            return this;
        }
        public GetListResult build() {
            final var _resultValue = new GetListResult();
            _resultValue.accountId = accountId;
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.kind = kind;
            _resultValue.name = name;
            _resultValue.numitems = numitems;
            return _resultValue;
        }
    }
}
