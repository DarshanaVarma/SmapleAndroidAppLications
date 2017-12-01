package com.example.demo.sampleapplicaton.presenters;


import com.example.demo.sampleapplicaton.Config.ApiInterface;
import com.example.demo.sampleapplicaton.Config.SharedUtils;
import com.example.demo.sampleapplicaton.models.ContactDetailsPojo;
import com.example.demo.sampleapplicaton.views.LandingView;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by admin on 13-Jul-17.
 */

public class LandingPresenter {
    private final LandingView view;
    private final ApiInterface apiInterface;
    private final SharedUtils utils;

    @Inject
    LandingPresenter(LandingView view, ApiInterface apiInterface, SharedUtils utils) {
        this.view = view;
        this.apiInterface = apiInterface;
        this.utils = utils;
    }

    public void getUsetDetails(){
        Call<ContactDetailsPojo> call1 = apiInterface.doGetListResources();
        call1.enqueue(new Callback<ContactDetailsPojo>() {
            @Override
            public void onResponse(Call<ContactDetailsPojo> call, Response<ContactDetailsPojo> response) {
                response.body();
                view.userDetail(response.body());

            }

            @Override
            public void onFailure(Call<ContactDetailsPojo> call, Throwable t) {
                String msg = "" + t.getMessage();
                view.showMessage("Please check internet connection");

            }
        });
    }



}
