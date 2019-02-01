package com.aspectj.demo.activity;

/**
 * Created by lingyi.mly on 2016/5/20.
 */
public class User implements MyInterface{
    String name ;
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
