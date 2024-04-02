package com.rc.cars.model.sub;

import com.rc.cars.model.base.abstractOffRoad;

import java.math.BigDecimal;

public class ATV  extends abstractOffRoad {

    @Override
    public BigDecimal getforSaleValue(){
        return BigDecimal.valueOf(99.00);
    }

    @Override
    public String getUPC(){
        return "113342";
    }

    @Override
    public int getStartNumber(){
        return 8488;
    }

    @Override
    public String getMotorNumber(){
        return "ORAT2400";
    }

    @Override
    public String toString(){
        return "ATV Off-Road Car";
    }
}
