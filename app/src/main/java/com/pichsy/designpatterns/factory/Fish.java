package com.pichsy.designpatterns.factory;

import android.util.Log;

public class Fish implements IAnimal {

    private String name;

    public Fish() {
    }

    public Fish(String name) {
        this.name = name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name == null ? "Fish" : name;
    }

    @Override
    public void eat() {
        Log.d(TAG, name + "吃饭了！");
    }
}
