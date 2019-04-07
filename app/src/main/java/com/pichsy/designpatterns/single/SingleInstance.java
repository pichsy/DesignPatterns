package com.pichsy.designpatterns.single;

public class SingleInstance {

    // 单利模式：作用->使对象在内存中的实例只有一个

    // 1、饿汉式，线程安全
    public static class Single1 {

        private Single1() {
        }

        private final static Single1 instance = new Single1();

        public static Single1 getInstance() {
            return instance;
        }

    }

    // 2、饿汉式--静态代码块，初始化，线程安全
    public static class Single2 {
        private Single2() {
        }

        private final static Single2 instance;

        static {
            instance = new Single2();
        }

        public static Single2 getInstance() {
            return instance;
        }
    }


    // 3、懒汉式，线程不安全
    public static class Single3 {

        private Single3() {
        }

        private static Single3 instance;

        public static Single3 getInstance() {
            if (instance == null) {
                instance = new Single3();
            }
            return instance;
        }

    }

    // 4、懒汉式存在多线程安全问题，
    // 修改如下：<同步方法>
    public static class Single4 {

        private Single4() {
        }

        private static Single4 instance;

        public synchronized static Single4 getInstance() {
            if (instance == null) {
                instance = new Single4();
            }
            return instance;
        }
    }

    // 5、懒汉式存在多线程安全问题，
    // 修改如下：<加锁>
    public static class Single5 {

        private Single5() {
        }

        private static Single5 instance;

        public static Single5 getInstance() {
            if (instance == null) {
                synchronized (Single5.class) {
                    instance = new Single5();
                }
            }
            return instance;
        }
    }

    // 6、懒汉式3 虽然解决多线层安全，但是由于每次会先用锁，效率低，
    // 修改如下：<双重检查锁>, 推荐使用
    public static class Single6 {

        private Single6() {
        }

        private static Single6 instance;

        public static Single6 getInstance() {
            if (instance == null) {
                synchronized (Single6.class) {
                    if (instance == null) {
                        instance = new Single6();
                    }
                }
            }
            return instance;
        }
    }

    // 7、静态内部类
    public static class Single7 {
        private Single7() {
        }

        private static class Holder {
            final static Single7 instance = new Single7();
        }

        public static Single7 getInstance() {
            return Holder.instance;
        }
    }

    // 8、枚举-----不推荐大量使用枚举，会造成内存泄漏和浪费内存资源
    public enum Single8 {
        INSTANCE;

        public static Single8 getInstance() {
            return INSTANCE;
        }

    }

}
