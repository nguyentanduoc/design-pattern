package com.vn.ntduoc.adapter.ntduoc.observer.chanelNotifycation;

public class EmailNotification implements ObserverChanel {

    @Override
    public void notify(AbstractVideo video, String message) {
        System.out.println("EmailNotification receive message: " + video.getName() + " with message " + message);
    }
}
