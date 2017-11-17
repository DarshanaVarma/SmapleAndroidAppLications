package com.example.demo.sampleapplicaton.Config;

import com.example.demo.sampleapplicaton.models.GroupInfoPojo;
import com.example.demo.sampleapplicaton.models.UserDetailPojo;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by admin on 10/23/2017.
 */

public interface ApiInterface {

    @GET("contacts")
    Call<GroupInfoPojo> getContent();

//    @FormUrlEncoded
//    @POST("profile.php")
//    Call<UserDetailPojo> getUserDetails(@Field("userid") Integer userid);
}
