package com.mashibing.stragtegy;

import java.util.Arrays;

/**
 * Comparable实现了灵活切换比较对象Int Double Float Cat Dog ...
 * 但是如果比较Cat的策略也可以灵活切换 ：体重weight 身高height 就需要下面的策略模式了
 * Compartor 策略模式
 * 开闭原则 :对修改关闭 对扩展开放
 */
public class Main {
    public static void main(String[] args) {
/*        //使用Comparable
        //int[] arr = {1,2,3,4,4,3,5,0};
        Cat[] cats = {new Cat(3,1),new Cat(3,3),new Cat(0,0),new Cat(2,2)};
        ComparableSorter<Cat> comparableSorter = new ComparableSorter();
        comparableSorter.sort(cats);
        System.out.println(Arrays.toString(cats));*/



        //使用Compartor 策略模式测试
        //int[] arr = {1,2,3,4,4,3,5,0};
        Cat[] cats = {new Cat(1,1),new Cat(3,3),new Cat(0,0),new Cat(2,2)};
        Dog[] dogs = {new Dog(2),new Dog(8),new Dog(4)};
        ComparatorSorter comparatorSorter = new ComparatorSorter();
        comparatorSorter.sort(cats,new CatWeightComparator());
        //comparatorSorter.sort(cats,new CatHeightComparator());
        comparatorSorter.sort(dogs,new DogFoodComparator());
        System.out.println(Arrays.toString(cats));
        System.out.println(Arrays.toString(dogs));
    }
}
