package com.example.demo.sampleapplicaton;

import android.app.Activity;
import android.app.Application;
import android.support.annotation.NonNull;

import com.example.demo.sampleapplicaton.Config.ApiInterface;
import com.example.demo.sampleapplicaton.Config.SharedUtils;
import com.example.demo.sampleapplicaton.dagger.components.DaggerMainComponent;
import com.example.demo.sampleapplicaton.dagger.components.MainComponent;
import com.example.demo.sampleapplicaton.dagger.modules.ContextModule;
import com.squareup.picasso.Picasso;

import java.util.HashMap;
import java.util.Map;

import okhttp3.OkHttpClient;


/**
 * Created by admin on 10/24/2017.
 */

public class MyApplication extends Application {





    public static MyApplication get(Activity activity) {
        return (MyApplication) activity.getApplication();
    }

    private Picasso picasso;
    private ApiInterface apiInterface;
    private SharedUtils utils;
    private MainComponent component;
    private static MyApplication mInstance;
    private OkHttpClient okHttpClient;



    @Override
    public void onCreate() {
        super.onCreate();
         component= DaggerMainComponent.builder().contextModule(new ContextModule(this)).build();
        apiInterface= component.getApiInterface();
        picasso=component.getPicasso();
        utils=component.getUtils();
        okHttpClient = component.getOkHttpClient();
        mInstance=this;
    }


    public MainComponent getComponent(){
        return component;
    }

    public ApiInterface getApiInterface(){
        return apiInterface;
    }

    public Picasso getPicasso(){
        return picasso;
    }

    public SharedUtils getSharedUtils(){
        return utils;
    }
    public OkHttpClient okHttpClient(){
        return okHttpClient;
    }


    public static synchronized MyApplication getInstance() {
        return mInstance;
    }


}


