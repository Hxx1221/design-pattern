package com.design.pattern.creational.factorymethod;

public abstract class VideoFactory {
    //只定义规范  产生产品是由子类来生成
    public abstract Video getVideo();

}