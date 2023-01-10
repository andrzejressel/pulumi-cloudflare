// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.GetLoadBalancerPoolsPoolLoadShedding;
import com.pulumi.cloudflare.outputs.GetLoadBalancerPoolsPoolOrigin;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetLoadBalancerPoolsPool {
    /**
     * @return List of regions (specified by region code) from which to run health checks. Empty means every Cloudflare data center (the default), but requires an Enterprise plan. Region codes can be found [here](https://support.cloudflare.com/hc/en-us/articles/115000540888-Load-Balancing-Geographic-Regions).
     * 
     */
    private List<String> checkRegions;
    /**
     * @return The RFC3339 timestamp of when the load balancer was created.
     * 
     */
    private String createdOn;
    /**
     * @return Brief description of the Load Balancer Pool intention.
     * 
     */
    private String description;
    /**
     * @return Whether this pool is enabled. Disabled pools will not receive traffic and are excluded from health checks.
     * 
     */
    private Boolean enabled;
    /**
     * @return ID for this load balancer pool.
     * 
     */
    private String id;
    /**
     * @return Latitude this pool is physically located at; used for proximity steering.
     * 
     */
    private Double latitude;
    /**
     * @return Setting for controlling load shedding for this pool.
     * 
     */
    private List<GetLoadBalancerPoolsPoolLoadShedding> loadSheddings;
    /**
     * @return Longitude this pool is physically located at; used for proximity steering.
     * 
     */
    private Double longitude;
    /**
     * @return Minimum number of origins that must be healthy for this pool to serve traffic.
     * 
     */
    private Integer minimumOrigins;
    /**
     * @return The RFC3339 timestamp of when the load balancer was last modified.
     * 
     */
    private String modifiedOn;
    /**
     * @return ID of the Monitor to use for health checking origins within this pool.
     * 
     */
    private String monitor;
    /**
     * @return Short name (tag) for the pool.
     * 
     */
    private String name;
    /**
     * @return Email address to send health status notifications to. Multiple emails are set as a comma delimited list.
     * 
     */
    private String notificationEmail;
    /**
     * @return The list of origins within this pool.
     * 
     */
    private List<GetLoadBalancerPoolsPoolOrigin> origins;

    private GetLoadBalancerPoolsPool() {}
    /**
     * @return List of regions (specified by region code) from which to run health checks. Empty means every Cloudflare data center (the default), but requires an Enterprise plan. Region codes can be found [here](https://support.cloudflare.com/hc/en-us/articles/115000540888-Load-Balancing-Geographic-Regions).
     * 
     */
    public List<String> checkRegions() {
        return this.checkRegions;
    }
    /**
     * @return The RFC3339 timestamp of when the load balancer was created.
     * 
     */
    public String createdOn() {
        return this.createdOn;
    }
    /**
     * @return Brief description of the Load Balancer Pool intention.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Whether this pool is enabled. Disabled pools will not receive traffic and are excluded from health checks.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return ID for this load balancer pool.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Latitude this pool is physically located at; used for proximity steering.
     * 
     */
    public Double latitude() {
        return this.latitude;
    }
    /**
     * @return Setting for controlling load shedding for this pool.
     * 
     */
    public List<GetLoadBalancerPoolsPoolLoadShedding> loadSheddings() {
        return this.loadSheddings;
    }
    /**
     * @return Longitude this pool is physically located at; used for proximity steering.
     * 
     */
    public Double longitude() {
        return this.longitude;
    }
    /**
     * @return Minimum number of origins that must be healthy for this pool to serve traffic.
     * 
     */
    public Integer minimumOrigins() {
        return this.minimumOrigins;
    }
    /**
     * @return The RFC3339 timestamp of when the load balancer was last modified.
     * 
     */
    public String modifiedOn() {
        return this.modifiedOn;
    }
    /**
     * @return ID of the Monitor to use for health checking origins within this pool.
     * 
     */
    public String monitor() {
        return this.monitor;
    }
    /**
     * @return Short name (tag) for the pool.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Email address to send health status notifications to. Multiple emails are set as a comma delimited list.
     * 
     */
    public String notificationEmail() {
        return this.notificationEmail;
    }
    /**
     * @return The list of origins within this pool.
     * 
     */
    public List<GetLoadBalancerPoolsPoolOrigin> origins() {
        return this.origins;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLoadBalancerPoolsPool defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> checkRegions;
        private String createdOn;
        private String description;
        private Boolean enabled;
        private String id;
        private Double latitude;
        private List<GetLoadBalancerPoolsPoolLoadShedding> loadSheddings;
        private Double longitude;
        private Integer minimumOrigins;
        private String modifiedOn;
        private String monitor;
        private String name;
        private String notificationEmail;
        private List<GetLoadBalancerPoolsPoolOrigin> origins;
        public Builder() {}
        public Builder(GetLoadBalancerPoolsPool defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.checkRegions = defaults.checkRegions;
    	      this.createdOn = defaults.createdOn;
    	      this.description = defaults.description;
    	      this.enabled = defaults.enabled;
    	      this.id = defaults.id;
    	      this.latitude = defaults.latitude;
    	      this.loadSheddings = defaults.loadSheddings;
    	      this.longitude = defaults.longitude;
    	      this.minimumOrigins = defaults.minimumOrigins;
    	      this.modifiedOn = defaults.modifiedOn;
    	      this.monitor = defaults.monitor;
    	      this.name = defaults.name;
    	      this.notificationEmail = defaults.notificationEmail;
    	      this.origins = defaults.origins;
        }

        @CustomType.Setter
        public Builder checkRegions(List<String> checkRegions) {
            this.checkRegions = Objects.requireNonNull(checkRegions);
            return this;
        }
        public Builder checkRegions(String... checkRegions) {
            return checkRegions(List.of(checkRegions));
        }
        @CustomType.Setter
        public Builder createdOn(String createdOn) {
            this.createdOn = Objects.requireNonNull(createdOn);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder latitude(Double latitude) {
            this.latitude = Objects.requireNonNull(latitude);
            return this;
        }
        @CustomType.Setter
        public Builder loadSheddings(List<GetLoadBalancerPoolsPoolLoadShedding> loadSheddings) {
            this.loadSheddings = Objects.requireNonNull(loadSheddings);
            return this;
        }
        public Builder loadSheddings(GetLoadBalancerPoolsPoolLoadShedding... loadSheddings) {
            return loadSheddings(List.of(loadSheddings));
        }
        @CustomType.Setter
        public Builder longitude(Double longitude) {
            this.longitude = Objects.requireNonNull(longitude);
            return this;
        }
        @CustomType.Setter
        public Builder minimumOrigins(Integer minimumOrigins) {
            this.minimumOrigins = Objects.requireNonNull(minimumOrigins);
            return this;
        }
        @CustomType.Setter
        public Builder modifiedOn(String modifiedOn) {
            this.modifiedOn = Objects.requireNonNull(modifiedOn);
            return this;
        }
        @CustomType.Setter
        public Builder monitor(String monitor) {
            this.monitor = Objects.requireNonNull(monitor);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder notificationEmail(String notificationEmail) {
            this.notificationEmail = Objects.requireNonNull(notificationEmail);
            return this;
        }
        @CustomType.Setter
        public Builder origins(List<GetLoadBalancerPoolsPoolOrigin> origins) {
            this.origins = Objects.requireNonNull(origins);
            return this;
        }
        public Builder origins(GetLoadBalancerPoolsPoolOrigin... origins) {
            return origins(List.of(origins));
        }
        public GetLoadBalancerPoolsPool build() {
            final var o = new GetLoadBalancerPoolsPool();
            o.checkRegions = checkRegions;
            o.createdOn = createdOn;
            o.description = description;
            o.enabled = enabled;
            o.id = id;
            o.latitude = latitude;
            o.loadSheddings = loadSheddings;
            o.longitude = longitude;
            o.minimumOrigins = minimumOrigins;
            o.modifiedOn = modifiedOn;
            o.monitor = monitor;
            o.name = name;
            o.notificationEmail = notificationEmail;
            o.origins = origins;
            return o;
        }
    }
}