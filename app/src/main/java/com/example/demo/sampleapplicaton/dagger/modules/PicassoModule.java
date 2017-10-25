package com.example.demo.sampleapplicaton.dagger.modules;

import android.content.Context;


import com.example.demo.sampleapplicaton.dagger.scopes.MainApplicationScope;
import com.jakewharton.picasso.OkHttp3Downloader;
import com.squareup.picasso.Picasso;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;

/**
 * Created by admin on 05-Jul-17.
 */
@Module(includes = {Networkodule.class, ContextModule.class})
public class PicassoModule {

    @MainApplicationScope
    @Provides
    public Picasso picasso(Context context, OkHttp3Downloader okHttp3Downloader){
        return  new  Picasso.Builder(context)
                .downloader(okHttp3Downloader)
                .build();
    }

    @Provides
    @MainApplicationScope
    public OkHttp3Downloader okHttp3Downloader(OkHttpClient okHttpClient){
        return new OkHttp3Downloader(okHttpClient);
    }

}
