package com.example.demo.sampleapplicaton.dagger.modules;

import android.content.Context;

import com.example.demo.sampleapplicaton.dagger.scopes.MainApplicationScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by admin on 10/25/2017.
 */
@Module
public class ContextModule {


    private final Context context;

    public  ContextModule(Context context )
    {

        this.context=context;

    }
    @Provides
    @MainApplicationScope
    public Context context()
    {
        return context;
    }
}
