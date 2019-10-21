package com.mashibing.abstractFactory.modern;


import com.mashibing.abstractFactory.AbstracFactory;
import com.mashibing.abstractFactory.Food;
import com.mashibing.abstractFactory.Vehicle;
import com.mashibing.abstractFactory.Weapon;


public class ModernFactory extends AbstracFactory {
    @Override
    public Food createFood() {
        return new Bread();
    }

    @Override
    public Vehicle createVehicle() {
        return new Car();
    }

    @Override
    public Weapon createWeapon() {
        return new AK47();
    }
}
