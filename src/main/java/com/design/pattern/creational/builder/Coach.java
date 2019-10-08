package com.design.pattern.creational.builder;

public class Coach {


    private CourseBuilder courseBuilder;

    public void setCourseBuilder(CourseBuilder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }


    public Course makeCourse(
            String courseName,
            String coursePPT,
            String courseVideo,
            String courseArticle,
            String courseQA) {
        courseBuilder.buildCourseArticle(courseArticle);
        courseBuilder.buildCourseName(courseName);
        courseBuilder.buildCoursePPT(coursePPT);
        courseBuilder.buildCourseQA(courseQA);
        courseBuilder.buildCourseVideo(courseVideo);
        Course course = courseBuilder.makeCourses();
        return course;
    }


}