package com.rc.cars.view;

import com.rc.cars.controller.inventoryGenerator;
import com.rc.cars.model.base.abstractRCCar;
import com.rc.cars.model.base.accessory;
import com.rc.cars.model.sub.knobbyTireOption;
import com.rc.cars.model.sub.militaryShell;
import com.rc.cars.model.sub.slickTireOption;
import com.rc.cars.model.sub.truckShell;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class order {
    private final ArrayList<abstractRCCar> carOrder;
    private final ArrayList<abstractRCCar> customOptions;
    private final ArrayList<accessory> accesoryOrder;
    private Scanner userIn;
    private final inventoryGenerator inventory;
    private abstractRCCar carChoice;
    private abstractRCCar optionsChoice;
    private accessory carExtra;


    public order(){
        carOrder = new ArrayList<>();
        customOptions = new ArrayList<>();
        accesoryOrder = new ArrayList<>();
        inventory = new inventoryGenerator();
    }
    public void welcomeMessage(){
        System.out.println("Hello and welcome to our RC Car Shop");
        System.out.println("The one and only place for all things RC Cars.");
        orderGenerator();
    }

    private void orderGenerator(){
        String value = buySomething();
        if(value.isBlank() || value.isEmpty()){
            value = buySomething();
        } if (value.equals("1")){
            buyAccessories();
        }else {
            buyRC();
        }
    }

    private String buySomething(){
        System.out.println("So what are you lookin' for; cars or accessories?");
        System.out.println("Here's your options: \n1 Accessories \n2 Car ");
        String pattern = "[1-2]+";
        return verifyResult(pattern);
    }

    private void buyRC(){
        System.out.println("What kind of car are you thinking?");
        System.out.println("We've got: \n1 - Sport\n2 - SUV \n3 - Classic" +
                "\n4 - ATV \n5 - Dune Buggy \n6 - Crawler");
        String pattern = "[1-6]+";
        String answer = verifyResult(pattern);
        switch (answer){
            case "1":
                carChoice = inventory.getSportList().get(0);
                inventory.getSportList().remove(0);
                break;
            case "2":
                carChoice = inventory.getSUVList().get(0);
                inventory.getSUVList().remove(0);
                break;
            case "3":
                carChoice = inventory.getClassicList().get(0);
                inventory.getClassicList().remove(0);
                break;
            case "4":
                carChoice = inventory.getATVList().get(0);
                inventory.getATVList().remove(0);
                break;
            case "5":
                carChoice = inventory.getDuneBuggyList().get(0);
                inventory.getATVList().remove(0);
                break;
            case "6":
                carChoice = inventory.getCrawlerList().get(0);
                inventory.getClassicList().remove(0);
                break;
            default:
                buyRC();
        }
        upgradeOffer();
        carOrder.add(carChoice);
        anotherCar();
        orderDone();
    }

    private void buyAccessories(){
        System.out.println("What accessories are you interested in? ");
        System.out.println("We got: \n1 Chassis Converter Kit\n2 Turn Signal" +
                "\n3 Car Work Stand\n4 Optional Battery");
        String pattern = "[1-4]+";
        String item = userIn.next(pattern);
        accessoryChoice(item);
        accesoryOrder.add(carExtra);
        moreAccessories();
    }
private void accessoryChoice(String item){
        switch (item){
            case "1":
                carExtra = new accessory("Chassis Converter Kit", BigDecimal.valueOf(39.00));
        break;
        case "2":
                carExtra = new accessory("Turn Signal Lamp", BigDecimal.valueOf(15.00));
        break;
        case "3":
                carExtra = new accessory("Car Work Stand", BigDecimal.valueOf(20.00));
        break;
        case "4":
                carExtra = new accessory("Optional Battery", BigDecimal.valueOf(40.00));
        break;
            default:
                System.out.println("That's not an option, try another.");
                buyAccessories();
        }
    }

    private void upgradeOffer(){
        System.out.println("Here are some upgrades we offer, take a look.");
        System.out.println("We offer the following:\n1 Military Shell\n2 Truck Shell" +
                "\n3 Knobby Tires\n4 Slick Tires\n0 None ");
        String pattern = "[0-4]+";
        String answer = verifyResult(pattern);
        switch (answer){
            case "0":
                optionsChoice = null;
                break;
            case "1":
                optionsChoice = new militaryShell(carChoice);
                break;
            case "2":
                optionsChoice = new truckShell(carChoice);
                break;
            case "3":
                optionsChoice = new knobbyTireOption(carChoice);
                break;
            case "4":
                optionsChoice = new slickTireOption(carChoice);
                break;
            default:
                upgradeOffer();
        }
        if (optionsChoice != null){
            customOptions.add(optionsChoice);
            moreUpgrades();
        }
    }

    private void moreUpgrades(){
        System.out.println("Do you want to add another Upgrade? Yes or No?");
    String val = userIn.next();
    switch (val){
        case "Yes":
            upgradeOffer();
            break;
        case "No":
            break;
        default:
            System.out.println("That's not an option. Try again.");
            moreUpgrades();
        }

    }

    private void anotherCar(){
        System.out.println("Do you want to add another car? Yes or No?");
    String answer = userIn.next();
    switch (answer.toLowerCase()){
        case "yes":
            carChoice = null;
            buyRC();
            break;
        case "no":
            buyAccessories();
            break;
        default:
            System.out.println("That's not an option. Try again.");
            anotherCar();
    }
    }

    private void moreAccessories(){
        System.out.println("Wanna add another accessory? Yes or No?");
        String val = userIn.next();
        switch (val){
            case "Yes":
                carExtra = null;
                buyAccessories();
                break;
            case "No":
                orderDone();
                break;
            default:
                System.out.println("That's not an option. Try again.");
        moreAccessories();
        }
    }

    private void orderDone(){
        new receipt(carOrder,customOptions, accesoryOrder);
    }

    private String verifyResult(String pattern){
        String answer = "";
        try{
            userIn = new Scanner(System.in);
            answer = userIn.next(pattern);
        }catch (InputMismatchException ex){
            System.out.println("That's not an option. Try again.");
        }
        return answer;
    }






}
