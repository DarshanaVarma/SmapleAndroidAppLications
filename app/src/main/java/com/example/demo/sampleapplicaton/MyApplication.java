package com.example.demo.sampleapplicaton;

import android.app.Application;



/**
 * Created by admin on 10/24/2017.
 */

public class MyApplication extends Application {



    @Override
    public void onCreate() {
        super.onCreate();

//            component= DaggerAppComponent.builder().contextModule(new ContextModule(this)).build();


    }

}
