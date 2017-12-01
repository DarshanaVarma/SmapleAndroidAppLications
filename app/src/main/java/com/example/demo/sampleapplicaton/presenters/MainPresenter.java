package com.example.demo.sampleapplicaton.presenters;

import android.content.Context;


import com.example.demo.sampleapplicaton.Config.APIClient;
import com.example.demo.sampleapplicaton.Config.ApiInterface;
import com.example.demo.sampleapplicaton.models.ContactDetailsPojo;
import com.example.demo.sampleapplicaton.views.MainView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by admin on 10/23/2017.
 */

public class MainPresenter {

    private final Context context;
    private final ApiInterface apiInterface;
    MainView mainView;

    public MainPresenter(Context context, MainView activity) {
        this.context=context;
        apiInterface= APIClient.getAPIClient();
        this.mainView=activity;

    }


//    public void getResponse(Integer userid) {
//
//
//        Call<ContactDetailsPojo> call= apiInterface.getContent();
//        call.enqueue(new Callback<ContactDetailsPojo>() {
//            @Override
//            public void onResponse(Call<ContactDetailsPojo> call, Response<ContactDetailsPojo> response) {
//                response.body();
//                mainView.render(response.body());
//            }
//
//            @Override
//            public void onFailure(Call<ContactDetailsPojo> call, Throwable t) {
//
//            }
//        });
//    }
}
