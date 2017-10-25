package com.example.demo.sampleapplicaton.dagger.components;

import com.example.demo.sampleapplicaton.Config.ApiInterface;
import com.example.demo.sampleapplicaton.Config.SharedUtils;
import com.example.demo.sampleapplicaton.dagger.modules.ApiInterfaceModule;
import com.example.demo.sampleapplicaton.dagger.modules.PicassoModule;
import com.example.demo.sampleapplicaton.dagger.modules.SharedUtilsModule;
import com.example.demo.sampleapplicaton.dagger.scopes.MainApplicationScope;
import com.squareup.picasso.Picasso;
import dagger.Component;
import okhttp3.OkHttpClient;

/**
 * Created by admin on 10/25/2017.
 */

@MainApplicationScope
@Component(modules = {ApiInterfaceModule.class, PicassoModule.class,SharedUtilsModule.class})
public interface MainComponent {

    Picasso getPicasso();

    ApiInterface getApiInterface();

    SharedUtils getUtils();

    OkHttpClient getOkHttpClient();
}