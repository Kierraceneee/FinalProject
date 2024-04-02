package com.rc.cars.model.sub;

import com.rc.cars.model.base.abstractRCCar;
import com.rc.cars.model.base.abstractRCUpgrades;

import java.math.BigDecimal;

public class militaryShell extends abstractRCUpgrades {

    public militaryShell(abstractRCCar car){
        super(car);
    }

    @Override
    public BigDecimal getUpgradeAmount(){
        return BigDecimal.valueOf(85.00);
    }

    @Override
    public String getUpgradeName(){
        return "Military Shell";
    }

    @Override
    public String toString(){
        return carUpgrades.toString();
    }
}
