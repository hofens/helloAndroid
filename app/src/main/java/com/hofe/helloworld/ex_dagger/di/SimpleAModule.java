package com.hofe.helloworld.ex_dagger.di;


import com.hofe.helloworld.ex_dagger.bean.SimpleA;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;


@Module
public class SimpleAModule {

    @Singleton
    @Provides
    public SimpleA providerSimpleA(){
        return new SimpleA();
    }
}
