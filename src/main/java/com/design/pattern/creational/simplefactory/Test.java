package com.design.pattern.creational.simplefactory;

public class Test {

    public static void main(String[] args) {
//        PythonVideo pythonVideo = new PythonVideo();
//        pythonVideo.produce();
        VideoFactory videoFactory = new VideoFactory();
        Video java = videoFactory.getVideo(JavaVideo.class);
        java.produce();

    }
}