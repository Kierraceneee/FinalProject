package com.rc.cars.view;

import com.rc.cars.controller.inventoryGenerator;
import com.rc.cars.model.base.abstractRCCar;
import com.rc.cars.model.base.accessory;
import com.rc.cars.model.sub.knobbyTireOption;
import com.rc.cars.model.sub.slickTireOption;

import java.math.BigDecimal;
import java.util.ArrayList;

public class program {

    public static void main(String[] args){
        order myOrder = new order();
        myOrder.welcomeMessage();
    }

    public static void receiptTest(){
        ArrayList<abstractRCCar> carList = new ArrayList<>();
        ArrayList<abstractRCCar> customUpgradesList = new ArrayList<>();
        inventoryGenerator generator = new inventoryGenerator();

        carList.add(generator.getSUVList().get(0));
        carList.add(generator.getSportList().get(0));
        carList.add(generator.getClassicList().get(0));
        carList.add(generator.getATVList().get(0));
        carList.add(generator.getCrawlerList().get(0));
        abstractRCCar custom = generator.getDuneBuggyList().get(1);
   custom = new knobbyTireOption(custom);
   custom = new slickTireOption(custom);
   carList.add(custom);
   customUpgradesList.add(custom);

   ArrayList<accessory> accessories = new ArrayList<>();
   accessories.add(0, new accessory("Chassis Converter Kit", BigDecimal.valueOf(39.00)));
   new receipt(carList, customUpgradesList, accessories);
    }





















}
