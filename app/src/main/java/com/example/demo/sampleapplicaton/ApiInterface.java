package com.example.demo.sampleapplicaton;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

/**
 * Created by admin on 10/23/2017.
 */

public interface ApiInterface {
    @FormUrlEncoded
    @POST("showcontent.php")
    Call<GroupInfoPojo> getContent(@Field("userid") String Userid);
}
