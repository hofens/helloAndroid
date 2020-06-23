package com.hofe.helloworld.ex_dagger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.hofe.helloworld.R;
import com.hofe.helloworld.common.utils.LogUtil;
import com.hofe.helloworld.ex_dagger.bean.SimpleA;
import com.hofe.helloworld.ex_dagger.bean.SimpleB;
import com.hofe.helloworld.ex_dagger.di.DaggerSimpleComponent;
import com.hofe.helloworld.ex_dagger.di.SimpleAModule;
import com.hofe.helloworld.ex_dagger.di.SimpleBModule;

import javax.inject.Inject;

public class ExSimpleActivity extends AppCompatActivity {

    @Inject
    SimpleA simpleA;

    @Inject
    SimpleB simpleB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex_simple_activity);

        DaggerSimpleComponent.builder()
                .simpleAModule(new SimpleAModule())
                .simpleBModule(new SimpleBModule())
                .build()
                .injectSimpleACtivity(this);

//        DaggerSimpleComponent.create().injectSimpleACtivity(this);

        Log.v("simpleA", String.valueOf(simpleA.hashCode()));
        Log.v("simpleB", String.valueOf(simpleB.hashCode()));
        Log.v("simpleB.A", String.valueOf(simpleB.getSimpleA().hashCode()));
    }
}