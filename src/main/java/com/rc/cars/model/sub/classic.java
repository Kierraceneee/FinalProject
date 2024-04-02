package com.rc.cars.model.sub;

import com.rc.cars.model.base.abstractStreetCar;

import java.math.BigDecimal;

public class classic extends abstractStreetCar {

    @Override
    public BigDecimal getforSaleValue(){
        return BigDecimal.valueOf(197.00);
    }

    @Override
    public String getUPC(){
        return "315790";
    }

    @Override
    public int getStartNumber(){
        return 7326;
    }

    @Override
    public String getMotorNumber(){
        return "CLS4019";
    }

    @Override
    public String toString(){
        return "Classic Street Car";
    }

    }
