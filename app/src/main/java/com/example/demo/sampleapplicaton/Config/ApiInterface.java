package com.example.demo.sampleapplicaton.Config;

import com.example.demo.sampleapplicaton.models.ContactDetailsPojo;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by admin on 10/23/2017.
 */

public interface ApiInterface {

    @GET("/api/unknown")
    Call<ContactDetailsPojo> doGetListResources();

    @POST("/api/users")
    Call<ContactDetailsPojo> createUser(@Body ContactDetailsPojo user);

    @GET("/api/users?")
    Call<ContactDetailsPojo> doGetUserList(@Query("page") String page);

    @FormUrlEncoded
    @POST("/api/users?")
    Call<ContactDetailsPojo> doCreateUserWithField(@Field("name") String name, @Field("job") String job);
}
