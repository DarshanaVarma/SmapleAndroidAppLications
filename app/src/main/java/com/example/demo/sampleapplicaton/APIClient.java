package com.example.demo.sampleapplicaton;

import retrofit2.Retrofit;

/**
 * Created by admin on 10/23/2017.
 */

class APIClient {

    public static ApiInterface getAPIClient(){

        return RetrofitClient.getClient().create(ApiInterface.class);
    }
}
