package com.rc.cars.controller;

public class serialNumberGenerator {

    private static serialNumberGenerator generate;
    private int startValue;
    private String UPCValue;
    private String motorValue;

    public static synchronized serialNumberGenerator getInstance(){
        if (generate == null){
            generate = new serialNumberGenerator();
        }
        return generate;
    }

    private serialNumberGenerator(){}

    public synchronized void startGeneration(String UPC, String motorNumber, int startNumber){
        UPCValue = UPC;
        startValue = startNumber;
        motorValue = motorNumber;
    }

    public synchronized String getNextSerial(){
        return motorValue + UPCValue + (++startValue);
    }

    public synchronized int getRecentNumber(){
        return startValue;
    }
}
