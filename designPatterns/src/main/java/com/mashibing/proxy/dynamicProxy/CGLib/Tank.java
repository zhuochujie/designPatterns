package com.mashibing.proxy.dynamicProxy.CGLib;


import java.util.Random;

public class Tank{

    public void move() {
        System.out.println("moving...claclacla...");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
