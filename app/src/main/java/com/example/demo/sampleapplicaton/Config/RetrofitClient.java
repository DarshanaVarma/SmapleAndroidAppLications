package com.example.demo.sampleapplicaton.Config;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by admin on 10/23/2017.
 */

class RetrofitClient {

    static Retrofit getClient()
    {
        return new Retrofit.Builder()
                .baseUrl("enter base url")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}
