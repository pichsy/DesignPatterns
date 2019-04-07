package com.pichsy.designpatterns.factory;

import android.util.Log;

public class Bear implements IAnimal {

    private String name;

    public Bear() {
    }

    public Bear(String name) {
        this.name = name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name == null ? "Bear" : name;
    }

    @Override
    public void eat() {
        Log.d(TAG, name + "吃饭了！");
    }
}
