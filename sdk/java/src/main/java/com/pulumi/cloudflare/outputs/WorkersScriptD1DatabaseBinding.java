// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class WorkersScriptD1DatabaseBinding {
    /**
     * @return Database ID of D1 database to use.
     * 
     */
    private String databaseId;
    /**
     * @return The global variable for the binding in your Worker code.
     * 
     */
    private String name;

    private WorkersScriptD1DatabaseBinding() {}
    /**
     * @return Database ID of D1 database to use.
     * 
     */
    public String databaseId() {
        return this.databaseId;
    }
    /**
     * @return The global variable for the binding in your Worker code.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkersScriptD1DatabaseBinding defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String databaseId;
        private String name;
        public Builder() {}
        public Builder(WorkersScriptD1DatabaseBinding defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseId = defaults.databaseId;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder databaseId(String databaseId) {
            if (databaseId == null) {
              throw new MissingRequiredPropertyException("WorkersScriptD1DatabaseBinding", "databaseId");
            }
            this.databaseId = databaseId;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("WorkersScriptD1DatabaseBinding", "name");
            }
            this.name = name;
            return this;
        }
        public WorkersScriptD1DatabaseBinding build() {
            final var _resultValue = new WorkersScriptD1DatabaseBinding();
            _resultValue.databaseId = databaseId;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
