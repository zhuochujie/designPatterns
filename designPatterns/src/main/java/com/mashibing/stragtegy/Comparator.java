package com.mashibing.stragtegy;

/**
 * 比较器Comparator 仿照参考java.util Interface Comparator<T>类写的
 * @param <T>
 */
public interface Comparator<T> {
    int compare(T o1, T o2);
}
