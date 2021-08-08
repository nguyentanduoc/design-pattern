package com.vn.ntduoc.adapter.ntduoc.observer.chanelNotifycation;

public class PhoneNotification implements ObserverChanel {
    @Override
    public void notify(AbstractVideo video, String message) {
        System.out.println("PhoneNotification receive message: " + video.getName() + " with message " + message);
    }
}
