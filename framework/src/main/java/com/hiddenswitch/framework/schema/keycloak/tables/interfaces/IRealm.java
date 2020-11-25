/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.keycloak.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.UnexpectedJsonValueType;
import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IRealm extends VertxPojo, Serializable {

    /**
     * Setter for <code>keycloak.realm.id</code>.
     */
    public IRealm setId(String value);

    /**
     * Getter for <code>keycloak.realm.id</code>.
     */
    public String getId();

    /**
     * Setter for <code>keycloak.realm.access_code_lifespan</code>.
     */
    public IRealm setAccessCodeLifespan(Integer value);

    /**
     * Getter for <code>keycloak.realm.access_code_lifespan</code>.
     */
    public Integer getAccessCodeLifespan();

    /**
     * Setter for <code>keycloak.realm.user_action_lifespan</code>.
     */
    public IRealm setUserActionLifespan(Integer value);

    /**
     * Getter for <code>keycloak.realm.user_action_lifespan</code>.
     */
    public Integer getUserActionLifespan();

    /**
     * Setter for <code>keycloak.realm.access_token_lifespan</code>.
     */
    public IRealm setAccessTokenLifespan(Integer value);

    /**
     * Getter for <code>keycloak.realm.access_token_lifespan</code>.
     */
    public Integer getAccessTokenLifespan();

    /**
     * Setter for <code>keycloak.realm.account_theme</code>.
     */
    public IRealm setAccountTheme(String value);

    /**
     * Getter for <code>keycloak.realm.account_theme</code>.
     */
    public String getAccountTheme();

    /**
     * Setter for <code>keycloak.realm.admin_theme</code>.
     */
    public IRealm setAdminTheme(String value);

    /**
     * Getter for <code>keycloak.realm.admin_theme</code>.
     */
    public String getAdminTheme();

    /**
     * Setter for <code>keycloak.realm.email_theme</code>.
     */
    public IRealm setEmailTheme(String value);

    /**
     * Getter for <code>keycloak.realm.email_theme</code>.
     */
    public String getEmailTheme();

    /**
     * Setter for <code>keycloak.realm.enabled</code>.
     */
    public IRealm setEnabled(Boolean value);

    /**
     * Getter for <code>keycloak.realm.enabled</code>.
     */
    public Boolean getEnabled();

    /**
     * Setter for <code>keycloak.realm.events_enabled</code>.
     */
    public IRealm setEventsEnabled(Boolean value);

    /**
     * Getter for <code>keycloak.realm.events_enabled</code>.
     */
    public Boolean getEventsEnabled();

    /**
     * Setter for <code>keycloak.realm.events_expiration</code>.
     */
    public IRealm setEventsExpiration(Long value);

    /**
     * Getter for <code>keycloak.realm.events_expiration</code>.
     */
    public Long getEventsExpiration();

    /**
     * Setter for <code>keycloak.realm.login_theme</code>.
     */
    public IRealm setLoginTheme(String value);

    /**
     * Getter for <code>keycloak.realm.login_theme</code>.
     */
    public String getLoginTheme();

    /**
     * Setter for <code>keycloak.realm.name</code>.
     */
    public IRealm setName(String value);

    /**
     * Getter for <code>keycloak.realm.name</code>.
     */
    public String getName();

    /**
     * Setter for <code>keycloak.realm.not_before</code>.
     */
    public IRealm setNotBefore(Integer value);

    /**
     * Getter for <code>keycloak.realm.not_before</code>.
     */
    public Integer getNotBefore();

    /**
     * Setter for <code>keycloak.realm.password_policy</code>.
     */
    public IRealm setPasswordPolicy(String value);

    /**
     * Getter for <code>keycloak.realm.password_policy</code>.
     */
    public String getPasswordPolicy();

    /**
     * Setter for <code>keycloak.realm.registration_allowed</code>.
     */
    public IRealm setRegistrationAllowed(Boolean value);

    /**
     * Getter for <code>keycloak.realm.registration_allowed</code>.
     */
    public Boolean getRegistrationAllowed();

    /**
     * Setter for <code>keycloak.realm.remember_me</code>.
     */
    public IRealm setRememberMe(Boolean value);

    /**
     * Getter for <code>keycloak.realm.remember_me</code>.
     */
    public Boolean getRememberMe();

    /**
     * Setter for <code>keycloak.realm.reset_password_allowed</code>.
     */
    public IRealm setResetPasswordAllowed(Boolean value);

    /**
     * Getter for <code>keycloak.realm.reset_password_allowed</code>.
     */
    public Boolean getResetPasswordAllowed();

    /**
     * Setter for <code>keycloak.realm.social</code>.
     */
    public IRealm setSocial(Boolean value);

    /**
     * Getter for <code>keycloak.realm.social</code>.
     */
    public Boolean getSocial();

    /**
     * Setter for <code>keycloak.realm.ssl_required</code>.
     */
    public IRealm setSslRequired(String value);

    /**
     * Getter for <code>keycloak.realm.ssl_required</code>.
     */
    public String getSslRequired();

    /**
     * Setter for <code>keycloak.realm.sso_idle_timeout</code>.
     */
    public IRealm setSsoIdleTimeout(Integer value);

    /**
     * Getter for <code>keycloak.realm.sso_idle_timeout</code>.
     */
    public Integer getSsoIdleTimeout();

    /**
     * Setter for <code>keycloak.realm.sso_max_lifespan</code>.
     */
    public IRealm setSsoMaxLifespan(Integer value);

    /**
     * Getter for <code>keycloak.realm.sso_max_lifespan</code>.
     */
    public Integer getSsoMaxLifespan();

    /**
     * Setter for <code>keycloak.realm.update_profile_on_soc_login</code>.
     */
    public IRealm setUpdateProfileOnSocLogin(Boolean value);

    /**
     * Getter for <code>keycloak.realm.update_profile_on_soc_login</code>.
     */
    public Boolean getUpdateProfileOnSocLogin();

    /**
     * Setter for <code>keycloak.realm.verify_email</code>.
     */
    public IRealm setVerifyEmail(Boolean value);

    /**
     * Getter for <code>keycloak.realm.verify_email</code>.
     */
    public Boolean getVerifyEmail();

    /**
     * Setter for <code>keycloak.realm.master_admin_client</code>.
     */
    public IRealm setMasterAdminClient(String value);

    /**
     * Getter for <code>keycloak.realm.master_admin_client</code>.
     */
    public String getMasterAdminClient();

    /**
     * Setter for <code>keycloak.realm.login_lifespan</code>.
     */
    public IRealm setLoginLifespan(Integer value);

    /**
     * Getter for <code>keycloak.realm.login_lifespan</code>.
     */
    public Integer getLoginLifespan();

    /**
     * Setter for <code>keycloak.realm.internationalization_enabled</code>.
     */
    public IRealm setInternationalizationEnabled(Boolean value);

    /**
     * Getter for <code>keycloak.realm.internationalization_enabled</code>.
     */
    public Boolean getInternationalizationEnabled();

    /**
     * Setter for <code>keycloak.realm.default_locale</code>.
     */
    public IRealm setDefaultLocale(String value);

    /**
     * Getter for <code>keycloak.realm.default_locale</code>.
     */
    public String getDefaultLocale();

    /**
     * Setter for <code>keycloak.realm.reg_email_as_username</code>.
     */
    public IRealm setRegEmailAsUsername(Boolean value);

    /**
     * Getter for <code>keycloak.realm.reg_email_as_username</code>.
     */
    public Boolean getRegEmailAsUsername();

    /**
     * Setter for <code>keycloak.realm.admin_events_enabled</code>.
     */
    public IRealm setAdminEventsEnabled(Boolean value);

    /**
     * Getter for <code>keycloak.realm.admin_events_enabled</code>.
     */
    public Boolean getAdminEventsEnabled();

    /**
     * Setter for <code>keycloak.realm.admin_events_details_enabled</code>.
     */
    public IRealm setAdminEventsDetailsEnabled(Boolean value);

    /**
     * Getter for <code>keycloak.realm.admin_events_details_enabled</code>.
     */
    public Boolean getAdminEventsDetailsEnabled();

    /**
     * Setter for <code>keycloak.realm.edit_username_allowed</code>.
     */
    public IRealm setEditUsernameAllowed(Boolean value);

    /**
     * Getter for <code>keycloak.realm.edit_username_allowed</code>.
     */
    public Boolean getEditUsernameAllowed();

    /**
     * Setter for <code>keycloak.realm.otp_policy_counter</code>.
     */
    public IRealm setOtpPolicyCounter(Integer value);

    /**
     * Getter for <code>keycloak.realm.otp_policy_counter</code>.
     */
    public Integer getOtpPolicyCounter();

    /**
     * Setter for <code>keycloak.realm.otp_policy_window</code>.
     */
    public IRealm setOtpPolicyWindow(Integer value);

    /**
     * Getter for <code>keycloak.realm.otp_policy_window</code>.
     */
    public Integer getOtpPolicyWindow();

    /**
     * Setter for <code>keycloak.realm.otp_policy_period</code>.
     */
    public IRealm setOtpPolicyPeriod(Integer value);

    /**
     * Getter for <code>keycloak.realm.otp_policy_period</code>.
     */
    public Integer getOtpPolicyPeriod();

    /**
     * Setter for <code>keycloak.realm.otp_policy_digits</code>.
     */
    public IRealm setOtpPolicyDigits(Integer value);

    /**
     * Getter for <code>keycloak.realm.otp_policy_digits</code>.
     */
    public Integer getOtpPolicyDigits();

    /**
     * Setter for <code>keycloak.realm.otp_policy_alg</code>.
     */
    public IRealm setOtpPolicyAlg(String value);

    /**
     * Getter for <code>keycloak.realm.otp_policy_alg</code>.
     */
    public String getOtpPolicyAlg();

    /**
     * Setter for <code>keycloak.realm.otp_policy_type</code>.
     */
    public IRealm setOtpPolicyType(String value);

    /**
     * Getter for <code>keycloak.realm.otp_policy_type</code>.
     */
    public String getOtpPolicyType();

    /**
     * Setter for <code>keycloak.realm.browser_flow</code>.
     */
    public IRealm setBrowserFlow(String value);

    /**
     * Getter for <code>keycloak.realm.browser_flow</code>.
     */
    public String getBrowserFlow();

    /**
     * Setter for <code>keycloak.realm.registration_flow</code>.
     */
    public IRealm setRegistrationFlow(String value);

    /**
     * Getter for <code>keycloak.realm.registration_flow</code>.
     */
    public String getRegistrationFlow();

    /**
     * Setter for <code>keycloak.realm.direct_grant_flow</code>.
     */
    public IRealm setDirectGrantFlow(String value);

    /**
     * Getter for <code>keycloak.realm.direct_grant_flow</code>.
     */
    public String getDirectGrantFlow();

    /**
     * Setter for <code>keycloak.realm.reset_credentials_flow</code>.
     */
    public IRealm setResetCredentialsFlow(String value);

    /**
     * Getter for <code>keycloak.realm.reset_credentials_flow</code>.
     */
    public String getResetCredentialsFlow();

    /**
     * Setter for <code>keycloak.realm.client_auth_flow</code>.
     */
    public IRealm setClientAuthFlow(String value);

    /**
     * Getter for <code>keycloak.realm.client_auth_flow</code>.
     */
    public String getClientAuthFlow();

    /**
     * Setter for <code>keycloak.realm.offline_session_idle_timeout</code>.
     */
    public IRealm setOfflineSessionIdleTimeout(Integer value);

    /**
     * Getter for <code>keycloak.realm.offline_session_idle_timeout</code>.
     */
    public Integer getOfflineSessionIdleTimeout();

    /**
     * Setter for <code>keycloak.realm.revoke_refresh_token</code>.
     */
    public IRealm setRevokeRefreshToken(Boolean value);

    /**
     * Getter for <code>keycloak.realm.revoke_refresh_token</code>.
     */
    public Boolean getRevokeRefreshToken();

    /**
     * Setter for <code>keycloak.realm.access_token_life_implicit</code>.
     */
    public IRealm setAccessTokenLifeImplicit(Integer value);

    /**
     * Getter for <code>keycloak.realm.access_token_life_implicit</code>.
     */
    public Integer getAccessTokenLifeImplicit();

    /**
     * Setter for <code>keycloak.realm.login_with_email_allowed</code>.
     */
    public IRealm setLoginWithEmailAllowed(Boolean value);

    /**
     * Getter for <code>keycloak.realm.login_with_email_allowed</code>.
     */
    public Boolean getLoginWithEmailAllowed();

    /**
     * Setter for <code>keycloak.realm.duplicate_emails_allowed</code>.
     */
    public IRealm setDuplicateEmailsAllowed(Boolean value);

    /**
     * Getter for <code>keycloak.realm.duplicate_emails_allowed</code>.
     */
    public Boolean getDuplicateEmailsAllowed();

    /**
     * Setter for <code>keycloak.realm.docker_auth_flow</code>.
     */
    public IRealm setDockerAuthFlow(String value);

    /**
     * Getter for <code>keycloak.realm.docker_auth_flow</code>.
     */
    public String getDockerAuthFlow();

    /**
     * Setter for <code>keycloak.realm.refresh_token_max_reuse</code>.
     */
    public IRealm setRefreshTokenMaxReuse(Integer value);

    /**
     * Getter for <code>keycloak.realm.refresh_token_max_reuse</code>.
     */
    public Integer getRefreshTokenMaxReuse();

    /**
     * Setter for <code>keycloak.realm.allow_user_managed_access</code>.
     */
    public IRealm setAllowUserManagedAccess(Boolean value);

    /**
     * Getter for <code>keycloak.realm.allow_user_managed_access</code>.
     */
    public Boolean getAllowUserManagedAccess();

    /**
     * Setter for <code>keycloak.realm.sso_max_lifespan_remember_me</code>.
     */
    public IRealm setSsoMaxLifespanRememberMe(Integer value);

    /**
     * Getter for <code>keycloak.realm.sso_max_lifespan_remember_me</code>.
     */
    public Integer getSsoMaxLifespanRememberMe();

    /**
     * Setter for <code>keycloak.realm.sso_idle_timeout_remember_me</code>.
     */
    public IRealm setSsoIdleTimeoutRememberMe(Integer value);

    /**
     * Getter for <code>keycloak.realm.sso_idle_timeout_remember_me</code>.
     */
    public Integer getSsoIdleTimeoutRememberMe();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IRealm
     */
    public void from(IRealm from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IRealm
     */
    public <E extends IRealm> E into(E into);

    @Override
    public default IRealm fromJson(io.vertx.core.json.JsonObject json) {
        try {
            setId(json.getString("id"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("id","java.lang.String",e);
        }
        try {
            setAccessCodeLifespan(json.getInteger("access_code_lifespan"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("access_code_lifespan","java.lang.Integer",e);
        }
        try {
            setUserActionLifespan(json.getInteger("user_action_lifespan"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("user_action_lifespan","java.lang.Integer",e);
        }
        try {
            setAccessTokenLifespan(json.getInteger("access_token_lifespan"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("access_token_lifespan","java.lang.Integer",e);
        }
        try {
            setAccountTheme(json.getString("account_theme"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("account_theme","java.lang.String",e);
        }
        try {
            setAdminTheme(json.getString("admin_theme"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("admin_theme","java.lang.String",e);
        }
        try {
            setEmailTheme(json.getString("email_theme"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("email_theme","java.lang.String",e);
        }
        try {
            setEnabled(json.getBoolean("enabled"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("enabled","java.lang.Boolean",e);
        }
        try {
            setEventsEnabled(json.getBoolean("events_enabled"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("events_enabled","java.lang.Boolean",e);
        }
        try {
            setEventsExpiration(json.getLong("events_expiration"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("events_expiration","java.lang.Long",e);
        }
        try {
            setLoginTheme(json.getString("login_theme"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("login_theme","java.lang.String",e);
        }
        try {
            setName(json.getString("name"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("name","java.lang.String",e);
        }
        try {
            setNotBefore(json.getInteger("not_before"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("not_before","java.lang.Integer",e);
        }
        try {
            setPasswordPolicy(json.getString("password_policy"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("password_policy","java.lang.String",e);
        }
        try {
            setRegistrationAllowed(json.getBoolean("registration_allowed"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("registration_allowed","java.lang.Boolean",e);
        }
        try {
            setRememberMe(json.getBoolean("remember_me"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("remember_me","java.lang.Boolean",e);
        }
        try {
            setResetPasswordAllowed(json.getBoolean("reset_password_allowed"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("reset_password_allowed","java.lang.Boolean",e);
        }
        try {
            setSocial(json.getBoolean("social"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("social","java.lang.Boolean",e);
        }
        try {
            setSslRequired(json.getString("ssl_required"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("ssl_required","java.lang.String",e);
        }
        try {
            setSsoIdleTimeout(json.getInteger("sso_idle_timeout"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("sso_idle_timeout","java.lang.Integer",e);
        }
        try {
            setSsoMaxLifespan(json.getInteger("sso_max_lifespan"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("sso_max_lifespan","java.lang.Integer",e);
        }
        try {
            setUpdateProfileOnSocLogin(json.getBoolean("update_profile_on_soc_login"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("update_profile_on_soc_login","java.lang.Boolean",e);
        }
        try {
            setVerifyEmail(json.getBoolean("verify_email"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("verify_email","java.lang.Boolean",e);
        }
        try {
            setMasterAdminClient(json.getString("master_admin_client"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("master_admin_client","java.lang.String",e);
        }
        try {
            setLoginLifespan(json.getInteger("login_lifespan"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("login_lifespan","java.lang.Integer",e);
        }
        try {
            setInternationalizationEnabled(json.getBoolean("internationalization_enabled"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("internationalization_enabled","java.lang.Boolean",e);
        }
        try {
            setDefaultLocale(json.getString("default_locale"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("default_locale","java.lang.String",e);
        }
        try {
            setRegEmailAsUsername(json.getBoolean("reg_email_as_username"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("reg_email_as_username","java.lang.Boolean",e);
        }
        try {
            setAdminEventsEnabled(json.getBoolean("admin_events_enabled"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("admin_events_enabled","java.lang.Boolean",e);
        }
        try {
            setAdminEventsDetailsEnabled(json.getBoolean("admin_events_details_enabled"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("admin_events_details_enabled","java.lang.Boolean",e);
        }
        try {
            setEditUsernameAllowed(json.getBoolean("edit_username_allowed"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("edit_username_allowed","java.lang.Boolean",e);
        }
        try {
            setOtpPolicyCounter(json.getInteger("otp_policy_counter"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("otp_policy_counter","java.lang.Integer",e);
        }
        try {
            setOtpPolicyWindow(json.getInteger("otp_policy_window"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("otp_policy_window","java.lang.Integer",e);
        }
        try {
            setOtpPolicyPeriod(json.getInteger("otp_policy_period"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("otp_policy_period","java.lang.Integer",e);
        }
        try {
            setOtpPolicyDigits(json.getInteger("otp_policy_digits"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("otp_policy_digits","java.lang.Integer",e);
        }
        try {
            setOtpPolicyAlg(json.getString("otp_policy_alg"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("otp_policy_alg","java.lang.String",e);
        }
        try {
            setOtpPolicyType(json.getString("otp_policy_type"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("otp_policy_type","java.lang.String",e);
        }
        try {
            setBrowserFlow(json.getString("browser_flow"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("browser_flow","java.lang.String",e);
        }
        try {
            setRegistrationFlow(json.getString("registration_flow"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("registration_flow","java.lang.String",e);
        }
        try {
            setDirectGrantFlow(json.getString("direct_grant_flow"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("direct_grant_flow","java.lang.String",e);
        }
        try {
            setResetCredentialsFlow(json.getString("reset_credentials_flow"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("reset_credentials_flow","java.lang.String",e);
        }
        try {
            setClientAuthFlow(json.getString("client_auth_flow"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("client_auth_flow","java.lang.String",e);
        }
        try {
            setOfflineSessionIdleTimeout(json.getInteger("offline_session_idle_timeout"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("offline_session_idle_timeout","java.lang.Integer",e);
        }
        try {
            setRevokeRefreshToken(json.getBoolean("revoke_refresh_token"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("revoke_refresh_token","java.lang.Boolean",e);
        }
        try {
            setAccessTokenLifeImplicit(json.getInteger("access_token_life_implicit"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("access_token_life_implicit","java.lang.Integer",e);
        }
        try {
            setLoginWithEmailAllowed(json.getBoolean("login_with_email_allowed"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("login_with_email_allowed","java.lang.Boolean",e);
        }
        try {
            setDuplicateEmailsAllowed(json.getBoolean("duplicate_emails_allowed"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("duplicate_emails_allowed","java.lang.Boolean",e);
        }
        try {
            setDockerAuthFlow(json.getString("docker_auth_flow"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("docker_auth_flow","java.lang.String",e);
        }
        try {
            setRefreshTokenMaxReuse(json.getInteger("refresh_token_max_reuse"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("refresh_token_max_reuse","java.lang.Integer",e);
        }
        try {
            setAllowUserManagedAccess(json.getBoolean("allow_user_managed_access"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("allow_user_managed_access","java.lang.Boolean",e);
        }
        try {
            setSsoMaxLifespanRememberMe(json.getInteger("sso_max_lifespan_remember_me"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("sso_max_lifespan_remember_me","java.lang.Integer",e);
        }
        try {
            setSsoIdleTimeoutRememberMe(json.getInteger("sso_idle_timeout_remember_me"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("sso_idle_timeout_remember_me","java.lang.Integer",e);
        }
        return this;
    }


    @Override
    public default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("id",getId());
        json.put("access_code_lifespan",getAccessCodeLifespan());
        json.put("user_action_lifespan",getUserActionLifespan());
        json.put("access_token_lifespan",getAccessTokenLifespan());
        json.put("account_theme",getAccountTheme());
        json.put("admin_theme",getAdminTheme());
        json.put("email_theme",getEmailTheme());
        json.put("enabled",getEnabled());
        json.put("events_enabled",getEventsEnabled());
        json.put("events_expiration",getEventsExpiration());
        json.put("login_theme",getLoginTheme());
        json.put("name",getName());
        json.put("not_before",getNotBefore());
        json.put("password_policy",getPasswordPolicy());
        json.put("registration_allowed",getRegistrationAllowed());
        json.put("remember_me",getRememberMe());
        json.put("reset_password_allowed",getResetPasswordAllowed());
        json.put("social",getSocial());
        json.put("ssl_required",getSslRequired());
        json.put("sso_idle_timeout",getSsoIdleTimeout());
        json.put("sso_max_lifespan",getSsoMaxLifespan());
        json.put("update_profile_on_soc_login",getUpdateProfileOnSocLogin());
        json.put("verify_email",getVerifyEmail());
        json.put("master_admin_client",getMasterAdminClient());
        json.put("login_lifespan",getLoginLifespan());
        json.put("internationalization_enabled",getInternationalizationEnabled());
        json.put("default_locale",getDefaultLocale());
        json.put("reg_email_as_username",getRegEmailAsUsername());
        json.put("admin_events_enabled",getAdminEventsEnabled());
        json.put("admin_events_details_enabled",getAdminEventsDetailsEnabled());
        json.put("edit_username_allowed",getEditUsernameAllowed());
        json.put("otp_policy_counter",getOtpPolicyCounter());
        json.put("otp_policy_window",getOtpPolicyWindow());
        json.put("otp_policy_period",getOtpPolicyPeriod());
        json.put("otp_policy_digits",getOtpPolicyDigits());
        json.put("otp_policy_alg",getOtpPolicyAlg());
        json.put("otp_policy_type",getOtpPolicyType());
        json.put("browser_flow",getBrowserFlow());
        json.put("registration_flow",getRegistrationFlow());
        json.put("direct_grant_flow",getDirectGrantFlow());
        json.put("reset_credentials_flow",getResetCredentialsFlow());
        json.put("client_auth_flow",getClientAuthFlow());
        json.put("offline_session_idle_timeout",getOfflineSessionIdleTimeout());
        json.put("revoke_refresh_token",getRevokeRefreshToken());
        json.put("access_token_life_implicit",getAccessTokenLifeImplicit());
        json.put("login_with_email_allowed",getLoginWithEmailAllowed());
        json.put("duplicate_emails_allowed",getDuplicateEmailsAllowed());
        json.put("docker_auth_flow",getDockerAuthFlow());
        json.put("refresh_token_max_reuse",getRefreshTokenMaxReuse());
        json.put("allow_user_managed_access",getAllowUserManagedAccess());
        json.put("sso_max_lifespan_remember_me",getSsoMaxLifespanRememberMe());
        json.put("sso_idle_timeout_remember_me",getSsoIdleTimeoutRememberMe());
        return json;
    }

}
