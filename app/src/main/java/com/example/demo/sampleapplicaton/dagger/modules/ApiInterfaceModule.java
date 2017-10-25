package com.example.demo.sampleapplicaton.dagger.modules;

import com.example.demo.sampleapplicaton.Config.ApiInterface;
import com.example.demo.sampleapplicaton.dagger.scopes.MainApplicationScope;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by admin on 10/25/2017.
 */
@Module(includes = Networkodule.class)
public class ApiInterfaceModule {

    @Provides
    @MainApplicationScope
    public ApiInterface getApiInterface(Retrofit retrofit){
        return retrofit.create(ApiInterface.class);
    }

    @Provides
    @MainApplicationScope
    public Retrofit retrofit(OkHttpClient okHttpClient){
        return new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .baseUrl("http://ec2-34-213-192-138.us-west-2.compute.amazonaws.com/appexchange/appexchangeserver/api/")
                .build();
    }
}
