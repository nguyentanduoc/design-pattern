package com.vn.ntduoc.adapter.ntduoc.observer.chanelNotifycation;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public abstract class AbstractVideo {

    private String name;
    private String title;

    protected List<ObserverChanel> observerChanelList = new ArrayList<>();

    public void attachNotification(ObserverChanel observerChanel) {
        observerChanelList.add(observerChanel);
    }

    public void removeNotification(ObserverChanel observerChanel) {
        observerChanelList.remove(observerChanel);
    }

    public void notify(String message) {
        for (ObserverChanel observerChanel : observerChanelList) {
            observerChanel.notify(this, message);
        }
    }
}
