package com.design.pattern.structural.decorator.v1;

public class BattercakeWithEgg  extends Battercake{

    @Override
    public int cost() {
        return super.cost()+1;
    }

    @Override
    public String getDesc() {
        return super.getDesc()+" = 鸡蛋";
    }
}