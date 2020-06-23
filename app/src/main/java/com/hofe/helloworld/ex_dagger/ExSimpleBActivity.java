package com.hofe.helloworld.ex_dagger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.hofe.helloworld.R;
import com.hofe.helloworld.common.config.MyApplication;
import com.hofe.helloworld.ex_dagger.bean.SimpleA;
import com.hofe.helloworld.ex_dagger.di.DaggerSimpleAComponent;
import com.hofe.helloworld.ex_dagger.di.SimpleAComponent;
import com.hofe.helloworld.ex_dagger.di.SimpleAModule;

import javax.inject.Inject;

public class ExSimpleBActivity extends AppCompatActivity {

    @Inject
    public SimpleA a1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex_simpleb_activity);

//        DaggerSimpleAComponent.create().injectSimpleBActivity(this);
        //SimpleAComponent build = DaggerSimpleAComponent.builder().simpleAModule(new SimpleAModule()).build();
        //build.injectSimpleBActivity(this);
        SimpleAComponent singleSimpleAComponent = ((MyApplication) getApplication()).getSingleSimpleAComponent();
        singleSimpleAComponent.injectSimpleBActivity(this);

        Log.v("simpleA 1", String.valueOf(a1.hashCode()));
    }
}