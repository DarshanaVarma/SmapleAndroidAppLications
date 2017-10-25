package com.example.demo.sampleapplicaton.dagger.modules;

import android.content.Context;

import com.example.demo.sampleapplicaton.dagger.scopes.MainApplicationScope;

import java.io.File;

import dagger.Module;
import dagger.Provides;
import okhttp3.Cache;
import okhttp3.OkHttpClient;

/**
 * Created by admin on 10/25/2017.
 */
@Module(includes = ContextModule.class)
public class Networkodule {

    @Provides
    @MainApplicationScope
    public OkHttpClient okHttpClient(Cache cache)
    {
        return new OkHttpClient.Builder().cache(cache).build();
    }

    @Provides
    @MainApplicationScope
    public Cache cache(File cacheFile){
        return new Cache(cacheFile, 20*1000*1000); // 20Mb cache
    }

    @Provides
    @MainApplicationScope
    public File cacheFile(Context context){
        return new File(context. getCacheDir(),"okhttp_cache");
    }

}
