package com.hofe.helloworld.ex_dagger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.hofe.helloworld.R;
import com.hofe.helloworld.common.config.MyApplication;
import com.hofe.helloworld.ex_dagger.bean.SimpleA;
import com.hofe.helloworld.ex_dagger.di.DaggerSimpleAComponent;
import com.hofe.helloworld.ex_dagger.di.SimpleAComponent;

import javax.inject.Inject;

public class ExSimpleAActivity extends AppCompatActivity {

    @Inject
    SimpleA simpleA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex_simplea_activity);
//        DaggerSimpleAComponent.create().injectSimpleAActivity(this);
        SimpleAComponent singleSimpleAComponent = ((MyApplication) getApplication()).getSingleSimpleAComponent();
        singleSimpleAComponent.injectSimpleAActivity(this);

        Log.v("simpleA", String.valueOf(simpleA.hashCode()));

        Intent intent = new Intent(this, ExSimpleBActivity.class);
        startActivity(intent);
    }
}