package com.vn.ntduoc.adapter.ntduoc.observer.chanelNotifycation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Video extends AbstractVideo {

    private String name;
    private String title;

    public void setName(String name) {
        this.name = name;
    }

    public void setTitle(String title) {
        this.title = title;
        this.notify("Video: " + this.name + " changed title is " + this.title);
    }
}
