package com.rc.cars.model.sub;

import com.rc.cars.model.base.abstractOffRoad;

import java.math.BigDecimal;

public class crawler extends abstractOffRoad {

    @Override
    public BigDecimal getforSaleValue(){
        return BigDecimal.valueOf(250.00);
    }

    @Override
    public String getUPC(){
        return "756643";
    }

    @Override
    public int getStartNumber(){
        return 3398;
    }

    @Override
    public String getMotorNumber(){
        return "ORCR4600";
    }

    @Override
    public String toString(){
        return "Crawler Off-Road Car";
    }
}
