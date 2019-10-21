package com.mashibing.abstractFactory.magic;

import com.mashibing.abstractFactory.AbstracFactory;
import com.mashibing.abstractFactory.Food;
import com.mashibing.abstractFactory.Vehicle;
import com.mashibing.abstractFactory.Weapon;

public class MagicFactory extends AbstracFactory {
    @Override
    public Food createFood() {
        return new MushRoom();
    }

    @Override
    public Vehicle createVehicle() {
        return new Broom();
    }

    @Override
    public Weapon createWeapon() {
        return new MagicStick();
    }
}
