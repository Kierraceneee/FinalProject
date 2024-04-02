package com.rc.cars.model.base;

import com.rc.cars.model.impl.forSale;

import java.math.BigDecimal;

public abstract class abstractRCCar implements forSale {

    //variables
    private String motorNumber;


    // abstract methods
    public abstract BigDecimal getforSaleValue();
    public abstract String getUPC();
    public abstract String getWheelType();
    public abstract int getStartNumber();

    // methods
    public void setMotorNumber(String motorNumber){
        this.motorNumber = motorNumber;
    }
    public String getMotorNumber(){
        return motorNumber;
    }

    public BigDecimal getUpgradeAmount(){
        return BigDecimal.valueOf(0.0);
    }

    public String getUpgradeName(){
        return "";
    }







}
