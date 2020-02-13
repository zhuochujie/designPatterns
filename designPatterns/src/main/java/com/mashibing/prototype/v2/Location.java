package com.mashibing.prototype.v2;

/**
 * 深克隆
 * String类型不需要进行深克隆
 * String指向的是常量池
 */
public class Location implements Cloneable {
    String street;
    int roomNo;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Location(String street, int roomNo){
        this.street = street;
        this.roomNo = roomNo;
    }

    @Override
    public String toString() {
        return "Location{" +
                "street='" + street + '\'' +
                ", roomNo=" + roomNo +
                '}';
    }
}
