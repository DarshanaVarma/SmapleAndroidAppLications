package com.example.demo.sampleapplicaton;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by admin on 10/23/2017.
 */

class RetrofitClient {

    static Retrofit getClient()
    {
        return new Retrofit.Builder()
                .baseUrl("http://ec2-34-213-192-138.us-west-2.compute.amazonaws.com/appexchange/appexchangeserver/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}
