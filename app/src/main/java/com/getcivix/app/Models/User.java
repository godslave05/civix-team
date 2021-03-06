package com.getcivix.app.Models;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by godslave on 12/19/18.
 */

@IgnoreExtraProperties
public class User {

    public String userName;
    public String email;
    public String gender;
    public String interest;
    public Integer credibility;
    public String uplaodedProfileImageKey;

    // Default constructor required for calls to
    // DataSnapshot.getValue(User.class)
    public User() {
    }

    public User(String userName, String email, String gender, String interest, Integer credibility, String uplaodedProfileImageKey) {
        this.userName = userName;
        this.email = email;
        this.gender = gender;
        this.interest = interest;
        this.credibility = credibility;
        this.uplaodedProfileImageKey = uplaodedProfileImageKey;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", interest='" + interest + '\'' +
                ", credibility=" + credibility +
                ", uplaodedProfileImageKey='" + uplaodedProfileImageKey + '\'' +
                '}';
    }
}
