package com.mashibing.stragtegy;

public class CatHeightComparator implements Comparator<Cat> {
    //身高倒序排列
    @Override
    public int compare(Cat o1, Cat o2) {
        if (o1.height < o2.height) return 1;
        else if (o1.height > o2.height) return -1;
        else return 0;
    }
}
