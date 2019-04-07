package com.pichsy.designpatterns.factory;

import android.util.Log;

public class Panda implements IAnimal {

    private String name;

    public Panda() {
    }

    public Panda(String name) {
        this.name = name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name == null ? "Panda" : name;
    }

    @Override
    public void eat() {
        Log.d(TAG, name + "吃饭了！");
    }
}
