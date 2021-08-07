package com.vn.ntduoc.adapter.ntduoc.observer;

public class ObserveApp {

    public static void main(String[] args) {

        Subject subject = new Subject();
        Observer observer1 = new Observer("Observer 1");
        subject.add(observer1);

        Observer observer2 = new Observer("Observer 2");
        subject.add(observer2);

        Observer observer3 = new Observer("Observer 3");
        subject.add(observer3);

        subject.notifyChange("update message");
        subject.detach(observer2);

        subject.notifyChange("update message 2");
    }
}
