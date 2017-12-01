package com.example.demo.sampleapplicaton.views;


import com.example.demo.sampleapplicaton.models.ContactDetailsPojo;

/**
 * Created by admin on 13-Jul-17.
 */

public interface LandingView {
    void userDetail(ContactDetailsPojo body);
    void showMessage(String message);
    void redirectToWebsite(String webUrl);
}
