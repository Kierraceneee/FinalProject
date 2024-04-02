package com.rc.cars.model.sub;

import com.rc.cars.model.base.abstractOffRoad;

import java.math.BigDecimal;

public class duneBuggy extends abstractOffRoad {

    @Override
    public BigDecimal getforSaleValue(){
        return BigDecimal.valueOf(200.00);
    }

    @Override
    public String getUPC(){
        return "885532";
    }

    @Override
    public int getStartNumber(){
        return 7446;
    }

    @Override
    public String getMotorNumber(){
        return "ORDB3400";
    }

    @Override
    public String toString(){
        return "Dune Buggy Off-Road Car";
    }

}
