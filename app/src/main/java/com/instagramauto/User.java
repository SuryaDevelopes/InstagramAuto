package com.instagramauto;

public class User {
    private String profile_picture;
    private String full_name;

    public String getProfile_picture() {
        return profile_picture;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public void setProfile_picture(String profile_picture) {
        this.profile_picture = profile_picture;
    }
}
