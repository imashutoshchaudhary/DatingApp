package com.example.brill.bdatingapp.gattersatter;

/**
 * Created by brill on 2/6/2018.
 */

public class GatterGetSMSUserList {


    private String userId, uname,gender,birthday,city,profile,phone;


    public GatterGetSMSUserList(String userId, String uname, String gender, String birthday, String city, String profile,String phone) {
        this.userId = userId;
        this.uname = uname;
        this.gender = gender;
        this.birthday = birthday;
        this.city = city;
        this.profile = profile;
        this.phone = phone;

    }


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProfile() {
        return profile;
    }




    public void setProfile(String profile) {
        this.profile = profile;
    }


    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }


}
