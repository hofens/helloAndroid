package com.hofe.helloworld.ex_dagger.di;


import com.hofe.helloworld.ex_dagger.bean.SimpleA;
import com.hofe.helloworld.ex_dagger.bean.SimpleB;

import dagger.Module;
import dagger.Provides;

@Module(includes = SimpleAModule.class)
public class SimpleBModule {

//    public SimpleA simpleA;
//
//    public SimpleBModule(SimpleA A){
//        this.simpleA = A;
//    }

    @Provides
    public SimpleB provideSimpleB(SimpleA a){
        return new SimpleB(a);
    }

//    @Provides
//    public SimpleA providerSimpleA(){
//        return new SimpleA();
//    }
}
