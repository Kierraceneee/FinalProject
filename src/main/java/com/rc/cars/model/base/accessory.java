package com.rc.cars.model.base;

import com.rc.cars.model.impl.forSale;

import java.math.BigDecimal;

public class accessory implements forSale {

    private final BigDecimal price;
    private final String name;

    public accessory(String itemName, BigDecimal price){
        name = itemName;
        this.price = price;
    }

    @Override
    public BigDecimal getforSaleValue(){
        return price;
    }

    public String getItemName(){
        return name;
    }








}
