package com.example.demo.sampleapplicaton.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.demo.sampleapplicaton.models.GroupInfoPojo;
import com.example.demo.sampleapplicaton.presenters.MainPresenter;
import com.example.demo.sampleapplicaton.views.MainView;
import com.example.demo.sampleapplicaton.R;

public class MainActivity extends AppCompatActivity implements MainView {
    MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainPresenter= new MainPresenter(this,this);
        mainPresenter.getResponse(7);
    }

    @Override
    public void render(GroupInfoPojo body) {
//        body.getContents();
    }
}
