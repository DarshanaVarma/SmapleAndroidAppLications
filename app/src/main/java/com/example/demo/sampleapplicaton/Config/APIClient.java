package com.example.demo.sampleapplicaton.Config;

import com.example.demo.sampleapplicaton.Config.RetrofitClient;

/**
 * Created by admin on 10/23/2017.
 */

public class APIClient {

    public static ApiInterface getAPIClient(){

        return RetrofitClient.getClient().create(ApiInterface.class);
    }
}
