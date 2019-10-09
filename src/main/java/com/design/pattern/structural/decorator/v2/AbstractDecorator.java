package com.design.pattern.structural.decorator.v2;

public class AbstractDecorator extends ABattercake {
    private ABattercake aBattercake;

    public AbstractDecorator(ABattercake aBattercake) {
        this.aBattercake = aBattercake;
    }

    public String getDesc() {
        return aBattercake.getDesc();
    }

    public int cost() {
        return aBattercake.cost();
    }
}