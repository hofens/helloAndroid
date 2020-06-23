package com.hofe.helloworld.ex_dagger.di;

import com.hofe.helloworld.ex_dagger.ExSimpleAActivity;
import com.hofe.helloworld.ex_dagger.ExSimpleBActivity;
import com.hofe.helloworld.ex_dagger.bean.SimpleA;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Provides;

@Singleton
@Component(modules = SimpleAModule.class)
public interface SimpleAComponent {
//    SimpleA getSimpleA();

    void injectSimpleAActivity(ExSimpleAActivity simpleAActivity);

    void injectSimpleBActivity(ExSimpleBActivity simpleBActivity);
}
