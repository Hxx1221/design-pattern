package com.design.pattern.structural.decorator.v1;

public class Test {

    public static void main(String[] args) {
        Battercake battercake = new Battercake();
        System.out.println(battercake.getDesc() + "-----" + battercake.cost());
        Battercake BattercakeWithEgg = new BattercakeWithEgg();
        System.out.println(BattercakeWithEgg.getDesc() + "-----" + BattercakeWithEgg.cost());
        Battercake BattercakeWithEggSausage = new BattercakeWithEggSausage();
        System.out.println(BattercakeWithEggSausage.getDesc() + "-----" + BattercakeWithEggSausage.cost());


    }
}