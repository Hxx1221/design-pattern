package com.design.pattern.creational.abstractfactory;

public class PythonCourseFactry implements CourseFactory {
    public Video getVideo() {
        return new PytheonVideo();
    }

    public Article getArticle() {
        return new PythonArticle();
    }
}