package com.design.pattern.structural.decorator.v2;

public class SausageDecorator extends AbstractDecorator {
    public SausageDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    public String getDesc() {
        return super.getDesc()+" = 香肠";
    }

    @Override
    public int cost() {
        return super.cost()+2;
    }
}