package com.mashibing.singleton;
/**
 * lazy loading
 * 懒汉式
 * 虽然达到了按需初始化的目的，但却带来线程不安全的问题
 * 可以通过synchronized解决，但也带来效率下降(每次获取实例都要看有没有锁)
 *  volatile 解决线程之间可见性
 * 提高效率的方法： 双重检查 缩小同步代码块（锁的范围缩小）--只对new的过程加锁
 * 这是目前好的解决方法之一
 */
public class Mgr03_v2 {
    private static volatile Mgr03_v2 INSTANCE;
    private Mgr03_v2(){

    }
    public static Mgr03_v2 getInstance(){
        if (INSTANCE == null){
            //双重检查
            synchronized (Mgr03_v2.class){
                //拿到锁之后如果还为空那就不执行了，为空执行不下去了
                if (INSTANCE == null){
                    INSTANCE = new Mgr03_v2();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100000; i++) {
            new Thread(()->{
                System.out.println(Mgr03_v2.getInstance().hashCode());
            }).start();
        }
    }
}
