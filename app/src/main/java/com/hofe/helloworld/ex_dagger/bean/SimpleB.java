package com.hofe.helloworld.ex_dagger.bean;

public class SimpleB {

    SimpleA simpleA;

    public SimpleB(){
    }

    public SimpleB(SimpleA a){
        this.simpleA = a;
    }

    public SimpleA getSimpleA() {
        return simpleA;
    }
}
