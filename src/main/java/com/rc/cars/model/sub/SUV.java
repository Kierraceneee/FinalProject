package com.rc.cars.model.sub;

import com.rc.cars.model.base.abstractStreetCar;

import java.math.BigDecimal;

public class SUV extends abstractStreetCar {

    @Override
    public BigDecimal getforSaleValue(){
        return BigDecimal.valueOf(210.00);
    }

    @Override
    public String getUPC(){
        return "642852";
    }

    @Override
    public int getStartNumber(){
        return 8647;
    }

    @Override
    public String getMotorNumber(){
        return "SUV3019";
    }

    @Override
    public String toString(){
        return "SUV Street Car";
    }





}
