package com.rc.cars.model.base;

import java.math.BigDecimal;

public abstract class abstractRCUpgrades extends abstractRCCar {

    protected abstractRCCar carUpgrades;

    public abstractRCUpgrades(abstractRCCar car) {
        carUpgrades = car;
    }

    @Override
    public BigDecimal getforSaleValue(){
        return carUpgrades.getforSaleValue();
    }

    @Override
    public String getUPC(){
        return carUpgrades.getUPC();
    }

    @Override
    public String getWheelType(){
        return carUpgrades.getWheelType();
    }

    @Override
    public int getStartNumber(){
        return carUpgrades.getStartNumber();
    }

    @Override
    public String getMotorNumber(){
        return carUpgrades.getMotorNumber();
    }

}
