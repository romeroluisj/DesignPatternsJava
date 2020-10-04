package com.luisjromero.Singleton;

public class MyTrack {
    private static int count = 0;

    public MyTrack() {}

    public void start() {
        this.count++;
        System.out.println("Start: " + count);
    }

    public void reset() {
        this.count = 0;
    }
}
