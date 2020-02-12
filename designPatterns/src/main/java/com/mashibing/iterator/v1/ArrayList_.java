package com.mashibing.iterator.v1;


/**
 * 用数组实现一个容器，可以添加对象
 * 相比数组，这个容器不考虑边界问题，可以动态扩展
 */
public class ArrayList_ {
    Object[] objects = new Object[10];
    private int index = 0;
    public void add(Object o){
        if (index ==objects.length){
            Object[] newObjects = new Object[objects.length * 2];
            System.arraycopy(objects,0,newObjects,0,objects.length);
            objects = newObjects;
        }
        objects[index] = o;
        index++;
    }
    public int size(){
        return index;
    }
}
