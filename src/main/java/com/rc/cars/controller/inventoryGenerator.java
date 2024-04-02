package com.rc.cars.controller;

import com.rc.cars.model.base.abstractRCCar;
import com.rc.cars.model.sub.SUV;
import com.rc.cars.model.sub.classic;
import com.rc.cars.model.sub.ATV;
import com.rc.cars.model.sub.crawler;
import com.rc.cars.model.sub.duneBuggy;
import com.rc.cars.model.sub.sport;

import java.util.ArrayList;
import java.util.function.Supplier;

public class inventoryGenerator {
    private final ArrayList<abstractRCCar> SUVList = new ArrayList<>();
    private final ArrayList<abstractRCCar> sportList = new ArrayList<>();
    private final ArrayList<abstractRCCar> classicList = new ArrayList<>();
    private final ArrayList<abstractRCCar> ATVList = new ArrayList<>();
    private final ArrayList<abstractRCCar> duneBuggyList = new ArrayList<>();
    private final ArrayList<abstractRCCar> crawlerList = new ArrayList<>();
    private final serialNumberGenerator generator;


    public inventoryGenerator() {
        generator = serialNumberGenerator.getInstance();
        buildRCInventory(SUVList,() -> new SUV());
        buildRCInventory(sportList, () -> new sport());
        buildRCInventory(classicList, () -> new classic());
        buildRCInventory(ATVList, () -> new ATV());
        buildRCInventory(duneBuggyList, () -> new duneBuggy());
        buildRCInventory(crawlerList, () -> new crawler());
    }

    public inventoryGenerator(serialNumberGenerator generator) {
        this.generator = generator;
    }
    public ArrayList<abstractRCCar> getSUVList(){
        return SUVList;
    }
    public ArrayList<abstractRCCar> getSportList(){
        return sportList;
    }
    public ArrayList<abstractRCCar> getATVList() {
        return ATVList;
    }
    public ArrayList<abstractRCCar> getClassicList() {
        return classicList;
    }
    public ArrayList<abstractRCCar> getCrawlerList() {
        return crawlerList;
    }
    public ArrayList<abstractRCCar> getDuneBuggyList() {
        return duneBuggyList;
    }

    private void buildRCInventory(ArrayList<abstractRCCar> carList, Supplier<abstractRCCar> carSupply) {
        generator.startGeneration(carSupply.get().getUPC(), carSupply.get().getMotorNumber(), carSupply.get().getStartNumber());

        for (int i = 0; i < 100 ; i++){
            abstractRCCar car = carSupply.get();
            car.setMotorNumber(generator.getNextSerial());
            carList.add(i, car);
        }


    }
}
