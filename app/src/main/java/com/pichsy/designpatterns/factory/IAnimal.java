package com.pichsy.designpatterns.factory;

public interface IAnimal {
    String TAG = "IAnimal";

    // 设置名字
    void setName(String name);

    // 动物名字
    String getName();

    // 吃饭
    void eat();
}
