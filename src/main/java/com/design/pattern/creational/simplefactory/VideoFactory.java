package com.design.pattern.creational.simplefactory;

public class VideoFactory {

    public  Video getVideo(String video) {
        if ("java".equals(video)) {
            return new JavaVideo();
        } else if ("python".equals(video)) {
            return new PythonVideo();
        } else {
            return null;
        }
    }

    public  Video getVideo(Class T) {
        try {
            Video video = (Video)Class.forName(T.getName()).newInstance();
            return video;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}