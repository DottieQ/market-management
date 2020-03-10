package org.launchcode.marketmanagement.models;

import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
public class EventOrganizer extends AbstractEntity{

    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String nickName;
    private String businessName;

    @NotBlank(message = "An email address is required.")
    @Email
    private String email;

    private String websiteUrl;
    private String instagramHandle;
    private String facebookHandle;
    private String twitterHandle;
    private String phoneNumber;
    private String eventIDs;

    public EventOrganizer(String username, String password, String firstName, String lastName, String nickName, String businessName, @NotBlank(message = "An email address is required.") @Email String email, String websiteUrl, String instagramHandle, String facebookHandle, String twitterHandle, String phoneNumber, String eventIDs) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickName = nickName;
        this.businessName = businessName;
        this.email = email;
        this.websiteUrl = websiteUrl;
        this.instagramHandle = instagramHandle;
        this.facebookHandle = facebookHandle;
        this.twitterHandle = twitterHandle;
        this.phoneNumber = phoneNumber;
        this.eventIDs = eventIDs;
    }

    public EventOrganizer() {}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    public String getInstagramHandle() {
        return instagramHandle;
    }

    public void setInstagramHandle(String instagramHandle) {
        this.instagramHandle = instagramHandle;
    }

    public String getFacebookHandle() {
        return facebookHandle;
    }

    public void setFacebookHandle(String facebookHandle) {
        this.facebookHandle = facebookHandle;
    }

    public String getTwitterHandle() {
        return twitterHandle;
    }

    public void setTwitterHandle(String twitterHandle) {
        this.twitterHandle = twitterHandle;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEventIDs() {
        return eventIDs;
    }

    public void setEventIDs(String eventIDs) {
        this.eventIDs = eventIDs;
    }
}
