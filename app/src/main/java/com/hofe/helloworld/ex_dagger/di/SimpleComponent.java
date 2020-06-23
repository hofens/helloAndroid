package com.hofe.helloworld.ex_dagger.di;

import com.hofe.helloworld.ex_dagger.ExSimpleAActivity;
import com.hofe.helloworld.ex_dagger.ExSimpleActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {SimpleAModule.class, SimpleBModule.class})
public interface SimpleComponent {

    void injectSimpleACtivity(ExSimpleActivity simpleActivity);
}
