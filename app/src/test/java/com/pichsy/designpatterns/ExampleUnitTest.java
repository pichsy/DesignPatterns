package com.pichsy.designpatterns;


import com.pichsy.designpatterns.single.SingleInstance;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }


    @Test
    public void singleTest() {
        // 多线程创建实例
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    // 再次调用
                    printNew(SingleInstance.Single1.getInstance());
                    printNew(SingleInstance.Single2.getInstance());
                    printNew(SingleInstance.Single3.getInstance());
                    printNew(SingleInstance.Single4.getInstance());
                    printNew(SingleInstance.Single5.getInstance());
                    printNew(SingleInstance.Single6.getInstance());
                    printNew(SingleInstance.Single7.getInstance());
                    printNew(SingleInstance.Single8.getInstance());
                }
            }).start();
        }
    }

    private void printNew(Object o) {
        System.out.println(o.getClass().getSimpleName() + " ## instance: " + o);
    }

}