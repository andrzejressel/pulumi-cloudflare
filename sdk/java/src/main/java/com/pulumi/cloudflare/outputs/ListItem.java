// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.ListItemValue;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListItem {
    /**
     * @return An optional comment for the item.
     * 
     */
    private @Nullable String comment;
    private ListItemValue value;

    private ListItem() {}
    /**
     * @return An optional comment for the item.
     * 
     */
    public Optional<String> comment() {
        return Optional.ofNullable(this.comment);
    }
    public ListItemValue value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String comment;
        private ListItemValue value;
        public Builder() {}
        public Builder(ListItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder comment(@Nullable String comment) {
            this.comment = comment;
            return this;
        }
        @CustomType.Setter
        public Builder value(ListItemValue value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public ListItem build() {
            final var o = new ListItem();
            o.comment = comment;
            o.value = value;
            return o;
        }
    }
}
