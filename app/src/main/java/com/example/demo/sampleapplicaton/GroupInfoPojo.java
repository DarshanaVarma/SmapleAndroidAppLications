package com.example.demo.sampleapplicaton;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 7/20/2017.
 */

public class GroupInfoPojo implements Serializable {
    @SerializedName("users")
    @Expose
    private ArrayList<User> users = null;

    @SerializedName("featured")
    @Expose
    private List<Featured> featured = null;

    @SerializedName("contents")
    @Expose
    private ArrayList<Content> contents = null;
    @SerializedName("adminflag")
    @Expose
    private Integer adminflag;
    @SerializedName("usergroupexist")
    @Expose
    private Integer usergroupexist;

    public Integer getUsergroupexist() {
        return usergroupexist;
    }

    public void setUsergroupexist(Integer usergroupexist) {
        this.usergroupexist = usergroupexist;
    }

    public List<Featured> getFeatured() {
        return featured;
    }

    public void setFeatured(List<Featured> featured) {
        this.featured = featured;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public ArrayList<Content> getContents() {
        return contents;
    }

    public void setContents(ArrayList<Content> contents) {
        this.contents = contents;
    }

    public Integer getAdminflag() {
        return adminflag;
    }

    public void setAdminflag(Integer adminflag) {
        this.adminflag = adminflag;
    }

    public class Content  implements Serializable  {

        @SerializedName("contentid")
        @Expose
        private Integer contentid;
        @SerializedName("contenttypeid")
        @Expose
        private Integer contenttypeid;
        @SerializedName("title")
        @Expose
        private String title;


        public Boolean getBalanceflag() {
            return balanceflag;
        }

        public void setBalanceflag(Boolean balanceflag) {
            this.balanceflag = balanceflag;
        }

        @SerializedName("balanceflag")
        @Expose
        private Boolean balanceflag;

        @SerializedName("description")
        @Expose
        private String description;
        @SerializedName("contenturl")
        @Expose
        private String contenturl;
        @SerializedName("contenticon")
        @Expose
        private String contenticon;
        @SerializedName("contentrewardpoint")
        @Expose
        private Integer contentrewardpoint;
        @SerializedName("contentviews")
        @Expose
        private Integer contentviews;
        @SerializedName("rewardfreq")
        @Expose
        private Integer rewardfreq;
        @SerializedName("crdate")
        @Expose
        private String crdate;
        @SerializedName("recordstatus")
        @Expose
        private Integer recordstatus;
        @SerializedName("length")
        @Expose
        private String length;
        @SerializedName("rating")
        @Expose
        private String rating;


        public Integer getContentviewflag() {
            return contentviewflag;
        }

        public void setContentviewflag(Integer contentviewflag) {
            this.contentviewflag = contentviewflag;
        }

        @SerializedName("contentviewflag")
        @Expose
        private Integer contentviewflag;


        public String getRating() {
            return rating;
        }

        public void setRating(String rating) {
            this.rating = rating;
        }

        public String getLength() {
            return length;
        }

        public void setLength(String length) {
            this.length = length;
        }

        public Integer getContentid() {
            return contentid;
        }

        public void setContentid(Integer contentid) {
            this.contentid = contentid;
        }

        public Integer getContenttypeid() {
            return contenttypeid;
        }

        public void setContenttypeid(Integer contenttypeid) {
            this.contenttypeid = contenttypeid;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getContenturl() {
            return contenturl;
        }

        public void setContenturl(String contenturl) {
            this.contenturl = contenturl;
        }

        public String getContenticon() {
            return contenticon;
        }

        public void setContenticon(String contenticon) {
            this.contenticon = contenticon;
        }

        public Integer getContentrewardpoint() {
            return contentrewardpoint;
        }

        public void setContentrewardpoint(Integer contentrewardpoint) {
            this.contentrewardpoint = contentrewardpoint;
        }

        public Integer getContentviews() {
            return contentviews;
        }

        public void setContentviews(Integer contentviews) {
            this.contentviews = contentviews;
        }

        public Integer getRewardfreq() {
            return rewardfreq;
        }

        public void setRewardfreq(Integer rewardfreq) {
            this.rewardfreq = rewardfreq;
        }

        public String getCrdate() {
            return crdate;
        }

        public void setCrdate(String crdate) {
            this.crdate = crdate;
        }

        public Integer getRecordstatus() {
            return recordstatus;
        }

        public void setRecordstatus(Integer recordstatus) {
            this.recordstatus = recordstatus;
        }

    }



    public class Featured implements Serializable {

        @SerializedName("contentid")
        @Expose
        private Integer contentid;
        @SerializedName("contenttypeid")
        @Expose
        private Integer contenttypeid;
        @SerializedName("title")
        @Expose
        private String title;
        @SerializedName("description")
        @Expose
        private String description;
        @SerializedName("contenturl")
        @Expose
        private String contenturl;
        @SerializedName("contenticon")
        @Expose
        private String contenticon;
        @SerializedName("contentrewardpoint")
        @Expose
        private Integer contentrewardpoint;
        @SerializedName("contentviews")
        @Expose
        private Integer contentviews;
        @SerializedName("rating")
        @Expose
        private String rating;
        @SerializedName("rewardfreq")
        @Expose
        private Integer rewardfreq;
        @SerializedName("crdate")
        @Expose
        private String crdate;
        @SerializedName("length")
        @Expose
        private String length;
        @SerializedName("recordstatus")
        @Expose
        private Integer recordstatus;
        @SerializedName("contentviewflag")
        @Expose
        private Integer contentviewflag;

        public Integer getContentid() {
            return contentid;
        }

        public void setContentid(Integer contentid) {
            this.contentid = contentid;
        }

        public Integer getContenttypeid() {
            return contenttypeid;
        }

        public void setContenttypeid(Integer contenttypeid) {
            this.contenttypeid = contenttypeid;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getContenturl() {
            return contenturl;
        }

        public void setContenturl(String contenturl) {
            this.contenturl = contenturl;
        }

        public String getContenticon() {
            return contenticon;
        }

        public void setContenticon(String contenticon) {
            this.contenticon = contenticon;
        }

        public Integer getContentrewardpoint() {
            return contentrewardpoint;
        }

        public void setContentrewardpoint(Integer contentrewardpoint) {
            this.contentrewardpoint = contentrewardpoint;
        }

        public Integer getContentviews() {
            return contentviews;
        }

        public void setContentviews(Integer contentviews) {
            this.contentviews = contentviews;
        }

        public String getRating() {
            return rating;
        }

        public void setRating(String rating) {
            this.rating = rating;
        }

        public Integer getRewardfreq() {
            return rewardfreq;
        }

        public void setRewardfreq(Integer rewardfreq) {
            this.rewardfreq = rewardfreq;
        }

        public String getCrdate() {
            return crdate;
        }

        public void setCrdate(String crdate) {
            this.crdate = crdate;
        }

        public String getLength() {
            return length;
        }

        public void setLength(String length) {
            this.length = length;
        }

        public Integer getRecordstatus() {
            return recordstatus;
        }

        public void setRecordstatus(Integer recordstatus) {
            this.recordstatus = recordstatus;
        }

        public Integer getContentviewflag() {
            return contentviewflag;
        }

        public void setContentviewflag(Integer contentviewflag) {
            this.contentviewflag = contentviewflag;
        }

    }


    public class User  implements Serializable {

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
        @SerializedName("earnedcoins")
        @Expose
        private String earnedcoins;

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

        public String getEarnedcoins() {
            return earnedcoins;
        }

        public void setEarnedcoins(String earnedcoins) {
            this.earnedcoins = earnedcoins;
        }
    }

    // removing content which are viewed and recurring flag is 0
    public List<Content> filterContents(int id){
        List<Content> filteredList=new ArrayList<>();
        for (GroupInfoPojo.Content banner : getContents()) {
            if (id==banner.getContenttypeid()){
              /*  if(banner.getContentviewflag()==0){
                    filteredList.add(banner);
                }else if(banner.getContentviewflag()==1 && banner.getRewardfreq()==1) {
                    filteredList.add(banner);
                }*/
                filteredList.add(banner);
            }
        }

        return  filteredList;
    }


    public List<Content> filterContentsForSetting(int id){
        List<Content> filteredList=new ArrayList<>();
        for (GroupInfoPojo.Content banner : getContents()) {
            if (id==banner.getContenttypeid()) filteredList.add(banner);
        }
        return  filteredList;
    }

    // removing content which are viewed and recurring flag is 0
    public List<Featured> filterFeatured(int id){
        List<Featured> list = new ArrayList<>();
        for (GroupInfoPojo.Featured item : getFeatured()){
            if(id == item.getContenttypeid()){
              /*  if(item.getContentviewflag()==0){
                    list.add(item);
                }else if(item.getContentviewflag()==1 && item.getRewardfreq()==1) {
                    list.add(item);
                }*/
                list.add(item);
            }
        }
        return list;
    }

    public List<User> filterUser (){
        List<User> list = new ArrayList<>();
        for (GroupInfoPojo.User item : getUsers()){
            if(item.firstname!=null && item.lastname!=null) list.add(item);
        }
        return list;
    }
}
