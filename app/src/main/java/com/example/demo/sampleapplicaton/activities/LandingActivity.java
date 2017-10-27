package com.example.demo.sampleapplicaton.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.demo.sampleapplicaton.MyApplication;
import com.example.demo.sampleapplicaton.R;
import com.example.demo.sampleapplicaton.dagger.components.DaggerLandingActivityComponent;
import com.example.demo.sampleapplicaton.dagger.components.LandingActivityComponent;
import com.example.demo.sampleapplicaton.dagger.components.MainComponent;
import com.example.demo.sampleapplicaton.dagger.modules.LandingActivityModule;
import com.example.demo.sampleapplicaton.models.UserDetailPojo;
import com.example.demo.sampleapplicaton.presenters.LandingPresenter;
import com.example.demo.sampleapplicaton.views.LandingView;

import javax.inject.Inject;

public class LandingActivity extends AppCompatActivity implements LandingView {
    @Inject
    LandingPresenter presenter;

    LandingActivityComponent component;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);

        component= DaggerLandingActivityComponent.builder().
                landingActivityModule(new LandingActivityModule(this)).
                mainComponent(MyApplication.get(this).getComponent()).build();
        component.injectLandingActivity(this);


        presenter.getUsetDetails(7);

    }

    @Override
    public void userDetail(UserDetailPojo body) {
            body.getProfilepic();
    }

    @Override
    public void showMessage(String message) {

    }

    @Override
    public void redirectToWebsite(String webUrl) {

    }
}
