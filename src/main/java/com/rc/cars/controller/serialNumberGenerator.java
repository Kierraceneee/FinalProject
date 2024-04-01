package com.rc.cars.controller;

public class serialNumberGenerator {

    private static serialNumberGenerator generate;
    private int startValue;
    private String prefixValue;

    public static synchronized serialNumberGenerator getInstance(){
        if (generate == null){
            generate = new serialNumberGenerator();
        }
        return generate;
    }

    private serialNumberGenerator(){}

    public synchronized void startGeneration(String model, int startNumber){
        prefixValue = model;
        startValue = startNumber;
    }

    public synchronized String getNextSerial(){
        return prefixValue + (++startValue);
    }

    public synchronized int getRecentNumber(){
        return startValue;
    }
}
