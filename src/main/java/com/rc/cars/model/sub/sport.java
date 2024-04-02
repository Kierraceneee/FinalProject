package com.rc.cars.model.sub;

import com.rc.cars.model.base.abstractStreetCar;

import java.math.BigDecimal;

public class sport extends abstractStreetCar {


    @Override
    public BigDecimal getforSaleValue() {
        return BigDecimal.valueOf(150.00);
    }

    @Override
    public String getUPC() {
        return "MB605";
    }

    @Override
    public int getStartNumber() {
        return 258456;
    }

    @Override
    public String getMotorNumber(){
        return "SPT2019";
    }

    @Override
    public String toString(){
        return "Sport Street Car";
    }
}
