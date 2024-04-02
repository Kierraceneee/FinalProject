package com.rc.cars.model.sub;

import com.rc.cars.model.base.abstractRCCar;
import com.rc.cars.model.base.abstractRCUpgrades;

import java.math.BigDecimal;

public class knobbyTireOption extends abstractRCUpgrades {

    public knobbyTireOption(abstractRCCar car){
        super(car);
    }

    public BigDecimal getUpgradeAmount(){
        return BigDecimal.valueOf(34.97);
    }

    @Override
    public String getUpgradeName(){
        return "Knobby Tire option";
    }

    @Override
    public String toString(){
        return carUpgrades.toString();
    }
}
