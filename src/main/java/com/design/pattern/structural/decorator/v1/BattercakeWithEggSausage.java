package com.design.pattern.structural.decorator.v1;

public class BattercakeWithEggSausage extends BattercakeWithEgg {

    @Override
    public String getDesc() {
        return super.getDesc()+" = 香肠";
    }

    @Override
    public int cost() {
        return super.cost()+2;
    }
}