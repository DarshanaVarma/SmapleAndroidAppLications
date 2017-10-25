package com.example.demo.sampleapplicaton.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by admin on 13-Jul-17.
 */

public class UserDetailPojo {

    @SerializedName("userid")
    @Expose
    private Integer userid;
    @SerializedName("firstname")
    @Expose
    private String firstname;
    @SerializedName("lastname")
    @Expose
    private String lastname;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("profilepic")
    @Expose
    private String profilepic;
    @SerializedName("loginflag")
    @Expose
    private Integer loginflag;
    @SerializedName("pushnotificationid")
    @Expose
    private String pushnotificationid;
    @SerializedName("usergroupexist")
    @Expose
    private Integer usergroupexist;
    @SerializedName("adminflag")
    @Expose
    private Integer adminflag;


    public Integer getUsergroupexist() {
        return usergroupexist;
    }

    public void setUsergroupexist(Integer usergroupexist) {
        this.usergroupexist = usergroupexist;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfilepic() {
        return profilepic;
    }

    public void setProfilepic(String profilepic) {
        this.profilepic = profilepic;
    }

    public Integer getLoginflag() {
        return loginflag;
    }

    public void setLoginflag(Integer loginflag) {
        this.loginflag = loginflag;
    }

    public String getPushnotificationid() {
        return pushnotificationid;
    }

    public void setPushnotificationid(String pushnotificationid) {
        this.pushnotificationid = pushnotificationid;
    }

    public Integer getAdminflag() {
        return adminflag;
    }

    public void setAdminflag(Integer adminflag) {
        this.adminflag = adminflag;
    }
}