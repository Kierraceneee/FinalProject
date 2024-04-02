package com.rc.cars.model.sub;

import com.rc.cars.model.base.abstractRCCar;
import com.rc.cars.model.base.abstractRCUpgrades;

import java.math.BigDecimal;

public class slickTireOption extends abstractRCUpgrades {

    public slickTireOption(abstractRCCar car){
        super(car);
    }

    @Override
    public BigDecimal getUpgradeAmount(){
        return BigDecimal.valueOf(24.99);
    }

    @Override
    public String getUpgradeName(){
        return "Slick Tire option";
    }

    @Override
    public String toString(){
        return carUpgrades.toString();
    }
}
