package com.mashibing.singleton;
/**
 * lazy loading
 * 懒汉式
 * 虽然达到了按需初始化的目的，但却带来线程不安全的问题
 * 可以通过synchronized解决，但也带来效率下降(每次获取实例都要看有没有锁)
 * volatile 解决线程之间可见性
 * 这是目前好的解决方法之一
 */
public class Mgr03 {
    private static volatile Mgr03 INSTANCE;
    private Mgr03(){

    }
    public static synchronized Mgr03 getInstance(){
        if (INSTANCE == null){
            INSTANCE = new Mgr03();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100000; i++) {
            new Thread(()->{
                System.out.println(Mgr03.getInstance().hashCode());
            }).start();
        }
    }
}
