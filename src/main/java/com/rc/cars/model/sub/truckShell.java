package com.rc.cars.model.sub;

import com.rc.cars.model.base.abstractRCCar;
import com.rc.cars.model.base.abstractRCUpgrades;

import java.math.BigDecimal;

public class truckShell extends abstractRCUpgrades {

    public truckShell(abstractRCCar car){
        super(car);
    }

    @Override
    public BigDecimal getUpgradeAmount(){
        return BigDecimal.valueOf(70.00);
    }

    @Override
    public String getUpgradeName(){
        return "Truck Shell option";
    }

    @Override
    public String toString(){
        return carUpgrades.toString();
    }
}
