// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.GetListsList;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetListsResult {
    /**
     * @return The account identifier to target for the resource.
     * 
     */
    private String accountId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<GetListsList> lists;

    private GetListsResult() {}
    /**
     * @return The account identifier to target for the resource.
     * 
     */
    public String accountId() {
        return this.accountId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<GetListsList> lists() {
        return this.lists;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetListsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountId;
        private String id;
        private List<GetListsList> lists;
        public Builder() {}
        public Builder(GetListsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.id = defaults.id;
    	      this.lists = defaults.lists;
        }

        @CustomType.Setter
        public Builder accountId(String accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder lists(List<GetListsList> lists) {
            this.lists = Objects.requireNonNull(lists);
            return this;
        }
        public Builder lists(GetListsList... lists) {
            return lists(List.of(lists));
        }
        public GetListsResult build() {
            final var _resultValue = new GetListsResult();
            _resultValue.accountId = accountId;
            _resultValue.id = id;
            _resultValue.lists = lists;
            return _resultValue;
        }
    }
}
