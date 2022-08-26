// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ArgoTunnelState extends com.pulumi.resources.ResourceArgs {

    public static final ArgoTunnelState Empty = new ArgoTunnelState();

    /**
     * The Cloudflare account ID that you wish to manage the Argo Tunnel on.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return The Cloudflare account ID that you wish to manage the Argo Tunnel on.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * Usable CNAME for accessing the Argo Tunnel.
     * 
     */
    @Import(name="cname")
    private @Nullable Output<String> cname;

    /**
     * @return Usable CNAME for accessing the Argo Tunnel.
     * 
     */
    public Optional<Output<String>> cname() {
        return Optional.ofNullable(this.cname);
    }

    /**
     * A user-friendly name chosen when the tunnel is created. Cannot be empty.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A user-friendly name chosen when the tunnel is created. Cannot be empty.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * 32 or more bytes, encoded as a base64 string. The Create Argo Tunnel endpoint sets this as the tunnel&#39;s password. Anyone wishing to run the tunnel needs this password.
     * 
     */
    @Import(name="secret")
    private @Nullable Output<String> secret;

    /**
     * @return 32 or more bytes, encoded as a base64 string. The Create Argo Tunnel endpoint sets this as the tunnel&#39;s password. Anyone wishing to run the tunnel needs this password.
     * 
     */
    public Optional<Output<String>> secret() {
        return Optional.ofNullable(this.secret);
    }

    /**
     * Token used by a connector to authenticate and run the tunnel.
     * 
     */
    @Import(name="tunnelToken")
    private @Nullable Output<String> tunnelToken;

    /**
     * @return Token used by a connector to authenticate and run the tunnel.
     * 
     */
    public Optional<Output<String>> tunnelToken() {
        return Optional.ofNullable(this.tunnelToken);
    }

    private ArgoTunnelState() {}

    private ArgoTunnelState(ArgoTunnelState $) {
        this.accountId = $.accountId;
        this.cname = $.cname;
        this.name = $.name;
        this.secret = $.secret;
        this.tunnelToken = $.tunnelToken;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ArgoTunnelState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ArgoTunnelState $;

        public Builder() {
            $ = new ArgoTunnelState();
        }

        public Builder(ArgoTunnelState defaults) {
            $ = new ArgoTunnelState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The Cloudflare account ID that you wish to manage the Argo Tunnel on.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The Cloudflare account ID that you wish to manage the Argo Tunnel on.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param cname Usable CNAME for accessing the Argo Tunnel.
         * 
         * @return builder
         * 
         */
        public Builder cname(@Nullable Output<String> cname) {
            $.cname = cname;
            return this;
        }

        /**
         * @param cname Usable CNAME for accessing the Argo Tunnel.
         * 
         * @return builder
         * 
         */
        public Builder cname(String cname) {
            return cname(Output.of(cname));
        }

        /**
         * @param name A user-friendly name chosen when the tunnel is created. Cannot be empty.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A user-friendly name chosen when the tunnel is created. Cannot be empty.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param secret 32 or more bytes, encoded as a base64 string. The Create Argo Tunnel endpoint sets this as the tunnel&#39;s password. Anyone wishing to run the tunnel needs this password.
         * 
         * @return builder
         * 
         */
        public Builder secret(@Nullable Output<String> secret) {
            $.secret = secret;
            return this;
        }

        /**
         * @param secret 32 or more bytes, encoded as a base64 string. The Create Argo Tunnel endpoint sets this as the tunnel&#39;s password. Anyone wishing to run the tunnel needs this password.
         * 
         * @return builder
         * 
         */
        public Builder secret(String secret) {
            return secret(Output.of(secret));
        }

        /**
         * @param tunnelToken Token used by a connector to authenticate and run the tunnel.
         * 
         * @return builder
         * 
         */
        public Builder tunnelToken(@Nullable Output<String> tunnelToken) {
            $.tunnelToken = tunnelToken;
            return this;
        }

        /**
         * @param tunnelToken Token used by a connector to authenticate and run the tunnel.
         * 
         * @return builder
         * 
         */
        public Builder tunnelToken(String tunnelToken) {
            return tunnelToken(Output.of(tunnelToken));
        }

        public ArgoTunnelState build() {
            return $;
        }
    }

}
