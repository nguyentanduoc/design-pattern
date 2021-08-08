package com.vn.ntduoc.adapter.ntduoc.observer.chanelNotifycation;

public class ChanelNotifyApplication {
    public static void main(String[] args) {
        EmailNotification emailNotification = new EmailNotification();
        YoutubeNotification youtubeNotification = new YoutubeNotification();
        PhoneNotification phoneNotification = new PhoneNotification();

        AbstractVideo video = new Video("Video a", "Title A");
        video.attachNotification(emailNotification);
        video.attachNotification(youtubeNotification);
        video.attachNotification(phoneNotification);

        video.setTitle("Change title");

        video.removeNotification(phoneNotification);


        video.setTitle("Change title after remove");
    }
}
