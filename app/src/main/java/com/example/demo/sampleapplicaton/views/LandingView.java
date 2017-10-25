package com.example.demo.sampleapplicaton.views;


import com.example.demo.sampleapplicaton.models.GroupInfoPojo;
import com.example.demo.sampleapplicaton.models.UserDetailPojo;

/**
 * Created by admin on 13-Jul-17.
 */

public interface LandingView {
    void userDetail(UserDetailPojo body);
    void showMessage(String message);
    void redirectToWebsite(String webUrl);
}
