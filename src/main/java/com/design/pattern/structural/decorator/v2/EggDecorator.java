package com.design.pattern.structural.decorator.v2;

public class EggDecorator extends  AbstractDecorator{
    public EggDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    public String getDesc() {
        return super.getDesc()+" = 鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost()+1;
    }
}