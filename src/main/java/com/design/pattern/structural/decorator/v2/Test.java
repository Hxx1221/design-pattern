package com.design.pattern.structural.decorator.v2;

public class Test {

    public static void main(String[] args) {
        ABattercake battercake = new Battercake();
        ABattercake eggDecorator = new EggDecorator(battercake);
        SausageDecorator sausageDecorator = new SausageDecorator(eggDecorator);
        System.out.println(sausageDecorator.cost()+"=="+sausageDecorator.getDesc());

    }
}