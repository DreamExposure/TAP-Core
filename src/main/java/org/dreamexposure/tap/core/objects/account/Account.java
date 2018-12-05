package org.dreamexposure.tap.core.objects.account;

import java.util.UUID;

/**
 * @author NovaFox161
 * Date Created: 12/4/2018
 * For Project: TAP-Core
 * Author Website: https://www.novamaday.com
 * Company Website: https://www.dreamexposure.org
 * Contact: nova@dreamexposure.org
 */
public class Account {
    private UUID accountId;
    
    private String username;
    private String email;
    private String hashedPassword;
    private String phoneNumber;
    private String birthday;
    
    private boolean safeSearch;
    
    //Getters
    public UUID getAccountId() {
        return accountId;
    }
    
    public String getUsername() {
        return username;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getHashedPassword() {
        return hashedPassword;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public String getBirthday() {
        return birthday;
    }
    
    public boolean isSafeSearch() {
        return safeSearch;
    }
    
    //Setters
    public void setAccountId(UUID _accountId) {
        accountId = _accountId;
    }
    
    public void setUsername(String _username) {
        username = _username;
    }
    
    public void setEmail(String _email) {
        email = _email;
    }
    
    public void setHashedPassword(String _password) {
        hashedPassword = _password;
    }
    
    public void setPhoneNumber(String _phoneNumber) {
        phoneNumber = _phoneNumber;
    }
    
    public void setBirthday(String _birthday) {
        birthday = _birthday;
    }
    
    public void setSafeSearch(boolean _safeSearch) {
        safeSearch = _safeSearch;
    }
}