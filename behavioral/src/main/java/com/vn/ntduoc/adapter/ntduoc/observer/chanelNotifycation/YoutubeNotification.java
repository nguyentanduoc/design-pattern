package com.vn.ntduoc.adapter.ntduoc.observer.chanelNotifycation;

public class YoutubeNotification implements ObserverChanel {
    @Override
    public void notify(AbstractVideo video, String message) {
        System.out.println("YoutubeNotification receive message: " + video.getName() + " with message " + message);
    }
}
