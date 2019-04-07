package com.pichsy.designpatterns.factory;

// 工厂模式
public class AnimalFactory {


    // 使用 createAnimal工厂创建出动物对象
    public static IAnimal createAnimal(String type) {
        IAnimal animal = null;
        switch (type) {
            case "panda":
                animal = new Panda();
                animal.setName("团团");
                break;
            case "bear":
                animal = new Bear("熊二");
                break;
            case "fish":
                animal = new Fish("小丑鱼");
                break;

        }
        return animal;
    }

    // 使用方式
    private static void use() {
        IAnimal animal = createAnimal("panda");
        animal.eat();
        animal = createAnimal("fish");
        animal.eat();
        animal = createAnimal("bear");
        animal.eat();
    }

}
