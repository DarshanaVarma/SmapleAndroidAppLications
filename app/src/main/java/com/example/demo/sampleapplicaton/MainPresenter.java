package com.example.demo.sampleapplicaton;

import android.app.Activity;
import android.content.Context;

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
        apiInterface=APIClient.getAPIClient();
        this.mainView=activity;

    }


    public void getResponse(Integer userid) {


        Call<GroupInfoPojo> call= apiInterface.getContent(String.valueOf(userid));
        call.enqueue(new Callback<GroupInfoPojo>() {
            @Override
            public void onResponse(Call<GroupInfoPojo> call, Response<GroupInfoPojo> response) {
                response.body();
                mainView.render(response.body());
            }

            @Override
            public void onFailure(Call<GroupInfoPojo> call, Throwable t) {

            }
        });
    }
}
