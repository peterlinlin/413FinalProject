package com.example.mac.firebasedemo;

import java.util.Date;
import java.util.HashMap;

public class Vote {
    private String song1;
    private String song2;
    private String song3;
    private String email;
    private long timestamp;

    public Vote() {
    }

    public Vote(String song1, String song2, String song3) {
        this.song1 = song1;
        this.song2 = song2;
        this.song3 = song3;
    }


    public long getTimestamp() {
        return timestamp;
    }

    public String getSong1() {
        return song1;
    }
    public String getSong2() {
        return song2;
    }
    public String getSong3() {
        return song3;
    }

    public void setSong1(String song1)
    {
        this.song1 = song1;
    }

    public void setSong2(String song1)
    {
        this.song2 = song2;
    }

    public void setSong(String song1)
    {
        this.song3 = song3;
    }



}