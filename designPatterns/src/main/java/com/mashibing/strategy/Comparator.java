package com.mashibing.strategy;

/**
 * 比较器Comparator 仿照参考java.util Interface Comparator<T>类写的
 * 	第五节 test包，关于classloader的知识
         视频时间1:16:45
         1.8以前 接口不能写方法实现
         1.8以后 接口可以写方法实现
 * @param <T>
 */
@FunctionalInterface
public interface Comparator<T> {
    int compare(T o1, T o2);
    /*default void m(){
        System.out.println("接口中默认方法m");
    }*/
    default void m2(){
        System.out.println("接口中默认方法m2");
    }
}
