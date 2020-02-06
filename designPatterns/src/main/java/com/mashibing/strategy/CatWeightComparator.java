package com.mashibing.strategy;

/**
 * cat比较大小的策略可以灵活指定： 实现接口Comparator
 * 开闭原则 ： 对修改关闭 对扩展开放
 *
 */
public class CatWeightComparator implements Comparator<Cat> {
    //体重正序排列
    @Override
    public int compare(Cat o1, Cat o2) {
        if (o1.weight > o2.weight) return 1;
        else if (o1.weight < o2.weight) return -1;
        else return 0;
    }
}
