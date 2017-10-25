package com.example.demo.sampleapplicaton.dagger.components;

import com.example.demo.sampleapplicaton.activities.LandingActivity;
import com.example.demo.sampleapplicaton.dagger.modules.LandingActivityModule;
import com.example.demo.sampleapplicaton.dagger.scopes.LandingActivityScope;

import dagger.Component;

/**
 * Created by admin on 14-Jul-17.
 */
@LandingActivityScope
@Component(modules =LandingActivityModule.class, dependencies = MainComponent.class)
public interface LandingActivityComponent {
    void injectLandingActivity(LandingActivity landingActivity);
}
