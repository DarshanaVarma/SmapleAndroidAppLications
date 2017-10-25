package com.example.demo.sampleapplicaton.dagger.modules;

import android.content.Context;

import com.example.demo.sampleapplicaton.Config.SharedUtils;
import com.example.demo.sampleapplicaton.dagger.scopes.MainApplicationScope;

import dagger.Module;
import dagger.Provides;



/**
 * Created by admin on 05-Jul-17.
 */
@Module(includes = ContextModule.class)
public class SharedUtilsModule {

    @Provides
    @MainApplicationScope
    public SharedUtils sharedUtils(Context context){
        return new SharedUtils(context);
    }
}
