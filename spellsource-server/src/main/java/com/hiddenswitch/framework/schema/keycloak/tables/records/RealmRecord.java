/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.keycloak.tables.records;


import com.hiddenswitch.framework.schema.keycloak.tables.Realm;
import com.hiddenswitch.framework.schema.keycloak.tables.interfaces.IRealm;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RealmRecord extends UpdatableRecordImpl<RealmRecord> implements VertxPojo, IRealm {

    private static final long serialVersionUID = 1649799335;

    /**
     * Setter for <code>keycloak.realm.id</code>.
     */
    @Override
    public RealmRecord setId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.realm.id</code>.
     */
    @Override
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>keycloak.realm.access_code_lifespan</code>.
     */
    @Override
    public RealmRecord setAccessCodeLifespan(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.realm.access_code_lifespan</code>.
     */
    @Override
    public Integer getAccessCodeLifespan() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>keycloak.realm.user_action_lifespan</code>.
     */
    @Override
    public RealmRecord setUserActionLifespan(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.realm.user_action_lifespan</code>.
     */
    @Override
    public Integer getUserActionLifespan() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>keycloak.realm.access_token_lifespan</code>.
     */
    @Override
    public RealmRecord setAccessTokenLifespan(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.realm.access_token_lifespan</code>.
     */
    @Override
    public Integer getAccessTokenLifespan() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>keycloak.realm.account_theme</code>.
     */
    @Override
    public RealmRecord setAccountTheme(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.realm.account_theme</code>.
     */
    @Override
    public String getAccountTheme() {
        return (String) get(4);
    }

    /**
     * Setter for <code>keycloak.realm.admin_theme</code>.
     */
    @Override
    public RealmRecord setAdminTheme(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.realm.admin_theme</code>.
     */
    @Override
    public String getAdminTheme() {
        return (String) get(5);
    }

    /**
     * Setter for <code>keycloak.realm.email_theme</code>.
     */
    @Override
    public RealmRecord setEmailTheme(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.realm.email_theme</code>.
     */
    @Override
    public String getEmailTheme() {
        return (String) get(6);
    }

    /**
     * Setter for <code>keycloak.realm.enabled</code>.
     */
    @Override
    public RealmRecord setEnabled(Boolean value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.realm.enabled</code>.
     */
    @Override
    public Boolean getEnabled() {
        return (Boolean) get(7);
    }

    /**
     * Setter for <code>keycloak.realm.events_enabled</code>.
     */
    @Override
    public RealmRecord setEventsEnabled(Boolean value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.realm.events_enabled</code>.
     */
    @Override
    public Boolean getEventsEnabled() {
        return (Boolean) get(8);
    }

    /**
     * Setter for <code>keycloak.realm.events_expiration</code>.
     */
    @Override
    public RealmRecord setEventsExpiration(Long value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.realm.events_expiration</code>.
     */
    @Override
    public Long getEventsExpiration() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>keycloak.realm.login_theme</code>.
     */
    @Override
    public RealmRecord setLoginTheme(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.realm.login_theme</code>.
     */
    @Override
    public String getLoginTheme() {
        return (String) get(10);
    }

    /**
     * Setter for <code>keycloak.realm.name</code>.
     */
    @Override
    public RealmRecord setName(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.realm.name</code>.
     */
    @Override
    public String getName() {
        return (String) get(11);
    }

    /**
     * Setter for <code>keycloak.realm.not_before</code>.
     */
    @Override
    public RealmRecord setNotBefore(Integer value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.realm.not_before</code>.
     */
    @Override
    public Integer getNotBefore() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>keycloak.realm.password_policy</code>.
     */
    @Override
    public RealmRecord setPasswordPolicy(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.realm.password_policy</code>.
     */
    @Override
    public String getPasswordPolicy() {
        return (String) get(13);
    }

    /**
     * Setter for <code>keycloak.realm.registration_allowed</code>.
     */
    @Override
    public RealmRecord setRegistrationAllowed(Boolean value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.realm.registration_allowed</code>.
     */
    @Override
    public Boolean getRegistrationAllowed() {
        return (Boolean) get(14);
    }

    /**
     * Setter for <code>keycloak.realm.remember_me</code>.
     */
    @Override
    public RealmRecord setRememberMe(Boolean value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.realm.remember_me</code>.
     */
    @Override
    public Boolean getRememberMe() {
        return (Boolean) get(15);
    }

    /**
     * Setter for <code>keycloak.realm.reset_password_allowed</code>.
     */
    @Override
    public RealmRecord setResetPasswordAllowed(Boolean value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.realm.reset_password_allowed</code>.
     */
    @Override
    public Boolean getResetPasswordAllowed() {
        return (Boolean) get(16);
    }

    /**
     * Setter for <code>keycloak.realm.social</code>.
     */
    @Override
    public RealmRecord setSocial(Boolean value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.realm.social</code>.
     */
    @Override
    public Boolean getSocial() {
        return (Boolean) get(17);
    }

    /**
     * Setter for <code>keycloak.realm.ssl_required</code>.
     */
    @Override
    public RealmRecord setSslRequired(String value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.realm.ssl_required</code>.
     */
    @Override
    public String getSslRequired() {
        return (String) get(18);
    }

    /**
     * Setter for <code>keycloak.realm.sso_idle_timeout</code>.
     */
    @Override
    public RealmRecord setSsoIdleTimeout(Integer value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.realm.sso_idle_timeout</code>.
     */
    @Override
    public Integer getSsoIdleTimeout() {
        return (Integer) get(19);
    }

    /**
     * Setter for <code>keycloak.realm.sso_max_lifespan</code>.
     */
    @Override
    public RealmRecord setSsoMaxLifespan(Integer value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.realm.sso_max_lifespan</code>.
     */
    @Override
    public Integer getSsoMaxLifespan() {
        return (Integer) get(20);
    }

    /**
     * Setter for <code>keycloak.realm.update_profile_on_soc_login</code>.
     */
    @Override
    public RealmRecord setUpdateProfileOnSocLogin(Boolean value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.realm.update_profile_on_soc_login</code>.
     */
    @Override
    public Boolean getUpdateProfileOnSocLogin() {
        return (Boolean) get(21);
    }

    /**
     * Setter for <code>keycloak.realm.verify_email</code>.
     */
    @Override
    public RealmRecord setVerifyEmail(Boolean value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.realm.verify_email</code>.
     */
    @Override
    public Boolean getVerifyEmail() {
        return (Boolean) get(22);
    }

    /**
     * Setter for <code>keycloak.realm.master_admin_client</code>.
     */
    @Override
    public RealmRecord setMasterAdminClient(String value) {
        set(23, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.realm.master_admin_client</code>.
     */
    @Override
    public String getMasterAdminClient() {
        return (String) get(23);
    }

    /**
     * Setter for <code>keycloak.realm.login_lifespan</code>.
     */
    @Override
    public RealmRecord setLoginLifespan(Integer value) {
        set(24, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.realm.login_lifespan</code>.
     */
    @Override
    public Integer getLoginLifespan() {
        return (Integer) get(24);
    }

    /**
     * Setter for <code>keycloak.realm.internationalization_enabled</code>.
     */
    @Override
    public RealmRecord setInternationalizationEnabled(Boolean value) {
        set(25, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.realm.internationalization_enabled</code>.
     */
    @Override
    public Boolean getInternationalizationEnabled() {
        return (Boolean) get(25);
    }

    /**
     * Setter for <code>keycloak.realm.default_locale</code>.
     */
    @Override
    public RealmRecord setDefaultLocale(String value) {
        set(26, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.realm.default_locale</code>.
     */
    @Override
    public String getDefaultLocale() {
        return (String) get(26);
    }

    /**
     * Setter for <code>keycloak.realm.reg_email_as_username</code>.
     */
    @Override
    public RealmRecord setRegEmailAsUsername(Boolean value) {
        set(27, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.realm.reg_email_as_username</code>.
     */
    @Override
    public Boolean getRegEmailAsUsername() {
        return (Boolean) get(27);
    }

    /**
     * Setter for <code>keycloak.realm.admin_events_enabled</code>.
     */
    @Override
    public RealmRecord setAdminEventsEnabled(Boolean value) {
        set(28, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.realm.admin_events_enabled</code>.
     */
    @Override
    public Boolean getAdminEventsEnabled() {
        return (Boolean) get(28);
    }

    /**
     * Setter for <code>keycloak.realm.admin_events_details_enabled</code>.
     */
    @Override
    public RealmRecord setAdminEventsDetailsEnabled(Boolean value) {
        set(29, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.realm.admin_events_details_enabled</code>.
     */
    @Override
    public Boolean getAdminEventsDetailsEnabled() {
        return (Boolean) get(29);
    }

    /**
     * Setter for <code>keycloak.realm.edit_username_allowed</code>.
     */
    @Override
    public RealmRecord setEditUsernameAllowed(Boolean value) {
        set(30, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.realm.edit_username_allowed</code>.
     */
    @Override
    public Boolean getEditUsernameAllowed() {
        return (Boolean) get(30);
    }

    /**
     * Setter for <code>keycloak.realm.otp_policy_counter</code>.
     */
    @Override
    public RealmRecord setOtpPolicyCounter(Integer value) {
        set(31, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.realm.otp_policy_counter</code>.
     */
    @Override
    public Integer getOtpPolicyCounter() {
        return (Integer) get(31);
    }

    /**
     * Setter for <code>keycloak.realm.otp_policy_window</code>.
     */
    @Override
    public RealmRecord setOtpPolicyWindow(Integer value) {
        set(32, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.realm.otp_policy_window</code>.
     */
    @Override
    public Integer getOtpPolicyWindow() {
        return (Integer) get(32);
    }

    /**
     * Setter for <code>keycloak.realm.otp_policy_period</code>.
     */
    @Override
    public RealmRecord setOtpPolicyPeriod(Integer value) {
        set(33, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.realm.otp_policy_period</code>.
     */
    @Override
    public Integer getOtpPolicyPeriod() {
        return (Integer) get(33);
    }

    /**
     * Setter for <code>keycloak.realm.otp_policy_digits</code>.
     */
    @Override
    public RealmRecord setOtpPolicyDigits(Integer value) {
        set(34, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.realm.otp_policy_digits</code>.
     */
    @Override
    public Integer getOtpPolicyDigits() {
        return (Integer) get(34);
    }

    /**
     * Setter for <code>keycloak.realm.otp_policy_alg</code>.
     */
    @Override
    public RealmRecord setOtpPolicyAlg(String value) {
        set(35, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.realm.otp_policy_alg</code>.
     */
    @Override
    public String getOtpPolicyAlg() {
        return (String) get(35);
    }

    /**
     * Setter for <code>keycloak.realm.otp_policy_type</code>.
     */
    @Override
    public RealmRecord setOtpPolicyType(String value) {
        set(36, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.realm.otp_policy_type</code>.
     */
    @Override
    public String getOtpPolicyType() {
        return (String) get(36);
    }

    /**
     * Setter for <code>keycloak.realm.browser_flow</code>.
     */
    @Override
    public RealmRecord setBrowserFlow(String value) {
        set(37, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.realm.browser_flow</code>.
     */
    @Override
    public String getBrowserFlow() {
        return (String) get(37);
    }

    /**
     * Setter for <code>keycloak.realm.registration_flow</code>.
     */
    @Override
    public RealmRecord setRegistrationFlow(String value) {
        set(38, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.realm.registration_flow</code>.
     */
    @Override
    public String getRegistrationFlow() {
        return (String) get(38);
    }

    /**
     * Setter for <code>keycloak.realm.direct_grant_flow</code>.
     */
    @Override
    public RealmRecord setDirectGrantFlow(String value) {
        set(39, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.realm.direct_grant_flow</code>.
     */
    @Override
    public String getDirectGrantFlow() {
        return (String) get(39);
    }

    /**
     * Setter for <code>keycloak.realm.reset_credentials_flow</code>.
     */
    @Override
    public RealmRecord setResetCredentialsFlow(String value) {
        set(40, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.realm.reset_credentials_flow</code>.
     */
    @Override
    public String getResetCredentialsFlow() {
        return (String) get(40);
    }

    /**
     * Setter for <code>keycloak.realm.client_auth_flow</code>.
     */
    @Override
    public RealmRecord setClientAuthFlow(String value) {
        set(41, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.realm.client_auth_flow</code>.
     */
    @Override
    public String getClientAuthFlow() {
        return (String) get(41);
    }

    /**
     * Setter for <code>keycloak.realm.offline_session_idle_timeout</code>.
     */
    @Override
    public RealmRecord setOfflineSessionIdleTimeout(Integer value) {
        set(42, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.realm.offline_session_idle_timeout</code>.
     */
    @Override
    public Integer getOfflineSessionIdleTimeout() {
        return (Integer) get(42);
    }

    /**
     * Setter for <code>keycloak.realm.revoke_refresh_token</code>.
     */
    @Override
    public RealmRecord setRevokeRefreshToken(Boolean value) {
        set(43, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.realm.revoke_refresh_token</code>.
     */
    @Override
    public Boolean getRevokeRefreshToken() {
        return (Boolean) get(43);
    }

    /**
     * Setter for <code>keycloak.realm.access_token_life_implicit</code>.
     */
    @Override
    public RealmRecord setAccessTokenLifeImplicit(Integer value) {
        set(44, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.realm.access_token_life_implicit</code>.
     */
    @Override
    public Integer getAccessTokenLifeImplicit() {
        return (Integer) get(44);
    }

    /**
     * Setter for <code>keycloak.realm.login_with_email_allowed</code>.
     */
    @Override
    public RealmRecord setLoginWithEmailAllowed(Boolean value) {
        set(45, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.realm.login_with_email_allowed</code>.
     */
    @Override
    public Boolean getLoginWithEmailAllowed() {
        return (Boolean) get(45);
    }

    /**
     * Setter for <code>keycloak.realm.duplicate_emails_allowed</code>.
     */
    @Override
    public RealmRecord setDuplicateEmailsAllowed(Boolean value) {
        set(46, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.realm.duplicate_emails_allowed</code>.
     */
    @Override
    public Boolean getDuplicateEmailsAllowed() {
        return (Boolean) get(46);
    }

    /**
     * Setter for <code>keycloak.realm.docker_auth_flow</code>.
     */
    @Override
    public RealmRecord setDockerAuthFlow(String value) {
        set(47, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.realm.docker_auth_flow</code>.
     */
    @Override
    public String getDockerAuthFlow() {
        return (String) get(47);
    }

    /**
     * Setter for <code>keycloak.realm.refresh_token_max_reuse</code>.
     */
    @Override
    public RealmRecord setRefreshTokenMaxReuse(Integer value) {
        set(48, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.realm.refresh_token_max_reuse</code>.
     */
    @Override
    public Integer getRefreshTokenMaxReuse() {
        return (Integer) get(48);
    }

    /**
     * Setter for <code>keycloak.realm.allow_user_managed_access</code>.
     */
    @Override
    public RealmRecord setAllowUserManagedAccess(Boolean value) {
        set(49, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.realm.allow_user_managed_access</code>.
     */
    @Override
    public Boolean getAllowUserManagedAccess() {
        return (Boolean) get(49);
    }

    /**
     * Setter for <code>keycloak.realm.sso_max_lifespan_remember_me</code>.
     */
    @Override
    public RealmRecord setSsoMaxLifespanRememberMe(Integer value) {
        set(50, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.realm.sso_max_lifespan_remember_me</code>.
     */
    @Override
    public Integer getSsoMaxLifespanRememberMe() {
        return (Integer) get(50);
    }

    /**
     * Setter for <code>keycloak.realm.sso_idle_timeout_remember_me</code>.
     */
    @Override
    public RealmRecord setSsoIdleTimeoutRememberMe(Integer value) {
        set(51, value);
        return this;
    }

    /**
     * Getter for <code>keycloak.realm.sso_idle_timeout_remember_me</code>.
     */
    @Override
    public Integer getSsoIdleTimeoutRememberMe() {
        return (Integer) get(51);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IRealm from) {
        setId(from.getId());
        setAccessCodeLifespan(from.getAccessCodeLifespan());
        setUserActionLifespan(from.getUserActionLifespan());
        setAccessTokenLifespan(from.getAccessTokenLifespan());
        setAccountTheme(from.getAccountTheme());
        setAdminTheme(from.getAdminTheme());
        setEmailTheme(from.getEmailTheme());
        setEnabled(from.getEnabled());
        setEventsEnabled(from.getEventsEnabled());
        setEventsExpiration(from.getEventsExpiration());
        setLoginTheme(from.getLoginTheme());
        setName(from.getName());
        setNotBefore(from.getNotBefore());
        setPasswordPolicy(from.getPasswordPolicy());
        setRegistrationAllowed(from.getRegistrationAllowed());
        setRememberMe(from.getRememberMe());
        setResetPasswordAllowed(from.getResetPasswordAllowed());
        setSocial(from.getSocial());
        setSslRequired(from.getSslRequired());
        setSsoIdleTimeout(from.getSsoIdleTimeout());
        setSsoMaxLifespan(from.getSsoMaxLifespan());
        setUpdateProfileOnSocLogin(from.getUpdateProfileOnSocLogin());
        setVerifyEmail(from.getVerifyEmail());
        setMasterAdminClient(from.getMasterAdminClient());
        setLoginLifespan(from.getLoginLifespan());
        setInternationalizationEnabled(from.getInternationalizationEnabled());
        setDefaultLocale(from.getDefaultLocale());
        setRegEmailAsUsername(from.getRegEmailAsUsername());
        setAdminEventsEnabled(from.getAdminEventsEnabled());
        setAdminEventsDetailsEnabled(from.getAdminEventsDetailsEnabled());
        setEditUsernameAllowed(from.getEditUsernameAllowed());
        setOtpPolicyCounter(from.getOtpPolicyCounter());
        setOtpPolicyWindow(from.getOtpPolicyWindow());
        setOtpPolicyPeriod(from.getOtpPolicyPeriod());
        setOtpPolicyDigits(from.getOtpPolicyDigits());
        setOtpPolicyAlg(from.getOtpPolicyAlg());
        setOtpPolicyType(from.getOtpPolicyType());
        setBrowserFlow(from.getBrowserFlow());
        setRegistrationFlow(from.getRegistrationFlow());
        setDirectGrantFlow(from.getDirectGrantFlow());
        setResetCredentialsFlow(from.getResetCredentialsFlow());
        setClientAuthFlow(from.getClientAuthFlow());
        setOfflineSessionIdleTimeout(from.getOfflineSessionIdleTimeout());
        setRevokeRefreshToken(from.getRevokeRefreshToken());
        setAccessTokenLifeImplicit(from.getAccessTokenLifeImplicit());
        setLoginWithEmailAllowed(from.getLoginWithEmailAllowed());
        setDuplicateEmailsAllowed(from.getDuplicateEmailsAllowed());
        setDockerAuthFlow(from.getDockerAuthFlow());
        setRefreshTokenMaxReuse(from.getRefreshTokenMaxReuse());
        setAllowUserManagedAccess(from.getAllowUserManagedAccess());
        setSsoMaxLifespanRememberMe(from.getSsoMaxLifespanRememberMe());
        setSsoIdleTimeoutRememberMe(from.getSsoIdleTimeoutRememberMe());
    }

    @Override
    public <E extends IRealm> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RealmRecord
     */
    public RealmRecord() {
        super(Realm.REALM);
    }

    /**
     * Create a detached, initialised RealmRecord
     */
    public RealmRecord(String id, Integer accessCodeLifespan, Integer userActionLifespan, Integer accessTokenLifespan, String accountTheme, String adminTheme, String emailTheme, Boolean enabled, Boolean eventsEnabled, Long eventsExpiration, String loginTheme, String name, Integer notBefore, String passwordPolicy, Boolean registrationAllowed, Boolean rememberMe, Boolean resetPasswordAllowed, Boolean social, String sslRequired, Integer ssoIdleTimeout, Integer ssoMaxLifespan, Boolean updateProfileOnSocLogin, Boolean verifyEmail, String masterAdminClient, Integer loginLifespan, Boolean internationalizationEnabled, String defaultLocale, Boolean regEmailAsUsername, Boolean adminEventsEnabled, Boolean adminEventsDetailsEnabled, Boolean editUsernameAllowed, Integer otpPolicyCounter, Integer otpPolicyWindow, Integer otpPolicyPeriod, Integer otpPolicyDigits, String otpPolicyAlg, String otpPolicyType, String browserFlow, String registrationFlow, String directGrantFlow, String resetCredentialsFlow, String clientAuthFlow, Integer offlineSessionIdleTimeout, Boolean revokeRefreshToken, Integer accessTokenLifeImplicit, Boolean loginWithEmailAllowed, Boolean duplicateEmailsAllowed, String dockerAuthFlow, Integer refreshTokenMaxReuse, Boolean allowUserManagedAccess, Integer ssoMaxLifespanRememberMe, Integer ssoIdleTimeoutRememberMe) {
        super(Realm.REALM);

        set(0, id);
        set(1, accessCodeLifespan);
        set(2, userActionLifespan);
        set(3, accessTokenLifespan);
        set(4, accountTheme);
        set(5, adminTheme);
        set(6, emailTheme);
        set(7, enabled);
        set(8, eventsEnabled);
        set(9, eventsExpiration);
        set(10, loginTheme);
        set(11, name);
        set(12, notBefore);
        set(13, passwordPolicy);
        set(14, registrationAllowed);
        set(15, rememberMe);
        set(16, resetPasswordAllowed);
        set(17, social);
        set(18, sslRequired);
        set(19, ssoIdleTimeout);
        set(20, ssoMaxLifespan);
        set(21, updateProfileOnSocLogin);
        set(22, verifyEmail);
        set(23, masterAdminClient);
        set(24, loginLifespan);
        set(25, internationalizationEnabled);
        set(26, defaultLocale);
        set(27, regEmailAsUsername);
        set(28, adminEventsEnabled);
        set(29, adminEventsDetailsEnabled);
        set(30, editUsernameAllowed);
        set(31, otpPolicyCounter);
        set(32, otpPolicyWindow);
        set(33, otpPolicyPeriod);
        set(34, otpPolicyDigits);
        set(35, otpPolicyAlg);
        set(36, otpPolicyType);
        set(37, browserFlow);
        set(38, registrationFlow);
        set(39, directGrantFlow);
        set(40, resetCredentialsFlow);
        set(41, clientAuthFlow);
        set(42, offlineSessionIdleTimeout);
        set(43, revokeRefreshToken);
        set(44, accessTokenLifeImplicit);
        set(45, loginWithEmailAllowed);
        set(46, duplicateEmailsAllowed);
        set(47, dockerAuthFlow);
        set(48, refreshTokenMaxReuse);
        set(49, allowUserManagedAccess);
        set(50, ssoMaxLifespanRememberMe);
        set(51, ssoIdleTimeoutRememberMe);
    }

    public RealmRecord(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }
}
