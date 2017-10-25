package com.example.demo.sampleapplicaton.dagger.modules;

import com.example.demo.sampleapplicaton.dagger.scopes.LandingActivityScope;
import com.example.demo.sampleapplicaton.views.LandingView;

import dagger.Module;
import dagger.Provides;



/**
 * Created by admin on 14-Jul-17.
 */
@Module
public class LandingActivityModule {
    private final LandingView view;

    public LandingActivityModule(LandingView view) {
        this.view = view;
    }

    @Provides
    @LandingActivityScope
    public LandingView landingView(){
        return view;
    }
}
