package com.design.pattern.creational.factorymethod;

public class Test {

    public static void main(String[] args) {
        VideoFactory javaVideoFactory = new JavaVideoFactory();
        Video video = javaVideoFactory.getVideo();
        video.produce();

    }
}