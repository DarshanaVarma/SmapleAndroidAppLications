package com.example.demo.sampleapplicaton.presenters;


import com.example.demo.sampleapplicaton.Config.ApiInterface;
import com.example.demo.sampleapplicaton.Config.SharedUtils;
import com.example.demo.sampleapplicaton.models.GroupInfoPojo;
import com.example.demo.sampleapplicaton.models.UserDetailPojo;
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
        Call<GroupInfoPojo> call1 = apiInterface.getContent();
        call1.enqueue(new Callback<GroupInfoPojo>() {
            @Override
            public void onResponse(Call<GroupInfoPojo> call, Response<GroupInfoPojo> response) {
                response.body();
                view.userDetail(response.body());
//                utils.setAdminFlag(response.body().getAdminflag());
//                utils.setIsUserGroupExist(response.body().getUsergroupexist());
            }

            @Override
            public void onFailure(Call<GroupInfoPojo> call, Throwable t) {
                String msg = "" + t.getMessage();
                view.showMessage("Please check internet connection");

            }
        });
    }



}
