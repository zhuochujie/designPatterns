package com.mashibing.stragtegy;

public class DogFoodComparator implements Comparator<Dog> {
    //dog饭量food正序排列
    @Override
    public int compare(Dog o1, Dog o2) {
        if (o1.food < o2.food) return -1;
        else if (o1.food > o2.food) return 1;
        else return 0;
    }
}
