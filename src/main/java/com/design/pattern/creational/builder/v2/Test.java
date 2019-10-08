package com.design.pattern.creational.builder.v2;

public class Test {

    public static void main(String[] args) {

        Course builderCourseName = new Course.CourseBuilder().builderCourseName("builderCourseName").build();

        System.out.println(builderCourseName);
    }
}