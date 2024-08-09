// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class WorkersScriptPlainTextBinding {
    /**
     * @return The global variable for the binding in your Worker code.
     * 
     */
    private String name;
    /**
     * @return The plain text you want to store.
     * 
     */
    private String text;

    private WorkersScriptPlainTextBinding() {}
    /**
     * @return The global variable for the binding in your Worker code.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The plain text you want to store.
     * 
     */
    public String text() {
        return this.text;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkersScriptPlainTextBinding defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String text;
        public Builder() {}
        public Builder(WorkersScriptPlainTextBinding defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.text = defaults.text;
        }

        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("WorkersScriptPlainTextBinding", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder text(String text) {
            if (text == null) {
              throw new MissingRequiredPropertyException("WorkersScriptPlainTextBinding", "text");
            }
            this.text = text;
            return this;
        }
        public WorkersScriptPlainTextBinding build() {
            final var _resultValue = new WorkersScriptPlainTextBinding();
            _resultValue.name = name;
            _resultValue.text = text;
            return _resultValue;
        }
    }
}
