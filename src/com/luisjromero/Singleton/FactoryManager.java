package com.luisjromero.Singleton;

import javax.sound.midi.Track;

public class FactoryManager {
    private static FactoryManager instance = null;
    private static int numTracks = 5;
    private static MyTrack mt = null;

    private FactoryManager() {
        this.mt = new MyTrack();
    }

    public static FactoryManager getInstance() {
        if (instance == null) {
            instance = new FactoryManager();
        }
        return instance;
    }

    public static void startTracks() {
        System.out.println("Tracks started:");
        for (int i = 0; i < numTracks; ++i) {
            //MyTrack mt = new MyTrack();
            mt.start();
        }
    }

    public static void resetTracks() {
        //MyTrack mt = new MyTrack();
        mt.reset();
        System.out.println("Tracks reset.");
    }
}
