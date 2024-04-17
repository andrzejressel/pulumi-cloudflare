// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.AccessPolicyRequireAuthContextArgs;
import com.pulumi.cloudflare.inputs.AccessPolicyRequireAzureArgs;
import com.pulumi.cloudflare.inputs.AccessPolicyRequireExternalEvaluationArgs;
import com.pulumi.cloudflare.inputs.AccessPolicyRequireGithubArgs;
import com.pulumi.cloudflare.inputs.AccessPolicyRequireGsuiteArgs;
import com.pulumi.cloudflare.inputs.AccessPolicyRequireOktaArgs;
import com.pulumi.cloudflare.inputs.AccessPolicyRequireSamlArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccessPolicyRequireArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessPolicyRequireArgs Empty = new AccessPolicyRequireArgs();

    @Import(name="anyValidServiceToken")
    private @Nullable Output<Boolean> anyValidServiceToken;

    public Optional<Output<Boolean>> anyValidServiceToken() {
        return Optional.ofNullable(this.anyValidServiceToken);
    }

    @Import(name="authContexts")
    private @Nullable Output<List<AccessPolicyRequireAuthContextArgs>> authContexts;

    public Optional<Output<List<AccessPolicyRequireAuthContextArgs>>> authContexts() {
        return Optional.ofNullable(this.authContexts);
    }

    @Import(name="authMethod")
    private @Nullable Output<String> authMethod;

    public Optional<Output<String>> authMethod() {
        return Optional.ofNullable(this.authMethod);
    }

    @Import(name="azures")
    private @Nullable Output<List<AccessPolicyRequireAzureArgs>> azures;

    public Optional<Output<List<AccessPolicyRequireAzureArgs>>> azures() {
        return Optional.ofNullable(this.azures);
    }

    @Import(name="certificate")
    private @Nullable Output<Boolean> certificate;

    public Optional<Output<Boolean>> certificate() {
        return Optional.ofNullable(this.certificate);
    }

    @Import(name="commonName")
    private @Nullable Output<String> commonName;

    public Optional<Output<String>> commonName() {
        return Optional.ofNullable(this.commonName);
    }

    /**
     * Overflow field if you need to have multiple common*name rules in a single policy.  Use in place of the singular common*name field.
     * 
     */
    @Import(name="commonNames")
    private @Nullable Output<List<String>> commonNames;

    /**
     * @return Overflow field if you need to have multiple common*name rules in a single policy.  Use in place of the singular common*name field.
     * 
     */
    public Optional<Output<List<String>>> commonNames() {
        return Optional.ofNullable(this.commonNames);
    }

    @Import(name="devicePostures")
    private @Nullable Output<List<String>> devicePostures;

    public Optional<Output<List<String>>> devicePostures() {
        return Optional.ofNullable(this.devicePostures);
    }

    @Import(name="emailDomains")
    private @Nullable Output<List<String>> emailDomains;

    public Optional<Output<List<String>>> emailDomains() {
        return Optional.ofNullable(this.emailDomains);
    }

    @Import(name="emails")
    private @Nullable Output<List<String>> emails;

    public Optional<Output<List<String>>> emails() {
        return Optional.ofNullable(this.emails);
    }

    @Import(name="everyone")
    private @Nullable Output<Boolean> everyone;

    public Optional<Output<Boolean>> everyone() {
        return Optional.ofNullable(this.everyone);
    }

    @Import(name="externalEvaluation")
    private @Nullable Output<AccessPolicyRequireExternalEvaluationArgs> externalEvaluation;

    public Optional<Output<AccessPolicyRequireExternalEvaluationArgs>> externalEvaluation() {
        return Optional.ofNullable(this.externalEvaluation);
    }

    @Import(name="geos")
    private @Nullable Output<List<String>> geos;

    public Optional<Output<List<String>>> geos() {
        return Optional.ofNullable(this.geos);
    }

    @Import(name="githubs")
    private @Nullable Output<List<AccessPolicyRequireGithubArgs>> githubs;

    public Optional<Output<List<AccessPolicyRequireGithubArgs>>> githubs() {
        return Optional.ofNullable(this.githubs);
    }

    @Import(name="groups")
    private @Nullable Output<List<String>> groups;

    public Optional<Output<List<String>>> groups() {
        return Optional.ofNullable(this.groups);
    }

    @Import(name="gsuites")
    private @Nullable Output<List<AccessPolicyRequireGsuiteArgs>> gsuites;

    public Optional<Output<List<AccessPolicyRequireGsuiteArgs>>> gsuites() {
        return Optional.ofNullable(this.gsuites);
    }

    /**
     * The ID of an existing IP list to reference.
     * 
     */
    @Import(name="ipLists")
    private @Nullable Output<List<String>> ipLists;

    /**
     * @return The ID of an existing IP list to reference.
     * 
     */
    public Optional<Output<List<String>>> ipLists() {
        return Optional.ofNullable(this.ipLists);
    }

    /**
     * An IPv4 or IPv6 CIDR block.
     * 
     */
    @Import(name="ips")
    private @Nullable Output<List<String>> ips;

    /**
     * @return An IPv4 or IPv6 CIDR block.
     * 
     */
    public Optional<Output<List<String>>> ips() {
        return Optional.ofNullable(this.ips);
    }

    @Import(name="loginMethods")
    private @Nullable Output<List<String>> loginMethods;

    public Optional<Output<List<String>>> loginMethods() {
        return Optional.ofNullable(this.loginMethods);
    }

    @Import(name="oktas")
    private @Nullable Output<List<AccessPolicyRequireOktaArgs>> oktas;

    public Optional<Output<List<AccessPolicyRequireOktaArgs>>> oktas() {
        return Optional.ofNullable(this.oktas);
    }

    @Import(name="samls")
    private @Nullable Output<List<AccessPolicyRequireSamlArgs>> samls;

    public Optional<Output<List<AccessPolicyRequireSamlArgs>>> samls() {
        return Optional.ofNullable(this.samls);
    }

    @Import(name="serviceTokens")
    private @Nullable Output<List<String>> serviceTokens;

    public Optional<Output<List<String>>> serviceTokens() {
        return Optional.ofNullable(this.serviceTokens);
    }

    private AccessPolicyRequireArgs() {}

    private AccessPolicyRequireArgs(AccessPolicyRequireArgs $) {
        this.anyValidServiceToken = $.anyValidServiceToken;
        this.authContexts = $.authContexts;
        this.authMethod = $.authMethod;
        this.azures = $.azures;
        this.certificate = $.certificate;
        this.commonName = $.commonName;
        this.commonNames = $.commonNames;
        this.devicePostures = $.devicePostures;
        this.emailDomains = $.emailDomains;
        this.emails = $.emails;
        this.everyone = $.everyone;
        this.externalEvaluation = $.externalEvaluation;
        this.geos = $.geos;
        this.githubs = $.githubs;
        this.groups = $.groups;
        this.gsuites = $.gsuites;
        this.ipLists = $.ipLists;
        this.ips = $.ips;
        this.loginMethods = $.loginMethods;
        this.oktas = $.oktas;
        this.samls = $.samls;
        this.serviceTokens = $.serviceTokens;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessPolicyRequireArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessPolicyRequireArgs $;

        public Builder() {
            $ = new AccessPolicyRequireArgs();
        }

        public Builder(AccessPolicyRequireArgs defaults) {
            $ = new AccessPolicyRequireArgs(Objects.requireNonNull(defaults));
        }

        public Builder anyValidServiceToken(@Nullable Output<Boolean> anyValidServiceToken) {
            $.anyValidServiceToken = anyValidServiceToken;
            return this;
        }

        public Builder anyValidServiceToken(Boolean anyValidServiceToken) {
            return anyValidServiceToken(Output.of(anyValidServiceToken));
        }

        public Builder authContexts(@Nullable Output<List<AccessPolicyRequireAuthContextArgs>> authContexts) {
            $.authContexts = authContexts;
            return this;
        }

        public Builder authContexts(List<AccessPolicyRequireAuthContextArgs> authContexts) {
            return authContexts(Output.of(authContexts));
        }

        public Builder authContexts(AccessPolicyRequireAuthContextArgs... authContexts) {
            return authContexts(List.of(authContexts));
        }

        public Builder authMethod(@Nullable Output<String> authMethod) {
            $.authMethod = authMethod;
            return this;
        }

        public Builder authMethod(String authMethod) {
            return authMethod(Output.of(authMethod));
        }

        public Builder azures(@Nullable Output<List<AccessPolicyRequireAzureArgs>> azures) {
            $.azures = azures;
            return this;
        }

        public Builder azures(List<AccessPolicyRequireAzureArgs> azures) {
            return azures(Output.of(azures));
        }

        public Builder azures(AccessPolicyRequireAzureArgs... azures) {
            return azures(List.of(azures));
        }

        public Builder certificate(@Nullable Output<Boolean> certificate) {
            $.certificate = certificate;
            return this;
        }

        public Builder certificate(Boolean certificate) {
            return certificate(Output.of(certificate));
        }

        public Builder commonName(@Nullable Output<String> commonName) {
            $.commonName = commonName;
            return this;
        }

        public Builder commonName(String commonName) {
            return commonName(Output.of(commonName));
        }

        /**
         * @param commonNames Overflow field if you need to have multiple common*name rules in a single policy.  Use in place of the singular common*name field.
         * 
         * @return builder
         * 
         */
        public Builder commonNames(@Nullable Output<List<String>> commonNames) {
            $.commonNames = commonNames;
            return this;
        }

        /**
         * @param commonNames Overflow field if you need to have multiple common*name rules in a single policy.  Use in place of the singular common*name field.
         * 
         * @return builder
         * 
         */
        public Builder commonNames(List<String> commonNames) {
            return commonNames(Output.of(commonNames));
        }

        /**
         * @param commonNames Overflow field if you need to have multiple common*name rules in a single policy.  Use in place of the singular common*name field.
         * 
         * @return builder
         * 
         */
        public Builder commonNames(String... commonNames) {
            return commonNames(List.of(commonNames));
        }

        public Builder devicePostures(@Nullable Output<List<String>> devicePostures) {
            $.devicePostures = devicePostures;
            return this;
        }

        public Builder devicePostures(List<String> devicePostures) {
            return devicePostures(Output.of(devicePostures));
        }

        public Builder devicePostures(String... devicePostures) {
            return devicePostures(List.of(devicePostures));
        }

        public Builder emailDomains(@Nullable Output<List<String>> emailDomains) {
            $.emailDomains = emailDomains;
            return this;
        }

        public Builder emailDomains(List<String> emailDomains) {
            return emailDomains(Output.of(emailDomains));
        }

        public Builder emailDomains(String... emailDomains) {
            return emailDomains(List.of(emailDomains));
        }

        public Builder emails(@Nullable Output<List<String>> emails) {
            $.emails = emails;
            return this;
        }

        public Builder emails(List<String> emails) {
            return emails(Output.of(emails));
        }

        public Builder emails(String... emails) {
            return emails(List.of(emails));
        }

        public Builder everyone(@Nullable Output<Boolean> everyone) {
            $.everyone = everyone;
            return this;
        }

        public Builder everyone(Boolean everyone) {
            return everyone(Output.of(everyone));
        }

        public Builder externalEvaluation(@Nullable Output<AccessPolicyRequireExternalEvaluationArgs> externalEvaluation) {
            $.externalEvaluation = externalEvaluation;
            return this;
        }

        public Builder externalEvaluation(AccessPolicyRequireExternalEvaluationArgs externalEvaluation) {
            return externalEvaluation(Output.of(externalEvaluation));
        }

        public Builder geos(@Nullable Output<List<String>> geos) {
            $.geos = geos;
            return this;
        }

        public Builder geos(List<String> geos) {
            return geos(Output.of(geos));
        }

        public Builder geos(String... geos) {
            return geos(List.of(geos));
        }

        public Builder githubs(@Nullable Output<List<AccessPolicyRequireGithubArgs>> githubs) {
            $.githubs = githubs;
            return this;
        }

        public Builder githubs(List<AccessPolicyRequireGithubArgs> githubs) {
            return githubs(Output.of(githubs));
        }

        public Builder githubs(AccessPolicyRequireGithubArgs... githubs) {
            return githubs(List.of(githubs));
        }

        public Builder groups(@Nullable Output<List<String>> groups) {
            $.groups = groups;
            return this;
        }

        public Builder groups(List<String> groups) {
            return groups(Output.of(groups));
        }

        public Builder groups(String... groups) {
            return groups(List.of(groups));
        }

        public Builder gsuites(@Nullable Output<List<AccessPolicyRequireGsuiteArgs>> gsuites) {
            $.gsuites = gsuites;
            return this;
        }

        public Builder gsuites(List<AccessPolicyRequireGsuiteArgs> gsuites) {
            return gsuites(Output.of(gsuites));
        }

        public Builder gsuites(AccessPolicyRequireGsuiteArgs... gsuites) {
            return gsuites(List.of(gsuites));
        }

        /**
         * @param ipLists The ID of an existing IP list to reference.
         * 
         * @return builder
         * 
         */
        public Builder ipLists(@Nullable Output<List<String>> ipLists) {
            $.ipLists = ipLists;
            return this;
        }

        /**
         * @param ipLists The ID of an existing IP list to reference.
         * 
         * @return builder
         * 
         */
        public Builder ipLists(List<String> ipLists) {
            return ipLists(Output.of(ipLists));
        }

        /**
         * @param ipLists The ID of an existing IP list to reference.
         * 
         * @return builder
         * 
         */
        public Builder ipLists(String... ipLists) {
            return ipLists(List.of(ipLists));
        }

        /**
         * @param ips An IPv4 or IPv6 CIDR block.
         * 
         * @return builder
         * 
         */
        public Builder ips(@Nullable Output<List<String>> ips) {
            $.ips = ips;
            return this;
        }

        /**
         * @param ips An IPv4 or IPv6 CIDR block.
         * 
         * @return builder
         * 
         */
        public Builder ips(List<String> ips) {
            return ips(Output.of(ips));
        }

        /**
         * @param ips An IPv4 or IPv6 CIDR block.
         * 
         * @return builder
         * 
         */
        public Builder ips(String... ips) {
            return ips(List.of(ips));
        }

        public Builder loginMethods(@Nullable Output<List<String>> loginMethods) {
            $.loginMethods = loginMethods;
            return this;
        }

        public Builder loginMethods(List<String> loginMethods) {
            return loginMethods(Output.of(loginMethods));
        }

        public Builder loginMethods(String... loginMethods) {
            return loginMethods(List.of(loginMethods));
        }

        public Builder oktas(@Nullable Output<List<AccessPolicyRequireOktaArgs>> oktas) {
            $.oktas = oktas;
            return this;
        }

        public Builder oktas(List<AccessPolicyRequireOktaArgs> oktas) {
            return oktas(Output.of(oktas));
        }

        public Builder oktas(AccessPolicyRequireOktaArgs... oktas) {
            return oktas(List.of(oktas));
        }

        public Builder samls(@Nullable Output<List<AccessPolicyRequireSamlArgs>> samls) {
            $.samls = samls;
            return this;
        }

        public Builder samls(List<AccessPolicyRequireSamlArgs> samls) {
            return samls(Output.of(samls));
        }

        public Builder samls(AccessPolicyRequireSamlArgs... samls) {
            return samls(List.of(samls));
        }

        public Builder serviceTokens(@Nullable Output<List<String>> serviceTokens) {
            $.serviceTokens = serviceTokens;
            return this;
        }

        public Builder serviceTokens(List<String> serviceTokens) {
            return serviceTokens(Output.of(serviceTokens));
        }

        public Builder serviceTokens(String... serviceTokens) {
            return serviceTokens(List.of(serviceTokens));
        }

        public AccessPolicyRequireArgs build() {
            return $;
        }
    }

}
