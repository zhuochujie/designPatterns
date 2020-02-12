package com.mashibing.proxy.dynamicProxy.CGLib;

import net.sf.cglib.proxy.Enhancer;

public class Main {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Tank.class);
        enhancer.setCallback(new TimeMethodIntercepter());
        Tank tank = (Tank) enhancer.create();
        tank.move();
    }
}
